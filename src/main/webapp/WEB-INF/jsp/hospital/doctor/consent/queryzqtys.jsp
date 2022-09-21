<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/base/tag.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
  <title>知情同意书</title>
  <%@ include file="/WEB-INF/jsp/base/common_css.jsp"%>
  <%@ include file="/WEB-INF/jsp/base/common_js.jsp"%>
  <link rel="stylesheet" type="text/css" href="${baseurl}css/hzszyyhems/hzszyydoctor/querycfjl.css">
  <link rel="stylesheet" type="text/css" href="${baseurl}css/hzszyyhems/contstyle.css" />
</head>

<body>
  <div class="table-container">
    <div id="handoverSheetList"></div>
  </div>
  <div class="tools-container">
    <p class="at-tools2 clr" id="atTools">
      <a class="commonbtn" href="javascript:;" onclick="handoverSheetEdit()">查看</a>
    </p>
  </div>
  <script type="text/javascript">
    $(document).keydown(function (event) {
      switch (event.keyCode) {
        case 18:
          event.preventDefault();
        case 116:
          event.preventDefault();
        case 122:
          event.preventDefault();
      }
    });

    function getWidth(proportion) {
      var width = $('body').width();
      return Math.round(proportion * width);
    }

    //查询列表
    function handoverSheet() {
      var height = $('#main', parent.document).height() - 57;
      $('#handoverSheetList').height(height);
      $('#handoverSheetList').datagrid({
        striped: true,
        singleSelect: true,
        url: '${baseurl}zyylqblqrb/queryConsentInf_Result.do',
        pagination: true,
        rownumbers: true,
        title: "知情同意书",
        pageList: [20, 30, 50],
        queryParams: {
          'hspConsentInfCustom.refseqno': '${refseqno}'
        },
        loadFilter: function (data) {
          if (data.resultInfo && data.resultInfo.messageCode == '109') {
            message_alert(data, function () {
              window.location.href = '${baseurl}/first.do';
            });
          }
          return data;
        },
        onDblClickRow: function (rowIndex, rowData) {
          window.location = '${baseurl}zyylqblqrb/ConsentInf.do?seqno=' + rowData.seqno;
        },
        columns: [
          [{
            field: 'seqno',
            title: '',
            width: getWidth(0),
            hidden: true
          }, {
            field: 'tempno',
            title: '模板号',
            width: getWidth(0),
            hidden: true
          }, {
            field: 'tempname',
            title: '名称',
            width: getWidth(.35)
          }, {
            field: 'crtusrname',
            title: '创建人名称',
            width: getWidth(.25)
          }, {
            field: 'crtdate',
            title: '创建时间',
            width: getWidth(.25),
            formatter: function (value, row, index) {
              return publicFun.timeFormat(value, 'yyyy/MM/dd hh:mm')
            }
          }, {
            field: 'upddate',
            title: '更新时间',
            width: getWidth(.15),
            hidden: true,
            formatter: function (value, row, index) {
              return publicFun.timeFormat(value, 'yyyy/MM/dd hh:mm:ss')
            }

          }]
        ]
      });
      var _thisWidth = $('body').width();
      $('.panel-header,.datagrid-wrap.panel-body,.easyui-panel.panel-body,.datagrid-header').css('width', '' + _thisWidth - 10 + '');
    }
    /**
     * 修改知情同意书
     */
    function handoverSheetEdit() {
      var checkedRows = $('#handoverSheetList').datagrid('getSelected');
      if (checkedRows == null) {
        publicFun.alert('请选择一条数据');
      } else {
        window.location = '${baseurl}zyylqblqrb/ConsentInf.do?seqno=' + checkedRows['seqno']
      }
    }

    $(function () {
      handoverSheet();
      $(window).resize(function () {
        handoverSheet();
      });
    })
  </script>
</body>

</html>