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
	<link rel="stylesheet" type="text/css" href="${baseurl}lib/easyui1.3/themes/icon.css">
    <script type="text/javascript" src="lib/moment.min.js"></script>
    <script type="text/javascript" src="lib/easyui1.3/jquery-1.8.0.min.js"></script>
    <script type="text/javascript" src="lib/easyui1.3/jquery.easyui.min.js"></script>
    <script type="text/javascript" src="lib/raphael-min.js"></script>
    <script type="text/javascript" src="lib/avalon1.4.8/avalon.js"></script>
    <script type="text/javascript" src="js/public.js"></script>
    <%@ include file="/WEB-INF/jsp/base/common_js.jsp" %>
	<script type="text/javascript" src="js/edpc/crfplane/crfplane.js"></script>
    <style>

        .form {
            border: 1px solid #eeeeee;
            width: 100%;
            position: relative;
        }

        .form .row {
            margin: 5px 0;
            /*border: 1px solid red;*/
        }

        .form .row .form-item {
            /* width: 24%; */
            display: inline-block;
            vertical-align: middle;
        }

        .form-item label {
            /* display: inline-block;
            width: 90px; */
            text-align: right;
            margin-left: 10px;
            font-size: 12px;
        }

        .form-item input,
        .form-item select {
            /* width: calc(100% - 110px); */
            height: 24px;
            padding: 3px 3px;
            font-size: 12px;
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
            font-size: 12px;
        }

        .row .search-btn {
            cursor: pointer;
            position: absolute;
            right: 20px;
            width: 80px;
            border-radius: 5px;
            color: #fff;
            background-color: #428bca;
            border-color: #357ebd;
            height: 24px;
            text-align: center;
            line-height: 24px;
						font-size: 12px;
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

        .pagination-page-list {
            width: 45px;
        }

        .datagrid-wrap {
            position: relative;
        }

        .datagrid-pager {
            position: absolute;
            bottom: 0;
            width: 100%;
        }

        .datagrid-body {
            overflow: auto;
        }
		.queryTabs .datagrid-body, .norowTab .datagrid-body, .datagrid-body {
			width: 100% !important;
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
							<label>来院方式</label>
							<select name="" ms-duplex="condition.dyfs" data-duplex-changed="selectchange">
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

	//选择序列集合
	var chkRegSeqArr;

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
        queryParams['dyfs'] = vm.condition.dyfs;
        queryParams['ccdw'] = vm.condition.ccdw;
        queryParams['yqrscs'] = vm.condition.yqrscs;
        queryParams['startDate'] = vm.condition.startDate;
        queryParams['endDate'] = vm.condition.endDate;
        $("#dg").datagrid('reload');
    }
    <%--function cmdaddNewPatient(){--%>
    <%--    createmodalwindow("新增院内/绕行发病患者", 430, 300, '${baseurl}cpc/toadd.do', 'no');--%>
    <%--}--%>


    //设置表格的列宽
    //pct --- 百分比（取小于1的小数）
    function setWidth(pct) {
        var pWidth = $('body').width();
				return Math.round(pct * pWidth);
    }

    function toDetail(emgSeq,cstNam,wayTyp,regSeq) {
		window.sessionStorage.removeItem('currentIframeSrc' + regSeq)
        var url = 'cpc/toXtxqList.do?emgSeq=' + emgSeq+'&wayTyp='+wayTyp +'&regSeq=' +regSeq + '&cstNam=' + cstNam;
        if(cstNam=='null'){
        	cstNam = "";
        }
        window.top.addTab( cstNam +"-"+ '胸痛患者详情' , url, 'icon icon-emergency-record');
    }
	//查看时间轴
	function toCpcTimeline(emgSeq,cstNam,wayTyp, regSeq) {
		var url = 'cpc/toCpcTimeline.do?emgSeq=' + emgSeq+'&wayTyp='+wayTyp +'&regSeq=' +regSeq;
		if(cstNam=='null'){
			cstNam = "";
		}
		window.top.addTab( cstNam +"-"+ '胸痛急救时间轴' , url, 'icon icon-emergency-record');
	}

	function toAddyjqd(regSeq, cstNam, patTyp, cstAge, cstSexCod) {
		cstNam = (cstNam == null || cstNam == 'null') ? '' : cstNam
		var url = 'yjqd/addyjqd.do?regSeq=' + regSeq +
            '&cstNam=' + cstNam + '&patTyp=' + patTyp +
            '&cstSexCod=' + cstSexCod + '&cstAge=' + cstAge
		createmodalwindow(cstNam +"-"+ '一键启动', 600, 720, url);
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

    <%--/**--%>
    <%-- * 提交审核--%>
    <%-- */--%>
    <%--function reviewApply(regSeq, rcdSta) {--%>
    <%--    _confirm('确认提交审核？', null, function() {--%>
    <%--        var requestData = {--%>
    <%--            'regSeq': regSeq,--%>
    <%--            'rcdSta': "2"--%>
    <%--        };--%>
    <%--        publicFun.httpRequest(--%>
    <%--            '${baseurl}crfplane/reviewSubmit.do',--%>
    <%--            requestData,--%>
    <%--            {--%>
    <%--                'ajaxType': 'post',--%>
    <%--                'requestType': 'json'--%>
    <%--            },--%>
    <%--            function (res) {--%>
    <%--                if (res.resultInfo.success){--%>
    <%--                    search();--%>
    <%--                }--%>
    <%--            }--%>
    <%--        )--%>
    <%--    });--%>
    <%--}--%>
    //审核页面用

    <%--function chkConfirm(regSeq, rcdSta) {--%>
    <%--    chkRegSeqArr = [regSeq];--%>
    <%--    if(chkRegSeqArr.length > 0) {--%>
    <%--        createmodalwindow("审核确认", 430, 300, '${baseurl}crfplane/toChkConfirm.do?', 'no');--%>
    <%--    }--%>
    <%--}--%>

	/**
	 * 批量审核
	 */
    function cmdbatchChkConf() {
        chkRegSeqArr = [];
        var chkRows = $('#dg').datagrid("getChecked");
        chkRows.forEach(function(chkRow){
            if(chkRow.rcdSta === '2'){
                chkRegSeqArr.push(chkRow.regSeq);
            }
        })
        if(chkRegSeqArr.length > 0) {
            createmodalwindow("审核确认", 430, 300, '${baseurl}crfplane/toChkConfirm.do', 'no');
        } else {
            alert_warn("不存在需要审核记录！")
        }
    }

	function cmdexportXtPatinets() {
		var result = window.confirm('是否导出胸痛患者列表？');
		if (result){
			$.ajax({
				url: '${baseurl}cpc/exportXtPatinets.do',
				type: 'post',
				dataType: 'json',
                   contentType: 'application/json;charset=UTF-8',
				data: JSON.stringify({
					hspDbzlBasQueryDto :{
						hspDbzlBasCustom : {

						},
						// 'startDate': new Date()
					}
				}),
				success:function (res) {
					if (res.resultInfo.success){
						search();
						alert_success("导出成功！")
					}
				}
			})
		}
	}
    <%--function smtPort(regSeq, smtSta) {--%>
    <%--    var tipMsg = "确认上报？";--%>
    <%--    if(smtSta === '5') {--%>
    <%--        tipMsg = "确认重新上报？";--%>
    <%--    }--%>
    <%--    _confirm(tipMsg, null, function() {--%>
    <%--        //虚化--%>
    <%--        $("<div class=\"datagrid-mask\"></div>").css({display:"block",width:"100%",height:$(window).height()}).appendTo("body");--%>
    <%--        $("<div class=\"datagrid-mask-msg\"></div>").html("正在上报，请稍候。。。").appendTo("body").css({display:"block","line-height": "11px",left:($(document.body).outerWidth(true) - 190) / 2});--%>
    <%--        var requestData = {--%>
    <%--            'regSeq': regSeq,--%>
    <%--            'smtSta': "2"--%>
    <%--        };--%>
    <%--        publicFun.httpRequest(--%>
    <%--            '${baseurl}crfplane/reportSubmit.do',--%>
    <%--            requestData,--%>
    <%--            {--%>
    <%--                'ajaxType': 'post',--%>
    <%--                'requestType': 'json'--%>
    <%--            },--%>
    <%--            function (res) {--%>
    <%--                //虚化结束--%>
    <%--                $("body").children("div.datagrid-mask-msg").remove();--%>
    <%--                $("body").children("div.datagrid-mask").remove();--%>
    <%--                search();--%>
    <%--                message_alert(res)--%>
    <%--            }--%>
    <%--        )--%>
    <%--    });--%>
    <%--}--%>
    $(function () {
		if(vm.advSearch==false){
			h3 = height-56;
			$("#dg").height(h3);
			$('.datagrid-wrap').height(h3)
		}
		var toolbar_v
		publicFun.ajaxVal('${moduleid}', toolbar_v, callBack);
		function callBack(toolbar_v) {
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
				toolbar:toolbar_v,
				striped: true,
				singleSelect: false,
				pagination: true,
				rownumbers: true,
				pageList: [20, 30, 50],
				columns: [ [
					{
						field: "regSeq",
						title:"",
						checkbox: true
					},
					{
						field : 'wayTyp',
						title : '患者类型',
						width : setWidth(0.035),
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
						width : setWidth(0.055)
					},
					{
						field : 'cstSexCod',
						title : '性别',
						width : setWidth(0.02),
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
						align : 'right',
						width : setWidth(0.03),
						formatter : function(value, row, index) {
							return value==null?'-':value;
						}
					},
					{
						field : 'fbsj',
						title : '发病时间',
						width : setWidth(0.063)
					},
					{
						// field : 'emgDat',
						field : 'scyljcsj',
						title : '首次医疗接触',
						width : setWidth(0.063),
						formatter : function(value, row, index) {
							if (value) {
								return publicFun.timeFormat(new Date(value), 'yyyy/MM/dd hh:mm');
							}
						}
					},
					{
						field : 'cbzd',
						title : '诊断',
						width : setWidth(0.03),
						formatter : function(value, row, index) {
							return publicFun.codingEscape(cbzdArr,value);
						}
					},
					{
						field : 'crtTim',
						title : '建档时间',
						width : setWidth(0.063),
						formatter : function(value, row, index) {
							return publicFun.timeFormat(value, 'yyyy/MM/dd hh:mm');
						}
					},
					{
						field : 'rcdSta',
						title : '审核状态',
						align : 'center',
						width : setWidth(0.04),
						formatter : function(value, row, index) {
							if (value == 1) {
								return '记录中'
							} else if (value == 2) {
								return '审核中'
							} else if (value == 3) {
								return '被驳回'
							} else if (value == 4) {
								return '已审核'
							}
						}
					},
					{
						field : 'chkTim',
						title : '审核时间',
						width : setWidth(0.063),
						formatter : function(value, row, index) {
							return publicFun.timeFormat(value, 'yyyy/MM/dd hh:mm');
						}
					},
					{
						field : 'chkNam',
						title : '审核人',
						width : setWidth(0.04)
					},
					{
						field : 'chkMsg',
						title : '审核意见',
						width : setWidth(0.04)
					},
					{
						field : 'smtSta',
						title : '上报状态',
						align : 'center',
						width : setWidth(0.04),
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
						field : 'smtTim',
						title : '上报时间',
						width : setWidth(0.063),
						formatter : function(value, row, index) {
							return publicFun.timeFormat(value, 'yyyy/MM/dd hh:mm');
						}
					},
					{
						field : 'smtSeq',
						title : '填报编号',
						width : setWidth(0.05)
					},
					{
						field : 'smtMsg',
						title : '上报信息',
						width : setWidth(0.06)
					},
					{
						field : 'dd',
						title : '操作',
						width : setWidth(0.18),
						formatter : function(value, row, index) {
							var _html = '<span class="btn detail" onclick="toDetail(\'' + row.emgSeq + '\',\'' + row.cstNam + '\',\'' + row.wayTyp + '\',\'' + row.regSeq + '\')">查看</span>' +
								'<span class="btn Timeline" onclick="toCpcTimeline(\'' + row.emgSeq + '\',\'' + row.cstNam + '\',\'' + row.wayTyp + '\',\'' + row.regSeq + '\')">时间轴</span>' +
								'<span class="btn detail" onclick="toAddyjqd(\'' + row.regSeq + '\',\'' + row.cstNam + '\',\'' + row.patTyp + '\', \'' + row.cstAge + '\', \'' + row.cstAgeCod + '\')">一键启动</span>'

							if("1" == row.rcdSta || "3" == row.rcdSta) {
								_html += '<span class="btn detail" onclick="reviewApply(\'' + row.regSeq + '\',\'' + row.rcdSta + '\')">申请审核</span>'
							} else if("2" == row.rcdSta) {
								_html += '<span class="btn detail" onclick="chkConfirm(\'' + row.regSeq + '\')">审核</span>'
							}
							if("4" == row.rcdSta) {
								_html += '<span class="btn detail" onclick="chkRowBak(\'' + row.regSeq + '\',\'' + row.smtSta + '\')">解锁</span>'
								_html += '<span class="btn detail" onclick="smtPort(\'' + row.regSeq + '\',\'' + row.smtSta + '\',\'' + row.patTyp + '\')">上报</span>'
							}
							return _html
						}
					}
				]]
			});

		}
    })
</script>
</html>
