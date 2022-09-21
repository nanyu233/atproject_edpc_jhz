package activetech.zyyhospital.pojo.domain;

public class HspXlshpgInf {
    private String xtpgSeq;

    private String emgSeq;

    private String xlshpgJsztCod;

    private String xlshpgJsztQt;

    private String xlshpgMemo;

    public String getXtpgSeq() {
        return xtpgSeq;
    }

    public void setXtpgSeq(String xtpgSeq) {
        this.xtpgSeq = xtpgSeq == null ? null : xtpgSeq.trim();
    }

    public String getEmgSeq() {
        return emgSeq;
    }

    public void setEmgSeq(String emgSeq) {
        this.emgSeq = emgSeq == null ? null : emgSeq.trim();
    }

    public String getXlshpgJsztCod() {
        return xlshpgJsztCod;
    }

    public void setXlshpgJsztCod(String xlshpgJsztCod) {
        this.xlshpgJsztCod = xlshpgJsztCod == null ? null : xlshpgJsztCod.trim();
    }

    public String getXlshpgJsztQt() {
        return xlshpgJsztQt;
    }

    public void setXlshpgJsztQt(String xlshpgJsztQt) {
        this.xlshpgJsztQt = xlshpgJsztQt == null ? null : xlshpgJsztQt.trim();
    }

    public String getXlshpgMemo() {
        return xlshpgMemo;
    }

    public void setXlshpgMemo(String xlshpgMemo) {
        this.xlshpgMemo = xlshpgMemo == null ? null : xlshpgMemo.trim();
    }
}