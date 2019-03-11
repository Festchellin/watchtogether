package com.fest.watchtogether.controller;

import com.fest.watchtogether.entity.Video;
import com.fest.watchtogether.service.IVideoService;
import com.fest.watchtogether.util.AssembleUtils;
import com.fest.watchtogether.util.Condition;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/video")
public class VideoController implements Serializable, IBaseController<Video> {
	private final IVideoService videoService;
	private Map<String, Object> response = new HashMap<>();
	
	@Autowired
	public VideoController(IVideoService videoService) {
		this.videoService = videoService;
	}
	
	@GetMapping("/{id}")
	public Object getById(@PathVariable Long id) {
		response.clear();
		
		return response;
	}
	
	@Override
	@PostMapping
	public Object save(Video instance) {
		response.clear();
		try {
			Boolean saved = videoService.save(instance);
			if (saved) {
				response.put("msg", "saved successfully");
			}
			response.put("success", saved);
		} catch (Exception e) {
			response.put("msg", e.getMessage());
		}
		return response;
	}
	
	@Override
	@DeleteMapping
	public Object deleteById(Long id) {
		response.clear();
		try {
			Boolean deleted = videoService.deleteById(id.intValue());
			if (deleted) {
				response.put("msg", "deleted successfully");
			} else {
				response.put("msg", "delete failed");
			}
			response.put("success", deleted);
		} catch (Exception e) {
			response.put("msg", e.getMessage());
			response.put("success", false);
		}
		return response;
	}
	
	@Override
	@PutMapping
	public Object update(Video instance) {
		response.clear();
		try {
			Boolean updated = videoService.update(instance);
			if (updated) {
				response.put("msg", "deleted successfully");
			} else {
				response.put("msg", "delete failed");
			}
			response.put("success", updated);
		} catch (Exception e) {
			response.put("msg", e.getMessage());
			response.put("success", false);
		}
		return response;
	}
	
	@Override
	@GetMapping
	public Object getListByConditions(Condition condition,
	                                  @RequestParam(defaultValue = "0") Integer page,
	                                  @RequestParam(defaultValue = "5") Integer pageSize) {
		return AssembleUtils.assembleListResponse(response, condition, page - 1 >= 0 ? page - 1 : 0, pageSize, "videoList", videoService);
	}
}
