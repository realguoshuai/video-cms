package com.zhiyou100.entity;

import java.io.Serializable;

public class SubjectDO implements Serializable {

	private static final long serialVersionUID = -5051607588689973114L;

	private Integer id;
	
	private String name;
	
	private Integer status;
	
	private Integer courseCount;
	
	private Integer videoCount;
	
	public SubjectDO() {
		super();
	}

	public SubjectDO(Integer id, String name, Integer status) {
		super();
		this.id = id;
		this.name = name;
		this.status = status;
	}

	@Override
	public String toString() {
		return "SubjectDO [id=" + id + ", name=" + name + ", status=" + status + "]";
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

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public Integer getCourseCount() {
		return courseCount;
	}

	public void setCourseCount(Integer courseCount) {
		this.courseCount = courseCount;
	}

	public Integer getVideoCount() {
		return videoCount;
	}

	public void setVideoCount(Integer videoCount) {
		this.videoCount = videoCount;
	}
}
