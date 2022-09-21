<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/base/tag.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
  <%@ include file="/WEB-INF/jsp/base/common_css.jsp"%>
  <%@ include file="/WEB-INF/jsp/base/common_js.jsp"%>
  <link rel="stylesheet" type="text/css" href="${baseurl}css/common/querylist.css?v=${versionDay}" />
  <title>急诊科发热病人统计</title>
</head>

<body>
  <script type="text/javascript">
    $(document).keydown(function (event) {
      switch (event.keyCode) {
        case 13:
          return false;
      }
    });

    $(window).resize(function () {
      initTab();
    })
    function reload() {
      feverListQuery();
    }
    
    function sieSizeTab () {
      var height = 0.975 * ($("#tabs", parent.document).height() - 36 - 16);
      $("#feverList").height(height);
    }

    function initTab () {
      var toolbar_v;
      publicFun.ajaxVal('${moduleid}', toolbar_v, callBack);
      sieSizeTab();
      function callBack(toolbar_v) {
        $('#feverList').datagrid({
          nowrap: true,
          striped: true,
          singleSelect: true,
          url: "${baseurl}report/queryfrbrtj_result.do",
          idField: 'emgFkCod',
          loadMsg: '',
          toolbar: toolbar_v,
          columns: [
            [{
              field: 'emgFkCod',
              hidden: true,
            }, {
              field: 'emgFkName',
              title: '急诊科室',
              width: getWidth(0.15)
            }, {
              field: 'hzcount',
              title: '发热患者',
              width: getWidth(0.1),
              formatter: function (value, row, index) {
                return value + "人";
              }
            }]
          ],
          pagination: false,
          rownumbers: true,
          queryParams: {
            "startdate": $("#startdate").val(),
            "enddate": $("#enddate").val(),
            "childFlag": $("#childFlag").is(':checked') ? '1' : ''
          }
        });
      }
    }
    function cmdexport () {
      var _rtnFlg = publicFun.searchTime($('#startdate').val(), $('#enddate').val());
      if (_rtnFlg === false) {
        return false;
      }
      _confirm('确定导出吗？', null, function () {
        publicFun.httpServer({ url: '${baseurl}report/frbrtjSubmit.do' }, { startdate: $('#startdate').val(), enddate: $('#enddate').val(),childFlag: $("#childFlag").is(':checked') ? '1' : '' }, function (res) {
          message_alert(res)
        })
      })
    }

    function getWidth(proportion) {
      var width = $("body").width();
      return Math.round(proportion * width);
    }

    function cmdfrhzmx() {
      var startdate = $('#startdate').val(), 
          enddate = $('#enddate').val();
      var _rtnFlg = publicFun.searchTime(startdate, enddate);
      if (_rtnFlg === false) {
        return false;
      }
      var node = $('#feverList').datagrid('getSelected');
      var _childFlag = $("#childFlag").is(':checked') ? '1' : '';
      if (node) {
        parent.opentabwindow("发热患者明细", '${baseurl}report/queryfrbrmx.do?hspemginfCustom.emgFkCod=' + node.emgFkCod + '&startdate=' + startdate + '&enddate=' + enddate + '&childFlag=' + _childFlag + '&t=' + new Date().getTime(), 'no');
      } else {
        parent.opentabwindow("发热患者明细", '${baseurl}report/queryfrbrmx.do?startdate=' + startdate + '&enddate=' + enddate + '&childFlag=' + _childFlag + '&t=' + new Date().getTime(), 'no');
      }
    }

    function setTime() {
      var _today;
      _today = publicFun.timeFormat(new Date(), "yyyy/MM/dd");
      $("#startdate").val(_today);
      $("#enddate").val(_today);
    };

    //查询方法
    function feverListQuery() {
      var startdate = $("#startdate").val(),
          enddate = $("#enddate").val();
      var _rtnFlg = publicFun.searchTime(startdate, enddate);
      if (_rtnFlg === false) {
        return false;
      }
      var formData = $("#feverForm").serializeJson();
      $('#feverList').datagrid('load', formData);
    }

    //加载datagrid
    $(function () {
      setTime();
      initTab()
    });
  </script>
  <form id="feverForm">
    <div class="form clr">
      <div class="div_h">
        <ul class="form_hc">
          <li>
            <span class="form-text">&nbsp;查询时间：</span>
            <input type="text" class="input-date Wdate" id="startdate" name="startdate" onfocus="new WdatePicker({dateFmt:'yyyy/MM/dd'})">
            <span class="form-text">至</span>
            <input type="text" class="input-date Wdate" id="enddate" name="enddate" onfocus="new WdatePicker({dateFmt:'yyyy/MM/dd'})" />
            <label for="childFlag">
              <p class="form-text">
                &nbsp;&nbsp;<input type="checkbox" value="1" id="childFlag" name="childFlag" onchange="feverListQuery()"> 去除儿童（注：年龄小于14岁）
              </p>
            </label>
            <a href="#" class="easyui-linkbutton" iconCls="icon-search" id="btn" onclick="feverListQuery()">查询</a>
          </li>
        </ul>
        <div class="c"></div>
      </div>
    </div>
    <div class="queryTabs m-l2">
      <table id="feverList"></table>
    </div>
  </form>
</body>

</html>