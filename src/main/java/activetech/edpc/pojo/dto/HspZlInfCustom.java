package activetech.edpc.pojo.dto;

import activetech.base.pojo.domain.Dstdictinfo;
import activetech.edpc.pojo.domain.HspCrivelInf;
import activetech.edpc.pojo.domain.HspZlInf;
import org.apache.commons.lang3.StringUtils;

import java.util.List;

public class HspZlInfCustom extends HspZlInf {
    private String proType;

    private String proUnit;

    private String proName;

    private String proList;

    private String keyTime;

    private String busStep;
    //排序
    private String valsort;

    private HspCrivelInf hspCrivelInf;

    public HspZlInfCustom() {
    }
    public HspZlInfCustom(String proCode,String proType,String proVal ) {
        this.setProCode(proCode);
        if (StringUtils.isNotBlank(proType.trim()))
            this.proType=proType;
        this.setProVal(proVal);
    }

    public HspCrivelInf getHspCrivelInf() {
        return hspCrivelInf;
    }

    public void setHspCrivelInf(HspCrivelInf hspCrivelInf) {
        this.hspCrivelInf = hspCrivelInf;
    }

    private List<Dstdictinfo> proLists;


    public String getBusStep() {
        return busStep;
    }

    public void setBusStep(String busStep) {
        this.busStep = busStep;
    }

    public List<Dstdictinfo> getProLists() {
        return proLists;
    }

    public void setProLists(List<Dstdictinfo> proLists) {
        this.proLists = proLists;
    }

    public String getProList() {
        return proList;
    }

    public void setProList(String proList) {
        this.proList = proList;
    }

    public String getProName() {
        return proName;
    }

    public void setProName(String proName) {
        this.proName = proName;
    }

    public String getProUnit() {
        return proUnit;
    }

    public void setProUnit(String proUnit) {
        this.proUnit = proUnit;
    }

    public String getProType() {
        return proType;
    }

    public void setProType(String proType) {
        this.proType = proType;
    }

    public String getKeyTime() {
        return keyTime;
    }

    public void setKeyTime(String keyTime) {
        this.keyTime = keyTime;
    }

    public String getValsort() {
        return valsort;
    }

    public void setValsort(String valsort) {
        this.valsort = valsort;
    }
}
