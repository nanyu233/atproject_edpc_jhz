<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/base/tag.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <title>检验信息</title>
    <%@ include file="/WEB-INF/jsp/base/common_css.jsp"%>
    <link rel="stylesheet" type="text/css" href="${baseurl}styles/common/iconfont.css">
    <link rel="stylesheet" type="text/css" href="${baseurl}styles/hems/global.css">
    <link rel="stylesheet" type="text/css" href="${baseurl}styles/eicu/eicu_common.css"/>
    <%@ include file="/WEB-INF/jsp/base/common_js.jsp"%>
    <script type="text/javascript" src="${baseurl}Lodop6.216/LodopFuncs.js"></script>
    <script src="${baseurl}js/subpageJs/eicu/eicuUtil.js" type="text/javascript"></script>
    
    <style>
      /*datagrid表头样式重置*/
      .datagrid-view2 .datagrid-header .datagrid-cell {
        line-height: 1;
        height: auto;
      }
      .datagrid-wrap.panel-body.panel-body-noheader {
        border-top: none;
      }
      html {
        overflow: hidden;
      }
      .icu-card {
        border: none;
      }
      .icu-card-title {
        margin-bottom: 0;
        border: 1px solid rgb(149, 184, 231);
        border-radius: 7px 7px 0 0;
      }
      .icu-card-body {
        padding: 0;
      }

      .icu-main-content {
        border-bottom: none;
        border-right: none;
      }

      .inspect-box {
        display: inline-block;
        vertical-align: top;
        width: 56%;
        margin-top: 5px;
        /* padding-top: 10px; */
        padding-left: 2px;
      }
      .inspect-box:first-child {
        width: 42%;
      }
      .inspect-total-box {
        margin-left: 7px;
        margin-right: 7px;
      }

      /* 上下限箭头 */
      .dtl-item-value {
        display: flex;
        align-items: center;
        width: 100%;
      }

      .dtl-item-value .unit {
        padding-right: 10px;
        flex: 1;
        text-align: right;
      }

      .arrow-mark {
        margin-right: 10px;
        font-size: 16px;
      }

      .value-content {
        width: 50px;
        margin-right: 7px;
      }
    </style>
</head>

<body class="examinebody tabsBody">
    <script type="text/javascript">
        var _baseUrl;
        _baseUrl = "${baseurl}";
		var pageMode = 'basic';
		
        function setLayout() {
            var windowsWidth = parent.$('#mainIfream').width(),
                windowsHeigt = parent.$('#mainIfream').height();
            if(!windowsWidth){
            	windowsWidth = 1200,
                windowsHeigt = 600;
	        }
            $('#mainexaminelist').width(450).height(windowsHeigt - 87);
            $('#examinelist').width(windowsWidth - 330).height(windowsHeigt - 87);
            $('#examinelist_mark').width(windowsWidth - 330).height(windowsHeigt - 87);
            console.log(windowsWidth, "windowsWidth")
        }
        //enter按键默认触发查询
        $(document).keydown(function (event) {
            switch (event.keyCode) {
                case 13:
                    jzjlquery()
            }
        });

        function reload() {
            $('#mainexaminelist').datagrid('reload');
            $('#examinelist').datagrid('reload');
        }

        /**
        * * 定义datagrid的内容field
        **/
        var columnse_v = [
            [{
                field: 'rownums',
                title: 'id',
                hidden: true
            },{
                field: 'mark',
                title: '',
                width: getWidth(0.04),
                align: 'center',
                formatter: function (value, row, idx) {
	                var boxClassStr = 'hover-icon-box ';
	                var boxTitle = '';
	                var iconClassStr = 'my-icon nav-icon iconfont icon-Collection';
	                var str = '';
	                if (value) {
	                  boxClassStr += 'danger-box';
	                  boxTitle = '取消关注';
	                  //   iconClassStr += 'text-danger';
	                } else {
	                  boxClassStr += 'light-box';
	                  boxTitle = '加入关注';
	                  //   iconClassStr += 'text-light';
	                }
	                str +=
	                  '<span class="' +
	                  boxClassStr +
	                  '" title="' +
	                  boxTitle +
	                  '" onclick="toggleInspFav(' +
	                  idx +
	                  ')">';
	                str += '<i class="' + iconClassStr + '"></i>';
	                str += '</span>';
	                return str;
              }
            }, {
                field: 'parentId',
                title: '预检号',
                width: getWidth(0.10),
                hidden: true
            }, {
                field: 'resultDateTime',
                title: '报告时间',
                width: getWidth(0.15),
                sortable: true,
                formatter: function (value, row, index) {
                    return value ? publicFun.timeFormat(new Date(value), "yyyy/MM/dd hh:mm:ss") : ""
                },
                hidden: true
            }, {
                field: 'examinaim',
                title: '样本类型',
                sortable: true,
                width: getWidth(0.15),
                hidden: true
            }, {
                field: 'reportItemName',
                title: '试验名称',
                sortable: true,
                width: getWidth(0.30)
            }, {
                field: 'result',
                title: '分析结果',
                sortable: true,
                width: getWidth(0.1),
                styler: function (value, row, index) {
                    if (row.lowerLimit && row.upperLimit) {
                        if (parseFloat(row.result) < parseFloat(row.lowerLimit) || parseFloat(row.result) > parseFloat(row.upperLimit)) {
                            return "color:red;";
                        } else {
                            return "";
                        }
                    } else {
                        return "";
                    }
                }
            }, {
                field: 'upperLimit',
                title: '参考范围高限',
                sortable: true,
                width: getWidth(0.15),
                styler: function (value, row, index) {
                    if (row.lowerLimit && row.upperLimit) {
                        if (parseFloat(row.result) < parseFloat(row.lowerLimit) || parseFloat(row.result) > parseFloat(row.upperLimit)) {
                            return "color:red;";
                        } else {
                            return "";
                        }
                    } else {
                        return "";
                    }
                }
            }, {
                field: 'lowerLimit',
                title: '参考范围低限',
                sortable: true,
                width: getWidth(0.15),
                styler: function (value, row, index) {
                    if (row.lowerLimit && row.upperLimit) {
                        if (parseFloat(row.result) < parseFloat(row.lowerLimit) || parseFloat(row.result) > parseFloat(row.upperLimit)) {
                            return "color:red;";
                        } else {
                            return "";
                        }
                    } else {
                        return "";
                    }
                }
            }, {
                field: 'units',
                title: '单位',
                sortable: true,
                width: getWidth(0.1),
                styler: function (value, row, index) {
                    if (row.lowerLimit && row.upperLimit) {
                        if (parseFloat(row.result) < parseFloat(row.lowerLimit) || parseFloat(row.result) > parseFloat(row.upperLimit)) {
                            return "color:red;";
                        } else {
                            return "";
                        }
                    } else {
                        return "";
                    }
                }
            }, {
                field: 'sampleno',
                title: '样例号',
                sortable: true,
                width: getWidth(0.10),
                hidden: true
            }]
        ];
        //加载datagrid
        function abntable() {
            //datagrid列定义
            var columns_v = [
                [{
                    field: 'parentId',
                    title: '预检号',
                    width: getWidth(0.10),
                    hidden: true
                }, {
                    field: 'resultDateTime',
                    title: '报告时间',
                    width: 125,
                    sortable: true,
                    formatter: function (value, row, index) {
                        return value ? publicFun.timeFormat(new Date(value), "yyyy/MM/dd hh:mm:ss") : ""
                    }
                }, {
                    field: 'examinaim',
                    title: '样本类型',
                    sortable: true,
                    width: 190
                }/* , {
                field: 'sjys',
                title: '送检医生',
                sortable: true,
                width: 55,
            }, {
                field: 'jyz',
                title: '检验者',
                sortable: true,
                width: 55,
            }, {
                field: 'shr',
                title: '审核人',
                sortable: true,
                width: 55,
            } */]
            ]

            setTime();
            var today = $("#emg_enddate").val();
            var startdate = $("#emg_startdate").val();
            $('#mainexaminelist').datagrid({
                nowrap: true,
                striped: true,
                singleSelect: true,
                url: '${baseurl}icucust/queryexamine_result.do',
                queryParams: {
                    "hspJyjgCustom.parentId": '${vstCad}',
                    "hspJyjgCustom.startdate": startdate,
                    "hspJyjgCustom.enddate": today
                },
                idField: 'parentId',
                columns: columns_v,
                rownumbers: true,
                onClickRow: function (rowIndex, rowData) {
                    var resultDateTime = publicFun.timeFormat(rowData.resultDateTime, "yyyy/MM/dd hh:mm:ss");
                    $('#examinelist').datagrid({
                        nowrap: true,
                        striped: true,
                        singleSelect: true,
                        url: '${baseurl}icucust/queryexamineinfo_result.do',
                        queryParams: {
                            "hspJyjgCustom.parentId": rowData.parentId,
                            "hspJyjgCustom.sampleno": rowData.sampleno,
                            "hspJyjgCustom.resultDateTime": resultDateTime
                        },
                        idField: 'rownums',
                        columns: columnse_v,
                        pagination: true,
                        rownumbers: true,
                        pageList: [20, 30, 50]
                    });
                }
            });
        };

        function init() {
        	pageMode = 'basic';
        	$("#subDiv_mark").hide();
        	$("#mainDiv").show();
        	$("#subDiv").show();
            abntable();
            $('#examinelist').datagrid({
                nowrap: false,
                striped: true,
                singleSelect: true,
                idField: 'rownums',
                loadMsg: '',
                columns: columnse_v,
                title: "检验信息",
                rownumbers: true
            });
            var _thisWidth = $('body').width();
            $('.subDiv .panel-header,.subDiv .datagrid-wrap.panel-body,.subDiv .easyui-panel.panel-body,.subDiv .datagrid-header').css('width', '' + _thisWidth - 475 + '');
        }
        
        function initMark(){
            pageMode = 'ana';
            setTime();
            var today = $("#emg_enddate").val();
            var startdate = $("#emg_startdate").val();
         	$("#subDiv_mark").show();
        	$("#mainDiv").hide();
        	$("#subDiv").hide();
        	$('#examinelist_mark').datagrid({
                  nowrap: true,
                  striped: true,
                  singleSelect: true,
                  url: '${baseurl}icucust/queryexamineinfo_result.do',
                  queryParams: {
                      "hspJyjgCustom.parentId": '${vstCad}',
                      "hspJyjgCustom.mark": '1',
                      "hspJyjgCustom.startdate": startdate,
                      "hspJyjgCustom.enddate": today
                  },
                  idField: 'rownums',
                  columns: columnse_v,
                  title: "检验信息-已收藏",
                  pagination: true,
                  rownumbers: true,
                  pageList: [20, 30, 50]
              });
            var _thisWidth = $('body').width();
            $('.subDiv .panel-header,.subDiv .datagrid-wrap.panel-body,.subDiv .easyui-panel.panel-body,.subDiv .datagrid-header').css('width', '' + _thisWidth - 475 + '');
        }

        function getWidth(proportion) {
            var width = $("body").width() * 0.62;
            return Math.round(proportion * width);
        }
        //查询方法
        function queryexamine() {
            var formdata = $("#examineForm").serializeJson();
            $('#mainexaminelist').datagrid('load', formdata);
        }

        function setTime() {
            var _startdate = publicFun.timeFormat('${emgDat}', "yyyy/MM/dd");
            var _enddate = publicFun.timeFormat('${cyrqDat}', "yyyy/MM/dd");
            if (_enddate == null || _enddate == '') {
                _enddate = publicFun.timeFormat(new Date(), "yyyy/MM/dd");
            }
            $("#emg_startdate").val(_startdate);
            $("#emg_enddate").val(_enddate);
        };
        $(function () {
            setLayout();
            initMark();
            $(window).resize(function () {
               initMark();
            });
        });
        
        
        //=====================================================================
         /**
	       * 切换关注
	       */
	      function toggleInspFav(idx) {
	        var $detailTable;
	        if (pageMode === 'basic') {
	          $detailTable = $('#examinelist');
	        } else if (pageMode === 'ana') {
	          $detailTable = $('#examinelist_mark');
	        }
	        var rowList = $detailTable.datagrid('getRows');
	        var rowData = rowList[idx];
	        var reqUrl = _baseUrl + 'icucust/updateHspJyjgByMerge.do';
	        var reqParams = {
		        hspJyjgCustom:{
		            parentId:rowData.parentId,
					name:rowData.name,
					sampleno:rowData.sampleno,
					result:rowData.result,
					resultDateTime:rowData.resultDateTime,
					upperLimit:rowData.upperLimit,
					lowerLimit:rowData.lowerLimit,
					reportItemName:rowData.reportItemName,
					units:rowData.units,
					examinaim:rowData.examinaim,
					mark:rowData.mark?'':'1'          		
		        }         		
	        };
	        // $detailTable.datagrid('selectRow', idx);
	        publicFun.httpRequest(
	          reqUrl,
	          reqParams,
	          {
	            requestType: 'json'
	          },
	          function (res) {
	            if (!res.resultInfo.success) {
	              alert_warn('请求出错，请联系系管理员');
	              return;
	            }
		          $detailTable.datagrid('reload');	            
	          }
	        );
	      }
        //=====================================================================
    </script>
    <form id="examineForm">
        <!-- html的静态布局 -->
        <!-- 查询条件 -->
        <input type="hidden" id="parentId" name="hspJyjgCustom.parentId" value="${vstCad}" />
        <div class="form clr" style="margin:1px">
            <p class="form-text">日期：</p>
            <input class="input-date Wdate" id="emg_startdate" type="text" name="hspJyjgCustom.startdate"
                onclick="WdatePicker({dateFmt:'yyyy/MM/dd'})">
            <p class="form-text">-</p>
            <input class="input-date Wdate" id="emg_enddate" type="text" name="hspJyjgCustom.enddate"
                onclick="WdatePicker({dateFmt:'yyyy/MM/dd'})">
            <a href="#" class="easyui-linkbutton" iconCls="icon-search" id="btn" onclick="queryexamine()">查询</a>
            <label style="margin-left:5px;">
	            <input id="ana" type="radio" name="lookType" checked onclick="initMark()"> 已收藏
            </label>
            <label style="margin-left:5px;">
	            <input id="basic" type="radio" name="lookType" onclick="init()">普通模式
            </label>            
        </div>
        <!-- 查询列表 -->
    </form>
    <div id="mainDiv" class="mainDiv">
        <table id="mainexaminelist"></table>
    </div>
    <div id="subDiv" class="subDiv">
        <table id="examinelist"></table>
    </div>
    
    <div id="subDiv_mark" class="subDiv">
        <table id="examinelist_mark"></table>
    </div>
    
    <div class="btnPos">
        <!-- <a href="javascript:;" class="commonbtn" onclick="printnote()">打印</a> -->
    </div>
    <div style="display:none">
        <div id="printnoteA" class="print-body" style="display:block;float:left;width:210mm;font-family:'微软雅黑';">
            <p style="margin:0;padding:1mm 0 0 0;text-align:center;font-size:.42cm;line-height:1.5;">
                湖&emsp;州&emsp;市&emsp;第&emsp;一&emsp;人&emsp;民&emsp;医&emsp;院</p>
            <p style="margin:2mm 0;padding:0;text-align:center;font-weight:700;font-size:.58cm;">检验信息</p>
            <ul class="print-ul">
                <li class="bordered">
                    <span class="basic-span">
                        <label class="title-label">姓名：</label>
                        <span>${hspemginfCustom.cstNam}</span>
                    </span>
                    <span class="basic-span">
                        <label class="title-label">性别：</label>
                        <span>${hspemginfCustom.cstSexCod}</span>
                    </span>
                    <span class="basic-span">
                        <label class="title-label">年龄：</label>
                        <span id="_age">${hspemginfCustom.cstAge}${hspemginfCustom.cstAgeCod}</span>
                    </span>
                    <span class="basic-span">
                        <label class="title-label">科别：</label>
                        <span id="_emgFkCod">${hspemginfCustom.emgFkCod}</span>
                    </span>
                    <span class="basic-span">
                        <label class="title-label">病床号：</label>
                        <span id="_emgBed">${hspemginfCustom.emgBed}</span>
                    </span>
                    <span class="basic-span">
                        <label class="title-label">卡号：</label>
                        <span id="_lgh">${hspemginfCustom.vstCad}</span>
                    </span>
                </li>
            </ul>
        </div>
        <div id="printnoteB" class="print-body" style="display:block;float:left;width:210mm;font-family:'微软雅黑';">
            <table id="printlist" class="printable">
                <colgroup>
                    <col width="14%" />
                    <col width="20%" />
                    <col width="24%" />
                    <col width="6%" />
                    <col width="6%" />
                    <col width="6%" />
                    <col width="6%" />
                    <!-- <col width="6%"/>
                    <col width="6%"/>
                    <col width="6%"/> -->
                </colgroup>
                <thead>
                    <tr>
                        <th>报告时间</th>
                        <th>样本类型</th>
                        <th>试验名称</th>
                        <th>分析结果</th>
                        <th>参考范围高限</th>
                        <th>参考范围低限</th>
                        <th>单位</th>
                        <!-- <th>送检医生</th>
                        <th>检验者</th>
                        <th>审核人</th> -->
                    </tr>
                </thead>
                <tbody>
                </tbody>
            </table>
        </div>
    </div>
    <script type="text/javascript">
        function setTable() {
            $("#printlist tbody").html("");
            $("#printlist tbody").append('<tr id="template"><td id="resultDateTime"></td><td id="examinaim"></td><td id="reportItemName"></td><td id="result"></td><td id="lowerLimit"></td><td id="upperLimit"></td><td id="units"></td></tr>');
            $('.print-ul').css({ "float": "left", "width": "90%", "font-size": "0.38cm", "margin": "0 5%", "padding": "0" });
            $('.print-ul span.basic-span').css({ "display": "inline-block", "margin-right": "3mm" });
            $('.printable').css({ "font-size": "3.3mm", "border": "1px solid #000", "width": "98%", "margin-left": "1%", "margin-top": "0mm", "border-collapse": "collapse" });
            $(".printable th").css({ "border": "1px solid #000" });
            $(".printable td").css({ "border": "1px solid #000", "text-align": "center" });
            $('span').css({ "display": "inline-block" });

            if ($('#_age').html() == '岁') {
                $('#_age').html("__/__");
            }
            if ($('#_emgFkCod').html() == '') {
                $('#_emgFkCod').html("__/__");
            }
            if ($('#_emgBed').html() == '') {
                $('#_emgBed').html("__/__");
            }
            if ($('#_lgh').html() == '') {
                $('#_lgh').html("__/__");
            }

            var today = $("#emg_enddate").val();
            var startdate = $("#emg_startdate").val();
            var _thisurl = "${baseurl}icucust/ajaxexamine.do?&hspJyjgCustom.parentId=" + '${vstCad}' + "&hspJyjgCustom.startdate=" + startdate + "&hspJyjgCustom.startdate=" + startdate;
            $.ajax({
                type: "POST",
                url: _thisurl,
                async: false,
                cache: false,
                contentType: false,
                processData: false,
                success: function (res) {
                    var list = res.resultInfo.sysdata.list;
                    var group = [];
                    $.each(list, function (idx, val) {
                        var row = $("#template").clone();
                        if (val['resultDateTime'] != null && val['resultDateTime'] != '') {
                            val['resultDateTime'] = publicFun.timeFormat(val['resultDateTime'], 'yyyy/MM/dd hh:mm')
                            row.find("#resultDateTime").text(val['resultDateTime']);
                        }
                        if (val['examinaim'] != null && val['examinaim'] != '') {
                            row.find("#examinaim").text(val['examinaim']);
                        }
                        group.push(val['sampleno']);
                        if (val['reportItemName'] != null && val['reportItemName'] != '') {
                            row.find("#reportItemName").text(val['reportItemName']);
                        }
                        if (val['result'] != null && val['result'] != '') {
                            row.find("#result").text(val['result']);
                        }
                        if (val['lowerLimit'] != null && val['lowerLimit'] != '') {
                            row.find("#lowerLimit").text(val['lowerLimit']);
                        }
                        if (val['upperLimit'] != null && val['upperLimit'] != '') {
                            row.find("#upperLimit").text(val['upperLimit']);
                        }
                        if (val['units'] != null && val['units'] != '') {
                            row.find("#units").text(val['units']);
                        }
                        /*  if(val['sjys'] != null && val['sjys'] != ''){
                             row.find("#sjys").text(val['sjys']);
                         }
                         row.find("#sjys").addClass("sjys"+idx);
                         if(val['jyz'] != null && val['jyz'] != ''){
                             row.find("#jyz").text(val['jyz']);
                         }
                         row.find("#jyz").addClass("jyz"+idx);
                         if(val['shr'] != null && val['shr'] != ''){
                             row.find("#shr").text(val['shr']);
                         }
                         row.find("#shr").addClass("shr"+idx); */
                        row.appendTo("#printlist");//添加到模板的容器中
                    })
                    /* for (var i = 0; i < group.length;) {
                        var count = 0;
                        for (var j = i; j < group.length; j++) {
                            if (group[i] == group[j]) {
                                count++;
                                if(count>=2){
                                    for(var m=1;m<count;m++){
                                        var _spc=i+m;
                                        $('.sjys'+ _spc).html('');
                                        $('.shr'+ _spc).html('');
                                        $('.jyz'+ _spc).html('');
                                    }
                                }
                            }
                        }
                        i += count;
                    }   */
                    var obj = document.getElementById("printlist");
                    obj.deleteRow(1);
                },
                error: function () {
                    $.messager.alert('提示信息', "页面加载失败！", 'error');
                }
            });
        }
        /**
        * [printnote 打印记录]
        */
        function printnote() {
            var allRows = $('#mainexaminelist').datagrid('getData')['rows'];
            if (allRows.length === 0) {
                // $.messager.alert('提示信息', '数据不存在', 'warning');
                return
            }
            try {
                setTable();
                LODOP = window.top.getLodop();
                // LODOP = getLodop();
                LODOP.PRINT_INITA(0, 0, "210mm", "297mm", "打印控件功能演示_Lodop功能_超文本内容缩放打印");
                LODOP.SET_PRINT_PAGESIZE(0, "210mm", "297mm", "");
                LODOP.SET_PRINT_MODE("NOCLEAR_AFTER_PRINT", true);

                LODOP.ADD_PRINT_HTM(1050, 344, "90%", "100%", "<font style='font-size:12px' format='0'><span tdata='pageNO'>第##页</span>/<span tdata='pageCount'>共##页</span></font>");
                LODOP.SET_PRINT_STYLEA(0, "ItemType", 1);
                LODOP.ADD_PRINT_TABLE(94, 0, "100%", "80%", document.getElementById("printnoteB").innerHTML);
                LODOP.NewPageA();
                LODOP.SET_PRINT_STYLE("FontSize", 10);
                //LODOP.SET_PRINTER_INDEX("DASCOM DL-630Z");
                LODOP.ADD_PRINT_HTM(3, 0, "100%", "100%", document.getElementById("printnoteA").innerHTML);
                LODOP.SET_PRINT_STYLEA(0, "ItemType", 1);
                LODOP.PREVIEW();
                //LODOP.PRINT();
            } catch (e) {
                $.messager.alert('提示信息', '数据存在某些问题，请刷新后重试', 'warning');
            }
        }
    </script>
</body>

</html>