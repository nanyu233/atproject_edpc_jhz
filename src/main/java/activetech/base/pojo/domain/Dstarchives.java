package activetech.base.pojo.domain;

import java.math.BigDecimal;
import java.util.Date;

public class Dstarchives {
    private String fileSeq;

    private String refId;

    private String fileName;

    private Date crtDate;

    private String crtUser;

    private String fileType;

    private BigDecimal voiceSec;

    private String valids;

    public String getFileSeq() {
        return fileSeq;
    }

    public void setFileSeq(String fileSeq) {
        this.fileSeq = fileSeq == null ? null : fileSeq.trim();
    }

    public String getRefId() {
        return refId;
    }

    public void setRefId(String refId) {
        this.refId = refId == null ? null : refId.trim();
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName == null ? null : fileName.trim();
    }

    public Date getCrtDate() {
        return crtDate;
    }

    public void setCrtDate(Date crtDate) {
        this.crtDate = crtDate;
    }

    public String getCrtUser() {
        return crtUser;
    }

    public void setCrtUser(String crtUser) {
        this.crtUser = crtUser == null ? null : crtUser.trim();
    }

    public String getFileType() {
        return fileType;
    }

    public void setFileType(String fileType) {
        this.fileType = fileType == null ? null : fileType.trim();
    }

    public BigDecimal getVoiceSec() {
        return voiceSec;
    }

    public void setVoiceSec(BigDecimal voiceSec) {
        this.voiceSec = voiceSec;
    }

    public String getValids() {
        return valids;
    }

    public void setValids(String valids) {
        this.valids = valids == null ? null : valids.trim();
    }
}