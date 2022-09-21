<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/base/tag.jsp"%>
<!DOCTYPE html>
<html>

<head>
  <title>新增交班</title>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <%@ include file="/WEB-INF/jsp/base/common_css.jsp"%>
  <link rel="stylesheet" type="text/css" href="${baseurl}css/hems/global.css" />
  <link rel="stylesheet" type="text/css" href="${baseurl}css/hzszyyhems/precheck/jjbgl.css" />
  <script language="javascript" src="${baseurl}Lodop6.216/LodopFuncs.js"></script>
  <%@ include file="/WEB-INF/jsp/base/common_js.jsp"%>
  <script>
    var _baseurl = "${baseurl}";
  </script>
</head>

<body class="addList">
  <form id="qjsform" action="${baseurl}hzszyyemg/delzyyemgSubmit.do" method="post">
    <div class="form clr">
      <p class="form-text">日期：</p>
      <input class="Wdate small-date" id="emg_startdate" type="text" name="hspemginfCustom.startdate" onclick="WdatePicker({dateFmt:'yyyy/MM/dd',isShowClear:false,readOnly:true})">
      <p class="form-text">-</p>
      <input class="Wdate small-date" id="emg_enddate" type="text" name="hspemginfCustom.enddate" onclick="WdatePicker({dateFmt:'yyyy/MM/dd',isShowClear:false,readOnly:true})" />
      <a href="javascript:;" class="easyui-linkbutton" iconCls="icon-search" onclick="getDatagrid()">查询</a>
    </div>
    <table id="jjbgllist"></table>
    <div class="right-grp">
      <a class="easyui-linkbutton" iconCls="icon-ok" id="submitbtn" onclick="addPatient('P')">添加普通患者</a>
      <a class="easyui-linkbutton" iconCls="icon-edit" id="closebtn" onclick="addPatient('W')">添加危重患者</a>
    </div>
  </form>

  <script type="text/javascript">
    function initTime() {
      var _today = publicFun.timeFormat(new Date(), 'yyyy/MM/dd');
      $('#emg_enddate').val(_today);
      var myDate = new Date();
      var yyear = myDate.getFullYear();
      var mmonth = myDate.getMonth();
      var dday = myDate.getDate();
      var fivDat = new Date(yyear, mmonth, dday).getTime() - 5 * 60 * 60 * 1000;
      var yesterday = publicFun.timeFormat(new Date(fivDat), "yyyy/MM/dd");
      $('#emg_startdate').val(yesterday);
    }

    function getWidth(proportion) {
      var width = $("body").width();
      return Math.round(proportion * width);
    }

    function addPatient(emgType){
      var jjbglSeq = parent._jjbglSeq;
      var emgArry = [];
      var list = $('#jjbgllist').datagrid('getSelections');
      if (list.length > 0) {
        $.each(list, function (idx, val) {
          emgArry.push(val.emgSeq);
        })
      }
      var requestParam ={'emgType':emgType,'jjbglSeq':jjbglSeq,'emgSeq':emgArry};
      publicFun.httpServer({url:_baseurl+'jjbgl/addpthz.do',requestDataType:'json'},requestParam,function(res){
        message_alert(res);
        if (res.resultInfo.type == '1') {
          setTimeout("parent.closemodalwindow()", 1000);
          parent.queryJiao();
        }
      })
    }

    function getDatagrid(){
      var height = 380;
      var _startdate = $('#emg_startdate').val();
      var _enddate = $('#emg_enddate').val();
       $("#jjbgllist").height(height);
      var columns_v = [
        [{
          checkbox: true
        },{
          field: 'emgDat',
          title: '收治时间',
          width: getWidth(0.1),
          formatter: function (value, row, index) {
            return value ? publicFun.timeFormat(value, 'yyyy/MM/dd hh:mm:ss') : '';
          }
        }, {
          field: 'mpi',
          title: '病历号',
          width: getWidth(0.1)
        }, {
          field: 'cstNam',
          title: '姓名',
          width: getWidth(0.08)
        }, {
          field: 'cstSexCod',
          title: '性别',
          width: getWidth(0.04)
        }, {
          field: 'cstAge',
          title: '年龄',
          sortable: true,
          width: getWidth(0.05),
          formatter: function (value, row, index) {
            if (value != null && value != "") {
              return value + "" + row.cstAgeCod
            } else {
              return value;
            }
          }
        }, {
          field: 'emgDepCod',
          title: '急诊分级',
          width: getWidth(0.07),
          formatter: function (value, row, index) {
            if (value == "I级") {
              return "<div class=\"levelAbg\">I级</div>";
            } else if (value == "II级") {
              return "<div class=\"levelBbg\">II级</div>";
            } else if (value == "III级") {
              return "<div class=\"levelCbg\">III级</div>";
            } else if (value == "IVa级") {
              return "<div class=\"levelDbg\">IVa级</div>";
            } else if (value == "IVb级") {
              return "<div class=\"levelDbg\">IVb级</div>";
            }
          }
        }, {
          field: 'cstDspCod',
          title: '首诊状态',
          width: getWidth(0.07)
        }, {
          field: 'emgFkCod',
          title: '分科',
          width: getWidth(0.10)
        },{
          field: 'jbzdDes',
          title: '诊断',
          width: getWidth(0.25)
        }, {
          field: 'emgBed',
          title: '床号',
          width: getWidth(0.05)
        }]
      ];
      $('#jjbgllist').datagrid({
        nowrap: false,
        striped: true,
        selectOnCheck: true,
        checkOnselect: true,
        singleSelect: false,
        url: _baseurl+'jjbgl/querylqlist.do',
        idField: 'emgSeq',
        loadMsg: '',
        queryParams: {
          'hspemginfCustom.startdate':_startdate,                      
          'hspemginfCustom.enddate':_enddate
        },
        columns: columns_v,
        pagination: true,
        rownumbers: false,
        pageList: [20, 30, 50]
      });
    }

    $(function(){
      initTime();
      getDatagrid();
    })
  </script>
</body>

</html>