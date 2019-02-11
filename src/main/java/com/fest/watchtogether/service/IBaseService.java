package com.fest.watchtogether.service;

import java.util.List;
import java.util.Map;

public interface IBaseService<T> {
	/**
	 * @return java.lang.Boolean
	 * @Author Festchellin
	 * @Email festchellinme@gmail.com
	 * @Description 保存
	 * @Date 4:26 PM 12/31/2018
	 * @Param [instance]
	 */
	Boolean save(T instance);
	
	/**
	 * @return java.lang.Boolean
	 * @Author Festchellin
	 * @Email festchellinme@gmail.com
	 * @Description 根据id删除
	 * @Date 4:27 PM 12/31/2018
	 * @Param [id]
	 */
	Boolean deleteById(Integer id);
	
	/**
	 * @return java.lang.Boolean
	 * @Author Festchellin
	 * @Email festchellinme@gmail.com
	 * @Description 更新该条数据，id不能为空
	 * @Date 4:27 PM 12/31/2018
	 * @Param [instance]
	 */
	Boolean update(T instance);
	
	/**
	 * @return T
	 * @Author Festchellin
	 * @Email festchellinme@gmail.com
	 * @Description 根据id（主键）获取记录
	 * @Date 4:27 PM 12/31/2018
	 * @Param [id]
	 */
	T getById(T instance);
	
	/**
	 * @return java.util.List
	 * @Author Festchellin
	 * @Email festchellinme@gmail.com
	 * @Description 根据条件查询
	 * @Date 4:30 PM 12/31/2018
	 * @Param [conditons]
	 */
	List<T> getListByCondition(Map conditons);
}
