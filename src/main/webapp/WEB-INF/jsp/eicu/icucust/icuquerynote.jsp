<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/base/tag.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <%@ include file="/WEB-INF/jsp/base/common_css.jsp"%>
    <link rel="stylesheet" type="text/css" href="${baseurl}styles/hems/global.css">
    <link rel="stylesheet" type="text/css" href="${baseurl}styles/hzszyyhems/hzszyydoctor/querycfjl.css">
    <%@ include file="/WEB-INF/jsp/base/common_js.jsp"%>
    <script type="text/javascript" src="${baseurl}Lodop6.216/LodopFuncs.js"></script>
    <title>护理记录单</title>
</head>

<body class="tabsBody">
    <script type="text/javascript">
        var _baseUrl;
        _baseUrl = "${baseurl}";

        function setLayout() {
            var windowsWidth = parent.$('#mainIfream').width(),
                windowsHeigt = parent.$('#mainIfream').height();
            if(!windowsWidth){
            	windowsWidth = 1200,
                windowsHeigt = 600;
	        }
            $('#notelist').height(windowsHeigt - 57);
        }
       //enter按键默认触发查询
       $(document).keydown(function(event) {
            switch (event.keyCode) {
            case 13:
                notequery();
            }
        });

        function reload() {
            $('#notelist').datagrid('reload');
        }

        function load2(){
        	var flag=null;
            var startdate = $("#emg_startdate").val();
        	var today = $("#emg_enddate").val();
            //datagrid列定义
            var columns_v = [
                [{
                    field: 'crtDat',
                    title: '创建时间',
                    width: getWidth(0.055),
                    formatter: function(value, row, index) {
                        return publicFun.timeFormat(value, "MM/dd hh:mm")
                    }
                },{
                    field: 'tmpNbr',
                    title: '体温(℃)',
                    width: getWidth(0.035),
                    
                }, {
                    field: 'bqhiSeq',
                    title: '标识',
                    width: getWidth(0.08),
                    hidden: 'true',
                }/* , {
                    field: 'hrtRte',
                    title: '脉搏(次/分)',
                    sortable: true,
                    width: getWidth(0.05),
                   
                } */, {
                    field: 'hrtRte',
                    title: '心率(次/分)',
                    sortable: true,
                    width: getWidth(0.05)
                }, {
                    field: 'breNbr',
                    title: '呼吸(次/分)',
                    sortable: true,
                    width: getWidth(0.05)
                }, {
                    field: 'sbp',
                    title: '血压(mmHg)',
                    sortable: true,
                    width: getWidth(0.057),
                   
                }, {
                    field: 'xy',
                    title: '血氧饱和度',
                    sortable: true,
                    width: getWidth(0.05),
                },{field: 'xt',title: '血糖(mmol/L)',sortable: true,width: getWidth(0.05),
	                formatter: function (value, row, index) {
	                    if(row.xtFlg == "3"){
	                        return "HI";
	                    }else if(row.xtFlg == "2"){
	                        return "LO";
	                    }else{
	                    	if(row.xtFlg =="1"&&value !=null){
	                       		return parseFloat(value).toFixed(1);
	                    	}else{
	                    		return null;
	                    	}
	                    }
	                }
	            }, {
                    field: 'senRctCod',
                    title: '意识',
                    sortable: true,
                    width: getWidth(0.05)
                }, {
                    field: 'rl',
                    title: '单位入量(ml)',
                    sortable: true,
                    width: getWidth(0.08)
                }, {
                    field: 'cl',
                    title: '单位出量(ml)',
                    sortable: true,
                    width: getWidth(0.08)
                }, {
                    field: 'jchl',
                    title: '基础护理',
                    sortable: true,
                    width: getWidth(0.10),
                  /*  formatter: function(value, row, index) {
                        if (value.substr(0,1) == ",") {
                            return value=value.substr(1);
                        }else if(value.substr(value.length-1,1) == ","){
                        	return value=value.substr(0,value.length-1);
                        }
                    },*/
                }, {field: 'bqgc',title: '病情观察、护理措施和效果',sortable: true,width: getWidth(0.24)
	            }, {
                    field: 'hsusrnames',
                    title: '护士签名',
                    sortable: true,
                    width: getWidth(0.05)
                }]
            ];
            var today = $("#emg_startdate").val();
            var starttime, endtime;
            starttime = $("#emg_startdate").val();
            endtime = $("#emg_enddate").val();
            var emgSeq = "${emgSeq}";
            var enterSource = "${enterSource}"
            var toolbar_v;
            var baseurl = "${baseurl}";
            var extraParms = "aaa";
            publicFun.ajaxVal(baseurl, extraParms, toolbar_v, callBack);
            
            function callBack(toolbar_v) {
            	$('#notelist').datagrid({
	                nowrap: true,
	                striped: true,
	                singleSelect: true,
	                url: '${baseurl}icucust/query_icu_hljld_result.do?today=' + today,
	                idField: 'crtDat',
	                loadMsg: '',
	                columns: columns_v,
	                title: "病情护理记录单",
	                nowrap:false,
	                pagination: true,
	                rownumbers: true,
	                pageList: [20, 30, 50],
	                toolbar: "#toolbar",
	                queryParams: {
	                	"startdate": starttime,
	                	"enddate": endtime,
	                	"enterSource":enterSource,
                        "hsphljldinfCustom.emgSeq":emgSeq
                 	},
                 	onDblClickRow :function(rowIndex,rowData){
                 		parent.opentabwindow('${cstNam}' + "-" + '护理记录单修改', "${baseurl}zjszyyhljld/edithljld.do?bqhiSeq=" + rowData.bqhiSeq +"&emgSeq="+rowData.emgSeq+"&th=" + new Date().getTime(),"0");
                    },
	            });
                var _thisWidth = $('body').width();
                $('.panel-header,.datagrid-wrap.panel-body,.easyui-panel.panel-body,.datagrid-header').css('width',''+ _thisWidth - 10 +'');
            }
         
        }
        
        function getWidth(proportion) {
            var width = $("body").width();
            return Math.round(proportion * width);
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
        //查询方法

        function notequery(){
        	load2();
        }

        function editnote(){
            var row = $('#notelist').datagrid('getSelected');
            if(GridUtils.checkChecked(row)) {
                parent.opentabwindow('${cstNam}' + "-" + '护理记录单修改', "${baseurl}zjszyyhljld/edithljld.do?bqhiSeq=" + row.bqhiSeq +"&emgSeq="+row.emgSeq+"&th=" + new Date().getTime(),"0");
            }
        }

        function delnote(){
            var row = $('#notelist').datagrid("getSelected");
            if (GridUtils.checkChecked(row)) {
                _confirm('您确认删除吗？', null, function() {
                    $("#bqhiSeq").val(row.bqhiSeq);
                    jquerySubByFId('notedeleteform', notedel_callback, null, "json");
                    $('#notelist').datagrid('clearSelections');
                });
            }
        }

        function notedel_callback(data){
            message_alert(data);
            var type = data.resultInfo.type;
            if (type == 1) {
                notequery();
            }
        }

        function addnote(emgSeq){            
            parent.opentabwindow('${cstNam}' + "-" + '护理记录单新增', "${baseurl}zjszyyhljld/addhljld.do?emgSeq=" + emgSeq +"&th=" + new Date().getTime(),"0");            
        }
        function sumnote(emgSeq){            
           // parent.opentabwindow('${cstNam}' + "-" + '出入量统计', "${baseurl}zjszyyhljld/addhljld.do?emgSeq=" + emgSeq +"&th=" + new Date().getTime(),"0");            
        	 createmodalwindow( "出入量统计", 300, 200, "${baseurl}zjszyyhljld/querysumcrl.do?emgSeq=" +emgSeq);
        }
        function export1(){
        	 jquerySubByFId('noteform', hljldExprot_callback, null, "json");
        }
        //导出回调
        function hljldExprot_callback(data) {
            //在这里提示信息中有文件下载链接
            message_alert(data);
        }
        
      //utf8和16进制相互转换
    	function hexToString(s1){
    	   var tmp2='',
    	       res='';
    	  for(i=0;i<s1.length;) {
    	     tmp2+='%'+s1.substring (i,i+=2);
    	  }
    	  res=decodeURI(tmp2);
    	  for (var int = 0; int < res.length/2; int++) {
    		  var len=res.indexOf('%');
    		if(res.indexOf('%')>-1){
    			var subStr=res.substring(len,len+3);
    			res=res.replace(subStr,',')
    		}else{
    			break;
    		}
    	  }
    	  return res; 
    	} 
      
        $(function() {
            setLayout();
            setTime();
        	load2();
            $(window).resize(function() {
                load2();
            });
        });
        
        /**
         * 打印病情护理记录单
         **/
         var LODOP;
         function printTable() {
             setTable();
             //打印预览
            LODOP = getLodop();
            LODOP.PRINT_INITA(0, 0, "210mm", "297mm", "打印控件功能演示_Lodop功能_超文本内容缩放打印");
            LODOP.SET_PRINT_PAGESIZE(2, "210mm", "297mm", "");
            LODOP.SET_PRINT_MODE("NOCLEAR_AFTER_PRINT", true);


            LODOP.ADD_PRINT_HTM("190mm", "140mm", "90%", "100%",
                "<font style='font-size:12px' format='0'><span tdata='pageNO'>第##页</span>/<span tdata='pageCount'>共##页</span></font>");
            LODOP.SET_PRINT_STYLEA(0, "ItemType", 1);
            LODOP.ADD_PRINT_TABLE(115, 0, "100%", "72%", document.getElementById("doc2").innerHTML);
            LODOP.NewPageA();
            LODOP.SET_PRINT_STYLE("FontSize", 10);
            //LODOP.SET_PRINTER_INDEX("DASCOM DL-630Z");
            LODOP.ADD_PRINT_HTM(10, 0, "100%", "100%", document.getElementById("doc1").innerHTML);
            LODOP.SET_PRINT_STYLEA(0, "ItemType", 1);
            LODOP.PREVIEW();
             //LODOP.PRINT();
         }

         function setTable() {
             $("#printlist tbody").html("");
             $("#printlist tbody").append('<tr id="template"><td id="crtDateStr"></td><td id="tmpNbrFlg"></td><td id="hrtRte"></td><td id="breNbrFlg"></td><td id="sbpNbrFlg"></td><td id="xyFlg"></td><td id="xtFlg"></td><td id="senRctCod"></td><td id="rl"></td><td id="cl"></td><td id="jchl"></td><td id="bqgc"></td><td id="hsusrnames" valign="top"></td></tr>');
             $('.printable').css({ "font-size": "3.3mm", "border": "1px solid #000", "width": "98%", "margin-left": "1%", "margin-top": "3mm", "border-collapse": "collapse" });
             $(".printable th").css({ "border": "1px solid #000" });
             $(".printable td").css({ "border": "1px solid #000", "text-align": "center" });
             $("#hsusrnames").css({ "text-align": "left" });
             $("#bqgc").css({ "text-align": "left" });
             //$('.stitle').css({"width":"9mm"});
             $('span').css({ "display": "inline-block" });
             $('.printul').css({ "float": "left", "margin-left": "1%", "margin-top": "3mm" });
             $('.printul li').css({ "list-style-type": "none" });
             var number = (new Date()).getTime(),
                 vurl = "${baseurl}zjszyyhljld/findPrinInf.do?&emgSeq=" + '${emgSeq}' + "&version=" + number;
             $.ajax({
                 type: "POST",
                 url: vurl,
                 async: false,
                 cache: false,
                 contentType: false,
                 processData: false,
                 success: function (res) {
                     var emg = res.resultInfo.sysdata.emg;
                     var printdata = res.resultInfo.sysdata.printlist;
                     setPrtable(printdata);
                     setPrmsg(emg);
                 },
                 error: function () {
                     $.messager.alert('提示信息', "页面加载失败！", 'error');
                 }
             });
         }

         function setPrtable(datas) {
             $.each(datas, function (i, data) {
                 var row = $("#template").clone();
                 var fieldList = ['crtDateStr', 'tmpNbrFlg', 'hrtRte', 'breNbrFlg', 'sbpNbrFlg', 'xyFlg', 'senRctCod', 'rl', 'cl', 'jchl', 'bqgc', 'hsusrnames','bqgcHex'];
                 $.each(fieldList, function (index, value) {
                	 if (data[value] !== null && data[value] !== '') {
                     	if (value === 'bqgc') {
                     		if (data['bqgc'].indexOf("？")>-1) {
                 				row.find('#' + value).text(data['bqgcHex']);
                 			} else {
                                 row.find('#' + value).text(data[value]);
                 			}
                     	} else {
                             row.find('#' + value).text(data[value]);
                     	}
                     }
                 })
                 row.appendTo("#printlist");//添加到模板的容器中
             });

             var obj = document.getElementById("printlist");
             obj.deleteRow(1);
         }

         function setPrmsg(datas) {
             if (datas != null && datas != "") {
                var fieldLists = ['emgFkName', 'cstNam', 'cstSexCod', 'emgBed', 'preDgnCod', 'qxZyh', 'cstAge']
                 $.each(fieldLists, function (index, value) {
                     if (datas[value] !== null && datas[value] !== '') {
                         if (value === 'cstAge') {
                             $('#' + value).html(datas[value] + datas['cstAgeCod']);
                         } else {
                             $('#' + value).html(datas[value]);
                         }
                     }
                 })
             }
            
         }
         
    </script>
    <form id="noteform" name="noteform" action="${baseurl}zjszyyhljld/exportHljldSubmit.do" method="post">
        <!-- html的静态布局 -->
        <!-- 查询条件 -->
        <p class="form-text hidden">日期：</p>
        <input class="input-date Wdate hidden" id="emg_startdate" type="text" name="startdate" onclick="WdatePicker({dateFmt:'yyyy/MM/dd',readOnly:true,maxDate:'#F{$dp.$D(\'emg_enddate\')}'})">
        <p class="form-text hidden">-</p>
        <input class="input-date Wdate hidden" id="emg_enddate" type="text" name="enddate" onclick="WdatePicker({dateFmt:'yyyy/MM/dd',readOnly:true,minDate:'#F{$dp.$D(\'emg_startdate\')}'})">
        <!-- 查询列表 -->
        <input type="hidden" name="hsphljldinfCustom.emgSeq" id="emgSeq" value="${emgSeq}"/>
        <div class="list_table list_div">
            <table id="notelist"></table>
            <div id="toolbar">
                <a href="#" class="easyui-linkbutton" iconCls="icon-add" plain="true" onclick="addnote('${emgSeq}')">新增</a>
                <a href="#" class="easyui-linkbutton" iconCls="icon-edit" plain="true" onclick="editnote()">修改</a>
                <a href="#" class="easyui-linkbutton" iconCls="icon-cancel" plain="true" onclick="delnote()">删除</a>
                <%-- <a href="#" class="easyui-linkbutton" iconCls="icon-redo" plain="true" onclick="export1()">导出</a>
                <a href="#" class="easyui-linkbutton" iconCls="icon-print" plain="true" onclick="printTable()">打印</a>
                <a href="#" class="easyui-linkbutton" iconCls="icon-edit" plain="true" onclick="sumnote('${emgSeq}')">出入量统计</a> --%>
            </div>
        </div>
        <div class="btnPos"> 
<!--         <a href="javascript:;" class="commonbtn" onclick="printTable()">打印</a> -->
    	</div>
    </form>
    <form id="notedeleteform" action="${baseurl}zjszyyhljld/delhljldSubmit.do" method="post">
        <input type="hidden" id="bqhiSeq" name="bqhiSeq" />
    </form>
    
     <div  style="display:none">
        <div id="doc1" style="display:block;float:left;width:210mm;" >
        	<jsp:include page="/WEB-INF/jsp/hzszyyhospital/printBasicInfo/printBasicInfoHb.jsp"></jsp:include>
<!--             <span style="text-align:center;font-size: 5mm;width:96%;margin-top:1mm">湖&nbsp;州&nbsp;市&nbsp;第&nbsp;一&nbsp;人&nbsp;民&nbsp;医&nbsp;院</span> -->
<!--             <span style="text-align:center;font-size: 5mm;width: 96%;margin:0mm auto">病情护理记录单</span> -->
            <ul style="width:98%;padding:0;font-size:3.3mm;" class="printul">
                <li style="font-weight:700">
                    <span>科室：</span><span style="margin-right:2mm;font-weight:400" id="emgFkName"></span>
                    <span>姓名：</span><span style="margin-right:2mm;font-weight:400" id="cstNam"></span>
                    <span>性别：</span><span style="margin-right:2mm;font-weight:400" id="cstSexCod"></span>
                    <span>年龄：</span><span style="margin-right:2mm;font-weight:400" id="cstAge"></span>
                    <span>床号：</span><span style="margin-right:2mm;font-weight:400" id="emgBed"></span>
                    <span>住院号：</span><span style="margin-right:2mm;font-weight:400" id="qxZyh"></span>
                    <span>初步诊断：</span><span style="width:50mm;font-weight:400" id="preDgnCod"></span>
                </li>
            </ul>
           </div> 
           <div id="doc2" style="display:block;float:left;width:210mm;">
            <table id="printlist" class="printable">
                <colgroup>
                    <col width="6%" />
                    <col width="4%"/> 
                    <col width="4%"/> 
                    <col width="4%"/> 
                    <col width="5.8%"/>
                    <col width="4%"/> 
                    <col width="3.8%"/> 
                    <col width="3.8%"/> 
                    <col width="5.8%"/>
                    <col width="5.8%"/>
                    <col width="6.8%"/>
                    <col width="37%"/>
                    <col width="9%"/>                   
                </colgroup>
                <thead>
                    <tr>
                        <th>时间</th>
                        <th>体温(℃)</th>
                        <th>心率(次/分)</th>
                        <th>呼吸(次/分)</th>
                        <th>血压(mmHg)</th>
                        <th>氧饱和度</th>
                        <th>血糖(mmol/L)</th>
                        <th>意识</th>
                        <th>单位入量(ml)</th>
                        <th>单位出量(ml)</th>
                        <th>基础护理</th>
                        <th>病情观察、护理措施和效果</th>
                        <th>护士签名</th>
                    </tr>
                </thead>
                <tbody>
                </tbody>
            </table>
            </div>
    </div>
    
</body>

</html>
