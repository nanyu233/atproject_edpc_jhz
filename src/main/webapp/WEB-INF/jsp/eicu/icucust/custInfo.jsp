<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8" %> <%@ include file="/WEB-INF/jsp/base/tag.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1" />
    <%@ include file="/WEB-INF/jsp/base/common_css.jsp" %>
    <%@ include file="/WEB-INF/jsp/base/common_js.jsp" %>
    <link
      rel="stylesheet"
      type="text/css"
      href="${baseurl}styles/common/querylist.css"
    />
    <link
      rel="stylesheet"
      type="text/css"
      href="${baseurl}styles/hzszyyhems/receitp.css?55"
    />
    <link
      rel="stylesheet"
      type="text/css"
      href="${baseurl}styles/hzszyyhems/hljl.css"
    />
    <link
      rel="stylesheet"
      type="text/css"
      href="${baseurl}styles/eicu/eicu_common.css"
    />
    <title>ICU护理记录</title>
    <script
      src="${baseurl}lib/avalon1.4.8/avalon.js"
      type="text/javascript"
      charset="UTF-8"
    ></script>
<%--    <%@ include file="/WEB-INF/jsp/eicu/eicuCommonJs.jsp"%>--%>
    <script
      language="javascript"
      src="${baseurl}Lodop6.216/LodopFuncs.js"
    ></script>
    <style>
      html {
        overflow: hidden;
      }

      body {
        overflow: auto;
      }

      #pt-bar {
        /* float: left; */
        display: flex;
        align-items: center;
        width: 100vw;
        min-width: 100px;
        height: 40px;
        background-color: #fff;
      }

      /* #pt-bar>div {
      float: left;
      height: 100%;
    } */

      /* #resc-mode {
      margin-left: 5px;
    } */

      #noteform {
        overflow: auto;
        width: 100vw;
      }

      #bedInfo {
        padding-left: 40px;
        padding-right: 10px;
        display: flex;
        align-items: center;
        height: 100%;
        font-size: 16px;
        color: #ad1f1f;
        border-right: 1px dashed #333;
      }

      #basicInfo,
      #height-info,
      #icuinfo,
      #score-info{
        display: flex;
        flex-direction: column;
        height: 100%;
        justify-content: center;
        flex-shrink: 0;
        padding-left: 10px;
        padding-right: 10px;
        border-right: 1px dashed #333;
      }
      #score-info {
        flex-direction: row;
        flex-wrap: wrap;
        flex: 1;
        padding-top: 3px;
        justify-content: flex-start;
        width: 10%;
        min-width: 160px;
        max-width: 20%;
        overflow: auto;
      }
      .sco-part {
        flex: 1 1 50%;
        flex-wrap: nowrap;
        font-size: 13px;
        min-width: 50%;
        cursor: pointer;
      }
      .sco-part:hover {
        text-decoration: underline;
      }
      .sco-part .sco-name {
        font-weight: bold;
      }
      #custName {
        font-size: 15px;
        color: #6791c0;
      }

      #icuinfo {
        padding-left: 10px;
      }

      #mark-info {
        margin-left: 10px;
      }

      #exBtn {
        position: absolute;
        top: 3px;
        left: 0;
        padding-left: 3px;
        width: 36px;
        height: 33px;
        line-height: 33px;
        text-align: center;
        color: #fff;
        background-color: rgba(103, 145, 192, 0.8);
        transition: all 0.3s ease-in-out;
        font-family: 'MicrosoftYaHei';
        font-size: 14px;
        cursor: pointer;
        border-radius: 0 6px 6px 0;
      }

      .xtpg .navDiv {
        float: none;
        position: absolute;
        top: 3px;
        left: 0;
        width: 0;
        height: 100%;
        overflow: hidden;
        z-index: 20;
        transition: all 0.3s ease-in-out;
        opacity: 0;
        background-color: rgba(103, 145, 192, 0.9);
      }

      /* #exBtn:hover {
      opacity: 0;
      z-index: 10;
    }

    #exBtn:hover~.navDiv {
      width: 138px;
      overflow: visible;
      opacity: 1;
    } */

      #exBtn.clickActive {
        opacity: 0;
        z-index: 10;
      }

      #exBtn.clickActive ~ .navDiv {
        width: 138px;
        overflow: visible;
        opacity: 1;
        border-radius: 0 6px 6px 0;
      }

      /* .xtpg .navDiv:hover {
      width: 138px;
      overflow: visible;
      opacity: 1;
    } */

      .xtpg .select_ul li {
        width: 138px;
        float: none;
      }

      .pagebtnparent {
        float: none;
      }

      .expandLi {
        position: relative;
      }

      .xtpg .select_li li {
        padding-left: 5px;
      }

      .xtpg .inside_ul {
        width: 202px;
        left: 138px;
        top: 0;
        float: none;
        max-height: 300px;
        overflow: auto;
      }

      .xtpg .select_ul .inside_ul li {
        /* width: 173px; */
        width: auto;
        overflow: hidden;
      }

      .select_ul .select_li:active {
        background-color: #fff;
      }

      .select_ul .select_li.active {
        background-color: #fff;
      }

      .select_ul .select_li.active a.specli {
        padding: 0 12px;
        color: #38629e;
        font-weight: bold;
      }

      .select_ul .select_li a:active {
        color: #38629e;
      }

      .select_ul .select_li a.specli i.iconGt {
        position: absolute;
        right: 0;
      }

      .select_ul .select_li a.specli.active i.iconGt {
        right: 12px;
      }
      
      .base-part:hover {
        text-decoration: underline;
      }


      @media screen and (max-width: 1100px) {
        body {
          font: 10.5px/1.5 \5FAE\8F6F\96C5\9ED1, \5b8b\4f53, Arial, sans-serif;
          overflow: auto;
        }

        .icu-btn {
          font-size: 12px;
        }

        #custName {
          font-size: 13px;
        }
        #score-info {
          flex-direction: row;
          flex-wrap: wrap;
          flex: 1;
          padding-top: 3px;
          justify-content: flex-start;
          max-width: 25%;
          width: 7%;
          min-width: 7%;
          overflow: auto;
        }
        .sco-part {
          min-width: 70%;
        }

      }
    </style>
  </head>

  <body class="xtpg" ms-controller="icuInfo">
    <!-- html的静态布局 -->
<%--    <div id="exBtn">{{pModuleId === nursHomeId ? '护' : '医'}}&gt;&gt;</div>--%>
<%--    <div class="navDiv">--%>
      <!-- <ul class="select_ul" style="width:140px">
        <iframe frameborder="0" scrolling="no"
            style="background-color:transparent; position: absolute; z-index: -1; width: 100%; height: 100%; top: 0; left:0;"></iframe>
        <li class="select_li" style="text-align:left;background-color:rgba(104,146,192,0.8)"><a href="#"
                style="width:30px;text-align:center">&lt;&lt;</a></li>
        <li class="select_li"><a href="#" class="pagebtnparent navlia" pagetype="custdet" pageval="1">患者信息</a></li>
        <li class="select_li"><a href="#" class="pagebtnparent navlia" pagetype="yzxx" pageval="1">医嘱信息</a></li>
        <li class="select_li"><a href="#" class="pagebtnparent navlia" pagetype="glgl" pageval="1">管路信息</a></li>
        <li class="select_li expandLi">
            <a href="#" class="specli" style="position:relative">护理文书
                <i class="iconGt">&gt;</i>
            </a>
            <ul class="inside_ul">
                <iframe frameborder="0" scrolling="no"
                    style="background-color:transparent; position: absolute; z-index: -1; width: 100%; height: 100%; top: 0; left:0;"></iframe>
                <li><a class="pagebtn" pagetype="bqhld" pageval="1" href="javascript:;">护理记录单</a></li>
                <li><a class="pagebtn" pagetype="bqhld" pageval="2" href="javascript:;">体温单</a></li>
                <li><a class="pagebtn" pagetype="bqhld" pageval="3" href="javascript:;">生命体征与呼吸机监护单</a></li>
                <li><a class="pagebtn" pagetype="bqhld" pageval="4" href="javascript:;">出入量与病情护理记录单</a></li>
                <li><a class="pagebtn" pagetype="bqhld" pageval="5" href="javascript:;">基础护理与管路护理记录单</a></li>
            </ul>
        </li>
        <li class="select_li expandLi">
            <a href="#" class="specli" style="position:relative">护理评估
                <i class="iconGt">&gt;</i>
            </a>
            <ul class="inside_ul">
                <iframe frameborder="0" scrolling="no"
                    style="background-color:transparent; position: absolute; z-index: -1; width: 100%; height: 100%; top: 0; left:0;"></iframe>
                <li><a class="pagebtn" pagetype="hlpg" pageval="1" href="javascript:;">入科评估单</a></li>
                <li><a class="pagebtn" pagetype="hlpg" pageval="2" href="javascript:;">患者评估单</a></li>
                <li><a class="pagebtn" pagetype="hlpg" pageval="3" href="javascript:;">营养评估单</a></li>
                <li><a class="pagebtn" pagetype="hlpg" pageval="4" href="javascript:;">出院评估单</a></li>
                <li><a class="pagebtn" pagetype="hlpg" pageval="5" href="javascript:;">转科交接记录单</a></li>
                <li><a class="pagebtn" pagetype="hlpg" pageval="6" href="javascript:;">组长交接表</a></li>
                <li><a class="pagebtn" pagetype="hlpg" pageval="7" href="javascript:;">肠内营养表</a></li>
                <li><a class="pagebtn" pagetype="hlpg" pageval="8" href="javascript:;">肠外营养表</a></li>
                <li><a class="pagebtn" pagetype="hlpg" pageval="9" href="javascript:;">多重耐药病人转接单</a></li>
                <li><a class="pagebtn" pagetype="hlpg" pageval="10" href="javascript:;">护理晨间交班表</a></li>
                <li><a class="pagebtn" pagetype="hlpg" pageval="11" href="javascript:;">ICU危重病人转科安全核查表</a></li>
                <li><a class="pagebtn" pagetype="hlpg" pageval="12" href="javascript:;">气道管理记录单</a></li>
                <li><a class="pagebtn" pagetype="hlpg" pageval="13" href="javascript:;">ICU危重病人外出安全核查表</a></li>
            </ul>
        </li>
        <li class="select_li expandLi">
            <a href="#" class="specli" style="position:relative">系统评分
                <i class="iconGt">&gt;</i>
            </a>
            <ul class="inside_ul">
                <iframe frameborder="0" scrolling="no"
                    style="background-color:transparent; position: absolute; z-index: -1; width: 100%; height: 100%; top: 0; left:0;"></iframe>
                <li><a class="pagebtn" pagetype="score" pageval="GCS" href="javascript:;">GCS格拉斯哥昏迷评分</a></li>
                <li><a class="pagebtn" pagetype="score" pageval="MODS" href="javascript:;">MODS多器官功能障碍评分</a></li>
                <li><a class="pagebtn" pagetype="score" pageval="SOFA" href="javascript:;">SOFA全身性感染相关性器官功能衰竭评分</a>
                </li>
                <li><a class="pagebtn" pagetype="score" pageval="APACHE2"
                        href="javascript:;">APACHE-Ⅱ急性生理与慢性健康评分</a></li>
                <li><a class="pagebtn" pagetype="score" pageval="RASS" href="javascript:;">RASS躁动镇静评分</a>
                </li>
                <li><a class="pagebtn" pagetype="score" pageval="CPOT" href="javascript:;">CPOT重症疼痛观察工具</a></li>
                <li><a class="pagebtn" pagetype="score" pageval="CAM" href="javascript:;">CAM-ICU谵妄评估量表</a></li>
                <li><a class="pagebtn" pagetype="score" pageval="NRS2002" href="javascript:;">NRS-2002营养风险筛查表</a>
                </li>
                <li><a class="pagebtn" pagetype="score" pageval="BRADEN" href="javascript:;">BRADEN压疮评分</a></li>
                <li><a class="pagebtn" pagetype="score" pageval="NRS" href="javascript:;">NRS疼痛评分</a></li>
                <li><a class="pagebtn" pagetype="score" pageval="FALL" href="javascript:;">FALL跌倒、坠床的危险因素评分</a></li>
                <li><a class="pagebtn" pagetype="score" pageval="EN" href="javascript:;">EN肠内营养耐受性评分表</a></li>
                <li><a class="pagebtn" pagetype="score" pageval="VTE" href="javascript:;">VTE静脉血栓栓塞风险评估单</a></li>
            </ul>
        </li>
        <li class="select_li expandLi">
            <a href="#" class="specli" style="position:relative">数据查询
                <i class="iconGt">&gt;</i>
            </a>
            <ul class="inside_ul">
                <iframe frameborder="0" scrolling="no"
                    style="background-color:transparent; position: absolute; z-index: -1; width: 100%; height: 100%; top: 0; left:0;"></iframe>
                <li><a class="pagebtn" pagetype="sjcx" pageval="1" href="javascript:;">生命体征管理</a></li>
                <li><a class="pagebtn" pagetype="sjcx" pageval="2" href="javascript:;">出入量管理</a></li>
            </ul>
        </li>
    </ul> -->
<%--    </div>--%>
    <form
      id="noteform"
      name="noteform"
      action="${baseurl}zjszyyhljld/exportHljldSubmit.do"
      method="post"
    >
      <!-- 查询列表 -->
      <input
        type="hidden"
        name="hspXtpgInfCustom.emgSeq"
        id="emgSeq"
        value="${emgSeq}"
      />
      <!-- datagrid -->
      <div class="receitpDiv xtpgxqDiv queryTabs" id="receitpDiv">
        <div class="receitpContent"></div>
      </div>
      <div class="clearBoth"></div>
    </form>
    <script type="text/javascript">
      var pagenum = 0;
      var _pModuleId = window.top._curModuleType;
      var _pageType = '${pagetype}';
      var pageval = '${pageval}';
      var _baseUrl = '${baseurl}';
      var _ippost = '${ippost}';
      var _sessionId = '${sessionId}';
      var _usrno = '${sessionScope.activeUser.usrno}';
      var _basicId; //底层菜单父元素menuId
      var basicLiveNo = ''; // 基准liveNo
      if (_pageType === 'root') {
        _pageType = '#';
      }
      var ptGradeMap = {}; // liveNo -> grade map
      // var comdata = {
      //   cstNam: '${cstNam}',
      //   custNo: '${custNo}',
      //   baseUrl: '${baseurl}',
      //   username: '${sessionScope.activeUser.usrname}',
      //   liveNo: '${liveNo}'
      // };
      // var emgSeqnew = "${emgSeq}";
    </script>
    <script type="text/javascript">
      var menuInfoObj = {}; //页面信息(id,type,name)
      var menuTotalStr = ''; //菜单总字串
      var lastSkipInfo; //上次跳转信息
      var vm = avalon.define({
        $id: 'icuInfo',
        nursHomeId: '200001',
        pModuleId: _pModuleId,
        ptBasicInfo: {
          custId: '',
          custNo: '',
          bedNo: '',
          bedSeq: '',
          liveNo: '${liveNo}',
          custName: '',
          custSex: '',
          custAge: '',
          inhosTimeStr: '',
          inicuTimeStr: '',
          outicuTimeStr: '',
          liveIcuTime: '',
          doctName: '',
          nursName: '',
          opTimeStr: '',
          opDays: '',
          diagInfo: '',
          erCount: '',
          rescMode: '1',
          nursNo: '',
          doctNo: '',
          deptNo: '',
          deptName: '',
          height: '',
          weight: '',
          nursCls: '',
          allergy: '',
          negPosit: '',
          custStat:'',
          custStatName:'',
        },
        curGradeInfo: [],
        allBedList: [],
        toScoPage: function (gradeInfo, e) {
          // 跳转评分页面
          if (e) {
            e.stopPropagation();
          }
          var gradeType = gradeInfo.gradeType;
          icuTabUtil.openTab(gradeType, vm.ptBasicInfo, {
            pageType: 'custInfo',
            pageData: {
              liveNo: vm.ptBasicInfo.liveNo,
            }
          });
        },
        toNursClsPage: function(e){
          if(vm.pModuleId === vm.nursHomeId){
            vm.toScoPage({gradeType: 'NURSCLS'}, e)
          }
        },
        toggleRescMode: function (e, csDevFlag) {
          if (e) {
            e.stopPropagation();
          }
          if (
            pageval === '103001' &&
            csDevFlag !== 'childCall' &&
            $(
              $('#receitpDiv').find('iframe').get(0).contentWindow.document.body
            ).find('iframe').length > 0
          ) {
            //  如果是生命体征护理单且打开了床边设备窗口，并且不是从床边设备窗口调用方法，取消方法调用
            return;
          }
          var confirmText;
          if (!csDevFlag) {
            //本页面调用 进行确认
            confirmText =
              vm.ptBasicInfo.rescMode === '0'
                ? '绑定设备采集频率将被修改为 1分钟/次，确认进入抢救模式？'
                : '绑定设备采集频率将被恢复为 10分钟/次，确认退出抢救模式？';
            _confirm(confirmText, null, function () {
              rescModeChange();
            });
          } else {
            return rescModeChange();
          }
        },
        changeBed: function (e) {
          var curEl;
          var curLiveNo;
          var curPtInfo;
          var lastBedSeq = vm.ptBasicInfo.bedSeq;
          var tabInfo;
          // console.log('liveNo搬空了', vm.ptBasicInfo.liveNo);
          if (e) {
            // changeBed
            curEl = e.target;
            curLiveNo = e.target.value;
            // curPtInfo = vm.allBedList.filter(function (ele, idx) {
            //   return ele.liveNo === curLiveNo;
            // })[0];
            // reload pt info
            console.log('changeBed');
            getAllBedList();
            vm.ptBasicInfo.liveNo = curLiveNo;
            // ajaxGetBasicInfo();
            // $.each(vm.ptBasicInfo, function (k, v) {
            //   if (vm.ptBasicInfo.hasOwnProperty(k)) {
            //     // 重新赋值
            //     vm.ptBasicInfo[k] = curPtInfo[k];
            //   }
            // });
            basicLiveNo = vm.ptBasicInfo.liveNo;
            // reloadPage
            init();
          }
        }
      });
      /**
       *获取上次跳转信息
       */
      function getLastSkipInfo() {
        console.log('lastSkipInfo', lastSkipInfo);
        return lastSkipInfo;
      }

      function reload() {
        // if (_pModuleId !== window.top._curModuleType) {
        //   firstInit()
        //   return;
        // }
        // lastSkipInfo = eicuUtil.shiftLastSkipInfo();
        lastSkipInfo = {
          pageData: {
            liveNo: '${liveNo}'
          }
        }
        // console.log('上次跳转');
        // console.log(lastSkipInfo);
        if (
          lastSkipInfo.pageData &&
          lastSkipInfo.pageData.liveNo !== basicLiveNo
        ) {
          // patient changed, reload page

          basicLiveNo = lastSkipInfo.pageData.liveNo;
          vm.ptBasicInfo.liveNo = basicLiveNo;
          getAllBasicDic();
          init();
        } else {
          getAllBasicDic();
          // if (pageval === "105001" || pageval === "104001") {
          //特殊处理评分总览
          $('#receitpDiv').find('iframe').get(0).contentWindow.reload &&
            $('#receitpDiv').find('iframe').get(0).contentWindow.reload();
          // } else if (lastSkipInfo.pageType) {
          //   //有跳转信息，发送iframe信息
          //   // $('#receitpDiv').find('iframe').get(0).contentWindow.postMessage(lastSkipInfo, '*')
          //   $('#receitpDiv').find('iframe').get(0).contentWindow.reload(lastSkipInfo);
          // }
        }
      }
      /**
       * get bed and pt info
       */
      function getAllBasicDic() {
        // getAllBedList();
        // ajaxGetBasicInfo();
      }
      /**
       *getBedinfo
       */
      function getAllBedList() {
        var reqUrl = _baseUrl + 'icucust/queryHavPatBedList.do';
        publicFun.httpRequest(
          reqUrl,
          {},
          {
            asyncFlag: false
          },
          function (res) {
            if (!res.resultInfo.success) {
              alert_warn('请求出错，请联系管理员');
              return;
            }
            var sysdata = res.resultInfo.sysdata;
            var sickbedList = sysdata.custList || [];
            vm.allBedList = sickbedList;
          }
        );
      }

      /**
       *获取基本信息
       */
      function ajaxGetBasicInfo() {
        var requestUrl = _baseUrl + 'icucust/findSelCustInfo.do';
        var udefFlag;
        if (_pModuleId === '200001') {
          udefFlag = 'nurse'
        } else if (_pModuleId === '300001') {
          udefFlag = 'doctor'
        }
        var requestParam = {
          liveNo : vm.ptBasicInfo.liveNo,
          udefFlag: udefFlag
        };
        publicFun.httpRequest(
          requestUrl,
          requestParam,
          {
            requestType: 'json',
            asyncFlag: false
          },
          function (res) {
            if (!res.resultInfo.success) {
              alert_error('请求失败，请联系管理员');
              return;
            }
            var customInfo = res.resultInfo.sysdata.icuCustInfoCustom;
            var gradeList = res.resultInfo.sysdata.gradeList;
            vm.curGradeInfo.clear();
            if (gradeList) {
              gradeList.forEach(function (gradeInfo) {
                var riskColor = gradeInfo.riskColor;
                if (riskColor) {
                  gradeInfo.textColorClass = riskColor.replace('bg-', 'text-');
                } else {
                  gradeInfo.riskColor = '';
                  gradeInfo.textColorClass = '';
                }
              })
              vm.curGradeInfo = gradeList;
            }
            $.each(customInfo, function (k) {
              if (customInfo.hasOwnProperty(k) && k !== 'liveNo' && k !== 'liveIcuTime') {
                vm.ptBasicInfo[k] = customInfo[k] === null ? '' : customInfo[k];
              } else if (k === 'liveIcuTime') {
                if (customInfo['outicuTimeStr']) {
                  vm.ptBasicInfo[k] = eicuUtil.getInIcuTime(publicFun.timeFormat(customInfo['inicuTimeStr'], 'yyyy/MM/dd'), publicFun.timeFormat(customInfo['outicuTimeStr'], 'yyyy/MM/dd'));
                } else {
                  vm.ptBasicInfo[k] = customInfo[k];
                }
              }
            });
            
            //判断是否显示体重单位
            var regPos = /^\d+(\.\d+)?$/;
            if(!isNaN(vm.ptBasicInfo['weight']) && regPos.test(vm.ptBasicInfo['weight'])) {
              $('.weightunit').show();
            } else {
              $('.weightunit').hide();
            }
          }
        );
      }

      /**
       * 子页面传递基本信息
       */
      function getBasicInfo() {
        var basicInfo = {
          //床号
          bedNo: vm.ptBasicInfo.bedNo,
          //床序号
          bedSeq: vm.ptBasicInfo.bedSeq,
          //住院号
          liveNo: vm.ptBasicInfo.liveNo,
          //身份证号
          custId: vm.ptBasicInfo.custId,
          //custNo
          custNo: vm.ptBasicInfo.custNo,
          //patientId
          patientId: vm.ptBasicInfo.patientId,
          //姓名
          custName: vm.ptBasicInfo.custName,
          //性别
          custSex: vm.ptBasicInfo.custSex,
          //年龄
          custAge: vm.ptBasicInfo.custAge,
          //入院时间
          inhosTimeStr: vm.ptBasicInfo.inhosTimeStr,
          // 入科时间
          inicuTimeStr: vm.ptBasicInfo.inicuTimeStr,
          // 入科天数
          liveIcuTime: !vm.ptBasicInfo.outicuTimeStr ? vm.ptBasicInfo.liveIcuTime : eicuUtil.getInIcuTime(vm.ptBasicInfo.inicuTimeStr, vm.ptBasicInfo.outicuTimeStr),
          // 出科时间
          outicuTimeStr: vm.ptBasicInfo.outicuTimeStr || '',
          // 医生
          doctName: vm.ptBasicInfo.doctName,
          // 护士
          nursName: vm.ptBasicInfo.nursName,
          // 手术日期
          opTimeStr: vm.ptBasicInfo.opTimeStr,
          // 术后天数
          opDays: vm.ptBasicInfo.opDays,
          //诊断
          diagInfo: vm.ptBasicInfo.diagInfo,
          // 阳性：
          // 过敏史：
          rescMode: vm.ptBasicInfo.rescMode,
          height: vm.ptBasicInfo.height,
          //体征
          weight: vm.ptBasicInfo.weight,
          deptNo: vm.ptBasicInfo.deptNo,
          deptName: vm.ptBasicInfo.deptName,
          nursCls : vm.ptBasicInfo.nursCls,
          allergy : vm.ptBasicInfo.allergy,
          negPosit : vm.ptBasicInfo.negPosit,
          custStatName: vm.ptBasicInfo.custStatName,
          custStat: vm.ptBasicInfo.custStat,
        };
        return basicInfo;
      }

      /**
       *子页面传递menuInfoObj
       */
      function getMenuInfo() {
        return menuInfoObj;
      }
      /**
       *子页面传递血气跳转的时间
       */
      function getBgTimeStr() {
        return '${bgTimeStr}' || '';
      }
      /**
       *子页面传递scoreTitle
       */
      function getScoreTitle(_gradeSeq) {
        for (var k in menuInfoObj) {
          if (menuInfoObj.hasOwnProperty(k)) {
            var thisObj = menuInfoObj[k];
            if (thisObj.menuType === _gradeSeq) {
              return thisObj['menuName'];
            }
          }
        }
      }
      /**
       *rescMode变化请求
       */
      function rescModeChange() {
        var ptInfo = vm.ptBasicInfo;
        var targetMode = ptInfo.rescMode === '0' ? '1' : '0';
        var reqUrl = '${baseurl}icucust/editRescMode.do';
        var reqParams = {
          liveNo: ptInfo.liveNo,
          rescMode: targetMode
        };
        return publicFun.httpRequest(
          reqUrl,
          reqParams,
          {
            requestType: 'json'
          },
          function (res) {
            if (res.resultInfo.success) {
              //成功后改变模式
              ptInfo.rescMode = targetMode;
            }
          }
        );
      }
      /**
       * [setLayout 初始化布局]
       */
      function setLayout() {
        var windowWidth = $(window).width(),
          windowHeight = $(window).height();
        // $(".xtpg .navDiv").height(windowHeight);
        // $("#receitpDiv .dataGridDiv").height(windowHeight - 316);
        $('#receitpDiv').height(windowHeight - 41);
      }
      // window.onload = function () {
      //   window.onresize = setLayout;
      //   setLayout();
      // }

      /**
       * init page
       */
      function init() {
        console.log('新页面，pagetype是：${pagetype}, pageval是：${pageval}');
        // menuClickBind();
        var $clickOne = $("[pageval='" + pageval + "']");
        $clickOne.addClass('active');
        if (_pageType !== _basicId) {
          $clickOne.parent().parent().parent().addClass('active');
        }
        choosePage();
      }

      //菜单栏选择事件
      function menuClickBind() {
        $('.pagebtn,.pagebtnparent')
          .off('click')
          .on('click', function () {
            // setLayout();
            var $clickOne = $(this);
            newTabPage($clickOne);
          });
      }

      /**
       * 跳转方法
       */
      function choosePage() {
        var mainUrl;
        var menu = menuInfoObj[pageval];
        if(menu){
          var gradeType = menu.menuType;
          if (gradeType !== '#') {
            console.log('GRADETYPE: ', gradeType);
            if (gradeType === 'APACHE2') {
              mainUrl = '${baseurl}icuscore/toTimelinePage.do?gradeType=' + gradeType;
            } else {
              mainUrl = '${baseurl}icuscore/toBasicPage.do?gradeType=' + gradeType + '&liveNo=' + '${liveNo}';
            }
          } else {
            mainUrl = '${baseurl}' + menuInfoObj[pageval].menuUrl;
          }
        } else {
            mainUrl = '${baseurl}' + pageval;
        }

        // if (_pageType === "105000") {
        //   //如下情况特殊跳转
        //   //如果是系统评分
        //   mainUrl = "${baseurl}icuscore/toNewBasicPage.do?gradeType=" + gradeType;
        // } else if (_pageType === "104000") {
        //   //评估单类型分为
        //   //直接跳转----患者评估单  类评分----VTE
        //   if (gradeType !== '#') {
        //     mainUrl = "${baseurl}icuscore/toNewBasicPage.do?gradeType=" + gradeType;
        //   } else {
        //     mainUrl = "${baseurl}" + menuInfoObj[pageval].menuUrl;
        //   }

        // } else {
        //   //如下情况直接跳转
        //   //一级菜单   ----- parent:_basicId
        //   //病情护理单 ----- parent:103002
        //   //数据查询  ------ parent:111000
        //   mainUrl = "${baseurl}" + menuInfoObj[pageval].menuUrl;
        // }

        // console.log("跳转的链接是：" + mainUrl);
        //跳转
        $('#receitpDiv').html(createFrame(mainUrl));
      }

      //主菜单
      function newTabPage($clickOne) {
        //收起所有菜单
        collapseNav();
        var clickPageType = $clickOne.attr('pagetype');
        var clickPageVal = $clickOne.attr('pageval');
        var thisPageInfo;
        if (clickPageVal === '108000') {
          var openurl =
            'http://192.168.120.155/Response/HisRedirect.asp?LoginId=his&Password=123456&kind=2&HisId=' +
            vm.ptBasicInfo.liveNo;
          var height = window.screen.availHeight;
          var MaxWidth = window.screen.availWidth;
          var showWidth =
            window.screen.availWidth * 0.8 < 1160
              ? 1160
              : window.screen.availWidth * 0.8;

          window.open(
            openurl,
            vm.ptBasicInfo.custName + '检查报告查询',
            'height=' +
              height * 0.8 +
              ',width=' +
              showWidth +
              ',top=' +
              height * 0.1 +
              ',left=' +
              (MaxWidth - showWidth) / 2 +
              ',toolbar=no,menubar=no,scrollbars=no, resizable=no,location=no, status=no',
            false
          );
        } else if (
          menuInfoObj[clickPageVal] &&
          menuInfoObj[clickPageVal].menuUrl &&
          menuInfoObj[clickPageVal].menuUrl !== '#'
        ) {
          // opentab
          icuTabUtil.openTab(clickPageVal, vm.ptBasicInfo);
        }
      }

      //创建生成的 iframe 嵌入页面
      function createFrame(url) {
        var height = $(window).height() - 40 + 'px';
        var content =
          '<iframe id ="rightFrame" frameborder="0" scrolling="auto" src="' +
          url +
          '"  style="position:relative;z-index:0;width: 100%;height:' +
          height +
          '"></iframe>';
        return content;
      }

      // function setTime() {
      //     var _today = publicFun.timeFormat(new Date(), "yyyy/MM/dd");
      //     $("#emg_startdate").val(_today);
      //     $("#emg_enddate").val(_today);
      // };

      /**
       * 平板注册导航栏收起事件
       */
      function collapseNav() {
        $('.select_ul .select_li').each(function () {
          $(this).children('a').removeClass('active');
          $(this).find('i.iconGt').html('&gt;&gt;');
          $(this).children('ul.inside_ul').hide();
        });
        $("[pageval='${pageval}']").addClass('active');
        $('#exBtn').removeClass('clickActive');
      }
      /**
       * 平板注册导航栏单击事件
       */
      function navClick() {
        //一级菜单点击展开事件
        $('#exBtn')
          .off('click')
          .on('click', function () {
            if (event) {
              event.stopPropagation();
            } //阻止向父页面冒泡
            if ($('#exBtn').hasClass('clickActive')) {
              //收起所有菜单
              collapseNav();
            } else {
              $('.select_ul .select_li').each(function () {
                $(this).children('a').removeClass('active');
                $(this).find('i.iconGt').html('&gt;&gt;');
                $(this).children('ul.inside_ul').hide();
              });
              $("[pageval='${pageval}']").addClass('active');
              $('#exBtn').addClass('clickActive');
            }
          });
        //二级菜单点击展开事件
        $('.select_ul .expandLi')
          .off('click')
          .on('click', function () {
            if (event) {
              event.stopPropagation();
            }
            if (!$(this).children('a').hasClass('active')) {
              //如果点击其余的进行操作，如果点击本身不进行操作
              $('.select_ul .select_li').each(function () {
                $(this).children('a').removeClass('active');
                $(this).find('i.iconGt').html('&gt;&gt;');
                $(this).children('ul.inside_ul').hide();
              });
              $(this).children('a').addClass('active');
              $(this).find('i.iconGt').html('&lt;&lt;');
              $(this).children('ul.inside_ul').show();
            }
          });
        //外层元素上层点击取消展开事件--choosePage触发后增加点击iframe事件
        $('.xtpg')
          .off('click')
          .on('click', function () {
            if (event) {
              event.stopPropagation();
            }
            if ($('#exBtn').hasClass('clickActive')) {
              collapseNav();
            }
          });
        // common_js.jsp => 增加子页面判断，如果父页面是custInfo，增加body点击事件，收起菜单
      }
      /**
       * setenuInfo
       */
      function setMenuInfoObj() {
        //菜单渲染
        var icuMenu = sessionStorage.getItem('icuMenu');
        icuMenu = JSON.parse(icuMenu);
        menuInfoObj = icuMenu['menuInfoObj'];
        menuTotalStr = icuMenu['menuTotalStr'];
        $.each(menuInfoObj, function (k, v) {
          _basicId = v.menuRoot;
          return false;
        });
        // $('.navDiv').empty().append(menuTotalStr);
      }
      /**
       * 跳转事件管理
      */
      function toErPage(tabKey) {
        icuTabUtil.openTab(tabKey,vm.ptBasicInfo);
      }
      
      function open360Page(){
        var url =
            "http://172.100.0.120:33600/view/subjects/PATINETID/records?user_name=jnicu360&password=jnicu360yh&patient_source_type=&clientId=icu360&visit_type=&source_no=LIVENO";
        var _patientId = vm.ptBasicInfo.patientId;
        var _liveNo = vm.ptBasicInfo.liveNo
        url = url.replace("PATINETID", _patientId).replace("LIVENO", _liveNo)
        console.log(url)
        window.open(url, "_blank");
      }
      
      function openBedBind() {
        if (window.top.firstApp) {
          window.top.firstApp.hasModalWindow = true;
        }
        var modalTitle;
        var modalWidth = 600;
        var modalHeight = 400;
        var modalUrl = _baseUrl + 'icubedinfo/toBedBindInfo.do';
        modalTitle = '转床记录查询';
        createmodalwindow(modalTitle, modalWidth, modalHeight, modalUrl, 'no');
      }
      
      /**
       * first init
       */
      function firstInit() {
        console.log(window.top)
        setMenuInfoObj();
        //fist init
        // lastSkipInfo = eicuUtil.shiftLastSkipInfo();
        lastSkipInfo = {}
        basicLiveNo = '${liveNo}';
        vm.ptBasicInfo.liveNo = basicLiveNo;
        getAllBasicDic();
        init();
      }

      function toEditUnEntry(){
        if (window.top.firstApp) {
          window.top.firstApp.hasModalWindow = true;
        }
        var modalTitle;
        var modalWidth = 600;
        var modalHeight = 310;
        var modalUrl = _baseUrl + 'icucust/toEditUnEntry.do';
        modalTitle = '患者出入科记录';
        createmodalwindow(modalTitle, modalWidth, modalHeight, modalUrl, 'no');
      }

      function toEditInfo(){
        if (window.top.firstApp) {
          window.top.firstApp.hasModalWindow = true;
        }
        var modalTitle;
        var modalWidth = 600;
        var modalHeight = 240;
        var modalUrl = _baseUrl + 'icucust/toEditBaseInfo.do';
        modalTitle = '基础数据修改';
        createmodalwindow(modalTitle, modalWidth, modalHeight, modalUrl, 'no');
      }

      function toEditDiag() {
        if (window.top.firstApp) {
          window.top.firstApp.hasModalWindow = true;
        }
        var modalTitle;
        var modalWidth = 600;
        var modalHeight = 350;
        var modalUrl = _baseUrl + 'icucust/toEditDiag.do';
        modalTitle = '修改诊断信息';
        createmodalwindow(modalTitle, modalWidth, modalHeight, modalUrl, 'no');
      }

      $(function () {
        /**
         * id - tabKey
         */
         var btnMap = {
          'erpage-link-btn': {
            tabKey: 'erPage',
            customFunc: toErPage
          },
          'bedbind-link-btn': {
            tabKey: 'bedBind',
            tabName: '转床记录',
            customFunc: openBedBind
          },
          'hz360-link-btn' :{
            tabKey: '360btn',
            tabName: '患者360',
            customFunc: open360Page
          }
        };
        // icuTabUtil.renderTabBtn(btnMap);
        window.onresize = setLayout;
        setLayout();
        // $("body").focus();
        firstInit();

        //完成后增加点击菜单栏事件
        // navClick();
        // $(".select_ul .select_li").hover(function () {
        //   $(this).children("a").addClass("active");
        //   // $(this).find("i.iconBg").addClass("active");
        //   $(this).find("i.iconGt").html("&lt;&lt;");
        //   $(this).children("ul.inside_ul").show();
        // }, function () {
        //   if ($(this).children("a").attr("pagetype") !== pagetype || $(this).children("a").attr("pageval") !==
        //     pageval) {
        //     $(this).children("a").removeClass("active");
        //     // $(this).find("i.iconBg").removeClass("active");
        //     $(this).find("i.iconGt").html("&gt;&gt;");
        //     $(this).children("ul.inside_ul").hide();
        //   }
        // });
      });
    </script>
  </body>
</html>
