package activetech.eicu.pojo.domain;

public class IcuMenuDef {
    private String menuId;

    private String menuName;

    private String menuStat;

    private String menuType;

    private String ovFlag;

    private String menuUrl;

    private String menuRoot;

    private Integer menuSort;

    public String getMenuId() {
        return menuId;
    }

    public void setMenuId(String menuId) {
        this.menuId = menuId == null ? null : menuId.trim();
    }

    public String getMenuName() {
        return menuName;
    }

    public void setMenuName(String menuName) {
        this.menuName = menuName == null ? null : menuName.trim();
    }

    public String getMenuStat() {
        return menuStat;
    }

    public void setMenuStat(String menuStat) {
        this.menuStat = menuStat == null ? null : menuStat.trim();
    }

    public String getMenuType() {
        return menuType;
    }

    public void setMenuType(String menuType) {
        this.menuType = menuType == null ? null : menuType.trim();
    }

    public String getOvFlag() {
        return ovFlag;
    }

    public void setOvFlag(String ovFlag) {
        this.ovFlag = ovFlag == null ? null : ovFlag.trim();
    }

    public String getMenuUrl() {
        return menuUrl;
    }

    public void setMenuUrl(String menuUrl) {
        this.menuUrl = menuUrl == null ? null : menuUrl.trim();
    }

    public String getMenuRoot() {
        return menuRoot;
    }

    public void setMenuRoot(String menuRoot) {
        this.menuRoot = menuRoot == null ? null : menuRoot.trim();
    }

    public Integer getMenuSort() {
        return menuSort;
    }

    public void setMenuSort(Integer menuSort) {
        this.menuSort = menuSort;
    }
}