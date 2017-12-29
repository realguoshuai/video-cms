package com.zhiyou100.entity;

public class VideoDO {

	private Integer id;
	
	private String name;
	
	private String describe;
	
	private Integer length;
	
	private Integer playCount;
	
	private String coverUrl;
	
	private String videoUrl;
	
	private Integer courseId;
	
	private Integer speakerId;
	
	private Integer status;
	
	private CourseDO course;

	private SpeakerDO speaker;
	
	private SubjectDO subject;

	@Override
	public String toString() {
		return "VideoDO [id=" + id + ", name=" + name + ", describe=" + describe + ", length=" + length + ", playCount="
				+ playCount + ", coverUrl=" + coverUrl + ", videoUrl=" + videoUrl + ", courseId=" + courseId
				+ ", speakerId=" + speakerId + "]";
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescribe() {
		return describe;
	}

	public void setDescribe(String describe) {
		this.describe = describe;
	}

	public Integer getLength() {
		return length;
	}

	public void setLength(Integer length) {
		this.length = length;
	}

	public Integer getPlayCount() {
		return playCount;
	}

	public void setPlayCount(Integer playCount) {
		this.playCount = playCount;
	}

	public String getCoverUrl() {
		return coverUrl;
	}

	public void setCoverUrl(String coverUrl) {
		this.coverUrl = coverUrl;
	}

	public String getVideoUrl() {
		return videoUrl;
	}

	public void setVideoUrl(String videoUrl) {
		this.videoUrl = videoUrl;
	}

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

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public CourseDO getCourse() {
		return course;
	}

	public void setCourse(CourseDO course) {
		this.course = course;
	}

	public SpeakerDO getSpeaker() {
		return speaker;
	}

	public void setSpeaker(SpeakerDO speaker) {
		this.speaker = speaker;
	}

	public SubjectDO getSubject() {
		return subject;
	}

	public void setSubject(SubjectDO subject) {
		this.subject = subject;
	}
}
