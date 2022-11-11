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
    <title>卒中登记本</title>
    <%--    <link rel="stylesheet" type="text/css" href="styles/common/iconfont.css">--%>
    <%--    <link rel="stylesheet" type="text/css" href="lib/easyui1.3/themes/default/easyui.css">--%>
    <link rel="stylesheet" href="css/edpc/viewer.min.css">
    <link rel="stylesheet" href="css/edpc/czReportHelper.css">

    <script type="text/javascript" src="lib/easyui1.3/jquery-1.8.0.min.js"></script>
    <%--    <script type="text/javascript" src="lib/moment.min.js"></script>--%>
    <%--    <script type="text/javascript" src="lib/easyui1.3/jquery.easyui.min.js"></script>--%>
<%--    <%@ include file="/WEB-INF/jsp/base/common_js.jsp" %>--%>
<%--    <%@ include file="/WEB-INF/jsp/base/common_css.jsp" %>--%>
    <script type="text/javascript" src="js/public.js"></script>
    <script type="text/javascript" src="js/viewer.js"></script>
    <script type="text/javascript" src="js/jquery.viewer.js"></script>
    <script type="text/javascript" src="lib/avalon1.4.8/avalon.js"></script>
</head>
<body ms-controller="report">
<div class="left">
    <div ms-repeat="tabs" ms-click="clickTab($index)" class="tab" ms-class="{{currTab == $index ? 'activeTab' : ''}}">
        {{el}}
    </div>
</div>
<div class="right">
    <div class="title"><i class="iconfont icon-curr-pos icon"></i> {{tabs[currTab]}}</div>
    <div class="wrapper" ms-if="currTab == 0">
        <table border="1">
            <tr>
                <td width="30%"><span class="desc">姓名:</span><span>{{hspDbzlBas.cstNam}}</span></td>
                <td><span class="desc">性别:</span><span>{{hspDbzlBas.cstSexCod == 0 ? '男' : '女'}}</span></td>
                <td><span class="desc">年龄:</span><span>{{hspDbzlBas.cstAge}} 岁</span></td>
            </tr>
            <tr>
                <td><span class="desc">身份证号:</span><span>{{hspDbzlBas.idNbr || '暂无'}}</span></td>
                <td><span class="desc">病案号:</span><span></span>暂无</td>
                <td><span class="desc">联系电话:</span><span>{{hspDbzlBas.pheNbr}}</span></td>
            </tr>
            <tr>
                <td>
                    <span class="desc">身高:</span><span>{{hspDbzlBas.patHgt || '暂无'}}</span>
                    <span ms-if="hspDbzlBas.patHgt" > cm</span>
                </td>
                <td>
                    <span class="desc">体重:</span><span>{{hspDbzlBas.patWgt || '暂无'}}</span>
                    <span ms-if="hspDbzlBas.patWgt"> kg</span>
                </td>
                <td><span class="desc">主诉:</span><span>{{hspCzzlInfList.ZHUSU}}</span></td>
            </tr>
            <tr>
                <td><span class="desc">发病时间:</span><span>{{hspCzzlInfList.FBSJ || '不明确'}}</span></td>
                <td colspan="2"><span class="desc">最后正常时间:</span><span>{{hspCzzlInfList.ZHZCSJ || '不明确'}}</span></td>
            </tr>
            <tr>
                <td><span class="desc">到院方式:</span><span>{{hspCzzlInfList.DYFS}}</span></td>
                <td><span class="desc">到院时间:</span><span>{{hspCzzlInfList.DYSJ || '不明确'}}</span></td>
                <td><span class="desc" style="width: 135px">入院时NIHSS评分:</span><span>{{hspCzzlInfList.RYSNIHSSPF || '暂无'}}</span>
                </td>
            </tr>
            <tr>
                <td colspan="3">
                    <div class="desc" style="width: 200px">急诊挂号单(照片、截图):</div>
                    <div class="images" id="imgBox"></div>
                </td>
            </tr>
        </table>
    </div>
    <div class="wrapper" ms-if="currTab == 1">
        <ul>
            <li><span class="desc">吸烟:</span><span>{{hspCzzlInfList.SFXY}}</span></li>
            <li><span class="desc">二次溶栓:</span><span>{{hspCzzlInfList.SFRCRS}}</span></li>
            <li><span class="desc">高血压:</span><span>{{hspCzzlInfList.SFGXY}}</span></li>
            <li><span class="desc">既往房颤:</span><span>{{hspCzzlInfList.SFJWFC}}</span></li>
            <li><span class="desc" style="width: 135px">既往缺血性心脏病:</span><span>{{hspCzzlInfList.SFJWQXXXZB}}</span></li>
            <li><span class="desc">新发房颤:</span><span>{{hspCzzlInfList.SFXFFC}}</span></li>
            <li><span class="desc">糖尿病:</span><span>{{hspCzzlInfList.SFTNB}}</span></li>
            <li><span class="desc">高血脂:</span><span>{{hspCzzlInfList.SFGXZ}}</span></li>
            <li><span class="desc">冠心病:</span><span>{{hspCzzlInfList.SFGXB}}</span></li>
            <li><span class="desc">充血性心衰:</span><span>{{hspCzzlInfList.SFCXXXS}}</span></li>
            <li><span class="desc">既往卒中史:</span><span>{{hspCzzlInfList.SFJWCZS}}</span></li>
            <li><span class="desc">心血管家族史:</span><span>{{hspCzzlInfList.SFXXGJZS}}</span></li>
            <li><span class="desc">过敏史:</span><span>{{hspCzzlInfList.SFGMS}}</span></li>
        </ul>
    </div>
    <div class="wrapper" ms-if="currTab == 2">
        <ul>
            <li><span class="desc">阿司匹林:</span><span>{{hspCzzlInfList.SFJWASPL}}</span></li>
            <li><span class="desc">氯吡格雷:</span><span>{{hspCzzlInfList.SFJWLBGL}}</span></li>
            <li><span class="desc">华法林:</span><span>{{hspCzzlInfList.SFJWHFL}}</span></li>
            <li><span class="desc">阿托伐他汀:</span><span>{{hspCzzlInfList.SFJWATFTT}}</span></li>
            <li><span class="desc">瑞舒伐他汀:</span><span>{{hspCzzlInfList.SFJWRSFTT}}</span></li>
        </ul>
    </div>
    <div class="wrapper" ms-if="currTab == 3">
        <ul>
            <li>
                <span class="desc">溶栓前收缩压:</span>
                <span>{{hspCzzlInfList.RSSSY}}</span>
                <span class="unit"> mmHg</span>
            </li>
            <li>
                <span class="desc">溶栓前舒张压:</span>
                <span>{{hspCzzlInfList.RSSZY}}</span>
                <span class="unit"> mmHg</span>
            </li>
            <li>
                <span class="desc">体温:</span>
                <span>{{hspCzzlInfList.TIWEN}}</span>
                <span class="unit"> ℃</span>
            </li>
            <li>
                <span class="desc">呼吸:</span>
                <span>{{hspCzzlInfList.HUXI}}</span>
                <span class="unit"> 次/分</span>
            </li>
            <li>
                <span class="desc">心率:</span>
                <span>{{hspCzzlInfList.XINL}}</span>
                <span class="unit"> 次/分</span>
            </li>
            <li>
                <div class="desc" style="width: 200px">化验项目(照片、截图):</div>
                <div class="images" id="imgBox2"></div>
            </li>
        </ul>
    </div>
    <div class="wrapper" ms-if="currTab == 4">
        <table border="1">
            <tr>
                <td>
                    <span class="desc" style="width: 118px">治疗前影像类型:</span>
                    <span>CT平扫</span>
                </td>
                <td>
                    <span class="desc">影像时间:</span>
                    <span>2020-03-04 13:44:22</span>
                </td>
                <td>
                    <span class="desc">诊断:</span>
                    <span>{{hspCzzlInfList.CBZD}}</span>
                </td>
            </tr>
            <tr>
                <td>
                    <span class="desc">溶栓前转院:</span>
                    <span>否</span>
                </td>
                <td>
                    <span class="desc">本院静脉溶栓:</span>
                    <span>是</span>
                </td>
                <td>
                    <span class="desc">首剂给药时间:</span>
                    <span>2020-03-04 13:44:22</span>
                </td>
            </tr>
            <tr>
                <td>
                    <span class="desc">溶栓用药:</span>
                    <span>阿替普酶</span>
                </td>
                <td colspan="2">
                    <span class="desc">体重:</span>
                    <span>{{hspCzzlInfList.TIZHONG}}</span>
                    <span class="unit"> kg</span>
                </td>
            </tr>
            <tr>
                <td>
                    <span class="desc">首剂:</span>
                    <span>3.60</span>
                    <span class="unit"> mg</span>
                </td>
                <td>
                    <span class="desc">微泵:</span>
                    <span>32.40</span>
                    <span class="unit"> mg</span>
                </td>
                <td>
                    <span class="desc">溶栓用药:</span>
                    <span>阿替普酶</span>
                </td>
            </tr>
            <tr>
                <td colspan="3">
                    <div class="desc" style="width: 200px">护理记录单(截图):</div>
                    <div class="images" id="imgBox3"></div>
                </td>
            </tr>
            <tr>
                <td>
                    <span class="desc">大动脉闭塞:</span>
                    <span>是</span>
                </td>
                <td>
                    <span class="desc">闭塞部位:</span>
                    <span>颈内动脉颅内段</span>
                </td>
                <td>
                    <span class="desc">血管内治疗:</span>
                    <span>是</span>
                </td>
            </tr>
            <tr>
                <td>
                    <span class="desc">麻醉方式:</span>
                    <span>全麻</span>
                </td>
                <td colspan="2">
                    <span class="desc">全麻原因:</span>
                    <span>患者躁动</span>
                </td>
            </tr>
            <tr>
                <td>
                    <span class="desc" style="width: 120px">血管内治疗方式:</span>
                    <span>支架取栓 导管抽吸</span>
                </td>
                <td>
                    <span class="desc">支架取栓次数:</span>
                    <span>1</span>
                </td>
                <td>
                    <span class="desc">导管抽吸次数:</span>
                    <span>1</span>
                </td>
            </tr>
            <tr>
                <td>
                    <span class="desc">动脉穿刺时间:</span>
                    <span>2020-04-23 21:00</span>
                </td>
                <td>
                    <span class="desc">首次造影时间:</span>
                    <span>2020-04-23 21:00</span>
                </td>
                <td>
                    <span class="desc" style="width: 135px">术中新发部位栓塞:</span>
                    <span>否</span>
                </td>
            </tr>
            <tr>
                <td>
                    <span class="desc">再灌注结局:</span>
                    <span>TICI 2b级</span>
                </td>
                <td>
                    <span class="desc">取栓结束时间:</span>
                    <span>2020-04-23 21:00</span>
                </td>
                <td>
                    <span class="desc">再灌注时间:</span>
                    <span>2020-04-23 21:00</span>
                </td>
            </tr>
            <tr>
                <td>
                    <span class="desc">术中使用药物:</span>
                    <span>否</span>
                </td>
                <td>
                    <span class="desc" style="width: 135px">术后血管遗留狭窄:</span>
                    <span>否</span>
                </td>
                <td>
                    <span class="desc">是否住院:</span>
                    <span>是</span>
                </td>
            </tr>

        </table>
    </div>
</div>
<script type="text/javascript">
    var _emgSeq = "${emgSeq}";

    var vm = avalon.define({
        $id: 'report',
        tabs: ['一般信息', '危险因素', '既往史用药', '检验/检查结果', '再灌注治疗'],
        currTab: 0,
        // fzPicData: '',
        hspCzzlInfList: {
            /*tab1*/
            //主诉
            ZHUSU: '',
            //发病时间
            FBSJ: '',
            //最后正常时间
            ZHZCSJ: '',
            //到院方式
            DYFS: "",
            //到院时间
            DYSJ: '',
            //入院后 NIHSS 评分
            RYSNIHSSPF: '',
            /*table2*/

            //是否吸烟
            SFXY: '',
            // 是否二次溶栓
            SFRCRS: '',
            //是否高血压
            SFGXY: '',
            // 是否既往房颤
            SFJWFC: '',
            // 是否既往缺血性心脏病
            SFJWQXXXZB: '',
            // 是否新发房颤
            SFXFFC: '',
            //是否糖尿病
            SFTNB: '',
            //是否高血脂
            SFGXZ: '',
            // 是否冠心病
            SFGXB: '',
            //是否充血性心衰
            SFCXXXS: '',
            //是否既往卒中史
            SFJWCZS: '',
            // 是否心血管家族史
            SFXXGJZS: '',
            //是否过敏史
            SFGMS: '',

            /*table3*/
            SFJWASPL: '', //是否既往阿司匹林
            SFJWLBGL: '', //是否既往氯吡格雷
            SFJWHFL: '',  //是否既往华法林
            SFJWATFTT: '', //'是否既往阿托伐他汀
            SFJWRSFTT: '', //'是否既往瑞舒伐他汀

            /*tab4*/
            /*治疗前影像类型: CT平扫	影像时间: 2020-03-04 13:44:22	诊断: TIA
溶栓前转院: 否	本院静脉溶栓: 是	首剂给药时间: 2020-03-04 13:44:22
溶栓用药: 阿替普酶	体重: 40 kg
首剂: 3.60 mg	微泵: 32.40 mg	溶栓用药: 阿替普酶*/
            //治疗前影像类型
            //影像时间
            CBZD: '',    //诊断
            // 溶栓前转院
            //本院静脉溶栓
            // 首剂给药时间
            //溶栓用药
            TIZHONG:'', //体重
            //首剂
            //微泵
            //溶栓用药
            //取栓结束时间
            QSWCSJ:'',

        },
        hspDbzlBas: {},
        clickTab: function (idx) {
            vm.currTab = idx;
        }
    });
    //hspCzzlInfList需要把 1 0 的值转换成是否的CODE放进去 可以用ms ,页面改太麻烦了，用js转换数据
    var isArr = ['SFCXXXS', 'SFGMS', 'SFGXB', 'SFGXY', 'SFGXZ',
        'SFJWCZS', 'SFJWFC', 'SFJWQXXXZB', 'SFRCRS', 'SFTNB',
        'SFXFFC', 'SFXXGJZS', 'SFXY', 'SFJWASPL', 'SFJWLBGL',
        'SFJWHFL', 'SFJWATFTT', 'SFJWRSFTT'];
    //字典对应
    var dictMap=new Map();
    dictMap.set('CBZD','CZ_CBZD_COD')
    dictMap.set('DYFS','CZ_DYFS_COD')
    function getHelperData() {
        $.ajax({
            url: '${baseurl}cz/getCzReportHelperData.do',
            type: 'post',
            contentType: 'application/json;charset=UTF-8',
            data: JSON.stringify({
                emgSeq: _emgSeq
            }),
            success: function (res) {
                var data = res.resultInfo.sysdata;
                vm.hspDbzlBas = data.hspDbzlBas;
                var czInfo = data.hspCzzlInfList;
                czInfo.forEach(function (el) {
                    switch (true) {
                        case dictMap.has(el.proCode):
                            vm.hspCzzlInfList[el.proCode] = publicFun.codingEscape(publicFun.getDict(dictMap.get(el.proCode)), el.proVal)
                            break;
                        case isArr.some(ele => ele === el.proCode):
                            if (el.proVal)
                                vm.hspCzzlInfList[el.proCode] = el.proVal === '1' ? '是' : '否';
                            break;
                        default:
                            vm.hspCzzlInfList[el.proCode] = el.proVal
                            break;
                    }
                });
                //获取图片异常消息
                if (data.errMsg) {
                    alert("获取图片异常"+data.errMsg)
                }
                //分诊截图
                if (data.fzPicData) {
                    addPicture('imgBox', data.fzPicData)
                }
                //化验报告截图
                if (data.hyPicData) {
                    addPicture('imgBox2', data.hyPicData)
                }
                //护理记录单截图
                if (data.hlPicData) {
                    addPicture('imgBox3', data.hlPicData)
                }
            }
        })
    }

    function addPicture(tagId, data) {
        var _imgSrc = 'data:image/png;base64,' + data;
        var _imgHtml = '<div class="pic">' +
            '<img src=' + _imgSrc + ' data-original=' + _imgSrc + ' alt="">'
            + '</div>';
        $('#' + tagId).append(_imgHtml).viewer({url: 'data-original'});
    }

    $(function () {
        getHelperData();
    })

</script>
</body>
</html>