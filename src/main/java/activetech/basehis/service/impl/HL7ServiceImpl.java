package activetech.basehis.service.impl;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.log4j.Logger;

import activetech.basehis.service.HL7Service;
import activetech.hl7.base.HL7Util;
import activetech.hl7.custom.HL7MshCustom;
import activetech.hospital.pojo.dto.HspemginfCustom;
import activetech.netty.client.NettyClient;
import activetech.netty.util.MethodInvokeMeta;
import activetech.util.UUIDBuild;
import ca.uhn.hl7v2.model.v26.message.ADT_A01;
import ca.uhn.hl7v2.model.v26.segment.DG1;
import ca.uhn.hl7v2.model.v26.segment.EVN;
import ca.uhn.hl7v2.model.v26.segment.MSH;
import ca.uhn.hl7v2.model.v26.segment.PID;
import ca.uhn.hl7v2.model.v26.segment.PV1;

public class HL7ServiceImpl implements HL7Service {
	private static Logger logger = Logger.getLogger(HL7ServiceImpl.class); 

	@Override
	public String backMsgRcz(HspemginfCustom hspemginfCustom) throws Exception {
		NettyClient client = new NettyClient("ensemble.zjyy.com", 10019);
		//NettyClient client = new NettyClient("192.16.2.141", 10003);
		MethodInvokeMeta cmd = new MethodInvokeMeta();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss");
		ADT_A01 adt_A01 = new ADT_A01();
		MSH msh = adt_A01.getMSH();
        HL7Util.setHL7MshPatientService(msh, new HL7MshCustom(new Date(), 
				"ADT", "A01", "ADT_A01", UUIDBuild.getUUID()));
        EVN evn = adt_A01.getEVN();
        evn.getEvn1_EventTypeCode().setValue("FZDJ");
        evn.getEvn2_RecordedDateTime().setValue(sdf.format(hspemginfCustom.getEmgDat()));
        evn.getEvn5_OperatorID(0).getXcn1_IDNumber().setValue(hspemginfCustom.getPreDgnCod());
        evn.getEvn5_OperatorID(0).getXcn2_FamilyName().getFn1_Surname().setValue(hspemginfCustom.getPreDgnName());
        PID pid = adt_A01.getPID();
        pid.getPid2_PatientID().getCx1_IDNumber().setValue(hspemginfCustom.getMpi());
        pid.getPid5_PatientName(0).getXpn1_FamilyName().getFn1_Surname().setValue(hspemginfCustom.getCstNam());
        pid.getPid7_DateTimeOfBirth().setValue(sdf.format(hspemginfCustom.getBthDat()));
        pid.getPid8_AdministrativeSex().setValue("性别");
        PV1 pv1 = adt_A01.getPV1();
        pv1.getPv12_PatientClass().setValue("患者类型");
        pv1.getPv13_AssignedPatientLocation().getPl1_PointOfCare().setValue(hspemginfCustom.getEmgFkCod());
        pv1.getPv17_AttendingDoctor(0).getXcn1_IDNumber().setValue("医生号");
        pv1.getPv17_AttendingDoctor(0).getXcn2_FamilyName().getFn1_Surname().setValue("医生名");
        pv1.getPv119_VisitNumber().getCx1_IDNumber().setValue("就诊次数");
        pv1.getPv139_ServicingFacility().setValue("院区代码");
        pv1.getPv144_AdmitDateTime().setValue("挂号时间");
        DG1 dg1 = adt_A01.getDG1();
        dg1.getDg11_SetIDDG1().setValue("1");
        dg1.getDg13_DiagnosisCodeDG1().getCwe1_Identifier().setValue("医嘱控制码");
        dg1.getDg16_DiagnosisType().setValue(Integer.parseInt(hspemginfCustom.getEmgAreCod()) + 1+"");
        dg1.getDg17_MajorDiagnosticCategory().getCne1_Identifier().setValue(hspemginfCustom.getEmgFkCod()); //分诊科室
        dg1.getDg18_DiagnosticRelatedGroup().getCne1_Identifier().setValue("入院方式"); //加字段前端提交
        dg1.getDg19_DRGApprovalIndicator().setValue(hspemginfCustom.getTmpNbr()+"");
        dg1.getDg110_DRGGrouperReviewCode().setValue(hspemginfCustom.getHrtRte()+"");
        dg1.getDg111_OutlierType().getCwe1_Identifier().setValue(hspemginfCustom.getBreNbr()+"");
        dg1.getDg112_OutlierDays().setValue(hspemginfCustom.getSbpUpNbr() +""+hspemginfCustom.getSbpDownNbr());
        dg1.getDg113_OutlierCost().getCp1_Price().getMo1_Quantity().setValue(hspemginfCustom.getOxyNbr()+"");
        dg1.getDg115_DiagnosisPriority().setValue("血糖"); //是否需要
        dg1.getDg116_DiagnosingClinician(0).getXcn1_IDNumber().setValue(hspemginfCustom.getNrsSco());
        dg1.getDg117_DiagnosisClassification().setValue(hspemginfCustom.getSenRctCod()); //是否是清醒程度
        dg1.getDg118_ConfidentialIndicator().setValue("创伤评分"); //
        dg1.getDg119_AttestationDateTime().setValue(sdf.format(hspemginfCustom.getEmgDat()));
        dg1.getDg120_DiagnosisIdentifier().getEi1_EntityIdentifier().setValue(hspemginfCustom.getPreDgnCod());
        dg1.getDg121_DiagnosisActionCode().setValue(hspemginfCustom.getPreDgnName());
        logger.info("传参："+adt_A01.toString());
        Object reVal = client.remoteCall(cmd, 0);
        logger.info("返参："+reVal);
        return reVal.toString();
	}

}
