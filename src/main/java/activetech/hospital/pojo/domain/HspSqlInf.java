package activetech.hospital.pojo.domain;

import java.util.Date;

public class HspSqlInf {
    private String sqlSeq;

    private String emgSeq;

    private Date regDat;

    private Date sqlDat;

    private String sqlStaCod;

    private String sqlDepCod;

    private String sqlDctNbr;

    private String sqlDctNam;

    private String sqlNurNbr;

    private String sqlNurNam;

    private String sqlDes;

    public String getSqlSeq() {
        return sqlSeq;
    }

    public void setSqlSeq(String sqlSeq) {
        this.sqlSeq = sqlSeq == null ? null : sqlSeq.trim();
    }

    public String getEmgSeq() {
        return emgSeq;
    }

    public void setEmgSeq(String emgSeq) {
        this.emgSeq = emgSeq == null ? null : emgSeq.trim();
    }

    public Date getRegDat() {
        return regDat;
    }

    public void setRegDat(Date regDat) {
        this.regDat = regDat;
    }

    public Date getSqlDat() {
        return sqlDat;
    }

    public void setSqlDat(Date sqlDat) {
        this.sqlDat = sqlDat;
    }

    public String getSqlStaCod() {
        return sqlStaCod;
    }

    public void setSqlStaCod(String sqlStaCod) {
        this.sqlStaCod = sqlStaCod == null ? null : sqlStaCod.trim();
    }

    public String getSqlDepCod() {
        return sqlDepCod;
    }

    public void setSqlDepCod(String sqlDepCod) {
        this.sqlDepCod = sqlDepCod == null ? null : sqlDepCod.trim();
    }

    public String getSqlDctNbr() {
        return sqlDctNbr;
    }

    public void setSqlDctNbr(String sqlDctNbr) {
        this.sqlDctNbr = sqlDctNbr == null ? null : sqlDctNbr.trim();
    }

    public String getSqlDctNam() {
        return sqlDctNam;
    }

    public void setSqlDctNam(String sqlDctNam) {
        this.sqlDctNam = sqlDctNam == null ? null : sqlDctNam.trim();
    }

    public String getSqlNurNbr() {
        return sqlNurNbr;
    }

    public void setSqlNurNbr(String sqlNurNbr) {
        this.sqlNurNbr = sqlNurNbr == null ? null : sqlNurNbr.trim();
    }

    public String getSqlNurNam() {
        return sqlNurNam;
    }

    public void setSqlNurNam(String sqlNurNam) {
        this.sqlNurNam = sqlNurNam == null ? null : sqlNurNam.trim();
    }

    public String getSqlDes() {
        return sqlDes;
    }

    public void setSqlDes(String sqlDes) {
        this.sqlDes = sqlDes == null ? null : sqlDes.trim();
    }
}