package activetech.edpc.pojo.dto;


import java.util.Date;
import java.util.List;

import activetech.base.pojo.domain.PageCond;
import activetech.base.pojo.dto.PageQuery;
import activetech.edpc.pojo.domain.HspFuvPln;

public class HspFuvPlnQueryDto extends PageCond {

    private HspFuvPlnCustom hspFuvPlnCustom;
    private List<HspFuvPlnCustom> hspFuvPlnCustoms;
    private Date startDate;
    private Date endDate;

	public HspFuvPlnCustom getHspFuvPlnCustom() {
		return hspFuvPlnCustom;
	}

	public void setHspFuvPlnCustom(HspFuvPlnCustom hspFuvPlnCustom) {
		this.hspFuvPlnCustom = hspFuvPlnCustom;
	}

	public List<HspFuvPlnCustom> getHspFuvPlnCustoms() {
		return hspFuvPlnCustoms;
	}

	public void setHspFuvPlnCustoms(List<HspFuvPlnCustom> hspFuvPlnCustoms) {
		this.hspFuvPlnCustoms = hspFuvPlnCustoms;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

    
}