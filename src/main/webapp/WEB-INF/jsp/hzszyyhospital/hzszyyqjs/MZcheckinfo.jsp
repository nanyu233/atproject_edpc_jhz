<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/base/tag.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <%@ include file="/WEB-INF/jsp/base/common_css.jsp"%>
    <%@ include file="/WEB-INF/jsp/base/common_js.jsp"%>
    <title>检查报告</title>
    <link rel="stylesheet" type="text/css" href="${baseurl}css/hems/global.css">
</head>

<body class="examinebody checkinfo"> 
    <script type="text/javascript">
    var isCurrentSelect = [],
        fieldArry = [],
        totalTimeList = [];
    var basicTime = '',
        fieldString = '';
    $(document).keydown(function(event) {
        switch (event.keyCode) {
        case 13:
        	queryjcbg();
        }
    });
    
    function reload() {
        $('#checkList').datagrid('reload');
    }
    //datagrid列定义
    var columns_v = [
        [{
            checkbox: true
         },{
            field: 'lsh',
            title: 'id',
            width: getWidth(0.14),
            hidden:true
        }, {
            field: 'ylmc',
            title: '检查项目 ',
            width: getWidth(0.12),
            formatter:function(value,row,index){
                if(value == ''||value == null){
                    return "病理检查报告"
                }
                return value;
            }
        }, {
            field: 'jcjg',
            title: '检查结论',
            width: getWidth(0.28)
        }, {
            field: 'see',
            title: '检查描述',
            width: getWidth(0.28)
        }, {
            field: 'jcysxm',
            title: '检查医生',
            width: getWidth(0.06)
        }, {
            field: 'jcysxm',
            title: '报告医生',
            width: getWidth(0.06)
        }, {
            field: 'examineDocName',
            title: '审核医生',
            width: getWidth(0.06)
        }, {
            field: 'shrq',
            title: '报告时间',
            width: getWidth(0.08),
            formatter: function(value, row, index) {
                return value ? publicFun.timeFormat(value, 'yyyy/MM/dd hh:mm:ss') : '';
            }
        }]
    ];

    /**
    * 获取选中的数组
    **/
    function takePushList(){
        var angencyArry = [];
        var list = $('#checkList').datagrid('getSelections');
        if(list.length >0){
            $.each(list,function(idx,val){
                angencyArry.push("(" + val.ylmc + "):"+ val.jcjg + ";"); 
            })
        }
        return angencyArry;
    }

    function getDataGrid() {
        var today = $("#emg_enddate").val();
        var startdate = $("#emg_startdate").val();
        var height = 0.65 * ($(window).height());
        $("#subfieldText").height(0.12 * ($(window).height()));
        $("#checkList").height(height);
        $('#checkList').datagrid({
            nowrap: false,
            striped: true,
            singleSelect: false,
            selectOnCheck: true,
            checkOnselect: true,
            url: '${baseurl}his/queryjcbg_result.do',
            queryParams: {
                "vHemsJcjgCustom.zyh": '${MPI}',
                "vHemsJcjgCustom.startdate": startdate,
                "vHemsJcjgCustom.enddate":today
            },
            idField: 'lsh',
            loadFilter:function(data){
                if(data.resultInfo && data.resultInfo.messageCode =='109'){
                    message_alert(data,function (){
                        window.location.href="${baseurl}/first.do";
                    });
                }
                return data;
            },
            loadMsg: '',
            columns: columns_v,
            pageList: [15, 30, 50],
            onSelect: function (rowIndex, rowData) {
              var shrq = publicFun.timeFormat(rowData.shrq, "yyyy/MM/dd hh:mm:ss");
              var _string =  shrq +rowData.ylmc+'；';
              var currentData = $.inArray(_string, fieldArry);
              //首先判断当前要拼接的字符串在拼接数组中存不存在，不存在就push
              if (currentData == -1) {
                fieldArry.push(_string);
              }
              fieldString = fieldArry.join("");
              $('#subfieldText').val(fieldString);
            },
            onUnselect: function(_rowIndex, _rowData) {
              var _time = publicFun.timeFormat(_rowData.shrq, "yyyy/MM/dd hh:mm:ss")
              var _string =  _time +_rowData.ylmc+'；';
              var currentData = $.inArray(_string, fieldArry);
              if(currentData != -1){
                fieldArry.splice(currentData, 1);
              }
              fieldString = fieldArry.join("");
              $('#subfieldText').val(fieldString);
            },
            onSelectAll: function (rows) {
              fieldArry = [];
              for (var i = 0; i < rows.length; i++) {
                fieldArry.push(publicFun.timeFormat(rows[i].shrq, "yyyy/MM/dd hh:mm:ss")+rows[i].ylmc+'；');
              }
              fieldString = fieldArry.join("");
              $('#subfieldText').val(fieldString);
            },
            onUnselectAll: function(){
              fieldArry = [];
              fieldString = '';
              $('#subfieldText').val('');
            }
        });
    }

    function getWidth(proportion) {
        var width = $("body").width();
        return Math.round(proportion * width);
    }

    //查询方法
    function queryjcbg() {
        var start=$('#emg_startdate').val();
    	var end=$('#emg_enddate').val();
    	if(start ==null || start ==''){
   		    $.messager.alert('提示信息', "开始时间不能为空！", 'warning');
   			return false;
     	}
    	if(end == null || end==''){
    		 $.messager.alert('提示信息', "结束时间不能为空！", 'warning');
    		return false;
    	}
    	if(start > end){
    		 $.messager.alert('提示信息', "结束时间需大于开始时间", 'warning');
    		return false;
    	}
        getDataGrid();
    }
    
    function setTime() {
        var _startdate = publicFun.timeFormat('${emgDat}', "yyyy/MM/dd");
        var _enddate=publicFun.timeFormat('${cyrqDat}', "yyyy/MM/dd");
    	if(_enddate==null || _enddate==''){
    		_enddate=publicFun.timeFormat(new Date(), "yyyy/MM/dd");
    	}
        $("#emg_startdate").val(_startdate);
        $("#emg_enddate").val(_enddate);
    };
    /**
    * 导入
    **/
    function importField(){
        var fieldVal = $("#subfieldText").val();
        var xtpghz = parent.$("#xtpghznr").val();
        var valName = '${valName}';
        var xtpghzB = parent.$("#"+valName).val();
        if(fieldVal != '' && valName) {
            var totalVal = xtpghzB + fieldVal;
            parent.$("#"+valName).val(totalVal);
            parent.closemodalwindow();
        }else if(fieldVal != ''){
            var totalVal = xtpghz + fieldVal;
            parent.$("#xtpghznr").val(totalVal);
            parent.closemodalwindow();
        }else{
            publicFun.alert('当前无导入数据，请确认是否已完成"检验信息"');
        }
    }
        //加载datagrid
    $(function() {
        setTime();
        getDataGrid();
    });
    </script>
    <form id="jcbgForm">
        <!-- html的静态布局 -->
        <!-- 查询条件 -->
        <input type="hidden" id="jzkh" name="vHemsJcjgCustom.zyh"  value="${MPI}"/>
        <div class="form clr">
            <p class="form-text">日期：</p>
            <input class="input-date Wdate" id="emg_startdate" type="text" name="vHemsJcjgCustom.startdate" onclick="WdatePicker({dateFmt:'yyyy/MM/dd'})">
            <p class="form-text">-</p>
            <input class="input-date Wdate" id="emg_enddate" type="text" name="vHemsJcjgCustom.enddate" onclick="WdatePicker({dateFmt:'yyyy/MM/dd'})">
            <a href="#" class="easyui-linkbutton" iconCls="icon-search" id="btn" onclick="queryjcbg()">查询</a>
        </div>
        <!-- 查询列表 -->
    </form>
        <div class="list_table list_div" id="list_table">
        	<table id="checkList"></table>
        </div>
        <textarea id="subfieldText" readonly  unselectable='on'></textarea>
        <div class="center grp_btn">
            <a class="easyui-linkbutton" iconCls="icon-ok" id="submitbtn" onclick="importField()">导入并返回</a>
            <a class="easyui-linkbutton" iconCls="icon-cancel" id="closebtn" onclick="parent.closemodalwindow()">关闭</a>
        </div>
</body>

</html>