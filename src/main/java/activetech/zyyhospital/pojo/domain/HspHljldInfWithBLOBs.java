package activetech.zyyhospital.pojo.domain;

public class HspHljldInfWithBLOBs extends HspHljldInf {
    private String bqgc;

    private String bqgcHex;

    public String getBqgc() {
        return bqgc;
    }

    public void setBqgc(String bqgc) {
        this.bqgc = bqgc == null ? null : bqgc.trim();
    }

    public String getBqgcHex() {
        return bqgcHex;
    }

    public void setBqgcHex(String bqgcHex) {
        this.bqgcHex = bqgcHex == null ? null : bqgcHex.trim();
    }
}