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
    <title>创伤中心</title>
    <link rel="stylesheet" type="text/css" href="css/edpc/csHome.css">
    <link rel="stylesheet" type="text/css" href="css/edpc/iconfont.css">
    <link rel="stylesheet" type="text/css" href="lib/easyui1.3/themes/default/easyui.css">
    <link rel="stylesheet" type="text/css" href="lib/jquery.timepicker/jquery.timepicker.min.css?6">


    <%@ include file="/WEB-INF/jsp/base/common_js.jsp" %>
    <%@ include file="/WEB-INF/jsp/eicu/eicuCommonJs.jsp" %>

    <script type="text/javascript" src="lib/easyui1.3/jquery-1.8.0.min.js"></script>
    <script type="text/javascript" src="lib/easyui1.3/jquery.easyui.min.js"></script>
    <script type="text/javascript" src="lib/moment.min.js" charset="UTF-8"></script>
    <script type="text/javascript" src="lib/raphael-min.js"></script>
    <script type="text/javascript" src="lib/avalon1.4.8/avalon.js"></script>
    <script type="text/javascript" src="lib/jquery.timepicker/jquery.timepicker.min.js" charset="UTF-8"></script>
    <script type="text/javascript" src="lib/highcharts5.0.7/code/highcharts.js"></script>
    <script type="text/javascript" src="lib/highcharts5.0.7/code/highcharts-more.js"></script>
    <%--    <script type="text/javascript" src="lib/highcharts5.0.7/code/solid-gauge.js"></script>--%>
    <script type="text/javascript" src="lib/highcharts5.0.7/code/highcharts-zh_CN.js"></script>
    <script type="text/javascript" src="js/websocket/reconnecting-websocket.min.js"></script>
</head>
<body ms-controller="cs" style="background: #eee;overflow: hidden">
<div id="win">
    <table style="display: none" id="atls" border="1">
        <tr>
            <th></th>
            <th>I级</th>
            <th>II级</th>
            <th>III级</th>
            <th>IV级</th>
        </tr>
        <tr>
            <th>失血量(ml)</th>
            <td>多达750ml</td>
            <td>750-1500</td>
            <td>1500-2000</td>
            <td>>2000</td>
        </tr>
        <tr>
            <th>失血量(%血量)</th>
            <td>多达15%</td>
            <td>15-30%</td>
            <td>30-40%</td>
            <td>>40%</td>
        </tr>
        <tr>
            <th>脉率(次/分)</th>
            <td><100</td>
            <td>100-120</td>
            <td>120-140</td>
            <td>>140</td>
        </tr>
        <tr>
            <th>收缩压</th>
            <td>正常</td>
            <td>正常</td>
            <td>降低</td>
            <td>降低</td>
        </tr>
        <tr>
            <th>脉压(mmHg)</th>
            <td>正常或增加</td>
            <td>降低</td>
            <td>降低</td>
            <td>降低</td>
        </tr>
        <tr>
            <th>呼吸频率</th>
            <td>14-20</td>
            <td>20-30</td>
            <td>30-40</td>
            <td>>35</td>
        </tr>
        <tr>
            <th>尿量(ml/h)</th>
            <td>>30</td>
            <td>20-30</td>
            <td>5-15</td>
            <td>无尿</td>
        </tr>
        <tr>
            <th>CNS/意识状态</th>
            <td>轻度焦虑</td>
            <td>中度焦虑</td>
            <td>萎靡，意识模糊</td>
            <td>意识模糊，昏睡</td>
        </tr>
        <tr>
            <th>早期液体选择</th>
            <td>晶体液</td>
            <td>晶体液</td>
            <td>晶体液和血液</td>
            <td>晶体液和血液</td>
        </tr>
    </table>

    <div style="display: none" id="xkzs">
        <div>休克指数 是临床常用的观察休克进程的指标</div>
        <div>休克指数=HR/SBP,正常值0.5左右。</div>
        <div>指数=1，表示容血量丧失20%-30%。</div>
        <div>指数>1-2时，表示血容量丧失30%-50%。</div>
    </div>

    <div style="display: none" id="xymlc">
        <div>血压脉率差 = 收缩压(mmHg) - 脉率数</div>
        <div> >1为正常。</div>
        <div> =0为休克临界点。</div>
        <div> 负数或小于1即为休克，负数越小休克越深，反之为好转。</div>
    </div>
</div>
<div class="container">
    <div class="left inlineBlock">
        <div class="hd" id="hd" ms-if="currPatientInfo">
            <div style="width: 6%;text-align: center">
                <img src="images/common/man.png" alt="" ms-if="currPatientInfo.cstSexCod == 0">
                <img src="images/common/woman.png" alt="" ms-if="currPatientInfo.cstSexCod == 1">
            </div>
            <div style="width: 88%">
                <div class="inlineBlock">
                    <span class="bedNum" ms-visible="currPatientInfo.bedNum">{{currPatientInfo.bedNum}}床</span>
                    <span ms-visible="currPatientInfo.bedNum"> |</span>
                    <span class="name">{{currPatientInfo.cstNam}}</span>
                    <span> | </span>
                    <span>{{currPatientInfo.cstAge}}岁</span>
                    <span> | </span>
                    <span>{{currPatientInfo.preDgnCod}}</span>
                </div>
                <div class="inlineBlock">
                    <div class="indicatorGroup">
                        <div class="inlineBlock indicator" ms-class="{{color1}}">
                            <div class="val" onclick="openWinDow('atls')">{{atls}}</div>
                            <div class="text">ATLS</div>
                        </div>
                        <div class="inlineBlock indicator" ms-class="{{color2}}">
                            <div class="val" onclick="openWinDow('xkzs')">{{xkzs}}</div>
                            <div class="text">休克指数</div>
                        </div>
                        <div class="inlineBlock indicator" ms-class="{{color3}}">
                            <div class="val" onclick="openWinDow('xymlc')">{{xymlc}}</div>
                            <div class="text">血压脉率差</div>
                        </div>
                        <div class="inlineBlock indicator orangeBorder" ms-click="openSco('','ABC','')">
                            <div class="val" id="abcSco">2</div>
                            <div class="text">ABC评分</div>
                        </div>
                        <div class="inlineBlock" id="board" style="width: 90px; height: 60px;"></div>
                        <div class="inlineBlock progress">
                            <div class="rect rect_r">
                                <div class="circle rightcircle"></div>
                            </div>
                            <div class="rect rect_l">
                                <div class="circle leftcircle"></div>
                            </div>
                        </div>
                        <div class="inlineBlock indicator orangeBorder">
                            <!-- <div class="val orangeFont">2</div> -->
                            <div class="text" onclick="openTabWin()">全览图</div>
                        </div>

                    </div>
                </div>

            </div>
            <div class="bodyBtn" onclick="showBodyImg()" style="background-image: url('images/edpc/csBody1.jpg')">
            </div>
        </div>
        <div class="processBar" ms-if="currPatientInfo" id="processBar">
            <div class="desc">评估流程：</div><!--
            --><div class="processWrapper">
                <div class="process">
                    <div class="txt">ABCDE</div>
                </div><!--
                --><div class="process">
                    <div class="txt">AMPLE</div>
                </div><!--
                --><div class="process">
                    <div class="txt">CRASHPLAN</div>
                </div><!--
                --><div class="process">
                    <div class="txt">辅助检查</div>
                </div>
            </div>
        </div>
        <div class="main">
            <div class="tabBar">
                <div class="desc">选择操作</div>
                <div class="tab" ms-repeat="tabs" ms-class="{{currTab == $index ? 'activeTab' : ''}}"
                     ms-click="clickTab($index)">
                    {{el}}
                </div>
            </div><!--
            --><div class="content" style="overflow-y: scroll;overflow-x: scroll">
                <div ms-visible="currTab==0" class="abcde">
                    <div class="item">
                        <div class="title inlineBlock">
                            <div class="en">A</div>
                            <div class="cn">气道</div>
                        </div>
                        <div class="subTitle inlineBlock">
                            <div class="txt">评估结果</div>
                        </div>
                        <div class="opts inlineBlock">
                            <div ms-repeat="abcde.A.pgjg" class="inlineBlock">
                                <div ms-if="el.fldTyp == 'QUOTE'">
                                    <span>{{el.fldNme}}：<span ms-attr-id="el.fldCod">暂无</span></span>
                                    <span style="display: none" ms-attr-id="'seq' + el.fldCod"></span>
                                    <span class="gcsBtn" ms-click="openSco(el.fldCod,el.varNme,'CSABC')">评分</span>
                                </div>
                                <div ms-if="el.fldTyp == 'RADIO'" class="option" ms-click="onCheck(el.fldCod,'abcde')"
                                     ms-class="{{isChecked(el.fldCod,'abcde')?'checked':''}}">
                                    {{el.fldNme}}
                                </div>
                            </div>
                        </div>
                        <div class="subTitle inlineBlock">
                            <div class="txt">治疗措施</div>
                        </div>
                        <div class="opts inlineBlock">
                            <div ms-repeat="abcde.A.zlcs" class="inlineBlock">
                                <div class="option" ms-click="onCheck(el.fldCod,'abcde')"
                                     ms-class="{{isChecked(el.fldCod,'abcde')?'checked':''}}">{{el.fldNme}}
                                </div>
                                <span class="memo" ms-if="el.memCod">{{el.memCod}}</span>
                            </div>
                        </div>
                    </div>
                    <div class="item">
                        <div class="title inlineBlock">
                            <div class="en">B</div>
                            <div class="cn">呼吸</div>
                        </div>
                        <div class="subTitle inlineBlock">
                            <div class="txt">评估结果</div>
                        </div>
                        <div class="opts inlineBlock">
                            <div ms-repeat="abcde.B.pgjg" ms-click="onCheck(el.fldCod,'abcde')"
                                 ms-class="{{isChecked(el.fldCod,'abcde')?'checked':''}}" class="option">
                                {{el.fldNme}}
                            </div>
                        </div>
                        <div class="subTitle inlineBlock">
                            <div class="txt">治疗措施</div>
                        </div>
                        <div class="opts inlineBlock">
                            <div ms-repeat="abcde.B.zlcs" class="inlineBlock">
                                <div class="option" ms-click="onCheck(el.fldCod,'abcde')"
                                     ms-class="{{isChecked(el.fldCod,'abcde')?'checked':''}}">{{el.fldNme}}
                                </div>
                                <span class="memo" ms-if="el.memCod">{{el.memCod}}</span>
                            </div>
                        </div>
                    </div>
                    <div class="item">
                        <div class="title inlineBlock">
                            <div class="en">C</div>
                            <div class="cn">循环</div>
                        </div>
                        <div class="subTitle inlineBlock">
                            <div class="txt">评估结果</div>
                        </div>
                        <div class="opts inlineBlock">
                            <div class="inlineBlock">
                                <span>意识水平：</span>
                                <select id="conscious" onchange="onSelChange('conscious','C001','abcde')">
                                    <option style='display: none'></option>
                                    <option ms-repeat="dict.ys" ms-attr-value="el.infocode"
                                            ms-attr-selected="isSelected('C001',el.infocode,'abcde')">
                                        {{el.info}}
                                    </option>
                                </select>
                            </div>
                            <div class="inlineBlock">
                                <span>皮肤色泽：</span>
                                <select id="skin" onchange="onSelChange('skin','C002','abcde')">
                                    <option style='display: none'></option>
                                    <option ms-repeat="dict.pf" ms-attr-value="el.infocode"
                                            ms-attr-selected="isSelected('C002',el.infocode,'abcde')">
                                        {{el.info}}
                                    </option>
                                </select>
                            </div>
                            <div class="inlineBlock">脉&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;搏：74次/分</div>
                            <div class="inlineBlock">血压监测：170/67 mmHg</div>
                            <div class="inlineBlock">平均动脉压：98 mmHg</div>
                        </div>
                        <div class="subTitle inlineBlock">
                            <div class="txt">治疗措施</div>
                        </div>
                        <div class="opts inlineBlock">
                            <div ms-repeat="abcde.C.zlcs" class="inlineBlock">
                                <div class="option" ms-click="onCheck(el.fldCod,'abcde')"
                                     ms-class="{{isChecked(el.fldCod,'abcde')?'checked':''}}">{{el.fldNme}}
                                </div>
                                <span class="memo" ms-if="el.memCod">{{el.memCod}}</span>
                            </div>
                        </div>
                    </div>
                    <div class="item">
                        <div class="title inlineBlock">
                            <div class="en">D</div>
                            <div class="cn">残疾</div>
                        </div>
                        <div class="subTitle inlineBlock">
                            <div class="txt">评估结果</div>
                        </div>
                        <div class="opts inlineBlock">
                            <div>
                                <span>AVPU分级：</span>
                                <select id="avpu" onchange="onSelChange('avpu','D001','abcde')">
                                    <option style='display: none'></option>
                                    <option ms-repeat="dict.avpu" ms-attr-value="el.infocode"
                                            ms-attr-selected="isSelected('D001',el.infocode,'abcde')">
                                        {{el.info}}
                                    </option>
                                </select>
                            </div>
                            <div>
                                <span>瞳孔反应：</span>
                                <select id="tkfy" onchange="onSelChange('tkfy','D002','abcde')">
                                    <option style='display: none'></option>
                                    <option ms-repeat="dict.tk" ms-attr-value="el.infocode"
                                            ms-attr-selected="isSelected('D002',el.infocode,'abcde')">
                                        {{el.info}}
                                    </option>
                                </select>
                            </div>
                            <div ms-repeat="abcde.D.pgjg">
                                <div ms-if="el.fldTyp == 'QUOTE'">
                                    <span>{{el.fldNme}}：<span ms-attr-id="el.fldCod">暂无</span></span>
                                    <span style="display: none" ms-attr-id="'seq' + el.fldCod"></span>
                                    <span class="gcsBtn" ms-click="openSco(el.fldCod,el.varNme,'CSABC')">评分</span>
                                </div>
                            </div>
                        </div>
                        <div class="subTitle inlineBlock">
                            <div class="txt">治疗措施</div>
                        </div>
                        <div class="opts inlineBlock">
                            <div ms-repeat="abcde.D.zlcs" class="inlineBlock">
                                <div class="option" ms-click="onCheck(el.fldCod,'abcde')"
                                     ms-class="{{isChecked(el.fldCod,'abcde')?'checked':''}}">{{el.fldNme}}
                                </div>
                                <span class="memo" ms-if="el.memCod">{{el.memCod}}</span>
                            </div>
                        </div>
                    </div>
                    <div class="item">
                        <div class="title inlineBlock">
                            <div class="en">E</div>
                            <div class="cn">暴露</div>
                        </div>
                        <div class="subTitle inlineBlock">
                            <div class="txt">评估结果</div>
                        </div>
                        <div class="opts inlineBlock">
                            <div ms-repeat="abcde.E.pgjg" ms-click="onCheck(el.fldCod,'abcde')"
                                 ms-class="{{isChecked(el.fldCod,'abcde')?'checked':''}}" class="option">
                                {{el.fldNme}}
                            </div>
                        </div>
                        <div class="subTitle inlineBlock">
                            <div class="txt">治疗措施</div>
                        </div>
                        <div class="opts inlineBlock">
                            <div ms-repeat="abcde.E.zlcs" class="inlineBlock">
                                <div class="option" ms-click="onCheck(el.fldCod,'abcde')"
                                     ms-class="{{isChecked(el.fldCod,'abcde')?'checked':''}}">{{el.fldNme}}
                                </div>
                                <span class="memo" ms-if="el.memCod">{{el.memCod}}</span>
                            </div>
                        </div>
                    </div>
                    <div class="btnWrapper">
                        <div class="saveBtn" onclick="saveAbcde()">保存</div>
                    </div>
                </div>
                <div ms-visible="currTab==1" class="ample">
                    <div class="item">
                        <div class="title inlineBlock">
                            <div class="en">A</div>
                            <div class="cn">过敏史</div>
                        </div>
                        <div class="content inlineBlock">
                            <div ms-repeat="ample.allergy" ms-click="onAmpleCheck('itmAls',el.infocode)"
                                 ms-class="{{isCheckedForAmple(el.infocode,'itmAls')?'checked':''}}" class="option">
                                {{el.info}}
                            </div>
                            <input type="text" class="other" ms-duplex-string="ample.itmAqt">
                        </div>
                    </div>
                    <div class="item">
                        <div class="title inlineBlock">
                            <div class="en">M</div>
                            <div class="cn">当前所服用的药物</div>
                        </div>
                        <div class="content inlineBlock">
                            <div ms-repeat="ample.psfyy" ms-click="onAmpleCheck('itmMls',el.infocode)"
                                 ms-class="{{isCheckedForAmple(el.infocode,'itmMls')?'checked':''}}" class="option">
                                {{el.info}}
                            </div>
                            <input type="text" class="other" ms-duplex-string="ample.itmMqt">
                        </div>
                    </div>
                    <div class="item">
                        <div class="title inlineBlock">
                            <div class="en">P</div>
                            <div class="cn">过去疾病史/妊娠史</div>
                        </div>
                        <div class="content inlineBlock">
                            <div ms-repeat="ample.pastHis" ms-click="onAmpleCheck('itmPls',el.infocode)"
                                 ms-class="{{isCheckedForAmple(el.infocode,'itmPls')?'checked':''}}" class="option">
                                {{el.info}}
                            </div>
                            <input type="text" class="other" ms-duplex-string="ample.itmPqt">
                        </div>
                    </div>
                    <div class="item">
                        <div class="title inlineBlock">
                            <div class="en">L</div>
                            <div class="cn">最后进食时间</div>
                        </div>
                        <div class="content inlineBlock">
                            <div>
                                <input class="Wdate spcWdate" type="text" ms-duplex-string="ample.itmLtm"
                                       onclick="WdatePicker({dateFmt:'yyyy/MM/dd HH:mm',onpicked:calcPassedTime})">
                                <span>进食：</span>
                                <input type="text" class="other" ms-duplex-string="ample.itmLfd"
                                       style="width: 280px !important;">
                                <span> 距离进食时间已过去： </span><span style="color: red">{{ample.passedTime}}</span>
                            </div>
                        </div>
                    </div>
                    <div class="item">
                        <div class="title inlineBlock">
                            <div class="en">E</div>
                            <div class="cn">与受伤有关的事故/环境</div>
                        </div>
                        <div class="content inlineBlock">
                            <textarea name="" id="" rows="6" style="width: 99%"
                                      ms-duplex-string="ample.itmEme"></textarea>
                        </div>
                    </div>
                    <div class="btnWrapper">
                        <div class="saveBtn" onclick="saveAmple()">保存</div>
                    </div>
                </div>
                <div ms-visible="currTab==2" class="exam">
                    <div class="item">
                        <div class="title inlineBlock">头颌面</div>
                        <div class="inlineBlock rightContainer">
                            <div class="inlineBlock col">
                                <div class="partName">头面部</div>
                                <div ms-repeat="tgjc.f10" ms-class="{{isChecked(el.fldCod,'tgjc')?'checked':''}}"
                                     class="option" ms-click="onCheck(el.fldCod,'tgjc',el)">
                                    {{el.fldNme}}
                                </div>
                            </div>
                            <div class="inlineBlock col">
                                <div class="partName">眼睛</div>
                                <div ms-repeat="tgjc.f11" ms-class="{{isChecked(el.fldCod,'tgjc')?'checked':''}}"
                                     class="option" ms-click="onCheck(el.fldCod,'tgjc',el)">
                                    {{el.fldNme}}
                                </div>
                            </div>
                            <div class="inlineBlock col">
                                <div class="partName">神经、耳、鼻</div>
                                <div ms-repeat="tgjc.f12" ms-class="{{isChecked(el.fldCod,'tgjc')?'checked':''}}"
                                     class="option" ms-click="onCheck(el.fldCod,'tgjc',el)">
                                    {{el.fldNme}}
                                </div>
                            </div>
                            <div class="inlineBlock col">
                                <div class="partName">口腔</div>
                                <div ms-repeat="tgjc.f13" ms-class="{{isChecked(el.fldCod,'tgjc')?'checked':''}}"
                                     class="option" ms-click="onCheck(el.fldCod,'tgjc',el)">
                                    {{el.fldNme}}
                                </div>
                            </div>
                            <div class="inlineBlock col">
                                <div class="partName">其他评估</div>
                                <div>
                                    <span>意识：</span>
                                    <select id="conscious_tgjc" onchange="onSelChange('conscious_tgjc','1401','tgjc')">
                                        <option style='display: none'></option>
                                        <option ms-repeat="dict.ys" ms-attr-value="el.infocode"
                                                ms-attr-selected="isSelected('1401',el.infocode,'tgjc')">
                                            {{el.info}}
                                        </option>
                                    </select>
                                </div>

                                <div ms-repeat="tgjc.f14">
                                    <div ms-if="el.fldTyp == 'QUOTE'">
                                        <span>{{el.fldNme}}：<span ms-attr-id="el.fldCod">暂无</span></span>
                                        <span style="display: none" ms-attr-id="'seq' + el.fldCod"></span>
                                        <span class="gcsBtn" ms-click="openSco(el.fldCod,el.varNme,'CSCPN')">评分</span>
                                    </div>
                                </div>
                                <div class="memo">
                                    (GCS<=8的患者需维持平均动脉压在80mmHg以上)
                                </div>
                                <div>
                                    <span>瞳孔评估：</span>
                                    <select id="tkpg" onchange="onSelChange('tkpg','1403','tgjc')">
                                        <option style='display: none'></option>
                                        <option ms-repeat="dict.tk" ms-attr-value="el.infocode"
                                                ms-attr-selected="isSelected('1403',el.infocode,'tgjc')">
                                            {{el.info}}
                                        </option>
                                    </select>
                                </div>
                            </div>
                            <div class="inlineBlock col lastCol">
                                <div class="dealPoint">处理要点</div>
                                <div ms-repeat="tgjc.f19" ms-class="{{isChecked(el.fldCod,'tgjc')?'checked':''}}"
                                     class="option" ms-click="onCheck(el.fldCod,'tgjc',el)">
                                    {{el.fldNme}}
                                </div>
                            </div>
                        </div>

                    </div>
                    <div class="item">
                        <div class="title inlineBlock">颈椎和颈</div>
                        <div class="inlineBlock rightContainer">
                            <div class="inlineBlock col" style="width: 32%">
                                <div class="partName">视诊颈部</div>
                                <div ms-repeat="tgjc.f20" ms-class="{{isChecked(el.fldCod,'tgjc')?'checked':''}}"
                                     class="option" ms-click="onCheck(el.fldCod,'tgjc',el)">
                                    {{el.fldNme}}
                                </div>
                            </div>
                            <div class="inlineBlock col">
                                <div class="partName">触诊颈部</div>
                                <div ms-repeat="tgjc.f21" ms-class="{{isChecked(el.fldCod,'tgjc')?'checked':''}}"
                                     class="option" ms-click="onCheck(el.fldCod,'tgjc',el)">
                                    {{el.fldNme}}
                                </div>
                            </div>
                            <div class="inlineBlock col">
                                <div class="partName">听诊颈部</div>
                                <div ms-repeat="tgjc.f22" ms-class="{{isChecked(el.fldCod,'tgjc')?'checked':''}}"
                                     class="option" ms-click="onCheck(el.fldCod,'tgjc',el)">
                                    {{el.fldNme}}
                                </div>
                            </div>
                            <div class="inlineBlock col">
                                <div class="partName">颈椎检查</div>
                                <div ms-repeat="tgjc.f23" ms-class="{{isChecked(el.fldCod,'tgjc')?'checked':''}}"
                                     class="option" ms-click="onCheck(el.fldCod,'tgjc',el)">
                                    {{el.fldNme}}
                                </div>
                            </div>
                            <div class="inlineBlock col lastCol">
                                <div class="dealPoint">处理要点</div>
                                <div ms-repeat="tgjc.f29" ms-class="{{isChecked(el.fldCod,'tgjc')?'checked':''}}"
                                     class="option" ms-click="onCheck(el.fldCod,'tgjc',el)">
                                    {{el.fldNme}}
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="item">
                        <div class="title inlineBlock">胸部</div>
                        <div class="inlineBlock rightContainer">
                            <div class="inlineBlock col" style="width: 32%">
                                <div class="partName">视诊前、侧、后胸</div>
                                <div ms-repeat="tgjc.f30" ms-class="{{isChecked(el.fldCod,'tgjc')?'checked':''}}"
                                     class="option" ms-click="onCheck(el.fldCod,'tgjc',el)">
                                    {{el.fldNme}}
                                </div>
                            </div>
                            <div class="inlineBlock col">
                                <div class="partName">触诊胸壁</div>
                                <div ms-repeat="tgjc.f31" ms-class="{{isChecked(el.fldCod,'tgjc')?'checked':''}}"
                                     class="option" ms-click="onCheck(el.fldCod,'tgjc',el)">
                                    {{el.fldNme}}
                                </div>
                            </div>
                            <div class="inlineBlock col">
                                <div class="partName">听诊胸壁</div>
                                <div ms-repeat="tgjc.f32" ms-class="{{isChecked(el.fldCod,'tgjc')?'checked':''}}"
                                     class="option" ms-click="onCheck(el.fldCod,'tgjc',el)">
                                    {{el.fldNme}}
                                </div>
                            </div>
                            <div class="inlineBlock col">
                                <div class="partName">叩诊胸部</div>
                                <div ms-repeat="tgjc.f33" ms-class="{{isChecked(el.fldCod,'tgjc')?'checked':''}}"
                                     class="option" ms-click="onCheck(el.fldCod,'tgjc',el)">
                                    {{el.fldNme}}
                                </div>
                            </div>
                            <div class="inlineBlock col lastCol">
                                <div class="dealPoint">处理要点</div>
                                <div ms-repeat="tgjc.f39" ms-class="{{isChecked(el.fldCod,'tgjc')?'checked':''}}"
                                     class="option" ms-click="onCheck(el.fldCod,'tgjc',el)">
                                    {{el.fldNme}}
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="item">
                        <div class="title inlineBlock">腹部</div>
                        <div class="inlineBlock rightContainer">
                            <div class="inlineBlock col">
                                <div class="partName">视诊腹部</div>
                                <div ms-repeat="tgjc.f40" ms-class="{{isChecked(el.fldCod,'tgjc')?'checked':''}}"
                                     class="option" ms-click="onCheck(el.fldCod,'tgjc',el)">
                                    {{el.fldNme}}
                                </div>
                            </div>
                            <div class="inlineBlock col">
                                <div class="partName">触诊腹部</div>
                                <div ms-repeat="tgjc.f41" ms-class="{{isChecked(el.fldCod,'tgjc')?'checked':''}}"
                                     class="option" ms-click="onCheck(el.fldCod,'tgjc',el)">
                                    {{el.fldNme}}
                                </div>
                            </div>
                            <div class="inlineBlock col">
                                <div class="partName">听诊腹部</div>
                                <div ms-repeat="tgjc.f42" ms-class="{{isChecked(el.fldCod,'tgjc')?'checked':''}}"
                                     class="option" ms-click="onCheck(el.fldCod,'tgjc',el)">
                                    {{el.fldNme}}
                                </div>
                            </div>
                            <div class="inlineBlock col">
                                <div class="partName">叩诊腹部</div>
                                <div ms-repeat="tgjc.f43" ms-class="{{isChecked(el.fldCod,'tgjc')?'checked':''}}"
                                     class="option" ms-click="onCheck(el.fldCod,'tgjc',el)">
                                    {{el.fldNme}}
                                </div>
                            </div>
                            <div class="inlineBlock col">
                                <div class="partName">腹部检查</div>
                                <div ms-repeat="tgjc.f44" ms-class="{{isChecked(el.fldCod,'tgjc')?'checked':''}}"
                                     class="option" ms-click="onCheck(el.fldCod,'tgjc',el)">
                                    {{el.fldNme}}
                                </div>
                            </div>
                            <div class="inlineBlock col lastCol">
                                <div class="dealPoint">处理要点</div>
                                <div ms-repeat="tgjc.f49" ms-class="{{isChecked(el.fldCod,'tgjc')?'checked':''}}"
                                     class="option" ms-click="onCheck(el.fldCod,'tgjc',el)">
                                    {{el.fldNme}}
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="item">
                        <div class="title inlineBlock">会阴阴道</div>
                        <div class="inlineBlock rightContainer">
                            <div class="inlineBlock col" style="width: 32%;">
                                <div class="partName">会阴部</div>
                                <div ms-repeat="tgjc.f50" ms-class="{{isChecked(el.fldCod,'tgjc')?'checked':''}}"
                                     class="option" ms-click="onCheck(el.fldCod,'tgjc',el)">
                                    {{el.fldNme}}
                                </div>
                            </div>
                            <div class="inlineBlock col" style="width: 32%;">
                                <div class="partName">直肠</div>
                                <div ms-repeat="tgjc.f51" ms-class="{{isChecked(el.fldCod,'tgjc')?'checked':''}}"
                                     class="option" ms-click="onCheck(el.fldCod,'tgjc',el)">
                                    {{el.fldNme}}
                                </div>
                            </div>
                            <div class="inlineBlock col">
                                <div class="partName">阴道</div>
                                <div ms-repeat="tgjc.f52" ms-class="{{isChecked(el.fldCod,'tgjc')?'checked':''}}"
                                     class="option" ms-click="onCheck(el.fldCod,'tgjc',el)">
                                    {{el.fldNme}}
                                </div>
                            </div>
                            <div class="inlineBlock col lastCol">
                                <div class="dealPoint">处理要点</div>
                                <div ms-repeat="tgjc.f59" ms-class="{{isChecked(el.fldCod,'tgjc')?'checked':''}}"
                                     class="option" ms-click="onCheck(el.fldCod,'tgjc',el)">
                                    {{el.fldNme}}
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="item">
                        <div class="title inlineBlock">肌肉骨骼</div>
                        <div class="inlineBlock rightContainer">
                            <div class="inlineBlock col" style="width: 32%">
                                <div class="partName">视诊、触诊上下肢</div>
                                <div ms-repeat="tgjc.f60" ms-class="{{isChecked(el.fldCod,'tgjc')?'checked':''}}"
                                     class="option" ms-click="onCheck(el.fldCod,'tgjc',el)">
                                    {{el.fldNme}}
                                </div>
                            </div>
                            <div class="inlineBlock col" style="width: 32%">
                                <div class="partName">视诊、触诊骨盆和胸腰椎</div>
                                <div ms-repeat="tgjc.f61" ms-class="{{isChecked(el.fldCod,'tgjc')?'checked':''}}"
                                     class="option" ms-click="onCheck(el.fldCod,'tgjc',el)">
                                    {{el.fldNme}}
                                </div>
                            </div>
                            <div class="inlineBlock col">
                                <div class="partName">骨骼检查</div>
                                <div ms-repeat="tgjc.f62" ms-class="{{isChecked(el.fldCod,'tgjc')?'checked':''}}"
                                     class="option" ms-click="onCheck(el.fldCod,'tgjc',el)">
                                    {{el.fldNme}}
                                </div>
                            </div>
                            <div class="inlineBlock col lastCol">
                                <div class="dealPoint">处理要点</div>
                                <div ms-repeat="tgjc.f69" ms-class="{{isChecked(el.fldCod,'tgjc')?'checked':''}}"
                                     class="option" ms-click="onCheck(el.fldCod,'tgjc',el)">
                                    {{el.fldNme}}
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="item">
                        <div class="title inlineBlock">神经</div>
                        <div class="inlineBlock rightContainer">
                            <div class="inlineBlock col" style="width: 32%;">
                                <div class="partName">意识评估</div>
                                <div ms-repeat="tgjc.f70" class="inlineBlock">
                                    <div ms-if="el.fldTyp == 'QUOTE'">
                                        <span>{{el.fldNme}}：<span ms-attr-id="el.fldCod">暂无</span></span>
                                        <span style="display: none" ms-attr-id="'seq' + el.fldCod"></span>
                                        <span class="gcsBtn" ms-click="openSco(el.fldCod,el.varNme,'CSCPN')">评分</span>
                                    </div>
                                </div>
                                <div class="inlineBlock">
                                    <span class="descName">意识：</span>
                                    <select id="conscious_tgjc2"
                                            onchange="onSelChange('conscious_tgjc2','7001','tgjc')">
                                        <option style='display: none'></option>
                                        <option ms-repeat="dict.ys" ms-attr-value="el.infocode"
                                                ms-attr-selected="isSelected('7001',el.infocode,'tgjc')">
                                            {{el.info}}
                                        </option>
                                    </select>
                                </div>
                                <div class="inlineBlock">
                                    <span class="descName">瞳孔左：</span>
                                    <input type="text" class="shortTxt" ms-duplex-string="tgjcTxtVals[7003]"/>mm
                                    <select id="tkzGfy" onchange="onSelChange('tkzGfy','7005','tgjc')">
                                        <option style='display: none'></option>
                                        <option ms-repeat="dict.tkgfy" ms-attr-value="el.infocode"
                                                ms-attr-selected="isSelected('7005',el.infocode,'tgjc')">
                                            {{el.info}}
                                        </option>
                                    </select>
                                </div>
                                <div class="inlineBlock">
                                    <span>其他:</span>
                                    <input type="text" class="longTxt" ms-duplex-string="tgjcTxtVals[7008]"/>
                                </div>
                                <div class="inlineBlock">
                                    <span class="descName">瞳孔右：</span>
                                    <input type="text" class="shortTxt" ms-duplex-string="tgjcTxtVals[7004]"/>mm
                                    <select id="tkyGfy" onchange="onSelChange('tkyGfy','7006','tgjc')">
                                        <option style='display: none'></option>
                                        <option ms-repeat="dict.tkgfy" ms-attr-value="el.infocode"
                                                ms-attr-selected="isSelected('7006',el.infocode,'tgjc')">
                                            {{el.info}}
                                        </option>
                                    </select>
                                </div>
                                <div class="inlineBlock">
                                    <span>其他:</span>
                                    <input type="text" class="longTxt" ms-duplex-string="tgjcTxtVals[7009]"/>
                                </div>
                                <div class="inlineBlock">
                                    <span class="descName">左右瞳孔：</span>
                                    <select name="">
                                        <option style='display: none'></option>
                                        <option value="">相等</option>
                                        <option value="">不相等</option>
                                    </select>
                                </div>
                            </div>
                            <div class="inlineBlock col" style="width: 32%">
                                <div class="partName">运动评估</div>
                                <div ms-repeat="tgjc.f71" ms-class="{{isChecked(el.fldCod,'tgjc')?'checked':''}}"
                                     class="option" ms-click="onCheck(el.fldCod,'tgjc',el)">
                                    {{el.fldNme}}
                                </div>
                            </div>
                            <div class="inlineBlock col">
                                <div class="partName">神经定位</div>
                                <div ms-repeat="tgjc.f72" ms-class="{{isChecked(el.fldCod,'tgjc')?'checked':''}}"
                                     class="option" ms-click="onCheck(el.fldCod,'tgjc',el)">
                                    {{el.fldNme}}
                                </div>
                            </div>
                            <div class="inlineBlock col lastCol">
                                <div class="dealPoint">处理要点</div>
                                <div ms-repeat="tgjc.f79" ms-class="{{isChecked(el.fldCod,'tgjc')?'checked':''}}"
                                     class="option" ms-click="onCheck(el.fldCod,'tgjc',el)">
                                    {{el.fldNme}}
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="btnWrapper">
                        <div class="saveBtn" onclick="saveTgjc()">保存</div>
                    </div>
                </div>
                <div ms-visible="currTab==3" class="eqptExam">
                    <div class="item" ms-repeat="fzjc">
                        <div class="title inlineBlock">
                            <div class="en">{{el.oaeNme}}</div>
                        </div>
                        <div class="content inlineBlock">
                            <div ms-repeat-child="el.child" ms-click="onCheck(child.fldCod,'fzjc')"
                                 ms-class="{{isChecked(child.fldCod,'fzjc')?'checked':''}}" class="option">
                                {{child.fldNme}}
                            </div>
                        </div>
                    </div>
                    <div class="btnWrapper">
                        <div class="saveBtn" onclick="saveFzjc()">保存</div>
                    </div>
                </div>
                <div ms-visible="currTab==4" class="mdt">
                    <table>
                        <tr>
                            <td>
                                <span>患者姓名：</span><span ms-if="currPatientInfo">{{currPatientInfo.cstNam}}</span>
                            </td>
                            <td>
                                <span>性别：</span><span ms-if="currPatientInfo">{{currPatientInfo.cstSexCod == 0 ? '男' : '女' }}</span>
                            </td>
                            <td>
                                <span>年龄：</span><span ms-if="currPatientInfo">{{currPatientInfo.cstAge}}岁</span>
                            </td>
                            <td>
                                <%--                            <span>到院：</span><span ms-if="currPatientInfo">{{currPatientInfo.emgDatStr}}</span>--%>
                            </td>
                        </tr>
                        <tr>
                            <td colspan="2">
                                <span>发病时间：</span><span ms-if="currPatientInfo">{{currPatientInfo.illTimeStr}}</span>
                            </td>
                            <td colspan="2">
                                <span>到院时间：</span><span ms-if="currPatientInfo">{{currPatientInfo.emgDatStr}}</span>
                            </td>
                        </tr>
                        <tr>
                            <td colspan="4">
                                <span>入院诊断：</span><span ms-if="currPatientInfo">{{currPatientInfo.preDgnCod}}</span>
                            </td>
                        </tr>
                        <tr>
                            <td style="text-align: center">受邀会诊医生</td>
                            <td colspan="3">
                                <div class="consulInfo" ms-repeat="consulList">
                                    <div>{{el.invitationDepStr}}</div>
                                    <div>{{el.invitationDocNme}}({{el.invitationDocCod}})</div>
                                    <div>{{el.phone}}</div>
                                </div>
                            </td>
                        </tr>
                        <tr ms-repeat="consulList">
                            <td colspan="4" style="background: #eeeeee">
                                <div>会诊意见：</div>
                                <textarea name="" rows="5"></textarea>
                                <span>会诊医生签名：<input type="text" class="txt"></span>
                                <span class="floatR">
                                会诊完成时间：<input class="Wdate spcWdate txt" type="text"
                                              onclick="WdatePicker({dateFmt:'yyyy/MM/dd HH:mm'})">
                            </span>
                            </td>

                        </tr>

                        <tr>
                            <td colspan="4">
                                <div>进一步治疗方案：</div>
                                <textarea name="" rows="5"></textarea>

                                <div>
                                    <div class="inlineBlock">
                                        <span class="lab">主要诊治科室：</span>
                                        <input type="text" class="txt"/>
                                    </div>
                                    <div class="inlineBlock floatR">
                                        <span class="lab">首要手术医生：</span>
                                        <input type="text" class="txt"/>
                                    </div>
                                </div>

                                <div>
                                    <div class="inlineBlock">
                                        <span class="lab">医生签名：</span>
                                        <input type="text" class="txt">
                                    </div>
                                    <div class="inlineBlock floatR">
                                        <span class="lab">时间：</span>
                                        <%--                                    ms-duplex-string=""--%>
                                        <input class="Wdate spcWdate txt" type="text"
                                               onclick="WdatePicker({dateFmt:'yyyy/MM/dd HH:mm'})">
                                    </div>
                                </div>
                            </td>
                        </tr>
                    </table>
                </div>
                <div ms-visible="currTab==5" class="sbar">
                    <div class="item">
                        <div class="title inlineBlock">
                            <div class="en">S</div>
                            <div class="cn">现况</div>
                        </div>
                        <div class="wrap">
                            <div class="inlineBlock"><span class="lab">患者姓名:</span><span ms-if="currPatientInfo">{{currPatientInfo.cstNam}}</span>
                            </div>
                            <div class="inlineBlock"><span class="lab">性别:</span><span ms-if="currPatientInfo">{{currPatientInfo.cstSexCod == 0 ? '男' : '女'}}</span>
                            </div>
                            <div class="inlineBlock"><span class="lab">年龄:</span><span ms-if="currPatientInfo">{{currPatientInfo.cstAge}}岁</span>
                            </div>
                            <div class="inlineBlock"><span class="lab">入院诊断:</span><span ms-if="currPatientInfo">{{currPatientInfo.preDgnCod}}</span>
                            </div>
                        </div>
                    </div>
                    <div class="item">
                        <div class="title inlineBlock">
                            <div class="en">B</div>
                            <div class="cn">背景</div>
                        </div>
                        <div class="wrap">
                            <div><span class="lab">患者主诉:</span><span ms-if="currPatientInfo">{{currPatientInfo.symSitDes}}</span>
                            </div>
                            <div>
                                <div class="inlineBlock"><span class="lab">发病时间:</span><span ms-if="currPatientInfo">{{currPatientInfo.illTimeStr}}</span>
                                </div>
                                <div class="inlineBlock"><span class="lab">就诊时间:</span><span ms-if="currPatientInfo">{{currPatientInfo.emgDatStr}}</span>
                                </div>
                                <div class="inlineBlock"><span class="lab">相关既往史:</span><span ms-if="currPatientInfo">{{currPatientInfo.pastHisOther}}</span>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div id="sbar">
                        <div class="item">
                            <div class="title inlineBlock">
                                <div class="en">A</div>
                                <div class="cn">评估</div>
                            </div>
                            <div class="wrap">
                                <div class="bar" style="margin-top: 0">A:异常体征</div>
                                <div>
                                    <div class="inlineBlock">
                                        <span class="lab">意识:</span>
                                        <span class="radOpt">A</span>
                                        <span class="radOpt">V</span>
                                        <span class="radOpt">P</span>
                                        <span class="radOpt">U</span>
                                    </div>
                                    <div class="inlineBlock">
                                        <span class="lab">精神状态:</span>
                                        <span class="radOpt">有神</span>
                                        <span class="radOpt">倦怠</span>
                                        <span class="radOpt">萎靡</span>
                                    </div>
                                </div>
                                <div>
                                    <div class="inlineBlock">
                                        <div style="margin: 0 0 5px 0">
                                            <span class="lab">瞳孔左:</span>
                                            <input type="text" class="short"/>
                                            <span>mm</span>
                                            <span class="radOpt">灵敏</span>
                                            <span class="radOpt">迟钝</span>
                                            <span class="radOpt">消失</span>
                                        </div>
                                        <div>
                                            <span class="lab">瞳孔右:</span>
                                            <input type="text" class="short"/>
                                            <span>mm</span>
                                            <span class="radOpt">灵敏</span>
                                            <span class="radOpt">迟钝</span>
                                            <span class="radOpt">消失</span>
                                        </div>
                                    </div>
                                    <div class="inlineBlock" style="vertical-align: top">
                                        左右:
                                    </div>
                                    <div class="inlineBlock">
                                        <span class="radOpt blockBtn" style="margin-bottom:5px">相等</span>
                                        <span class="radOpt blockBtn">不相等</span>
                                    </div>
                                    <div class="inlineBlock">
                                        <div style="margin: 0 0 5px 0">
                                            <span class="lab">其他:</span>
                                            <input type="text" class="long"/>
                                        </div>
                                        <div>
                                            <span class="lab">其他:</span>
                                            <input type="text" class="long"/>
                                        </div>
                                    </div>
                                </div>
                                <div>
                                    <span class="lab">生命体征:</span>
                                    <span class="sign">T:39℃</span>
                                    <span class="sign">P:28次/分</span>
                                    <span class="sign">R:78次/分</span>
                                    <span class="sign">BP:189/90mmHg</span>
                                </div>
                                <div>
                                    <span class="lab">皮肤完整性:</span>
                                    <span class="radOpt">完整</span>
                                    <span class="radOpt">不完整</span>
                                    <input type="text" class="long"/>
                                </div>
                                <div>
                                    <span class="lab">疼痛:</span>
                                    <span class="mulOpt">1</span>
                                    <span class="mulOpt">2</span>
                                    <span class="mulOpt">3</span>
                                    <span class="mulOpt">4</span>
                                    <span class="mulOpt">5</span>
                                    <span class="mulOpt">6</span>
                                    <span class="mulOpt">7</span>
                                    <span class="mulOpt">8</span>
                                    <span class="mulOpt">9</span>
                                    <span class="mulOpt">10</span>
                                </div>
                                <div class="bar">T:初步处理</div>
                                <div>
                                    <label><input type="checkbox"/><span>吸氧:100L/min</span></label>
                                    <span class="sign">Spo2:97%</span>

                                    <label><input type="checkbox">心电监护:</label>
                                    <span class="radOpt">有</span>
                                    <span class="radOpt">无</span>

                                    <label><input type="checkbox">开放静脉通路:</label>
                                    <span class="mulOpt">1</span>
                                    <span class="mulOpt">2</span>
                                    <span class="mulOpt">3</span>
                                    <span class="mulOpt">4</span>
                                    <span class="mulOpt">中</span>
                                </div>
                                <div class="bar">A:异常试验指标</div>
                                <div>
                                    <span class="mulOpt">血糖</span>
                                    <span class="mulOpt">血常规</span>
                                    <span class="mulOpt">电肾糖</span>
                                    <span class="mulOpt">心肌物</span>
                                    <span class="mulOpt">凝血</span>
                                    <span class="mulOpt">其他</span>
                                    <input type="text" class="long"/>
                                </div>
                                <div>
                                    <label><input type="checkbox"/><span>特殊检查:</span></label>
                                    <span class="mulOpt">X片</span>
                                    <span class="mulOpt">CT</span>
                                    <span class="mulOpt">B超</span>
                                    <span class="mulOpt">ECG</span>
                                    <span class="mulOpt">其他</span>
                                    <input type="text" class="long"/>
                                </div>
                                <div class="bar">T:进一步处理</div>
                                <div>
                                    <label style="vertical-align: top"><input
                                            type="checkbox"/><span>用&nbsp;&nbsp;药:</span></label>
                                    <textarea name="" id="medi" rows="5" style="width: 75%"></textarea>
                                </div>
                                <div>
                                    <label><input type="checkbox"/><span>导&nbsp;&nbsp;管:</span></label>
                                    <span class="mulOpt">气管插管</span>
                                    <span class="mulOpt">导尿管</span>
                                    <span class="mulOpt">胃肠减压管</span>
                                    <span class="mulOpt">胸腹腔引流管</span>

                                    <label><input type="checkbox"/><span>伤口处理:</span></label>
                                    <span class="mulOpt">清创</span>
                                    <span class="mulOpt">缝合</span>
                                    <span class="mulOpt">外固定</span>
                                    <span class="mulOpt">其他</span>
                                </div>
                                <div>
                                    <label><input type="checkbox"/><span>其&nbsp;&nbsp;他:</span></label>
                                    <input type="text" class="long"/>
                                </div>
                                <div class="bar">E:效果评价</div>
                                <div>
                                    <label><input type="checkbox"><span>效果评价:</span></label>
                                    <input type="text" class="long"/>
                                    <%--                                <button>模板</button>--%>
                                </div>
                            </div>
                        </div>
                        <div class="item">
                            <div class="title inlineBlock">
                                <div class="en">R</div>
                                <div class="cn">建议</div>
                            </div>
                            <div class="wrap">
                                <div>
                                    <label><input type="checkbox"/><span>需要准备仪器设备:</span></label>
                                    <span class="mulOpt">心电监护仪</span>
                                    <span class="mulOpt">除颤仪</span>
                                    <span class="mulOpt">抢救车</span>
                                    <span class="mulOpt">药物输注泵</span>
                                    <span class="mulOpt">其他</span>
                                    <input type="text" class="long"/>
                                </div>
                                <div>
                                    <label><input type="checkbox"/><span>需要进一步观察指标:</span></label>
                                    <span class="radOpt">有</span>
                                    <span class="radOpt">无</span>
                                    <input type="text" class="long"/>
                                </div>
                                <div>
                                    <label><input type="checkbox"/><span>需要进行急诊手术:</span></label>
                                    <span class="radOpt">有</span>
                                    <span class="radOpt">无</span>
                                    <input type="text" class="long"/>
                                </div>
                                <div style="text-align: right;padding-right: 10px">
                                    <span>转入科室：</span>
                                    <select id="depts">
                                        <option value="1">外科</option>
                                        <option value="2">内科</option>
                                    </select>
                                    <span>护士：<span id="nurse"></span></span>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="btnWrapper">
                        <div class="saveBtn" onclick="saveSbar()">保存</div>
                    </div>
                </div>
            </div>
        </div>
    </div>
    <div class="list inlineBlock">
        <div class="searchBar">
            <input type="text" ms-on-input="onInput" ms-on-keypress="onKeyPress" class="searchInput"
                   placeHolder="输入姓名搜索"/>
            <label class="toggleBtn">
                <input type="checkbox" ms-click="showHisToggle"/><span ms-class="activeBtn:showHis">历史</span>
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
                    <span class="title"><i class="iconfont icon-sick redFont"></i>发病:</span>
                    <span>{{el.illTimeStr}}</span>
                </div>
                <div class="info_item">
                    <span class="title"><i class="iconfont icon-hospital greenFont"></i>到院:</span>
                    <span>{{el.emgDatStr}}</span>
                </div>
                <div class="info_item">
                    <span class="iconfont icon-iconxyang greenFont"></span>
                    <span>{{el.oxyNbr}}%</span>
                    <span class="iconfont icon-heartrate redFont"></span>
                    <span>{{el.hrtRte}}次/分</span>
                    <span class="iconfont icon-hamnatodynamometer orangeFont"></span>
                    <span>{{el.sbpUpNbr}}/{{el.sbpDownNbr}}</span>
                </div>
            </li>
        </ul>
        <div class="no-patient" ms-if="!patientList.length">暂无相关病人数据</div>
    </div>
</div>
<div ms-visible="showBdImg" class="mask">
    <div class="maskInner">
        <div class="intro">创伤部位图示:</div>

        <div class="paperOuter">
            <div id="paperDiv">
                <div ms-if="bdData.p1" class="bdPart" id="head" style="top: 2%;left: 45%;">
                    <div class="point"></div><!--
                    --><div class="guideLine"></div>
                    <div class="info">头颌面</div>
                    <div class="detail">
                        <div ms-if="bdData.obj10.opts.length">
                            <span class="title">{{bdData.obj10.title}}</span>
                            <span class="optWrapper">
                                <span ms-repeat="bdData.obj10.opts">{{el.fldNme}}&nbsp;</span>
                            </span>
                        </div>
                        <div ms-if="bdData.obj11.opts.length">
                            <span class="title">{{bdData.obj11.title}}</span>
                            <span class="optWrapper">
                                <span ms-repeat="bdData.obj11.opts">{{el.fldNme}}&nbsp;</span>
                            </span>
                        </div>
                        <div ms-if="bdData.obj12.opts.length">
                            <span class="title">{{bdData.obj12.title}}</span>
                            <span class="optWrapper">
                                <span ms-repeat="bdData.obj12.opts">{{el.fldNme}}&nbsp;</span>
                            </span>
                        </div>
                        <div ms-if="bdData.obj13.opts.length">
                            <span class="title">{{bdData.obj13.title}}</span>
                            <span class="optWrapper">
                                <span ms-repeat="bdData.obj13.opts">{{el.fldNme}}&nbsp;</span>
                            </span>
                        </div>
                        <div ms-if="bdData.obj14.opts.length">
                            <span class="title">{{bdData.obj14.title}}</span>
                            <span class="optWrapper">
                                <span class="opt" ms-repeat="bdData.obj14.opts">
                                    <span ms-if="el.fldTyp == 'RADIO'">{{el.fldNme}}&nbsp;</span>
                                    <span ms-if="el.fldTyp != 'RADIO'">{{el.fldNme + ':' + el.fldTxt}}&nbsp;</span>
                                </span>
                            </span>
                        </div>
                        <div ms-if="bdData.obj19.opts.length">
                            <span class="title handle">{{bdData.obj19.title}}</span>
                            <span class="optWrapper">
                                <span class="opt" ms-repeat="bdData.obj19.opts">{{el.fldNme}}&nbsp;</span>
                            </span>
                        </div>
                    </div>
                </div>
                <div ms-if="bdData.p2" class="bdPart" id="neck" style="top: 14%;right: 60%;">
                    <div class="detail" style="text-align: right">
                        <div ms-if="bdData.obj20.opts.length">
                            <span class="optWrapper">
                                <span ms-repeat="bdData.obj20.opts">&nbsp;{{el.fldNme}}</span>
                            </span>
                            <span class="title">{{bdData.obj20.title}}</span>
                        </div>
                        <div ms-if="bdData.obj21.opts.length">
                            <span class="optWrapper">
                                <span ms-repeat="bdData.obj21.opts">&nbsp;{{el.fldNme}}</span>
                            </span>
                            <span class="title">{{bdData.obj21.title}}</span>
                        </div>
                        <div ms-if="bdData.obj22.opts.length">
                            <span class="optWrapper">
                                <span ms-repeat="bdData.obj22.opts">&nbsp;{{el.fldNme}}</span>
                            </span>
                            <span class="title">{{bdData.obj22.title}}</span>
                        </div>
                        <div ms-if="bdData.obj23.opts.length">
                            <span class="optWrapper">
                                <span ms-repeat="bdData.obj23.opts">&nbsp;{{el.fldNme}}</span>
                            </span>
                            <span class="title">{{bdData.obj23.title}}</span>
                        </div>
                        <div ms-if="bdData.obj29.opts.length">
                            <span class="optWrapper">
                                <span ms-repeat="bdData.obj29.opts">&nbsp;{{el.fldNme}}</span>
                            </span>
                            <span class="title handle">{{bdData.obj29.title}}</span>
                        </div>
                    </div>
                    <div class="info">颈椎和颈</div>
                    <div class="guideLine"></div><!--
                    --><div class="point"></div>
                </div>
                <div ms-if="bdData.p3" class="bdPart" id="chest" style="top: 25%;left: 45%;">
                    <div class="point"></div><!--
                    --><div class="guideLine"></div>
                    <div class="info">胸部信息</div>
                    <div class="detail">
                        <div ms-if="bdData.obj30.opts.length">
                            <span class="title">{{bdData.obj30.title}}</span>
                            <span class="optWrapper">
                                <span ms-repeat="bdData.obj30.opts">{{el.fldNme}}&nbsp;</span>
                            </span>
                        </div>
                        <div ms-if="bdData.obj31.opts.length">
                            <span class="title">{{bdData.obj31.title}}</span>
                            <span class="optWrapper">
                                <span ms-repeat="bdData.obj31.opts">{{el.fldNme}}&nbsp;</span>
                            </span>
                        </div>
                        <div ms-if="bdData.obj32.opts.length">
                            <span class="title">{{bdData.obj32.title}}</span>
                            <span class="optWrapper">
                                <span ms-repeat="bdData.obj32.opts">{{el.fldNme}}&nbsp;</span>
                            </span>
                        </div>
                        <div ms-if="bdData.obj33.opts.length">
                            <span class="title">{{bdData.obj33.title}}</span>
                            <span class="optWrapper">
                                <span ms-repeat="bdData.obj33.opts">{{el.fldNme}}&nbsp;</span>
                            </span>
                        </div>
                        <div ms-if="bdData.obj39.opts.length">
                            <span class="title handle">{{bdData.obj39.title}}</span>
                            <span class="optWrapper">
                                <span ms-repeat="bdData.obj39.opts">{{el.fldNme}}&nbsp;</span>
                            </span>
                        </div>
                    </div>
                </div>
                <div ms-if="bdData.p4" class="bdPart" id="abdomen" style="top: 42%;right: 60%;">
                    <div class="detail" style="text-align: right">
                        <div ms-if="bdData.obj40.opts.length">
                            <span class="optWrapper">
                                <span ms-repeat="bdData.obj40.opts">&nbsp;{{el.fldNme}}</span>
                            </span>
                            <span class="title">{{bdData.obj40.title}}</span>
                        </div>
                        <div ms-if="bdData.obj41.opts.length">
                            <span class="optWrapper">
                                <span ms-repeat="bdData.obj41.opts">&nbsp;{{el.fldNme}}</span>
                            </span>
                            <span class="title">{{bdData.obj41.title}}</span>
                        </div>
                        <div ms-if="bdData.obj42.opts.length">
                            <span class="optWrapper">
                                <span ms-repeat="bdData.obj42.opts">&nbsp;{{el.fldNme}}</span>
                            </span>
                            <span class="title">{{bdData.obj42.title}}</span>
                        </div>
                        <div ms-if="bdData.obj43.opts.length">
                            <span class="optWrapper">
                                <span ms-repeat="bdData.obj43.opts">&nbsp;{{el.fldNme}}</span>
                            </span>
                            <span class="title">{{bdData.obj43.title}}</span>
                        </div>
                        <div ms-if="bdData.obj44.opts.length">
                            <span class="optWrapper">
                                <span ms-repeat="bdData.obj44.opts">&nbsp;{{el.fldNme}}</span>
                            </span>
                            <span class="title">{{bdData.obj44.title}}</span>
                        </div>
                        <div ms-if="bdData.obj49.opts.length">
                            <span class="optWrapper">
                                <span ms-repeat="bdData.obj49.opts">&nbsp;{{el.fldNme}}</span>
                            </span>
                            <span class="title handle">{{bdData.obj49.title}}</span>
                        </div>
                    </div>
                    <div class="info">腹部信息</div>
                    <div class="guideLine"></div><!--
                    --><div class="point"></div>
                </div>
                <div ms-if="bdData.p5" class="bdPart" id="perineum" style="top: 50%;left: 45%;">
                    <div class="point"></div><!--
                    --><div class="guideLine"></div>
                    <div class="info">会阴阴道</div>
                    <div class="detail">
                        <div ms-if="bdData.obj50.opts.length">
                            <span class="title">{{bdData.obj50.title}}</span>
                            <span class="optWrapper">
                                <span ms-repeat="bdData.obj50.opts">&nbsp;{{el.fldNme}}</span>
                            </span>
                        </div>
                        <div ms-if="bdData.obj51.opts.length">
                            <span class="title">{{bdData.obj51.title}}</span>
                            <span class="optWrapper">
                                <span ms-repeat="bdData.obj51.opts">&nbsp;{{el.fldNme}}</span>
                            </span>
                        </div>
                        <div ms-if="bdData.obj52.opts.length">
                            <span class="title">{{bdData.obj52.title}}</span>
                            <span class="optWrapper">
                                <span ms-repeat="bdData.obj52.opts">&nbsp;{{el.fldNme}}</span>
                            </span>
                        </div>
                        <div ms-if="bdData.obj59.opts.length">
                            <span class="title handle">{{bdData.obj59.title}}</span>
                            <span class="optWrapper">
                                <span ms-repeat="bdData.obj59.opts">&nbsp;{{el.fldNme}}</span>
                            </span>
                        </div>
                    </div>
                </div>
                <div ms-if="bdData.p6" class="bdPart" id="bone" style="top: 71%;left: 58%;">
                    <div class="point"></div><!--
                    --><div class="guideLine" style="width: 108px"></div>
                    <div class="info">肌肉骨骼</div>
                    <div class="detail">
                        <div ms-if="bdData.obj60.opts.length">
                            <span class="title">{{bdData.obj60.title}}</span>
                            <span class="optWrapper">
                                <span ms-repeat="bdData.obj60.opts">{{el.fldNme}}&nbsp;</span>
                            </span>
                        </div>
                        <div ms-if="bdData.obj61.opts.length">
                            <span class="title">{{bdData.obj61.title}}</span>
                            <span class="optWrapper">
                                <span ms-repeat="bdData.obj61.opts">{{el.fldNme}}&nbsp;</span>
                            </span>
                        </div>
                        <div ms-if="bdData.obj62.opts.length">
                            <span class="title">{{bdData.obj62.title}}</span>
                            <span class="optWrapper">
                                <span ms-repeat="bdData.obj62.opts">{{el.fldNme}}&nbsp;</span>
                            </span>
                        </div>
                        <div ms-if="bdData.obj69.opts.length">
                            <span class="title handle">{{bdData.obj69.title}}</span>
                            <span class="optWrapper">
                                <span ms-repeat="bdData.obj69.opts">{{el.fldNme}}&nbsp;</span>
                            </span>
                        </div>
                    </div>
                </div>
                <div ms-if="bdData.p7" class="bdPart" id="nerve" style="top: 71%;right: 60%;">
                    <div class="detail" style="text-align: right">
                        <div ms-if="bdData.obj70.opts.length">
                            <span class="optWrapper">
                                <span ms-repeat="bdData.obj70.opts">
                                    <span ms-if="el.fldTyp == 'RADIO'">&nbsp;{{el.fldNme}}</span>
                                    <span ms-if="el.fldTyp != 'RADIO'">&nbsp;{{el.fldNme + ':' + el.fldTxt}}</span>
                                </span>
                            </span>
                            <span class="title">{{bdData.obj70.title}}</span>
                        </div>
                        <div ms-if="bdData.obj71.opts.length">
                            <span class="optWrapper">
                                <span ms-repeat="bdData.obj71.opts">&nbsp;{{el.fldNme}}</span>
                            </span>
                            <span class="title">{{bdData.obj71.title}}</span>
                        </div>
                        <div ms-if="bdData.obj72.opts.length">
                            <span class="optWrapper">
                                <span ms-repeat="bdData.obj72.opts">&nbsp;{{el.fldNme}}</span>
                            </span>
                            <span class="title">{{bdData.obj72.title}}</span>
                        </div>
                        <div ms-if="bdData.obj79.opts.length">
                            <span class="optWrapper">
                                <span ms-repeat="bdData.obj79.opts">&nbsp;{{el.fldNme}}</span>
                            </span>
                            <span class="title handle">{{bdData.obj79.title}}</span>
                        </div>
                    </div>
                    <div class="info">神经信息</div>
                    <div class="guideLine" style="border:1px solid transparent"></div><!--
                    --><div class="point" style="background: transparent"></div>
                </div>
            </div>
        </div>

        <i class="iconfont icon-close btn" onclick="closeBdImg()"></i>
    </div>
</div>
</body>

<script type="text/javascript">
    var vm = avalon.define({
        $id: 'cs',
        tabs: ['ABCDE', 'AMPLE', 'CRASHPLAN', '辅助检查', 'MDT', 'SBAR'],
        currTab: 0,
        bdData: {
            p1: false,//是否展示头面部信息
            p2: false,//是否展示颈部信息
            p3: false,//是否展示胸部信息
            p4: false,//是否展示腹部信息
            p5: false,//是否展示会阴部信息
            p6: false,//是否展示骨骼四肢信息
            p7: false,//是否展示神经系统信息
            obj10: {
                title: '头面部',
                opts: []
            },
            obj11: {
                title: '眼睛',
                opts: []
            },
            obj12: {
                title: '神经/耳/鼻',
                opts: []
            },
            obj13: {
                title: '口腔',
                opts: []
            },
            obj14: {
                title: '其他评估',
                opts: []
            },
            obj19: {
                title: '处理要点',
                opts: []
            },
            obj20: {
                title: '视诊颈部',
                opts: []
            },
            obj21: {
                title: '触诊颈部',
                opts: []
            },
            obj22: {
                title: '听诊颈部',
                opts: []
            },
            obj23: {
                title: '颈椎检查',
                opts: []
            },
            obj29: {
                title: '处理要点',
                opts: []
            },
            obj30: {
                title: '视诊前/侧/后胸',
                opts: []
            },
            obj31: {
                title: '触诊胸壁',
                opts: []
            },
            obj32: {
                title: '听诊胸壁',
                opts: []
            },
            obj33: {
                title: '叩诊胸部',
                opts: []
            },
            obj39: {
                title: '处理要点',
                opts: []
            },
            obj40: {
                title: '视诊腹部',
                opts: []
            },
            obj41: {
                title: '触诊腹部',
                opts: []
            },
            obj42: {
                title: '听诊腹部',
                opts: []
            },
            obj43: {
                title: '叩诊腹部',
                opts: []
            },
            obj44: {
                title: '腹部检查',
                opts: []
            },
            obj49: {
                title: '处理要点',
                opts: []
            },
            obj50: {
                title: '会阴部',
                opts: []
            },
            obj51: {
                title: '直肠',
                opts: []
            },
            obj52: {
                title: '阴道',
                opts: []
            },
            obj59: {
                title: '处理要点',
                opts: []
            },
            obj60: {
                title: '上下肢',
                opts: []
            },
            obj61: {
                title: '骨盆/腰椎',
                opts: []
            },
            obj62: {
                title: '骨骼检查',
                opts: []
            },
            obj69: {
                title: '处理要点',
                opts: []
            },
            obj70: {
                title: '意识评估',
                opts: []
            },
            obj71: {
                title: '运动评估',
                opts: []
            },
            obj72: {
                title: '神经定位',
                opts: []
            },
            obj79: {
                title: '处理要点',
                opts: []
            }
        },//人体图相关数据
        showBdImg: false,//是否展示人体图

        atls: '待评级',//ATLS
        color1: '',//ATLS颜色变量
        xkzs: '暂无',//休克指数
        color2: '',//休克指数颜色变量
        xymlc: '暂无',//血压脉率差
        color3: '',//血压脉率差颜色变量
        currGcs: '',//最新Gcs评分

        dict: {
            ys: [],//意识
            tk: [],//瞳孔
            tkgfy: [],//瞳孔对光反应
            pf: [],//皮肤
            avpu: [],//avpu分级
        },

        gradeSeq: '',//评分弹窗Seq


        showHis: false,//是否包含历史
        searchKey: null,//搜索框输入内容
        patientList: [],//右侧病人列表
        currPatientInfo: null, //当前胸痛病人信息

        abcde: {
            A: {
                pgjg: [],
                zlcs: []
            },
            B: {
                pgjg: [],
                zlcs: []
            },
            C: {
                pgjg: [],
                zlcs: []
            },
            D: {
                pgjg: [],
                zlcs: []
            },
            E: {
                pgjg: [],
                zlcs: []
            }
        },
        abcdeSubmitList: [],
        ample: {
            allergy: [],//过敏史渲染项
            itmAls: [],//过敏史选中项
            itmAqt: '',//过敏史其他

            pastHis: [],//既往史渲染项
            itmPls: [],//既往史选中项
            itmPqt: '',//既往史其他

            psfyy: [],//平时服用药渲染项
            itmMls: [],//平时服用药选中项
            itmMqt: '',//平时服用药其他

            itmLtm: '',//最后进餐时间
            passedTime: '',//进餐到现在过去的时间
            itmLfd: '',//最后进餐食物
            itmEme: '',//与受伤有关的事务、环境
        },
        fzjc: [],//辅助检查页面展示数据
        fzjcSubmitList: [],

        tgjc: {
            f10: [],
            f11: [],
            f12: [],
            f13: [],
            f14: [],
            f19: [],
            f20: [],
            f21: [],
            f22: [],
            f23: [],
            f29: [],
            f30: [],
            f31: [],
            f32: [],
            f33: [],
            f39: [],
            f40: [],
            f41: [],
            f42: [],
            f43: [],
            f44: [],
            f49: [],
            f50: [],
            f51: [],
            f52: [],
            f59: [],
            f60: [],
            f61: [],
            f62: [],
            f69: [],
            f70: [],
            f71: [],
            f72: [],
            f79: []
        },//体格检查页面展示数据
        tgjcSubmitList: [],
        tgjcTxtVals: {
            '7003': '',//瞳孔左大小
            '7004': '',//瞳孔右大小
            '7008': '',//瞳孔左其他
            '7009': '',//瞳孔右其他
        },//存储体格检查各输入框的值

        consulList: [],//mdt 会诊医生列表

        // "包含历史"的按钮点击事件
        showHisToggle: function () {
            vm.showHis = !vm.showHis;
            getPatients();
        },
        //搜索框输入事件
        onInput: function (e) {
            vm.searchKey = this.value;
        },
        //搜索框回车事件
        onKeyPress: function (e) {
            if (e.keyCode == 13) {
                getPatients();
            }
        },
        // 点击右侧列表中的病人信息，根据emgSeq获取该病人信息；
        clickPatient: function (patient) {
            //获取当前病人的信息
            vm.currPatientInfo = patient;
            getCommittedData();//获取本页面所有已入库的数据
            calcuHeightForMain();//计算div.main应得高度值
            websocket.send(vm.currPatientInfo.emgSeq);//向websocket发送当前患者的emgSeq
        },

        clickTab: function (idx) {
            vm.currTab = idx;
        },
        //监听ample多选点击事件
        //resType ----- 选中项集合（itmAls、itmPls、itmMls）
        //infocode ----- 复选框对应的编码
        onAmpleCheck: function (resType, infocode) {
            if (vm.ample[resType].indexOf(infocode) > -1) {
                var arr = vm.ample[resType];
                arr.splice(vm.ample[resType].indexOf(infocode), 1);
                vm.ample[resType] = arr;
            } else {
                vm.ample[resType].push(infocode);
            }
        },

        //监听abcde、辅助检查、体格检查的多选点击事件
        //code ----- 各复选框的fldCod值
        //resType ----- 取值'abcde'/'fzjc'/'tgjc'
        onCheck: function (code, resType, tgjcObj) {
            var _list = vm[resType + 'SubmitList'];
            if (!_list.length) {
                var obj = resType === 'tgjc' ?
                    Object.assign(tgjcObj,{fldVal: 1}) : {fldCod: code,fldVal: 1};
                _list.push(obj);
            } else {
                var hasCode = false, idx = 0;
                for (var i = 0; i < _list.length; i++) {
                    if (_list[i].fldCod == code) {
                        hasCode = true;
                        idx = i;
                        break;
                    }
                }
                if (hasCode) {
                    _list.splice(idx, 1);
                } else {
                    var obj1 = resType === 'tgjc' ?
                        Object.assign(tgjcObj,{fldVal: 1}) : {fldCod: code,fldVal: 1};
                    _list.push(obj1);
                }
            }
            vm[resType + 'SubmitList'] = _list;
        },

        //ample多选框选中渲染
        isCheckedForAmple: function (code, array) {
            var _arr = vm.ample[array];
            return _arr.indexOf(code) > -1;
        },

        //abcde和辅助检查 多选框选中渲染
        //code ----- 各多选框的fldCod
        //type ----- 取值'abcde'/'fzjc'/'tgjc'
        isChecked: function (code, type) {
            var checked = false;
            for (var i = 0; i < vm[type + 'SubmitList'].length; i++) {
                var el = vm[type + 'SubmitList'][i];
                if (el.fldCod == code) {
                    checked = true;
                    break;
                }
            }
            return checked;
        },

        //设置abcde、体格检查 下拉框选中
        //prop ----- 下拉框对应的需保存到数据库的字段名
        //val ----- 下拉框的option对应的value
        //resType ----- 取值'abcde'或者'tgjc'
        isSelected: function (prop, val, resType) {
            var selected = false, resArr = vm[resType + 'SubmitList'];
            for (var i = 0; i < resArr.length; i++) {
                if (resArr[i].fldCod == prop && resArr[i].fldVal == val) {
                    selected = true;
                    break;
                }
            }
            return selected;
        },

        //打开评分窗口
        openSco: function (_fldCod, _gradeType, enterFlg) {
            // console.log("@@@@@@1111",_fldCod,_gradeType,$('#seq'+_fldCod).text());
            if (vm.currPatientInfo) {
                <%--需在使用页面引入<%@ include file="/WEB-INF/jsp/eicu/eicuCommonJs.jsp"%>--%>
                var gradeSeq = _gradeType != 'ABC' ? $('#seq' + _fldCod).text() : '';//设置主键值
                //var menuInfo = eicuUtil.getMenuInfo();
                var exChgInfo = {
                    enterSource: enterFlg,//入口标志值，创伤中心为'CSABC'
                    gradeType: _gradeType,//评分类型，详见控制台 Session Storage---> icuMenu ---> menuInfoObj
                    gradeSeq: gradeSeq,//新增时可以为空，修改时不可为空
                    modalTitle: '', //menuInfo['105002'].menuName//评分项标准名称，可另行手工设置，标准详见控制台 Session Storage---> icuMenu ---> menuInfoObj
                    fldCod: _fldCod
                };
                //调用引用方法
                icuOpenModal.openScoEdit(exChgInfo);
            } else {
                $.messager.alert('消息提示', '请在右侧列表中选择一名患者!', 'error');
            }
        }

    });

    var emgSeq = '${emgSeq}';
    var user = '${usrname}';
    //websocket 相关变量
    var websocket = null;
    var locate = window.location;
    var weburl = "ws://" + locate.hostname + ":" + locate.port + "${baseurl}webSocketJHY.do	";

    // 创建画布
    var paper;

    var currWin = 'atls';//记录当前的window窗口

    var initSbarHtml;//交接班模块初始html

    var highChart;

    //计算血压脉率差
    //a---收缩压  b---脉率
    function calcXymlc(a, b) {
        vm.xymlc = a - b;
        vm.color3 = '';
        if (a == b) {
            vm.color3 = 'yellowBorder';
        }
        if (a - b > 1) {
            vm.color3 = 'greenBorder'
        }
        if (a - b < 1) {
            vm.color3 = 'redBorder'
        }
    }

    //计算休克指数
    //a---心率 b---收缩压
    function calcXkzs(a, b) {
        vm.xkzs = (a / b).toFixed(1);
        vm.color2 = '';
        if (vm.xkzs == 0.5) {
            vm.color2 = 'greenBorder';
        }
        if (vm.xkzs > 0.5 && vm.xkzs < 1) {
            vm.color2 = 'yellowBorder';
        }
        if (vm.xkzs >= 1 && vm.xkzs <= 1.5) {
            vm.color2 = 'orangeBorder';
        }
        if (vm.xkzs >= 2) {
            vm.color2 = 'redBorder';
        }
    }

    //计算ATLS分级
    //a---脉率 b---呼吸频率
    function calcAtls(a, b) {
        // console.log("#############",a,b);
        vm.color1 = '';
        if (a < 100 && (b >= 14 && b <= 20)) {
            vm.color1 = 'greenBorder';
            vm.atls = 'I级';
        } else if ((a >= 100 && a <= 200) && (b > 20 && b <= 30)) {
            vm.color1 = 'yellowBorder';
            vm.atls = 'II级';
        } else if ((a >= 100 && a <= 200) && (b > 20 && b <= 30)) {
            vm.color1 = 'orangeBorder';
            vm.atls = 'III级';
        } else if ((a >= 100 && a <= 200) && (b > 20 && b <= 30)) {
            vm.color1 = 'redBorder';
            vm.atls = 'IV级';
        } else {
            vm.color1 = 'grayBorder';
            vm.atls = '暂无';
        }
    }

    //highcharts仪表盘
    function showEng(domname, options) {
        highChart = $(domname).highcharts({
            chart: {
                type: 'gauge',
                plotBackgroundColor: null,//绘图区背景颜色
                plotBackgroundImage: null,
                plotBorderWidth: null,//绘图区边框宽度
                plotShadow: false,
                shadow: false,
                backgroundColor: 'rgba(0,0,0,0)',//设置背景透明
                marginLeft: 25,//左右外边距
                marginRight: 25,
                borderWidth: 0//边框宽度
            },
            title: {
                text: ''
            },
            pane: {
                center: ['50%', '80%'],//xy偏移量
                size: '200%',
                startAngle: -90,//开始角度
                endAngle: 90,//结束角度
                background: null,//面板背景
            },
            // the value axis
            yAxis: {
                min: options.min,//最小值
                max: options.max,//最大值
                tickInterval: 0,

                // minorTickInterval: null,
                // minorTickWidth: 0,//次刻度线宽度
                // minorTickPosition: 'inside',//次刻度线位置
                // minorTickColor: 'black',//次刻度线颜色
                // minorTickLength: 20,//次刻度线长度
                // tickPixelInterval: 30,//刻度线像素间隔
                // tickWidth: 1,//刻度线宽度
                // tickPosition: 'inside',//刻度线位置
                // tickColor: '#ffffff',//刻度线颜色
                // lineWidth:1,//轴线宽度
                // lineColor:"#ff0000",//轴线颜色
                // offset:0,//Y轴偏移
                labels: {
                    step: 2,
                    y: -8,
                    x: 3,
                    rotation: 'auto',
                    style: {
                        "color": "#000",
                        "fontSize": '0px'//"14px"
                    }
                },
                title: {
                    text: ''
                },
                plotBands: options.plotBands
            },
            credits: {
                enabled: false//不显示版权信息
            },
            plotOptions: {
                gauge: {
                    dataLabels: {
                        y: 23,
                        x: options.labelX,
                        borderWidth: 0,
                        useHTML: true,
                        enabled: true
                    },
                    dial: {
                        backgroundColor: '#bbbbbb',//'#F8DE43',//指针背景色
                        radius: '65%',// 半径：指针长度
                        rearLength: '0',//尾巴长度
                    },
                    borderWidth: 0
                }

            },
            tooltip: {
                enabled: false,
                //pointFormat: '{series.name}: <b>{point.y}个</b>'
            },
            series: [{
                name: '能效',
                data: [parseFloat(options.param)],
                tooltip: {
                    valueSuffix: ''
                },
                dataLabels: {
                    format: '<div style="text-align:center;font-size:12px;color:black;font-weight:normal"><span style="font-size:17px">' + options.indicatorNum + '</span></br><span>' + options.indicatorText + '</span></div>',
                    borderWidth: 0,
                }
            }]
        });
    }


    //根据GCS评分展示收缩压或平均动脉压仪表盘
    //sbp---收缩压
    //dbp---舒张压
    function showGaugeByGcs(sbp, dbp) {
        var options = {};//仪表盘参数对象
        if (vm.currGcs > 8) {
            var _param = sbp;
            //防止指针超过左边界
            if (sbp < 60) {
                _param = 60
            }
            //防止指针超过右边界
            if (sbp > 140) {
                _param = 140
            }
            options.min = 60;//仪表盘左边最小数值
            options.max = 140;//仪表盘右边最大数值
            options.plotBands = [
                {
                    from: 0,
                    to: 80,
                    thickness: 10,
                    color: '#f44336',//red
                    innerRadius: '100%',
                    outerRadius: '70%'//圆环宽度=innerRadius-outerRadius
                },
                {
                    from: 80,
                    to: 90,
                    thickness: 20,
                    color: 'green',
                    innerRadius: '100%',
                    outerRadius: '70%'
                },
                {
                    from: 90,
                    to: 140,
                    thickness: 20,
                    color: 'red',
                    innerRadius: '100%',
                    outerRadius: '70%'
                }
            ];//仪表盘根据数值范围进行颜色分块
            options.param = _param;//仪表盘指针所指的数值 大小在min到max之间
            options.indicatorNum = sbp || '无';//仪表盘文本显示的数值 真实数字
            options.indicatorText = '收缩压';//仪表盘文本描述
            options.labelX = 0;
        }
        else {
            var _map = parseInt((sbp + 2 * dbp) / 3);//平均动脉压计算
            var _indicatorNum = _map;
            if (_map < 70) {
                _indicatorNum = 70;
            }
            if (_map > 105) {
                _indicatorNum = 105;
            }
            options.min = 70;//仪表盘左边最小数值
            options.max = 105;//仪表盘右边最大数值
            options.plotBands = [
                {
                    from: 0,
                    to: 80,
                    thickness: 10,
                    color: '#f44336',//red
                    innerRadius: '100%',
                    outerRadius: '70%'//圆环宽度=innerRadius-outerRadius
                },
                {
                    from: 80,
                    to: 105,
                    thickness: 20,
                    color: 'green',
                    innerRadius: '100%',
                    outerRadius: '70%'
                }
            ];//仪表盘根据数值范围进行颜色分块
            options.param = _indicatorNum;//仪表盘指针所指的数值 大小在min到max之间
            options.indicatorNum = _map;//仪表盘文本显示的数值 真实数字
            options.indicatorText = '平均动脉压';//仪表盘文本描述
            options.labelX = -8;
        }
        showEng('#board', options);
    }

    function buildSocket() {
        websocket = new WebSocket(weburl);
        //连接发生错误的回调方法
        websocket.onerror = function (event) {
            console.log("WebSocket连接错误");
            if (!"${sessionScope.activeUser}") {
                window.location.href = "${baseurl}login.do";
            }
        };
        //连接成功建立的回调方法
        websocket.onopen = function () {
            console.log("WebSocket连接成功");
            getPatients();
        };
        //接收到消息的回调方法
        websocket.onmessage = function (event) {
            var info = $.parseJSON(event.data);
            // console.log("#################",info);
            //console.log("$$$%%%%%%%%%",highChart);
            var vitalData = info.sysdata.hmd;
            if (vm.currPatientInfo && vitalData.emgSeq == vm.currPatientInfo.emgSeq) {
                //spo2 血氧饱和度  resp呼吸次数 nibpSys收缩压 nibpDia舒张压 nibpMea中间值 hrtRtePr心率 hrtRteHr脉率
                calcXymlc(vitalData.nibpSys, vitalData.hrtRteHr);//计算血压脉率差
                calcXkzs(vitalData.hrtRtePr, vitalData.nibpSys);//计算休克指数
                calcAtls(vitalData.hrtRteHr, vitalData.resp);//计算ATLS

                vm.currPatientInfo.sbpUpNbr = vitalData.nibpSys;
                vm.currPatientInfo.sbpDownNbr = vitalData.nibpDia;
                showGaugeByGcs(vitalData.nibpSys, vitalData.nibpDia);//根据Gcs评分展示收缩压或平均动脉压仪表盘
            }
        };
        //连接关闭的回调方法
        websocket.onclose = function (event) {
            console.log(event);
            console.log("WebSocket连接关闭");
        };

        //关闭WebSocket连接
        function closeWebSocket() {
            websocket.close();
        }

        //监听窗口关闭事件，当窗口关闭时，主动去关闭websocket连接，防止连接还没断开就关闭窗口，server端会抛异常。
        window.onbeforeunload = function () {
            closeWebSocket();
        };
    }


    //初始化人体图
    function initBodyImg() {
        var paper_h = $('.mask').height(),
            paper_w = 0.375 * paper_h;
        paper = Raphael("paperDiv", paper_w, paper_h);
        paper.image("images/edpc/csBody1.png", 0, 0, paper_w, paper_h);
    }

    function translateSelOpt(key,val) {
        // console.log(key, val);
        var _txt = '';
        var arr = publicFun.getDict(key);
        // console.log(arr);

        for (var i = 0; i < arr.length; i++) {
            if (arr[i].infocode == val){
                _txt = arr[i].info;
                break;
            }
        }
        // console.log(_txt);
        return _txt;
    }

    //点击人体图缩略图，展示大图,处理人体图数据
    function showBodyImg() {
        vm.showBdImg = true;
        var _list = vm.tgjcSubmitList;
        var _obj = vm.tgjcTxtVals;
        for (var i=0; i<_list.length; i++){
            if(_list[i].fldTyp === "SELECT"){
                _list[i].fldTxt = translateSelOpt(_list[i].lstNme,_list[i].fldVal);
            }
            // 根据fldCod的前两个字符（如10、11），将_list[i]放入
            // bdData相应细分部位（如头面部--obj10、 眼睛--obj11）的创伤信息数组--opts中；
            vm.bdData['obj' + _list[i].fldCod.slice(0, 2)].opts.push(_list[i]);
        }

        //根据各个部位是否有创伤信息，决定需不需要在人体图上展示该部位
        for(var prop in vm.bdData){
            if(vm.bdData.hasOwnProperty(prop)){
                //如果细分部位属于头面部，并且有相关部位的创伤信息
                if(/obj1/.test(prop) && vm.bdData[prop].opts.length){
                    vm.bdData.p1 = true;//展示头面部
                }
                //如果细分部位属于颈部，并且有相关部位的创伤信息
                if(/obj2/.test(prop) && vm.bdData[prop].opts.length){
                    vm.bdData.p2 = true;//展示颈椎和颈
                }
                //如果细分部位属于胸部，并且有相关部位的创伤信息
                if(/obj3/.test(prop) && vm.bdData[prop].opts.length){
                    vm.bdData.p3 = true;//展示胸部信息
                }
                //如果细分部位属于腹部，并且有相关部位的创伤信息
                if(/obj4/.test(prop) && vm.bdData[prop].opts.length){
                    vm.bdData.p4 = true;//展示腹部信息
                }
                //如果细分部位属于会阴部，并且有相关部位的创伤信息
                if(/obj5/.test(prop) && vm.bdData[prop].opts.length){
                    vm.bdData.p5 = true;//展示会阴部信息
                }
                //如果细分部位属于肌肉骨骼，并且有相关部位的创伤信息
                if(/obj6/.test(prop) && vm.bdData[prop].opts.length){
                    vm.bdData.p6 = true;//展示肌肉骨骼信息
                }
                //如果细分部位属于神经，并且有相关的创伤信息
                if(/obj7/.test(prop) && vm.bdData[prop].opts.length){
                    vm.bdData.p7 = true;//展示神经信息
                }
            }
        }
        console.log(vm.bdData);
    }

    //关闭人体图大图
    function closeBdImg() {
        vm.showBdImg = false;

        //vm.bdData的数据清空，避免下次打开人体图还遗留上次的数据
        var _list = vm.tgjcSubmitList;
        for (var i=0; i<_list.length; i++){
            vm.bdData['obj' + _list[i].fldCod.slice(0, 2)].opts = [];//清空创伤选项
        }
        for(var prop in vm.bdData) {
            if (vm.bdData.hasOwnProperty(prop)) {
                if (/p/.test(prop)) {
                    vm.bdData[prop] = false;//重置人体部位是否展示的标志值
                }
            }
        }
    }

    //根据hd和processBar两个div的高度多少计算div.main应设置的高度
    function calcuHeightForMain() {
        var _totalHeight = $('.left').height(),
            _hdHeight = $('#hd').height() ? $('#hd').height() + 10 : 0,
            _processBarHeight = $('#processBar').height() + 10;
        var _mainHeight = _totalHeight - _hdHeight - _processBarHeight;
        $('.main').height(_mainHeight);
    }

    //根据gcs评分值，给分值text设置不同背景色
    function setBgColorForGcs(score) {
        var bg = '';
        if (score >= 3 && score <= 8) {
            bg = 'orangeBg';
        } else if (score >= 9 && score <= 12) {
            bg = 'yellowBg';
        } else if (score >= 13 && score <= 14) {
            bg = 'greenBg';
        } else if (score >= 15) {
            bg = 'grayBg';
        }
        return bg;
    }

    // 点击页头的指标，打开弹框展示相关内容
    function openWinDow(id) {
        currWin = id;
        $('#win').window('open');
        $('#' + id).show();
    }

    /**
     * 获取右侧胸痛病人列表；
     * searchKey ----搜索关键字
     * showHis ----是否 包含历史
     **/
    function getPatients() {
        publicFun.httpServ('post', '${baseurl}cs/getCsPatientInfoList.do', {
            cstNam: vm.searchKey,
            bhls: vm.showHis
        }, function (res) {
            var list = res.resultInfo.sysdata.list;
            if (list && list.length) {
                for (var i = 0; i < list.length; i++) {
                    list[i].emgDatStr = publicFun.timeFormat(list[i].emgDat, 'yyyy/MM/dd hh:mm') || '日期暂无';//格式化预检时间
                    list[i].illTimeStr = publicFun.timeFormat(list[i].illTime, 'yyyy/MM/dd hh:mm') || '日期暂无';
                }
                vm.patientList = list;
                //左侧立即渲染右侧列表的第一个病人的数据
                vm.clickPatient(list[0]);
            } else {
                vm.patientList = [];
                vm.currPatientInfo = null;
            }
            calcuHeightForMain();
        });
    }

    //计算ample---进食时间到现在过去多久
    function calcPassedTime() {
        if (vm.ample.itmLtm) {
            var timeCost = moment(new Date()).diff(moment(vm.ample.itmLtm, 'YYYY-MM-DD HH:mm'), 'minute');
            var hours = parseInt(timeCost / 60);
            var minutes = parseInt(timeCost % 60);
            vm.ample.passedTime = hours + '小时' + minutes + '分';
        } else {
            vm.ample.passedTime = '';
        }
    }

    function onSelChange(id, code, resType) {
        var selVal = $('#' + id).val();
        var resList = vm[resType + 'SubmitList'];
        var hasThisCode = false, idx = 0;
        for (var i = 0; i < resList.length; i++) {
            if (resList[i].fldCod == code) {
                hasThisCode = true;
                idx = i;
                break;
            }
        }
        if (hasThisCode) {
            resList[idx].fldVal = selVal;
        } else {
            resList.push({
                fldCod: code,
                fldVal: selVal
            });
        }
        vm[resType + 'SubmitList'] = resList;
    }

    //设置交接班模块的 input、textarea、select、多选按钮、checkbox的监听事件
    function addEventsForSbar() {
        //设置护士为当前登录用户
        $('#nurse').text(user);

        //给交接班部分的input添加输入监听事件
        $("#sbar input[type='text']").bind("input propertychange", function (event) {
            $(this).attr('value', $(this).val());
        });

        //给交接班部分的textarea添加输入监听事件
        $("#sbar textarea").bind("input propertychange", function (event) {
            $(this).attr('value', $(this).val());
        });

        //给交接班模块的转入科室添加监听事件
        $('#depts').change(function (event) {
            var optVal = $(this).val();
            $("#depts option").attr('selected', false);//先把所有option都不选中
            $("#depts option[value=" + optVal + "]").attr('selected', true);//再单独给选中的option设置selected
        });

        //给交接班部分的选择按钮添加监听事件
        $('.mulOpt').click(function () {
            $(this).toggleClass('selOpt');
        });

        $('.radOpt').click(function () {
            $(this).siblings().removeClass('selOpt');
            $(this).addClass('selOpt');
        });

        $('input[type="checkbox"]').click(function (event) {
            var isChecked = $(this).prop('checked');
            $(this).attr('checked', isChecked);
        });
    }

    //提交已选中、已填写的ample数据
    function saveAmple() {
        $.ajax({
            url: 'cs/mergeAmpleSubmit.do',
            type: 'post',
            data: JSON.stringify({
                emgSeq: vm.currPatientInfo.emgSeq,
                itmAls: vm.ample.itmAls.join(','),//过敏史
                itmAqt: vm.ample.itmAqt,//过敏史其他
                itmMls: vm.ample.itmMls.join(','),//当前服用药
                itmMqt: vm.ample.itmMqt,//当前服用药其他
                itmPls: vm.ample.itmPls.join(','),//既往史
                itmPqt: vm.ample.itmPqt,//既往史其他

                itmLtm: vm.ample.itmLtm,//最后进餐时间
                itmLfd: vm.ample.itmLfd,//最后进餐食物
                itmEme: vm.ample.itmEme,//与受伤有关的事务、环境
            }),
            dataType: 'json',
            contentType: 'application/json;charset=UTF-8',
            success: function (res) {
                if (res.resultInfo.success) {
                    $.messager.alert('消息提示', '数据保存成功!', 'info');
                } else {
                    $.messager.alert('消息提示', '数据保存失败!', 'error');
                }
            }
        });
    }

    //提交已选择、已填写的abcde数据
    function saveAbcde() {
        $.ajax({
            url: 'cs/mergeCsABCDEinfSubmit.do',
            type: 'post',
            data: JSON.stringify({
                emgSeq: vm.currPatientInfo.emgSeq,
                list: vm.abcdeSubmitList
            }),
            dataType: 'json',
            contentType: 'application/json;charset=UTF-8',
            success: function (res) {
                if (res.resultInfo.success) {
                    $.messager.alert('消息提示', '数据保存成功!', 'info');
                } else {
                    $.messager.alert('消息提示', '数据保存失败!', 'error');
                }
            }
        });
    }

    //提交已选择、已填写的辅助检查数据
    function saveFzjc() {
        $.ajax({
            url: 'cs/mergeHspCsoaeInf.do',
            type: 'post',
            data: JSON.stringify({
                emgSeq: vm.currPatientInfo.emgSeq,
                list: vm.fzjcSubmitList
            }),
            dataType: 'json',
            contentType: 'application/json;charset=UTF-8',
            success: function (res) {
                if (res.resultInfo.success) {
                    $.messager.alert('消息提示', '数据保存成功!', 'info');
                } else {
                    $.messager.alert('消息提示', '数据保存失败!', 'error');
                }
            }
        });
    }

    //提交已选择、已填写的体格检查数据
    function saveTgjc() {
        //体格检查的各个input值按照{fldCod:'',fldVal:''}的形式
        //添加到vm.tgjcSubmitList的表单数据集合
        var _txtVals = vm.tgjcTxtVals;
        for (var prop in _txtVals) {
            if (_txtVals.hasOwnProperty(prop) && _txtVals[prop]) {
                vm.tgjcSubmitList.push({
                    fldCod: prop,
                    fldVal: _txtVals[prop]
                });
            }
        }
        $.ajax({
            url: 'cs/mergeHspCscpnInf.do',
            type: 'post',
            data: JSON.stringify({
                emgSeq: vm.currPatientInfo.emgSeq,
                list: vm.tgjcSubmitList
            }),
            dataType: 'json',
            contentType: 'application/json;charset=UTF-8',
            success: function (res) {
                if (res.resultInfo.success) {
                    $.messager.alert('消息提示', '数据保存成功!', 'info');
                } else {
                    $.messager.alert('消息提示', '数据保存失败!', 'error');
                }
            }
        })
    }

    //提交sbar交接班的html
    function saveSbar() {
        $.ajax({
            url: 'cs/mergeHspSbarInf.do',
            type: 'post',
            data: JSON.stringify({
                emgSeq: vm.currPatientInfo.emgSeq,
                sbarcontent: document.getElementById('sbar').innerHTML
            }),
            dataType: 'json',
            contentType: 'application/json;charset=UTF-8',
            success: function (res) {
                if (res.resultInfo.success) {
                    $.messager.alert('消息提示', '数据保存成功!', 'info');
                } else {
                    $.messager.alert('消息提示', '数据保存失败!', 'error');
                }
            }
        })
    }

    //function getMousePos(e) {
    // var imgNode = document.getElementById("csBody");
    // var xSpan = document.getElementById("x");
    // var ySpan = document.getElementById("y");
    // imgNode.onmousemove = function(event){
    //     xSpan.innerHTML = event.clientX;
    //     ySpan.innerHTML = event.clientY;
    // }
    //}


    //获取ample渲染数据
    function getAmpleData() {
        vm.ample.allergy = publicFun.getDict('ALG_TYP_COD')||[];
        vm.ample.pastHis = publicFun.getDict('PAST_HIS')||[];
        vm.ample.psfyy = publicFun.getDict('PSFYY')||[];
    }

    //获取abcde渲染数据
    function getAbcdeData() {
        $.ajax({
            url: 'cs/getCsABCDEdefList.do',
            type: 'post',
            dataType: 'json',
            contentType: 'application/json;charset=UTF-8',
            success: function (res) {
                vm.abcde = res.resultInfo.sysdata.abcde;
            }
        })
    }

    //获取辅助检查渲染数据
    function getFzjcData() {
        $.ajax({
            url: 'cs/getHspCsoaeDefList.do',
            type: 'post',
            dataType: 'json',
            contentType: 'application/json;charset=UTF-8',
            success: function (res) {
                vm.fzjc = res.resultInfo.sysdata.fzjc;
            }
        })
    }

    //获取体格检查渲染数据
    function getTgjcData() {
        $.ajax({
            url: 'cs/getHspCscpnDefList.do',
            type: 'post',
            dataType: 'json',
            contentType: 'application/json;charset=UTF-8',
            success: function (res) {
                vm.tgjc = res.resultInfo.sysdata.crasmplainDef;
            }
        })
    }

    function getRenderData() {
        getAbcdeData();
        getAmpleData();
        getFzjcData();
        getTgjcData();
    }

    //获取已提交入库的ample数据
    function getCommittedAmple() {
        $.ajax({
            url: 'cs/getAmpleSubmit.do',
            type: 'post',
            data: JSON.stringify({
                emgSeq: vm.currPatientInfo.emgSeq
            }),
            dataType: 'json',
            contentType: 'application/json;charset=UTF-8',
            success: function (res) {
                var ampleInfo = res.resultInfo.sysdata.hspCsampInf || {};
                vm.ample.itmAls = ampleInfo.itmAls ? ampleInfo.itmAls.split(',') : [];
                vm.ample.itmAqt = ampleInfo.itmAqt || '';
                vm.ample.itmMls = ampleInfo.itmMls ? ampleInfo.itmMls.split(',') : [];
                vm.ample.itmMqt = ampleInfo.itmMqt || '';
                vm.ample.itmPls = ampleInfo.itmPls ? ampleInfo.itmPls.split(',') : [];
                vm.ample.itmPqt = ampleInfo.itmPqt || '';
                vm.ample.itmLtm = ampleInfo.itmLtm ? moment(new Date(ampleInfo.itmLtm)).format('YYYY/MM/DD HH:mm') : '';
                vm.ample.itmLfd = ampleInfo.itmLfd || '';
                vm.ample.itmEme = ampleInfo.itmEme || '';
                calcPassedTime();//计算最后进食时间
            }
        });
    }

    //获取已提交入库的abcde数据
    function getCommittedAbcde() {
        $.ajax({
            url: 'cs/getCsABCDEinfList.do',
            type: 'post',
            data: JSON.stringify({
                emgSeq: vm.currPatientInfo.emgSeq
            }),
            dataType: 'json',
            contentType: 'application/json;charset=UTF-8',
            success: function (res) {
                var _infoList = res.resultInfo.sysdata.hspCsampInfList;
                if (_infoList) {
                    for (var i = 0; i < _infoList.length; i++) {
                        var el = _infoList[i];
                        if (el.fldTyp == "QUOTE") {
                            $('#seq' + el.fldCod).text(el.fldVal);//fldVal:每条评分的唯一标识
                            $('#' + el.fldCod).text(el.gradeSco + '分').addClass(setBgColorForGcs(el.gradeSco));
                        }
                    }
                }
                vm.abcdeSubmitList = _infoList || [];
            }
        })
    }

    //获取已提交入库的辅助检查数据
    function getCommittedFzjc() {
        $.ajax({
            url: 'cs/getHspCsoaeInfList.do',
            type: 'post',
            data: JSON.stringify({
                emgSeq: vm.currPatientInfo.emgSeq
            }),
            dataType: 'json',
            contentType: 'application/json;charset=UTF-8',
            success: function (res) {
                var _infoList = res.resultInfo.sysdata.list;
                var tempArr = [];
                if (_infoList) {
                    for (var i = 0; i < _infoList.length; i++) {
                        tempArr.push({
                            fldCod: _infoList[i].fldCod,
                            fldVal: _infoList[i].fldVal
                        });
                    }
                }
                vm.fzjcSubmitList = tempArr;
            }
        })
    }

    //获取已提交入库的体格检查数据
    function getCommittedTgjc() {
        $.ajax({
            url: 'cs/getHspCscpnInfList.do',
            type: 'post',
            data: JSON.stringify({
                emgSeq: vm.currPatientInfo.emgSeq
            }),
            dataType: 'json',
            contentType: 'application/json;charset=UTF-8',
            success: function (res) {
                var _infoList = res.resultInfo.sysdata.list;
                var tempArr = [];
                if (_infoList) {
                    for (var i = 0; i < _infoList.length; i++) {
                        var el = _infoList[i];
                        if (el.fldVal) {
                            if (el.fldTyp == 'INPUT') {
                                vm.tgjcTxtVals[el.fldCod] = el.fldVal;
                            } else if (el.fldTyp == "QUOTE") {
                                $('#seq' + el.fldCod).text(el.fldVal);//fldVal:每条评分的唯一标识
                                $('#' + el.fldCod).text(el.gradeSco + '分').addClass(setBgColorForGcs(el.gradeSco));
                            } else {
                                tempArr.push({
                                    fldCod: el.fldCod,
                                    fldVal: el.fldVal,
                                    fldNme: el.fldNme,
                                    fldTyp: el.fldTyp,
                                    lstNme: el.lstNme
                                });
                            }
                        }
                    }
                }
                vm.tgjcSubmitList = tempArr;
            }
        })
    }

    //获取数据库中，当前患者的会诊医生及信息。
    function getCommittedMdt() {
        $.ajax({
            url: "hzyqqr/getMdtInfByEmgSeq.do",
            type: 'post',
            data: JSON.stringify({
                emgSeqCr: vm.currPatientInfo.emgSeq  //'20181207000204'
            }),
            dataType: 'json',
            contentType: 'application/json;charset=UTF-8',
            success: function (res) {
                var _consulList = res.resultInfo.sysdata.list || [];
                vm.consulList = _consulList;
            }

        })
    }

    //获取sbar交接班的html并渲染
    function getCommittedSbar() {
        $.ajax({
            url: 'cs/getHspSbarInfByEmgSeq.do',
            type: 'post',
            data: JSON.stringify({
                emgSeq: vm.currPatientInfo.emgSeq
            }),
            dataType: 'json',
            contentType: 'application/json;charset=UTF-8',
            success: function (res) {
                var resObj = res.resultInfo.sysdata.hspSbarInf;
                if (resObj && resObj.sbarcontent) {
                    document.getElementById('sbar').innerHTML = resObj.sbarcontent;
                } else {
                    document.getElementById('sbar').innerHTML = initSbarHtml;
                }
                addEventsForSbar();
            }
        })
    }

    function getCommittedData() {
        if (vm.currPatientInfo) {
            getCommittedAbcde();
            getCommittedAmple();
            getCommittedFzjc();
            getCommittedTgjc();
            getCommittedMdt();
            getCommittedSbar();
            getLastGrade();
        }
    }

    function initBodyParts() {
        $.ajax({
            url: 'cs/getHspBodyPartsDef.do',
            type: 'post',
            dataType: 'json',
            contentType: 'application/json;charset=UTF-8',
            /* data: JSON.stringify({
                'emgSeq': emgSeq
            }), */
            success: function (res) {
                var list = res.resultInfo.sysdata.list;
                for (var i = 0; i < list.length; i++) {
                    var a = list[i];
                    (function (a) {
                        paper.circle(a.originAxisX, a.originAxisY, a.radius).attr({
                            "fill": "white",
                            "fill-opacity": 0,
                            "title": a.partName
                        }).click(function () {
                            alert(a.partName);
                        });
                    })(a)
                }
            },
            error: function (err) {
                //console.log(err)
            }
        });

    }

    function initDict() {
        var maps = [
            {arrName: 'ys', key: 'SEN_STU_COD'},//意识
            {arrName: 'tk', key: 'TK_DGFY_COD'},//瞳孔
            {arrName: 'tkgfy', key: 'TK_DGFY_COD'},//瞳孔对光反应
            {arrName: 'pf', key: 'GGJPFXT_PFWD_COD'},//皮肤
            {arrName: 'avpu', key: 'SEN_RCT'},//avpu分级
        ];
        for (var i = 0; i < maps.length; i++) {
            vm.dict[maps[i].arrName] = publicFun.getDict(maps[i].key) || [];
        }
    }

    //==================全览图及评分新增方法====================
    /**
     * 子页面传递基本信息
     */
    function getBasicInfo() {
        var basicInfo = {
            //住院号
            liveNo: vm.currPatientInfo.emgSeq,
            rescMode: ''
        };
        return basicInfo;
    }

    function modalReturnFun(totalSco, gradeSeq, closeFlag, gradeType, enterSource, fldCod) {
        // console.log("***&&&&*&*&*%%^^%^");
        if (gradeType !== 'ABC') {
            $('#seq' + fldCod).text(gradeSeq);//gradeSeq:每条评分的唯一标识
            $('#' + fldCod).text(totalSco + '分').addClass(setBgColorForGcs(totalSco));
            if (gradeType === 'GCS') {
                vm.currGcs = totalSco;
                showGaugeByGcs(vm.currPatientInfo.sbpUpNbr, vm.currPatientInfo.sbpDownNbr);
            }
        } else {
            $('#abcSco').text(totalSco + '分');
        }

        //关闭窗口
        if (closeFlag) {
            closemodalwindow();
        }
    }

    //获取最新评分数据
    function getLastGrade() {
        $.ajax({
            url: "icuscore/queryTotalScoByMenu.do",
            type: 'post',
            data: JSON.stringify({
                'flag': 'basic',
                'liveNo': vm.currPatientInfo.emgSeq,  //'20181207000204'
                'gradeType': 'GTOTAL'
            }),
            dataType: 'json',
            contentType: 'application/json;charset=UTF-8',
            success: function (res) {
                var _gradeList = res.resultInfo.sysdata.gradeList || [];
                var totalSco;
                if (_gradeList) {
                    $.each(_gradeList, function (key, value) {
                        if (value.gradeType == 'ABC')
                            totalSco = value.gradeSco;
                        if (value.gradeType == 'GCS') {
                            vm.currGcs = value.gradeSco;
                            showGaugeByGcs(vm.currPatientInfo.sbpUpNbr, vm.currPatientInfo.sbpDownNbr);
                        }
                    });
                }
                if (totalSco)
                    $('#abcSco').text(totalSco + '分');
                else
                    $('#abcSco').text('未评分');
            }

        })
    }

    function openTabWin() {
        var openTabName = vm.currPatientInfo.cstNam + '-全览图',
            openTabUrl = '${baseurl}icucust/toOverview.do?liveNo=' + vm.currPatientInfo.emgSeq + '&cstNam=' + vm.currPatientInfo.cstNam + '&th=' + new Date().getTime();
        parent.opentabwindow(openTabName, openTabUrl);
    }

    //=================================================

    function reload() {
        console.log('刷新局部');
        //解决切换tab进入本页面时，仪表图有时会突然变大的问题。
        //根据Gcs评分展示收缩压或平均动脉压仪表盘
        showGaugeByGcs(vm.currPatientInfo.sbpUpNbr, vm.currPatientInfo.sbpDownNbr);
    }
    $(function () {
    	buildSocket();
        addEventsForSbar();
        initSbarHtml = document.getElementById('sbar').innerHTML;//获取交接班模块未进行任何操作的html
        initBodyImg();
        initDict();
        calcuHeightForMain();
        
        getRenderData();//获取本页面需要渲染的数据
        $('#win').window({
            width: 600,
            height: 400,
            modal: true,
            closed: true,
            title: '信息框',
            onClose: function () {
                $('#' + currWin).hide();
            }
        });
    });

</script>
</html>