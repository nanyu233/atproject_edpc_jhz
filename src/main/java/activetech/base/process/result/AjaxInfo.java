package activetech.base.process.result;

import java.util.Date;
import java.util.Map;

public class AjaxInfo {
   private String state;
   private Map msg;
   public String getState() {
		return state;
   }
   public void setState(String state) {
	this.state = state;
   }
   public Map getMsg() {
	return msg;
   }
   public void setMsg(Map msg) {
	this.msg = msg;
   }
   
}
