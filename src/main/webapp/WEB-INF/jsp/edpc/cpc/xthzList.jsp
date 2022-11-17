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
    <title>胸痛患者列表</title>
    <link rel="stylesheet" type="text/css" href="css/edpc/flow.css">
    <link rel="stylesheet" type="text/css" href="css/edpc/iconfont.css">
    <link rel="stylesheet" type="text/css" href="lib/easyui1.3/themes/default/easyui.css">
	<link rel="stylesheet" type="text/css" href="css/hems/global.css">
	<link rel="stylesheet" type="text/css" href="css/common/querylist.css" />
    <script type="text/javascript" src="lib/moment.min.js"></script>
    <script type="text/javascript" src="lib/easyui1.3/jquery-1.8.0.min.js"></script>
    <script type="text/javascript" src="lib/easyui1.3/jquery.easyui.min.js"></script>
    <script type="text/javascript" src="lib/raphael-min.js"></script>
    <script type="text/javascript" src="lib/avalon1.4.8/avalon.js"></script>
    <script type="text/javascript" src="js/public.js"></script>
    <%@ include file="/WEB-INF/jsp/base/common_js.jsp" %>
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
            cursor: pointer;
            position: absolute;
            top: 10px;
            right: 160px;
            width: 140px;
            border-radius: 5px;
            color: #fff;
            background-color: #428bca;
            border-color: #357ebd;
            height: 32px;
            text-align: center;
            line-height: 32px;
        }
        .row .add-btn {
            cursor: pointer;
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
        <div class="add-btn" onclick="addNewPatient()">新增患者</div>
    </div>
    <div class="row">
        <div class="form-item">
            <label>姓名</label>
            <input type="text" placeholder="请输入姓名" ms-duplex-string="condition.cstNam"/>
        </div>
        <div class="form-item">
            <label>初步诊断</label>
            <select name="" ms-duplex="condition.cbzd" data-duplex-changed="selectchange">
                <option value="">请选择</option>
                <option ms-repeat="cbzdArr" ms-attr-value="el.infocode">{{el.info}}</option>
            </select>
        </div>
        <div class="form-item">
            <div class="btn-group">
                <div class="btn Search" ms-click="radioClick('advSearch')" ms-class="{{advSearch ? 'active' : ''}}">高级查询</div>
<%--                <div class="btn">疑问病历</div>--%>
            </div>
        </div>
    </div>
    <div ms-if="advSearch" class="row">
        <div class="form-item">
            <label>来院方式</label>
            <select name="" ms-duplex="condition.ddfs" data-duplex-changed="selectchange">
                <option value="">请选择</option>
                <option ms-repeat="ddfsArr" ms-attr-value="el.infocode">{{el.info}}</option>
            </select>
        </div>
        <div class="form-item">
            <label>出车单位</label>
            <select name="" ms-duplex="condition.ccdw" data-duplex-changed="selectchange">
                <option value="">请选择</option>
                <option ms-repeat="ccdwArr" ms-attr-value="el.infocode">{{el.info}}</option>
            </select>
        </div>
        <div class="form-item">
            <label>溶栓地点</label>
            <select name="" ms-duplex="condition.yqrscs" data-duplex-changed="selectchange">
                <option value="">请选择</option>
                <option ms-repeat="yqrscsArr" ms-attr-value="el.infocode">{{el.info}}</option>
            </select>
        </div>
    </div>
    <div ms-if="advSearch" class="row">
        <div class="form-item">
            <label>开始时间</label>
            <input type="text" class="input-date Wdate" ms-duplex-string="condition.startDate"
                   onclick="WdatePicker({dateFmt:'yyyy/MM/dd HH:mm'})" placeholder="请输入开始时间"/>
        </div>
        <div class="form-item">
            <label>结束时间</label>
            <input type="text" class="input-date Wdate" ms-duplex-string="condition.endDate"
                   onclick="WdatePicker({dateFmt:'yyyy/MM/dd HH:mm'})" placeholder="请输入结束时间"/>
        </div>
    </div>
</div>
<table id="dg"></table>
</body>
<script>
	var cbzdArr = publicFun.getDict('XT_CBZD_COD');
	var ddfsArr = publicFun.getDict('XT_DDFS_COD');
	var ccdwArr = publicFun.getDict('XT_CCDW_COD');
	var yqrscsArr = publicFun.getDict('XT_YQRSCS_COD');
	var height = $('#container').height()
    var vm = avalon.define({
        $id: 'list',
        advSearch: false,//高级查询
        condition: {
            cstNam: '',//姓名
            cbzd: '',//初步诊断
            dyfs: "",//到达方式
            ccdw: '',//出车单位
            yqrscs: '',//溶栓场所
            startDate: '',//开始时间
            endDate: '',//结束时间
        },
        cbzdArr: cbzdArr || [],//初步诊断下拉选项数据
        ddfsArr: ddfsArr || [],//来院方式下拉选项数据
        ccdwArr: ccdwArr || [],//来院方式下拉选项数据
        yqrscsArr: yqrscsArr || [],//溶栓场所下拉选项数据
        selectchange: function (a) {
            // console.log(this)
        },
       

    });
	function radioClick(prop) {
	    vm[prop] = !vm[prop];
		if(vm[prop]==true){
			var h =height - 144;
			$("#dg").height(h);
			$('.datagrid-wrap').height(h)
		}else{
			var h2 = height - 56;
			$("#dg").height(h2);
			$('.datagrid-wrap').height(h2)
		}
	}

    function search() {
        var queryParams = $('#dg').datagrid('options').queryParams;
        queryParams['cstNam'] = vm.condition.cstNam;
        queryParams['cbzd'] = vm.condition.cbzd;
        queryParams['dyfs'] = vm.condition.ddfs;
        queryParams['ccdw'] = vm.condition.ccdw;
        queryParams['yqrscs'] = vm.condition.yqrscs;
        queryParams['startDate'] = vm.condition.startDate;
        queryParams['endDate'] = vm.condition.endDate;
        $("#dg").datagrid('reload');
    }
    function addNewPatient(){
        createmodalwindow("新增院内/绕行发病患者", 430, 300, '${baseurl}cpc/toadd.do', 'no');
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

    function toDetail(emgSeq,cstNam,wayTyp,regSeq) {
        var url = 'cpc/toXtxqPage.do?emgSeq=' + emgSeq+'&wayTyp='+wayTyp +'&regSeq=' +regSeq;
        if(cstNam=='null'){
        	cstNam = "";
        }
        window.top.addTab( cstNam +"-"+ '胸痛上报' , url, 'icon icon-emergency-record');
    }
	//查看时间轴
	function toCpcTimeline(emgSeq,cstNam,wayTyp, regSeq) {
		var url = 'cpc/toCpcTimeline.do?emgSeq=' + emgSeq+'&wayTyp='+wayTyp +'&regSeq=' +regSeq;
		if(cstNam=='null'){
			cstNam = "";
		}
		window.top.addTab( cstNam +"-"+ '胸痛急救时间轴' , url, 'icon icon-emergency-record');
	    }

    function delPatient(emgSeq) {
        var result = window.confirm('是否删除该条数据？');
        if (result){
            $.ajax({
                url: '${baseurl}hzszyyemg/delzyyemgSubmit.do',
                type: 'post',
                dataType: 'json',
//                 contentType: 'application/json;charset=UTF-8',
                data: {
                    'emgSeq': emgSeq
                },
                success:function (res) {
                    if (res.resultInfo.success){
                        search();
                    }
                }
            })
        }
    }

    $(function () {
		if(vm.advSearch==false){
			h3 = height-56;
			$("#dg").height(h3);
			$('.datagrid-wrap').height(h3)
		}
        $('#dg').datagrid({
            url: '${baseurl}cpc/getXtPatientList.do',
            queryParams: {
                'cstNam': vm.condition.cstNam,
                'cbzd': vm.condition.cbzd,
                'dyfs': vm.condition.dyfs,
                'ccdw': vm.condition.ccdw,
                'yqrscs': vm.condition.yqrscs,
                'startDate': vm.condition.startDate,
                'endDate': vm.condition.endDate
            },
            striped: true,
            singleSelect: true,
            pagination: true,
            rownumbers: true,
            pageList: [20, 30, 50],
            columns: [ [
                {
                    field : 'smtSeq',
                    title : '填报编号',
                    width : setWidth(0.1)
                },
            	{
					field : 'wayTyp',
					title : '患者类型',
					width : setWidth(0.05),
					formatter : function(value, row, index) {
						if (value == 0) {
							return '分诊';
						} else if (value == 1) {
							return '绕行';
						} else if (value == 2) {
							return '院内发病';
						}
					}
				},
				{
					field : 'cstNam',	
					title : '姓名',
					width : setWidth(0.08)
				},
				{
					field : 'cstSexCod',
					title : '性别',
					width : setWidth(0.05),
					formatter : function(value, row, index) {
						if (value == 0) {
							return '男'
						} else if (value == 1) {
							return '女'
						}
					}
				},
				{
					field : 'cstAge',
					title : '年龄',
					width : setWidth(0.05),
					formatter : function(value, row, index) {
						return value==null?'-':value + '岁';
					}
				},
				{
					// field : 'emgDat',
                    field : 'scyljcsj',
					title : '首次医疗接触',
					width : setWidth(0.1),
					formatter : function(value, row, index) {
						return publicFun.timeFormat(new Date(value), 'yyyy/MM/dd hh:mm');
					}
				},
				{
					field : 'fbsj',
					title : '发病时间',
					width : setWidth(0.1)
				},
				{
					field : 'cbzd',
					title : '诊断',
					width : setWidth(0.1),
					formatter : function(value, row, index) {
						return publicFun.codingEscape(cbzdArr,value);
					}
				},
                {
                    field : 'smtSta',
                    title : '状态',
                    width : setWidth(0.05),
                    formatter : function(value, row, index) {
                        if (value == 1) {
                            return '未上报'
                        } else if (value == 2) {
                            return '上报中'
                        } else if (value == 3) {
                            return '上报失败'
                        } else if (value == 4) {
                            return '上报驳回'
                        } else if (value == 5) {
                            return '上报完成'
                        }
                    }
                },
                {
                    field : 'crtTim',
                    title : '建档时间',
                    width : setWidth(0.1),
                    formatter : function(value, row, index) {
                        return publicFun.timeFormat(new Date(value), 'yyyy/MM/dd hh:mm');
                    }
                },
				{
					field : 'repDoc',
					title : '管床医生',
					width : setWidth(0.08),
				},
				{
					field : 'dd',
					title : '操作',
					width : setWidth(0.14),
					formatter : function(value, row, index) {
                        console.log('row', row);
                        var _html = '<span class="btn detail" onclick="toDetail(\'' + row.emgSeq + '\',\'' + row.cstNam + '\',\'' + row.wayTyp + '\',\'' + row.regSeq + '\')">查看</span>' +
						'<span class="btn Timeline" onclick="toCpcTimeline(\'' + row.emgSeq + '\',\'' + row.cstNam + '\',\'' + row.wayTyp + '\',\'' + row.regSeq + '\')">时间轴</span>';
							// var _html = '<span class="btn detail" onclick="toDetail(\'' + row.emgSeq + '\')">查看</span>' +
							// 	'<span class="btn del" onclick="delPatient(\'' + row.emgSeq + '\')">删除</span>';
						return _html
					}
				}
			]]
        });
    })
</script>
</html>