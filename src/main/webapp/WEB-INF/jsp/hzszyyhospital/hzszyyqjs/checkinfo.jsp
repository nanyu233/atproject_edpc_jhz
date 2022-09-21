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
    var  _sourceType = "${sourceType}"; // sourceType 为了知识库而设定
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
            width: getWidth(0.26),
        }, {
            field: 'see',
            title: '检查描述',
            width: getWidth(0.28),
            formatter:function(value,row,index){
                return value.replace(" ","")
            }
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
            width: getWidth(.1),
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
                angencyArry.push(val.ylmc + ":"+ val.jcjg.replace(/&nbsp/g,'') + ";"); 
            })
        }
        return angencyArry;
    }

    function getDataGrid() {
        var totalList = [];
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
            onLoadSuccess: function(res) {
                var _allstring;
                //处理拼接的字符
                for(var i = 0; i < res.rows.length;i++){
                    var _list = ['ylmc','jcjg','shrq'];
                    $.each(_list,function(idx,val){
                        if(res.rows[i][val] == null || res.rows[i][val] == undefined){
                            res.rows[i][val] = '';
                        }
                    })
                    _allstring =  res.rows[i].ylmc +"："+ res.rows[i].jcjg.replace(/&nbsp/g,'') + ";";
                    res.rows[i].shrq = publicFun.timeFormat(res.rows[i].shrq, "yyyy/MM/dd") ; 
                    if($.inArray(res.rows[i].shrq,totalTimeList) <0 ){
                        totalTimeList.push(res.rows[i].shrq);
                    }
                    if($.inArray(_allstring,totalList) <0){
                        totalList.push(_allstring);
                    }
                }  
                $("#checkList").parent().find("div .datagrid-header-check").children("input[type=\"checkbox\"]").eq(0).attr("style", "display:none;"); 
            },
            onSelect: function(_rowIndex, _rowData) {
                //isCurrentSelect 为选中的List
                isCurrentSelect = takePushList();
                //_string为要拼接的字符串
                basicTime = _rowData.shrq;
                var _string =  _rowData.ylmc +"："+ _rowData.jcjg.replace(/&nbsp/g,'') + ";";
                var currentData = $.inArray(_string, fieldArry);
                var _currentData = $.inArray(basicTime, fieldArry);
                var addField = '',
                    currenttime = '';
                var addArray = [];
                //首先判断当前要拼接的字符串在拼接数组中存不存在，不存在就push
                if (currentData == -1) {
                    addArray.push(_string);
                    addField += _string;
                }
                /**
                * addField 为要拼接进去的字符串
                * 如果不为空 1.当前的小标题不存在，加入小标题
                            2.如果当前小标题存在，并且上一次已拼接号的大数组最后一项不是小标题,加入小标题
                            3.其他情况,不加入小标题        
                **/
                var timeindex = $.inArray(fieldArry[fieldArry.length-1] , totalList) ;
                var allrows = $('#checkList').datagrid('getRows');
                if(timeindex != -1) {
                    currenttime = allrows[timeindex].shrq ;
                }
                if(addField != ''){
                    if(_currentData == -1) {
                        addArray.unshift(basicTime);
                        fieldArry = fieldArry.concat(addArray);
                        fieldString = fieldArry.join("");
                    }
                    else if(_currentData != -1 && currenttime != basicTime ){
                        addArray.unshift(basicTime);
                        fieldArry = fieldArry.concat(addArray);
                        fieldString = fieldArry.join("");
                    }
                    else{
                        fieldArry = fieldArry.concat(addArray);
                        fieldString = fieldArry.join("");
                    }
                }
                $('#subfieldText').val(fieldString);
            },
            onUnselect: function(_rowIndex, _rowData) {
                basicTime = _rowData.shrq;
                var _string = _rowData.ylmc +"："+ _rowData.jcjg.replace(/&nbsp/g,'') + ";";
                var currentData = $.inArray(_string, fieldArry);
                /**
                * isCurrentSelect 为当前拼接的List(点击单选或者全选生成的List)
                * 要删除的内容存在在fieldArry数组中 ：判断要删除内容的前后排列位置 看是否是B1A123B2/B1A1B2/B1A1/A1,再一一处理
                **/
                if (currentData != -1) {
                    if(isCurrentSelect.length == 1){
                        fieldArry.splice(currentData, 1);
                        fieldArry.splice(currentData-1, 1);
                    }else if(isCurrentSelect.length > 1){
                        if(fieldArry[currentData-1] == basicTime) {
                            if(($.inArray(fieldArry[currentData+1],totalTimeList) > -1 ) || (currentData == (fieldArry.length -1))){
                                fieldArry.splice(currentData, 1);
                                fieldArry.splice(currentData-1, 1);
                            }else{
                                fieldArry.splice(currentData, 1);
                            }
                        }else{
                            fieldArry.splice(currentData, 1);
                        }
                    }
                }
                fieldString = fieldArry.join("");
                // console.log(fieldArry,"fieldArry2")
                $('#subfieldText').val(fieldString);
            }
            // ,
            // onSelectAll: function(rows) {
            //     isCurrentSelect = takePushList();
            //     var currentData = '',
            //         _allstring = '',
            //         addField = '',
            //         currenttime = '',
            //         selcurrenttime = '';
            //     var addArray = [];
            //     var allrows = $('#checkList').datagrid('getRows');
            //     for(var i = 0; i < rows.length; i++) {
            //         _allstring = "("+ rows[i].ylmc +")："+ rows[i].jcjg + ";";
            //         currentData = $.inArray(_allstring, fieldArry);
            //         if(currentData == -1){
            //             selcurrenttime = rows[i].shrq ;
            //         }
            //         basicTime = rows[i].shrq;
            //         var timeindex = $.inArray(fieldArry[fieldArry.length-1] , totalList) ;
            //         if(timeindex != -1) {
            //             currenttime = allrows[timeindex].shrq ;
            //         }
            //         //判断之前选中内容在不在全选的范围如果在就添加剩下的内容并适当加入小标题
            //         var _currentData = $.inArray(basicTime, fieldArry);
            //         if(_currentData == -1) {
            //             fieldArry.push(basicTime);
            //         }else if(_currentData != -1 && currenttime != selcurrenttime && (selcurrenttime !='')){
            //             fieldArry.push(basicTime);
            //         }
            //         if(currentData == -1){
            //             fieldArry.push(_allstring);
            //         }
            //     };
            //     fieldString = fieldArry.join("");
            //     $('#subfieldText').val(fieldString);

            // },
            // onUnselectAll: function(rows) {
            //     fieldArry = [];
            //     fieldString = fieldArry.join("");
            //     $('#subfieldText').val(fieldString);
            // }
        });
    }

    function getWidth(proportion) {
        var width = $("body").width();
        return Math.round(proportion * width);
    }

    //查询方法
    function queryjcbg() {
        var start = $('#emg_startdate').val();
        var end = $('#emg_enddate').val();
        var _rtnFlg = publicFun.searchTime(start, end);
        if (_rtnFlg === false) {
            return;
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

    function isKnowledgePage() {
        if (_sourceType === 'knowledgeBox') { // 知识库中检查时
            $('.grp_btn').hide();
            $('.checkinfo').css({'padding': '2px 10px'});
            $('.examinebody #list_table').css({'padding': '8px 0 10px 0'});
            document.getElementById('subfieldText').ondblclick = function () {
                parent.setParentVal('check');
            }
        } else {
            $('.grp_btn').show();
            $('.checkinfo').css({ 'padding': '10px' });
            $('.examinebody #list_table').css({ 'padding': '10px 0'});
        }
    }

    //加载datagrid
    $(function() {
        isKnowledgePage();
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
            <a class="easyui-linkbutton" iconCls="icon-search" id="btn" onclick="queryjcbg()">查询</a>
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