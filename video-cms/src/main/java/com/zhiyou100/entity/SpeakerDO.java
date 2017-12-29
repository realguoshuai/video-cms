package com.zhiyou100.entity;

import java.io.Serializable;

public class SpeakerDO implements Serializable {

	private static final long serialVersionUID = -2262274447435195546L;

	private Integer id;
	
	private String name;
	
	private String job;
	
	private String imageUrl;
	
	private String describe;
	
	private Integer status;

	@Override
	public String toString() {
		return "SpeakerDO [id=" + id + ", name=" + name + ", job=" + job + ", imageUrl=" + imageUrl + ", describe="
				+ describe + ", status=" + status + "]";
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

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public String getDescribe() {
		return describe;
	}

	public void setDescribe(String describe) {
		this.describe = describe;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}
}
