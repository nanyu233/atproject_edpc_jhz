package activetech.basehis.pojo.domain;

import java.util.Date;
/**
 * 
 * <p>Title:收费明细</p>
 * <p>Description:</p>
 * <p>activetech</p>
 * @author moneyblue
 * @date 2018-5-11 下午2:55:38
 *
 */
public class VHemsSfxx {
	
	private String zyh;
	private Date	rq;
	private Date	sfrq;
	private String	mc;
	private float	je;
	private String dxm;//收费类型
	private String xmm;//收费类型信息
	private String ysm; //开单医生名
	private String bmh; //开单科室号
	
	public String getBmh() {
		return bmh;
	}
	public void setBmh(String bmh) {
		this.bmh = bmh;
	}
	
	public String getZyh() {
		return zyh;
	}
	public void setZyh(String zyh) {
		this.zyh = zyh;
	}
	public Date getRq() {
		return rq;
	}
	public void setRq(Date rq) {
		this.rq = rq;
	}
	public Date getSfrq() {
		return sfrq;
	}
	public void setSfrq(Date sfrq) {
		this.sfrq = sfrq;
	}
	public String getMc() {
		return mc;
	}
	public void setMc(String mc) {
		this.mc = mc;
	}
	public float getJe() {
		return je;
	}
	public void setJe(float je) {
		this.je = je;
	}
	public String getDxm() {
		return dxm;
	}
	public void setDxm(String dxm) {
		this.dxm = dxm;
	}
	public String getXmm() {
		return xmm;
	}
	public void setXmm(String xmm) {
		this.xmm = xmm;
	}
	public String getYsm() {
		return ysm;
	}
	public void setYsm(String ysm) {
		this.ysm = ysm;
	}

}
