package com.zhiyou100.dao;

import java.util.List;

import com.zhiyou100.vo.QueryVO;

public interface BaseDao<T> {
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
	List<T> listObjectByQuery(QueryVO queryVO);
	
	/**
	 * 返回指定内容的总量
	 * @param queryVO
	 * @return
	 */
	int countObjectByQuery(QueryVO queryVO);
	
	/**
	 * 插入内容
	 * @param object
	 */
	void insertObject(T object);
	
	/**
	 * 更新内容
	 * @param object
	 */
	void updateObject(T object);
	
	/**
	 * 删除指定的 id 信息
	 * @param ids
	 */
	void removeObject(String[] ids);
}
