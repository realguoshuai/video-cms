package com.zhiyou100.entity;

import java.io.Serializable;
import java.sql.Date;

public class SubjectDO implements Serializable {
	/**
	 * @fieldName: serialVersionUID
	 * @fieldType: long
	 * @Description: TODO
	 */
	private static final long serialVersionUID = 4860252535473122250L;
	private Integer id;
	private String name;
	private Integer status;

	private Integer courseCount;
	private Integer videoCount;

	private Date gmtCreate;
	private Date gmtModified;

	@Override
	public String toString() {
		return "SubjectDO [id=" + id + ", name=" + name + ", status=" + status + ", courseCount=" + courseCount
				+ ", videoCount=" + videoCount + ", gmtCreate=" + gmtCreate + ", gmtModified=" + gmtModified + "]";
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
