package util;

import java.util.List;

public class Page<T> {
	/**
	 * 总条数
	 */
	public int totalCount;
	/**
	 * 每页容纳的数据量
	 */
	public int pageCount = 20;



	/**
	 * 总页数
	 */
	public int totalPage;

	public void setTotalCount(int count) {
		totalCount = count;
		totalPage = totalCount % pageCount == 0 ?
				totalCount / pageCount :totalCount / pageCount +1;
	}

	public int getTotalCount() {
		return totalCount;
	}

	public int getPageCount() {
		return pageCount;
	}

	public int getTotalPage() {
		return totalPage;
	}

	public int getCurrentPage() {
		return currentPage;
	}

	public List<T> getData() {
		return data;
	}

	public void setPageCount(int pageCount) {
		this.pageCount = pageCount;
	}

	public void setTotalPage(int totalPage) {
		this.totalPage = totalPage;
	}

	public void setData(List<T> data) {
		this.data = data;
	}

	/**
	 * 当前页
	 */
	public int currentPage = 1;

	public int getFirstResult() {
		return (currentPage - 1) * pageCount;
	}

	public void setCurrentPage(int currentPage) {
		if (currentPage < 1) {
			this.currentPage = 1;
		} else if (currentPage > totalPage) {
			this.currentPage = totalPage;
		} else {
			this.currentPage = currentPage;
		}
	}

	/**
	 * 检索出来的数据
	 */
	public List<T> data;


}
