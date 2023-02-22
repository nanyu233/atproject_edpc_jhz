package activetech.aid.pojo.domain;

import java.util.Date;

public class AidApk {
    private String apkSeq;

    private String apkId;

    private String apkVer;

    private String apkDir;

    private String apkDes;

    private String apkNewFlg;

    private Date crtTim;

    private String crtUsr;

    public String getApkSeq() {
        return apkSeq;
    }

    public void setApkSeq(String apkSeq) {
        this.apkSeq = apkSeq == null ? null : apkSeq.trim();
    }

    public String getApkId() {
        return apkId;
    }

    public void setApkId(String apkId) {
        this.apkId = apkId == null ? null : apkId.trim();
    }

    public String getApkVer() {
        return apkVer;
    }

    public void setApkVer(String apkVer) {
        this.apkVer = apkVer == null ? null : apkVer.trim();
    }

    public String getApkDir() {
        return apkDir;
    }

    public void setApkDir(String apkDir) {
        this.apkDir = apkDir == null ? null : apkDir.trim();
    }

    public String getApkDes() {
        return apkDes;
    }

    public void setApkDes(String apkDes) {
        this.apkDes = apkDes == null ? null : apkDes.trim();
    }

    public String getApkNewFlg() {
        return apkNewFlg;
    }

    public void setApkNewFlg(String apkNewFlg) {
        this.apkNewFlg = apkNewFlg == null ? null : apkNewFlg.trim();
    }

    public Date getCrtTim() {
        return crtTim;
    }

    public void setCrtTim(Date crtTim) {
        this.crtTim = crtTim;
    }

    public String getCrtUsr() {
        return crtUsr;
    }

    public void setCrtUsr(String crtUsr) {
        this.crtUsr = crtUsr == null ? null : crtUsr.trim();
    }
}