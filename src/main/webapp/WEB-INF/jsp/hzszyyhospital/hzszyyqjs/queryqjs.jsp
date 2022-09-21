<%@ page language="java" import="java.util.*" pageEncoding="UTF8"%>
<%@ include file="/WEB-INF/jsp/base/tag.jsp"%>
<!DOCTYPE html>
<html>

<head>
  <title>抢救室管理-会诊登记</title>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <%@ include file="/WEB-INF/jsp/base/common_css.jsp"%>
  <link rel="stylesheet" type="text/css" href="${baseurl}css/common/querylist.css" />
  <link rel="stylesheet" type="text/css" href="${baseurl}css/hems/global.css" />
  <link rel="stylesheet" type="text/css" href="${baseurl}css/hzszyyhems/queryqjs.css?v=${versionDay}" />
  <%@ include file="/WEB-INF/jsp/base/common_js.jsp"%>
  <script type="text/javascript" src="${baseurl}lib/jsBarcode/jsBarcode.all.js?v=${versionDay}"></script> 
  <script language="javascript" src="${baseurl}Lodop6.216/LodopFuncs.js"></script>
  <script>
    var _islgbed = '${islgbed}', // 0 不显示留观床位  1 显示留观床位
      baseurl = "${baseurl}",
      applySrc = '${apply_src}', // 判断会诊版本[0：医生(保存不变) 1：护士(改动)]
      docType = '${docType}', // hzys就是会诊医生， 等于 other 就是其他
      pageName = 'queryQjs',
      isSmallBed = false; // 是否显示小的床位 true 显示
  </script>
</head>

<body class="bottomQjs">
  <form id="qjsform" action="${baseurl}hzszyyemg/delzyyemgSubmit.do" method="post">
    <input type="hidden" id="deletezyy_id" name="emgSeq" />
    <div class="form clr">
      <p class="form-text">日期：</p>
      <input class="Wdate small-date" id="emg_startdate" type="text" name="hspemginfCustom.startdate" onclick="WdatePicker({dateFmt:'yyyy/MM/dd',isShowClear:false,readOnly:true})">
      <p class="form-text">-</p>
      <input class="Wdate small-date" id="emg_enddate" type="text" name="hspemginfCustom.enddate" onclick="WdatePicker({dateFmt:'yyyy/MM/dd',isShowClear:false,readOnly:true})" />
      <select onchange="setType()" id="typeVal">
        <option value="1">患者姓名</option>
        <!-- <option value="2">就诊卡</option> -->
        <option value="3">病历号</option>
        <option value="4">诊断</option>
      </select>
      <span class="spanRelative">
        <input id="queryText" type="text" class="input-wth" onkeyup="keyCodeUp(window.event)" autocomplete="off">
        <div class="userList smallList" id="queryNameList"></div>
      </span>
      <input id="emgText1" type="text" class="queryEmg hidden">
      <input id="emgText2" type="text" class="queryEmg hidden">
      <input id="emgText3" type="text" class="queryEmg hidden">
      <input id="emgText4" type="text" class="queryEmg hidden">
      <p class="form-text">去向：</p>
      <select id="cstDepVal"></select>
      <p class="line-p-text">
        <input id="checkRecord1" type="checkbox" class="m-t5 isCheckRecord" onchange="singleCheck(this)">
        <label for="checkRecord1">病历已查对&emsp;</label>
        <input id="checkRecord2" type="checkbox" class="m-t5 isCheckRecord" onchange="singleCheck(this)">
        <label for="checkRecord2">病历未查对&emsp;</label>
      </p>
      <a href="javascript:;" id="search" class="easyui-linkbutton" iconCls="icon-search" onclick="getPatientList()">查询</a>
      <span class="span-icon icon icon-form"></span>
      <span class="line-span extra-span" onclick="queryItem('0', 'bedPlace', '291')">抢-占床(<span class="inline-span" id="qjsbedcount">1</span>)</span>
      <span class="line-span extra-span save-bed" onclick="queryItem('1', 'bedPlace', '290')">留-占床(<span class="inline-span" id="lgsbedcount">2</span>)</span>
      <span class="line-span" onclick="queryItem('2', 'mqdate')">大于72小时滞留(<span class="inline-span" id="zlcount">3</span>)</span>
      <span class="line-span" onclick="queryItem('3', 'grnChl')">绿色通道(<span class="inline-span" id="lstdcount">4</span>)</span>
      <span class="line-span" onclick="queryItem('4', 'qtsjFlg')">群体伤(<span class="inline-span" id="qtsjcount">0</span>)</span>
      <span class="line-span" onclick="queryItem('5', 'cspgFlg')">创伤(<span class="inline-span" id="cscount">4</span>)</span>
      <span class="line-span" onclick="queryItem('6', 'xtFlg')">胸痛(<span class="inline-span" id="xtcount">4</span>)</span>
      <span class="line-span" onclick="queryItem('7', 'czFlg')">卒中(<span class="inline-span" id="czcount">4</span>)</span>
      <span class="line-span" onclick="queryItem('8', 'hxknFlg')">呼吸困难(<span class="inline-span" id="hxkncount">4</span>)</span>
      <span class="line-span" onclick="queryItem('9', 'xfztFlg')">心脏骤停(<span class="inline-span" id="xfztcount">4</span>)</span>
    </div>
  </form>
  <div class="print-wrap isAlreadyPrint" id="execDiv" style="display:none">
    <div class="print-content">
      <div class="full-div">
        <span class="big-size" id="tranName"></span>
        <span class="right-time small-time-fs"></span>
      </div>
      <div class="border-line full-div">
        <span class="right-gap-small" id="tranBed"></span>
        <span class="right-gap" id="tranSex"></span>
        <span class="right-gap" id="tranMpi"></span>
        <span id="tranBedPlace"></span>
        <span class="small-title">剂量</span>
      </div>
      <div class="main-wrap full-div">
        
      </div>
      <div class="drug-wrap full-div">
        <span class="time-span" id="nowTime"></span>
        &nbsp;
        签名:<span></span><span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</span>
      </div>
    </div>
  </div>
  <div class="at-container-fluid">
    <div class="at-tabs-container" id="tabsContainer">
      <div class="clr" id="sickbedContainer">
      </div>
      <div class="list-container" id="listContainer">
        <div class="patient-list">
          <div id="patientList"></div>
        </div>
        <hr class="hrSpace consultationDiv">
        <div class="consultation queryTabs consultationDiv">
          <div id="consultation"></div>
        </div>
      </div>
    </div>
    <div class="at-tabs" id="tabs">
      <dl class="at-panel">
        <dt class="at-panel-heading clr">
          <h3 class="at-panel-title">浏览模式</h3>
          <hr class="dashed-line">
        </dt>
        <dd class="at-panel-body clr">
          <label class="look-type" for="card">
            <input id="card" type="radio" name="lookType" checked onclick="getSickbedMsg()"> 简卡模式
          </label>
          <label class="look-type" for="list">
            <input id="list" type="radio" name="lookType" onclick="getPatientList()"> 列表模式
          </label>
        </dd>
      </dl>
      <dl class="at-panel">
        <dt class="at-panel-heading clr">
          <h3 class="at-panel-title">操作</h3>
          <hr class="dashed-line" style="width: 170px;">
        </dt>
        <dd class="at-panel-body clr" id="actionBtnContainer">
          <!-- <a class="commonbtn" id="nursingRecord" href="javascript:;" onclick="nursingRecord()">护理记录</a>
                <a class="commonbtn" id="changeRecord" href="javascript:;" onclick="changeRecord()">修改/转归</a>
                <a class="commonbtn" id="deleteRecord" href="javascript:;" onclick="deleteRecord()">删除</a>
                <a class="commonbtn" id="enteringDiagnose" href="javascript:;" onclick="enteringDiagnose()">转归登记</a>
               <a class="commonbtn" id="printWristbands" href="javascript:;" onclick="deploySickbed()">调配床位</a>
               <a class="commonbtn" id="consultationInvited" href="javascript:;" onclick="consultationInvited()">会诊邀请</a>
               <a class="commonbtn" id="printWristbands" href="javascript:;" onclick="printWristbands()">腕带打印</a> -->
        </dd>
      </dl>
      <dl class="at-panel">
        <dt class="at-panel-heading clr">
          <h3 class="at-panel-title">查看</h3>
          <hr class="dashed-line" style="width: 170px;">
        </dt>
        <dd class="at-panel-body clr">
          <a class="look" onclick="checkMsg()">
            检验信息
          </a>
          <a class="look" onclick="checkTestRcord()">
            检查报告
          </a>
          <a class="look" onclick="checkYzxx()">
            医嘱信息
          </a>
          <!-- <a class="look" onclick="getChargingDetail()">
            收费信息
          </a> -->
          <a class="look" onclick="consultationList()">
            会诊情况
          </a>
          <a class="look" onclick="patientDetail()">
            就诊时间轴
          </a>
          <!-- toBigScreen -->
          <!-- <a class="look" href="${baseurl}zyyqjs/qjsScreen.do" target="blank">
            留抢大屏
          </a>
          <a class="look" href="${baseurl}zyylqblqrb/querylqblqrb.do" target="blank">
            留抢病历嵌入版
          </a> -->
          <a class="look" href="javascript:;" onclick="zgInfo()">转归记录</a>
        </dd>
        <!-- <dd>
          <span>今日统计数：</span>
          <span>昨日留抢 55</span> 
          <span>现有留抢 55</span>
          <span>今日入抢 55</span>
          <span>今日出抢 55</span>
        </dd> -->
      </dl>
    </div>
  </div>
  <div class="tips" id="tips">
    <div class="triangleCss"></div>
    <div>
      <p>床号：<i class="text-info" id="bedPlcNam"></i></p>
      <!-- <img>就诊号：<i class="text-info" id="vstCad"></i></p> -->
      <p>病历号：<i class="text-info" id="mpi"></i></p> 
      <p>就诊次数：<i class="text-info" id="jzxh"></i></p> 
      <p>姓名：<i class="text-info" id="cstNam"></i></p>
      <p>性别：<i class="text-info" id="cstSexCod"></i></p>
      <p>年龄：<i class="text-info" id="cstAge"></i></p>
      <p>联系电话：<i class="text-info" id="pheNbr"></i></p>
      <p>&emsp;</p>
      <p>预检时间：<i class="text-info" id="emgDat"></i></p>
      <p>主诉症状：<i class="text-info" id="preDgnCod"></i></p>
      <p>西医诊断：<i class="text-info" id="jbzdDes"></i></p>
      <p>急诊科室：<i class="text-info" id="emgFkCod"></i></p>
      <p>分诊护士：<i class="text-info" id="preUsrNam"></i></p>
      <p>隔离措施：<i class="text-info" id="glcs"></i></p>
    </div>
  </div>
  <ul id="rightMenu" class="rightMenu">
  </ul>
  <OBJECT id="smkOcx" classid="clsid:E691A607-D1D2-48A7-A0EC-09511883A445" width="0" height="0" align="center" hspace="0"
    vspace="0"></OBJECT>
  <div id="printMedicalRecordDiv" style="display: none;">
      <div style="width: 47mm; float: left; margin-right: 1mm; height: 14mm;" id="qrCodeWrapDiv">
        <img id="qrCodeWrap" style="width: 100%; height: 14mm;"></img>
      </div>
      <ul style="width: 48mm;float:left;list-style:none;margin:0px;padding:0px;font-size: 0.33cm;font-family:楷体;font-weight: bolder;" class="medicalList">
        <li>
          <span>
            <label>姓名:</label>
            <label id="m_cstNam"></label>
          </span>
        </li>
        <li>
          <span class="liWthPrint">
            <label>年龄:</label>
            <label id="m_cstAge"></label>
          </span>
          <span class="liWthPrint">
            <label>床号:</label>
            <label id="m_bedNum"></label>
          </span>
        </li>
        <li>
          <span class="liWthPrint">
            <label>性别:</label>
            <label id="m_cstSexCod"></label>
          </span>
          <label>抢救室</label> 
        </li>
        <li>
          <label>病历号:</label>
          <label id="m_mpi"></label>
        </li>
      </ul>
  </div>
  <div id="printTitle" style="display: none;">
    <p style="float: left; font-family:楷体; font-weight: bolder;">浙江医院<br/>${wristbandName}</p>
  </div>
  <div style="width:100%;height:100%; display:none;font-size: 15;" id="print">
    <ul style="width: 140mm;margin:0px;font-size: 0.36cm;font-family:楷体;font-weight: bolder;">
      <!-- <li style="list-style: none; text-align: center;">${hospitalPlatformName}</li> -->
      <li>
        <span>
          <label>姓名:</label>
          <label id="p_cstNam" style="font-size: 0.38cm;"></label>
        </span>
      </li>
      <li>
        <span class="liWthPrint">
          <label>病历号:</label>
          <!-- <label id="p_vstCad"></label> -->
          <label id="p_mpi"></label>
        </span>
        <label>入院日期:</label>
        <label id="p_emgDat"></label>
      </li>
      <li>
        <span class="liWthPrint">
          <label>性别:</label>
          <label id="p_cstSexCod"></label>
        </span>
        <span class="liWthPrint">
          <label>年龄:</label>
          <label id="p_cstAge"></label>
        </span>
      </li>
      <li>
        <label>电话:</label>
        <label id="p_tellPhone"></label>
      </li>
      <li>
        <label>病区:</label>
        <label id="p_hosArea"></label>
      </li>
      <!-- <li>
        <span class="liWthPrint">
          <label>电话:</label>
          <label id="p_tellPhone"></label>
        </span>
        <label>病区:</label>
        <label id="p_hosArea"></label>
      </li> -->
    </ul>
  </div>
  <input type="text" class="hidden" id="emg_emgSeq" />
  <jsp:include page="/WEB-INF/jsp/hzszyyhospital/hzszyyqjs/qrcode/qrcodeWD.jsp"></jsp:include>
  <script type="text/javascript" src="${baseurl}js/subpageJs/hzszyyhospital/commonBed/qjsBed.js?11"></script>
  <script type="text/javascript">
    //按钮权限分配
    var extraParams = "${moduleid}";
    var className = "commonbtn"; // class样式名
    publicFun.ajaxValTyp2(extraParams, className, ulGetBtn, 'ul');
    function ulGetBtn(textAll, btnAll) {
      var _len = $('#rightMenu dtaLth').val();
      $('#rightMenu').height(40 * _len);
      $('#rightMenu').html(textAll);
      $('#actionBtnContainer').html(btnAll);
    }

    /**
     * [hideTips 隐藏tips]
     */
    function hideTips() {
      $('#tips').hide()
    }

    function bedItemClick(indx) {
      // 根据idx生成checkedObj
      $.each(variableList, function (index, val) {
        if (allSickbedList[indx].hasOwnProperty(val)) {
          checkedObj[val] = allSickbedList[indx][val]
        } else {
          checkedObj[val] = ''
        }
      });
      openNurseBox(checkedObj);
    }

    // 单选
    function singleCheck (current) {
      if (!$(current).attr('checked')) {
        $(current).attr('checked', false)
      } else {
        $('.isCheckRecord').attr('checked', false)
        $(current).attr('checked', true)
      }
      getPatientList()
    }

    /**
     * [getPatientList 获取病人信息列表]
     */
    function getPatientList(obj) {
      setType();
      if (applySrc && applySrc == '1') {
        $('.list-container').addClass('centerLayout')
      } else {
        $('.list-container').removeClass('centerLayout')
      }
      var startdate = $('#emg_startdate').val(),
        enddate = $('#emg_enddate').val(),
        cstNam = $('#emgText1').val(),
        // vstCad = $('#emgText2').val(),
        mpi = $('#emgText3').val(),
        preDgnName = $('#emgText4').val();
      var _checkStatus = ''; // (1-未核对，2-已核对)
      if ($('#checkRecord1').attr('checked')) {
        _checkStatus = '2'
      } else if ($('#checkRecord2').attr('checked')) {
        _checkStatus = '1'
      }
      var dataObj = {};
      if (obj) {
        if (obj.bedPlace == '290' || obj.bedPlace == '291') {
          startdate = '';
          enddate = '';
        }
        dataObj = {
          'emgSeq': '',
          'hspemginfCustom.startdate': startdate,
          'hspemginfCustom.enddate': enddate,
          'hspemginfCustom.cstNam': cstNam,
          // 'hspemginfCustom.vstCad': vstCad,
          'hspemginfCustom.mpi': mpi,
          'hspemginfCustom.preDgnName': preDgnName,
          'hspemginfCustom.sqlStaCod': $('#cstDepVal').val(),
          'hspemginfCustom.bedPlace': obj.bedPlace,
          'hspemginfCustom.mqdate': obj.mqdate,
          'hspemginfCustom.grnChl': obj.grnChl,
          'hspemginfCustom.qtsjFlg': obj.qtsjFlg,
          'hspemginfCustom.cspgFlg': obj.cspgFlg,
          'hspemginfCustom.xtFlg': obj.xtFlg,
          'hspemginfCustom.czFlg': obj.czFlg,
          'hspemginfCustom.hxknFlg': obj.hxknFlg,
          'hspemginfCustom.xfztFlg': obj.xfztFlg,
          'checkRecord': _checkStatus
        };
      } else {
        dataObj = {
          'emgSeq': '',
          'hspemginfCustom.startdate': startdate,
          'hspemginfCustom.enddate': enddate,
          'hspemginfCustom.cstNam': cstNam,
          // 'hspemginfCustom.vstCad': vstCad,
          'hspemginfCustom.mpi': mpi,
          'hspemginfCustom.preDgnName': preDgnName,
          'hspemginfCustom.sqlStaCod': $('#cstDepVal').val(),
          'hspemginfCustom.bedPlace': '',
          'hspemginfCustom.mqdate': '',
          'hspemginfCustom.grnChl': '',
          'hspemginfCustom.qtsjFlg': '',
          'hspemginfCustom.cspgFlg': '',
          'hspemginfCustom.xtFlg': '',
          'hspemginfCustom.czFlg': '',
          'hspemginfCustom.hxknFlg': '',
          'hspemginfCustom.xfztFlg': '',
          'checkRecord': _checkStatus
        }
        $('.line-span').css({ 'font-weight': 'normal' });
      }
      getDataCount();
      // 获取病人信息列表的时候。修正浏览模式
      if (!$('#list:checked').val()) {
        $('#list').attr('checked', true);
      }
      // 切换显示隐藏
      $('#sickbedContainer').hide();
      $('#listContainer').show();
      $('#patientList').datagrid({
        nowrap: true,
        striped: true,
        singleSelect: true,
        url: patientListUrl,
        idField: 'emgSeq',
        loadMsg: '',
        pagination: true,
        rownumbers: true,
        remoteSort: true,
        nowrap: false,
        pageList: [30, 20, 50],
        queryParams: dataObj,
        onLoadSuccess: function () {
          checkedObj = {}; // 此处checkedObj需置空
          showCheckedobj = {};
          try {
            $('#patientList').datagrid('clearSelections');
          } catch (e) { }
          try {
            $('#consultation').datagrid('loadData', { total: 0, rows: [] });
          } catch (e) {
            initConsultation()
          }
        },
        onDblClickRow: function (rowIndex, rowData) {
          openNurseBox(rowData);
        },
        onClickRow: function (index, row) {
          $.each(variableList, function (index, val) {
            if (row.hasOwnProperty(val)) {
              checkedObj[val] = row[val]
            } else {
              checkedObj[val] = ''
            }
          });
          getConsultation(row.emgSeq); // 先暂时注释
        },
        columns: getCols()
      });
    }

	function clearObj(){
	    obj.bedPlace = '';
	    obj.mqdate = '';
	    obj.grnChl = '';
	    obj.qtsjFlg = '';
	    obj.cspgFlg = '';
	    obj.xtFlg = '';
	    obj.czFlg = '';
	    obj.hxknFlg = '';
	    obj.xfztFlg = '';
	}
	
	var obj = {
	    bedPlace: '',
	    mqdate: '',
	    grnChl: '',
	    qtsjFlg: '',
	    cspgFlg: '',
	    xtFlg: '',
	    czFlg: '',
	    hxknFlg: '',
	    xfztFlg: ''
	  };

	function queryItem(idx, field, bedVal) {
	  clearObj();
	  if (field === 'mqdate') {
        obj[field] = 1;
      } else if (field === 'grnChl') {
        obj[field] = 1;
      } else if (field === 'qtsjFlg') {
        obj[field] = 1;
      } else if (field === 'cspgFlg') {
        obj[field] = 1;
      } else if (field === 'xtFlg') {
        obj[field] = 1;
      } else if (field === 'czFlg') {
        obj[field] = 1;
      } else if (field === 'hxknFlg') {
        obj[field] = 1;
      } else if (field === 'xfztFlg') {
        obj[field] = 1;
      } 
	  if (bedVal) {
	    obj.bedPlace = bedVal;
	  } else {
	    obj[field] = '1';
	  }
	  $('.line-span').css({ 'font-weight': 'normal' }).eq(idx).css({ 'font-weight': 'bold' });
	  getPatientList(obj);
	}

	function exportQjs () {
      _confirm('确定导出吗？', null, function () {
        publicFun.httpServer({ url: '${baseurl}hzszyyemg/exportqjsSubmit.do' }, generateParam(obj), function (res) {
          message_alert(res);
        })
      });
    }

	function generateParam (obj) {
	 var startdate = $('#emg_startdate').val(),
        enddate = $('#emg_enddate').val(),
        cstNam = $('#emgText1').val(),
        // vstCad = $('#emgText2').val(),
        mpi = $('#emgText3').val(),
        preDgnName = $('#emgText4').val();
        var _checkStatus = ''; // (1-未核对，2-已核对)
      if ($('#checkRecord1').attr('checked')) {
        _checkStatus = '2'
      } else if ($('#checkRecord2').attr('checked')) {
        _checkStatus = '1'
      }
      if (obj) {
      	if (obj.bedPlace == '290' || obj.bedPlace == '291') {
          startdate = '';
          enddate = '';
        }
        dataObj = {
          'emgSeq': '',
          'hspemginfCustom.startdate': startdate,
          'hspemginfCustom.enddate': enddate,
          'hspemginfCustom.cstNam': cstNam,
          // 'hspemginfCustom.vstCad': vstCad,
          'hspemginfCustom.mpi': mpi,
          'hspemginfCustom.preDgnName': preDgnName,
          'hspemginfCustom.sqlStaCod': $('#cstDepVal').val(),
          'hspemginfCustom.bedPlace': obj.bedPlace,
          'hspemginfCustom.mqdate': obj.mqdate,
          'hspemginfCustom.grnChl': obj.grnChl,
          'hspemginfCustom.qtsjFlg': obj.qtsjFlg,
          'hspemginfCustom.cspgFlg': obj.cspgFlg,
          'hspemginfCustom.xtFlg': obj.xtFlg,
          'hspemginfCustom.czFlg': obj.czFlg,
          'hspemginfCustom.hxknFlg': obj.hxknFlg,
          'hspemginfCustom.xfztFlg': obj.xfztFlg,
          'checkRecord': _checkStatus
        };
      } else {
        dataObj = {
          'emgSeq': '',
          'hspemginfCustom.startdate': startdate,
          'hspemginfCustom.enddate': enddate,
          'hspemginfCustom.cstNam': cstNam,
          // 'hspemginfCustom.vstCad': vstCad,
          'hspemginfCustom.mpi': mpi,
          'hspemginfCustom.preDgnName': preDgnName,
          'hspemginfCustom.sqlStaCod': $('#cstDepVal').val(),
          'hspemginfCustom.bedPlace': '',
          'hspemginfCustom.mqdate': '',
          'hspemginfCustom.grnChl': '',
          'hspemginfCustom.qtsjFlg': '',
          'hspemginfCustom.cspgFlg': '',
          'hspemginfCustom.xtFlg': '',
          'hspemginfCustom.czFlg': '',
          'hspemginfCustom.hxknFlg': '',
          'hspemginfCustom.xfztFlg': '',
          'checkRecord': _checkStatus
        }
        $('.line-span').css({ 'font-weight': 'normal' });
      }
      return dataObj;
    }
	


    function getConsultationCols() {
      var consultationColumns = [
        [{
          field: 'invitationDateStr',
          title: '邀请时间',
          width: getWidth(0.13),
          formatter: function (value, row, index) {
            return value ? publicFun.timeFormat(new Date(value), 'yyyy-MM-dd hh:mm') : ''
          }
        }, {
          field: 'consultationDateStr',
          title: '签到时间',
          width: getWidth(0.13),
          formatter: function (value, row, index) {
            return value ? publicFun.timeFormat(new Date(value), 'yyyy-MM-dd hh:mm') : ''
          }
        }, {
          field: 'invitationDep',
          width: getWidth(0.08),
          title: '会诊科室'
        }, {
          field: 'replyDocName',
          width: getWidth(0.08),
          title: '会诊医生'
        }, {
          field: 'consultationOpinion',
          width: getWidth(0.23),
          title: '会诊意见'
        }, {
          field: 'applyDocName',
          width: getWidth(0.23),
          title: '申请人'
        }, {
          field: 'opt1',
          title: '操作',
          width: getWidth(0.15),
          formatter: function (value, row, index) {
            /**
             * [editHtml 会诊登记的修改事件]
             * [delHtml 会诊登记的删除事件]
             * [replyHtml 会诊登记的回复事件]
             */
            var editHtml = '<span class="url-link"><a href="javascript:;" onclick="cmdEditHzqk(\'' + row.cstNam + '\',\'' + row.emgSeqCr + '\',\'' + row.consultationRecordsSeq + '\')\">修改</a></span>',
              delHtml = '<span class="url-link"><a style="color:#0c29b9;" href="javascript:;" onclick="cmdDel(\'' + row.consultationRecordsSeq + '\')\">删除</a></span>',
              replyHtml = '<span class="url-link"><a href="javascript:;" onclick="cmdReply(\'' + row.cstNam + '\',\'' + row.emgSeqCr + '\',\'' + row.consultationRecordsSeq + '\')\">会诊答复</a></span>';
            if (docType === 'admin') {
              return [replyHtml, ' | ', editHtml, ' | ', delHtml].join('');
            } else if(docType === 'hzys'){
              return [replyHtml].join('');
            } else {
              return [editHtml, ' | ', delHtml].join('');
            } 
          }
        }]
      ]
      return consultationColumns;
    }

    function cmdReply(cstNam, emgSeqCr, id) {
      createmodalwindow(cstNam + '-会诊答复', 1030, 500, '${baseurl}consultation/tabhzdj.do?emgSeq=' + emgSeqCr + '&conRecordsSeq=' + id + '&hzType=reply');
    }
    /**
   * [cmdEditHzqk 会诊登记修改]
   */
    function cmdEditHzqk(cstNam, emgSeqCr, id) {
      createmodalwindow(cstNam + '-会诊登记修改', 1030, 500, '${baseurl}consultation/tabhzdj.do?emgSeq=' + emgSeqCr + '&conRecordsSeq=' + id + '&hzType=edit');
    }
    /**
     * [cmdDel 删除]
     */
    function cmdDel(id) {
      _confirm('确定删除该数据吗？', null, function () {
        publicFun.httpServer({ url: '${baseurl}consultation/delConsultation.do' }, { 'consultationRecordsSeq': id }, function (data) {
          if (data.resultInfo && data.resultInfo.messageCode == '109') {
            message_alert(data, function () {
              window.location.href = '${baseurl}/first.do';
            });
            return false;
          }
          message_alert(data);
          var type = data.resultInfo.type;
          if (type == 1) {
            parent.closemodalwindow();
            $('#consultation').datagrid('reload');
          }
        })
      });
    }
    /**
     * [initConsultation 初始化会诊情况]
     */
    function initConsultation() {
      $('#consultation').datagrid({
        nowrap: false,
        striped: true,
        singleSelect: true,
        idField: '1',
        loadMsg: '',
        rownumbers: true,
        title: '会诊情况',
        columns: getConsultationCols()
      });
    }

    /**
   * [getConsultation 会诊情况]
   */
    function getConsultation(emgSeq) {
      $('#consultation').datagrid({
        nowrap: false,
        striped: true,
        singleSelect: true,
        url: '${baseurl}consultation/queryConsultation_result.do',
        queryParams: {
          'hspConsultationRecordsCustom.emgSeqCr': emgSeq,
          'hspConsultationRecordsCustom.pageName': 'queryQjs',
          'rows': 0,
          'page': 1
        },
        idField: '1',
        loadMsg: '',
        rownumbers: true,
        title: '会诊情况',
        columns: getConsultationCols(),
        loadFilter: function (data) {
          if (data.resultInfo && data.resultInfo.messageCode == '109') {
            message_alert(data, function () {
              window.location.href = '${baseurl}/first.do';
            });
          }
          return data;
        },
        onDblClickRow: function (rowIndex, cstRowData) {
          createmodalwindow(cstRowData.cstNam + '-会诊登记修改', 1030, 500, '${baseurl}consultation/tabhzdj.do?emgSeq=' + cstRowData.emgSeqCr + '&conRecordsSeq=' + cstRowData.consultationRecordsSeq + '&hzType=edit');
        },
        onLoadSuccess: function (data) {
          $('#consultation').datagrid('clearSelections');
          $('#consultation').datagrid('showColumn', 'opt1');
        }
      });
    }

    /**
     * [nursingRecord 打开护理记录]
     * @return {[type]} [description]
     */
    function nursingRecord() {
      if (isOwnEmpty(checkedObj)) {
        $.messager.alert('警告', '请先选择一条记录', 'warning');
        return
      }
      openNurseBox(checkedObj);
    }

    function  openNurseBox (checkedObj) {
      var leftBedNam = '';
      if (checkedObj.bedNum != null) {
        leftBedNam = checkedObj.bedNum + '-';
      }
      var openTabUrl = '${baseurl}zyyxtpg/toLeftWrap.do?emgSeq=' + checkedObj.emgSeq + '&cstNam=' + checkedObj.cstNam + '&zgcount=' + checkedObj.zgcount + '&pageSrc=queryQjs' + '&th=' + new Date().getTime();
      var openTabName = leftBedNam + checkedObj.cstNam + '-护理记录';
      parent.opentabwindow(openTabName, openTabUrl, '0');
    }
    /**
     * [changeRecord 打开修改转归]
     */
    function changeRecord() {
      if (isOwnEmpty(checkedObj)) {
        $.messager.alert('警告', '请先选择一条记录', 'warning');
        return
      }
      var openTabNam = '';
      if (checkedObj.bedNum != null) {
        openTabNam = checkedObj.bedNum + '-';
      }
      var openTabName = openTabNam + checkedObj.cstNam + '-修改',
        openTabUrl = '${baseurl}hzszyyemg/xgjz.do?emgSeq=' + checkedObj.emgSeq + '&th=' + new Date().getTime();
      parent.opentabwindow(openTabName, openTabUrl, '0');
    }
    /**
     * [deleteRecord 删除]
     */
    function deleteRecord() {
      if (isOwnEmpty(checkedObj)) {
        $.messager.alert('警告', '请先选择一条记录', 'warning');
        return
      }
      _confirm('确定删除该数据吗？', null, function () {
        var emgSeq = checkedObj.emgSeq,
          startdate = $('#emg_startdate').val(),
          enddate = $('#emg_enddate').val(),
          cstNam = $('#emgText1').val(),
          // vstCad = $('#emgText2').val(),
          mpi = $('#emgText3').val();
        publicFun.httpServer({ url: deleteRecordUrl }, {
          emgSeq: emgSeq,
          'hspemginfCustom.startdate': startdate,
          'hspemginfCustom.enddate': enddate,
          'hspemginfCustom.cstNam': cstNam,
          // 'hspemginfCustom.vstCad': vstCad
          'hspemginfCustom.mpi': mpi
        }, function (data) {
          if (data.resultInfo && data.resultInfo.messageCode == '109') {
            message_alert(data, function () {
              window.location.href = "${baseurl}/first.do";
            });
          } else {
            message_alert(data);
            var type = data.resultInfo.type;
            if (type === 1) {
              if ($('#listContainer').is(':visible')) {
                getPatientList();
              } else {
                getSickbedMsg();
              }
            }
          }
        })
      });
    }
    /**
     * [enteringDiagnose 转归登记]
     */
    function enteringDiagnose() {
      if (isOwnEmpty(checkedObj)) {
        $.messager.alert('警告', '请先选择一条记录', 'warning');
        return
      }
      var openTabNam = '';
      if (checkedObj.bedNum != null) {
        openTabNam = checkedObj.bedNum + '-';
      }
      var openModalWindowName = openTabNam + checkedObj.cstNam + '-转归登记',
        openModalWindowUrl = '${baseurl}zyyqjs/querylqxxdjzyy.do?emgSeq=' + checkedObj.emgSeq;
      createmodalwindow(openModalWindowName, 950, 500, openModalWindowUrl);
    }
    
    /**
     * [newPatient 新入病人]
     */
    function newPatient() {
      var _lookType = $('input[name="lookType"]:checked')[0].id;
      if(_lookType == 'list'){
        $.messager.alert('警告', '请切换至简卡操作', 'warning');
        return
      }
      if (isOwnEmpty(checkedObj) && checkedObj.bedNum) {
        var openModalWindowName = checkedObj.bedNum + '-新入病人',
        openModalWindowUrl = '${baseurl}hzszyyemg/toBeRelated.do?bedid='+checkedObj.bedid;
        createmodalwindow(openModalWindowName, 980, 450, openModalWindowUrl);
      }else{
        $.messager.alert('警告', '请选择空床位', 'warning');
        return
      }
      
      // var openTabNam = '';
      // if (checkedObj.bedNum != null) {
      //   openTabNam = checkedObj.bedNum + '-';
      // }
      // var openModalWindowName = openTabNam + checkedObj.cstNam + '-转归登记',
      //   openModalWindowUrl = '${baseurl}zyyqjs/querylqxxdjzyy.do?emgSeq=' + checkedObj.emgSeq;
      // createmodalwindow(openModalWindowName, 950, 500, openModalWindowUrl);
    }

    /**
     * [printMedicalRecord 病案标签打印]
     */
    function printMedicalRecord () {
      if (isOwnEmpty(checkedObj)) {
        $.messager.alert('警告', '请先选择一条记录', 'warning');
        return
      }
  //    _confirm('是否确定要打印？', null, function() {
        $('#qrCodeWrap').html('');
        if (checkedObj.mpi) {
          $('#qrCodeWrap').JsBarcode(checkedObj.mpi, {
            format:"CODE128",
            displayValue: false,
            fontSize: 18
            // height: 35
          }); // jQuery
        } else {
          $('#qrCodeWrapDiv').html('<img id="qrCodeWrap" style="width: 100%; height: 14mm;"></img>');
        }
        var _fillList = ['cstNam', 'cstSexCod', 'mpi', 'bedNum'];
        _fillList.forEach(function (val, idx) {
          $('#m_' + val).html(checkedObj[val]);
        })
        if (checkedObj.cstAge == null || checkedObj.cstAge == 'undefined') {
          $('#m_cstAge').html('___' + checkedObj.cstAgeCod);
        } else {
          $('#m_cstAge').html(checkedObj.cstAge + checkedObj.cstAgeCod);
        }
        $('.medicalList li').css({'float': 'left', 'margin': '0', 'padding': '0', 'width': '100%'})
        $('.liWthPrint').css({'display': 'inline-block', 'width': '22mm'});
        LODOP = getLodop();
        LODOP.PRINT_INITA(0, 0, '48mm', '32mm', '打印控件功能演示_Lodop功能_超文本内容缩放打印');
        LODOP.SET_PRINT_PAGESIZE(1, '48mm', '32mm', '');
        LODOP.SET_PRINT_MODE("NOCLEAR_AFTER_PRINT", true);
        LODOP.ADD_PRINT_HTM('2mm', '0', '48mm', '32mm', document.getElementById('printMedicalRecordDiv').innerHTML);
        LODOP.SET_PRINT_STYLE('FontSize', 14);
        LODOP.SET_PRINTER_INDEXA("lis1");
        // LODOP.SET_PRINTER_INDEX("腕带打印");
        // LODOP.PREVIEW();
        LODOP.PRINT();
  //    })
    }

    /**
     * [printWristbands 腕带打印]
     */
    function printWristbands() {
      if (isOwnEmpty(checkedObj)) {
        $.messager.alert('警告', '请先选择一条记录', 'warning');
        return
      }
      $('.liWthPrint').css({'display': 'inline-block', 'width': '35mm'});
      if ('${activeUser.hospitalCategory} == SD') {
        $('#p_tellPhone').html('87377639');
        $('#p_hosArea').html('急诊抢救室');
      } else if ('${activeUser.hospitalCategory} == LY') {
        $('#p_tellPhone').html('15888821053');
        $('#p_hosArea').html('急诊护理单元');
      }
      // $('.halfLiPrint').css({'float': 'left', 'width': '50%'});
      // $('.fullLiPrint').css({'float': 'left', 'width': '100%'});
      var _fillList = ['cstNam', 'cstSexCod', 'mpi', 'emgDat'];
      _fillList.forEach(function (val, idx) {
        if (val === 'emgDat') {
          $('#p_' + val).html(publicFun.timeFormat(checkedObj[val], 'yyyy-MM-dd'))
        } else {
          $('#p_' + val).html(checkedObj[val]);
        }
      })
      if (checkedObj.cstAge == null || checkedObj.cstAge == 'undefined') {
        $('#p_cstAge').html('___' + checkedObj.cstAgeCod);
      } else {
        $('#p_cstAge').html(checkedObj.cstAge + checkedObj.cstAgeCod);
      }

      if(checkedObj.labelPrintFlg == '1'){
        _confirm('该腕带已打印，确认补打吗？', null, function() {
          // //留观号
        // $('#p_observationCode').html(checkedObj.observationCode);
  //      _confirm('是否确定要打印？', null, function() {
    // 打印预览
          LODOP = getLodop();
          LODOP.PRINT_INITA(0, 0, '34mm', '259mm', '打印控件功能演示_Lodop功能_超文本内容缩放打印');
          LODOP.SET_PRINT_PAGESIZE(1, '34mm', '259mm', '');
          LODOP.SET_PRINT_MODE("NOCLEAR_AFTER_PRINT", true);
          LODOP.ADD_PRINT_HTM(10, '44mm', '100mm', '100%', document.getElementById('print').innerHTML);
          LODOP.ADD_PRINT_BARCODE(15 ,'38mm', '19mm', '19mm', "QRCode", "WD" + checkedObj.emgSeq);
          LODOP.ADD_PRINT_HTM(10 ,'18mm', '100%', '100%', document.getElementById('printTitle').innerHTML);
          LODOP.SET_PRINT_STYLE('FontSize', 14);
          LODOP.SET_PRINT_STYLEA(2, 'AngleOfPageInside', 90);
          LODOP.SET_PRINT_STYLEA(1, 'AngleOfPageInside', 90);
          LODOP.SET_PRINTER_INDEX("腕带打印");
          // LODOP.PREVIEW();
          LODOP.PRINT();
    //    })
        })
      }else{
        LODOP = getLodop();
        LODOP.PRINT_INITA(0, 0, '34mm', '259mm', '打印控件功能演示_Lodop功能_超文本内容缩放打印');
        LODOP.SET_PRINT_PAGESIZE(1, '34mm', '259mm', '');
        LODOP.SET_PRINT_MODE("NOCLEAR_AFTER_PRINT", true);
        LODOP.ADD_PRINT_HTM(10, '44mm', '100mm', '100%', document.getElementById('print').innerHTML);
        LODOP.ADD_PRINT_BARCODE(15 ,'38mm', '19mm', '19mm', "QRCode", "WD" + checkedObj.emgSeq);
        LODOP.ADD_PRINT_HTM(10 ,'18mm', '100%', '100%', document.getElementById('printTitle').innerHTML);
        LODOP.SET_PRINT_STYLE('FontSize', 14);
        LODOP.SET_PRINT_STYLEA(2, 'AngleOfPageInside', 90);
        LODOP.SET_PRINT_STYLEA(1, 'AngleOfPageInside', 90);
        LODOP.SET_PRINTER_INDEX("腕带打印");
        //LODOP.PREVIEW();
         LODOP.PRINT();
        publicFun.httpServer({url: '${baseurl}zyyqjs/updateLabelPrinting.do'}, {'emgSeq': checkedObj.emgSeq}, function (res) {
          var type = res.resultInfo.type;
            if (type === 1) {
              if ($('#listContainer').is(':visible')) {
                getPatientList();
              } else {
                getSickbedMsg();
              }
            }
        })
      }
      
      
      
    }
    /**
     * [healtheducateRecord 健康教育]
     */
    function healtheducateRecord() {
      if (isOwnEmpty(checkedObj)) {
        $.messager.alert('警告', '请先选择一条记录', 'warning');
        return
      }
      var openTabNam = '';
      if (checkedObj.bedNum != null) {
        openTabNam = checkedObj.bedNum + '-';
      }
      var startDat = $('#emg_startdate').val();
      var endDat = $('#emg_enddate').val();
      var openModalWindowName = openTabNam + checkedObj.cstNam + '-健康宣教';
      parent.opentabwindow(openModalWindowName, '${baseurl}healthedu/queryhealtheducate.do?emgSeq=' + checkedObj.emgSeq + '&startDat=' + startDat + '&endDat=' + endDat);
    }

    /**
     * [printBlankTran 空白输液单打印]
     */
    function printBlankTran(){
      if (isOwnEmpty(checkedObj)) {
        $.messager.alert('警告', '请先选择一条记录', 'warning');
        return
      }else {
        publicFun.httpServer({url: '${baseurl}cfxx/getEmgInfData.do'}, {'emgSeq': checkedObj.emgSeq}, function (res) {     
          var data = res.sysdata.hspemginfCustom;
          $('#tranName').html(data.cstNam);
          $('#tranSex').html(data.cstSexCod);
          $('#tranBed').html(data.bedNum);
          if (data.bedPlace == '290') {
            $('#tranBedPlace').html('留观室');
          } else if (data.bedPlace == '291') {
            $('#tranBedPlace').html('抢救室');
          }
          $('#tranMpi').html(data.mpi);
          $('#nowTime').html('配药时间:'+publicFun.timeFormat(new Date(), 'yyyy-MM-dd hh:mm:ss'));

          var printCss = "<link rel='stylesheet' type='text/css' href='${baseurl}css/hems/listPrint/print.css?v=${versionDay}'>";
          LODOP = getLodop();
          LODOP.PRINT_INITA(0, 0, "64mm", "48mm", "print4");		// (增强型)打印初始化	PRINT_INIT(Top, Left, Width, Height, strPrintName)
          LODOP.SET_PRINT_PAGESIZE(0, "64mm", "48mm", "");	// 设定纸张大小
          LODOP.SET_PRINT_MODE("NOCLEAR_AFTER_PRINT", true);	// 设置打印模式	|"NOCLEAR_AFTER_PRINT"：设置打印或预览后内容不清空是否为真。
          LODOP.ADD_PRINT_HTM('3mm', 0, '64mm', '48mm', printCss + $('#execDiv').html());
          LODOP.NewPageA();
          LODOP.SET_PRINT_STYLE("FontSize", 8);	// 设置打印项的输出风格	|"FontSize"： 设定纯文本打印项的字体大小。
          LODOP.SET_PRINTER_INDEXA("print4");	//(增强型)指定打印设备
          LODOP.PRINT();
          // LODOP.PREVIEW();
        })
      }
    }

    function getChargingDetail() {
      if (isOwnEmpty(checkedObj)) {
        $.messager.alert('警告', '请先选择一条记录', 'warning');
        return
      }
      var openTabNam = '';
      if (checkedObj.bedNum != null) {
        openTabNam = checkedObj.bedNum + '-';
      }
      var emgDateTime = publicFun.timeFormat(new Date(checkedObj.emgDat), 'yyyy/MM/dd hh:mm:ss');
      var openTabName = openTabNam + checkedObj.cstNam + '-收费信息',
        openTabUrl = '${baseurl}his/sfjl.do?vstCad=' + checkedObj.vstCad + "&emgDat=" + emgDateTime + "&emgSeq=" + checkedObj.emgSeq + '&th=' + new Date().getTime();
      parent.opentabwindow(openTabName, openTabUrl);
    }

    // 跳转到急诊大屏页面
    function toBigScreen() {
      var toScreenUrl = '${baseurl}zyyqjs/qjsScreen.do';
      window.location.href = toScreenUrl;
    }

    // 隔离措施
    function glcsRecord() {
      if (isOwnEmpty(checkedObj)) {
        $.messager.alert('警告', '请先选择一条记录', 'warning');
        return
      }
      var openModalWindowName = '隔离措施',
        openModalWindowUrl = '${baseurl}gl/toglcs.do?emgSeq=' + checkedObj.emgSeq + "&emgNam=" + checkedObj.cstNam + '&th=' + new Date().getTime();
      createmodalwindow(openModalWindowName, 470, 260, openModalWindowUrl);
    }

    function deploySickbed() {
      if (isOwnEmpty(checkedObj)) {
        $.messager.alert('警告', '请先选择一条记录', 'warning');
        return
      }
      var openModalWindowName = '调配床位',
        openModalWindowUrl = '${baseurl}bedinf/todeploy.do?hspBedInfCustom.bedid=' + checkedObj.bedid + "&emgNam=" + checkedObj.cstNam + "&emgSeq=" + checkedObj.emgSeq + '&th=' + new Date().getTime();
      if (checkedObj.zgcount > 0) {
        if (_islgbed === '1') {
          if (checkedObj.cstDspCodNew !== '11' && checkedObj.cstDspCodNew !== '6') {
            // console.log('留观室打开打开,则转归状态为转留观或留抢,可调配床位')
            publicFun.alert('该患者不可调配床位');
            return false;
          }
        } else {
          if (checkedObj.cstDspCodNew !== '6') {
            // console.log('留观室未打开,则转归状态为留抢,可调配床位')
            publicFun.alert('该患者不可调配床位');
            return false;
          }
        }
      }
      createmodalwindow(openModalWindowName, 470, 230, openModalWindowUrl);
    }

    function zgInfo() {
      if (isOwnEmpty(checkedObj)) {
        $.messager.alert('警告', '请先选择一条记录', 'warning');
        return
      }
      var openTabNam = '';
      if (checkedObj.bedNum != null) {
        openTabNam = checkedObj.bedNum + '-';
      }
      $('#emg_emgSeq').val(checkedObj.emgSeq);
      createmodalwindow(openTabNam + checkedObj.cstNam + '-转归记录', 870, 500, '${baseurl}hzszyyemg/queryzginfo.do', 'no');
    }

    /**
     * [cmdhzdj 会诊登记]
     * @return {[type]} [description]
     */
    function consultationRecord() {
      if (isOwnEmpty(checkedObj)) {
        $.messager.alert('警告', '请先选择一条记录', 'warning');
        return
      }
      var openTabNam = '';
      if (checkedObj.bedNum != null) {
        openTabNam = checkedObj.bedNum + '-';
      }
      var openTabName = openTabNam + checkedObj.cstNam + '-会诊登记新增';
      createmodalwindow(openTabName, 950, 500, '${baseurl}consultation/tabhzdj.do?emgSeq=' + checkedObj.emgSeq + '&hzType=add');
    }
    
    /**
     * 门药门球录入
     *
     */
    function mymqlr() {
      if (isOwnEmpty(checkedObj)) {
        $.messager.alert('警告', '请先选择一条记录', 'warning');
        return
      }
      var openModalWindowName = '门药/门球时间录入',
        openModalWindowUrl = '${baseurl}zyyqjs/querymylr.do?emgSeq=' + checkedObj.emgSeq;
      createmodalwindow(openModalWindowName, 420, 380, openModalWindowUrl);
    }
    
     /**
     * [transManager 输液管理]
     */
    function transManager () {
      if (isOwnEmpty(checkedObj)) {
        $.messager.alert('警告', '请先选择一条记录', 'warning');
        return
      }
      var leftBedNam = '';
      if (checkedObj.bedNum != null) {
        leftBedNam = checkedObj.bedNum + '-';
      }
      var openTabUrl = '${baseurl}zyyxtpg/toLeftWrap.do?emgSeq=' + checkedObj.emgSeq + '&cstNam=' + checkedObj.cstNam + '&zgcount=' + checkedObj.zgcount + '&pageSrc=transManager' + '&th=' + new Date().getTime();
      var openTabName = leftBedNam + checkedObj.cstNam + '-输液管理';
      parent.opentabwindow(openTabName, openTabUrl, '0');
    }
    
    // 核对病历
    function checkRecord () {
      if (isOwnEmpty(checkedObj)) {
        $.messager.alert('警告', '请先选择一条记录', 'warning');
        return
      }
      if (checkedObj.checkNurStatus == '2') {
        publicFun.alert('该病人病历已查对')
        return;
      } else {
        _confirm('确定已查对该病人病历吗？', null, function () {
          publicFun.httpServer({url: '${baseurl}zyyqjs/updateCheckRecord.do'}, {'emgSeq': checkedObj.emgSeq}, function (res) {
            message_alert(res)
            if (res.resultInfo.type == 1) {
              setTimeout(function () {
                // $('.isCheckRecord').attr('checked', false)
                // $('#checkRecord1').attr('checked', true)
                if ($('#listContainer').is(':visible')) {
                    getPatientList();
                  } else {
                    getSickbedMsg();
                  }
                  $(".messager-body").window('close');
              }, 1000)
            }
          })
        });
      }
    }

    $('input[name="lookType"]').change(function () {
      if ($('input[name="lookType"]:checked')[0].id === 'list') {
        window.sessionStorage.setItem('lookType', 'list');
      } else {
        window.sessionStorage.setItem('lookType', 'card');
      }
    })
    
    function reload() {
      var cstDepList = publicFun.getDict('CST_DSP_COD'), strHtml = '<option value=""></option>';
      cstDepList.forEach(function (item, idx) {
        strHtml += '<option value="' + item.infocode + '">' + item.info + '</option>';
      })
      $('#cstDepVal').html(strHtml);
      getKnowledgeList();
      var _sessionType = window.sessionStorage.getItem('lookType');
      if (_sessionType === 'card') {
        getSickbedMsg();
      } else {
        setLayout();
        getPatientList();
      }
    }

    $(function () {
      initTime();
      clearObj();
      if (!window.sessionStorage.getItem('lookType')) {
        window.sessionStorage.setItem('lookType', 'card');
      }
      if (applySrc == '1') {
        $('.consultationDiv').show()
      } else {
        $('.consultationDiv').hide()
      }
      reload();
      getDataCount();
      if (_islgbed != '1') {
        $('.save-bed').hide()
      } else {
        $('.save-bed').show()
      }
    });
  </script>
</body>

</html>