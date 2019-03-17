package com.fest.watchtogether.controller;

import com.fest.watchtogether.entity.Video;
import com.fest.watchtogether.service.IBaseService;
import com.fest.watchtogether.service.impl.VideoService;
import com.fest.watchtogether.util.AssembleUtils;
import com.fest.watchtogether.util.Condition;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/video")
public class VideoController extends BaseController<Video> {
	public VideoController(IBaseService<Video> baseService) {
		super(baseService);
	}
	
	@Override
	@GetMapping("{id}")
	public Object getById(@PathVariable Long id) {
		response.clear();
		data.clear();
		Video video = new Video();
		video.setId(id.intValue());
		try {
			Video videoById = baseService.getById(video);
			boolean success = videoById != null && videoById.getUrl() != null;
			data.put("video", videoById);
			response = AssembleUtils.assembleResponse(success ? "success" : "failed", success, success ? data : null);
		} catch (Exception e) {
			response = AssembleUtils.assembleResponse("failed caused by:" + e.getMessage(), false, null);
		}
		return response;
	}
	
	@Override
	@PostMapping
	public Object save(@RequestBody Video instance) {
		instance.setReleaseTime(new Date(System.currentTimeMillis()));
		return super.save(instance);
	}
	
	@Override
	@DeleteMapping("{id}")
	public Object deleteById(@PathVariable Long id) {
		return super.deleteById(id);
	}
	
	@Override
	@PutMapping
	public Object update(@RequestBody Video instance) {
		return super.update(instance);
	}
	
	@Override
	@GetMapping
	public Object getListByConditions(Condition condition, @RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "5") Integer pageSize) {
		return super.getListByConditions(condition, page, pageSize);
	}
	
	@GetMapping("/user/{id}")
	public Object getListByUser(@PathVariable Long id) {
		response.clear();
		data.clear();
		try {
			List<Video> list = ((VideoService) baseService).getListByUserId(id.intValue());
			Boolean success = list != null;
			data.put("list", list);
			response = AssembleUtils.assembleResponse(success ? "get data successfully" : "get data failed", success, success ? data : null);
		} catch (Exception e) {
			e.printStackTrace();
			response = AssembleUtils.assembleResponse("get data failed caused by:" + e.getMessage(), false, null);
		}
		return response;
	}
}