package com.fest.watchtogether.controller;

import com.fest.watchtogether.entity.Category;
import com.fest.watchtogether.service.ICategoryService;
import com.fest.watchtogether.util.AssembleUtils;
import com.fest.watchtogether.util.Condition;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/category")
public class CategoryController implements IBaseController<Category> {
	private final ICategoryService categoryService;
	private Map<String, Object> response = new HashMap<>();
	
	@Autowired
	public CategoryController(ICategoryService categoryService) {
		this.categoryService = categoryService;
	}
	
	@Override
	@GetMapping("/{id}")
	public Object getById(@PathVariable Long id) {
		response.clear();
		Category category = new Category();
		category.setId(id.intValue());
		try {
			category = categoryService.getById(category);
			if (category != null && !"".equals(category.getName())) {
				Map<String, Object> data = new HashMap<>();
				data.put("category", category);
				response = AssembleUtils.assembleResponse("get categoty success", true, data);
			} else {
				response = AssembleUtils.assembleResponse("can not get such category by id you gave", false, null);
			}
			
		} catch (Exception e) {
			response = AssembleUtils.assembleResponse("got a error:" + e.getMessage(), false, null);
		}
		return response;
	}
	
	@Override
	@PostMapping
	public Object save(Category instance) {
		response.clear();
		try {
			Boolean save = categoryService.save(instance);
			response = AssembleUtils.assembleResponse(save ? "save category successful" : "can not save category", save, null);
		} catch (Exception e) {
			response = AssembleUtils.assembleResponse("can not save category caused by:" + e.getMessage(), false, null);
		}
		return response;
	}
	
	@Override
	@DeleteMapping
	public Object deleteById(Long id) {
		response.clear();
		try {
			Boolean deleted = categoryService.deleteById(id.intValue());
			response = AssembleUtils.assembleResponse(deleted ? "save category successful" : "can not delete category", deleted, null);
		} catch (Exception e) {
			response = AssembleUtils.assembleResponse("can not delete category caused by：" + e.getMessage(), false, null);
		}
		return response;
	}
	
	@Override
	@PutMapping
	public Object update(Category instance) {
		response.clear();
		try {
			Boolean update = categoryService.update(instance);
			response = AssembleUtils.assembleResponse(update ? "update category successfully" : "update category failed", update, null);
		} catch (Exception e) {
			response = AssembleUtils.assembleResponse("update category failed caused by:" + e.getMessage(), false, null);
		}
		return response;
	}
	
	@Override
	@GetMapping
	public Object getListByConditions(Condition condition, @RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "5") Integer pageSize) {
		response.clear();
		Map<String, Object> conditions = AssembleUtils.assembleConditions(page, pageSize, condition);
		try {
			List<Category> categories = categoryService.getListByCondition(conditions);
			Map<String, Object> date = new HashMap<>();
			date.put("categories", categories);
			Boolean success = (categories != null && categories.size() > 0);
			response = AssembleUtils
					.assembleResponse(success ? "get categories by condition you gave successfully" : "can not get such categories by condition you gave"
							, success
							, success ? date : null);
		} catch (Exception e) {
			response = AssembleUtils.assembleResponse("can not get such categories by condition you gave caused by:" + e.getMessage(), false, null);
		}
		return response;
	}
}
