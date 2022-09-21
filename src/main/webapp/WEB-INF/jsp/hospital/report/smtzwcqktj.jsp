<%@ page language="java" import="java.util.*" pageEncoding="UTF8"%>
<%@ include file="/WEB-INF/jsp/base/tag.jsp"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>

<head>
<title>急诊科患者生命体征完成情况统计</title>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<%@ include file="/WEB-INF/jsp/base/common_css.jsp"%>
<%@ include file="/WEB-INF/jsp/base/common_js.jsp"%>
<link rel="stylesheet" href="${baseurl}css/common/highcharts.css"
	type="text/css" />
<link rel="stylesheet" href="${baseurl}css/hems/global.css"
	type="text/css" />
</head>

<body class="gkhzjztjt">
	<script src="${baseurl}lib/avalon1.4.8/avalon.js" type="text/javascript" charset="UTF-8"></script>
	<script src="${baseurl}lib/highcharts5.0.7/code/highcharts.js" type="text/javascript"></script>
	<script src="${baseurl}lib/highcharts5.0.7/code/modules/drilldown.js" type="text/javascript"></script>
	<script src="${baseurl}lib/highcharts5.0.7/code/modules/exporting.js" type="text/javascript"></script>
	<script src="${baseurl}lib/highcharts5.0.7/code/highcharts-zh_CN.js" type="text/javascript"></script>

	<script type="text/javascript">
		//enter按键默认触发查询
		$(document).keydown(function(event) {
			switch (event.keyCode) {
			case 13:
				btnsearch()
				return false;
			}
		});
       
        $(function() {
            init();
    		$(window).resize(function() {
    			btnsearch()
    		});
        });

		function init() {
			$('#emglistbox').hide();
		    var height = 0.75 * ($("#tabs", parent.document).height());
		    $("#smtzwcqktjlist").height(height);
		    var heightchart = height - 67;
		    $("#container").height(heightchart);
		    setTime()
		    getMsgList()
		    getData();
		}
		      
		function setTime() {
			var nowTime = new Date();
			var startdate = publicFun.timeFormat(nowTime - 24 * 60 * 60 * 1000, "yyyy/MM/dd hh:mm:ss");
		    var enddate = publicFun.timeFormat(nowTime, "yyyy/MM/dd hh:mm:ss");
		    $("#startdate").val(startdate);
		    $("#enddate").val(enddate);
		}
      
		function getMsgList() {
			$.ajax({
				url: "${baseurl}compctl/getJzksCompctlList.do",
				type: 'POST',
				success: function(data) {
					vm.getMsg.jzkscompctlList = data;
				}
			});
		}
		//获取传给后端的参数
		function getQueryParams() {
			var queryParams = $("#smtzwcqktjform").serializeJson();;
			console.log(queryParams)
			return queryParams;
		}
		
		/**
	     * 患者明细
	     */
	    function jzhzmx(){
	  	    var formdata = $("#smtzwcqktjform").serializeJson();
	        var startdate, enddate, halfdate, ksfz = "firstHalf";
	        startdate = formdata.startdate;
	        enddate = formdata.enddate;
	        ksfz = formdata.ksfz;
	        var seriesId = formdata.seriesId;
	        var infocode = formdata.infocode;
	        var emgFkCod = formdata.emgFkCod;
	        var emgFkName = formdata.emgFkName;
	        if (!startdate) {
	          publicFun.alert('开始时间不能为空');
	          return false;
	        }
	        parent.opentabwindow("患者明细",
	          '${baseurl}report/smtzhzlb.do?startdate=' + startdate + '&enddate=' + enddate + '&ksfz=' + ksfz + '&seriesId=' + seriesId + '&infocode=' + infocode + '&emgFkCod=' + emgFkCod + '&emgFkName=' + emgFkName, '2');
	    }
	    
		// toolbar工具定义
        function getToolbar() {
            var toolbar_v = [{
                id: '',
                text: '导出',
                iconCls: 'icon-redo',
                handler: function() {
                    _confirm('您确认导出吗？', null, function() {
                        btnexport()
                    });
                }
            }, {
	          id: 'exportPat',
	          text: '患者明细',
	          iconCls: 'icon-add',
	          handler: function () {
	          	jzhzmx()
	          }
      	   }];
            return toolbar_v
        }
        // 报表datagrid列定义
        function getColumns() {
            var columns_v = [
                [{
                    field: 'info',
                    title: '生命体征',
                    width: getWidth(0.25)
                }, {
                    field: 'finished',
                    title: '已录入',
                    width: getWidth(0.25)
                }, {
                    field: 'unfinished',
                    title: '未录入',
                    width: getWidth(0.25)
                }]
            ];
            return columns_v;
        }
		
		// 获取图表及表格数据
		function getData() {
			$('#smtzwcqktjlist').datagrid({
				title: '急诊科患者生命体征完成情况统计',
				nowrap: true,
				striped: true,
				singleSelect: true,
				rownumbers: true,
				toolbar: getToolbar(),
				url: '${baseurl}report/querysmtzwcqktj.do',
				onLoadSuccess: function(data) {
					loadChart(data.rows, "column");
				},
				idField: 'info',
				queryParams: getQueryParams(),
				loadMsg: 'loading...',
				columns: getColumns()
			});
		}
		
		// 导出
		function btnexport() {
			jquerySubByFId('smtzwcqktjform', smtzwcqktjExprot_callback, null, "json");
		}
		
		// 导出回调
		function smtzwcqktjExprot_callback(data) {
			// 在这里提示信息中有文件下载链接
			message_alert(data);
		}

		// 加载急诊科患者生命体征完成情况统计图表数据
		function loadChart(rows, chartstype) {
			var finished = new Array();		// 已录入数组
			var unfinished = new Array();	// 未录入数组
			var categories = new Array();	// X轴坐标	['体温', '心率', '呼吸', '收缩压', '舒张压', '血氧饱和度']
			$.each(rows, function(ind, val) {
				categories.push(val);
				finished.push(val.finished);
				unfinished.push(val.unfinished);
			});
			$('#container').highcharts({
				chart: {
					type: chartstype,
					backgroundColor: '#e4efff'
				},
				title: {
					text: vm.hideMsg.emgFkName
				},
				xAxis: {
					categories: categories,
					labels: {
						formatter: function() {
							return this.value.info;
						} 
					}
				},
				yAxis: {
					min: 0,
					allowDecimals: false,
					title: {
						text: '人数'
					},
					stackLabels: {
						enabled: true,
						style: {
 							fontWeight: 'bold',
          					color: (Highcharts.theme && Highcharts.theme.textColor) || 'gray'
          				}
					}
				},
				legend: {
					itemStyle: {
						fontSize: '12px'
					},
				},
				exporting: {
					enabled: false
				},
				tooltip: {
					formatter: function() {
						return '<span style="color:' + this.series.color + '">' + this.x.info + '</span><br/>'
							 + '<span style="color:' + this.series.color + '">' + this.series.name + ': </span>'
							 + '<span style="color:' + this.series.color + '">' + this.y  + ' (' + Highcharts.numberFormat(this.percentage, 2) + '%)<span><br/>'
							 ;
					},
					userHTML: true
				},
				plotOptions: {
					column: {
          				stacking: 'normal',
          				dataLabels: {
          					enabled: true,
          					color: (Highcharts.theme && Highcharts.theme.dataLabelsColor) || 'white',
          					style: {
          						// 如果不需要数据标签阴影，可以将 textOutline 设置为 'none'
          						textOutline: '1px 1px black'
          					}
          				},
          				cursor: 'pointer',
          				events: {
          					click: function(event) {
          						// infocode		|{'tmp':'体温', 'hrt':'心率', 'bre':'呼吸', 'sbpup':'收缩压', 'sbpdown':'舒张压', 'bld':'血氧饱和度'}
          						var infocode = event.point.category.infocode;
          						// seriesId		|{'1':'已录入', '0':'未录入'}
          						var seriesId = this.userOptions.id;
          						vm.hideMsg.infocode = infocode;
          						vm.hideMsg.seriesId = seriesId;
          						queryEmgList();
          					}
          				}
          			}
				},
				credits: {
					enabled: false
				},
				series: [{
					id: '1',
					name: '已录入',
					data: finished
				}, {
					id: '0',
					name: '未录入',
					data: unfinished
				}]
			});
		}

		function getWidth(proportion) {
			var width = $("body").width() * 0.29 - 4;
			return Math.round(proportion * width);
		}
		
		function getWidth1(proportion) {
			var width = $("body").width() - 4;
			return Math.round(proportion * width);
		}
		
		// 查询方法
		function btnsearch() {
			getData();
		}

		// 页面刷新调用方法
        function reload() {
        	btnsearch();
        }
		
		function toggle() {
			$('#chartbox').toggle();
			$('#emglistbox').toggle();
		}
		
		
		
    </script>
	<form ms-controller="smtzwcqktj" id="smtzwcqktjform" action="${baseurl}report/exportSmtzwcqktjlistSubmit.do" method="post">
		<input class="hidden" type="text" name="infocode" ms-duplex-string="hideMsg.infocode" />
		<input class="hidden" type="text" name="seriesId" ms-duplex-string="hideMsg.seriesId" />
		<!-- html的静态布局 -->
		<!-- 查询条件 -->
			<div class="form clr">
				   <ul class="querylist-ul form_hc">	
                        <li>
                         	<p class="form-text">&emsp;急诊科室：</p>
                        	<select class="departments" id="emgFkCod" name="emgFkCod" ms-duplex-string="hideMsg.emgFkCod">
                           		 <option value="">请选择</option>
                          	 	 <option ms-repeat="getMsg.jzkscompctlList" ms-attr-value="el.comno">{{el.comcname}}</option>
                       		</select>
                        		<input class="hidden" type="text" name="emgFkName" ms-duplex-string="hideMsg.emgFkName" />
						</li>
					   	<li>
							<p class="form-text">查询时间：</p>
							<input type="text" class="medical-time Wdate" style="width:150px" id="startdate" name="startdate" 
								onfocus="WdatePicker({dateFmt:'yyyy/MM/dd HH:mm:ss',readOnly:true,maxDate:'#F{$dp.$D(\'enddate\')}'})" /> 
							<p class="form-text">-</p>
							<input type="text" class="medical-time Wdate" style="width:150px" id="enddate" name="enddate" 
								onfocus="WdatePicker({dateFmt:'yyyy/MM/dd HH:mm:ss',readOnly:true,minDate:'#F{$dp.$D(\'startdate\')}',maxDate:'%y/%M/%d'})" />
						</li>
						<li>
							<span class="f-left">&emsp;是否包含快速分诊： </span>
	                        <input type="checkbox" id="ksfz" ms-click="negationKsfz()" style="vertical-align: middle;" />
	                        <input class="hidden" type="text" name="ksfz" ms-duplex-string="hideMsg.ksfz" value="0"/>
                     	</li>
						<li class="queryuser-btn m-l5">
							<a href="#" id="search" onclick="btnsearch()" class="easyui-linkbutton" iconCls="icon-search" id="btn">查询</a>
						</li>
					</ul>
			</div>
	</form>
	<div class="chart_grp chartbox" id="chartbox">
		<div class="form_cat border-radius box-shadow">
			<p class="chart_title">急诊科患者生命体征完成情况统计</p>
			<!-- <hr class="hr"/> -->
			<div id="container" class="chart_div"></div>
		</div>
		<!-- 查询列表 -->
		<div class="list_table" id="list_table">
			<table id="smtzwcqktjlist"></table>
		</div>
	</div>
	<div class="chart_grp chartbox" id="emglistbox">
		<div class="list_table" style="width: 92%;">
			<table id="emglist"></table>
		</div>
	</div>
</body>
<script type="text/javascript">
	var vm = avalon.define({
		$id: 'smtzwcqktj',
		getMsg: {
			jzkscompctlList: []
		},
		hideMsg: {
			emgFkCod: '',
			emgFkName: '全部急诊科室',
			ksfz: '0',
			infocode: '',
			seriesId: ''
		},
		negationKsfz: function() {
			if(vm.hideMsg.ksfz === '0') {
				vm.hideMsg.ksfz = '1'
			} else {
				vm.hideMsg.ksfz = '0'
			}
		}
	});
   
	vm.hideMsg.$watch('emgFkCod', function(newVal, oldVal) {
		if(newVal) {
			$.each(vm.getMsg.jzkscompctlList, function(ind, val) {
				if(newVal == val.comno) {
   					vm.hideMsg.emgFkName = val.comcname;
   				}
   			});
   		} else {
   			vm.hideMsg.emgFkName = '全部急诊科室';
   		}
   	});
</script>
</html>