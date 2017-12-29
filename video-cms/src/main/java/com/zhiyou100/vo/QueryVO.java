package com.zhiyou100.vo;

public class QueryVO {

	private Integer offset = 0;
	
	private Integer limit = 5;
	
	private String search;
	
	private String sort;
	
	private String order;
	
	// 在 search 属性的 setter 方法中设置
	private String[] keywords;

	public QueryVO() {
		super();
	}

	@Override
	public String toString() {
		return "QueryVO [offset=" + offset + ", limit=" + limit + ", search=" + search + ", sort=" + sort + ", order="
				+ order + "]";
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
		
		// 设置 keywords
		if (search != null && !search.equals("")) {
			
			keywords = search.split(" ");
		}
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
	
	// 所有地方的属性取值都是通过 get 方法完成的
	public String[] getKeywords() {
		
		return keywords;
	}
}
