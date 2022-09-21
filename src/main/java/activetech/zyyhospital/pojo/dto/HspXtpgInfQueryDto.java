package activetech.zyyhospital.pojo.dto;

import java.util.Date;

import activetech.base.pojo.dto.PageQuery;
import activetech.edpc.pojo.domain.HspTashInf;
import activetech.edpc.pojo.dto.HspTashInfCustom;
import activetech.hospital.pojo.dto.HspZjpfInfCustom;
import activetech.hospital.pojo.dto.HspemginfCustom;

public class HspXtpgInfQueryDto {

	private HspXtpgInfCustom hspXtpgInfCustom;//系统评估表
	private HspemginfCustom hspemginfCustom;  //预检表
	private HspBradenInfCustom hspBradenInfCustom;//Braden评分表
	private HspAdlInfCustom hspAdlInfCustom;//ADL评分表
	private HspZcddexpfInfCustom hspZcddexpfInfCustom;//坠床跌倒评分表
	private HspNrsInfCustom hspNrsInfCustom;//疼痛评姑表
	private HspSjxtpgInfCustom hspSjxtpgInfCustom;//神经系统评估
	private HspHxxtpgInfCustom hspHxxtpgInfCustom;//呼吸系统
	private HspXxgxtpgInfCustom hspXxgxtpgInfCustom;//心血管
	private HspXhxtpgInfCustom hspXhxtpgInfCustom;//消化系统评估  
	private HspMnszxtpgInfCustom hspMnszxtpgInfCustom; //泌尿生殖系统评估
	private HspGgjpfxtInfCustom hspGgjpfxtInfCustom;//骨骼、肌、皮肤系统表 
	private HspXlshpgInfCustom hspXlshpgInfCustom;//心理社会评估表
	private HspDgpgInfCustom hspDgpgInfCustom;//导管评估
	private HspGcsInfCustom hspGcsInfCustom;//Gcs评分表
	private HspZjpfInfCustom hspZjpfInfCustom;//镇静评分表
	
	private HspFallriskInfCustom hspFallriskInfCustom;//新版坠床跌倒评分
	private HspZyfxpfInfCustom hspZyfxpfInfCustom;//转运风险评分
	private HspDdfxpgbInfCustom hspDdfxpgbInfCustom;//Morse跌倒评分
	private HspTiInfCustom hspTiInfCustom;//ti创伤评分

	private HspTashInfCustom hspTashInfCustom;//tash评分
	
	//分页
	private PageQuery pageQuery;
	private String sort;
	private String order;
	
	private Date startdate;//开始时间
    private Date enddate;//结束时间
	
    
	public HspTiInfCustom getHspTiInfCustom() {
		return hspTiInfCustom;
	}
	public void setHspTiInfCustom(HspTiInfCustom hspTiInfCustom) {
		this.hspTiInfCustom = hspTiInfCustom;
	}
	public HspZjpfInfCustom getHspZjpfInfCustom() {
		return hspZjpfInfCustom;
	}
	public void setHspZjpfInfCustom(HspZjpfInfCustom hspZjpfInfCustom) {
		this.hspZjpfInfCustom = hspZjpfInfCustom;
	}
	public HspDdfxpgbInfCustom getHspDdfxpgbInfCustom() {
		return hspDdfxpgbInfCustom;
	}
	public void setHspDdfxpgbInfCustom(HspDdfxpgbInfCustom hspDdfxpgbInfCustom) {
		this.hspDdfxpgbInfCustom = hspDdfxpgbInfCustom;
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
	public HspHxxtpgInfCustom getHspHxxtpgInfCustom() {
		return hspHxxtpgInfCustom;
	}
	public void setHspHxxtpgInfCustom(HspHxxtpgInfCustom hspHxxtpgInfCustom) {
		this.hspHxxtpgInfCustom = hspHxxtpgInfCustom;
	}
	public HspXxgxtpgInfCustom getHspXxgxtpgInfCustom() {
		return hspXxgxtpgInfCustom;
	}
	public void setHspXxgxtpgInfCustom(HspXxgxtpgInfCustom hspXxgxtpgInfCustom) {
		this.hspXxgxtpgInfCustom = hspXxgxtpgInfCustom;
	}
	public HspXhxtpgInfCustom getHspXhxtpgInfCustom() {
		return hspXhxtpgInfCustom;
	}
	public void setHspXhxtpgInfCustom(HspXhxtpgInfCustom hspXhxtpgInfCustom) {
		this.hspXhxtpgInfCustom = hspXhxtpgInfCustom;
	}
	public HspMnszxtpgInfCustom getHspMnszxtpgInfCustom() {
		return hspMnszxtpgInfCustom;
	}
	public void setHspMnszxtpgInfCustom(HspMnszxtpgInfCustom hspMnszxtpgInfCustom) {
		this.hspMnszxtpgInfCustom = hspMnszxtpgInfCustom;
	}
	public HspGgjpfxtInfCustom getHspGgjpfxtInfCustom() {
		return hspGgjpfxtInfCustom;
	}
	public void setHspGgjpfxtInfCustom(HspGgjpfxtInfCustom hspGgjpfxtInfCustom) {
		this.hspGgjpfxtInfCustom = hspGgjpfxtInfCustom;
	}
	public HspXlshpgInfCustom getHspXlshpgInfCustom() {
		return hspXlshpgInfCustom;
	}
	public void setHspXlshpgInfCustom(HspXlshpgInfCustom hspXlshpgInfCustom) {
		this.hspXlshpgInfCustom = hspXlshpgInfCustom;
	}
	public HspDgpgInfCustom getHspDgpgInfCustom() {
		return hspDgpgInfCustom;
	}
	public void setHspDgpgInfCustom(HspDgpgInfCustom hspDgpgInfCustom) {
		this.hspDgpgInfCustom = hspDgpgInfCustom;
	}
	public HspSjxtpgInfCustom getHspSjxtpgInfCustom() {
		return hspSjxtpgInfCustom;
	}
	public void setHspSjxtpgInfCustom(HspSjxtpgInfCustom hspSjxtpgInfCustom) {
		this.hspSjxtpgInfCustom = hspSjxtpgInfCustom;
	}
	public HspZcddexpfInfCustom getHspZcddexpfInfCustom() {
		return hspZcddexpfInfCustom;
	}
	public void setHspZcddexpfInfCustom(HspZcddexpfInfCustom hspZcddexpfInfCustom) {
		this.hspZcddexpfInfCustom = hspZcddexpfInfCustom;
	}
	public HspNrsInfCustom getHspNrsInfCustom() {
		return hspNrsInfCustom;
	}
	public void setHspNrsInfCustom(HspNrsInfCustom hspNrsInfCustom) {
		this.hspNrsInfCustom = hspNrsInfCustom;
	}
	public HspAdlInfCustom getHspAdlInfCustom() {
		return hspAdlInfCustom;
	}
	public void setHspAdlInfCustom(HspAdlInfCustom hspAdlInfCustom) {
		this.hspAdlInfCustom = hspAdlInfCustom;
	}
	public HspXtpgInfCustom getHspXtpgInfCustom() {
		return hspXtpgInfCustom;
	}
	public void setHspXtpgInfCustom(HspXtpgInfCustom hspXtpgInfCustom) {
		this.hspXtpgInfCustom = hspXtpgInfCustom;
	}
	public HspemginfCustom getHspemginfCustom() {
		return hspemginfCustom;
	}
	public void setHspemginfCustom(HspemginfCustom hspemginfCustom) {
		this.hspemginfCustom = hspemginfCustom;
	}
	public HspBradenInfCustom getHspBradenInfCustom() {
		return hspBradenInfCustom;
	}
	public void setHspBradenInfCustom(HspBradenInfCustom hspBradenInfCustom) {
		this.hspBradenInfCustom = hspBradenInfCustom;
	}
	public PageQuery getPageQuery() {
		return pageQuery;
	}
	public void setPageQuery(PageQuery pageQuery) {
		this.pageQuery = pageQuery;
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
	public HspGcsInfCustom getHspGcsInfCustom() {
		return hspGcsInfCustom;
	}
	public void setHspGcsInfCustom(HspGcsInfCustom hspGcsInfCustom) {
		this.hspGcsInfCustom = hspGcsInfCustom;
	}

	public HspTashInfCustom getHspTashInfCustom() {
		return hspTashInfCustom;
	}

	public void setHspTashInfCustom(HspTashInfCustom hspTashInfCustom) {
		this.hspTashInfCustom = hspTashInfCustom;
	}
}
