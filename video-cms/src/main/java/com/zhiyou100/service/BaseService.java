package com.zhiyou100.service;

import java.util.List;

import com.zhiyou100.dto.BaseDTO;
import com.zhiyou100.vo.QueryVO;

public interface BaseService<T> {
//增删改查
//全部替换成可重用的
	
	//返回全部
	List<T> listObject();
	
	
	//返回指定的内容
	BaseDTO<T> listObject(QueryVO queryVO);
	
	void insertObject(T object);
	
	void updateObject(T object);
	
	//逻辑删除是把statue更新为1
	
	void deleteObject(int id);
	//可多选删除
	void deleteObject(String[] id);
}
