<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/base/tag.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
  <%@ include file="/WEB-INF/jsp/base/common_css.jsp"%>
  <link rel="stylesheet" type="text/css" href="${baseurl}css/hems/global.css">
  <link rel="stylesheet" type="text/css" href="${baseurl}css/common/querylist.css" />
  <%@ include file="/WEB-INF/jsp/base/common_js.jsp"%>
  <script language="javascript" src="${baseurl}Lodop6.216/LodopFuncs.js"></script>
  <title>归档病历</title>
  <script>
    var _islgbed = '${islgbed}', // 0 不显示留观床位  1 显示留观床位
    _baseUrl = "${baseurl}";
  </script>
</head>

<body class="queryjzjl">
  <script type="text/javascript">
    function getCol() {
      //datagrid列定义
      var _left_cols = [
      {
        field: 'emgJjd',
        title: '',
        width: getWidth(0.02),
        formatter: function (value, row, index) {
          return " ";
        },
        styler: function (value, row, index) {
          if (value == "I级") {
            return 'background:url(../images/hems/nurse/oneC.png);background-repeat: no-repeat;background-position: 6px;    background-size: 12px 12px;color:transparent;';
          } else if (value == "II级") {
            return 'background:url(../images/hems/nurse/twoC.png);background-repeat: no-repeat;background-position: 6px;    background-size: 12px 12px;color:transparent;';
          } else if (value == "III级") {
            return 'background:url(../images/hems/nurse/threeC.png);background-repeat: no-repeat;background-position: 6px;    background-size: 12px 12px;color:transparent;';
          } else if (value == "IVa级" || value == "IVb级") {
            return 'background:url(../images/hems/nurse/fourC.png);background-repeat: no-repeat;background-position: 6px;    background-size: 12px 12px;color:transparent;';
          }
        }
      }, {
        field: 'recordFlag',
        title: '病历状态',
        sortable: true,
        width: getWidth(0.045),
        formatter: function (value, row, index) {
          if (value == '未审核')
            return "<font color='red'>未审核</font>";
          else if (value == '审核通过')
            return "<font color='green'>审核通过</font>";
          else if (value == '审核未通过')
            return "<font color='blue'>审核未通过</font>";
          else
            return '未写病历';
        }
      }, {
        field: 'emgDat',
        title: '收治日期',
        sortable: true,
        width: getWidth(0.05),
        formatter: function (value, row, index) {
          return value ? publicFun.timeFormat(value, 'yyyy/MM/dd hh:mm:ss') : '';
        }
      }, {
        field: 'mpi',
        title: '病历号',
        sortable: true,
        width: getWidth(0.05)
      }, {
        field: 'cstNam',
        title: '病人姓名',
        sortable: true,
        width: getWidth(0.04)
      }, {
        field: 'cstSexCod',
        title: '性别',
        sortable: true,
        width: getWidth(0.02)
      }, {
        field: 'cstAge',
        title: '年龄',
        sortable: true,
        width: getWidth(0.03),
        formatter: function (value, row, index) {
          if (value != null && value != "") {
            return value + "" + row.cstAgeCod
          } else {
            return value;
          }
        }
      }, {
        field: 'emgDepCod',
        title: '分级',
        sortable: true,
        width: getWidth(0.035)
      }];
      var _right_cols = [{
        field: 'emgFkCod',
        title: '分科',
        width: getWidth(0.05),
        sortable: true
      }, {
        field: 'cstDspCodNameNew',
        title: '转归',
        sortable: true,
        width: getWidth(0.05),
        formatter: function (value, row, index) {
          //如果hsp_sql_inf只关联了1条
          if (row.firstsqlseq == row.sqlSeq) {
            return "";
          } else if (row.cstDspCodNew == '2') { //如果是住院就展示科室，否则就展示转归状态
            return row.cstDepCodNew;
          } else if (row.cstDspCodNew == '13') { //如果是住院就展示科室，否则就展示转归状态
            return row.sqlDes;
          } else {
            return value;
          }
        }
      }, {
        field: 'sqlDat',
        title: '转归时间',
        sortable: true,
        width: getWidth(0.05),
        formatter: function (value, row, index) {
          //如果hsp_sql_inf只关联了1条
          if (row.firstsqlseq == row.sqlSeq) {
            return "";
          } else {
            return value;
          }
        }
      }, {
        field: 'preDgnCod',
        title: '主诉症状',
        width: getWidth(0.12),
        sortable: true
      }, {
        field: 'preUsrNam',
        title: '分诊护士',
        sortable: true,
        width: getWidth(0.04)
      }, {
        field: 'rgAttendDocTor',
        title: '入观医生',
        sortable: true,
        width: getWidth(0.04)
      }, {
        field: 'cgAttendDocTor',
        title: '出观医生',
        sortable: true,
        width: getWidth(0.04)
      }, {
        field: 'checkDoctor',
        title: '质控医生',
        sortable: true,
        width: getWidth(0.04)
      }, {
        field: 'checkDocDat',
        title: '医生审核日期',
        sortable: true,
        width: getWidth(0.06),
        formatter: function (value, row, index) {
          return value ? publicFun.timeFormat(value, 'yyyy/MM/dd hh:mm:ss') : '';
        }
      }, {
        field: 'checkNurse',
        title: '质控护士',
        sortable: true,
        width: getWidth(0.05)
      }, {
        field: 'checkNurseDat',
        title: '护士审核日期',
        sortable: true,
        width: getWidth(0.08),
        formatter: function (value, row, index) {
          return value ? publicFun.timeFormat(value, 'yyyy/MM/dd hh:mm:ss') : '';
        }
      }];
      var col_list = [{
        field: 'emgBed',
        title: '床号',
        width: getWidth(0.03),
        sortable: true
      }];
      var col_LgList = [{
        field: 'rqDate',
        title: '入抢时间',
        sortable: true,
        width: getWidth(0.04),
        formatter: function (value, row, index) {
          if (value) {
            return value.substring(5);
          }
        }
      }, {
        field: 'emgBed',
        title: '抢-床',
        width: getWidth(0.03),
        sortable: true
      }, {
        field: 'rgDate',
        title: '入观时间',
        sortable: true,
        width: getWidth(0.04),
        formatter: function (value, row, index) {
          if (value) {
            return value.substring(5);
          }
        }
      }, {
        field: 'bedLgs',
        title: '留-床',
        width: getWidth(0.03),
        sortable: true
      }];
      if (_islgbed == '1') {
        return [_left_cols.concat(col_LgList, _right_cols)];
      } else {
        return [_left_cols.concat(col_list, _right_cols)];
      }
    }
    //enter按键默认触发查询
    $(document).keydown(function (event) {
      switch (event.keyCode) {
        case 13:
          queryAMRecord();
      }
    });

    var reloadinit;
    function reload() {
      $('#recordlist').datagrid('reload');
    }
    $(window).resize(function () {
      reload();
    });
    $(function () {
      setTime("day", "yyyy/MM/dd");
      chooseDate();
      getDataGrid();
      reloadinit = function () {
        reload();
      };
    })

	function setType() {
      var _codVal = $('#queryText').val(),
        _selVal = $('#typeVal').val();
      $('.queryEmg').val('');
      $('#emgText' + _selVal).val(_codVal);
    }
    
    function getCadMsg(){
      $('#typeVal').val('2')
      $('.queryEmg').val('');
      getVisitingMsg();
      $('#queryText' ).val(vm.patientMsg.vstCad);
      if(vm.patientMsg.vstCad != ''){
        getDataGrid()
      }
    }
	
    //加载datagrid
    function getDataGrid() {
      setType();
      var flag = null;
      var height = 0.975 * ($("#tabs", parent.document).height() - 36 - 16 - 32);
      $("#recordlist").height(height);

      //setTime();
      var toolbar_v;
      publicFun.ajaxVal('${moduleid}', toolbar_v, callBack);
      function callBack(toolbar_v) {
        $('#recordlist').datagrid({
          nowrap: false,
          striped: true,
          singleSelect: true,
          url: '${baseurl}zyyqjs/queryAMRecord_result.do',
          idField: 'emgSeq',
          loadFilter: function (data) {
            if (data.resultInfo && data.resultInfo.messageCode == '109') {
              message_alert(data, function () {
                window.location.href = "${baseurl}/first.do";
              });
            }
            return data;
          },
          loadMsg: '',
          columns: getCol(),
          pagination: true,
          rownumbers: true,
          remoteSort: true,
          queryParams: getParams(),
          pageList: [20, 30, 50],
          toolbar: toolbar_v,
          onDblClickRow: function (rowIndex, rowData) {
            cmdcheckRecord();
          }
        });
      }
    }

    function cmdcheckRecord() {
      var rowData = $('#recordlist').datagrid('getSelected');
      if (GridUtils.checkChecked(rowData)) {
        if (rowData.recordFlag == '未写病历') {
          $.messager.alert('提示信息', "该病历无数据!", 'warning');
          return;
        }
        var openTabUrl = '${baseurl}zyyxtpg/toLeftWrap.do?emgSeq=' + rowData.emgSeq + '&pageSrc=qjsCaseCheck' + '&th=' + new Date().getTime();
        parent.opentabwindow(rowData.cstNam + '-留抢病历审核', openTabUrl);
      }
    }

    function getWidth(proportion) {
      var width = $("body").width();
      return Math.round(proportion * width);
    }

    //查询方法
    function queryAMRecord() {
      getDataGrid();
    }

    function cmdexportAMRecord() {
      var queryType = $("#chooseType").val();
      var startdate = $("#startdate_" + queryType).val();
      var enddate = $("#enddate").val();
      $("#startdate").val(startdate);
      if (startdate == null || startdate == "") {
        $.messager.alert('提示信息', "开始时间不能为空", 'warning');
        return false;
      }
      if (enddate == null || enddate == "") {
        $.messager.alert('提示信息', "结束时间不能为空", 'warning');
        return false;
      }
      if (enddate < startdate) {
        $.messager.alert('提示信息', "结束时间需大于开始时间", 'warning');
        return false;
      }
      jquerySubByFId('recordform', exportAMRecord_callback, null, "json");
    }

    function exportAMRecord_callback(data) {
      message_alert(data);
    }

    function chooseDate() {
      $("#chooseType").change(function () {
        var queryType = $("#chooseType").val();
        if (queryType == 'range') {
          $(".Wdate").css({ "display": "none" });
          $("#startdate_" + queryType).css({ "display": "block" });
          $("#rangeDiv").css({ "display": "block" });
          $("#enddate").css({ "display": "block" })
        } else {
          $(".Wdate").css({ "display": "none" });
          $("#startdate_" + queryType).css({ "display": "block" });
          $("#rangeDiv").css({ "display": "none" });
        }
        var format = $("#startdate_" + queryType).attr("format");
        setTime(queryType, format);
      });
    }

    //获取传给后端的参数
    function getParams() {
      var queryType = $("#chooseType").val(),
        rgDocName = $('#rgDocName').val(),
        cgDocName = $('#cgDocName').val(),
        emgFkCod = $('#emgFkCod').val(),
        emgText1 = $('#emgText1').val(),
        // emgText2 = $('#emgText2').val(),
        emgText3 = $('#emgText3').val()
        checkStatus = $('input:radio[name="checkStatus"]:checked').val();
      var startdate = $("#startdate_" + queryType).val();
      if (startdate == null || startdate == "") {
        $.messager.alert('提示信息', "查询时间不能为空", 'warning');
        return false;
      }
      var enddate = $("#enddate").val();
      var queryParams = {
        'querytype': queryType,
        'hspemginfCustom.startdate': startdate,
        'hspemginfCustom.enddate': enddate,
        'hspemginfCustom.rgAttendDocTor': rgDocName,
        'hspemginfCustom.cgAttendDocTor': cgDocName,
        'hspemginfCustom.emgFkCod': emgFkCod,
        'hspemginfCustom.cstNam': emgText1,
        // 'hspemginfCustom.vstCad': emgText2,
        'hspemginfCustom.mpi': emgText3,
        'checkStatus': checkStatus
      };
      return queryParams;
    }

    //据插叙类型设置初始时间
    function setTime(type, format) {
      var today = publicFun.timeFormat(new Date(), format);
      $("#startdate_" + type).val(today);
      $("#enddate").val(today);
    }

  </script>
  <form id="recordform" action="${baseurl}zyyqjs/exportAMRecord.do" method="post">
    <!-- html的静态布局 -->
    <!-- 查询条件 -->
    <div class="form clr">
      <ul>
        <li style="width: 100%; float: left;">
          <p class="form-text">
            <font color="blue">查询方式：</font>
          </p>
          <select id="chooseType" name="querytype">
            <option value="day" selected="selected">天</option>
            <option value="month">月</option>
            <option value="range">范围</option>
          </select>
          <p class="form-text">
            <font color="blue">日期：</font>
          </p>
          <input type="text" class="input-date Wdate" format="yyyy/MM/dd" id="startdate_day" onfocus="WdatePicker({dateFmt:'yyyy/MM/dd',minDate:'2017/08/01'})">
          <input type="text" style="display: none;" format="yyyy/MM" class="input-date Wdate" id="startdate_month"
            onfocus="WdatePicker({dateFmt:'yyyy/MM',minDate:'2017/08/01'})">
          <input type="text" style="display: none;" class="input-date Wdate" format="yyyy/MM/dd" id="startdate_range"
            onfocus="WdatePicker({dateFmt:'yyyy/MM/dd',minDate:'2017/08/01'})">
          <div id="rangeDiv" style="display: none;">
            <p class="form-text">-</p>
            <input type="text" class="input-date Wdate" id="enddate" name="hspemginfCustom.enddate" onfocus="WdatePicker({dateFmt:'yyyy/MM/dd',minDate:'2017/08/01'})">
          </div>
          <input type="hidden" class="input-date Wdate" id="startdate" name="hspemginfCustom.startdate">
          <p class="form-text">
            <font color="blue">病历状态：</font>
          </p>
          <label>
            <p class="form-text">
              <input name="checkStatus" type="radio" value="0" checked="checked" /> 全部
            </p>
          </label>
          <label>
            <p class="form-text">
              <input name="checkStatus" type="radio" value="1" /> 医生未审核
            </p>
          </label>
          <label>
            <p class="form-text">
              <input name="checkStatus" type="radio" value="4" /> 护士未审核
            </p>
          </label>
          <label>
            <p class="form-text">
              <input name="checkStatus" type="radio" value="2" /> 审核通过
            </p>
          </label>
          <label>
            <p class="form-text">
              <input name="checkStatus" type="radio" value="5" /> 审核未通过
            </p>
          </label>
          <label>
            <p class="form-text">
              <input name="checkStatus" type="radio" value="3" /> 未写病历
            </p>
          </label>
        </li>
        <li style="width: 100%; float: left; margin-top: 4px;">
          <p class="form-text">
            <font color="blue">科室：</font>
          </p>
          <select id="emgFkCod" name="hspemginfCustom.emgFkCod">
            <option value="">请选择</option>
            <c:forEach items="${jzkscompctlList}" var="value">
              <option value="${value.comno}">${value.comcname}</option>
            </c:forEach>
          </select>
          <p class="form-text">
            <font color="blue">入观医生：</font>
          </p>
          <input id="rgDocName" type="text" name="hspemginfCustom.rgAttendDocTor" class="input-wth">
          <p class="form-text">
            <font color="blue">出观医生：</font>
          </p>
          <input id="cgDocName" type="text" name="hspemginfCustom.cgAttendDocTor" class="input-wth">
          <select onchange="setType()" id="typeVal">
		    <!-- <option value="2">就诊卡</option> -->
        <option value="3">病历号</option>
		    <option value="1">患者姓名</option>
		  </select>
		  <input id="queryText" type="text" class="input-wth">
		  <input id="emgText1" type="text" class="queryEmg hidden">
		  <input id="emgText2" type="text" class="queryEmg hidden" ms-duplex-string="patientMsg.vstCad">
      <input id="emgText3" type="text" class="queryEmg hidden">
          <a href="#" class="easyui-linkbutton" iconCls="icon-search" id="btn" onclick="queryAMRecord()">查询</a>
        </li>
      </ul>
    </div>
    <div class="jzjltab queryTabs">
      <table id="recordlist"></table>
    </div>
  </form>
</body>

</html>