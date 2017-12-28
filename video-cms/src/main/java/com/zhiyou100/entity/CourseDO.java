package com.zhiyou100.entity;

import java.io.Serializable;
import java.sql.Date;

public class CourseDO implements Serializable {
	/**
	 * @fieldName: serialVersionUID
	 * @fieldType: long
	 * @Description: TODO
	 */
	private static final long serialVersionUID = 6553798117022653929L;
	private Integer id;
	private String name;
	private String describe;
	private Integer subjectId;
	private Integer status;
	private Date gmtCreate;
	private Date gmtModified;

	@Override
	public String toString() {
		return "CourseDO [id=" + id + ", name=" + name + ", describe=" + describe + ", subjectId=" + subjectId
				+ ", status=" + status + ", gmtCreate=" + gmtCreate + ", gmtModified=" + gmtModified + "]";
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

	public Integer getSubjectId() {
		return subjectId;
	}

	public void setSubjectId(Integer subjectId) {
		this.subjectId = subjectId;
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
