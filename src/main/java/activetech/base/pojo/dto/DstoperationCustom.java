package activetech.base.pojo.dto;
import activetech.base.pojo.domain.Dstoperation;
/**
 * 
 * <p>Title:DstoperateCustom</p>
 * <p>Description:模块操作结果集</p>
 * <p>activetech</p>
 * @author pyy
 * @date 2017-1-5 下午1:43:40
 *
 */
public class DstoperationCustom extends Dstoperation{
    private String modulename;

	public String getModulename() {
		return modulename;
	}
	
	public void setModulename(String modulename) {
		this.modulename = modulename;
	}
   
}
