package activetech.eicu.pojo.domain;

public class Dstparameter extends DstparameterKey {
    private String parname;

    private String parmemo;

    private String parvalue2;

    private String parvalue3;

    private String parvalue4;

    private String parvalue5;

    public String getParname() {
        return parname;
    }

    public void setParname(String parname) {
        this.parname = parname == null ? null : parname.trim();
    }

    public String getParmemo() {
        return parmemo;
    }

    public void setParmemo(String parmemo) {
        this.parmemo = parmemo == null ? null : parmemo.trim();
    }

    public String getParvalue2() {
        return parvalue2;
    }

    public void setParvalue2(String parvalue2) {
        this.parvalue2 = parvalue2 == null ? null : parvalue2.trim();
    }

    public String getParvalue3() {
        return parvalue3;
    }

    public void setParvalue3(String parvalue3) {
        this.parvalue3 = parvalue3 == null ? null : parvalue3.trim();
    }

    public String getParvalue4() {
        return parvalue4;
    }

    public void setParvalue4(String parvalue4) {
        this.parvalue4 = parvalue4 == null ? null : parvalue4.trim();
    }

    public String getParvalue5() {
        return parvalue5;
    }

    public void setParvalue5(String parvalue5) {
        this.parvalue5 = parvalue5 == null ? null : parvalue5.trim();
    }
}