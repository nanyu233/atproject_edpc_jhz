package activetech.zyyhospital.pojo.domain;

import java.util.Date;

public class BaseInfo {
	    private String SerialNumber;
	    private String Name;
	    private String Age;
	    private String AgeUnit;
	    private String Sex;
	    private String  BedNo;
	    private String Section;
	    private String InHosDate;
	    private String OutHosDate;
	    private String  Diagnosis;
	    
	    public String getDiagnosis() {
			return Diagnosis;
		}
		public void setDiagnosis(String diagnosis) {
			Diagnosis = diagnosis;
		}
		public void setSerialNumber(String SerialNumber) {
	         this.SerialNumber = SerialNumber;
	     }
	     public String getSerialNumber() {
	         return SerialNumber;
	     }

	    public void setName(String Name) {
	         this.Name = Name;
	     }
	     public String getName() {
	         return Name;
	     }

	    public void setAge(String Age) {
	         this.Age = Age;
	     }
	     public String getAge() {
	         return Age;
	     }

	    public void setAgeUnit(String AgeUnit) {
	         this.AgeUnit = AgeUnit;
	     }
	     public String getAgeUnit() {
	         return AgeUnit;
	     }

	    public void setSex(String Sex) {
	         this.Sex = Sex;
	     }
	     public String getSex() {
	         return Sex;
	     }

	    public String getBedNo() {
			return BedNo;
		}
		public void setBedNo(String bedNo) {
			BedNo = bedNo;
		}
		public void setSection(String Section) {
	         this.Section = Section;
	     }
	     public String getSection() {
	         return Section;
	     }

	   

	    public String getInHosDate() {
			return InHosDate;
		}
		public void setInHosDate(String inHosDate) {
			InHosDate = inHosDate;
		}
		public void setOutHosDate(String OutHosDate) {
	         this.OutHosDate = OutHosDate;
	     }
	     public String getOutHosDate() {
	         return OutHosDate;
	     }
}
