<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/base/tag.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<!-- 引用jquery easy ui的js库及css -->
<%@ include file="/WEB-INF/jsp/base/common_css.jsp"%>
<%@ include file="/WEB-INF/jsp/base/common_js.jsp"%>
<link rel="stylesheet" type="text/css" href="${baseurl}css/hems/healthedu.css" />
<title>健康教育</title>
</head>

<body class="healthedu">
    <script type="text/javascript">
    //enter按键默认触发查询
   /* $(document).keydown(function(event) {
        switch (event.keyCode) {
        case 13:
            queryhealthedu();
        }
    }); */
    function reload() {
    	//initemg();
    	initedu();
    }
    var emgSeqOl='${emgSeq}';
    
    /**
     * [setLayout 初始化布局]
     */
     function setLayout() {
         var _width = 170;
         $('#emglist').width(_width);
         $('.leftPart').width(_width);
     }

        //datagrid列定义
         var columns_v_emg = [
            [{
                field: 'emgDepCod',
                title: '',
                width: getWidth(0.02),
                formatter:function(value, row, index) {
                     return " ";
                },
                styler: function(value, row, index) {
                    if (value == "0") {
                        return 'background:url(../images/hems/nurse/oneC.png);background-repeat: no-repeat;background-position: 6px;    background-size: 12px 12px;color:transparent;';
                    } else if (value == "1") {
                        return 'background:url(../images/hems/nurse/twoC.png);background-repeat: no-repeat;background-position: 6px;    background-size: 12px 12px;color:transparent;';
                    } else if (value == "2") {
                        return 'background:url(../images/hems/nurse/threeC.png);background-repeat: no-repeat;background-position: 6px;    background-size: 12px 12px;color:transparent;';
                    } else if (value == "3" || value == "4") {
                        return 'background:url(../images/hems/nurse/fourC.png);background-repeat: no-repeat;background-position: 6px;    background-size: 12px 12px;color:transparent;';
                    }
                }
            },{
                field: 'emgSeq',
                title: 'emgSeq',
                width: getWidth(0.2),
                hidden: true,
            }, {
                field: 'cstNam',
                title: '姓名',
                width: getWidth(0.06),
            }]];
        var columns_v_edu = [
            [{
                field: 'eduSeq',
                title: 'eduSeq',
                width: getWidth(0.2),
                hidden: 'true',
            }, {
                field: 'eduDatStr',
                title: '教育时间',
                width: getWidth(0.09),
                sortable: true,
            }, {
                field: 'eduContStr',
                title: '教育内容',
                width: getWidth(0.12),
                sortable: true,
            }, {
                field: 'eduItemStr',
                title: '项目',
                width: getWidth(0.12),
                sortable: true,
            }, {
                field: 'eduObjStr',
                title: '教育对象',
                width: getWidth(0.05),
                sortable: true,
            }, {
                field: 'eduTimeStr',
                title: '教育时机',
                width: getWidth(0.05),
                sortable: true,
            }, {
                field: 'eduMethodStr',
                title: '教育方法',
                width: getWidth(0.08),
                sortable: true,
            }, {
                field: 'eduResStr',
                title: '效果评价',
                width: getWidth(0.05),
                sortable: true,
            }, {
                field: 'eduOther',
                title: '备注',
                width: getWidth(0.25),
            }]
        ];
        
        var toolbar_v_edu = [{
            id: '',
            text: '新增',
            iconCls: 'icon-edit',
            handler: function() {
            	cmdadd();
            }
        },{
            id: '',
            text: '删除',
            iconCls: 'icon-cancel',
            handler: function() {
            	cmddel();
            }
        }];

    function initedu() {
    	var emgSeq=$('#emgSeq').val();
    	setLayout();
        var height = 0.975 * ($("#tabs", parent.document).height() - 20);
        $("#healthedulist").height(height);
        $('#healthedulist').datagrid({
            nowrap: false,
            striped: true,
            singleSelect: true,
            url: '${baseurl}healthedu/queryhealtheducate_result.do',
            idField: 'eduSeq',
            loadMsg: '',
            title: "健康教育信息列表",
            columns: columns_v_edu,
            //pagination: true,
            rownumbers: true,
            //pageList: [15, 30, 50],
            toolbar: toolbar_v_edu,
            queryParams: {
            	"hspHealtheduInfCustom.emgSeq":emgSeq
            }
        });
        var _thisWidth = ($("#tabs", parent.document).width())- 195;
        $('.rightPart .panel-header,.rightPart .datagrid-wrap.panel-body,.rightPart .easyui-panel.panel-body,.rightPart .datagrid-header').css('width',''+ _thisWidth +'');
    }
    function initemg() {
    	var _emgSeq=$('#emgSeq').val();
    	setLayout();
        var height = 0.975 * ($("#tabs", parent.document).height() - 20);
        $("#emglist").height(height);
        $('#emglist').datagrid({
            nowrap: true,
            striped: true,
            singleSelect: true,
            url: '${baseurl}healthedu/findEmgListInQjs.do',
            idField: 'emgSeq',
            loadMsg: '',
            title: "患者列表",
            columns: columns_v_emg,
            //pagination: true,
            rownumbers: true,
            //pageList: [15, 30, 50],
            queryParams: {
            	"emgSeq":emgSeqOl
            },
            onLoadSuccess: function(data) {
            	var rows=data.rows;
            	var namIndex=0;
            	//计算默认患者列表索引
            	for(var i = 0; i < rows.length; i++){
            		if(_emgSeq==rows[i].emgSeq){
            			namIndex=i;
            			break;
            		}
            	}
            	$('#emglist').datagrid('selectRow',namIndex);
            },
            onClickRow: function(rowIndex, rowData) {
            	$('#emgSeq').val(rowData.emgSeq);
            	initedu();
            }
        });
    }

    function getWidth(proportion) {
        var width = $("body").width();
        return Math.round(proportion * width);
    }

    //加载datagrid
    $(function() {
    	$("#emgSeq").val(emgSeqOl);
    	initemg();
    	initedu();
        $(window).resize(function() {
            initedu();
        });
    });

    //查询方法
    function queryhealthedu() {
        var formdata = $("#healtheduqueryForm").serializeJson();
        $('#healthedulist').datagrid('load', formdata);
    }

    //新增
    function cmdadd() {
    	var emg_Seq=$('#emgSeq').val();
        createmodalwindow("健康教育项目选择", 975, 505, '${baseurl}healthedu/toaddhealtheducate.do?emgSeq='+emg_Seq, 'no');
    }

    //删除 统一用form
    function cmddel() {
        var node = $('#healthedulist').datagrid('getSelected');
        if (GridUtils.checkChecked(node)) {
            deletehealthedu(node.eduSeq);
        }
    }
    //删除的回调函数
    function healthedudel_callback(data) {
        message_alert(data);
        var type = data.resultInfo.type;
        if (type == 1) {
            $('#healthedulist').datagrid('clearSelections');
            queryhealthedu();
        }
    }

    //删除 统一用form
    function deletehealthedu(eduSeq) {
        _confirm('确定删除该数据吗？', null, function() {
            $("#delete_id").val(eduSeq);
            jquerySubByFId('healthedudeleteform', healthedudel_callback, null, "json");
        });
    }

    </script>
    <!-- html的静态布局 -->
    <form id="healtheduqueryForm">
        <!-- 查询列表 -->
        <input id="emgSeq" name="hspHealtheduInfCustom.emgSeq" type="hidden" />
        <div class="leftPart">
        	<table id="emglist"></table>
        </div>
        <div class="rightPart">
            <table id="healthedulist"></table>
        </div>
    </form>
    <form id="healthedudeleteform" action="${baseurl}healthedu/healtheducate_delete.do" method="post">
        <input type="hidden" id="delete_id" name="eduSeq" />
    </form>
</body>

</html>