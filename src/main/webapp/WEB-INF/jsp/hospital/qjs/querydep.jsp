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
  <script>
    var _inviteFlg = '${inviteFlg}',
       _selectType = '${selectType}';
  </script>
</head>

<body>
  <form id="compctlform">
    <div class="form clr queryDiv" style="height: 25px">
      <p class="form-text">查询条件：</p>
      <input id="comno" type="text" name="dstcompctlCustom.comno">
      <!--  
        <p class="form-text">科室名：</p>
        <input id="comcname" type="text" name="dstcompctlCustom.comcname">
      -->
      <a href="#" class="easyui-linkbutton" iconCls="icon-search" id="btn" onclick="selectCompctl()">查询</a>
    </div>
    <!-- 查询列表 -->
    <div style=" overflow: auto;" class="tabDiv">
      <table id="compctllist" style="width: 570px;height:313px; overflow: auto;"></table>
    </div>
  </form>
  <script type="text/javascript">
    $(document).keyup(function (event) {
      if (event.keyCode == 13) {
        $("#btn").trigger("click");
      }
    });

    //datagrid列定义
    var columns_v = [
      [{
        field: 'comno',
        title: '科室号',
        width: 150
      }, {
        field: 'comcname',
        title: '科室名称',
        width: 270
      }, {
        field: 'opt1',
        title: '操作',
        width: 100,
        formatter: function (value, row, index) {
          return "<span class='url-link'><a href=javascript:selData('" + row.comno + "','" + row.comcname + "')>选择</a></span>";
        }
      }]
    ];
    //加载datagrid
    $(function () {
      if (_inviteFlg === 'updateConsultation') {
        $('.queryDiv').hide()
        $('#compctllist').height(338)
        $('.tabDiv').css({ 'margin': '4px 0px 2px 4px' })
        $('#comno').val('${inviteValue}')
        initTab()
      } else {
        initTab()
      }
    });

    function initTab() {
      $('#compctllist').datagrid({
        nowrap: true,
        striped: true,
        singleSelect: true,
        url: '${baseurl}sql/querydep_result.do',
        idField: '1',
        loadMsg: '',
        columns: columns_v,
        pagination: true,
        rownumbers: true,
        pageList: [10, 20, 40],
        queryParams: {
          'dstcompctlCustom.comno': $('#comno').val(),
        },
        onClickRow: function (rowIndex, rowData) {
          //转归页面
          parent.$("#emg_sqlDepCod").val(rowData.comno);
          // parent.$("#emg_emgFkName").val(rowData.comcname);
          //接收病人页面
          parent.$("#emg_emgFkCod").val(rowData.comno);
          parent.$("#emg_emgFkName").val(rowData.comcname);
          parent.$("#doctorList").hide();
          //危重患者交接单
           if (_selectType === 'a') {
            parent.$("#emg_emgFkCoda").val(rowData.comno);
            parent.$("#emg_emgFkNamea").val(rowData.comcname);
          } else if (_selectType === 'b') {
            parent.$("#emg_emgFkCodb").val(rowData.comno);
            parent.$("#emg_emgFkNameb").val(rowData.comcname);
          }
          if (sessionStorage.getItem("isValidateFormForHzdj") === "true") {
            setTimeout(function () {
              parent.validateForm();
            }, 100)
          }
          parent.closemodalwindow();
        }
      });
    }
    function initQuery() {
      if (_inviteFlg === 'updateConsultation') {
        $('.queryDiv').hide()
        $('#compctllist').height(338)
        $('.tabDiv').css({ 'margin': '4px 0px 2px 4px' })
        $('#comno').val('${inviteValue}')
        selectCompctl()
      }
    }

    function selData(comno, comcname) {
      //转归页面
      parent.$("#emg_sqlDepCod").val(comno);
      //接收病人页面
      parent.$("#emg_emgFkCod").val(comno);
      parent.$("#emg_emgFkName").val(comcname);
      //危重患者交接单
      if (_selectType === 'a') {
        parent.$("#emg_emgFkCoda").val(comno);
        parent.$("#emg_emgFkNamea").val(comcname);
      } else if (_selectType === 'b') {
        parent.$("#emg_emgFkCodb").val(comno);
        parent.$("#emg_emgFkNameb").val(comcname);
      }
      if (sessionStorage.getItem("isValidateFormForHzdj") === "true") {
        setTimeout(function () {
          parent.validateForm();
        }, 100)
      }
      parent.closemodalwindow();
    }

    //根据拼音编码查询数据
    function selectCompctl() {
      initTab()
      // var formdata = $("#compctlform").serializeJson();
      // $('#compctllist').datagrid('load', formdata);
    }
    $("#comno").focus();
  </script>
</body>

</html>