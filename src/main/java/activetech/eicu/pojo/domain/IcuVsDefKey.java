package activetech.eicu.pojo.domain;

public class IcuVsDefKey {
    private String vsType;

    private String vsCode;

    public String getVsType() {
        return vsType;
    }

    public void setVsType(String vsType) {
        this.vsType = vsType == null ? null : vsType.trim();
    }

    public String getVsCode() {
        return vsCode;
    }

    public void setVsCode(String vsCode) {
        this.vsCode = vsCode == null ? null : vsCode.trim();
    }
}