package activetech.rfid.pojo.domain;

import java.io.Serializable;
import java.util.Date;

/**
 * HSP_UHF_TRP
 * @author 
 */
public class HspUhfTrp implements Serializable {

    //标签序号
    private String trpSeq;

    //标签编号
    private String trpId;

    //标签名称
    private String trpNam;

    //标签类型    1:胸痛 2：卒中 3：创伤
    private String trpTyp;

    //标签分类    1:抗人体硅胶无源手环 2：纸质抗菌腕带
    private String trpCls;

    //类型图片
    private String typPic;

    //设备状态    1：使用，0：未使用
    private String trpSta;

    //是否绑定    0：未绑定，1：已绑定
    private String bidFlg;

    //绑定用户
    private String bidMan;

    //绑定时间
    private Date bidTim;

    //绑定患者
    private String bidPat;

    //患者名称
    private String patNam;

    //解绑用户
    private String unbMan;

    //解绑时间
    private Date unbTim;

    //创建用户编号
    private String crtUsrNo;

    //创建用户名称
    private String crtUsrNam;

    //创建时间
    private Date crtTim;

    //修改用户编号
    private String modUsrNo;

    //修改用户名称
    private String modUsrNam;

    //修改时间
    private Date modTim;

    private static final long serialVersionUID = 1L;

    public String getTrpSeq() {
        return trpSeq;
    }

    public void setTrpSeq(String trpSeq) {
        this.trpSeq = trpSeq;
    }

    public String getTrpId() {
        return trpId;
    }

    public void setTrpId(String trpId) {
        this.trpId = trpId;
    }

    public String getTrpNam() {
        return trpNam;
    }

    public void setTrpNam(String trpNam) {
        this.trpNam = trpNam;
    }

    public String getTrpTyp() {
        return trpTyp;
    }

    public void setTrpTyp(String trpTyp) {
        this.trpTyp = trpTyp;
    }

    public String getTrpCls() {
        return trpCls;
    }

    public void setTrpCls(String trpCls) {
        this.trpCls = trpCls;
    }

    public String getTypPic() {
        return typPic;
    }

    public void setTypPic(String typPic) {
        this.typPic = typPic;
    }

    public String getTrpSta() {
        return trpSta;
    }

    public void setTrpSta(String trpSta) {
        this.trpSta = trpSta;
    }

    public String getBidFlg() {
        return bidFlg;
    }

    public void setBidFlg(String bidFlg) {
        this.bidFlg = bidFlg;
    }

    public String getBidMan() {
        return bidMan;
    }

    public void setBidMan(String bidMan) {
        this.bidMan = bidMan;
    }

    public Date getBidTim() {
        return bidTim;
    }

    public void setBidTim(Date bidTim) {
        this.bidTim = bidTim;
    }

    public String getBidPat() {
        return bidPat;
    }

    public void setBidPat(String bidPat) {
        this.bidPat = bidPat;
    }

    public String getPatNam() {
        return patNam;
    }

    public void setPatNam(String patNam) {
        this.patNam = patNam;
    }

    public String getUnbMan() {
        return unbMan;
    }

    public void setUnbMan(String unbMan) {
        this.unbMan = unbMan;
    }

    public Date getUnbTim() {
        return unbTim;
    }

    public void setUnbTim(Date unbTim) {
        this.unbTim = unbTim;
    }

    public String getCrtUsrNo() {
        return crtUsrNo;
    }

    public void setCrtUsrNo(String crtUsrNo) {
        this.crtUsrNo = crtUsrNo;
    }

    public String getCrtUsrNam() {
        return crtUsrNam;
    }

    public void setCrtUsrNam(String crtUsrNam) {
        this.crtUsrNam = crtUsrNam;
    }

    public Date getCrtTim() {
        return crtTim;
    }

    public void setCrtTim(Date crtTim) {
        this.crtTim = crtTim;
    }

    public String getModUsrNo() {
        return modUsrNo;
    }

    public void setModUsrNo(String modUsrNo) {
        this.modUsrNo = modUsrNo;
    }

    public String getModUsrNam() {
        return modUsrNam;
    }

    public void setModUsrNam(String modUsrNam) {
        this.modUsrNam = modUsrNam;
    }

    public Date getModTim() {
        return modTim;
    }

    public void setModTim(Date modTim) {
        this.modTim = modTim;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        HspUhfTrp other = (HspUhfTrp) that;
        return (this.getTrpSeq() == null ? other.getTrpSeq() == null : this.getTrpSeq().equals(other.getTrpSeq()))
            && (this.getTrpId() == null ? other.getTrpId() == null : this.getTrpId().equals(other.getTrpId()))
            && (this.getTrpNam() == null ? other.getTrpNam() == null : this.getTrpNam().equals(other.getTrpNam()))
            && (this.getTrpTyp() == null ? other.getTrpTyp() == null : this.getTrpTyp().equals(other.getTrpTyp()))
            && (this.getTrpCls() == null ? other.getTrpCls() == null : this.getTrpCls().equals(other.getTrpCls()))
            && (this.getTypPic() == null ? other.getTypPic() == null : this.getTypPic().equals(other.getTypPic()))
            && (this.getTrpSta() == null ? other.getTrpSta() == null : this.getTrpSta().equals(other.getTrpSta()))
            && (this.getBidFlg() == null ? other.getBidFlg() == null : this.getBidFlg().equals(other.getBidFlg()))
            && (this.getBidMan() == null ? other.getBidMan() == null : this.getBidMan().equals(other.getBidMan()))
            && (this.getBidTim() == null ? other.getBidTim() == null : this.getBidTim().equals(other.getBidTim()))
            && (this.getBidPat() == null ? other.getBidPat() == null : this.getBidPat().equals(other.getBidPat()))
            && (this.getPatNam() == null ? other.getPatNam() == null : this.getPatNam().equals(other.getPatNam()))
            && (this.getUnbMan() == null ? other.getUnbMan() == null : this.getUnbMan().equals(other.getUnbMan()))
            && (this.getUnbTim() == null ? other.getUnbTim() == null : this.getUnbTim().equals(other.getUnbTim()))
            && (this.getCrtUsrNo() == null ? other.getCrtUsrNo() == null : this.getCrtUsrNo().equals(other.getCrtUsrNo()))
            && (this.getCrtUsrNam() == null ? other.getCrtUsrNam() == null : this.getCrtUsrNam().equals(other.getCrtUsrNam()))
            && (this.getCrtTim() == null ? other.getCrtTim() == null : this.getCrtTim().equals(other.getCrtTim()))
            && (this.getModUsrNo() == null ? other.getModUsrNo() == null : this.getModUsrNo().equals(other.getModUsrNo()))
            && (this.getModUsrNam() == null ? other.getModUsrNam() == null : this.getModUsrNam().equals(other.getModUsrNam()))
            && (this.getModTim() == null ? other.getModTim() == null : this.getModTim().equals(other.getModTim()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getTrpSeq() == null) ? 0 : getTrpSeq().hashCode());
        result = prime * result + ((getTrpId() == null) ? 0 : getTrpId().hashCode());
        result = prime * result + ((getTrpNam() == null) ? 0 : getTrpNam().hashCode());
        result = prime * result + ((getTrpTyp() == null) ? 0 : getTrpTyp().hashCode());
        result = prime * result + ((getTrpCls() == null) ? 0 : getTrpCls().hashCode());
        result = prime * result + ((getTypPic() == null) ? 0 : getTypPic().hashCode());
        result = prime * result + ((getTrpSta() == null) ? 0 : getTrpSta().hashCode());
        result = prime * result + ((getBidFlg() == null) ? 0 : getBidFlg().hashCode());
        result = prime * result + ((getBidMan() == null) ? 0 : getBidMan().hashCode());
        result = prime * result + ((getBidTim() == null) ? 0 : getBidTim().hashCode());
        result = prime * result + ((getBidPat() == null) ? 0 : getBidPat().hashCode());
        result = prime * result + ((getPatNam() == null) ? 0 : getPatNam().hashCode());
        result = prime * result + ((getUnbMan() == null) ? 0 : getUnbMan().hashCode());
        result = prime * result + ((getUnbTim() == null) ? 0 : getUnbTim().hashCode());
        result = prime * result + ((getCrtUsrNo() == null) ? 0 : getCrtUsrNo().hashCode());
        result = prime * result + ((getCrtUsrNam() == null) ? 0 : getCrtUsrNam().hashCode());
        result = prime * result + ((getCrtTim() == null) ? 0 : getCrtTim().hashCode());
        result = prime * result + ((getModUsrNo() == null) ? 0 : getModUsrNo().hashCode());
        result = prime * result + ((getModUsrNam() == null) ? 0 : getModUsrNam().hashCode());
        result = prime * result + ((getModTim() == null) ? 0 : getModTim().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", trpSeq=").append(trpSeq);
        sb.append(", trpId=").append(trpId);
        sb.append(", trpNam=").append(trpNam);
        sb.append(", trpTyp=").append(trpTyp);
        sb.append(", trpCls=").append(trpCls);
        sb.append(", typPic=").append(typPic);
        sb.append(", trpSta=").append(trpSta);
        sb.append(", bidFlg=").append(bidFlg);
        sb.append(", bidMan=").append(bidMan);
        sb.append(", bidTim=").append(bidTim);
        sb.append(", bidPat=").append(bidPat);
        sb.append(", patNam=").append(patNam);
        sb.append(", unbMan=").append(unbMan);
        sb.append(", mntCom=").append(unbTim);
        sb.append(", crtUsrNo=").append(crtUsrNo);
        sb.append(", crtUsrNam=").append(crtUsrNam);
        sb.append(", crtTim=").append(crtTim);
        sb.append(", modUsrNo=").append(modUsrNo);
        sb.append(", modUsrNam=").append(modUsrNam);
        sb.append(", modTim=").append(modTim);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}