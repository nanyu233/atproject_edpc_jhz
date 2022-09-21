<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/base/tag.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <!-- 引用jquery easy ui的js库及css -->
  <%@ include file="/WEB-INF/jsp/base/common_css.jsp"%>
  <%@ include file="/WEB-INF/jsp/base/common_js.jsp"%>
  <link rel="stylesheet" type="text/css" href="${baseurl}css/hems/global.css">
  <style>
    .tabsBody{
        padding: 10px 0px 0px 0px;
    }
</style>
  <title>医嘱导入管理</title>
</head>

<body class="examinebody tabsBody">
  <div class="mainDiv" style="float:left;">
    <table id="templateNameList"></table>
  </div>
  <div class="subDiv">
    <table id="templateContentList"></table>
  </div>
  <script type="text/javascript">
    var _getTempNameUrl = '${baseurl}zyydoc/querydocadvice_result.do',
      _getTempContentUrl = '${baseurl}zyydoc/querydocadvicecon_result.do';

    var modelSeq;
    function setLayout() {
      var windowsWidth = $('body').width(),
        windowsHeigt = 0.975 * ($("#tabs", parent.document).height() - 24);
      $('#templateNameList').width(400).height(windowsHeigt);
      $('#templateContentList').width(windowsWidth - 420).height(windowsHeigt);
    }

    function cmdadddoc() {
      createmodalwindow("新增模板", 470, 200, '${baseurl}zyydoc/toadddoc.do', 'no');
    }
    function cmdeditdoc() {
      var row = $('#templateNameList').datagrid('getSelected');
      if (GridUtils.checkChecked(row)) {
        createmodalwindow("修改模板", 470, 200, "${baseurl}zyydoc/toupdatedoc.do?modelSeq=" + row.modelSeq + "&th=" + new Date().getTime(), 'no');
      }
    }
    function cmddeldoc() {
      var checkedRows = $('#templateNameList').datagrid('getSelected');
      if (checkedRows == null) {
        $.messager.alert('提示信息', '请选择一条数据', 'warning');
      } else {
        _confirm('删除模板，模板中内容也将删除，确定删除该数据吗？', null, function () {
          publicFun.httpServer({ url: '${baseurl}report/zyydoc/deldoc.do' }, {
            'hspModelInfCustom.modelSeq': checkedRows['modelSeq']
          }, function (res) {
            message_alert(res);
            if (res.resultInfo.type == '1') {
              window.location.reload();
            }
          })
        })
      }
    }
    function addContent() {
      createmodalwindow("新增医嘱内容", 600, 300, "${baseurl}zyydoc/toadddoccontent.do?modelSeq=" + modelSeq, 'no');
    }

    function editContent() {
      var row = $('#templateContentList').datagrid('getSelected');
      if (GridUtils.checkChecked(row)) {
        createmodalwindow("修改模板内容", 600, 300, "${baseurl}zyydoc/toupdatedoccontent.do?modelcontSeq=" + row.modelcontSeq + "&th=" + new Date().getTime(), 'no');
      }

    }

    function delContent() {
      var checkedRows = $('#templateContentList').datagrid('getSelected');
      if (checkedRows == null) {
        $.messager.alert('提示信息', '请选择一条数据', 'warning');
      } else {
        _confirm('确定删除该数据吗？', null, function () {
          publicFun.httpServer({ url: '${baseurl}zyydoc/deldoccontent.do' }, {
            'hspModelcontInfCustom.modelcontSeq': checkedRows['modelcontSeq']
          }, function (res) {
            message_alert(res);
            if (res.resultInfo.type == '1') {
              $("#templateContentList").datagrid('reload');
            }
          })
        })
      }
    }

    function getTemp() {
      var toolbar_v;
      publicFun.ajaxVal('${moduleid}', toolbar_v, callBack);
      function callBack(toolbar_v) {
        $('#templateNameList').datagrid({
          nowrap: true,
          striped: true,
          singleSelect: true,
          rownumbers: true,
          url: _getTempNameUrl,
          idField: 'modelSeq',
          title: "医嘱模板名",
          columns: [
            [{
              field: 'modelNam',
              title: ' 医嘱模板名',
              width: 350
            }, {
              field: 'modelSeq',
              title: '模板编号',
              width: 100,
              hidden: true
            }]
          ],
          toolbar: toolbar_v,
          onClickRow: function (rowIndex, rowData) {
            modelSeq = rowData.modelSeq;
            $('#templateContentList').datagrid({
              nowrap: true,
              striped: true,
              singleSelect: true,
              rownumbers: true,
              url: _getTempContentUrl,
              queryParams: {
                "hspModelcontInfCustom.modelSeq": rowData.modelSeq
              },
              idField: 'modelcontSeq',
              title: "医嘱内容",
              columns: [
                [{
                  field: 'clsCont',
                  title: ' 医嘱内容',
                  width: getWidth(0.85)
                }]
              ],
              toolbar: [{
                text: '新增',
                iconCls: 'icon-add',
                handler: function () {
                  addContent();
                }
              }, {
                text: '修改',
                iconCls: 'icon-edit',
                handler: function () {
                  editContent();
                }
              }, {
                text: '删除',
                iconCls: 'icon-cancel',
                handler: function () {
                  delContent();
                }
              }]
            });
          }
        });
      }
    }
    function init() {
      getTemp();
      $('#templateContentList').datagrid({
        nowrap: false,
        striped: true,
        singleSelect: true,
        idField: 'rownums',
        loadMsg: '',
        columns: [
          [{
            field: 'clsCont',
            title: ' 医嘱内容',
            width: getWidth(0.85)
          }]
        ],
        title: "医嘱内容",
        rownumbers: true
      });
      var _thisWidth = $('body').width();
      $('.subDiv .panel-header,.subDiv .datagrid-wrap.panel-body,.subDiv .easyui-panel.panel-body,.subDiv .datagrid-header').css('width', '' + _thisWidth - 420 + '');
    }

    function getWidth(proportion) {
      var width = $("body").width() * 0.62;
      return Math.round(proportion * width);
    }
    $(function () {
      setLayout();
      init();
      $(window).resize(function () {
        init();
      });
    })
  </script>
</body>

</html>