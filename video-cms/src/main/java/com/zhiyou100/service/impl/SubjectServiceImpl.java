package com.zhiyou100.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zhiyou100.dao.CourseDao;
import com.zhiyou100.dao.SubjectDao;
import com.zhiyou100.entity.SubjectDO;
import com.zhiyou100.service.SubjectService;

@Service
public class SubjectServiceImpl extends BaseServiceImpl<SubjectDO, SubjectDao> implements SubjectService {

	@Autowired
	private CourseDao courseDao;
	
	@Override
	public void removeObject(String ids[]) {

		// 删除学科
		super.removeObject(ids);
		
		// 置空课程表中的 subject_id
		courseDao.updateSubjectIdNull(ids);
	}
}
