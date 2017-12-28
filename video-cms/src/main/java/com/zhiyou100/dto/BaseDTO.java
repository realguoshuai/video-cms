
package com.zhiyou100.dto;

import java.util.List;

import com.zhiyou100.entity.SubjectDO;

public class BaseDTO<T> {
	// 数量
	private Integer count;
	// row行
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
