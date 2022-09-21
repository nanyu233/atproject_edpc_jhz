package activetech.hl7.base;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

import org.apache.log4j.Logger;

import activetech.base.pojo.dto.ActiveUser;
import activetech.hl7.custom.HL7MshCustom;
import activetech.hl7.custom.HL7QpdCustom;
import activetech.netty.client.NettyClient;
import activetech.netty.util.MethodInvokeMeta;
import activetech.pda.pojo.dto.HspCfxxExecCustom;
import activetech.pda.pojo.dto.HspCfxxInfoCustom;
import activetech.pda.pojo.dto.HspCfxxInfoQueryDto;
import activetech.util.StringUtils;
import activetech.util.UUIDBuild;
import ca.uhn.hl7v2.HL7Exception;
import ca.uhn.hl7v2.model.v26.group.RDE_O11_ORDER;
import ca.uhn.hl7v2.model.v26.message.QBP_Q11;
import ca.uhn.hl7v2.model.v26.message.RDE_O11;
import ca.uhn.hl7v2.model.v26.segment.MSH;
import ca.uhn.hl7v2.model.v26.segment.ORC;
import ca.uhn.hl7v2.model.v26.segment.QPD;
import ca.uhn.hl7v2.model.v26.segment.RCP;
import ca.uhn.hl7v2.model.v26.segment.RXO;
import ca.uhn.hl7v2.model.v26.segment.RXR;
import ca.uhn.hl7v2.model.v26.segment.TQ1;

/**
 * HL7接口工具类
 * @author machaofan
 *
 */
public class HL7Client {
	private static Logger logger = Logger.getLogger(HL7Client.class); 
	/**
	 * 通过患者数据从HL7接口中获取医嘱执行单数据
	 * @param hspCfxxInfoQueryDto
	 * @return
	 * @throws Exception 
	 */
	public static List<HspCfxxExecCustom> findHisCfxxExecByHL7(HspCfxxInfoQueryDto hspCfxxInfoQueryDto, String startdate,String enddate, ActiveUser activeUser,List<HspCfxxExecCustom> hspCfxxExecCustomList) throws Exception{
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss");
		NettyClient client = new NettyClient("ensemble.zjyy.com", 10019);
		//	NettyClient client = new NettyClient("192.16.2.141", 10003);
		MethodInvokeMeta cmd = new MethodInvokeMeta();
		QBP_Q11 qbp_Q11 = new QBP_Q11();
        MSH msh = qbp_Q11.getMSH();
        HL7Util.setHL7MshPatientService(msh, new HL7MshCustom(new Date(), 
				"QBP", "Z10", "QBP_Q11", UUIDBuild.getUUID()));
        QPD qpd = qbp_Q11.getQPD();
        HL7QpdCustom hl7QpdCustom = new HL7QpdCustom();
		hl7QpdCustom.setQpd1_1("Z10");
		hl7QpdCustom.setQpd1_2("查询处置单");
		hl7QpdCustom.setQpd2("Z1002");
		hl7QpdCustom.setQpd3_1("1"); //患者类型
		hl7QpdCustom.setQpd3_2(hspCfxxInfoQueryDto.getMPI()); //患者id
		hl7QpdCustom.setQpd3_4(sdf.format(hspCfxxInfoQueryDto.getStartdate())); //开始时间
		hl7QpdCustom.setQpd3_5(sdf.format(hspCfxxInfoQueryDto.getEnddate())); //结束时间
		HL7Util.setHL7QpdPatientService(qpd, hl7QpdCustom, qbp_Q11);
		RCP rcp = qbp_Q11.getRCP();
        rcp.getRcp1_QueryPriority().setValue("I"); //即时应答
        logger.info("传参："+qbp_Q11.toString());
        cmd.setArgs(new Object[] {qbp_Q11});
        Object reVal = client.remoteCall(cmd, 0);
        /*Object reVal = "MSH|^~\\&|EMR||EMIS||20200509161511||RSP^Z10^RSP_Z10|eb9f36f8-14a2-420e-9314-5b4ff8e45794|P|2.6|||NE|AL||utf-8\r"
        		+ "MSA|AA|4c9e6c27106a425398dd600a9b88a422\r"
        		+ "QAK|Z1002|||46|46|0\r"
        		+ "QPD|Z10^查询处置单|Z1002|1^3000010834^^20190415012330^20200428152330\r"
        		+ "PID||3000010834|||俞水澄^^^YU SHUI CHENG||19430907000000|1\r"
        		+ "PV1||1|101030102||||||||||||||||27||||||||||||||||||||ZJYY02|||||20200416102342\r"
        		+ "ORC|NW|10172947|02E202004-1801532|12925892|2|0|||20200418145135|||A2951^姜源|||||||||急诊科门诊^^101030102||||||||A|||急诊药房^^102030103\r"
        		+ "TQ1|1||59&ST(即用)|||1.0^&1|202004180700\r"
        		+ "RXO|155541790^5%葡萄糖针^^250ml^C19050205^浙江国镜药业|250||ml||||||||||||||||0^否\r"
        		+ "RXR|B5^静滴\r"
        		+ "ORC|NW|10172946|02E202004-1801532|12925892|2|0|||20200418145135|||A2951^姜源|||||||||急诊科门诊^^101030102||||||||A|||急诊药房^^102030103\r"
        		+ "TQ1|1||59&ST(即用)|||1.0^&1|202004180700\r"
        		+ "RXO|11010202ZJ001000^莫西沙星针[舒倍达]^^0.4g:20ml^11190820^成都天台山制药有限公司|0.4||g||||||||||||||||0^否||||2^限制级抗菌药物^^经验性治疗\r"
        		+ "RXR|B5^静滴\r"
        		+ "ORC|NW|10164478|02E202004-1702525|12915300|2|0|||20200417194514|||A2744^刘袁直美|||||||||急诊科门诊^^101030102||||||||A|||急诊药房^^102030103\r"
        		+ "TQ1|1||1&Qd(每日一次)|||1.0^&1|202004170830\r"
        		+ "RXO|110731800^氨溴索针[沐舒坦]^^15mg:2ml^825901 B82832^上海勃林格|30||mg||||||||||||||||0^否\r"
        		+ "RXR|B5^静滴\r"
        		+ "ORC|NW|10164477|02E202004-1702525|12915300|2|0|||20200417194514|||A2744^刘袁直美|||||||||急诊科门诊^^101030102||||||||A|||急诊药房^^102030103\r"
        		+ "TQ1|1||1&Qd(每日一次)|||1.0^&1|202004170830\r"
        		+ "RXO|43661790^0.9%氯化钠针^^100ml^B19090103B^浙江国镜药业|100||ml||||||||||||||||0^否\r"
        		+ "RXR|B5^静滴\r"
        		+ "ORC|NW|10135300|02E202004-1601317|12878587|2|1|||20200416121658|||A1858^赵峻峰|||||||||急诊科门诊^^101030102||||||||A|||急诊药房^^102030103\r"
        		+ "TQ1|1||59&ST(即用)|||1.0^&1|202004160700\r"
        		+ "RXO|155541790^5%葡萄糖针^^250ml^C19050205^浙江国镜药业|250||ml||||||||||||||||0^否\r"
        		+ "RXR|B5^静滴\r"
        		+ "ORC|NW|10135299|02E202004-1601317|12878587|2|1|||20200416121658|||A1858^赵峻峰|||||||||急诊科门诊^^101030102||||||||A|||急诊药房^^102030103\r"
        		+ "TQ1|1||59&ST(即用)|||1.0^&1|202004160700\r"
        		+ "RXO|11010202ZJ001000^莫西沙星针[舒倍达]^^0.4g:20ml^11190820^成都天台山制药有限公司|0.4||g||||||||||||||||0^否||||2^限制级抗菌药物^^经验性治疗\r"
        		+ "RXR|B5^静滴\r"
        		+ "ORC|NW|10165681|02E202004-1702524|12915301|2|1|||20200417194514|||A2744^刘袁直美|||||||||急诊科门诊^^101030102||||||||A|||急诊药房^^102030103\r"
        		+ "TQ1|1||59&ST(即用)|||1.0^&1|202004170700\r"
        		+ "RXO|28771733^0.9%氯化钠针^^90mg:10ml^9L88A1^中国大冢|2||ml||||||||||||||||0^否\r"
        		+ "RXR|M12^雾化\r"
        		+ "ORC|NW|10165680|02E202004-1702524|12915301|2|1|||20200417194514|||A2744^刘袁直美|||||||||急诊科门诊^^101030102||||||||A|||急诊药房^^102030103\r"
        		+ "TQ1|1||59&ST(即用)|||1.0^&1|202004170700\r"
        		+ "RXO|68292464^布地奈德液[普米克令舒]^^1mg:2ml*5^325571^澳阿斯利康|2||ml||||||||||||||||0^否\r"
        		+ "RXR|M12^雾化\r"
        		+ "ORC|NW|10165679|02E202004-1702524|12915301|2|1|||20200417194514|||A2744^刘袁直美|||||||||急诊科门诊^^101030102||||||||A|||急诊药房^^102030103\r"
        		+ "TQ1|1||59&ST(即用)|||1.0^&1|202004170700\r"
        		+ "RXO|92572895^吸入用复方异丙托溴铵溶液[可必特]^^2.5ml*10^8984060^勃林格殷格翰|2.5||ml||||||||||||||||0^否\r"
        		+ "RXR|M12^雾化\r"
        		+ "ORC|NW|10142817|02E202004-1601912|12887666|2|0|||20200416164955|||A2951^姜源|||||||||急诊科门诊^^101030102||||||||A|||急诊药房^^102030103\r"
        		+ "TQ1|1||1&Qd(每日一次)|||1.0^&1|202004160830\r"
        		+ "RXO|159261790^5%葡萄糖针^^500ml^C19081505^浙江国镜药业|500||ml||||||||||||||||0^否\r"
        		+ "RXR|B5^静滴\r"
        		+ "ORC|NW|10164985|02E202004-1702490|12914936|2|0|||20200417183455|||A2744^刘袁直美|||||||||急诊科门诊^^101030102||||||||A|||急诊药房^^102030103\r"
        		+ "TQ1|1||59&ST(即用)|||1.0^&1|202004170700\r"
        		+ "RXO|97691733^氯化钾针^^1.0g:10ml^9K92K3^中国大冢|1.5||g||||||||||||||||0^否\r"
        		+ "RXR|B5^静滴\r"
        		+ "ORC|NW|10164984|02E202004-1702490|12914936|2|0|||20200417183455|||A2744^刘袁直美|||||||||急诊科门诊^^101030102||||||||A|||急诊药房^^102030103\r"
        		+ "TQ1|1||59&ST(即用)|||1.0^&1|202004170700\r"
        		+ "RXO|159261790^5%葡萄糖针^^500ml^C19081505^浙江国镜药业|500||ml||||||||||||||||0^否\r"
        		+ "RXR|B5^静滴\r"
        		+ "ORC|NW|10144381|02E202004-1602018|12889441|2|0|||20200416193237|||A2210^王仁女|||||||||急诊科门诊^^101030102||||||||A|||急诊药房^^102030103\r"
        		+ "TQ1|1||59&ST(即用)|||1.0^&1|202004160700\r"
        		+ "RXO|155511790^0.9%氯化钠针^^250ml^C19050704^浙江国镜药业|250||ml||||||||||||||||0^否\r"
        		+ "RXR|B5^静滴\r"
        		+ "ORC|NW|10144380|02E202004-1602018|12889441|2|0|||20200416193237|||A2210^王仁女|||||||||急诊科门诊^^101030102||||||||A|||急诊药房^^102030103\r"
        		+ "TQ1|1||59&ST(即用)|||1.0^&1|202004160700\r"
        		+ "RXO|01190^灭菌注射用水^^500ml^200118-3C^浙江莎普爱思|250||ml||||||||||||||||0^否\r"
        		+ "RXR|B5^静滴\r"
        		+ "ORC|NW|10143188|02E202004-1601915|12888219|2|0|||20200416165114|||A2951^姜源|||||||||急诊科门诊^^101030102||||||||A|||急诊药房^^102030103\r"
        		+ "TQ1|1||1&Qd(每日一次)|||1.0^&1|202004160830\r"
        		+ "RXO|110731800^氨溴索针[沐舒坦]^^15mg:2ml^825885 B76211^上海勃林格|30||mg||||||||||||||||0^否\r"
        		+ "RXR|B5^静滴\r"
        		+ "ORC|NW|10143187|02E202004-1601915|12888219|2|0|||20200416165114|||A2951^姜源|||||||||急诊科门诊^^101030102||||||||A|||急诊药房^^102030103\r"
        		+ "TQ1|1||1&Qd(每日一次)|||1.0^&1|202004160830\r"
        		+ "RXO|43661790^0.9%氯化钠针^^100ml^B19090103B^浙江国镜药业|100||ml||||||||||||||||0^否\r"
        		+ "RXR|B5^静滴\r"
        		+ "ORC|NW|10145369|02E202004-1700068|12890952|2|1|||20200417021432|||A2210^王仁女|||||||||急诊科门诊^^101030102||||||||A|||急诊药房^^102030103\r"
        		+ "TQ1|1||1&Qd(每日一次)|||1.0^&1|202004170830\r"
        		+ "RXO|97691733^氯化钾针^^1.0g:10ml^9K92K3^中国大冢|1.5||g||||||||||||||||0^否\r"
        		+ "RXR|B5^静滴\r"
        		+ "ORC|NW|10145368|02E202004-1700068|12890952|2|1|||20200417021432|||A2210^王仁女|||||||||急诊科门诊^^101030102||||||||A|||急诊药房^^102030103\r"
        		+ "TQ1|1||1&Qd(每日一次)|||1.0^&1|202004170830\r"
        		+ "RXO|159261790^5%葡萄糖针^^500ml^C19081505^浙江国镜药业|500||ml||||||||||||||||0^否\r"
        		+ "RXR|B5^静滴\r"
        		+ "ORC|NW|10135202|02E202004-1601345|12878849|2|0|||20200416123742|||A1858^赵峻峰|||||||||急诊科门诊^^101030102||||||||A|||急诊药房^^102030103\r"
        		+ "TQ1|1||59&ST(即用)|||1.0^&1|202004160700\r"
        		+ "RXO|155511790^0.9%氯化钠针^^250ml^C19050704^浙江国镜药业|250||ml||||||||||||||||0^否\r"
        		+ "RXR|B5^静滴\r"
        		+ "ORC|NW|10135201|02E202004-1601345|12878849|2|0|||20200416123742|||A1858^赵峻峰|||||||||急诊科门诊^^101030102||||||||A|||急诊药房^^102030103\r"
        		+ "TQ1|1||59&ST(即用)|||1.0^&1|202004160700\r"
        		+ "RXO|01190^灭菌注射用水^^500ml^200120-1C;200118-3C^浙江莎普爱思|250||ml||||||||||||||||0^否\r"
        		+ "RXR|B5^静滴\r"
        		+ "ORC|NW|10147400|02E202004-1700367|12893685|2|0|||20200417084749|||A1665^张丰明|||||||||急诊科门诊^^101030102||||||||A|||急诊药房^^102030103\r"
        		+ "TQ1|1||59&ST(即用)|||1.0^&1|202004170700\r"
        		+ "RXO|155541790^5%葡萄糖针^^250ml^C19050205^浙江国镜药业|250||ml||||||||||||||||0^否\r"
        		+ "RXR|B5^静滴\r"
        		+ "ORC|NW|10147399|02E202004-1700367|12893685|2|0|||20200417084749|||A1665^张丰明|||||||||急诊科门诊^^101030102||||||||A|||急诊药房^^102030103\r"
        		+ "TQ1|1||59&ST(即用)|||1.0^&1|202004170700\r"
        		+ "RXO|11010202ZJ001000^莫西沙星针[舒倍达]^^0.4g:20ml^11190820^成都天台山制药有限公司|0.4||g||||||||||||||||0^否||||2^限制级抗菌药物^^经验性治疗\r"
        		+ "RXR|B5^静滴\r"
        		+ "ORC|NW|10147402|02E202004-1700367|12893686|2|0|||20200417084749|||A1665^张丰明|||||||||急诊科门诊^^101030102||||||||A|||急诊药房^^102030103\r"
        		+ "TQ1|1||59&ST(即用)|||1.0^&1|202004170700\r"
        		+ "RXO|97691733^氯化钾针^^1.0g:10ml^9K92K3^中国大冢|1.5||g||||||||||||||||0^否\r"
        		+ "RXR|B5^静滴\r"
        		+ "ORC|NW|10147401|02E202004-1700367|12893686|2|0|||20200417084749|||A1665^张丰明|||||||||急诊科门诊^^101030102||||||||A|||急诊药房^^102030103\r"
        		+ "TQ1|1||59&ST(即用)|||1.0^&1|202004170700\r"
        		+ "RXO|159261790^5%葡萄糖针^^500ml^C19081505^浙江国镜药业|500||ml||||||||||||||||0^否\r"
        		+ "RXR|B5^静滴\r"
        		+ "ORC|NW|10155645|02E202004-1701329|12904058|2|0|||20200417114400|||A1665^张丰明|||||||||急诊科门诊^^101030102||||||||A|||急诊药房^^102030103\r"
        		+ "TQ1|1||59&ST(即用)|||1.0^&1|202004170700\r"
        		+ "RXO|97691733^氯化钾针^^1.0g:10ml^9K92K3^中国大冢|1.5||g||||||||||||||||0^否\r"
        		+ "RXR|B5^静滴\r"
        		+ "ORC|NW|10155644|02E202004-1701329|12904058|2|0|||20200417114400|||A1665^张丰明|||||||||急诊科门诊^^101030102||||||||A|||急诊药房^^102030103\r"
        		+ "TQ1|1||59&ST(即用)|||1.0^&1|202004170700\r"
        		+ "RXO|155551790^10%葡萄糖针^^500ml^C20010803^浙江国镜药业|500||ml||||||||||||||||0^否\r"
        		+ "RXR|B5^静滴\r"
        		+ "ORC|NW|10172027|02E202004-1801269|12924679|2|0|||20200418134432|||A2951^姜源|||||||||急诊科门诊^^101030102||||||||A|||急诊药房^^102030103\r"
        		+ "TQ1|1||59&ST(即用)|||1.0^&1|202004180700\r"
        		+ "RXO|43661790^0.9%氯化钠针^^100ml^B19090602A;B19090103B^浙江国镜药业|100||ml||||||||||||||||0^否\r"
        		+ "RXR|B5^静滴\r"
        		+ "ORC|NW|10172026|02E202004-1801269|12924679|2|0|||20200418134432|||A2951^姜源|||||||||急诊科门诊^^101030102||||||||A|||急诊药房^^102030103\r"
        		+ "TQ1|1||59&ST(即用)|||1.0^&1|202004180700\r"
        		+ "RXO|15804210^(小)头孢哌酮舒巴坦针[舒普深]^^(1:1)1g/瓶^CF7825^辉瑞制药|2||g||||||||||||||||0^否||||2^限制级抗菌药物^^经验性治疗\r"
        		+ "RXR|B5^静滴\r"
        		+ "ORC|NW|10164465|02E202004-1702491|12915279|2|0|||20200417183643|||A1858^赵峻峰|||||||||急诊科门诊^^101030102||||||||A|||急诊药房^^102030103\r"
        		+ "TQ1|1||59&ST(即用)|||1.0^&1|202004170700\r"
        		+ "RXO|43661790^0.9%氯化钠针^^100ml^B19091104B^浙江国镜药业|100||ml||||||||||||||||0^否\r"
        		+ "RXR|B5^静滴\r"
        		+ "ORC|NW|10164464|02E202004-1702491|12915279|2|0|||20200417183643|||A1858^赵峻峰|||||||||急诊科门诊^^101030102||||||||A|||急诊药房^^102030103\r"
        		+ "TQ1|1||59&ST(即用)|||1.0^&1|202004170700\r"
        		+ "RXO|15804210^(小)头孢哌酮舒巴坦针[舒普深]^^(1:1)1g/瓶^CH0474^辉瑞制药|2||g||||||||||||||||0^否||||2^限制级抗菌药物^^经验性治疗\r"
        		+ "RXR|B5^静滴\r"
        		+ "ORC|NW|10172025|02E202004-1801270|12924678|2|0|||20200418134432|||A2951^姜源|||||||||急诊科门诊^^101030102||||||||A|||急诊药房^^102030103\r"
        		+ "TQ1|1||1&Qd(每日一次)|||1.0^&1|202004180830\r"
        		+ "RXO|110731800^氨溴索针[沐舒坦]^^15mg:2ml^825901 B82832^上海勃林格|30||mg||||||||||||||||0^否\r"
        		+ "RXR|B5^静滴\r"
        		+ "ORC|NW|10172024|02E202004-1801270|12924678|2|0|||20200418134432|||A2951^姜源|||||||||急诊科门诊^^101030102||||||||A|||急诊药房^^102030103\r"
        		+ "TQ1|1||1&Qd(每日一次)|||1.0^&1|202004180830\r"
        		+ "RXO|43661790^0.9%氯化钠针^^100ml^B19090602A;B19090103B^浙江国镜药业|100||ml||||||||||||||||0^否\r"
        		+ "RXR|B5^静滴\r"
        		+ "ORC|NW|10135641|02E202004-1601329|12878637|2|0|||20200416122438|||A1858^赵峻峰|||||||||急诊科门诊^^101030102||||||||A|||急诊药房^^102030103\r"
        		+ "TQ1|1||59&ST(即用)|||1.0^&1|202004160700\r"
        		+ "RXO|155511790^0.9%氯化钠针^^250ml^C19050704^浙江国镜药业|250||ml||||||||||||||||0^否\r"
        		+ "RXR|B5^静滴\r"
        		+ "ORC|NW|10135640|02E202004-1601329|12878637|2|0|||20200416122438|||A1858^赵峻峰|||||||||急诊科门诊^^101030102||||||||A|||急诊药房^^102030103\r"
        		+ "TQ1|1||59&ST(即用)|||1.0^&1|202004160700\r"
        		+ "RXO|01190^灭菌注射用水^^500ml^200120-1C;200118-3C^浙江莎普爱思|250||ml||||||||||||||||0^否\r"
        		+ "RXR|B5^静滴\r"
        		+ "ORC|NW|10172023|02E202004-1801268|12924677|2|1|||20200418134432|||A2951^姜源|||||||||急诊科门诊^^101030102||||||||A|||急诊药房^^102030103\r"
        		+ "TQ1|1||59&ST(即用)|||1.0^&1|202004180700\r"
        		+ "RXO|28771733^0.9%氯化钠针^^90mg:10ml^9L88A1^中国大冢|2||ml||||||||||||||||0^否\r"
        		+ "RXR|M12^雾化\r"
        		+ "ORC|NW|10172022|02E202004-1801268|12924677|2|1|||20200418134432|||A2951^姜源|||||||||急诊科门诊^^101030102||||||||A|||急诊药房^^102030103\r"
        		+ "TQ1|1||59&ST(即用)|||1.0^&1|202004180700\r"
        		+ "RXO|68292464^布地奈德液[普米克令舒]^^1mg:2ml*5^325571^澳阿斯利康|2||ml||||||||||||||||0^否\r"
        		+ "RXR|M12^雾化\r"
        		+ "ORC|NW|10172021|02E202004-1801268|12924677|2|1|||20200418134432|||A2951^姜源|||||||||急诊科门诊^^101030102||||||||A|||急诊药房^^102030103\r"
        		+ "TQ1|1||59&ST(即用)|||1.0^&1|202004180700\r"
        		+ "RXO|92572895^吸入用复方异丙托溴铵溶液[可必特]^^2.5ml*10^8984060^勃林格殷格翰|2.5||ml||||||||||||||||0^否\r"
        		+ "RXR|M12^雾化\r"
        		+ "ORC|NW|10155638|02E202004-1701311|12904052|2|1|||20200417114039|||A1665^张丰明|||||||||急诊科门诊^^101030102||||||||Q\r"
        		+ "TQ1|1||1&Qd(每日一次)|||1.0\r"
        		+ "RXO|15804210^(小)头孢哌酮舒巴坦针[舒普深]|1||||||||||||||||||0^否\r"
        		+ "RXR|B5^静滴\r"
        		+ "ORC|NW|10155640|02E202004-1701310|12904053|2|0|||20200417114039|||A1665^张丰明|||||||||急诊科门诊^^101030102||||||||A|||急诊药房^^102030103\r"
        		+ "TQ1|1||59&ST(即用)|||1.0^&1|202004170700\r"
        		+ "RXO|43661790^0.9%氯化钠针^^100ml^B19090103B^浙江国镜药业|100||ml||||||||||||||||0^否\r"
        		+ "RXR|B5^静滴\r"
        		+ "ORC|NW|10155639|02E202004-1701310|12904053|2|0|||20200417114039|||A1665^张丰明|||||||||急诊科门诊^^101030102||||||||A|||急诊药房^^102030103\r"
        		+ "TQ1|1||59&ST(即用)|||1.0^&1|202004170700\r"
        		+ "RXO|15804210^(小)头孢哌酮舒巴坦针[舒普深]^^(1:1)1g/瓶^CF7825^辉瑞制药|2||g||||||||||||||||0^否||||2^限制级抗菌药物^^经验性治疗\r"
        		+ "RXR|B5^静滴\r"
        		+ "ORC|NW|10166708|02E202004-1800036|12917227|2|1|||20200418022453|||A1858^赵峻峰|||||||||急诊科门诊^^101030102||||||||A|||急诊药房^^102030103\r"
        		+ "TQ1|1||59&ST(即用)|||1.0^&1|202004180700\r"
        		+ "RXO|43661790^0.9%氯化钠针^^100ml^B19090103B^浙江国镜药业|100||ml||||||||||||||||0^否\r"
        		+ "RXR|B5^静滴\r"
        		+ "ORC|NW|10166707|02E202004-1800036|12917227|2|1|||20200418022453|||A1858^赵峻峰|||||||||急诊科门诊^^101030102||||||||A|||急诊药房^^102030103\r"
        		+ "TQ1|1||59&ST(即用)|||1.0^&1|202004180700\r"
        		+ "RXO|15804210^(小)头孢哌酮舒巴坦针[舒普深]^^(1:1)1g/瓶^CF7825^辉瑞制药|2||g||||||||||||||||0^否||||2^限制级抗菌药物^^经验性治疗\r"
        		+ "RXR|B5^静滴\r"
        		+ "ORC|NW|10166710|02E202004-1800036|12917228|2|1|||20200418022453|||A1858^赵峻峰|||||||||急诊科门诊^^101030102||||||||A|||急诊药房^^102030103\r"
        		+ "TQ1|1||59&ST(即用)|||1.0^&1|202004180700\r"
        		+ "RXO|97691733^氯化钾针^^1.0g:10ml^9K92K3^中国大冢|1.5||g||||||||||||||||0^否\r"
        		+ "RXR|B5^静滴\r"
        		+ "ORC|NW|10166709|02E202004-1800036|12917228|2|1|||20200418022453|||A1858^赵峻峰|||||||||急诊科门诊^^101030102||||||||A|||急诊药房^^102030103\r"
        		+ "TQ1|1||59&ST(即用)|||1.0^&1|202004180700\r"
        		+ "RXO|159261790^5%葡萄糖针^^500ml^C19081505^浙江国镜药业|500||ml||||||||||||||||0^否\r"
        		+ "RXR|B5^静滴\r"
        		+ "ORC|NW|10145677|02E202004-1700113|12891179|2|0|||20200417073256|||A2210^王仁女|||||||||急诊科门诊^^101030102||||||||A|||急诊药房^^102030103\r"
        		+ "TQ1|1||59&ST(即用)|||1.0^&1|202004170700\r"
        		+ "RXO|155511790^0.9%氯化钠针^^250ml^C19050704^浙江国镜药业|250||ml||||||||||||||||0^否\r"
        		+ "RXR|B5^静滴\r"
        		+ "ORC|NW|10145676|02E202004-1700113|12891179|2|0|||20200417073256|||A2210^王仁女|||||||||急诊科门诊^^101030102||||||||A|||急诊药房^^102030103\r"
        		+ "TQ1|1||59&ST(即用)|||1.0^&1|202004170700\r"
        		+ "RXO|01190^灭菌注射用水^^500ml^200118-3C^浙江莎普爱思|250||ml||||||||||||||||0^否\r"
        		+ "RXR|B5^静滴\r";*/
        logger.info("返参："+reVal.toString());
        RDE_O11 rde_O11 =  HL7Util.hl7Text2Msg(reVal.toString().replace("RSP_Z10", "RDE_O11"), RDE_O11.class);
        List<String> keyList = hspCfxxExecCustomList.stream().map(e -> e.getExecSeq()).collect(Collectors.toList());
        List<String> daSeqList = new ArrayList<String>();
        //去除作废医嘱
        List<HspCfxxInfoCustom> cfxxList = hspCfxxInfoQueryDto.getCfxxList().stream().filter(e -> !"作废".equals(e.getOrderStatus())).collect(Collectors.toList());
        for (HspCfxxInfoCustom hspCfxxInfoCustom : cfxxList) {
        	daSeqList.add(hspCfxxInfoCustom.getDaNo());
		}
        List<HspCfxxExecCustom> execListNew = paserMsgToCfxxExecCustom(rde_O11,hspCfxxInfoQueryDto.getVstCad(),hspCfxxInfoQueryDto.getMPI(),keyList,activeUser,daSeqList);
        hspCfxxExecCustomList.addAll(execListNew);
		return execListNew;
	}
	
	
	/**
	 * 处理HL7接口执行单数据
	 * @param rde_O11
	 * @param vstCad
	 * @param mpi
	 * @return
	 * @throws Exception
	 * @throws HL7Exception
	 */
	private static List< HspCfxxExecCustom> paserMsgToCfxxExecCustom(RDE_O11 rde_O11,String vstCad,String mpi,List<String> keyList,
			ActiveUser activeUser,List<String> daSeqList) throws Exception {
		List<RDE_O11_ORDER> rde_O11_ORDERList = rde_O11.getORDERAll();
		List<HspCfxxExecCustom> execListNew = new ArrayList<HspCfxxExecCustom>();
		for(int i =0; rde_O11_ORDERList != null && i<rde_O11_ORDERList.size(); i++){
			HspCfxxExecCustom hspCfxxExecCustom = new HspCfxxExecCustom();
			ORC orc = rde_O11_ORDERList.get(i).getORC();
			if(!orc.isEmpty()){
				String execSeq = "EXEC" + orc.getOrc2_PlacerOrderNumber().getEi1_EntityIdentifier().getValue() 
						+ orc.getOrc3_FillerOrderNumber().getEi1_EntityIdentifier().getValue()
						+ orc.getOrc4_PlacerGroupNumber().getEi1_EntityIdentifier().getValue();
				if(keyList != null && keyList.contains(execSeq)){
					continue;
				}
				if(!StringUtils.isNotNullAndZero(daSeqList)){
					continue;
				}else{
					if(!daSeqList.contains(orc.getOrc4_PlacerGroupNumber().getEi1_EntityIdentifier().getValue())){
						continue;
					}
				}
				hspCfxxExecCustom.setExecSeq(execSeq);
				hspCfxxExecCustom.setDaSeq(orc.getOrc2_PlacerOrderNumber().getEi1_EntityIdentifier().getValue());
				hspCfxxExecCustom.setDisposalSeq(orc.getOrc4_PlacerGroupNumber().getEi1_EntityIdentifier().getValue());
				hspCfxxExecCustom.setDaNo(orc.getOrc4_PlacerGroupNumber().getEi1_EntityIdentifier().getValue());
				hspCfxxExecCustom.setDaSub(orc.getOrc4_PlacerGroupNumber().getEi1_EntityIdentifier().getValue());
				hspCfxxExecCustom.setVstCad(vstCad);
				hspCfxxExecCustom.setZxddat(orc.getOrc9_DateTimeOfTransaction().getValueAsDate());
				hspCfxxExecCustom.setStartDoct(orc.getOrc12_OrderingProvider(0).getXcn2_FamilyName().getFn1_Surname().getValue());
			}
			String daInfo = "";
			RXO rxo = rde_O11_ORDERList.get(i).getORDER_DETAIL().getRXO();
			if(!rxo.isEmpty()){
				daInfo += rxo.getRxo1_RequestedGiveCode().getCwe2_Text().getValue() +" ";
//				if(StringUtils.isNotNullAndEmptyByTrim(rxo.getRxo1_RequestedGiveCode().getCwe4_AlternateIdentifier().getValue())){
//					daInfo+=rxo.getRxo1_RequestedGiveCode().getCwe4_AlternateIdentifier().getValue()+" ";
//				}
				hspCfxxExecCustom.setDaDose(rxo.getRxo2_RequestedGiveAmountMinimum().getValue());
				hspCfxxExecCustom.setDaUnit(rxo.getRxo4_RequestedGiveUnits().getCwe1_Identifier().getValue());
			}
			RXR rxr = rde_O11_ORDERList.get(i).getORDER_DETAIL().getRXR();
			if(!rxr.isEmpty()){
				//daInfo += rxr.getRxr1_Route().getCwe2_Text().getValue() + " ";
				String daWayCod = rxr.getRxr1_Route().getCwe1_Identifier().getValue();
				hspCfxxExecCustom.setDaWayCod(daWayCod);
				hspCfxxExecCustom.setDaWay(rxr.getRxr1_Route().getCwe2_Text().getValue());
			}
			TQ1 tq1 = rde_O11_ORDERList.get(i).getTIMING().getTQ1();
			if(!tq1.isEmpty()){
				//daInfo += tq1.getTq13_RepeatPattern(0).getRpt1_RepeatPatternCode().getCwe2_Text().getValue();
				hspCfxxExecCustom.setDaFreq(tq1.getTq13_RepeatPattern(0).getRpt1_RepeatPatternCode().getCwe2_Text().getValue());
				hspCfxxExecCustom.setDisposalSeq(hspCfxxExecCustom.getDisposalSeq() + tq1.getTq17_StartDateTime().getValue());
				try {
					hspCfxxExecCustom.setPlanTime(tq1.getTq17_StartDateTime().getValueAsDate());
				} catch (Exception e) {
					hspCfxxExecCustom.setPlanTime(new Date());
					logger.error("时间格式有误："+tq1.getTq17_StartDateTime().getValue(), e);
				}
			}
			hspCfxxExecCustom.setDaInfo(daInfo);
			hspCfxxExecCustom.setMpi(mpi);
			hspCfxxExecCustom.setExecSrc("1");
			hspCfxxExecCustom.setIsprint("0");
			hspCfxxExecCustom.setZxdzt("8");
			hspCfxxExecCustom.setCrtTime(new Date());
			hspCfxxExecCustom.setCrtUser(activeUser.getUsrname());
			hspCfxxExecCustom.setModTime(new Date());
			hspCfxxExecCustom.setModUser(activeUser.getUsrname());
			execListNew.add(hspCfxxExecCustom);
		}
		return execListNew;
	}
	
}
