<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/base/tag.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
<%@ include file="/WEB-INF/jsp/base/common_css.jsp"%>
<%@ include file="/WEB-INF/jsp/base/common_js.jsp"%>
<link rel="stylesheet" type="text/css" href="${baseurl}css/common/querylist.css" />
<link rel="stylesheet" type="text/css" href="${baseurl}css/hzszyyhems/receitp.css?55">
<link rel="stylesheet" type="text/css" href="${baseurl}css/hzszyyhems/hljl.css">
<script language="javascript" src="${baseurl}Lodop6.216/LodopFuncs.js"></script>
</head>
<body class="xtpg xtpgRight">
	<div id="mainView" class="f-left"></div>
    <div class="rightWrapper" id="rightWrapper">
        <div class="rightPanel">
            <div class="managerws">
                <p>文书管理</p>
                <p class="dashedborder"></p>
                <div class="tip">
                    <p><label>名称：</label><span class="_name"></span></p>
                    <p><label>创建人：</label><span id="_cretNam"></span></p>
                </div>
            </div>
            <div class="operationDiv">
                <p>操作</p>
                <p class="dashedborder"></p>
                <div class="operationbtn operatEmergency">
                    <a href="javascript:;" class="commonbtn leftBtn" onclick="addCom()">新增</a> 
                    <a href="javascript:;" class="commonbtn" onclick="saveCom()">保存</a> 
                    <a href="javascript:;" class="commonbtn leftBtn" onclick="deleteCom()">删除</a> 
                    <a href="javascript:;" class="commonbtn" onclick="printCom()">打印</a>
                </div>
            </div>
            <div class="tabWrapper">
                <p>记录时间</p>
                <p class="dashedborder"></p>
                <div class="dataGridDiv queryTabs">
                    <div class="tableDiv" id="tabDiv"></div> 
                </div>
            </div>
        </div>
    </div>
    
	<form id="ductdeleteform" action="${baseurl}hzszyyjjd/deletedgbr.do" method="post">
	    <input type="hidden" id="dgbrjjSeq" name="hspDgbrjjInfCustom.dgbrjjSeq" />
	</form>
	 <form id="emergencydeleteform" action="${baseurl}hzszyyjjd/deletejzbr.do" method="post">
	    <input type="hidden" id="jzbrjjSeq" name="hspJzbrjjInfCustom.jzbrjjSeq" />
	</form>
	<form id="surgerydeleteform" action="${baseurl}hzszyyjjd/deletesshz.do" method="post">
	    <input type="hidden" id="sshzjjSeq" name="hspSshzjjInfCustom.sshzjjSeq" />
	</form>
	<form id="xytxdeleteform" action="${baseurl}hzszyyjjd/deletexytx.do" method="post">
	    <input type="hidden" id="xytxSeq" name="hspXytxjjInfCustom.xytxSeq" />
	</form>
	<form id="icudeleteform" action="${baseurl}hzszyyjjd/deletehzzy.do" method="post">
	    <input type="hidden" id="hzzyjjSeq" name="hspHzzyjjInfCustom.hzzyjjSeq" />
	</form>

    <script type="text/javascript">
    var comdata = parent.comdata;    
    function init() {
    	getDatagrid();
    	initMainView(comdata._url);
    	$("#_cretNam").text(comdata.username);
    	$("._name").text(comdata.params.titlename);
	}

    function initMainView(url){
    	var mainView = createFrame(url);
    	$("#mainView").html(mainView);
    }

    /**
    * [setLayout 初始化布局]
    */
    function setLayout() {
        var windowWidth = $(window).width(),
            windowHeight = $(window).height();
        $("#mainView").width(windowWidth-230);
        $("#mainView").height(windowHeight);
        $(".rightWrapper").height(windowHeight);
        $(".rightPanel").height(windowHeight-2);
        $(".dataGridDiv").height(windowHeight-260);
    }
    
    //创建生成的 iframe 嵌入页面
    function createFrame(url) {
        var content = '<iframe id ="myFrame" frameborder="0" scrolling="auto" src="' + url + '"  style="width: 100%;height:100%"></iframe>';
        return content;
    }
    
    //获取导管病人datagrid表格
    function getDatagrid() {
    	var params = comdata.params;
    	//datagrid列定义
        var windowHeight = $(parent.window).height();
        $("#tabDiv").height(windowHeight-295);
        var columns_v = [
            [{
                field: params.writetime,
                title: '记录时间',
                width: 160,
                formatter: function (value, row, index) {
                    return publicFun.timeFormat(value, "yyyy-MM-dd hh:mm");
                }
            },{
                field: params.filedid,
                title: 'id',
                hidden: 'true'
            },{
                field: params.cratNam,
                title: '创建人',
                hidden: 'true'
            }]
        ];
        $("#emgSeq").attr("name", "hspDgbrjjInfCustom.emgSeq");
        $('.tableDiv').datagrid({
            nowrap: false,
            striped: true,
            singleSelect: true,
            title: '',
            url: params.datagridUrl,
            idField: params.filedid,
            loadFilter: function (data) {
                if (data.resultInfo && data.resultInfo.messageCode == '109') {
                    message_alert(data, function () {
                        window.location.href = "${baseurl}/first.do";
                    });
                }
                return data;
            },
            loadMsg: '',
            columns: columns_v,
            rownumbers: true,
            queryParams: params.queryParams,
            onLoadSuccess: function(data) {
                if(data.rows.length > 0 ){
                    var _isHasurl = comdata._url+params.ownParam+data.rows[0][params.filedid];
                    initMainView(_isHasurl);
                    $("#tabDiv").datagrid('selectRow',0);
                }
                return data;
            },
            onClickRow: function (rowIndex, rowData) {
                var _url = comdata._url+params.ownParam+rowData[params.filedid];
                console.log(_url);
                initMainView(_url);
                $("#_cretNam").text(rowData[params.cratNam]);
            },
        });
    }
    
    //新增急诊病人
    function addCom(){
        initMainView(comdata._url);
        $('#tabDiv').datagrid('clearSelections');
    }

    //保存急诊病人
    function saveCom() {
        document.getElementById("myFrame").contentWindow.saveCom();
    }

    //打印急诊病人
    function printCom() {
        var row = $('#tabDiv').datagrid('getSelected');
        if (GridUtils.checkChecked(row)) {
            var myFrame = document.getElementById("myFrame");
            myFrame.contentWindow.$('#currentTitle').html(comdata.params.titlename);
            myFrame.contentWindow.printCom()
        }
    }
    
    //删除急诊病人
    function deleteCom(){
    	var params = comdata.params;
        var row = $('#tabDiv').datagrid('getSelected');
        if (GridUtils.checkChecked(row)) {
            _confirm('确定删除该数据吗？', null, function () {
                $("#"+params.filedid).val(row[params.filedid]);
                console.log($("#"+params.filedid));
                jquerySubByFId(params.formname, emeredel_callback, null, "json");
                $('#tabDiv').datagrid('clearSelections');
            });
        }
    }
   
    //删除急诊病人 --- 回调
    function emeredel_callback(data) {
        if (data.resultInfo && data.resultInfo.messageCode == '109') {
            message_alert(data, function () {
                window.location.href = "${baseurl}/first.do";
            });
        } else {
            message_alert(data);
            var type = data.resultInfo.type;
            if (type == 1) {
                $('#tabDiv').datagrid('reload');
                $('#tabDiv').datagrid('clearSelections');
                addCom();
            }
        }
    }
    
    function reload() {
    	$('#tabDiv').datagrid('reload');
    	 addCom();
	}
    $(function(){
        window.onresize = setLayout;
        setLayout();
    	init();
    });
    </script>
</body>

</html>