package activetech.aid.pojo.dto;

import activetech.aid.pojo.domain.AidEptGrp;

public class AidEptGrpCustom extends AidEptGrp {

    private String _parentId;

    private String usrname;

    private String phone;

    private String movephone;

    public void setParentId(String _parentId) {
        this._parentId = _parentId;
    }

    public String get_parentId() {
        return _parentId;
    }

    public void set_parentId(String _parentId) {
        this._parentId = _parentId;
    }

    public String getUsrname() {
        return usrname;
    }

    public void setUsrname(String usrname) {
        this.usrname = usrname;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getMovephone() {
        return movephone;
    }

    public void setMovephone(String movephone) {
        this.movephone = movephone;
    }
}