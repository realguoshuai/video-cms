package com.zhiyou100.service;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.zhiyou100.vo.QueryVO;

import junit.framework.TestCase;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/spring-service.xml")
public class SubjectServiceTest {

	@Autowired
	private SubjectService service;
	
	@Test
	public void testListObject() {

	}

	@Test
	public void testListObjectQueryVO() {
		
		QueryVO queryVO = new QueryVO();
		queryVO.setOffset(0);
		queryVO.setLimit(5);
		queryVO.setSearch("P U O");
		queryVO.setSort("course_count");
		queryVO.setOrder("desc");
		
		TestCase.assertEquals(5, service.listObject(queryVO).getRows().size());
	}

	@Test
	public void testInsertObject() {
		fail("Not yet implemented");
	}

	@Test
	public void testUpdateObject() {
		fail("Not yet implemented");
	}

}
