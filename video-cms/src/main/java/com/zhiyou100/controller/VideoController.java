package com.zhiyou100.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.zhiyou100.dto.BaseDTO;
import com.zhiyou100.entity.SpeakerDO;
import com.zhiyou100.entity.VideoDO;
import com.zhiyou100.service.SpeakerService;
import com.zhiyou100.service.VideoService;
import com.zhiyou100.vo.QueryVO;
import com.zhiyou100.vo.ResponseVO;
import com.zhiyou100.vo.VideoQueryVO;

@Controller
public class VideoController {

	@Autowired
	private VideoService videoService;
	
	@Autowired
	private SpeakerService speakerService;
	
	@RequestMapping("/video")
	public String forwardVideoPage(Model model) {
		
		List<SpeakerDO> speakers = speakerService.listObject();
		
		model.addAttribute("speakers", speakers);
		
		return "forward:/WEB-INF/jsp/video.jsp";
	}
	
	@RequestMapping("/videos")
	@ResponseBody
	public ResponseVO<BaseDTO<VideoDO>> listVideoByQuery(VideoQueryVO queryVO) {
		
		BaseDTO<VideoDO> dto = videoService.listObject(queryVO);
		
		return new ResponseVO<BaseDTO<VideoDO>>(0, "", dto);
	}
	
	@RequestMapping(path={"/videos/{id}"}, method=RequestMethod.PUT)
	@ResponseBody
	public ResponseVO<String> updateVideo(@PathVariable("id")Integer id, @RequestBody VideoDO videoDO) {

		videoService.updateObject(videoDO);
		
		return new ResponseVO<String>(0, "", "修改成功");
	}
}
