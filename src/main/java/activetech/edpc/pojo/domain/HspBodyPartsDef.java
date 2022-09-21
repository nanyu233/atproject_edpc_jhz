package activetech.edpc.pojo.domain;

import java.math.BigDecimal;

public class HspBodyPartsDef {
    private String partId;

    private String partName;

    private BigDecimal originAxisX;

    private BigDecimal originAxisY;

    private BigDecimal radius;

    public String getPartId() {
        return partId;
    }

    public void setPartId(String partId) {
        this.partId = partId == null ? null : partId.trim();
    }

    public String getPartName() {
        return partName;
    }

    public void setPartName(String partName) {
        this.partName = partName == null ? null : partName.trim();
    }

    public BigDecimal getOriginAxisX() {
        return originAxisX;
    }

    public void setOriginAxisX(BigDecimal originAxisX) {
        this.originAxisX = originAxisX;
    }

    public BigDecimal getOriginAxisY() {
        return originAxisY;
    }

    public void setOriginAxisY(BigDecimal originAxisY) {
        this.originAxisY = originAxisY;
    }

    public BigDecimal getRadius() {
        return radius;
    }

    public void setRadius(BigDecimal radius) {
        this.radius = radius;
    }
}