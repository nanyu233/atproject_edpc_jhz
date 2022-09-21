package activetech.zyyhospital.pojo.dto;

import java.util.Date;

import activetech.zyyhospital.pojo.domain.HspTpctInf;

public class HspTpctInfCustom extends HspTpctInf {

	private String zdytzString;
	private Date pollDate;
	private String seqString;
	private String enteringDatString;
	private String deletetype;
	private String deletevalue;
	private String deleteadd;

	private String ordernum;
	private String abodat;
	private String abdat;

	private String sumrl;
	private String sumcl;
	private String xy1;
	private String xy2;
	private String xy3;
	private String dbcs;
	private String xbcs;

	private String xtName;
	
	private String Event2;
	private Date EventTime2;

	
	public Date getEventTime2() {
		return EventTime2;
	}

	public void setEventTime2(Date eventTime2) {
		EventTime2 = eventTime2;
	}

	public String getEvent2() {
		return Event2;
	}

	public void setEvent2(String event2) {
		Event2 = event2;
	}

	public String getXtName() {
		return xtName;
	}

	public void setXtName(String xtName) {
		this.xtName = xtName;
	}

	public String getDbcs() {
		return dbcs;
	}

	public void setDbcs(String dbcs) {
		this.dbcs = dbcs;
	}

	public String getXbcs() {
		return xbcs;
	}

	public void setXbcs(String xbcs) {
		this.xbcs = xbcs;
	}

	public String getXy1() {
		return xy1;
	}

	public void setXy1(String xy1) {
		this.xy1 = xy1;
	}

	public String getXy2() {
		return xy2;
	}

	public void setXy2(String xy2) {
		this.xy2 = xy2;
	}

	public String getXy3() {
		return xy3;
	}

	public void setXy3(String xy3) {
		this.xy3 = xy3;
	}

	public String getSumrl() {
		return sumrl;
	}

	public void setSumrl(String sumrl) {
		this.sumrl = sumrl;
	}

	public String getSumcl() {
		return sumcl;
	}

	public void setSumcl(String sumcl) {
		this.sumcl = sumcl;
	}

	public String getOrdernum() {
		return ordernum;
	}

	public void setOrdernum(String ordernum) {
		this.ordernum = ordernum;
	}

	public String getAbodat() {
		return abodat;
	}

	public void setAbodat(String abodat) {
		this.abodat = abodat;
	}

	public String getAbdat() {
		return abdat;
	}

	public void setAbdat(String abdat) {
		this.abdat = abdat;
	}

	public String getDeletetype() {
		return deletetype;
	}

	public void setDeletetype(String deletetype) {
		this.deletetype = deletetype;
	}

	public String getDeletevalue() {
		return deletevalue;
	}

	public void setDeletevalue(String deletevalue) {
		this.deletevalue = deletevalue;
	}

	public String getDeleteadd() {
		return deleteadd;
	}

	public void setDeleteadd(String deleteadd) {
		this.deleteadd = deleteadd;
	}

	public String getEnteringDatString() {
		return enteringDatString;
	}

	public void setEnteringDatString(String enteringDatString) {
		this.enteringDatString = enteringDatString;
	}

	public String getSeqString() {
		return seqString;
	}

	public void setSeqString(String seqString) {
		this.seqString = seqString;
	}

	public Date getPollDate() {
		return pollDate;
	}

	public void setPollDate(Date pollDate) {
		this.pollDate = pollDate;
	}

	public String getZdytzString() {
		return zdytzString;
	}

	public void setZdytzString(String zdytzString) {
		this.zdytzString = zdytzString;
	}

	//删除时判断该条数据是由全部为空
	@Override
	public String toString() {
		return  (getTpctTw() != null ? "getTpctTw()=" + getTpctTw() + ", "
						: "")
				+ (getTpctTwCod() != null ? "getTpctTwCod()=" + getTpctTwCod() + ", "
						: "")
				+ (getTpctJwh() != null ? "getTpctJwh()=" + getTpctJwh() + ", "
						: "")
				+ (getTpctMbCod() != null ? "getTpctMbCod()=" + getTpctMbCod()
						+ ", " : "")
				+ (getTpctMb() != null ? "getTpctMb()=" + getTpctMb() + ", "
						: "")
				+ (getTpctHxCod() != null ? "getTpctHxCod()=" + getTpctHxCod()
						+ ", " : "")
				+ (getTpctHx() != null ? "getTpctHx()=" + getTpctHx() + ", "
						: "")
				+ (getTpctXl() != null ? "getTpctXl()=" + getTpctXl() + ", "
						: "")
				+ (getTpctXyCod() != null ? "getTpctXyCod()=" + getTpctXyCod()
						+ ", " : "")
				+ (getTpctXyUp() != null ? "getTpctXyUp()=" + getTpctXyUp()
						+ ", " : "")
				+ (getTpctXyDown() != null ? "getTpctXyDown()="
						+ getTpctXyDown() + ", " : "")
				+ (getTpctTtpf() != null ? "getTpctTtpf()=" + getTpctTtpf()
						+ ", " : "")
				+ (getTpctJth() != null ? "getTpctJth()=" + getTpctJth() + ", "
						: "")
				+ (getTpctDbCod() != null ? "getTpctDbCod()=" + getTpctDbCod()
						+ ", " : "")
				+ (getTpctDbPt() != null ? "getTpctDbPt()=" + getTpctDbPt()
						+ ", " : "")
				+ (getTpctDbGc() != null ? "getTpctDbGc()=" + getTpctDbGc()
						+ ", " : "")
				+ (getTpctNlCod() != null ? "getTpctNlCod()=" + getTpctNlCod()
						+ ", " : "")
				+ (getTpctNl() != null ? "getTpctNl()=" + getTpctNl() + ", "
						: "")
				+ (getTpctRl() != null ? "getTpctRl()=" + getTpctRl() + ", "
						: "")
				+ (getTpctCl() != null ? "getTpctCl()=" + getTpctCl() + ", "
						: "")
				+ (getTpctTzCod() != null ? "getTpctTzCod()=" + getTpctTzCod()
						+ ", " : "")
				+ (getTpctTz() != null ? "getTpctTz()=" + getTpctTz() + ", "
						: "")
				+ (getTpctSg() != null ? "getTpctSg()=" + getTpctSg() + ", "
						: "")
				+ (getTpctSjmcCod() != null ? "getTpctSjmcCod()="
						+ getTpctSjmcCod() + ", " : "")
				+ (getTpctZdyType1() != null ? "getTpctZdyType1()="
						+ getTpctZdyType1() + ", " : "")
				+ (getTpctZdyValue1() != null ? "getTpctZdyValue1()="
						+ getTpctZdyValue1() + ", " : "")
				+ (getTpctZdyType2() != null ? "getTpctZdyType2()="
						+ getTpctZdyType2() + ", " : "")
				+ (getTpctZdyValue2() != null ? "getTpctZdyValue2()="
						+ getTpctZdyValue2() + ", " : "")
				+ (getTpctZdyType3() != null ? "getTpctZdyType3()="
						+ getTpctZdyType3() + ", " : "")
				+ (getTpctZdyValue3() != null ? "getTpctZdyValue3()="
						+ getTpctZdyValue3() + ", " : "")
				+ (getTpctZdyType4() != null ? "getTpctZdyType4()="
						+ getTpctZdyType4() + ", " : "")
				+ (getTpctZdyValue4() != null ? "getTpctZdyValue4()="
						+ getTpctZdyValue4() + ", " : "")
				+ (getTpctZdyType5() != null ? "getTpctZdyType5()="
						+ getTpctZdyType5() + ", " : "")
				+ (getTpctZdyValue5() != null ? "getTpctZdyValue5()="
						+ getTpctZdyValue5() + ", " : "")
				+ (getTpctXt() != null ? "getTpctXt()="
						+ getTpctXt() + ", " : "")
				+ (getTpctXtCod() != null ? "getTpctXtCod()="
						+ getTpctXtCod() : "")
				+ (getTpctXtFlg() != null ? "getTpctXtFlg()="
						+ getTpctXtFlg() : "")
				+ (getTpctZdyType6() != null ? "getTpctZdyType6()="
						+ getTpctZdyType6() + ", " : "")
				+ (getTpctZdyValue6() != null ? "getTpctZdyValue56()="
						+ getTpctZdyValue6() + ", " : "")
				+ (getTpctXlCod() != null ? "getTpctXlCod()=" + getTpctXlCod()
				+ ", " : "");
	}
	
	//判断疼痛评分
	@Override
	public String toTtpfString() {
		return  (getTpctTw() != null ? "getTpctTw()=" + getTpctTw() + ", "
						: "")
				+ (getTpctTwCod() != null ? "getTpctTwCod()=" + getTpctTwCod() + ", "
						: "")
				+ (getTpctJwh() != null ? "getTpctJwh()=" + getTpctJwh() + ", "
						: "")
				+ (getTpctMbCod() != null ? "getTpctMbCod()=" + getTpctMbCod()
						+ ", " : "")
				+ (getTpctMb() != null ? "getTpctMb()=" + getTpctMb() + ", "
						: "")
				+ (getTpctHxCod() != null ? "getTpctHxCod()=" + getTpctHxCod()
						+ ", " : "")
				+ (getTpctHx() != null ? "getTpctHx()=" + getTpctHx() + ", "
						: "")
				+ (getTpctXl() != null ? "getTpctXl()=" + getTpctXl() + ", "
						: "")
				+ (getTpctXyCod() != null ? "getTpctXyCod()=" + getTpctXyCod()
						+ ", " : "")
				+ (getTpctXyUp() != null ? "getTpctXyUp()=" + getTpctXyUp()
						+ ", " : "")
				+ (getTpctXyDown() != null ? "getTpctXyDown()="
						+ getTpctXyDown() + ", " : "")
				+ (getTpctJth() != null ? "getTpctJth()=" + getTpctJth() + ", "
						: "")
				+ (getTpctDbCod() != null ? "getTpctDbCod()=" + getTpctDbCod()
						+ ", " : "")
				+ (getTpctDbPt() != null ? "getTpctDbPt()=" + getTpctDbPt()
						+ ", " : "")
				+ (getTpctDbGc() != null ? "getTpctDbGc()=" + getTpctDbGc()
						+ ", " : "")
				+ (getTpctNlCod() != null ? "getTpctNlCod()=" + getTpctNlCod()
						+ ", " : "")
				+ (getTpctNl() != null ? "getTpctNl()=" + getTpctNl() + ", "
						: "")
				+ (getTpctRl() != null ? "getTpctRl()=" + getTpctRl() + ", "
						: "")
				+ (getTpctCl() != null ? "getTpctCl()=" + getTpctCl() + ", "
						: "")
				+ (getTpctTzCod() != null ? "getTpctTzCod()=" + getTpctTzCod()
						+ ", " : "")
				+ (getTpctTz() != null ? "getTpctTz()=" + getTpctTz() + ", "
						: "")
				+ (getTpctSg() != null ? "getTpctSg()=" + getTpctSg() + ", "
						: "")
				+ (getTpctSjmcCod() != null ? "getTpctSjmcCod()="
						+ getTpctSjmcCod() + ", " : "")
				+ (getTpctZdyType1() != null ? "getTpctZdyType1()="
						+ getTpctZdyType1() + ", " : "")
				+ (getTpctZdyValue1() != null ? "getTpctZdyValue1()="
						+ getTpctZdyValue1() + ", " : "")
				+ (getTpctZdyType2() != null ? "getTpctZdyType2()="
						+ getTpctZdyType2() + ", " : "")
				+ (getTpctZdyValue2() != null ? "getTpctZdyValue2()="
						+ getTpctZdyValue2() + ", " : "")
				+ (getTpctZdyType3() != null ? "getTpctZdyType3()="
						+ getTpctZdyType3() + ", " : "")
				+ (getTpctZdyValue3() != null ? "getTpctZdyValue3()="
						+ getTpctZdyValue3() + ", " : "")
				+ (getTpctZdyType4() != null ? "getTpctZdyType4()="
						+ getTpctZdyType4() + ", " : "")
				+ (getTpctZdyValue4() != null ? "getTpctZdyValue4()="
						+ getTpctZdyValue4() + ", " : "")
				+ (getTpctZdyType5() != null ? "getTpctZdyType5()="
						+ getTpctZdyType5() + ", " : "")
				+ (getTpctZdyValue5() != null ? "getTpctZdyValue5()="
						+ getTpctZdyValue5() + ", " : "")
				+ (getTpctXt() != null ? "getTpctXt()="
						+ getTpctXt() + ", " : "")
				+ (getTpctXtCod() != null ? "getTpctXtCod()="
						+ getTpctXtCod() : "")
				+ (getTpctXtFlg() != null ? "getTpctXtFlg()="
						+ getTpctXtFlg() : "")
				+ (getTpctZdyType6() != null ? "getTpctZdyType6()="
						+ getTpctZdyType6() + ", " : "")
				+ (getTpctZdyValue6() != null ? "getTpctZdyValue56()="
						+ getTpctZdyValue6() + ", " : "")
				+ (getTpctXlCod() != null ? "getTpctXlCod()=" + getTpctXlCod()
				+ ", " : "");
	}
	
	
	
	//判断疼痛评分
		@Override
		public String toCrnlInString() {
			return  (getTpctNl() != null ? "getTpctNl()=" + getTpctNl() + ", "
							: "")
					+ (getTpctRl() != null ? "getTpctRl()=" + getTpctRl() + ", "
							: "")
					+ (getTpctCl() != null ? "getTpctCl()=" + getTpctCl() + ", "
							: "");
					
		}
	
	//判断出量
	@Override
	public String toCrnlOutString() {
		return  (getTpctTw() != null ? "getTpctTw()=" + getTpctTw() + ", "
						: "")
				+ (getTpctTwCod() != null ? "getTpctTwCod()=" + getTpctTwCod() + ", "
						: "")
				+ (getTpctJwh() != null ? "getTpctJwh()=" + getTpctJwh() + ", "
						: "")
				+ (getTpctMbCod() != null ? "getTpctMbCod()=" + getTpctMbCod()
						+ ", " : "")
				+ (getTpctMb() != null ? "getTpctMb()=" + getTpctMb() + ", "
						: "")
				+ (getTpctHxCod() != null ? "getTpctHxCod()=" + getTpctHxCod()
						+ ", " : "")
				+ (getTpctHx() != null ? "getTpctHx()=" + getTpctHx() + ", "
						: "")
				+ (getTpctXl() != null ? "getTpctXl()=" + getTpctXl() + ", "
						: "")
				+ (getTpctXyCod() != null ? "getTpctXyCod()=" + getTpctXyCod()
						+ ", " : "")
				+ (getTpctXyUp() != null ? "getTpctXyUp()=" + getTpctXyUp()
						+ ", " : "")
				+ (getTpctXyDown() != null ? "getTpctXyDown()="
						+ getTpctXyDown() + ", " : "")
				+ (getTpctTtpf() != null ? "getTpctTtpf()=" + getTpctTtpf()
						+ ", " : "")
				+ (getTpctJth() != null ? "getTpctJth()=" + getTpctJth() + ", "
						: "")
				+ (getTpctDbCod() != null ? "getTpctDbCod()=" + getTpctDbCod()
						+ ", " : "")
				+ (getTpctDbPt() != null ? "getTpctDbPt()=" + getTpctDbPt()
						+ ", " : "")
				+ (getTpctDbGc() != null ? "getTpctDbGc()=" + getTpctDbGc()
						+ ", " : "")
				+ (getTpctNlCod() != null ? "getTpctNlCod()=" + getTpctNlCod()
						+ ", " : "")
				+ (getTpctTzCod() != null ? "getTpctTzCod()=" + getTpctTzCod()
						+ ", " : "")
				+ (getTpctTz() != null ? "getTpctTz()=" + getTpctTz() + ", "
						: "")
				+ (getTpctSg() != null ? "getTpctSg()=" + getTpctSg() + ", "
						: "")
				+ (getTpctSjmcCod() != null ? "getTpctSjmcCod()="
						+ getTpctSjmcCod() + ", " : "")
				+ (getTpctZdyType1() != null ? "getTpctZdyType1()="
						+ getTpctZdyType1() + ", " : "")
				+ (getTpctZdyValue1() != null ? "getTpctZdyValue1()="
						+ getTpctZdyValue1() + ", " : "")
				+ (getTpctZdyType2() != null ? "getTpctZdyType2()="
						+ getTpctZdyType2() + ", " : "")
				+ (getTpctZdyValue2() != null ? "getTpctZdyValue2()="
						+ getTpctZdyValue2() + ", " : "")
				+ (getTpctZdyType3() != null ? "getTpctZdyType3()="
						+ getTpctZdyType3() + ", " : "")
				+ (getTpctZdyValue3() != null ? "getTpctZdyValue3()="
						+ getTpctZdyValue3() + ", " : "")
				+ (getTpctZdyType4() != null ? "getTpctZdyType4()="
						+ getTpctZdyType4() + ", " : "")
				+ (getTpctZdyValue4() != null ? "getTpctZdyValue4()="
						+ getTpctZdyValue4() + ", " : "")
				+ (getTpctZdyType5() != null ? "getTpctZdyType5()="
						+ getTpctZdyType5() + ", " : "")
				+ (getTpctZdyValue5() != null ? "getTpctZdyValue5()="
						+ getTpctZdyValue5() + ", " : "")
				+ (getTpctXt() != null ? "getTpctXt()="
						+ getTpctXt() + ", " : "")
				+ (getTpctXtCod() != null ? "getTpctXtCod()="
						+ getTpctXtCod() : "")
				+ (getTpctXtFlg() != null ? "getTpctXtFlg()="
						+ getTpctXtFlg() : "")
				+ (getTpctZdyType6() != null ? "getTpctZdyType6()="
						+ getTpctZdyType6() + ", " : "")
				+ (getTpctZdyValue6() != null ? "getTpctZdyValue56()="
						+ getTpctZdyValue6() + ", " : "")
				+ (getTpctXlCod() != null ? "getTpctXlCod()=" + getTpctXlCod()
				+ ", " : "");
	}
}
