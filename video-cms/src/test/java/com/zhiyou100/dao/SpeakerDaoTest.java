package com.zhiyou100.dao;

import static org.junit.Assert.fail;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.zhiyou100.entity.SpeakerDO;
import com.zhiyou100.vo.QueryVO;

import junit.framework.TestCase;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/spring-dao.xml")
public class SpeakerDaoTest {

	@Autowired
	private SpeakerDao dao;

	@Test
	public void testListObject() {

		TestCase.assertEquals(5, dao.listObject().size());
	}

	@Test
	public void testListObjectByQuery() {

		QueryVO queryVO = new QueryVO();

		queryVO.setOffset(0);
		queryVO.setLimit(3);
		queryVO.setSearch("宋 张 赵 田");

		TestCase.assertEquals(3, dao.listObjectByQuery(queryVO).size());
	}

	@Test
	public void testCountObjectByQuery() {

		QueryVO queryVO = new QueryVO();

		queryVO.setSearch("宋 张 赵 田");

		TestCase.assertEquals(4, dao.countObjectByQuery(queryVO));
	}

	@Test
	public void testInsertObject() {
		
		SpeakerDO object = new SpeakerDO();
		
		object.setName("sdfsdf");
		object.setJob("sfsdf");
		object.setImageUrl("sdfsdfsdf");
		object.setDescribe("123123");
		
		dao.insertObject(object);
	}

	@Test
	public void testUpdateObject() {

		SpeakerDO object = new SpeakerDO();
		
		object.setId(12);
		object.setName("sdfsdf");
		object.setJob("sfsdf");
		object.setImageUrl("sdfsdfsdf");
		object.setDescribe("123123");
		object.setStatus(1);
		
		dao.updateObject(object);
	}

}
