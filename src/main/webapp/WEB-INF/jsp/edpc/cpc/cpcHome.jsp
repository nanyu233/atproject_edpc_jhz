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

    <title>胸痛中心</title>

    <meta http-equiv="pragma" content="no-cache">
    <meta http-equiv="cache-control" content="no-cache">
    <meta http-equiv="expires" content="0">
    <meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
    <meta http-equiv="description" content="This is my page">
    <link rel="stylesheet" type="text/css" href="${baseurl}styles/hzszyyhems/flow.css">
    <link rel="stylesheet" type="text/css" href="${baseurl}styles/common/iconfont.css">
    <link rel="stylesheet" type="text/css" href="${baseurl}lib/easyui1.3/themes/default/easyui.css">

    <script type="text/javascript" src="${baseurl}js/public.js"></script>
    <script type="text/javascript" src="${baseurl}lib/easyui1.3/jquery-1.8.0.min.js"></script>
    <script type="text/javascript" src="${baseurl}lib/easyui1.3/jquery.easyui.min.js"></script>
    <script src="${baseurl}lib/avalon1.4.8/avalon.js" type="text/javascript"></script>
<%--    <script src="${baseurl}js/subpageJs/huzhospital/xthzdj.avalon.js?6" type="text/javascript" charset="UTF-8"></script>--%>

</head>
<body ms-controller="flowChart" class="flowChart">

<div class="flow">
    <div id="infoBar" class="infoBar">
        <div><span>姓名：</span><span>{{currPatientInfo.cstNam}}</span></div>
        <div><span>预检时间：</span><span>{{currPatientInfo.emgDatStr}}</span></div>
        <div><span>门诊号：</span><span>{{currPatientInfo.emgSeq}}</span></div>
        <div><span>初步诊断：</span><span>{{currPatientInfo.preDgnCod}}</span></div>
        <div class="printBtn" onclick="redirectToprint()">打印诊疗表</div>
        <div class="printBtn" onclick="redirectToTimeLine()">胸痛时间线</div>
    </div>
    <div class="arterial">
        <div class="countDown" ms-if="patientList.length">
            <div class="title"><i onclick="trigger()" class="iconfont icon-tongzhi" style="font-size: 18px"></i> 倒计时提醒</div>
            <div class="btnWrapper" ms-visible="showBtn">
                <span onclick="getXhyData()">血化验完成</span>
                <span onclick="getEcgFinish()">心电图完成</span>
            </div>
            <div class="item">
                <div class="child name">首份ECG时间:</div>
                <div class="child time" ms-visible="nodeTime['XDTSJ'].time">
                    <div>{{nodeTime['XDTSJ'].time}}</div>
                </div>
                <div class="child" ms-class="redFont:nodeTime['XDTSJ'].timeout" ms-visible="nodeTime['XDTSJ'].time">
                    ({{nodeTime['XDTSJ'].timeCost}}/{{nodeTime['XDTSJ'].total}}分)
                </div>
                <div class="child" ms-if="!nodeTime['XDTSJ'].time">
                    <div id="ecg" class="bar"></div>
                </div>
            </div>
            <div class="item">
                <div class="child name">CVN时间:</div>
                <div class="child time" ms-visible="nodeTime['CTNIBGSJ'].time">
                    <div>{{nodeTime['CTNIBGSJ'].time}}</div>
                </div>
                <div class="child" ms-class="redFont:nodeTime['CTNIBGSJ'].timeout" ms-visible="nodeTime['CTNIBGSJ'].time">
                    ({{nodeTime['CTNIBGSJ'].timeCost}}/{{nodeTime['CTNIBGSJ'].total}}分)
                </div>
                <div class="child" ms-if="!nodeTime['CTNIBGSJ'].time">
                    <div id="cvn" class="bar"></div>
                </div>
            </div>
            <div class="item" ms-visible="nodeTime['XDTSJ'].time">
                <div class="child name">ECG确诊时间:</div>
                <div class="child time" ms-visible="nodeTime['XDTQZSJ'].time">
                    <div>{{nodeTime['XDTQZSJ'].time}}</div>
                </div>
                <div class="child" ms-class="redFont:nodeTime['XDTQZSJ'].timeout" ms-visible="nodeTime['XDTQZSJ'].time">
                    ({{nodeTime['XDTQZSJ'].timeCost}}/{{nodeTime['XDTQZSJ'].total}}分)
                </div>
                <div class="child" ms-if="!nodeTime['XDTQZSJ'].time">
                    <div id="ecgEnd" class="bar"></div>
                </div>
            </div>
            <div class="item" ms-visible="check(6,2)">
                <div class="child name">
                    抗血小板治疗时间:
                </div>
                <div class="child time" ms-visible="nodeTime['KXXBYWGYSJ'].time">
                    <div>{{nodeTime['KXXBYWGYSJ'].time}}</div>
                </div>
                <div class="child" ms-class="redFont:nodeTime['KXXBYWGYSJ'].timeout" ms-visible="nodeTime['KXXBYWGYSJ'].time">
                    ({{nodeTime['KXXBYWGYSJ'].timeCost}}/{{nodeTime['KXXBYWGYSJ'].total}}分)
                </div>
                <div class="child" ms-if="!nodeTime['KXXBYWGYSJ'].time">
                    <div id="xxb" class="bar"></div>
                </div>
            </div>
            <div class="item" ms-visible="nodeTime['QDDGS'].time">
                <div class="child name">导管室激活时间:</div>
                <div class="child time" ms-visible="nodeTime['DGSJH'].time">
                    <div>{{nodeTime['DGSJH'].time}}</div>
                </div>
                <div class="child" ms-class="redFont:nodeTime['DGSJH'].timeout" ms-visible="nodeTime['DGSJH'].time">
                    ({{nodeTime['DGSJH'].timeCost}}/{{nodeTime['DGSJH'].total}}分)
                </div>
                <div class="child" ms-if="!nodeTime['DGSJH'].time">
                    <div id="dgs" class="bar"></div>
                </div>
            </div>
            <div class="item" ms-visible="nodeTime['DGSJH'].time">
                <div class="child name">球囊扩张时间:</div>
                <div class="child time" ms-visible="nodeTime['QNKZSJ'].time">
                    <div>{{nodeTime['QNKZSJ'].time}}</div>
                </div>
                <div class="child" ms-class="redFont:nodeTime['QNKZSJ'].timeout" ms-visible="nodeTime['QNKZSJ'].time">
                    ({{nodeTime['QNKZSJ'].timeCost}}/{{nodeTime['QNKZSJ'].total}}分)
                </div>
                <div class="child" ms-if="!nodeTime['QNKZSJ'].time">
                    <div id="d2b" class="bar"></div>
                </div>
            </div>
        </div>
        <div class="art_inner">
            <!-- 圆角端点 整体 -->
            <div>
                <div class="filletRect green" style="width: 100px">
                    进入胸痛模块
                </div>
            </div>
            <!-- 箭头线 整体-->
            <div>
                <div>
                    <div class="line_v"></div>
                </div>
            </div>
            <%-- 一行并列多个流程 --%>
            <div>
                <div class="multi_col" style="width: 350px;">
                    <%--中间线--%>
                    <div class="middle_line"></div>

                    <div class="triangle_down pos pos_l"></div>
                    <div class="floatBlock process bq_pg green">
                        <div class="window_outer" onmouseover="showWindow('2',true)" onmouseout="closeWindow('2')">
                            病情评估
                            <div class="windowInfo" id="w2">
                                <div class="window_item"><div class="title w_74">意识：</div><div>{{windowInfo['YISHI']}}</div></div>
                                <div class="window_item"><div class="title w_74">心率：</div><div>{{windowInfo['020007']}}次/分</div></div>
                                <div class="window_item"><div class="title w_74">呼吸：</div><div>{{windowInfo['020009']}}次/分</div></div>
                                <div class="window_item"><div class="title w_74">血压：</div><div>{{windowInfo['020010']}}/{{windowInfo['020011']}}mmHg</div></div>
                                <div class="window_item"><div class="title w_74">Killip分级：</div><div>{{windowInfo['KILLIP']}}级</div></div>
                            </div>
                        </div>
                    </div>
                    <div class="triangle_down pos pos_m"></div>
                    <div class="floatBlock process egc" ms-class="green:check(3,2)" ms-class-2="red:check(3,1)"
                         ms-class-3="lightGreen:check(3,3)" onclick="showEcg()">
                        <div class="window_outer" onmouseover="showWindow('3',true)" onmouseout="closeWindow('3')">
                            <span class="iconfont icon-click" ms-visible="check(3,2)"></span>ECG(心电图)
                            <div class="windowInfo" id="w3">
                                <div class="window_item"><div class="title w_142">首份心电图时间：</div><div>{{windowInfo['XDTSJ']}}</div></div>
                                <div class="window_item"><div class="title w_142">首份心电图确诊时间：</div><div>{{windowInfo['XDTQZSJ']}}</div></div>
                            </div>
                        </div>
                    </div>
                    <div class="triangle_down pos pos_r"></div>
                    <div class="floatBlock process xhy" ms-class="green:check(4,2)" ms-class-2="red:check(4,1)">
                        <div class="window_outer" onmouseover="showWindow('4',true)" onmouseout="closeWindow('4')">
                            血化验
                            <div class="windowInfo" id="w4">
                                <div class="window_item"><div class="title w_126">血清肌酐：</div><div>{{windowInfo['XQJGZ']}}μmol/L</div></div>
                                <div class="window_item"><div class="title w_126">肌钙蛋白：</div><div>{{windowInfo['CTNISZ']}}ng/ml</div></div>
                                <div class="window_item"><div class="title w_126">cTNI抽血时间：</div><div>{{windowInfo['CTNICXSJ']}}</div></div>
                                <div class="window_item"><div class="title w_126">cTNI报告时间：</div><div>{{windowInfo['CTNIBGSJ']}}</div></div>
                                <div class="window_item"><div class="title w_126">D-二聚体结果：</div><div>{{windowInfo['DEJTJGSJ']}}</div></div>
                                <div class="window_item"><div class="title w_126">BNP检测结果时间：</div><div>{{windowInfo['BNPJCJGSJ']}}</div></div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
            <!-- 箭头线（竖线） 整体-->
            <div>
                <div>
                    <div class="line_v"></div>
                </div>
                <div>
                    <div class="triangle_down"></div>
                </div>
            </div>
            <%--显示完整流程图时，初步诊断判断框左边非ACS部分--%>
            <div id="art_branch_left" class="art_branch">
                <%--竖线  非ACS节点下方--%>
                <div class="line_no_arrow">
                    <div class="line_v" style="height: 35px;"></div>
                </div>

                <div class="process" ms-class="green:check(21,2)" ms-class-2="red:check(21,1)">非ACS</div><!--
                --><div class="triangle_left"></div><!--
                --><div class="line_h" style="width: 168px"></div>
            </div>
            <div class="judge" ms-class="green:check(5,2)" ms-class-2="red:check(5,1)">
                <div onmouseover="showWindow('5',true)" onmouseout="closeWindow('5')">
                    <div class="inner" style="margin-top: 20px">初步诊断</div>
                    <div class="windowInfo" id="w5" style="transform: rotate(-45deg);top: -50px;left: 40px">
<%--                        <div>胸痛病因：{{windowInfo['CBZD']}}</div>--%>
                        <div>初步诊断医生：{{windowInfo['ZDYS']}}</div>
                        <div>初步诊断时间：{{windowInfo['CBZDSJ']}}</div>
                    </div>
                </div>
            </div>
            <%--竖直箭头线 正下方--%>
            <div id="art_branch_main">
                <div>
                    <div class="line_v"></div>
                </div>
                <div>
                    <div class="triangle_down"></div>
                </div>
            </div>
            <%--非ACS流程节点 单独显示非ACS流程时使用--%>
            <div id="non_acs_process">
                <div class="process green">非ACS</div>
                <div>
                    <div class="line_v"></div>
                </div>
            </div>
            <%--ACS流程节点 单独显示ACS流程时使用--%>
            <div id="acs_process">
                <div class="process green">ACS</div>
                <div>
                    <div class="line_v"></div>
                </div>
                <div>
                    <div class="triangle_down"></div>
                </div>
            </div>
            <%--显示完整流程图时，初步诊断判断框右边ACS部分--%>
            <div id="art_branch_right" class="art_branch">
                <div class="line_h" style="width: 168px"></div><!--
                 --><div class="triangle_right"></div><!--
                 --><div class="process" ms-class="green:check(6,2)" ms-class-2="red:check(6,1)">ACS</div>
                <%--竖线、箭头  ACS节点下方--%>
                <div class="line_arrow">
                    <div>
                        <div class="line_v" style="height: 28px;"></div>
                    </div>
                    <div>
                        <div class="triangle_down"></div>
                    </div>
                </div>
            </div>
        </div>
        <div class="consent" onclick="showTable()" id="consent">
            <i ms-visible="!showFiles" class="iconfont icon-left-double"></i><i ms-visible="showFiles" class="iconfont icon-right-double"></i>知情同意书
        </div>
        <div ms-visible="showFiles" class="fileTable">
            <table id="dg" style="width: 240px"></table>
        </div>
    </div>
    <!-- 非ACS、ACS两大分支  -->
    <div class="branch_outer">
        <div id="non_acs" class="branch">
            <div class="col_group" style="position: relative">
                <div style="position: absolute;left:127px;height: 0;width: 542px;border-top: 1px solid black"></div>
                <div class="col col_1">
                    <%--箭头线 竖直向下--%>
                    <div>
                        <div class="line_v"></div>
                    </div>
                    <div>
                        <div class="triangle_down"></div>
                    </div>
                    <%--流程框--%>
                    <div>
                        <div class="process" style="width: 75px" ms-class="green:check(22,2)"
                             ms-class-2="red:check(22,1)">
                            <div class="window_outer" onmouseover="showWindow('22',false)" onmouseout="closeWindow('22')">
                                主动脉夹层
                                <div class="windowInfo" id="w22">
                                    <div>心电图无变化</div>
                                    <div>高血压伴休克体征</div>
                                    <div>持续心裂样胸痛</div>
                                    <div>两上肢血压相差20mmHg以上</div>
                                </div>
                            </div>
                        </div>
                    </div>
                    <%--箭头线 竖直向下--%>
                    <div>
                        <div class="line_v" style="height: 26px;"></div>
                    </div>

                    <%--流程框--%>
                    <div>
                        <div class="multi_col" style="width: 180px;">
                            <div class="middle_line"></div>
                            <div class="triangle_down pos pos_l"></div>
                            <div class="process floatBlock zdm_cta">
                                <div class="window_outer" onmouseover="showWindow('31',true)" onmouseout="closeWindow('31')">
                                    主动脉CTA
                                    <div class="windowInfo" id="w31">
                                        <div>CTA诊断时间：10:10</div>
                                        <div>CTA完成时间：10:10</div>
                                        <div>通知CT室准备CTA时间：10:10</div>
                                        <div>患者到达CT室时间：10:10</div>
                                    </div>
                                </div>
                            </div>
                            <div class="triangle_down pos pos_m"></div>
                            <div class="process floatBlock xz_jc">
                                <div class="window_outer" onmouseover="showWindow('32',true)" onmouseout="closeWindow('32')">
                                    心脏超声检查
                                    <div class="windowInfo" id="w32">
                                        <div>心超检查时间：10:10</div>
                                    </div>
                                </div>
                            </div>
                            <div class="triangle_down pos pos_r"></div>
                            <div class="process floatBlock mri" ms-class="green:check(26,2)">MRI检查</div>
                        </div>
                    </div>
                    <%--箭头线 竖直向下--%>
                    <div>
                        <div class="line_v" style="height: 20px;"></div>
                    </div>
                    <div>
                        <div class="triangle_down"></div>
                    </div>
                    <%--流程框--%>
                    <div>
                        <div class="process">
                            <div class="window_outer" onmouseover="showWindow('33',true)" onmouseout="closeWindow('33')">
                                会诊
                                <div class="windowInfo" id="w33">
                                    <div>心内科会诊时间：10:10</div>
                                    <div>心内科会诊医生：张医生</div>
                                    <div>心胸外科会诊时间：10:10</div>
                                    <div>心胸外科会诊医生：张医生</div>
                                </div>
                            </div>
                        </div>
                    </div>
                    <%--箭头线 竖直向下--%>
                    <div>
                        <div class="line_v"></div>
                    </div>
                    <div>
                        <div class="triangle_down"></div>
                    </div>
                    <%--流程框--%>
                    <div>
                        <div class="process">确诊</div>
                    </div>
                    <%--箭头线 竖直向下--%>
                    <div>
                        <div class="line_v"></div>
                    </div>
                    <div>
                        <div class="triangle_down"></div>
                    </div>
                    <%--流程框--%>
                    <div>
                        <div class="process">
                            <div class="window_outer" onmouseover="showWindow('34',true)" onmouseout="closeWindow('34')">
                                转归
                                <div class="windowInfo" id="w34">
                                    <div>首诊医师：张医生</div>
                                    <div>非心源性胸痛患者转归</div>
                                    <div>患者送出急诊室时间：10:10</div>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="line_turn_right"></div>
                </div>
                <div class="col col_2">
                    <%--箭头线 竖直向下--%>
                    <div>
                        <div class="line_v"></div>
                    </div>
                    <div>
                        <div class="triangle_down"></div>
                    </div>
                    <%--流程框--%>
                    <div>
                        <div class="process" ms-class="green:check(23,2)" ms-class-2="red:check(23,1)">
                            <div class="window_outer" onmouseover="showWindow('23',false)" onmouseout="closeWindow('23')">
                                肺栓塞PE
                                <div class="windowInfo" id="w23">
                                    <div>晕厥</div>
                                    <div>低血压</div>
                                    <div>右室负荷重</div>
                                    <div>顽固性低氧血症</div>
                                </div>
                            </div>
                        </div>
                    </div>
                    <%--箭头线 竖直向下--%>
                    <div>
                        <div class="line_v" style="height: 26px;"></div>
                    </div>
                    <%--流程框--%>
                    <div>
                        <div class="multi_col" style="width: 95px">
                            <div class="triangle_down pos pos_l"></div>
                            <div class="process floatBlock fdm_cta">
                                <div class="window_outer" onmouseover="showWindow('36',true)" onmouseout="closeWindow('36')">
                                    肺动脉CTA
                                    <div class="windowInfo" id="w36">
                                        <div>CTA诊断时间：10:10</div>
                                        <div>CTA完成时间：10:10</div>
                                        <div>通知CT室准备CTA时间：10:10</div>
                                        <div>患者到达CT室时间：10:10</div>
                                    </div>
                                </div>
                            </div>
                            <div class="triangle_down pos pos_r"></div>
                            <div class="process floatBlock xz_sc">
                                <div class="window_outer" onmouseover="showWindow('37',true)" onmouseout="closeWindow('37')">
                                    心脏超声筛查
                                    <div class="windowInfo" id="w37">
                                        <div>心超检查时间：10:10</div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                    <%--箭头线 竖直向下--%>
                    <div>
                        <div class="line_v" style="height: 20px"></div>
                    </div>
                    <div>
                        <div class="triangle_down"></div>
                    </div>
                    <%--流程框--%>
                    <div>
                        <div class="process" style="width: 75px;">
                            <div class="window_outer" onmouseover="showWindow('38',true)" onmouseout="closeWindow('38')">
                                心内科会诊
                                <div class="windowInfo" id="w38">
                                    <div>心内科会诊时间：10:10</div>
                                    <div>心内科会诊医生：张医生</div>
                                </div>
                            </div>
                        </div>
                    </div>
                    <%--箭头线 竖直向下--%>
                    <div>
                        <div class="line_v"></div>
                    </div>
                    <div>
                        <div class="triangle_down"></div>
                    </div>
                    <%--流程框--%>
                    <div>
                        <div class="process">确诊</div>
                    </div>
                    <%--箭头线 竖直向下--%>
                    <div>
                        <div class="line_v"></div>
                    </div>
                    <div>
                        <div class="triangle_down"></div>
                    </div>
                    <%--流程框--%>
                    <div>
                        <div class="process" style="width: 85px">药物(抗凝药)</div>
                    </div>
                    <%--箭头线 竖直向下--%>
                    <div>
                        <div class="line_v"></div>
                    </div>
                    <div>
                        <div class="triangle_down"></div>
                    </div>
                    <%--流程框--%>
                    <div>
                        <div class="process">
                            <div class="window_outer" onmouseover="showWindow('39',true)" onmouseout="closeWindow('39')">
                                转归
                                <div class="windowInfo" id="w39" style="left: 50px;top: -60px">
                                    <div>首诊医师：张医生</div>
                                    <div>非心源性胸痛患者转归</div>
                                    <div>患者送出急诊室时间：10:10</div>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div>
                        <div class="line_h straight"></div>
                    </div>
                </div>
                <div class="col col_3">
                    <%--箭头线 竖直向下--%>
                    <div>
                        <div class="line_v"></div>
                    </div>
                    <div>
                        <div class="triangle_down"></div>
                    </div>
                    <%--流程框--%>
                    <div>
                        <div class="process" ms-class="green:check(24,2)" ms-class-2="red:check(24,1)">
                            <div class="window_outer" onmouseover="showWindow('24',false)" onmouseout="closeWindow('24')">
                                气胸
                                <div class="windowInfo" id="w24">
                                    <div>呼吸困难</div>
                                    <div>一侧肺呼吸音减弱或消失</div>
                                    <div>胸片提示气胸</div>
                                </div>
                            </div>
                        </div>
                    </div>
                    <%--箭头线 竖直向下--%>
                    <div>
                        <div class="line_v" style="height: 35px"></div>
                    </div>
                    <div>
                        <div class="triangle_down"></div>
                    </div>
                    <%--流程框--%>
                    <div>
                        <div class="process" style="width: 90px">
                            <div class="window_outer" onmouseover="showWindow('41',true)" onmouseout="closeWindow('41')">
                                胸部X线检查
                                <div class="windowInfo" id="w41">
                                    胸部X线检查时间：10:10
                                </div>
                            </div>
                        </div>
                    </div>
                    <%--箭头线 竖直向下--%>
                    <div>
                        <div class="line_v" style="height: 35px"></div>
                    </div>
                    <div>
                        <div class="triangle_down"></div>
                    </div>
                    <%--流程框--%>
                    <div>
                        <div class="process" style="width: 90px">
                            <div class="window_outer" onmouseover="showWindow('42',true)" onmouseout="closeWindow('42')">
                                心胸外科会诊
                                <div class="windowInfo" id="w42">
                                    <div>心胸外科会诊时间：10:10</div>
                                    <div>心胸外科会诊医生：张医生</div>
                                </div>
                            </div>
                        </div>
                    </div>
                    <%--箭头线 竖直向下--%>
                    <div>
                        <div class="line_v"></div>
                    </div>
                    <div>
                        <div class="triangle_down"></div>
                    </div>
                    <%--流程框--%>
                    <div>
                        <div class="process">确诊</div>
                    </div>
                    <%--箭头线 竖直向下--%>
                    <div>
                        <div class="line_v"></div>
                    </div>
                    <div>
                        <div class="triangle_down"></div>
                    </div>
                    <%--流程框--%>
                    <div>
                        <div class="process">
                            <div class="window_outer" onmouseover="showWindow('43',false)" onmouseout="closeWindow('43')">
                                转归
                                <div class="windowInfo" id="w43">
                                    住院
                                </div>
                            </div>
                        </div>
                    </div>
                    <%--箭头线 竖直向下--%>
                    <div>
                        <div class="line_v"></div>
                    </div>
                    <div>
                        <div class="triangle_down"></div>
                    </div>
                    <div style="position: relative">
                        <div class="triangle_right" style="position: absolute;left:13px;bottom: 10px"></div>
                        <div class="filletRect" ms-class="green:check(27,2)">结束27</div>
                        <div class="triangle_left" style="position: absolute;right: 13px;bottom: 10px"></div>
                    </div>
                    <div>
                        <div class="triangle_up"></div>
                    </div>
                    <div>
                        <div class="line_v" style="height: 17px"></div>
                    </div>
                </div>
                <div class="col col_4">
                    <%--箭头线 竖直向下--%>
                    <div>
                        <div class="line_v"></div>
                    </div>
                    <div>
                        <div class="triangle_down"></div>
                    </div>
                    <%--流程框--%>
                    <div>
                        <div class="process" ms-class="green:check(25,2)" ms-class-2="red:check(25,1)">
                            <div class="window_outer" onmouseover="showWindow('25',false)" onmouseout="closeWindow('25')">
                                心包填塞
                                <div class="windowInfo" id="w25">
                                    症状体征提示心包填塞
                                </div>
                            </div>
                        </div>
                    </div>
                    <%--箭头线 竖直向下--%>
                    <div>
                        <div class="line_v"></div>
                    </div>
                    <div>
                        <div class="triangle_down"></div>
                    </div>
                    <%--流程框--%>
                    <div>
                        <div class="process" style="width: 80px;height: 40px;line-height: 20px">
                            <div class="window_outer" onmouseover="showWindow('45',true)" onmouseout="closeWindow('45')">
                                超声心动图(多普勒型)
                                <div class="windowInfo" id="w45">
                                    心超检查时间：10:10
                                </div>
                            </div>
                        </div>
                    </div>
                    <%--箭头线 竖直向下--%>
                    <div>
                        <div class="line_v" style="height: 35px;"></div>
                    </div>
                    <div>
                        <div class="triangle_down"></div>
                    </div>
                    <%--流程框--%>
                    <div>
                        <div class="process" style="width: 90px">
                            <div class="window_outer" onmouseover="showWindow('46',true)" onmouseout="closeWindow('46')">
                                心胸外科会诊
                                <div class="windowInfo" id="w46">
                                    <div>心胸外科会诊时间：10:10</div>
                                    <div>心胸外科会诊医生：张医生</div>
                                </div>
                            </div>
                        </div>
                    </div>
                    <%--箭头线 竖直向下--%>
                    <div>
                        <div class="line_v"></div>
                    </div>
                    <div>
                        <div class="triangle_down"></div>
                    </div>
                    <%--流程框--%>
                    <div>
                        <div class="process">确诊</div>
                    </div>
                    <%--箭头线 竖直向下--%>
                    <div>
                        <div class="line_v"></div>
                    </div>
                    <div>
                        <div class="triangle_down"></div>
                    </div>
                    <%--流程框--%>
                    <div>
                        <div class="process">
                            <div class="window_outer" onmouseover="showWindow('47',false)" onmouseout="closeWindow('47')">
                                转归
                                <div class="windowInfo" id="w47">
                                    收入ICU
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="line_v toEnd"></div>
                </div>
                <div class="col col_5">
                    <%--箭头线 竖直向下--%>
                    <div>
                        <div class="line_v"></div>
                    </div>
                    <div>
                        <div class="triangle_down"></div>
                    </div>
                    <%--流程框--%>
                    <div>
                        <div class="process" ms-class="green:check(26,2)" ms-class-2="red:check(26,1)">其他</div>
                    </div>
                    <%--箭头线 竖直向下--%>
                    <div>
                        <div class="line_v"></div>
                    </div>
                    <div>
                        <div class="triangle_down"></div>
                    </div>
                    <%--流程框--%>
                    <div>
                        <div class="process" style="height: 40px;line-height: 20px">
                            <div class="window_outer" onmouseover="showWindow('48',false)" onmouseout="closeWindow('48')">
                                胸痛中心观察
                                <div class="windowInfo" id="w48">
                                    观察6-8小时
                                </div>
                            </div>
                        </div>
                    </div>
                    <%--箭头线 竖直向下--%>
                    <div>
                        <div class="line_v" style="height: 35px;"></div>
                    </div>
                    <div>
                        <div class="triangle_down"></div>
                    </div>
                    <%--流程框--%>
                    <div>
                        <div class="process">会诊</div>
                    </div>
                    <%--箭头线 竖直向下--%>
                    <div>
                        <div class="line_v"></div>
                    </div>
                    <div>
                        <div class="triangle_down"></div>
                    </div>
                    <%--流程框--%>
                    <div>
                        <div class="process">确诊</div>
                    </div>
                    <%--箭头线 竖直向下--%>
                    <div>
                        <div class="line_v"></div>
                    </div>
                    <div>
                        <div class="triangle_down"></div>
                    </div>
                    <%--流程框--%>
                    <div>
                        <div class="process">转归</div>
                    </div>
                    <div class="line_turn_left"></div>
                </div>
            </div>
        </div>
        <div id="acs" class="branch">
            <%--no-gap中的内容不可格式化--%>
            <div class="no-gap" style="position: relative;z-index: 99;width: 302px;text-align: center">
                <%--流程框--%>
                    <div>
                        <div class="process" ms-class="green:check(7,2)" ms-class-2="red:check(7,1)">
                            <div class="window_outer" onmouseover="showWindow('7',true)" onmouseout="closeWindow('7')">
                                <span>药物</span>
                                <div class="windowInfo" id="w7">
                                    <div>阿司匹林{{windowInfo['020016']}}+替格瑞洛{{windowInfo['020018']}}</div>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div>
                        <div class="line_v"></div>
                    </div>
                    <div>
                        <div class="triangle_down"></div>
                    </div>
                    <div class="process UA" ms-class="green:check(11,2)" ms-class-2="red:check(11,1)">不稳定心绞痛UA</div><!--
                --><div class="triangle_left"></div><!--
                --><div class="line_h" style="width: 35px"></div>
                <div class="judge" ms-class="green:check(8,2)" ms-class-2="red:check(8,1)">
<%--                    <div onmouseover="showWindow('8',true)" onmouseout="closeWindow('8')">--%>
                        <div class="inner" style="margin-top: 20px">会诊</div>
<%--                        <div class="windowInfo" id="w8" style="transform: rotate(-45deg);top: -20px;left: 45px">--%>
<%--                            <div class="window_item"><div class="title w_110">胸痛病因诊断：</div><div>{{windowInfo['XTBYZD']}}</div></div>--%>
<%--                        </div>--%>
<%--                    </div>--%>
                </div>
                <div class="line_h" style="width: 35px"></div><!--
                --><div class="triangle_right"></div><!--
                --><div class="process" ms-class="green:check(10,2)" ms-class-2="red:check(10,1)">STEMI</div><!--
            --></div>
            <div>
                <div class="col col1">
                    <%--转折线 UA和PCI指征之间--%>
                    <div class="line_turn"></div>

                    <%--箭头线 竖直向下--%>
                    <div>
                        <div class="line_v"></div>
                    </div>
                    <div>
                        <div class="triangle_down"></div>
                    </div>
                    <%--流程框--%>
                    <div>
                        <div class="process" ms-class="green:check(9,2)" ms-class-2="red:check(9,1)">NSTEMI</div>
                    </div>
                    <%--箭头线 竖直向下--%>
                    <div>
                        <div class="line_v"></div>
                    </div>
                    <div>
                        <div class="triangle_down"></div>
                    </div>
                    <%--判断框--%>
                    <div class="judge" ms-class="green:check(12,2)" ms-class-2="red:check(12,1)">
                        <div onmouseover="showWindow('12',true)" onmouseout="closeWindow('12')">
                            <div class="inner" style="margin-top: 10px">PCI指征高危?</div>
                            <div class="windowInfo" id="w12" style="transform: rotate(-45deg);top: -38px;left: -175px">
                                <div class="window_item"><div class="title w_110">年龄得分：</div><div>{{grace.ageScore}}分</div></div>
                                <div class="window_item"><div class="title w_110">心率得分：</div><div>{{grace.hrtScore}}分</div></div>
                                <div class="window_item"><div class="title w_110">收缩压得分：</div><div>{{grace.sbpScore}}分</div></div>
                                <div class="window_item"><div class="title w_110">肌酐得分：</div><div>{{grace.creScore}}分</div></div>
                                <div class="window_item"><div class="title w_110">Killip得分：</div><div>{{grace.killipScore}}分</div></div>
                                <div class="window_item"><div class="title w_110">危险因素得分：</div><div>{{grace.dangerScore}}分</div></div>
                                <div class="window_item"><div class="title w_110">Grace评分总分：</div><div>{{grace.totalScore}}分</div></div>
                                <div class="window_item"><div class="title w_110">Grace评分等级：</div><div>{{grace.grade}}</div></div>
                            </div>
                        </div>
                    </div>
                    <%--横向直线 PCI指征和治疗选择之间--%>
                    <%--                    <div class="line_h linkJudges" style="position: absolute;width: 20px"></div>--%>
                    <%--箭头线 竖直向下--%>
                    <div>
                        <div class="line_v"></div>
                    </div>
                    <div>
                        <div class="triangle_down"></div>
                    </div>
                    <%--流程框--%>
                    <div>
                        <div class="process" ms-class="green:check(18,2)" ms-class-2="red:check(18,1)" style="width: 85px">
                            <div class="window_outer" onmouseover="showWindow('18',true)" onmouseout="closeWindow('18')">
                                <span>药物(抗凝药)</span>
                                <div class="windowInfo" id="w18">
                                    <div>首次抗凝给药时间：12:00</div>
                                </div>
                            </div>
                        </div>
                    </div>
                    <%--线 抗凝药到转归--%>
                    <div>
                        <div class="line_v lineToZg_l"></div>
                    </div>
                </div>
                <div class="col col2">
                    <%--箭头线 竖直向下--%>
                    <div class="float_arrow">
                        <div>
                            <div class="line_v" style="height: 85px !important;"></div>
                        </div>
                        <div>
                            <div class="triangle_down"></div>
                        </div>
                    </div>
                    <%--斜线箭头 连接PCI指征高危和STEMI--%>
                    <div class="line_to_STEMI">
                        <div class="line_h" style="width: 155px;"></div>
                        <!--
                        -->
<%--                        <div class="triangle_right"></div>--%>
                    </div>
                    <%--判断框--%>
                    <div class="judge" style="margin-top: 75px" ms-class="green:check(13,2)" ms-class-2="red:check(13,1)">
                        <div class="inner" style="margin-top: 20px">治疗选择</div>
                    </div>
                    <%--箭头线 竖直向下--%>
                    <div>
                        <div class="line_v"></div>
                    </div>
                    <div>
                        <div class="triangle_down"></div>
                    </div>
                    <%--流程框 --%>
                    <div>
                        <div style="height: 40px;line-height: 20px" class="process" ms-class="green:check(16,2)"
                             ms-class-2="red:check(16,1)">溶栓知情同意书
                        </div>
                    </div>

                    <%--箭头线 竖直向下--%>
                    <div>
                        <div class="line_v" style="height: 20px;"></div>
                    </div>
                    <div>
                        <div class="triangle_down"></div>
                    </div>
                    <%--流程框--%>
                    <div>
                        <div class="process" ms-class="green:check(17,2)" ms-class-2="red:check(17,1)">溶栓</div>
                    </div>
                    <%--箭头线 竖直向下--%>
                    <div>
                        <div class="line_v" style="height: 20px;"></div>
                    </div>
                    <div>
                        <div class="triangle_down"></div>
                    </div>
                    <%--流程框--%>
                    <div class="process" ms-class="green:check(19,2)" ms-class-2="red:check(19,1)">
                        <div class="window_outer" onmouseover="showWindow('19',true)" onmouseout="closeWindow('19')">
                            转归
                            <div class="windowInfo" id="w19" style="left: -150px;top: -220px">
                                <div class="window_item"><div class="title w_170">急性冠脉综合征患者转归：</div><div></div></div>
                                <div class="window_item"><div class="title w_170">住院天数：</div><div></div></div>
                                <div class="window_item"><div class="title w_170">住院费用：</div><div></div></div>
                                <div class="window_item"><div class="title w_170">转院或转科时间：</div><div></div></div>
                                <div class="window_item"><div class="title w_170">转院名称：</div><div></div></div>
                                <div class="window_item"><div class="title w_170">出院时间：</div><div></div></div>
                                <div class="window_item"><div class="title w_170">出院带药：</div><div></div></div>
                                <div class="window_item"><div class="title w_170">院内出现心衰：</div><div></div></div>
                                <div class="window_item"><div class="title w_170">再灌注措施：</div><div></div></div>
                                <div class="window_item"><div class="title w_170">24h强化他汀治疗：</div><div></div></div>
                                <div class="window_item"><div class="title w_170">住院期间β阻滞剂使用：</div><div></div></div>
                            </div>
                        </div>
                    </div>
                    <%--箭头线 竖直向下--%>
                    <div>
                        <div class="line_v" style="height: 20px;"></div>
                    </div>
                    <div>
                        <div class="triangle_down"></div>
                    </div>
                    <!-- 圆角端点 整体 -->
                    <div>
                        <div class="filletRect" ms-class="green:check(20,2)" ms-class-2="red:check(20,1)">结束</div>
                    </div>
                    <%--二折连接线 治疗选择和转归之间(非PCI)--%>
                    <div class="line_two_turn"></div>
                    <div class="triangle_right" style="position: absolute;left: 16px;bottom: 67px"></div>
                    <div class="triangle_left" style="position: absolute;right: 15px;bottom: 67px"></div>
                </div>
                <div class="col col3">
                    <%--水平直线--%>
                    <div class="line_h line_pos_left"></div>
                    <%--朝右箭头--%>
                    <div class="triangle_right triangle_pos_left"></div>
                    <%--流程框--%>
                    <div style="margin-top: 90px">
                        <div style="height: 40px;line-height: 20px" class="process" ms-class="green:check(14,2)"
                             ms-class-2="red:check(14,1)">
                            <div class="window_outer" onmouseover="showWindow('14',true)" onmouseout="closeWindow('14')">
                                PCI知情同意书
                                <div class="windowInfo" id="w14" style="left: 33px;top: 20px">
                                    <div class="window_item"><div class="title w_142">开始知情谈话时间：</div><div>{{windowInfo['KSZQTHSJ']}}</div></div>
                                    <div class="window_item"><div class="title w_142">签署知情同意书时间：</div><div>{{windowInfo['QSZQTYSJ']}}</div></div>
                                </div>
                            </div>
                        </div>
                    </div>
                    <%--箭头线 竖直向下--%>
                    <div>
                        <div class="line_v" style="height: 42px"></div>
                    </div>
                    <div>
                        <div class="triangle_down"></div>
                    </div>
                    <%--流程框--%>
                    <div>
                        <div class="process" ms-class="green:check(15,2)" ms-class-2="red:check(15,1)">
                            <div class="window_outer" onmouseover="showWindow('15',true)" onmouseout="closeWindow('15')">
                                导管室
                                <div class="windowInfo" id="w15" style="left: 33px;top: -235px">
<%--                                    <div>患者出急诊室时间：{{windowInfo['']}}</div>--%>
                                    <div class="window_item"><div class="title w_170">决定介入手术时间：</div><div>{{windowInfo['030005']}}</div></div>
                                    <div class="window_item"><div class="title w_170">决定行PCI医生：</div><div>{{windowInfo['JDXPCIYS']}}</div></div>
                                    <div class="window_item"><div class="title w_170">启动导管室时间：</div><div>{{windowInfo['QDDGS']}}</div></div>
                                    <div class="window_item"><div class="title w_170">导管室激活时间：</div><div>{{windowInfo['DGSJH']}}</div></div>
                                    <div class="window_item"><div class="title w_170">患者进入导管室时间：</div><div>{{windowInfo['HZJDGSSJ']}}</div></div>
                                    <div class="window_item"><div class="title w_170">开始穿刺时间：</div><div>{{windowInfo['KSCCSJ']}}</div></div>
                                    <div class="window_item"><div class="title w_170">穿刺成功时间：</div><div>{{windowInfo['CGSJ']}}</div></div>
                                    <div class="window_item"><div class="title w_170">血管路径：</div><div>{{windowInfo['XGLJ']}}</div></div>
                                    <div class="window_item"><div class="title w_170">冠脉造影开始时间：</div><div>{{windowInfo['GMZYKSSJ']}}</div></div>
                                    <div class="window_item"><div class="title w_170">冠脉造影完成时间：</div><div>{{windowInfo['GMZYWCSJ']}}</div></div>
                                    <div class="window_item"><div class="title w_170">球囊扩张时间：</div><div>{{windowInfo['QNKZSJ']}}</div></div>
                                    <div class="window_item"><div class="title w_170">血栓抽脂：</div><div>{{windowInfo['XSCX'] == 1 ? '是' : '否'}}</div></div>
                                    <div class="window_item"><div class="title w_170">血小板GP IIb/IIIa抑制剂：</div><div>{{windowInfo['XXBYZJ'] == 1 ? '是' : '否'}}</div></div>
                                    <div class="window_item"><div class="title w_170">罪犯血管：</div><div>{{windowInfo['ZFXG']}}</div></div>
                                    <div class="window_item"><div class="title w_170">手术前罪犯血管血流TIMI：</div><div>{{windowInfo['SSQTIMI']}}级</div></div>
                                    <div class="window_item"><div class="title w_170">手术后罪犯血管血流TIMI：</div><div>{{windowInfo['SSHTIMI']}}级</div></div>
                                    <div class="window_item"><div class="title w_170">PCI手术完成时间：</div><div>{{windowInfo['PCISSWCSJ']}}</div></div>
                                    <div class="window_item"><div class="title w_170">IABP植入：</div><div>{{windowInfo['IABPZR'] == 1 ? '是' : '否' }}</div></div>
                                    <div class="window_item"><div class="title w_170">介入医生：</div><div>{{windowInfo['JRYS']}}</div></div>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div>
                        <div class="line_v lineToZg_r"></div>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>
<div class="list">
    <div class="searchBar">
        <input type="text" ms-on-input="onInput" ms-on-keypress="onKeyPress" class="searchInput" placeHolder="输入姓名搜索"/>
        <label class="toggleBtn">
            <input type="checkbox" ms-click="showHisToggle"/><span ms-class="activeBtn:showHis">包含历史</span>
        </label>
    </div>
    <ul ms-if="patientList.length">
        <li ms-repeat-el="patientList" ms-click="clickPatient(el)"
            ms-class="selected:el.emgSeq===currPatientInfo.emgSeq">
            <div class="bedNo" ms-if="el.bedNum">
                <span class="num">{{el.bedNum}}</span><span class="bed">床</span>
            </div>
            <div class="return" ms-if="!el.bedNum">已转归</div>
            <div class="info_item">
                <span style="vertical-align: middle">
                    <span class="name">{{el.cstNam}}</span><span> | </span>
                    <span ms-visible="el.cstSexCod==0" class="male">男</span>
                    <span ms-visible="el.cstSexCod==1" class="female">女</span>
                    <span> | </span><span>{{el.cstAge}}岁</span>
                </span>
                <i ms-if="el.hasUpdated" class="iconfont icon-new-msg"
                   style="color: red;font-size: 30px;vertical-align: bottom"></i>
            </div>
            <div class="info_item">
                <span class="title">预检时间:</span>
                <span>{{el.emgDatStr}}</span>
            </div>
            <div class="info_item">
                <span class="title">Killip分级:</span>
                <span ms-visible="el.killip == 0" class="killip_1">Ⅰ级</span>
                <span ms-visible="el.killip == 1" class="killip_2">Ⅱ级</span>
                <span ms-visible="el.killip == 2" class="killip_3">Ⅲ级</span>
                <span ms-visible="el.killip == 3" class="killip_4">Ⅳ级</span>
            </div>
            <div class="info_item">
                <span class="iconfont icon-iconxyang" style="color: #44b548"></span>
                <span>{{el.oxyNbr}}%</span>
                <span class="iconfont icon-heartrate" style="color:red"></span>
                <span>{{el.hrtRte}}次/分</span>
                <span class="iconfont icon-hamnatodynamometer" style="color: #f90"></span>
                <span>{{el.sbpUpNbr}}/{{el.sbpDownNbr}}</span>
            </div>
        </li>
    </ul>
    <div class="no-patient" ms-if="!patientList.length">暂无相关病人数据</div>
</div>

<script type="text/javascript">
    var locate = window.location;
    var weburl = "ws://" + locate.hostname + ":" + locate.port + "${baseurl}webSocketXt.do";
    var ws;
    var ecgTimer = null, cvnTimer = null, ecgEndTimer = null, xxbTimer = null, dgsTimer = null, d2bTimer = null;
    // 定义Avalon

    var vm = avalon.define({
        $id: 'flowChart',
        showHis:false,//是否包含历史
        searchKey:null,//搜索框输入内容
        patientList: [],//右侧胸痛病人列表
        patientFlowNodes: [],//单个病人已完成和正在进行的流程节点
        currPatientInfo: {}, //当前胸痛病人信息
        windowInfo:{},
        //后台获取的倒计时节点的时间，属性值为空或具体时间
        // nodeTime: {'XDTSJ':'', 'CTNIBGSJ':'', 'XDTQZSJ':'', 'KXXBYWGYSJ':'', 'QDDGS':'','DGSJH':'', 'QNKZSJ':''},
        nodeTime: {
            //首份ECG
            'XDTSJ':{
                time:'',//用于展示的时间 时分格式
                realTime:'',//真实时间 年月日时分格式
                timeCost:'',//质控用时
                timeout:false,//是否超时
                total:'10'//质控标准
            },
            //CVN
            'CTNIBGSJ':{
                time:'',
                realTime:'',
                timeCost:'',
                timeout:false,
                total:'20'
            },
            //ECG确诊
            'XDTQZSJ':{
                time:'',
                realTime:'',
                timeCost:'',
                timeout:false,
                total:'10'
            },
            //血小板治疗
            'KXXBYWGYSJ':{
                time:'',
                realTime:'',
                timeCost:'',
                timeout:false,
                total:'30'
            },
            //导管室启动
            'QDDGS':{
                time:'',
                realTime:'',
            },
            //导管室激活
            'DGSJH':{
                time:'',
                realTime:'',
                timeCost:'',
                timeout:false,
                total:'30'
            },
            //球囊扩张
            'QNKZSJ':{
                time:'',
                realTime:'',
                timeCost:'',
                timeout:false,
                total:'90'
            }
        },
        grace: {
            ageScore: 0,
            hrtScore: 0,
            sbpScore: 0,
            creScore: 0,
            killipScore: 0,
            dangerScore: 0,
            totalScore: 0,
            grade:'低危'
        },
        showBtn: false,
        showFiles: false,

        // "包含历史"的按钮点击事件
        showHisToggle:function(){
            vm.showHis = !vm.showHis;
            getPatients();
        },
        //搜索框输入事件
        onInput:function(e){
            vm.searchKey = this.value;
        },
        //搜索框回车事件
        onKeyPress:function(e){
            if(e.keyCode == 13){
                getPatients();
            }
        },
        // 点击右侧列表中的病人信息，根据emgSeq获取该病人已进行过的流程节点；
        // 根据获取到的节点判断需单独显示非ACS分支还是单独显示ACS分支；
        clickPatient: function (patient) {
            //获取当前病人的信息
            vm.currPatientInfo = patient;
            patient.hasUpdated = false;
            // 设置左侧流程图以及流程图上方的信息栏数据
            vm.setNodesAndInfo(patient.emgSeq);
        },
        // 根据emgSeq获取并设置每个病人的左侧流程图以及流程图上方的信息栏数据
        setNodesAndInfo: function (_emgSeq) {
            $.ajax({
                url: '${baseurl}cpc/getCpcPatientRouteInfoByEmgSeq.do',
                type: 'post',
                dataType: 'json',
                contentType: 'application/json;charset=UTF-8',
                data: JSON.stringify({
                    'emgSeq': _emgSeq
                }),
                success: function (res) {
                    // 获取节点集合
                    var list = res.resultInfo.sysdata.list;
                    vm.patientFlowNodes = list;
                    // 根据现有节点，显示流程图分支
                    vm.dealFlowNodes(list);

                    //获取该病人的节点倒计时信息
                    var countInfoList = res.resultInfo.sysdata.hspXtzlInfList;
                    vm.dealNodeTime(countInfoList);
                },
                error: function (err) {
                    //console.log(err)
                }
            });
        },
        // 根据已有的节点，判断单独显示非ACS分支或者ACS分支
        dealFlowNodes: function (list) {
            var disease = 'unknow';
            for (var i = 0; i < list.length; i++) {
                if (list[i].nodeId == 6 && list[i].status == 2) {
                    disease = 'Acs';
                }
                if (list[i].nodeId == 21 && list[i].status == 2) {
                    disease = 'nonAcs';
                }
            }
            if (disease == 'Acs') {
                showAcs();
            }
            if (disease == 'nonAcs') {
                showN_acs();
            }
            if (disease == 'unknow') {
                showAll()
            }
        },
        //根据后台获取到的流程图质控节点的时间处理倒计时
        dealNodeTime: function (countInfoList) {
            clearOldNodeTime();
            //获取倒计时节点的具体时间，赋值给Avalon的nodeTime对象
            if (countInfoList.length) {
                $.each(countInfoList, function (key, obj) {
                    vm.nodeTime[obj.proCode].realTime = publicFun.timeFormat(obj.proVal, 'yyyy/MM/dd hh:mm');
                    vm.nodeTime[obj.proCode].time = publicFun.timeFormat(obj.proVal, 'yyyy/MM/dd hh:mm').slice(-5);

                    var resObj = {timeCost: '', timeout: false};
                    if (obj.proCode == 'XDTSJ' || obj.proCode == 'CTNIBGSJ' || obj.proCode == 'KXXBYWGYSJ' || obj.proCode == 'QNKZSJ') {
                        resObj = calcTimeCost(vm.currPatientInfo.emgDatStr, obj.proVal, vm.nodeTime[obj.proCode].total);
                    }
                    if (obj.proCode == 'XDTQZSJ') {
                        resObj = calcTimeCost(vm.nodeTime['XDTSJ'].realTime, obj.proVal, vm.nodeTime[obj.proCode].total);
                    }
                    if (obj.proCode == 'DGSJH') {
                        resObj = calcTimeCost(vm.nodeTime['QDDGS'].realTime, obj.proVal, vm.nodeTime[obj.proCode].total);
                    }
                    vm.nodeTime[obj.proCode].timeCost = resObj.timeCost;
                    vm.nodeTime[obj.proCode].timeout = resObj.timeout;
                });
            }

            //清除所有定时器，防止切换不同病人时，与上个病人的倒计时定时器冲突
            var timers = [ecgTimer, cvnTimer, ecgEndTimer, xxbTimer, dgsTimer, d2bTimer];
            $.each(timers, function (key, val) {
                clearInterval(val);
            });

            //开始倒计时，点击列表的️某个病人需要即刻展示其首份心电图、血化验的完成时间或倒计时
            //XDTSJ---首份ECG时间
            if (!vm.nodeTime['XDTSJ'].time) {
                setProgressbar('ecg', vm.currPatientInfo.emgDat, 10);
                ecgTimer = setInterval(countDown('ecg', vm.currPatientInfo.emgDat, 10), 1000);
            }
            //CTNIBGSJ---CVN时间
            if (!vm.nodeTime['CTNIBGSJ'].time) {
                setProgressbar('cvn', vm.currPatientInfo.emgDat, 20);
                cvnTimer = setInterval(countDown('cvn', vm.currPatientInfo.emgDat, 20), 1000);
            }
            //若首份心电图完成，心电图确诊时间倒计时开始
            if (vm.nodeTime['XDTSJ'].time) {
                var start = new Date(vm.nodeTime['XDTSJ'].realTime).getTime();
                setProgressbar('ecgEnd', start, 10);
                ecgEndTimer = setInterval(countDown('ecgEnd', start, 10), 1000);
            }
            //若ACS节点变绿，抗血小板药物给药时间倒计时开始
            if (vm.check(6, 2)) {
                setProgressbar('xxb', vm.currPatientInfo.emgDat, 30);
                xxbTimer = setInterval(countDown('xxb', vm.currPatientInfo.emgDat, 30), 1000);
            }
            //导管室启动时间有值、激活时间为空时，导管室激活倒计时开始
            if(vm.nodeTime['QDDGS'].time && !vm.nodeTime['DGSJH'].time){
                setProgressbar('dgs', new Date(vm.nodeTime['QDDGS'].realTime).getTime(), 30);
                dgsTimer = setInterval(countDown('dgs', new Date(vm.nodeTime['QDDGS'].realTime).getTime(), 30), 1000);
            }

            //知情同意书节点变绿，D-B时间倒计时开始
            if (vm.check(14,2)) {
                setProgressbar('d2b', vm.currPatientInfo.emgDat, 90);
                d2bTimer = setInterval(countDown('d2b', vm.currPatientInfo.emgDat, 90), 1000);
            }
        },
        //在流程图节点集合中查询是否有同时满足nodeId、status的值的节点
        check: function (nodeId, status) {
            //节点集合有值时，进行判断；集合空则直接返回false
            if (vm.patientFlowNodes.length) {
                var result = false;
                $.each(vm.patientFlowNodes, function (key, obj) {
                    if (obj['nodeId'] == nodeId && obj['status'] == status) {
                        result = true;
                    }
                });
                return result;
            } else {
                return false;
            }
        }
    });
    $(function () {
        // 设置不同分辨率下顶部信息栏的宽度；
        setInfoBarWidth();
        ws = new WebSocket(weburl);
        //连接并监听websocket；
        websocketConnect();
        //获取右侧胸痛病人列表；
        getPatients();
    });
    /**
     * 获取右侧胸痛病人列表；
     * searchKey ----搜索关键字
     * showHis ----是否 包含历史
     **/
    function getPatients(){
        publicFun.httpServ('post', '${baseurl}cpc/getCpcPatientListInfo.do', {
            cstNam: vm.searchKey,
            bhls: vm.showHis
        }, function (res) {
            var list = res.resultInfo.sysdata.list;
            if (list && list.length) {
                for (var i = 0; i < list.length; i++) {
                    list[i].emgDatStr = publicFun.timeFormat(list[i].emgDat, 'yyyy/MM/dd hh:mm');//格式化预检时间
                    list[i].hasUpdated = false;//设置信息更新的标志
                }
                vm.patientList = list;
                //左侧流程图立即渲染右侧列表的第一个病人的数据
                vm.currPatientInfo = list[0];
                vm.setNodesAndInfo(list[0].emgSeq);
            }else {
                vm.patientList = [];
                vm.patientFlowNodes = [];
                vm.currPatientInfo ={};
                clearOldNodeTime();
                showAll();
            }
        });
    }

    function clearOldNodeTime() {
        //清空nodeTime旧数据；
        vm.nodeTime =  {
            //首份ECG
            'XDTSJ':{
                time:'',//用于展示的时间 时分格式
                realTime:'',//真实时间 年月日时分格式
                timeCost:'',//质控用时
                timeout:false,//是否超时
                total:'10'//质控标准
            },
            //CVN
            'CTNIBGSJ':{
                time:'',
                realTime:'',
                timeCost:'',
                timeout:false,
                total:'20'
            },
            //ECG确诊
            'XDTQZSJ':{
                time:'',
                realTime:'',
                timeCost:'',
                timeout:false,
                total:'10'
            },
            //血小板治疗
            'KXXBYWGYSJ':{
                time:'',
                realTime:'',
                timeCost:'',
                timeout:false,
                total:'30'
            },
            //导管室启动
            'QDDGS':{
                time:'',
                realTime:'',
            },
            //导管室激活
            'DGSJH':{
                time:'',
                realTime:'',
                timeCost:'',
                timeout:false,
                total:'30'
            },
            //球囊扩张
            'QNKZSJ':{
                time:'',
                realTime:'',
                timeCost:'',
                timeout:false,
                total:'90'
            }
        };
    }
    /**
     *计算质控点用时
     * 返回''时''分格式的用时和是否超时
     * start---质控开始时间
     * end---质控结束时间
     * std--质控标准（规定完成用时，如：10分钟）
     **/
    function calcTimeCost(start,end,std){
        var _start = new Date(start).getTime(),
            _end = new Date(end).getTime(),
            std_ms = std * 60 * 1000;
        var diff_ms = _end - _start,
            diff_min = parseInt(diff_ms / 1000 / 60),
            diff_s = parseInt((diff_ms % 60000) / 1000);
        return {
            timeCost: diff_min + '分' + diff_s + '秒',
            timeout: diff_ms > std_ms ? true : false
        };
    }
    //跳转到胸痛登记页面
    function redirectToprint() {
        var url = 'cpc/toXtzlPrintPage.do?emgSeq=' + vm.currPatientInfo.emgSeq;
        window.top.addTab('胸痛登记表-' + vm.currPatientInfo.cstNam, url, 'icon icon-emergency-record');
    }
    
  //跳转到胸痛随访登记页面
    function redirectTosf() {
        var url = 'cpc/toXtzlPrintPage.do?emgSeq=' + vm.currPatientInfo.emgSeq;
        window.top.addTab('胸痛登记表-' + vm.currPatientInfo.cstNam, url, 'icon icon-emergency-record');
    }
  
    //跳转到胸痛时间线
    function redirectToTimeLine() {
        var url = 'cpc/toXtzlTimeLinePage.do?emgSeq=' + vm.currPatientInfo.emgSeq;
        window.top.addTab('胸痛时间线-' + vm.currPatientInfo.cstNam, url, 'icon icon-emergency-record');
    }
    
    /* *
    * 获得以毫秒为单位的当前时间
    * */
    function getCurrTime() {
        //获取精确到分的当前时间字符串
        var nowStr = publicFun.timeFormat(new Date(), 'yyyy/MM/dd hh:mm:ss');
        return new Date(nowStr).getTime();//当前时间转毫秒
    }

    /* *
    * 每次点击患者列表的病人时，设置进度条上的剩余时间
    * barName---不同节点倒计时进度条的id
    * startTime---倒计时参照的基准时间（要求时间戳格式）
    * total---倒计时总时间（要求以min为单位）
    * */
    function setProgressbar(barName, startTime, total) {
        //获取当前时间
        var now_ms = getCurrTime();

        var total_ms = total * 60 * 1000;//倒计时时间（分转毫秒）
        var endTime_ms = startTime + total_ms;//倒计时截止时间（毫秒）

        var currVal_ms = endTime_ms - now_ms;//计算差值（毫秒）
        var currVal_min = parseInt(currVal_ms / 1000 / 60);//毫秒转分

        var currVal_s = parseInt((currVal_ms % 60000) / 1000);

        if (currVal_ms < 0) {
            $('#' + barName).progressbar({
                value: 0,
                text: '0分0秒/' + total + '分'
            });
        } else {
            $('#' + barName).progressbar({
                value: currVal_ms / total_ms * 100,
                text: currVal_min + '分' + currVal_s + '秒' + '/' + total + '分'
            });
        }
    }

    /* *
     * 计算节点倒计时剩余时间的函数，setInterval的第一个参数。
     * barName---不同节点倒计时进度条的id
     * startTime---倒计时参照的基准时间（要求时间戳格式）
     * total---倒计时总时间（要求以min为单位）
     * */
    function countDown(barName, startTime, total) {
        return function () {
            var timers = [
                {
                    type:'ecg',
                    timer:ecgTimer
                },
                {
                    type:'cvn',
                    timer:cvnTimer
                },
                {
                    type:'ecgEnd',
                    timer:ecgEndTimer
                },
                {
                    type:'xxb',
                    timer:xxbTimer
                },
                {
                    type:'dgs',
                    timer:dgsTimer
                },
                {
                    type:'d2b',
                    timer:d2bTimer
                }
            ];
            //获取当前时间
            var now_ms = getCurrTime();

            var total_ms = total * 60 * 1000;//倒计时时间（分转毫秒）
            var endTime_ms = startTime + total_ms;//倒计时截止时间（毫秒）

            var currVal_ms = endTime_ms - now_ms;//计算差值（毫秒）
            var currVal_min = parseInt(currVal_ms / 1000 / 60);//毫秒转分

            var currVal_s = parseInt((currVal_ms % 60000) / 1000);

            if (currVal_ms < 0) {
                if(barName){
                    $.each(timers,function (idx,obj) {
                        if (obj.type === barName){
                            clearInterval(obj.timer);
                        }
                    });
                }
                $('#' + barName).progressbar({
                    value: 0,
                    text: '0分0秒/' + total + '分'
                });
            } else {
                $('#' + barName).progressbar({
                    value: currVal_ms / total_ms * 100,
                    text: currVal_min + '分' + currVal_s + '秒' + '/' + total + '分'
                });
            }
        }
    }


    //根据不同分辨率设置信息栏宽度
    function setInfoBarWidth() {
        // 获取infoBar父元素的宽度，若大于1186，infoBar的宽度等于父元素宽度；否则infoBar宽度设为1186
        var _flowWidth = $('.flow').width();
        var _branchWidth = $('.branch_outer').width();
        if(_branchWidth <= _flowWidth){
            $('#infoBar').css({'width': _flowWidth + 'px'});
        }else {
            $('#infoBar').css({'width': (_branchWidth + 30) + 'px'});
        }
        // if (_flowWidth > 1186) {
        //     $('#infoBar').css({'width': _flowWidth + 'px'});
        // } else {
        //     $('#infoBar').css({'width': '1186px'});
        // }
    }

    //展示整个流程图
    function showAll() {
        //不显示知情同意书部分
        $('#consent').css({'display':'none'});
        vm.showFiles = false;

        $('#art_branch_left').css({'display': 'inline-block'});//初步诊断节点左分支 显示
        $('#art_branch_right').css({'display': 'inline-block'});//初步诊断节点右分支 显示
        $('.branch_outer').css({'margin-top': '6px', 'width': '1156px', 'padding': '0 0 10px 30px'});
        $('.art_inner').css({'margin-left': '359px'});

        $('#art_branch_main').css({'display': 'none'});//初步诊断节点正下方箭头线 不显示
        $('#acs_process').css({'display': 'none'}); //初步诊断正下方的ACS节点 不显示
        $('#non_acs_process').css({'display': 'none'});//初步诊断正下方的非ACS节点 不显示

        $('#non_acs').css({'display': 'inline-block', 'margin': '0'}); //非ACS部分的流程图显示
        $('#acs').css({'display': 'inline-block', 'margin': '0'}); //ACS部分的流程图显示

        setInfoBarWidth();
    }

    //只显示ACS分支的流程
    function showAcs() {
        commonDisplay();

        $('#consent').css({'display':'block'});

        $('#acs_process').css({'display': 'block'}); //初步诊断正下方的ACS节点 显示
        $('#non_acs_process').css({'display': 'none'});//初步诊断正下方的非ACS节点 不显示

        $('#non_acs').css({'display': 'none'}); //非ACS部分的流程图全部隐藏
        $('#acs').css({'display': 'block', 'margin-left': '373px'}); //ACS部分的所有流程图显示，并移动位置
    }

    // 只显示非ACS分支的流程
    function showN_acs() {
        commonDisplay();

        //不显示知情同意书部分
        $('#consent').css({'display':'none'});
        vm.showFiles = false;

        $('#non_acs_process').css({'display': 'block'});//初步诊断正下方的非ACS节点 显示
        $('#acs_process').css({'display': 'none'}); //初步诊断正下方的ACS节点 不显示

        $('#acs').css({'display': 'none'});
        $('#non_acs').css({'display': 'block', 'margin-left': '125px'});
    }

    //显示非ACS、ACS分支时，都需设置的样式
    function commonDisplay() {
        $('#art_branch_left').css({'display': 'none'});//初步诊断节点左分支 不显示
        $('#art_branch_right').css({'display': 'none'});//初步诊断节点右分支 不显示
        $('#art_branch_main').css({'display': 'block'});//初步诊断节点正下方箭头线 显示
        $('.branch_outer').css({'margin-top': '0', 'width': '100%', 'padding': '0'});
        $('.art_inner').css({'margin-left': '240px'});

        $('#infoBar').css({'width': $('.flow').width() + 'px'});

        setInfoBarWidth();
    }

    //点击ECG心电图节点跳转到心电图页
    function showEcg() {
        console.log("******展示心电图******");
        var show = false;
        $.each(vm.patientFlowNodes,function (idx,obj) {
            if(obj.nodeId == 3 && obj.status != 1){
                show = true;
            }
        });
        if (show){
            window.top.addTab('心电图', '${baseurl}cpc/toEcgPage.do?emgSeq='+ vm.currPatientInfo.emgSeq, 'icon icon-emergency-record');
            <%--window.top.addTab('心电图', '${baseurl}cpc/toEcgPage.do', 'icon icon-emergency-record');--%>
        }else {
        	$.messager.alert('提示信息',  '心电图未完成！', 'warning');
        }
    }

    // 获取对应节点小窗中的信息
    function getWindowInfoByNodeId(nodeId) {
        $.ajax({
            url: '${baseurl}cpc/getNodeInfoByEmgSeq.do',
            type: 'post',
            dataType: 'json',
            contentType: 'application/json;charset=UTF-8',
            data: JSON.stringify({
                'nodeId': nodeId,
                'emgSeq': vm.currPatientInfo.emgSeq
            }),
            success: function (res) {
                // console.log("******* window info*********");
                // console.log(res.resultInfo.sysdata.list);
                var infoArr = res.resultInfo.sysdata.list;
                var infoTemp = {};

                if(infoArr && infoArr.length){
                    var dicts = [
                        {prop:'YISHI',keyStr:'SEN_RCT',way:'infocode'},
                        {prop:'KILLIP',keyStr:'XT_KILL_COD',way:'infocode'},
                        {prop:'ZDYS',keyStr:'XT_CBZDYS_COD',way:'index'},
                        {prop:'JDXPCIYS',keyStr:'XT_JDXPCIYS_COD',way:'index'},
                        {prop:'XGLJ',keyStr:'XT_XGLJ_COD',way:'index'},
                        {prop:'ZFXG',keyStr:'XT_ZFXG_COD',way:'index'},
                        {prop:'SSQTIMI',keyStr:'XT_TIMI_COD',way:'index'},
                        {prop:'SSHTIMI',keyStr:'XT_TIMI_COD',way:'index'},
                        {prop:'JRYS',keyStr:'XT_DGSYS_COD',way:'index'},
                    ];
                    $.each(infoArr,function (idx,obj) {
                        if (nodeId == 12 && obj.proVal){
                            if(obj.proCode == 'NIANL'){
                                if (obj.proVal < 30)
                                    vm.grace.ageScore = 0;
                                if (obj.proVal >= 30 && obj.proVal <= 39)
                                    vm.grace.ageScore = 8;
                                if (obj.proVal >= 40 && obj.proVal <= 49)
                                    vm.grace.ageScore = 25;
                                if (obj.proVal >= 50 && obj.proVal <= 59)
                                    vm.grace.ageScore = 41;
                                if (obj.proVal >= 60 && obj.proVal <= 69)
                                    vm.grace.ageScore = 58;
                                if (obj.proVal >= 70 && obj.proVal <= 79)
                                    vm.grace.ageScore = 75;
                                if (obj.proVal >= 80 && obj.proVal <= 89)
                                    vm.grace.ageScore = 91;
                            }
                            if(obj.proCode == '020007'){
                                if (obj.proVal < 50)
                                    vm.grace.hrtScore = 0;
                                if (obj.proVal >= 50 && obj.proVal <= 69)
                                    vm.grace.hrtScore = 3;
                                if (obj.proVal >= 70 && obj.proVal <= 89)
                                    vm.grace.hrtScore = 9;
                                if (obj.proVal >= 90 && obj.proVal <= 109)
                                    vm.grace.hrtScore = 15;
                                if (obj.proVal >= 110 && obj.proVal <= 149)
                                    vm.grace.hrtScore = 24;
                                if (obj.proVal >= 150 && obj.proVal <= 199)
                                    vm.grace.hrtScore = 38;
                                if (obj.proVal >= 200)
                                    vm.grace.hrtScore = 46;
                            }
                            if(obj.proCode == '020010'){
                                if (obj.proVal < 80)
                                    vm.grace.sbpScore = 58;
                                if (obj.proVal >= 80 && obj.proVal <= 99)
                                    vm.grace.sbpScore = 53;
                                if (obj.proVal >= 100 && obj.proVal <= 119)
                                    vm.grace.sbpScore = 43;
                                if (obj.proVal >= 120 && obj.proVal <= 139)
                                    vm.grace.sbpScore = 34;
                                if (obj.proVal >= 140 && obj.proVal <= 159)
                                    vm.grace.sbpScore = 24;
                                if (obj.proVal >= 160 && obj.proVal <= 199)
                                    vm.grace.sbpScore = 10;
                                if (obj.proVal >= 200)
                                    vm.grace.sbpScore = 0;
                            }
                            if(obj.proCode == 'XQJGZ'){
                                if (obj.proVal >= 0 && obj.proVal <= 0.39)
                                    vm.grace.creScore = 1;
                                if (obj.proVal >= 0.4 && obj.proVal <= 0.79)
                                    vm.grace.creScore = 4;
                                if (obj.proVal >= 0.8 && obj.proVal <= 1.19)
                                    vm.grace.creScore = 7;
                                if (obj.proVal >= 1.2 && obj.proVal <= 1.59)
                                    vm.grace.creScore = 10;
                                if (obj.proVal >= 1.6 && obj.proVal <= 1.99)
                                    vm.grace.creScore = 13;
                                if (obj.proVal >= 2.0 && obj.proVal <= 3.99)
                                    vm.grace.creScore = 28;
                                if (obj.proVal >= 4)
                                    vm.grace.creScore = 0;
                            }
                            if (obj.proCode == 'KILLIP'){
                                if (obj.proVal == 0) vm.grace.killipScore = 0;
                                if (obj.proVal == 1) vm.grace.killipScore = 20;
                                if (obj.proVal == 2) vm.grace.killipScore = 39;
                                if (obj.proVal == 3) vm.grace.killipScore = 59;
                            }
                            if (obj.proCode == 'wxys'){
                                var sum = 0;
                                if(obj.proVal.indexOf("1") != -1 ){
                                    sum += 39;
                                }
                                if(obj.proVal.indexOf("2") != -1 ){
                                    sum += 28;
                                }
                                if(obj.proVal.indexOf("3") != -1 ){
                                    sum += 14;
                                }
                                vm.grace.dangerScore = sum;
                            }
                            var total = 0;
                            for (let prop in vm.grace) {
                                if (vm.grace.hasOwnProperty(prop) && prop != 'totalScore' && prop != 'grade') {
                                    total += vm.grace[prop];
                                }
                            }
                            vm.grace.totalScore = total;

                            if (total < 109){
                                vm.grace.grade = '低危';
                            }
                            if (total >= 109 && total <= 140){
                                vm.grace.grade = '中危';
                            }
                            if (total > 140){
                                vm.grace.grade = '高危';
                            }
                        }

                        //--------------编码转文字------------------
                        var textArr = [], way = '';
                        $.each(dicts,function (index,el) {
                            if(el.prop == obj.proCode){
                                textArr = publicFun.getDict(el.keyStr) || [];
                                way = el.way;
                            }
                        });
                        if(textArr.length && way){
                            if(way == 'infocode'){
                                $.each(textArr,function (_idx,item) {
                                    if (obj.proVal == item.infocode){
                                        obj.proVal = item.info;
                                    }
                                });
                            }else if(way == 'index'){
                                $.each(textArr,function (_idx,item) {
                                    if (obj.proVal == _idx){
                                        obj.proVal = item.info;
                                    }
                                });
                            }
                        }
                        //--------------编码转文字------------------
                        try{
                        	var val_030025 = obj.proVal.split(',')[0] + '(' + obj.proVal.split(',')[1] + ')';
                            infoTemp[obj.proCode] = obj.proCode == 'JRYS' ? val_030025 :  obj.proVal;
                        }catch(err){
                        	
                        }
                        
                        
                    });
                }
                vm.windowInfo = infoTemp;
            },
            error: function (err) {
            }
        });
    }

    //展示节点对应的信息小窗
    //update---boolean类型变量，表示该节点是否需要后台请求数据更新窗口信息
    function showWindow(id,update) {
        if(update){
            getWindowInfoByNodeId(id);
        }
        $('#w' + id).css({'display': 'block'});
    }

    //关闭节点对应的信息小窗
    function closeWindow(id) {
        $('#w' + id).css({'display': 'none'});
    }

    //建立websocket连接，监听数据更新
    function websocketConnect() {
        ws.onopen = function (evt) {
            console.log("Connection open ...");
            ws.send("Hello WebSockets!");
        };

        ws.onmessage = function (evt) {
            var info = JSON.parse(evt.data);
            console.log("&&&&&&&&&&&& WS.onmessage &&&&&&&&&&&&");
            var msg = info.sysdata;
            console.log(msg);
            //判断是否为当前展示的胸痛病人相关的信息更新,若不是当前病人则进行提示
            if (msg.emgSeq == vm.currPatientInfo.emgSeq) {
                if (msg.greenNodeId) {
                    //将已完成的流程节点加入到当前病人的节点集合
                    if(msg.greenNodeId == 3){
                        vm.patientFlowNodes.push({
                            'nodeId': msg.greenNodeId,
                            'status': msg.status
                        });

                    }else {
                        vm.patientFlowNodes.push({
                            'nodeId': msg.greenNodeId,
                            'status': '2'
                        });
                    }

                    if (msg.greenNodeId == 3) {
                    	//若首份心电图完成，心电图确诊时间倒计时开始
                        if (msg.status == 3) {
                            //心电图完成的展示时间、真实时间、用时和是否超时的赋值
                            vm.nodeTime['XDTSJ'].time = publicFun.timeFormat(new Date(msg.ecgTime), 'yyyy/MM/dd hh:mm').slice(-5);
                            vm.nodeTime['XDTSJ'].realTime = publicFun.timeFormat(new Date(msg.ecgTime), 'yyyy/MM/dd hh:mm');
                            var ecgObj = calcTimeCost(vm.currPatientInfo.emgDat,vm.nodeTime['XDTSJ'].realTime,vm.nodeTime['XDTSJ'].total);
                            vm.nodeTime['XDTSJ'].timeCost = ecgObj.timeCost;
                            vm.nodeTime['XDTSJ'].timeout = ecgObj.timeout;

                            //心电图完成倒计时停止
                            clearInterval(ecgTimer);
                            //心电图确诊倒计时开始
                            setProgressbar('ecgEnd', msg.ecgTime, 10);
                            ecgEndTimer = setInterval(countDown('ecgEnd', msg.ecgTime, 10), 1000);
                        
                        }
                        if (msg.status == 2) {
                            //心电图确诊的展示时间、真实时间、用时和是否超时的赋值
                            vm.nodeTime['XDTQZSJ'].time = publicFun.timeFormat(new Date(msg.time), 'yyyy/MM/dd hh:mm').slice(-5);
                            vm.nodeTime['XDTQZSJ'].realTime = publicFun.timeFormat(new Date(msg.time), 'yyyy/MM/dd hh:mm');
                            var ecgEndObj =  calcTimeCost(vm.nodeTime['XDTSJ'].realTime,vm.nodeTime['XDTQZSJ'].realTime,vm.nodeTime['XDTQZSJ'].total);
                            vm.nodeTime['XDTQZSJ'].timeCost = ecgEndObj.timeCost;
                            vm.nodeTime['XDTQZSJ'].timeout = ecgEndObj.timeout;

                            //ecg确诊倒计时停止
                            clearInterval(ecgEndTimer);
                        }
                    }

                    if (msg.greenNodeId == 4) {
                        //血化验的展示时间、真实时间、用时和是否超时的赋值
                        vm.nodeTime['CTNIBGSJ'].time = publicFun.timeFormat(new Date(msg.checkTime), 'yyyy/MM/dd hh:mm').slice(-5);
                        vm.nodeTime['CTNIBGSJ'].realTime = publicFun.timeFormat(new Date(msg.checkTime), 'yyyy/MM/dd hh:mm');
                        var cvnObj = calcTimeCost(vm.currPatientInfo.emgDat,vm.nodeTime['CTNIBGSJ'].realTime,vm.nodeTime['CTNIBGSJ'].total);
                        vm.nodeTime['CTNIBGSJ'].timeCost = cvnObj.timeCost;
                        vm.nodeTime['CTNIBGSJ'].timeout = cvnObj.timeout;

                        //cvn倒计时停止
                        clearInterval(cvnTimer);
                    }
                    //初步诊断结果为ACS
                    if (msg.greenNodeId == 6) {
                        showAcs();
                        //抗血小板药物给药时间倒计时开始
                        setProgressbar('xxb',vm.currPatientInfo.emgDat,30);
                        xxbTimer = setInterval(countDown('xxb',vm.currPatientInfo.emgDat,30),1000);
                    }
                    if(msg.greenNodeId == 7){
                        //血小板药物治疗的展示时间、真实时间、用时和是否超时的赋值
                        vm.nodeTime['KXXBYWGYSJ'] = publicFun.timeFormat(new Date(msg.time), 'yyyy/MM/dd hh:mm').slice(-5);
                        vm.nodeTime['KXXBYWGYSJ'] = publicFun.timeFormat(new Date(msg.time), 'yyyy/MM/dd hh:mm');
                        var xxbObj = calcTimeCost(vm.currPatientInfo.emgDat,vm.nodeTime['KXXBYWGYSJ'].realTime,vm.nodeTime['KXXBYWGYSJ'].total);
                        vm.nodeTime['KXXBYWGYSJ'].timeCost = xxbObj.timeCost;
                        vm.nodeTime['KXXBYWGYSJ'].timeout = xxbObj.timeout;

                        //血小板倒计时停止
                        clearInterval(xxbTimer);
                    }
                    //初步诊断结果为非ACS
                    if (msg.greenNodeId == 21) {
                        showN_acs();
                    }
                    //QDDGS导管室启动时间
                    if(msg.greenNodeId == 'QDDGS'){
                        //导管室启动的展示时间、真实时间的赋值
                        vm.nodeTime['QDDGS'].time = publicFun.timeFormat(new Date(msg.time), 'yyyy/MM/dd hh:mm').slice(-5);
                        vm.nodeTime['QDDGS'].realTime = publicFun.timeFormat(new Date(msg.time), 'yyyy/MM/dd hh:mm');

                        setProgressbar('dgs',new Date(msg.time).getTime(),30);
                        dgsTimer = setInterval(countDown('dgs',new Date(msg.time).getTime(),30),1000);
                    }
                    //DGSJH导管室激活时间
                    if (msg.greenNodeId == 'DGSJH'){
                        //导管室激活的展示时间、真实时间、用时和是否超时的赋值
                        vm.nodeTime['DGSJH'].time = publicFun.timeFormat(new Date(msg.time), 'yyyy/MM/dd hh:mm').slice(-5);
                        vm.nodeTime['DGSJH'].realTime = publicFun.timeFormat(new Date(msg.time), 'yyyy/MM/dd hh:mm');
                        var dgsObj = calcTimeCost(vm.nodeTime['QDDGS'].realTime,vm.nodeTime['DGSJH'].realTime,vm.nodeTime['DGSJH'].total);
                        vm.nodeTime['DGSJH'].timeCost = dgsObj.timeCost;
                        vm.nodeTime['DGSJH'].timeout = dgsObj.timeout;

                        clearInterval(dgsTimer);
                    }
                    //d-b时间开始倒计时
                    if(msg.greenNodeId == 14){
                        setProgressbar('d2b',vm.currPatientInfo.emgDat,90);
                        d2bTimer = setInterval(countDown('d2b',vm.currPatientInfo.emgDat,90),1000);
                    }

                    if(msg.greenNodeId == 'QNKZSJ'){
                        //球囊扩张(dTob)的展示时间、真实时间、用时和是否超时的赋值
                        vm.nodeTime['QNKZSJ'] = publicFun.timeFormat(new Date(msg.time), 'yyyy/MM/dd hh:mm').slice(-5);
                        vm.nodeTime['QNKZSJ'] = publicFun.timeFormat(new Date(msg.time), 'yyyy/MM/dd hh:mm');
                        var d2bObj = calcTimeCost(vm.currPatientInfo.emgDat,vm.nodeTime['QNKZSJ'].realTime,vm.nodeTime['QNKZSJ'].total);
                        vm.nodeTime['QNKZSJ'].timeCost = d2bObj.timeCost;
                        vm.nodeTime['QNKZSJ'].timeout = d2bObj.timeout;

                        clearInterval(d2bTimer);
                    }

                }
                //将正在进行(或要进行)的流程节点加入到当前病人的节点集合
                if (msg.redNodeId) {
                    vm.patientFlowNodes.push({
                        'nodeId': msg.redNodeId,
                        'status': '1'
                    });
                }

            } else {
                $.each(vm.patientList, function (key, patient) {
                    if (patient.emgSeq === msg.emgSeq) {
                        patient.hasUpdated = true;
                    }
                });
            }
        };
        //
        // ws.onclose = function(evt) {
        //     console.log("Connection closed.");
        // };
    }

    //展示知情同意书
    function showTable() {
        vm.showFiles = !vm.showFiles;
        if (vm.showFiles){
            $('#dg').datagrid({
                // url:'',
                striped: true,
                data:[
                    {code:'1030',name:'知情选择'},
                    {code:'1029',name:'患者授权书'},
                    {code:'1004',name:'病危(重)通知书'},
                    {code:'1020',name:'心导管诊疗知情同意书'},
                    {code:'1012',name:'静脉溶栓治疗同意书'},
                    {code:'1015',name:'气管插管和器械通气知情同意书'},
                    {code:'1024',name:'造影剂使用知情同意书'},
                    {code:'1040',name:'临时起搏器植入术谈话'},
                    {code:'1034',name:'血管内介入治疗知情同意书'},
                    {code:'1013',name:'拒绝或放弃医学治疗告知书'},
                    {code:'1027',name:'自动出院或转院告知书'},
                ],
                columns:[[
                    {field:'code',title:'模板号',styler:function (value,row,index) {
                            return 'font-weight:bold';
                        }},
                    {field:'name',title:'名称',width:210},
                ]],
                onDblClickRow: function (rowIndex,rowData) {
                    // console.log("++++++++++++");
                    // console.log(rowData);
                    var url = '${baseurl}zyyconsent/ConsentInfByTempno.do?tempno='+rowData.code+'&tempname='+rowData.name+'&refseqno='+vm.currPatientInfo.emgSeq;
                    window.top.addTab(rowData.name, url, 'icon icon-emergency-record');
                }
            });
        }

    }
    //*************测试按钮**************
    function getEcgFinish() {
        console.log("************心电图完成");
        console.log(vm.currPatientInfo.emgSeq);

        $.ajax({
            url: '${baseurl}testWebSocket/noticeEcgComplete.do',
            type: 'post',
            dataType: 'json',
            contentType: 'application/json;charset=UTF-8',
            data: JSON.stringify({
                'emgSeq': vm.currPatientInfo.emgSeq
            }),
            success: function (res) {

            },
            error: function (err) {
                //console.log(err)
            }
        });
    }

    function getXhyData() {
        console.log("************血化验数据");
        $.ajax({
            url: '${baseurl}testWebSocket/noticeCheckComplete.do',
            type: 'post',
            dataType: 'json',
            contentType: 'application/json;charset=UTF-8',
            data: JSON.stringify({
                'emgSeq': vm.currPatientInfo.emgSeq
            }),
            success: function (res) {

            },
            error: function (err) {
                //console.log(err)
            }
        });
    }
    function trigger(){
        vm.showBtn = !vm.showBtn;
    }


    function reload() {
        console.log('刷新局部');
    }

</script>
</body>
</html>