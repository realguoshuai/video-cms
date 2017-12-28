package com.zhiyou100.service;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.zhiyou100.entity.SubjectDO;
import com.zhiyou100.vo.QueryVO;

import junit.framework.TestCase;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring-service.xml")
public class SubjectServiceTest {
@Autowired
private SubjectService service;
	@Test
	public void testListObject() {
		List<SubjectDO> listObject = service.listObject();
		System.out.println(listObject);
	}

	@Test
	public void testListObjectQueryVO() {
		// 分页
		QueryVO queryVO = new QueryVO(0, 5, null, null, null,0);
		TestCase.assertEquals(5, service.listObject(queryVO).getRows().size());

		// 搜索 + 分页默认值
		queryVO = new QueryVO(null, null, "P", null, null,0);
		TestCase.assertEquals(2, service.listObject(queryVO).getRows().size());

		// 搜索 + 分页指定值
		queryVO = new QueryVO(0, 1, "P", null, null,0);
		TestCase.assertEquals(1, service.listObject(queryVO).getRows().size());

		// 排序 + 分页默认值
		queryVO = new QueryVO(null, null, null, "name", "desc",0);
		TestCase.assertEquals(5, service.listObject(queryVO).getRows().size());

		// 排序 + 分页指定值
		queryVO = new QueryVO(5, 5, null, "course_count", "asc",0);
		TestCase.assertEquals(5, service.listObject(queryVO).getRows().size());

		// 排序 + 搜索 + 分页指定值
		queryVO = new QueryVO(0, 5, "U P O", "video_count", "desc",0);
		TestCase.assertEquals(5, service.listObject(queryVO).getRows().size());
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
