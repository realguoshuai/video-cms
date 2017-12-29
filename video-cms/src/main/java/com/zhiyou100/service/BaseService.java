package com.zhiyou100.service;

import java.util.List;

import com.zhiyou100.dto.BaseDTO;
import com.zhiyou100.vo.QueryVO;

public interface BaseService<T> {

	/**
	 * 返回全部内容
	 * @return
	 */
	List<T> listObject();
	
	/**
	 * 返回指定内容
	 * @param queryVO
	 * @return
	 */
	BaseDTO<T> listObject(QueryVO queryVO);
	
	/**
	 * 插入内容
	 * @param object
	 */
	void insertObject(T object);
	
	/**
	 * 删除内容
	 * @param object
	 */
	void removeObject(String[] ids);
	
	/**
	 * 更新内容
	 * @param object
	 */
	void updateObject(T object);
}
