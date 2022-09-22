package activetech.aid.pojo.domain;

import java.io.Serializable;
import java.util.Date;

/**
 * AID_EPT_GRP
 * @author 
 */
public class AidEptGrp implements Serializable {
    /**
     * 专家组序号  |AID_EPT_GRP_GRP_SEQ          
     */
    private String grpSeq;

    /**
     * 专家组编号  |AID_EPT_GRP_GRP_SEQ          
     */
    private String grpNo;

    /**
     * 专家组名称  |                             
     */
    private String grpNam;

    /**
     * 专家类型    |0:节点,1:组长,2:副组长,9:成员
     */
    private String eptTyp;

    /**
     * 专家编号    |                             
     */
    private String eptNo;

    /**
     * 归属站点    |                             
     */
    private String eptCom;

    /**
     * 小程序联系人|0:否,1:是                    
     */
    private String wxpFlg;

    /**
     * 创建时间    |                             
     */
    private Date crtTim;

    /**
     * 创建用户    |                             
     */
    private String crtUsr;

    /**
     * 修改时间    |                             
     */
    private Date modTim;

    /**
     * 修改用户    |                             
     */
    private String modUsr;

    private static final long serialVersionUID = 1L;

    public String getGrpSeq() {
        return grpSeq;
    }

    public void setGrpSeq(String grpSeq) {
        this.grpSeq = grpSeq;
    }

    public String getGrpNo() {
        return grpNo;
    }

    public void setGrpNo(String grpNo) {
        this.grpNo = grpNo;
    }

    public String getGrpNam() {
        return grpNam;
    }

    public void setGrpNam(String grpNam) {
        this.grpNam = grpNam;
    }

    public String getEptTyp() {
        return eptTyp;
    }

    public void setEptTyp(String eptTyp) {
        this.eptTyp = eptTyp;
    }

    public String getEptNo() {
        return eptNo;
    }

    public void setEptNo(String eptNo) {
        this.eptNo = eptNo;
    }

    public String getEptCom() {
        return eptCom;
    }

    public void setEptCom(String eptCom) {
        this.eptCom = eptCom;
    }

    public String getWxpFlg() {
        return wxpFlg;
    }

    public void setWxpFlg(String wxpFlg) {
        this.wxpFlg = wxpFlg;
    }

    public Date getCrtTim() {
        return crtTim;
    }

    public void setCrtTim(Date crtTim) {
        this.crtTim = crtTim;
    }

    public String getCrtUsr() {
        return crtUsr;
    }

    public void setCrtUsr(String crtUsr) {
        this.crtUsr = crtUsr;
    }

    public Date getModTim() {
        return modTim;
    }

    public void setModTim(Date modTim) {
        this.modTim = modTim;
    }

    public String getModUsr() {
        return modUsr;
    }

    public void setModUsr(String modUsr) {
        this.modUsr = modUsr;
    }
}