package com.zhiyou100.dao;

import static org.junit.Assert.fail;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.zhiyou100.vo.VideoQueryVO;

import junit.framework.TestCase;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/spring-dao.xml")
public class VideoDaoTest {

	@Autowired
	private VideoDao dao;
	
	@Test
	public void testUpdateCourseIdNull() {
		
	}

	@Test
	public void testUpdateSpeakerIdNull() {
	}

	@Test
	public void testListObject() {
		
		TestCase.assertEquals(32, dao.listObject().size());
	}

	@Test
	public void testListObjectByQuery() {
		
		VideoQueryVO queryVO = new VideoQueryVO();
		
		queryVO.setOffset(2);
		queryVO.setLimit(5);
//		queryVO.setSearch("I P h");
		queryVO.setSort("speaker_name");
		queryVO.setOrder("desc");
//		queryVO.setCourseId(1);
//		queryVO.setSpeakerId(2);
		
		TestCase.assertEquals(0, dao.listObjectByQuery(queryVO).size());
	}

	@Test
	public void testCountObjectByQuery() {

		VideoQueryVO queryVO = new VideoQueryVO();
		
		queryVO.setOffset(2);
		queryVO.setLimit(5);
		queryVO.setSearch("I P h");
		queryVO.setSort("play_count");
		queryVO.setOrder("desc");
		queryVO.setCourseId(1);
		queryVO.setSpeakerId(2);
		
		TestCase.assertEquals(0, dao.countObjectByQuery(queryVO));
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
