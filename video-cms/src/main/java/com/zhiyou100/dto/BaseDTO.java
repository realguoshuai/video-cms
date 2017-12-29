package com.zhiyou100.dto;

import java.util.List;


public class BaseDTO<T> {

	private Integer count;
	
	private List<T> rows;

	@Override
	public String toString() {
		return "BaseDTO [count=" + count + ", rows=" + rows + "]";
	}

	public Integer getCount() {
		return count;
	}

	public void setCount(Integer count) {
		this.count = count;
	}

	public List<T> getRows() {
		return rows;
	}

	public void setRows(List<T> rows) {
		this.rows = rows;
	}
}
