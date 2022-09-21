package activetech.eicu.pojo.domain;

public class DstparameterKey {
    private String partype;

    private String parcode;

    private String parvalue1;

    public String getPartype() {
        return partype;
    }

    public void setPartype(String partype) {
        this.partype = partype == null ? null : partype.trim();
    }

    public String getParcode() {
        return parcode;
    }

    public void setParcode(String parcode) {
        this.parcode = parcode == null ? null : parcode.trim();
    }

    public String getParvalue1() {
        return parvalue1;
    }

    public void setParvalue1(String parvalue1) {
        this.parvalue1 = parvalue1 == null ? null : parvalue1.trim();
    }
}