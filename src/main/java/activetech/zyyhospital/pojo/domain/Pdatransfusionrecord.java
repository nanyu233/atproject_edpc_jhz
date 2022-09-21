package activetech.zyyhospital.pojo.domain;

import java.util.Date;

public class Pdatransfusionrecord {
    private Short xh;

    private String outpatientid;

    private String bloodbagid;
    
    private String patientcode;

    private String inspectionid;

    private String collator;

    private String witness;

    private Date writetime;

    private Short step;

    private String stepname;

    private Short isreaction;

    private String temperature;

    private String xy1;

    private String xy2;

    private String bloodpressure;

    private String heartrate;

    private String breathe;

    private String spo;

    private String drippingspeed;

    private String nursrecord;

    private String reactioncontent;

    private String reactioindeal;

    
    public String getPatientcode() {
		return patientcode;
	}

	public void setPatientcode(String patientcode) {
		this.patientcode = patientcode;
	}

	public Short getXh() {
        return xh;
    }

    public void setXh(Short xh) {
        this.xh = xh;
    }

    public String getOutpatientid() {
        return outpatientid;
    }

    public void setOutpatientid(String outpatientid) {
        this.outpatientid = outpatientid == null ? null : outpatientid.trim();
    }

    public String getBloodbagid() {
        return bloodbagid;
    }

    public void setBloodbagid(String bloodbagid) {
        this.bloodbagid = bloodbagid == null ? null : bloodbagid.trim();
    }

    public String getInspectionid() {
        return inspectionid;
    }

    public void setInspectionid(String inspectionid) {
        this.inspectionid = inspectionid == null ? null : inspectionid.trim();
    }

    public String getCollator() {
        return collator;
    }

    public void setCollator(String collator) {
        this.collator = collator == null ? null : collator.trim();
    }

    public String getWitness() {
        return witness;
    }

    public void setWitness(String witness) {
        this.witness = witness == null ? null : witness.trim();
    }

    public Date getWritetime() {
        return writetime;
    }

    public void setWritetime(Date writetime) {
        this.writetime = writetime;
    }

    public Short getStep() {
        return step;
    }

    public void setStep(Short step) {
        this.step = step;
    }

    public String getStepname() {
        return stepname;
    }

    public void setStepname(String stepname) {
        this.stepname = stepname == null ? null : stepname.trim();
    }

    public Short getIsreaction() {
        return isreaction;
    }

    public void setIsreaction(Short isreaction) {
        this.isreaction = isreaction;
    }

    public String getTemperature() {
        return temperature;
    }

    public void setTemperature(String temperature) {
        this.temperature = temperature == null ? null : temperature.trim();
    }

    public String getXy1() {
        return xy1;
    }

    public void setXy1(String xy1) {
        this.xy1 = xy1 == null ? null : xy1.trim();
    }

    public String getXy2() {
        return xy2;
    }

    public void setXy2(String xy2) {
        this.xy2 = xy2 == null ? null : xy2.trim();
    }

    public String getBloodpressure() {
        return bloodpressure;
    }

    public void setBloodpressure(String bloodpressure) {
        this.bloodpressure = bloodpressure == null ? null : bloodpressure.trim();
    }

    public String getHeartrate() {
        return heartrate;
    }

    public void setHeartrate(String heartrate) {
        this.heartrate = heartrate == null ? null : heartrate.trim();
    }

    public String getBreathe() {
        return breathe;
    }

    public void setBreathe(String breathe) {
        this.breathe = breathe == null ? null : breathe.trim();
    }

    public String getSpo() {
        return spo;
    }

    public void setSpo(String spo) {
        this.spo = spo == null ? null : spo.trim();
    }

    public String getDrippingspeed() {
        return drippingspeed;
    }

    public void setDrippingspeed(String drippingspeed) {
        this.drippingspeed = drippingspeed == null ? null : drippingspeed.trim();
    }

    public String getNursrecord() {
        return nursrecord;
    }

    public void setNursrecord(String nursrecord) {
        this.nursrecord = nursrecord == null ? null : nursrecord.trim();
    }

    public String getReactioncontent() {
        return reactioncontent;
    }

    public void setReactioncontent(String reactioncontent) {
        this.reactioncontent = reactioncontent == null ? null : reactioncontent.trim();
    }

    public String getReactioindeal() {
        return reactioindeal;
    }

    public void setReactioindeal(String reactioindeal) {
        this.reactioindeal = reactioindeal == null ? null : reactioindeal.trim();
    }
}