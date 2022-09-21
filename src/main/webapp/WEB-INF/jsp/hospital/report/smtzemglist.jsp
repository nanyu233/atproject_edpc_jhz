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
  <title>急诊患者统计列表报表</title>
  <script type="text/javascript">
  	var pageName = '${pageName}';
  	var datagridUrl = '';
  	var exportUrl = '';
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
      setTime();
      changeUrl();
      getDataGrid();
    })

    function getDataGrid() {
      var _param = generateParam();
      var height = 0.975 * ($("#tabs", parent.document).height() - 36 - 16);
      $("#recordList").height(height);
      $('#recordList').datagrid({
        nowrap: true,
        striped: true,
        singleSelect: true,
        url: datagridUrl,
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
        columns: getColumns_emglist(),
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

    function getColumns_emglist() {
            var columns_v = [
                [{
                	field: 'emgDat',
                    title: '预检时间',
                    formatter: function(value, row, index) {
                    	return value ? publicFun.timeFormat(value, "yyyy/MM/dd hh:mm") : ""
                    },
                    width: getWidth(0.1)
                }, {
                	field: 'mpi',
                    title: '病历号',
                    width: getWidth(0.1)
                }, {
                	field: 'cstNam',
                    title: '姓名',
                    width: getWidth(0.1)
                }, {
                	field: 'tmpNbr',
                	title: '体温',
                	width: getWidth(0.1)
                }, {
                	field: 'hrtRte',
                	title: '心率',
                	width: getWidth(0.1)
                }, {
                	field: 'breNbr',
                	title: '呼吸',
                	width: getWidth(0.1)
                }, {
                	field: 'sbpUpNbr',
                	title: '收缩压',
                	width: getWidth(0.1)
                }, {
                	field: 'sbpDownNbr',
                	title: '舒张压',
                	width: getWidth(0.1)
                }, {
                	field: 'oxyNbr',
                	title: '血氧饱和度',
                	width: getWidth(0.1)
                }]
            ];
            return columns_v;
		}


	function setTime() {
		var startdate = publicFun.timeFormat(dateToGMT('${startdate}'), "yyyy/MM/dd hh:mm:ss");
	    var enddate = publicFun.timeFormat(dateToGMT('${enddate}'), "yyyy/MM/dd hh:mm:ss");
	    $("#startdate").val(startdate);
	    $("#enddate").val(enddate);
	}

	function dateToGMT(strDate){
        var dateStr = strDate.split(" ");  
        var strGMT = dateStr[0]+" "+dateStr[1]+" "+dateStr[2]+" "+dateStr[5]+" "+dateStr[3]+" GMT+0800";  
        var date = new Date(Date.parse(strGMT));
        return date;
    }
	
    function generateParam() {
      var startdate = $("#startdate").val();
      var enddate = $("#enddate").val();
      var emgFkCod = $("#emgFkCod").val();
      var param = {
        'startdate': startdate,
        'enddate': enddate,
        'emgFkCod':emgFkCod,
    	'emgFkName':$('#emgFkCod').find("option:selected").text(), 
        'seriesId': $('#seriesId').val(),
        'infocode':$('#infocode').val(),
        'ksfz':$('#ksfz').attr('checked') ? '1' : '0',
      }
      return param;
    }
    
    function getWidth(proportion) {
      var width = $("body").width();
      return Math.round(proportion * width);
    }

	 function changeUrl(){
   		datagridUrl = '${baseurl}report/queryEmgListBySmtz.do';
   		exportUrl = '${baseurl}report/exportSmtzwcqktjlistSubmit.do';
    }

	//获取传给后端的参数
	function getQueryParams() {
		var queryParams = $("#smtzwcqktjform").serializeJson();;
		return queryParams;
	}

  </script>
  <form>
    <div class="form clr">
      
		<p class="form-text">查询时间：</p>
		<input type="text" class="medical-time Wdate" style="width:150px" id="startdate" name="startdate" 
			onfocus="WdatePicker({dateFmt:'yyyy/MM/dd HH:mm:ss',readOnly:true,maxDate:'#F{$dp.$D(\'enddate\')}'})" /> 
		<p class="form-text">-</p>
		<input type="text" class="medical-time Wdate" style="width:150px" id="enddate" name="enddate" 
			onfocus="WdatePicker({dateFmt:'yyyy/MM/dd HH:mm:ss',readOnly:true,minDate:'#F{$dp.$D(\'startdate\')}',maxDate:'%y/%M/%d'})" />
      <p class="form-text">急诊科室：</p>
      <select id='emgFkCod' onchange="getDataGrid()">
        <option value="">全部急诊科室</option>
        <c:forEach items="${jzkscompctlList}" var="value">
          <option value="${value.comno}">${value.comcname}</option>
        </c:forEach>
      </select>
      <input class="hidden" id="emgFkName" type="text">
       <p class="form-text">选项：</p>
      <select id="infocode" onchange="getDataGrid()">
        <option value="">全部</option>
        <option value="tmp_nbr">体温</option>
        <option value="hrt_rte">心率</option>
        <option value="bre_nbr">呼吸</option>
        <option value="sbpup_nbr">收缩压</option>
        <option value="sbpdown_nbr">舒张压</option>
        <option value="oxy_nbr">血氧饱和度</option>
      </select>
      <p class="form-text">状态：</p>
      <select id="seriesId" onchange="getDataGrid()">
        <option value="">全部</option>
        <option value="1">已录入</option>
        <option value="0">未录入</option>
      </select>
      <p class="otspan">
        &nbsp;&nbsp;
        <input class="qjsBedType" id="ksfz" type="checkbox" value="" onchange="getDataGrid()">
        <label for="ksfz">是否包含快速分诊</label>
      </p>
     
      <a href="#" class="easyui-linkbutton" iconCls="icon-search" id="btn" onclick="getDataGrid()">查询</a>
    </div>
    <div class="m-l2 queryTabs">
      <table id="recordList"></table>
    </div>
  </form>
</body>

</html>