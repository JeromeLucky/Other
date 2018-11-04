package homework.servlet1.web.servlet.divpages;

public class PageVO {
		//默认每页显示的记录数
		private int pageSize=5;
		//当前开始
		private int start;
		//要跳转的页面
		private String url;
		//页面数
		private int pages;

	 	public PageVO(int counts,String url,int pageSize,int start){
			this.setUrl(url);
			this.setPageSize(pageSize);
			this.setStart(start);
			this.setPages(counts%pageSize==0?counts/pageSize:counts/pageSize+1);
			
		}

		public int getPages() {
			return pages;
		}

		public void setPages(int pages) {
			this.pages = pages;
		}

		public String getUrl() {
			return url;
		}

		public void setUrl(String url) {
			this.url = url;
		}

		public int getStart() {
			return start;
		}

		public void setStart(int start) {
			this.start = start;
		}

		public int getPageSize() {
			return pageSize;
		}

		public void setPageSize(int pageSize) {
			this.pageSize = pageSize;
		}
	}


