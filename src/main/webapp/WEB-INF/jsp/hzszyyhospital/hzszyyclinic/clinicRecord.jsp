<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/base/tag.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
  <%@ include file="/WEB-INF/jsp/base/common_css.jsp"%>
  <link rel="stylesheet" type="text/css" href="${baseurl}css/hems/global.css?v=${versionDay}">
  <link rel="stylesheet" type="text/css" href="${baseurl}css/common/querylist.css?v=${versionDay}" />
  <%@ include file="/WEB-INF/jsp/base/common_js.jsp"%>
  <script src="${baseurl}js/subpageJs/precheck/dkAndJhy.js" type="text/javascript"></script>
  <script src="${baseurl}lib/avalon1.4.8/avalon.js" type="text/javascript" charset="UTF-8"></script>
  <title>急诊门诊病历</title>
  <style type="text/css">
  	.queryTabs .datagrid-body, .norowTab .datagrid-body, .datagrid-body {
	    overflow-x: auto;
	}
  </style>
</head>

<body class="queryjzjl">
  <script type="text/javascript">
    var _baseUrl = '${baseurl}';

    var vm = avalon.define({
      $id: 'jzmzbl',
      patientMsg: {
        emgDat:'',
        vstCad:'',
        mpi: '',
      },
      getList:{
        isJzmzTypeList:[{infocode:'1',info:'我的患者'}]
      },

      radioclick:function(name,idx){
        var list = [];
        list = vm.getList[name + 'List'];
        var currentChecked = list[idx]['checked'];
        $.each(list, function (index, value) {
          value['checked'] = false;
        });
        list[idx]['checked'] = !currentChecked;
        if (list[idx]['checked'] == true) {
          vm.patientMsg[name] = list[idx]['infocode'];
        } else {
          vm.patientMsg[name] = '';
        }
        getDataGrid();
      }
    })

    function setType() {
      var _codVal = $('#queryText').val(),
        _selVal = $('#typeVal').val();
      $('.queryEmg').val('');
      $('#emgText' + _selVal).val(_codVal);
    }

    function setTime() {
      var _today = publicFun.timeFormat(new Date(), 'yyyy/MM/dd')
      $("#emg_startDate").val(_today);
      $("#emg_endDate").val(_today);
    };

    function generateParam () {
      var param = {
        'hspemginfCustom.startdate': $('#emg_startDate').val(),
        'hspemginfCustom.enddate': $('#emg_endDate').val(),
        'hspemginfCustom.cstNam': $('#emgText1').val(),
        // 'hspemginfCustom.vstCad': $('#emgText2').val(),
        'hspemginfCustom.preDgnCod': $('#emgText3').val(),
        'hspemginfCustom.mpi': $('#emgText4').val(),
        'hspemginfCustom.emgFkCod':$('#emgFkCod').val(),
        'isJzmzType':vm.patientMsg.isJzmzType,
        'linked':$('#ghInput').attr('checked') ? '0' : '1' //挂号关联
      };
      return param;
    }

    //查询方法
    function queryTab() {
      getDataGrid();
    }

    function getWidth(proportion) {
      var width = $("body").width()*0.95;
      return Math.round(proportion * width);
    }

    function getCol() {
      var columns_v = [
        [{
          field: 'emgJjd',
          title: '',
          width: getWidth(0.02),
          formatter: function (value, row, index) {
            return " ";
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
        },  {
          field: 'emgFkName',
          title: '分科',
          width: getWidth(0.04),
          sortable: true
        },{
          field: 'ghsjStr',
          title: '挂号时间',
          width: getWidth(0.05),
          sortable: true
        },{
          field: 'emgDat',
          title: '收治日期',
          sortable: true,
          width: getWidth(0.06),
          formatter: function (value, row, index) {
            return value ? publicFun.timeFormat(value, 'yyyy-MM-dd hh:mm:ss') : ''
          }
        }, 
        // {
        //   field: 'vstCad',
        //   title: '门诊号码',
        //   sortable: true,
        //   width: getWidth(0.08)
        // },
        {
          field: 'mpi',
          title: '病历号',
          sortable: true,
          width: getWidth(0.05)
        }, 
        {
          field: 'cstNam',
          title: '病人姓名',
          sortable: true,
          width: getWidth(0.04),
          formatter: function (value, row, index) {
            // 预检是留抢
            if (row.cstDspCodNew == '6') {
              return value + '<span style="color: red; margin-left: 2px">留</span>'
            } else {
              return value;
            }
          }
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
          field: 'preDgnCod',
          title: '主诉症状',
          sortable: true,
          width: getWidth(0.05)
        }, {
          field: 'emgDepCod',
          title: '急诊分级',
          sortable: true,
          width: getWidth(0.04),
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
          sortable: true,
          width: getWidth(0.04)
        }, {
          field: 'docDat',
          title: '就诊时间',
          width: getWidth(0.06),
          sortable: true,
          formatter: function (value, row, index) {
            if (value == '-28800000') {
              return ''
            } else {
              return value ? publicFun.timeFormat(value, 'yyyy-MM-dd hh:mm:ss') : ''
            }
          }
        }, {
          field: 'jzxh',
          title: '就诊次数',
          width: getWidth(0.03),
          sortable: true
        }, {
          field: 'sqlDctNbr',
          title: '首诊医生',
          width: getWidth(0.04),
          sortable: true
        }, {
          field: 'jbzdDes',
          title: '诊断',
          width: getWidth(0.06),
          sortable: true
        }, {
          field: 'ghbz',
          title: '退挂号',
          width: getWidth(0.03),
          sortable: true,
          formatter: function (value, row, index) {
            if (value == 2) {
              return '<span style="color: red;">已退号</span>'
            } else {
              return ''
            }
          }
        }, {
          field: 'cstDspCodNameNew',
          title: '转归去向',
          sortable: true,
          width: getWidth(0.04),
          formatter: function (value, row, index) {
            //如果hsp_sql_inf只关联了1条
            if (row.firstsqlseq ==row.sqlSeq) {
              return "";
            } else if (row.cstDspCodNew == '2') { //如果是住院就展示科室，否则就展示转归状态
              if (row.cstDspCod == '诊间就诊') { // 诊间就诊的病人转归去住院，医生不填写科室的，此时住院两个字标红
                if (!row.cstDepCodNew) { // 无科室时
                  return '<span style=\"color: red\">住院</span>';
                } else {
                  return row.cstDepCodNew;
                }
              } else {
                return row.cstDepCodNew;
              }
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
          width: getWidth(0.06),
          formatter: function (value, row, index) {
            //如果hsp_sql_inf只关联了1条
            if (row.firstsqlseq ==row.sqlSeq) {
              return "";
            } else {
              return value ? value.replace(/\//g, '-') : ''
            }
          }
        }, {
          field: 'arvChlCod',
          title: '送入方式',
          sortable: true,
          width: getWidth(0.04)

        }, {
          field: 'abnDoctor',
          title: '120医生',
          sortable: true,
          width: getWidth(0.03)

        }, {
          field: 'abnDriver',
          title: '120驾驶员',
          sortable: true,
          width: getWidth(0.05)

        }, {
          field: 'grnChl',
          title: '绿通',
          sortable: true,
          width: getWidth(0.02)
        }, {
          field: 'preUsrNam',
          title: '分诊护士',
          sortable: true,
          width: getWidth(0.04)
        }, {
          field: 'operation',
          title: '',
          width: getWidth(0.03),
          formatter: function (value, row, index) {
            return "<span class='url-link'><a href=javascript:openTimeline('" + row.cstNam + "','" + row.emgSeq + "')>时间轴</a></span>";
          }
        }]
      ];
      return columns_v;
    }

    function openTimeline(cstNam, emgSeq) {
      var openModalWindowUrl = '${baseurl}hzszyyemg/timershaft.do?emgSeq=' + emgSeq;
      createmodalwindow(cstNam + "-" + '时间轴', 800, 400, openModalWindowUrl);
    }

    function getDataGrid() {
      setType();
      var toolbar_v;
      var height = 0.975 * ($("#tabs", parent.document).height() - 36 - 16);
      $("#recordList").height(height);
      publicFun.ajaxVal('${moduleid}', toolbar_v, callBack);
      function callBack(toolbar_v) {
        $('#recordList').datagrid({
          nowrap: false,
          striped: true,
          singleSelect: true,
          url: '${baseurl}hzszyyjzmz/jzmzquery_result.do',
          idField: 'emgSeq',
          loadFilter: function (data) {
            if (data.resultInfo && data.resultInfo.messageCode == '109') {
              message_alert(data, function () {
                window.location.href = "${baseurl}/first.do";
              });
            }
            return data;
          },
          queryParams: generateParam(),
          loadMsg: '',
          columns: getCol(),
          pagination: true,
          rownumbers: true,
          pageList: [30, 20, 50],
          toolbar: toolbar_v,
          onDblClickRow: function (rowIndex, rowData) {
          	if(checkLinked(rowData.jzxh)){
          		var pageSrc = 'qjsCaseMz';
	            var title = '-门诊病历记录'
	            //lqFlag 大于 0 时，说明该患者有过留抢，跳到留抢病历
	            if(rowData.lqFlag > 0){
	            	pageSrc = 'qjsCase';
	            	title = '-留抢病历记录'
	            }
          		var openTabUrl = '${baseurl}zyyxtpg/toLeftWrap.do?emgSeq=' + rowData.emgSeq + '&cstNam=' + rowData.cstNam + '&zgcount=' + rowData.zgcount + '&pageSrc=' + pageSrc + '&th=' + new Date().getTime();
            	parent.opentabwindow(rowData.cstNam + title, openTabUrl, '0');
          	}else{
          		publicFun.alert('该患者未关联挂号，无法书写病历。')
          	}
          }
        });
      }
    }
    
    // HIS点击“书写病历”
    // 提醒“该病人未预检，确定书写病历吗？”
    function isTipBox () {
      if ('HIS_NO_PATIENT' == '${requestSource}') {
        _confirm('该病人未预检，确定书写病历吗？', null, function () {
        	var openTabUrl = '${baseurl}hisMedical/toLeftWrap_HIS.do?cstNam=${cstNam}&pageSrc=qjsCaseMz&requestSource=${requestSource}&mpi=${mpi}&emgSeq=${emgSeq}&jzxh=${jzxh}' + '&th=' + new Date().getTime();
            parent.opentabwindow('${cstNam}-门诊病历记录', openTabUrl, '0');
        });
      }
    }

    //加载datagrid
    $(function () {
      setTime();
      getDataGrid();
      isTipBox();
    })

    function getCadMsg(){
      $('#typeVal').val('2')
      $('.queryEmg').val('');
      getVisitingMsg();
      $('#queryText' ).val(vm.patientMsg.vstCad);
      if(vm.patientMsg.vstCad != ''){
        getDataGrid()
      }
    }

    function cmdeditjzzyy(){
      var row = $('#recordList').datagrid('getSelected');
      if (GridUtils.checkChecked(row)) {
       if(checkLinked(row.jzxh)){
            var pageSrc = 'qjsCaseMz';
            var title = '-门诊病历记录'
            //lqFlag 大于 0 时，说明该患者有过留抢，跳到留抢病历
            if(row.lqFlag > 0){
            	pageSrc = 'qjsCase';
            	title = '-留抢病历记录'
            }
          	var openTabUrl = '${baseurl}zyyxtpg/toLeftWrap.do?emgSeq=' + row.emgSeq + '&cstNam=' + row.cstNam + '&zgcount=' + row.zgcount + '&pageSrc=' + pageSrc + '&th=' + new Date().getTime();
        	parent.opentabwindow(row.cstNam + title, openTabUrl, '0');
       }else{
            publicFun.alert('该患者未关联挂号，无法书写病历。')
       }
      }
    }

    //患者详情
    function cmdqueryhzxq() {
      var row = $('#recordList').datagrid('getSelected');
      if (GridUtils.checkChecked(row)) {
        parent.opentabwindow(row.cstNam + "-" + '患者详情', "${baseurl}hzszyyemg/queryhzxq.do?emgSeq=" + row.emgSeq + '&xxFlag=0' + "&th=" + new Date().getTime());
      }
    }

	//患者时候挂号关联
	function checkLinked(jzxh){
		//jzxh不为空说明 已挂号关联
		if(jzxh != '' && jzxh != null){
			return true;
		}else{
			return false;		
		}
	}
	
	
    function setEmgFcCod(){
      getDataGrid();
    }
  </script>

<OBJECT id="smkOcx" classid="clsid:E691A607-D1D2-48A7-A0EC-09511883A445" width=0px height=0px align="center" hspace="0"
vspace="0"></OBJECT>
<form ms-controller="jzmzbl">
<div class="form clr">
  <p class="form-text">日期：</p>
  <input class="small-date Wdate" id="emg_startDate" type="text" onclick="WdatePicker({dateFmt:'yyyy/MM/dd',isShowClear:false,readOnly:true})">
  <p class="form-text">-</p>
  <input class="small-date Wdate" id="emg_endDate" type="text" onclick="WdatePicker({dateFmt:'yyyy/MM/dd',isShowClear:false,readOnly:true})">
  <select onchange="setType()" id="typeVal">
    <!-- <option value="2">就诊卡</option> -->
    <option value="1">患者姓名</option>
    <option value="4">病历号</option>
    <option value="3">主诉症状</option>
  </select>
  <input id="queryText" type="text" class="input-wth">
  <input id="emgText1" type="text" class="queryEmg hidden">
  <input id="emgText2" type="text" class="queryEmg hidden" ms-duplex-string="patientMsg.vstCad">
  <input id="emgText3" type="text" class="queryEmg hidden">
  <input id="emgText4" type="text" class="queryEmg hidden">
  <p class="form-text">急诊科室：</p>
  <select id='emgFkCod' onchange="setEmgFcCod()">
     <option value=""></option>
      <c:forEach items="${jzkscompctlList}" var="value">
        <c:if test="${value.comno eq dstuser.emgsysid}">
            <option value="${value.comno}" selected="selected">${value.comcname}</option>
        </c:if>
          <option value="${value.comno}">${value.comcname}</option>
      </c:forEach>
  </select>
   <p class="form-text">
  	<label ms-repeat="getList.isJzmzTypeList" ms-attr-for="isJzmzType{{el.infocode}}">
      <input ms-attr-id="isJzmzType{{el.infocode}}" type="checkbox" ms-attr-checked="el.checked" ms-click="radioclick('isJzmzType',$index)"> {{el.info}}
  	</label>
    <input id="ghInput" type="checkbox" onclick="queryTab()" checked>
    <label for="ghInput">已关联挂号</label>
  </p>  
  <a href="#" class="easyui-linkbutton" iconCls="icon-search" id="btn" onclick="queryTab()">查询</a>
</div>
<div class="m-l2 queryTabs" >
  <table id="recordList"></table>
</div>

</form>
</body>

</html>