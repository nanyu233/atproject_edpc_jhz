<%@ page language="java" import="java.util.*" pageEncoding="UTF-8" %>
    <%@ include file="/WEB-INF/jsp/base/tag.jsp" %>
        <% String path=request.getContextPath(); String basePath=request.getScheme() + "://" + request.getServerName()
            + ":" + request.getServerPort() + path + "/" ; %>

            <!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
            <html>

            <head>
                <base href="<%=basePath%>">
                <title>卒中患者详情</title>
                <link rel="stylesheet" type="text/css" href="${baseUrl}css/edpc/czxq.css">
<%--                 <link rel="stylesheet" type="text/css" href="${baseUrl}css/edpc/xtxq.css"> --%>
                <link rel="stylesheet" type="text/css" href="css/edpc/iconfont.css">
                <link rel="stylesheet" type="text/css" href="lib/easyui1.3/themes/default/easyui.css">
                <script type="text/javascript" src="lib/moment.min.js"></script>
                <script type="text/javascript" src="lib/easyui1.3/jquery-1.8.0.min.js"></script>
                <script type="text/javascript" src="lib/easyui1.3/jquery.easyui.min.js"></script>
                <script type="text/javascript" src="lib/avalon1.4.8/avalon.js"></script>
                <script type="text/javascript" src="js/public.js"></script>
                <%@ include file="/WEB-INF/jsp/base/common_js.jsp" %>
            </head>
            <style>

            </style>

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
                                <div class="timeline_diff_warning">{{item.diffred}}</div>
                                <!-- 红色 -->
                                <div class="timeline_diff">{{item.diffblue}}</div>
                                <!-- 蓝色 -->
                            </div>
                        </div>
                    </div>
                </div>
                <div class="main fl">
                    <div ms-click="zzc" class="zzc"></div>
                    <div ms-click="zzc01" class="zzc01"></div>
                    <div ms-click="zzc02" class="zzc02"></div>
                    <div ms-click="zzc03" class="zzc03"></div>
                    <!-- 基本信息 -->
                    <div class="basic-info">
                        <div class="title">基本信息</div>
                        <div class="content">
                            <ul class="list">
                                <li class="item">
                                    <div class="item_name">姓名:</div>
                                    <div class="input">
                                        <input class="item_input" type="text" ms-duplex-string=" baseInfo.cstNam"
                                            disabled="disabled">
                                    </div>
                                </li>
                                <li class="item">
                                    <div class="item_name">性别:</div>
                                    <div class="input">
                                        <input class="item_input" type="text" ms-duplex-string=" baseInfo.cstSexCod"
                                            disabled="disabled">
                                    </div>
                                </li>
                                <li class="item">
                                    <div class="item_name">年龄:</div>
                                    <div class="input">
                                        <input class="item_input" placeholder="岁" type="text"
                                            ms-duplex-string=" baseInfo.cstAge" disabled="disabled">
                                        <div class="unit">岁</div>
                                    </div>
                                </li>
                                <li class="item">
                                    <div class="item_name">出生日期:</div>
                                    <div class="input">
                                        <input class="item_input" type="text" ms-duplex-string=" baseInfo.bthDat"
                                            disabled="disabled">
                                    </div>
                                </li>
                                <li class="item">
                                    <div class="item_name">民族:</div>
                                    <div class="input">
                                        <select name="" ms-duplex="baseInfo.nation" autocomplete="off">
                                            <option value="" ms-attr-selected="!baseInfo.cardType">请选择</option>
                                            <option ms-repeat="nationArr" ms-attr-value="el.infocode">{{el.info}}
                                            </option>
                                        </select>
                                    </div>
                                </li>
                            </ul>
                        </div>

                    </div>
                    <div class="dat-info">
                        <div class="block">
                            <div class="title1">诊疗信息</div>
                            <!-- 患者Id -->
                            <div class="inputs">
                                <div class="input-group">
                                    <div class="lb">患者ID</div>
                                    <div class="input"><input disabled="disabled" ms-duplex-string=" baseInfo.mpi"
                                            type="text" /></div>
                                </div>
                            </div>
                            <!-- 发病时间 -->
                            <div class="inputs">
                                <div class="input-group">
                                    <div class="lb">发病时间:</div>
                                    <div class="input">
									 <div class="input">
                                            <input class="Wdate" type="text" class="input-date Wdate" 
                                            onclick="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm'})" ms-duplex-string="aidPatient.illTim" />
                                        </div>
                                </div>
                                <!-- 最后正常时间 -->
                                <div class="input-group">
                                    <div class="lb">最后正常时间:</div>
                                    <div class="input"><input class="Wdate" type="text"
                                            onclick="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm'})"
                                            ms-duplex-string="info.ZHZCSJ" /></div>
                                </div>
                            </div>
                            <!-- 发病地址 -->
                            <div class="inputs">
                                <div class="input-group">
                                    <div class="lb">发病地址:</div>
                                    <div class="input">
                                        <select name="" class="area" ms-duplex="aidPatient.scePrvCod">
                                            <!-- onchange="ReSelected()" -->
                                            <option value="">请选择</option>
                                            <option ms-repeat="provinceList" ms-attr-value="el.addrCode">{{el.addrName}}
                                            </option>
                                        </select>
                                        <select name="" class="area" ms-duplex="aidPatient.sceCtyCod">
                                            <option value="">请选择</option>
                                            <option ms-repeat="cityList" ms-attr-value="el.addrCode">{{el.addrName}}
                                            </option>
                                        </select>
                                        <select name="" class="area" ms-duplex="aidPatient.sceAr0Cod">
                                            <option value="">请选择</option>
                                            <option ms-repeat="cntyList" ms-attr-value="el.addrCode">{{el.addrName}}
                                            </option>
                                        </select>
                                    </div>
                                </div>
                            </div>
                            <!-- 大空白 -->
                            <div class="inputs">
                                <div class="input-group">
                                    <div class="lb">预检时间:</div>
                                    <div class="input"><input class="Wdate" type="text"
                                            onclick="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm'})"
                                            ms-duplex-string="baseInfo.emgDat" /></div>
                                </div>
                                <div class="input-group">
                                    <div class="lb">意识:</div>
                                    <div class="input">
                                        <select name="" ms-duplex="baseInfo.senStuCod">
                                            <option value="">请选择</option>
                                            <option ms-repeat="senRctCodArr" ms-attr-value="el.infocode">{{el.info}}
                                            </option>
                                        </select>
                                    </div>
                                </div>
                            </div>
                            <div class="inputs">
                                <div class="input-group">
                                    <div class="lb">呼吸:</div>
                                    <div class="input">
                                        <input type="text" ms-duplex-string="baseInfo.breNbr" ms-keyup="limitInput(this,40)"/>
                                        <div class="unit1">次/分</div>

                                    </div>
                                </div>
                                <div class="input-group">
                                    <div class="lb">心率:</div>
                                    <div class="input"><input type="text" ms-duplex-string="baseInfo.hrtRte" ms-keyup="limitInput(this,300)"/>
                                        <div class="unit1">次/分</div>

                                    </div>
                                </div>
                                <div class="input-group">
                                    <div class="lb">血氧:</div>
                                    <div class="input"><input type="text" ms-duplex-string="baseInfo.oxyNbr" ms-keyup="limitInput(this,300)"/>
                                        <div class="unit1">%</div>
                                    </div>
                                </div>
                            </div>
                            <div class="inputs">
                                <div class="input-group">
                                    <div class="lb">体温:</div>
                                    <div class="input"><input type="text" ms-duplex="baseInfo.tmpNbr" ms-keyup="NumberInput(this)" maxlength="5"/>
                                        <div class="unit1">℃</div>

                                    </div>
                                </div>
                                <div class="input-group">
                                    <div class="lb">血压:</div>
                                    <div class="input"><input type="text" placeholder="--/--" ms-duplex="info.XUEYA"/>
                                        <div class="unit1">mmHg</div>
                                    </div>
                                </div>
                                <div class="input-group">
                                    <div class="lb">指尖血糖:</div>
                                    <div class="input"><input type="text" ms-duplex="baseInfo.glsNum" ms-keyup="NumberInput(this)" maxlength="5"/>
                                        <div class="unit1">mmol/L</div>
                                    </div>
                                </div>
                            </div>
                            <!-- 心电图 -->
                            <div class="inputs">
                                <div class="input-group">
                                    <div class="lb">心电图时间:</div>
                                    <div class="input"><input class="Wdate" ms-duplex="info.XDTSJ" 
                                    	onclick="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm'})">
                                        <a href="javascript:;" class="file">上传心电图
                                            <input type="file" name="" id="">
                                        </a>
                                    </div>
                                </div>
                            </div>
                            <!-- 主要症状 -->
                            <div class="inputs">
                                <div class="input-group">
                                    <div class="lb">主要症状:</div>
                                    <div style="margin-left: 130px">
                                        <div class="checkbox-group">
                                            <div ms-repeat="ZYZZArr" class="btn"
                                                ms-class="{{isChecked('ZYZZ',el.infocode) ? 'active':''}}"
                                                ms-click="onCheckClick('ZYZZ',el.infocode)">
                                                {{el.info}}
                                            </div>
                                            <input id="content" type="text" ms-duplex-string="info.ZYZZQT">
                                        </div>
                                    </div>
                                </div>
                            </div>
                            <!-- 拟诊断 -->
                            <div class="inputs">
                                <div class="input-group">
                                    <div class="lb">拟诊断时间:</div>
                                    <div class="input"><input class="Wdate" type="text"
                                            onclick="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm'})"
                                            ms-duplex-string="info.NZDSJ"></div>
                                </div>
                                <div class="input-group">
                                    <div class="lb">拟诊断医生:</div>
                                    <div class="input"><input type="text" ms-duplex-string="info.NZDYS"></div>
                                </div>
                            </div>
                            <!-- 通知会诊 -->
                            <div class="inputs">
                                <div class="input-group">
                                    <div class="lb">通知会诊时间:</div>
                                    <div class="input"><input class="Wdate" ms-duplex-string="info.TZHZSJ" 
                                    	onclick="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm'})"></div>
                                </div>
                                <div class="input-group">
                                    <div class="lb">会诊达到时间:</div>
                                    <div class="input"><input class="Wdate" ms-duplex="info.HZDDSJ" 
                                    	onclick="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm'})"></div>
                                </div>
                            </div>
                            <!-- 通知介入科 -->
                            <div class="inputs">
                                <div class="input-group1">
                                    <div class="lb">通知介入科:</div>
                                    <div class="tab-group">
                                        <div ms-repeat="TZJRKArr" class="tab"
                                            ms-class="{{info.ISTZJRK==el.infocode ? 'active':''}}"
                                            ms-click="onRadioClick('ISTZJRK',el.infocode)">
                                            {{el.info}}
                                        </div>
                                    </div>
                                </div>

                            </div>
                            <!-- 通知介入时间 -->
                            <div class="inputs" ms-if="info.ISTZJRK==0">
                                <div class="input-group">
                                    <div class="lb">通知介入时间:</div>
                                    <div class="input"><input class="Wdate" type="text"
                                            onclick="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm'})"
                                            ms-duplex-string="info.JRTZSJ"></div>
                                </div>
                                <div class="input-group">
                                    <div class="lb">介入到达时间:</div>
                                    <div class="input"><input class="Wdate" type="text"
                                            onclick="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm'})"
                                            ms-duplex-string="info.JRDDSJ" /></div>
                                </div>
                            </div>
                            <!-- 通知外勤时间 -->
                            <div class="inputs">
                                <div class="input-group">
                                    <div class="lb">通知外勤时间:</div>
                                    <div class="input"><input class="Wdate" type="text"
                                            onclick="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm'})"
                                            ms-duplex-string="info.TZWQSJ" /></div>
                                </div>
                                <div class="input-group">
                                    <div class="lb">外勤到达时间:</div>
                                    <div class="input"><input class="Wdate" type="text"
                                            onclick="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm'})"
                                            ms-duplex-string="info.WQDDSJ" /></div>
                                </div>
                            </div>
                            <!-- 检查开始时间 -->
                            <div class="inputs">
                                <div class="input-group">
                                    <div class="lb">检查开始时间:</div>
                                    <div class="input"><input class="Wdate" type="text"
                                            onclick="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm'})"
                                            ms-duplex-string="info.JCKSSJ" /></div>
                                </div>
                                <div class="input-group">
                                    <div class="lb">检查结束时间:</div>
                                    <div class="input"><input class="Wdate" type="text"
                                            onclick="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm'})"
                                            ms-duplex-string="info.JCJGSJ" /></div>
                                </div>
                            </div>
                            <!-- 检验抽血时间 -->
                            <div class="inputs">
                                <div class="input-group">
                                    <div class="lb">检查抽血时间:</div>
                                    <div class="input"><input class="Wdate" type="text"
                                            onclick="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm'})"
                                            ms-duplex-string="info.JYCXSJ" /></div>
                                </div>
                                <div class="input-group">
                                    <div class="lb">转归去向:</div>
                                    <div class="input"><input type="text" ms-duplex="baseInfo.ZGQX"></div>
                                </div>
                            </div>
                            <div class="input-group">
                                        <div class="input">
                                            <div class="btn" ms-class="{{info.jyxm==1 ? 'active' : ''}}" ms-click="onToggleClick('jyxm')" style="padding:0 20px;margin:0 10px 0 10px;box-shadow: 0 0 5px;">检验报告</div>
                                            <div class="btn" ms-class="{{info.jcxm==1 ? 'active' : ''}}" ms-click="onToggleClick('jcxm')" style="padding:0 20px;margin:0 10px 0 10px;box-shadow: 0 0 5px;">检查报告</div>
                                        </div>
                                    </div>
                                </div>
                                <div class="block1" style="overflow: hidden;" ms-if="info.jyxm==1">
                                    <div class="no-data" ms-if="!jylist.length">
                                        检验报告：暂无数据
                                    </div>
                                    <table class="listStyle" border="1" style="border-collapse: collapse" ms-if="jylist.length">
                                        <thead>
                                            <tr>
                                                <th>检验项目</th>
                                                <th>检验时间</th>
                                            </tr>
                                        </thead>
                                        <tr ms-repeat="jylist" ms-click="chooseItem(el)" ms-class="active:el.sampleno==currItem.sampleno">
                                            <td>{{el.examinaim}}</td>
                                            <td>{{el.resultDateTime}}</td>
                                        </tr>
                                    </table>
                                    <div class="data" ms-if="jylist.length">
                                        <table class="detail" border="1" style="border-collapse: collapse">
                                            <tr class="title">
                                                <td class="col_l">检验项目</td>
                                                <td>结果</td>
                                                <td></td>
                                                <td class="col_l">参考值</td>
                                                <td>单位</td>
                                            </tr>
                                            <tr ms-repeat="currItem.data">
                                                <td class="col_l">{{el.reportItemName}}</td>
                                                <td>{{el.result}}</td>
                                                <td>{{el.errorFlag}}</td>
                                                <td class="col_l">{{el.lowerLimit}}-{{el.upperLimit}}</td>
                                                <td>{{el.units}}</td>
                                            </tr>
                                        </table>
                                    </div>
                                </div>
                                <div class="block1" ms-if="info.jcxm==1">
                                    <div class="no-data" ms-if="!jclist.length">
                                        检查报告：暂无数据
                                    </div>
                                    <div class="jcbox" ms-if="jclist.length">
                                        <div class="wrapper" ms-repeat="jclist">
                                            <div class="item1" style="position: relative">
                                                <div class="titlebox">检查项目：</div>
                                                <div>{{el.ylmc}}</div>
                                                <div class="btnbox" ms-click="toggle(el)">
                                                    <span ms-if="!el.show">展开</span>
                                                    <span ms-if="el.show">收起</span>
                                                </div>
                                            </div>
                                            <div ms-if="el.show">
                                                <div class="item1">
                                                    <div class="titlebox">检查描述：</div>
                                                    <div>{{el.see}}</div>
                                                </div>
                                                <div class="item1">
                                                    <div class="titlebox">检查结论：</div>
                                                    <div>{{el.jcjg}}</div>
                                                </div>
                                                <div class="item1">
                                                    <div class="titlebox">报告时间：</div>
                                                    <div>{{el.shrq}}</div>
                                                </div>
                                                <div class="item1">
                                                    <div class="titlebox">报告医生：</div>
                                                    <div>{{el.jcysxm}}</div>
                                                </div>
                                                <div class="item1">
                                                    <div class="titlebox">审核医生：</div>
                                                    <div>{{el.examineDocName}}</div>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                    <!-- 溶栓----介入 -->
                    <div class="RS_JR">
                        <div class="block">
                            <div class="tab-group1">
                                <div class="tab1" ms-class="{{activetab==0 ? 'active1' : ''}}"
                                    ms-click="TabClick('oneinfo',0)">溶栓组</div>
                                <div class="tab1" ms-class="{{activetab==1 ? 'active1' : ''}}"
                                    ms-click="TabClick('twoinfo',1)">介入组</div>
                            </div>
                            <!-- 溶栓组 -->
                            <div class="tab-container emergency" ms-if="activetab==0">
                                <!-- 最后正常时间 -->
                                <div class="inputs">
                                    <div class="input-group topone">
                                        <div class="lb">最后正常时间:</div>
                                        <div class="input"><input class="Wdate" type="text"
                                                onclick="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm'})"
                                                ms-duplex-string="info.ZHZCSJ" /></div>
                                    </div>
                                </div>
                                <!-- NIHSS评分 -->
                                <div class="inputs">
                                    <div class="input-group">
                                        <div class="lb">NIHSS评分:</div>
                                        <div class="input"><input disabled="disabled" type="text"
                                                ms-duplex="info.NIHSSPF01" />
                                            <div class="unit1">分</div>
                                            <div class="dian">
                                                <span onclick="DJ('layer')" class="iconfont icon-detail"></span>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                                <!-- NIHSS弹出层 -->
                                <div class="layer">
                                    <header>
                                        <h3>NIHSS卒中量表</h3>
                                    </header>
                                   <div class="layer-content">
                                            <div class="options">
                                                <div class="options-title">1.(A)意识水平</div>
                                                <ul class="options-list">
                                                    <li class="options-item btn" ms-repeat="nihssYsspArr"
                                                        ms-class="{{cont.NIHSS01 ? (cont.NIHSS01==el.code ? 'active':''): ''}}"
                                                        ms-click="onRadioClick1('NIHSS01',el.code)">
                                                        {{el.info}}
                                                    </li>
                                                </ul>
                                            </div>
                                            <div class="options">
                                                <div class="options-title">1.(B)两项提问</div>
                                                <ul class="options-list">
                                                    <li class="options-item btn" ms-repeat="nihssLxwtArr"
                                                        ms-class="{{cont.NIHSS02 ? (cont.NIHSS02==el.code ? 'active':''): ''}}"
                                                        ms-click="onRadioClick1('NIHSS02',el.code)">
                                                        {{el.info}}
                                                    </li>
                                                </ul>
                                            </div>
                                            <div class="options">
                                                <div class="options-title">1.(C)两项指令</div>
                                                <ul class="options-list">
                                                    <li class="options-item btn" ms-repeat="nihssLxzlArr"
                                                        ms-class="{{cont.NIHSS03 ? (cont.NIHSS03==el.code ? 'active':''): ''}}"
                                                        ms-click="onRadioClick1('NIHSS03',el.code)">
                                                        {{el.info}}
                                                    </li>
                                                </ul>
                                            </div>
                                            <div class="options">
                                                <div class="options-title">2.凝视</div>
                                                <ul class="options-list">
                                                    <li class="options-item btn" ms-repeat="nihssNsArr"
                                                        ms-class="{{cont.NIHSS04 ? (cont.NIHSS04==el.code ? 'active':''): ''}}"
                                                        ms-click="onRadioClick1('NIHSS04',el.code)">
                                                        {{el.info}}
                                                    </li>
                                                </ul>
                                            </div>
                                            <div class="options">
                                                <div class="options-title">3.视野</div>
                                                <ul class="options-list">
                                                    <li class="options-item btn" ms-repeat="nihssSyeArr"
                                                        ms-class="{{cont.NIHSS06 ? (cont.NIHSS06==el.code ? 'active':''): ''}}"
                                                        ms-click="onRadioClick1('NIHSS06',el.code)">
                                                        {{el.info}}
                                                    </li>
                                                </ul>
                                            </div>
                                            <div class="options">
                                                <div class="options-title">4.面瘫</div>
                                                <ul class="options-list">
                                                    <li class="options-item btn" ms-repeat="nihssMtArr"
                                                        ms-class="{{cont.NIHSS07 ? (cont.NIHSS07==el.code ? 'active':''): ''}}"
                                                        ms-click="onRadioClick1('NIHSS07',el.code)">
                                                        {{el.info}}
                                                    </li>
                                                </ul>
                                            </div>
                                            <div class="options">
                                                <div class="options-title">5a.左上肢肌力</div>
                                                <ul class="options-list">
                                                    <li class="options-item btn" ms-repeat="nihssZszjlArr"
                                                        ms-class="{{cont.NIHSS08 ? (cont.NIHSS08==el.code ? 'active':''): ''}}"
                                                        ms-click="onRadioClick1('NIHSS08',el.code)">
                                                        {{el.info}}
                                                    </li>
                                                </ul>
                                            </div>
                                            <div class="options">
                                                <div class="options-title">5b.右上肢肌力</div>
                                                <ul class="options-list">
                                                    <li class="options-item btn" ms-repeat="nihssYszjlArr"
                                                        ms-class="{{cont.NIHSS09 ? (cont.NIHSS09==el.code ? 'active':''): ''}}"
                                                        ms-click="onRadioClick1('NIHSS09',el.code)">
                                                        {{el.info}}
                                                    </li>
                                                </ul>
                                            </div>
                                            <div class="options">
                                                <div class="options-title">6a.左下肢肌力</div>
                                                <ul class="options-list">
                                                    <li class="options-item btn" ms-repeat="nihssYxzjlArr"
                                                        ms-class="{{cont.NIHSS010 ? (cont.NIHSS010==el.code ? 'active':''): ''}}"
                                                        ms-click="onRadioClick1('NIHSS010',el.code)">
                                                        {{el.info}}
                                                    </li>
                                                </ul>
                                            </div>
                                            <div class="options">
                                                <div class="options-title">6b.右下肢肌力</div>
                                                <ul class="options-list">
                                                    <li class="options-item btn" ms-repeat="nihssZxzjlArr"
                                                        ms-class="{{cont.NIHSS011 ? (cont.NIHSS011==el.code ? 'active':''): ''}}"
                                                        ms-click="onRadioClick1('NIHSS011',el.code)">
                                                        {{el.info}}
                                                    </li>
                                                </ul>
                                            </div>
                                            <div class="options">
                                                <div class="options-title">7.肢体共济障碍</div>
                                                <ul class="options-list">
                                                    <li class="options-item btn" ms-repeat="nihssZtgjzaArr"
                                                        ms-class="{{cont.NIHSS012 ? (cont.NIHSS012==el.code ? 'active':''): ''}}"
                                                        ms-click="onRadioClick1('NIHSS012',el.code)">
                                                        {{el.info}}
                                                    </li>
                                                </ul>
                                            </div>
                                            <div class="options">
                                                <div class="options-title">8.感觉</div>
                                                <ul class="options-list">
                                                    <li class="options-item btn" ms-repeat="nihssGjArr"
                                                        ms-class="{{cont.NIHSS013? (cont.NIHSS013==el.code ? 'active':''): ''}}"
                                                        ms-click="onRadioClick1('NIHSS013',el.code)">
                                                        {{el.info}}
                                                    </li>
                                                </ul>
                                            </div>
                                            <div class="options">
                                                <div class="options-title">9.失语</div>
                                                <ul class="options-list">
                                                    <li class="options-item btn" ms-repeat="nihssSyArr"
                                                        ms-class="{{cont.NIHSS014 ? (cont.NIHSS014==el.code ? 'active':''): ''}}"
                                                        ms-click="onRadioClick1('NIHSS014',el.code)">
                                                        {{el.info}}
                                                    </li>
                                                </ul>
                                            </div>
                                            <div class="options">
                                                <div class="options-title">10.构音障碍</div>
                                                <ul class="options-list">
                                                    <li class="options-item btn" ms-repeat="nihssGyzaArr"
                                                        ms-class="{{cont.NIHSS015 ? (cont.NIHSS015==el.code ? 'active':''): ''}}"
                                                        ms-click="onRadioClick1('NIHSS015',el.code)">
                                                        {{el.info}}
                                                    </li>
                                                </ul>
                                            </div>
                                            <div class="options">
                                                <div class="options-title">11。忽视</div>
                                                <ul class="options-list">
                                                    <li class="options-item btn" ms-repeat="nihssHsArr"
                                                        ms-class="{{cont.NIHSS016 ? (cont.NIHSS016==el.code ? 'active':''): ''}}"
                                                        ms-click="onRadioClick1('NIHSS016',el.code)">
                                                        {{el.info}}
                                                    </li>
                                                </ul>
                                            </div>
              							</div>
                                    <div class="options-btn">
                                        <button onclick="down('layer')" class="no">取消</button>
                                        <button class="yes" ms-click="NIHSSClick">确定</button>
                                    </div>

                                </div>


                                <!-- MRS评分 -->
                                <div class="inputs">
                                    <div class="input-group">
                                        <div class="lb">MRS评分:</div>
                                        <div class="input"><input type="text" disabled="disabled" ms-duplex="info.MRSPF" />
                                            <div class="unit1">分</div>
                                            <div class="dian">
                                                <span onclick="DJ1('mrs-lay')" class="iconfont icon-detail"></span>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                                <div class="mrs-lay">
                                    <header>
                                        <h3>mRS评分</h3>
                                    </header>
                                    <ul class="mrs-list">
                                        <div class="mrs-item">
                                            <div class="classification">分级</div>
                                            <div class="describe">描述</div>
                                        </div>
                                        <li class="mrs-item" ms-repeat="MRSPFArr"
                                            ms-class="{{info.MRSPF==el.infocode ? 'active':''}}"
                                            ms-click="onRadioClick('MRSPF',el.infocode,el.code)">
                                            <div class="classification">{{el.code}}</div>
                                            <div class="describe">{{el.info}}</div>
                                        </li>

                                    </ul>
                                    <div class="options-btn">
                                        <button onclick="down1('mrs-lay')" class="no">取消</button>
                                        <button class="yes" ms-click="MRSClick(MRSPFArr)">确定</button>
                                    </div>

                                </div>
                                <!-- 是否出血 -->
                                <div class="inputs">
                                    <div class="input-group1">
                                        <div class="lb">是否出血:</div>
                                        <div class="tab-group">
                                            <div ms-repeat="SFCXArr" class="tab"
                                                ms-class="{{info.ISCX==el.infocode ? 'active':''}}"
                                                ms-click="onRadioClick('ISCX',el.infocode)">
                                                {{el.info}}
                                            </div>
                                        </div>
                                    </div>

                                </div>
                                <!-- 是否阻塞 -->
                                <div class="inputs">
                                    <div class="input-group1">
                                        <div class="lb">是否阻塞:</div>
                                        <div class="tab-group">
                                            <div ms-repeat="SFZSArr" class="tab"
                                                ms-class="{{info.ISZS==el.infocode ? 'active':''}}"
                                                ms-click="onRadioClick('ISZS',el.infocode)">
                                                {{el.info}}
                                            </div>
                                        </div>
                                    </div>
                                </div>
                                <!-- 诊断医生 -->
                                <div class="inputs">
                                    <div class="input-group">
                                        <div class="lb">诊断医生:</div>
                                        <div class="input"><input type="text" ms-duplex-string="info.ZDYS"/></div>
                                    </div>
                                    <div class="input-group">
                                        <div class="lb">诊断时间:</div>
                                        <div class="input"><input class="Wdate" type="text"
                                                onclick="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm'})"
                                                ms-duplex-string="info.ZDSJ" /></div>
                                    </div>
                                </div>
                                <!-- 主要症状 -->
                                <div class="inputs">
                                    <div class="input-group">
                                        <div class="lb">主要症状:</div>
                                        <div style="margin-left: 130px">
                                            <div class="checkbox-group">
                                                <div ms-repeat="RSZZYZZArr" class="btn"
                                                    ms-class="{{info.CBZD==el.infocode ? 'active':''}}"
                                                    ms-click="onRadioClick('CBZD',el.infocode)">
                                                    {{el.info}}
                                                </div>
                                                <input id="content" placeholder="其他诊断结果" type="text" ms-duplex-string="info.CBZDQT">
                                            </div>
                                        </div>
                                    </div>
                                </div>
                                <!-- 既往史 -->
                                <div class="inputs">
                                    <div class="input-group">
                                        <div class="lb">既往史:</div>
                                        <div style="margin-left: 130px">
                                            <div class="checkbox-group">
                                                <div ms-repeat="JIWSArr" class="btn"
                                                    ms-class="{{isChecked('JIWS',el.infocode) ? 'active':''}}"
                                                    ms-click="onCheckClick('JIWS',el.infocode)">
                                                    {{el.info}}
                                                </div>
                                                <input id="content" placeholder="描述其他病史" type="text" ms-duplex-string="info.JIWSQT">
                                            </div>
                                        </div>
                                    </div>
                                </div>
                                <!-- 过敏史 -->
                                <div class="inputs">
                                    <div class="input-group">
                                        <div class="lb">过敏史:</div>
                                        <div style="margin-left: 130px">
                                            <div class="checkbox-group">
                                                <div ms-repeat="GMSArr" class="btn"
                                                    ms-class="{{isChecked('GUOMS',el.infocode) ? 'active':''}}"
                                                    ms-click="onCheckClick('GUOMS',el.infocode)">
                                                    {{el.info}}
                                                </div>
                                                <input id="content" placeholder="描述其他过敏史" type="text" ms-duplex-string="info.GUOMSQT">
                                            </div>
                                        </div>
                                    </div>
                                </div>
                                <!-- 平时服用药 -->
                                <div class="inputs">
                                    <div class="input-group">
                                        <div class="lb">平时服用药:</div>
                                        <div style="margin-left: 130px">
                                            <div class="checkbox-group">
                                                <div ms-repeat="PSFYYArr" class="btn"
                                                    ms-class="{{isChecked('PSFYY',el.infocode) ? 'active':''}}"
                                                    ms-click="onCheckClick('PSFYY',el.infocode)">
                                                    {{el.info}}
                                                </div>
                                                <input id="content" placeholder="描述其他服用药" type="text" ms-duplex-string="info.PSFYYQT">
                                            </div>
                                        </div>
                                    </div>
                                </div>
                                <!-- 溶栓谈话时间 -->
                                <div class="inputs">
                                    <div class="input-group">
                                        <div class="lb">溶栓谈话时间:</div>
                                        <div class="input"><input class="Wdate" type="text"
                                                onclick="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm'})"
                                                ms-duplex-string="info.KSZQTHSJ01" /></div>
                                    </div>
                                    <!-- 是否溶栓 -->
                                    <div class="input-group">
                                        <div class="lb">是否进行溶栓:</div>
                                        <div class="tab-group">
                                            <div class="tab-group">
                                                <div ms-repeat="SFRSArr" class="tab"
                                                    ms-class="{{info.ISRS==el.infocode ? 'active':''}}"
                                                    ms-click="onRadioClick('ISRS',el.infocode)">
                                                    {{el.info}}
                                                </div>
                                            </div>
                                        </div>
                                    </div>

                                </div>
                                <!-- 签署知情同意时间 -->
                                <div class="inputs">
                                    <div class="input-group">
                                        <div class="lb">签署知情同意时间:</div>
                                        <div class="input"><input class="Wdate" type="text"
                                                onclick="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm'})"
                                                ms-duplex-string="info.QSZQTYSJ01" /></div>
                                    </div>
                                </div>
                                <div class="bigbox" ms-if="info.ISRS==0">
                                    <!-- 溶栓治疗开始时间 -->
                                    <div class="inputs">
                                        <div class="input-group">
                                            <div class="lb">溶栓治疗开始时间:</div>
                                            <div class="input"><input class="Wdate" type="text"
                                                    onclick="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm'})"
                                                    ms-duplex-string="info.RSZLKSSJ" /></div>
                                        </div>
                                        <!-- 是否 -->
                                        <div class="input-group">
                                            <div class="lb">是否提前结束:</div>
                                            <div class="tab-group">
                                                <div class="tab-group">
                                                    <div ms-repeat="SFTQJSArr" class="tab"
                                                        ms-class="{{info.TQJSFLG==el.infocode ? 'active':''}}"
                                                        ms-click="onRadioClick('TQJSFLG',el.infocode)">
                                                        {{el.info}}
                                                    </div>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="inputs" ms-if="info.TQJSFLG==0">
                                        <div class="input-group">
                                            <div class="lb">提前结束原因:</div>
                                            <div class="input"> <input id="content" type="text" ms-duplex-string="info.TQJSYY"></div>
                                        </div>
                                    </div>
                                    <div class="inputs">
                                        <div class="input-group">
                                            <div class="lb">溶栓备注:</div>
                                            <div class="input"> <input style="width: 300px" id="content" type="text" ms-duplex-string="info.RSBZ"></div>
                                        </div>
                                    </div>
                                    <!-- 药物选择 -->
                                    <div class="inputs">
                                        <div class="input-group">
                                            <div class="lb">药物选择:</div>
                                            <div style="margin-left: 130px">
                                                <div class="checkbox-group">
                                                    <div ms-repeat="YWXZArr" class="btn"
                                                        ms-class="{{isChecked('YWXZ',el.infocode) ? 'active':''}}"
                                                        ms-click="onCheckClick('YWXZ',el.infocode)">
                                                        {{el.info}}
                                                    </div>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="inputs">
	                                    <div class="inputs">
	                                        <div class="item_name">体重:</div>
	                                    <div class="input">
	                                        <input class="item_input" ms-duplex="info.TIZHONG"
	                                            ms-on-change='blur(info.TIZHONG)' type="text">kg
	                                        
	                                    </div>
                                    </div>
                                    <!-- rtPA剂量标准 -->
                                    <div class="inputs">
                                    <div class="input-group">
                                        <div class="lb">rtPA剂量标准:</div>
                                        <div style="margin-left: 130px">
                                            <div class="checkbox-group">
                                                <div ms-repeat="rtPabzArr" class="btn"
                                                    ms-class="{{info.RTPAZJBZ==el.infocode ? 'active':''}}"
                                                    ms-click="onRadioClick('RTPAZJBZ',el.infocode)">
                                                    {{el.info}}
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                                    <!-- 溶栓后NIhSS评分 -->
                                    <div class="inputs">
                                        <div class="input-group">
                                            <div class="lb">溶栓后NIhSS评分:</div>
                                            <div class="input"><input disabled="disabled" type="text"
                                                    ms-duplex="info.NIHSSPF02" />
                                                <div class="unit1">分</div>
                                                <div class="dian">
                                                    <span onclick="DJ02('layer01')" class="iconfont icon-detail"></span>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                    <!-- 溶栓后NIHSS弹出层 -->
                                    <div class="layer01">
                                        <header>
                                            <h3>NIHSS卒中量表</h3>
                                        </header>
                                        <div class="layer-content">
                                            <div class="options">
                                                <div class="options-title">1.(A)意识水平</div>
                                                <ul class="options-list">
                                                    <li class="options-item btn" ms-repeat="nihssYsspArr"
                                                        ms-class="{{cont1.NIHSS01 ? (cont1.NIHSS01==el.code ? 'active':''): ''}}"
                                                        ms-click="onRadioClick2('NIHSS01',el.code)">
                                                        {{el.info}}
                                                    </li>
                                                </ul>
                                            </div>
                                            <div class="options">
                                                <div class="options-title">1.(B)两项提问</div>
                                                <ul class="options-list">
                                                    <li class="options-item btn" ms-repeat="nihssLxwtArr"
                                                        ms-class="{{cont1.NIHSS02 ? (cont1.NIHSS02==el.code ? 'active':''): ''}}"
                                                        ms-click="onRadioClick2('NIHSS02',el.code)">
                                                        {{el.info}}
                                                    </li>
                                                </ul>
                                            </div>
                                            <div class="options">
                                                <div class="options-title">1.(C)两项指令</div>
                                                <ul class="options-list">
                                                    <li class="options-item btn" ms-repeat="nihssLxzlArr"
                                                        ms-class="{{cont1.NIHSS03 ? (cont1.NIHSS03==el.code ? 'active':''): ''}}"
                                                        ms-click="onRadioClick2('NIHSS03',el.code)">
                                                        {{el.info}}
                                                    </li>
                                                </ul>
                                            </div>
                                            <div class="options">
                                                <div class="options-title">2.凝视</div>
                                                <ul class="options-list">
                                                    <li class="options-item btn" ms-repeat="nihssNsArr"
                                                        ms-class="{{cont1.NIHSS04 ? (cont1.NIHSS04==el.code ? 'active':''): ''}}"
                                                        ms-click="onRadioClick2('NIHSS04',el.code)">
                                                        {{el.info}}
                                                    </li>
                                                </ul>
                                            </div>
                                            <div class="options">
                                                <div class="options-title">3.视野</div>
                                                <ul class="options-list">
                                                    <li class="options-item btn" ms-repeat="nihssSyeArr"
                                                        ms-class="{{cont1.NIHSS06 ? (cont1.NIHSS06==el.code ? 'active':''): ''}}"
                                                        ms-click="onRadioClick2('NIHSS06',el.code)">
                                                        {{el.info}}
                                                    </li>
                                                </ul>
                                            </div>
                                            <div class="options">
                                                <div class="options-title">4.面瘫</div>
                                                <ul class="options-list">
                                                    <li class="options-item btn" ms-repeat="nihssMtArr"
                                                        ms-class="{{cont1.NIHSS07 ? (cont1.NIHSS07==el.code ? 'active':''): ''}}"
                                                        ms-click="onRadioClick2('NIHSS07',el.code)">
                                                        {{el.info}}
                                                    </li>
                                                </ul>
                                            </div>
                                            <div class="options">
                                                <div class="options-title">5a.左上肢肌力</div>
                                                <ul class="options-list">
                                                    <li class="options-item btn" ms-repeat="nihssZszjlArr"
                                                        ms-class="{{cont1.NIHSS08 ? (cont1.NIHSS08==el.code ? 'active':''): ''}}"
                                                        ms-click="onRadioClick2('NIHSS08',el.code)">
                                                        {{el.info}}
                                                    </li>
                                                </ul>
                                            </div>
                                            <div class="options">
                                                <div class="options-title">5b.右上肢肌力</div>
                                                <ul class="options-list">
                                                    <li class="options-item btn" ms-repeat="nihssYszjlArr"
                                                        ms-class="{{cont1.NIHSS09 ? (cont1.NIHSS09==el.code ? 'active':''): ''}}"
                                                        ms-click="onRadioClick2('NIHSS09',el.code)">
                                                        {{el.info}}
                                                    </li>
                                                </ul>
                                            </div>
                                            <div class="options">
                                                <div class="options-title">6a.左下肢肌力</div>
                                                <ul class="options-list">
                                                    <li class="options-item btn" ms-repeat="nihssYxzjlArr"
                                                        ms-class="{{cont1.NIHSS010 ? (cont1.NIHSS010==el.code ? 'active':''): ''}}"
                                                        ms-click="onRadioClick2('NIHSS010',el.code)">
                                                        {{el.info}}
                                                    </li>
                                                </ul>
                                            </div>
                                            <div class="options">
                                                <div class="options-title">6b.右下肢肌力</div>
                                                <ul class="options-list">
                                                    <li class="options-item btn" ms-repeat="nihssZxzjlArr"
                                                        ms-class="{{cont1.NIHSS011 ? (cont1.NIHSS011==el.code ? 'active':''): ''}}"
                                                        ms-click="onRadioClick2('NIHSS011',el.code)">
                                                        {{el.info}}
                                                    </li>
                                                </ul>
                                            </div>
                                            <div class="options">
                                                <div class="options-title">7.肢体共济障碍</div>
                                                <ul class="options-list">
                                                    <li class="options-item btn" ms-repeat="nihssZtgjzaArr"
                                                        ms-class="{{cont1.NIHSS012 ? (cont1.NIHSS012==el.code ? 'active':''): ''}}"
                                                        ms-click="onRadioClick2('NIHSS012',el.code)">
                                                        {{el.info}}
                                                    </li>
                                                </ul>
                                            </div>
                                            <div class="options">
                                                <div class="options-title">8.感觉</div>
                                                <ul class="options-list">
                                                    <li class="options-item btn" ms-repeat="nihssGjArr"
                                                        ms-class="{{cont1.NIHSS013? (cont1.NIHSS013==el.code ? 'active':''): ''}}"
                                                        ms-click="onRadioClick2('NIHSS013',el.code)">
                                                        {{el.info}}
                                                    </li>
                                                </ul>
                                            </div>
                                            <div class="options">
                                                <div class="options-title">9.失语</div>
                                                <ul class="options-list">
                                                    <li class="options-item btn" ms-repeat="nihssSyArr"
                                                        ms-class="{{cont1.NIHSS014 ? (cont1.NIHSS014==el.code ? 'active':''): ''}}"
                                                        ms-click="onRadioClick2('NIHSS014',el.code)">
                                                        {{el.info}}
                                                    </li>
                                                </ul>
                                            </div>
                                            <div class="options">
                                                <div class="options-title">10.构音障碍</div>
                                                <ul class="options-list">
                                                    <li class="options-item btn" ms-repeat="nihssGyzaArr"
                                                        ms-class="{{cont1.NIHSS015 ? (cont1.NIHSS015==el.code ? 'active':''): ''}}"
                                                        ms-click="onRadioClick2('NIHSS015',el.code)">
                                                        {{el.info}}
                                                    </li>
                                                </ul>
                                            </div>
                                            <div class="options">
                                                <div class="options-title">11。忽视</div>
                                                <ul class="options-list">
                                                    <li class="options-item btn" ms-repeat="nihssHsArr"
                                                        ms-class="{{cont1.NIHSS016 ? (cont1.NIHSS016==el.code ? 'active':''): ''}}"
                                                        ms-click="onRadioClick2('NIHSS016',el.code)">
                                                        {{el.info}}
                                                    </li>
                                                </ul>
                                            </div>
                                        </div>
                                        <div class="options-btn">
                                            <button onclick="down02('layer01')" class="no">取消</button>
                                            <button class="yes" ms-click="NIHSSClicktwo">确定</button>
                                        </div>
                                    </div>
                                    </div>
                                    <!-- 所用药物总量 -->
                                    <div class="inputs">
                                        <div class="input-group">
                                            <div class="lb">所用药物总量:</div>
                                            <div class="input"><input ms-duplex="info.SYYWZL"
                                                    type="text" /></div>
                                        </div>
                                    </div>
                                    <!-- 有无并发症 -->
                                    <div class="inputs">
                                        <div class="input-group1">
                                            <div class="lb">有无并发症:</div>
                                            <div class="tab-group">
                                                <div ms-repeat="YWBFZArr" class="tab"
                                                    ms-class="{{info.YWBFZ==el.infocode ? 'active':''}}"
                                                    ms-click="onRadioClick('YWBFZ',el.infocode)">
                                                    {{el.info}}
                                                </div>
                                            </div>
                                        </div>

                                    </div>
                                    <!-- 并发症 -->
                                    <div class="inputs " ms-if="info.YWBFZ==0">
                                        <div class="input-group">
                                            <div class="lb">并发症:</div>
                                            <div style="margin-left: 130px">
                                                <div class="checkbox-group">
                                                    <div ms-repeat="BFZArr" class="btn"
                                                        ms-class="{{isChecked('RSBFZ',el.infocode) ? 'active':''}}"
                                                        ms-click="onCheckClick('RSBFZ',el.infocode)">
                                                        {{el.info}}
                                                    </div>
                                                    <input id="content" placeholder="其他溶栓并发症" type="text" ms-duplex-string="info.RSBFZQT">
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                    <!-- 溶栓后CT复查时间 -->
                                    <div class="inputs">
                                        <div class="input-group">
                                            <div class="lb">溶栓后CT复查时间:</div>
                                            <div class="input"><input class="Wdate" type="text"
                                                    onclick="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm'})"
                                                    ms-duplex-string="info.RSHFCCTSJ" /></div>
                                        </div>
                                    </div>
                                </div>

                            </div>
                            <!-- 介入组 -->
                            <div class="tab-container treatment" ms-if="activetab==1">
                                <!-- 介入知情谈话时间s -->
                                <div class="inputs">
                                    <div class="input-group topone">
                                        <div class="lb">介入知情谈话时间:</div>
                                        <div class="input"><input class="Wdate" type="text"
                                                onclick="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm'})"
                                                ms-duplex-string="info.KSZQTHSJ02" /></div>
                                    </div>
                                </div>
                                <!-- 同意取栓 -->
                                <div class="inputs">
                                    <div class="input-group1">
                                        <div class="lb">同意取栓:</div>
                                        <div class="tab-group">
                                            <div ms-repeat="TYQSArr" class="tab"
                                                ms-class="{{info.ISQS==el.infocode ? 'active':''}}"
                                                ms-click="onRadioClick('ISQS',el.infocode)">
                                                {{el.info}}
                                            </div>
                                        </div>
                                    </div>

                                </div>
                                <div class="bigbat" ms-if="info.ISQS==0">
                                    <!-- 签署知情同意书 -->
                                    <div class="inputs">
                                        <div class="input-group">
                                            <div class="lb">签署知情同意书时间:</div>
                                            <div class="input"><input class="Wdate" type="text"
                                                    onclick="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm'})"
                                                    ms-duplex-string="info.QSZQTYSJ02" /></div>
                                        </div>
                                        <div class="input-group">
                                            <div class="lb">决定行介入手术医生:</div>
                                            <div class="input"><input type="text" ms-duplex-string="info.JDJRSSYS"></div>
                                        </div>
                                    </div>
                                    <!-- 住院时间 -->
                                    <div class="inputs">
                                        <div class="input-group">
                                            <div class="lb">住院时间:</div>
                                            <div class="input"><input class="Wdate" type="text"
                                                    onclick="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm'})"
                                                    ms-duplex-string="info.ZYSJ" /></div>
                                        </div>
                                    </div>
                                    <!-- 启动导管室时间 -->
                                    <div class="inputs">
                                        <div class="input-group">
                                            <div class="lb">启动导管室时间:</div>
                                            <div class="input"><input class="Wdate" type="text"
                                                    onclick="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm'})"
                                                    ms-duplex-string="info.QDDGS" /></div>
                                        </div>
                                        <div class="input-group">
                                            <div class="lb">导管室激活时间:</div>
                                            <div class="input"><input class="Wdate" type="text"
                                                    onclick="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm'})"
                                                    ms-duplex-string="info.DGSJHSJ" /></div>
                                        </div>
                                    </div>
                                    <!-- 患者进入导管室时间 -->
                                    <div class="inputs">
                                        <div class="input-group">
                                            <div class="lb">患者进入导管室时间:</div>
                                            <div class="input"><input class="Wdate" type="text"
                                                    onclick="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm'})"
                                                    ms-duplex-string="info.HZJRDGSSJ" /></div>
                                        </div>
                                    </div>
                                    <!-- 麻醉科通知时间 -->
                                    <div class="inputs">
                                        <div class="input-group">
                                            <div class="lb">麻醉科通知时间:</div>
                                            <div class="input"><input class="Wdate" type="text"
                                                    onclick="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm'})"
                                                    ms-duplex-string="info.MZKTZSJ" /></div>
                                        </div>
                                        <div class="input-group">
                                            <div class="lb">麻醉科到场时间:</div>
                                            <div class="input"><input class="Wdate" type="text"
                                                    onclick="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm'})"
                                                    ms-duplex-string="info.MZKDCSJ" /></div>
                                        </div>
                                    </div>
                                    <!-- 麻醉完成时间 -->
                                    <div class="inputs">
                                        <div class="input-group">
                                            <div class="lb">麻醉完成时间:</div>
                                            <div class="input"><input class="Wdate" type="text"
                                                    onclick="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm'})"
                                                    ms-duplex-string="info.MZWCSJ" /></div>
                                        </div>
                                        <div class="input-group">
                                            <div class="lb">穿刺开始时间:</div>
                                            <div class="input"><input class="Wdate" type="text"
                                                    onclick="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm'})"
                                                    ms-duplex-string="info.KSCCSJ" /></div>
                                        </div>
                                    </div>
                                    <!-- 造影开始时间 -->
                                    <div class="inputs">
                                        <div class="input-group">
                                            <div class="lb">穿刺成功时间:</div>
                                            <div class="input"><input class="Wdate" type="text"
                                                    onclick="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm'})"
                                                    ms-duplex-string="info.CCCGSJ" /></div>
                                        </div>
                                        <div class="input-group">
                                            <div class="lb">造影开始时间:</div>
                                            <div class="input"><input class="Wdate" type="text"
                                                    onclick="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm'})"
                                                    ms-duplex-string="info.ZYKSSJ" /></div>
                                        </div>
                                    </div>
                                    <!-- 取栓完成时间 -->
                                    <div class="inputs">
                                        <div class="input-group">
                                            <div class="lb">造影完成时间:</div>
                                            <div class="input"><input class="Wdate" type="text"
                                                    onclick="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm'})"
                                                    ms-duplex-string="info.ZYWCSJ" /></div>
                                        </div>
                                    </div>
                                    <!-- 取栓第几把时间 -->
                                    <div class="inputs">
                                        <div class="input-group">
                                            <div class="lb">取栓第一把时间:</div>
                                            <div class="input"><input class="Wdate" type="text"
                                                    onclick="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm'})"
                                                    ms-duplex-string="info.QSSJ1" /></div>
                                        </div>
                                        <div class="input-group">
                                            <div class="lb">取栓第二把时间:</div>
                                            <div class="input"><input class="Wdate" type="text"
                                                    onclick="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm'})"
                                                    ms-duplex-string="info.QSSJ2" /></div>
                                        </div>
                                    </div>
                                    <!-- 取栓第几把时间 -->
                                    <div class="inputs">
                                        <div class="input-group">
                                            <div class="lb">取栓第三把时间:</div>
                                            <div class="input"><input class="Wdate" type="text"
                                                    onclick="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm'})"
                                                    ms-duplex-string="info.QSSJ3" /></div>
                                        </div>
                                        <div class="input-group">
                                            <div class="lb">取栓完成时间:</div>
                                            <div class="input"><input class="Wdate" type="text"
                                                    onclick="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm'})"
                                                    ms-duplex-string="info.QSWCSJ" /></div>
                                        </div>
                                    </div>
                                    <!-- 介入医生 -->
                                    <div class="inputs">
                                        <div class="input-group">
                                            <div class="lb">取栓完成-备注:</div>
                                            <div class="input"><input type="text" ms-duplex-string="info.QSWCBZ"></div>
                                        </div>
                                    </div>
                                     <div class="inputs">
                                        <div class="input-group">
                                            <div class="lb">介入医生:</div>
                                            <div class="input"><input type="text" ms-duplex-string="info.JRYS"></div>
                                        </div>
                                    </div>
                                </div>

                            </div>
                        </div>
                    </div>
                </div>
                <div class="save-btn" onclick="commit()">保存</div>
            </body>
            <!-- <script type="text/javascript" src="js/jquery-1.4.2.min.js"></script> -->
            <script type="text/javascript">
                var _emgSeq = "${emgSeq}";
                var infocodes = ['nihssYssp', 'nihssLxwt', 'nihssLxzl', 'nihssNs', 'nihssSye', 'nihssMt', 'nihssZszjl', 'nihssYszjl',
                    'nihssYxzjl', 'nihssZxzjl', 'nihssZtgjza', 'nihssGj', 'nihssSy', 'nihssGyza', 'nihssHs'
                ];

                function down(layer) {
                    $('.layer').fadeOut()
                    document.getElementsByClassName('zzc')[0].style.display = "none"
                    document.getElementsByTagName('body')[0].style.overflow = 'visible'
                    document.getElementsByTagName('body')[0].style.height = '100%'
                }

                function DJ(layer) {
                    $('.layer').fadeIn()
                    document.getElementsByClassName('zzc')[0].style.display = "block"
                    document.getElementsByTagName('body')[0].style.overflow = 'hidden'
                    document.getElementsByTagName('body')[0].style.height = '100%'
                }

                function DJ1(layer) {
                    $('.mrs-lay').fadeIn()
                    document.getElementsByClassName('zzc01')[0].style.display = "block"
                    document.getElementsByTagName('body')[0].style.overflow = 'hidden'
                    document.getElementsByTagName('body')[0].style.height = '100%'
                }

                function down1(layer) {
                    $('.mrs-lay').fadeOut()
                    document.getElementsByClassName('zzc01')[0].style.display = "none"
                    document.getElementsByTagName('body')[0].style.overflow = 'visible'
                    document.getElementsByTagName('body')[0].style.height = '100%'
                }

                function DJ02() {
                    $('.layer01').fadeIn()
                    document.getElementsByClassName('zzc02')[0].style.display = "block"
                    document.getElementsByTagName('body')[0].style.overflow = 'hidden'
                    document.getElementsByTagName('body')[0].style.height = '100%'
                }

                function down02(layer) {
                    $('.layer01').fadeOut()
                    document.getElementsByClassName('zzc02')[0].style.display = "none"
                    document.getElementsByTagName('body')[0].style.overflow = 'visible'
                    document.getElementsByTagName('body')[0].style.height = '100%'
                }

                var addrInfoList = publicFun.getItem('addrInfoList');
                var vm = avalon.define({
                    $id: 'report',
                    index: 0,
                    index1: 0,
                    index2: '',
                    activeTab: 0,
                    activetab: 0,
                    infoone: {
                        tabqh: 0,
                        tabqh1: 0,
                    },
                    baseInfo: {
                        cstNam: '', //患者姓名
                        cstSexCod: '', //性别
                        cstAge: '', //年龄
                        bthDat: '', //出生日期
                        nation: '', //民族
                        senStuCod: '', //意识senstuCod
                        breNbr: '', //呼吸
                        tmpNbr: '', //体温
                        sbpUpNbr: '', //血压
                        sbpDownNbr: '',
                        mpi: '', //患者id
                        ywzl: '', //药物总量
                        emgDat: '',//预检时间
                        hrtRte: '',//心率
                        oxyNbr: '',//血氧
                        glsNum: '',//指尖血糖
                        cstDspCodNameNew: '',
                        ZGQX: '',//转归去向
                    },
 //                   info.NIHSSPF01: 0,
                    nihssChecked: '',
                    nationArr: [], //民族类别表
                    senRctCodArr: [], //意识
                    info: {
                        MRSPF: '',
                        NIHSSPF01: '',
                        NIHSSPF02: 0,
                        NIHSSPF01PFX: '',//溶栓前NIHSS评分项
                        NIHSSPF02PFX: '',//溶栓后NIHSS评分项
                        ZYZZ: '', //主要症状
                        RSZZYZZ: '', //溶栓组主要症状
                        PSFYY: '', //平时服用药
                        YWXZ: '', //药物选择
                        ISTZJRK: '', //通知介入
                        YWBFZ: '', //有无并发症
                        TYQS: '', //同意取栓
                        FBSJ: '', //发病时间
                        ZHZCSJ: '', //最后正常时间
                        XDTSJ: '', //心电图时间
                        NZDSJ: '', //拟诊断时间
                       	TZHZSJ: '', //通知会诊时间
                      	HZDDSJ: '', //会诊达到时间
                      	JRTZSJ: '', //通知介入时间
                        JRDDSJ: '', //介入到达时间
                        TZWQSJ: '', //通知外勤时间
                        WQDDSJ: '', //外勤到达时间
                        JCKSSJ: '', //检查开始时间
                        JCJGSJ: '', //检查结果时间
                        ZDSJ: '', //诊断时间
                        RSZLKSSJ: '', //溶栓治疗开始时间
                        QDDGSSJ: '', //启动导管室时间
                        HZJRDGSSJ: '', //患者进入导管室时间
                        MZKTZSJ: '', //麻醉科通知时间
                        MZKDCSJ: '', //麻醉科到场时间
                        MZWCSJ: '', //麻醉完成时间
                        CCCGSJ: '', //穿刺成功时间
                        ZYKSSJ: '', //造影开始时间
                        ZYWCSJ: '', //造影完成时间
                        QSWCSJ: '', //取栓完成时间
                        XUEYA: '',//血压
                        TIZHONG: '' ,//体重
//                        ZGQX: '',//转归去向
                        ISCX: '',//是否出血
                        ISZS: '',//是否阻塞
                        ZDYS: '',//诊断医生
                        CBZD: '',//初步诊断
                        JIWSQT: '',//既往史其他
                        JIWS: '',//既往史
                        GUOMS: '',//过敏史
                        GUOMSQT: '',//过敏史其他
                        PSFYYQT: '',//平时服用药其他
                        QSZQTYSJ01: '',//取栓知情同意时间
                        ISRS: '',//是否溶栓
                        KSZQTHSJ01: '',//溶栓组开始知情同意时间
                        TQJSFLG: '',//溶栓提前结束
                        TQJSYY: '',//提前结束原因
                        RSBZ:'',//溶栓备注
                        SYYWZL: '',//所用药物总量
                        RSBFZ: '',//溶栓并发症
                        RSBFZQT: '',//溶栓并发症其他
                        RSHFCCTSJ: '',//溶栓后复查CT时间
                        KSZQTHSJ02: '',//介入组开始知情同意时间
                        ISQS: '',//是否取栓
                        QSZQTYSJ02: '',//介入组知情同意时间(取栓知情同意时间)
                        JDJRSSYS: '',//决定行介入手术医生
                        QDDGS: '',//启动导管室时间
                        DGSJHSJ: '',//导管室激活时间
                        KSCCSJ: '',//开始穿刺时间
                        QSSJ1: '',//取栓第一把时间
                        QSSJ2: '',//取栓第二把时间
                        QSSJ3: '',//取栓第三把时间
                        QSWCBZ: '',//取栓完成备注
                        JRYS: '',//介入医生
                        ZYZZQT: '',//主要症状其他
                        CBZDQT: '',//初步诊断其他
                        RTPAZJBZ: '',//rtPa剂量标准
                        NZDYS: '',//拟诊断医生
                        JYCXSJ: '',//检查抽血时间
                        jyxm:0,
                        jcxm:0,
                        ZYSJ: '',//住院时间
                    },
                    aidPatient: {
                        scePrvCod: '', //发病地址--省
                        sceCtyCod: '', //发病地址--市
                        sceAr0Cod: '', //发病地址--县/区
                        illTim: '', //发病时间
                    },
                    hspConsultationRecords: {
                    	invitationDate: '',//会诊通知时间
                        consultationDate: '',//会诊签到时间
                    },
                     cont: {
                        NIHSS01: null,
                        NIHSS02: null,
                        NIHSS03: null,
                        NIHSS04: null,
                        NIHSS06: null,
                        NIHSS07: null,
                        NIHSS08: null,
                        NIHSS09: null,
                        NIHSS010: null,
                        NIHSS011: null,
                        NIHSS012: null,
                        NIHSS013: null,
                        NIHSS014: null,
                        NIHSS015: null,
                        NIHSS016: null,
                    },
                    cont1: {
                        NIHSS01: null,
                        NIHSS02: null,
                        NIHSS03: null,
                        NIHSS04: null,
                        NIHSS06: null,
                        NIHSS07: null,
                        NIHSS08: null,
                        NIHSS09: null,
                        NIHSS010: null,
                        NIHSS011: null,
                        NIHSS012: null,
                        NIHSS013: null,
                        NIHSS014: null,
                        NIHSS015: null,
                        NIHSS016: null,
                    },
                    
                    provinceList: addrInfoList.province || [], //省
                    cityList: [], //市
                    cntyList: [], //区
                    timeList: [], //时间轴信息
                    list: [], //心电图和肌钙蛋白的List
                    BQPGArr: [], //病情评估列表
                    ZYZZArr: [], //主要症状
                    RSZZYZZArr: [], //溶栓组主要症状
                    JIWSArr: [], //既往史
                    GMSArr: [], //过敏史
                    PSFYYArr: [], //平时服用药
                    YWXZArr: [], //药物选择
                    BFZArr: [], //并发症
                    SFZSArr: [], //是否阻塞
                    SFCXArr: [], //是否出血
                    rtPabzArr: [],//rtPa剂量标准
                    TZJRKArr: [{
                        info: "是",
                        infocode: "0"
                    }, {
                        info: "否",
                        infocode: "1"
                    }], //通知介入科
                    SFRSArr: [{
                        info: "是",
                        infocode: "0"
                    }, {
                        info: "否",
                        infocode: "1"
                    }], //是否溶栓
                    SFTQJSArr: [{
                        info: "是",
                        infocode: "0"
                    }, {
                        info: "否",
                        infocode: "1"
                    }], //是否提前结束
                    YWBFZArr: [{
                        info: "有",
                        infocode: "0"
                    }, {
                        info: "无",
                        infocode: "1"
                    }], //有无并发症
                    TYQSArr: [{
                        info: "是",
                        infocode: "0"
                    }, {
                        info: "否",
                        infocode: "1"
                    }], //同意取栓
                    nihssYssp: '',
                    nihssYsspSel: [],
                    nihssYsspArr: [{
                        "info": '清醒，反应敏锐(0分)',
                        code: 0,
                    }, {
                        "info": '嗜睡(1分)',
                        code: 1
                    }, {
                        "info": '昏睡(2分)',
                        code: 2
                    }, {
                        "info": '昏迷(3分)',
                        code: 3
                    }],
                    nihssLxwt: '',
                    nihssLxwtArr: [{
                        "info": '均回答正确(0分)',
                        code: 0
                    }, {
                        "info": '答对一项(1分)',
                        code: 1
                    }, {
                        "info": '均回答错误(2分)',
                        code: 2
                    }],
                    nihssLxzl: '',
                    nihssLxzlArr: [{
                        "info": '均正确完成(0分)',
                        code: 0
                    }, {
                        "info": '正确完成一项(1分)',
                        code: 1
                    }, {
                        "info": '均不能完成(2分)',
                        code: 2
                    }],
                    nihssNs: '',
                    nihssNsArr: [{
                        "info": '正常(0分)',
                        code: 0
                    }, {
                        "info": '侧视动作受限(1分)',
                        code: 1
                    }, {
                        "info": '眼球固定偏向一侧(2分)',
                        code: 2
                    }],
                    nihssSye: '',
                    nihssSyeArr: [{
                        "info": '无视野缺损(0分)',
                        code: 0
                    }, {
                        "info": '部分偏盲(1分)',
                        code: 1
                    }, {
                        "info": '完全偏盲(2分)',
                        code: 2
                    }, {
                        "info": '双侧偏盲(3分)',
                        code: 3
                    }],
                    nihssMt: '',
                    nihssMtArr: [{
                        "info": '无(0分)',
                        code: 0
                    }, {
                        "info": '轻微面瘫(1分)',
                        code: 1
                    }, {
                        "info": '部分面瘫(2分)',
                        code: 2
                    }, {
                        "info": '完全面瘫(3分)',
                        code: 3
                    }],
                    nihssZszjl: '',
                    nihssZszjlArr: [{
                        "info": '无晃动(0分)',
                        code: 0,
                    }, {
                        "info": '有晃动(1分)',
                        code: 1
                    }, {
                        "info": '不能完全抵抗重力(2分)',
                        code: 2
                    }, {
                        "info": '不能维持(3分)',
                        code: 3
                    }, {
                        "info": '不能移动(4分)',
                        code: 4
                    }],
                    nihssYszjl: '',
                    nihssYszjlArr: [{
                        "info": '无晃动(0分)',
                        code: 0
                    }, {
                        "info": '有晃动(1分)',
                        code: 1
                    }, {
                        "info": '不能完全抵抗重力(2分)',
                        code: 2
                    }, {
                        "info": '不能维持(3分)',
                        code: 3
                    }, {
                        "info": '不能移动(4分)',
                        code: 4
                    }],
                    nihssYxzjl: '',
                    nihssYxzjlArr: [{
                        "info": '无晃动(0分)',
                        code: 0
                    }, {
                        "info": '有晃动(1分)',
                        code: 1
                    }, {
                        "info": '不能完全抵抗重力(2分)',
                        code: 2
                    }, {
                        "info": '不能维持(3分)',
                        code: 3
                    }, {
                        "info": '不能移动(4分)',
                        code: 4
                    }],
                    nihssZxzjl: '',
                    nihssZxzjlArr: [{
                        "info": '无晃动(0分)',
                        code: 0
                    }, {
                        "info": '有晃动(1分)',
                        code: 1
                    }, {
                        "info": '不能完全抵抗重力(2分)',
                        code: 2
                    }, {
                        "info": '不能维持(3分)',
                        code: 3
                    }, {
                        "info": '不能移动(4分)',
                        code: 4
                    }],
                    nihssZtgjza: '',
                    nihssZtgjzaArr: [{
                        "info": '无(0分)',
                        code: 0
                    }, {
                        "info": '存在于上肢或下肢(1分)',
                        code: 1
                    }, {
                        "info": '存在于上肢和下肢(2分)',
                        code: 2
                    }],
                    nihssGj: '',
                    nihssGjArr: [{
                        "info": '正常(0分)',
                        code: 0
                    }, {
                        "info": '部分缺失(1分)',
                        code: 1
                    }, {
                        "info": '严重缺失(2分)',
                        code: 2
                    }],
                    nihssSy: '',
                    nihssSyArr: [{
                        "info": '无(0分)',
                        code: 0
                    }, {
                        "info": '轻度失语(1分)',
                        code: 1
                    }, {
                        "info": '重度失语(2分)',
                        code: 2
                    }, {
                        "info": '完全失语(3分)',
                        code: 3
                    }],
                    nihssGyza: '',
                    nihssGyzaArr: [{
                        "info": '正常发音(0分)',
                        code: 0
                    }, {
                        "info": '轻度构音障碍(1分)',
                        code: 1
                    }, {
                        "info": '严重构音障碍(2分)',
                        code: 2
                    }],
                    nihssHs: '',
                    nihssHsArr: [{
                        "info": '无(0分)',
                        code: 0
                    }, {
                        "info": '部分忽视(1分)',
                        code: 1
                    }, {
                        "info": '完全忽视(2分)',
                        code: 2
                    }],
                    MRSPFArr: [{
                        "info": '完全无症状',
                        "code": "0",
                        infocode: '0'
                    }, {
                        "info": '尽管有症状,但无明显功能障碍,能完成所有日常职责和活动',
                        "code": "1",
                        infocode: '1'
                    }, {
                        "info": '轻度残疾,不能完成病前所有活动,但不需要帮助能照顾自己的事务',
                        "code": "2",
                        infocode: '2'
                    }, {
                        "info": '中度残疾,需求一些帮助,但行走不需要帮助',
                        "code": "3",
                        infocode: '3'
                    }, {
                        "info": '重度残疾,不能独立行走,无他人帮助不能的满足自身需求',
                        "code": "4",
                        infocode: '4'
                    }, {
                        "info": '严重残疾,卧床、失禁,要求持续关注',
                        "code": "5",
                        infocode: '5'
                    }, {
                        "info": '死亡',
                        "code": "6",
                        infocode: '6'
                    }],
                    ZYZZSel: [], //主要症状多选
                    RSZZYZZSel: [], //溶栓主要症状多选
                    JIWSSel: [], //既往史多选
                    GUOMSSel: [], //过敏史多选
                    PSFYYSel: [], //平时服用要多选
                    YWXZSel: [], //药物选择多选
                    RSBFZSel: [], //并发症多选
                    MRSPFSel: [],
                    jylist: [],
                    currItem: {},
                    //检验选项
                    chooseItem: function(item) {
                        vm.currItem = {};
                        vm.currItem = item;
                    },
                    jclist: [],
                    //检查选项
                    toggle: function(el) {
                        var _list = vm.jclist;
                        for (var i = 0; i < _list.length; i++) {
                            if (el.applicationNo == _list[i].applicationNo) {
                                el.show = !el.show;
                                break;
                            }
                        }
                        vm.jclist = _list;
                    },

                    // 溶栓组介入组
                    TabClick: function (busStep, index) {
                        vm.activetab = index;
                    },
                    // 检查结果 检查报告
                    TabQH: function (prop) {
                        if (vm.infoone[prop]) {
                            vm.infoone[prop] = 0;
                        } else {
                            vm.infoone[prop] = 1;
                        }
                    },
                    // 单选
                    onRadioClick: function (prop, val, idx) {
                        vm.info[prop] = val;
                    },
                    // 评分
                    onRadioClick1: function (prop1, idx) {
                         console.log(prop1, idx)
                        vm.cont[prop1] = idx;
                        var arr = []
                        for (var prop in vm.cont) {
                            if (!vm.cont[prop1]) {
                                vm.cont[prop1] = '0'
                            } if(vm.cont[prop1]) {
                                arr.push(vm.cont[prop])
                                
                            }
                        }
                       var arr1= arr.pop()
                        vm.info.NIHSSPF01PFX = arr.join(',')

                        console.log(vm.info.NIHSSPF01PFX)
                    },
                    onRadioClick2: function (prop1, idx) {
                        console.log(prop1, idx)
                        vm.cont1[prop1] = idx;
                        var arr = []
                        for (var prop in vm.cont1) {
                            if (!vm.cont1[prop1]) {
                                vm.cont1[prop1] = '0'
                            } if(vm.cont1[prop1]) {
                                arr.push(vm.cont1[prop])
                                
                            }
                        }
                       var arr1= arr.pop()
                        vm.info.NIHSSPF02PFX = arr.join(',')

                        console.log(vm.info.NIHSSPF02PFX)
                    },
                    // 药物总量计算
                    blur: function (e) {
                    	vm.info.SYYWZL = e * 0.9
                    },
                    // mrs评分
                    MRSClick: function (e) {
//                         vm.index1 = e.$model.filter(item => item.infocode == vm.info.MRSPF)[0].code
                        console.log(vm.index1)
                          vm.index1 =e.$model.filter(function(item){
                            return item.infocode == vm.info.MRSPF
                          })[0].code

                        document.getElementsByClassName('zzc01')[0].style.display = "none"
                        $('.mrs-lay').fadeOut()
                        document.getElementsByTagName('body')[0].style.overflow = 'visible'
                        document.getElementsByTagName('body')[0].style.height = '100%'
                    },
                    // NIHSS评分
                    NIHSSClick: function () {
                         vm.info.NIHSSPF01 = Number(vm.cont.NIHSS01) + Number(vm.cont.NIHSS02) + Number(vm.cont.NIHSS03) + Number(vm.cont.NIHSS04) + Number(vm.cont.NIHSS06) + Number(vm.cont.NIHSS07) + Number(vm.cont.NIHSS08) + Number(vm.cont.NIHSS09) + Number(vm.cont.NIHSS010) + Number(vm.cont.NIHSS011) + Number(vm.cont.NIHSS012) + Number(vm.cont.NIHSS013) + Number(vm.cont.NIHSS014) + Number(vm.cont.NIHSS015) + Number(vm.cont.NIHSS016)
                        document.getElementsByClassName('zzc')[0].style.display = "none"
                        $('.layer').fadeOut()
                        document.getElementsByTagName('body')[0].style.overflow = 'visible'
                        document.getElementsByTagName('body')[0].style.height = '100%'

                    },
                    // 溶栓后NIHSS评分
                    NIHSSClicktwo: function () {
                        vm.info.NIHSSPF02 = Number(vm.cont1.NIHSS01) + Number(vm.cont1.NIHSS02) + Number(vm.cont1.NIHSS03) + Number(vm.cont1.NIHSS04) + Number(vm.cont1.NIHSS06) + Number(vm.cont1.NIHSS07) + Number(vm.cont1.NIHSS08) + Number(vm.cont1.NIHSS09) + Number(vm.cont1.NIHSS010) + Number(vm.cont1.NIHSS011) + Number(vm.cont1.NIHSS012) + Number(vm.cont1.NIHSS013) + Number(vm.cont1.NIHSS014) + Number(vm.cont1.NIHSS015) + Number(vm.cont1.NIHSS016)
                        document.getElementsByClassName('zzc02')[0].style.display = "none"
                        $('.layer01').fadeOut()
                        document.getElementsByTagName('body')[0].style.overflow = 'visible'
                        document.getElementsByTagName('body')[0].style.height = '100%'

                    },
                    // 检查结果
                    res: function () {
                        // document.getElementsByClassName('pop_up')[0].style.display = "block"
                        document.getElementsByClassName('zzc03')[0].style.display = "block"
                        $(".pop_up").fadeIn();
                        document.getElementsByTagName('body')[0].style.overflow = 'hidden'
                        document.getElementsByTagName('body')[0].style.height = '100%'
                    },
                    shutdown: function () {
                        document.getElementsByClassName('zzc03')[0].style.display = "none"
                        $(".pop_up").fadeOut();
                        document.getElementsByTagName('body')[0].style.overflow = 'visible'
                        document.getElementsByTagName('body')[0].style.height = '100%'
                    },
                    clickone: function () {
                        $("#show").slideToggle();
                    },
                    clicktwo: function () {
                        $("#showone").slideToggle();
                    },
                    isChecked: function (prop, code) {
                        var flag = false;
                        for (var i = 0; i < vm[prop + 'Sel'].length; i++) {
                            var el = vm[prop + 'Sel'][i];
                            if (el == code) {
                                flag = true;
                                break;
                            }
                        }
                        return flag;
                    },
                    zzc: function () {
                       vm.info.NIHSSPF01 = Number(vm.cont.NIHSS01) + Number(vm.cont.NIHSS02) + Number(vm.cont.NIHSS03) + Number(vm.cont.NIHSS04) + Number(vm.cont.NIHSS06) + Number(vm.cont.NIHSS07) + Number(vm.cont.NIHSS08) + Number(vm.cont.NIHSS09) + Number(vm.cont.NIHSS010) + Number(vm.cont.NIHSS011) + Number(vm.cont.NIHSS012) + Number(vm.cont.NIHSS013) + Number(vm.cont.NIHSS014) + Number(vm.cont.NIHSS015) + Number(vm.cont.NIHSS016)
                        document.getElementsByClassName('zzc')[0].style.display = "none"
                        document.getElementsByClassName('layer')[0].style.display = 'none'
                        document.getElementsByTagName('body')[0].style.overflow = 'visible'
                        document.getElementsByTagName('body')[0].style.height = '100%'
                    },
                    zzc01: function () {
//                         vm.index1 =vm.MRSPFArr.filter(item => item.infocode == vm.info.MRSPF)[0].code
                          vm.index1 =vm.MRSPFArr.filter(function(item){
                           return item.infocode == vm.info.MRSPF
                          })[0].code
                        
                        document.getElementsByClassName('zzc01')[0].style.display = "none"
                        document.getElementsByClassName('mrs-lay')[0].style.display = 'none'
                        document.getElementsByTagName('body')[0].style.overflow = 'visible'
                        document.getElementsByTagName('body')[0].style.height = '100%'
                    },
                    zzc02: function () {
                        vm.info.NIHSSPF02 = Number(vm.cont1.NIHSS01) + Number(vm.cont1.NIHSS02) + Number(vm.cont1.NIHSS03) + Number(vm.cont1.NIHSS04) + Number(vm.cont1.NIHSS06) + Number(vm.cont1.NIHSS07) + Number(vm.cont1.NIHSS08) + Number(vm.cont1.NIHSS09) + Number(vm.cont1.NIHSS010) + Number(vm.cont1.NIHSS011) + Number(vm.cont1.NIHSS012) + Number(vm.cont1.NIHSS013) + Number(vm.cont1.NIHSS014) + Number(vm.cont1.NIHSS015) + Number(vm.cont1.NIHSS016)
                        document.getElementsByClassName('zzc02')[0].style.display = "none"
                        document.getElementsByClassName('layer01')[0].style.display = 'none'
                        document.getElementsByTagName('body')[0].style.overflow = 'visible'
                        document.getElementsByTagName('body')[0].style.height = '100%'
                    },
                    zzc03: function () {
                        document.getElementsByClassName('zzc03')[0].style.display = "none"
                        document.getElementsByClassName('pop_up')[0].style.display = 'none'
                        document.getElementsByTagName('body')[0].style.overflow = 'visible'
                        document.getElementsByTagName('body')[0].style.height = '100%'
                    },
                    //监听多选点击事件
                    onCheckClick: function (prop, code) {
                        var list = vm[prop + 'Sel'];
                        if (list.indexOf(code) > -1) {
                            list.splice(list.indexOf(code), 1);
                        } else {
                            list.push(code)
                        } 
                        vm[prop + 'Sel'] = list;
                        vm.info[prop] = list.join(',');
                    },
                    onToggleClick: function(prop) {
                        
                            if (vm.info[prop]==0) {
                                vm.info[prop] = 1;
                            } else {
                                vm.info[prop] = 0;
                            }
                        
                    },
                });
                /* 监听省下拉选择框 */
                vm.aidPatient.$watch('scePrvCod', function (newVal, oldVal, name) {
                    if (newVal == '') {
                        vm.cityList = [];
                    } else {
                        if (newVal) {
                            vm.cityList = [];
                            vm.cityList = addrInfoList.cityMap[newVal];
                        }
                    }
                    vm.aidPatient.sceCtyCod = '';
                });
                /* 监听市下拉选择框 */
                vm.aidPatient.$watch('sceCtyCod', function (newVal, oldVal, name) {
                    if (newVal == '') {
                        vm.cntyList = [];
                    } else {
                        if (newVal) {
                            vm.cntyList = [];
                            vm.cntyList = addrInfoList.cntyMap[newVal];
                        }
                    }
                    vm.aidPatient.sceAr0Cod = '';
                });
				//保存
                function commit() {
                    console.log("@@@@@@@@@", vm.info);
                    var list = [];
                    for (var prop in vm.info) {
                        if (vm.info.hasOwnProperty(prop)) {
                            if (prop) {
                                list.push({
                                    proCode: prop,
                                    proVal: vm.info[prop]
                                });
                            }
                        }
                    }
                    console.log(list)
                    $.ajax({
                        url: '${baseurl}cz/submitCzInfo.do',
                        type: 'post',
                        dataType: 'json',
                        contentType: 'application/json;charset=UTF-8',
                        data: JSON.stringify({
                            emgSeq: _emgSeq,
                            czzlInfList: list,
                        }),
                        success: function (res) {
                            console.log(res)
                            console.log('czzlInfList',list);
                            parent.publicFun.alert("保存成功");
                        }
                    });
                }
                // 获取时间轴信息
                function getTimeLineData() {
                    $.ajax({
                        url: '${baseurl}cz/queryCzTimelineother.do',
                        type: 'post',
                        dataType: 'json',
                        contentType: 'application/json;charset=UTF-8',
                        data: JSON.stringify({
                            emgSeq: _emgSeq
                        }),
                        success: function (res) {
                        	vm.timeList = res.resultInfo.sysdata.czTimeline
                            console.log('获取时间轴数据', res)
                        }
                    })
                }
                // 计算时间差
                function timeDiffer(val) {
                    var days = Math.floor(val / (24 * 3600 * 1000));
                    var leave1 = val % (24 * 3600 * 1000);
                    var hours = days * 24 + Math.floor(leave1 / (3600 * 1000));
                    var leave2 = leave1 % (3600 * 1000);
                    var minutes = Math.floor(leave2 / (60 * 1000));
                    var leave3 = leave2 % (60 * 1000)
                    var seconds = Math.round(leave3 / 1000)
                    if (hours == 0) {
                        var hour = '';
                    } else {
                        var hour = hours + '小时';
                    }
                    if (minutes == 0) {
                        var minute = '';
                    } else {
                        var minute = minutes + '分钟';
                    }
                    if (seconds == 0) {
                        var second = '';
                    } else {
                        var second = seconds + '秒';
                    }
                    return hour + minute + second;
                }
                // 字典
                function getDicts() {
                    var maps = [{
                        prop: 'ZYZZArr',
                        key: 'CZ_ZYZZ_COD'
                    }, //主要症状
                    {
                        prop: 'RSZZYZZArr',
                        key: 'CZ_CBZD_COD'
                    }, //溶栓组主要症状
                    {
                        prop: 'JIWSArr',
                        key: 'CZ_JWS_COD'
                    }, //既往史
                    {
                        prop: 'GMSArr',
                        key: 'CZ_GMS_COD'
                    }, //过敏史
                    {
                        prop: 'PSFYYArr',
                        key: 'CZ_PSFYY_COD'
                    }, //平时服用要
                    {
                        prop: 'YWXZArr',
                        key: 'CZ_YWXZ_COD'
                    }, //药物选择
                    {
                        prop: 'BFZArr',
                        key: 'CZ_RSBFZ_COD'
                    }, //并发症
                    {
                        prop: 'SFZSArr',
                        key: 'CZ_ZSQK_COD'
                    }, //是否阻塞
                    {
                        prop: 'SFCXArr',
                        key: 'CZ_CXQK_COD'
                    }, //是否出血
                    {
                        prop: 'nationArr',
                        key: 'XT_MZ_COD'
                    }, //民族
                    {
                        prop: 'senRctCodArr',
                        key: 'SEN_STU_COD'
                    }, //意识
                    {
                        prop: 'zgqxArr',
                        key: 'CST_DSP_COD'
                    }, //转归去向
                    {
                        prop: 'rtPabzArr',
                        key: 'CZ_JLBZ_COD'
                    }, //rtPA剂量标准
                    ];
                    maps.forEach(function (el) {
                        vm[el.prop] = publicFun.getDict(el.key) || [];
                    })
                }
                getDicts()
                // 基础信息接口
                function getCZbaseInfo(sysdata) {
                    $.ajax({
                        url: '${baseurl}cz/getCzInfo.do',
                        type: 'post',
                        dataType: 'json',
                        contentType: 'application/json;charset=UTF-8',
                        data: JSON.stringify({
                            emgSeq: _emgSeq,
	                        czzlInfList: [{
	                            sysdata: sysdata
	                        }]
                        }),
                        success: function (res) {
                        	 
                        	 var aidPatient = res.resultInfo.sysdata.czzlList;
                        	 var resObj = {};
                        	 var NIHSS1;
                        	 var indx1=0 ;
                        	 var NIHSS;
                        	 var indx=0
                             aidPatient.forEach(function(item, index){
                                 Object.getOwnPropertyNames(vm.info).forEach(function (key) {
                                     if (item.proCode == key) {
//                                      console.log(111111111111111111)
                                     vm.info[key]=item.proVal
                                     vm[item.proCode + 'Sel'] = item.proVal ? item.proVal.split(',') : [];
                                     resObj[item.proCode] = item.proVal;

                                 }
                                 if(item.proCode=='NIHSSPF02PFX'){
                                 NIHSS1=item.proVal
                                 }  
                                  if(item.proCode=='NIHSSPF01PFX'){
                                 NIHSS=item.proVal
                                 }        
                                 })

                             })
                             
                              for (var key in resObj) {
                                vm.info[key] = resObj[key];
                            }
                             console.log('获取卒中病人信息',res)
                             
							for(var key in vm.cont1){
								if(NIHSS1){
								 vm.cont1[key]=NIHSS1.split(',')[indx1]
									 indx1++
								}
							}
							for(var key in vm.cont){
								if(NIHSS){
								 vm.cont[key]=NIHSS.split(',')[indx]
									 indx++
								}
							}
							console.log(vm.cont1)

                             var _hspEmgInf = res.resultInfo.sysdata.hspemgInfCustom
                             console.log(_hspEmgInf)
                             for (var a in vm.baseInfo) {
                                 if (_hspEmgInf && _hspEmgInf.hasOwnProperty(a) && _hspEmgInf[a]) {
                                     vm.baseInfo[a] = _hspEmgInf[a];
                                 }
                             }
                             if (vm.baseInfo.sbpDownNbr && vm.baseInfo.sbpUpNbr) {
                                 vm.info.XUEYA = vm.baseInfo.sbpUpNbr + '/' + vm.baseInfo.sbpDownNbr;
                             }
                             if (vm.baseInfo.emgDat) {
                                 var time = vm.baseInfo.emgDat;
                                 vm.baseInfo.emgDat = moment(parseInt(time)).format('YYYY-MM-DD HH:mm')
                             }
                             if (vm.baseInfo.bthDat) {
                                 var bthDat = vm.baseInfo.bthDat;
                                 vm.baseInfo.bthDat = moment(parseInt(bthDat)).format('YYYY-MM-DD')
                             }
                             if (vm.baseInfo.cardType == null) {
                                 vm.baseInfo.cardType = '1'
                             }
							

                             if (vm.aidPatient['illTim'] && vm.aidPatient['illTimFlg'] == 1) {
                                 var timer = vm.aidPatient['illTim'];
                                 var newTimer = moment(new Date(timer)).format('YYYY/MM/DD');
                                 vm.aidPatient['illTim'] = newTimer;
                             }
                             try{
                            	//invitationDate 会诊邀请    consultationDate 会诊签到
                                 var invitationDate = res.resultInfo.sysdata.consultationList[0].invitationDate;
                                 var consultationDate = res.resultInfo.sysdata.consultationList[0].consultationDate;
                                 var invitationDate1 = res.resultInfo.sysdata.hspConsultationRecordsCustomJr.invitationDate;
                                 var consultationDate1 = res.resultInfo.sysdata.hspConsultationRecordsCustomJr.consultationDate;
                                 console.log(consultationDate, invitationDate)
	                             if (consultationDate) {
	                                 vm.info.TZHZSJ = moment(invitationDate).format("YYYY-MM-DD HH:mm");
	                                 vm.info.HZDDSJ = moment(consultationDate).format("YYYY-MM-DD HH:mm");
	                             }
	                             if (consultationDate1) {
	                                 vm.info.JRTZSJ = moment(invitationDate).format("YYYY-MM-DD HH:mm");
	                                 vm.info.JRDDSJ = moment(consultationDate).format("YYYY-MM-DD HH:mm");
	                             }
	                             var ZGQX = res.resultInfo.sysdata.hspemgInfCustom.cstDspCodNameNew;
	                             var zgks = _hspEmgInf.sqlDepCod;
	                             if (ZGQX){
									 vm.baseInfo.ZGQX = ZGQX+"("+zgks+")";
								 }
                             } catch (err){}
                             
                        }
                    });
                    if (sysdata == 'oneinfo') {
                    	getPatientInfo();
                        getCZbaseInfo();
                        getTimeLineData();
                    }
                }
                
              //院前信息
                function getPatientInfo() {
                    $.ajax({
                        url: '${baseurl}cz/getAidPatientByEmgSeq.do',
                        type: 'post',
                        dataType: 'json',
                        contentType: 'application/json;charset=UTF-8',
                        data: JSON.stringify({
                            emgSeq: _emgSeq
                        }),
                        success: function(res) {
                        	console.log('获取院前病人信息', res);
                        	var _aidPatientXt = res.resultInfo.sysdata.aidPatientXt;
                            var _aidPatient = res.resultInfo.sysdata.aidPatient;
                            var _ynfb = res.resultInfo.sysdata.ynfb;
                            if (_aidPatient) {
                                for (var a in vm.aidPatient) {
                                    if (_aidPatient.hasOwnProperty(a)) {
                                        vm.aidPatient[a] = _aidPatient[a];
                                    }
                                }
                            }
                            if (_aidPatientXt) {
                                for (var a in vm.aidPatientXt) {
                                    if (_aidPatientXt.hasOwnProperty(a)) {
                                        vm.aidPatientXt[a] = _aidPatientXt[a];
                                        if (a == 'ddfs' && _aidPatientXt[a] == 1) {
                                            vm.aidPatientXt.ccdw = 1;
                                        }
                                    }
                                }
                            }
                        }
                    });
                }
              
             // 检验检查
                function getXtInspection() {
                    $.ajax({
                        url: '${baseurl}cz/getCzJyjcInfo.do',
                        type: 'post',
                        dataType: 'json',
                        contentType: 'application/json;charset=UTF-8',
                        data: JSON.stringify({
                            emgSeq: _emgSeq
                        }),
                        success: function(res) {
                            var _jyjgList = res.resultInfo.sysdata.jyjgList;
                            console.log('jyjc',_jyjgList)
                            if (_jyjgList && _jyjgList.length) {
                                for (var i = 0; i < _jyjgList.length; i++) {
                                    var el = _jyjgList[i];
                                    if (_jyjgList[i].examinaim == '急诊心脏五联（POCT）') {
                                        var obj = el;
                                        vm.info.ISJGDB = '1';
                                        vm.info.SCJGDB = '2';
                                        var data = obj.data;
                                        if (data && data.length) {
                                            for (var j = 0; j < data.length; j++) {
                                                var num = data[j];
                                                if (data[j].reportItemName == '肌钙蛋白I') {
                                                    vm.info.JGDBSZ = num.result;
                                                    if (num.errorFlag == null) {
                                                        vm.info.JGDBXZ = '0';
                                                    } else {
                                                        vm.info.JGDBXZ = '1';
                                                    }
                                                    break;
                                                }
                                            }
                                        }
                                        break;
                                    }
                                }
                            }
                            var _list = res.resultInfo.sysdata.jyjgList || [];
                            if (_list && _list.length) {
                                _list.forEach(function(el) {
                                    if (el.resultDateTime) {
                                        el.resultDateTime = moment(el.resultDateTime).format('YYYY-MM-DD HH:mm:ss')
                                    }
                                });
                                vm.jylist = _list;
                                vm.currItem = _list[0];
                            }
                            var _jclist = res.resultInfo.sysdata.jcjgList || [];
                            if (_jclist && _jclist.length) {
                                _jclist.forEach(function(el) {
                                    if (el.shrq) {
                                        el.shrq = moment(el.shrq).format('YYYY-MM-DD HH:mm:ss');
                                    }
                                    el.show = false;
                                });
                                vm.jclist = _jclist;
                                // console.log(vm.list);
                                // vm.currItem = _list[0];
                            }
                        }
                    });
                }
                getXtInspection();
                getPatientInfo();
                getCZbaseInfo();
                getTimeLineData();
            </script>

            </html>