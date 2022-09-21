<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/base/tag.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
  <title>检查报告</title>
  <%@ include file="/WEB-INF/jsp/base/common_css.jsp"%>
  <link rel="stylesheet" type="text/css" href="${baseurl}css/hems/global.css">
  <link rel="stylesheet" type="text/css" href="${baseurl}css/hzszyyhems/hzszyydoctor/querycfjl.css">
  <%@ include file="/WEB-INF/jsp/base/common_js.jsp"%>
  <script type="text/javascript" src="${baseurl}Lodop6.216/LodopFuncs.js"></script>
</head>

<body class="examinebody tabsBody">
  <script type="text/javascript">
    var _dataTile = '';
    function setLayout() {
      if (parent.$('#mainIfream').width()) {
        var windowsWidth = parent.$('#mainIfream').width(),
          windowsHeigt = parent.$('#mainIfream').height();
        $('#tabList').height(windowsHeigt - 87);
        _dataTile = '检查报告';
      } else {
        var height = 0.97 * ($("#tabs", parent.document).height() - 61);
        $("#tabList").height(height);
        $('.btnPos').hide();
        $('.examinebody').css({ 'padding': '5px 0' })
      }
    }
    $(document).keydown(function (event) {
      switch (event.keyCode) {
        case 13:
          queryTab();
      }
    });

    function reload() {
      $('#tabList').datagrid('reload');
    }

    //datagrid列定义
    var columns_v = [
      [{
        field: 'lsh',
        title: 'id',
        width: getWidth(0.14),
        hidden: true
      }, {
        field: 'ylmc',
        title: '检查项目 ',
        width: getWidth(0.12),
        formatter:function(value,row,index){
                if(value == ''||value == null){
                    return "病理检查报告"
                }
                return value;
            }
      }, {
        field: 'jcjg',
        title: '检查结论',
        width: getWidth(0.3)
      }, {
        field: 'see',
        title: '检查描述',
        width: getWidth(0.30)
      }, {
        field: 'jcysxm',
        title: '报告医生',
        width: getWidth(0.05)
      }, {
        field: 'examineDocName',
        title: '审核医生',
        width: getWidth(0.05)
      }, {
        field: 'shrq',
        title: '报告时间',
        width: getWidth(0.08),
        formatter: function (value, row, index) {
          return value ? publicFun.timeFormat(value, 'yyyy/MM/dd hh:mm:ss') : '';
        }
      }]
    ];

    function init() {
      var today = $("#emg_enddate").val();
      var startdate = $("#emg_startdate").val();
      $('#tabList').datagrid({
        nowrap: false,
        striped: true,
        singleSelect: true,
        rownumbers: true,
        title: _dataTile,
        url: '${baseurl}his/queryjcbg_result.do',
        queryParams: {
          "vHemsJcjgCustom.zyh": '${MPI}',
          "vHemsJcjgCustom.startdate": startdate,
          "vHemsJcjgCustom.enddate": today
        },
        idField: 'lsh',
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
        //pagination: true,
        //rownumbers: true,
        pageList: [15, 30, 50],
      });
      var _thisWidth = $('body').width();
      $('.panel-header,.datagrid-wrap.panel-body,.easyui-panel.panel-body,.datagrid-header').css('width', '' + _thisWidth - 15 + '');
    }

    function getWidth(proportion) {
      var width = $("body").width();
      return Math.round(proportion * width);
    }

    //查询方法
    function queryTab() {
      var start = $("#emg_startdate").val();
      var end = $("#emg_enddate").val();
      if (publicFun.searchTime(start, end) === false) {
        return false
      }
      var formdata = $("#jcbgForm").serializeJson();
      $('#tabList').datagrid('load', formdata);
    }

    function setTime() {
      var _startdate = publicFun.timeFormat('${emgDat}', "yyyy/MM/dd");
      var _enddate = publicFun.timeFormat('${cyrqDat}', "yyyy/MM/dd");
      if (_enddate == null || _enddate == '') {
        _enddate = publicFun.timeFormat(new Date(), "yyyy/MM/dd");
      }
      $("#emg_startdate").val(_startdate);
      $("#emg_enddate").val(_enddate);
    };
    //初始化 判断登陆用户角色是否有权限
    function checkRole() {
      //判断是否有权限
      publicFun.httpServer({ url: '${baseurl}zyylqbl/checkRoleAjax.do' }, {"cratNbr": ''}, function (data) {
        checkstatus = data.resultInfo.message;
        if (data.resultInfo.message == "tourist") {
          $('#print').hide();
        }
      });
    }
    $(function () {
      setLayout();
      checkRole();
      setTime();
      init();
      $(window).resize(function () {
        init();
      });
    });
  </script>
  <form id="jcbgForm">
    <!-- html的静态布局 -->
    <!-- 查询条件 -->
    <input type="hidden" id="jzkh" name="vHemsJcjgCustom.zyh" value="${MPI}" />
    <div class="form clr" style="margin:1px">
      <p class="form-text" style="font-size:14px">日期：</p>
      <input class="input-date Wdate" id="emg_startdate" type="text" name="vHemsJcjgCustom.startdate" onclick="WdatePicker({dateFmt:'yyyy/MM/dd'})">
      <p class="form-text">-</p>
      <input class="input-date Wdate" id="emg_enddate" type="text" name="vHemsJcjgCustom.enddate" onclick="WdatePicker({dateFmt:'yyyy/MM/dd'})">
      <a href="#" class="easyui-linkbutton" iconCls="icon-search" id="btn" onclick="queryTab()">查询</a>
    </div>
    <!-- 查询列表 -->
  </form>
  <div class="list_table list_div" id="check_table">
    <table id="tabList"></table>
  </div>
  <div class="btnPos">
    <a href="javascript:;" class="commonbtn" id="print" onclick="printnote()">打印</a>
  </div>

  <!-- 打印检查报告 -->
  <div style="display:none">
    <div id="printnoteA" class="print-body" style="display:block;float:left;width:210mm;font-family:'微软雅黑';">
      <jsp:include page="/WEB-INF/jsp/hzszyyhospital/printBasicInfo/printBasicYsd.jsp"></jsp:include>
      <ul class="print-ul">
        <li class="bordered">
          <span class="basic-span">
            <label class="title-label">姓名：</label>
            <span>${hspemginfCustom.cstNam}</span>
          </span>
          <span class="basic-span">
            <label class="title-label">性别：</label>
            <span>${hspemginfCustom.cstSexCod}</span>
          </span>
          <span class="basic-span">
            <label class="title-label">年龄：</label>
            <span id="_age">${hspemginfCustom.cstAge}${hspemginfCustom.cstAgeCod}</span>
          </span>
          <span class="basic-span">
            <label class="title-label">科别：</label>
            <span id="_emgFkCod">急诊科门诊</span>
          </span>
          <span class="basic-span">
            <label class="title-label">病历号：</label>
            <span id="_mpi">${hspemginfCustom.mpi}</span>
          </span>
        </li>
      </ul>
    </div>
    <div id="printnoteB" class="print-body" style="display:block;float:left;width:210mm;font-family:'微软雅黑';">
      <table id="printlist" class="printable">
        <colgroup>
          <col width="10%" />
          <col width="24%" />
          <col width="34%" />
          <col width="6%" />
          <col width="6%" />
          <col width="14%" />
        </colgroup>
        <thead>
          <tr>
            <th>检查项目</th>
            <th>检查结论</th>
            <th>检查描述</th>
            <th>报告医生</th>
            <th>审核医生</th>
            <th>报告时间</th>
          </tr>
        </thead>
        <tbody>
        </tbody>
      </table>
    </div>
  </div>
  <script type="text/javascript">
    function setTable() {
      $("#printlist tbody").html("");
      $("#printlist tbody").append('<tr id="template"><td id="ylmc"></td><td id="jcjg"></td><td id="see"></td><td id="jcysxm"></td><td id="examineDocName"></td><td id="shrq"></td></tr>');
      $('.print-ul').css({ "float": "left", "width": "90%", "font-size": "0.38cm", "margin": "0 5%", "padding": "0" });
      $('.print-ul span.basic-span').css({ "display": "inline-block", "margin-right": "3mm" });
      $('.printable').css({ "font-size": "3.3mm", "border": "1px solid #000", "width": "98%", "margin-left": "1%", "margin-top": "0mm", "border-collapse": "collapse", "padding": "0mm" });
      $(".printable th").css({ "border": "1px solid #000" });
      $(".printable td").css({ "border": "1px solid #000", "text-align": "center" });
      $('span').css({ "display": "inline-block" });

      if ($('#_age').html() == '岁') {
        $('#_age').html("__/__");
      }
      if ($('#_emgFkCod').html() == '') {
        $('#_emgFkCod').html("__/__");
      }
      if ($('#_mpi').html() == '') {
        $('#_mpi').html("__/__");
      }
      if ($('#_lgh').html() == '') {
        $('#_lgh').html("__/__");
      }

      $('#id_title2').html('检查报告');
      var allRows = $('#tabList').datagrid('getData')['rows'];
      var codList = ['ylmc', 'jcjg', 'see', 'jcysxm', 'examineDocName'];
      for (var i = 0; i < (allRows.length); i++) {
        var row = $("#template").clone();
        codList.map(function (ele) {
          if (allRows[i][ele] !== null &&  allRows[i][ele] != '') {
            row.find("#" + ele).text(allRows[i][ele]);
          }
        })
        if (allRows[i]['shrq'] != null || allRows[i]['shrq'] != '') {
          allRows[i]['shrq'] = publicFun.timeFormat(allRows[i]['shrq'], 'yyyy/MM/dd hh:mm')
          row.find("#shrq").text(allRows[i]['shrq']);
        }
        row.appendTo("#printlist");//添加到模板的容器中
      }
      var obj = document.getElementById("printlist");
      obj.deleteRow(1);
    }

    /**
    * [printnote 打印记录]
    */
    function printnote() {
      var allRows = $('#tabList').datagrid('getData')['rows'];
      if (allRows.length === 0) {
        // $.messager.alert('提示信息', '数据不存在', 'warning');
        return
      }
      try {
        setTable();
        // LODOP = window.top.getLodop();
        LODOP = getLodop();
        LODOP.PRINT_INITA(0, 0, "210mm", "297mm", "打印控件功能演示_Lodop功能_超文本内容缩放打印");
        LODOP.SET_PRINT_PAGESIZE(0, "210mm", "297mm", "");
        LODOP.SET_PRINT_MODE("NOCLEAR_AFTER_PRINT", true);
        LODOP.ADD_PRINT_HTM(1050, 344, "90%", "100%", "<font style='font-size:12px' format='0'><span tdata='pageNO'>第##页</span>/<span tdata='pageCount'>共##页</span></font>");
        LODOP.SET_PRINT_STYLEA(0, "ItemType", 1);
        LODOP.ADD_PRINT_TABLE(94, 0, "100%", "80%", document.getElementById("printnoteB").innerHTML);
        LODOP.NewPageA();
        LODOP.SET_PRINT_STYLE("FontSize", 10);
        //LODOP.SET_PRINTER_INDEX("DASCOM DL-630Z");   
        LODOP.ADD_PRINT_HTM(3, 0, "100%", "100%", document.getElementById("printnoteA").innerHTML);
        LODOP.SET_PRINT_STYLEA(0, "ItemType", 1);
        LODOP.PREVIEW();
        //LODOP.PRINT();
      } catch (e) {
        $.messager.alert('提示信息', '数据存在某些问题，请刷新后重试', 'warning');
      }
    }
  </script>
</body>

</html>