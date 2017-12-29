package com.zhiyou100.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.zhiyou100.dao.BaseDao;
import com.zhiyou100.dto.BaseDTO;
import com.zhiyou100.service.BaseService;
import com.zhiyou100.vo.QueryVO;

// Type Key Value Enum
public abstract class BaseServiceImpl<T, D extends BaseDao<T>> implements BaseService<T> {

	@Autowired
	protected D dao;

	public List<T> listObject() {

		return dao.listObject();
	}

	public BaseDTO<T> listObject(QueryVO queryVO) {

		BaseDTO<T> dto = new BaseDTO<T>();

		int count = dao.countObjectByQuery(queryVO);
		dto.setCount(count);

		if (count != 0) {

			if (queryVO.getOffset() < 0) {

				// 没有输入正常的 offset，修正为 0
				queryVO.setOffset(0);
			}else  {

				// 正常输入正常的 offset，需要和最后一页的起始索引进行比较
				int lastOffset = (count / queryVO.getLimit()) * queryVO.getLimit();

				// 如果大于最后一页的起始索引，修正为最后一页的起始索引
				if (queryVO.getOffset() > lastOffset) {

					queryVO.setOffset(lastOffset);
				}
			}

			List<T> rows = dao.listObjectByQuery(queryVO);

			dto.setRows(rows);
		}

		return dto;
	}

	
	public void insertObject(T object) {

		dao.insertObject(object);
	}

	public void removeObject(String ids[]) {
				
		dao.removeObject(ids);
	}

	public void updateObject(T object) {
		
		dao.updateObject(object);
	}
}
