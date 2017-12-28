package com.zhiyou100.entity;

import java.io.Serializable;
import java.sql.Date;

public class SpeakerDO implements Serializable{
	/**
	 * @fieldName: serialVersionUID
	 * @fieldType: long
	 * @Description: TODO
	 */
	private static final long serialVersionUID = -5604544587996959169L;
	private Integer id;
	private String name;
	private String job;
	private String imageUrl;
	private String describe;
	private Integer status;
	private Date gmtCreate;
	private Date gmtModified;
	@Override
	public String toString() {
		return "SpeakerDO [id=" + id + ", name=" + name + ", job=" + job + ", imageUrl=" + imageUrl + ", describe="
				+ describe + ", status=" + status + ", gmtCreate=" + gmtCreate + ", gmtModified=" + gmtModified + "]";
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
	public Date getGmtCreate() {
		return gmtCreate;
	}
	public void setGmtCreate(Date gmtCreate) {
		this.gmtCreate = gmtCreate;
	}
	public Date getGmtModified() {
		return gmtModified;
	}
	public void setGmtModified(Date gmtModified) {
		this.gmtModified = gmtModified;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	
}
