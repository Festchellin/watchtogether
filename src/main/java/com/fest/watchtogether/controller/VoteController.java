package com.fest.watchtogether.controller;

import com.fest.watchtogether.entity.Vote;
import com.fest.watchtogether.service.IVoteService;
import com.fest.watchtogether.util.AssembleUtils;
import com.fest.watchtogether.util.Condition;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/vote")
public class VoteController implements IBaseController<Vote> {
	private final IVoteService voteService;
	private Map<String, Object> response = new HashMap<>();
	
	@Autowired
	public VoteController(IVoteService voteService) {
		this.voteService = voteService;
	}
	
	@GetMapping("/{id}")
	@Override
	public Object getById(@PathVariable Long id) {
		response.clear();
		Vote vote = new Vote();
		vote.setId(id.intValue());
		try {
			vote = voteService.getById(vote);
			if (vote != null && !"".equals(vote.getUuid())) {
				Map<String, Object> data = new HashMap<>();
				data.put("vote", vote);
				response = AssembleUtils.assembleResponse("get vote infor success", true, data);
			} else {
				response = AssembleUtils.assembleResponse("get vote infor failed, can not find such vote record by id you gave", false, null);
			}
		} catch (Exception e) {
			response = AssembleUtils.assembleResponse("get vote information failed, caused by:" + e.getMessage(), false, null);
		}
		return response;
	}
	
	@PostMapping
	@Override
	public Object save(Vote instance) {
		response.clear();
		instance.setVoteTime(new Date(System.currentTimeMillis()));
		try {
			Boolean save = voteService.save(instance);
			response = AssembleUtils.assembleResponse(save ? "save vote information successfully" : "can not save vote information", save, null);
		} catch (Exception e) {
			response = AssembleUtils.assembleResponse("can not save vote information caused by:" + e.getMessage(), false, null);
		}
		return response;
	}
	
	@DeleteMapping("/{id}")
	@Override
	public Object deleteById(@PathVariable Long id) {
		response.clear();
		try {
			Boolean deleted = voteService.deleteById(id.intValue());
			response = AssembleUtils.assembleResponse(deleted ? "delete vote record successfully" : "can not delete sun vote record", deleted, null);
		} catch (Exception e) {
			response = AssembleUtils.assembleResponse("can not delete sun vote record, caused by:" + e.getMessage(), false, null);
		}
		return response;
	}
	
	@PutMapping
	@Override
	public Object update(Vote instance) {
		response.clear();
		try {
			Boolean update = voteService.update(instance);
			response = AssembleUtils.assembleResponse(update ? "update vote information successfully" : " update vote information failed", update, null);
		} catch (Exception e) {
			response = AssembleUtils.assembleResponse(" update vote information failed, caused by:" + e.getMessage(), false, null);
		}
		return response;
	}
	
	@GetMapping
	@Override
	public Object getListByConditions(Condition condition, @RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer pageSize) {
		return AssembleUtils.assembleListResponse(response, condition, page - 1 >= 0 ? page - 1 : 0, pageSize, "voteList", voteService);
	}
}
