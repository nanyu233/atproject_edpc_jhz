package activetech.zyyhospital.pojo.domain;

public class JsonRootBean {
    private BaseInfo BaseInfo;
    private Data Data;
    public void setBaseInfo(BaseInfo BaseInfo) {
         this.BaseInfo = BaseInfo;
     }
     public BaseInfo getBaseInfo() {
         return BaseInfo;
     }

    public void setData(Data Data) {
         this.Data = Data;
     }
     public Data getData() {
         return Data;
     }

}
