package activetech.zyyhospital.pojo.domain;

import java.util.Date;

public class HspBasyCzjs {
    /**
     * 主键
     */
    private String czjsSeq;

    /**
     * 病案首页主键
     */
    private String basySeq;

    /**
     * 操作技术INFOCODE
     */
    private String infocode;

    /**
     * 医生编号
     */
    private String docNo;

    /**
     * 医生姓名
     */
    private String docNam;

    /**
     * 创建时间
     */
    private Date crtDat;

    /**
     * 创建人编号
     */
    private String crtUsrNo;

    /**
     * 创建人编号
     */
    private String crtUsrNam;

    /**
     * 修改时间
     */
    private Date updDat;

    /**
     * 修改人编号
     */
    private String updUsrNo;

    /**
     * 修改人姓名
     */
    private String updUsrNam;

    public String getCzjsSeq() {
        return czjsSeq;
    }

    public void setCzjsSeq(String czjsSeq) {
        this.czjsSeq = czjsSeq == null ? null : czjsSeq.trim();
    }

    public String getBasySeq() {
        return basySeq;
    }

    public void setBasySeq(String basySeq) {
        this.basySeq = basySeq == null ? null : basySeq.trim();
    }

    public String getInfocode() {
        return infocode;
    }

    public void setInfocode(String infocode) {
        this.infocode = infocode == null ? null : infocode.trim();
    }

    public String getDocNo() {
        return docNo;
    }

    public void setDocNo(String docNo) {
        this.docNo = docNo == null ? null : docNo.trim();
    }

    public String getDocNam() {
        return docNam;
    }

    public void setDocNam(String docNam) {
        this.docNam = docNam == null ? null : docNam.trim();
    }

    public Date getCrtDat() {
        return crtDat;
    }

    public void setCrtDat(Date crtDat) {
        this.crtDat = crtDat;
    }

    public String getCrtUsrNo() {
        return crtUsrNo;
    }

    public void setCrtUsrNo(String crtUsrNo) {
        this.crtUsrNo = crtUsrNo == null ? null : crtUsrNo.trim();
    }

    public String getCrtUsrNam() {
        return crtUsrNam;
    }

    public void setCrtUsrNam(String crtUsrNam) {
        this.crtUsrNam = crtUsrNam == null ? null : crtUsrNam.trim();
    }

    public Date getUpdDat() {
        return updDat;
    }

    public void setUpdDat(Date updDat) {
        this.updDat = updDat;
    }

    public String getUpdUsrNo() {
        return updUsrNo;
    }

    public void setUpdUsrNo(String updUsrNo) {
        this.updUsrNo = updUsrNo == null ? null : updUsrNo.trim();
    }

    public String getUpdUsrNam() {
        return updUsrNam;
    }

    public void setUpdUsrNam(String updUsrNam) {
        this.updUsrNam = updUsrNam == null ? null : updUsrNam.trim();
    }
}