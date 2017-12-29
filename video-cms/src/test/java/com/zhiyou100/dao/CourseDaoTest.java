package com.zhiyou100.dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.zhiyou100.entity.CourseDO;
import com.zhiyou100.vo.CourseQueryVO;

import junit.framework.TestCase;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/spring-dao.xml")
public class CourseDaoTest {

	@Autowired
	private CourseDao dao;

	@Test
	public void testListObject() {

		TestCase.assertEquals(6, dao.listObject().size());
	}

	@Test
	public void testListObjectByQuery() {

		CourseQueryVO queryVO = new CourseQueryVO();

		queryVO.setOffset(0);
		queryVO.setLimit(5);

		queryVO.setSubjectId(1);

		TestCase.assertEquals(3, dao.listObjectByQuery(queryVO).size());
	}

	@Test
	public void testCountObjectByQuery() {

		CourseQueryVO queryVO = new CourseQueryVO();

		queryVO.setOffset(0);
		queryVO.setLimit(5);

		queryVO.setSubjectId(1);

		TestCase.assertEquals(3, dao.countObjectByQuery(queryVO));
	}

	@Test
	public void testInsertObject() {

		CourseDO object = new CourseDO();

		object.setName("123");
		object.setDescribe("456");
		object.setSubjectId(4);

		dao.insertObject(object);
	}

	@Test
	public void testUpdateObject() {

		CourseDO object = new CourseDO();

		object.setId(14);
		object.setName("123");
		object.setDescribe("456");
		object.setSubjectId(7);

		dao.updateObject(object);
	}
	
	@Test
	public void testUpdateSubjectIdNull() {
		
	}
}
