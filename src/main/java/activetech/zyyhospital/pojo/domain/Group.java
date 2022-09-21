package activetech.zyyhospital.pojo.domain;

public class Group {

	private String  Date;
    private Temperature Temperature;
    private OtherData OtherData;
   

    public String getDate() {
		return Date;
	}
	public void setDate(String date) {
		Date = date;
	}
	public void setTemperature(Temperature Temperature) {
         this.Temperature = Temperature;
     }
     public Temperature getTemperature() {
         return Temperature;
     }

    public void setOtherData(OtherData OtherData) {
         this.OtherData = OtherData;
     }
     public OtherData getOtherData() {
         return OtherData;
     }
}
