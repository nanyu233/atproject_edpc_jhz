<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/base/tag.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <%@ include file="/WEB-INF/jsp/base/common_css.jsp"%>
    <%@ include file="/WEB-INF/jsp/base/common_js.jsp"%>
    <title>会诊意见</title>
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
            field: 'invitationDateStr',
            title: '邀请时间',
            width: getWidth(.15),
            formatter: function (value, row, index) {
              return value ? publicFun.timeFormat(value, 'yyyy/MM/dd hh:mm') : '';
            }
        }, {
            field: 'applyDocName',
            width: getWidth(.07),
            title: '申请人'
        },{
            field: 'consultationDateStr',
            title: '签到时间 ',
            width: getWidth(0.11)
        },{
            field: 'replyCreateDate',
            title: '会诊时间 ',
            width: getWidth(0.11)
        }, {
            field: 'invitationDep',
            title: '会诊科室',
            width: getWidth(0.08)
        }, {
            field: 'replyDocName',
            title: '会诊医生',
            width: getWidth(0.07)
        }, {
            field: 'consultationOpinion',
            title: '会诊意见',
            width: getWidth(0.43)
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
        var height = 0.7 * ($(window).height());
        $("#subfieldText").height(0.12 * ($(window).height()));
        $("#checkList").height(height);
        $('#checkList').datagrid({
            nowrap: false,
            striped: true,
            singleSelect: false,
            selectOnCheck: true,
            checkOnselect: true,
            url: '${baseurl}consultation/queryConsultation_result.do',
            queryParams: {
                "hspConsultationRecordsCustom.emgSeqCr": parent._emgSeq
            },
            idField: 'consultationRecordsSeq',
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
            pagination: true,
            rownumbers: true,
            pageList: [15, 30, 50],
            onSelect: function (rowIndex, rowData) {
              var _string =  "到达时间："+(rowData.consultationDateStr|| '无')+','+"会诊科室："+(rowData.invitationDep || '无')+','+"会诊医生："+(rowData.replyDocName || '无')+','+"会诊意见："+(rowData.consultationOpinion || '无')+'；';
              var currentData = $.inArray(_string, fieldArry);
              //首先判断当前要拼接的字符串在拼接数组中存不存在，不存在就push
              if (currentData == -1) {
                fieldArry.push(_string);
              }
              fieldString = fieldArry.join("");
              $('#subfieldText').val(fieldString);
            },
            onUnselect: function(_rowIndex, _rowData) {
              var _string =  "到达时间："+(_rowData.consultationDateStr|| '无')+','+"会诊科室："+(_rowData.invitationDep || '无')+','+"会诊医生："+(_rowData.replyDocName || '无')+','+"会诊意见："+(_rowData.consultationOpinion || '无')+'；';
              var currentData = $.inArray(_string, fieldArry);
              if(currentData != -1){
                fieldArry.splice(currentData, 1);
              }
              fieldString = fieldArry.join("");
              $('#subfieldText').val(fieldString);
            },
            onSelectAll: function (row) {
              fieldArry = [];
              for (var i = 0; i < row.length; i++) {
                fieldArry.push("到达时间："+(row[i].consultationDateStr|| '无')+','+"会诊科室："+row[i].invitationDep+','+"会诊医生："+row[i].replyDocName+','+"会诊意见："+row[i].consultationOpinion+'；');
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
            publicFun.alert('当前无导入数据，请确认是否已完成"会诊意见"');
        }
    }
        //加载datagrid
    $(function() {
        getDataGrid();
    });
    </script>
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