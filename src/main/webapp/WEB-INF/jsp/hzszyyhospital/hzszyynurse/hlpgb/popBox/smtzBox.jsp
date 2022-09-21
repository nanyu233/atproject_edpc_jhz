<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/base/tag.jsp"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>

<head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
  <title>生命体征导入</title>
  <%@ include file="/WEB-INF/jsp/base/common_css.jsp"%>
  <link rel="stylesheet" type="text/css" href="${baseurl}css/hems/global.css?090">
  <link rel="stylesheet" type="text/css" href="${baseurl}css/common/querylist.css" />
  <%@ include file="/WEB-INF/jsp/base/common_js.jsp"%>
  <script>
    var _xtList = publicFun.getDict('XT_COD');
  </script>
</head>

<body>
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
  
  <div class="right-grp">
    <a class="easyui-linkbutton m-r5" iconCls="icon-cancel" onclick="closeAndRefresh()">关闭</a>
  </div>
  <script>
    function closeAndRefresh(){
      parent.closemodalwindow();
    }

    function getDataGrid() {
      var _height = 0.975 * $(document).height() - 65;
      $("#tabList").height(_height);
      var _cstNam = '';
      if ('${typeSource}' == 'nurseNote') {
        _cstNam = parent._cstNam
      } else {
        _cstNam = parent.sub.basicInfo.cstNam
      }
      $('#tabList').datagrid({
        nowrap: true,
        striped: true,
        singleSelect: true,
        url: '${baseurl}hlpgb/exportVitalSigns.do',
        idField: 'rczId',
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
          'enddate': $('#endDate').val(),
          'hspemginfCustom.cstNam': _cstNam
        },
        loadMsg: '',
        columns: [[{
          field: 'emgSeq',
          title: '预检号 ',
          hidden: true,
        }, {
          field: 'emgDatStr',
          title: '预检时间 ',
          width: getWidth(0.2)
        }, {
          field: 'tmpNbr',
          title: '体温(℃)',
          width: getWidth(0.08)
        }, {
          field: 'breNbr',
          title: '呼吸(次/分)',
          width: getWidth(0.08)
        }, {
          field: 'pulse',
          title: '脉搏(次/分)',
          width: getWidth(0.08)
        }, {
          field: 'sbpUpNbr',
          title: '血压(mmHg)',
          width: getWidth(0.15),
          formatter:function(value,row,index){
            if(row.sbpNbrFlg == '2'){
              return "测不出"
            }else if(row.sbpNbrFlg == '3'){
              return "拒测"
            }else{
              if(row.sbpUpNbr != null && row.sbpDownNbr != null){
                return row.sbpUpNbr+'/'+row.sbpDownNbr
              }else if(row.sbpUpNbr != null){
                return row.sbpUpNbr+'/'
              }else if(row.sbpDownNbr != null){
                return '/'+row.sbpDownNbr
              }
            }
          }
        } ,{
          field: 'oxyNbr',
          title: '血氧(%)',
          width: getWidth(0.08)
        }, {
          field: 'pbgNbr',
          title: '血糖(mmol/L)',
          width: getWidth(0.15),
          formatter: function(value,row,index){
            if(row.glsCod != null){
              var glsCodList = _xtList,
                  glsCod = row.glsCod;
              var _xtHead = '';
              $.each(glsCodList, function (idx, val) {
                if (val['infocode'] == glsCod) {
                  _xtHead =  glsCodList[idx].info ;
                }
              })
              if(row.pbgNbrFlg == '2'){
                return _xtHead +'-LO'
              }else if(row.pbgNbrFlg == '3'){
                return _xtHead +'-HI'
              }else if(row.pbgNbrFlg == '4'){
                return _xtHead +'-拒测'
              }

              if(value != null){
                return _xtHead +'-' + row.pbgNbr 
              }

              return _xtHead
            }else{
              if(row.pbgNbrFlg == '2'){
                return 'LO'
              }else if(row.pbgNbrFlg == '3'){
                return 'HI'
              }else if(row.pbgNbrFlg == '4'){
                return '拒测'
              }
              if(value != null){
                return row.pbgNbr 
              }
            }
          }
        }, {
          field: 'opt1',
          title: '操作',
          width: getWidth(0.08),
          formatter: function (value, row, index) {
            return "<a href=javascript:cmdImportMsg()>导入</a>"
          }
        }]],
        rownumbers: true,
        toolbar: [],
        onDblClickRow: function (rowIndex, rowData) {
          cmdImportMsg();
        },
      });
    }
    
    function cmdImportMsg() {
      var row = $('#tabList').datagrid('getSelected');
      if (GridUtils.checkChecked(row)) {
        var _signList = ['tmpNbr', 'breNbr', 'sbpUpNbr', 'sbpDownNbr', 'oxyNbr', 'pbgNbr', 'glsCod', 'pbgNbrFlg', 'tmpNbrFlg', 'breNbrFlg', 'sbpNbrFlg', 'xyFlg', 'pulse', 'pulseFlg'];
        if ('${typeSource}' == 'nurseNote') {
          for (var j = 0; j < _signList.length; j++) {
            if (_signList[j] == 'pbgNbr') {
              parent.sub.notePatientMsg.xt = row[_signList[j]] || ''
            } else if (_signList[j] == 'glsCod') {
              parent.sub.notePatientMsg['xtCod'] = row[_signList[j]] || ''
            } else if (_signList[j] == 'pbgNbrFlg') {
              parent.sub.notePatientMsg['xtFlg'] = row[_signList[j]] || ''
            } else if (_signList[j] == 'oxyNbr') {
              parent.sub.notePatientMsg['xy'] = row[_signList[j]] || ''
            } else {
              parent.sub.notePatientMsg[_signList[j]] = row[_signList[j]] || ''
            }
          }
        } else {
          for (var j = 0; j < _signList.length; j++) {
            parent.sub.hlpgbpatientMsg[_signList[j]] = row[_signList[j]] || '';
          }
        };
        setTimeout("parent.closemodalwindow()", 500);
      }
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

    $("#btn").click(function(event){
      event.preventDefault();
    });

    $(function () {
      setTime();
      getDataGrid();
    })
  </script>
</body>

</html>