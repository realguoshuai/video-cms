package com.zhiyou100.dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.zhiyou100.entity.SubjectDO;
import com.zhiyou100.vo.QueryVO;

import junit.framework.TestCase;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/spring-dao.xml")
public class SubjectDaoTest {

	@Autowired
	private SubjectDao dao;
	
	@Test
	public void testListObject() {
		
		TestCase.assertEquals(11, dao.listObject().size());
	}

	@Test
	public void testListObjectByQuery() {
		
		QueryVO queryVO = new QueryVO();
		
		queryVO.setOffset(0);
		queryVO.setLimit(5);
		queryVO.setSearch("P U O");
		queryVO.setSort("course_count");
		queryVO.setOrder("desc");
		
		TestCase.assertEquals(5, dao.listObjectByQuery(queryVO).size());
	}

	@Test
	public void testInsertObject() {
		
		SubjectDO object = new SubjectDO();
		
		object.setName("跑步");
		
		dao.insertObject(object);
	}

	@Test
	public void testUpdateObject() {
		
		SubjectDO object = new SubjectDO();
		
		object.setId(12);
		object.setName("跳高");
		object.setStatus(1);
		
		dao.updateObject(object);
	}

}
