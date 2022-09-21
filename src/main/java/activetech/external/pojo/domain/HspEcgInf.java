package activetech.external.pojo.domain;

import java.util.Date;

public class HspEcgInf {
    private String ecgSeq;

    private String refId;

    private String ecgType;

    private String fileName;

    private Date fileDate;

    private Date fileTrsDate;

    private Date fileDiaDate;

    private String filePath;

    private String fileType;

    private String appNo;

    private String mpiNo;

    private Integer sadId;

    private Date crtDate;

    private String crtUser;

    private byte[] fileCon;

    public String getEcgSeq() {
        return ecgSeq;
    }

    public void setEcgSeq(String ecgSeq) {
        this.ecgSeq = ecgSeq == null ? null : ecgSeq.trim();
    }

    public String getRefId() {
        return refId;
    }

    public void setRefId(String refId) {
        this.refId = refId == null ? null : refId.trim();
    }

    public String getEcgType() {
        return ecgType;
    }

    public void setEcgType(String ecgType) {
        this.ecgType = ecgType == null ? null : ecgType.trim();
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName == null ? null : fileName.trim();
    }

    public Date getFileDate() {
        return fileDate;
    }

    public void setFileDate(Date fileDate) {
        this.fileDate = fileDate;
    }

    public Date getFileTrsDate() {
        return fileTrsDate;
    }

    public void setFileTrsDate(Date fileTrsDate) {
        this.fileTrsDate = fileTrsDate;
    }

    public Date getFileDiaDate() {
        return fileDiaDate;
    }

    public void setFileDiaDate(Date fileDiaDate) {
        this.fileDiaDate = fileDiaDate;
    }

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath == null ? null : filePath.trim();
    }

    public String getFileType() {
        return fileType;
    }

    public void setFileType(String fileType) {
        this.fileType = fileType == null ? null : fileType.trim();
    }

    public String getAppNo() {
        return appNo;
    }

    public void setAppNo(String appNo) {
        this.appNo = appNo == null ? null : appNo.trim();
    }

    public String getMpiNo() {
        return mpiNo;
    }

    public void setMpiNo(String mpiNo) {
        this.mpiNo = mpiNo == null ? null : mpiNo.trim();
    }

    public Integer getSadId() {
        return sadId;
    }

    public void setSadId(Integer sadId) {
        this.sadId = sadId;
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

    public byte[] getFileCon() {
        return fileCon;
    }

    public void setFileCon(byte[] fileCon) {
        this.fileCon = fileCon;
    }
}