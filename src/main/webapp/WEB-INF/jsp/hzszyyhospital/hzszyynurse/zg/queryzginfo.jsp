<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/base/tag.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
  <%@ include file="/WEB-INF/jsp/base/common_css.jsp"%>
  <%@ include file="/WEB-INF/jsp/base/common_js.jsp"%>
  <title>科室列表</title>
</head>

<body>
  <!-- 查询列表 -->
  <div style="overflow: auto;">
    <table id="zglist" style="width: 855px;height:495px; overflow: auto;"></table>
  </div>
  <script type="text/javascript">
    //datagrid列定义
    var emgSeq = $("#emg_emgSeq", window.parent.document).val() || parent.parent.$('#emgSeq').val();
    $(function () {
      init();
    });

    function init() {
      $('#zglist').datagrid({
        nowrap: true,
        striped: true,
        singleSelect: true,
        url: '${baseurl}sql/querysql_result.do?emgSeq=' + emgSeq,
        idField: '1',
        loadMsg: '',
        columns: columns_v,
        toolbar: toolbar_v,
        pagination: false,
        rownumbers: true
      });
    }

    var columns_v = [
      [{
        field: 'sqlSeq',
        title: 'id',
        hidden: true
      }, {
        field: 'sqlDat',
        title: '转归日期 ',
        width: 150,
        formatter: function (value, row, index) {
          return value ? publicFun.timeFormat(value, 'yyyy/MM/dd hh:mm:ss') : '';
        }
      }, {
        field: 'sqlStaCod',
        title: '状态',
        hidden: true
      }, {
        field: 'sqlDepCod',
        title: '科室',
        hidden: true
      }, {
        field: 'sqlStaStr',
        title: '状态',
        width: 150
      }, {
        field: 'sqlDepName',
        title: '转归去向',
        width: 250,
        formatter: function (value, row, index) {
          if (row.sqlStaCod == '13') {
            value = "<font color='brown'>" + row.sqlDes + "</font>";
          }
          return value;
        }
      }, {
        field: 'sqlNurNam',
        title: '护士',
        width: 100
      }, {
        field: 'sqlDes',
        title: '转归说明',
        width: 150,
        hidden: true
      }
      // , {
      //   field: 'opt1',
      //   title: '操作',
      //   width: 60,
      //   formatter: function (value, row, index) {
      //     return "<span class='url-link'><a href=javascript:cmdDel('" + row.sqlSeq + "','" + row.sqlStaStr + "')>删除</a></span>";
      //   }
      // }
      ]
    ];
    var toolbar_v = [{
      id: 'btnrefresh',
      text: '刷新',
      iconCls: 'icon-reload',
      handler: function () {
        init();
      }
    }];
    //加载datagrid
    function cmdDel(sqlSeq, sqlStaCod) {
      _confirm('确定删除该数据吗？', null, function () {
        // $("#delDataFormInput").val(jbzdSeq);
        // jquerySubByFId('delDataForm', delDataFormCallback, null, "json");
        $.ajax({
          url: "${baseurl}sql/delzg.do",
          type: "post",
          data: {
            "sqlSeq": sqlSeq,
            "emgSeq": emgSeq,
            "sqlStaCod": sqlStaCod
          },
          success: function (data) {
            message_alert(data);
            var type = data.resultInfo.type;
            if (type == 1) {
              var node = $('#zglist').datagrid('getSelected');
              var rowIndex = $('#zglist').datagrid('getRowIndex', node);
              $('#zglist').datagrid('deleteRow', rowIndex);
              var total = $('#zglist').datagrid('getRows');
              var row = total[total.length - 1];
              if (total.length == 1) {
                $("#sqlSeqStr", window.parent.document).val(row.sqlSeq);
                $("#sqlStaCod", window.parent.document).val('');
                $("#sql_sqlDatTim", window.parent.document).val('');
                $("#emg_emgFkName", window.parent.document).val('');
                $("#emg_sqlDepCod", window.parent.document).val('');
                $("#emg_sqlDes", window.parent.document).val('');
              } else {
                $("#sqlSeqStr", window.parent.document).val(row.sqlSeq);
                $("#sqlStaCod", window.parent.document).val(row.sqlStaCod);
                $("#sql_sqlDatTim", window.parent.document).val(publicFun.timeFormat(new Date(row.sqlDat), "yyyy/MM/dd hh:mm:ss"));
                $("#emg_emgFkName", window.parent.document).val(row.sqlDepName);
                $("#emg_sqlDepCod", window.parent.document).val(row.sqlDepCod);
                $("#emg_sqlDes", window.parent.document).val(row.sqlDes);
                window.parent.zgChange(row.sqlStaCod);
              }
            }
          }
        });
      });
    }
  </script>
</body>

</html>