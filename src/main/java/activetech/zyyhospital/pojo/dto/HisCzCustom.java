package activetech.zyyhospital.pojo.dto;

import java.util.Date;

public class HisCzCustom {
	private String triageid;

    private String cardno;

    private String patientid;

    private Date triagedate;

    private String operno;

    private String operid;

    private String name;

    private String sex;

    private Date birthday;

    private String documentno;

    private String identity;

    private String chargetype;

    private String nation;

    private String contactperson;

    private String contactphone;

    private String address;

    private int triagelevel;

    private String triagedirection;

    private String greenroad1;

    private String greenroad2;

    private String greenroad3;

    private String greenroad4;

    private String greenroad5;

    private String rfidcode;

    private String shousuoya;

    private String shuzhangya;

    private String spo2;

    private String maibo;

    private String huxi;

    private String tiwen;
    
    //返回
  	private String returncode;//返回值代码：1:成功;0:失败
  	private String returnmsg;//返回错误提示信息

    public String getTriageid() {
        return triageid;
    }

    public void setTriageid(String triageid) {
        this.triageid = triageid == null ? null : triageid.trim();
    }

    public String getCardno() {
        return cardno;
    }

    public void setCardno(String cardno) {
        this.cardno = cardno == null ? null : cardno.trim();
    }

    public String getPatientid() {
        return patientid;
    }

    public void setPatientid(String patientid) {
        this.patientid = patientid == null ? null : patientid.trim();
    }

    public Date getTriagedate() {
        return triagedate;
    }

    public void setTriagedate(Date triagedate) {
        this.triagedate = triagedate;
    }

    public String getOperno() {
        return operno;
    }

    public void setOperno(String operno) {
        this.operno = operno == null ? null : operno.trim();
    }

    public String getOperid() {
        return operid;
    }

    public void setOperid(String operid) {
        this.operid = operid == null ? null : operid.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getDocumentno() {
        return documentno;
    }

    public void setDocumentno(String documentno) {
        this.documentno = documentno == null ? null : documentno.trim();
    }

    public String getIdentity() {
        return identity;
    }

    public void setIdentity(String identity) {
        this.identity = identity == null ? null : identity.trim();
    }

    public String getChargetype() {
        return chargetype;
    }

    public void setChargetype(String chargetype) {
        this.chargetype = chargetype == null ? null : chargetype.trim();
    }

    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        this.nation = nation == null ? null : nation.trim();
    }

    public String getContactperson() {
        return contactperson;
    }

    public void setContactperson(String contactperson) {
        this.contactperson = contactperson == null ? null : contactperson.trim();
    }

    public String getContactphone() {
        return contactphone;
    }

    public void setContactphone(String contactphone) {
        this.contactphone = contactphone == null ? null : contactphone.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public int getTriagelevel() {
		return triagelevel;
	}

	public void setTriagelevel(int triagelevel) {
		this.triagelevel = triagelevel;
	}

	public String getReturncode() {
		return returncode;
	}

	public void setReturncode(String returncode) {
		this.returncode = returncode;
	}

	public String getReturnmsg() {
		return returnmsg;
	}

	public void setReturnmsg(String returnmsg) {
		this.returnmsg = returnmsg;
	}

	public String getTriagedirection() {
        return triagedirection;
    }

    public void setTriagedirection(String triagedirection) {
        this.triagedirection = triagedirection == null ? null : triagedirection.trim();
    }

    public String getGreenroad1() {
        return greenroad1;
    }

    public void setGreenroad1(String greenroad1) {
        this.greenroad1 = greenroad1 == null ? null : greenroad1.trim();
    }

    public String getGreenroad2() {
        return greenroad2;
    }

    public void setGreenroad2(String greenroad2) {
        this.greenroad2 = greenroad2 == null ? null : greenroad2.trim();
    }

    public String getGreenroad3() {
        return greenroad3;
    }

    public void setGreenroad3(String greenroad3) {
        this.greenroad3 = greenroad3 == null ? null : greenroad3.trim();
    }

    public String getGreenroad4() {
        return greenroad4;
    }

    public void setGreenroad4(String greenroad4) {
        this.greenroad4 = greenroad4 == null ? null : greenroad4.trim();
    }

    public String getGreenroad5() {
        return greenroad5;
    }

    public void setGreenroad5(String greenroad5) {
        this.greenroad5 = greenroad5 == null ? null : greenroad5.trim();
    }

    public String getRfidcode() {
        return rfidcode;
    }

    public void setRfidcode(String rfidcode) {
        this.rfidcode = rfidcode == null ? null : rfidcode.trim();
    }

    public String getShousuoya() {
        return shousuoya;
    }

    public void setShousuoya(String shousuoya) {
        this.shousuoya = shousuoya == null ? null : shousuoya.trim();
    }

    public String getShuzhangya() {
        return shuzhangya;
    }

    public void setShuzhangya(String shuzhangya) {
        this.shuzhangya = shuzhangya == null ? null : shuzhangya.trim();
    }

    public String getSpo2() {
        return spo2;
    }

    public void setSpo2(String spo2) {
        this.spo2 = spo2 == null ? null : spo2.trim();
    }

    public String getMaibo() {
        return maibo;
    }

    public void setMaibo(String maibo) {
        this.maibo = maibo == null ? null : maibo.trim();
    }

    public String getHuxi() {
        return huxi;
    }

    public void setHuxi(String huxi) {
        this.huxi = huxi == null ? null : huxi.trim();
    }

    public String getTiwen() {
        return tiwen;
    }

    public void setTiwen(String tiwen) {
        this.tiwen = tiwen == null ? null : tiwen.trim();
    }
}
