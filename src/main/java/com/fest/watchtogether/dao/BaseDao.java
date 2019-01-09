package com.fest.watchtogether.dao;

import com.fest.watchtogether.entity.User;

import java.util.List;
import java.util.Map;

public interface BaseDao<T> {
	/**
	 * @return java.lang.Boolean
	 * @Author Festchellin
	 * @Email festchellinme@gmail.com
	 * @Description 通用：保存
	 * @Date 4:33 PM 12/31/2018
	 * @Param [instance]
	 */
	Boolean save(T instance);
	
	/**
	 * @return java.lang.Boolean
	 * @Author Festchellin
	 * @Email festchellinme@gmail.com
	 * @Description 通用：根据id删除
	 * @Date 4:34 PM 12/31/2018
	 * @Param [id]
	 */
	Boolean deleteById(Integer id);
	
	/**
	 * @return java.lang.Boolean
	 * @Author Festchellin
	 * @Email festchellinme@gmail.com
	 * @Description 通用：更新方法
	 * @Date 4:34 PM 12/31/2018
	 * @Param [instance]
	 */
	Boolean update(T instance);
	
	/**
	 * @return T
	 * @Author Festchellin
	 * @Email festchellinme@gmail.com
	 * @Description 通用：根据d获取单条记录
	 * @Date 4:35 PM 12/31/2018
	 * @Param [id]
	 */
	T getById(T instance);
	
	/**
	 * @return java.util.List
	 * @Author Festchellin
	 * @Email festchellinme@gmail.com
	 * @Description 通用：根据条件获取列表
	 * @Date 4:35 PM 12/31/2018
	 * @Param [conditions]
	 */
	List getListByConditions(Map conditions);
}
