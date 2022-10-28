<%@ page language="java" import="java.util.*" pageEncoding="UTF-8" %>
<%@ include file="/WEB-INF/jsp/base/tag.jsp" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
    <base href="<%=basePath%>">
    <title></title>
    <link rel="stylesheet" type="text/css" href="css/edpc/flow.css">
    <link rel="stylesheet" type="text/css" href="css/edpc/iconfont.css">
    <link rel="stylesheet" type="text/css" href="lib/easyui1.3/themes/default/easyui.css">
	<link rel="stylesheet" type="text/css" href="css/hems/global.css">
	<link rel="stylesheet" type="text/css" href="css/common/querylist.css" />
    <%@ include file="/WEB-INF/jsp/base/common_js.jsp" %>
    <script type="text/javascript" src="lib/moment.min.js"></script>
    <script type="text/javascript" src="lib/raphael-min.js"></script>
    <script type="text/javascript" src="lib/avalon1.4.8/avalon.js"></script>
    <style>

        .form {
            border: 1px solid #eeeeee;
            width: 100%;
            position: relative;
        }

        .form .row {
            margin: 10px 0;
            /*border: 1px solid red;*/
        }

        .form .row .form-item {
            width: 24%;
            display: inline-block;
            vertical-align: middle;
        }

        .form-item label {
            display: inline-block;
            width: 90px;
            text-align: right;
            margin-left: 10px;
            font-size: 14px;
        }

        .form-item input,
        .form-item select {
            width: calc(100% - 110px);
            height: 34px;
            padding: 3px 3px;
            font-size: 14px;
            line-height: 1.428571429;
            color: #555;
            vertical-align: middle;
            background-color: #fff;
            background-image: none;
            border: 1px solid #ccc;
            border-radius: 4px;
        }

        .form-item .btn-group {
            margin-left: 100px;
        }

        .form-item .btn-group .btn {
            padding: 6px 12px;
            border-radius: 4px;
            background: #eeeeee;
            color: #888888;
            cursor: pointer;
            float: right;
            margin: 0 5px;
            font-size: 14px;
        }

        .row .search-btn {
            position: absolute;
            top: 10px;
            right: 10px;
            width: 140px;
            border-radius: 5px;
            color: #fff;
            background-color: #428bca;
            border-color: #357ebd;
            height: 32px;
            text-align: center;
            line-height: 32px;
        }

        .active {
            background: #428bca !important;
            color: #ffffff !important;
        }

        table .btn {
            display: inline-block;
            padding: 2px 10px;
            /*border: 1px solid black;*/
            border-radius: 5px;
            margin: 3px;
            color: #ffffff;
        }

        table .detail {
            background: #428bca;
        }
        table .Timeline{
			background: #428bca;
			/* background:darkseagreen; */
		}
        table .del {
            background: red;
        }
		.pagination-page-list{
			width:45px;
		}
		.datagrid-wrap{
			position:relative;
		}
		.datagrid-pager{
			position:absolute;
			bottom:0;
			width:100%;
		}
    </style>
</head>
<body ms-controller="list" id="container">

<div class="form">
    <div class="row">
        <div class="search-btn" onclick="search()">查询</div>
    </div>
    <div class="row">
        <div class="form-item">
            <input type="text" placeholder="请输入患者编号|姓名|联系方式|证件号码" ms-duplex-string="hspDbzlBasCustom.mpi" style="width:300px;"/>
        </div>
    </div>
</div>
<table id="dg"></table>
<div class="form">
    <div class="row">
        <div class="search-btn" style="margin-right: 150px;" onclick="addFuvPat()">添加</div>
        <div class="search-btn" onclick="closeFuvPatWindow()">取消</div>
    </div>
</div>
</body>
<script>
	var height = $('#container').height();
    var vm = avalon.define({
        $id: 'list',
        hspDbzlBasCustom:{
        	mpi: '',//患者编号|姓名|联系方式|证件号码
        }
    });

    function search() {
        var queryParams = $('#dg').datagrid('options').queryParams;
        queryParams['hspDbzlBasCustom.mpi'] = vm.hspDbzlBasCustom.mpi;
        $("#dg").datagrid('reload');
    }   

    //设置表格的列宽
    //pct --- 百分比（取小于1的小数）
    function setWidth(pct) {
        var pWidth = $('.form').width();
        if (pct < 1 && pct >= 0) {
            return pWidth * pct;
        } else {
            return undefined;
        }
    }

    function toDetail(emgSeq,cstNam,wayTyp) {
        var url = 'cpc/toXtxqPage.do?emgSeq=' + emgSeq+'&wayTyp='+wayTyp;
        if(cstNam=='null'){
        	cstNam = "";
        }
        window.top.addTab( cstNam +"-"+ '胸痛上报' , url, 'icon icon-emergency-record');
    }

    $(function () {
		h3 = height-106;
		$("#dg").height(h3);
		$('.datagrid-wrap').height(h3);
        $('#dg').datagrid({
        	url: 'followup/querypat_resultByType.do',
          queryParams: {
              'patTyp': '3'
          },
            striped: true,
            singleSelect: true,
            pagination: true,
            rownumbers: true,
            pageList: [20, 30, 50],
            columns: [ [
            	{
					field : 'regSeq',
					title : '患者编号',
					width : setWidth(0.15)
				},
				{
					field : 'cstNam',
					title : '患者姓名',
					width : setWidth(0.10)
				},
				{
					field : 'bthDat',
					title : '年龄',
					width : setWidth(0.08),
					formatter : function(value, row, index) {
						if(value){
							var bthDat = publicFun.timeFormat(new Date(value), 'yyyy/MM/dd');
							return (publicFun.calculateAge(bthDat).Age+publicFun.calculateAge(bthDat).typeStr);
						}
						else{return '';}
					}
				},
				{
					field : 'cstSexCod',
					title : '性别',
					width : setWidth(0.08),
					formatter : function(value, row, index) {
						if (value == 0) {
							return '男'
						} else if (value == 1) {
							return '女'
						}
					}
				},
				{
					field: 'idNbr',
					title: '证件号码',
					width: setWidth(0.18),
				},
				{
					field : 'pheNbr',
					title : '联系电话',
					width : setWidth(0.10),
				},{
                    field : 'nation',
                    title : '民族',
                    width : setWidth(0.10),
                },{
                    field : 'marStaCod',
                    title : '婚姻状况',
                    width : setWidth(0.10),
                },
                {
                    field : 'emgJob',
                    title : '职业',
                    width : setWidth(0.10),
                }
				// {
				// 	field : 'xt',
				// 	title : '胸痛',
				// 	width : setWidth(0.08),
				// },
				// {
				// 	field : 'cz',
				// 	title : '卒中',
				// 	width : setWidth(0.08),
				// },
				// {
				// 	field : 'cs',
				// 	title : '创伤',
				// 	width : setWidth(0.08),
				// }
			]]
        });
    });
    
    function addFuvPat(){
    	var checkData = $('#dg').datagrid('getSelected');
    	console.log(checkData,333)
        // var btnDat = publicFun.timeFormat(new Date(checkData.bthDat), 'yyyy/MM/dd')
        // var btnDatE = publicFun.calculateAge(btnDat)
	    if (checkData) {
		    publicFun.httpServ('post', '${baseurl}followup/submitFuvPat.do',
						   {'hspFuvPatCustom.patId' :     checkData.regSeq,
						    'hspFuvPatCustom.patNam' :    checkData.cstNam,
						    'hspFuvPatCustom.cstSexCod' : checkData.cstSexCod,
						    'hspFuvPatCustom.bthDat' :    checkData.bthDat,
						    'hspFuvPatCustom.lnkNbr' :    checkData.pheNbr,
						    'hspFuvPatCustom.patNatCod' : checkData.nation,
						    'hspFuvPatCustom.marStaCod' : checkData.marStaCod,
						    'hspFuvPatCustom.patJob' :    checkData.emgJob,
						    'hspFuvPatCustom.idNbr' :     checkData.idNbr,
						    // 'hspFuvPatCustom.patAdr' :    checkData.cstAdr,
						    // 'hspFuvPatCustom.patTel' :    checkData.patTel
						    'hspFuvPatCustom.csfFlg' :    '1'
						   },
						   function(res) {
						   		message_alert(res);
						   },
						   function(err){},10000);
	    }else{
	    	publicFun.alert('未选中记录');
	    }
    }
    
    function closeFuvPatWindow(){
    	parent.closemodalwindow();
    }
</script>
</html>