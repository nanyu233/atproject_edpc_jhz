<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/base/tag.jsp"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <title>生命体征一览表</title>
    <%@ include file="/WEB-INF/jsp/base/common_css.jsp"%>
    <%@ include file="/WEB-INF/jsp/base/common_js.jsp"%>
    <link rel="stylesheet" type="text/css" href="${baseurl}css/hzszyyhems/vitalSigns.css?090">
    <script src="${baseurl}lib/avalon1.4.8/avalon.js" type="text/javascript" charset="UTF-8"></script>
</head>
<body class="vitalSigns">
    <div class="mainWrapper" id="mainWrapper">
        <span class="hidden" id="firstTimeVal"></span>
        <span class="hidden" id="firstTimeFlag"></span>
        <span class="hidden" id="firstTimeEq"></span>
        <div id="tb"> 
            <a href="javascript:void(0)" class="easyui-linkbutton" data-options="iconCls:'icon-cancel',plain:true" onclick="deleteThis()">删除</a>
            <span class="spanDate">日期：<input class="input-date" type="text" onclick="WdatePicker({dateFmt:'yyyy/MM/dd'})" id="queryDate" onchange="searchVal()"></span> 
        </div>
        <div class="leftWrapper">
            <div class="showItemDiv">
                <table id="showItemsTab"></table>
            </div>
        </div>
        <div class="rightWrapper">
            <iframe frameborder="0" marginwidth="0" marginheight="0" width="100%" height="100%" id="_contentIfream" scrolling="no" src=""></iframe>  
        </div>
    </div>
    <script type="text/javascript">
    var _baseUrl = '${baseurl}',
    _enteringDat = '${enteringDat}';
    
        function toIfream(url, indx) {
            $('#_contentIfream').attr('src', '${baseurl}' + url);
        }
        
        function deleteThis(){
            var checkedRows = $('#showItemsTab').datagrid('getSelected');
            if (checkedRows == null) {
                $.messager.alert('提示信息', '请选择一条数据', 'warning');
            } else {
                _confirm('确定删除该数据吗？', null, function() {
                    $.ajax({
                        url:'${baseurl}zyytpct/deletezyytpct.do',
                        type:'POST',
                        data:{
                            'hspTpctInfCustom.deletetype': checkedRows.deletetype,
                            'hspTpctInfCustom.deletevalue': checkedRows.deletevalue,
                            'hspTpctInfCustom.deleteadd': checkedRows.deleteadd,
                            'hspTpctInfCustom.temperatureChartSeq': checkedRows.temperatureChartSeq
                        },
                        dataType:'json',
                        async:false,
                        success: function(res) {
                        	$('#showItemsTab').datagrid('clearSelections');
                            parent.$('#dataTab').datagrid('reload');
                            if($('#rightWrapper',parent.document).find('#IsIEVal').val() != -1) {
                                parent.SetJSONData();
                            }
                            searchVal();
                        }
                    })
                });
            }
        }

        var columns_v = [
            [{
                field: 'temperatureChartSeq',
                title: 'id ',
                width: getWidth(0.1),
                hidden:true
            },{
                field: 'enteringDatString',
                title: '时间 ',
                width: getWidth(0.15),
                formatter: function (value, row, index) {
                    if(row.enteringDatString != null){
                        return (row.enteringDatString).substring(11,16);
                    }else{
                        return null;
                    }
                }
            },{
                field: 'tpctCata',
                title: '类型 ',
                width: getWidth(0.15)
            },{
                field: 'tpctValue',
                title: '值 ',
                width: getWidth(0.35),
                formatter: function (value, row, index) {
                    if(row.tpctCata == '体温' || row.tpctCata == '呼吸') {
                        return row.tpctValue;
                    }else if(row.tpctCata == '血压'){
                        if(row.tpctType == '测不出'){
                            return row.tpctType;
                        }else{
                            return row.tpctValue;
                        }
                    }else{
                        if(row.tpctType != null && row.tpctValue != null){
                            var _typeVal = row.tpctValue + '('+ row.tpctType +')';
                            return _typeVal;
                        }else if(row.tpctType == null && row.tpctValue == null){
                            return null;
                        }else if(row.tpctType != null && row.tpctValue == null){
                            return row.tpctType;
                        }else{
                            return row.tpctValue;
                        }
                    }
                }
            },{
                field: 'tpctJlr',
                title: '录入人员 ',
                width: getWidth(0.24)
            },{
                field: 'deletetype',
                title: '类型 ',
                width: getWidth(0.2),
                hidden:true
            },{
                field: 'deletevalue',
                title: '值 ',
                width: getWidth(0.2),
                hidden:true
            },{
                field: 'deleteadd',
                title: '是否删除 ',
                width: getWidth(0.2),
                hidden:true
            }]
        ];
        
        function getWidth(proportion) {
            var width =  ($(window).width())*0.27;
            return Math.round(proportion * width);
        }
        
        // function getToolbars() {
        //     var toolbars = [
        //         {text: '删除',iconCls: 'icon-cancel',
        //             handler: function(){deleteThis();}
        //         }
        //     ];
		// 	return toolbars;
        // }

        function getTab(){
            var _thisHeight = ($(window).height())-8;
            $('#showItemsTab').height(_thisHeight);
            $('.showItemDiv').height(_thisHeight);
            $('#showItemsTab').datagrid({
                nowrap: false,
                striped: true,
                singleSelect: true,
                rownumbers: false,
                url: '${baseurl}zyytpct/queryzyytpct_result.do ',
                queryParams: {
                    "hspTpctInfCustom.emgSeq": '${emgSeq}',
                    "startdate": $('#queryDate').val()
                },
                idField: 'seqString',
                loadFilter: function(data) {
                    if(data.rows.length >0 ){
                        for(var i= 0 ;i<data.rows.length-1 ;i++){
                            var _timeFlag = (data.rows[0].tpctDateflg);
                            if(_timeFlag === '0') {
                                var _timeVal = (data.rows[0].enteringDatString).substring(11,13);
                            }else if(_timeFlag === '1'){
                                var _timeVal = (data.rows[0].enteringDatString).substring(11,16);
                            }
                            $('#firstTimeVal').html(_timeVal);
                            $('#firstTimeFlag').html(_timeFlag);
                            $('#firstTimeEq').html(data.rows[0].temperatureChartSeq);
                        }
                    }
                    if (data.resultInfo && data.resultInfo.messageCode == '109') {
                        message_alert(data, function() {
                            window.location.href = "${baseurl}/first.do";
                        });
                    }
                    return data;
                },
                loadMsg: '',
                toolbar: '#tb',
                columns: columns_v,
                onClickRow: function(rowIndex, rowData) {
                    toIfream('zyytpct/querytempItems.do?emgSeq=${emgSeq}&temperatureChartSeq='+ rowData.temperatureChartSeq, 0);
                }
            });
            setLayout();
            var _thisHeightB = ($(window).height())-8;
            $('.showItemDiv').height(_thisHeightB);
            var _thisWidth = (parent.$(window).width())*0.27;
            $('.showItemDiv .panel-header,.showItemDiv .datagrid-wrap.panel-body.panel-body-noheader,.showItemDiv .easyui-panel.panel-body.panel-body-noheader,.showItemDiv .datagrid-header').css('width',''+ _thisWidth +'');
            $('.showItemDiv .panel-header,.showItemDiv .datagrid-wrap.panel-body.panel-body-noheader,.showItemDiv .easyui-panel.panel-body.panel-body-noheader,.showItemDiv .datagrid-header').css('height',''+ _thisHeightB +'');
        }
        
        function searchVal(){
            getTab();
            toIfream('zyytpct/querytempItems.do?emgSeq=${emgSeq}', 0);
        }

        function dateToGMT(strDate){
            if (!strDate) {
          	  return '';
            }
            var dateStr = strDate.split(" ");  
            var strGMT = dateStr[0]+" "+dateStr[1]+" "+dateStr[2]+" "+dateStr[5]+" "+dateStr[3]+" GMT+0800";  
            var date = new Date(Date.parse(strGMT));
            return date;
          }
        
        
        /**
        * [setLayout 初始化布局]
        */
        function setLayout() {
            var _height = ($(window).height());
            $('#_contentIfream').height(_height);
        }
        
       
        $(function() {
            var today = publicFun.timeFormat(dateToGMT('${enteringDat}'), 'yyyy/MM/dd');
            if($('#queryDate').val() == '') {
                $('#queryDate').val(today);
            }
            searchVal();
            $(window).resize(function() {
                searchVal();
            });
        })
    </script>
</body>

</html>