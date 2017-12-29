package com.zhiyou100.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zhiyou100.dao.CourseDao;
import com.zhiyou100.dao.VideoDao;
import com.zhiyou100.entity.CourseDO;
import com.zhiyou100.service.CourseService;

@Service
public class CourseServiceImpl extends BaseServiceImpl<CourseDO, CourseDao> implements CourseService {

	@Autowired
	private VideoDao videoDao;
	
	@Override
	public void removeObject(String ids[]) {
		
		// 删除课程
		super.removeObject(ids);
		
		// 置空视频中的 course_id
		videoDao.updateCourseIdNull(ids);
	}
}
