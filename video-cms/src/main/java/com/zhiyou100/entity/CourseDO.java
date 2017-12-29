package com.zhiyou100.entity;

import java.io.Serializable;

public class CourseDO implements Serializable {

	private static final long serialVersionUID = -9039877972371453963L;

	private Integer id;
	
	private String name;

	private String describe;
	
	private Integer subjectId;
	
	private Integer status;

	private SubjectDO subject;
	
	@Override
	public String toString() {
		return "CourseDO [id=" + id + ", name=" + name + ", describe=" + describe + ", subjectId=" + subjectId
				+ ", status=" + status + ", subject=" + subject + "]";
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

	public SubjectDO getSubject() {
		return subject;
	}

	public void setSubject(SubjectDO subject) {
		this.subject = subject;
	}
}
