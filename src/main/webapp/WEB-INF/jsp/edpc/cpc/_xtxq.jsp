<%@ page language="java" import="java.util.*" pageEncoding="UTF-8" %>
<%@ include file="/WEB-INF/jsp/base/tag.jsp" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
    <base href="<%=basePath%>">
    <title>胸痛中心上报助手</title>
    <link rel="stylesheet" type="text/css" href="css/edpc/xtxq.css">
    <link rel="stylesheet" type="text/css" href="css/edpc/iconfont.css">
    <link rel="stylesheet" type="text/css" href="lib/easyui1.3/themes/default/easyui.css">
    <script type="text/javascript" src="lib/moment.min.js"></script>
    <script type="text/javascript" src="lib/easyui1.3/jquery-1.8.0.min.js"></script>
    <script type="text/javascript" src="lib/easyui1.3/jquery.easyui.min.js"></script>
    <script type="text/javascript" src="lib/avalon1.4.8/avalon.js"></script>
    <script type="text/javascript" src="js/public.js"></script>
    <%@ include file="/WEB-INF/jsp/base/common_js.jsp" %>
</head>
<body ms-controller="report">
<div class="time_axis fl">
    <h4>
        <span class="iconfont icon-time"></span>
        <span class="ranking_time">时间轴</span>
    </h4>
    <div class="timeline timeline-single-column">
        <div class="timeline-item ng-scope timeLeftBlock" ms-repeat-item="timeList">
            <div class="timeline-point timeline-point-blank"></div>
            <div class="timeline-event">
                <div class="timeline_title">{{item.proName}}</div>
                <div class="timeline_value">{{item.proVal}}</div>
               <!-- <div class="timeline_diff_warning">S2FMC:125分钟</div>
                <div class="timeline_diff">FMC2ECG:2分钟</div> -->
            </div>
        </div>
    </div>
</div>
<div class="main fl">
    <div class="basic-info">
        <div class="title">基本信息</div>
        <div class="content">
            <div class="row">
                <div class="input-wrapper w23">
                    <div class="lb">姓名<span class="required">*</span></div>
                    <div class="input">
                        <input type="text" ms-duplex-string="baseInfo.cstNam" class="input"/>
                    </div>
                </div>
                <div class="input-wrapper w23">
                    <div class="lb">性别<span class="required">*</span></div>
                    <div class="input">
                        <select name="" ms-duplex="baseInfo.cstSexCod" data-duplex-changed="selectchange">
                            <option value="">请选择</option>
                            <option ms-repeat="cstSexCodArr" ms-attr-value="el.infocode">{{el.info}}</option>
                        </select>
                    </div>
                </div>
				<div class="input-wrapper w23">
				    <div class="lb">证件类型<span class="required">*</span></div>
				    <div class="input">
				        <select name="" ms-duplex="baseInfo.cardType">
				            <option value="">请选择</option>
				            <option ms-repeat="cardTypeArr" ms-attr-value="el.infocode">{{el.info}}</option>
				        </select>
				    </div>
				</div>
                <div class="input-wrapper w23">
                    <div class="lb">证件号<span class="required">*</span></div>
                    <div class="input">
                        <input type="text" ms-duplex-string="baseInfo.idNbr" class="input"/>
                    </div>
                </div>
            </div>
            <div class="row">
                <div class="input-wrapper w23">
                    <div class="lb">年龄<span class="required">*</span></div>
                    <div class="input">
                        <input type="text" class="input" ms-duplex-string="baseInfo.cstAge"/>
                    </div>
                </div>
                <div class="input-wrapper w23">
                    <div class="lb">出生日期</div>
                    <div class="input">
                        <input type="text" class="Wdate input" onclick="WdatePicker({dateFmt:'yyyy-MM-dd'})"
                               ms-duplex-string="baseInfo.bthDat"/>
                    </div>
                </div>
                <div class="input-wrapper w23">
                    <div class="lb">民族</div>
                    <div class="input">
                        <select name="" ms-duplex="baseInfo.nation">
                            <option value="">请选择</option>
                        </select>
                    </div>
                </div>
                <div class="input-wrapper w23">
                    <div class="lb">联系电话</div>
                    <div class="input">
                        <input type="text" class="input" ms-duplex-string="baseInfo.pheNbr"/>
                    </div>
                </div>
            </div>
            <div class="row">
                <div class="input-wrapper w23">
                    <div class="lb">职业<span class="required">*</span></div>
                    <div class="input">
                        <select name="" ms-duplex="baseInfo.emgJob">
                            <option value="">请选择</option>
                            <option ms-repeat="emgJobArr" ms-attr-value="el.infocode">{{el.info}}</option>
                        </select>
                    </div>
                </div>
                <!-- <div class="input-wrapper w23">
                    <div class="lb">文化程度</div>
                    <div class="input">
                        <select name="" ms-duplex="baseInfo.WHCD">
                            <option value="">请选择</option>
                            <option ms-repeat="WHCDArr" ms-attr-value="el.infocode">{{el.info}}</option>
                        </select>
                    </div>
                </div> -->
                <div class="input-wrapper w23">
                    <div class="lb">婚姻状况</div>
                    <div class="input">
                        <select name="" ms-duplex="baseInfo.maritalStatus">
                            <option value="">请选择</option>
                            <option ms-repeat="maritalStatusArr" ms-attr-value="el.infocode">{{el.info}}</option>
                        </select>
                    </div>
                </div>
                <!-- <div class="input-wrapper w23">
                    <div class="lb">身高</div>
                    <div class="input">
                        <input type="text" class="input" ms-duplex-string="baseInfo.SHENG"/>
                        <div class="unit">cm</div>
                    </div>
                </div> -->

            </div>
            <!-- <div class="row">
                <div class="input-wrapper w23">
                    <div class="lb">体重</div>
                    <div class="input">
                        <input type="number" class="input" ms-duplex-string="baseInfo.TIZHONG"/>
                        <div class="unit">kg</div>
                    </div>
                </div>
            </div> -->
        </div>
    </div>
    <div class="treat-info">
        <div class="tab-group">
            <div class="tab" ms-class="{{activeTab==0 ? 'active' : ''}}" ms-click="onTabClick('firstaidinfo',0)">急救信息</div>
            <div class="tab" ms-class="{{activeTab==1 ? 'active' : ''}}" ms-click="onTabClick('cpctreat',1)">胸痛诊疗</div>
            <div class="tab" ms-class="{{activeTab==2 ? 'active' : ''}}" ms-click="onTabClick('outcome',2)">患者转归</div>
        </div>
        <div class="tab-container emergency" ms-if="activeTab==0">
            <div class="block">
                <div class="title">基本信息</div>
                <div class="inputs">
                    <div class="input-group">
                        <div class="lb">住院ID</div>
                        <div class="input"><input type="text" ms-duplex-string="info.ZHUYH"/></div>
                    </div>
                    <div class="input-group">
                        <div class="lb">门诊ID</div>
                        <div class="input"><input type="text" ms-duplex-string="info.MENZH"/></div>
                    </div>
                </div>
                <div class="inputs">
                    <div class="input-group">
                        <div class="lb">发病时间 <span class="required">*</span></div>
                        <div class="input">
                            <input type="text" class="input-date Wdate"
                                   onclick="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm'})"
                                   ms-duplex-string="info.FBSJ"/>
                        </div>
                    </div>
                    <div class="input-group">
                        <div class="input">
                            <div class="btn" ms-class="{{info.FBSJWFJQDFZ ? 'active' : ''}}"
                                 ms-click="onToggleClick('FBSJWFJQDFZ')">发病时间无法精确到分钟
                            </div>
                        </div>
                    </div>
                    <div class="input-group" ms-if="info.FBSJWFJQDFZ">
                        <div class="lb">发病区间 <span class="required">*</span></div>
                        <div class="input">
                            <select name="" ms-duplex="info.FBQJ">
                                <option value="">请选择</option>
                            </select>
                        </div>
                    </div>
                </div>
                <div class="inputs">
                    <div class="input-group">
                        <div class="lb">发病地址</div>
                        <div class="input">
                            <select name="" ms-duplex="info.FBDZ01">
                                <option value="">请选择</option>
                            </select>
                            <select name="" ms-duplex="info.FBDZ02">
                                <option value="">请选择</option>
                            </select>
                            <select name="" ms-duplex="info.FBDZ03">
                                <option value="">请选择</option>
                            </select>
                        </div>
                    </div>
                    <div class="input-group">
                        <div class="lb">详细地址</div>
                        <div class="input">
                            <input type="text" ms-duplex-string="info.XXDZ">
                        </div>
                    </div>
                </div>
                <div class="inputs">
                    <div class="input-group">
                        <div class="lb">医保类型</div>
                        <div class="input">
                            <select name="" ms-duplex="info.YBLX">
                                <option value="">请选择</option>
                            </select>
                        </div>
                    </div>
                    <div class="input-group">
                        <div class="lb">医保编号</div>
                        <div class="input"><input type="text" ms-duplex-string="info.YBBH"/></div>
                    </div>
                </div>
                <div class="inputs">
                    <div class="input-group">
                        <div class="lb">大病医保</div>
                        <div class="input">
                            <div class="radio-btns">
                                <div ms-repeat="RADIOArr" class="btn" ms-class="{{info.DBYB==el.infocode ? 'active':''}}"
                                     ms-click="onRadioClick('DBYB',el.infocode)">
                                    {{el.info}}
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
            <div class="block">
                <div class="title">病情现况</div>
                <div class="inputs">
                    <div class="input-group">
                        <div class="lb">病情评估 <span class="required">*</span></div>
                        <div class="input">
                            <div class="radio-btns">
                                <div class="btn" ms-repeat="BQPGArr" ms-class="{{info.BQPG==el.infocode ? 'active':''}}"
                                     ms-click="onRadioClick('BQPG',el.infocode)">
                                    {{el.info}}
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="inputs">
                    <div style="margin-left: 130px">
                        <div class="checkbox-group">
                            <div ms-repeat="BQPGMXArr" class="btn"
                                 ms-class="{{isChecked('BQPGMX',el.infocode) ? 'active':''}}"
                                 ms-click="onCheckClick('BQPGMX',el.infocode)">
                                {{el.info}}
                            </div>
                        </div>
                    </div>
                </div>
            </div>
            <div class="block">
                <div class="title">来院方式</div>
                <div class="inputs">
                    <div class="input-group">
                        <div class="lb">来院方式 <span class="required">*</span></div>
                        <div class="input">
                            <div class="radio-btns">
                                <div ms-repeat="DYFSArr" class="btn" ms-class="{{info.DYFS==el.infocode ? 'active':''}}"
                                     ms-click="onRadioClick('DYFS',el.infocode)">
                                    {{el.info}}
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
                <div ms-if="info.DYFS == 1">
                    <div class="inputs">
                        <div class="input-group">
                            <div class="lb">出车单位 <span class="required">*</span></div>
                            <div class="input">
                                <div class="radio-btns">
                                    <div ms-repeat="CCDWArr" class="btn"
                                         ms-class="{{info.CCDW==el.infocode ? 'active':''}}"
                                         ms-click="onRadioClick('CCDW',el.infocode)">
                                        {{el.info}}
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="inputs">
                        <div class="input-group">
                            <div class="lb">呼救时间 <span class="required">*</span></div>
                            <div class="input">
                                <input type="text" class="Wdate" ms-duplex-string="info.HJSJ"
                                       onclick="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm'})"/>
                            </div>
                        </div>
                    </div>
                    <div class="inputs">
                        <div class="input-group">
                            <div class="lb">直接转送上级医院(转出患者时) <span class="required">*</span></div>
                            <div class="input">
                                <div class="radio-btns">
                                    <div ms-repeat="RADIOArr" class="btn"
                                         ms-class="{{info.ZJZSSJYY==el.infocode ? 'active':''}}"
                                         ms-click="onRadioClick('ZJZSSJYY',el.infocode)">
                                        {{el.info}}
                                    </div>
                                </div>
                            </div>
                        </div>
                        <div class="input-group" ms-visible="info.ZJZSSJYY == 1">
                            <div class="lb">直达导管室<span class="required">*</span></div>
                            <div class="input">
                                <div class="radio-btns">
                                    <div ms-repeat="RADIOArr" class="btn"
                                         ms-class="{{info.ZDDGS==el.infocode ? 'active':''}}"
                                         ms-click="onRadioClick('ZDDGS',el.infocode)">
                                        {{el.info}}
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="inputs">
                        <div class="input-group">
                            <div class="lb">到达医院大门时间 <span class="required">*</span></div>
                            <div class="input">
                                <input type="text" class="Wdate"
                                       onclick="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm'})"
                                       ms-duplex-string="info.DDYYDMSJ01"/>
                            </div>
                        </div>
                    </div>
                    <div class="inputs">
                        <div class="input-group">
                            <div class="lb">首次医疗接触时间 <span class="required">*</span></div>
                            <div class="input">
                                <input type="text" class="Wdate"
                                       onclick="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm'})"
                                       ms-duplex-string="info.SCYLJCSJ"/>
                            </div>
                        </div>
                        <div class="input-group">
                            <div class="lb">院内首诊医师接诊时间 <span class="required">*</span></div>
                            <div class="input">
                                <input type="text" class="Wdate"
                                       onclick="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm'})"
                                       ms-duplex-string="info.YNSZYSJZSJ"/>
                            </div>
                        </div>
                        <div class="input-group">
                            <div class="lb">医护人员 <span class="required">*</span></div>
                            <div class="input"><input type="text" ms-duplex="info.YHRY"/></div>
                        </div>
                    </div>
                </div>
                <div ms-if="info.DYFS == 2">
                    <div class="inputs">
                        <div class="input-group">
                            <div class="lb">转院类型 <span class="required">*</span></div>
                            <div class="input">
                                <div class="radio-btns">
                                    <div ms-repeat="ZYLXArr" class="btn"
                                         ms-class="{{info.ZYLX==el.infocode ? 'active':''}}"
                                         ms-click="onRadioClick('ZYLX',el.infocode)">
                                        {{el.info}}
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="inputs">
                        <div class="input-group">
                            <div class="lb">医院名称</div>
                            <div class="input"><input type="text" ms-duplex-string="info.YYMC"/></div>
                        </div>
                    </div>
                    <div class="inputs">
                        <div class="input-group">
                            <div class="lb">首次医疗接触时间 <span class="required">*</span></div>
                            <div class="input">
                                <input type="text" class="Wdate" ms-duplex-string="info.SCYLJCSJ"
                                       onclick="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm'})"/>
                            </div>
                        </div>
                    </div>
                    <div class="inputs">
                        <div class="input-group">
                            <div class="lb">转出医院入门时间 <span class="required">*</span></div>
                            <div class="input">
                                <input type="text" class="Wdate" ms-duplex-string="info.ZCYYRMSJ"
                                       onclick="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm'})"/>
                            </div>
                        </div>
                        <div class="input-group">
                            <div class="lb">决定转院时间 <span class="required">*</span></div>
                            <div class="input">
                                <input type="text" class="Wdate" ms-duplex-string="info.JDZYSJ"
                                       onclick="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm'})"/>
                            </div>
                        </div>
                        <div class="input-group">
                            <div class="lb">转出医院出门时间 <span class="required">*</span></div>
                            <div class="input">
                                <input type="text" class="Wdate" ms-duplex-string="info.ZCYJCMSJ"
                                       onclick="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm'})"/>
                            </div>
                        </div>
                    </div>
                    <div class="inputs">
                        <div class="input-group">
                            <div class="lb">到达本院大门时间 <span class="required">*</span></div>
                            <div class="input">
                                <input type="text" class="Wdate" ms-duplex-string="info.DDYYDMSJ02"
                                       onclick="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm'})"/>
                            </div>
                        </div>
                        <div class="input-group">
                            <div class="lb">院内接诊时间 <span class="required">*</span></div>
                            <div class="input">
                                <input type="text" class="Wdate" ms-duplex-string="info.YNJZSJ"
                                       onclick="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm'})"/>
                            </div>
                        </div>
                        <div class="input-group">
                            <div class="lb">医护人员</div>
                            <div class="input"><input type="text" ms-duplex="info.YHRY"/></div>
                        </div>
                    </div>
                </div>
                <div ms-if="info.DYFS == 3">
                    <div class="inputs">
                        <div class="input-group">
                            <div class="lb">到达医院大门时间 <span class="required">*</span></div>
                            <div class="input">
                                <input type="text" class="Wdate" ms-duplex-string="info.DDYYDMSJ03"
                                       onclick="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm'})"/>
                            </div>
                        </div>
                        <div class="input-group">
                            <div class="lb">首次医疗接触时间 <span class="required">*</span></div>
                            <div class="input">
                                <input type="text" class="Wdate" ms-duplex-string="info.SCYLJCSJ"
                                       onclick="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm'})"/>
                            </div>
                        </div>
                        <div class="input-group">
                            <div class="lb">院内首诊医师接诊时间 <span class="required">*</span></div>
                            <div class="input">
                                <input type="text" class="Wdate" ms-duplex-string="info.YNSZYSJZSJ"
                                       onclick="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm'})"/>
                            </div>
                        </div>
                    </div>
                    <div class="inputs">
                        <div class="input-group">
                            <div class="lb">医护人员</div>
                            <div class="input">
                                <input type="text" ms-duplex-string="info.YHRY"/>
                            </div>
                        </div>
                    </div>
                </div>
                <div ms-if="info.DYFS == 4">
                    <div class="inputs">
                        <div class="input-group">
                            <div class="lb">发病科室 <span class="required">*</span></div>
                            <div class="input"><input type="text" ms-duplex="info.FBKS"/></div>
                        </div>
                        <div class="input-group">
                            <div class="lb">首次医疗接触时间 <span class="required">*</span></div>
                            <input type="text" class="Wdate" ms-duplex-string="info.SCYLJCSJ"
                                   onclick="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm'})"/>
                        </div>
                        <div class="input-group">
                            <div class="lb">床位医生接触时间 <span class="required">*</span></div>
                            <input type="text" class="Wdate" ms-duplex-string="info.CWYSJCSJ"
                                   onclick="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm'})"/>
                        </div>
                    </div>
                    <div class="inputs">
                        <div class="input-group">
                            <div class="lb">离开科室时间</div>
                            <div class="input">
                                <input type="text" class="Wdate" ms-duplex-string="info.LKKSSJ"
                                       onclick="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm'})"/>
                            </div>
                        </div>
                        <div class="input-group">
                            <div class="lb">医护人员</div>
                            <div class="input"><input type="text" ms-duplex="info.YHRY"/></div>
                        </div>
                    </div>
                </div>
            </div>
            <div class="block">
                <div class="title">基础生命体征</div>
                <div class="inputs">
                    <div class="input-group">
                        <div class="lb">意识 <span class="required">*</span></div>
                        <div class="input">
                            <select name="" ms-duplex="=info.YISHI">
                                <option value="">请选择</option>
                            </select>
                        </div>
                    </div>
                    <div class="input-group">
                        <div class="lb">呼吸 <span class="required">*</span></div>
                        <div class="input">
                            <input type="text" ms-duplex="info.HUXI"/>
                            <div class="unit">次/分</div>
                        </div>
                    </div>
                    <div class="input-group">
                        <div class="lb">脉搏 <span class="required">*</span></div>
                        <div class="input">
                            <input type="text" ms-duplex="info.MAIB"/>
                            <div class="unit">次/分</div>
                        </div>
                    </div>
                </div>
                <div class="inputs">
                    <div class="input-group">
                        <div class="lb">心率 <span class="required">*</span></div>
                        <div class="input">
                            <input type="text" ms-duplex="info.XINL"/>
                            <div class="unit">次/分</div>
                        </div>
                    </div>
                    <div class="input-group">
                        <div class="lb">血压 <span class="required">*</span></div>
                        <div class="input">
                            <input type="text" placeholder="--/--" ms-duplex="info.XUEY"/>
                            <div class="unit">mmHg</div>
                        </div>
                    </div>
                    <div class="input-group">
                        <div class="lb">体温</div>
                        <div class="input">
                            <input type="text" ms-duplex="info.TIWEN"/>
                            <div class="unit">℃</div>
                        </div>
                    </div>
                </div>
            </div>
            <div ms-if="info.DYFS==1 || info.DYFS==2" class="block">
                <div class="title">院前溶栓治疗</div>
                <div class="inputs">
                    <div class="input-group">
                        <div class="lb">溶栓筛查 <span class="required">*</span></div>
                        <div class="input">
                            <div class="radio-btns">
                                <div class="btn" ms-class="{{info.YQRSSC==el.infocode ? 'active':''}}"
                                     ms-click="onRadioClick('YQRSSC',el.infocode)" ms-repeat="YQRSSCArr">
                                    {{el.info}}
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="input-group" ms-if="info.YQRSSC==0">
                        <div class="lb">溶栓治疗 <span class="required">*</span></div>
                        <div class="input">
                            <div class="radio-btns">
                                <div class="btn" ms-class="{{info.YQRSZL==el.infocode ? 'active':''}}"
                                     ms-click="onRadioClick('YQRSZL',el.infocode)" ms-repeat="YQRSZLArr">
                                    {{el.info}}
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="input-group" ms-if="info.YQRSSC==1">
                        <div class="lb">存在禁忌症 <span class="required">*</span></div>
						<div class="input">
						    <div class="radio-btns">
						        <div ms-repeat="RADIOArr" class="btn"
						             ms-class="{{info.YQCZJJZ==el.infocode ? 'active':''}}"
						             ms-click="onRadioClick('YQCZJJZ',el.infocode)">
						            {{el.info}}
						        </div>
						    </div>
						</div>
                    </div>
                </div>
                <div ms-if="info.YQRSZL == 0 && info.YQRSSC==0">
                    <div class="inputs">
                        <div class="input-group">
                            <div class="lb">直达溶栓场所 <span class="required">*</span></div>
                            <div class="input">
                                <div class="radio-btns">
                                    <div class="btn" ms-class="{{info.YQZDRSCS==el.infocode ? 'active':''}}"
                                         ms-click="onRadioClick('YQZDRSCS',el.infocode)" ms-repeat="RADIOArr">
                                        {{el.info}}
                                    </div>
                                </div>
                            </div>
                        </div>
                        <div class="input-group">
                            <div class="lb">溶栓场所 <span class="required">*</span></div>
                            <div class="input">
                                <div class="radio-btns">
                                    <div class="btn" ms-class="{{info.YQRSCS==el.infocode ? 'active':''}}"
                                         ms-click="onRadioClick('YQRSCS',el.infocode)" ms-repeat="YQRSCSArr">
                                        {{el.info}}
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="inputs">
                        <div class="input-group">
                            <div class="lb">开始知情同意 <span class="required">*</span></div>
                            <div class="input">
                                <input type="text" ms-duplex-string="info.YQKSZQTYSJ" class="Wdate"
                                       onclick="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm'})"/>
                            </div>
                        </div>
                        <div class="input-group">
                            <div class="lb">签署知情同意书 <span class="required">*</span></div>
                            <div class="input">
                                <input type="text" ms-duplex-string="info.YQQSZQTYSSJ" class="Wdate"
                                       onclick="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm'})"/>
                            </div>
                        </div>
                    </div>
                    <div class="inputs">
                        <div class="input-group">
                            <div class="lb">开始溶栓时间 <span class="required">*</span></div>
                            <div class="input">
                                <input type="text" ms-duplex-string="info.YQKSRSSJ" class="Wdate"
                                       onclick="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm'})"/>
                            </div>
                        </div>
                        <div class="input-group">
                            <div class="lb">溶栓结束时间 <span class="required">*</span></div>
                            <div class="input">
                                <input type="text" ms-duplex-string="info.YQRSJSSJ" class="Wdate"
                                       onclick="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm'})"/>
                            </div>
                        </div>
                    </div>
                    <div class="inputs">
                        <div class="input-group">
                            <div class="lb">药物 <span class="required">*</span></div>
                            <div class="input">
                                <select name="" ms-duplex="info.YQYW">
                                    <option value="">请选择</option>
                                </select>
                            </div>
                        </div>
                        <div class="input-group">
                            <div class="lb">剂量 <span class="required">*</span></div>
                            <div class="input">
                                <select name="" ms-duplex="info.YQJL">
                                    <option value="">请选择</option>
                                </select>
                            </div>
                        </div>
                    </div>
                    <div class="inputs">
                        <div class="input-group">
                            <div class="lb">溶栓再通 <span class="required">*</span></div>
                            <div class="input">
                                <div class="radio-btns">
                                    <div class="btn" ms-class="{{info.YQRSZT==el.infocode ? 'active':''}}"
                                         ms-click="onRadioClick('YQRSZT',el.infocode)" ms-repeat="RADIOArr">
                                        {{el.info}}
                                    </div>
                                </div>
                            </div>
                        </div>
                        <div class="input-group" ms-if="info.YQRSZT==1">
                            <div class="lb">溶栓后造影时间</div>
                            <div class="input">
                                <input type="text" class="Wdate" ms-duplex-string="info.YQRSHZYSJ"
                                       onclick="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm'})"/>
                            </div>
                        </div>
                        <div class="input-group" ms-if="info.YQRSZT==0">
                            <div class="lb">补救PCI <span class="required">*</span></div>
                            <div class="input">
                                <div class="radio-btns">
                                    <div class="btn" ms-class="{{info.YQBJPCI==el.infocode ? 'active':''}}"
                                         ms-click="onRadioClick('YQBJPCI',el.infocode)" ms-repeat="RADIOArr">
                                        {{el.info}}
                                    </div>
                                </div>
                            </div>
                        </div>
                        <div class="input-group" ms-if="info.YQRSZT==0 && info.YQBJPCI==1">
                            <div class="lb">实际手术时间 <span class="required">*</span></div>
                            <div class="input">
                                <input type="text" class="Wdate" ms-duplex-string="info.YQSJSSSJ"
                                       onclick="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm'})"/>
                            </div>
                        </div>
                        <div class="input-group" ms-if="info.YQRSZT==0 && info.YQBJPCI==1">
                            <div class="input">
                                <div class="radio-btns">
                                    <div class="btn" ms-class="{{info.YQSSDD==el.infocode ? 'active':''}}"
                                         ms-click="onRadioClick('YQSSDD',el.infocode)" ms-repeat="YQSSDDArr">
                                        {{el.info}}
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
            <div class="block">
                <div class="inputs">
                    <div class="input-group">
                        <div class="lb">患者情况备注</div>
                        <div class="input">
                            <input type="text" ms-duplex="info.YQHZQKBZ" style="width: 790px"/>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <div class="tab-container treatment" ms-if="activeTab==1">
            <div class="block">
                <div class="title">心电图</div>
                <div class="inputs">
                    <div class="input-group">
                        <div class="lb">心电图</div>
                        <div class="input">
                            <div class="radio-btns">
                                <div class="btn" ms-class="{{info.XINDT==el.infocode ? 'active':''}}"
                                     ms-click="onRadioClick('XINDT',el.infocode)" ms-repeat="XINDTArr">
                                    {{el.info}}
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="input-group" ms-if="info.XINDT==0">
                        <div class="lb">未获得原因</div>
                        <div class="input">
                            <input type="text" ms-duplex="info.WHDYY"/>
                        </div>
                    </div>
                </div>
                <div class="inputs" ms-if="info.XINDT==1">
                    <div class="input-group">
                        <div class="lb">首份心电图时间 <span class="required">*</span></div>
                        <div class="input" style="padding-right: 10px;">
                            <input type="text" class="Wdate" ms-duplex="info.SFXDTSJ"
                                   onclick="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm'})"/>
                        </div>
                    </div>
					<div class="input-group">
                        <div class="lb">心电图文件 <span class="required">*</span></div>
                        <div class="input" style="padding-right: 10px;">
                            <input type="text" placeholder='请选择心电图文件'/>
                            <div class="btn inlineBtn">上传</div>
                        </div>
                    </div>
                    <div class="input-group">
                        <div class="lb">心电图诊断时间 <span class="required">*</span></div>
                        <div class="input" style="padding-right: 0px;">
                            <input type="text" class="Wdate" ms-duplex="info.SFXDTZDSJ"
                                   onclick="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm'})"/>
                            <span class="iconfont icon-show" ms-click="addItem('child1')" ms-if="!hasChild('child1')"></span>
                        </div>
                    </div>
                </div>
				<div ms-if="info.XINDT==1">
				<div class="inputs" ms-if="hasChild('child1')">
				    <div class="input-group">
				        <div class="lb">心电图时间 <span class="required">*</span></div>
				        <div class="input" style="padding-right: 10px;">
				            <input type="text" class="Wdate" ms-duplex="info.XDTSJ01"
							onclick="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm'})"/>
				        </div>
				    </div>
					<div class="input-group">
				        <div class="lb">心电图文件 <span class="required">*</span></div>
				        <div class="input" style="padding-right: 10px;">
				            <input type="text" placeholder='请选择心电图文件'/>
				            <div class="btn inlineBtn">上传</div>
				        </div>
				    </div>
				    <div class="input-group">
				        <div class="lb">心电图诊断时间 <span class="required">*</span></div>
				        <div class="input" style="padding-right: 0px;">
				            <input type="text" class="Wdate" ms-duplex="info.XDTZDSJ01"
				                   onclick="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm'})"/>
				            <span class="iconfont icon-show" ms-if="hasChild('child1') && !hasChild('child2') "
							 ms-click="addItem('child2')"></span>
							<span class="iconfont icon-hide" ms-click="deleteItem('child1')" ></span>
				        </div>
				    </div>
				</div>
                <div class="inputs" ms-if="hasChild('child2')">
                    <div class="input-group">
                        <div class="lb">心电图时间 <span class="required">*</span></div>
                        <div class="input" style="padding-right: 10px;">
                            <input type="text" class="Wdate" ms-duplex="info.XDTSJ02"
                			onclick="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm'})"/>
                        </div>
                    </div>
                	<div class="input-group">
                        <div class="lb">心电图文件 <span class="required">*</span></div>
                        <div class="input" style="padding-right: 10px;">
                            <input type="text" placeholder='请选择心电图文件'/>
                            <div class="btn inlineBtn">上传</div>
                        </div>
                    </div>
                    <div class="input-group">
                        <div class="lb">心电图诊断时间 <span class="required">*</span></div>
                        <div class="input" style="padding-right: 0px;">
                            <input type="text" class="Wdate" ms-duplex="info.XDTZDSJ02"
                                   onclick="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm'})"/>
                			<span class="iconfont icon-hide" ms-click="deleteItem('child2')"></span>
                        </div>
                    </div>
                </div>
				</div>
				<div class="inputs">
                    <div class="input-group">
                        <div class="lb">远程心电图传输 <span class="required">*</span></div>
                        <div class="input">
                            <div class="radio-btns">
                                <div class="btn" ms-class="{{info.YCXDTCS==el.infocode ? 'active':''}}"
                                     ms-click="onRadioClick('YCXDTCS',el.infocode)" ms-repeat="YCXDTCSArr">
                                    {{el.info}}
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="inputs" ms-if="info.YCXDTCS==0">
                    <div class="input-group">
                        <div class="lb">接收120/网络医院心电图时间 <span class="required">*</span></div>
                        <div class="input">
                            <input type="text" class="Wdate" ms-duplex="info.JSXDTSJ"
                                   onclick="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm'})"/>
                        </div>
                    </div>
                    <div class="input-group">
                        <div class="lb">传输方式 <span class="required">*</span></div>
                        <div class="input">
                            <select name="" ms-duplex="info.CSFS">
                                <option value="">请选择</option>
								<option ms-repeat="CSFSArr" ms-attr-value="el.infocode">{{el.info}}</option>
                            </select>
                        </div>
                    </div>
                </div>
            </div>
            <div class="block">
                <div class="title">实验室检查</div>
                <div class="inputs">
                    <div class="input-group">
                        <div class="lb">肌钙蛋白 <span class="required">*</span></div>
                        <div class="input">
                            <div class="radio-btns">
                                <div class="btn" ms-class="{{info.ISJGDB==el.infocode ? 'active':''}}"
                                     ms-click="onRadioClick('ISJGDB',el.infocode)" ms-repeat="RADIOArr">
                                    {{el.info}}
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="inputs" ms-if="info.ISJGDB==1">
                    <div class="input-group">
                        <div class="lb">首次肌钙蛋白 <span class="required">*</span></div>
                        <div style="padding-right: 0" class="input">
                            <div class="radio-btns fl">
                                <div class="btn" ms-class="{{info.SCJGDB==el.infocode ? 'active':''}}"
                                     ms-click="onRadioClick('SCJGDB',el.infocode)" ms-repeat="SCJGDBArr">
                                     {{el.info}}
                                </div>
                            </div>
                            <input type="text" class="fl" style="width: 56px">
                            <select name="" class="fl" style="width: 67px">
                                <option value="">ng/mL</option>
                                <option value="">ug/L</option>
                            </select>
                            <select name="" class="fl" style="width: 67px">
                                <option value="">请选择</option>
                                <option value="">阴性</option>
                                <option value="">阳性</option>
                            </select>
                        </div>
                    </div>
                    <div class="input-group">
                        <div class="lb">抽血完成时间 <span class="required">*</span></div>
                        <div style="padding-right: 0" class="input">
                            <input type="text" class="Wdate" ms-duplex="info.CXWCSJ01"
                                   onclick="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm'})"/>
                        </div>
                    </div>
                    <div class="input-group">
                        <div class="lb">获得报告时间 <span class="required">*</span></div>
                        <div style="padding-right: 0" class="input">
                            <input type="text" class="Wdate" ms-duplex="info.HDBGSJ01"
                                   onclick="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm'})"/>
							<span class="iconfont icon-show" ms-click="addItem('children1')" ms-if="!hasChild('children1')"></span>
                        </div>
                    </div>
                </div>
                <div ms-if="info.ISJGDB==1">
					<div class="inputs" ms-if="hasChild('children1')">
					<div class="input-group">
					    <div class="lb">肌钙蛋白 <span class="required">*</span></div>
					    <div style="padding-right: 0" class="input">
					        <div class="radio-btns fl">
					            <div class="btn" ms-class="{{info.JGDB02==el.infocode ? 'active':''}}"
					                 ms-click="onRadioClick('JGDB02',el.infocode)" ms-repeat="JGDB02Arr">
					                 {{el.info}}
					            </div>
					        </div>
					        <input type="text" class="fl" style="width: 56px">
					        <select name="" class="fl" style="width: 67px">
					            <option value="">ng/mL</option>
					            <option value="">ug/L</option>
					        </select>
					        <select name="" class="fl" style="width: 67px">
					            <option value="">请选择</option>
					            <option value="">阴性</option>
					            <option value="">阳性</option>
					        </select>
					    </div>
					</div>
					<div class="input-group">
					    <div class="lb">抽血完成时间 <span class="required">*</span></div>
					    <div style="padding-right: 0" class="input">
					        <input type="text" class="Wdate" ms-duplex="info.CXWCSJ02"
					               onclick="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm'})"/>
					    </div>
					</div>
					<div class="input-group">
					    <div class="lb">获得报告时间 <span class="required">*</span></div>
					    <div style="padding-right: 0" class="input">
					        <input type="text" class="Wdate" ms-duplex="info.HDBGSJ02"
					               onclick="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm'})"/>
						    <span class="iconfont icon-show" ms-if="hasChild('children1') && !hasChild('children2') "
						     ms-click="addItem('children2')"></span>
						    <span class="iconfont icon-hide" ms-click="deleteItem('children1')" ></span>
					    </div>
					</div>
					</div>
					<div class="inputs" ms-if="hasChild('children2')">
					<div class="input-group">
					    <div class="lb">肌钙蛋白 <span class="required">*</span></div>
					    <div style="padding-right: 0" class="input">
					        <div class="radio-btns fl">
					            <div class="btn" ms-class="{{info.JGDB03==el.infocode ? 'active':''}}"
					                 ms-click="onRadioClick('JGDB03',el.infocode)" ms-repeat="JGDB03Arr">
					                 {{el.info}}
					            </div>
					        </div>
					        <input type="text" class="fl" style="width: 56px">
					        <select name="" class="fl" style="width: 67px">
					            <option value="">ng/mL</option>
					            <option value="">ug/L</option>
					        </select>
					        <select name="" class="fl" style="width: 67px">
					            <option value="">请选择</option>
					            <option value="">阴性</option>
					            <option value="">阳性</option>
					        </select>
					    </div>
					</div>
					<div class="input-group">
					    <div class="lb">抽血完成时间 <span class="required">*</span></div>
					    <div style="padding-right: 0" class="input">
					        <input type="text" class="Wdate" ms-duplex="info.CXWCSJ03"
					               onclick="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm'})"/>
					    </div>
					</div>
					<div class="input-group">
					    <div class="lb">获得报告时间 <span class="required">*</span></div>
					    <div style="padding-right: 0" class="input">
					        <input type="text" class="Wdate" ms-duplex="info.HDBGSJ03"
					               onclick="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm'})"/>
						    <span class="iconfont icon-hide" ms-click="deleteItem('children2')"></span>
					    </div>
					</div>
				    </div>
				</div>
				<div class="inputs">
                    <div class="input-group">
                        <div class="lb">血清肌酐 <span class="required">*</span></div>
                        <div class="input">
                            <div class="radio-btns">
                                <div class="btn" ms-class="{{info.ISXQJG==el.infocode ? 'active':''}}"
                                     ms-click="onRadioClick('ISXQJG',el.infocode)" ms-repeat="RADIOArr">
                                    {{el.info}}
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="input-group" ms-if="info.ISXQJG==1">
                        <div class="lb">数值 <span class="required">*</span></div>
                        <div class="input">
                            <input type="text" ms-duplex="info.XQJGSZ"/>
                            <div class="unit">umol/L</div>
                        </div>
                    </div>
                </div>
                <div class="inputs">
                    <div class="input-group">
                        <div class="lb">D-二聚体 <span class="required">*</span></div>
                        <div class="input">
                            <div class="radio-btns">
                                <div class="btn" ms-class="{{info.ISDEJT==el.infocode ? 'active':''}}"
                                     ms-click="onRadioClick('ISDEJT',el.infocode)" ms-repeat="RADIOArr">
                                    {{el.info}}
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="input-group" ms-if="info.ISDEJT==1">
                        <div class="lb">数值 <span class="required">*</span></div>
                        <div class="input">
                            <input type="text" ms-duplex="info.DEJTSZ"/>
                            <select name="" ms-duplex="info.DEJTDW" style="width: 70px">
                                <option value="">ng/ml</option>
                            </select>
                        </div>
                    </div>
                </div>
                <div class="inputs">
                    <div class="input-group">
                        <div class="lb">BNP <span class="required">*</span></div>
                        <div class="input">
                            <div class="radio-btns">
                                <div class="btn" ms-class="{{info.ISBNP==el.infocode ? 'active':''}}"
                                     ms-click="onRadioClick('ISBNP',el.infocode)" ms-repeat="RADIOArr">
                                    {{el.info}}
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="input-group" ms-if="info.ISBNP==1">
                        <div class="lb">数值 <span class="required">*</span></div>
                        <div class="input">
                            <input type="text" ms-duplex="info.BNPSZ"/>
                            <div class="unit">pg/mL</div>
                        </div>
                    </div>
                </div>
                <div class="inputs">
                    <div class="input-group">
                        <div class="lb">NT-proBNP <span class="required">*</span></div>
                        <div class="input">
                            <div class="radio-btns">
                                <div class="btn" ms-class="{{info.ISNTPROBNP==el.infocode ? 'active':''}}"
                                     ms-click="onRadioClick('ISNTPROBNP',el.infocode)" ms-repeat="RADIOArr">
                                    {{el.info}}
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="input-group" ms-if="info.ISNTPROBNP==1">
                        <div class="lb">数值 <span class="required">*</span></div>
                        <div class="input">
                            <input type="text" ms-duplex="info.NTPROBNPSZ"/>
                            <div class="unit">pg/mL</div>
                        </div>
                    </div>
                </div>
                <div class="inputs">
                    <div class="input-group">
                        <div class="lb">Myo <span class="required">*</span></div>
                        <div class="input">
                            <div class="radio-btns">
                                <div class="btn" ms-class="{{info.ISMYO==el.infocode ? 'active':''}}"
                                     ms-click="onRadioClick('ISMYO',el.infocode)" ms-repeat="RADIOArr">
                                    {{el.info}}
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="input-group" ms-if="info.ISMYO==1">
                        <div class="lb">数值 <span class="required">*</span></div>
                        <div class="input">
                            <input type="text" ms-duplex="info.MYOSZ"/>
                            <select name="" ms-duplex="info.MYODW" style="width: 70px">
                                <option value="">ng/ml</option>
                            </select>
                        </div>
                    </div>
                </div>
                <div class="inputs">
                    <div class="input-group">
                        <div class="lb">CKMB <span class="required">*</span></div>
                        <div class="input">
                            <div class="radio-btns">
                                <div class="btn" ms-class="{{info.ISCKMB==el.infocode ? 'active':''}}"
                                     ms-click="onRadioClick('ISCKMB',el.infocode)" ms-repeat="RADIOArr">
                                    {{el.info}}
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="input-group" ms-if="info.ISCKMB==1">
                        <div class="lb">数值 <span class="required">*</span></div>
                        <div class="input">
                            <input type="text" ms-duplex="info.CKMBSZ"/>
                            <select name="" ms-duplex="info.CKMBDW" style="width: 70px">
                                <option value="">ng/ml</option>
                            </select>
                        </div>
                    </div>
                </div>
            </div>
            <div class="block">
                <div class="title">心内科会诊</div>
                <div class="inputs">
                    <div class="input-group">
                        <div class="lb">心内科会诊 <span class="required">*</span></div>
                        <div class="input">
                            <div class="radio-btns">
                                <div class="btn" ms-class="{{info.XNKHZ==el.infocode ? 'active':''}}"
                                     ms-click="onRadioClick('XNKHZ',el.infocode)" ms-repeat="RADIOArr">
                                    {{el.info}}
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="inputs" ms-if="info.XNKHZ==1">
                    <div class="input-group">
                        <div class="lb">会诊类型 <span class="required">*</span></div>
                        <div class="input">
                            <div class="radio-btns">
                                <div class="btn" ms-class="{{info.HZLX==el.infocode ? 'active':''}}"
                                     ms-click="onRadioClick('HZLX',el.infocode)" ms-repeat="HZLXArr">
                                    {{el.info}}
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="input-group">
                        <div class="lb">通知会诊时间 <span class="required">*</span></div>
                        <div class="input">
                            <input type="text" class="Wdate" ms-duplex="info.TZHZSJ"
                                   onclick="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm'})"/>
                        </div>
                    </div>
                    <div class="input-group">
                        <div class="lb">会诊时间 <span class="required">*</span></div>
                        <div class="input">
                            <input type="text" class="Wdate" ms-duplex="info.HZSJ"
                                   onclick="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm'})"/>
                        </div>
                    </div>
                </div>
            </div>
            <div class="block">
                <div class="title">诊断</div>
                <div class="inputs">
                    <div class="input-group">
                        <div class="lb">初步诊断</div>
                        <div class="input">
                            <div class="radio-btns">
                                <div class="btn" ms-class="{{info.CBZD==el.infocode ? 'active':''}}"
                                     ms-click="onRadioClick('CBZD',el.infocode)" ms-repeat="CBZDArr">
                                    {{el.info}}
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="inputs">
                    <div class="input-group">
                        <div class="lb">患者自愿放弃后续治疗</div>
                        <div class="input">
                            <div class="radio-btns">
                                <div class="btn" ms-class="{{info.HZZYFQHXZL==el.infocode ? 'active':''}}"
                                     ms-click="onRadioClick('HZZYFQHXZL',el.infocode)" ms-repeat="RADIOArr">
                                    {{el.info}}
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="inputs" ms-if="info.CBZD==7">
                    <div class="input-group">
                        <div class="lb">其它非心源性胸痛类型 <span class="required">*</span></div>
                        <div class="input">
                            <div class="checkbox-group">
                                <div ms-repeat="QTFXYXXTLXArr" class="btn"
                                     ms-class="{{isChecked('QTFXYXXTLX',el.infocode) ? 'active':''}}"
                                     ms-click="onCheckClick('QTFXYXXTLX',el.infocode)">
                                {{el.info}}
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="inputs" ms-if="info.CBZD==6">
                    <div class="input-group">
                        <div class="lb">非ACS心源性胸痛类型 <span class="required">*</span></div>
                    </div>
                </div>
                <div class="inputs" ms-if="info.CBZD==6">
                    <div class="input-group">
                        <div class="input">
                            <div class="checkbox-group">
                                <div ms-repeat="FACSXYXXTLXArr" class="btn"
                                     ms-class="{{isChecked('FACSXYXXTLX',el.infocode) ? 'active':''}}"
                                     ms-click="onCheckClick('FACSXYXXTLX',el.infocode)">
                                {{el.info}}
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="inputs" ms-if="info.CBZD">
                    <div class="input-group">
                        <div class="lb">初步诊断时间 <span class="required">*</span></div>
                        <div class="input">
                            <input type="text" class="Wdate" ms-duplex="info.CBZDSJ"
                                   onclick="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm'})">
                        </div>
                    </div>
                    <div class="input-group">
                        <div class="lb">医生 <span class="required">*</span></div>
                        <div class="input">
                            <input type="text" ms-duplex="info.YISHENG">
                        </div>
                    </div>
                </div>
                <div ms-if="info.CBZD==1 || info.CBZD==2 || info.CBZD==3">
                    <div class="inputs">
                        <div class="input-group">
                            <div class="lb">心功能分级 <span class="required">*</span></div>
                            <div class="input">
                                <div class="radio-btns">
                                    <div class="btn" ms-class="{{info.KILLIP==el.infocode ? 'active':''}}"
                                         ms-click="onRadioClick('KILLIP',el.infocode)" ms-repeat="KILLIPArr">
                                        {{el.info}}
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="inputs">
                        <div class="input-group">
                            <div class="lb">绕行急诊 <span class="required">*</span></div>
                            <div class="input">
                                <div class="radio-btns">
                                    <div class="btn" ms-class="{{info.RXJZ==el.infocode ? 'active':''}}"
                                         ms-click="onRadioClick('RXJZ',el.infocode)" ms-repeat="RADIOArr">
                                        {{el.info}}
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="inputs">
                        <div class="input-group">
                            <div class="lb">绕行CCU <span class="required">*</span></div>
                            <div class="input">
                                <div class="radio-btns">
                                    <div class="btn" ms-class="{{info.RXCCU==el.infocode ? 'active':''}}"
                                         ms-click="onRadioClick('RXCCU',el.infocode)" ms-repeat="RADIOArr">
                                        {{el.info}}
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
                <div ms-if="info.CBZD==4 || info.CBZD==5 ">
                    <div class="inputs">
                        <div class="input-group">
                            <div class="lb lb_check">影像学检查 <span class="required">*</span></div>
                            <div class="input">
                                <div class="checkbox-group">
                                    <!-- <div class="btn" ms-class="{{isChecked('YXXJC',el.infocode) ? 'active':''}}"
                                         ms-click="onCheckClick('YXXJC',el.infocode)" ms-repeat="YXXJCArr">
                                     {{el.info}}
                                    </div> -->
                                    <div class="btn" ms-class="{{isChecked('YXXJC','1') ? 'active':''}}"
                                         ms-click="onDoneClick('YXXJC','1')">
                                        急诊CT
                                    </div>
                                    <div class="btn" ms-class="{{isChecked('YXXJC','2') ? 'active':''}}"
                                         ms-click="onDoneClick('YXXJC','2')" ms-if="info.CBZD==4">
                                        彩超
                                    </div>
                                    <div class="btn" ms-class="{{isChecked('YXXJC','3') ? 'active':''}}"
                                         ms-click="onDoneClick('YXXJC','3')" ms-if="info.CBZD==4">
                                        MRI
                                    </div>
                                    <div class="btn" ms-class="{{isChecked('YXXJC','4') ? 'active':''}}"
                                         ms-click="onDoneClick('YXXJC','4')">
                                        未做
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
					<div class="inputs" ms-if="isChecked('YXXJC','1') && !isChecked('YXXJC','4')">
                        <div class="input-group">
                            <div class="lb">通知CT室时间<span class="required">*</span></div>
                            <div class="input">
                                <input type="text" class="Wdate" ms-duplex="info.TZCTSSJ"
                                       onclick="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm'})"/>
                            </div>
                        </div>
                        <div class="input-group">
                            <div class="lb">CT室完成准备<span class="required">*</span></div>
                            <div class="input">
                                <input type="text" class="Wdate" ms-duplex="info.CTSWCZBSJ"
                                       onclick="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm'})"/>
                            </div>
                        </div>
                        <div class="input-group">
                            <div class="lb">CT扫描开始时间</div>
                            <div class="input">
                                <input type="text" class="Wdate" ms-duplex="info.CTSMKSSJ"
                                       onclick="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm'})"/>
                            </div>
                        </div>
                    </div>
                    <div class="inputs" ms-if="isChecked('YXXJC','1') && !isChecked('YXXJC','4')">
                        <div class="input-group">
                            <div class="lb">CT报告时间</div>
                            <div class="input">
                                <input type="text" class="Wdate" ms-duplex="info.CTBGSJ"
                                       onclick="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm'})"/>
                            </div>
                        </div>
                    </div>
                    <div class="inputs" ms-if="isChecked('YXXJC','2') && !isChecked('YXXJC','4')">
                        <div class="input-group">
                            <div class="lb">通知彩超室时间<span class="required">*</span></div>
                            <div class="input">
                                <input type="text" class="Wdate" ms-duplex="info.TZCCSSJ"
                                       onclick="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm'})"/>
                            </div>
                        </div>
                        <div class="input-group">
                            <div class="lb">彩超检查时间<span class="required">*</span></div>
                            <div class="input">
                                <input type="text" class="Wdate" ms-duplex="info.CCJCSJ"
                                       onclick="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm'})"/>
                            </div>
                        </div>
                        <div class="input-group">
                            <div class="lb">彩超出结果时间</div>
                            <div class="input">
                                <input type="text" class="Wdate" ms-duplex="info.CCCJGSJ"
                                       onclick="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm'})"/>
                            </div>
                        </div>
                    </div>
                </div>
                <div ms-if="info.CBZD==4">
                    <div class="inputs">
                        <div class="input-group">
                            <div class="lb">通知心外科会诊</div>
                            <div class="input">
                                <input type="text" class="Wdate" ms-duplex="info.TZXWKHZSJ"
                                       onclick="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm'})"/>
                            </div>
                        </div>
                        <div class="input-group">
                            <div class="lb">心外科会诊时间</div>
                            <div class="input">
                                <input type="text" class="Wdate" ms-duplex="info.XWKHZSJ"
                                       onclick="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm'})"/>
                            </div>
                        </div>
                    </div>
                    <div class="inputs">
                        <div class="input-group">
                            <div class="lb">夹层类型 <span class="required">*</span></div>
                            <div class="input">
                                <div class="radio-btns">
                                    <div class="btn" ms-class="{{info.JCLX==0 ? 'active':''}}"
                                         ms-click="onRadioClick('JCLX','0')">
                                        A型
                                    </div>
                                    <div class="btn" ms-class="{{info.JCLX==1 ? 'active':''}}"
                                         ms-click="onRadioClick('JCLX','1')">
                                        B型
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="inputs">
                        <div class="input-group">
                            <div class="lb">治疗策略 <span class="required">*</span></div>
                            <div class="input">
                                <div class="radio-btns">
                                    <div class="btn" ms-class="{{info.ZLCL==el.infocode ? 'active':''}}"
                                         ms-click="onRadioClick('ZLCL',el.infocode)" ms-repeat="ZLCLArr">
                                        {{el.info}}
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="inputs" ms-if="info.CBZD==6 || info.CBZD==7 || info.CBZD==8">
                    <div class="input-group">
                        <div class="lb">处理措施 <span class="required">*</span></div>
                        <div class="input">
                            <div class="radio-btns">
                                <div class="btn" ms-class="{{info.CLCS==1 ? 'active':''}}"
                                     ms-click="onRadioClick('CLCS',1)">
                                    收治入院
                                </div>
                                <div class="btn" ms-class="{{info.CLCS==2 ? 'active':''}}"
                                     ms-click="onRadioClick('CLCS',2)">
                                    急诊留观
                                </div>
                                <div class="btn" ms-class="{{info.CLCS==3 ? 'active':''}}"
                                     ms-click="onRadioClick('CLCS',3)">
                                    门诊治疗
                                </div>
                                <div class="btn" ms-class="{{info.CLCS==4 ? 'active':''}}"
                                     ms-click="onRadioClick('CLCS',4)">
                                    随访
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
            <div class="block" ms-if="info.CBZD==1 || info.CBZD==2 || info.CBZD==3">
                <div class="title">初始药物</div>
                <div class="inputs">
                    <div class="input-group">
                        <div class="lb">抗血小板治疗 <span class="required">*</span></div>
                        <div class="input">
                            <div class="radio-btns">
                                <div class="btn" ms-class="{{info.KXXBZL==el.infocode ? 'active':''}}"
                                     ms-click="onRadioClick('KXXBZL',el.infocode)" ms-repeat="RADIOArr">
                                    {{el.info}}
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
                <div ms-if="info.KXXBZL==1" class="inputs">
                    <div class="input-group">
                        <div class="lb">阿司匹林 <span class="required">*</span></div>
                        <div class="input">
                            <div class="radio-btns">
                                <div class="btn" ms-class="{{info.ASPLJL==el.infocode ? 'active':''}}"
                                     ms-click="onRadioClick('ASPLJL',el.infocode)" ms-repeat="ASPLJLArr">
                                    {{el.info}}
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="input-group">
                        <div class="lb">时间 <span class="required">*</span></div>
                        <div class="input">
                            <input type="text" class="Wdate" ms-duplex="info.ASPLSJ"
                                   onclick="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm'})"/>
                        </div>
                    </div>
                </div>
                <div ms-if="info.KXXBZL==1" class="inputs">
                    <div class="input-group">
                        <div class="lb">氯吡格雷 <span class="required">*</span></div>
                        <div class="input">
                            <div class="radio-btns">
                                <div class="btn" ms-class="{{info.LBGLJL==el.infocode ? 'active':''}}"
                                     ms-click="onRadioClick('LBGLJL',el.infocode)" ms-repeat="LBGLJLArr">
                                    {{el.info}}
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="input-group">
                        <div class="lb">时间 <span class="required">*</span></div>
                        <div class="input">
                            <input type="text" class="Wdate" ms-duplex="info.LBGLSJ"
                                   onclick="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm'})"/>
                        </div>
                    </div>
                </div>
                <div ms-if="info.KXXBZL==1" class="inputs">
                    <div class="input-group">
                        <div class="lb">替格瑞洛 <span class="required">*</span></div>
                        <div class="input">
                            <div class="radio-btns">
                                <div class="btn" ms-class="{{info.TGRLJL==el.infocode ? 'active':''}}"
                                     ms-click="onRadioClick('TGRLJL',el.infocode)" ms-repeat="TGRLJLArr">
                                    {{el.info}}
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="input-group">
                        <div class="lb">时间 <span class="required">*</span></div>
                        <div class="input">
                            <input type="text" class="Wdate" ms-duplex="info.TGRLSJ"
                                   onclick="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm'})"/>
                        </div>
                    </div>
                </div>

                <div class="inputs">
                    <div class="input-group">
                        <div class="lb">抗凝 <span class="required">*</span></div>
                        <div class="input">
                            <div class="radio-btns">
                                <div class="btn" ms-class="{{info.KANGN==el.infocode ? 'active':''}}"
                                     ms-click="onRadioClick('KANGN',el.infocode)" ms-repeat="RADIOArr">
                                    {{el.info}}
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="inputs" ms-if="info.KANGN==1">
                    <div class="input-group">
                        <div class="lb">抗凝</div>
                        <div class="input">
                            <select name="" ms-duplex="info.KNYW">
                                <option value="">请选择</option>
                            </select>
                        </div>
                    </div>
                    <div class="input-group">
                        <div class="lb">剂量</div>
                        <div class="input">
                            <input type="text" ms-duplex="info.KNYWJL"/>
                            <input type="text" ms-duplex="info.KNYWDW" style="width: 60px" placeholder="单位"/>
                        </div>
                    </div>
                    <div class="input-group">
                        <div class="lb">时间</div>
                        <div class="input">
                            <input type="text" class="Wdate" ms-duplex="info.KNYWSJ"
                                   onclick="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm'})"/>
                        </div>
                    </div>
                </div>
                <div class="inputs">
                    <div class="input-group">
                        <div class="lb">他汀治疗</div>
                        <div class="input">
                            <div class="radio-btns">
                                <div class="btn" ms-class="{{info.TTZL==el.infocode ? 'active':''}}"
                                     ms-click="onRadioClick('TTZL',el.infocode)" ms-repeat="RADIOArr">
                                    {{el.info}}
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="inputs">
                    <div class="input-group">
                        <div class="lb">β受体阻滞剂</div>
                        <div class="input">
                            <div class="radio-btns">
                                <div class="btn" ms-class="{{info.BSTZZJ==el.infocode ? 'active':''}}"
                                     ms-click="onRadioClick('BSTZZJ',el.infocode)" ms-repeat="RADIOArr">
                                    {{el.info}}
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
            <div class="block" ms-if="info.CBZD==2 || info.CBZD==3">
                <div class="title">Grace评估</div>
                <div class="inputs">
                    <div class="input-group">
                        <div class="input">
                            <div class="checkbox-group">
                                <div ms-repeat="WXYSArr" class="btn"
                                     ms-class="{{isChecked('WXYS',el.infocode) ? 'active':''}}"
                                     ms-click="onCheckClick('WXYS',el.infocode)">
                                    {{el.info}}
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="inputs">
                    <div class="input-group">
                        <div class="input">
                            <div class="lb">Grace极高危条件（满足其一即可）</div>
                        </div>
                    </div>
                </div>
                <div class="inputs">
                    <div class="input-group">
                        <div class="checkbox-group">
                            <div ms-repeat="GRACEJGWTJArr" class="btn"
                                 ms-class="{{isChecked('GRACEJGWTJ',el.infocode) ? 'active':''}}"
                                 ms-click="onCheckClick('GRACEJGWTJ',el.infocode)">
                                {{el.info}}
                            </div>
                        </div>
                    </div>
                </div>
                <div class="inputs">
                    <div class="input-group">
                        <div class="lb">Grace危险分层</div>
                        <div class="input">
                            <div class="radio-btns">
                                <div class="btn" ms-class="{{info.GRACEWXFC==el.infocode ? 'active':''}}"
                                     ms-click="onRadioClick('GRACEWXFC',el.infocode)" ms-repeat="GRACEWXFCArr">
                                    {{el.info}}
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
            <div class="block" ms-if="info.CBZD==2 || info.CBZD==3">
                <div class="title">再次危险分层</div>
                <div class="inputs">
                    <div class="input-group">
                        <div class="lb">再次危险分层</div>
                        <div class="input">
                            <div class="radio-btns">
                                <div class="btn" ms-class="{{info.ZCWXFC==el.infocode ? 'active':''}}"
                                     ms-click="onRadioClick('ZCWXFC',el.infocode)" ms-repeat="ZCWXFCArr">
                                    {{el.info}}
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="input-group" ms-visible="info.ZCWXFC && info.ZCWXFC!=1">
                        <div class="lb">再次危险分层时间</div>
                        <div class="input">
                            <input type="text" ms-duplex="info.ZCWXFCSJ" class="Wdate"
                                   onclick="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm'})"/>
                        </div>
                    </div>
                </div>
            </div>
            <div class="block" ms-if="(info.CBZD==2 || info.CBZD==3) && info.ZCWXFC!=2">
                <div class="title">处理策略</div>
                <div class="inputs">
                    <div class="input-group">
                        <div class="lb">策略 <span class="required">*</span></div>
                        <div class="input">
                            <div class="radio-btns">
                                <div class="btn" ms-class="{{info.CLCL==el.infocode ? 'active':''}}"
                                     ms-click="onRadioClick('CLCL',el.infocode)" ms-repeat="CLCLArr">
                                    {{el.info}}
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="inputs" ms-visible="info.CLCL==1">
                    <div class="input-group">
                        <div class="lb">侵入性策略 <span class="required">*</span></div>
                        <div class="input">
                            <div class="radio-btns">
                                <div class="btn" ms-class="{{info.QRXCL==el.infocode ? 'active':''}}"
                                     ms-click="onRadioClick('QRXCL',el.infocode)" ms-repeat="QRXCLArr">
                                    {{el.info}}
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="inputs" ms-if="info.QRXCL==1">
                    <div class="input-group">
                        <div class="lb">决定医生</div>
                        <div class="input">
                            <input type="text" ms-duplex="info.JDXPCIYS"/>
                        </div>
                    </div>
                    <div class="input-group">
                        <div class="lb">决定介入手术时间<span class="required">*</span></div>
                        <div class="input">
                            <input type="text" class="Wdate" ms-duplex="info.JDJRSSSJ"
                                   onclick="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm'})"/>
                        </div>
                    </div>
                    <div class="input-group">
                        <div class="lb">启动导管室时间<span class="required">*</span></div>
                        <div class="input">
                            <input type="text" class="Wdate" ms-duplex="info.QDDGSSJ"
                                   onclick="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm'})"/>
                        </div>
                    </div>
                </div>
                <div class="inputs" ms-if="info.QRXCL==1">
                    <div class="input-group">
                        <div class="lb">开始知情同意时间<span class="required">*</span></div>
                        <div class="input">
                            <input type="text" class="Wdate" ms-duplex="info.KSZQTYSJ"
                                   onclick="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm'})"/>
                        </div>
                    </div>
                    <div class="input-group">
                        <div class="lb">签署知情同意时间<span class="required">*</span></div>
                        <div class="input">
                            <input type="text" class="Wdate" ms-duplex="info.QSZQTYSJ"
                                   onclick="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm'})"/>
                        </div>
                    </div>
                </div>
                <div class="inputs" ms-visible="info.QRXCL==2">
                    <div class="input-group">
                        <div class="lb">实际介入治疗时间 <span class="required">*</span></div>
                        <div class="input">
                            <input type="text" ms-duplex="info.SJJRZLSJ"
                            	onclick="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm'})" />
                        </div>
                    </div>
                </div>

            </div>
            <div class="block" ms-if="info.ZCWXFC==2 || info.CBZD==1">
                <div class="title">再灌注措施<span class="required">*</span></div>
                <div class="inputs">
                    <div class="input-group">
                        <div class="input">
                            <div class="radio-btns">
                                <div class="btn" ms-class="{{info.ZGZCS==el.infocode ? 'active':''}}"
                                     ms-click="onRadioClick('ZGZCS',el.infocode)" ms-repeat="ZGZCSArr">
                                    {{el.info}}
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="input-group" ms-if="info.ZGZCS == 1">
                        <div class="lb">措施 <span class="required">*</span></div>
                        <div class="input">
                            <div class="radio-btns">
                                <div class="btn" ms-class="{{info.CUOS==1 ? 'active':''}}"
                                     ms-click="onRadioClick('CUOS','1')">
                                    直接PCI
                                </div>
                                <div class="btn" ms-class="{{info.CUOS==2 ? 'active':''}}"
                                     ms-click="onRadioClick('CUOS','2')">
                                    溶栓
                                </div>
                                <div class="btn" ms-class="{{info.ZGZRSCS==0 ? 'active':''}}" ms-visible="info.CUOS==2"
                                     ms-click="onRadioClick('ZGZRSCS','0')">
                                    补救PCI
                                </div>
                                <div class="btn" ms-class="{{info.ZGZRSCS==1 ? 'active':''}}" ms-visible="info.CUOS==2"
                                     ms-click="onRadioClick('ZGZRSCS','1')">
                                    溶栓后介入
                                </div>
                                <div class="btn" ms-class="{{info.CUOS==3 ? 'active':''}}"
                                     ms-click="onRadioClick('CUOS','3')">
                                    择期介入
                                </div>
                                <div class="btn" ms-class="{{info.CUOS==4 ? 'active':''}}"
                                     ms-click="onRadioClick('CUOS','4')">
                                    CABG
                                </div>
                                <div class="btn" ms-class="{{info.CUOS==5 ? 'active':''}}"
                                     ms-click="onRadioClick('CUOS','5')">
                                    转运PCI
                                </div>
                            </div>
                        </div>
                    </div>

                </div>
                <div class="inputs" ms-if="info.ZGZCS==0">
                    <div class="input-group">
                        <div class="lb lb_check">无再灌注措施 <span class="required">*</span></div>
                        <div class="input">
                            <div class="checkbox-group">
                                <div ms-repeat="WZGZCSYYArr" class="btn"
                                     ms-class="{{isChecked('WZGZCSYY',el.infocode) ? 'active':''}}"
                                     ms-click="onCheckClick('WZGZCSYY',el.infocode)">
                                    {{el.info}}
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="inputs" ms-visible="info.ZGZRSCS==0 && info.ZGZCS==1 ">
                    <div class="input-group">
                        <div class="lb">决定介入手术时间<span class="required">*</span></div>
                        <div class="input">
                            <input type="text" class="Wdate" ms-duplex="info.JDJRSSSJ"
                                   onclick="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm'})"/>
                        </div>
                    </div>
                </div>
                <div class="inputs" ms-if="info.ZGZCS==1 && info.CUOS == 1">
                    <div class="input-group">
                        <div class="lb">决定医生</div>
                        <div class="input">
                            <input type="text" ms-duplex="info.JDXPCIYS"/>
                        </div>
                    </div>
                    <div class="input-group">
                        <div class="lb">决定介入手术时间<span class="required">*</span></div>
                        <div class="input">
                            <input type="text" class="Wdate" ms-duplex="info.JDJRSSSJ"
                                   onclick="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm'})"/>
                        </div>
                    </div>
                    <div class="input-group">
                        <div class="lb">启动导管室时间<span class="required">*</span></div>
                        <div class="input">
                            <input type="text" class="Wdate" ms-duplex="info.QDDGSSJ"
                                   onclick="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm'})"/>
                        </div>
                    </div>
                </div>
                <div class="inputs" ms-if="info.ZGZCS==1 && info.CUOS == 1">
                    <div class="input-group">
                        <div class="lb">开始知情同意时间<span class="required">*</span></div>
                        <div class="input">
                            <input type="text" class="Wdate" ms-duplex="info.KSZQTYSJ"
                                   onclick="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm'})"/>
                        </div>
                    </div>
                    <div class="input-group">
                        <div class="lb">签署知情同意时间<span class="required">*</span></div>
                        <div class="input">
                            <input type="text" class="Wdate" ms-duplex="info.QSZQTYSJ"
                                   onclick="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm'})"/>
                        </div>
                    </div>
                </div>
                <div class="inputs" ms-if="info.ZGZCS==1 && info.CUOS == 3">
                    <div class="input-group">
                        <div class="lb">决定介入手术时间<span class="required">*</span></div>
                        <div class="input">
                            <input type="text" class="Wdate" ms-duplex="info.JDJRSSSJ"
                                   onclick="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm'})"/>
                        </div>
                    </div>
                    <div class="input-group">
                        <div class="lb">造影开始时间 <span class="required">*</span></div>
                        <div class="input">
                            <input type="text" class="Wdate" ms-duplex="info.ZYKSSJ"
                                   onclick="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm'})"/>
                        </div>
                    </div>
                </div>
                <div class="inputs" ms-if="info.ZGZCS==1 && info.CUOS == 4">
                    <div class="input-group">
                        <div class="lb">决定CABG时间<span class="required">*</span></div>
                        <div class="input">
                            <input type="text" class="Wdate" ms-duplex="info.JDCABGSJ"
                                   onclick="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm'})"/>
                        </div>
                    </div>
                    <div class="input-group">
                        <div class="lb">开始CABG时间<span class="required">*</span></div>
                        <div class="input">
                            <input type="text" class="Wdate" ms-duplex="info.KSCABGSJ"
                                   onclick="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm'})"/>
                        </div>
                    </div>
                </div>
                <div class="inputs" ms-if="info.ZGZCS==1 && info.CUOS == 5">
                    <div class="input-group">
                        <div class="lb">转运PCI<span class="required">*</span></div>
                        <div class="input">
                            <div class="radio-btns">
                                <div class="btn" ms-class="{{info.ZYPCI==0 ? 'active':''}}"
                                     ms-click="onRadioClick('ZYPCI','0')">
                                    转出患者
                                </div>
                                <div class="btn" ms-class="{{info.ZYPCI==1 ? 'active':''}}"
                                     ms-click="onRadioClick('ZYPCI','1')">
                                    接收患者
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
            <div class="block" ms-if="(info.ZGZCS==1 && info.CUOS==2)||info.CBZD==5">
                <div class="title">院内溶栓治疗</div>
                <div class="inputs">
                    <div class="input-group">
                        <div class="lb">溶栓筛查 <span class="required">*</span></div>
                        <div class="input">
                            <div class="radio-btns">
                                <div class="btn" ms-class="{{info.YNRSSC==el.infocode ? 'active':''}}"
                                     ms-click="onRadioClick('YNRSSC',el.infocode)" ms-repeat="YNRSSCArr">
                                    {{el.info}}
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="input-group" ms-visible="info.YNRSSC==1">
                        <div class="lb">溶栓治疗 <span class="required">*</span></div>
                        <div class="input">
                            <div class="radio-btns">
                                <div class="btn" ms-class="{{info.YNRSZL==0 ? 'active':''}}"
                                     ms-click="onRadioClick('YNRSZL','0')">有
                                </div>
                                <div class="btn" ms-class="{{info.YNRSZL==1 ? 'active':''}}"
                                     ms-click="onRadioClick('YNRSZL','1')">无
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="input-group" ms-visible="info.YNRSSC==2">
                        <div class="lb">存在禁忌症 <span class="required">*</span></div>
                        <div class="input">
                            <div class="radio-btns">
                                <div class="btn" ms-class="{{info.YNCZJJZ==0 ? 'active':''}}"
                                     ms-click="onRadioClick('YNCZJJZ','0')">否
                                </div>
                                <div class="btn" ms-class="{{info.YNCZJJZ==1 ? 'active':''}}"
                                     ms-click="onRadioClick('YNCZJJZ','1')">是
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
                <div ms-if="info.YNRSZL==0 && info.CBZD!=5 && info.YNRSSC==1">
                    <div class="inputs">
                        <div class="input-group">
                            <div class="lb">直达溶栓场所 <span class="required">*</span></div>
                            <div class="input">
                                <div class="radio-btns">
                                    <div class="btn" ms-class="{{info.YNZDRSCS==0 ? 'active':''}}"
                                         ms-click="onRadioClick('YNZDRSCS','0')">
                                        否
                                    </div>
                                    <div class="btn" ms-class="{{info.YNZDRSCS==1 ? 'active':''}}"
                                         ms-click="onRadioClick('YNZDRSCS','1')">
                                        是
                                    </div>
                                </div>
                            </div>
                        </div>
                        <div class="input-group">
                            <div class="lb">溶栓场所 <span class="required">*</span></div>
                            <div class="input">
                                <div class="radio-btns">
                                    <div class="btn" ms-class="{{info.YNRSCS==1 ? 'active':''}}"
                                         ms-click="onRadioClick('YNRSCS','1')">
                                        本院急诊科
                                    </div>
                                    <div class="btn" ms-class="{{info.YNRSCS==2 ? 'active':''}}"
                                         ms-click="onRadioClick('YNRSCS','2')">
                                        本院心内科
                                    </div>
                                    <div class="btn" ms-class="{{info.YNRSCS==3 ? 'active':''}}"
                                         ms-click="onRadioClick('YNRSCS','3')">
                                        其他科室
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="inputs">
                        <div class="input-group">
                            <div class="lb">开始知情同意 <span class="required">*</span></div>
                            <div class="input">
                                <input type="text" ms-duplex-string="info.YNKSZQTYSJ" class="Wdate"
                                       onclick="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm'})"/>
                            </div>
                        </div>
                        <div class="input-group">
                            <div class="lb">签署知情同意书 <span class="required">*</span></div>
                            <div class="input">
                                <input type="text" ms-duplex-string="info.YNQSZQTYSSJ" class="Wdate"
                                       onclick="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm'})"/>
                            </div>
                        </div>
                    </div>
                    <div class="inputs">
                        <div class="input-group">
                            <div class="lb">开始溶栓时间 <span class="required">*</span></div>
                            <div class="input">
                                <input type="text" ms-duplex-string="info.YNKSRSSJ" class="Wdate"
                                       onclick="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm'})"/>
                            </div>
                        </div>
                        <div class="input-group">
                            <div class="lb">溶栓结束时间 <span class="required">*</span></div>
                            <div class="input">
                                <input type="text" ms-duplex-string="info.YNRSJSSJ" class="Wdate"
                                       onclick="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm'})"/>
                            </div>
                        </div>
                    </div>
                    <div class="inputs">
                        <div class="input-group">
                            <div class="lb">药物 <span class="required">*</span></div>
                            <div class="input">
                                <select name="" ms-duplex="info.YNYW">
                                    <option value="">请选择</option>
                                </select>
                            </div>
                        </div>
                        <div class="input-group">
                            <div class="lb">剂量 <span class="required">*</span></div>
                            <div class="input">
                                <select name="" ms-duplex="info.YNJL">
                                    <option value="">请选择</option>
                                </select>
                            </div>
                        </div>
                    </div>
                    <div class="inputs">
                        <div class="input-group">
                            <div class="lb">溶栓再通 <span class="required">*</span></div>
                            <div class="input">
                                <div class="radio-btns">
                                    <div class="btn" ms-class="{{info.YQRSZT==el.infocode ? 'active':''}}"
                                         ms-click="onRadioClick('YQRSZT',el.infocode)" ms-repeat="RADIOArr">
                                        {{el.info}}
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
            <div ms-if="info.ZGZCS==1 ">
            <div ms-if="(info.CUOS==2 && (info.ZGZRSCS==1 || info.ZGZRSCS==0)) || info.CUOS==1 || info.ZYPCI == 1 || info.QRXCL==1">
                <div class="block">
					<div class="bar">导管室</div>
                    <div class="title">基本信息</div>
                    <div class="inputs" ms-if="info.CUOS == 1">
                        <div class="input-group">
                            <div class="lb">导管室激活时间<span class="required">*</span></div>
                            <div class="input">
                                <input type="text" class="Wdate" ms-duplex="info.DGSJHSJ"
                                       onclick="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm'})"/>
                            </div>
                        </div>
                        <div class="input-group">
                            <div class="lb">患者到达导管室</div>
                            <div class="input">
                                <input type="text" class="Wdate" ms-duplex="info.HZDDDGSSJ"
                                       onclick="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm'})"/>
                            </div>
                        </div>
                        <div class="input-group">
                            <div class="lb">介入医师</div>
                            <div class="input">
                                <input type="text" ms-duplex="info.JRYS"/>
                            </div>
                        </div>
                    </div>
                    <div class="inputs">
                        <div class="input-group" ms-if="info.CUOS == 1">
                            <div class="lb">开始穿刺时间</div>
                            <div class="input">
                                <input type="text" class="Wdate" ms-duplex="info.KSCCSJ"
                                       onclick="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm'})"/>
                            </div>
                        </div>
                        <div class="input-group">
                            <div class="lb">造影开始时间</div>
                            <div class="input">
                                <input type="text" class="Wdate" ms-duplex="info.ZYKSSJ"
                                       onclick="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm'})"/>
                            </div>
                        </div>
                    </div>
                    <div class="inputs" ms-if="info.CUOS == 1">
                        <div class="input-group">
                            <div class="lb">术中抗凝给药时间</div>
                            <div class="input">
                                <input type="text" class="Wdate" ms-duplex="info.SZKNGYSJ"
                                       onclick="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm'})"/>
                            </div>
                        </div>
                        <div class="input-group">
                            <div class="lb">术中抗凝药物</div>
                            <div class="input">
                                <select name="" ms-duplex="info.SZKNYW">
                                    <option value="">请选择</option>
                                </select>
                            </div>
                        </div>
                        <div class="input-group">
                            <div class="lb">术中抗凝药物剂量</div>
                            <div class="input">
                                <input type="text" ms-duplex="info.SZKNYWJL"/>
                                <input type="text" style="width: 60px" placeholder="单位" ms-duplex="info.SZKNYWDW"/>
                            </div>
                        </div>
                    </div>
                    <div class="inputs" ms-if="info.CUOS == 1">
                        <div class="input-group">
                            <div class="lb">手术结束时间<span class="required">*</span></div>
                            <div class="input">
                                <input type="text" class="Wdate" ms-duplex="info.SSJSSJ"
                                       onclick="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm'})"/>
                            </div>
                        </div>
                    </div>
                    <div class="inputs" ms-if="info.CUOS == 1">
                        <div class="input-group">
                            <div class="lb">D2W时间</div>
                            <div class="input">
                                <input type="text" ms-duplex="info.D2WSJ"/>
                                <div class="unit">min</div>
                            </div>
                        </div>
                    </div>
                    <div class="inputs" ms-if="info.CUOS == 1" >
                        <div class="input-group">
                            <div class="lb">是否延误</div>
                            <div class="input">
                                <div class="radio-btns">
                                    <div class="btn" ms-class="{{info.SFYW==el.infocode ? 'active':''}}"
                                         ms-click="onRadioClick('SFYW',el.infocode)" ms-repeat="SFYWArr">
                                        {{el.info}}
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="inputs" ms-if="info.SFYW == 1">
                        <div style="margin-left: 130px">
                            <div class="checkbox-group">
                                <div ms-repeat="YWYYArr" class="btn"
                                     ms-class="{{isChecked('YWYY',el.infocode) ? 'active':''}}"
                                     ms-click="onCheckClick('YWYY',el.infocode)">
                                {{el.info}}
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="block">
                    <div class="title">入路</div>
                    <div class="inputs">
                        <div class="input-group">
                            <div class="lb">入路<span class="required">*</span></div>
                            <div class="input">
                                <div class="radio-btns">
                                    <div class="btn" ms-class="{{info.RULU==el.infocode ? 'active':''}}"
                                         ms-click="onRadioClick('RULU',el.infocode)" ms-repeat="RULUArr">
                                        {{el.info}}
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="block">
                    <div class="title">冠脉造影</div>
                    <div>
                        <img width="350px" height="300px" src="${baseurl}images/edpc/position.png" alt="">
                        <div class="path-group checkbox-group" style="display: inline-block">
                            <div ms-repeat="GMZYArr" class="btn"
                                 ms-class="{{isChecked('GMZY',el.infocode)? 'active':''}}"
                                 ms-click="onCheckClick('GMZY',el.infocode)">
                             {{el.info}}
                            </div>
                        </div>
                    </div>
                </div>
               <div id="block-group">
                    <div class="block" ms-if="(GMZYSel.$model).indexOf('1') > -1">
                        <div class="title">右冠近段</div>
                        <div class="inputs">
                            <div class="input-group">
                                <div class="lb">狭窄程度<span class="required">*</span></div>
                                <div class="input">
                                    <div class="radio-btns">
                    					<div class="btn" ms-class="{{info.XZCD01==el.infocode ? 'active':''}}" ms-click="onRadioClick('XZCD01',el.infocode)" ms-repeat="XZCDArr">
                    					    {{el.info}}
                    					</div>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <div class="inputs">
                            <div class="input-group">
                                <div class="lb">造影时TIMI血流<span class="required">*</span></div>
                                <div class="input">
                                    <div class="radio-btns">
                    					<div class="btn" ms-class="{{info.ZYSTIMIXL01==el.infocode ? 'active':''}}" ms-click="onRadioClick('ZYSTIMIXL01',el.infocode)" ms-repeat="ZYSTIMIXLArr">
                    					     {{el.info}}
                    					</div>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <div class="inputs">
                            <div class="input-group">
                                <div class="lb">支架内血栓<span class="required">*</span></div>
                                <div class="input">
                                    <div class="radio-btns">
                    					<div class="btn" ms-class="{{info.ZJNXS01==el.infocode ? 'active':''}}" ms-click="onRadioClick('ZJNXS01',el.infocode)" ms-repeat="RADIOArr">
                    					     {{el.info}}
                    					</div>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <div class="inputs">
                            <div class="input-group">
                                <div class="lb">是否分叉病变<span class="required">*</span></div>
                                <div class="input">
                                    <div class="radio-btns">
                                        <div class="btn" ms-class="{{info.SFFCBB01==el.infocode ? 'active':''}}"  ms-click="onRadioClick('SFFCBB01',el.infocode)" ms-repeat="RADIOArr" >
                                             {{el.info}}
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <div class="inputs">
                            <div class="input-group">
                                <div class="lb">是否CTO<span class="required">*</span></div>
                                <div class="input">
                                    <div class="radio-btns">
                    					<div class="btn" ms-class="{{info.SFCTO01==el.infocode ? 'active':''}}"  ms-click="onRadioClick('SFCTO01',el.infocode)" ms-repeat="RADIOArr">
                    					     {{el.info}}
                    					</div>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <div class="inputs">
                            <div class="input-group">
                                <div class="lb">钙化病变<span class="required">*</span></div>
                                <div class="input">
                                    <div class="radio-btns">
                    					<div class="btn" ms-class="{{info.GHBB01==el.infocode ? 'active':''}}" ms-click="onRadioClick('GHBB01',el.infocode)" ms-repeat="RADIOArr">
                    					     {{el.info}}
                    					</div>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <div class="inputs">
                            <div class="input-group">
                                <div class="lb">罪犯病变<span class="required">*</span></div>
                                <div class="input">
                                    <div class="radio-btns">
                    					<div class="btn" ms-class="{{info.ZFBB01==el.infocode ? 'active':''}}" ms-click="onRadioClick('ZFBB01',el.infocode)" ms-repeat="RADIOArr">
                    					 {{el.info}}
                    					</div>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <div class="inputs">
                            <div class="input-group">
                                <div class="lb">PCI<span class="required">*</span></div>
                                <div class="input">
                                    <div class="radio-btns">
                    					<div class="btn" ms-class="{{info.GMZYPCI01==el.infocode ? 'active':''}}" ms-click="onRadioClick('GMZYPCI01',el.infocode)" ms-repeat="RADIOArr">
                    					{{el.info}}
                    					</div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    	<div ms-if="info.GMZYPCI01==1">
                    	   <div class="inputs">
                    		 <div class="input-group">
                    		   <div class="lb lb_check">术中处理 <span class="required">*</span></div>
                    		    <div class="input">
                    		        <div class="checkbox-group">
                    					<div ms-repeat="SZCLArr" class="btn"
                    					     ms-class="{{isChecked('SZCL01',el.infocode) ? 'active':''}}" ms-click="onSelectClick('SZCL01',el.infocode)">
                    					    {{el.info}}
                    					</div>
                    		        </div>
                    		    </div>
                    		 </div>
                    	   </div>
                    	   <div class="inputs">
                    		<div class="input-group">
                    		    <div class="lb">导丝通过时间</div>
                    		    <div class="input">
                    		       <input type="text"  class="Wdate input" onclick="WdatePicker({dateFmt:'yyyy-MM-dd'})" ms-duplex="info.DSTGSJ01"/>
                    		    </div>
                    		</div>
                    	   </div>
                    	   <div class="inputs">
                    	       <div class="input-group">
                    	           <div class="lb">术后TIMI血流<span class="required">*</span></div>
                    	           <div class="input">
                    	               <div class="radio-btns">
                    					   <div class="btn" ms-class="{{info.SHTIMIXL01==el.infocode ? 'active':''}}" ms-click="onRadioClick('SHTIMIXL01',el.infocode)" ms-repeat="SHTIMIXLArr">
                    					       {{el.info}}
                    					   </div>
                    	               </div>
                    	           </div>
                    	       </div>
                    	   </div>
                    	   <div class="inputs">
                    	       <div class="input-group">
                    	           <div class="lb">植入支架个数<span class="required">*</span></div>
                    	           <div class="input">
                    	               <div class="radio-btns">
                    					   <div class="btn" ms-class="{{info.ZRZJGS01==el.infocode ? 'active':''}}" ms-click="onRadioClick('ZRZJGS01',el.infocode)" ms-repeat="ZRZJGSArr">
                    					       {{el.info}}
                    					   </div>
                    	               </div>
                    	           </div>
                    	       </div>
                    	   </div>
                    	   <div class="inputs" ms-if="info.ZRZJGS01!=0">
                    	       <div class="input-group">
                    	           <div class="lb">支架种类<span class="required">*</span></div>
                    	           <div class="input">
                    	               <div class="radio-btns">
                    					   <div class="btn"  ms-class="{{info.ZJZL01==el.infocode ? 'active':''}}" ms-click="onRadioClick('ZJZL01',el.infocode)" ms-repeat="ZJZLArr">
                    					       {{el.info}}
                    					   </div>
                    	               </div>
                    	           </div>
                    	       </div>
                    	   </div>
                    	</div>
                    </div>
                    <div class="block" ms-if="(GMZYSel.$model).indexOf('2') > -1">
                        <div class="title">右冠中段</div>
                        <div class="inputs">
                            <div class="input-group">
                                <div class="lb">狭窄程度<span class="required">*</span></div>
                                <div class="input">
                                    <div class="radio-btns">
                    					<div class="btn" ms-class="{{info.XZCD02==el.infocode ? 'active':''}}" ms-click="onRadioClick('XZCD02',el.infocode)" ms-repeat="XZCDArr">
                    					    {{el.info}}
                    					</div>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <div class="inputs">
                            <div class="input-group">
                                <div class="lb">造影时TIMI血流<span class="required">*</span></div>
                                <div class="input">
                                    <div class="radio-btns">
                    					<div class="btn" ms-class="{{info.ZYSTIMIXL02==el.infocode ? 'active':''}}" ms-click="onRadioClick('ZYSTIMIXL02',el.infocode)" ms-repeat="ZYSTIMIXLArr">
                    					     {{el.info}}
                    					</div>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <div class="inputs">
                            <div class="input-group">
                                <div class="lb">支架内血栓<span class="required">*</span></div>
                                <div class="input">
                                    <div class="radio-btns">
                    					<div class="btn" ms-class="{{info.ZJNXS02==el.infocode ? 'active':''}}" ms-click="onRadioClick('ZJNXS02',el.infocode)" ms-repeat="RADIOArr">
                    					     {{el.info}}
                    					</div>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <div class="inputs">
                            <div class="input-group">
                                <div class="lb">是否分叉病变<span class="required">*</span></div>
                                <div class="input">
                                    <div class="radio-btns">
                                        <div class="btn" ms-class="{{info.SFFCBB02==el.infocode ? 'active':''}}"  ms-click="onRadioClick('SFFCBB02',el.infocode)" ms-repeat="RADIOArr" >
                                             {{el.info}}
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <div class="inputs">
                            <div class="input-group">
                                <div class="lb">是否CTO<span class="required">*</span></div>
                                <div class="input">
                                    <div class="radio-btns">
                    					<div class="btn" ms-class="{{info.SFCTO02==el.infocode ? 'active':''}}"  ms-click="onRadioClick('SFCTO02',el.infocode)" ms-repeat="RADIOArr">
                    					     {{el.info}}
                    					</div>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <div class="inputs">
                            <div class="input-group">
                                <div class="lb">钙化病变<span class="required">*</span></div>
                                <div class="input">
                                    <div class="radio-btns">
                    					<div class="btn" ms-class="{{info.GHBB02==el.infocode ? 'active':''}}" ms-click="onRadioClick('GHBB02',el.infocode)" ms-repeat="RADIOArr">
                    					     {{el.info}}
                    					</div>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <div class="inputs">
                            <div class="input-group">
                                <div class="lb">罪犯病变<span class="required">*</span></div>
                                <div class="input">
                                    <div class="radio-btns">
                    					<div class="btn" ms-class="{{info.ZFBB02==el.infocode ? 'active':''}}" ms-click="onRadioClick('ZFBB02',el.infocode)" ms-repeat="RADIOArr">
                    					 {{el.info}}
                    					</div>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <div class="inputs">
                            <div class="input-group">
                                <div class="lb">PCI<span class="required">*</span></div>
                                <div class="input">
                                    <div class="radio-btns">
                    					<div class="btn" ms-class="{{info.GMZYPCI02==el.infocode ? 'active':''}}" ms-click="onRadioClick('GMZYPCI02',el.infocode)" ms-repeat="RADIOArr">
                    					{{el.info}}
                    					</div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    	<div ms-if="info.GMZYPCI02==1">
                    	   <div class="inputs">
                    		 <div class="input-group">
                    		   <div class="lb lb_check">术中处理 <span class="required">*</span></div>
                    		    <div class="input">
                    		        <div class="checkbox-group">
                    					<div ms-repeat="SZCLArr" class="btn"
                    					     ms-class="{{isChecked('SZCL02',el.infocode) ? 'active':''}}" ms-click="onSelectClick('SZCL02',el.infocode)">
                    					    {{el.info}}
                    					</div>
                    		        </div>
                    		    </div>
                    		 </div>
                    	   </div>
                    	   <div class="inputs">
                    		<div class="input-group">
                    		    <div class="lb">导丝通过时间</div>
                    		    <div class="input">
                    		       <input type="text"  class="Wdate input" onclick="WdatePicker({dateFmt:'yyyy-MM-dd'})" ms-duplex="info.DSTGSJ02"/>
                    		    </div>
                    		</div>
                    	   </div>
                    	   <div class="inputs">
                    	       <div class="input-group">
                    	           <div class="lb">术后TIMI血流<span class="required">*</span></div>
                    	           <div class="input">
                    	               <div class="radio-btns">
                    					   <div class="btn" ms-class="{{info.SHTIMIXL02==el.infocode ? 'active':''}}" ms-click="onRadioClick('SHTIMIXL02',el.infocode)" ms-repeat="SHTIMIXLArr">
                    					       {{el.info}}
                    					   </div>
                    	               </div>
                    	           </div>
                    	       </div>
                    	   </div>
                    	   <div class="inputs">
                    	       <div class="input-group">
                    	           <div class="lb">植入支架个数<span class="required">*</span></div>
                    	           <div class="input">
                    	               <div class="radio-btns">
                    					   <div class="btn" ms-class="{{info.ZRZJGS02==el.infocode ? 'active':''}}" ms-click="onRadioClick('ZRZJGS02',el.infocode)" ms-repeat="ZRZJGSArr">
                    					       {{el.info}}
                    					   </div>
                    	               </div>
                    	           </div>
                    	       </div>
                    	   </div>
                    	   <div class="inputs" ms-if="info.ZRZJGS02!=0">
                    	       <div class="input-group">
                    	           <div class="lb">支架种类<span class="required">*</span></div>
                    	           <div class="input">
                    	               <div class="radio-btns">
                    					   <div class="btn"  ms-class="{{info.ZJZL02==el.infocode ? 'active':''}}" ms-click="onRadioClick('ZJZL02',el.infocode)" ms-repeat="ZJZLArr">
                    					       {{el.info}}
                    					   </div>
                    	               </div>
                    	           </div>
                    	       </div>
                    	   </div>
                    	</div>
                    </div>
                    <div class="block" ms-if="(GMZYSel.$model).indexOf('3') > -1">
                        <div class="title">右冠远段</div>
                        <div class="inputs">
                            <div class="input-group">
                                <div class="lb">狭窄程度<span class="required">*</span></div>
                                <div class="input">
                                    <div class="radio-btns">
                    					<div class="btn" ms-class="{{info.XZCD03==el.infocode ? 'active':''}}" ms-click="onRadioClick('XZCD03',el.infocode)" ms-repeat="XZCDArr">
                    					    {{el.info}}
                    					</div>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <div class="inputs">
                            <div class="input-group">
                                <div class="lb">造影时TIMI血流<span class="required">*</span></div>
                                <div class="input">
                                    <div class="radio-btns">
                    					<div class="btn" ms-class="{{info.ZYSTIMIXL03==el.infocode ? 'active':''}}" ms-click="onRadioClick('ZYSTIMIXL03',el.infocode)" ms-repeat="ZYSTIMIXLArr">
                    					     {{el.info}}
                    					</div>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <div class="inputs">
                            <div class="input-group">
                                <div class="lb">支架内血栓<span class="required">*</span></div>
                                <div class="input">
                                    <div class="radio-btns">
                    					<div class="btn" ms-class="{{info.ZJNXS03==el.infocode ? 'active':''}}" ms-click="onRadioClick('ZJNXS03',el.infocode)" ms-repeat="RADIOArr">
                    					     {{el.info}}
                    					</div>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <div class="inputs">
                            <div class="input-group">
                                <div class="lb">是否分叉病变<span class="required">*</span></div>
                                <div class="input">
                                    <div class="radio-btns">
                                        <div class="btn" ms-class="{{info.SFFCBB03==el.infocode ? 'active':''}}"  ms-click="onRadioClick('SFFCBB03',el.infocode)" ms-repeat="RADIOArr" >
                                             {{el.info}}
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <div class="inputs">
                            <div class="input-group">
                                <div class="lb">是否CTO<span class="required">*</span></div>
                                <div class="input">
                                    <div class="radio-btns">
                    					<div class="btn" ms-class="{{info.SFCTO03==el.infocode ? 'active':''}}"  ms-click="onRadioClick('SFCTO03',el.infocode)" ms-repeat="RADIOArr">
                    					     {{el.info}}
                    					</div>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <div class="inputs">
                            <div class="input-group">
                                <div class="lb">钙化病变<span class="required">*</span></div>
                                <div class="input">
                                    <div class="radio-btns">
                    					<div class="btn" ms-class="{{info.GHBB03==el.infocode ? 'active':''}}" ms-click="onRadioClick('GHBB03',el.infocode)" ms-repeat="RADIOArr">
                    					     {{el.info}}
                    					</div>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <div class="inputs">
                            <div class="input-group">
                                <div class="lb">罪犯病变<span class="required">*</span></div>
                                <div class="input">
                                    <div class="radio-btns">
                    					<div class="btn" ms-class="{{info.ZFBB03==el.infocode ? 'active':''}}" ms-click="onRadioClick('ZFBB03',el.infocode)" ms-repeat="RADIOArr">
                    					 {{el.info}}
                    					</div>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <div class="inputs">
                            <div class="input-group">
                                <div class="lb">PCI<span class="required">*</span></div>
                                <div class="input">
                                    <div class="radio-btns">
                    					<div class="btn" ms-class="{{info.GMZYPCI03==el.infocode ? 'active':''}}" ms-click="onRadioClick('GMZYPCI03',el.infocode)" ms-repeat="RADIOArr">
                    					{{el.info}}
                    					</div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    	<div ms-if="info.GMZYPCI03==1">
                    	   <div class="inputs">
                    		 <div class="input-group">
                    		   <div class="lb lb_check">术中处理 <span class="required">*</span></div>
                    		    <div class="input">
                    		        <div class="checkbox-group">
                    					<div ms-repeat="SZCLArr" class="btn"
                    					     ms-class="{{isChecked('SZCL03',el.infocode) ? 'active':''}}" ms-click="onSelectClick('SZCL03',el.infocode)">
                    					    {{el.info}}
                    					</div>
                    		        </div>
                    		    </div>
                    		 </div>
                    	   </div>
                    	   <div class="inputs">
                    		<div class="input-group">
                    		    <div class="lb">导丝通过时间</div>
                    		    <div class="input">
                    		       <input type="text"  class="Wdate input" onclick="WdatePicker({dateFmt:'yyyy-MM-dd'})" ms-duplex="info.DSTGSJ03"/>
                    		    </div>
                    		</div>
                    	   </div>
                    	   <div class="inputs">
                    	       <div class="input-group">
                    	           <div class="lb">术后TIMI血流<span class="required">*</span></div>
                    	           <div class="input">
                    	               <div class="radio-btns">
                    					   <div class="btn" ms-class="{{info.SHTIMIXL03==el.infocode ? 'active':''}}" ms-click="onRadioClick('SHTIMIXL03',el.infocode)" ms-repeat="SHTIMIXLArr">
                    					       {{el.info}}
                    					   </div>
                    	               </div>
                    	           </div>
                    	       </div>
                    	   </div>
                    	   <div class="inputs">
                    	       <div class="input-group">
                    	           <div class="lb">植入支架个数<span class="required">*</span></div>
                    	           <div class="input">
                    	               <div class="radio-btns">
                    					   <div class="btn" ms-class="{{info.ZRZJGS03==el.infocode ? 'active':''}}" ms-click="onRadioClick('ZRZJGS03',el.infocode)" ms-repeat="ZRZJGSArr">
                    					       {{el.info}}
                    					   </div>
                    	               </div>
                    	           </div>
                    	       </div>
                    	   </div>
                    	   <div class="inputs" ms-if="info.ZRZJGS03!=0">
                    	       <div class="input-group">
                    	           <div class="lb">支架种类<span class="required">*</span></div>
                    	           <div class="input">
                    	               <div class="radio-btns">
                    					   <div class="btn"  ms-class="{{info.ZJZL03==el.infocode ? 'active':''}}" ms-click="onRadioClick('ZJZL03',el.infocode)" ms-repeat="ZJZLArr">
                    					       {{el.info}}
                    					   </div>
                    	               </div>
                    	           </div>
                    	       </div>
                    	   </div>
                    	</div>
                    </div>
                   	<div class="block" ms-if="(GMZYSel.$model).indexOf('4') > -1">
                   	    <div class="title">后降支(右优势型)</div>
                   	    <div class="inputs">
                   	        <div class="input-group">
                   	            <div class="lb">狭窄程度<span class="required">*</span></div>
                   	            <div class="input">
                   	                <div class="radio-btns">
                   						<div class="btn" ms-class="{{info.XZCD04==el.infocode ? 'active':''}}" ms-click="onRadioClick('XZCD04',el.infocode)" ms-repeat="XZCDArr">
                   						    {{el.info}}
                   						</div>
                   	                </div>
                   	            </div>
                   	        </div>
                   	    </div>
                   	    <div class="inputs">
                   	        <div class="input-group">
                   	            <div class="lb">造影时TIMI血流<span class="required">*</span></div>
                   	            <div class="input">
                   	                <div class="radio-btns">
                   						<div class="btn" ms-class="{{info.ZYSTIMIXL04==el.infocode ? 'active':''}}" ms-click="onRadioClick('ZYSTIMIXL04',el.infocode)" ms-repeat="ZYSTIMIXLArr">
                   						     {{el.info}}
                   						</div>
                   	                </div>
                   	            </div>
                   	        </div>
                   	    </div>
                   	    <div class="inputs">
                   	        <div class="input-group">
                   	            <div class="lb">支架内血栓<span class="required">*</span></div>
                   	            <div class="input">
                   	                <div class="radio-btns">
                   						<div class="btn" ms-class="{{info.ZJNXS04==el.infocode ? 'active':''}}" ms-click="onRadioClick('ZJNXS04',el.infocode)" ms-repeat="RADIOArr">
                   						     {{el.info}}
                   						</div>
                   	                </div>
                   	            </div>
                   	        </div>
                   	    </div>
                   	    <div class="inputs">
                   	        <div class="input-group">
                   	            <div class="lb">是否分叉病变<span class="required">*</span></div>
                   	            <div class="input">
                   	                <div class="radio-btns">
                   	                    <div class="btn" ms-class="{{info.SFFCBB04==el.infocode ? 'active':''}}"  ms-click="onRadioClick('SFFCBB04',el.infocode)" ms-repeat="RADIOArr" >
                   	                         {{el.info}}
                   	                    </div>
                   	                </div>
                   	            </div>
                   	        </div>
                   	    </div>
                   	    <div class="inputs">
                   	        <div class="input-group">
                   	            <div class="lb">是否CTO<span class="required">*</span></div>
                   	            <div class="input">
                   	                <div class="radio-btns">
                   						<div class="btn" ms-class="{{info.SFCTO04==el.infocode ? 'active':''}}"  ms-click="onRadioClick('SFCTO04',el.infocode)" ms-repeat="RADIOArr">
                   						     {{el.info}}
                   						</div>
                   	                </div>
                   	            </div>
                   	        </div>
                   	    </div>
                   	    <div class="inputs">
                   	        <div class="input-group">
                   	            <div class="lb">钙化病变<span class="required">*</span></div>
                   	            <div class="input">
                   	                <div class="radio-btns">
                   						<div class="btn" ms-class="{{info.GHBB04==el.infocode ? 'active':''}}" ms-click="onRadioClick('GHBB04',el.infocode)" ms-repeat="RADIOArr">
                   						     {{el.info}}
                   						</div>
                   	                </div>
                   	            </div>
                   	        </div>
                   	    </div>
                   	    <div class="inputs">
                   	        <div class="input-group">
                   	            <div class="lb">罪犯病变<span class="required">*</span></div>
                   	            <div class="input">
                   	                <div class="radio-btns">
                   						<div class="btn" ms-class="{{info.ZFBB04==el.infocode ? 'active':''}}" ms-click="onRadioClick('ZFBB04',el.infocode)" ms-repeat="RADIOArr">
                   						 {{el.info}}
                   						</div>
                   	                </div>
                   	            </div>
                   	        </div>
                   	    </div>
                   	    <div class="inputs">
                   	        <div class="input-group">
                   	            <div class="lb">PCI<span class="required">*</span></div>
                   	            <div class="input">
                   	                <div class="radio-btns">
                   						<div class="btn" ms-class="{{info.GMZYPCI04==el.infocode ? 'active':''}}" ms-click="onRadioClick('GMZYPCI04',el.infocode)" ms-repeat="RADIOArr">
                   						{{el.info}}
                   						</div>
                   	                </div>
                   	            </div>
                   	        </div>
                   	    </div>
                   		<div ms-if="info.GMZYPCI04==1">
                   		   <div class="inputs">
                   			 <div class="input-group">
                   			   <div class="lb lb_check">术中处理 <span class="required">*</span></div>
                   			    <div class="input">
                   			        <div class="checkbox-group">
                   						<div ms-repeat="SZCLArr" class="btn"
                   						     ms-class="{{isChecked('SZCL04',el.infocode) ? 'active':''}}" ms-click="onSelectClick('SZCL04',el.infocode)">
                   						    {{el.info}}
                   						</div>
                   			        </div>
                   			    </div>
                   			 </div>
                   		   </div>
                   		   <div class="inputs">
                   			<div class="input-group">
                   			    <div class="lb">导丝通过时间</div>
                   			    <div class="input">
                   			       <input type="text"  class="Wdate input" onclick="WdatePicker({dateFmt:'yyyy-MM-dd'})" ms-duplex="info.DSTGSJ04"/>
                   			    </div>
                   			</div>
                   		   </div>
                   		   <div class="inputs">
                   		       <div class="input-group">
                   		           <div class="lb">术后TIMI血流<span class="required">*</span></div>
                   		           <div class="input">
                   		               <div class="radio-btns">
                   						   <div class="btn" ms-class="{{info.SHTIMIXL04==el.infocode ? 'active':''}}" ms-click="onRadioClick('SHTIMIXL04',el.infocode)" ms-repeat="SHTIMIXLArr">
                   						       {{el.info}}
                   						   </div>
                   		               </div>
                   		           </div>
                   		       </div>
                   		   </div>
                   		   <div class="inputs">
                   		       <div class="input-group">
                   		           <div class="lb">植入支架个数<span class="required">*</span></div>
                   		           <div class="input">
                   		               <div class="radio-btns">
                   						   <div class="btn" ms-class="{{info.ZRZJGS04==el.infocode ? 'active':''}}" ms-click="onRadioClick('ZRZJGS04',el.infocode)" ms-repeat="ZRZJGSArr">
                   						       {{el.info}}
                   						   </div>
                   		               </div>
                   		           </div>
                   		       </div>
                   		   </div>
                   		   <div class="inputs" ms-if="info.ZRZJGS04!=0">
                   		       <div class="input-group">
                   		           <div class="lb">支架种类<span class="required">*</span></div>
                   		           <div class="input">
                   		               <div class="radio-btns">
                   						   <div class="btn"  ms-class="{{info.ZJZL04==el.infocode ? 'active':''}}" ms-click="onRadioClick('ZJZL04',el.infocode)" ms-repeat="ZJZLArr">
                   						       {{el.info}}
                   						   </div>
                   		               </div>
                   		           </div>
                   		       </div>
                   		   </div>
                   		</div>
                   	</div>
                   	<div class="block" ms-if="(GMZYSel.$model).indexOf('5') > -1">
                   	    <div class="title">左主干</div>
                   	    <div class="inputs">
                   	        <div class="input-group">
                   	            <div class="lb">狭窄程度<span class="required">*</span></div>
                   	            <div class="input">
                   	                <div class="radio-btns">
                   						<div class="btn" ms-class="{{info.XZCD05==el.infocode ? 'active':''}}" ms-click="onRadioClick('XZCD05',el.infocode)" ms-repeat="XZCDArr">
                   						    {{el.info}}
                   						</div>
                   	                </div>
                   	            </div>
                   	        </div>
                   	    </div>
                   	    <div class="inputs">
                   	        <div class="input-group">
                   	            <div class="lb">造影时TIMI血流<span class="required">*</span></div>
                   	            <div class="input">
                   	                <div class="radio-btns">
                   						<div class="btn" ms-class="{{info.ZYSTIMIXL05==el.infocode ? 'active':''}}" ms-click="onRadioClick('ZYSTIMIXL05',el.infocode)" ms-repeat="ZYSTIMIXLArr">
                   						     {{el.info}}
                   						</div>
                   	                </div>
                   	            </div>
                   	        </div>
                   	    </div>
                   	    <div class="inputs">
                   	        <div class="input-group">
                   	            <div class="lb">支架内血栓<span class="required">*</span></div>
                   	            <div class="input">
                   	                <div class="radio-btns">
                   						<div class="btn" ms-class="{{info.ZJNXS05==el.infocode ? 'active':''}}" ms-click="onRadioClick('ZJNXS05',el.infocode)" ms-repeat="RADIOArr">
                   						     {{el.info}}
                   						</div>
                   	                </div>
                   	            </div>
                   	        </div>
                   	    </div>
                   	    <div class="inputs">
                   	        <div class="input-group">
                   	            <div class="lb">是否分叉病变<span class="required">*</span></div>
                   	            <div class="input">
                   	                <div class="radio-btns">
                   	                    <div class="btn" ms-class="{{info.SFFCBB05==el.infocode ? 'active':''}}"  ms-click="onRadioClick('SFFCBB05',el.infocode)" ms-repeat="RADIOArr" >
                   	                         {{el.info}}
                   	                    </div>
                   	                </div>
                   	            </div>
                   	        </div>
                   	    </div>
                   	    <div class="inputs">
                   	        <div class="input-group">
                   	            <div class="lb">是否CTO<span class="required">*</span></div>
                   	            <div class="input">
                   	                <div class="radio-btns">
                   						<div class="btn" ms-class="{{info.SFCTO05==el.infocode ? 'active':''}}"  ms-click="onRadioClick('SFCTO05',el.infocode)" ms-repeat="RADIOArr">
                   						     {{el.info}}
                   						</div>
                   	                </div>
                   	            </div>
                   	        </div>
                   	    </div>
                   	    <div class="inputs">
                   	        <div class="input-group">
                   	            <div class="lb">钙化病变<span class="required">*</span></div>
                   	            <div class="input">
                   	                <div class="radio-btns">
                   						<div class="btn" ms-class="{{info.GHBB05==el.infocode ? 'active':''}}" ms-click="onRadioClick('GHBB05',el.infocode)" ms-repeat="RADIOArr">
                   						     {{el.info}}
                   						</div>
                   	                </div>
                   	            </div>
                   	        </div>
                   	    </div>
                   	    <div class="inputs">
                   	        <div class="input-group">
                   	            <div class="lb">罪犯病变<span class="required">*</span></div>
                   	            <div class="input">
                   	                <div class="radio-btns">
                   						<div class="btn" ms-class="{{info.ZFBB05==el.infocode ? 'active':''}}" ms-click="onRadioClick('ZFBB05',el.infocode)" ms-repeat="RADIOArr">
                   						 {{el.info}}
                   						</div>
                   	                </div>
                   	            </div>
                   	        </div>
                   	    </div>
                   	    <div class="inputs">
                   	        <div class="input-group">
                   	            <div class="lb">PCI<span class="required">*</span></div>
                   	            <div class="input">
                   	                <div class="radio-btns">
                   						<div class="btn" ms-class="{{info.GMZYPCI05==el.infocode ? 'active':''}}" ms-click="onRadioClick('GMZYPCI05',el.infocode)" ms-repeat="RADIOArr">
                   						{{el.info}}
                   						</div>
                   	                </div>
                   	            </div>
                   	        </div>
                   	    </div>
                   		<div ms-if="info.GMZYPCI05==1">
                   		   <div class="inputs">
                   			 <div class="input-group">
                   			   <div class="lb lb_check">术中处理 <span class="required">*</span></div>
                   			    <div class="input">
                   			        <div class="checkbox-group">
                   						<div ms-repeat="SZCLArr" class="btn"
                   						     ms-class="{{isChecked('SZCL05',el.infocode) ? 'active':''}}" ms-click="onSelectClick('SZCL05',el.infocode)">
                   						    {{el.info}}
                   						</div>
                   			        </div>
                   			    </div>
                   			 </div>
                   		   </div>
                   		   <div class="inputs">
                   			<div class="input-group">
                   			    <div class="lb">导丝通过时间</div>
                   			    <div class="input">
                   			       <input type="text"  class="Wdate input" onclick="WdatePicker({dateFmt:'yyyy-MM-dd'})" ms-duplex="info.DSTGSJ05"/>
                   			    </div>
                   			</div>
                   		   </div>
                   		   <div class="inputs">
                   		       <div class="input-group">
                   		           <div class="lb">术后TIMI血流<span class="required">*</span></div>
                   		           <div class="input">
                   		               <div class="radio-btns">
                   						   <div class="btn" ms-class="{{info.SHTIMIXL05==el.infocode ? 'active':''}}" ms-click="onRadioClick('SHTIMIXL05',el.infocode)" ms-repeat="SHTIMIXLArr">
                   						       {{el.info}}
                   						   </div>
                   		               </div>
                   		           </div>
                   		       </div>
                   		   </div>
                   		   <div class="inputs">
                   		       <div class="input-group">
                   		           <div class="lb">植入支架个数<span class="required">*</span></div>
                   		           <div class="input">
                   		               <div class="radio-btns">
                   						   <div class="btn" ms-class="{{info.ZRZJGS05==el.infocode ? 'active':''}}" ms-click="onRadioClick('ZRZJGS05',el.infocode)" ms-repeat="ZRZJGSArr">
                   						       {{el.info}}
                   						   </div>
                   		               </div>
                   		           </div>
                   		       </div>
                   		   </div>
                   		   <div class="inputs" ms-if="info.ZRZJGS05!=0">
                   		       <div class="input-group">
                   		           <div class="lb">支架种类<span class="required">*</span></div>
                   		           <div class="input">
                   		               <div class="radio-btns">
                   						   <div class="btn"  ms-class="{{info.ZJZL05==el.infocode ? 'active':''}}" ms-click="onRadioClick('ZJZL05',el.infocode)" ms-repeat="ZJZLArr">
                   						       {{el.info}}
                   						   </div>
                   		               </div>
                   		           </div>
                   		       </div>
                   		   </div>
                   		</div>
                   	</div>
                   	<div class="block" ms-if="(GMZYSel.$model).indexOf('6') > -1">
                   	    <div class="title">前降支近段</div>
                   	    <div class="inputs">
                   	        <div class="input-group">
                   	            <div class="lb">狭窄程度<span class="required">*</span></div>
                   	            <div class="input">
                   	                <div class="radio-btns">
                   						<div class="btn" ms-class="{{info.XZCD06==el.infocode ? 'active':''}}" ms-click="onRadioClick('XZCD06',el.infocode)" ms-repeat="XZCDArr">
                   						    {{el.info}}
                   						</div>
                   	                </div>
                   	            </div>
                   	        </div>
                   	    </div>
                   	    <div class="inputs">
                   	        <div class="input-group">
                   	            <div class="lb">造影时TIMI血流<span class="required">*</span></div>
                   	            <div class="input">
                   	                <div class="radio-btns">
                   						<div class="btn" ms-class="{{info.ZYSTIMIXL06==el.infocode ? 'active':''}}" ms-click="onRadioClick('ZYSTIMIXL06',el.infocode)" ms-repeat="ZYSTIMIXLArr">
                   						     {{el.info}}
                   						</div>
                   	                </div>
                   	            </div>
                   	        </div>
                   	    </div>
                   	    <div class="inputs">
                   	        <div class="input-group">
                   	            <div class="lb">支架内血栓<span class="required">*</span></div>
                   	            <div class="input">
                   	                <div class="radio-btns">
                   						<div class="btn" ms-class="{{info.ZJNXS06==el.infocode ? 'active':''}}" ms-click="onRadioClick('ZJNXS06',el.infocode)" ms-repeat="RADIOArr">
                   						     {{el.info}}
                   						</div>
                   	                </div>
                   	            </div>
                   	        </div>
                   	    </div>
                   	    <div class="inputs">
                   	        <div class="input-group">
                   	            <div class="lb">是否分叉病变<span class="required">*</span></div>
                   	            <div class="input">
                   	                <div class="radio-btns">
                   	                    <div class="btn" ms-class="{{info.SFFCBB06==el.infocode ? 'active':''}}"  ms-click="onRadioClick('SFFCBB06',el.infocode)" ms-repeat="RADIOArr" >
                   	                         {{el.info}}
                   	                    </div>
                   	                </div>
                   	            </div>
                   	        </div>
                   	    </div>
                   	    <div class="inputs">
                   	        <div class="input-group">
                   	            <div class="lb">是否CTO<span class="required">*</span></div>
                   	            <div class="input">
                   	                <div class="radio-btns">
                   						<div class="btn" ms-class="{{info.SFCTO06==el.infocode ? 'active':''}}"  ms-click="onRadioClick('SFCTO06',el.infocode)" ms-repeat="RADIOArr">
                   						     {{el.info}}
                   						</div>
                   	                </div>
                   	            </div>
                   	        </div>
                   	    </div>
                   	    <div class="inputs">
                   	        <div class="input-group">
                   	            <div class="lb">钙化病变<span class="required">*</span></div>
                   	            <div class="input">
                   	                <div class="radio-btns">
                   						<div class="btn" ms-class="{{info.GHBB06==el.infocode ? 'active':''}}" ms-click="onRadioClick('GHBB06',el.infocode)" ms-repeat="RADIOArr">
                   						     {{el.info}}
                   						</div>
                   	                </div>
                   	            </div>
                   	        </div>
                   	    </div>
                   	    <div class="inputs">
                   	        <div class="input-group">
                   	            <div class="lb">罪犯病变<span class="required">*</span></div>
                   	            <div class="input">
                   	                <div class="radio-btns">
                   						<div class="btn" ms-class="{{info.ZFBB06==el.infocode ? 'active':''}}" ms-click="onRadioClick('ZFBB06',el.infocode)" ms-repeat="RADIOArr">
                   						 {{el.info}}
                   						</div>
                   	                </div>
                   	            </div>
                   	        </div>
                   	    </div>
                   	    <div class="inputs">
                   	        <div class="input-group">
                   	            <div class="lb">PCI<span class="required">*</span></div>
                   	            <div class="input">
                   	                <div class="radio-btns">
                   						<div class="btn" ms-class="{{info.GMZYPCI06==el.infocode ? 'active':''}}" ms-click="onRadioClick('GMZYPCI06',el.infocode)" ms-repeat="RADIOArr">
                   						{{el.info}}
                   						</div>
                   	                </div>
                   	            </div>
                   	        </div>
                   	    </div>
                   		<div ms-if="info.GMZYPCI06==1">
                   		   <div class="inputs">
                   			 <div class="input-group">
                   			   <div class="lb lb_check">术中处理 <span class="required">*</span></div>
                   			    <div class="input">
                   			        <div class="checkbox-group">
                   						<div ms-repeat="SZCLArr" class="btn"
                   						     ms-class="{{isChecked('SZCL06',el.infocode) ? 'active':''}}" ms-click="onSelectClick('SZCL06',el.infocode)">
                   						    {{el.info}}
                   						</div>
                   			        </div>
                   			    </div>
                   			 </div>
                   		   </div>
                   		   <div class="inputs">
                   			<div class="input-group">
                   			    <div class="lb">导丝通过时间</div>
                   			    <div class="input">
                   			       <input type="text"  class="Wdate input" onclick="WdatePicker({dateFmt:'yyyy-MM-dd'})" ms-duplex="info.DSTGSJ06"/>
                   			    </div>
                   			</div>
                   		   </div>
                   		   <div class="inputs">
                   		       <div class="input-group">
                   		           <div class="lb">术后TIMI血流<span class="required">*</span></div>
                   		           <div class="input">
                   		               <div class="radio-btns">
                   						   <div class="btn" ms-class="{{info.SHTIMIXL06==el.infocode ? 'active':''}}" ms-click="onRadioClick('SHTIMIXL06',el.infocode)" ms-repeat="SHTIMIXLArr">
                   						       {{el.info}}
                   						   </div>
                   		               </div>
                   		           </div>
                   		       </div>
                   		   </div>
                   		   <div class="inputs">
                   		       <div class="input-group">
                   		           <div class="lb">植入支架个数<span class="required">*</span></div>
                   		           <div class="input">
                   		               <div class="radio-btns">
                   						   <div class="btn" ms-class="{{info.ZRZJGS06==el.infocode ? 'active':''}}" ms-click="onRadioClick('ZRZJGS06',el.infocode)" ms-repeat="ZRZJGSArr">
                   						       {{el.info}}
                   						   </div>
                   		               </div>
                   		           </div>
                   		       </div>
                   		   </div>
                   		   <div class="inputs" ms-if="info.ZRZJGS06!=0">
                   		       <div class="input-group">
                   		           <div class="lb">支架种类<span class="required">*</span></div>
                   		           <div class="input">
                   		               <div class="radio-btns">
                   						   <div class="btn"  ms-class="{{info.ZJZL06==el.infocode ? 'active':''}}" ms-click="onRadioClick('ZJZL06',el.infocode)" ms-repeat="ZJZLArr">
                   						       {{el.info}}
                   						   </div>
                   		               </div>
                   		           </div>
                   		       </div>
                   		   </div>
                   		</div>
                   	</div>
                   	<div class="block" ms-if="(GMZYSel.$model).indexOf('7') > -1">
                   	    <div class="title">前降支中段</div>
                   	    <div class="inputs">
                   	        <div class="input-group">
                   	            <div class="lb">狭窄程度<span class="required">*</span></div>
                   	            <div class="input">
                   	                <div class="radio-btns">
                   						<div class="btn" ms-class="{{info.XZCD07==el.infocode ? 'active':''}}" ms-click="onRadioClick('XZCD07',el.infocode)" ms-repeat="XZCDArr">
                   						    {{el.info}}
                   						</div>
                   	                </div>
                   	            </div>
                   	        </div>
                   	    </div>
                   	    <div class="inputs">
                   	        <div class="input-group">
                   	            <div class="lb">造影时TIMI血流<span class="required">*</span></div>
                   	            <div class="input">
                   	                <div class="radio-btns">
                   						<div class="btn" ms-class="{{info.ZYSTIMIXL07==el.infocode ? 'active':''}}" ms-click="onRadioClick('ZYSTIMIXL07',el.infocode)" ms-repeat="ZYSTIMIXLArr">
                   						     {{el.info}}
                   						</div>
                   	                </div>
                   	            </div>
                   	        </div>
                   	    </div>
                   	    <div class="inputs">
                   	        <div class="input-group">
                   	            <div class="lb">支架内血栓<span class="required">*</span></div>
                   	            <div class="input">
                   	                <div class="radio-btns">
                   						<div class="btn" ms-class="{{info.ZJNXS07==el.infocode ? 'active':''}}" ms-click="onRadioClick('ZJNXS07',el.infocode)" ms-repeat="RADIOArr">
                   						     {{el.info}}
                   						</div>
                   	                </div>
                   	            </div>
                   	        </div>
                   	    </div>
                   	    <div class="inputs">
                   	        <div class="input-group">
                   	            <div class="lb">是否分叉病变<span class="required">*</span></div>
                   	            <div class="input">
                   	                <div class="radio-btns">
                   	                    <div class="btn" ms-class="{{info.SFFCBB07==el.infocode ? 'active':''}}"  ms-click="onRadioClick('SFFCBB07',el.infocode)" ms-repeat="RADIOArr" >
                   	                         {{el.info}}
                   	                    </div>
                   	                </div>
                   	            </div>
                   	        </div>
                   	    </div>
                   	    <div class="inputs">
                   	        <div class="input-group">
                   	            <div class="lb">是否CTO<span class="required">*</span></div>
                   	            <div class="input">
                   	                <div class="radio-btns">
                   						<div class="btn" ms-class="{{info.SFCTO07==el.infocode ? 'active':''}}"  ms-click="onRadioClick('SFCTO07',el.infocode)" ms-repeat="RADIOArr">
                   						     {{el.info}}
                   						</div>
                   	                </div>
                   	            </div>
                   	        </div>
                   	    </div>
                   	    <div class="inputs">
                   	        <div class="input-group">
                   	            <div class="lb">钙化病变<span class="required">*</span></div>
                   	            <div class="input">
                   	                <div class="radio-btns">
                   						<div class="btn" ms-class="{{info.GHBB07==el.infocode ? 'active':''}}" ms-click="onRadioClick('GHBB07',el.infocode)" ms-repeat="RADIOArr">
                   						     {{el.info}}
                   						</div>
                   	                </div>
                   	            </div>
                   	        </div>
                   	    </div>
                   	    <div class="inputs">
                   	        <div class="input-group">
                   	            <div class="lb">罪犯病变<span class="required">*</span></div>
                   	            <div class="input">
                   	                <div class="radio-btns">
                   						<div class="btn" ms-class="{{info.ZFBB07==el.infocode ? 'active':''}}" ms-click="onRadioClick('ZFBB07',el.infocode)" ms-repeat="RADIOArr">
                   						 {{el.info}}
                   						</div>
                   	                </div>
                   	            </div>
                   	        </div>
                   	    </div>
                   	    <div class="inputs">
                   	        <div class="input-group">
                   	            <div class="lb">PCI<span class="required">*</span></div>
                   	            <div class="input">
                   	                <div class="radio-btns">
                   						<div class="btn" ms-class="{{info.GMZYPCI07==el.infocode ? 'active':''}}" ms-click="onRadioClick('GMZYPCI07',el.infocode)" ms-repeat="RADIOArr">
                   						{{el.info}}
                   						</div>
                   	                </div>
                   	            </div>
                   	        </div>
                   	    </div>
                   		<div ms-if="info.GMZYPCI07==1">
                   		   <div class="inputs">
                   			 <div class="input-group">
                   			   <div class="lb lb_check">术中处理 <span class="required">*</span></div>
                   			    <div class="input">
                   			        <div class="checkbox-group">
                   						<div ms-repeat="SZCLArr" class="btn"
                   						     ms-class="{{isChecked('SZCL07',el.infocode) ? 'active':''}}" ms-click="onSelectClick('SZCL07',el.infocode)">
                   						    {{el.info}}
                   						</div>
                   			        </div>
                   			    </div>
                   			 </div>
                   		   </div>
                   		   <div class="inputs">
                   			<div class="input-group">
                   			    <div class="lb">导丝通过时间</div>
                   			    <div class="input">
                   			       <input type="text"  class="Wdate input" onclick="WdatePicker({dateFmt:'yyyy-MM-dd'})" ms-duplex="info.DSTGSJ07"/>
                   			    </div>
                   			</div>
                   		   </div>
                   		   <div class="inputs">
                   		       <div class="input-group">
                   		           <div class="lb">术后TIMI血流<span class="required">*</span></div>
                   		           <div class="input">
                   		               <div class="radio-btns">
                   						   <div class="btn" ms-class="{{info.SHTIMIXL07==el.infocode ? 'active':''}}" ms-click="onRadioClick('SHTIMIXL07',el.infocode)" ms-repeat="SHTIMIXLArr">
                   						       {{el.info}}
                   						   </div>
                   		               </div>
                   		           </div>
                   		       </div>
                   		   </div>
                   		   <div class="inputs">
                   		       <div class="input-group">
                   		           <div class="lb">植入支架个数<span class="required">*</span></div>
                   		           <div class="input">
                   		               <div class="radio-btns">
                   						   <div class="btn" ms-class="{{info.ZRZJGS07==el.infocode ? 'active':''}}" ms-click="onRadioClick('ZRZJGS07',el.infocode)" ms-repeat="ZRZJGSArr">
                   						       {{el.info}}
                   						   </div>
                   		               </div>
                   		           </div>
                   		       </div>
                   		   </div>
                   		   <div class="inputs" ms-if="info.ZRZJGS07!=0">
                   		       <div class="input-group">
                   		           <div class="lb">支架种类<span class="required">*</span></div>
                   		           <div class="input">
                   		               <div class="radio-btns">
                   						   <div class="btn"  ms-class="{{info.ZJZL07==el.infocode ? 'active':''}}" ms-click="onRadioClick('ZJZL07',el.infocode)" ms-repeat="ZJZLArr">
                   						       {{el.info}}
                   						   </div>
                   		               </div>
                   		           </div>
                   		       </div>
                   		   </div>
                   		</div>
                   	</div>
                   	<div class="block" ms-if="(GMZYSel.$model).indexOf('8') > -1">
                   	    <div class="title">前降支远段</div>
                   	    <div class="inputs">
                   	        <div class="input-group">
                   	            <div class="lb">狭窄程度<span class="required">*</span></div>
                   	            <div class="input">
                   	                <div class="radio-btns">
                   						<div class="btn" ms-class="{{info.XZCD08==el.infocode ? 'active':''}}" ms-click="onRadioClick('XZCD08',el.infocode)" ms-repeat="XZCDArr">
                   						    {{el.info}}
                   						</div>
                   	                </div>
                   	            </div>
                   	        </div>
                   	    </div>
                   	    <div class="inputs">
                   	        <div class="input-group">
                   	            <div class="lb">造影时TIMI血流<span class="required">*</span></div>
                   	            <div class="input">
                   	                <div class="radio-btns">
                   						<div class="btn" ms-class="{{info.ZYSTIMIXL08==el.infocode ? 'active':''}}" ms-click="onRadioClick('ZYSTIMIXL08',el.infocode)" ms-repeat="ZYSTIMIXLArr">
                   						     {{el.info}}
                   						</div>
                   	                </div>
                   	            </div>
                   	        </div>
                   	    </div>
                   	    <div class="inputs">
                   	        <div class="input-group">
                   	            <div class="lb">支架内血栓<span class="required">*</span></div>
                   	            <div class="input">
                   	                <div class="radio-btns">
                   						<div class="btn" ms-class="{{info.ZJNXS08==el.infocode ? 'active':''}}" ms-click="onRadioClick('ZJNXS08',el.infocode)" ms-repeat="RADIOArr">
                   						     {{el.info}}
                   						</div>
                   	                </div>
                   	            </div>
                   	        </div>
                   	    </div>
                   	    <div class="inputs">
                   	        <div class="input-group">
                   	            <div class="lb">是否分叉病变<span class="required">*</span></div>
                   	            <div class="input">
                   	                <div class="radio-btns">
                   	                    <div class="btn" ms-class="{{info.SFFCBB08==el.infocode ? 'active':''}}"  ms-click="onRadioClick('SFFCBB08',el.infocode)" ms-repeat="RADIOArr" >
                   	                         {{el.info}}
                   	                    </div>
                   	                </div>
                   	            </div>
                   	        </div>
                   	    </div>
                   	    <div class="inputs">
                   	        <div class="input-group">
                   	            <div class="lb">是否CTO<span class="required">*</span></div>
                   	            <div class="input">
                   	                <div class="radio-btns">
                   						<div class="btn" ms-class="{{info.SFCTO08==el.infocode ? 'active':''}}"  ms-click="onRadioClick('SFCTO08',el.infocode)" ms-repeat="RADIOArr">
                   						     {{el.info}}
                   						</div>
                   	                </div>
                   	            </div>
                   	        </div>
                   	    </div>
                   	    <div class="inputs">
                   	        <div class="input-group">
                   	            <div class="lb">钙化病变<span class="required">*</span></div>
                   	            <div class="input">
                   	                <div class="radio-btns">
                   						<div class="btn" ms-class="{{info.GHBB08==el.infocode ? 'active':''}}" ms-click="onRadioClick('GHBB08',el.infocode)" ms-repeat="RADIOArr">
                   						     {{el.info}}
                   						</div>
                   	                </div>
                   	            </div>
                   	        </div>
                   	    </div>
                   	    <div class="inputs">
                   	        <div class="input-group">
                   	            <div class="lb">罪犯病变<span class="required">*</span></div>
                   	            <div class="input">
                   	                <div class="radio-btns">
                   						<div class="btn" ms-class="{{info.ZFBB08==el.infocode ? 'active':''}}" ms-click="onRadioClick('ZFBB08',el.infocode)" ms-repeat="RADIOArr">
                   						 {{el.info}}
                   						</div>
                   	                </div>
                   	            </div>
                   	        </div>
                   	    </div>
                   	    <div class="inputs">
                   	        <div class="input-group">
                   	            <div class="lb">PCI<span class="required">*</span></div>
                   	            <div class="input">
                   	                <div class="radio-btns">
                   						<div class="btn" ms-class="{{info.GMZYPCI08==el.infocode ? 'active':''}}" ms-click="onRadioClick('GMZYPCI08',el.infocode)" ms-repeat="RADIOArr">
                   						{{el.info}}
                   						</div>
                   	                </div>
                   	            </div>
                   	        </div>
                   	    </div>
                   		<div ms-if="info.GMZYPCI08==1">
                   		   <div class="inputs">
                   			 <div class="input-group">
                   			   <div class="lb lb_check">术中处理 <span class="required">*</span></div>
                   			    <div class="input">
                   			        <div class="checkbox-group">
                   						<div ms-repeat="SZCLArr" class="btn"
                   						     ms-class="{{isChecked('SZCL08',el.infocode) ? 'active':''}}" ms-click="onSelectClick('SZCL08',el.infocode)">
                   						    {{el.info}}
                   						</div>
                   			        </div>
                   			    </div>
                   			 </div>
                   		   </div>
                   		   <div class="inputs">
                   			<div class="input-group">
                   			    <div class="lb">导丝通过时间</div>
                   			    <div class="input">
                   			       <input type="text"  class="Wdate input" onclick="WdatePicker({dateFmt:'yyyy-MM-dd'})" ms-duplex="info.DSTGSJ08"/>
                   			    </div>
                   			</div>
                   		   </div>
                   		   <div class="inputs">
                   		       <div class="input-group">
                   		           <div class="lb">术后TIMI血流<span class="required">*</span></div>
                   		           <div class="input">
                   		               <div class="radio-btns">
                   						   <div class="btn" ms-class="{{info.SHTIMIXL08==el.infocode ? 'active':''}}" ms-click="onRadioClick('SHTIMIXL08',el.infocode)" ms-repeat="SHTIMIXLArr">
                   						       {{el.info}}
                   						   </div>
                   		               </div>
                   		           </div>
                   		       </div>
                   		   </div>
                   		   <div class="inputs">
                   		       <div class="input-group">
                   		           <div class="lb">植入支架个数<span class="required">*</span></div>
                   		           <div class="input">
                   		               <div class="radio-btns">
                   						   <div class="btn" ms-class="{{info.ZRZJGS08==el.infocode ? 'active':''}}" ms-click="onRadioClick('ZRZJGS08',el.infocode)" ms-repeat="ZRZJGSArr">
                   						       {{el.info}}
                   						   </div>
                   		               </div>
                   		           </div>
                   		       </div>
                   		   </div>
                   		   <div class="inputs" ms-if="info.ZRZJGS08!=0">
                   		       <div class="input-group">
                   		           <div class="lb">支架种类<span class="required">*</span></div>
                   		           <div class="input">
                   		               <div class="radio-btns">
                   						   <div class="btn"  ms-class="{{info.ZJZL08==el.infocode ? 'active':''}}" ms-click="onRadioClick('ZJZL08',el.infocode)" ms-repeat="ZJZLArr">
                   						       {{el.info}}
                   						   </div>
                   		               </div>
                   		           </div>
                   		       </div>
                   		   </div>
                   		</div>
                   	</div>
                   	<div class="block" ms-if="(GMZYSel.$model).indexOf('9') > -1">
                   	    <div class="title">第一对角支</div>
                   	    <div class="inputs">
                   	        <div class="input-group">
                   	            <div class="lb">狭窄程度<span class="required">*</span></div>
                   	            <div class="input">
                   	                <div class="radio-btns">
                   						<div class="btn" ms-class="{{info.XZCD09==el.infocode ? 'active':''}}" ms-click="onRadioClick('XZCD09',el.infocode)" ms-repeat="XZCDArr">
                   						    {{el.info}}
                   						</div>
                   	                </div>
                   	            </div>
                   	        </div>
                   	    </div>
                   	    <div class="inputs">
                   	        <div class="input-group">
                   	            <div class="lb">造影时TIMI血流<span class="required">*</span></div>
                   	            <div class="input">
                   	                <div class="radio-btns">
                   						<div class="btn" ms-class="{{info.ZYSTIMIXL09==el.infocode ? 'active':''}}" ms-click="onRadioClick('ZYSTIMIXL09',el.infocode)" ms-repeat="ZYSTIMIXLArr">
                   						     {{el.info}}
                   						</div>
                   	                </div>
                   	            </div>
                   	        </div>
                   	    </div>
                   	    <div class="inputs">
                   	        <div class="input-group">
                   	            <div class="lb">支架内血栓<span class="required">*</span></div>
                   	            <div class="input">
                   	                <div class="radio-btns">
                   						<div class="btn" ms-class="{{info.ZJNXS09==el.infocode ? 'active':''}}" ms-click="onRadioClick('ZJNXS09',el.infocode)" ms-repeat="RADIOArr">
                   						     {{el.info}}
                   						</div>
                   	                </div>
                   	            </div>
                   	        </div>
                   	    </div>
                   	    <div class="inputs">
                   	        <div class="input-group">
                   	            <div class="lb">是否分叉病变<span class="required">*</span></div>
                   	            <div class="input">
                   	                <div class="radio-btns">
                   	                    <div class="btn" ms-class="{{info.SFFCBB09==el.infocode ? 'active':''}}"  ms-click="onRadioClick('SFFCBB09',el.infocode)" ms-repeat="RADIOArr" >
                   	                         {{el.info}}
                   	                    </div>
                   	                </div>
                   	            </div>
                   	        </div>
                   	    </div>
                   	    <div class="inputs">
                   	        <div class="input-group">
                   	            <div class="lb">是否CTO<span class="required">*</span></div>
                   	            <div class="input">
                   	                <div class="radio-btns">
                   						<div class="btn" ms-class="{{info.SFCTO09==el.infocode ? 'active':''}}"  ms-click="onRadioClick('SFCTO09',el.infocode)" ms-repeat="RADIOArr">
                   						     {{el.info}}
                   						</div>
                   	                </div>
                   	            </div>
                   	        </div>
                   	    </div>
                   	    <div class="inputs">
                   	        <div class="input-group">
                   	            <div class="lb">钙化病变<span class="required">*</span></div>
                   	            <div class="input">
                   	                <div class="radio-btns">
                   						<div class="btn" ms-class="{{info.GHBB09==el.infocode ? 'active':''}}" ms-click="onRadioClick('GHBB09',el.infocode)" ms-repeat="RADIOArr">
                   						     {{el.info}}
                   						</div>
                   	                </div>
                   	            </div>
                   	        </div>
                   	    </div>
                   	    <div class="inputs">
                   	        <div class="input-group">
                   	            <div class="lb">罪犯病变<span class="required">*</span></div>
                   	            <div class="input">
                   	                <div class="radio-btns">
                   						<div class="btn" ms-class="{{info.ZFBB09==el.infocode ? 'active':''}}" ms-click="onRadioClick('ZFBB09',el.infocode)" ms-repeat="RADIOArr">
                   						 {{el.info}}
                   						</div>
                   	                </div>
                   	            </div>
                   	        </div>
                   	    </div>
                   	    <div class="inputs">
                   	        <div class="input-group">
                   	            <div class="lb">PCI<span class="required">*</span></div>
                   	            <div class="input">
                   	                <div class="radio-btns">
                   						<div class="btn" ms-class="{{info.GMZYPCI09==el.infocode ? 'active':''}}" ms-click="onRadioClick('GMZYPCI09',el.infocode)" ms-repeat="RADIOArr">
                   						{{el.info}}
                   						</div>
                   	                </div>
                   	            </div>
                   	        </div>
                   	    </div>
                   		<div ms-if="info.GMZYPCI09==1">
                   		   <div class="inputs">
                   			 <div class="input-group">
                   			   <div class="lb lb_check">术中处理 <span class="required">*</span></div>
                   			    <div class="input">
                   			        <div class="checkbox-group">
                   						<div ms-repeat="SZCLArr" class="btn"
                   						     ms-class="{{isChecked('SZCL09',el.infocode) ? 'active':''}}" ms-click="onSelectClick('SZCL09',el.infocode)">
                   						    {{el.info}}
                   						</div>
                   			        </div>
                   			    </div>
                   			 </div>
                   		   </div>
                   		   <div class="inputs">
                   			<div class="input-group">
                   			    <div class="lb">导丝通过时间</div>
                   			    <div class="input">
                   			       <input type="text"  class="Wdate input" onclick="WdatePicker({dateFmt:'yyyy-MM-dd'})" ms-duplex="info.DSTGSJ09"/>
                   			    </div>
                   			</div>
                   		   </div>
                   		   <div class="inputs">
                   		       <div class="input-group">
                   		           <div class="lb">术后TIMI血流<span class="required">*</span></div>
                   		           <div class="input">
                   		               <div class="radio-btns">
                   						   <div class="btn" ms-class="{{info.SHTIMIXL09==el.infocode ? 'active':''}}" ms-click="onRadioClick('SHTIMIXL09',el.infocode)" ms-repeat="SHTIMIXLArr">
                   						       {{el.info}}
                   						   </div>
                   		               </div>
                   		           </div>
                   		       </div>
                   		   </div>
                   		   <div class="inputs">
                   		       <div class="input-group">
                   		           <div class="lb">植入支架个数<span class="required">*</span></div>
                   		           <div class="input">
                   		               <div class="radio-btns">
                   						   <div class="btn" ms-class="{{info.ZRZJGS09==el.infocode ? 'active':''}}" ms-click="onRadioClick('ZRZJGS09',el.infocode)" ms-repeat="ZRZJGSArr">
                   						       {{el.info}}
                   						   </div>
                   		               </div>
                   		           </div>
                   		       </div>
                   		   </div>
                   		   <div class="inputs" ms-if="info.ZRZJGS09!=0">
                   		       <div class="input-group">
                   		           <div class="lb">支架种类<span class="required">*</span></div>
                   		           <div class="input">
                   		               <div class="radio-btns">
                   						   <div class="btn"  ms-class="{{info.ZJZL09==el.infocode ? 'active':''}}" ms-click="onRadioClick('ZJZL09',el.infocode)" ms-repeat="ZJZLArr">
                   						       {{el.info}}
                   						   </div>
                   		               </div>
                   		           </div>
                   		       </div>
                   		   </div>
                   		</div>
                   	</div>
                   	<div class="block" ms-if="(GMZYSel.$model).indexOf('10') > -1">
                   	    <div class="title">第二对角支</div>
                   	    <div class="inputs">
                   	        <div class="input-group">
                   	            <div class="lb">狭窄程度<span class="required">*</span></div>
                   	            <div class="input">
                   	                <div class="radio-btns">
                   						<div class="btn" ms-class="{{info.XZCD10==el.infocode ? 'active':''}}" ms-click="onRadioClick('XZCD10',el.infocode)" ms-repeat="XZCDArr">
                   						    {{el.info}}
                   						</div>
                   	                </div>
                   	            </div>
                   	        </div>
                   	    </div>
                   	    <div class="inputs">
                   	        <div class="input-group">
                   	            <div class="lb">造影时TIMI血流<span class="required">*</span></div>
                   	            <div class="input">
                   	                <div class="radio-btns">
                   						<div class="btn" ms-class="{{info.ZYSTIMIXL10==el.infocode ? 'active':''}}" ms-click="onRadioClick('ZYSTIMIXL10',el.infocode)" ms-repeat="ZYSTIMIXLArr">
                   						     {{el.info}}
                   						</div>
                   	                </div>
                   	            </div>
                   	        </div>
                   	    </div>
                   	    <div class="inputs">
                   	        <div class="input-group">
                   	            <div class="lb">支架内血栓<span class="required">*</span></div>
                   	            <div class="input">
                   	                <div class="radio-btns">
                   						<div class="btn" ms-class="{{info.ZJNXS10==el.infocode ? 'active':''}}" ms-click="onRadioClick('ZJNXS10',el.infocode)" ms-repeat="RADIOArr">
                   						     {{el.info}}
                   						</div>
                   	                </div>
                   	            </div>
                   	        </div>
                   	    </div>
                   	    <div class="inputs">
                   	        <div class="input-group">
                   	            <div class="lb">是否分叉病变<span class="required">*</span></div>
                   	            <div class="input">
                   	                <div class="radio-btns">
                   	                    <div class="btn" ms-class="{{info.SFFCBB10==el.infocode ? 'active':''}}"  ms-click="onRadioClick('SFFCBB10',el.infocode)" ms-repeat="RADIOArr" >
                   	                         {{el.info}}
                   	                    </div>
                   	                </div>
                   	            </div>
                   	        </div>
                   	    </div>
                   	    <div class="inputs">
                   	        <div class="input-group">
                   	            <div class="lb">是否CTO<span class="required">*</span></div>
                   	            <div class="input">
                   	                <div class="radio-btns">
                   						<div class="btn" ms-class="{{info.SFCTO10==el.infocode ? 'active':''}}"  ms-click="onRadioClick('SFCTO10',el.infocode)" ms-repeat="RADIOArr">
                   						     {{el.info}}
                   						</div>
                   	                </div>
                   	            </div>
                   	        </div>
                   	    </div>
                   	    <div class="inputs">
                   	        <div class="input-group">
                   	            <div class="lb">钙化病变<span class="required">*</span></div>
                   	            <div class="input">
                   	                <div class="radio-btns">
                   						<div class="btn" ms-class="{{info.GHBB10==el.infocode ? 'active':''}}" ms-click="onRadioClick('GHBB10',el.infocode)" ms-repeat="RADIOArr">
                   						     {{el.info}}
                   						</div>
                   	                </div>
                   	            </div>
                   	        </div>
                   	    </div>
                   	    <div class="inputs">
                   	        <div class="input-group">
                   	            <div class="lb">罪犯病变<span class="required">*</span></div>
                   	            <div class="input">
                   	                <div class="radio-btns">
                   						<div class="btn" ms-class="{{info.ZFBB10==el.infocode ? 'active':''}}" ms-click="onRadioClick('ZFBB10',el.infocode)" ms-repeat="RADIOArr">
                   						 {{el.info}}
                   						</div>
                   	                </div>
                   	            </div>
                   	        </div>
                   	    </div>
                   	    <div class="inputs">
                   	        <div class="input-group">
                   	            <div class="lb">PCI<span class="required">*</span></div>
                   	            <div class="input">
                   	                <div class="radio-btns">
                   						<div class="btn" ms-class="{{info.GMZYPCI10==el.infocode ? 'active':''}}" ms-click="onRadioClick('GMZYPCI10',el.infocode)" ms-repeat="RADIOArr">
                   						{{el.info}}
                   						</div>
                   	                </div>
                   	            </div>
                   	        </div>
                   	    </div>
                   		<div ms-if="info.GMZYPCI10==1">
                   		   <div class="inputs">
                   			 <div class="input-group">
                   			   <div class="lb lb_check">术中处理 <span class="required">*</span></div>
                   			    <div class="input">
                   			        <div class="checkbox-group">
                   						<div ms-repeat="SZCLArr" class="btn"
                   						     ms-class="{{isChecked('SZCL10',el.infocode) ? 'active':''}}" ms-click="onSelectClick('SZCL10',el.infocode)">
                   						    {{el.info}}
                   						</div>
                   			        </div>
                   			    </div>
                   			 </div>
                   		   </div>
                   		   <div class="inputs">
                   			<div class="input-group">
                   			    <div class="lb">导丝通过时间</div>
                   			    <div class="input">
                   			       <input type="text"  class="Wdate input" onclick="WdatePicker({dateFmt:'yyyy-MM-dd'})" ms-duplex="info.DSTGSJ10"/>
                   			    </div>
                   			</div>
                   		   </div>
                   		   <div class="inputs">
                   		       <div class="input-group">
                   		           <div class="lb">术后TIMI血流<span class="required">*</span></div>
                   		           <div class="input">
                   		               <div class="radio-btns">
                   						   <div class="btn" ms-class="{{info.SHTIMIXL10==el.infocode ? 'active':''}}" ms-click="onRadioClick('SHTIMIXL10',el.infocode)" ms-repeat="SHTIMIXLArr">
                   						       {{el.info}}
                   						   </div>
                   		               </div>
                   		           </div>
                   		       </div>
                   		   </div>
                   		   <div class="inputs">
                   		       <div class="input-group">
                   		           <div class="lb">植入支架个数<span class="required">*</span></div>
                   		           <div class="input">
                   		               <div class="radio-btns">
                   						   <div class="btn" ms-class="{{info.ZRZJGS10==el.infocode ? 'active':''}}" ms-click="onRadioClick('ZRZJGS10',el.infocode)" ms-repeat="ZRZJGSArr">
                   						       {{el.info}}
                   						   </div>
                   		               </div>
                   		           </div>
                   		       </div>
                   		   </div>
                   		   <div class="inputs" ms-if="info.ZRZJGS10!=0">
                   		       <div class="input-group">
                   		           <div class="lb">支架种类<span class="required">*</span></div>
                   		           <div class="input">
                   		               <div class="radio-btns">
                   						   <div class="btn"  ms-class="{{info.ZJZL10==el.infocode ? 'active':''}}" ms-click="onRadioClick('ZJZL10',el.infocode)" ms-repeat="ZJZLArr">
                   						       {{el.info}}
                   						   </div>
                   		               </div>
                   		           </div>
                   		       </div>
                   		   </div>
                   		</div>
                   	</div>
                   	<div class="block" ms-if="(GMZYSel.$model).indexOf('11') > -1">
                   	    <div class="title">旋支近段</div>
                   	    <div class="inputs">
                   	        <div class="input-group">
                   	            <div class="lb">狭窄程度<span class="required">*</span></div>
                   	            <div class="input">
                   	                <div class="radio-btns">
                   						<div class="btn" ms-class="{{info.XZCD11==el.infocode ? 'active':''}}" ms-click="onRadioClick('XZCD11',el.infocode)" ms-repeat="XZCDArr">
                   						    {{el.info}}
                   						</div>
                   	                </div>
                   	            </div>
                   	        </div>
                   	    </div>
                   	    <div class="inputs">
                   	        <div class="input-group">
                   	            <div class="lb">造影时TIMI血流<span class="required">*</span></div>
                   	            <div class="input">
                   	                <div class="radio-btns">
                   						<div class="btn" ms-class="{{info.ZYSTIMIXL11==el.infocode ? 'active':''}}" ms-click="onRadioClick('ZYSTIMIXL11',el.infocode)" ms-repeat="ZYSTIMIXLArr">
                   						     {{el.info}}
                   						</div>
                   	                </div>
                   	            </div>
                   	        </div>
                   	    </div>
                   	    <div class="inputs">
                   	        <div class="input-group">
                   	            <div class="lb">支架内血栓<span class="required">*</span></div>
                   	            <div class="input">
                   	                <div class="radio-btns">
                   						<div class="btn" ms-class="{{info.ZJNXS11==el.infocode ? 'active':''}}" ms-click="onRadioClick('ZJNXS11',el.infocode)" ms-repeat="RADIOArr">
                   						     {{el.info}}
                   						</div>
                   	                </div>
                   	            </div>
                   	        </div>
                   	    </div>
                   	    <div class="inputs">
                   	        <div class="input-group">
                   	            <div class="lb">是否分叉病变<span class="required">*</span></div>
                   	            <div class="input">
                   	                <div class="radio-btns">
                   	                    <div class="btn" ms-class="{{info.SFFCBB11==el.infocode ? 'active':''}}"  ms-click="onRadioClick('SFFCBB11',el.infocode)" ms-repeat="RADIOArr" >
                   	                         {{el.info}}
                   	                    </div>
                   	                </div>
                   	            </div>
                   	        </div>
                   	    </div>
                   	    <div class="inputs">
                   	        <div class="input-group">
                   	            <div class="lb">是否CTO<span class="required">*</span></div>
                   	            <div class="input">
                   	                <div class="radio-btns">
                   						<div class="btn" ms-class="{{info.SFCTO11==el.infocode ? 'active':''}}"  ms-click="onRadioClick('SFCTO11',el.infocode)" ms-repeat="RADIOArr">
                   						     {{el.info}}
                   						</div>
                   	                </div>
                   	            </div>
                   	        </div>
                   	    </div>
                   	    <div class="inputs">
                   	        <div class="input-group">
                   	            <div class="lb">钙化病变<span class="required">*</span></div>
                   	            <div class="input">
                   	                <div class="radio-btns">
                   						<div class="btn" ms-class="{{info.GHBB11==el.infocode ? 'active':''}}" ms-click="onRadioClick('GHBB11',el.infocode)" ms-repeat="RADIOArr">
                   						     {{el.info}}
                   						</div>
                   	                </div>
                   	            </div>
                   	        </div>
                   	    </div>
                   	    <div class="inputs">
                   	        <div class="input-group">
                   	            <div class="lb">罪犯病变<span class="required">*</span></div>
                   	            <div class="input">
                   	                <div class="radio-btns">
                   						<div class="btn" ms-class="{{info.ZFBB11==el.infocode ? 'active':''}}" ms-click="onRadioClick('ZFBB11',el.infocode)" ms-repeat="RADIOArr">
                   						 {{el.info}}
                   						</div>
                   	                </div>
                   	            </div>
                   	        </div>
                   	    </div>
                   	    <div class="inputs">
                   	        <div class="input-group">
                   	            <div class="lb">PCI<span class="required">*</span></div>
                   	            <div class="input">
                   	                <div class="radio-btns">
                   						<div class="btn" ms-class="{{info.GMZYPCI11==el.infocode ? 'active':''}}" ms-click="onRadioClick('GMZYPCI11',el.infocode)" ms-repeat="RADIOArr">
                   						{{el.info}}
                   						</div>
                   	                </div>
                   	            </div>
                   	        </div>
                   	    </div>
                   		<div ms-if="info.GMZYPCI11==1">
                   		   <div class="inputs">
                   			 <div class="input-group">
                   			   <div class="lb lb_check">术中处理 <span class="required">*</span></div>
                   			    <div class="input">
                   			        <div class="checkbox-group">
                   						<div ms-repeat="SZCLArr" class="btn"
                   						     ms-class="{{isChecked('SZCL11',el.infocode) ? 'active':''}}" ms-click="onSelectClick('SZCL11',el.infocode)">
                   						    {{el.info}}
                   						</div>
                   			        </div>
                   			    </div>
                   			 </div>
                   		   </div>
                   		   <div class="inputs">
                   			<div class="input-group">
                   			    <div class="lb">导丝通过时间</div>
                   			    <div class="input">
                   			       <input type="text"  class="Wdate input" onclick="WdatePicker({dateFmt:'yyyy-MM-dd'})" ms-duplex="info.DSTGSJ11"/>
                   			    </div>
                   			</div>
                   		   </div>
                   		   <div class="inputs">
                   		       <div class="input-group">
                   		           <div class="lb">术后TIMI血流<span class="required">*</span></div>
                   		           <div class="input">
                   		               <div class="radio-btns">
                   						   <div class="btn" ms-class="{{info.SHTIMIXL11==el.infocode ? 'active':''}}" ms-click="onRadioClick('SHTIMIXL11',el.infocode)" ms-repeat="SHTIMIXLArr">
                   						       {{el.info}}
                   						   </div>
                   		               </div>
                   		           </div>
                   		       </div>
                   		   </div>
                   		   <div class="inputs">
                   		       <div class="input-group">
                   		           <div class="lb">植入支架个数<span class="required">*</span></div>
                   		           <div class="input">
                   		               <div class="radio-btns">
                   						   <div class="btn" ms-class="{{info.ZRZJGS11==el.infocode ? 'active':''}}" ms-click="onRadioClick('ZRZJGS11',el.infocode)" ms-repeat="ZRZJGSArr">
                   						       {{el.info}}
                   						   </div>
                   		               </div>
                   		           </div>
                   		       </div>
                   		   </div>
                   		   <div class="inputs" ms-if="info.ZRZJGS11!=0">
                   		       <div class="input-group">
                   		           <div class="lb">支架种类<span class="required">*</span></div>
                   		           <div class="input">
                   		               <div class="radio-btns">
                   						   <div class="btn"  ms-class="{{info.ZJZL11==el.infocode ? 'active':''}}" ms-click="onRadioClick('ZJZL11',el.infocode)" ms-repeat="ZJZLArr">
                   						       {{el.info}}
                   						   </div>
                   		               </div>
                   		           </div>
                   		       </div>
                   		   </div>
                   		</div>
                   	</div>
                   	<div class="block" ms-if="(GMZYSel.$model).indexOf('12') > -1">
                   	    <div class="title">第一钝缘支</div>
                   	    <div class="inputs">
                   	        <div class="input-group">
                   	            <div class="lb">狭窄程度<span class="required">*</span></div>
                   	            <div class="input">
                   	                <div class="radio-btns">
                   						<div class="btn" ms-class="{{info.XZCD12==el.infocode ? 'active':''}}" ms-click="onRadioClick('XZCD12',el.infocode)" ms-repeat="XZCDArr">
                   						    {{el.info}}
                   						</div>
                   	                </div>
                   	            </div>
                   	        </div>
                   	    </div>
                   	    <div class="inputs">
                   	        <div class="input-group">
                   	            <div class="lb">造影时TIMI血流<span class="required">*</span></div>
                   	            <div class="input">
                   	                <div class="radio-btns">
                   						<div class="btn" ms-class="{{info.ZYSTIMIXL12==el.infocode ? 'active':''}}" ms-click="onRadioClick('ZYSTIMIXL12',el.infocode)" ms-repeat="ZYSTIMIXLArr">
                   						     {{el.info}}
                   						</div>
                   	                </div>
                   	            </div>
                   	        </div>
                   	    </div>
                   	    <div class="inputs">
                   	        <div class="input-group">
                   	            <div class="lb">支架内血栓<span class="required">*</span></div>
                   	            <div class="input">
                   	                <div class="radio-btns">
                   						<div class="btn" ms-class="{{info.ZJNXS12==el.infocode ? 'active':''}}" ms-click="onRadioClick('ZJNXS12',el.infocode)" ms-repeat="RADIOArr">
                   						     {{el.info}}
                   						</div>
                   	                </div>
                   	            </div>
                   	        </div>
                   	    </div>
                   	    <div class="inputs">
                   	        <div class="input-group">
                   	            <div class="lb">是否分叉病变<span class="required">*</span></div>
                   	            <div class="input">
                   	                <div class="radio-btns">
                   	                    <div class="btn" ms-class="{{info.SFFCBB12==el.infocode ? 'active':''}}"  ms-click="onRadioClick('SFFCBB12',el.infocode)" ms-repeat="RADIOArr" >
                   	                         {{el.info}}
                   	                    </div>
                   	                </div>
                   	            </div>
                   	        </div>
                   	    </div>
                   	    <div class="inputs">
                   	        <div class="input-group">
                   	            <div class="lb">是否CTO<span class="required">*</span></div>
                   	            <div class="input">
                   	                <div class="radio-btns">
                   						<div class="btn" ms-class="{{info.SFCTO12==el.infocode ? 'active':''}}"  ms-click="onRadioClick('SFCTO12',el.infocode)" ms-repeat="RADIOArr">
                   						     {{el.info}}
                   						</div>
                   	                </div>
                   	            </div>
                   	        </div>
                   	    </div>
                   	    <div class="inputs">
                   	        <div class="input-group">
                   	            <div class="lb">钙化病变<span class="required">*</span></div>
                   	            <div class="input">
                   	                <div class="radio-btns">
                   						<div class="btn" ms-class="{{info.GHBB12==el.infocode ? 'active':''}}" ms-click="onRadioClick('GHBB12',el.infocode)" ms-repeat="RADIOArr">
                   						     {{el.info}}
                   						</div>
                   	                </div>
                   	            </div>
                   	        </div>
                   	    </div>
                   	    <div class="inputs">
                   	        <div class="input-group">
                   	            <div class="lb">罪犯病变<span class="required">*</span></div>
                   	            <div class="input">
                   	                <div class="radio-btns">
                   						<div class="btn" ms-class="{{info.ZFBB12==el.infocode ? 'active':''}}" ms-click="onRadioClick('ZFBB12',el.infocode)" ms-repeat="RADIOArr">
                   						 {{el.info}}
                   						</div>
                   	                </div>
                   	            </div>
                   	        </div>
                   	    </div>
                   	    <div class="inputs">
                   	        <div class="input-group">
                   	            <div class="lb">PCI<span class="required">*</span></div>
                   	            <div class="input">
                   	                <div class="radio-btns">
                   						<div class="btn" ms-class="{{info.GMZYPCI12==el.infocode ? 'active':''}}" ms-click="onRadioClick('GMZYPCI12',el.infocode)" ms-repeat="RADIOArr">
                   						{{el.info}}
                   						</div>
                   	                </div>
                   	            </div>
                   	        </div>
                   	    </div>
                   		<div ms-if="info.GMZYPCI12==1">
                   		   <div class="inputs">
                   			 <div class="input-group">
                   			   <div class="lb lb_check">术中处理 <span class="required">*</span></div>
                   			    <div class="input">
                   			        <div class="checkbox-group">
                   						<div ms-repeat="SZCLArr" class="btn"
                   						     ms-class="{{isChecked('SZCL12',el.infocode) ? 'active':''}}" ms-click="onSelectClick('SZCL12',el.infocode)">
                   						    {{el.info}}
                   						</div>
                   			        </div>
                   			    </div>
                   			 </div>
                   		   </div>
                   		   <div class="inputs">
                   			<div class="input-group">
                   			    <div class="lb">导丝通过时间</div>
                   			    <div class="input">
                   			       <input type="text"  class="Wdate input" onclick="WdatePicker({dateFmt:'yyyy-MM-dd'})" ms-duplex="info.DSTGSJ12"/>
                   			    </div>
                   			</div>
                   		   </div>
                   		   <div class="inputs">
                   		       <div class="input-group">
                   		           <div class="lb">术后TIMI血流<span class="required">*</span></div>
                   		           <div class="input">
                   		               <div class="radio-btns">
                   						   <div class="btn" ms-class="{{info.SHTIMIXL12==el.infocode ? 'active':''}}" ms-click="onRadioClick('SHTIMIXL12',el.infocode)" ms-repeat="SHTIMIXLArr">
                   						       {{el.info}}
                   						   </div>
                   		               </div>
                   		           </div>
                   		       </div>
                   		   </div>
                   		   <div class="inputs">
                   		       <div class="input-group">
                   		           <div class="lb">植入支架个数<span class="required">*</span></div>
                   		           <div class="input">
                   		               <div class="radio-btns">
                   						   <div class="btn" ms-class="{{info.ZRZJGS12==el.infocode ? 'active':''}}" ms-click="onRadioClick('ZRZJGS12',el.infocode)" ms-repeat="ZRZJGSArr">
                   						       {{el.info}}
                   						   </div>
                   		               </div>
                   		           </div>
                   		       </div>
                   		   </div>
                   		   <div class="inputs" ms-if="info.ZRZJGS12!=0">
                   		       <div class="input-group">
                   		           <div class="lb">支架种类<span class="required">*</span></div>
                   		           <div class="input">
                   		               <div class="radio-btns">
                   						   <div class="btn"  ms-class="{{info.ZJZL12==el.infocode ? 'active':''}}" ms-click="onRadioClick('ZJZL12',el.infocode)" ms-repeat="ZJZLArr">
                   						       {{el.info}}
                   						   </div>
                   		               </div>
                   		           </div>
                   		       </div>
                   		   </div>
                   		</div>
                   	</div>
                   	<div class="block" ms-if="(GMZYSel.$model).indexOf('13') > -1">
                   	    <div class="title">旋支远段</div>
                   	    <div class="inputs">
                   	        <div class="input-group">
                   	            <div class="lb">狭窄程度<span class="required">*</span></div>
                   	            <div class="input">
                   	                <div class="radio-btns">
                   						<div class="btn" ms-class="{{info.XZCD13==el.infocode ? 'active':''}}" ms-click="onRadioClick('XZCD13',el.infocode)" ms-repeat="XZCDArr">
                   						    {{el.info}}
                   						</div>
                   	                </div>
                   	            </div>
                   	        </div>
                   	    </div>
                   	    <div class="inputs">
                   	        <div class="input-group">
                   	            <div class="lb">造影时TIMI血流<span class="required">*</span></div>
                   	            <div class="input">
                   	                <div class="radio-btns">
                   						<div class="btn" ms-class="{{info.ZYSTIMIXL13==el.infocode ? 'active':''}}" ms-click="onRadioClick('ZYSTIMIXL13',el.infocode)" ms-repeat="ZYSTIMIXLArr">
                   						     {{el.info}}
                   						</div>
                   	                </div>
                   	            </div>
                   	        </div>
                   	    </div>
                   	    <div class="inputs">
                   	        <div class="input-group">
                   	            <div class="lb">支架内血栓<span class="required">*</span></div>
                   	            <div class="input">
                   	                <div class="radio-btns">
                   						<div class="btn" ms-class="{{info.ZJNXS13==el.infocode ? 'active':''}}" ms-click="onRadioClick('ZJNXS13',el.infocode)" ms-repeat="RADIOArr">
                   						     {{el.info}}
                   						</div>
                   	                </div>
                   	            </div>
                   	        </div>
                   	    </div>
                   	    <div class="inputs">
                   	        <div class="input-group">
                   	            <div class="lb">是否分叉病变<span class="required">*</span></div>
                   	            <div class="input">
                   	                <div class="radio-btns">
                   	                    <div class="btn" ms-class="{{info.SFFCBB13==el.infocode ? 'active':''}}"  ms-click="onRadioClick('SFFCBB13',el.infocode)" ms-repeat="RADIOArr" >
                   	                         {{el.info}}
                   	                    </div>
                   	                </div>
                   	            </div>
                   	        </div>
                   	    </div>
                   	    <div class="inputs">
                   	        <div class="input-group">
                   	            <div class="lb">是否CTO<span class="required">*</span></div>
                   	            <div class="input">
                   	                <div class="radio-btns">
                   						<div class="btn" ms-class="{{info.SFCTO13==el.infocode ? 'active':''}}"  ms-click="onRadioClick('SFCTO13',el.infocode)" ms-repeat="RADIOArr">
                   						     {{el.info}}
                   						</div>
                   	                </div>
                   	            </div>
                   	        </div>
                   	    </div>
                   	    <div class="inputs">
                   	        <div class="input-group">
                   	            <div class="lb">钙化病变<span class="required">*</span></div>
                   	            <div class="input">
                   	                <div class="radio-btns">
                   						<div class="btn" ms-class="{{info.GHBB13==el.infocode ? 'active':''}}" ms-click="onRadioClick('GHBB13',el.infocode)" ms-repeat="RADIOArr">
                   						     {{el.info}}
                   						</div>
                   	                </div>
                   	            </div>
                   	        </div>
                   	    </div>
                   	    <div class="inputs">
                   	        <div class="input-group">
                   	            <div class="lb">罪犯病变<span class="required">*</span></div>
                   	            <div class="input">
                   	                <div class="radio-btns">
                   						<div class="btn" ms-class="{{info.ZFBB13==el.infocode ? 'active':''}}" ms-click="onRadioClick('ZFBB13',el.infocode)" ms-repeat="RADIOArr">
                   						 {{el.info}}
                   						</div>
                   	                </div>
                   	            </div>
                   	        </div>
                   	    </div>
                   	    <div class="inputs">
                   	        <div class="input-group">
                   	            <div class="lb">PCI<span class="required">*</span></div>
                   	            <div class="input">
                   	                <div class="radio-btns">
                   						<div class="btn" ms-class="{{info.GMZYPCI13==el.infocode ? 'active':''}}" ms-click="onRadioClick('GMZYPCI13',el.infocode)" ms-repeat="RADIOArr">
                   						{{el.info}}
                   						</div>
                   	                </div>
                   	            </div>
                   	        </div>
                   	    </div>
                   		<div ms-if="info.GMZYPCI13==1">
                   		   <div class="inputs">
                   			 <div class="input-group">
                   			   <div class="lb lb_check">术中处理 <span class="required">*</span></div>
                   			    <div class="input">
                   			        <div class="checkbox-group">
                   						<div ms-repeat="SZCLArr" class="btn"
                   						     ms-class="{{isChecked('SZCL13',el.infocode) ? 'active':''}}" ms-click="onSelectClick('SZCL13',el.infocode)">
                   						    {{el.info}}
                   						</div>
                   			        </div>
                   			    </div>
                   			 </div>
                   		   </div>
                   		   <div class="inputs">
                   			<div class="input-group">
                   			    <div class="lb">导丝通过时间</div>
                   			    <div class="input">
                   			       <input type="text"  class="Wdate input" onclick="WdatePicker({dateFmt:'yyyy-MM-dd'})" ms-duplex="info.DSTGSJ13"/>
                   			    </div>
                   			</div>
                   		   </div>
                   		   <div class="inputs">
                   		       <div class="input-group">
                   		           <div class="lb">术后TIMI血流<span class="required">*</span></div>
                   		           <div class="input">
                   		               <div class="radio-btns">
                   						   <div class="btn" ms-class="{{info.SHTIMIXL13==el.infocode ? 'active':''}}" ms-click="onRadioClick('SHTIMIXL13',el.infocode)" ms-repeat="SHTIMIXLArr">
                   						       {{el.info}}
                   						   </div>
                   		               </div>
                   		           </div>
                   		       </div>
                   		   </div>
                   		   <div class="inputs">
                   		       <div class="input-group">
                   		           <div class="lb">植入支架个数<span class="required">*</span></div>
                   		           <div class="input">
                   		               <div class="radio-btns">
                   						   <div class="btn" ms-class="{{info.ZRZJGS13==el.infocode ? 'active':''}}" ms-click="onRadioClick('ZRZJGS13',el.infocode)" ms-repeat="ZRZJGSArr">
                   						       {{el.info}}
                   						   </div>
                   		               </div>
                   		           </div>
                   		       </div>
                   		   </div>
                   		   <div class="inputs" ms-if="info.ZRZJGS13!=0">
                   		       <div class="input-group">
                   		           <div class="lb">支架种类<span class="required">*</span></div>
                   		           <div class="input">
                   		               <div class="radio-btns">
                   						   <div class="btn"  ms-class="{{info.ZJZL13==el.infocode ? 'active':''}}" ms-click="onRadioClick('ZJZL13',el.infocode)" ms-repeat="ZJZLArr">
                   						       {{el.info}}
                   						   </div>
                   		               </div>
                   		           </div>
                   		       </div>
                   		   </div>
                   		</div>
                   	</div>
                   	<div class="block" ms-if="(GMZYSel.$model).indexOf('14') > -1">
                   	    <div class="title">左室后支</div>
                   	    <div class="inputs">
                   	        <div class="input-group">
                   	            <div class="lb">狭窄程度<span class="required">*</span></div>
                   	            <div class="input">
                   	                <div class="radio-btns">
                   						<div class="btn" ms-class="{{info.XZCD14==el.infocode ? 'active':''}}" ms-click="onRadioClick('XZCD14',el.infocode)" ms-repeat="XZCDArr">
                   						    {{el.info}}
                   						</div>
                   	                </div>
                   	            </div>
                   	        </div>
                   	    </div>
                   	    <div class="inputs">
                   	        <div class="input-group">
                   	            <div class="lb">造影时TIMI血流<span class="required">*</span></div>
                   	            <div class="input">
                   	                <div class="radio-btns">
                   						<div class="btn" ms-class="{{info.ZYSTIMIXL14==el.infocode ? 'active':''}}" ms-click="onRadioClick('ZYSTIMIXL14',el.infocode)" ms-repeat="ZYSTIMIXLArr">
                   						     {{el.info}}
                   						</div>
                   	                </div>
                   	            </div>
                   	        </div>
                   	    </div>
                   	    <div class="inputs">
                   	        <div class="input-group">
                   	            <div class="lb">支架内血栓<span class="required">*</span></div>
                   	            <div class="input">
                   	                <div class="radio-btns">
                   						<div class="btn" ms-class="{{info.ZJNXS14==el.infocode ? 'active':''}}" ms-click="onRadioClick('ZJNXS14',el.infocode)" ms-repeat="RADIOArr">
                   						     {{el.info}}
                   						</div>
                   	                </div>
                   	            </div>
                   	        </div>
                   	    </div>
                   	    <div class="inputs">
                   	        <div class="input-group">
                   	            <div class="lb">是否分叉病变<span class="required">*</span></div>
                   	            <div class="input">
                   	                <div class="radio-btns">
                   	                    <div class="btn" ms-class="{{info.SFFCBB14==el.infocode ? 'active':''}}"  ms-click="onRadioClick('SFFCBB14',el.infocode)" ms-repeat="RADIOArr" >
                   	                         {{el.info}}
                   	                    </div>
                   	                </div>
                   	            </div>
                   	        </div>
                   	    </div>
                   	    <div class="inputs">
                   	        <div class="input-group">
                   	            <div class="lb">是否CTO<span class="required">*</span></div>
                   	            <div class="input">
                   	                <div class="radio-btns">
                   						<div class="btn" ms-class="{{info.SFCTO14==el.infocode ? 'active':''}}"  ms-click="onRadioClick('SFCTO14',el.infocode)" ms-repeat="RADIOArr">
                   						     {{el.info}}
                   						</div>
                   	                </div>
                   	            </div>
                   	        </div>
                   	    </div>
                   	    <div class="inputs">
                   	        <div class="input-group">
                   	            <div class="lb">钙化病变<span class="required">*</span></div>
                   	            <div class="input">
                   	                <div class="radio-btns">
                   						<div class="btn" ms-class="{{info.GHBB14==el.infocode ? 'active':''}}" ms-click="onRadioClick('GHBB14',el.infocode)" ms-repeat="RADIOArr">
                   						     {{el.info}}
                   						</div>
                   	                </div>
                   	            </div>
                   	        </div>
                   	    </div>
                   	    <div class="inputs">
                   	        <div class="input-group">
                   	            <div class="lb">罪犯病变<span class="required">*</span></div>
                   	            <div class="input">
                   	                <div class="radio-btns">
                   						<div class="btn" ms-class="{{info.ZFBB14==el.infocode ? 'active':''}}" ms-click="onRadioClick('ZFBB14',el.infocode)" ms-repeat="RADIOArr">
                   						 {{el.info}}
                   						</div>
                   	                </div>
                   	            </div>
                   	        </div>
                   	    </div>
                   	    <div class="inputs">
                   	        <div class="input-group">
                   	            <div class="lb">PCI<span class="required">*</span></div>
                   	            <div class="input">
                   	                <div class="radio-btns">
                   						<div class="btn" ms-class="{{info.GMZYPCI14==el.infocode ? 'active':''}}" ms-click="onRadioClick('GMZYPCI14',el.infocode)" ms-repeat="RADIOArr">
                   						{{el.info}}
                   						</div>
                   	                </div>
                   	            </div>
                   	        </div>
                   	    </div>
                   		<div ms-if="info.GMZYPCI14==1">
                   		   <div class="inputs">
                   			 <div class="input-group">
                   			   <div class="lb lb_check">术中处理 <span class="required">*</span></div>
                   			    <div class="input">
                   			        <div class="checkbox-group">
                   						<div ms-repeat="SZCLArr" class="btn"
                   						     ms-class="{{isChecked('SZCL14',el.infocode) ? 'active':''}}" ms-click="onSelectClick('SZCL14',el.infocode)">
                   						    {{el.info}}
                   						</div>
                   			        </div>
                   			    </div>
                   			 </div>
                   		   </div>
                   		   <div class="inputs">
                   			<div class="input-group">
                   			    <div class="lb">导丝通过时间</div>
                   			    <div class="input">
                   			       <input type="text"  class="Wdate input" onclick="WdatePicker({dateFmt:'yyyy-MM-dd'})" ms-duplex="info.DSTGSJ14"/>
                   			    </div>
                   			</div>
                   		   </div>
                   		   <div class="inputs">
                   		       <div class="input-group">
                   		           <div class="lb">术后TIMI血流<span class="required">*</span></div>
                   		           <div class="input">
                   		               <div class="radio-btns">
                   						   <div class="btn" ms-class="{{info.SHTIMIXL14==el.infocode ? 'active':''}}" ms-click="onRadioClick('SHTIMIXL14',el.infocode)" ms-repeat="SHTIMIXLArr">
                   						       {{el.info}}
                   						   </div>
                   		               </div>
                   		           </div>
                   		       </div>
                   		   </div>
                   		   <div class="inputs">
                   		       <div class="input-group">
                   		           <div class="lb">植入支架个数<span class="required">*</span></div>
                   		           <div class="input">
                   		               <div class="radio-btns">
                   						   <div class="btn" ms-class="{{info.ZRZJGS14==el.infocode ? 'active':''}}" ms-click="onRadioClick('ZRZJGS14',el.infocode)" ms-repeat="ZRZJGSArr">
                   						       {{el.info}}
                   						   </div>
                   		               </div>
                   		           </div>
                   		       </div>
                   		   </div>
                   		   <div class="inputs" ms-if="info.ZRZJGS14!=0">
                   		       <div class="input-group">
                   		           <div class="lb">支架种类<span class="required">*</span></div>
                   		           <div class="input">
                   		               <div class="radio-btns">
                   						   <div class="btn"  ms-class="{{info.ZJZL14==el.infocode ? 'active':''}}" ms-click="onRadioClick('ZJZL14',el.infocode)" ms-repeat="ZJZLArr">
                   						       {{el.info}}
                   						   </div>
                   		               </div>
                   		           </div>
                   		       </div>
                   		   </div>
                   		</div>
                   	</div>
                   	<div class="block" ms-if="(GMZYSel.$model).indexOf('15') > -1">
                   	    <div class="title">后降支(左优势型或均衡型)</div>
                   	    <div class="inputs">
                   	        <div class="input-group">
                   	            <div class="lb">狭窄程度<span class="required">*</span></div>
                   	            <div class="input">
                   	                <div class="radio-btns">
                   						<div class="btn" ms-class="{{info.XZCD15==el.infocode ? 'active':''}}" ms-click="onRadioClick('XZCD15',el.infocode)" ms-repeat="XZCDArr">
                   						    {{el.info}}
                   						</div>
                   	                </div>
                   	            </div>
                   	        </div>
                   	    </div>
                   	    <div class="inputs">
                   	        <div class="input-group">
                   	            <div class="lb">造影时TIMI血流<span class="required">*</span></div>
                   	            <div class="input">
                   	                <div class="radio-btns">
                   						<div class="btn" ms-class="{{info.ZYSTIMIXL15==el.infocode ? 'active':''}}" ms-click="onRadioClick('ZYSTIMIXL15',el.infocode)" ms-repeat="ZYSTIMIXLArr">
                   						     {{el.info}}
                   						</div>
                   	                </div>
                   	            </div>
                   	        </div>
                   	    </div>
                   	    <div class="inputs">
                   	        <div class="input-group">
                   	            <div class="lb">支架内血栓<span class="required">*</span></div>
                   	            <div class="input">
                   	                <div class="radio-btns">
                   						<div class="btn" ms-class="{{info.ZJNXS15==el.infocode ? 'active':''}}" ms-click="onRadioClick('ZJNXS15',el.infocode)" ms-repeat="RADIOArr">
                   						     {{el.info}}
                   						</div>
                   	                </div>
                   	            </div>
                   	        </div>
                   	    </div>
                   	    <div class="inputs">
                   	        <div class="input-group">
                   	            <div class="lb">是否分叉病变<span class="required">*</span></div>
                   	            <div class="input">
                   	                <div class="radio-btns">
                   	                    <div class="btn" ms-class="{{info.SFFCBB15==el.infocode ? 'active':''}}"  ms-click="onRadioClick('SFFCBB15',el.infocode)" ms-repeat="RADIOArr" >
                   	                         {{el.info}}
                   	                    </div>
                   	                </div>
                   	            </div>
                   	        </div>
                   	    </div>
                   	    <div class="inputs">
                   	        <div class="input-group">
                   	            <div class="lb">是否CTO<span class="required">*</span></div>
                   	            <div class="input">
                   	                <div class="radio-btns">
                   						<div class="btn" ms-class="{{info.SFCTO15==el.infocode ? 'active':''}}"  ms-click="onRadioClick('SFCTO15',el.infocode)" ms-repeat="RADIOArr">
                   						     {{el.info}}
                   						</div>
                   	                </div>
                   	            </div>
                   	        </div>
                   	    </div>
                   	    <div class="inputs">
                   	        <div class="input-group">
                   	            <div class="lb">钙化病变<span class="required">*</span></div>
                   	            <div class="input">
                   	                <div class="radio-btns">
                   						<div class="btn" ms-class="{{info.GHBB15==el.infocode ? 'active':''}}" ms-click="onRadioClick('GHBB15',el.infocode)" ms-repeat="RADIOArr">
                   						     {{el.info}}
                   						</div>
                   	                </div>
                   	            </div>
                   	        </div>
                   	    </div>
                   	    <div class="inputs">
                   	        <div class="input-group">
                   	            <div class="lb">罪犯病变<span class="required">*</span></div>
                   	            <div class="input">
                   	                <div class="radio-btns">
                   						<div class="btn" ms-class="{{info.ZFBB15==el.infocode ? 'active':''}}" ms-click="onRadioClick('ZFBB15',el.infocode)" ms-repeat="RADIOArr">
                   						 {{el.info}}
                   						</div>
                   	                </div>
                   	            </div>
                   	        </div>
                   	    </div>
                   	    <div class="inputs">
                   	        <div class="input-group">
                   	            <div class="lb">PCI<span class="required">*</span></div>
                   	            <div class="input">
                   	                <div class="radio-btns">
                   						<div class="btn" ms-class="{{info.GMZYPCI15==el.infocode ? 'active':''}}" ms-click="onRadioClick('GMZYPCI15',el.infocode)" ms-repeat="RADIOArr">
                   						{{el.info}}
                   						</div>
                   	                </div>
                   	            </div>
                   	        </div>
                   	    </div>
                   		<div ms-if="info.GMZYPCI15==1">
                   		   <div class="inputs">
                   			 <div class="input-group">
                   			   <div class="lb lb_check">术中处理 <span class="required">*</span></div>
                   			    <div class="input">
                   			        <div class="checkbox-group">
                   						<div ms-repeat="SZCLArr" class="btn"
                   						     ms-class="{{isChecked('SZCL15',el.infocode) ? 'active':''}}" ms-click="onSelectClick('SZCL15',el.infocode)">
                   						    {{el.info}}
                   						</div>
                   			        </div>
                   			    </div>
                   			 </div>
                   		   </div>
                   		   <div class="inputs">
                   			<div class="input-group">
                   			    <div class="lb">导丝通过时间</div>
                   			    <div class="input">
                   			       <input type="text"  class="Wdate input" onclick="WdatePicker({dateFmt:'yyyy-MM-dd'})" ms-duplex="info.DSTGSJ15"/>
                   			    </div>
                   			</div>
                   		   </div>
                   		   <div class="inputs">
                   		       <div class="input-group">
                   		           <div class="lb">术后TIMI血流<span class="required">*</span></div>
                   		           <div class="input">
                   		               <div class="radio-btns">
                   						   <div class="btn" ms-class="{{info.SHTIMIXL15==el.infocode ? 'active':''}}" ms-click="onRadioClick('SHTIMIXL15',el.infocode)" ms-repeat="SHTIMIXLArr">
                   						       {{el.info}}
                   						   </div>
                   		               </div>
                   		           </div>
                   		       </div>
                   		   </div>
                   		   <div class="inputs">
                   		       <div class="input-group">
                   		           <div class="lb">植入支架个数<span class="required">*</span></div>
                   		           <div class="input">
                   		               <div class="radio-btns">
                   						   <div class="btn" ms-class="{{info.ZRZJGS15==el.infocode ? 'active':''}}" ms-click="onRadioClick('ZRZJGS15',el.infocode)" ms-repeat="ZRZJGSArr">
                   						       {{el.info}}
                   						   </div>
                   		               </div>
                   		           </div>
                   		       </div>
                   		   </div>
                   		   <div class="inputs" ms-if="info.ZRZJGS15!=0">
                   		       <div class="input-group">
                   		           <div class="lb">支架种类<span class="required">*</span></div>
                   		           <div class="input">
                   		               <div class="radio-btns">
                   						   <div class="btn"  ms-class="{{info.ZJZL15==el.infocode ? 'active':''}}" ms-click="onRadioClick('ZJZL15',el.infocode)" ms-repeat="ZJZLArr">
                   						       {{el.info}}
                   						   </div>
                   		               </div>
                   		           </div>
                   		       </div>
                   		   </div>
                   		</div>
                   	</div>
				</div>
                <div class="block" >
                    <div class="title">器械</div>
                    <div class="inputs">
                        <div class="input-group">
                            <div class="lb">腔内影像<span class="required">*</span></div>
                            <div class="input">
                                <div class="radio-btns">
                                   <div class="btn" ms-class="{{info.QNYX==el.infocode ? 'active':''}}"
                                        ms-click="onRadioClick('QNYX',el.infocode)" ms-repeat="QNYXArr">
                                                {{el.info}}
                                   </div>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="inputs">
                        <div class="input-group">
                            <div class="lb">功能检测<span class="required">*</span></div>
                            <div class="input">
                                <div class="radio-btns">
                                    <div class="btn" ms-class="{{info.GNJC==el.infocode ? 'active':''}}"
                                         ms-click="onRadioClick('GNJC',el.infocode)" ms-repeat="GNJCArr">
                                        {{el.info}}
                                    </div>
                                </div>
                            </div>
                        </div>
                        <div class="input-group" ms-if="info.GNJC==1||info.GNJC==2||info.GNJC==3">
                            <div class="lb">数值<span class="required">*</span></div>
                            <div class="input">
                                <input type="text" ms-duplex="info.GNJCSZ"/>
                            </div>
                        </div>
                    </div>
                    <div class="inputs">
                        <div class="input-group">
                            <div class="lb">IABP<span class="required">*</span></div>
                            <div class="input">
							  <div class="radio-btns">
                                <div class="btn" ms-class="{{info.IABP==el.infocode ? 'active':''}}"
                                     ms-click="onRadioClick('IABP',el.infocode)" ms-repeat="RADIOArr">
                                     {{el.info}}
                                </div>
							  </div>
                            </div>
                        </div>
                    </div>
                    <div class="inputs">
                        <div class="input-group">
                            <div class="lb">临时起搏器<span class="required">*</span></div>
                            <div class="input">
							  <div class="radio-btns">
                                <div class="btn" ms-class="{{info.LSQBQ==el.infocode ? 'active':''}}"
                                     ms-click="onRadioClick('LSQBQ',el.infocode)" ms-repeat="RADIOArr">
                                {{el.info}}
                                </div>
							  </div>
                            </div>
                        </div>
                    </div>
                    <div class="inputs">
                        <div class="input-group">
                            <div class="lb">ECMO<span class="required">*</span></div>
                            <div class="input">
							  <div class="radio-btns">
                                <div class="btn" ms-class="{{info.ECMO==el.infocode ? 'active':''}}"
                                     ms-click="onRadioClick('ECMO',el.infocode)" ms-repeat="RADIOArr">
                                     {{el.info}}
                                </div>
							  </div>
                            </div>
                        </div>
                    </div>
                    <div class="inputs">
                        <div class="input-group">
                            <div class="lb">左心室辅助装置 <span class="required">*</span></div>
                            <div class="input">
							  <div class="radio-btns">
                                <div class="btn" ms-class="{{info.ZXSFZZZ==el.infocode ? 'active':''}}"
                                     ms-click="onRadioClick('ZXSFZZZ',el.infocode)" ms-repeat="RADIOArr">
                                     {{el.info}}
                                </div>
							  </div>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="block">
                    <div class="title">术中并发症 <span class="required">*</span></div>
                    <div class="inputs">
                        <div class="input-group">
                            <div class="input">
                                <div class="checkbox-group">
                                   <div ms-repeat="SZBFZArr" class="btn"
                                        ms-class="{{isChecked('SZBFZ',el.infocode) ? 'active':''}}"
                                        ms-click="onSelectClick('SZBFZ',el.infocode)">
                                    {{el.info}}
                                   </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
             </div>
			</div>
			<div class="block" ms-if="info.CBZD==5">
			    <div class="title">治疗信息</div>
			    <div class="inputs">
			        <div class="input-group">
			            <div class="lb lb_check">危险分层</div>
			            <div class="input">
			                <div class="checkbox-group">
			                    <div class="btn" ms-class="{{info.WXFC==1 ? 'active':''}}"
			                         ms-click="onRadioClick('WXFC',1)">
			                        高危
			                    </div>
			                    <div class="btn" ms-class="{{info.WXFC==2 ? 'active':''}}"
			                         ms-click="onRadioClick('WXFC',2)">
			                        中危
			                    </div>
			                    <div class="btn" ms-class="{{info.WXFC==3 ? 'active':''}}"
			                         ms-click="onRadioClick('WXFC',3)">
			                        低危
			                    </div>
			                </div>
			            </div>
			        </div>
			        <div class="input-group">
			            <div class="lb">开始抗凝时间</div>
			            <div class="input">
			                <input type="text" class="Wdate" ms-duplex="info.KSKNZLSJ"
			                       onclick="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm'})"/>
			            </div>
			        </div>
			    </div>
			</div>
            <div class="block">
                <div class="inputs" ms-if="info.CBZD==6 || info.CBZD==7 || info.CBZD==8">
                    <div class="input-group">
                        <div class="lb">患者情况备注</div>
                        <div class="input">
                            <input type="text" style="width: 790px" ms-duplex="info.YNHZQKBZ"/>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <div class="tab-container outcome" ms-if="activeTab==2">
            <div class="block">
                <div class="inputs">
                    <div class="input-group">
                        <div class="lb">出院诊断 <span class="required">*</span></div>
                        <div class="input">
                            <div class="radio-btns">
                                <div class="btn" ms-class="{{info.CYZD==$index ? 'active':''}}"
                                     ms-click="onRadioClick('CYZD',$index)" ms-repeat="CYZDArr">
                                    {{el}}
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="inputs" ms-if="info.CYZD==5">
                    <div class="input-group">
                        <div class="lb lb_check">非ACS心源性胸痛类型 <span class="required">*</span></div>
                        <div class="input">
                            <div class="checkbox-group">
                                <div class="btn" ms-repeat="FACSXYXXTLXArr"
                                     ms-class="{{isChecked('ZGFACSXYXXTLX',el.infocode) ? 'active':''}}"
                                     ms-click="onCheckClick('ZGFACSXYXXTLX',el.infocode)">
                                    {{el.info}}
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="inputs" ms-if="info.CYZD==6">
                    <div class="input-group">
                        <div class="lb lb_check">其它非心源性胸痛类型 <span class="required">*</span></div>
                        <div class="input">
                            <div class="checkbox-group">
								<div class="btn" ms-repeat="QTFXYXXTLXArr"
								     ms-class="{{isChecked('ZGQTFXYXXTLX',el.infocode) ? 'active':''}}"
								     ms-click="onCheckClick('ZGQTFXYXXTLX',el.infocode)">
								    {{el.info}}
								</div>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="inputs">
                    <div class="input-group">
                        <div class="lb">确诊时间 <span class="required">*</span></div>
                        <div class="input">
                            <input type="text"  class="Wdate input" onclick="WdatePicker({dateFmt:'yyyy-MM-dd'})" ms-duplex="info.QZSJ"/>
                        </div>
                    </div>
                </div>
                <div class="inputs">
                    <div class="input-group">
                        <div class="lb">COVID-19</div>
						<div class="input">
						    <div class="radio-btns">
						        <div class="btn" ms-class="{{info.COVID19==el.infocode ? 'active':''}}"
						             ms-click="onRadioClick('COVID19',el.infocode)" ms-repeat="COVID19Arr">
						            {{el.info}}
						        </div>
						    </div>
						</div>
                    </div>
                </div>
                <div class="inputs" ms-if="info.CYZD==0 || info.CYZD==1 || info.CYZD==2">
                    <div class="input-group">
                        <div class="lb">院内新发心力衰竭 <span class="required">*</span></div>
                        <div class="input">
                            <div class="radio-btns">
                                <div class="btn" ms-class="{{info.YNXFXLSJ==el.infocode ? 'active':''}}"
                                     ms-click="onRadioClick('YNXFXLSJ',el.infocode)" ms-repeat="RADIOArr">
                                    {{el.info}}
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="inputs" ms-if="info.CYZD==0 || info.CYZD==1 || info.CYZD==2">
                    <div class="input-group">
                        <div class="lb">住院期间并发症 <span class="required">*</span></div>
						<div class="input">
						    <div class="checkbox-group">
						        <div class="btn" ms-repeat="ZYQJBFZArr"
						             ms-class="{{isChecked('ZYQJBFZ',el.infocode) ? 'active':''}}"
						             ms-click="onSelectClick('ZYQJBFZ',el.infocode)">
						            {{el.info}}
						        </div>
						    </div>
                    </div>
                </div>
            </div>
            <div ms-if="info.CYZD==0 || info.CYZD==1 || info.CYZD==2">
                <div class="inputs">
				  <div class="input-group">
					<div class="lb lb_check">危险因素 <span class="required">*</span></div>
					<div class="input">
                        <div class="checkbox-group">
                            <div ms-repeat="XXGJBWXYSArr" class="btn"
                                 ms-class="{{isChecked('XXGJBWXYS',el.infocode) ? 'active':''}}"
                                 ms-click="onCheckClick('XXGJBWXYS',el.infocode)">
                                 {{el.info}}
                            </div>
                        </div>
					</div>
				  </div>
                </div>
                <div class="inputs">
                    <div class="input-group" ms-if="(XXGJBWXYSSel.$model).indexOf('4') > -1">
                        <div class="lb">吸烟状态 <span class="required">*</span></div>
                        <div class="input">
                            <div class="radio-btns">
                                <div class="btn" ms-class="{{info.XYZT==el.infocode ? 'active':''}}"
                                     ms-click="onRadioClick('XYZT',el.infocode)" ms-repeat="XYZTArr">
                                    {{el.info}}
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
            <div ms-if="info.CYZD==0 || info.CYZD==1 || info.CYZD==2">
				<div class="inputs">
				  <div class="input-group">
					<div class="lb lb_check">合并疾病 <span class="required">*</span></div>
					<div class="input">
				        <div class="checkbox-group">
				            <div ms-repeat="HEBZArr" class="btn"
				                 ms-class="{{isChecked('HEBZ',el.infocode) ? 'active':''}}"
				                 ms-click="onCheckClick('HEBZ',el.infocode)">
				                 {{el.info}}
				            </div>
				        </div>
					</div>
				  </div>
				</div>
                <div class="inputs">
                    <div class="input-group" ms-if="(HEBZSel.$model).indexOf('1') > -1">
                        <div class="lb">血运重建史 <span class="required">*</span></div>
                        <div class="input">
                            <div class="radio-btns">
                                <div class="btn" ms-class="{{info.XYCJS==el.infocode ? 'active':''}}"
                                     ms-click="onRadioClick('XYCJS',el.infocode)" ms-repeat="RADIOArr">
                                    {{el.info}}
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="inputs">
                    <div class="input-group" ms-if="(HEBZSel.$model).indexOf('2') > -1">
                        <div class="lb">分型 <span class="required">*</span></div>
                        <div class="input">
                            <div class="radio-btns">
                                <div class="btn" ms-class="{{info.XFCDFX==el.infocode ? 'active':''}}"
                                     ms-click="onRadioClick('XFCDFX',el.infocode)" ms-repeat="XFCDFXArr">
                                    {{el.info}}
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="inputs">
                    <div class="input-group" ms-if="(HEBZSel.$model).indexOf('3') > -1">
                        <div class="lb">NYHA分级 <span class="required">*</span></div>
                        <div class="input">
                            <div class="radio-btns">
                                <div class="btn" ms-class="{{info.ZGNYHA==el.infocode ? 'active':''}}"
                                     ms-click="onRadioClick('ZGNYHA',el.infocode)" ms-repeat="ZGNYHAArr">
                                    {{el.info}}
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="inputs">
                    <div class="input-group" ms-if="(HEBZSel.$model).indexOf('5') > -1">
                        <div class="lb">描述 <span class="required">*</span></div>
                        <div class="input">
                            <div class="radio-btns">
                                <div class="btn" ms-class="{{info.NXGJBMS==el.infocode ? 'active':''}}"
                                     ms-click="onRadioClick('NXGJBMS',el.infocode)" ms-repeat="NXGJBMSArr">
                                    {{el.info}}
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
            <div class="block" ms-if="info.CYZD==0 || info.CYZD==1 || info.CYZD==2">
                <div class="title">检查结果</div>
                <div class="inputs">
                    <div class="input-group">
                        <div class="lb">72h内肌钙蛋白 <span class="required">*</span></div>
                        <div class="input">
                            <div class="radio-btns">
                                <div class="btn" ms-class="{{info.JGDB72==el.infocode ? 'active':''}}"
                                     ms-click="onRadioClick('JGDB72',el.infocode)" ms-repeat="RADIOArr">
                                    {{el.info}}
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="input-group" ms-if="info.JGDB72==1">
                        <div class="lb">72h内肌钙蛋白最高值 <span class="required">*</span></div>
                        <div class="input">
                            <div class="radio-btns fl">
                                <div class="btn" ms-class="{{info.JGDB72LX==el.infocode ? 'active':''}}"
                                     ms-click="onRadioClick('JGDB72LX',el.infocode)" ms-repeat="JGDB72LXArr">
                                    {{el.info}}
                                </div>
                            </div>
                            <input type="text" ms-duplex="info.JGDB72ZGZ" />
                            <select name="" ms-duplex="info.JGDB72DW">
                                <option value="">请选择</option>
								<option ms-repeat="JGDB72DWArr" ms-attr-value="el.infocode" >{{el.info}}</option>
                            </select>
                        </div>
                    </div>
                </div>
                <div class="inputs">
                    <div class="input-group">
                        <div class="lb">脑钠肽 <span class="required">*</span></div>
                        <div class="input">
                            <div class="radio-btns">
                                <div class="btn" ms-class="{{info.NNT==el.infocode ? 'active':''}}"
                                     ms-click="onRadioClick('NNT',el.infocode)" ms-repeat="RADIOArr">
                                    {{el.info}}
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="input-group" ms-if="info.NNT==1">
						<div class="lb">脑钠肽类型<span class="required">*</span></div>
                        <div class="input">
                            <div class="radio-btns">
                                <div class="btn" ms-class="{{info.NNTLX==el.infocode ? 'active':''}}"
                                     ms-click="onRadioClick('NNTLX',el.infocode)" ms-repeat="NNTLXArr">
                                    {{el.info}}
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="input-group" ms-if="info.NNT==1">
                        <div class="fl">最高值</div>
                        <div class="input">
                            <input type="text" ms-duplex="info.NNTZGZ"/>
                            <div class="unit">pg/mL</div>
                        </div>
                    </div>
                </div>
                <div class="inputs">
                    <div class="input-group">
                        <div class="lb">总胆固醇(TC) <span class="required">*</span></div>
                        <div class="input">
                            <div class="radio-btns">
                                <div class="btn" ms-class="{{info.ZDGC==el.infocode ? 'active':''}}"
                                     ms-click="onRadioClick('ZDGC',el.infocode)" ms-repeat="RADIOArr">
                                    {{el.info}}
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="input-group" ms-if="info.ZDGC==1">
                        <div class="lb">数值 <span class="required">*</span></div>
                        <div class="input">
                            <input type="text" ms-duplex="info.ZDGCSZ" />
                            <div class="unit">mmol/L</div>
                        </div>
                    </div>
                </div>
                <div class="inputs">
                    <div class="input-group">
                        <div class="lb">甘油三酯(TG) <span class="required">*</span></div>
                        <div class="input">
                            <div class="radio-btns">
                                <div class="btn" ms-class="{{info.GYSZ==el.infocode ? 'active':''}}"
                                     ms-click="onRadioClick('GYSZ',el.infocode)" ms-repeat="RADIOArr">
                                    {{el.info}}
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="input-group" ms-if="info.GYSZ==1">
                        <div class="lb">数值<span class="required">*</span></div>
                        <div class="input">
                            <input type="text" ms-duplex="info.GYSZSZ" />
                            <div class="unit">mmol/L</div>
                        </div>
                    </div>
                </div>
                <div class="inputs">
                    <div class="input-group">
                        <div class="lb">高密度脂蛋白(HDL-C)<span class="required">*</span></div>
                        <div class="input">
                            <div class="radio-btns">
                                <div class="btn" ms-class="{{info.GMDZDB==el.infocode ? 'active':''}}"
                                     ms-click="onRadioClick('GMDZDB',el.infocode)" ms-repeat="RADIOArr">
                                    {{el.info}}
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="input-group" ms-if="info.GMDZDB==1">
                        <div class="lb">数值<span class="required">*</span></div>
                        <div class="input">
                            <input type="text" ms-duplex="info.GMDZDBSZ" />
                            <div class="unit">mmol/L</div>
                        </div>
                    </div>
                </div>
                <div class="inputs">
                    <div class="input-group">
                        <div class="lb">低密度脂蛋白(LDL-C)<span class="required">*</span></div>
                        <div class="input">
                            <div class="radio-btns">
                                <div class="btn" ms-class="{{info.DMDZDB==el.infocode ? 'active':''}}"
                                     ms-click="onRadioClick('DMDZDB',el.infocode)" ms-repeat="RADIOArr">
                                    {{el.info}}
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="input-group" ms-if="info.DMDZDB==1">
                        <div class="lb">数值<span class="required">*</span></div>
                        <div class="input">
                            <input type="text" ms-duplex="info.DMDZDBSZ" />
                            <div class="unit">mmol/L</div>
                        </div>
                    </div>
                </div>
                <div class="inputs">
                    <div class="input-group">
                        <div class="lb">超声心动图<span class="required">*</span></div>
                        <div class="input">
                            <div class="radio-btns">
                                <div class="btn" ms-class="{{info.CSXDT==el.infocode ? 'active':''}}"
                                     ms-click="onRadioClick('CSXDT',el.infocode)" ms-repeat="RADIOArr">
                                    {{el.info}}
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="inputs" ms-if="info.CSXDT==1">
					<div class="input-group">
						<div class="lb">LVEF</div>
						<div class="input">
							<input type="text" ms-duplex="info.LVEF"/>
							<div class="unit">%(治疗过程中最低值)</div>
						</div>
					</div>
					<div class="input-group">
						<div class="lb">室壁瘤</div>
						<div class="input">
						    <div class="radio-btns">
						        <div class="btn" ms-class="{{info.SHIBL==el.infocode ? 'active':''}}"
						             ms-click="onRadioClick('SHIBL',el.infocode)" ms-repeat="RADIOArr">
						            {{el.info}}
						        </div>
						    </div>
						</div>
					</div>
					<div class="input-group">
						<div class="lb">局部室壁活动异常</div>
						<div class="input">
						    <div class="radio-btns">
						        <div class="btn" ms-class="{{info.JBSBHDYC==el.infocode ? 'active':''}}"
						             ms-click="onRadioClick('JBSBHDYC',el.infocode)" ms-repeat="RADIOArr">
						            {{el.info}}
						        </div>
						    </div>
						</div>
					</div>
				</div>
			</div>
            <div class="block">
                <div class="title">出院信息</div>
                <div class="inputs">
                    <div class="input-group">
                        <div class="lb">住院天数 <span class="required">*</span></div>
                        <div class="input">
                            <input type="text" ms-duplex="info.ZYTS" />
                            <div class="unit">天</div>
                        </div>
                    </div>
                    <div class="input-group">
                        <div class="lb">总费用 <span class="required">*</span></div>
                        <div class="input">
                            <input type="text" ms-duplex="info.FEIY"/>
                            <div class="unit">元</div>
                        </div>
                    </div>
                </div>
                <div class="inputs">
                    <div class="input-group">
                        <div class="lb">患者转归 <span class="required">*</span></div>
                        <div class="input">
                            <div class="radio-btns">
                                <div class="btn" ms-class="{{info.HZZG==$index ? 'active':''}}"
                                     ms-click="onRadioClick('HZZG',$index)" ms-repeat="HZZGArr">
                                    {{el}}
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="inputs" ms-if="info.HZZG==0 || info.HZZG==1 || info.HZZG==2">
                    <div class="input-group">
                        <div class="lb lb_check">离院宣教 <span class="required">*</span></div>
						<div class="input">
						    <div class="checkbox-group">
						        <div class="btn" ms-repeat="LYXJArr"
						             ms-class="{{isChecked('LYXJ',el.infocode) ? 'active':''}}"
						             ms-click="onSelectClick('LYXJ',el.infocode)">
						            {{el.info}}
						        </div>
						    </div>
						</div>
                    </div>
                </div>
                <div class="inputs" ms-if="info.HZZG==0">
                    <div class="input-group">
                        <div class="lb">出院时间 <span class="required">*</span></div>
                        <div class="input">
                            <input type="text"  class="Wdate input" onclick="WdatePicker({dateFmt:'yyyy-MM-dd'})" ms-duplex="info.CYSJ"/>
                        </div>
                    </div>
                    <div class="input-group">
                        <div class="lb">治疗结果 <span class="required">*</span></div>
                        <div class="input">
                            <div class="radio-btns">
                                <div class="btn" ms-class="{{info.ZLJG==$index ? 'active':''}}"
                                     ms-click="onRadioClick('ZLJG',$index)" ms-repeat="ZLJGArr">
                                    {{el}}
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="inputs" ms-if="info.HZZG==1">
                    <div class="input-group">
                        <div class="lb">离开本院大门时间 <span class="required">*</span></div>
                        <div class="input">
                            <input type="text" class="Wdate input" onclick="WdatePicker({dateFmt:'yyyy-MM-dd'})" ms-duplex="info.LKBYDMSJ"/>
                        </div>
                    </div>
                    <div class="input-group">
                        <div class="lb">医院名称</div>
                        <div class="input">
                            <input type="text" ms-duplex="info.YYMC02"/>
                        </div>
                    </div>
                    <div class="input-group">
                        <div class="input">
                            <div class="checkbox-groupk">
                                <div class="btn" ms-class="{{info.SFSWLYY ? 'active' : ''}}"
                                 ms-click="onToggleClick('SFSWLYY')">是否是网络医院</div>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="inputs" ms-if="info.HZZG==1">
                    <div class="input-group">
                        <div class="lb">转运PCI</div>
                        <div class="input">
                            <div class="radio-btns">
                                <div class="btn" ms-class="{{info.ZYPCI02==el.infocode ? 'active':''}}"
                                     ms-click="onRadioClick('ZYPCI02',el.infocode)" ms-repeat="RADIOArr">
                                    {{el.info}}
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="input-group" ms-if="info.ZYPCI02==1">
                        <div class="lb">直达导管室</div>
                        <div class="input">
                            <div class="radio-btns">
                                <div class="btn" ms-class="{{info.ZDDGS02==el.infocode ? 'active':''}}"
                                     ms-click="onRadioClick('ZDDGS02',el.infocode)" ms-repeat="RADIOArr">
                                    {{el.info}}
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="input-group" ms-if="info.ZYPCI02==1">
                        <div class="lb">实际介入手术开始时间</div>
                        <div class="input">
                            <input type="text"  class="Wdate input" onclick="WdatePicker({dateFmt:'yyyy-MM-dd'})" ms-duplex="info.SJJRSSKSSJ"/>
                        </div>
                    </div>
                </div>
                <div class="inputs" ms-if="info.HZZG==1">
                    <div class="input-group">
                        <div class="lb">远程心电图传输 <span class="required">*</span></div>
                        <div class="input">
                            <div class="radio-btns">
                                <div class="btn" ms-class="{{info.YCXDTCS02==el.infocode ? 'active':''}}"
                                     ms-click="onRadioClick('YCXDTCS02',el.infocode)" ms-repeat="YCXDTCS02Arr">
                                    {{el.info}}
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="inputs" ms-if="info.YCXDTCS02==1">
                    <div class="input-group">
                        <div class="lb">传输心电图至协作单位时间</div>
                        <div class="input">
                            <input type="text"  class="Wdate input" onclick="WdatePicker({dateFmt:'yyyy-MM-dd'})" ms-duplex="info.CSXDTZXZDWSJ"/>
                        </div>
                    </div>
                    <div class="input-group">
                        <div class="lb">传输方式</div>
                        <div class="input">
                            <select name="" ms-duplex="info.ZGCSFS">
                                <option value="">请选择</option>
								<option ms-repeat="CSFSArr" ms-attr-value="el.infocode">{{el.info}}</option>
                            </select>
                        </div>
                    </div>
                </div>
                <div class="inputs" ms-if="info.HZZG==2">
                    <div class="input-group">
                        <div class="lb">转科时间</div>
                        <div class="input">
                            <input type="text"  class="Wdate input" onclick="WdatePicker({dateFmt:'yyyy-MM-dd'})" ms-duplex="info.ZKSJ"/>
                        </div>
                    </div>
                    <div class="input-group">
                        <div class="lb">接诊科室</div>
                        <div class="input">
                            <input type="text" ms-duplex="info.JZKS"/>
                        </div>
                    </div>
                </div>
                <div class="inputs" ms-if="info.HZZG==2">
                    <div class="input-group">
                        <div class="lb">转科原因描述</div>
                        <div class="input">
                            <input type="text" style="width: 790px" ms-duplex="info.ZKYYMS"/>
                        </div>
                    </div>
                </div>
                <div class="inputs" ms-if="info.HZZG==3">
                    <div class="input-group">
                        <div class="lb">死亡时间 <span class="required">*</span></div>
                        <div class="input">
                            <input type="text"  class="Wdate input" onclick="WdatePicker({dateFmt:'yyyy-MM-dd'})" ms-duplex="info.SWSJ"/>
                        </div>
                    </div>
                    <div class="input-group">
                        <div class="lb">死亡原因 <span class="required">*</span></div>
                        <div class="input">
                            <div class="radio-btns">
                                <div class="btn" ms-class="{{info.SWYY==$index ? 'active':''}}"
                                     ms-click="onRadioClick('SWYY',$index)" ms-repeat="SWYYArr">
                                    {{el.info}}
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="inputs" ms-if="info.HZZG==3">
                    <div class="input-group">
                        <div class="lb">描述</div>
                        <div class="input">
                            <input type="text" style="width: 790px" ms-duplex="info.SWMS"/>
                        </div>
                    </div>
                </div>
                <div class="inputs" ms-if="!((info.CYZD==0 || info.CYZD==1 || info.CYZD==2) && info.HZZG==0)">
                    <div class="input-group">
                        <div class="lb">患者情况备注</div>
                        <div class="input">
                            <input type="text" style="width: 790px" ms-duplex="info.ZGHZQKBZ"/>
                        </div>
                    </div>
                </div>
            </div>
            <div class="block" ms-if="(info.CYZD==0 || info.CYZD==1 || info.CYZD==2) && info.HZZG==0">
				<div class="title">出院药物方案</div>
				<div class="inputs">
					<div class="input-group">
						<div class="lb">抗血小板药物<span class="required">*</span></div>
						<div class="input">
						    <div class="radio-btns">
						        <div class="btn" ms-class="{{info.KXXBYW==el.infocode ? 'active':''}}"
						             ms-click="onRadioClick('KXXBYW',el.infocode)" ms-repeat="RADIOArr">
						            {{el.info}}
						        </div>
						    </div>
						</div>
					</div>
				</div>
				<div class="inputs" ms-if="info.KXXBYW==1">
					<div class="input-group">
					    <div class="lb">药物名称<span class="required">*</span></div>
					    <div class="input">
					        <select name="" ms-duplex="info.KXXBYWYWMC">
					            <option value="">请选择</option>
					        </select>
					    </div>
					</div>
					<div class="input-group">
					    <div class="lb">服用频次<span class="required">*</span></div>
					    <div class="input">
					        <select name="" ms-duplex="info.KXXBYWFYPC01">
					            <option value="">请选择</option>
					        </select>
							<select name="" ms-duplex="info.KXXBYWFYPC02">
							    <option value="">请选择</option>
							</select>
					    </div>
					</div>
					<div class="input-group">
					    <div class="lb">单次剂量<span class="required">*</span></div>
					    <div class="input" style="padding-right: 0;">
					        <input type="text"  ms-duplex-string="info.KXXBYWDCJL"/>
							<div class="unit">mg</div>
					    </div>
						<span class="iconfont icon-show" ms-click="addItem2('KXXBYWchild1')" ms-if="!hasChild('KXXBYWchild1')"></span>
					</div>
				</div>
				<div ms-if="info.KXXBYW==1">
					<div class="inputs" ms-if="hasChild('KXXBYWchild1')">
					  <div class="input-group">
					    <div class="lb">药物名称<span class="required">*</span></div>
					    <div class="input">
					        <select name="" ms-duplex="info.KXXBYWYWMC02">
					            <option value="">请选择</option>
					        </select>
					    </div>
					  </div>
					  <div class="input-group">
					    <div class="lb">服用频次<span class="required">*</span></div>
					    <div class="input">
					        <select name="" ms-duplex="info.KXXBYWFYPC03">
					            <option value="">请选择</option>
					        </select>
							<select name="" ms-duplex="info.KXXBYWFYPC04">
							    <option value="">请选择</option>
							</select>
					    </div>
					  </div>
					  <div class="input-group">
					    <div class="lb">单次剂量<span class="required">*</span></div>
					    <div class="input" style="padding-right:0;">
					        <input type="text" ms-duplex-string="info.KXXBYWDCJL02"/>
							<div class="unit">mg</div>
					    </div>
						<span class="iconfont icon-hide" ms-click="deleteItem('KXXBYWchild1')" ></span>
					  </div>
					</div>
				</div>
				<div class="inputs">
					<div class="input-group">
						<div class="lb">ACEI/ARB<span class="required">*</span></div>
						<div class="input">
						    <div class="radio-btns">
						        <div class="btn" ms-class="{{info.ACEIARB==el.infocode ? 'active':''}}"
						             ms-click="onRadioClick('ACEIARB',el.infocode)" ms-repeat="RADIOArr">
						            {{el.info}}
						        </div>
						    </div>
						</div>
					</div>
				</div>
				<div class="inputs" ms-if="info.ACEIARB==1">
					<div class="input-group">
					    <div class="lb">药物名称<span class="required">*</span></div>
					    <div class="input">
					        <select name="" ms-duplex="info.ACEIARBYWMC">
					            <option value="">请选择</option>
					        </select>
					    </div>
					</div>
					<div class="input-group">
					    <div class="lb">服用频次<span class="required">*</span></div>
					    <div class="input">
					        <select name="" ms-duplex="info.ACEIARBFYPC01">
					            <option value="">请选择</option>
					        </select>
							<select name="" ms-duplex="info.ACEIARBFYPC02">
							    <option value="">请选择</option>
							</select>
					    </div>
					</div>
					<div class="input-group">
					    <div class="lb">单次剂量<span class="required">*</span></div>
					    <div class="input">
					        <input type="text" ms-duplex-string="info.ACEIARBDCJL"/>
							<div class="unit">mg</div>
					    </div>
					</div>
				</div>
				<div class="inputs">
					<div class="input-group">
						<div class="lb">调脂药物<span class="required">*</span></div>
						<div class="input">
						    <div class="radio-btns">
						        <div class="btn" ms-class="{{info.TZYW==el.infocode ? 'active':''}}"
						             ms-click="onRadioClick('TZYW',el.infocode)" ms-repeat="RADIOArr">
						            {{el.info}}
						        </div>
						    </div>
						</div>
					</div>
				</div>
				<div class="inputs" ms-if="info.TZYW==1">
					<div class="input-group">
					    <div class="lb">药物名称<span class="required">*</span></div>
					    <div class="input">
					        <select name="" ms-duplex="info.TZYWYWMC">
					            <option value="">请选择</option>
					        </select>
					    </div>
					</div>
					<div class="input-group">
					    <div class="lb">服用频次<span class="required">*</span></div>
					    <div class="input">
					        <select name="" ms-duplex="info.TZYWFYPC01">
					            <option value="">请选择</option>
					        </select>
							<select name="" ms-duplex="info.TZYWFYPC02">
							    <option value="">请选择</option>
							</select>
					    </div>
					</div>
					<div class="input-group">
					    <div class="lb">单次剂量<span class="required">*</span></div>
					    <div class="input" style="padding-right:0;">
					        <input type="text"  ms-duplex-string="info.TZYWDCJL"/>
							<div class="unit">mg</div>
					    </div>
						<span class="iconfont icon-show" ms-click="addItem('TZYWchild1')" ms-if="!hasChild('TZYWchild1')"></span>
					</div>
				</div>
				<div ms-if="info.TZYW==1">
				    <div class="inputs" ms-if="hasChild('TZYWchild1')">
				      <div class="input-group">
				        <div class="lb">药物名称<span class="required">*</span></div>
				        <div class="input">
				            <select name="" ms-duplex="info.TZYWYWMC02">
				                <option value="">请选择</option>
				            </select>
				        </div>
				    </div>
				      <div class="input-group">
					    <div class="lb">服用频次<span class="required">*</span></div>
					    <div class="input">
					        <select name="" ms-duplex="info.TZYWFYPC03">
					            <option value="">请选择</option>
					        </select>
							<select name="" ms-duplex="info.TZYWFYPC04">
							    <option value="">请选择</option>
							</select>
					    </div>
					</div>
				      <div class="input-group">
				        <div class="lb">单次剂量<span class="required">*</span></div>
				        <div class="input" style="padding-right:0;">
				            <input type="text" ms-duplex-string="info.TZYWDCJL02"/>
				    		<div class="unit">mg</div>
				        </div>
						<span class="iconfont icon-show" ms-if="hasChild('TZYWchild1') && !hasChild('TZYWchild2') "
						 ms-click="addItem('TZYWchild2')"></span>
						<span class="iconfont icon-hide" ms-click="deleteItem('TZYWchild1')" ></span>
				      </div>
				    </div>
				    <div class="inputs" ms-if="hasChild('TZYWchild2')">
				      <div class="input-group">
				        <div class="lb">药物名称<span class="required">*</span></div>
				        <div class="input">
				            <select name="" ms-duplex="info.TZYWYWMC03">
				                <option value="">请选择</option>
				            </select>
				        </div>
				    </div>
				      <div class="input-group">
				        <div class="lb">服用频次<span class="required">*</span></div>
				        <div class="input">
				            <select name="" ms-duplex="info.TZYWFYPC05">
				                <option value="">请选择</option>
				            </select>
				    		<select name="" ms-duplex="info.TZYWFYPC06">
				    		    <option value="">请选择</option>
				    		</select>
				        </div>
				    </div>
				      <div class="input-group">
				        <div class="lb">单次剂量<span class="required">*</span></div>
				        <div class="input" style="padding-right:0;">
				            <input type="text"ms-duplex-string="info.TZYWDCJL03"/>
				    		<div class="unit">mg</div>
				        </div>
						<span class="iconfont icon-hide" ms-click="deleteItem('TZYWchild2')"></span>
				    </div>
				    </div>
				</div>
				<div class="inputs">
					<div class="input-group">
						<div class="lb">β受体阻滞剂<span class="required">*</span></div>
						<div class="input">
						    <div class="radio-btns">
						        <div class="btn" ms-class="{{info.BSTZZJ02==el.infocode ? 'active':''}}"
						             ms-click="onRadioClick('BSTZZJ02',el.infocode)" ms-repeat="RADIOArr">
						            {{el.info}}
						        </div>
						    </div>
						</div>
					</div>
				</div>
				<div class="inputs" ms-if="info.BSTZZJ02==1">
					<div class="input-group">
					    <div class="lb">药物名称<span class="required">*</span></div>
					    <div class="input">
					        <select name="" ms-duplex="info.BSTZZJ02YWMC">
					            <option value="">请选择</option>
					        </select>
					    </div>
					</div>
					<div class="input-group">
					    <div class="lb">服用频次<span class="required">*</span></div>
					    <div class="input">
					        <select name="" ms-duplex="info.BSTZZJ02FYPC01">
					            <option value="">请选择</option>
					        </select>
							<select name="" ms-duplex="info.BSTZZJ02FYPC02">
							    <option value="">请选择</option>
							</select>
					    </div>
					</div>
					<div class="input-group">
					    <div class="lb">单次剂量<span class="required">*</span></div>
					    <div class="input">
					        <input type="text"  ms-duplex-string="info.BSTZZJ02DCJL"/>
							<div class="unit">mg</div>
					    </div>
					</div>
				</div>
			    <div class="inputs">
			        <div class="input-group">
			            <div class="lb">患者情况备注</div>
			            <div class="input">
			                <input type="text" style="width: 790px" ms-duplex="info.ZGHZQKBZ"/>
			            </div>
			        </div>
			    </div>
			</div>
		</div>
    </div>

</div>
<div class="save-btn" onclick="commit()">保存</div>
</body>
<script type="text/javascript">
    var _emgSeq = "${emgSeq}";
    var vm = avalon.define({
        $id: 'report',
        activeTab: 0,
        baseInfo:{
        	cstNam: '',//患者姓名
            cstSexCod: '',//性别
            cstAge: '',//年龄
			cardType:'',//证件类别
			idNbr:'',//证件号码
            bthDat: '',//出生日期
            pheNbr: '',//联系电话
            emgJob: '',//职业
            maritalStatus: '',//婚姻状况
			nation:'',//民族
        },
        info: {
            ZHUYH: '',//住院ID
            MENZH: '',//门诊ID
            FBSJ: '',//发病时间
            FBSJWFJQDFZ: false,//发病时间无法精确到分钟
			SFSWLYY: false,//是否是网络医院
            FBQJ: '',//发病区间
            FBDZ01: '',//发病地址--省
            FBDZ02: '',//发病地址--市
            FBDZ03: '',//发病地址--县/区
            XXDZ: '',//详细地址
            YBLX: '',//医保类型
            YBBH: '',//医保编号
            DBYB: null,//大病医保
            BQPG: '',//病情评估
            BQPGMX: '',//病情评估明细
            DYFS: '',//到达方式
            CCDW: '',//出车单位
            HJSJ: '',//呼救时间
            ZJZSSJYY: null,//直接转送上级医院
            ZDDGS: null,//直达导管室
			ZDDGS02:null,
			YCXDTCS02:null,//远程心电图传输
            DDYYDMSJ01: '',//到达医院大门时间
			DDYYDMSJ02:'',
			DDYYDMSJ03:'',
            SCYLJCSJ: '',//首次医疗接触时间
            YNSZYSJZSJ: '',//院内首诊医师接诊时间
            YHRY: '',//医护人员
            ZYLX: '',//转院类型
            YYMC: '',//医院名称
            ZCYYRMSJ: '',//转出医院入门时间
            JDZYSJ: '',//决定转院时间
            ZCYJCMSJ: '',//转出医院出门时间
            YNJZSJ: '',//院内接诊时间
            FBKS: '',//发病科室
            CWYSJCSJ: '',//床位医生接触时间
            LKKSSJ: '',//离开科室时间
            YISHI: '',//意识
            HUXI: '',//呼吸
            MAIB: '',//脉搏
            XINL: '',//心率
            XUEY: '',//血压
            TIWEN: '',//体温
            YQHZQKBZ: '',//患者情况备注
			YNHZQKBZ:'',//患者情况备注
			ZGHZQKBZ:'',
            YQRSSC: null,//溶栓筛查
            YQRSZL: null,//溶栓治疗
            YQZDRSCS: null,//直达溶栓场所
            YQRSCS: '',//溶栓场所
            YQKSZQTYSJ: '',//开始知情同意时间
            YQQSZQTYSSJ: '',//签署知情同意书时间
            YQKSRSSJ: '',//开始溶栓时间
            YQRSJSSJ: '',//溶栓结束时间
            YQYW: '',//药物
            YQJL: '',//剂量
            YQRSZT: null,//溶栓再通
            YQBJPCI: null,//补救PCI
            YQSJSSSJ: '',//实际手术时间
            YQSSDD: '',//手术地点
            YQRSHZYSJ: '',//溶栓后造影时间
            YQCZJJZ: null,//存在禁忌症
            XINDT:null,//心电图
            WHDYY: '',//未获得原因
            SFXDTSJ: '',//首份心电图时间
			SFXDTZDSJ:'',//首份心电图诊断时间
			CXWCSJ01:'',//抽血完成时间
			HDBGSJ01:'',//获得报告时间
			CXWCSJ02:'',//抽血完成时间
			HDBGSJ02:'',//获得报告时间
			CXWCSJ03:'',//抽血完成时间
			HDBGSJ03:'',//获得报告时间
			XDTSJ01:'',//心电图时间
			XDTZDSJ01:'',//心电图诊断时间
			XDTSJ02:'',//心电图时间
			XDTZDSJ02:'',//心电图诊断时间
            XDT: '',//心电图
            YCXDTCS: null,//远程心电图传输
            JSXDTSJ: '',//接收120/网络医院心电图时间
            CSFS: '',//传输方式
			ZGCSFS:'',
			CSXDTZXZDWSJ:'',//传输心电图至协作单位时间
            ISJGDB: null,//肌钙蛋白
            ISXQJG: null,//血清肌酐
            XQJGSZ: '',//血清肌酐数值
            ISDEJT: null,//D-二聚体
            DEJTSZ: '',//D-二聚体数值
            DEJTDW: '',//D-二聚体单位
            ISBNP: null,//BNP
            BNPSZ: '',//BNP数值
            ISNTPROBNP: null,//NT-proBNP
            NTPROBNPSZ: '',//NT-proBNP数值
            ISMYO: null,//Myo
            MYOSZ: '',//Myo数值
            MYODW: '',//Myo单位
            ISCKMB: null,//CKMB
            CKMBSZ: '',//CKMB数值
            CKMBDW: '',//CKMB单位
            XNKHZ: null,//心内科会诊
            HZLX: null,//会诊类型
            TZHZSJ: '',//通知会诊时间
            HZSJ: '',//会诊时间
            CBZD: null,//初步诊断
            HZZYFQHXZL: null,//患者自愿放弃后续治疗
            CBZDSJ: '',//初步诊断时间
            YISHENG: '',//医生
            KILLIP: null,//心功能分级
            RXJZ: null,//绕行急诊
            RXCCU: null,//绕行CCU
            KXXBZL: null,//抗血小板治疗
            ASPLJL: null,//阿司匹林剂量
            ASPLSJ: '',//阿司匹林时间
            LBGLJL: null,//氯吡格雷剂量
            LBGLSJ: '',//氯吡格雷时间
            TGRLJL: null,//替格瑞洛剂量
            TGRLSJ: '',//替格瑞洛时间
            KANGN: null,//抗凝
            KNYW: '',//抗凝药物
            KNYWJL: '',//抗凝药物剂量
            KNYWDW: '',//抗凝药物单位
            KNYWSJ: '',//抗凝药物时间
            TTZL: null,//他汀治疗
            BSTZZJ: null,//β受体阻滞剂
            ZGZCS: null,//再灌注措施
            WZGZCSYY: '',//无灌注措施原因
            CUOS: null,//措施
            ZYPCI: null,//转运PCI
			ZYPCI02:null,
		    ZGZRSCS: null,//溶栓措施（补充）
            YNRSSC: null,//院内溶栓筛查（补充）
            YNRSZL: null,//院内溶栓治疗（补充）
            YNCZJJZ: null,//院内存在禁忌症（补充）
            YNZDRSCS: null,//院内直达溶栓场所（补充）
            YNRSCS: null,//院内溶栓场所（补充）
            YNKSZQTYSJ: '',//院内开始知情同意时间（补充）
            YNQSZQTYSSJ: '',//院内签署知情同意书（补充）
            YNKSRSSJ: '',//院内开始溶栓时间（补充）
            YNRSJSSJ: '',//院内溶栓结束时间（补充）
            YNYW: '',//院内药物（补充）
            YNJL: '',//院内剂量（补充）
            JDXPCIYS: '',//决定行pci医生
            JDJRSSSJ: '',//决定介入手术时间
			KSCABGSJ:'',//开始CABG时间
			JDCABGSJ:'',//决定CABG时间
            QDDGSSJ: '',//启动导管室时间
            KSZQTYSJ: '',//开始知情同意时间
            QSZQTYSJ: '',//签署知情同意时间
            DGSJHSJ: '',//导管室激活时间
            HZDDDGSSJ: '',//患者到达导管室时间
            JRYS: '',//介入医师
            KSCCSJ: '',//开始穿刺时间
            ZYKSSJ: '',//造影开始时间
            SZKNGYSJ: '',//术中抗凝给药时间
            SZKNYW: '',//术中抗凝药物
            SZKNYWJL: '',//术中抗凝药物剂量
            SZKNYWDW: '',//术中抗凝药物单位
            SSJSSJ: '',//手术结束时间
            D2WSJ: '',//D2W时间
            SFYW: null,//是否延误
            RULU: null,//入路
            QNYX: null,//腔内影像
            GNJC: null,//功能检测
            GNJCSZ: null,//功能检测数值
            IABP: null,//IABP
            LSQBQ: null,//临时起搏器
            ECMO: null,//ECMO
            ZXSFZZZ: null,//左心室辅助装置
            SZBFZ: '',//术中并发症
            WXYS: '',//Grace危险因素
            GRACEJGWTJ: '',//Grace极高危条件
            GRACEWXFC: null,//Grace危险分层
            ZCWXFC: null,//再次危险分层
            ZCWXFCSJ: '',//再次危险分层时间
            CLCL: null,//处理策略
            QRXCL: null,//侵入性策略
            SJJRZLSJ: '',//实际介入治疗时间
            CYZD: null,//初步诊断
            YXXJC: null,//影像学检查
            WXFC: null,//危险分层（补充）
            TZCTSSJ: '',//通知CT室时间
            CTSWCZBSJ: '',//CT室完成准备时间
            CTSMKSSJ: '',//CT扫描开始时间
			CTBGSJ:'',//CT报告时间
            TZCCSSJ: '',//通知彩超室时间
            CCJCSJ: '',//彩超检查时间
            CCCJGSJ: '',//彩超出结果时间
            TZXWKHZSJ: '',//通知心外科会诊时间
            XWKHZSJ: '',//心外科会诊时间
            ZLCL: null,//治疗策略
            KSKNZLSJ: '',//开始抗凝时间
            FACSXYXXTLX:'',//非ACS心源性胸痛类型
			ZGFACSXYXXTLX:'',
            CLCS:null,//处理措施
            QTFXYXXTLX:'',//其它非心源性胸痛类型
			ZGQTFXYXXTLX:'',
			LYXJ:'',//离院宣教
            JCLX: null,//夹层类型
		    ZYQJBFZ:'',//住院期间并发症
			YNXFXLSJ:null,//院内新发心力衰竭
			XXGJBWXYS:'',//患者转归危险因素
			HEBZ:'',//合并疾病
			XYCJS:null,//血运重建史
			JGDB72:null,//72小时内积钙蛋白
			JGDB72SZ:'',
			NNT:null,//脑钠肽
			NNTZGZ:'',//脑钠肽最高值
			ZDGC:null,//总胆固醇
			ZDGCSZ:'',//总胆固醇数值
			GYSZ:null,//甘油三酯
			GYSZSZ:'',//甘油三酯数值
			GMDZDB:null,//高密度脂蛋白
			GMDZDBSZ:'',//高密度脂蛋白数值
			DMDZDB:null,//低密度脂蛋白
			DMDZDBSZ:'',//低密度脂蛋白数值
			CSXDT:null,//超声心动图
			LVEF:'',//LVEF
			SHIBL:null,//室壁瘤
			JBSBHDYC:null,//局部室壁活动异常
			COVID19:null,//COVID-19
			XYZT:null,//吸烟状态
			XFCDFX:null,//心房颤动分型
			ZGNYHA:null,//NYHA分级
			NXGJBMS:null,//脑血管疾病描述
			JGDB72ZGZ:'',//72h内肌钙蛋白最高值
			JGDB72LX:null,//72h肌钙蛋白类型
			SCJGDB:null,//首次肌钙蛋白
			JGDB72DW:'',
			JGDB02:null,
			JGDB03:null,
			NNTLX:null,//脑钠肽类型
			HZZG: null,//患者转归
			ZLJG:null,//治疗结果
			SWYY:null,//死亡原因
			YWYY:'',//是否延误
			LKBYDMSJ:'',//离开本院大门时间
			YYMC02:'',//医院名称
			ZKYYMS:'',//转科原因描述
			SWMS:'',//死亡描述

			SJJRSSKSSJ:'',//实际介入手术开始时间
			CYSJ:'',//出院时间
			ZYTS:'',//住院天数
			FEIY:'',//费用
			QZSJ:'',//确诊时间
			ZKSJ:'',//转科时间
			JZKS:'',//接诊科室
			SWSJ:'',//死亡时间
			GMZY:'',//冠脉造影
			KXXBYW:null,//抗血小板药物
			ACEIARB:null,//ACEI/ARB
			TZYW:null,//调脂药物
			BSTZZJ02:null,//β受体阻滞剂
			KXXBYWYWMC:'',//药物名称
			KXXBYWFYPC01:'',//服用频次
			KXXBYWFYPC02:'',
			KXXBYWDCJL:'',
			KXXBYWYWMC02:'',
			KXXBYWFYPC03:'',
			KXXBYWFYPC04:'',
			KXXBYWDCJL2:'',
			ACEIARBYWMC:'',
			ACEIARBFYPC01:'',
			ACEIARBFYPC02:'',
			ACEIARBDCJL:'',
			TZYWYWMC:'',
			TZYWFYPC01:'',
			TZYWFYPC02:'',
			TZYWDCJL:'',
			TZYWYWMC02:'',
			TZYWFYPC03:'',
			TZYWFYPC04:'',
			TZYWDCJL02:'',
			TZYWYWMC03:'',
			TZYWFYPC05:'',
			TZYWFYPC06:'',
			TZYWDCJL03:'',
			BSTZZJ02YWMC:'',
			BSTZZJ02FYPC01:'',
			BSTZZJ02FYPC02:'',
			BSTZZJ02DCJL:'',
			XZCD01:null,//狭窄程度
			ZYSTIMIXL01:null,//造影时TIMI血流
			ZJNXS01:null,//支架内血栓
			SFFCBB01:null,//是否分叉病变
			SFCTO01:null,//是否CTO
			GHBB01:null,//钙化病变
			ZFBB01:null,//罪犯病变
			GMZYPCI01:null,//冠脉造影PCI
			SZCL01:'',//术中处理
			DSTGSJ01:'',//导丝通过时间
			SHTIMIXL01:null,//术后TIMI血流
			ZRZJGS01:null,//植入支架个数
			ZJZL01:null,//支架种类
			XZCD02:null,
			ZYSTIMIXL02:null,
			ZJNXS02:null,
			SFFCBB02:null,
			SFCTO02:null,
			GHBB02:null,
			ZFBB02:null,
			GMZYPCI02:null,
			SZCL02:'',
			DSTGSJ02:'',
			SHTIMIXL02:null,
			ZRZJGS02:null,
			ZJZL02:null,
			XZCD03:null,
			ZYSTIMIXL03:null,
			ZJNXS03:null,
			SFFCBB03:null,
			SFCTO03:null,
			GHBB03:null,
			ZFBB03:null,
			GMZYPCI03:null,
			SZCL03:'',
			DSTGSJ03:'',
			SHTIMIXL03:null,
			ZRZJGS03:null,
			ZJZL03:null,
			XZCD04:null,
			ZYSTIMIXL04:null,
			ZJNXS04:null,
			SFFCBB04:null,
			SFCTO04:null,
			GHBB04:null,
			ZFBB04:null,
			GMZYPCI04:null,
			SZCL04:'',
			DSTGSJ04:'',
			SHTIMIXL04:null,
			ZRZJGS04:null,
			ZJZL04:null,
			XZCD05:null,
			ZYSTIMIXL05:null,
			ZJNXS05:null,
			SFFCBB05:null,
			SFCTO05:null,
			GHBB05:null,
			ZFBB05:null,
			GMZYPCI05:null,
			SZCL05:'',
			DSTGSJ05:'',
			SHTIMIXL05:null,
			ZRZJGS05:null,
			ZJZL05:null,
			XZCD06:null,
			ZYSTIMIXL06:null,
			ZJNXS06:null,
			SFFCBB06:null,
			SFCTO06:null,
			GHBB06:null,
			ZFBB06:null,
			GMZYPCI06:null,
			SZCL06:'',
			DSTGSJ06:'',
			SHTIMIXL06:null,
			ZRZJGS06:null,
			ZJZL06:null,
			XZCD07:null,
			ZYSTIMIXL07:null,
			ZJNXS07:null,
			SFFCBB07:null,
			SFCTO07:null,
			GHBB07:null,
			ZFBB07:null,
			GMZYPCI07:null,
			SZCL07:'',
			DSTGSJ07:'',
			SHTIMIXL07:null,
			ZRZJGS07:null,
			ZJZL07:null,
			XZCD08:null,
			ZYSTIMIXL08:null,
			ZJNXS08:null,
			SFFCBB08:null,
			SFCTO08:null,
			GHBB08:null,
			ZFBB08:null,
			GMZYPCI08:null,
			SZCL08:'',
			DSTGSJ08:'',
			SHTIMIXL08:null,
			ZRZJGS08:null,
			ZJZL08:null,
			XZCD09:null,
			ZYSTIMIXL09:null,
			ZJNXS09:null,
			SFFCBB09:null,
			SFCTO09:null,
			GHBB09:null,
			ZFBB09:null,
			GMZYPCI09:null,
			SZCL09:'',
			DSTGSJ09:'',
			SHTIMIXL09:null,
			ZRZJGS09:null,
			ZJZL09:null,
			XZCD10:null,
			ZYSTIMIXL10:null,
			ZJNXS10:null,
			SFFCBB10:null,
			SFCTO10:null,
			GHBB10:null,
			ZFBB10:null,
			GMZYPCI10:null,
			SZCL10:'',
			DSTGSJ10:'',
			SHTIMIXL10:null,
			ZRZJGS10:null,
			ZJZL10:null,
			XZCD11:null,
			ZYSTIMIXL11:null,
			ZJNXS11:null,
			SFFCBB11:null,
			SFCTO11:null,
			GHBB11:null,
			ZFBB11:null,
			GMZYPCI11:null,
			SZCL11:'',
			DSTGSJ11:'',
			SHTIMIXL11:null,
			ZRZJGS11:null,
			ZJZL11:null,
			XZCD12:null,
			ZYSTIMIXL12:null,
			ZJNXS12:null,
			SFFCBB12:null,
			SFCTO12:null,
			GHBB12:null,
			ZFBB12:null,
			GMZYPCI12:null,
			SZCL12:'',
			DSTGSJ12:'',
			SHTIMIXL12:null,
			ZRZJGS12:null,
			ZJZL12:null,
			XZCD13:null,
			ZYSTIMIXL13:null,
			ZJNXS13:null,
			SFFCBB13:null,
			SFCTO13:null,
			GHBB13:null,
			ZFBB13:null,
			GMZYPCI13:null,
			SZCL13:'',
			DSTGSJ13:'',
			SHTIMIXL13:null,
			ZRZJGS13:null,
			ZJZL13:null,
			XZCD14:null,
			ZYSTIMIXL14:null,
			ZJNXS14:null,
			SFFCBB14:null,
			SFCTO14:null,
			GHBB14:null,
			ZFBB14:null,
			GMZYPCI14:null,
			SZCL14:'',
			DSTGSJ14:'',
			SHTIMIXL14:null,
			ZRZJGS14:null,
			ZJZL14:null,
			XZCD15:null,
			ZYSTIMIXL15:null,
			ZJNXS15:null,
			SFFCBB15:null,
			SFCTO15:null,
			GHBB15:null,
			ZFBB15:null,
			GMZYPCI15:null,
			SZCL15:'',
			DSTGSJ15:'',
			SHTIMIXL15:null,
			ZRZJGS15:null,
			ZJZL15:null,
        },
		timeList:[],//时间轴信息
		list:[],//心电图和肌钙蛋白的List
		cstSexCodArr: [],//性别列表
		cardTypeArr:[],//证件类别表
        ZHIYArr: [],//职业列表
        WHCDArr: [],//文化程度列表
        maritalStatusArr: [],//婚姻状态列表
        BQPGArr: [],//病情评估列表
        BQPGMXArr: [],//病情评估明细列表
		XXGJBWXYSArr:[],//患者转归危险因素
        BQPGMXSel: [],//病情评估多选
		XXGJBWXYSSel:[],//患者转归危险因素多选表
		HEBZArr:[],//合并疾病
		HEBZSel:[],//合并症多选表
        DYFSArr: [],//到院方式列表
        CCDWArr: [],//出车单位列表
        ZYLXArr: [],//转院类型列表
        CBZDArr: [],//初步诊断列表
		YWYYArr:[],//是否延误列表
		FACSXYXXTLXArr:[],//非ACS心源性胸痛
		QTFXYXXTLXArr:[],//其它非心源性胸痛
		ZYQJBFZArr:[],//住院期间并发症
		LYXJArr:[],//离院宣教
		LYXJSel:[],//离院宣教选中项
		JGDB72DWArr:[],
		CSFSArr:[],//传输方式
		
		RADIOArr: [{info: '否', infocode: '0'}, {info: '是', infocode: '1'}],// 是否单选表
        ZYLXArr: [{info: '网络医院', infocode: '0'}, {info: '其他医疗机构', infocode: '1'}],//转院类型列表
        YQRSSCArr: [{info: '合适', infocode: '0'}, {info: '不合适', infocode: '1'}, {info: '未筛查', infocode: '2'}],//溶栓筛查列表
        YQRSZLArr: [{info: '有', infocode: '0'}, {info: '无', infocode: '1'}],//溶栓治疗列表
        YQRSCSArr: [{info: '其他医院', infocode: '0'}, {info: '救护车', infocode: '1'}],//溶栓场所列表
        YQSSDDArr: [{info: '本院', infocode: '0'}, {info: '外院', infocode: '1'}],//手术地点列表
        XINDTArr: [{info: '无', infocode: '0'}, {info: '有', infocode: '1'}],//心电图列表
        YCXDTCSArr: [{info: '接收120/网络医院心电图', infocode: '0'}, {info: '未传输', infocode: '1'}],//远程心电图传输列表
        HZLXArr: [{info: '现场会诊', infocode: '0'}, {info: '远程会诊', infocode: '1'}],//会诊类型列表
        KILLIPArr: [{info: 'I级(no CHF)', infocode: '1'}, {info: 'II级(rales and/or JVD)', infocode: '2'},
            {info: 'III级(pulmonary edema)', infocode: '3'}, {info: 'IV级(cardiogenic shock)\n', infocode: '4'}],//心功能分级列表
        ASPLJLArr: [{info: '0mg', infocode: '1'}, {info: '100mg', infocode: '2'},
            {info: '300mg', infocode: '3'}, {info: '其他剂量', infocode: '4'}],//阿司匹林剂量列表
        LBGLJLArr: [{info: '0mg', infocode: '1'}, {info: '300mg', infocode: '2'},
            {info: '600mg', infocode: '3'}, {info: '其他剂量', infocode: '4'}],//氯吡格雷剂量列表
        TGRLJLArr: [{info: '0mg', infocode: '1'}, {info: '90mg', infocode: '2'},
            {info: '180mg', infocode: '3'}, {info: '其他剂量', infocode: '4'}],//氯吡格雷剂量列表
        WXYSArr: [{info: '发病后曾出现心脏骤停', infocode: '1'}, {info: '心电图ST段改变 ', infocode: '2'},
            {info: '心肌坏死标志物升高', infocode: '3'}],//危险因素列表
        WXYSSel: [],//危险因素选中项
        GRACEJGWTJArr: [{info: '急性心力衰竭伴难治性心绞痛和ST段改变', infocode: '1'}, {info: '危及生命的心律失常或心脏骤停', infocode: '2'},
            {info: '心源性休克或血流动力学不稳定', infocode: '3'}, {info: '心肌梗死机械性并发症', infocode: '4'},
            {info: '再发ST-T动态演变，尤其是伴有间歇性ST段抬高', infocode: '5'}],//Grace极高危条件列表
        GRACEJGWTJSel: [],//Grace极高危条件选中项
        GRACEWXFCArr: [{info: '极高危', infocode: '1'}, {info: '高危', infocode: '2'},
            {info: '中危', infocode: '3'}, {info: '低危', infocode: '4'}],//Grace危险分层列表
        ZCWXFCArr: [{info: '未做', infocode: '1'}, {info: '转为STEMI', infocode: '2'}, {info: '极高危', infocode: '3'},
            {info: '高危', infocode: '4'}, {info: '中危', infocode: '5'}, {info: '低危', infocode: '6'}],//再次危险分层列表
        ZGZCSArr: [{info: '否', infocode: '0'}, {info: '是', infocode: '1'}],//再灌注措施列表
        YNRSSCArr: [{info: '合适', infocode: '1'}, {info: '不合适', infocode: '2'}, {info: '未筛查', infocode: '3'}],//院内溶栓筛查列表
        CLCLArr: [{info: '保守治疗(仅药物治疗)', infocode: '0'}, {info: '侵入性策略', infocode: '1'}],//处理策略列表
        QRXCLArr: [{info: '紧急介入治疗', infocode: '1'}, {info: '24H内介入治疗', infocode: '2'},
            {info: '72H内介入治疗', infocode: '3'}, {info: '择期介入治疗', infocode: '4'}, {info: 'CABG', infocode: '5'}],//侵入性策略列表
        // CUOSArr: [{info: '直接PCI', infocode: '1'}, {info: '溶栓', infocode: '2'}, {info: '择期介入', infocode: '3'},
        //     {info: 'CABG', infocode: '4'}, {info: '转运PCI', infocode: '5'}],//措施列表
        WZGZCSYYArr: [{info: '生命体征平稳，无持续缺血表现', infocode: '1'}, {info: '超过再灌注时间窗', infocode: '2'},
            {info: '高出血风险', infocode: '3'}],//无再灌注措施原因列表
        WZGZCSYYSel: [],//无再灌注措施原因选中项

        ZLCLArr: [{info: '紧急介入治疗', infocode: '1'}, {info: '择期介入治疗', infocode: '2'},
            {info: '保守治疗', infocode: '3'}, {info: '外科手术', infocode: '4'},
            {info: '其它（介入失败转为手术）', infocode: '5'}],//治疗策略列表
        SFYWArr: [{info: '否', infocode: '0'}, {info: '是', infocode: '1'}],//是否延误列表
        RULUArr: [{info: '桡动脉(右侧)', infocode: '1'}, {info: '桡动脉(左侧)', infocode: '2'},
            {info: '股动脉', infocode: '3'}, {info: ' 其他', infocode: '4'}],//入路列表
			
			COVID19Arr:[{info:'经筛查后排除',infocode:'1'},{info:'经筛查后确诊',infocode:'2'},{info:'未经筛查',infocode:'3'}],//COVID-19表
			XYZTArr:[{info:'已戒烟',infocode:'1'},{info:'当前仍吸烟',infocode:'2'}],//吸烟状态表
			XFCDFXArr:[{info:'阵发性',infocode:'1'},{info:'持续性',infocode:'2'},{info:'长程持续性',infocode:'3'},{info:'永久性',infocode:'4'}],//心房颤动分型表
			ZGNYHAArr:[{info:'Ⅰ',infocode:'1'},{info:'Ⅱ',infocode:'2'},{info:'Ⅲ',infocode:'3'},{info:'Ⅳ',infocode:'4'}],//NYHA分级表
			NXGJBMSArr:[{info:'缺血性',infocode:'1'},{info:'出血性',infocode:'2'}],//脑血管疾病描述表
			JGDB72LXArr:[{info:'TNT',infocode:'1'},{info:'TNI',infocode:'2'}],//72h内肌钙蛋白最高值表
			SCJGDBArr:[{info:'TnT',infocode:'1'},{info:'Tnl',infocode:'2'}],//首次肌钙蛋白表
			JGDB02Arr:[{info:'TnT',infocode:'1'},{info:'Tnl',infocode:'2'}],//首次肌钙蛋白表
			JGDB03Arr:[{info:'TnT',infocode:'1'},{info:'Tnl',infocode:'2'}],//首次肌钙蛋白表
			NNTLXArr:[{info:'BNP',infocode:'1'},{info:'NT-proBNP',infocode:'2'}],//脑钠肽类型表
			SWYYArr:[{info:'心源性',infocode:'1'},{info:'非心源性',infocode:'2'}],//死亡原因表
			YCXDTCS02Arr:[{info:'传输心电图至协作单位(转出患者时)',infocode:'1'},{info:'无',infocode:'2'}],//远程心电图传输表
			
        QNYXArr: [{info:'IVUS',infocode:'1'},{info:'OCT',infocode:'2'},{info:'其他',infocode:'3'},{info:'未做',infocode:'4'}],//腔内影像列表
        GNJCArr: [{info:'FFR',infocode:'1'},{info:'iFR',infocode:'2'},{info:'IMR',infocode:'3'},{info:'其他',infocode:'4'},{info:'未做',infocode:'5'}],//功能检测列表
        SZBFZArr: [{info:'无',infocode:'00'},{info:'恶性心律失常',infocode:'01'},{info:'低血压',infocode:'02'},{info:'慢血流/无复流',infocode:'03'},{info:'血管夹层',infocode:'04'},{info:'非干预血管急性闭塞',infocode:'05'},{info:'血管穿孔',infocode:'06'},{info:'死亡',infocode:'07'},{info:'心源性休克',infocode:'08'},{info:'严重缓慢型心律失常',infocode:'09'},{info:'血栓栓塞',infocode:'10'},{info:'其它',infocode:'99'}],//术中并发症列表
		GMZYArr:[{info:'右冠近段',infocode:'1'},{info:'右冠中段',infocode:'2'},{info:'右冠远段',infocode:'3'},{info:'后降支(右优势型)',infocode:'4'},{info:'左主干',infocode:'5'},{info:'前降支近段',infocode:'6'},{info:'前降支中段',infocode:'7'},{info:'前降支远段',infocode:'8'},{info:'第一对角支',infocode:'9'},{info:'第二对角支',infocode:'10'},{info:'旋支近段',infocode:'11'},{info:'第一钝缘支',infocode:'12'},{info:'旋支远段',infocode:'13'},{info:'左室后支',infocode:'14'},{info:'后降支(左优势型或均衡型)',infocode:'15'},{info:'中间支',infocode:'16'},{info:'第三对角支',infocode:'17'},{info:'第二钝缘支',infocode:'18'},{info:'第三钝缘支',infocode:'19'},{info:'锐缘支',infocode:'20'},{info:'左圆椎支',infocode:'21'},{info:'右圆椎支',infocode:'22'},{info:'室间隔支',infocode:'23'},{info:'左后外侧支',infocode:'24'},{info:'右后外侧支',infocode:'25'},{info:'房室沟动脉',infocode:'26'},{info:'后降支室间支',infocode:'27'}],
		
		YWYYSel:[],//是否延误选中项
		GMZYSel:[],//冠脉造影选中项
        SZBFZSel: [],//术中并发症选中项
        FACSXYXXTLXSel:[],//非ACS心源性胸痛类型选中项
        QTFXYXXTLXSel:[],//其它非心源性胸痛类型选中项
		ZGFACSXYXXTLXSel:[],
		ZGQTFXYXXTLXSel:[],
		LYXJSel:[],//离院宣教类型选中项
		ZYQJBFZSel:[],//住院期间并发症类型选中项
		SZCL01Sel:[],//术中处理选中项
		SZCL02Sel:[],//术中处理选中项
		SZCL03Sel:[],//术中处理选中项
		SZCL04Sel:[],//术中处理选中项
		SZCL05Sel:[],//术中处理选中项
		SZCL06Sel:[],//术中处理选中项
		SZCL07Sel:[],//术中处理选中项
		SZCL08Sel:[],//术中处理选中项
		SZCL09Sel:[],//术中处理选中项
		SZCL10Sel:[],//术中处理选中项
		SZCL11Sel:[],//术中处理选中项
		SZCL12Sel:[],//术中处理选中项
		SZCL13Sel:[],//术中处理选中项
		SZCL14Sel:[],//术中处理选中项
		SZCL15Sel:[],//术中处理选中项
        YXXJCSel: [],//影像学检查多选选中
        YXXJCArr: [{info: '急诊CT', infocode: '1'}, {info: '彩超', infocode: '2'}, {info: 'MRI',infocode: '3'}, {info: '未做', infocode: '4'}],
        CYZDArr: ['STEMI', 'NSTEMI', 'UA', '主动脉夹层', '肺动脉栓塞', '非ACS心源性胸痛', '其它非心源性胸痛'],
        HZZGArr: ['出院', '转送其它医院', '转送其它科室', '死亡'],
		ZLJGArr: ['治愈','好转','自动离院','其它原因离院'],
		XZCDArr:[{info:'<50%',infocode:'1'},{info:'50~69%',infocode:'2'},{info:'70~89%',infocode:'3'},{info:'90~99%',infocode:'4'},{info:'100%',infocode:'5'}],//狭窄程度
		ZYSTIMIXLArr:[{info:'0级',infocode:'1'},{info:'1级',infocode:'2'},{info:'2级',infocode:'3'},{info:'3级',infocode:'4'}],//造影时TIMI血流
		SZCLArr:[{info:'无',infocode:'0'},{info:'植入支架',infocode:'1'},{info:'PTCA',infocode:'2'},{info:'血栓抽吸',infocode:'3'},{info:'冠脉内溶栓',infocode:'4'},{info:'仅使用导丝',infocode:'5'},{info:'其他',infocode:'6'}],//术中处理
		SHTIMIXLArr:[{info:'0级',infocode:'1'},{info:'1级',infocode:'2'},{info:'2级',infocode:'3'},{info:'3级',infocode:'4'}],//术后TIMI血流
		ZRZJGSArr:[{info:'0枚',infocode:'0'},{info:'1枚',infocode:'1'},{info:'2枚',infocode:'2'},{info:'>=3枚',infocode:'3'}],//植入支架个数
		ZJZLArr:[{info:'BMS',infocode:'1'},{info:'DES',infocode:'2'},{info:'可降解支架',infocode:'3'},{info:'其他',infocode:'4'}],//支架种类

        onTabClick(busStep,index) {
			vm.activeTab = index;
			getXtInfoByBusStep(busStep);
        },
		//渲染多选选项
        isChecked(prop, code) {
			var flag = false;
			for(var i=0; i<vm[prop + 'Sel'].length; i++){
				var el = vm[prop + 'Sel'][i];
				if(el == code){
					flag = true;
					break;
				}
			}
			return flag;
        },
        onToggleClick(prop) {
            vm.info[prop] = !vm.info[prop]
        },
		//监听多选点击事件
        onCheckClick(prop, code) {
            var list = vm[prop + 'Sel'];
            if (list.indexOf(code) > -1) {
                list.splice(list.indexOf(code), 1)
            } else {
				list.push(code)
			}
            vm[prop + 'Sel'] = list;
            vm.info[prop] = list.join(',');
        },
		// 点击无 选中状态全部为未选中状态
		onSelectClick(prop,code){
			var list=vm[prop+'Sel'];
			if (list.indexOf(code) > -1) {
			    list.splice(list.indexOf(code), 1)
			} else if(code=='00'||code=='0'){
				list=[];
				if(code=='00'){
					list.push('00');
				}else{
					list.push('0');
				}
			} else {
				if(list[0]=='00'){
					list.splice(list.indexOf('00'), 1)
				}else if(list[0]=='0'){
					list.splice(list.indexOf('0'), 1)
				}
			    list.push(code)
			}
			vm[prop + 'Sel'] = list;
			vm.info[prop] = list.join(',');
		},
		//影像学检查点击未做
		onDoneClick(prop,code){
			var list=vm[prop+'Sel'];
			if (list.indexOf(code) > -1) {
			    list.splice(list.indexOf(code), 1)
			} else if(code=='4'){
				list=[];
				list.push('4');
			} else {
				if(list[0]=='4'){
					list.splice(list.indexOf('4'), 1)
				}
			    list.push(code)
			}
			vm[prop + 'Sel'] = list;
			vm.info[prop] = list.join(',');
		},
        onRadioClick(prop, val) {
            vm.info[prop] = val;
        },
		addItem(flag){
			if(vm.list.length < 2){
				vm.list.push(flag);
			}
		},
		addItem2(flag){
			if(vm.list.length < 1){
				vm.list.push(flag);
			}
		},
		hasChild(item){
			return vm.list.indexOf(item) > -1
		},
		deleteItem(childName){
			if(confirm('确定删除，不可恢复')){
				for(let i in vm.list){
					if(vm.list[i] === childName) {
					   vm.list.splice(i, 1)
					}
				}
			}else{
				return
			}
		},
		// selectchange(a) {
        //     console.log(a);
        // }
    });
	function commit() {
        console.log("@@@@@@@@@", vm.info);
        var list = [];
        for (var prop in vm.info) {
            if (vm.info.hasOwnProperty(prop)) {
                list.push({
                    proCode: prop,
                    proVal: vm.info[prop]
                });
            }
        }
        $.ajax({
           url: '${baseurl}cpc/xtPatietSubmit.do',
           type: 'post',
           dataType: 'json',
           contentType: 'application/json;charset=UTF-8',
           data: JSON.stringify({
               emgSeq: _emgSeq,
               xtzlInfs: list
           }),
           success(res) {
        	   message_alert(res);
           }
        });
    }

    function getDicts() {
        var maps = [
            {prop: 'cstSexCodArr', key: 'CST_SEX_COD'},
			{prop: 'cardTypeArr', key: 'CARD_TYPE_COD'},
            {prop: 'ZHIYArr', key: 'ZY'},
            {prop: 'WHCDArr', key: 'WHCD_COD'},
            {prop: 'maritalStatusArr', key: 'MARITAL_STATUS'},
            {prop: 'BQPGArr', key: 'XT_BQPG_CODE'},
            {prop: 'BQPGMXArr', key: 'XT_BQPGMX_COD'},
            {prop: 'DYFSArr', key: 'XT_DDFS_COD'},
            {prop: 'CCDWArr', key: 'XT_CCDW_COD'},
            {prop: 'ZYLXArr', key: 'XT_ZY_CODE'},
            {prop: 'CBZDArr', key: 'XT_CBZD_COD'},
			{prop: 'YWYYArr', key: 'XT_YWYY_COD'},
			{prop: 'FACSXYXXTLXArr', key: 'XT_FACSXYXXTLX_COD'},
			{prop: 'QTFXYXXTLXArr', key: 'XT_QTFXYXXTLX_COD'},
			{prop: 'XXGJBWXYSArr', key:'XT_XXGJBWXYS_COD'},
			{prop: 'HEBZArr', key:'XT_HEBZ_COD'},
			{prop: 'ZYQJBFZArr',key:'XT_ZYQJBFZ_COD'},
			{prop: 'LYXJArr', key:'XT_LYXJ_COD'},
			{prop: 'JGDB72DWArr',key:'XT_JGDB72DW_COD'},
			{prop: 'CSFSArr',key:'XT_CSFS_COD'}
        ];
        maps.forEach(function (el) {
            vm[el.prop] = publicFun.getDict(el.key)||[];
        })
    }

    //获取时间轴数据
    function getTimeLineData(){
        $.ajax({
            url:'${baseurl}cpc/xtTimeLine.do',
            type:'post',
            dataType:'json',
            contentType: 'application/json;charset=UTF-8',
            data: JSON.stringify({
                emgSeq:_emgSeq,
            }),
            success(res) {
				console.log('11111',res)
				vm.timeList = res.resultInfo.sysdata.list
            }
        })
    }
	// 点击tab页请求接口
	function getXtInfoByBusStep(busStep){
	    	$.ajax({
	            url: '${baseurl}cpc/getXtPatient.do',
	            type: 'post',
	            dataType: 'json',
	            contentType: 'application/json;charset=UTF-8',
	            data: JSON.stringify({
	                emgSeq: _emgSeq,
	                xtzlInfs: [{busStep: busStep}]
	            }),
	            success(res) {
	                var _list = res.resultInfo.sysdata.list;
	                var resObj = {};
	                if(_list && _list.length){
	                    for (var i = 0; i < _list.length; i++) {
	                        var el = _list[i];
							if(_list[i].proType == 'checkbox'){
								vm[el.proCode + 'Sel'] = el.proVal ? el.proVal.split(',') : [];
							}
	                        resObj[el.proCode] = el.proVal ;
	                    }
	                }
	                vm.info = Object.assign(vm.info,resObj);
	                console.log(vm.info)
	            }
	        });
	    }
	// 基础信息接口
	function getXtbaseInfo(busStep){
		$.ajax({
		    url: '${baseurl}cpc/getXtPatientDetail.do',
		    type: 'post',
		    dataType: 'json',
		    contentType: 'application/json;charset=UTF-8',
		    data: JSON.stringify({
		        emgSeq: _emgSeq
		    }),
		    success(res) {
                vm.baseInfo=res.resultInfo.sysdata.hspEmgInf
			}
		});
	}
	// 检验检查
	function getXtInspection(){
		$.ajax({
		    url: '${baseurl}cpc/getJyjcInfo.do',
		    type: 'post',
		    dataType: 'json',
		    contentType: 'application/json;charset=UTF-8',
		    data: JSON.stringify({
		        emgSeq: _emgSeq,
		    }),
		    success(res) {
				
			}
		});
	}
	// 心电图
	function getXtEcg(){
		$.ajax({
		    url: '${baseurl}cpc/getECGInfo.do',
		    type: 'post',
		    dataType: 'json',
		    contentType: 'application/json;charset=UTF-8',
		    data: JSON.stringify({
		        emgSeq: _emgSeq
		    }),
		    success(res) {
				
			}
		});
	}
	// grace评分
	function getHspGrace(){
		$.ajax({
		    url: '${baseurl}cpc/getHspGraceInf.do',
		    type: 'post',
		    dataType: 'json',
		    contentType: 'application/json;charset=UTF-8',
		    data: JSON.stringify({
		        emgSeq: _emgSeq,
				graceType:0
		    }),
		    success(res) {
				
			}
		});
	}
	
   $(function () {
       getDicts();
       getTimeLineData();
	   getXtbaseInfo();
	   getXtInspection();
	   getXtEcg();
	   getHspGrace();
       $.ajax({
           url: '${baseurl}cpc/getXtPatient.do',
           type: 'post',
           dataType: 'json',
           contentType: 'application/json;charset=UTF-8',
           data: JSON.stringify({
               emgSeq: _emgSeq,
               xtzlInfs: [{busStep: 'baseinfo'}, {busStep: 'firstaidinfo'}]
           }),
           success(res) {
               var _list = res.resultInfo.sysdata.list;
               var resObj = {};
               if(_list && _list.length){
                   for (var i = 0; i < _list.length; i++) {
					   var el = _list[i];
					   if(_list[i].proType == 'checkbox'){
					   	   vm[el.proCode + 'Sel'] = el.proVal ? el.proVal.split(',') : [];
					   }
					   resObj[el.proCode] = el.proVal;
                   }
               }
               vm.info = Object.assign(vm.info,resObj);
               console.log(vm.info)
			   console.log(resObj)
           }
       });
   })
   
	
</script>
</html>