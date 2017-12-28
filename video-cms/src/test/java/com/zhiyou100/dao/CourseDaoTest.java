package com.zhiyou100.dao;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.zhiyou100.vo.QueryVO;

import junit.framework.TestCase;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring-dao.xml")
public class CourseDaoTest {
	@Autowired
	private CourseDao dao;
	@Test
	public void testListObject() {
		TestCase.assertEquals(7, dao.listObject().size());
		
	}

	@Test
	public void testListObjectByQuery() {
		// 分页
				QueryVO queryVO = new QueryVO(0, 5, null, null, null,0);
				TestCase.assertEquals(5, dao.listObjectByQuery(queryVO).size());
				
				// 搜索
				queryVO = new QueryVO(null, null, "P", null, null,0);
				TestCase.assertEquals(2, dao.listObjectByQuery(queryVO).size());
				
				// 搜索 + 分页
				queryVO = new QueryVO(0, 1, "P", null, null,0);
				TestCase.assertEquals(1, dao.listObjectByQuery(queryVO).size());
				
				// 排序
				queryVO = new QueryVO(null, null, null, "name", "desc",0);
				TestCase.assertEquals(11, dao.listObjectByQuery(queryVO).size());
				
				// 排序 + 分页
				queryVO = new QueryVO(0, 5, null, "course_count", "asc",0);
				TestCase.assertEquals(5, dao.listObjectByQuery(queryVO).size());
				
				// 排序 + 搜索 + 分页
				queryVO = new QueryVO(0, 5, "U F O", "video_count", "desc",0);
				TestCase.assertEquals(5, dao.listObjectByQuery(queryVO).size());
			
	}
	@Test
	public void testCountObjectByQuery() {
		
	}

	@Test
	public void testInsertObject() {
		
	}

	@Test
	public void testUpdateObject() {
		
	}

	@Test
	public void testDeleteSubject() {
		
	}

}
