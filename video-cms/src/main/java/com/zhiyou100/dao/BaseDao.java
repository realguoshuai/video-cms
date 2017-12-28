package com.zhiyou100.dao;

import java.util.List;

import com.zhiyou100.vo.QueryVO;


public interface BaseDao<T> {
	
	List<T> listObject();
	
	//返回指定的内容
	List<T> listObjectByQuery(QueryVO queryVO);
	
	
	//返回指定内容的总量  上面的数量
	int countObjectByQuery(QueryVO queryVO);
	
	void insertObject(T object);
	
	void updateObject(T object);
	
	//逻辑删除是把statue更新为1
	void deleteObject(int id);
	//可多选删除
	void deleteSubject(String[] id);
}
