<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/base/tag.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
  <title>收费详情</title>
  <%@ include file="/WEB-INF/jsp/base/common_css.jsp"%>
  <%@ include file="/WEB-INF/jsp/base/common_js.jsp"%>
  <link rel="stylesheet" type="text/css" href="${baseurl}css/common/querylist.css" />
  <script type="text/javascript">
    function setLayOut() {
      var width = $("body").width();
      var height;
      if ($("#tabs", parent.document).height()) {
        height = 0.975 * ($("#tabs", parent.document).height() - 57);
      } else {
        height = 0.98 * ($(window).height());
      }
      $("#sflist").height(height);
    }

    function isRangeDate(row) {
      if (!row.sfrq) {
        return "color:red;";
      } else {
        return "";
      }
    }

    function getDataGrid() {
      setLayOut();
      $('#sflist').datagrid({
        nowrap: true,
        striped: true,
        singleSelect: true,
        url: '${baseurl}his/querySfmx_result.do?vstCad=${vstCad}&emgSeq=${emgSeq}',//中医院改成URL：zyyhis/querySfmx_result.do
        type: "post",
        idField: '1',
        loadMsg: '',
        columns: [
          [{
            field: 'rq',
            title: '挂号日期',
            width: getWidth(0.16),
            formatter: function (value, row, index) {
              return value ? publicFun.timeFormat(value, 'yyyy/MM/dd') : ''
            },
            styler: function (value, row, index) {
              return isRangeDate(row);
            }
          }, {
            field: 'sj',
            title: '挂号时间',
            width: getWidth(0.15),
            formatter: function (value, row, index) {
              return row.rq ? publicFun.timeFormat(row.rq, 'hh:mm:ss') : ''
            },
            styler: function (value, row, index) {
              return isRangeDate(row);
            }
          }, {
            field: 'mc',
            width: getWidth(0.35),
            title: '收费项目',
            styler: function (value, row, index) {
              return isRangeDate(row);
            }
          }, {
            field: 'je',
            width: getWidth(0.14),
            title: '收费金额',
            formatter: function (value, row, index) {
              if (value) {
                return publicFun.creatMoney(value);
              } else {
                return "";
              }
            },
            styler: function (value, row, index) {
              return isRangeDate(row);
            }
          }
          /*, {
            field: 'bzTf',
            width: getWidth(0.15),
            title: '退费情况',
            formatter: function (value, row, index) {
              if (value == "1") {
                return "已退费";
              } else {
                return "";
              }
            }
          }*/]
        ],
        queryParams: {
          'vHemsSfxxCustom.startDate': $('#startDate').val(),
          'vHemsSfxxCustom.endDate': $('#endDate').val()
        },
        pagination: false,
        rownumbers: true,
        pageList: [20, 30, 50]
      });
    }
    //加载datagrid
    $(function () {
      setDate();
      getDataGrid();
    });

    function getWidth(proportion) {
      var width = $("body").width();
      return Math.round(proportion * width);
    }
    function setDate () {
      var _currentDay = publicFun.timeFormat(new Date, 'yyyy/MM/dd');
      $('#startDate').val('${emgDat}');
      if ('${cyrqDat}') {
        $('#endDate').val('${cyrqDat}');
      } else {
        $('#endDate').val(_currentDay);
      }
    }
  </script>
</head>

<body>
  <form id="zgform" class="form">
    <div class="form clr">
      <p class="form-text">日期：</p>
      <input class="input-date Wdate" id="startDate" type="text" onclick="WdatePicker({dateFmt:'yyyy/MM/dd'})">
      <p class="form-text">-</p>
      <input class="input-date Wdate" id="endDate" type="text" onclick="WdatePicker({dateFmt:'yyyy/MM/dd'})">
      <a href="#" class="easyui-linkbutton" iconCls="icon-search" id="btn" onclick="getDataGrid()">查询</a>
    </div>
    <div class="queryTabs m-l2">
      <table id="sflist"></table>
    </div>
  </form>
</body>

</html>