package activetech.zyyhospital.pojo.dto;

import activetech.base.pojo.dto.PageQuery;
import activetech.zyyhospital.pojo.domain.HspJjbhzmx;

public class HspJjbhzmxCustom extends HspJjbhzmx{
	//分页
		private PageQuery pageQuery;

		public PageQuery getPageQuery() {
			return pageQuery;
		}

		public void setPageQuery(PageQuery pageQuery) {
			this.pageQuery = pageQuery;
		}
}
