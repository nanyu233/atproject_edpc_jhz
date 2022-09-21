package activetech.zyyhospital.pojo.dto;

import java.util.Date;
import java.util.List;

import activetech.base.pojo.dto.PageQuery;
import activetech.hospital.pojo.dto.HspemginfCustom;
import activetech.hospital.pojo.dto.HspsqlinfCustom;

public class HspHlpgbQueryDto {
	private HspHlpgbCustom hspHlpgbCustom;
	private HspemginfCustom hspemginfCustom;
	
	private HspBradenInfCustom hspBradenInfCustom;
	private HspZcddexpfInfCustom hspZcddexpfInfCustom;
	private HspAdlInfCustom hspAdlInfCustom;
	private HspFallriskInfCustom hspFallriskInfCustom;
	private HspZyfxpfInfCustom hspZyfxpfInfCustom;
	private HspGcsInfCustom hspGcsInfCustom;
	private HspNrsInfCustom hspNrsInfCustom;
	private HspDdfxpgbInfCustom hspDdfxpgbInfCustom;
	
	/**
	 * 转归记录自定义实体类
	 */
	private	HspsqlinfCustom hspsqlinfCustom;
	
	private List<String> scoIdList;
	private Date startdate;
	private Date enddate;
	private String querytype;
	private PageQuery pageQuery;
	
	
	public PageQuery getPageQuery() {
		return pageQuery;
	}

	public void setPageQuery(PageQuery pageQuery) {
		this.pageQuery = pageQuery;
	}

	public Date getStartdate() {
		return startdate;
	}

	public void setStartdate(Date startdate) {
		this.startdate = startdate;
	}

	public Date getEnddate() {
		return enddate;
	}

	public void setEnddate(Date enddate) {
		this.enddate = enddate;
	}

	public String getQuerytype() {
		return querytype;
	}

	public void setQuerytype(String querytype) {
		this.querytype = querytype;
	}

	public List<String> getScoIdList() {
		return scoIdList;
	}

	public void setScoIdList(List<String> scoIdList) {
		this.scoIdList = scoIdList;
	}

	public HspDdfxpgbInfCustom getHspDdfxpgbInfCustom() {
		return hspDdfxpgbInfCustom;
	}

	public void setHspDdfxpgbInfCustom(HspDdfxpgbInfCustom hspDdfxpgbInfCustom) {
		this.hspDdfxpgbInfCustom = hspDdfxpgbInfCustom;
	}

	public HspNrsInfCustom getHspNrsInfCustom() {
		return hspNrsInfCustom;
	}

	public void setHspNrsInfCustom(HspNrsInfCustom hspNrsInfCustom) {
		this.hspNrsInfCustom = hspNrsInfCustom;
	}

	public HspGcsInfCustom getHspGcsInfCustom() {
		return hspGcsInfCustom;
	}

	public void setHspGcsInfCustom(HspGcsInfCustom hspGcsInfCustom) {
		this.hspGcsInfCustom = hspGcsInfCustom;
	}

	public HspZyfxpfInfCustom getHspZyfxpfInfCustom() {
		return hspZyfxpfInfCustom;
	}

	public void setHspZyfxpfInfCustom(HspZyfxpfInfCustom hspZyfxpfInfCustom) {
		this.hspZyfxpfInfCustom = hspZyfxpfInfCustom;
	}

	public HspFallriskInfCustom getHspFallriskInfCustom() {
		return hspFallriskInfCustom;
	}

	public void setHspFallriskInfCustom(HspFallriskInfCustom hspFallriskInfCustom) {
		this.hspFallriskInfCustom = hspFallriskInfCustom;
	}

	public HspBradenInfCustom getHspBradenInfCustom() {
		return hspBradenInfCustom;
	}

	public void setHspBradenInfCustom(HspBradenInfCustom hspBradenInfCustom) {
		this.hspBradenInfCustom = hspBradenInfCustom;
	}

	public HspZcddexpfInfCustom getHspZcddexpfInfCustom() {
		return hspZcddexpfInfCustom;
	}

	public void setHspZcddexpfInfCustom(HspZcddexpfInfCustom hspZcddexpfInfCustom) {
		this.hspZcddexpfInfCustom = hspZcddexpfInfCustom;
	}

	public HspAdlInfCustom getHspAdlInfCustom() {
		return hspAdlInfCustom;
	}

	public void setHspAdlInfCustom(HspAdlInfCustom hspAdlInfCustom) {
		this.hspAdlInfCustom = hspAdlInfCustom;
	}

	public HspemginfCustom getHspemginfCustom() {
		return hspemginfCustom;
	}

	public void setHspemginfCustom(HspemginfCustom hspemginfCustom) {
		this.hspemginfCustom = hspemginfCustom;
	}

	public HspHlpgbCustom getHspHlpgbCustom() {
		return hspHlpgbCustom;
	}

	public void setHspHlpgbCustom(HspHlpgbCustom hspHlpgbCustom) {
		this.hspHlpgbCustom = hspHlpgbCustom;
	}

	public HspsqlinfCustom getHspsqlinfCustom() {
		return hspsqlinfCustom;
	}

	public void setHspsqlinfCustom(HspsqlinfCustom hspsqlinfCustom) {
		this.hspsqlinfCustom = hspsqlinfCustom;
	}
	
	

}
