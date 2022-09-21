package activetech.external.pojo.domain;

import java.util.Date;

public class HspMdyDat {
    private String bedNum;

    private Date datTim;

    private Short ecg;

    private Short spo2;

    private Short resp;

    private Short temp;

    private Short nibpSys;

    private Short nibpDia;

    private Short nibpMea;

    private String almEcg;

    private String almSpo2;

    private String almResp;

    private String almTemp;

    private String almNibpSys;

    private String almNibpDia;

    private String almNibpMea;

    private String almTec;
    
    private String hlTim;
    
    


	public String getHlTim() {
		return hlTim;
	}

	public void setHlTim(String hlTim) {
		this.hlTim = hlTim;
	}

	public String getBedNum() {
        return bedNum;
    }

    public void setBedNum(String bedNum) {
        this.bedNum = bedNum == null ? null : bedNum.trim();
    }

    public Date getDatTim() {
        return datTim;
    }

    public void setDatTim(Date datTim) {
        this.datTim = datTim;
    }

    public Short getEcg() {
        return ecg;
    }

    public void setEcg(Short ecg) {
        this.ecg = ecg;
    }

    public Short getSpo2() {
        return spo2;
    }

    public void setSpo2(Short spo2) {
        this.spo2 = spo2;
    }

    public Short getResp() {
        return resp;
    }

    public void setResp(Short resp) {
        this.resp = resp;
    }

    public Short getTemp() {
        return temp;
    }

    public void setTemp(Short temp) {
        this.temp = temp;
    }

    public Short getNibpSys() {
        return nibpSys;
    }

    public void setNibpSys(Short nibpSys) {
        this.nibpSys = nibpSys;
    }

    public Short getNibpDia() {
        return nibpDia;
    }

    public void setNibpDia(Short nibpDia) {
        this.nibpDia = nibpDia;
    }

    public Short getNibpMea() {
        return nibpMea;
    }

    public void setNibpMea(Short nibpMea) {
        this.nibpMea = nibpMea;
    }

    public String getAlmEcg() {
        return almEcg;
    }

    public void setAlmEcg(String almEcg) {
        this.almEcg = almEcg == null ? null : almEcg.trim();
    }

    public String getAlmSpo2() {
        return almSpo2;
    }

    public void setAlmSpo2(String almSpo2) {
        this.almSpo2 = almSpo2 == null ? null : almSpo2.trim();
    }

    public String getAlmResp() {
        return almResp;
    }

    public void setAlmResp(String almResp) {
        this.almResp = almResp == null ? null : almResp.trim();
    }

    public String getAlmTemp() {
        return almTemp;
    }

    public void setAlmTemp(String almTemp) {
        this.almTemp = almTemp == null ? null : almTemp.trim();
    }

    public String getAlmNibpSys() {
        return almNibpSys;
    }

    public void setAlmNibpSys(String almNibpSys) {
        this.almNibpSys = almNibpSys == null ? null : almNibpSys.trim();
    }

    public String getAlmNibpDia() {
        return almNibpDia;
    }

    public void setAlmNibpDia(String almNibpDia) {
        this.almNibpDia = almNibpDia == null ? null : almNibpDia.trim();
    }

    public String getAlmNibpMea() {
        return almNibpMea;
    }

    public void setAlmNibpMea(String almNibpMea) {
        this.almNibpMea = almNibpMea == null ? null : almNibpMea.trim();
    }

    public String getAlmTec() {
        return almTec;
    }

    public void setAlmTec(String almTec) {
        this.almTec = almTec == null ? null : almTec.trim();
    }
}