package com.spring.jpa.app.util.paginator;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.domain.Page;

public class PageRender<T> {
	private String url;
	private Page<T> page;
	private int totalPaginas;
	private int numElementPaginas;
	private int currentPage;
	private List<PageItem> paginas;
	
	public PageRender(String url, Page<T> page) {
		this.url = url;
		this.page = page;
		this.paginas = new ArrayList<>();
		this.numElementPaginas = this.page.getSize();
		this.totalPaginas = this.page.getTotalPages();
		this.currentPage = this.page.getNumber() +1;
		
		int desde, hasta;
		if (this.totalPaginas <= this.numElementPaginas) {
			desde = 1;
			hasta = this.totalPaginas;
		} else {
			if (this.currentPage <= numElementPaginas / 2) {
				desde = 1;
				hasta = numElementPaginas;
			} else if (this.currentPage >= (this.totalPaginas - this.numElementPaginas / 2)) {
				desde = this.totalPaginas - this.numElementPaginas +1;
				hasta = this.numElementPaginas;
			} else {
				desde = this.currentPage - (this.numElementPaginas / 2);
				hasta = this.numElementPaginas;
			}
		}
		
		for (int i = 0; i < hasta; i++) {
			this.paginas.add(new PageItem(desde + i, this.currentPage == desde + i));
		}
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public Page<T> getPage() {
		return page;
	}

	public void setPage(Page<T> page) {
		this.page = page;
	}

	public int getTotalPaginas() {
		return totalPaginas;
	}
	
	public boolean isFirst() {
		return this.page.isFirst();
	}
	
	public boolean isLast() {
		return this.page.isLast();
	}
	
	public boolean isHasNext() {
		return this.page.hasNext();
	}
	
	public boolean isHasPrevius() {
		return this.page.hasPrevious();
	}

	public void setTotalPaginas(int totalPaginas) {
		this.totalPaginas = totalPaginas;
	}

	public int getNumElementPaginas() {
		return numElementPaginas;
	}

	public void setNumElementPaginas(int numElementPaginas) {
		this.numElementPaginas = numElementPaginas;
	}

	public int getCurrentPage() {
		return currentPage;
	}

	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}

	public List<PageItem> getPaginas() {
		return paginas;
	}

	public void setPaginas(List<PageItem> paginas) {
		this.paginas = paginas;
	}
	
}