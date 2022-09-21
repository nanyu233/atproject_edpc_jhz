<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/base/tag.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
  <title>处置导入</title>
  <%@ include file="/WEB-INF/jsp/base/common_css.jsp"%>
  <link rel="stylesheet" type="text/css" href="${baseurl}css/hzszyyhems/disposal.css">
  <script type="text/javascript">
    var _emgSeq = '${emgSeq}';
  </script>
  <%@ include file="/WEB-INF/jsp/base/common_js.jsp"%>
  <script src="${baseurl}lib/avalon1.4.8/avalon.js" type="text/javascript" charset="UTF-8"></script>
</head>

<body class="disposal">
  <script type="text/javascript">
    var _list = [],
      selectedVal = [],
      fieldArry = [],
      indexsArry = []; //定义一个数组准备存放记录的序号;
    var selString = '',
      fieldString = '',
      indexs = '';
    /***
    ** 获取大类list
    ***/
    function getMsgList() {
      $('.Categories').html("");
      var innerHtml = '';
      var getMsgUrl = '${baseurl}zyymodel/majorCls_result.do';
      publicFun.httpServer({url: getMsgUrl}, { "hspModelcontInfCustom.modelSeq": parent.$('.inputSeq2').val() }, function (res) {
        $.each(res, function (index, val) {
          val['checked'] = false;
          _list = res;
          innerHtml += '<label class=\"marginRight\"><input type=\"checkbox\" onclick=\"checkclick(' + index + ')\">' + val.info + '</label>';
        });
        $('.Categories').html(innerHtml);
      });
    }
    /***
    ** 大类多选
    ***/
    function checkclick(idx) {
      var list = _list;
      var currentData = $.inArray((list[idx]['infocode']), selectedVal);
      if (list[idx]['checked'] == false) {
        list[idx]['checked'] = true;
        if (currentData == -1) {
          selectedVal.push(list[idx]['infocode'])
        }
      } else {
        list[idx]['checked'] = false;
        if (currentData != -1) {
          selectedVal.splice(currentData, 1)
        }
      }
      selString = selectedVal.join();
      getDataGrid();
    }
    /***
    ** 查询方法
    ***/
    function disposaljquery() {
      getDataGrid();
    }
    /***
    ** 加载datdgrid图表
    ***/
    function getDataGrid() {
      var height = $(window).height();
      $("#disposalList").height(0.6 * height);
      //datagrid列定义
      var columns_v = [
        [{
          checkbox: true
        }, {
          field: 'modelcontSeq',
          title: 'id',
          width: getWidth(0.10),
          hidden: true
        }, {
          field: 'majorCls',
          title: '大类',
          width: getWidth(0.15)
        }, {
          field: 'clsCont',
          title: '病情处置',
          width: getWidth(0.6)
        }]
      ];
      var clsVal = $('.queryText').val();
      $('#disposalList').datagrid({
        nowrap: false,
        striped: true,
        url: '${baseurl}zyymodel/modellist_result.do',
        idField: 'modelcontSeq',
        columns: columns_v,
        toolbar: '',
        singleSelect: false,
        selectOnCheck: true,
        checkOnselect: true,
        rownumbers: true,
        queryParams: {
          "hspModelcontInfCustom.majorClses": selString,
          "hspModelcontInfCustom.clsCont": clsVal,
          "hspModelcontInfCustom.modelType": "CZDRSEQ3",
          "hspModelcontInfCustom.infoCode": "CZDR"
        },
        // onLoadSuccess: function() {
        //     $("#disposalList").parent().find("div .datagrid-header-check").children("input[type=\"checkbox\"]").eq(0).attr("style", "display:none;");
        // },
        onCheck: function (rowIndex, rowData) {
          if (rowData.clsCont == null || rowData.clsCont == undefined) {
            rowData.clsCont = '';
          }
          var _string = rowData.clsCont;
          var currentData = $.inArray(_string, fieldArry);
          if (currentData == -1) {
            fieldArry.push(_string);
            fieldString += _string;
          }
          $('#fieldText').val(fieldString);
        },
        onUncheck: function (rowIndex, rowData) {
          if (rowData.clsCont == null || rowData.clsCont == undefined) {
            rowData.clsCont = '';
          }
          var _string = rowData.clsCont;
          var currentData = $.inArray(_string, fieldArry);
          if (currentData != -1) {
            fieldArry.splice(currentData, 1);
          }
          fieldString = fieldString.split(_string).join("");
          $('#fieldText').val(fieldString);
        }
        ,
        onCheckAll: function (rows) {
          var currentData = "",
            _allstring = "";
          for (var i = 0; i < rows.length; i++) {
            if (rows[i].clsCont == null || rows[i].clsCont == undefined) {
              rows[i].clsCont = '';
            }
            _allstring = rows[i].clsCont;
            currentData = $.inArray(_allstring, fieldArry)
            if (currentData == -1) {
              fieldArry.push(_allstring);
              fieldString += _allstring;
            }
          };
          $('#fieldText').val(fieldString);
        },
        onUncheckAll: function (rows) {
          var currentData = "",
            _allstring = "";
          for (var i = 0; i < rows.length; i++) {
            if (rows[i].clsCont == null || rows[i].clsCont == undefined) {
              rows[i].clsCont = '';
            }
            _allstring = rows[i].clsCont;
            currentData = $.inArray(_allstring, fieldArry)
            if (currentData != -1) {
              fieldArry.splice(currentData, 1);
            }
          }
          fieldString = fieldArry.join("");
          $('#fieldText').val(fieldString);
        }
      });
    }

    function getWidth(proportion) {
      var width = $("body").width();
      return Math.round(proportion * width);
    }
    /**
     * 导入
     **/
    function importField() {
      var fieldVal = $("#fieldText").val();
      var xtpghz = parent.$("#xtpghznr").val();
      if (fieldVal != '') {
        var totalVal = xtpghz + fieldVal;
        parent.$("#xtpghznr").val(totalVal);
        parent.closemodalwindow();
      } else {
        publicFun.alert('当前无导入数据，请确认是否已完成"处置"');
      }
    }
    $(function () {
      getMsgList();
      getDataGrid();
    }) 
  </script>
  <div class="header">
    <label>大类：</label>
    <div class="Categories"></div><br />
    <label>内容：</label>
    <input type="text" class="queryText">
    <a href="#" class="easyui-linkbutton" iconCls="icon-search" id="btn" onclick="disposaljquery()">查询</a>
  </div>
  <div class="clearBoth"></div>
  <div class="disposalDiv">
    <table id="disposalList"></table>
  </div>
  <textarea id="fieldText" readonly></textarea>
  <div class="center grp_btn">
    <a class="easyui-linkbutton" iconCls="icon-ok" id="submitbtn" onclick="importField()">导入并返回</a>
    <a class="easyui-linkbutton" iconCls="icon-cancel" id="closebtn" onclick="parent.closemodalwindow()">关闭</a>
  </div>
</body>

</html>