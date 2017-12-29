package com.zhiyou100.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zhiyou100.dao.SpeakerDao;
import com.zhiyou100.dao.VideoDao;
import com.zhiyou100.entity.CourseDO;
import com.zhiyou100.entity.SpeakerDO;
import com.zhiyou100.service.SpeakerService;

@Service
public class SpeakerServiceImpl extends BaseServiceImpl<SpeakerDO, SpeakerDao> implements SpeakerService {

	@Autowired
	private VideoDao videoDao;
	
	@Override
	public void removeObject(String ids[]) {
		
		// 删除讲师信息
		super.removeObject(ids);
		
		// 置空视频表中的 speaker_id
		videoDao.updateSpeakerIdNull(ids);
	}
}
