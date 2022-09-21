package activetech.rfid.pojo.domain;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.io.Serializable;
import java.util.Date;

/**
 * HSP_UHF_RDR
 * @author 
 */
public class HspUhfRdr implements Serializable {

    //设备序号
    private String rdrSeq;

    //设备编号
    private String rdrId;

    //设备名称
    private String rdrNam;

    //设备类型    1:读写一体机2：读写器
    private String rdrTyp;

    //监测点类型
    private String mtrTyp;

    //监测点参考码
    private String mtrCod;

    //设备位置    例如：分诊台
    private String rdrLoc;

    //设备状态    0：使用，0：未使用
    private String rdrSta;

    //设备参数
    private String rdrPar;

    //使用科室
    private String rdrDep;

    //使用科室名称, 用户列表展示
    private String rdrDepNam;

    //购置日期
    @JsonFormat(pattern="yyyy/MM/dd",timezone = "GMT+8")
    private Date buyDat;

    //安装日期
    @JsonFormat(pattern="yyyy/MM/dd",timezone = "GMT+8")
    private Date fixDat;

    //安装人员
    private String fixMan;

    //运维公司
    private String mntCom;

    //运维人员
    private String mntMan;

    //运维电话
    private String mntTel;

    //是否有线网   0:否 1：是
    private String tcpFlg;

    //是否无线网  0:否 1：是
    private String wifFlg;

    //ip地址
    private String rdrIp;

    //ip端口
    private Integer rdrPort;

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

    public String getRdrSeq() {
        return rdrSeq;
    }

    public void setRdrSeq(String rdrSeq) {
        this.rdrSeq = rdrSeq;
    }

    public String getRdrId() {
        return rdrId;
    }

    public void setRdrId(String rdrId) {
        this.rdrId = rdrId;
    }

    public String getRdrNam() {
        return rdrNam;
    }

    public void setRdrNam(String rdrNam) {
        this.rdrNam = rdrNam;
    }

    public String getRdrTyp() {
        return rdrTyp;
    }

    public void setRdrTyp(String rdrTyp) {
        this.rdrTyp = rdrTyp;
    }

    public String getMtrTyp() {
        return mtrTyp;
    }

    public void setMtrTyp(String mtrTyp) {
        this.mtrTyp = mtrTyp;
    }

    public String getMtrCod() {
        return mtrCod;
    }

    public void setMtrCod(String mtrCod) {
        this.mtrCod = mtrCod;
    }

    public String getRdrLoc() {
        return rdrLoc;
    }

    public void setRdrLoc(String rdrLoc) {
        this.rdrLoc = rdrLoc;
    }

    public String getRdrSta() {
        return rdrSta;
    }

    public void setRdrSta(String rdrSta) {
        this.rdrSta = rdrSta;
    }

    public String getRdrPar() {
        return rdrPar;
    }

    public void setRdrPar(String rdrPar) {
        this.rdrPar = rdrPar;
    }

    public String getRdrDep() {
        return rdrDep;
    }

    public void setRdrDep(String rdrDep) {
        this.rdrDep = rdrDep;
    }

    public String getRdrDepNam() {
        return rdrDepNam;
    }

    public void setRdrDepNam(String rdrDepNam) {
        this.rdrDepNam = rdrDepNam;
    }

    public Date getBuyDat() {
        return buyDat;
    }

    public void setBuyDat(Date buyDat) {
        this.buyDat = buyDat;
    }

    public Date getFixDat() {
        return fixDat;
    }

    public void setFixDat(Date fixDat) {
        this.fixDat = fixDat;
    }

    public String getFixMan() {
        return fixMan;
    }

    public void setFixMan(String fixMan) {
        this.fixMan = fixMan;
    }

    public String getMntCom() {
        return mntCom;
    }

    public void setMntCom(String mntCom) {
        this.mntCom = mntCom;
    }

    public String getMntMan() {
        return mntMan;
    }

    public void setMntMan(String mntMan) {
        this.mntMan = mntMan;
    }

    public String getMntTel() {
        return mntTel;
    }

    public void setMntTel(String mntTel) {
        this.mntTel = mntTel;
    }

    public String getTcpFlg() {
        return tcpFlg;
    }

    public void setTcpFlg(String tcpFlg) {
        this.tcpFlg = tcpFlg;
    }

    public String getWifFlg() {
        return wifFlg;
    }

    public void setWifFlg(String wifFlg) {
        this.wifFlg = wifFlg;
    }

    public String getRdrIp() {
        return rdrIp;
    }

    public void setRdrIp(String rdrIp) {
        this.rdrIp = rdrIp;
    }

    public Integer getRdrPort() {
        return rdrPort;
    }

    public void setRdrPort(Integer rdrPort) {
        this.rdrPort = rdrPort;
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
        HspUhfRdr other = (HspUhfRdr) that;
        return (this.getRdrSeq() == null ? other.getRdrSeq() == null : this.getRdrSeq().equals(other.getRdrSeq()))
            && (this.getRdrId() == null ? other.getRdrId() == null : this.getRdrId().equals(other.getRdrId()))
            && (this.getRdrNam() == null ? other.getRdrNam() == null : this.getRdrNam().equals(other.getRdrNam()))
            && (this.getRdrTyp() == null ? other.getRdrTyp() == null : this.getRdrTyp().equals(other.getRdrTyp()))
            && (this.getMtrTyp() == null ? other.getMtrTyp() == null : this.getMtrTyp().equals(other.getMtrTyp()))
            && (this.getMtrCod() == null ? other.getMtrCod() == null : this.getMtrCod().equals(other.getMtrCod()))
            && (this.getRdrLoc() == null ? other.getRdrLoc() == null : this.getRdrLoc().equals(other.getRdrLoc()))
            && (this.getRdrSta() == null ? other.getRdrSta() == null : this.getRdrSta().equals(other.getRdrSta()))
            && (this.getRdrPar() == null ? other.getRdrPar() == null : this.getRdrPar().equals(other.getRdrPar()))
            && (this.getRdrDep() == null ? other.getRdrDep() == null : this.getRdrDep().equals(other.getRdrDep()))
            && (this.getBuyDat() == null ? other.getBuyDat() == null : this.getBuyDat().equals(other.getBuyDat()))
            && (this.getFixDat() == null ? other.getFixDat() == null : this.getFixDat().equals(other.getFixDat()))
            && (this.getFixMan() == null ? other.getFixMan() == null : this.getFixMan().equals(other.getFixMan()))
            && (this.getMntCom() == null ? other.getMntCom() == null : this.getMntCom().equals(other.getMntCom()))
            && (this.getMntMan() == null ? other.getMntMan() == null : this.getMntMan().equals(other.getMntMan()))
            && (this.getMntTel() == null ? other.getMntTel() == null : this.getMntTel().equals(other.getMntTel()))
            && (this.getTcpFlg() == null ? other.getTcpFlg() == null : this.getTcpFlg().equals(other.getTcpFlg()))
            && (this.getWifFlg() == null ? other.getWifFlg() == null : this.getWifFlg().equals(other.getWifFlg()))
            && (this.getRdrIp() == null ? other.getRdrIp() == null : this.getRdrIp().equals(other.getRdrIp()))
            && (this.getRdrPort() == null ? other.getRdrPort() == null : this.getRdrPort().equals(other.getRdrPort()))
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
        result = prime * result + ((getRdrSeq() == null) ? 0 : getRdrSeq().hashCode());
        result = prime * result + ((getRdrId() == null) ? 0 : getRdrId().hashCode());
        result = prime * result + ((getRdrNam() == null) ? 0 : getRdrNam().hashCode());
        result = prime * result + ((getRdrTyp() == null) ? 0 : getRdrTyp().hashCode());
        result = prime * result + ((getMtrTyp() == null) ? 0 : getMtrTyp().hashCode());
        result = prime * result + ((getMtrCod() == null) ? 0 : getMtrCod().hashCode());
        result = prime * result + ((getRdrLoc() == null) ? 0 : getRdrLoc().hashCode());
        result = prime * result + ((getRdrSta() == null) ? 0 : getRdrSta().hashCode());
        result = prime * result + ((getRdrPar() == null) ? 0 : getRdrPar().hashCode());
        result = prime * result + ((getRdrDep() == null) ? 0 : getRdrDep().hashCode());
        result = prime * result + ((getBuyDat() == null) ? 0 : getBuyDat().hashCode());
        result = prime * result + ((getFixDat() == null) ? 0 : getFixDat().hashCode());
        result = prime * result + ((getFixMan() == null) ? 0 : getFixMan().hashCode());
        result = prime * result + ((getMntCom() == null) ? 0 : getMntCom().hashCode());
        result = prime * result + ((getMntMan() == null) ? 0 : getMntMan().hashCode());
        result = prime * result + ((getMntTel() == null) ? 0 : getMntTel().hashCode());
        result = prime * result + ((getTcpFlg() == null) ? 0 : getTcpFlg().hashCode());
        result = prime * result + ((getWifFlg() == null) ? 0 : getWifFlg().hashCode());
        result = prime * result + ((getRdrIp() == null) ? 0 : getRdrIp().hashCode());
        result = prime * result + ((getRdrPort() == null) ? 0 : getRdrPort().hashCode());
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
        sb.append(", rdrSeq=").append(rdrSeq);
        sb.append(", rdrId=").append(rdrId);
        sb.append(", rdrNam=").append(rdrNam);
        sb.append(", rdrTyp=").append(rdrTyp);
        sb.append(", mtrTyp=").append(mtrTyp);
        sb.append(", mtrCod=").append(mtrCod);
        sb.append(", rdrLoc=").append(rdrLoc);
        sb.append(", rdrSta=").append(rdrSta);
        sb.append(", rdrPar=").append(rdrPar);
        sb.append(", rdrDep=").append(rdrDep);
        sb.append(", buyDat=").append(buyDat);
        sb.append(", fixDat=").append(fixDat);
        sb.append(", fixMan=").append(fixMan);
        sb.append(", mntCom=").append(mntCom);
        sb.append(", mntMan=").append(mntMan);
        sb.append(", mntTel=").append(mntTel);
        sb.append(", tcpFlg=").append(tcpFlg);
        sb.append(", wifFlg=").append(wifFlg);
        sb.append(", rdrIp=").append(rdrIp);
        sb.append(", rdrPort=").append(rdrPort);
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