<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/base/tag.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
  <%@ include file="/WEB-INF/jsp/base/common_css.jsp"%>
  <link rel="stylesheet" type="text/css" href="${baseurl}css/hems/global.css?090">
  <link rel="stylesheet" type="text/css" href="${baseurl}css/common/querylist.css" />
  <%@ include file="/WEB-INF/jsp/base/common_js.jsp"%>
  <title>病种统计患者明细列表</title>
  <script type="text/javascript">
  	var pageName = '${pageName}';
  	var datagridUrl = '${baseurl}report/queryjzhztjlb_result.do';
  	var exportUrl = '${baseurl}report/jzhztjlbSubmit.do';
  </script>
</head>

<body class="queryjzjl">
  <script type="text/javascript">
    //enter按键默认触发查询
    $(document).keydown(function (event) {
      switch (event.keyCode) {
        case 13:
          getDataGrid();
      }
    });

    function reload() {
      $('#recordList').datagrid('reload');
    }

    //加载datagrid
    $(function () {
      setTime('day','yyyy/MM/dd');
      chooseDate();
      changeUrl();
      getDataGrid();
    })

    function getDataGrid() {
      setType();
      var _param = generateParam();
      var height = 0.975 * ($("#tabs", parent.document).height() - 36 - 16);
      $("#recordList").height(height);
      $('#recordList').datagrid({
        nowrap: true,
        striped: true,
        singleSelect: true,
        url: datagridUrl,
        idField: 'emgSeq',
        loadFilter: function (data) {
          if (data.resultInfo && data.resultInfo.messageCode == '109') {
            message_alert(data, function () {
              window.location.href = "${baseurl}first.do";
            });
          }
          return data;
        },
        queryParams: _param,
        loadMsg: '',
        columns: getCol(),
        pagination: true,
        rownumbers: true,
        pageList: [20, 30, 50],
        toolbar: [{
          id: '',
          text: '导出',
          iconCls: 'icon-redo',
          handler: function () {
            _confirm('确定导出吗？', null, function () {
              publicFun.httpServer({ url: exportUrl }, _param, function (res) {
                message_alert(res);
              })
            });
          }
        }]
      });
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
        }, {
          field: 'czjsName',
          title: '操作技术',
          sortable: true,
          width: getWidth(0.12)
        }, {
          field: 'czysName',
          title: '操作医生',
          sortable: true,
          width: getWidth(0.03)
        }, {
          field: 'emgDat',
          title: '收治日期',
          sortable: true,
          width: getWidth(0.08),
          formatter: function (value, row, index) {
            return value ? publicFun.timeFormat(value, 'yyyy/MM/dd hh:mm:ss') : ''
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
          field: 'emgFkName',
          title: '分科',
          width: getWidth(0.05),
          sortable: true
        }, {
          field: 'docDat',
          title: '就诊时间',
          width: getWidth(0.08),
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
          field: 'cstDspCodNameNew',
          title: '转归去向',
          sortable: true,
          width: getWidth(0.03),
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
          field: 'abnDoctor',
          title: '120医生',
          sortable: true,
          width: getWidth(0.04)
        }, {
          field: 'abnDriver',
          title: '120驾驶员',
          sortable: true,
          width: getWidth(0.04)
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
        }]
      ];
      return columns_v;
    }


    function generateParam() {
      var _lqVal = '', _hosVal = '',_deadVal = '';
      var scoIdArr = '${scoIdArr}';
      var scoIdType = '${scoIdType}';
      if ($('#lqCount').attr('checked')) {
        _lqVal = '0';
      }
      if ($('#notLqCount').attr('checked')) {
        _lqVal = '1';
      }
      if ($('#hos').attr('checked')) {
        _hosVal = '0';
      }
      if ($('#transfer').attr('checked')) {
        _hosVal = '1';
      }
      if ($('#dead').attr('checked')) {
        _deadVal = '0';
      }
      var queryType = $("#chooseType").val();
      var startdate = $("#startdate_range").val();
      var enddate = $("#enddate").val();
      var param = {
      	'querytype':queryType,
        'hspemginfCustom.startdate': startdate,
        'hspemginfCustom.enddate': enddate,
        'hspemginfCustom.cstNam': $('#emgText1').val(),
        'hspemginfCustom.mpi': $('#emgText2').val(),
        'hspemginfCustom.scoIdArr': scoIdArr,
        'hspemginfCustom.czjsName': $('#emgText3').val(),
        'hspemginfCustom.czysName': $('#emgText4').val()
      }
      return param;
    }
    function getWidth(proportion) {
      var width = $("body").width();
      return Math.round(proportion * width);
    }

	/**
	  *初始化时间
	  */
    function setTime(type,format) {
     var today = publicFun.timeFormat(new Date(), format);
     if(pageName=='patientDetail' || pageName=='bqtjhzmx' || pageName == 'jzhzmx' || pageName == 'zyhzmx' || pageName == 'gjhzblhzlb' 
     || pageName == 'gjhzswlhzlb' || pageName == '120patient' || pageName == 'hszbztjhzmx' || pageName == 'bzjczjstj'){
	  	setTimeForDetail(today);
	  	setOptionForList();
	  }else{
	  	$("#startdate_" + type).val(today);
      	$("#enddate").val(today);
	  }
    };

	/**
	  *患者列表选项卡初始化
	  */
	function setOptionForList(){
		var pageName ='${pageName}'
		var emgDepCod ='${emgDepCod}'
		var swFlag ='${swFlag}'
		if(pageName == 'gjhzblhzlb'){
			$("#emgDepCod").val(emgDepCod)
		}else if(pageName == 'gjhzswlhzlb'){
			$('#dead').prop("checked", true);
		}
	}

	/**
	  *患者详情时间初始化
	  */
	function setTimeForDetail(today){
    	var queryType ='${querytype}'
    	var pageName ='${pageName}'
	  	if(queryType=='day'){
			type = 'day';
			format = 'yyyy/MM/dd';
	  	}else if(queryType == 'month'){
	  		type = 'month';
			format = 'yyyy/MM';
	  	}else if(queryType == 'range_month'){
	  		type = 'range';
	  		format = 'yyyy/MM';
	  	}else if(queryType == 'range'){
	  		type = 'range';
	  		format = 'yyyy/MM/dd';
	  	}else{
	  		type = 'range';
	  		format = 'yyyy';
	  	}
	  	
	  	$("#chooseType").val(type);
	  	if (type == 'range') {
	  		if(queryType == 'range_month'){
        		$(".Wdate").css({ "display": "none" });
        		$("#startdate_month").css({ "display": "block" });
        		$("#enddate_month").css({ "display": "block" });
        		$("#rangeMonthDiv").css({ "display": "block" });
        	}else{
        		$(".Wdate").css({ "display": "none" });
          		$("#startdate_" + type).css({ "display": "block" });
          		$("#enddate").css({ "display": "block" });
				$("#rangeDiv").css({ "display": "block" });
        	}
        } else  {
          $(".Wdate").css({ "display": "none" });
          $("#startdate_" + type).css({ "display": "block" });
          $("#rangeDiv").css({ "display": "none" });
        }
        if(queryType== 'year' || queryType =='halfyear' || queryType == 'range'){
        	if(pageName == 'gjhzblhzlb' || pageName == 'bzjczjstj'){
      			$("#startdate_" + type).val('${startdate}');
      			$("#enddate").val('${enddate}');
      		}else if(pageName == 'gjhzswlhzlb'){
      			$("#startdate_" + type).val('${startdate}');
      			$("#enddate").val(publicFun.timeFormat(getLastOfMonth(new Date('${enddate}')), 'yyyy/MM/dd'));			
      		}else if(pageName == 'hszbztjhzmx'){
      			$("#startdate_" + type).val(publicFun.timeFormat((new Date('${startdate}')), 'yyyy/MM/dd'));
      			$("#enddate").val(publicFun.timeFormat((new Date('${enddate}')), 'yyyy/MM/dd'));	
      		}else{
	      		today = publicFun.timeFormat('${startdate}', format);
	       		today += "/01/01";
	       		var enddate = publicFun.timeFormat('${startdate}', format);
	       		enddate += "/12/31" 
	        	$("#startdate_" + type).val(today);
	      		$("#enddate").val(enddate);
      		}		
        }else if(queryType== 'range_month'){
        	//转院汇总统计 患者详情
        	today = publicFun.timeFormat('${startdate}', format);
        	var enddate = publicFun.timeFormat('${enddate}', format);
	  		$("#startdate_month").val(today);
      		$("#enddate_month").val(enddate);
        }else{
        	today = publicFun.timeFormat('${startdate}', format);
	  		$("#startdate_" + type).val(today);
      		$("#enddate").val(today);
        }
    }

	//获取所选月份的最后一天
	function getLastOfMonth(endDate){
	     var month=endDate.getMonth();
	     var nextMonth=++month;
	     var nextMonthFirstDay=new Date(endDate.getFullYear(),nextMonth,1);
	     var oneDay=1000*60*60*24;
	     return new Date(nextMonthFirstDay-oneDay);
	}
	
    function setType() {
      var _codVal = $('#queryText').val(),
        _selVal = $('#typeVal').val();
      $('.queryEmg').val('');
      $('#emgText' + _selVal).val(_codVal);
    }

    function setSingleCheck(idName, className) {
      if ($('#' + idName)[0].checked) {
        $('.' + className).attr('checked', false);
        $('#' + idName).attr('checked', true);
      }
    }
    
    /**
      *时间类型切换
      */
    function chooseDate() {
      $("#chooseType").change(function () {
        var queryType = $("#chooseType").val();
        if (queryType == 'range') {
			if(pageName == 'zyhzmx'){
        		//转院汇总统计 患者详情
        		$(".Wdate").css({ "display": "none" });
        		$("#startdate_month").css({ "display": "block" });
        		$("#enddate_month").css({ "display": "block" });
        		$("#rangeMonthDiv").css({ "display": "block" });
			}else{
				$(".Wdate").css({ "display": "none" });
				$("#startdate_" + queryType).css({ "display": "block" });
          		$("#enddate").css({ "display": "block" });
          		$("#rangeDiv").css({ "display": "block" });
			}
        } else {
          $(".Wdate").css({ "display": "none" });
          $("#startdate_" + queryType).css({ "display": "block" });
          $("#rangeDiv").css({ "display": "none" });
          $("#rangeMonthDiv").css({ "display": "none" });
        }
        var format = $("#startdate_" + queryType).attr("format");
        pageName = '';
        setTime(queryType, format);
      });
    }
    
    /**
      *切换URl
      */
    function changeUrl(){
    	if(pageName == 'bzjczjstj'){
    		datagridUrl = '${baseurl}zyyreport/getczjstjmx.do';
    		exportUrl = '${baseurl}zyyreport/czjshzlbExport.do';
    	}
    }
  </script>
  <form>
    <div class="form clr">
      <p class="form-text">日期：</p>
      <input type="hidden" id="startdate" name="startdate">
      <input type="text" style="display: none;" class="input-date Wdate" format="yyyy/MM/dd" id="startdate_range" onfocus="WdatePicker({dateFmt:'yyyy/MM/dd'})">
      <div id="rangeDiv" style="display: none;">
        <p class="form-text">-</p>
        <input type="text" style="display: none;" class="input-date Wdate" id="enddate" name="enddate" onfocus="WdatePicker({dateFmt:'yyyy/MM/dd'})">
      </div>
      <div id="rangeMonthDiv" style="display: none">
      	<p class="form-text">-</p>
      	<input type="text" style="display: none;" class="input-date Wate" id="enddate_month" onfocus="WdatePicker({dateFmt:'yyyy/MM'})">
      </div>
      <select onchange="setType()" id="typeVal">
        <option value="1">患者姓名</option>
        <option value="2">病历号</option>
      </select>
      <input id="queryText" type="text" class="input-wth" onchange="getDataGrid()">
      <p class="form-text">操作技术：</p>
      <input id="emgText3" type="text" class="input-wth" onchange="getDataGrid()">
      <p class="form-text">操作医生：</p>
      <input id="emgText4" type="text" class="input-wth" onchange="getDataGrid()">
      <input id="emgText1" type="text" class="queryEmg hidden">
      <input id="emgText2" type="text" class="queryEmg hidden">
      
      <a href="#" class="easyui-linkbutton" iconCls="icon-search" id="btn" onclick="getDataGrid()">查询</a>
    </div>
    <div class="m-l2 queryTabs">
      <table id="recordList"></table>
    </div>
  </form>
</body>

</html>