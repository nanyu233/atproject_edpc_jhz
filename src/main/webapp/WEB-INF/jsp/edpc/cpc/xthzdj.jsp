<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>

<head>
    <base href="<%=basePath%>">

    <title>急性胸痛患者诊疗时间记录表</title>

    <meta http-equiv="pragma" content="no-cache">
    <meta http-equiv="cache-control" content="no-cache">
    <meta http-equiv="expires" content="0">
    <meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
    <meta http-equiv="description" content="急性胸痛患者诊疗时间记录表">
	<link rel="stylesheet" type="text/css" href="lib/easyui1.3/themes/default/easyui.css"/>
	<!-- <link rel="stylesheet" type="text/css" href="lib/My97DatePicker/skin/WdatePicker.css"/> -->
    <script type="text/javascript" src="lib/moment.min.js"></script>
    <!-- <script type="text/javascript" src="lib/My97DatePicker/WdatePicker.js"></script> -->
    <script type="text/javascript" src="lib/easyui1.3/jquery-1.8.0.min.js"></script>
    <script type="text/javascript" src="lib/easyui1.3/jquery.easyui.min.js"></script>
	<script src="js/public.js"></script>
    <script src="lib/avalon1.4.8/avalon.js" type="text/javascript" charset="UTF-8"></script>
    <script src="js/edpc/xt/xthzdj.avalon.js?6" type="text/javascript" charset="UTF-8"></script>
    <style>
        .info {
            border: 1px solid #ddd;
            margin-bottom: 10px;
        }

        .info h4 {
            margin: 10px 0;
            padding: 0 0 10px 10px;
            border-bottom: 1px solid #ddd;
        }
		.info .innerTitle{
			margin: 10px 0;
			padding: 10px 0 10px 10px;
			border-bottom: 1px solid #ddd;
			border-top: 1px solid #ddd;
		}
		
        .one {
            background-color: #FBD4B4;
        }

        .wrapper div {
            display: inline-block;
            /* border: 1px solid black; */
            margin: 10px 0 10px 10px;
        }

        .info input[type="text"] {
            border: none;
            border-bottom: 1px solid black;
            background-color: transparent;
            text-align: center;
            font-size: 15px;
        }

        .longInput {
            width: 132px !important;
        }

        .shortInput {
            width: 50px !important;
        }

        .Wdate {
            width: 178px;
        }

        .shortTimeInput {
            width: 75px !important;
        }

        .btns {
            border: 1px solid #ddd;
            text-align: center;
        }

        .btns a {
            display: inline-block;
            width: 120px;
            text-align: center;
            height: 35px;
            line-height: 35px;
            margin: 10px;
            border-radius: 5px;
            border: 1px solid #adcde2;
            background-color: #D2F0FF;
            cursor: pointer;
        }

        .hidden {
            display: none;
        }
    </style>

</head>

<body ms-controller="xthzdj">
<form id="" action="${baseurl}newprecheck/submitPrecheck.do" method="post">
    <div class="info">
        <h4>院前系统（120及网络医院）</h4>
        <div class="wrapper">
            <div>姓名：<input type="text" class="longInput" ms-duplex-string='msg.aidPatient["XINGM"]'></div>
            <div>
                性别：
                <input type="checkbox" ms-attr-checked="{{msg.aidPatient['XINGB'] == 0}}">男
                <input type="checkbox" ms-attr-checked="{{msg.aidPatient['XINGB'] == 1}}">女
            </div>
            <div>年龄：<input type="text" class="shortInput" ms-duplex-string='msg.aidPatient["NIANN"]'>岁
            </div>
            <div>发病地址：<input type="text" ms-duplex-string='addr[0]' class="longInput">
			    <input type="text" ms-duplex-string='addr[1]' class="longInput">
                <input type="text" ms-duplex-string='addr[2]' class="longInput">
            </div>
        </div>
        <div class="wrapper">
			<div>发病时间：<input type="text" class="Wdate" ms-duplex-string='msg.aidPatient["illTim"]'></div>
			<div>
				呼救120时间：<input type="text" class="Wdate" ms-duplex-string='msg.aidPatient["almtime"]'>
			</div>
			<div>
				首次医疗接触时间：<input type="text" class="Wdate" ms-duplex-string='msg.aidPatientXt["scyljc"]'>
			</div>
            <!-- <div>身份证号：<input type="text" style="width: 230px" ms-keyup="xtOnlyNum('000005')"
                             ms-duplex-string='msg.patientInfo["000005"]'></div>
            <div>门诊号：<input type="text" class="longInput" ms-duplex-string='msg.patientInfo["MENZH"]'></div>
            <div>住院号：<input type="text" class="longInput" ms-duplex-string='msg.patientInfo["000007"]'></div> -->
        </div>
        <div class="wrapper">
			<div>
				网络医院入门时间：<input type="text" class="Wdate" ms-duplex-string='msg.aidPatientXt["wlyyry"]'>
			</div>
			<div>
				转诊出门时间：<input type="text" class="Wdate" ms-duplex-string='msg.aidPatientXt["zzcm"]'>
			</div>
        </div>
        <div class="wrapper">
            <div>
				院前首份心电图时间：<input type="text" class="Wdate" ms-duplex-string='msg.aidPatientXt["sfxdt"]'>
			</div>
			<div>
				院前首份心电图确诊时间：<input type="text" class="Wdate"  ms-duplex-string='msg.aidPatientXt["sfxdtqz"]'>
			</div>
        </div>
        <div class="wrapper">
			<div>
				远程传输心电图：<input type="checkbox" ms-attr-checked="{{msg.aidPatientXt['ycxdtcs'] == 1}}"/>是
				<input type="checkbox" ms-attr-checked="{{msg.aidPatientXt['ycxdtcs'] == 0}}"/>否 ；	
			</div>
			<div>
				传输时间：<input type="text" class="Wdate" ms-duplex-string='msg.aidPatientXt["cssj"]'>
			</div>
			<div>
				传输方式：<input type="checkbox" ms-attr-checked="{{msg.aidPatientXt['csfs'] == 2}}"/>微信
				<input type="checkbox" ms-attr-checked="{{msg.aidPatientXt['csfs'] == 9}}"/>短信
			   <input type="checkbox" ms-attr-checked="{{msg.aidPatientXt['csfs'] == 1}}"/>实时监控
			</div>
		</div>
	    <div class="wrapper">
			<div>
				双联抗血小板药物给药：<input type="checkbox" ms-attr-checked="{{msg.aidPatientXt['kxxbgy'] == 1}}"/>是
				<input type="checkbox" ms-attr-checked="{{msg.aidPatientXt['kxxbgy'] == 0}}"/>否 
			</div>
			<div>
				给药时间：<input type="text" class="Wdate" ms-duplex-string='msg.aidPatientXt["gysj"]'>
			</div>
			<div>
				阿司匹林<input type="text" class="shortInput" ms-duplex-string='msg.aidPatientXt["aspl02"]'>mg
			</div>
			<div>
				替格瑞洛<input type="text" class="shortInput" ms-duplex-string='msg.aidPatientXt["tgrl"]'>mg/氯吡格雷<input type="text" class="shortInput" ms-duplex-string='msg.aidPatientXt["lpgl"]'/>mg
			</div>
		</div>
	    <div class="wrapper">
			<div>
				院前溶栓筛查：<input type="checkbox" ms-attr-checked="{{msg.aidPatientXt['yqrssc'] == 1}}"/>适合
				<input type="checkbox" ms-attr-checked="{{msg.aidPatientXt['yqrssc'] == 2}}"/>不适合
			   <input type="checkbox" ms-attr-checked="{{msg.aidPatientXt['yqrssc'] == 3}}"/>未筛查
			</div>
			<div>
				是否实施院前溶栓：<input type="checkbox" ms-attr-checked="{{msg.aidPatientXt['yqrs'] == 1}}"/>有
				<input type="checkbox" ms-attr-checked="{{msg.aidPatientXt['yqrs'] == 0}}"/>无
			</div>
			<div>
				溶栓场所：<input type="checkbox" ms-attr-checked="{{msg.aidPatientXt['rscs'] == 1}}"/>其他医院
				<input type="checkbox" ms-attr-checked="{{msg.aidPatientXt['rscs'] == 2}}"/>救护车
			</div>
		</div>
	    <div class="wrapper">
			<div>
				院前溶栓知情同意开始时间：<input type="text" class="Wdate" ms-duplex-string='msg.aidPatientXt["zqtyks"]'>
			</div>
			<div>
				签署知情同意时间：<input type="text" class="Wdate" ms-duplex-string='msg.aidPatientXt["qszqty"]'>
			</div>
		</div>
	    <div class="wrapper">
	    	<div>
	    		院前溶栓开始时间：<input type="text" class="Wdate" ms-duplex-string='msg.aidPatientXt["rsks"]'>
	    	</div>
	    	<div>
	    		院前溶栓结束时间：<input type="text" class="Wdate" ms-duplex-string='msg.aidPatientXt["rsjs"]'>
	    	</div>
			<div>
				溶栓后造影时间：<input type="text" class="Wdate" ms-duplex-string='msg.aidPatientXt["rshzy"]'>（心内科或导管室人员填写）
			</div>
	    </div>
	    <div class="wrapper">
			<div>
				院前溶栓药物：<input type="checkbox" ms-attr-checked="{{msg.aidPatientXt['rsyw'] == 1}}"/>一代
				<input type="checkbox" ms-attr-checked="{{msg.aidPatientXt['rsyw'] == 2}}"/>二代
			   <input type="checkbox" ms-attr-checked="{{msg.aidPatientXt['rsyw'] == 3}}"/>三代
			</div>
			<div>
				院前溶栓药物剂量：<input type="checkbox" ms-attr-checked="{{msg.aidPatientXt['rsywjl'] == 2}}"/>半量
				<input type="checkbox" ms-attr-checked="{{msg.aidPatientXt['rsywjl'] == 1}}"/>全量
			</div>
			<div>
				溶栓再通：<input type="checkbox" ms-attr-checked="{{msg.aidPatientXt['rszt'] == 1}}"/>是
				<input type="checkbox" ms-attr-checked="{{msg.aidPatientXt['rszt'] == 0}}"/>否
			</div>
		</div>
	    <div class="wrapper">
			<div>
				诊断：<input type="checkbox" ms-attr-checked="{{msg.aidPatientXt['zd'] == 1}}"/>STEMI
				<input type="checkbox" ms-attr-checked="{{msg.aidPatientXt['zd'] == 2}}"/>NSTEMI
			   <input type="checkbox" ms-attr-checked="{{msg.aidPatientXt['zd'] == 3}}"/>UA
			   <input type="checkbox" ms-attr-checked="{{msg.aidPatientXt['zd'] == 4}}"/>主动脉夹层
				<input type="checkbox" ms-attr-checked="{{msg.aidPatientXt['zd'] == 5}}"/>肺动脉栓塞
			   <input type="checkbox" ms-attr-checked="{{msg.aidPatientXt['zd'] == 7}}"/>其他
			</div>
			<div>
				转运至CPC：<input type="checkbox" ms-attr-checked="{{msg.aidPatientXt['zycs'] == 1}}"/>导管室
				<input type="checkbox" ms-attr-checked="{{msg.aidPatientXt['zycs'] == 2}}"/>急诊
			</div>
		</div>
	</div>
    <div class="info">
        <h4>急诊预检</h4>
        <div class="wrapper">
			<div>患者姓名：<input type="text" class="longInput" ms-duplex-string='msg.hspEmgInf["cstNam"]'></div>
			<div>
			    性别：
			    <input type="checkbox" ms-attr-checked="{{msg.hspEmgInf['cstSexCod'] == 0}}">男
				<input type="checkbox" ms-attr-checked="{{msg.hspEmgInf['cstSexCod'] == 1}}">女
			</div>
			<div>年龄：<input type="text" class="shortInput" ms-duplex-string='msg.hspEmgInf["cstAge"]'>岁
			</div>
			<div>发病地址：<input type="text" ms-duplex-string='addr[0]' class="longInput">省
			    <input type="text" ms-duplex-string='addr[1]' class="longInput">市/县
			    <input type="text" ms-duplex-string='addr[2]' class="longInput">
			</div>
		</div>
        <div class="wrapper">
			<div>
				发病时间：<input type="text" class="Wdate" ms-duplex-string='msg.ynfb["illTim"]'>
			</div>
			<div>
				到达医院大门时间：<input type="text" class="Wdate" ms-duplex-string='msg.hspEmgInf["ddyydmsj"]'>
			</div>
			<div>
				院内接诊时间：<input type="text" class="Wdate" ms-duplex-string='msg.hspEmgInf["emgDat"]'>
			</div>
		</div>
	    <div class="wrapper">
			<div>
				到达方式：<input type="checkbox" ms-attr-checked="{{msg.hspEmgInf.arvChlCod=='5'||msg.hspEmgInf.arvChlCod=='6'}}"/>120救护车
				<input type="checkbox" ms-attr-checked="{{msg.hspEmgInf.arvChlCod=='9'}}"/>外院转运（包含网络医院）
			    <input type="checkbox" ms-attr-checked="{{msg.hspEmgInf.arvChlCod=='0'||msg.hspEmgInf.arvChlCod=='1'||msg.hspEmgInf.arvChlCod=='2'||msg.hspEmgInf.arvChlCod=='3'||msg.hspEmgInf.arvChlCod=='4'}}"/>自行来院
				<input type="checkbox" ms-click="xhRadioClick('010017',3)"
				       ms-attr-checked="msg.ynfb['ynfb'] == 1"/>院内发病
				（发病科室：<input type="text" class="longInput" ms-duplex-string='msg.ynfb["illDep"]'>；
				床位医师接触时间：<input type="text" class="Wdate" ms-duplex-string='msg.ynfb["fstTim"]'>；
				患者离开科室时间：<input type="text" class="Wdate" ms-duplex-string='msg.ynfb["lveTim"]'>）
			</div>
		</div>
	    <div class="wrapper">
			<div>
				生命体征：意识
				<input type="checkbox" ms-attr-checked="{{msg.hspEmgInf.senRctCod=='0'}}"/>清醒
				<input type="checkbox" ms-attr-checked="{{msg.hspEmgInf.senRctCod=='1'}}"/>对语言有反应
			    <input type="checkbox" ms-attr-checked="{{msg.hspEmgInf.senRctCod=='2'}}"/>对刺痛有反应
				<input type="checkbox" ms-attr-checked="{{msg.hspEmgInf.senRctCod=='3'}}"/>对任何刺激无反应
			</div>
		</div>
		<div class="wrapper">
			<div>
				呼吸<input type="text" ms-duplex-string='msg.hspEmgInf["breNbr"]' class="shortInput">次/分
				脉搏<input type="text" class="shortInput" ms-duplex-string='msg.hspEmgInf["hrtRte"]' >次/分
				心率<input type="text" class="shortInput">次/分
				血压：<input type="text" ms-duplex-string='msg.hspEmgInf["sbpupNbr"]' class="shortInput">/<input type="text" ms-duplex-string='msg.hspEmgInf["sbpdownNbr"]' class="shortInput">mmHg
				末梢血氧饱和度：<input type="text" ms-duplex-string='msg.hspEmgInf["oxyNbr"]' class="shortInput">%
			</div>
		</div>
	    <div class="wrapper">
			<div>
				<input type="checkbox" ms-attr-checked="{{msg.hspEmgInf.cstDspCod=='5'}}"/>至胸痛诊室（急诊内科）
				<input type="checkbox" ms-attr-checked="{{msg.hspEmgInf.cstDspCod=='6'}}"/>至急诊科抢救室
				<input type="checkbox"/>至导管室
			</div>
		</div>
	</div>
    <div class="info">
        <h4>胸痛诊室（急诊内科）/发病科室</h4>
        <div class="wrapper">
            <div>院内首份心电图时间：<input type="text" class="Wdate" ms-duplex-string='msg.patientInfo["ynsfxdtsj"]'></div>
			<div>院内首份心电图确诊时间：<input type="text" class="Wdate" ms-duplex-string='msg.patientInfo["ynsfxdtqzsj"]'></div>
        </div>
		<div class="wrapper">
			<div>病情评估及合并情况：
			    <input type="checkbox" ms-attr-checked="{{msg.patientInfo.BQPG=='01'}}"/>持续性症状
				<input type="checkbox" ms-attr-checked="{{msg.patientInfo.BQPG == '02'}}"/>间断性症状
			    <input type="checkbox" ms-attr-checked="{{msg.patientInfo.BQPG == '03'}}"/>胸痛症状已缓解
				<input type="checkbox" ms-attr-checked="setChecked('BQPGMX','2')"/>腹痛
				<input type="checkbox" ms-attr-checked="setChecked('BQPGMX','3')"/>齿痛
				<input type="checkbox" ms-attr-checked="setChecked('BQPGMX','4')"/>肩背痛
				<input type="checkbox" ms-attr-checked="setChecked('BQPGMX','1')"/>呼吸困难
				<input type="checkbox"/>休克
				<input type="checkbox"/>突发意识丧失
				<input type="checkbox" ms-attr-checked="setChecked('BQPGMX','6')"/>合并心衰
				<input type="checkbox" ms-attr-checked="setChecked('BQPGMX','7')"/>合并恶性心率失常
				<input type="checkbox" ms-attr-checked="setChecked('BQPGMX','5')"/>合并出血
			</div>
		</div>
        <div class="wrapper">
            <div>肌钙蛋白抽血完成时间：<input type="text" class="Wdate" ms-duplex-string='msg.patientInfo["CXSJ"]'></div>
            <div>获得报告时间：<input type="text" class="Wdate" ms-duplex-string='msg.patientInfo["POCTSJ"]'></div>
			<div><input type="text" class="shortInput" ms-duplex-string='msg.hspEmgInf["ctni"]'>ng/ml</div>
        </div>
        <div class="wrapper">
			<div>
				实验室检查：Cr<input type="text" class="shortInput" ms-duplex-string='msg.hspEmgInf["cr"]'>u mol/L；
				D-dimer：<input type="text" class="shortInput" ms-duplex-string='msg.hspEmgInf["d2jt"]'>ug/L（mg/L）；
				BNP/NT-proBNP<input type="text" class="shortInput" ms-duplex-string='msg.hspEmgInf["bnp"]'>pg/ml
			</div>
        </div>
        <div class="wrapper">
            <div>
				辅助检查：通知心超检查时间：<input type="text" class="Wdate">；
				         心超检查完成时间：<input type="text" class="Wdate">；
						 通知CT检查时间：<input type="text" class="Wdate">；
						 增强CT检查开始时间：<input type="text" class="Wdate">
            </div>
        </div>
        <div class="wrapper">
            <div>
                诊断：
				<input type="checkbox"/>诊断中
				<input type="checkbox" ms-attr-checked="{{msg.patientInfo['JZZD'] == 1}}"/>STEMI
				<input type="checkbox" ms-attr-checked="{{msg.patientInfo['JZZD'] == 2}}"/>NSTEMI
				<input type="checkbox" ms-attr-checked="{{msg.patientInfo['JZZD'] == 3}}"/>UA
				<input type="checkbox" ms-attr-checked="{{msg.patientInfo['JZZD'] == 4}}"/>主动脉夹层
				<input type="checkbox" ms-attr-checked="{{msg.patientInfo['JZZD'] == 5}}"/>肺栓塞
				<input type="checkbox" ms-attr-checked="{{msg.patientInfo['JZZD'] == 6}}"/>非ACS胸痛
				<input type="checkbox" ms-attr-checked="{{msg.patientInfo['JZZD'] == 7}}"/>其它非心源性胸痛
				<input type="checkbox" ms-attr-checked="{{msg.patientInfo['JZZD'] == 8}}"/>放弃诊治，病因不明
				<input type="checkbox"/>诊断明确,患者放弃后续治疗
            </div>
			<div>诊断时间：<input type="text" class="Wdate" ms-duplex-string='msg.patientInfo["JZZDSJ"]'></div>
        </div>
        <div class="wrapper">
			<div>是否呼叫心内科会诊<input type="checkbox" 
					   ms-attr-checked="msg.patientInfo['SFHJXNKHZ'] == 1"/>是
				<input type="checkbox" 
					   ms-attr-checked="msg.patientInfo['SFHJXNKHZ'] == 0"/>否 ；
			</div>
			<div>呼叫时间：<input type="text" class="Wdate" ms-duplex-string="msg.patientInfo.invitationDate"></div>
		</div>
	    <h4 class="innerTitle">心内科会诊</h4>
		<div class="wrapper">
			<div>二线会诊时间（包含远程会诊）：<input type="text" class="Wdate" ms-duplex-string="msg.patientInfo.consulationDate"></div>
		</div>
	    <div class="wrapper">
			<div>
				诊断：
			   <input type="checkbox"/>诊断中
			   <input type="checkbox" ms-attr-checked="{{msg.patientInfo['CBZD'] == 1}}"/>STEMI
			   <input type="checkbox" ms-attr-checked="{{msg.patientInfo['CBZD'] == 2}}"/>NSTEMI
			   <input type="checkbox" ms-attr-checked="{{msg.patientInfo['CBZD'] == 3}}"/>UA
			   <input type="checkbox" ms-attr-checked="{{msg.patientInfo['CBZD'] == 4}}"/>主动脉夹层
			   <input type="checkbox" ms-attr-checked="{{msg.patientInfo['CBZD'] == 5}}"/>肺栓塞
			   <input type="checkbox" ms-attr-checked="{{msg.patientInfo['CBZD'] == 6}}"/>非ACS胸痛
			   <input type="checkbox" ms-attr-checked="{{msg.patientInfo['CBZD'] == 7}}"/>其它非心源性胸痛
			   <input type="checkbox" ms-attr-checked="{{msg.patientInfo['CBZD'] == 8}}"/>放弃诊治，病因不明
			   <input type="checkbox"/>诊断明确,患者放弃后续治疗
			</div>
			<div>诊断时间：<input type="text" class="Wdate" ms-duplex-string='msg.patientInfo["CBZDSJ"]'></div>
		</div>
		<div class="wrapper">
			<div>决定介入手术时间：<input type="text" class="Wdate" ms-duplex-string='msg.patientInfo["JDJRSSSJ"]'></div>
			<div>启动导管室时间：<input type="text" class="Wdate" ms-duplex-string='msg.patientInfo["QDDGSSJ"]'></div>
		</div>
		<div class="wrapper">
			<div>开始知情同意时间：<input type="text" class="Wdate" ms-duplex-string='msg.patientInfo["KSZQTYSJ"]'></div>
			<div>签署知情同意书时间：<input type="text" class="Wdate" ms-duplex-string='msg.patientInfo["QSZQTYSJ"]'></div>
		</div>
		<div class="wrapper">
			<div>
				院内溶栓筛查：
				<input type="checkbox" ms-attr-checked="{{msg.patientInfo['YNRSSC'] == '1'}}"/>合适
				<input type="checkbox" ms-attr-checked="{{msg.patientInfo['YNRSSC'] == '2'}}"/>不合适；	
			</div>
			<div>
				实施院内溶栓：
				<input type="checkbox" ms-attr-checked="{{msg.patientInfo['YNRSZL'] == '1'}}"/>有
				<input type="checkbox" ms-attr-checked="{{msg.patientInfo['YNRSZL'] == '0'}}"/>无
			</div>
		</div>
	    <div class="wrapper">
			<div>溶栓开始时间：<input type="text" class="Wdate" ms-duplex-string='msg.patientInfo["YNKSRSSJ"]'></div>
			<div>溶栓结束时间：<input type="text" class="Wdate" ms-duplex-string='msg.patientInfo["YNRSJSSJ"]'></div>
			<div>溶栓后造影时间：<input type="text" class="Wdate" ms-duplex-string='msg.patientInfo["YNRSHZYSJ"]'></div>
		</div>
	    <div class="wrapper">
			<div>
				溶栓药物：
				<input type="checkbox" ms-attr-checked="{{msg.patientInfo['YNYW'] == '1'}}"/>一代
				<input type="checkbox" ms-attr-checked="{{msg.patientInfo['YNYW'] == '2'}}"/>二代
				<input type="checkbox" ms-attr-checked="{{msg.patientInfo['YNYW'] == '3'}}"/>三代；
			</div>
		    <div>
				溶栓药物剂量：
				<input type="checkbox" ms-attr-checked="{{msg.patientInfo['YNJL'] == '1'}}"/>半量
				<input type="checkbox" ms-attr-checked="{{msg.patientInfo['YNJL'] == '2'}}"/>全量；
			</div>
			<div>
				溶栓再通：
				<input type="checkbox" ms-attr-checked="{{msg.patientInfo['YNRSZT'] == '1'}}"/>是
				<input type="checkbox" ms-attr-checked="{{msg.patientInfo['YNRSZT'] == '0'}}"/>否
			</div>
		</div>
	    <h4 class="innerTitle">急诊留观/心内病房/CCU</h4>
		<div class="wrapper">
			<div>复测心电图时间：<input type="text" class="Wdate" ms-duplex-string='msg.patientInfo["YNXDTSJ02"]'></div>
			<div>肌钙蛋白复测结果：<input type="text" class="shortInput" ms-duplex-string='msg.patientInfo["JGDBFCJG"]'>ng/ml；</div>
		</div>
		<div class="wrapper">
			<div>复测肌钙蛋白抽血完成时间：<input type="text" class="Wdate" ms-duplex-string='msg.patientInfo["FCJGDBSJ"]'></div>
			<div>复测肌钙蛋白报告时间：<input type="text" class="Wdate" ms-duplex-string='msg.patientInfo["FCJGDBBGSJ"]'></div>
		</div>
	    <div class="wrapper">
			<div>
				Grace危险分层：
				<input type="checkbox" ms-attr-checked="{{msg.hspGraceInf['gracewxfc'] == '1'}}"/>极高危
				<input type="checkbox" ms-attr-checked="{{msg.hspGraceInf['gracewxfc'] == '2'}}"/>高危
				<input type="checkbox" ms-attr-checked="{{msg.hspGraceInf['gracewxfc'] == '3'}}"/>中危
				<input type="checkbox" ms-attr-checked="{{msg.hspGraceInf['gracewxfc'] == '4'}}"/>低危
			</div>
		    <div>
				具备以下任意一条，即为极高危：
				<input type="checkbox" ms-attr-checked="setChecked('gracejgwtj02','1')"/>急性心力衰竭
				<input type="checkbox" ms-attr-checked="setChecked('gracejgwtj02','2')"/>致命性心律失常或心脏骤停
				<input type="checkbox" ms-attr-checked="setChecked('gracejgwtj02','3')"/>血液动力学不稳定或心原性休克
				<input type="checkbox" ms-attr-checked="setChecked('gracejgwtj02','4')"/>心肌梗死合并机械并发症
				<input type="checkbox" ms-attr-checked="setChecked('gracejgwtj02','5')"/>反复的ST-T 动态改变，尤其是伴随间歇性 ST 段抬高
				<input type="checkbox" ms-attr-checked="setChecked('gracejgwtj02','6')"/>药物治疗无效的反复发作或持续性胸痛
			</div>
		</div>
	    <div class="wrapper">
			<div>
				诊断	
				<input type="checkbox"/>诊断中
				<input type="checkbox" ms-attr-checked="{{msg.patientInfo['LGZD'] == 1}}"/>STEMI
				<input type="checkbox" ms-attr-checked="{{msg.patientInfo['LGZD'] == 2}}"/>NSTEMI
				<input type="checkbox" ms-attr-checked="{{msg.patientInfo['LGZD'] == 3}}"/>UA
				<input type="checkbox" ms-attr-checked="{{msg.patientInfo['LGZD'] == 4}}"/>主动脉夹层
				<input type="checkbox" ms-attr-checked="{{msg.patientInfo['LGZD'] == 5}}"/>肺栓塞
				<input type="checkbox" ms-attr-checked="{{msg.patientInfo['LGZD'] == 6}}"/>非ACS胸痛
				<input type="checkbox" ms-attr-checked="{{msg.patientInfo['LGZD'] == 7}}"/>其它非心源性胸痛
				<input type="checkbox" ms-attr-checked="{{msg.patientInfo['LGZD'] == 8}}"/>放弃诊治，病因不明
				<input type="checkbox"/>诊断明确,患者放弃后续治疗
			</div>
			<div>诊断时间：<input type="text" class="Wdate" ms-duplex-string='msg.patientInfo["LGZDSJ"]'></div>
		</div>
	</div>
    <div class="info">
		<h4>导管室</h4>
		<div class="wrapper">
			<div>
				急诊PCI启动方式<input type="checkbox" ms-click="xhRadioClick('JZPCI',1)"
					   ms-attr-checked="{{msg.['JZPCI'] == 1}}"/>绕行急诊
				<input type="checkbox" ms-click="xhRadioClick('JZPCI',2)"
					   ms-attr-checked="{{msg.['JZPCI'] == 2}}"/>绕行CCU
				<input type="checkbox" ms-click="xhRadioClick('JZPCI',3)"
				      ms-attr-checked="{{msg.['JZPCI'] == 3}}"/>病房启动
			</div>
		    <div>介入医生：<input type="text" class="shortInput" ms-duplex-string='msg.patientInfo["JRYS"]'/></div>
			<div>导管室激活时间：<input type="text" class="Wdate" ms-duplex-string='msg.patientInfo["DGSJHSJ"]'></div>
		</div>
		<div class="wrapper">
			<div>
				PCI血管路径：
				<input type="checkbox" ms-attr-checked="{{msg.patientInfo['RULU'] == '1'}}"/>桡动脉（左）
				<input type="checkbox" ms-attr-checked="{{msg.patientInfo['RULU'] == '2'}}"/>桡动脉（右）
				<input type="checkbox" ms-attr-checked="{{msg.patientInfo['RULU'] == '3'}}"/>股动脉
				<input type="checkbox" ms-attr-checked="{{msg.patientInfo['RULU'] == '4'}}"/>其它
			</div>
			<div>开始穿刺时间：<input type="text" class="Wdate" ms-duplex-string='msg.patientInfo["KSCCSJ"]'></div>
		</div>
	    <div class="wrapper">
			<div>造影开始时间：<input type="text" class="Wdate" ms-duplex-string='msg.patientInfo["ZYKSSJ"]'></div>
			<div>导丝通过时间：<input type="text" class="Wdate" ms-duplex-string='msg.patientInfo["DSTGSJ"]'></div>
			<div>手术完成时间：<input type="text" class="Wdate" ms-duplex-string='msg.patientInfo["PCISSWCSJ"]'></div>
			<div>阻塞性病变：<input type="checkbox"/>是
				<input type="checkbox"/>否</div>
		</div>
	    <div class="wrapper">
			<div>
				狭窄程度：
				<input type="checkbox" ms-attr-checked="{{msg.hspCrivelInf['xzcd'] == '1'}}"/><50%
				<input type="checkbox" ms-attr-checked="{{msg.hspCrivelInf['xzcd'] == '2'}}"/>50-69%
				<input type="checkbox" ms-attr-checked="{{msg.hspCrivelInf['xzcd'] == '3'}}"/>70-89%
				<input type="checkbox" ms-attr-checked="{{msg.hspCrivelInf['xzcd'] == '4'}}"/>90-99%
				<input type="checkbox" ms-attr-checked="{{msg.hspCrivelInf['xzcd'] == '5'}}"/>100%
			</div>
			<div>
				非罪犯血管狭窄>50%：<input type="checkbox" 
					   ms-attr-checked="msg.patientInfo['010017'] == 1"/>是
				<input type="checkbox" ms-click="xhRadioClick('010017',2)"
					   ms-attr-checked="msg.patientInfo['010017'] == 2"/>否
			</div>
		</div>
	    <div class="wrapper">
			<div>术前TIMI<input type="text" class="shortInput" ms-duplex-string='msg.hspCrivelInf["zystimixl"]'>级</div>
			<div>术后TIMI<input type="text" class="shortInput" ms-duplex-string='msg.hspCrivelInf["shtimixl"]'>级</div>
		</div>
		<div class="wrapper">
			<div>
				支架内血栓：
				<input type="checkbox" ms-attr-checked="{{msg.hspCrivelInf['zjnxs'] == '1'}}"/>是
				<input type="checkbox" ms-attr-checked="{{msg.hspCrivelInf['zjnxs'] == '0'}}"/>否；
			</div>
			<div>
				分叉病变：
				<input type="checkbox" ms-attr-checked="{{msg.hspCrivelInf['sffcbb'] == '1'}}"/>是
				<input type="checkbox" ms-attr-checked="{{msg.hspCrivelInf['sffcbb'] == '0'}}"/>否；
			</div>
			<div>
				CTO：
				<input type="checkbox" ms-attr-checked="{{msg.hspCrivelInf['sfcto'] == '1'}}"/>是
				<input type="checkbox" ms-attr-checked="{{msg.hspCrivelInf['sfcto'] == '0'}}"/>否；
			</div>
			<div>
				植入支架个数：<input type="text"  class="shortInput" ms-duplex-string='msg.hspCrivelInf["ZJGS"]'/>
			</div>
		</div>
	    <div class="wrapper">
			<div>
				首次抗凝：<input type="checkbox" ms-attr-checked="{{msg.patientInfo['KNYW'] == 1}}"/>普通肝素
				<input type="checkbox" ms-attr-checked="{{msg.patientInfo['KNYW'] == 3}}"/>比伐芦定
			   <input type="checkbox" ms-attr-checked="{{msg.patientInfo['KNYW'] == 2}}"/>低分子肝素
			   <input type="checkbox" ms-attr-checked="{{msg.patientInfo['KNYW'] == 4}}"/>磺达肝葵钠
			</div>
			<div>剂量：<input type="text" class="shortInput" ms-duplex-string='msg.patientInfo["KNYWJL"]'/>;</div>
			<div>时间：<input type="text" class="Wdate" ms-duplex-string='msg.patientInfo["KNYWSJ"]'></div>
		</div>
	    <div class="wrapper">
			<div>
				腔内影像：
				<input type="checkbox" ms-attr-checked="{{msg.patientInfo['QNYX'] == '1'}}"/>IVUS
				<input type="checkbox" ms-attr-checked="{{msg.patientInfo['QNYX'] == '2'}}"/>OCT
				<input type="checkbox" ms-attr-checked="{{msg.patientInfo['QNYX'] == '3'}}"/>其他
				<input type="checkbox" ms-attr-checked="{{msg.patientInfo['QNYX'] == '4'}}"/>无
			</div>
			<div>
				功能检测：
				<input type="checkbox" ms-attr-checked="{{msg.patientInfo['GNJC'] == '1'}}"/>FFR
				<input type="checkbox" ms-attr-checked="{{msg.patientInfo['GNJC'] == '4'}}"/>其他
				<input type="checkbox" ms-attr-checked="{{msg.patientInfo['GNJC'] == '5'}}"/>无
			</div>
			<div>
				IABP植入：
				<input type="checkbox" ms-attr-checked="{{msg.patientInfo['IABP'] == '1'}}"/>是
				<input type="checkbox" ms-attr-checked="{{msg.patientInfo['IABP'] == '0'}}"/>否
			</div>
			<div>
				血栓抽吸：<input type="checkbox" 
					   ms-attr-checked="msg.patientInfo['010017'] == 1"/>是
				<input type="checkbox" 
					   ms-attr-checked="msg.patientInfo['010017'] == 0"/>否
			</div>
		</div>
	    <div class="wrapper">
			<div>
				临时起搏器植入：
				<input type="checkbox" ms-attr-checked="{{msg.patientInfo['LSQBQ'] == '1'}}"/>是
				<input type="checkbox" ms-attr-checked="{{msg.patientInfo['LSQBQ'] == '0'}}"/>否
			</div>
			<div>
				ECMO：
				<input type="checkbox" ms-attr-checked="{{msg.patientInfo['ECMO'] == '1'}}"/>是
				<input type="checkbox" ms-attr-checked="{{msg.patientInfo['ECMO'] == '0'}}"/>否
			</div>
			<div>
				左心室辅助装置：
				<input type="checkbox" ms-attr-checked="{{msg.patientInfo['ZXSFZZZ'] == '1'}}"/>是
				<input type="checkbox" ms-attr-checked="{{msg.patientInfo['ZXSFZZZ'] == '0'}}"/>否
			</div>
		</div>
	    <div class="wrapper">
			<div>
				术中并发症：
				<input type="checkbox" ms-attr-checked="setChecked('SZBFZ','0')"/>无
				<input type="checkbox" ms-attr-checked="setChecked('SZBFZ','1')"/>恶性心率失常
				<input type="checkbox" ms-attr-checked="setChecked('SZBFZ','2')"/>低血压
				<input type="checkbox" ms-attr-checked="setChecked('SZBFZ','6')"/>慢血流/无复流
				<input type="checkbox" ms-attr-checked="setChecked('SZBFZ','7')"/>血管夹层
				<input type="checkbox" ms-attr-checked="setChecked('SZBFZ','8')"/>非干预血管急性闭塞
				<input type="checkbox" ms-attr-checked="setChecked('SZBFZ','9')"/>血管穿孔
				<input type="checkbox" ms-attr-checked="setChecked('SZBFZ','10')"/>死亡
				<input type="checkbox" ms-attr-checked="setChecked('SZBFZ','11')"/>其他
			</div>
		</div>
	    <div class="wrapper">
			<div>D2B时间：<input type="text" class="Wdate" ms-duplex-string='msg.patientInfo["DSTGSJ"]'></div>
			<div>
				是否延误：<input type="checkbox" 
					   ms-attr-checked="{{msg.patientInfo['SFYW'] == 1}}"/>是
				<input type="checkbox" 
					   ms-attr-checked="{{msg.patientInfo['SFYW'] == 0}}"/>否 （具体原因请询问术者）
			</div>
		</div>
	</div>
	<div class="info">
		<h4>出院转归</h4>
		<div class="wrapper">
			<div>
				转归：<input type="checkbox" 
					   ms-attr-checked="{{msg.patientInfo['HZZG'] == 1}}"/>好转出院
				<input type="checkbox" 
					   ms-attr-checked="{{msg.patientInfo['HZZG'] == 2}}"/>转至其它医院
				<input type="checkbox" 
					   ms-attr-checked="{{msg.patientInfo['HZZG'] == 3}}"/>转至其它科室
				<input type="checkbox" 
					   ms-attr-checked="{{msg.patientInfo['HZZG'] == 4}}"/>死亡
			</div>
			<div>
				死亡原因：<input type="checkbox" 
					   ms-attr-checked="{{msg.patientInfo['SWYY'] == 1}}"/>心源性
				<input type="checkbox" 
					   ms-attr-checked="{{msg.patientInfo['SWYY'] == 2}}"/>非心源性
			</div>
		</div>
		<div class="wrapper">
			<div>
				诊断：
				<input type="checkbox" ms-attr-checked="{{msg.patientInfo['CYZD'] == '1'}}"/>STEMI
				<input type="checkbox" ms-attr-checked="{{msg.patientInfo['CYZD'] == '2'}}"/>NSTEMI
				<input type="checkbox" ms-attr-checked="{{msg.patientInfo['CYZD'] == '3'}}"/>UA
				<input type="checkbox" ms-attr-checked="{{msg.patientInfo['CYZD'] == '4'}}"/>主动脉夹层
				<input type="checkbox" ms-attr-checked="{{msg.patientInfo['CYZD'] == '5'}}"/>肺栓塞
				<input type="checkbox" ms-attr-checked="{{msg.patientInfo['CYZD'] == '6'}}"/>非ACS胸痛
				<input type="checkbox" ms-attr-checked="{{msg.patientInfo['CYZD'] == '7'}}"/>其它非心源性胸痛
			</div>
			<div>确诊时间：<input type="text" class="Wdate" ms-duplex-string='msg.patientInfo["QZSJ"]'></div>
		</div>
		<div class="wrapper">
			<div>72小时肌钙蛋白最高值<input type="text" class="shortInput" ms-duplex-string='msg.patientInfo["JGDB72ZGZ"]'/></div>
			<div>
				<input type="checkbox" 
					   ms-attr-checked="{{msg.patientInfo['NNTLX'] == 1}}"/>BNP
				<input type="checkbox" 
					   ms-attr-checked="{{msg.patientInfo['NNTLX'] == 2}}"/>NT-proBNP
			</div>
			<div>最高值<input type="text" class="shortInput" ms-duplex-string='msg.patientInfo["NNTZGZ"]'/></div>
			<div>超声心电图 LVEF<input type="text" class="shortInput" ms-duplex-string='msg.patientInfo["LVEF"]'/>%（最低值）</div>
		</div>
	    <div class="wrapper">
			<div>
				合并症：
				<input type="checkbox" ms-attr-checked="setChecked('ZYQJBFZ','0')"/>无
				<input type="checkbox"/>心衰
				<input type="checkbox" ms-attr-checked="setChecked('ZYQJBFZ','1')"/>休克
				<input type="checkbox" ms-attr-checked="setChecked('ZYQJBFZ','2')"/>机械性并发症
				<input type="checkbox" ms-attr-checked="setChecked('ZYQJBFZ','3')"/>感染
				<input type="checkbox" ms-attr-checked="setChecked('ZYQJBFZ','4')"/>再发心梗
				<input type="checkbox" ms-attr-checked="setChecked('ZYQJBFZ','5')"/>血栓
				<input type="checkbox" ms-attr-checked="setChecked('ZYQJBFZ','6')"/>卒中
				<input type="checkbox" ms-attr-checked="setChecked('ZYQJBFZ','7')"/>TIA
				<input type="checkbox" ms-attr-checked="setChecked('ZYQJBFZ','8')"/>出血
				<input type="checkbox" ms-attr-checked="setChecked('ZYQJBFZ','10')"/>呼吸衰竭
				<input type="checkbox" ms-attr-checked="setChecked('ZYQJBFZ','11')"/>肾衰竭
				<input type="checkbox" ms-attr-checked="setChecked('ZYQJBFZ','12')"/>死亡
			</div>
		</div>
	    <div class="wrapper">
	    	<div>
	    		心血管疾病危险因素：
				<input type="checkbox" ms-attr-checked="setChecked('XXGJBWXYS','1')"/>高血压
				<input type="checkbox" ms-attr-checked="setChecked('XXGJBWXYS','2')"/>高脂血症
				<input type="checkbox" ms-attr-checked="setChecked('XXGJBWXYS','3')"/>血糖升高
				<input type="checkbox" ms-attr-checked="setChecked('XXGJBWXYS','4')"/>吸烟
				<input type="checkbox" ms-attr-checked="setChecked('XXGJBWXYS','5')"/>肥胖
				<input type="checkbox" ms-attr-checked="setChecked('XXGJBWXYS','6')"/>有家族史
				<input type="checkbox" ms-attr-checked="setChecked('XXGJBWXYS','7')"/>有既往心脏病史
				<input type="checkbox" ms-attr-checked="setChecked('XXGJBWXYS','8')"/>既往血运重建史
	    	</div>
	    </div>
		<div class="wrapper">
			<div>
				院内新发心力衰竭：
				<input type="checkbox" ms-attr-checked="{{msg.patientInfo['YNXFXLSJ'] == '1'}}"/>是
				<input type="checkbox" ms-attr-checked="{{msg.patientInfo['YNXFXLSJ'] == '0'}}"/>否
			</div>
			<div>出院时间：<input type="text" class="Wdate" ms-duplex-string='msg.patientInfo["CYSJ"]'></div>
			<div>住院天数：<input type="text" class="shortInput" ms-duplex-string='msg.patientInfo["ZYTS"]'>天</div>
			<div>总费用：<input type="text" class="shortInput" ms-duplex-string='msg.patientInfo["FEIY"]'>元</div>
		</div>
	    <div class="wrapper">
			<div>
				治疗结果：
				<input type="checkbox" ms-attr-checked="{{msg.patientInfo['ZLJG'] == '1'}}"/>治愈
				<input type="checkbox" ms-attr-checked="{{msg.patientInfo['ZLJG'] == '2'}}"/>好转
				<input type="checkbox" ms-attr-checked="{{msg.patientInfo['ZLJG'] == '3'}}"/>脑死亡离院
				<input type="checkbox" ms-attr-checked="{{msg.patientInfo['ZLJG'] == '4'}}"/>其它原因离院
			</div>
			<div>
				离院宣教：
				<input type="checkbox" ms-attr-checked="setChecked('LYXJ','1')"/>戒烟
				<input type="checkbox" ms-attr-checked="setChecked('LYXJ','2')"/>规律坚持服药
				<input type="checkbox" ms-attr-checked="setChecked('LYXJ','3')"/>遵医嘱随访治疗
				<input type="checkbox" ms-attr-checked="setChecked('LYXJ','4')"/>生活起居调护
				<input type="checkbox" ms-attr-checked="setChecked('LYXJ','5')"/>危险因素控制
				<input type="checkbox" ms-attr-checked="setChecked('LYXJ','6')"/>未作
			</div>
		</div>
		<div class="wrapper">
			<div>
				出院带药：
				<input type="checkbox" ms-attr-checked="setChecked('CYDY','1')"/>DAPT
				<input type="checkbox" ms-attr-checked="setChecked('CYDY','2')"/>ACEI/ARB
				<input type="checkbox" ms-attr-checked="setChecked('CYDY','4')"/>β-受体阻滞剂
				<input type="checkbox" ms-attr-checked="setChecked('CYDY','3')"/>他汀
			</div>
		</div>
	</div>
    <div class="btns">
<%--        <a id="save" onclick="saveMsg()">保存</a>--%>
        <a id="print" onclick="printMsg()">打印</a>
    </div>
</form>
<!-- <object id="ocx" classid="clsid:66665BEC-6877-4720-B1AC-56FA0A71B700" width=0px height=0px></object> -->
<jsp:include page="/WEB-INF/jsp/edpc/cpc/printXthzdj.jsp"></jsp:include>

</body>
<script>
    var _emgSeq = "${emgSeq}";
	var _patid = "${patid}";
	var _wayTyp = "${wayTyp}";
    $(function () {
        // getMsgs();
        // initLists();
        // initCombobox();
        // translate();
		patientInfo();
		beforeInfo();
		$.ajax({
		    url: '${baseurl}cpc/getHspXtzlInfByEmgSeq.do',
		    type: 'post',
		    dataType: 'json',
		    contentType: 'application/json;charset=UTF-8',
		    data: JSON.stringify({
		        emgSeq: _emgSeq,
		    }),
		    success:function (res) {
				try{
					var _list = res.resultInfo.sysdata.list;
					    if (_list) {
					        var temp = {};
							temp.aspl = '';
							temp.tgrl = '';
							temp.lpgl = '';
					        $.each(_list, function (idx, obj) {
								if((obj.proType=='datetime'||obj.proType=='datetime2') && obj.proVal){
									obj.proVal = moment(obj.proVal,'YYYY-MM-DD HH:mm:ss').format('MM-DD HH:mm');
								}else{
									obj.proVal = obj.proVal || '';
								}
					            temp[obj.proCode] = obj.proVal;
								if(obj.proCode == 'KXXBYWGYSJ' && obj.proVal!=null){
									temp.aspl = 300
								}
								if(obj.proCode == 'ASPL' && vm.msg.patientInfo.aspl!=null){
									if(obj.proVal == 0){
										temp.tgrl = 180
									}else if(obj.proVal == 1){
										temp.lpgl = 300
									}
								}
					        });
							if(temp.CLCL == 0){
								temp.QRXCL = '';
							}
							temp.invitationDate = '';
							temp.consulationDate = '';
							temp.SFHJXNKHZ = '';
							temp.ynsfxdtqzsj = '';
							temp.ynsfxdtsj = '';
					        vm.msg.patientInfo = temp;
					        // addWatcher();
					    }
					var _hspCrivelInf = res.resultInfo.sysdata.hspCrivelInf;
					if(_hspCrivelInf){
						_hspCrivelInf.ZJGS = '';
						for(var a in _hspCrivelInf){
							if(a=='zrzjgs'){
								var Nub = _hspCrivelInf[a];
								if(Nub == 1){
									_hspCrivelInf.ZJGS = '0枚';
								}else if(Nub == 2){
									_hspCrivelInf.ZJGS = '1枚';
								}else if(Nub == 3){
									_hspCrivelInf.ZJGS = '2枚';
								}else if(Nub == 4){
									_hspCrivelInf.ZJGS = '>=3枚';
								}
							}
						}
						vm.msg.hspCrivelInf = _hspCrivelInf;
					}
					var _hspGraceInf = res.resultInfo.sysdata.hspGraceInf;
						if(_hspGraceInf && _hspGraceInf.length){
							for (var i = 0; i < _hspGraceInf.length; i++) {
								var el = _hspGraceInf[i];
								if(el.graceType == 0){
									vm.msg.hspGraceInf.gracejgwtj01 = el.gracejgwtj || '';
								}else if(el.graceType == 1){
									vm.msg.hspGraceInf.gracejgwtj02 = el.gracejgwtj || '';
									// 判断grace危险分层
									if(el.gracejgwtj){
										vm.msg.hspGraceInf.gracewxfc = 1
									}else{
										if(el.total>140){
											vm.msg.hspGraceInf.gracewxfc = 2
										}else if(el.total>109&&el.total<140){
											vm.msg.hspGraceInf.gracewxfc = 3
										}else if(el.total<190){
											vm.msg.hspGraceInf.gracewxfc = 4
										}
									}
								}
							}
					}
					var invitationDate = res.resultInfo.sysdata.invitationDate;
					if(invitationDate){
						vm.msg.patientInfo.invitationDate = moment(invitationDate).format('YYYY-MM-DD HH:mm');
						vm.msg.patientInfo.SFHJXNKHZ = 1;
					}
					var consulationDate = res.resultInfo.sysdata.consulationDate;
					if(consulationDate){
						vm.msg.patientInfo.consulationDate = moment(consulationDate).format('YYYY-MM-DD HH:mm');
					}
					var ynsfxdtsj = res.resultInfo.sysdata.ynsfxdtsj;
					if(ynsfxdtsj){
						vm.msg.patientInfo.ynsfxdtsj = moment(ynsfxdtsj).format('YYYY-MM-DD HH:mm');
					}
					var ynsfxdtqzsj = res.resultInfo.sysdata.ynsfxdtqzsj;
					if(ynsfxdtqzsj){
						vm.msg.patientInfo.ynsfxdtqzsj = moment(ynsfxdtqzsj).format('YYYY-MM-DD HH:mm');
					}
				}catch(e){
					//TODO handle the exception
					console.log("11111111111111111111111",e)
				}
				
			},
			error: function (err) {
				// console.log(err);
			}
		});
    });
  
  //急诊预检
   function patientInfo(){
	   $.ajax({
	       url: '${baseurl}cpc/getHspEmgInfByEmgSeq.do',
	       type: 'post',
	       dataType: 'json',
	       contentType: 'application/json;charset=UTF-8',
	       data: JSON.stringify({
	           emgSeq: _emgSeq,
			   wayTyp: _wayTyp
	       }),
	       success:function (res) {
	   		 var _hspEmgInf = res.resultInfo.sysdata.hspEmgInf;
			 for(var a in vm.msg.hspEmgInf){
				 if(_hspEmgInf && _hspEmgInf.hasOwnProperty(a)){
					 vm.msg.hspEmgInf[a] = _hspEmgInf[a];
					 if(a == 'emgDat' && _hspEmgInf[a]!=null){
						 var emgDat = _hspEmgInf['emgDat'];
						 var ddyydmsj = _hspEmgInf['emgDat'] - 60000;
						 vm.msg.hspEmgInf.ddyydmsj = moment(ddyydmsj).format('YYYY-MM-DD HH:mm')
						 vm.msg.hspEmgInf.emgDat =  moment(emgDat).format('YYYY-MM-DD HH:mm')
					 }
				 }
			 }
			 if(_wayTyp == 0 || _wayTyp == 1){
				 vm.msg.aidPatient.XINGM = vm.msg.hspEmgInf.cstNam;
				 vm.msg.aidPatient.XINGB = vm.msg.hspEmgInf.cstSexCod;
				 vm.msg.aidPatient.NIANN = vm.msg.hspEmgInf.cstAge;
			 }
	   	}
	 });
   }
   
   // 院前信息
   function beforeInfo(){
	   $.ajax({
	       url: '${baseurl}cpc/getAidPatientByEmgSeq.do',
	       type: 'post',
	       dataType: 'json',
	       contentType: 'application/json;charset=UTF-8',
	       data: JSON.stringify({
	           emgSeq: _emgSeq,
	   		   wayTyp: _wayTyp
	       }),
		   success:function (res) {
			   var _ynfb = res.resultInfo.sysdata.ynfb;
			   var _aidPatient = res.resultInfo.sysdata.aidPatient;
			   var _aidPatientXt = res.resultInfo.sysdata.aidPatientXt;
			   if(_wayTyp == 2){
				   vm.msg.ynfb.ynfb = 1;
				   for(var a in vm.msg.ynfb){
					   if(_ynfb && _ynfb.hasOwnProperty(a)){
						    vm.msg.ynfb[a] = _ynfb[a];
							 if(a == 'fstTim' && _ynfb['fstTim']){
								 var fstTim = _ynfb['fstTim'];
								 vm.msg.ynfb.fstTim = moment(fstTim).format('YYYY-MM-DD HH:mm')
							 }
							 if(a == 'lveTim' && _ynfb['lveTim']){
								 var lveTim = _ynfb['lveTim'];
								 vm.msg.ynfb.lveTim = moment(lveTim).format('YYYY-MM-DD HH:mm')
							 }
							 if(a == 'illTim' && _ynfb['illTim']){
								 var illTim = _ynfb['illTim'];
								 vm.msg.ynfb.illTim = moment(illTim).format('YYYY-MM-DD HH:mm')
							 }
					   }
				   }
			   }else if(_wayTyp == 0 || _wayTyp == 1){
				   for(var a in vm.msg.aidPatient){
					   if(_aidPatient && _aidPatient.hasOwnProperty(a)){
							 vm.msg.aidPatient[a] = _aidPatient[a];
							 if(a == 'illTim'&&_aidPatient['illTim']){
								 vm.msg.ynfb.illTim = _aidPatient[a];
							 }
					   }
				   }
				   for(var b in vm.msg.aidPatientXt){
					   if(_aidPatientXt && _aidPatientXt.hasOwnProperty(b)){
							 vm.msg.aidPatientXt[b] = _aidPatientXt[b];
					   }
				   }
				   transAddrCode(vm.msg.aidPatient.scePrvCod,vm.msg.aidPatient.sceCtyCod,vm.msg.aidPatient.sceAr0Cod);
				   if(vm.msg.aidPatientXt.aspl == 0){
						 vm.msg.aidPatientXt.aspl02 = 300;
						 vm.msg.aidPatientXt.tgrl = 180;
					}else if(vm.msg.aidPatientXt.aspl == 1){
						 vm.msg.aidPatientXt.aspl02 = 300;
						 vm.msg.aidPatientXt.lpgl = 300;
					}
			   }
		   },
	   });
   }

   // 获取省市区的编码
   function transAddrCode(provinceCode,cityCode,cntyCode){
	   var _provinceList = vm.provinceList;
	   var _cityList = addrInfoList.cityMap[provinceCode] || '';
	   var _cntyList = addrInfoList.cntyMap[cityCode] || '';
	   var addr = [];
	   if (_provinceList.length) {
			for (var i = 0; i < _provinceList.length; i++) {
					var el = _provinceList[i];
					if (el.addrCode === provinceCode) {
						addr.push(el.addrName);
					}
			}
       }
	    if (_cityList.length) {
		   for (var i = 0; i < _cityList.length; i++) {
				   var el = _cityList[i];
				   if (el.addrCode === cityCode) {
					   addr.push(el.addrName)
				   }
		   }
	    }
		if (_cntyList.length) {
			for (var i = 0; i < _cntyList.length; i++) {
				var el = _cntyList[i];
				if (el.addrCode === cntyCode) {
					addr.push(el.addrName)
				}
			}
		}
		vm.addr = addr;
   }
   

</script>

</html>