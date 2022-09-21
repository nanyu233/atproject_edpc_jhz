package activetech.zyyhospital.pojo.domain;

import java.util.Date;

public class HspQtsjgl {
	private String qtsjSeq;

    private String qtsjNam;

    private Date qtsjDat;

    private String qtsjType;

    private String adrr;

    private String jyjg;

    private String qjgc;

    private String qjxj;

    private String bgbm;

    private String bgrnam;

    private Date djdat;

    private String djrnam;

    private String glks;

    private String yhry;

    private String memo;

    private String qtsjTypeOther;

    public String getQtsjSeq() {
        return qtsjSeq;
    }

    public void setQtsjSeq(String qtsjSeq) {
        this.qtsjSeq = qtsjSeq == null ? null : qtsjSeq.trim();
    }

    public String getQtsjNam() {
        return qtsjNam;
    }

    public void setQtsjNam(String qtsjNam) {
        this.qtsjNam = qtsjNam == null ? null : qtsjNam.trim();
    }

    public Date getQtsjDat() {
        return qtsjDat;
    }

    public void setQtsjDat(Date qtsjDat) {
        this.qtsjDat = qtsjDat;
    }

    public String getQtsjType() {
        return qtsjType;
    }

    public void setQtsjType(String qtsjType) {
        this.qtsjType = qtsjType == null ? null : qtsjType.trim();
    }

    public String getAdrr() {
        return adrr;
    }

    public void setAdrr(String adrr) {
        this.adrr = adrr == null ? null : adrr.trim();
    }

    public String getJyjg() {
        return jyjg;
    }

    public void setJyjg(String jyjg) {
        this.jyjg = jyjg == null ? null : jyjg.trim();
    }

    public String getQjgc() {
        return qjgc;
    }

    public void setQjgc(String qjgc) {
        this.qjgc = qjgc == null ? null : qjgc.trim();
    }

    public String getQjxj() {
        return qjxj;
    }

    public void setQjxj(String qjxj) {
        this.qjxj = qjxj == null ? null : qjxj.trim();
    }

    public String getBgbm() {
        return bgbm;
    }

    public void setBgbm(String bgbm) {
        this.bgbm = bgbm == null ? null : bgbm.trim();
    }

    public String getBgrnam() {
        return bgrnam;
    }

    public void setBgrnam(String bgrnam) {
        this.bgrnam = bgrnam == null ? null : bgrnam.trim();
    }

    public Date getDjdat() {
        return djdat;
    }

    public void setDjdat(Date djdat) {
        this.djdat = djdat;
    }

    public String getDjrnam() {
        return djrnam;
    }

    public void setDjrnam(String djrnam) {
        this.djrnam = djrnam == null ? null : djrnam.trim();
    }

    public String getGlks() {
        return glks;
    }

    public void setGlks(String glks) {
        this.glks = glks == null ? null : glks.trim();
    }

    public String getYhry() {
        return yhry;
    }

    public void setYhry(String yhry) {
        this.yhry = yhry == null ? null : yhry.trim();
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo == null ? null : memo.trim();
    }

    public String getQtsjTypeOther() {
        return qtsjTypeOther;
    }

    public void setQtsjTypeOther(String qtsjTypeOther) {
        this.qtsjTypeOther = qtsjTypeOther == null ? null : qtsjTypeOther.trim();
    }
}