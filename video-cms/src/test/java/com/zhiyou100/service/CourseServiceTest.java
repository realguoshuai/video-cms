package com.zhiyou100.service;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import junit.framework.TestCase;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/spring-service.xml")
public class CourseServiceTest {

	@Autowired
	private CourseService service;
	
	@Test
	public void testListObject() {
		
		TestCase.assertEquals(6, service.listObject().size());
	}

	@Test
	public void testListObjectQueryVO() {
		fail("Not yet implemented");
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
