<%@ page language="java" import="java.util.*" pageEncoding="UTF8"%>
<%@ include file="/WEB-INF/jsp/base/tag.jsp"%>
<!DOCTYPE html>
<html>

<head>
  <title>留抢病历-医生端</title>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <%@ include file="/WEB-INF/jsp/base/common_css.jsp"%>
  <link rel="stylesheet" type="text/css" href="${baseurl}css/common/querylist.css" />
  <link rel="stylesheet" type="text/css" href="${baseurl}css/hems/global.css" />
  <link rel="stylesheet" type="text/css" href="${baseurl}css/hzszyyhems/queryqjs.css?019" />
  <script language="javascript" src="${baseurl}Lodop6.216/LodopFuncs.js"></script>
  <%@ include file="/WEB-INF/jsp/base/common_js.jsp"%>
  <script>
    var _islgbed = '${islgbed}', // 0 不显示留观床位  1 显示留观床位
        baseurl = "${baseurl}",
        applySrc = '0', // 为了患者管理页面的一个字段判断[不能删！！！]
        pageName = 'qsjCase',
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
  <div class="at-container-fluid">
    <div class="at-tabs-container" id="tabsContainer">
      <div class="sickbed-container clr" id="sickbedContainer">
      </div>
      <div class="list-container" id="listContainer">
        <div class="patient-list" id="patientList"></div>
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
          <a class="commonbtn" id="printWristbands" href="javascript:;" onclick="qjsCaseNote()">留抢病历记录</a>
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
          <a class="look" onclick="consultationList()">
            会诊情况
          </a>
          <a class="look" onclick="patientDetail()">
            就诊时间轴
          </a>
          <!-- <a class="look" href="${baseurl}zyylqblqrb/querylqblqrb.do" target="blank">
            留抢病历嵌入版
          </a> -->
        </dd>
      </dl>
    </div>
  </div>
  <div class="tips" id="tips">
    <div class="triangleCss"></div>
    <div>
      <p>床号：<i class="text-info" id="bedPlcNam"></i></p>
      <!-- <p>就诊号：<i class="text-info" id="vstCad"></i></p> -->
      <p>病历号：<i class="text-info" id="mpi"></i></p> 
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
    <li onclick="qjsCaseNote()">留抢病历记录</li>
  </ul>
  <OBJECT id="smkOcx" classid="clsid:E691A607-D1D2-48A7-A0EC-09511883A445" width="0" height="0" align="center" hspace="0"
    vspace="0"></OBJECT>
  <div style="width:100%;height:100%; display:none;font-size: 15" id="print">
    <br />
    <ul style=" width: 380px;margin:0px;font-size: 15;font-family:楷体;" align="left">
      <li>
        <label style="padding-left:10px;"> ${hospitalPlatformName} </label>
      </li>
      <li>
        <label style="padding-left:10px;">姓名:</label>
        <label id="p_cstNam"></label>
      </li>
      <li>
        <label style="padding-left:10px">科室:</label>
        <label id="p_emgFkCod">急诊科</label>
      </li>
      <li>
        <label style="padding-left:10px;">病历号:</label>
        <label id="p_mpi"></label>
      </li>
      <li>
        <label style="padding-left:10px">预检时间:</label>
        <label id="p_emgDateTime"></label>
      </li>
    </ul>
  </div>
  <script type="text/javascript" src="${baseurl}js/subpageJs/hzszyyhospital/commonBed/qjsBed.js?119"></script>
  <script type="text/javascript">
    /**
     * [getPatientList 获取病人信息列表]
     */
    function getPatientList(obj) {
      setType();
      var startdate = $('#emg_startdate').val(),
        enddate = $('#emg_enddate').val(),
        cstNam = $('#emgText1').val(),
        mpi = $('#emgText3').val(),
        preDgnName = $('#emgText4').val();;
        // vstCad = $('#emgText2').val(),
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
          'hspemginfCustom.bedPlace': obj.bedPlace,
          'hspemginfCustom.mqdate': obj.mqdate,
          'hspemginfCustom.grnChl': obj.grnChl,
          'hspemginfCustom.qtsjFlg': obj.qtsjFlg,
          'hspemginfCustom.cspgFlg': obj.cspgFlg,
          'hspemginfCustom.xtFlg': obj.xtFlg,
          'hspemginfCustom.czFlg': obj.czFlg,
          'hspemginfCustom.hxknFlg': obj.hxknFlg,
          'hspemginfCustom.xfztFlg': obj.xfztFlg
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
          'hspemginfCustom.bedPlace': '',
          'hspemginfCustom.mqdate': '',
          'hspemginfCustom.grnChl': '',
          'hspemginfCustom.qtsjFlg': '',
          'hspemginfCustom.cspgFlg': '',
          'hspemginfCustom.xtFlg': '',
          'hspemginfCustom.czFlg': '',
          'hspemginfCustom.hxknFlg': '',
          'hspemginfCustom.xfztFlg': ''
        }
        $('.line-span').css({ 'font-weight': 'normal' });
      }
      // 获取病人信息列表的时候。修正浏览模式
      if (!$('#list:checked').val()) {
        $('#list').attr('checked', true);
      }
      getDataCount();
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
          $('#patientList').datagrid('clearSelections'); // 清除选中
        },
        onDblClickRow: function (rowIndex, rowData) {
          openDocBox(rowData);
        },
        onClickRow: function (index, row) {
          // var variableList = ['emgSeq', 'zgcount', 'cstNam', 'cstAge', 'cstSexCod', 'cstAgeCod', 'emgDat', 'bedid', 'bedNum'];
          $.each(variableList, function (index, val) {
            if (row.hasOwnProperty(val)) {
              checkedObj[val] = row[val]
            } else {
              checkedObj[val] = ''
            }
          });
        },
        columns: getCols()
      });
    }

    function bedItemClick(indx) {
      // 根据idx生成checkedObj
      $.each(variableList, function (index, val) {
        if (allSickbedList[indx].hasOwnProperty(val)) {
          checkedObj[val] = allSickbedList[indx][val]
        } else {
          checkedObj[val] = ''
        }
      })
      openDocBox(checkedObj);
    }

    function qjsCaseNote() {
      if (isOwnEmpty(checkedObj)) {
        $.messager.alert('警告', '请先选择一条记录', 'warning');
        return
      }
      openDocBox(checkedObj);
    }

    function openDocBox(checkedObj) {
      var leftBedNam = '';
      if (checkedObj.bedNum != null) {
        leftBedNam = checkedObj.bedNum + '-';
      }
      var openTabUrl = '${baseurl}zyyxtpg/toLeftWrap.do?emgSeq=' + checkedObj.emgSeq + '&cstNam=' + checkedObj.cstNam + '&zgcount=' + checkedObj.zgcount + '&pageSrc=qjsCase' + '&th=' + new Date().getTime();
      var openTabName = leftBedNam + checkedObj.cstNam + '-留抢病历记录';
      parent.opentabwindow(openTabName, openTabUrl, '0');
    }

    $('input[name="lookType"]').change(function () {
      if ($('input[name="lookType"]:checked')[0].id === 'list') {
        window.sessionStorage.setItem('lookTypeCase', 'list');
      } else {
        window.sessionStorage.setItem('lookTypeCase', 'card');
      }
    })

    function reload() {
      var _sessionType = window.sessionStorage.getItem('lookTypeCase');
      if (_sessionType === 'card') {
        getSickbedMsg();
      } else {
        setLayout();
        getPatientList();
      }
      getKnowledgeList();
    }

     // HIS点击“书写病历”
     // 提醒“该病人未预检，确定书写病历吗？”
     function isTipBox () {
       if ('HIS_NO_PATIENT' == '${requestSource}') {
         _confirm('该病人未预检，确定书写病历吗？', null, function () {
        });
       }
     }

    $(function () {
      isTipBox ();
      initTime();
      if (!window.sessionStorage.getItem('lookTypeCase')) {
        window.sessionStorage.setItem('lookTypeCase', 'card');
      }
      reload();
      $('#rightMenu').height(40);
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