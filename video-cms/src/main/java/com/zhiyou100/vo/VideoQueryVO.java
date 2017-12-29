package com.zhiyou100.vo;

public class VideoQueryVO extends QueryVO{

	private Integer courseId;
	
	private Integer speakerId;

	public Integer getCourseId() {
		return courseId;
	}

	public void setCourseId(Integer courseId) {
		this.courseId = courseId;
	}

	public Integer getSpeakerId() {
		return speakerId;
	}

	public void setSpeakerId(Integer speakerId) {
		this.speakerId = speakerId;
	}
}
