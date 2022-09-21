<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/base/tag.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
  <%@ include file="/WEB-INF/jsp/base/common_css.jsp"%>
  <link rel="stylesheet" type="text/css" href="${baseurl}css/hzszyyhems/leftWrap/leftWrap.css?v=${versionDay}">
  <%@ include file="/WEB-INF/jsp/base/common_js.jsp"%>
  <title>护理记录页面左侧患者列表</title>
  <script src="${baseurl}lib/avalon1.4.8/avalon.js" type="text/javascript" charset="UTF-8"></script>
  <script>
    var _pageSrc = '${pageSrc}',
      _emgSeq = '${emgSeq}',
      requestSource = '${requestSource}', // requestSource 请求来源(HIS_NO_PATIENT: HIS请求病历且未查到患者数据);
      currentUserId = '${sessionScope.activeUser.usrno}';
    var _emgDat, isCheckFormList = false; // 是否从list这边点过去
  </script>
</head>

<body class="leftWrap">
  <header class="basic-msg" ms-controller="leftWrapMsg">
    <span class="patientListBtn spanBtn" onclick="showPatientList()">患者列表</span>
    <span class="diseaseListBtn spanBtn onlyQjsDocEnd" id="diseaseBtn" onclick="showDiseaseList()">病程录列表</span>
    <span class="historyRecordBtn spanBtn onlyDocEnd" id="historyBtn" onclick="showReviewRecord()">历史病历</span>
    <span class="nameLeft"></span>
    <span id="cstNam" class="bgName">{{patientMsg.cstNam}}</span>
    <span id="emgDepCod" class="leftGap level">{{patientMsg.emgDepCod}}</span>
    <span id="mpi">{{patientMsg.mpi}} <span ms-visible="patientMsg.mpi"> /</span></span>
    <span id="cstSexCod">{{patientMsg.cstSexCod}} <span ms-visible="patientMsg.cstSexCod"> /</span></span>
    <span id="cstAge">{{patientMsg.cstAge}}<span ms-visible="patientMsg.cstAge">{{patientMsg.cstAgeCod}}  /</span></span>
    <span id="bedNum">{{patientMsg.bedNum}}</span>
    <span ms-visible="patientMsg.jzxh && patientMsg.bedNum"> /</span>
    <span ms-visible="patientMsg.jzxh">第{{patientMsg.jzxh}}次</span>
    <span class="emgFkCod onlyDocEnd"><span ms-visible="patientMsg.emgFkCod && patientMsg.jzxh"> /</span>{{patientMsg.emgFkCod}}</span>
    <span class="leftGap"><span class="specialText">诊断：</span><a ms-attr-title="patientMsg.jbzdDes" class="longLinkText">{{patientMsg.jbzdDesText}}</a></span>
    <span class="leftGap" id="outComeSpan" ms-visible="(patientMsg.sqlSeq != patientMsg.firstsqlseq) || patientMsg.pageSrc == 'queryQjs' || patientMsg.pageSrc == 'transManager'">
      <span class="outcomeTitle specialText" onclick="toOutComeBox()">转归：</span>
      <label ms-visible="patientMsg.sqlSeq != patientMsg.firstsqlseq">
        <span class="spanRight" id="sql_sqlDatTim">{{patientMsg.sqlDat}}</span>
        <span class="spanRight" id="sqlStaStr">{{patientMsg.sqlStaStr}}</span>
        <span class="spanRight" id="emg_emgFkName" ms-if="patientMsg.sqlStaCod == '2'">{{patientMsg.sqlDepName}}</span>
        <span class="spanRight" id="emg_sqlDes" ms-if="patientMsg.sqlStaCod == '13'">{{patientMsg.sqlDes}}</span>
        <span class="spanRight" id="emg_bedNam" ms-if="patientMsg.sqlStaCod == '6' || patientMsg.sqlStaCod == '11'">{{patientMsg.bedNam}}</span>
      </label>
      <label ms-visible="patientMsg.sqlSeq == patientMsg.firstsqlseq">
        <span class="spanRight">无</span>
      </label>
    </span>
    <span class="leftGap visitNum">
      <!-- 就诊次数：{{patientMsg.jzxh}} -->
    </span>
    <span class="leftGap mindClock">
      <img src="../images/hems/first/tip_icon.png"> 
      <span class="redColor">提醒：48小时二次就诊</span>
    </span>
    <span class="leftGap cursor-type writeLqRecordBtn">
      <a class="onlyLink" onclick="writeMzRecord()">书写门诊病历</a>
      <a class="onlyLink" onclick="writeLqRecord()">书写留抢病历</a>
    </span>
    <!-- <span onclick="toPreOne()">上一个</span> -->
    <!-- 护理记录和输液管理相互跳转 -->
    <span id="transManagerLink" class="onlyLinkSpan">
      <a class="onlyLink" onclick="toQisRecord()">护理记录</a>
      <a class="onlyLink" onclick="toEditMsg()">信息修改</a>
    </span>
    <span id="queryQjsLink" class="onlyLinkSpan">
      <a class="onlyLink" onclick="toTransManagerRecord()">输液管理</a>
      <a class="onlyLink" onclick="toEditMsg()">信息修改</a>
    </span>
    <!-- 留抢病历新增日志功能--点击到新的tab页可以查看之前写的数据信息-->
    <span id="qjsCaseLink" class="onlyLinkSpan">
      <a class="onlyLink" onclick="toDailyRecord()">日志</a>
    </span>
  </header>
  <div class="leftMsg">
    <div class="queryNormalBox queryBox">
      <label for="usingBed">
        <input class="isBed" id="usingBed" type="checkbox" value="0" checked onclick="singleCheck(this)"> 在床
      </label>
      <!-- 目前先隐藏----数据上存在bug -->
      <!-- <label for="leaveQjs">
        <input class="isBed" id="leaveQjs" type="checkbox" value="1" onclick="singleCheck(this)"> 离抢
      </label>
      <label for="all">
        <input class="isBed" id="all" type="checkbox" value="2" onclick="singleCheck(this)"> 全部
      </label> -->
    </div>
    <div class="queryMzBox queryBox">
      <label for="overTime">
        <input class="isMzCk" id="overTime" type="checkbox" value="0" checked onclick="singleMzCheck(this)"> 候诊患者
      </label>
      <label for="overRecord">
        <input class="isMzCk" id="overRecord" type="checkbox" value="1" onclick="singleMzCheck(this)"> 已写病历
      </label>
    </div>
<!--     <select onchange="setType()" id="typeVal" class="leftQuerySelect">
      <option value="1">日期</option>
      <option value="2">姓名</option>
      <option value="3">就诊卡</option>
      <option value="3">病历号</option>
    </select>
    <input id="queryText" type="text" class="input-wth">
    <span class="dateBox">
      <input class="queryEmg small-date" id="emg_startDate" type="text" onclick="WdatePicker({dateFmt:'yyyy/MM/dd',isShowClear:true,readOnly:true})">
      <input class="queryEmg small-date" id="emg_endDate" type="text" onclick="WdatePicker({dateFmt:'yyyy/MM/dd',isShowClear:true,readOnly:true})">
    </span>
    <a class="commonbtn queryBtn" href="javascript:;" onclick="getLeftPatientList()">查询</a> -->
    <div class="tabList">
      <table id="patientList"></table>
    </div>
  </div>
  <div class="hisRecordMsg recordMsg">
    <div class="tabList">
      <table id="recordList"></table>
    </div>
  </div>
  <div class="diseaseMsg recordMsg">
    <div class="tabList">
      <table id="diseaseList"></table>
    </div>
  </div>
  <div class="rightMainMsg">
    <iframe id="rightIframe" frameborder="0" marginwidth="0" marginheight="0" width="100%" height="100%" scrolling="auto"></iframe>
  </div>
  <script>
    // 患者列表
    function showPatientList () {
      $('.recordMsg').hide();
      var _getBoxDis = document.getElementsByClassName('leftMsg')[0].style.display;
      if (_getBoxDis == 'none' || _getBoxDis == '') {
        calcBox();
        $('.spanBtn').removeClass('active');
        $('.patientListBtn').addClass('active');
        $('.leftMsg').show();
        getLeftPatientList();
      } else {
        $('.leftMsg').hide();
        calcBox('hide');
        $('.patientListBtn').removeClass('active');
      }
    }
    // 历史病历
    function showReviewRecord () {
      $('.leftMsg').hide();
      $('.diseaseMsg').hide();
      var _getRecordBoxDis = document.getElementsByClassName('hisRecordMsg')[0].style.display;
      if (_getRecordBoxDis == 'none' || _getRecordBoxDis == '') {
        calcBox('his');
        $('.spanBtn').removeClass('active');
        $('.historyRecordBtn').addClass('active');
        $('.hisRecordMsg').show();
        getHisRecord();
      } else {
        $('.recordMsg').hide();
        calcBox('hide');
        $('.historyRecordBtn').removeClass('active');
      }
    }

    // 病程录列表
    function showDiseaseList () {
      $('.leftMsg').hide();
      $('.hisRecordMsg').hide();
      var _getDiseaseBoxDis = document.getElementsByClassName('diseaseMsg')[0].style.display;
      if (_getDiseaseBoxDis == 'none' || _getDiseaseBoxDis == '') {
        calcBox('disease');
        $('.spanBtn').removeClass('active');
        $('.diseaseListBtn').addClass('active');
        $('.diseaseMsg').show();
        getDiseaseRecord();
      } else {
        $('.recordMsg').hide();
        calcBox('hide');
        $('.diseaseListBtn').removeClass('active');
      }
    }

    // 单选
    // 必须勾选一个
    function singleCheck (current) {
      $('#emg_startDate').val('');
      $('.isBed').attr('checked', false)
      $(current).attr('checked', true)
      var _queryType = $('#usingBed').is(':checked') ? 0 : $('#leaveQjs').is(':checked') ? 1 : $('#all').is(':checked') ? 2 : '';
      if (_queryType == 1) {
        setTime();
      }
      getLeftPatientList()
    }
    
    // 门诊病历 可都不勾选
    function singleMzCheck (current) {
      if (!$(current).attr('checked')) {
        $(current).attr('checked', false)
      } else {
        $('.isMzCk').attr('checked', false)
        $(current).attr('checked', true)
      }
      getLeftPatientList()
    }

    function setType () {
      var _selVal = $('#typeVal').val();
      $('#queryText').val('');
      if (_selVal === '1') {
        $('.dateBox').show();
        $('#queryText').hide();
        $('.queryEmg').val('');
      } else {
        $('.dateBox').hide();
        $('#queryText').show();
      }
    }
    
    function toOutComeBox () {
      if (_pageSrc === 'queryQjs' || _pageSrc === 'transManager') {
        var openModalWindowName = $('#cstNam').html() + '-转归登记',
          openModalWindowUrl = '${baseurl}zyyqjs/querylqxxdjzyy.do?emgSeq=' + _emgSeq;
        createmodalwindow(openModalWindowName, 950, 500, openModalWindowUrl);
      }
    }

    function setTime () {
      var _today = publicFun.timeFormat(new Date(), 'yyyy/MM/dd')
      $("#emg_startDate").val(_today);
      // $("#emg_endDate").val(_today);
    };

    function generateParam () {
      var _queryType, _isMzType;
      if (_pageSrc === 'qjsCaseMz') { // 门诊列表 去掉在床等checkbox;
        _queryType = '3';
        _isMzType = $('#overTime').is(':checked') ? 0 : $('#overRecord').is(':checked') ? 1 : ''
      } else {
        _queryType = $('#usingBed').is(':checked') ? 0 : $('#leaveQjs').is(':checked') ? 1 : $('#all').is(':checked') ? 2 : ''
      }
      var _selVal = $('#typeVal').val(), param = {};
      if (_selVal === '1') {
        param = {
          'hspemginfCustom.startdate': $('#emg_startDate').val(),
          'hspemginfCustom.enddate': $('#emg_startDate').val(),
          'hspemginfCustom.queryType': _queryType,
          'isJzmzType': _isMzType
        };
      } else {
        var _paramNameMsg = '', _paramCardMsg = '';
        if (_selVal === '2')  {
          _paramNameMsg = $('#queryText').val();
          _paramCardMsg = '';
        }
        if (_selVal === '3') {
          _paramCardMsg = $('#queryText').val();
          _paramNameMsg = '';
        }
        param = {
          'hspemginfCustom.cstNam': _paramNameMsg,
          // 'hspemginfCustom.vstCad': _paramCardMsg,
          'hspemginfCustom.mpi': _paramCardMsg,
          'hspemginfCustom.queryType': _queryType,
          'isJzmzType': _isMzType
        };
      }
      return param;
    }
    
    /**
     * 患者列表
     **/ 
    function getLeftPatientList () {
      var height = 0.975 * ($("#tabs", parent.document).height() - 36 - 16) - 20;
      $('#patientList').height(height);
      $('#patientList').css({ 'height': height + 'px' });
      $('#patientList').datagrid({
        nowrap: false,
        striped: true,
        singleSelect: true,
        url: '${baseurl}zyyxtpg/leftWrap_result.do',
        idField: 'emgSeq',
        loadFilter: function (data) {
          if (data.resultInfo && data.resultInfo.messageCode == '109') {
            message_alert(data, function () {
              window.location.href = "${baseurl}first.do";
            });
          }
          return data;
        },
        queryParams: generateParam(),
        loadMsg: '',
        toolbar: [{ //工具栏
          id: 'btn-reload',
          text: '刷新',
          iconCls: 'icon-reload',
          handler: function () {
            getLeftPatientList()
          }
        }],
        columns: [
          [{
            field: 'emgDepCod',
            title: '',
            width: 20,
            formatter: function (value, row, index) {
              return ''
            },
            styler: function (value, row, index) {
              if (value == "I级") {
                return 'background:url(../images/hems/nurse/oneC.png);background-repeat: no-repeat;background-position: 6px; background-size: 12px 12px;color:transparent;';
              } else if (value == "II级") {
                return 'background:url(../images/hems/nurse/twoC.png);background-repeat: no-repeat;background-position: 6px; background-size: 12px 12px;color:transparent;';
              } else if (value == "III级") {
                return 'background:url(../images/hems/nurse/threeC.png);background-repeat: no-repeat;background-position: 6px; background-size: 12px 12px;color:transparent;';
              } else if (value == "IVa级" || value == "IVb级") {
                return 'background:url(../images/hems/nurse/fourC.png);background-repeat: no-repeat;background-position: 6px; background-size: 12px 12px;color:transparent;';
              }
            }
          }, {
            field: 'emgDat',
            title: '日期',
            sortable: true,
            hidden: true,
            width: 40,
            formatter: function (value, row, index) {
              return publicFun.timeFormat(new Date(value), 'MM/dd hh:mm')
            }
          }, 
          // {
          //   field: 'cstNam',
          //   title: '姓名',
          //   sortable: true,
          //   hidden: true,
          //   width: 85,
          //   formatter: function (value, row, index) {
          //     var _showMsg = '<span style="font-weight:bold;font-size:13px;margin-right:4px;">' + value + '</span><br/>';
          //     // if (row.bedNum) {
          //     //   _showMsg += row.bedNum + '/';
          //     // }
          //     if (row.cstSexCod) {
          //       _showMsg += row.cstSexCod + '/';
          //     }
          //     if (row.cstAge) {
          //       _showMsg += row.cstAge + row.cstAgeCod + '/'; 
          //     }
          //     if (row.emgDepCod) {
          //       _showMsg += row.emgDepCod + '/';
          //     }
          //     // if (row.cstDspCodNameNew) {
          //     //   var _zg = '';
          //     //   if (row.firstsqlseq == row.sqlSeq) {
          //     //     _zg = ''
          //     //   } else if (row.cstDspCodNew == '2') {
          //     //     _zg = row.cstDepCodNew + '/'
          //     //   } else if (row.cstDspCodNew == '13') {
          //     //     _zg = row.sqlDes + '/'
          //     //   } else {
          //     //     _zg = row.cstDspCodNameNew + '/'
          //     //   }
          //     //   _showMsg += _zg;
          //     // }
          //     _showMsg = _showMsg.substring(0, _showMsg.length - 1)
          //     return _showMsg;
          //   }
          // }, 
          {
            field: 'bedNum',
            title: '床位',
            sortable: true,
            width: 50
          }, {
            field: 'cstNam',
            title: '姓名',
            sortable: true,
            width: 75
          }]
        ],
        pagination: true,
        rownumbers: false,
        pageList: [20, 30, 50],
        onDblClickRow: function (rowIndex, rowData) {
          // toNewTab(rowData);
          toSelectedOne(rowData);
          // toPreOne(rowData)
        }
      });
    }
    
    /**
     * 历史病历
     **/
    function getHisRecord () {
      publicFun.httpServer({url: '${baseurl}hzszyyemg/getJzlqblAjax.do', isNoLoad: true}, { mpi: vm.patientMsg.mpi }, function (res) {
        if (res.resultInfo && res.resultInfo.messageCode === 906) { // 请求成功
          var height = 0.975 * ($("#tabs", parent.document).height() - 36 - 16);
          $('#recordList').height(height);
          $('#recordList').css({'height': height + 'px'});
          $('#recordList').datagrid({
            nowrap: false,
            striped: true,
            singleSelect: true,
            idField: 'jzlqblNam',
            data: res.resultInfo.sysdata.jzlqblList,
            loadMsg: '',
            toolbar: [{ //工具栏
              id: 'btn-reload',
              text: '刷新',
              iconCls: 'icon-reload',
              handler: function () {
                getHisRecord()
              }
            }],
            columns: [
              [{
                field: 'jzlqblNam',
                title: '就诊信息',
                sortable: true,
                width: 170,
                formatter: function (value, row, index) {
                  var rtnStr =  value;
                  if (row.bltype == '0') {
                    return rtnStr + '<span style="color: red; margin-left: 2px">留</span>'
                  } else {
                    return rtnStr;
                  }
                }
              }]
            ],
            rownumbers: false,
            onLoadSuccess: function (data) {
              var lists = data.rows;
              lists.forEach(function (item, idx) {
                // 同一笔预检 同一个医生 只能写一份病历
                if ((item.emgSeq == '${emgSeq}') && (item.cratNbr == currentUserId)) {
                  if (item.bltype != '0') {
                    // 历史病历传 isHisType + lqblSeq
                    if ($('#recordList').datagrid('getSelected')) {
                      // var node = $('#recordList').datagrid('getSelected');
                      // var _openTabUrl = '${baseurl}hzszyyjzmz/tomzblHome.do?emgSeq=' + node.emgSeq + '&cstNam=' + node.cstNam + '&zgcount=' + node.zgcount + '&isHisType=historyRecord&lqblSeq=' + node.lqblSeq + '&pageFlg=${pageFlg}&th=' + new Date().getTime();
                      // $('#rightIframe').attr('src', encodeURI(_openTabUrl))
                    } else {
                      // 历史病历暂时先不定位
                      // var _openTabUrl = '${baseurl}hzszyyjzmz/tomzblHome.do?emgSeq=' + item.emgSeq + '&cstNam=' + item.cstNam + '&zgcount=' + item.zgcount + '&mpi=' + item.mpi + '&jzxh=' + item.jzxh + '&isHisType=historyRecord&lqblSeq=' + item.lqblSeq + '&pageFlg=${pageFlg}&th=' + new Date().getTime();
                      // $('#recordList').datagrid('selectRow', idx);
                      // $('#rightIframe').attr('src', encodeURI(_openTabUrl))
                    }
                  }
                }
              })
            },
            onDblClickRow: function (rowIndex, rowData) {
              // toNewTab(rowData, 'history');
              toSelectedOne(rowData, 'history')
            }
          });
        }
      })
    }
    
    /**
     * 病程录列表
     **/
    function getDiseaseRecord () {
      publicFun.httpServer({url: '${baseurl}zyylqbl/getBclAjax.do', isNoLoad: true}, { emgSeq: '${emgSeq}' }, function (res) {
        if (res.resultInfo && res.resultInfo.messageCode === 906) { // 请求成功
          var height = 0.975 * ($("#tabs", parent.document).height() - 36 - 16);
          $('#diseaseList').height(height);
          $('#diseaseList').css({'height': height + 'px'});
          $('#diseaseList').datagrid({
            nowrap: false,
            striped: true,
            singleSelect: true,
            idField: 'paperworkDate',
            data: res.resultInfo.sysdata.bclList,
            loadMsg: '',
            toolbar: [{ //工具栏
              id: 'btn-reload',
              text: '刷新',
              iconCls: 'icon-reload',
              handler: function () {
                getDiseaseRecord()
              }
            }],
            columns: [
              [{
                field: 'paperworkDate',
                title: '时间',
                sortable: true,
                width: 80,
                formatter: function (value, row, index) {
                   return value ? publicFun.timeFormat(new Date(value), 'yyyy-MM-dd hh:mm') : '';
                }
              }, {
                field: 'paperworkName',
                width: 95,
                title: '名称'
              }, {
                field: 'doctorName',
                width: 58,
                title: '医生'
              }, {
                field: 'primaryKey',
                width: 45,
                title: '数据主键',
                hidden: true
              }]
            ],
            rownumbers: false,
            onLoadSuccess: function (data) {
              var lists = data.rows;
              lists.forEach(function (item, idx) {
                // 同一笔预检 同一个医生 只能写一份病历
                item.lqblSeq = item.primaryKey;
                if ((item.emgSeq == '${emgSeq}') && (item.doctorNbr == currentUserId)) {
                  if (item.paperworkName == '急诊门诊病历') {
                    if (_pageSrc == 'qjsCaseMz') {
                      if ($('#diseaseList').datagrid('getSelected')) {
                        // toRefreshRightPanel($('#diseaseList').datagrid('getSelected'), 'mz')
                      } else {
                        $('#diseaseList').datagrid('selectRow', idx);
                        toRefreshRightPanel(item, 'mz')
                      }
                    }
                  }
                }
              })
            },
            onDblClickRow: function (rowIndex, rowData) {
              rowData.lqblSeq = rowData.primaryKey;
              if (_pageSrc == 'qjsCaseMz') { // 门诊
                if (rowData.relevanceModule != 'checkMzLqblCod' && rowData.relevanceModule != 'checkMzZqtyCod') { // 留
                  toOnlyDocPanel(rowData, 'lq');
                } else { // 门诊
                  toRefreshRightPanel(rowData, 'mz')
                }
              } else { // 留抢
                if (rowData.relevanceModule != 'checkMzLqblCod' && rowData.relevanceModule != 'checkMzZqtyCod') { // 留
                  toRefreshRightPanel(rowData, 'lq')
                } else { // 门诊
                  toOnlyDocPanel(rowData, 'mz');
                }
              }
            }
          });
        }
      })
    }

    // 去门诊模块 || 急诊模板
    function toOnlyDocPanel (rowData, type) {
      var _openTabUrl = '';
      if (type == 'lq') {
        _openTabUrl = '${baseurl}zyyqjs/qjscasenote.do?emgSeq=${emgSeq}&cstNam=${cstNam}&zgcount=${zgcount}&th=' + new Date().getTime() + '&relevanceModule=' + rowData.relevanceModule;
        _pageSrc = 'qjsCase';
        parent.$("#tabs .tabs-selected .tabs-title").text('${cstNam}-留抢病历记录');
      } else {
        // 历史病历传 isHisType + lqblSeq
        _openTabUrl = '${baseurl}hzszyyjzmz/tomzblHome.do?emgSeq=${emgSeq}&cstNam=${cstNam}&zgcount=${zgcount}&mpi=${mpi}&jzxh=${jzxh}&isHisType=historyRecord&lqblSeq=' + rowData.lqblSeq + '&pageFlg=qjsCaseMz&th=' + new Date().getTime() + '&relevanceModule=' + rowData.relevanceModule;
        _pageSrc = 'qjsCaseMz';
        parent.$("#tabs .tabs-selected .tabs-title").text('${cstNam}-门诊病历记录');
      }
      _openTabUrl = encodeURI(_openTabUrl);
      $('#rightIframe').attr('src', _openTabUrl);
      vm.patientMsg.pageSrc = _pageSrc;
      judgeIsDocEnd();
    }

    // 刷新右边的内容块
    function toRefreshRightPanel (rowData, type) {
      var _openTabUrl = '';
      if (type == 'mz') { // 门诊
        // 历史病历传 isHisType + lqblSeq
        _openTabUrl = '${baseurl}hzszyyjzmz/tomzblHome.do?emgSeq=${emgSeq}&cstNam=${cstNam}&zgcount=${zgcount}&mpi=${mpi}&jzxh=${jzxh}&isHisType=historyRecord&lqblSeq=' + rowData.lqblSeq + '&pageFlg=${pageFlg}&th=' + new Date().getTime() + '&relevanceModule=' + rowData.relevanceModule;
      } else {
        _openTabUrl = '${baseurl}zyyqjs/qjscasenote.do?emgSeq=${emgSeq}&cstNam=${cstNam}&zgcount=${zgcount}&th=' + new Date().getTime() + '&relevanceModule=' + rowData.relevanceModule;
      }
      _openTabUrl = encodeURI(_openTabUrl);
      $('#rightIframe').attr('src', _openTabUrl)
    }

    // 原先打开其他患者===> tab页方式 [已经注释了]
    function toNewTab (checkedMsg, listType) {
      var leftBedNam = '', _title = '';
      if (checkedMsg.bedNum != null) {
        leftBedNam = checkedMsg.bedNum + '-';
      }
      if (listType === 'history') {
        var openTabUrl;
        if (checkedMsg.bltype === '0') { // 0是留抢病历 1是门诊急诊
          _title =  checkedMsg.sqlDat.substr(0, 10) + '-' + leftBedNam + checkedMsg.cstNam + '-'+ '留抢病历记录';
          _pageSrc = 'qjsCase';
        } else {
          _title = checkedMsg.sqlDat.substr(0, 10) + '-' + checkedMsg.cstNam + '-' + '门诊病历记录';
          _pageSrc = 'qjsCaseMz';
        }
      } else {
        if (_pageSrc === 'queryQjs') {
          _title = leftBedNam + checkedMsg.cstNam + '-' + '护理记录';
        } else {
          if (_pageSrc === 'qjsCaseCheck') {
            _title = checkedMsg.cstNam + '-' + '留抢病历审核';
          } else if (_pageSrc === 'qjsCase') {
            _title = leftBedNam + checkedMsg.cstNam + '-' + '留抢病历记录';
          } else if (_pageSrc === 'qjsCaseMz') {
            _title = checkedMsg.cstNam + '-' + '门诊病历记录';
          } else if (_pageSrc === 'transManager') {
            _title = leftBedNam + checkedMsg.cstNam + '-' + '输液管理';
          }
        }
      }
      var openTabUrl = '${baseurl}zyyxtpg/toLeftWrap.do?emgSeq=' + checkedMsg.emgSeq + '&cstNam=' + checkedMsg.cstNam + '&zgcount=' + checkedMsg.zgcount + '&pageSrc=' + _pageSrc + '&th=' + new Date().getTime();
      parent.opentabwindow(_title, openTabUrl, '0');
      setTimeout(function () {
        if (listType === 'history') {
          calcBox('his');
          $('.spanBtn').removeClass('active');
          $('.historyRecordBtn').addClass('active');
          $('.recordMsg').show();
          getHisRecord();
        } else {
          calcBox();
          $('.spanBtn').removeClass('active');
          $('.patientListBtn').addClass('active');
          $('.leftMsg').show();
          getLeftPatientList();
        }
      }, 1000);
    }

    // 原先打开其他患者===> 重载当前页 [因为修改了tab参数导致tab默认的刷新和关闭失效]
    function toSelectedOne (checkedMsg, listType) {
      var leftBedNam = '', _title = '';
      if (checkedMsg.bedNum != null) {
        leftBedNam = checkedMsg.bedNum + '-';
      }
      setBasicMsg(checkedMsg);
      if (listType === 'history') {
        var _openTabUrl;
        if (checkedMsg.bltype === '0') { // 0是留抢病历 1是门诊急诊 [历史病历留抢病历 不需要 pageFlg]
          _title = checkedMsg.sqlDat.substr(0, 10) + '-' + leftBedNam + checkedMsg.cstNam + '-'+ '留抢病历记录';
          _openTabUrl = '${baseurl}zyyqjs/qjscasenote.do?emgSeq=' + checkedMsg.emgSeq + '&cstNam=' + checkedMsg.cstNam + '&zgcount=' + checkedMsg.zgcount + '&th=' + new Date().getTime();
          _pageSrc = 'qjsCase';
        } else {
          _title = checkedMsg.sqlDat.substr(0, 10) + '-' + checkedMsg.cstNam + '-' + '门诊病历记录';
          // 历史病历传 isHisType + lqblSeq
          _openTabUrl = '${baseurl}hzszyyjzmz/tomzblHome.do?emgSeq=' + checkedMsg.emgSeq + '&cstNam=' + checkedMsg.cstNam + '&zgcount=' + checkedMsg.zgcount + '&mpi=' + checkedMsg.mpi + '&jzxh=' + checkedMsg.jzxh + '&pageFlg=${pageFlg}&isHisType=historyRecord&lqblSeq=' + checkedMsg.lqblSeq + '&th=' + new Date().getTime();
          _pageSrc = 'qjsCaseMz';
        }
        _openTabUrl = encodeURI(_openTabUrl);
        $('#rightIframe').attr('src', _openTabUrl);
      } else {
        if (_pageSrc === 'queryQjs') {
          _title = leftBedNam + checkedMsg.cstNam + '-' + '护理记录';
        } else {
          if (_pageSrc === 'qjsCaseCheck') {
            _title = checkedMsg.cstNam + '-' + '留抢病历审核';
          } else if (_pageSrc === 'qjsCase') {
            _title = leftBedNam + checkedMsg.cstNam + '-' + '留抢病历记录';
          } else if (_pageSrc === 'qjsCaseMz') {
            _title = checkedMsg.cstNam + '-' + '门诊病历记录';
          } else if (_pageSrc === 'transManager') {
            _title = leftBedNam + checkedMsg.cstNam + '-' + '输液管理';
          }
        }
        judgeToWitchIframe(checkedMsg.emgSeq, checkedMsg.cstNam, checkedMsg.zgcount);
      }
      parent.$("#tabs .tabs-selected .tabs-title").text(_title);
      isCheckFormList = true;
      judgeIsDocEnd();
      vm.patientMsg.pageSrc = _pageSrc;
      // parent.$("#tabs").tabs('getSelected').title = _title;
      // parent.$("#tabs").tabs('getSelected')[0].innerHTML = '<iframe scrolling="auto" frameborder="0" reloadtype="0" src=\"${baseurl}zyyxtpg/toLeftWrap.do?emgSeq=' + checkedMsg.emgSeq + '&cstNam=' + checkedMsg.cstNam + '&zgcount=' + checkedMsg.zgcount + '&pageSrc=' + _pageSrc + '&th=' + new Date().getTime() + '\" style="width:100%;height:100%;"></iframe>';
    }
    
    var totalEmgObj = {};
    function getFirstPatientMsg () {
      //requestSource 请求来源(HIS_NO_PATIENT: HIS请求病历且未查到患者数据)
      if ('HIS_NO_PATIENT'!= requestSource) {
        publicFun.httpServer({url: '${baseurl}zyyxtpg/findEmgInfByEmgSeq.do', isNoLoad: true, isAsync: false}, { emgSeq: '${emgSeq}', date: new Date().toTimeString()}, function (res) {
          var _basicMsg = res.resultInfo.sysdata.hspemginfCustom;
          totalEmgObj = res.resultInfo.sysdata.hspemginfCustom;
          setBasicMsg(_basicMsg);
        })
      } else {
        vm.patientMsg.cstNam = '${cstNam}';
        vm.patientMsg.emgSeq = '${emgSeq}';
        vm.patientMsg.requestSource = requestSource;
        vm.patientMsg.mpi = '${mpi}';
        vm.patientMsg.jzxh = '${jzxh}';
        mindingClock('${mpi}');
      }
    }

    function setBasicMsg (_basicMsg, newPanel) {
      _basicMsg.sqlStaStr = _basicMsg.cstDspCodNameNew;
      _basicMsg.sqlStaCod = _basicMsg.cstDspCodNew;
      _basicMsg.sqlDepName = _basicMsg.cstDepCodNew;
      _basicMsg.bedNam = _basicMsg.bedNum;
      _emgSeq = _basicMsg.emgSeq;
      _emgDat = _basicMsg.emgDat;
      if (!_basicMsg.jbzdDes) {
        _basicMsg.jbzdDes = '无'
      }
      mindingClock(_basicMsg.mpi);
      for (var key in _basicMsg) {
        if (vm.patientMsg.hasOwnProperty(key)) {
          if (key === 'jbzdDes') {
            var _sLth = 36;
            if ($(window).width() > 1500) {
              _sLth = 46
            }
            if ($(window).width() < 1400) {
              _sLth = 30
            }
            if (_basicMsg[key].length > _sLth) {
              vm.patientMsg.jbzdDesText = _basicMsg[key].substr(0, _sLth) + '...'
            } else {
              vm.patientMsg.jbzdDesText = _basicMsg[key]
            }
          }
          if (key === 'emgDepCod') {
            var _emgLevelList = [{num: 'I级', cod: '0'}, { num: 'II级', cod: '1' }, { num: 'III级', cod: '2' }, { num: 'IVa级', cod: '3' }, , { num: 'IVb级', cod: '3' }];
            _emgLevelList.forEach(function (item, idx) {
              if (_basicMsg[key] == item.num) {
                $('.level').addClass('level' + item.cod)
              }
            })
          }
          vm.patientMsg[key] = _basicMsg[key];
        }
      }
    }

    function toIframe () {
      calcBox('hide');
      judgeToWitchIframe('${emgSeq}', '${cstNam}', '${zgcount}', '${mpi}', '${requestSource}', '${jzxh}');
      judgeIsDocEnd();
      // 留抢病历|门诊 增加病程录列表
      if (_pageSrc === 'qjsCase' || _pageSrc === 'qjsCaseMz') {
        if (_pageSrc === 'qjsCase') {
          var _selectedTabFirst = parent.$("#tabs .tabs-selected .tabs-title").text();
          _selectedTabFirst = _selectedTabFirst.substr(0, 2);
          if (_selectedTabFirst == '日志') {
            $('.spanBtn').hide();
          } else {
            showDiseaseList();
          }
        } else {
          showDiseaseList();
        }
      }
    }
	/**
	 * requestSource 请求来源(HIS_NO_PATIENT: HIS请求病历且未查到患者数据)
	 */
    function judgeToWitchIframe (emgSeq, cstNam, zgcount, mpi, requestSource, jzxh) {
      var openTabUrl;
      if (_pageSrc === 'queryQjs') {
        openTabUrl = '${baseurl}zyyxtpg/queryxtpg.do?emgSeq=' + emgSeq + '&cstNam=' + cstNam + '&zgcount=' + zgcount + '&th=' + new Date().getTime();
      } else {
        if (_pageSrc === 'qjsCaseCheck') {
          openTabUrl = '${baseurl}zyyqjs/qjscasenote.do?emgSeq=' + emgSeq + '&cstNam=' + cstNam + '&pageFlg=2&th=' + new Date().getTime();
        } else if (_pageSrc === 'qjsCase') {
          openTabUrl = '${baseurl}zyyqjs/qjscasenote.do?emgSeq=' + emgSeq + '&cstNam=' + cstNam + '&zgcount=' + zgcount + '&pageFlg=${pageFlg}&th=' + new Date().getTime();
        } else if (_pageSrc === 'qjsCaseMz') {
          openTabUrl = '${baseurl}hzszyyjzmz/tomzblHome.do.do?emgSeq=' + emgSeq + '&cstNam=' + cstNam + '&zgcount=' + zgcount + '&mpi=' + mpi + '&requestSource=' + requestSource + '&jzxh=' + jzxh + '&th=' + new Date().getTime();
        } else if (_pageSrc === 'transManager') {
          openTabUrl = '${baseurl}cfxx/toTransManager.do?emgSeq=' + emgSeq + '&cstNam=' + cstNam + '&th=' + new Date().getTime();
        }
      }
      openTabUrl = encodeURI(openTabUrl);
      $('#rightIframe').attr('src', openTabUrl);
    }

    function calcBox (flg) {
      var _leftWth = 180;
      if (flg == 'hide') {
        _leftWth = 0;
      }
      if (flg == 'his') { // 历史病历会变宽一点
        _leftWth = 191;
      }
      if (flg == 'disease') { // 病程录列表会变宽一点
        _leftWth = 261;
      }
      var _width = $(window).width() - _leftWth, _height = $(window).height() - 34;
      $('.rightMainMsg').css({ 'width': _width + 'px' });
      $('.rightMainMsg').css({ 'height': _height + 'px'})
    }

    window.onresize = function () {
      var _getBoxDis = document.getElementsByClassName('leftMsg')[0].style.display,
          _getRecordBoxDis = document.getElementsByClassName('hisRecordMsg')[0].style.display,
          _getDiseaseBoxDis = document.getElementsByClassName('diseaseMsg')[0].style.display;
      if ((_getBoxDis == 'none' || _getBoxDis == '') && (_getRecordBoxDis == 'none' || _getRecordBoxDis == '') && (_getDiseaseBoxDis == 'none' || _getDiseaseBoxDis == '')) {
        calcBox('hide');
      }
      if ($('.patientListBtn').hasClass('active')) {
        calcBox();
        getLeftPatientList();
      }
      if ($('.historyRecordBtn').hasClass('active')) {
        calcBox('his');
        getHisRecord();
      }
      if ($('.diseaseListBtn').hasClass('active')) {
        calcBox('disease');
        getDiseaseRecord();
      }
    }
    var vm = avalon.define({
      $id: 'leftWrapMsg',
      patientMsg: {
        sqlDat: '',
        sqlStaStr: '',
        sqlStaCod: '',
        sqlDepName: '',
        sqlDes: '',
        bedNam: '',
        sqlSeq: '',
        firstsqlseq: '',
        cstNam: '',
        emgDepCod: '',
        vstCad: '',
        mpi: '',
        cstSexCod: '',
        cstAge: '',
        cstAgeCod: '',
        bedNum: '',
        jbzdDes: '',
        jbzdDesText: '',
        emgFkCod: '',
        zgcount: '',
        pageSrc: _pageSrc,
        jzxh: '', // 就诊次数
        requestSource: '', //HIS病历
        emgSeq: ''
      }
    })

    function reload () {
      if (_pageSrc === 'queryQjs') {
        if (document.getElementById("rightIframe").contentWindow.document.getElementById("rightFrame").contentWindow) {
          if (document.getElementById("rightIframe").contentWindow.document.getElementById("rightFrame").contentWindow.reload) {
            document.getElementById("rightIframe").contentWindow.document.getElementById("rightFrame").contentWindow.reload()
          }
        }
      }
    }
    
    function judgeIsDocEnd () {
      $('.onlyLinkSpan').hide();
      $('.onlyLink').css({'color': '#2a00ff', 'text-decoration': 'text-decoration', 'cursor': 'pointer', 'margin-left': '4px'})
      if (_pageSrc === 'queryQjs' || _pageSrc === 'transManager') {
        $('.onlyDocEnd').hide();
        $('.outcomeTitle').css({ 'cursor': 'pointer', 'text-decoration' : 'text-decoration' }); // 转归标题能点击
        $('#' + _pageSrc + 'Link').show();
      } else {
        $('.outcomeTitle').css({ 'cursor': 'text', 'text-decoration': 'none' }); // 转归标题文本提示
        if (_pageSrc === 'qjsCaseCheck') {
          $('.spanBtn').hide();
          $('.emgFkCod').show();
        } else {
          $('.onlyDocEnd').show();
        }
        if (_pageSrc === 'qjsCase') {
          var _selectedTabFirst = parent.$("#tabs .tabs-selected .tabs-title").text();
          _selectedTabFirst = _selectedTabFirst.substr(0, 2);
          if (_selectedTabFirst != '日志') {
            $('#' + _pageSrc + 'Link').show();
          }
        }
      }
      // 门诊时 在床等checkbox和患者列表 隐藏
      if (_pageSrc === 'qjsCaseMz') {
        $('.queryNormalBox').hide();
        $('.queryMzBox').show();
        $('.patientListBtn').hide();
        $('.writeLqRecordBtn').show();
      } else {
        $('.queryMzBox').hide();
        $('.queryNormalBox').show();
        $('.patientListBtn').show();
        $('.writeLqRecordBtn').hide();
      }
      if (_pageSrc === 'qjsCaseCheck') {
        $('.visitNum').hide() // 归档病历不显示
      } else {
        $('.visitNum').show();
      }
      // 留抢病历|门诊 增加病程录列表
      if (_pageSrc === 'qjsCase' || _pageSrc === 'qjsCaseMz') {
        $('.onlyQjsDocEnd').show();
      } else {
        $('.onlyQjsDocEnd').hide();
      }
      // 日志功能时 隐藏左边菜单--方式打开bug
      if (_pageSrc === 'qjsCase') {
        var _selectedTabFirst = parent.$("#tabs .tabs-selected .tabs-title").text();
        _selectedTabFirst = _selectedTabFirst.substr(0, 2);
        if (_selectedTabFirst == '日志') {
          $('.spanBtn').hide();
        }
      }
    }
    
    function mindingClock (_mpi) {
      publicFun.httpServer({ url: '${baseurl}hzszyyjzmz/findEmgTotalByMpi.do', isNoLoad: true}, { 'hspemginfCustom.mpi': _mpi}, function (data) {
        if (data && data.msg && data.msg.total) {
          var _total = data.msg.total;
          if (_total >= 2) { // 如果48小时内二次及以上就诊
            if (_pageSrc === 'qjsCaseCheck') {
              $('.mindClock').hide(); // 归档病历不显示
            } else {
              $('.mindClock').show(); // 护理记录单和留抢病历显示
            }
          } else {
            $('.mindClock').hide();
          }
        }
      })
    }
    
    // 输液管理跳转去护理记录
    function toQisRecord () {
      var _selectedTab = parent.$("#tabs .tabs-selected .tabs-title").text();
      _selectedTab = _selectedTab.substr(0, _selectedTab.length - 4)
      var openTabUrl = '${baseurl}zyyxtpg/toLeftWrap.do?emgSeq=' + _emgSeq + '&cstNam=' + vm.patientMsg.cstNam + '&zgcount=' +  + vm.patientMsg.zgcount + '&pageSrc=queryQjs&th=' + new Date().getTime();
      parent.opentabwindow( _selectedTab + '护理记录', openTabUrl, '0');
    }
    
    // 护理记录跳转去输液管理
    function toTransManagerRecord () {
      var _selectedTab = parent.$("#tabs .tabs-selected .tabs-title").text();
      _selectedTab = _selectedTab.substr(0, _selectedTab.length - 4)
      var openTabUrl = '${baseurl}zyyxtpg/toLeftWrap.do?emgSeq=' + _emgSeq + '&cstNam=' + vm.patientMsg.cstNam + '&zgcount=' + vm.patientMsg.zgcount + '&pageSrc=transManager&th=' + new Date().getTime();
      parent.opentabwindow(_selectedTab + '输液管理', openTabUrl, '0');
    }
    
    // 跳到修改页面
    function toEditMsg () {
      parent.opentabwindow(vm.patientMsg.cstNam + '-修改', "${baseurl}hzszyyemg/xgjz.do?emgSeq=" + _emgSeq + "&th=" + new Date().getTime());
    }

    // 留抢病历新增日志功能--点击到新的tab页可以查看之前写的数据信息
    function toDailyRecord () {
      var openTabUrl = '${baseurl}zyyxtpg/toLeftWrap.do?emgSeq=' + _emgSeq + '&cstNam=' + vm.patientMsg.cstNam  + '&zgcount=' + vm.patientMsg.zgcount + '&pageSrc=qjsCase&pageFlg=dailyRecord&th=' + new Date().getTime();
      parent.opentabwindow('日志-' + vm.patientMsg.cstNam + '-留抢病历记录', openTabUrl, '0');
    }
    
    // 书写留抢病历
    function writeLqRecord () {
      var postObj = vm.patientMsg;
      publicFun.httpServer({url: '${baseurl}hzszyyjzmz/isRetention.do'}, {mpi: postObj.mpi, jzxh: postObj.jzxh}, function (res) {
        if (res.resultInfo.type == 1) {
          var info = res.resultInfo.sysdata, _data = info.status;
          if (_data == 'prompt') {
            publicFun.alert('该病人未预检或护士尚未关联挂号信息，需护士完善数据后方才能书写留抢病历')
          } else if (_data == 'yes') { // 跳转 => 书写留抢病历
            setBasicMsg(info.hspemginfCustom);
            _pageSrc = 'qjsCase';
            var openTabUrl = '${baseurl}zyyqjs/qjscasenote.do?emgSeq=' + info.hspemginfCustom.emgSeq + '&cstNam=' + info.hspemginfCustom.cstNam + '&zgcount=${zgcount}&pageFlg=${pageFlg}&th=' + new Date().getTime();
            openTabUrl = encodeURI(openTabUrl);
            $('#rightIframe').attr('src', openTabUrl);
            var _bedNum = '';
            if (info.hspemginfCustom.bedNum != null) {
              _bedNum = info.hspemginfCustom.bedNum + '-'
            }
            parent.$("#tabs .tabs-selected .tabs-title").text(_bedNum + info.hspemginfCustom.cstNam + '-留抢病历记录');
            judgeIsDocEnd();
            vm.patientMsg.pageSrc = _pageSrc;	
          } else if (_data == 'no') {
            publicFun.alert('当前患者为诊间就诊患者，需护士转归到留抢状态后，方能书写留抢病历')
          }
        }
      })
    }

    // 书写门诊病历 --- 回到最开始的门诊病历去
    function writeMzRecord () {
      var currTab = parent.$("#tabs").tabs('getSelected');
      var _currentSrc = currTab[0].childNodes[0].src;
      parent.$("#tabs").tabs('update', { tab: currTab, options: { content: window.top.createFrame(_currentSrc, '0') } });
    }

    // 切换数据 上一条数据 下一条数据时
    function toPreOne (checkedMsg) {
      var leftBedNam = '', _title = '';
      if (checkedMsg.bedNum != null) {
        leftBedNam = checkedMsg.bedNum + '-';
      }
      if (_pageSrc === 'queryQjs') {
        _title = leftBedNam + checkedMsg.cstNam + '-' + '护理记录';
      } else {
        if (_pageSrc === 'qjsCaseCheck') {
          _title = checkedMsg.cstNam + '-' + '留抢病历审核';
        } else if (_pageSrc === 'qjsCase') {
          _title = leftBedNam + checkedMsg.cstNam + '-' + '留抢病历记录';
        } else if (_pageSrc === 'qjsCaseMz') {
          _title = checkedMsg.cstNam + '-' + '门诊病历记录';
        } else if (_pageSrc === 'transManager') {
          _title = checkedMsg.cstNam + '-' + '输液管理';
        }
      }
      var openTabUrl = '${baseurl}zyyxtpg/toLeftWrap.do?emgSeq=' + checkedMsg.emgSeq + '&cstNam=' + checkedMsg.cstNam + '&zgcount=' + checkedMsg.zgcount + '&pageSrc=' + _pageSrc + '&th=' + new Date().getTime();
      var subtitle = parent.$("#tabs").tabs('getSelected').title;
      // 0 是刷新局部； 1 是刷新页面； 3 是混合[已去掉]
      // 遇到同名 tab 时刷新当前 tab
      window.top.$('#tabs').tabs('add', {
        title: _title,
        content: window.top.createFrame(openTabUrl, '0'),
        closable: true,
        iconCls: 'icon '
      });
      parent.$('#tabs').tabs('close', subtitle);
    }

    $(function () {
      // setTime();
      getFirstPatientMsg();
      toIframe()
      // getLeftPatientList()
    })
  </script>
</body>

</html>