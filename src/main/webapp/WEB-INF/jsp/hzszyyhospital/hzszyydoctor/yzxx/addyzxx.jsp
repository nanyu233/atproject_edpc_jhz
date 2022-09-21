<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/base/tag.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
<title>新增医嘱</title>
<%@ include file="/WEB-INF/jsp/base/common_css.jsp"%>
<link rel="stylesheet" type="text/css" href="${baseurl}css/hems/global.css?78">
<link rel="stylesheet" type="text/css" href="${baseurl}css/hzszyyhems/hzszyydoctor/addYzxx.css?78">
<%@ include file="/WEB-INF/jsp/base/common_js.jsp"%>
<script type="text/javascript">
    var _name = '${sessionScope.activeUser.usrname}',
        _vst = '${MPI}';
        _startdate = '${emgDat}';
</script>
</head>

<body class="addyzxx">
<script type="text/javascript">
    var _list = ['手工录入'],
        fieldArry = [],
        fieldJyArry = [],
        fieldJcArry = [],
        docAdviceList = [], //定义一个数组准备存放新增的医嘱的List;
        docAdviceString = ''; //定义一个数组准备存放新增的医嘱的String;
    var _mdelSeq = '',  //给datagrid传参
        fieldString = '',
        fieldJyString = '',
        fieldJcString = '';
    /***
    ** 获取大类list
    ***/
    function getMsgList() {
        $('.ListWays').html("");
        var innerHtml = '';
        $.ajax({
            url:'${baseurl}zyylqbl/querydocadvicelist.do', 
            type: "POST",   
            async: true,
            dataType: 'json',
            success:function (data) {
                innerHtml +='<label class=\"marginRight speclab\"><input type=\"radio\" onclick=\"radiocheck(-1)\" name=\"types\" checked>手工录入</label>';
                $.each(data, function(index, _val) {
                    _list.push(_val.modelNam);
                    innerHtml +='<label class=\"marginRight commonlab\"><input type=\"radio\" onclick=\"radiocheck('+index+')\" name=\"types\">'+ _val.modelNam+'</label>';
                    innerHtml +='<input class=\"inputSeq' + index + '\" type= \"hidden\" value=\"'+ _val.modelSeq +'\"/>' ;
                });
                _list.push('患者已开检验单');
                innerHtml +='<label class=\"marginRight commonlab\"><input type=\"radio\" onclick=\"radiocheck(-2)\" name=\"types\">患者已开检验单</label>';
                _list.push('患者已开检查单');
                innerHtml +='<label class=\"marginRight commonlab\"><input type=\"radio\" onclick=\"radiocheck(-3)\" name=\"types\">患者已开检查单</label>';
                $('.ListWays').html(innerHtml);
            }
        })
    }

    /***
    ** 单选
    ***/
    function radiocheck(idx) {
        var list = _list;
        if(idx == -1) {
            $('.addyzxx .commonWrp').hide();
            $('.addyzxx .tabsDiv').show();
            $('.addyzxx .mould').css({"background":"#ccc"});
            $('.addyzxx .handmade').css({"background":"#1477bc"});
        } else {
           $('.addyzxx .handmade').css({ "background": "#ccc" });
           $('.addyzxx .mould').css({ "background": "#1477bc" }); 
            if (idx == -2) {
                $('.addyzxx .commonWrp').hide();
                $('.addyzxx .exameDiv').show();
                getExameDataGrid()
            } else if (idx == -3) {
                $('.addyzxx .commonWrp').hide();
                $('.addyzxx .extraDiv').show();
                getCheckDataGrid()
            } else {
                $('.addyzxx .commonWrp').hide();
                _mdelSeq = $('.inputSeq' + idx).val();
                $('.addyzxx .addyzxxDiv').show();
                getDataGrid()
            }
        }
    }

    /***
    ** 加载datdgrid图表
    ***/
    function getDataGrid() {    
        setTabHeight('addyzxxList');
        //datagrid列定义
        var columns_v = [
            [{
                checkbox: true
            }, {
                field: 'crtDat',
                title: '创建时间',
                width: 200,
                hidden:true,
                sortable: true,
                formatter: function(value, row, index) {
                    return value ? publicFun.timeFormat(new Date(value), "yyyy/MM/dd hh:mm:ss") : ""
                }
            },{
                field: 'clsCont',
                title: '医嘱信息',
                width: 600
            }]
        ];         
        $('#addyzxxList').datagrid({
            nowrap: false,
            striped: true,
            url: '${baseurl}zyylqbl/querydocadviceconlist.do',
            idField: 'modelcontSeq',
            columns: columns_v,
            toolbar: '',
            singleSelect: false,
            selectOnCheck: true,
			checkOnselect: true,
            rownumbers: true,
            queryParams: {
                "hspModelcontInfCustom.modelSeq": _mdelSeq
            },
            onCheck: function(rowIndex, rowData) {
                if(rowData.clsCont == null || rowData.clsCont == undefined){
                    rowData.clsCont = '';
                }
                var _string = rowData.clsCont + '#' + rowData.crtDat+',';
                var currentData = $.inArray(_string, fieldArry);
                if (currentData == -1) {
                    fieldArry.push(_string);
                    fieldString += _string;
                }
            },
            onUncheck: function(rowIndex, rowData) {
                if(rowData.clsCont == null || rowData.clsCont == undefined){
                    rowData.clsCont = '';
                }
                var _string = rowData.clsCont + '#' +  rowData.crtDat+',';
                var currentData = $.inArray(_string, fieldArry);
                if (currentData != -1) {
                    fieldArry.splice(currentData, 1);
                }
                fieldString = fieldArry.join("");
            }
            ,
            onCheckAll: function(rows) {
                var currentData = "",
                    _allstring = "" ;
                for(var i = 0; i < rows.length; i++) {
                    if(rows[i].clsCont == null || rows[i].clsCont == undefined ) {
                        rows[i].clsCont = '';
                    }
                    _allstring = rows[i].clsCont + '#' +   rows[i].crtDat+',';
                    currentData = $.inArray(_allstring, fieldArry)
                    if(currentData == -1) {
                        fieldArry.push(_allstring);
                        fieldString += _allstring;
                    }
                };
            },
            onUncheckAll: function(rows) {
                var currentData = "",
                    _allstring = "" ;
                for(var i = 0; i < rows.length; i++) {
                    if(rows[i].clsCont == null || rows[i].clsCont == undefined ) {
                        rows[i].clsCont = '';
                    }
                    _allstring = rows[i].clsCont + '#' +  rows[i].crtDat+',';
                    currentData = $.inArray(_allstring, fieldArry)
                    if(currentData != -1) {
                        fieldArry.splice(currentData,1);
                    }
                }
                fieldString = fieldArry.join("");
            }
        });
    }

    /***
    ** 加载检验表
    ***/
    function getExameDataGrid(){
        setTabHeight('exameList');
        //datagrid列定义
        var columns_v = [
            [{
                checkbox: true
            },{
                field: 'patientId',
                title: '预检号',
                width: 20,
                hidden: true
            }, {
                field: 'resultDateTime',
                title: '报告时间',
                width: 200,
                sortable: true,
                formatter: function(value, row, index) {
                    return value ? publicFun.timeFormat(new Date(value), "yyyy/MM/dd hh:mm:ss") : ""
                }
            }, {
                field: 'examinaim',
                title: '样本类型',
                sortable: true,
                width: 400
            }]
        ];         
        $('#exameList').datagrid({
            nowrap: false,
            striped: true,
            url: '${baseurl}his/ajaxjyinfo.do',
            idField: 'sampleno',
            columns: columns_v,
            toolbar: '',
            singleSelect: false,
            selectOnCheck: true,
			checkOnselect: true,
            rownumbers: true,
            queryParams: {
                "vHemsJyjgCustom.patientId":_vst,
                "vHemsJyjgCustom.startdate":_startdate
            },
            // onLoadSuccess: function() {
            //     $("#addyzxxList").parent().find("div .datagrid-header-check").children("input[type=\"checkbox\"]").eq(0).attr("style", "display:none;");
            // },
            onCheck: function(rowIndex, rowData) {
                if(rowData.examinaim == null || rowData.examinaim == undefined){
                    rowData.examinaim = '';
                }
                var resultDateTime = publicFun.timeFormat(rowData.resultDateTime, "yyyy/MM/dd hh:mm:ss");
                var _string = rowData.examinaim + '#' + $('#timeInput').val() +',';
                var currentData = $.inArray(_string, fieldJyArry);
                if (currentData == -1) {
                    fieldJyArry.push(_string);
                    fieldJyString += _string;
                }
            },
            onUncheck: function(rowIndex, rowData) {
                if(rowData.examinaim == null || rowData.examinaim == undefined){
                    rowData.examinaim = '';
                }
                var resultDateTime = publicFun.timeFormat(rowData.resultDateTime, "yyyy/MM/dd hh:mm:ss");
                var _string = rowData.examinaim + '#' + $('#timeInput').val() + ',';
                var currentData = $.inArray(_string, fieldJyArry);
                if (currentData != -1) {
                    fieldJyArry.splice(currentData, 1);
                }
                fieldJyString = fieldJyArry.join("");
            }
            ,
            onCheckAll: function(rows) {
                var currentData = "",
                    _allstring = "" ;
                for(var i = 0; i < rows.length; i++) {
                    if(rows[i].examinaim == null || rows[i].examinaim == undefined ) {
                        rows[i].examinaim = '';
                    }
                    rows[i].resultDateTime = publicFun.timeFormat(rows[i].resultDateTime, "yyyy/MM/dd hh:mm:ss");
                    _allstring = rows[i].examinaim + '#' + $('#timeInput').val()+ ',';
                    currentData = $.inArray(_allstring, fieldJyArry)
                    if(currentData == -1) {
                        fieldJyArry.push(_allstring);
                        fieldJyString += _allstring;
                    }
                };
            },
            onUncheckAll: function(rows) {
                var currentData = "",
                    _allstring = "" ;
                for(var i = 0; i < rows.length; i++) {
                    if(rows[i].examinaim == null || rows[i].examinaim == undefined ) {
                        rows[i].examinaim = '';
                    }
                    rows[i].resultDateTime = publicFun.timeFormat(rows[i].resultDateTime, "yyyy/MM/dd hh:mm:ss");
                    _allstring = rows[i].examinaim + '#' + $('#timeInput').val() + ',';
                    currentData = $.inArray(_allstring, fieldJyArry)
                    if(currentData != -1) {
                        fieldJyArry.splice(currentData,1);
                    }
                }
                fieldJyString = fieldJyArry.join("");
            }
        });
    }
    
    function setTabHeight (tabName) {
        var height = $(window).height();
        $('#' + tabName).height(0.76 * height);
    }
    /***
    ** 加载检查表
    ***/
    function getCheckDataGrid(){
        setTabHeight('checkList');
        //datagrid列定义
        var columns_v = [
            [{
                checkbox: true
            },{
                field: 'shrq',
                title: '报告时间',
                width: 200,
                sortable: true,
                formatter: function(value, row, index) {
                    return value ? publicFun.timeFormat(new Date(value), "yyyy/MM/dd hh:mm:ss") : ""
                }
            }, {
                field: 'ylmc',
                title: '样本类型',
                sortable: true,
                width: 400
            }]
        ];         
        $('#checkList').datagrid({
            nowrap: false,
            striped: true,
            url: '${baseurl}his/ajaxjcinfo.do',
            idField: 'lsh',
            columns: columns_v,
            toolbar: '',
            singleSelect: false,
            selectOnCheck: true,
			checkOnselect: true,
            rownumbers: true,
            queryParams: {
                "vHemsJcjgCustom.zyh":_vst,
                "vHemsJcjgCustom.startdate":_startdate
                
            },
            // onLoadSuccess: function() {
            //     $("#addyzxxList").parent().find("div .datagrid-header-check").children("input[type=\"checkbox\"]").eq(0).attr("style", "display:none;");
            // },
            onCheck: function(rowIndex, rowData) {
                if(rowData.ylmc == null || rowData.ylmc == undefined){
                    rowData.ylmc = '';
                }
                rowData.shrq = publicFun.timeFormat(rowData.shrq, "yyyy/MM/dd hh:mm:ss");
                var _string = rowData.ylmc + '#' + $('#timeInput').val() + ',';
                var currentData = $.inArray(_string, fieldJcArry);
                if (currentData == -1) {
                    fieldJcArry.push(_string);
                    fieldJcString += _string;
                }
            },
            onUncheck: function(rowIndex, rowData) {
                if(rowData.ylmc == null || rowData.ylmc == undefined){
                    rowData.ylmc = '';
                }
                rowData.shrq = publicFun.timeFormat(rowData.shrq, "yyyy/MM/dd hh:mm:ss");
                var _string = rowData.ylmc + '#' + $('#timeInput').val() + ',';
                var currentData = $.inArray(_string, fieldJcArry);
                if (currentData != -1) {
                    fieldJcArry.splice(currentData, 1);
                }
                fieldJcString = fieldJcArry.join("");
            }
            ,
            onCheckAll: function(rows) {
                var currentData = "",
                    _allstring = "" ;
                for(var i = 0; i < rows.length; i++) {
                    if(rows[i].ylmc == null || rows[i].ylmc == undefined ) {
                        rows[i].ylmc = '';
                    }
                    rows[i].shrq = publicFun.timeFormat(rows[i].shrq, "yyyy/MM/dd hh:mm:ss");
                    _allstring = rows[i].ylmc + '#' + $('#timeInput').val() + ',';
                    currentData = $.inArray(_allstring, fieldJcArry)
                    if(currentData == -1) {
                        fieldJcArry.push(_allstring);
                        fieldJcString += _allstring;
                    }
                };
            },
            onUncheckAll: function(rows) {
                var currentData = "",
                    _allstring = "" ;
                for(var i = 0; i < rows.length; i++) {
                    if(rows[i].ylmc == null || rows[i].ylmc == undefined ) {
                        rows[i].ylmc = '';
                    }
                    rows[i].shrq = publicFun.timeFormat(rows[i].shrq, "yyyy/MM/dd hh:mm:ss");
                    _allstring = rows[i].ylmc + '#' + $('#timeInput').val() + ',';
                    currentData = $.inArray(_allstring, fieldJcArry)
                    if(currentData != -1) {
                        fieldJcArry.splice(currentData,1);
                    }
                }
                fieldJcString = fieldJcArry.join("");
            }
        });
    }

    /**
     * 保存
     **/
    function saveMsg(){
    	_confirm('请确认医嘱下达时间是否正确?', null, function() {
	        var tb=document.getElementById("importtable");    //获取table对像
	        var rows=tb.rows;
	        var _tmString = '';
	        if(rows.length >=1){
	            for(var i=1;i<=rows.length;i++){    //--循环所有的行
	                if($('#addA'+i).val() !=''){
	                    _tmString = $('#addA'+i).val() + '#' + $('#timeInput').val();
	                    var _currentThisData = $.inArray(_tmString, docAdviceList)
	                    if(_currentThisData == -1) {
	                        docAdviceList.push(_tmString);
	                    }
	                }
	            }
	            docAdviceString = docAdviceList.join(",");
	        }
	        if(docAdviceString !=''){
	            docAdviceString += "," + fieldString + fieldJyString + fieldJcString;
	        }else{
	            docAdviceString += fieldString + fieldJyString + fieldJcString;
	        }
	        console.log(docAdviceString,"docAdviceString")
	        $.ajax({
	            url:'${baseurl}zyylqbl/insertyzxx.do', 
	            type: "POST",   
	            async: true,
	            dataType: 'json',
	            data:{
	            	"HspDocadviceInfCustom.docadviceIsdat":$('#timeInput').val(),
	                "HspDocadviceInfCustom.docadviceNam": _name,
	                "HspDocadviceInfCustom.docadviceContents":docAdviceString,
	                "HspDocadviceInfCustom.vstCad":_vst
	            },
	            success:function (data) {
	                message_alert(data);
	                var type = data.resultInfo.type;
	                if (type == 1) {
	                    parent.$('#jcbglist').datagrid('reload');
	                    parent.closemodalwindow();
	                }
	            }
	        })
        
   	 });
    }

    $(function(){
        getMsgList();
        var today = publicFun.timeFormat(new Date(), 'yyyy/MM/dd hh:mm:ss');
        $('.addyzxx .tabsDiv').show();
        $('#username').val(_name);
        $('#timeInput').val(today);
    }) 
</script>
<div class="mainbody">
    <div class="header">
        <div class="tips">
            <p class="leftp handmade">① "手工录入"：自定义动态新增或删除文本医嘱；</p>
            <p class="leftp mould">② "医嘱模板"：可批量勾选模板内医嘱内容；</p>
        </div>
        <div class="clearBoth"></div>
        <div class="ListWays"></div>
    </div>
    <div class="clearBoth"></div>
    <div class="tabsDiv commonWrp">
        <table class="importtable titletable">
            <colgroup>
                <col width="28px" />
                <col width="560px"/>  
                <col width="80px"/>                
            </colgroup>
            <thead>
                <tr class="fixedTr">
                    <th>序号</th>
                    <th>医嘱信息</th>
                    <th><img class="leftMargin" width="16" height="16" src="${baseurl}images/hzszyyhems/note/3.png" alt="新增" onclick="addNewtr('addA')"/>&emsp;<img width="16" height="16" src="${baseurl}images/hzszyyhems/note/1.png" alt="删除" onclick="delThistr()"/></th>
                </tr>
            </thead>
        </table>
        <div class="contentTab">
            <table class="importtable" id="importtable">
                <colgroup>
                    <col width="28px" />
                    <col width="640px"/>                
                </colgroup>
                <tbody>
                        <tr class="firsttr">
                            <td>
                                <span class="centertd">1</span>
                            </td>
                            <td>
                                <input type="text" id="addA1" class="longinput">                          
                            </td>
                        </tr>
                </tbody>
            </table>
        </div>
    </div>
    <div class="addyzxxDiv commonWrp">
       <table id="addyzxxList"></table> 
    </div>
    <div class="extraDiv commonWrp">
        <table id="checkList"></table> 
    </div>
    <div class="exameDiv commonWrp">
        <table id="exameList"></table>
    </div>
    <div class="bottomDiv">
        <label class="labbox rxbox">医嘱时间</label>
        <input class="Wdate spcWdate"  id="timeInput" name="HspDocadviceInfCustom.docadviceDat" type="text" onclick="WdatePicker({dateFmt:'yyyy/MM/dd HH:mm:ss'})">
        <span class="leftMargin">
            <span>医师</span>
            <input type="text" id="username" maxlength="10" name="HspDocadviceInfCustom.docadviceNam" readonly unselectable='on'>
        </span>
    </div>
    <div class="grp_btn">
        <a class="easyui-linkbutton" iconCls="icon-ok" id="submitbtn" onclick="saveMsg()">确定</a>
        <a class="easyui-linkbutton" iconCls="icon-cancel" id="closebtn" onclick="parent.closemodalwindow()">关闭</a>
    </div>
</div>
    <script type="text/javascript">
        function addNewtr(idname){
            var tb = document.getElementById('importtable');
            var q = tb.rows.length; //table总行数
            var p = q;  //table当前最后一行
            var lastvalue = document.getElementById(idname+p).value;
            var num = q+1;
            num = parseInt(num);
            if(lastvalue == ""||lastvalue == null){
               publicFun.alert("医嘱信息必填！");
            }else{
                var newTr = tb.insertRow(tb.rows.length);//添加新行，trIndex就是要添加的位置
                var newTd1 = newTr.insertCell();
                newTd1.innerHTML+= "<td><span class=\"centertd\">"+num+"</span></td>";
                var newTd2 = newTr.insertCell();
                newTd2.innerHTML+= "<td><input type='text' id='"+idname+num+"' class='longinput'></td>";
            }
        }

        function delThistr(){
            var obj = document.getElementById('importtable');
            if(obj.rows.length == 1){
                $('#addA1').val("");
            }else{
                obj.deleteRow((obj.rows.length-1));
            }           
        }

    </script>
</body>
</html>