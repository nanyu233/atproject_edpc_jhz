<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/base/tag.jsp"%>
<!DOCTYPE html>
<html>

<head>
  <title>体征采集</title>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <%@ include file="/WEB-INF/jsp/base/common_css.jsp"%>
  <link rel="stylesheet" type="text/css" href="${baseurl}css/hems/global.css" />
  <script language="javascript" src="${baseurl}Lodop6.216/LodopFuncs.js"></script>
  <%@ include file="/WEB-INF/jsp/base/common_js.jsp"%>
  <script>
    var _baseurl = "${baseurl}";
  </script>
</head>

<body class="addList">
  <form>
    <div class="disposalDiv">
      <table id="vitallist"></table>
    </div>
    <div class="right-grp">
      <a class="easyui-linkbutton" iconCls="icon-ok" id="submitbtn" onclick="importVital()">导入并返回</a>
      <a class="easyui-linkbutton" iconCls="icon-cancel" id="closebtn" onclick="parent.closemodalwindow()">关闭</a>
    </div>
  </form>

  <script type="text/javascript">
    function getWidth(proportion) {
      var width = $("body").width();
      return Math.round(proportion * width);
    }

    function importVital(){
      var row = $('#vitallist').datagrid("getSelected");
      if (GridUtils.checkChecked(row)) {
        parent.sub.notePatientMsg.xy = row.xy;
        parent.sub.notePatientMsg.hrtRte = row.hrtRte;
        parent.sub.notePatientMsg.breNbr = row.breNbr;
        parent.sub.notePatientMsg.sbpUpNbr = row.sbpUp;
        parent.sub.notePatientMsg.sbpDownNbr = row.sbpDown;
        parent.sub.notePatientMsg.sbpNbrFlg = '1'
        parent.sub.notePatientMsg.xyFlg = '1'
        parent.sub.notePatientMsg.xyFlg = '1'
        alert_success("体征采集成功,已更新覆盖！时间为:" + publicFun.timeFormat(row.readTime, 'yyyy/MM/dd hh:mm:ss'))
        setTimeout("parent.closemodalwindow()", 1000);
      }
    }

    function getDatagrid(){
      var height = 295;
       $("#vitallist").height(height);
      var columns_v = [
        [{
          checkbox: true
        },{
          field: 'id',
          hidden: true
        },{
          field: 'readTime',
          title: '读取时间',
          width: getWidth(0.23),
          formatter: function (value, row, index) {
            return value ? publicFun.timeFormat(value, 'yyyy/MM/dd hh:mm:ss') : '';
          }
        }, {
          field: 'xy',
          title: '血氧',
          width: getWidth(0.13)
        }, {
          field: 'sbpUp',
          title: '上压',
          width: getWidth(0.13)
        }, {
          field: 'sbpDown',
          title: '下压',
          width: getWidth(0.13)
        }, {
          field: 'breNbr',
          title: '呼吸',
          width: getWidth(0.13)
        }, {
          field: 'hrtRte',
          title: '心跳',
          width: getWidth(0.13)
        }]
      ];
      $('#vitallist').datagrid({
        nowrap: false,
        striped: true,
        selectOnCheck: true,
        checkOnselect: true,
        singleSelect: true,
        url: _baseurl+'zjszyyhljld/getJhyxx.do',
        idField: 'id',
        loadMsg: '',
        queryParams: {},
        columns: columns_v,
        rownumbers: false,
        onDblClickRow: function (rowIndex, rowData) {
          importVital()
        },
      });
    }

    $(function(){
      getDatagrid();
    })
  </script>
</body>

</html>