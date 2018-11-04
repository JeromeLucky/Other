package homework.servlet1.web.servlet.divpages;

public class PageVO {
		//Ĭ��ÿҳ��ʾ�ļ�¼��
		private int pageSize=5;
		//��ǰ��ʼ
		private int start;
		//Ҫ��ת��ҳ��
		private String url;
		//ҳ����
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


