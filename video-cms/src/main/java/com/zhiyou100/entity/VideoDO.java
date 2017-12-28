package com.zhiyou100.entity;

import java.io.Serializable;
import java.sql.Date;

public class VideoDO implements Serializable {
	/**
	 * @fieldName: serialVersionUID
	 * @fieldType: long
	 * @Description: TODO
	 */
	private static final long serialVersionUID = 6322598350825695949L;
	private Integer id;
	private String name;
	private String describe;
	private Integer length;
	private Integer playCount;
	private String coverUrl;
	private String videoUrl;
	private Integer courseId;
	private Integer sppeakerId;
	private Integer status;
	private Date gmtCreate;
	private Date gmtModified;

	@Override
	public String toString() {
		return "VideoDO [id=" + id + ", name=" + name + ", describe=" + describe + ", length=" + length + ", playCount="
				+ playCount + ", coverUrl=" + coverUrl + ", videoUrl=" + videoUrl + ", courseId=" + courseId
				+ ", sppeakerId=" + sppeakerId + ", status=" + status + ", gmtCreate=" + gmtCreate + ", gmtModified="
				+ gmtModified + "]";
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

	public Integer getSppeakerId() {
		return sppeakerId;
	}

	public void setSppeakerId(Integer sppeakerId) {
		this.sppeakerId = sppeakerId;
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
