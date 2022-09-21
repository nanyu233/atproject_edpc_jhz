<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/base/tag.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <%@ include file="/WEB-INF/jsp/base/common_css.jsp"%>
  <%@ include file="/WEB-INF/jsp/base/common_js.jsp"%>
  <link rel="stylesheet" type="text/css" href="${baseurl}css/common/querylist.css" />
  <link rel="stylesheet" type="text/css" href="${baseurl}css/hzszyyhems/disposal.css?090">
  <title>处置导入管理</title>
</head>

<body class="queryModel m-l2">
  <script type="text/javascript">
    var _list = [],
      selectedVal = [];
    var selString = '';


    function reload() {
      $('#modelList').datagrid('reload');
    }

    //加载datagrid
    function getDataGrid() {
      var toolbar_v;
      publicFun.ajaxVal('${moduleid}', toolbar_v, callBack);
      var height = 0.975 * ($("#tabs", parent.document).height() - 36 - 16);
      $("#modelList").height(height);
      //datagrid列定义
      var columns_v = [
        [{
          field: 'modelcontSeq',
          title: 'id',
          width: getWidth(0.14),
          sortable: true,
          hidden: true
        }, {
          field: 'majorCls',
          title: '大类',
          sortable: true,
          width: getWidth(0.08)
        }, {
                field: 'subCls',
                title: '名称',
                width: getWidth(0.08)
        }, {
          field: 'clsCont',
          title: '内容',
          sortable: true,
          width: getWidth(0.70)
        }, {
          field: 'opt1',
          title: '操作',
          sortable: true,
          width: getWidth(0.08),
          formatter: function (value, row, index) {
            return "<span class='url-link'><a href=javascript:cmdeditmodel('" + row.modelcontSeq + "')>修改</a></span> | <span class='url-link'><a href=javascript:cmddelmodel('" + row.modelcontSeq + "')>删除</a></span>";
          }
        }]
      ];
      var clsVal = $('.queryText').val();
      function callBack(toolbar_v) {
        $('#modelList').datagrid({
          nowrap: false,
          striped: true,
          singleSelect: true,
          url: '${baseurl}zyymodel/querymodelcont_result.do',
          idField: 'modelcontSeq',
          loadFilter: function (data) {
            if (data.resultInfo && data.resultInfo.messageCode == '109') {
              message_alert(data, function () {
                window.location.href = "${baseurl}/first.do";
              });
            }
            return data;
          },
          loadMsg: '',
          columns: columns_v,
          pagination: true,
          rownumbers: true,
          pageList: [20, 30, 50],
          toolbar: toolbar_v,
          queryParams: {
            "hspModelcontInfCustom.majorClses": selString,
            "hspModelcontInfCustom.clsCont": clsVal,
            "hspModelcontInfCustom.modelType": "CZDRSEQ3",
            "hspModelcontInfCustom.infoCode": "CZDR"
          },
          onDblClickRow: function (rowIndex, rowData) {
            var row = $('#modelList').datagrid('getSelected');
            cmdeditmodel(row.modelcontSeq);
          }
        });
      }
    }

    function getWidth(proportion) {
      var width = $("body").width();
      return Math.round(proportion * width);
    }


    //新增
    function cmdaddmodel() {
      var row = $('#modelList').datagrid('getSelected');
      var modelcontSeq = '';
      if (row != null) {
        modelcontSeq = row.modelcontSeq;
      }
      createmodalwindow("新增处置", 620, 420, '${baseurl}zyymodel/toadd.do?modelcontSeq=' + modelcontSeq, 'no');
    }

    //删除 统一用form
    function cmddelmodel(modelcontSeq) {
      _confirm('确定删除该数据吗？', null, function () {
        $.ajax({
          url: "${baseurl}zyymodel/delmodel.do",
          type: "post",
          data: {
            "modelcontSeq": modelcontSeq
          },
          success: function (data) {
            message_alert(data);
            var type = data.resultInfo.type;
            if (type == 1) {
              $('#modelList').datagrid("reload");
            }
          }
        });
      });
    }


    //修改模板内容
    function cmdeditmodel(modelcontSeq) {
      //打开修改窗口
      var url = '${baseurl}zyymodel/toupdate.do?modelcontSeq=' + modelcontSeq;
      createmodalwindow("修改处置", 620, 420, url, 'no');
    }


    /***
     ** 获取大类list
     ***/
    function getMsgList() {
      $('.itemDiv').html("");
      var innerHtml = '';
      var getMsgUrl = '${baseurl}zyymodel/majorCls_result.do';
      publicFun.httpServer({url: getMsgUrl}, {}, function (res) {
        $.each(res, function (index, val) {
          val['checked'] = false;
          _list = res;
          innerHtml += '<label class=\"marginRight\"><input type=\"checkbox\" onclick=\"checkclick(' + index + ')\">' + val.info + '</label>';
        });
        $('.itemDiv').html(innerHtml);
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
    function queryDisposal() {
      getDataGrid();
    }

    $(function () {
      getMsgList();
      getDataGrid();
    })

  </script>
  <form>
    <div class="header">
      <label>大类：</label>
      <div class="Categories">
        <div class="itemDiv floatLeft"></div>
      </div>
    </div>
    <div class="header" style="margin-top: 3px;margin-bottom:5px">
        <label style="font-size: 14px;">名称或内容：</label>
        <input type="text" class="queryText" id="content">
     <a href="#" class="easyui-linkbutton" iconCls="icon-search" id="btn" onclick="queryDisposal()">查询</a>
    </div>
  </form>
  <div class="disposalDiv queryTabs">
    <table id="modelList"></table>
  </div>
</body>

</html>