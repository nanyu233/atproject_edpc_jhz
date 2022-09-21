
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/base/tag.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
<%@ include file="/WEB-INF/jsp/base/common_css.jsp"%>
<%@ include file="/WEB-INF/jsp/base/common_js.jsp"%>
<link rel="stylesheet" type="text/css" href="${baseurl}css/common/querylist.css" />
<link rel="stylesheet" type="text/css" href="${baseurl}css/hzszyyhems/vitalSigns.css?090">
<script type="text/javascript">
    var _emgSeq = '${emgSeq}';
</script>
<body class="rightTemp">
<script type="text/javascript">
    /**
    * [setLayout 初始化布局]
    */
    function setLayout() {
        var windowWidth = $(parent.window).width(),
            windowHeight = $(parent.window).height();
        $("#rightWrapper").height(windowHeight-32);
        $("#rightWrapper .rightPanel").height(windowHeight-34);
        $("#rightWrapper .dataGridDiv").height(windowHeight-316);
        $("#mainView").width(windowWidth-230);
        $("#mainView").height(windowHeight-32);
    }

    function initMainView(url){
    	var mainView = createFrame(url);
    	$("#mainView").html(mainView);
    }
    
    window.onload = function() {
   		window.onresize = setLayout;
        setLayout();
    }
    
    //设置A4样式体温单
    function SetTWDStyle(){
        document.getElementById("myFrame").contentWindow.SetTWDStyle();
    }
    //设置起始时间
    function SetStartTime() {
        document.getElementById("myFrame").contentWindow.SetStartTime();
    }
    //选择打印机
    function SelectPrinter() {
        document.getElementById("myFrame").contentWindow.SelectPrinter();
    }
    //设置B5样式体温单
    function SetTWDStyle(strStyle) {
        document.getElementById("myFrame").contentWindow.SetTWDStyle(strStyle);
    }
    //设置体温单表头样式
    function SetHeaderStyle() {
        document.getElementById("myFrame").contentWindow.SetHeaderStyle();
    }
    function SetXmlData() {
        document.getElementById("myFrame").contentWindow.SetXmlData();
    }
    //设置文本数据
    function SetTextData() {
        document.getElementById("myFrame").contentWindow.SetTextData();
    }
    //设置JSON数据
    function SetJSONData(){
        document.getElementById("myFrame").contentWindow.SetJSONData();
    }
    //获取体温单数据
    function GetXmlData() {
        document.getElementById("myFrame").contentWindow.GetXmlData();
    }
    //刷新体温单
    function RefreshData() {
        document.getElementById("myFrame").contentWindow.RefreshData();
    }
    //打印当前页
    function PrintCurrentPage() {
        document.getElementById("myFrame").contentWindow.PrintCurrentPage();
    }
    //打印所有页
    function PrintAllPage() {
        document.getElementById("myFrame").contentWindow.PrintAllPage();
    }
    //导出图像文件
    function ExportFile(){
        document.getElementById("myFrame").contentWindow.ExportFile();
    }
    //指定打印机
    function SetTWDPrinter(){
        document.getElementById("myFrame").contentWindow.SetTWDPrinter();
    }
    //刷新页面
    function refreshPage(){
        document.getElementById("myFrame").contentWindow.location.reload(true);
    }
    //生命体征一览表
    function vitalSigns(){
        var openModalWindowName = '${cstNam}' + "-" + '生命体征一览表',
        openModalWindowUrl = "${baseurl}zyytpct/queryvitalSigns.do?emgSeq=" + _emgSeq + "&th=" + new Date().getTime();
        createmodalwindow(openModalWindowName, 950, 550, openModalWindowUrl);
    }
    function IEVersion() {
        var userAgent = navigator.userAgent; //取得浏览器的userAgent字符串  
        var isIE = userAgent.indexOf("compatible") > -1 && userAgent.indexOf("MSIE") > -1; //判断是否IE<11浏览器  
        var isEdge = userAgent.indexOf("Edge") > -1; // Edge 
        var isIE11 = userAgent.indexOf('Trident') > -1 && userAgent.indexOf("rv:11.0") > -1;
        if (isIE) {
            var reIE = new RegExp("MSIE (\\d+\\.\\d+);");
            reIE.test(userAgent);
            var fIEVersion = parseFloat(RegExp["$1"]);
            return 9;
        } else if (isEdge) {
            return 'edge';//edge
        } else if (isIE11) {
            return 11; //IE11  
        } else {
            if (userAgent.indexOf('Trident') > -1) {
                return 11;
            } else {
                return -1;
            }
        }
    }
    $(function(){
        var _istype = IEVersion();
        $('#IsIEVal').val(_istype);
        var today = publicFun.timeFormat(new Date(), 'yyyy/MM/dd')
        if($('#queryDate').val() == '') {
            $('#queryDate').val(today);
        }
        var _url = "${baseurl}zyytpct/queryhzszyyTemperature.do?emgSeq=" + _emgSeq ;
        initMainView(_url);
        getTab();
    })

    //创建生成的 iframe 嵌入页面
    function createFrame(url) {
        var content = '<iframe id ="myFrame" frameborder="0" scrolling="auto" src="' + url + '"  style="width:100%; height:100%"></iframe>';
        return content;
    }
</script>
<!-- 体温单btn -->
<div id="mainView" class="f-left"></div>
<div class="rightWrapper tempWrapper" id="rightWrapper">
    <input type="text" id="IsIEVal" class="hidden">
    <div class="rightPanel">
            <div class="operationDiv">
                <p>操作</p>
                <p class="dashedborder"></p>
                <div class="operatTemp">
                    <a href="javascript:;" class="commonbtn leftBtn" onClick="vitalSigns()">录入</a>
                    <a href="javascript:;" class="commonbtn" onClick="refreshPage()">刷新</a>
                    <a href="javascript:;" class="commonbtn leftBtn" onClick="PrintCurrentPage()">打印</a>
                </div>
            </div>
            <div class="msgDiv">
                <p class="tittle">生命体征一览</p>
                <p class="dashedborder"></p>
                <div id="dateBar">
                    <p class="marinLeft"><span class="floatLeft">日期：<input class="input-date" type="text" onclick="WdatePicker({dateFmt:'yyyy/MM/dd'})" id="queryDate" onchange="getTab()"></span></p>
                    <a href="javascript:void(0)" class="easyui-linkbutton" data-options="iconCls:'icon-cancel',plain:true" onclick="deleteThis()">删除</a>
                </div>
                <div class="tabWrapper">
                    <div class="dataGridDiv norowTab">
                        <div class="tableDiv" id="dataTab"></div> 
                    </div>
                </div>
            </div>
            <!-- <p><a href="javascript:;" onClick="vitalSigns()">生命体征一览</a></p> -->
    </div>
</div>
<script type="text/javascript">
    var columns_v = [
        [{
            field: 'temperatureChartSeq',
            title: 'id ',
            width: getWidth(0.1),
            hidden:true
        },{
            field: 'enteringDatString',
            title: '时间 ',
            width: getWidth(0.18),
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
            width: getWidth(0.2)
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
        var width = 310;
        return Math.round(proportion * width);
    }
    
    function getTab(){
        $("#dataTab").width(314);
        var _Height = $(parent.window).height();
        $("#dataTab").height(_Height - 152);
        $('#dataTab').datagrid({
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
                if (data.resultInfo && data.resultInfo.messageCode == '109') {
                    message_alert(data, function() {
                        window.location.href = "${baseurl}/first.do";
                    });
                }
                return data;
            },
            loadMsg: '',
            toolbar: '#dateBar',
            columns: columns_v
        });
        setTimeout(function() {
            if ($('#IsIEVal').val() == -1) {
                publicFun.alert('体温单这部分的功能非ie浏览器不能运行，请切换至ie！')
            }
        }, 500)
    }
    
    function deleteThis(){
        var checkedRows = $('#dataTab').datagrid('getSelected');
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
                    	$('#dataTab').datagrid('clearSelections');
                        $('#dataTab').datagrid('reload');
                        if($('#rightWrapper',parent.document).find('#IsIEVal').val() != -1) {
                            SetJSONData();
                        }
                      //  searchVal();
                    }
                })
            });
        }
    }

    
</script>
</body>

</html>