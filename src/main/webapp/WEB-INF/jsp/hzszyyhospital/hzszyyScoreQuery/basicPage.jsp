<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/base/tag.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
  <%@ include file="/WEB-INF/jsp/base/common_css.jsp"%>
  <%@ include file="/WEB-INF/jsp/base/common_js.jsp"%>
  <link rel="stylesheet" type="text/css" href="${baseurl}css/common/querylist.css" />
  <link rel="stylesheet" type="text/css" href="${baseurl}css/hzszyyhems/receitp.css?55">
  <link rel="stylesheet" type="text/css" href="${baseurl}css/hzszyyhems/hljl.css">
</head>

<body class="xtpg xtpgRight">
  <form id="Bradendeleteform" action="${baseurl}scorequery/delBradenScore.do" method="post">
    <input type="hidden" class="xtpgSeq" name="xtpgSeq" />
  </form>
  <form id="adldeleteForm" action="${baseurl}scorequery/delAdlScore.do" method="post">
    <input type="hidden" class="xtpgSeq" name="xtpgSeq" />
  </form>
  <form id="falloutdeleteForm" action="${baseurl}scorequery/delFalloutbedScore.do" method="post">
    <input type="hidden" class="xtpgSeq" name="xtpgSeq" />
  </form>
  <form id="DangerdeleteForm" action="${baseurl}scorequery/delDdwxpdlScore.do" method="post">
    <input type="hidden" class="xtpgSeq" name="xtpgSeq" />
  </form>
  <form id="nrsdeleteForm" action="${baseurl}scorequery/delNrsScore.do" method="post">
    <input type="hidden" class="xtpgSeq" name="xtpgSeq" />
  </form>
  <form id="gcsDeleteForm" action="${baseurl}scorequery/delGcsScore.do" method="post">
    <input type="hidden" class="emgSeq" name="emgSeq" />
  </form>
  <form id="zyfxpfDeleteForm" action="${baseurl}scorequery/delZyfxpgScore.do" method="post">
    <input type="hidden" class="zyfxpfSeq" name="zyfxpfSeq" />
  </form>
  <form id="fallchilddeleteForm" action="${baseurl}scorequery/delFallRisk.do" method="post">
    <input type="hidden" class="fallriskSeq" name="fallriskSeq" />
  </form>
  <form id="morseDeleteForm" action="${baseurl}scorequery/delMorseScore.do" method="post">
    <input type="hidden" class="ddfxpgbSeq" name="ddfxpgbSeq" />
  </form>
  <form id="zjpfDeleteForm" action="${baseurl}scorequery/delZjpfScore.do" method="post">
    <input type="hidden" class="zjpfSeq" name="zjpfSeq" />
  </form>
  <span class="hidden" id="_pemgFkCod">${hspemginfCustom.emgFkCod}</span>
  <span class="hidden" id="_pemgBed">${hspemginfCustom.emgBed}</span>
  <span class="hidden" id="_pcstNam">${hspemginfCustom.cstNam}</span>
  <span id="_psex" class="hidden">${hspemginfCustom.cstSexCod}</span>
  <span id="_page" class="hidden"></span>
  <span id="_plgh" class="hidden">${hspemginfCustom.observationCode}</span>
  <div id="mainView" class="f-left"></div>
  <div class="rightWrapper" id="rightWrapper">
    <div class="rightPanel">
      <div class="operationDiv">
        <p>操作</p>
        <p class="dashedborder"></p>
        <div class="operationbtn operatEmergency">
          <a href="javascript:;" class="commonbtn leftBtn" onclick="addCom()">新增</a>
          <a href="javascript:;" class="commonbtn noEditBtn" onclick="saveCom()">保存</a>
          <a href="javascript:;" class="commonbtn noEditBtn leftBtn" onclick="deleteCom()">删除</a>
          <a href="javascript:;" class="commonbtn" id="printZy" style="display:none" onclick="printCom()">打印</a>
        </div>
      </div>
      <div class="tabWrapper">
        <p>记录时间</p>
        <p class="dashedborder"></p>
        <div class="dataGridDiv queryTabs">
          <div class="tableDiv" id="tabDiv"></div>
        </div>
      </div>
    </div>
  </div>

  <script type="text/javascript">
    var comdata = parent.comdata;
    function init() {
      if (!'${hspemginfCustom.cstAge}') {
        $('#_page').text('')
      } else {
        $('#_page').text('${hspemginfCustom.cstAge}${hspemginfCustom.cstAgeCod}');
      }
      getDatagrid();
      initMainView(comdata._url);
    }

    function initMainView(url) {
      var mainView = createFrame(url);
      $("#mainView").html(mainView);
    }

    /**
    * [setLayout 初始化布局]
    */
    function setLayout() {
      var windowWidth = $(window).width(),
        windowHeight = $(window).height();
      $("#mainView").width(windowWidth - 230);
      $("#mainView").height(windowHeight);
      $(".rightWrapper").height(windowHeight);
      $(".rightPanel").height(windowHeight - 2);
      $(".dataGridDiv").height(windowHeight - 170);
    }

    //创建生成的 iframe 嵌入页面
    function createFrame(url) {
      var content = '<iframe id ="myFrame" frameborder="0" scrolling="auto" src="' + url + '"  style="width: 100%;height:100%"></iframe>';
      return content;
    }

    //获取脑卒中病人datagrid表格
    function getDatagrid() {
      var params = comdata.params;
      //datagrid列定义
      var windowHeight = $(parent.window).height();
      $("#tabDiv").height(windowHeight - 195);
      var columns_v = [
        [{
          field: params.writetime,
          title: '记录时间',
          width: 120,
          formatter: function (value, row, index) {
            return publicFun.timeFormat(value, "yyyy-MM-dd hh:mm");
          }
        }]
      ];
      $('.tableDiv').datagrid({
        nowrap: false,
        striped: true,
        singleSelect: true,
        title: '',
        url: params.datagridUrl,
        idField: params.filedid,
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
        rownumbers: true,
        queryParams: params.queryParams,
        onLoadSuccess: function (data) {
          if (data.rows.length > 0) {
            var _isHasurl = comdata._url + params.ownParam + data.rows[0][params.filedid];
            initMainView(_isHasurl);
            $('#tabDiv').datagrid('selectRow', 0);
          }
          if (data.resultInfo && data.resultInfo.messageCode == '109') {
            message_alert(data, function () {
              window.location.href = "${baseurl}/first.do";
            });
          }
          return data;
        },
        onClickRow: function (rowIndex, rowData) {
          var _url = comdata._url + params.ownParam + rowData[params.filedid];
          initMainView(_url);
        },
      });
    }

    //获取导管病人datagrid表格
    function getDatagrid() {
      var params = comdata.params;
      //datagrid列定义
      var windowHeight = $(parent.window).height();
      $("#tabDiv").height(windowHeight - 195);
      var columns_v = [
        [{
          field: params.writetime,
          title: '记录时间',
          width: 110,
          formatter: function (value, row, index) {
            return publicFun.timeFormat(value, "yyyy-MM-dd hh:mm");
          }
        }, {
          field: params.filedScore,
          title: '总分',
          width: 30
        }, {
          field: params.filedid,
          title: '来源',
          width: 55,
          formatter: function (value, row, index) {
            var confirmTitle;
            if (value.indexOf("H-") != -1) {
	          confirmTitle = '入院护理评估';
	        } else if (value.indexOf("SD") != -1 || value.indexOf("LY") != -1){
	          confirmTitle = '预检登记';
	        } else if (value.indexOf("DOC-") != -1){
	          confirmTitle = '门诊病历';
	        } else if (value.length == 32) {
	          confirmTitle = '评分查询';        
	        } else if (value.length == 16) {
	          confirmTitle = '系统评估';
	        } else if (value.indexOf("HCS-") != -1){
	          confirmTitle = '创伤入院评估';
	        } else if (value.indexOf("HLIJL-") != -1){
	          confirmTitle = '病情护理记录';
	        }
	        return confirmTitle;
          }
        }]
      ];
      $('.tableDiv').datagrid({
        nowrap: false,
        striped: true,
        singleSelect: true,
        title: '',
        url: params.datagridUrl,
        idField: params.filedid,
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
        rownumbers: true,
        queryParams: params.queryParams,
        onLoadSuccess: function (data) {
          if (data.rows.length > 0) {
            var _isHasurl = comdata._url + params.ownParam + data.rows[0][params.filedid];
            initMainView(_isHasurl);
            $('#tabDiv').datagrid('selectRow', 0);
          }
          if (data.resultInfo && data.resultInfo.messageCode == '109') {
            message_alert(data, function () {
              window.location.href = "${baseurl}/first.do";
            });
          }
          return data;
        },
        onClickRow: function (rowIndex, rowData) {
          var _url = comdata._url + params.ownParam + rowData[params.filedid];
          initMainView(_url);
        },
      });
    }

    //新增
    function addCom() {
      initMainView(comdata._url);
      $('#tabDiv').datagrid('clearSelections');
    }

    //保存
    function saveCom() {
      var row = $('#tabDiv').datagrid('getSelected');
      if (row && row[comdata.params.filedid].indexOf("DOC-") != -1) {
        publicFun.alert('已绑定门诊病历，该数据不可修改');
      } else {
        document.getElementById("myFrame").contentWindow.saveCom();
      }
    }

    //打印
    function printCom() {
      document.getElementById("myFrame").contentWindow.printCom();
    }
    //删除
    function deleteCom() {
      var params = comdata.params;
      var row = $('#tabDiv').datagrid('getSelected');
      if (GridUtils.checkChecked(row)) {
        var confirmTitle;
        if (row[params.filedid].indexOf("H-") != -1) {
          confirmTitle = '已绑定入院护理评估单，确定删除该数据吗？';
        } else if (row[params.filedid].indexOf("SD") != -1 || row[params.filedid].indexOf("LY") != -1){
          confirmTitle = '已绑定预检数据，该数据不可删除';
        } else if (row[params.filedid].indexOf("DOC-") != -1){
          confirmTitle = '已绑定门诊病历，该数据不可删除';
        } else if (row[params.filedid].length == 32) {
          confirmTitle = '确定删除该数据吗？';        
        } else if (row[params.filedid].length == 16) {
          confirmTitle = '已绑定系统评估，确定删除该数据吗？';
        } else if (row[params.filedid].indexOf("HCS-") != -1){
          confirmTitle = '已绑定急诊创伤入院评估表，确定删除该数据吗？';
        } else if (row[params.filedid].indexOf("HLIJL-") != -1){
          confirmTitle = '已绑定病情护理记录单，确定删除该数据吗？';
        }
        if(row[params.filedid].indexOf("SD") != -1 || row[params.filedid].indexOf("LY") != -1 || row[params.filedid].indexOf("DOC-") != -1){
        	publicFun.alert(confirmTitle);
        }else {
        	_confirm(confirmTitle, null, function () {
	          $("#" + params.formname).find("." + params.filedid).val(row[params.filedid]);
	          jquerySubByFId(params.formname, emeredel_callback, null, "json");
	          $('#tabDiv').datagrid('clearSelections');
	        })
        }
      }
    }
    //删除 --- 回调
    function emeredel_callback(data) {
      if (data.resultInfo && data.resultInfo.messageCode == '109') {
        message_alert(data, function () {
          window.location.href = "${baseurl}/first.do";
        });
      } else {
        message_alert(data);
        var type = data.resultInfo.type;
        if (type == 1) {
          $('#tabDiv').datagrid('reload');
          $('#tabDiv').datagrid('clearSelections');
          addCom();
        }
      }
    }

    function reload() {
      $('#tabDiv').datagrid('reload');
      addCom();
    }
    $(function () {
      window.onresize = setLayout;
      var seq = comdata.params.filedid;
      if (seq == "zyfxpfSeq") {
        $('#printZy').show()
      } else {
        $('#printZy').hide()
      }
      setLayout();
      init();
    });
  </script>
</body>

</html>