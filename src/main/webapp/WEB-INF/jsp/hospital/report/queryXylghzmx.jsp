<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/base/tag.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
  <%@ include file="/WEB-INF/jsp/base/common_css.jsp"%>
  <link rel="stylesheet" type="text/css" href="${baseurl}css/common/querylist.css" />
  <%@ include file="/WEB-INF/jsp/base/common_js.jsp"%>
  <title>转院患者明细</title>
</head>

<body>
  <!-- 查询列表 -->
  <div class="list_table list_div queryTabs" id="list_table" style="padding-top:2px;padding-left:2px">
    <table id="zglist"></table>
  </div>
  <script type="text/javascript">
    //datagrid列定义
    $(function () {
      init();
    });

    function init() {
      $('#zglist').datagrid({
        nowrap: true,
        striped: true,
        singleSelect: true,
        url: '${baseurl}report/queryXylghzmx_result.do',
        idField: '1',
        loadMsg: '',
        columns: columns_v,
        toolbar: toolbar_v,
        pagination: true,
        rownumbers: true,
        pageList: [20, 30, 50],
        queryParams: {
        }
      });
    }

    var height = 0.98 * ($("#tabs", parent.document).height() - 14 - 6);
    $("#zglist").height(height);
    var columns_v = [
      [{
        field: 'emgSeq',
        title: 'id',
        hidden: true
      }, {
        field: 'mpi',
        title: '病历号',
        sortable: true,
        width: getWidth(0.07)
      }, {
        field: 'emgDat',
        title: '预检时间',
        sortable: true,
        width: getWidth(0.11),
        formatter: function (value, row, index) {
          return value ? publicFun.timeFormat(value, 'yyyy/MM/dd hh:mm:ss') : '';
        }
      }, {
        field: 'cstNam',
        title: '患者姓名',
        width: getWidth(0.05)
      }, {
        field: 'cstSexCod',
        title: '性别',
        sortable: true,
        width: getWidth(0.03)
      }, {
        field: 'cstAge',
        title: '年龄',
        sortable: true,
        width: getWidth(0.03),
        formatter: function (value, row, index) {
          if (row.cstAge == null || row.cstAge == '') {
            return row.cstAge;
          }
          return row.cstAge + row.cstAgeCod;
        }
      }, {
        field: 'preDgnCod',
        title: '主诉症状',
        sortable: true,
        width: getWidth(0.15)
      }, {
        field: 'emgDepCod',
        title: '急诊分级',
        sortable: true,
        width: getWidth(0.05)
      }, {
        field: 'grnChl',
        title: '绿色通道',
        sortable: true,
        width: getWidth(0.05)
      }, {
        field: 'arvChlCod',
        title: '到院方式',
        sortable: true,
        width: getWidth(0.05)
      }, {
        field: 'cstDspCod',
        title: '首诊状态',
        sortable: true,
        width: getWidth(0.05),
      }, {
        field: 'emgFkCod',
        title: '首诊科室',
        sortable: true,
        width: getWidth(0.08)
      }, {
        field: 'emgBed',
        title: '床位',
        width: getWidth(0.07)
      }, {
        field: 'preUsrNam',
        title: '分诊护士',
        sortable: true,
        width: getWidth(0.07)
      }]
    ];

    var toolbar_v = [{
      id: '',
      text: '修改/转归',
      iconCls: 'icon-edit',
      handler: function () {
        cmdeditjz();
      }
    }];

    function getWidth(proportion) {
      var width = $("body").width();
      return Math.round(proportion * width);
    }

    //新增修改页面
    function cmdeditjz() {
      var row = $('#zglist').datagrid('getSelected');
      if (GridUtils.checkChecked(row)) {
        parent.opentabwindow(row.cstNam + "-" + '修改', "${baseurl}hzszyyemg/xgjz.do?emgSeq=" + row.emgSeq + "&th=" + new Date().getTime());
      }
    }

    /* function cmdqueryhzxq() {
          var row = $('#zglist').datagrid('getSelected');
            if (GridUtils.checkChecked(row)) {
                parent.opentabwindow(row.cstNam + "-" + '患者详情', "${baseurl}hzszyyemg/queryhzxq.do?emgSeq=" + row.emgSeq + '&xxFlag=0' + "&th=" + new Date().getTime());
            }
    } */

  </script>
</body>

</html>