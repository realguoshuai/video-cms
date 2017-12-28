package com.zhiyou100.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.zhiyou100.dao.BaseDao;
import com.zhiyou100.dto.BaseDTO;
import com.zhiyou100.service.BaseService;
import com.zhiyou100.vo.QueryVO;

public abstract class BaseServiceImpl<T,D extends BaseDao<T>> implements BaseService<T> {
	@Autowired
	protected D dao;
	public List<T> listObject() {
		
		return dao.listObject();
	}

	public BaseDTO<T> listObject(QueryVO queryVO) {
		int count = dao.countObjectByQuery(queryVO);
		BaseDTO<T> dto =new BaseDTO<T>();
		dto.setCount(count);
		//逻辑处理
		if (count!=0) {
			if (queryVO.getLimit()==null) {
				queryVO.setLimit(5);
			}//输入为错的
			if (queryVO.getOffset()==null || queryVO.getOffset()<0) {
				queryVO.setOffset(0);
			}else{
				//没输入错
				//查询总数/每页限制数==总页数(最后一页)
				//最后一页的起始数据=总页数*每页的数据
				int lastOffset =(count/queryVO.getLimit())*queryVO.getLimit();
				
				if (queryVO.getOffset()>lastOffset) {
					queryVO.setOffset(lastOffset);
				}
			}
		}
		List<T> row = dao.listObjectByQuery(queryVO);
		dto.setRows(row);
		return dto;
		
	}

	public void insertObject(T object) {
		dao.insertObject(object);
		
	}

	public void updateObject(T object) {
		dao.updateObject(object);
		
	}
	public void deleteObject(int id){
		dao.deleteObject(id);
	}
	
	public void deleteObject(String[] id) {
		dao.deleteSubject(id);
		
	}

}
