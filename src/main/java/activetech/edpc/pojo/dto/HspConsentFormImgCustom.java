package activetech.edpc.pojo.dto;

import activetech.edpc.pojo.domain.HspConsentFormImg;

public class HspConsentFormImgCustom extends HspConsentFormImg {
    private static final long serialVersionUID = -2839850656672647995L;

    private String isPhoto;

    private String imgUri;


    private String consentCrtTimeStr;

    private String consentCrtUsrName;

    private String sceneType;


    public String getIsPhoto() {
        return isPhoto;
    }

    public void setIsPhoto(String isPhoto) {
        this.isPhoto = isPhoto;
    }

    public String getImgUri() {
        return imgUri;
    }

    public void setImgUri(String imgUri) {
        this.imgUri = imgUri;
    }

    public String getConsentCrtTimeStr() {
        return consentCrtTimeStr;
    }

    public void setConsentCrtTimeStr(String consentCrtTimeStr) {
        this.consentCrtTimeStr = consentCrtTimeStr;
    }

    public String getConsentCrtUsrName() {
        return consentCrtUsrName;
    }

    public void setConsentCrtUsrName(String consentCrtUsrName) {
        this.consentCrtUsrName = consentCrtUsrName;
    }

    public String getSceneType() {
        return sceneType;
    }

    public void setSceneType(String sceneType) {
        this.sceneType = sceneType;
    }
}
