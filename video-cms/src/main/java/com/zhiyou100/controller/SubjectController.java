package com.zhiyou100.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.zhiyou100.entity.SubjectDO;
import com.zhiyou100.service.SubjectService;
import com.zhiyou100.vo.ResponseVO;

@Controller
@RequestMapping("/subject")
public class SubjectController {
	
	@Autowired
	private SubjectService service;
	
	@ResponseBody
	public ResponseVO<List<SubjectDO>> listSubject() {
		
		List<SubjectDO> list = service.listObject();
		
		return new ResponseVO<List<SubjectDO>>(0, "", list);
	}
}
