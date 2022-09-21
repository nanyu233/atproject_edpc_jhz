package activetech.zyyhospital.pojo.domain;

public class HspDgpgclrInf {
    private String xtpgSeq;

    private String ylgDgmcCod;

    private String dgpgclrDgsd;

    private String dgpgclrTc;

    private String dgpgclrYlyys;

    private String dgpgclrType;

    public String getXtpgSeq() {
        return xtpgSeq;
    }

    public void setXtpgSeq(String xtpgSeq) {
        this.xtpgSeq = xtpgSeq == null ? null : xtpgSeq.trim();
    }

    public String getYlgDgmcCod() {
        return ylgDgmcCod;
    }

    public void setYlgDgmcCod(String ylgDgmcCod) {
        this.ylgDgmcCod = ylgDgmcCod == null ? null : ylgDgmcCod.trim();
    }

    public String getDgpgclrDgsd() {
        return dgpgclrDgsd;
    }

    public void setDgpgclrDgsd(String dgpgclrDgsd) {
        this.dgpgclrDgsd = dgpgclrDgsd == null ? null : dgpgclrDgsd.trim();
    }

    public String getDgpgclrTc() {
        return dgpgclrTc;
    }

    public void setDgpgclrTc(String dgpgclrTc) {
        this.dgpgclrTc = dgpgclrTc == null ? null : dgpgclrTc.trim();
    }

    public String getDgpgclrYlyys() {
        return dgpgclrYlyys;
    }

    public void setDgpgclrYlyys(String dgpgclrYlyys) {
        this.dgpgclrYlyys = dgpgclrYlyys == null ? null : dgpgclrYlyys.trim();
    }

    public String getDgpgclrType() {
        return dgpgclrType;
    }

    public void setDgpgclrType(String dgpgclrType) {
        this.dgpgclrType = dgpgclrType == null ? null : dgpgclrType.trim();
    }
}