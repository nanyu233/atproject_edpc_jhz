<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/base/tag.jsp"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>

<head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
  <title>呼吸道发热病人门诊登记表</title>
  <%@ include file="/WEB-INF/jsp/base/common_css.jsp"%>
  <link rel="stylesheet" type="text/css" href="${baseurl}css/hems/global.css?090">
  <link rel="stylesheet" type="text/css" href="${baseurl}css/common/querylist.css" />
  <%@ include file="/WEB-INF/jsp/base/common_js.jsp"%>
</head>

<body style="overflow: hidden;">
  <div class="form clr">
    <p class="form-text">日期：</p>
    <input class="input-date Wdate" id="startDate" type="text" onclick="WdatePicker({dateFmt:'yyyy/MM/dd',isShowClear:false,readOnly:true})">
    <p class="form-text">-</p>
    <input class="input-date Wdate" id="endDate" type="text" onclick="WdatePicker({dateFmt:'yyyy/MM/dd',isShowClear:false,readOnly:true})">
    <a href="#" class="easyui-linkbutton" iconCls="icon-search" id="btn" onclick="getDataGrid()">查询</a>
  </div>
  <div class="jzjltab queryTabs m-l5">
    <table id="tabList"></table>
  </div>
  <script>
    function closeAndRefresh(){
      parent.getYjwsNum();
      parent.closemodalwindow();
    }

    function getDataGrid() {
      var _height = 0.96 * ($("#tabs", parent.document).height() - 28 - 24);
      $("#tabList").height(_height);
      $('#tabList').datagrid({
        nowrap: true,
        striped: true,
        singleSelect: true,
        url: '${baseurl}zyyreport/queryfrdj_result.do',
        idField: 'emgSeq',
        loadFilter: function (data) {
          if (data.resultInfo && data.resultInfo.messageCode == '109') {
            message_alert(data, function () {
              window.location.href = "${baseurl}first.do";
            });
          }
          return data;
        },
        queryParams: {
          'startdate': $('#startDate').val(),
          'enddate': $('#endDate').val()
        },
        loadMsg: '',
        columns: [[{
          field: 'emgSeq',
          title: '预检号 ',
          hidden: true,
          rowspan: 2
        }, {
          field: 'frDat',
          title: '预检时间 ',
          width: getWidth(0.08),
          rowspan: 2,
          formatter: function (value, row, index) {
            return publicFun.timeFormat(new Date(value), 'yyyy/MM/dd hh:mm:ss')
          }
        }, {
          field: 'cstNam',
          title: '姓名',
          rowspan: 2,
          width: getWidth(0.05)
        }, {
          field: 'cstSexCod',
          title: '性别',
          rowspan: 2,
          width: getWidth(0.04)
        }, {
          field: 'cstAge',
          title: '年龄',
          rowspan: 2,
          width: getWidth(0.06),
          formatter: function(value,row,index){
            var _age = value + row.cstAgeCod
            return _age
          }
        }, {
          field: 'nationality',
          title: '国籍',
          rowspan: 2,
          width: getWidth(0.06)
        }, {
          field: 'gzdw',
          title: '工作单位',
          rowspan: 2,
          width: getWidth(0.08)
        }, {
          field: 'cstAdr',
          title: '家庭住址及身份证号码',
          width: getWidth(0.1),
          rowspan: 2,
          formatter:function(value,row,index){
            var _addrId = '';
            if(value != null){
              _addrId += '家庭住址：'+value+'，'
            }
            if(row.idNbr != null){
              _addrId += '身份证：'+row.idNbr
            }
            return _addrId
          }
        },{
          field: 'contactDes',
          rowspan: 2,
          title: '患者电话、家属电话、朋友电话',
          width: getWidth(0.08)
        },  {
          field: '',
          title: '本次患者病前两周流行病学病史',
          width: getWidth(0.3),
          colspan: 6
        }, {
          field: 'tmpNbr',
          title: '体温',
          width: getWidth(0.03),
          rowspan: 2
        }, {
          field: 'brqx',
          title: '离院或留观',
          width: getWidth(0.04),
          rowspan: 2,
          formatter:function(value,row,index){
            if(value == '0'){
              return '离院'
            }else if(value == '1'){
              return '留观'
            }
          }
        }, {
          field: 'nycCod',
          title: '疟原虫',
          width: getWidth(0.03),
          rowspan: 2,
          formatter:function(value,row,index){
            if(value == '0'){
              return '无'
            }else if(value == '1'){
              return '有'
            }
          }
        }],[{
          field: 'frCod',
          title: '是否接触过发热病人',
          width: getWidth(0.04),
          formatter:function(value,row,index){
            if(value == '0'){
              return '否'
            }else if(value == '1'){
              return '是'
            }
          }
        },{
          field: 'fdCod',
          title: '是否接触过非典病人',
          width: getWidth(0.04),
          formatter:function(value,row,index){
            if(value == '0'){
              return '否'
            }else if(value == '1'){
              return '是'
            }
          }
        },{
          field: 'dghd',
          title: '到过何地',
          width: getWidth(0.04),
        },{
          field: 'ggcs',
          title: '去过哪些人口密集的公共场所',
          width: getWidth(0.07),
        },{
          field: 'jtgj',
          title: '乘坐过的交通工具',
          width: getWidth(0.04),
        },{
          field: 'jcdw',
          title: '接触过何种动物',
          width: getWidth(0.06),
        }]],
        rownumbers: true,
        toolbar: [],
      });
    }

    function getWidth(proportion) {
      var userAgent = navigator.userAgent; //取得浏览器的userAgent字符串
      var width = '';
      if (userAgent.indexOf("Chrome") > -1) {
        width = $(document).width();
      } else {
        width = $(document).width() - 50;
      }
      return Math.round(proportion * width);
    }

    function setTime() {
      var _today = publicFun.timeFormat(new Date(), 'yyyy/MM/dd');
      var _preWeek = new Date().getTime() - 24 * 60 * 60 * 1000;
      $("#startDate").val(publicFun.timeFormat(new Date(_preWeek), 'yyyy/MM/dd'));
      $("#endDate").val(_today);
    }

    $(document).resize(function () {
      var height = 0.975 * $(document).height() - 26;
      $("#tabList").height(height);
    })

    var isOpen = 1, _seqCurrent = '', currentRow = null;
    $(function () {
      if (!parent.$('#qtsjSeq').val()) {
        setTime();
      } else {
        _seqCurrent = parent.$('#qtsjSeq').val();
      }
      getDataGrid();
    })
  </script>
</body>

</html>