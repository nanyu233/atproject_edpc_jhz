<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/base/tag.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
  <%@ include file="/WEB-INF/jsp/base/common_css.jsp"%>
  <link rel="stylesheet" type="text/css" href="${baseurl}css/common/querylist.css" />
  <link rel="stylesheet" type="text/css" href="${baseurl}css/hzszyyhems/hljl.css?98">
  <%@ include file="/WEB-INF/jsp/base/common_js.jsp"%>
  <script language="javascript" src="${baseurl}Lodop6.216/LodopFuncs.js"></script>
  <title>洗胃护理记录单</title>
</head>

<body class="bqhlby complexHeaderTab">
  <div class="tabdataDiv xtpgxqDiv queryTabs">
    <table id="recordList"></table>
  </div>
  <form id="recordDeleteForm" action="${baseurl}zyytshljld/deleteXwhljldSubmit.do" method="post">
    <input type="hidden" id="xwhiSeq" name="hspXwhljldInfCustom.xwhiSeq" />
  </form>
  <!-- 打印洗胃护理记录单 -->
  <jsp:include page="/WEB-INF/jsp/hzszyyhospital/hzszyyxtpg/xtpg/xwHljl/printXwRecord.jsp"></jsp:include>
  <script type="text/javascript">
    var comdata = parent.comdata;

    function addRecord(){
      createmodalwindow('新增洗胃护理记录', 820, 610, '${baseurl}zyytshljld/toEditXwhljld.do?emgSeq=' + comdata.emgSeq+'&xwhiSeq=', 'no');
    }

    function editRecord(){
      var row = $('#recordList').datagrid('getSelected');
      if (GridUtils.checkChecked(row)) {
        createmodalwindow('新增洗胃护理记录', 820, 610, '${baseurl}zyytshljld/toEditXwhljld.do?emgSeq=' + comdata.emgSeq+'&xwhiSeq='+row.xwhiSeq, 'no');
      }
    }

    //删除 回调
    function del_callback(data) {
      if (data.resultInfo && data.resultInfo.messageCode == '109') {
        message_alert(data, function () {
          window.location.href = "${baseurl}first.do";
        });
      } else {
        message_alert(data);
        var type = data.resultInfo.type;
        if (type == 1) {
          reload();
          setTimeout("$('.messager-body').window('close')", 1000);
        }
      }
    }

    function delRecord(){
      var row = $('#recordList').datagrid('getSelected');
      if (GridUtils.checkChecked(row)) {
        _confirm('确定删除该数据吗？', null, function () {
          $("#xwhiSeq").val(row.xwhiSeq);
          jquerySubByFId('recordDeleteForm', del_callback, null, "json");
          $('#recordList').datagrid('clearSelections');
        });
      }
    }

    function getWidth(proportion) {
      var width = $("body").width();
      return Math.round(proportion * width);
    }
    
    //查询方法
    function reload() {
      $('#recordList').datagrid('reload');
    }

    function getColumns() {
      //datagrid列定义
      var columns_v = [[
        {
          field:'xwhiSeq',
          hidden:true
        },
        {
          field: 'assDat',
          title: '时间',
          align: 'center',
          width: getWidth(0.08),
          formatter:function(value,row,index){
            return(publicFun.timeFormat(new Date(value), "yyyy/MM/dd hh:mm"))
          }
        },
        {
          field: 'hrtRte',
          title: 'HR',
          align: 'center',
          width: getWidth(0.05)
        },
        {
          field: 'sbpUpNbr',
          title: 'BP',
          align: 'center',
          width: getWidth(0.08),
          formatter:function(value,row,index){
            if(row.sbpUpNbr != null && row.sbpDownNbr != null){
              return row.sbpUpNbr+'/'+row.sbpDownNbr
            }else if(row.sbpUpNbr != null){
              return row.sbpUpNbr+'/'
            }else if(row.sbpDownNbr != null){
              return '/'+row.sbpDownNbr
            }
          }
        },
        {
          field: 'breNbr',
          title: 'RR',
          align: 'center',
          width: getWidth(0.05)
        },
        {
          field: 'spo2',
          title: 'SPO2',
          align: 'center',
          width: getWidth(0.05)
        },
        {
          field: 'dwDes',
          title: '毒物',
          align: 'center',
          width: getWidth(0.07)
        },
        {
          field: 'xwyDes',
          title: '洗胃液',
          align: 'center',
          width: getWidth(0.13)
        },
        {
          field: 'xwyWd',
          title: '温度',
          align: 'center',
          width: getWidth(0.05)
        },
        {
          field: 'xwyRl',
          title: '入量',
          align: 'center',
          width: getWidth(0.04)
        },
        {
          field: 'xcyYs',
          title: '洗出液颜色',
          align: 'center',
          width: getWidth(0.07)
        },
        {
          field: 'xcyXz',
          title: '洗出液性质',
          align: 'center',
          width: getWidth(0.07)
        },
        {
          field: 'zztzDes',
          title: '症状体征',
          align: 'center',
          width: getWidth(0.13)
        },
        {
          field: 'crtName',
          title: '护士签名',
          align: 'center',
          width: getWidth(0.08)
        }]
      ]
      return columns_v;
    }

    function getToolbars() {
      var toolbars = [
        {
          text: '新增',
          iconCls: 'icon-add',
          handler: function () { addRecord(); }
        }, {
          text: '修改',
          iconCls: 'icon-edit',
          handler: function () { editRecord(); }
        }, {
          text: '删除',
          iconCls: 'icon-cancel',
          handler: function () { delRecord(); }
        }, {
          text: '打印',
          iconCls: 'icon-print',
          handler: function () { printTable(); }
        },
        {
          text: '刷新',
          iconCls: 'icon-reload',
          handler: function () { getTabList(); }
        }
      ]
      return toolbars;
    };

    function getTabList() {
      var height;
      if (parent._JJBheight) {
        height = parent._JJBheight - 27
      } else {
        height = 0.975 * ($("#tabs", parent.parent.parent.document).height() - 28 - 29) - 27;
      }
      $("#recordList").height(height);
      $('#recordList').datagrid({
        nowrap: false,
        striped: true,
        singleSelect: true,
        url: '${baseurl}zyytshljld/queryXwhljld_result.do',
        idField: 'xwhiSeq',
        loadFilter: function (data) {
          if (data.resultInfo && data.resultInfo.messageCode == '109') {
            message_alert(data, function () {
              window.location.href = "${baseurl}first.do";
            });
          }
          return data;
        },
        loadMsg: '',
        columns: getColumns(),
        pagination: true,
        rownumbers: true,
        pageList: [50, 70, 90],
        toolbar: getToolbars(),
        queryParams: {
          "hspXwhljldInfCustom.emgSeq": comdata.emgSeq
        },
        loadFilter: function (data) {
          if (data.resultInfo && data.resultInfo.messageCode == '109') {
            message_alert(data, function () {
              window.location.href = '${baseurl}/first.do';
            });
          }
          return data;
        },
        onDblClickRow: function (rowIndex, rowData) {
          editRecord()
        }
      });
    }

    $(function () {
      getTabList();
    });

  </script>
</body>
</html>