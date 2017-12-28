package com.zhiyou100.vo;

public class QueryVO {
	/**
	 * 请求参数封装类
	 */
	/**
	 * offset,limit 0,5 起始索引,查几个 search 搜索过滤-->keywords sort 排序字段 , order 倒序,正序
	 * 
	 */
	private Integer offset;

	private Integer limit;

	private String search;

	private String sort;

	private String order;

	private Integer status;
	private Integer id;
	private String ids;

	public QueryVO(Integer offset, Integer limit, String search, String sort, String order, Integer status) {
		super();
		this.offset = offset;
		this.limit = limit;
		this.search = search;
		this.sort = sort;
		this.order = order;
		this.status = status;
	}

	public QueryVO(Integer offset, Integer limit, String search, String sort, String order, Integer status, Integer id,
			String ids) {
		super();
		this.offset = offset;
		this.limit = limit;
		this.search = search;
		this.sort = sort;
		this.order = order;
		this.status = status;
		this.id = id;
		this.ids = ids;
	}

	public QueryVO() {
		super();
	}

	@Override
	public String toString() {
		return "QueryVO [offset=" + offset + ", limit=" + limit + ", search=" + search + ", sort=" + sort + ", order="
				+ order + ", status=" + status + "]";
	}

	public Integer getOffset() {
		return offset;
	}

	public void setOffset(Integer offset) {
		this.offset = offset;
	}

	public Integer getLimit() {
		return limit;
	}

	public void setLimit(Integer limit) {
		this.limit = limit;
	}

	public String getSearch() {
		return search;
	}

	public void setSearch(String search) {
		this.search = search;
	}

	public String getSort() {
		return sort;
	}

	public void setSort(String sort) {
		this.sort = sort;
	}

	public String getOrder() {
		return order;
	}

	public void setOrder(String order) {
		this.order = order;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	
	public void setIds(String ids) {
		this.ids = ids;
	}

	//
	public String[] getKeywords() {
		if (search == null || search.equals("")) {
			return null;
		} else {
			return search.split(" ");
		}
	}

	public String[] getIds() {
		if (ids == null || ids.equals("")) {
			return null;
		} else {
			return ids.split(" ");
		}
	}
}
