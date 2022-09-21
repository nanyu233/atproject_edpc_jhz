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
  <title>住院患者明细</title>
</head>

<body>
  <!-- 查询列表 -->
  <div class="queryTabs" style="padding-top:2px;padding-left:2px">
    <table id="zglist" style="width: 870px;height:450px;"></table>
  </div>
  <script type="text/javascript">
    //datagrid列定义
    var queryParams = parent.getParams();
    $(function () {
      init();
    });

    function init() {
      $('#zglist').datagrid({
        nowrap: true,
        striped: true,
        singleSelect: true,
        url: '${baseurl}report/queryZyhz_result.do',
        idField: '1',
        loadMsg: '',
        columns: columns_v,
        queryParams: queryParams,
        rownumbers: true
      });
    }

    var columns_v = [
      [{
        field: 'mpi',
        title: '病历号',
        width: 60
      }, {
        field: 'emgDat',
        title: '预检时间',
        width: 140,
        formatter: function (value, row, index) {
          return value ? publicFun.timeFormat(value, 'yyyy/MM/dd hh:mm:ss') : '';
        }
      }, {
        field: 'cstNam',
        title: '患者姓名',
        width: 80
      }, {
        field: 'cstSexCod',
        title: '性别',
        width: 40
      }, {
        field: 'cstAge',
        title: '年龄',
        width: 40,
        formatter: function (value, row, index) {
          if (row.cstAge == null || row.cstAge == '') {
            return row.cstAge;
          }
          return row.cstAge + row.cstAgeCod;
        }
      }, {
        field: 'cstDspCod',
        title: '首诊状态',
        width: 80,
      }, {
        field: 'emgFkCod',
        title: '首诊科室',
        width: 120
      }, {
        field: 'cstDepCodNew',
        title: '住院科室',
        width: 120
      }, {
        field: 'sqlDat',
        title: '转归时间',
        width: 140
      }]
    ];

  </script>
</body>

</html>