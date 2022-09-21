package activetech.zyyhospital.pojo.domain;

import java.math.BigDecimal;

public class HspModelInf {
    private String modelSeq;

    private String modelNam;

    private BigDecimal modelSort;

    private String modelContent;

    public String getModelSeq() {
        return modelSeq;
    }

    public void setModelSeq(String modelSeq) {
        this.modelSeq = modelSeq == null ? null : modelSeq.trim();
    }

    public String getModelNam() {
        return modelNam;
    }

    public void setModelNam(String modelNam) {
        this.modelNam = modelNam == null ? null : modelNam.trim();
    }

    public BigDecimal getModelSort() {
        return modelSort;
    }

    public void setModelSort(BigDecimal modelSort) {
        this.modelSort = modelSort;
    }

    public String getModelContent() {
        return modelContent;
    }

    public void setModelContent(String modelContent) {
        this.modelContent = modelContent == null ? null : modelContent.trim();
    }
}