package activetech.hl7.base;

import java.text.SimpleDateFormat;
import java.util.Date;

import activetech.hl7.custom.HL7MshCustom;
import activetech.hl7.custom.HL7QpdCustom;
import activetech.util.UUIDBuild;
import ca.uhn.hl7v2.HL7Exception;
import ca.uhn.hl7v2.model.AbstractMessage;
import ca.uhn.hl7v2.model.DataTypeException;
import ca.uhn.hl7v2.model.Message;
import ca.uhn.hl7v2.model.v26.segment.MSH;
import ca.uhn.hl7v2.model.v26.segment.QPD;
import ca.uhn.hl7v2.parser.GenericParser;
import ca.uhn.hl7v2.parser.Parser;
import ca.uhn.hl7v2.parser.ParserConfiguration;
import ca.uhn.hl7v2.parser.PipeParser;
import ca.uhn.hl7v2.util.Terser;

public class HL7Util {

	@SuppressWarnings("unchecked")
	public static <T extends AbstractMessage> T hl7Text2Msg(String responseStr,Class<T> asCls) {
		Parser p = new PipeParser();
		ParserConfiguration configuration = new ParserConfiguration();
		configuration.setValidating(false);
		p.setParserConfiguration(configuration);
		try {
			return (T) p.parse(responseStr);
		} catch (HL7Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null; 
    }
	
	@SuppressWarnings("unchecked")
	public static <T extends AbstractMessage> T hl7Text2Msg2(String responseStr,Class<T> asCls) {
		Parser p = new GenericParser();
		try {
			return (T) p.parse(responseStr);
		} catch (HL7Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null; 
    }
	
	
	public static void getMsh(MSH msh,String jscx,String msgType,String code,String msgClass) throws Exception{
		msh.getMsh1_FieldSeparator().setValue("|"); //分隔符
		msh.getMsh2_EncodingCharacters().setValue("^~\\&");
		msh.getMsh3_SendingApplication().getHd1_NamespaceID().setValue("EMIS"); //发送程序简称
		msh.getMsh5_ReceivingApplication().getHd1_NamespaceID().setValue(jscx); //接收程序简称
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss");
	    String nowDate = sdf.format(new Date());
	    msh.getMsh7_DateTimeOfMessage().setValue(nowDate); //消息发生的时间
	    msh.getMsh9_MessageType().getMsg1_MessageCode().setValue(msgType); //消息类型
	    msh.getMsh9_MessageType().getMsg2_TriggerEvent().setValue(code); //事件
	    msh.getMsh9_MessageType().getMsg3_MessageStructure().setValue(msgClass);
	    msh.getMsh10_MessageControlID().setValue(UUIDBuild.getUUID()); //唯一标识
	    msh.getMsh11_ProcessingID().getProcessingID().setValue("P"); 
	    msh.getMsh12_VersionID().getVersionID().setValue("2.6"); //版本号
	    msh.getMsh15_AcceptAcknowledgmentType().setValue("NE");
	    msh.getMsh16_ApplicationAcknowledgmentType().setValue("AL");
	}
	//消息头（MSH）
	public static void setHL7MshPatientService(MSH msh,HL7MshCustom hl7MshCustom) throws DataTypeException{
	    msh.getMsh1_FieldSeparator().setValue(hl7MshCustom.getMsh1()); //分隔符
	    msh.getMsh2_EncodingCharacters().setValue(hl7MshCustom.getMsh2());
	    msh.getMsh3_SendingApplication().getHd1_NamespaceID().setValue(hl7MshCustom.getMsh3_1()); //发送程序简称
	    msh.getMsh4_SendingFacility().getHd1_NamespaceID().setValue(hl7MshCustom.getMsh4_1()); //发送设备
	    msh.getMsh5_ReceivingApplication().getHd1_NamespaceID().setValue(hl7MshCustom.getMsh5_1()); //接收程序简称
	    msh.getMsh6_ReceivingFacility().getHd1_NamespaceID().setValue(hl7MshCustom.getMsh6_1()); //接收设备
	    SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss");
	    String nowDate = sdf.format(hl7MshCustom.getMsh7_1());
	    msh.getMsh7_DateTimeOfMessage().setValue(nowDate); //消息发生的时间
	    msh.getMsh9_MessageType().getMsg1_MessageCode().setValue(hl7MshCustom.getMsh9_1()); //消息类型
	    msh.getMsh9_MessageType().getMsg2_TriggerEvent().setValue(hl7MshCustom.getMsh9_2()); //事件
	    msh.getMsh9_MessageType().getMsg3_MessageStructure().setValue(hl7MshCustom.getMsh9_3()); //消息结构
	    msh.getMsh10_MessageControlID().setValue(hl7MshCustom.getMsh10()); //唯一标识
	    msh.getMsh11_ProcessingID().getProcessingID().setValue(hl7MshCustom.getMsh11_1()); //处理 ID 号
	    msh.getMsh12_VersionID().getVersionID().setValue(hl7MshCustom.getMsh12_1()); //版本号
	    msh.getMsh13_SequenceNumber().setValue(hl7MshCustom.getMsh13_1()); //顺序号
	    msh.getMsh15_AcceptAcknowledgmentType().setValue(hl7MshCustom.getMsh15_1());
	    msh.getMsh16_ApplicationAcknowledgmentType().setValue(hl7MshCustom.getMsh16_1());
	    msh.getMsh18_CharacterSet(0).setValue(hl7MshCustom.getMsh18_1());
	}
	
	/*public static void setHL7QrdPatientService(QRD qrd,HL7QrdCustom hl7QrdCustom) throws HL7Exception{
		qrd.getQrd1_QueryDateTime().getTs1_TimeOfAnEvent().setValue(hl7QrdCustom.getQrd1_1());
		qrd.getQrd2_QueryFormatCode().setValue(hl7QrdCustom.getQrd2());
		qrd.getQrd3_QueryPriority().setValue(hl7QrdCustom.getQrd3());
		qrd.getQrd4_QueryID().setValue(hl7QrdCustom.getQrd4());
		qrd.getQrd5_DeferredResponseType().setValue(hl7QrdCustom.getQrd5());
		qrd.getQrd6_DeferredResponseDateTime().getTs1_TimeOfAnEvent().setValue(hl7QrdCustom.getQrd6_1());
		qrd.getQrd7_QuantityLimitedRequest().getCq1_Quantity().setValue(hl7QrdCustom.getQrd7_1());
		qrd.getQrd7_QuantityLimitedRequest().getCq2_Units().getCe1_Identifier().setValue(hl7QrdCustom.getQrd7_2_1());
		List<Qrd8nCustom> qrd8nCustomList = hl7QrdCustom.getQrd8n();
		for(int i=0;StringUtils.isNotNullAndZero(qrd8nCustomList)&&i<qrd8nCustomList.size();i++) {
			qrd.getQrd8_WhoSubjectFilter(i).getXcn1_IDNumber().setValue(qrd8nCustomList.get(i).getQrd8n_1());
			qrd.getQrd8_WhoSubjectFilter(i).getXcn3_GivenName().setValue(qrd8nCustomList.get(i).getQrd8n_3());
		}
		qrd.getQrd9_WhatSubjectFilter(0).getCe1_Identifier().setValue(hl7QrdCustom.getQrd9_1());
		qrd.getQrd9_WhatSubjectFilter(0).getCe2_Text().setValue(hl7QrdCustom.getQrd9_2());
		List<Qrd10nCustom> qrd10nCustomList = hl7QrdCustom.getQrd10n();
		for(int i=0;StringUtils.isNotNullAndZero(qrd10nCustomList)&&i<qrd10nCustomList.size();i++) {
			qrd.getQrd10_WhatDepartmentDataCode(i).getCe1_Identifier().setValue(qrd10nCustomList.get(i).getQrd10n_1());
			qrd.getQrd10_WhatDepartmentDataCode(i).getCe2_Text().setValue(qrd10nCustomList.get(i).getQrd10n_2());
			qrd.getQrd10_WhatDepartmentDataCode(i).getCe3_NameOfCodingSystem().setValue(qrd10nCustomList.get(i).getQrd10n_3());
		}
		qrd.getQrd11_WhatDataCodeValueQual(0).getVr1_FirstDataCodeValue().setValue(hl7QrdCustom.getQrd11n_1());
		if("~".equals(hl7QrdCustom.getFlag())){
			qrd.getQrd11_WhatDataCodeValueQual(1).getVr1_FirstDataCodeValue().setValue(hl7QrdCustom.getQrd11n_2());
		}else{
			qrd.getQrd11_WhatDataCodeValueQual(0).getVr2_LastDataCodeCalue().setValue(hl7QrdCustom.getQrd11n_2());
		}
		qrd.getQrd12_QueryResultsLevel().setValue(hl7QrdCustom.getQrd12());
    }
	*/
	public static void setHL7QpdPatientService(QPD qpd,HL7QpdCustom hl7QpdCustom,Message message) throws HL7Exception{
		qpd.getQpd1_MessageQueryName().getCwe1_Identifier().setValue(hl7QpdCustom.getQpd1_1());
		qpd.getQpd1_MessageQueryName().getCwe2_Text().setValue(hl7QpdCustom.getQpd1_2());
		qpd.getQpd2_QueryTag().setValue(hl7QpdCustom.getQpd2());
		Terser terser = new Terser(message);
		terser.set("/QPD-3-1",hl7QpdCustom.getQpd3_1());
		terser.set("/QPD-3-2",hl7QpdCustom.getQpd3_2());
		terser.set("/QPD-3-4",hl7QpdCustom.getQpd3_4());
		terser.set("/QPD-3-5",hl7QpdCustom.getQpd3_5());
    }
	
}
