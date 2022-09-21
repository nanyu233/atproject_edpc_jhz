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
  <title>系统评估</title>
</head>

<body class="xypgby">
  <div class="xtpgtabdataDiv xtpgxqDiv queryTabs">
    <table id="xtpglist"></table>
  </div>
  <form id="xtpgdeleteform" action="${baseurl}zyyxtpg/deletextpg.do" method="post">
    <input type="hidden" id="delete_id" name="xtpgSeq" />
  </form>

  <script type="text/javascript">
    var comdata = parent.comdata;
    $(function () {
      init();
    });

    function init() {
      getXtpgTab();
    }

    function getWidth(proportion) {
      var width = $("body").width();
      return Math.round(proportion * width);
    }

    function reload() {
      $('#xtpglist').datagrid('reload');
    }

    //获取系统评估datagrid表
    function getXtpgTab() {
      var height = 0.975 * ($("#tabs", parent.parent.parent.document).height() - 28 - 29) - 27;
      $("#xtpglist").height(height);
      $("#emgSeq").attr("name", "hspXtpgInfCustom.emgSeq");
      $('#xtpglist').datagrid({
        nowrap: false,
        striped: true,
        singleSelect: true,
        url: '${baseurl}zyyxtpg/queryxtpg_result.do',
        idField: 'crtDat',
        loadFilter: function (data) {
          if (data.resultInfo && data.resultInfo.messageCode == '109') {
            message_alert(data, function () {
              window.location.href = "${baseurl}/first.do";
            });
          }
          return data;
        },
        loadMsg: '',
        columns: getColumns(),
        pagination: true,
        rownumbers: true,
        pageList: [20, 30, 50],
        toolbar: getToolbars(),
        queryParams: {
          "hspXtpgInfCustom.emgSeq": comdata.emgSeq
        },
        onDblClickRow: function (rowIndex, rowData) {
          parent.parent.parent.opentabwindow(comdata.cstNam + "-" + '系统评估单修改', "${baseurl}zyyxtpg/editxtpg.do?xtpgSeq=" + rowData.xtpgSeq + "&emgSeq=" + rowData.emgSeq + "&th=" + new Date().getTime(), "0");
        }
      });
    }

    //新增系统评估
    function addxtpg() {
      var row = $('#xtpglist').datagrid('getSelected');
      parent.parent.parent.opentabwindow(comdata.cstNam + "-" + '系统评估单新增', "${baseurl}zyyxtpg/addxtpg.do?emgSeq=" + comdata.emgSeq + "&th=" + new Date().getTime(), "0");
    }

    //修改系统评估
    function editxtpg() {
      var row = $('#xtpglist').datagrid('getSelected');
      if (GridUtils.checkChecked(row)) {
        parent.parent.parent.opentabwindow(comdata.cstNam + "-" + '系统评估单修改', "${baseurl}zyyxtpg/editxtpg.do?xtpgSeq=" + row.xtpgSeq + "&emgSeq=" + row.emgSeq + "&th=" + new Date().getTime(), "0");
      }
    }

    //删除 统一用form
    function deletextpg() {
      var row = $('#xtpglist').datagrid('getSelected');
      if (GridUtils.checkChecked(row)) {
        _confirm('确定删除该数据吗？', null, function () {
          $("#delete_id").val(row.xtpgSeq);
          jquerySubByFId('xtpgdeleteform', xtpgdel_callback, null, "json");
        });
      }
    }

    //评估datagrid按钮
    function getToolbars() {
      var toolbars = [
        {
          text: '新增', iconCls: 'icon-add',
          handler: function () { addxtpg(); }
        },
        {
          text: '修改', iconCls: 'icon-edit',
          handler: function () { editxtpg(); }
        },
        {
          text: '删除', iconCls: 'icon-cancel',
          handler: function () { deletextpg(); }
        }
      ];
      return toolbars;
    }

    //删除的回调函数
    function xtpgdel_callback(data) {
      message_alert(data);
      var type = data.resultInfo.type;
      if (type == 1) {
        $('#xtpglist').datagrid('clearSelections');
        reload();
      }
    }

    function getColumns() {
      //datagrid列定义
      var columns_v = [
        [{
          field: 'crtDat', title: '创建时间', width: getWidth(0.1),
          formatter: function (value, row, index) {
            return publicFun.timeFormat(value, "yyyy-MM-dd hh:mm");
          }
        },
        { field: 'emgSeq', title: '预检号', width: 0, hidden: 'true', },
        { field: 'xtpgSeq', title: '系统评估号', width: 0, hidden: 'true', },
        { field: 'xtpgJlhz', title: '评估情况', sortable: true, width: getWidth(0.80), },
        { field: 'xtpgHs', title: '护士', width: getWidth(0.08), }
        ]
      ];
      return columns_v;
    }
  </script>
</body>

</html>