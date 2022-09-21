package activetech.aid.pojo.domain;

public class AidStepdef {
    private String stepseq;

    private String stepname;

    private String steptype;

    private String steprange;

    private String stepflag;

    private Short stepsort;

    private String setpmemo;

    public String getStepseq() {
        return stepseq;
    }

    public void setStepseq(String stepseq) {
        this.stepseq = stepseq == null ? null : stepseq.trim();
    }

    public String getStepname() {
        return stepname;
    }

    public void setStepname(String stepname) {
        this.stepname = stepname == null ? null : stepname.trim();
    }

    public String getSteptype() {
        return steptype;
    }

    public void setSteptype(String steptype) {
        this.steptype = steptype == null ? null : steptype.trim();
    }

    public String getSteprange() {
        return steprange;
    }

    public void setSteprange(String steprange) {
        this.steprange = steprange == null ? null : steprange.trim();
    }

    public String getStepflag() {
        return stepflag;
    }

    public void setStepflag(String stepflag) {
        this.stepflag = stepflag == null ? null : stepflag.trim();
    }

    public Short getStepsort() {
        return stepsort;
    }

    public void setStepsort(Short stepsort) {
        this.stepsort = stepsort;
    }

    public String getSetpmemo() {
        return setpmemo;
    }

    public void setSetpmemo(String setpmemo) {
        this.setpmemo = setpmemo == null ? null : setpmemo.trim();
    }
}