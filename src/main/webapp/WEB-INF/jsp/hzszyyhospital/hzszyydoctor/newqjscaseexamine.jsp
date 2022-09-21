<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/base/tag.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
  <title>检验信息</title>
  <%@ include file="/WEB-INF/jsp/base/common_css.jsp"%>
  <link rel="stylesheet" type="text/css" href="${baseurl}css/hems/global.css">
  <%@ include file="/WEB-INF/jsp/base/common_js.jsp"%>
  <script type="text/javascript" src="${baseurl}Lodop6.216/LodopFuncs.js"></script>
</head>

<body class="examinebody tabsBody">
  <script type="text/javascript">
    var _leftWth = 0;
    function setLayout() {
      // 判断是医生端的检验信息还是床位这边的检验信息
      if (parent.$('#mainIfream').width()) {
        var windowsWidth = parent.$('#mainIfream').width(),
          windowsHeight = parent.$('#mainIfream').height() - 87;
        $('#mainExamineList').width(450).height(windowsHeight);
        $('#examineList').width(windowsWidth - 475).height(windowsHeight);
        _leftWth = 475;
      } else {
        var windowsWidth = $('body').width() - 100,
          windowsHeight = 0.975 * ($("#tabs", parent.document).height() - 61);
        $('#mainExamineList').width(550).height(windowsHeight);
        $('#examineList').width(windowsWidth - 575).height(windowsHeight);
        _leftWth = 575;
        $('.btnPos').hide();
        $('.examinebody').css({ 'padding': '5px 0' })
      }
    }
    //enter按键默认触发查询
    $(document).keydown(function (event) {
      switch (event.keyCode) {
        case 13:
          queryExamine()
      }
    });

    function reload() {
      $('#mainExamineList').datagrid('reload');
      $('#examineList').datagrid('reload');
    }

    function isRangeColor(row) {
      var _currentResult = '';
      if (row.result) {
        _currentResult = row.result.replace(/[^\d|.]/g, '');
      }
      if (row.lowerLimit && row.upperLimit) {
        if (parseFloat(_currentResult) > parseFloat(row.upperLimit)) {
          return "color:red;";
        } else if (parseFloat(_currentResult) < parseFloat(row.lowerLimit)) {
          return "color:#7cd89b";
        } else {
          return "";
        }
      } else {
        return "";
      }
    }
    /**
    * * 定义datagrid的内容field
    **/
    var columnse_v = [
      [{
        field: 'rownums',
        title: 'id',
        hidden: true
      }, {
        field: 'patientId',
        title: '预检号',
        width: getWidth(0.10),
        hidden: true
      }, {
        field: 'resultDateTime',
        title: '报告时间',
        width: getWidth(0.15),
        sortable: true,
        formatter: function (value, row, index) {
          return value ? publicFun.timeFormat(new Date(value), "yyyy/MM/dd hh:mm:ss") : ""
        },
        hidden: true
      }, {
        field: 'examinaim',
        title: '样本类型',
        sortable: true,
        width: getWidth(0.15),
        hidden: true
      }, {
        field: 'reportItemName',
        title: '试验名称',
        sortable: true,
        width: getWidth(0.30)
      }, {
        field: 'result',
        title: '分析结果',
        sortable: true,
        width: getWidth(0.1),
        styler: function (value, row, index) {
          return isRangeColor(row);
        }
      }, {
        field: 'lowerLimit',
        title: '参考范围低限',
        sortable: true,
        width: getWidth(0.15),
        styler: function (value, row, index) {
          return isRangeColor(row);
        }
      }, {
        field: 'upperLimit',
        title: '参考范围高限',
        sortable: true,
        width: getWidth(0.15),
        styler: function (value, row, index) {
          return isRangeColor(row);
        }
      }, {
        field: 'units',
        title: '单位',
        sortable: true,
        width: getWidth(0.1),
        styler: function (value, row, index) {
          return isRangeColor(row);
        }
      }, {
        field: 'sampleno',
        title: '样例号',
        sortable: true,
        width: getWidth(0.10),
        hidden: true
      }]
    ];
    //加载datagrid
    function abnTable() {
      //datagrid列定义
      var columns_v = [
        [{
          field: 'patientId',
          title: '预检号',
          width: getWidth(0.10),
          hidden: true
        }, {
          field: 'resultDateTime',
          title: '报告时间',
          width: 130,
          sortable: true,
          formatter: function (value, row, index) {
            return value ? publicFun.timeFormat(new Date(value), "yyyy/MM/dd hh:mm:ss") : ""
          }
        }, {
          field: 'examinaim',
          title: '样本类型',
          sortable: true,
          width: 220,
          formatter: function (value, row, index) {
      		if(row.jylx){
      			value = '<font color="red">（'+row.jylxmc+'）</font>' + value;
      		}
            return value;
          },
        }/* , {
              field: 'sjys',
              title: '送检医生',
              sortable: true,
              width: 55,
          }, {
              field: 'jyz',
              title: '检验者',
              sortable: true,
              width: 55,
          }, {
              field: 'shr',
              title: '审核人',
              sortable: true,
              width: 55,
          } */]
      ]

      setTime();
      var today = $("#emg_enddate").val();
      var startdate = $("#emg_startdate").val();
      $('#mainExamineList').datagrid({
        nowrap: true,
        striped: true,
        singleSelect: true,
        url: '${baseurl}his/queryexamine_result.do',
        queryParams: {
          "vHemsJyjgCustom.patientId": '${MPI}',
          "vHemsJyjgCustom.startdate": startdate,
          "vHemsJyjgCustom.enddate": today
        },
        idField: 'patientId',
        columns: columns_v,
        rownumbers: true,
        onClickRow: function (rowIndex, rowData) {
          var resultDateTime = publicFun.timeFormat(rowData.resultDateTime, "yyyy/MM/dd hh:mm:ss");
          $('#examineList').datagrid({
            nowrap: true,
            striped: true,
            singleSelect: true,
            url: '${baseurl}his/queryexamineinfo_result.do',
            queryParams: {
              "vHemsJyjgCustom.patientId": rowData.patientId,
              "vHemsJyjgCustom.sampleno": rowData.sampleno,
              "vHemsJyjgCustom.resultDateTime": resultDateTime
            },
            idField: 'rownums',
            columns: columnse_v,
            pagination: true,
            rownumbers: true,
            pageList: [50,70,90]
          });
        }
      });
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

    function init() {
      abnTable();
      $('#examineList').datagrid({
        nowrap: false,
        striped: true,
        singleSelect: true,
        idField: 'rownums',
        loadMsg: '',
        columns: columnse_v,
        title: "检验信息",
        rownumbers: true
      });
      var _thisWidth = $('body').width();
      $('.subDiv .panel-header,.subDiv .datagrid-wrap.panel-body,.subDiv .easyui-panel.panel-body,.subDiv .datagrid-header').css('width', '' + (_thisWidth - _leftWth) + '');
    }

    function getWidth(proportion) {
      var width = $("body").width() * 0.62;
      return Math.round(proportion * width);
    }
    //查询方法
    function queryExamine() {
      var formdata = $("#examineForm").serializeJson();
      $('#mainExamineList').datagrid('load', formdata);
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
    $(function () {
      setLayout();
      checkRole();
      init();
      $(window).resize(function () {
        init();
      });
    });
  </script>
  <form id="examineForm">
    <!-- html的静态布局 -->
    <!-- 查询条件 -->
    <input type="hidden" id="patientId" name="vHemsJyjgCustom.patientId" value="${MPI}" />
    <div class="form clr" style="margin:1px">
      <p class="form-text">日期：</p>
      <input class="input-date Wdate" id="emg_startdate" type="text" name="vHemsJyjgCustom.startdate" onclick="WdatePicker({dateFmt:'yyyy/MM/dd'})">
      <p class="form-text">-</p>
      <input class="input-date Wdate" id="emg_enddate" type="text" name="vHemsJyjgCustom.enddate" onclick="WdatePicker({dateFmt:'yyyy/MM/dd'})">
      <a href="#" class="easyui-linkbutton" iconCls="icon-search" id="btn" onclick="queryExamine()">查询</a>
    </div>
    <!-- 查询列表 -->
  </form>
  <div class="mainDiv">
    <table id="mainExamineList"></table>
  </div>
  <div class="subDiv">
    <table id="examineList"></table>
  </div>
  <div class="btnPos">
    <a href="javascript:;" class="commonbtn" id="print" onclick="printnote()">打印</a>
  </div>
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
          <!-- <span class="basic-span">
            <label class="title-label">留观号：</label>
            <span id="_lgh">${hspemginfCustom.observationCode}</span>
          </span> -->
        </li>
      </ul>
    </div>
    <div id="printnoteC" class="print-body" style="display:block;float:left;width:210mm;font-family:'微软雅黑';">
      <ul class="print-ul2" id="printul" style="display: none">
        <li>
          <span class="checkspanB">
            <label>样本类型：</label>
            <span id="examinaim"></span>
          </span>
          <span class="checkspanB">
            <label>样本号：</label>
            <span id="sampleno"></span>
          </span>
        </li>
        <li>
          <p>审核意见</p>
        </li>
      </ul>
      <table id="printlist2" class="printable" style="display: none;">
        <colgroup>
          <col width="23%" />
          <col width="1%" />
          <col width="8%" />
          <col width="8%" />
          <col width="10%" />
          <col width="23%" />
          <col width="1%" />
          <col width="8%" />
          <col width="8%" />
          <col width="10%" />
        </colgroup>
        <thead>
          <tr>
            <th>检验项目</th>
            <th></th>
            <th>结果</th>
            <th>单位</th>
            <th>参考值</th>
            <th>检验项目</th>
            <th></th>
            <th>结果</th>
            <th>单位</th>
            <th>参考值</th>
          </tr>
        </thead>
        <tbody>
        </tbody>
      </table>
      <ul class="print-ul2" id="printul2" style="display: none;">
        <li>
          <span class="checkspan">
            <label>送检医生：</label>
            <span id="sjys"></span>
          </span>
          <span class="checkspan">
            <label>检验者：</label>
            <span id="jyr"></span>
          </span>
          <span class="checkspan">
            <label>审核人：</label>
            <span id="shr"></span>
          </span>
          <span class="checkspan">
            <label>打印人：</label>
            <span id="dyr">${sessionScope.activeUser.usrname}</span>
          </span>
        </li>
        <li>
          <span class="checkspan">
            <label>采集时间：</label>
            <span id="cjdate"></span>
          </span>
          <span class="checkspan">
            <label>接收时间：</label>
            <span id="jsdate"></span>
          </span>
          <span class="checkspan">
            <label>报告时间：</label>
            <span id="bgdate"></span>
          </span>
          <span class="checkspan">
            <label>打印时间：</label>
            <span id="dydate"></span>
          </span>
        </li>
        <li>
          <hr style="overflow:hidden;width:100%;height:1px;border:none;border-top:2px solid #000;margin-bottom:0;margin-top:10px;" />
          <hr style="overflow:hidden;width:100%;height:1px;border:none;border-top:2px solid #000;margin-bottom:0" />
        </li>
      </ul>
    </div>
    <div id="printnoteD" class="print-body" style="display:block;float:left;width:210mm;font-family:'微软雅黑';">

    </div>
  </div>
  <script type="text/javascript">
    function setTable() {
      $("#printlist2 tbody").append('<tr id="template2"><td id="testItem"></td><td id="mark"></td><td id="itemResult"></td><td id="units"></td><td id="allLimit"><td id="testItem2" style="border-left:1px solid #000"></td><td id="mark2"></td><td id="itemResult2"></td><td id="units2"></td><td id="allLimit2"></tr>');
      $('.print-ul').css({ "float": "left", "width": "98%", "font-size": "0.38cm", "margin": "0 1%", "padding": "0" });
      $('.print-ul span.basic-span').css({ "display": "inline-block", "margin-right": "3mm" });
      $('.printable').css({ "font-size": "3.3mm", "border-top": "1px solid #000", "border-bottom": "1px solid #000", "width": "98%", "margin-left": "1%", "margin-top": "0mm", "border-collapse": "collapse" });
      $('.print-ul2').css({ "float": "left", "width": "98%", "font-size": "0.33cm", "margin": "0 1%", "padding": "0" });
      $('.checkspanB').css({ 'width': '30%', 'float': 'left', 'height': '2em', 'line-height': '2em' });
      $('.checkspan').css({ 'width': '25%', 'float': 'left', 'height': '2em', 'line-height': '2em' });
      $('.print-ul li.bordered').css({ "float": "left", "width": "99%", "margin-left": "1%", "padding-bottom": "0mm", "list-style": "none", "border-bottom": "1px solid #000", "margin-bottom": "1mm", "line-height": "1.5" });
      $(".printable th").css({ "font-size": "4.3mm" });
      $(".printable td").css({ "text-align": "left", "padding-left": "5px" });
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
      $('#id_title2').html('检验信息');
      var today = $("#emg_enddate").val();
      var startdate = $("#emg_startdate").val();
      var _thisUrl = "${baseurl}his/ajaxexaminenew.do?&vHemsJyjgCustom.patientId=${MPI}&vHemsJyjgCustom.startdate=" + startdate + "&vHemsJyjgCustom.enddate=" + today;
      var row;
      var alldata;
      var allul1,
        allul2;
      publicFun.httpServer({ url: _thisUrl }, {}, function (res) {
        var list = res.resultInfo.sysdata.list;
        var group = [];
        var listLth = parseInt(list.length);
        $.each(list, function (ide, val) {
          alldata = $('#printlist2').clone();
          allul1 = $('#printul').clone();
          allul2 = $('#printul2').clone();
          alldata.css('display', 'block');
          allul1.css('display', 'block');
          allul2.css('display', 'block');
          if (val['examinaim'] != "" && val['examinaim'] != null) {
            allul1.find('#examinaim').text(val['examinaim']);
          }
          allul1.find('#sampleno').text(val['sampleno']);
          /*    allul2.find('#sjys').text(val['sjys']);
              allul2.find('#jyz').text(val['jyz']);
              allul2.find('#shr').text(val['shr']);*/
          var dydate = publicFun.timeFormat(new Date(), 'yyyy/MM/dd hh:mm:ss');
          var bgdate = publicFun.timeFormat(val['resultDateTime'], 'yyyy/MM/dd hh:mm:ss');
          allul2.find('#bgdate').text(bgdate);
          allul2.find('#dydate').text(dydate);
          var arr = val.vlist;
          $.each(arr, function (idx, val) {
            if (idx % 2 == 0) {
              row = $("#template2").clone();
              if (val['reportItemName'] != null && val['reportItemName'] != '') {
                row.find("#testItem").text(val['reportItemName']);
              }
              if (val['result'] != null && val['result'] != '') {
                row.find("#itemResult").text(val['result']);
              }
              if (val['units'] != null && val['units'] != '') {
                row.find("#units").text(val['units']);
              }
              if (parseFloat(val['result']) < parseFloat(val['lowerLimit'])) {
                row.find("#mark").text("↓");
              }
              if (parseFloat(val['upperLimit']) < parseFloat(val['result'])) {
                row.find("#mark").text("↑");
              }
              if (val['lowerLimit'] != null && val['lowerLimit'] != '') {
                var allLimit = val['lowerLimit'] + '~' + val['upperLimit'];
                row.find("#allLimit").text(allLimit);
              }
            } else {
              if (val['reportItemName'] != null && val['reportItemName'] != '') {
                row.find("#testItem2").text(val['reportItemName']);
              }
              if (val['result'] != null && val['result'] != '') {
                row.find("#itemResult2").text(val['result']);
              }
              if (val['units'] != null && val['units'] != '') {
                row.find("#units2").text(val['units']);
              }
              if (parseFloat(val['result']) < parseFloat(val['lowerLimit'])) {
                row.find("#mark2").text("↓");
              }
              if (parseFloat(val['upperLimit']) < parseFloat(val['result'])) {
                row.find("#mark2").text("↑");
              }
              if (val['lowerLimit'] != null && val['lowerLimit'] != '') {
                var allLimit = val['lowerLimit'] + '~' + val['upperLimit'];
                row.find("#allLimit2").text(allLimit);
              }
            }
            row.appendTo(alldata);
          });
          // var obj = alldata;
          // obj.deleteRow(1);
          allul1.appendTo($('#printnoteD'));
          alldata.appendTo($('#printnoteD'));
          allul2.appendTo($('#printnoteD'));
          if (ide % 3 == 2) {
            LODOP.ADD_PRINT_HTM(94, 0, "100%", "85%", document.getElementById("printnoteD").innerHTML);
            LODOP.NewPageA();
            $("#printnoteD").html("");
          }
        })
        if (listLth % 3 != 0) {
          LODOP.ADD_PRINT_HTM(94, 0, "100%", "85%", document.getElementById("printnoteD").innerHTML);
          LODOP.NewPageA();
          $("#printnoteD").html("");
        }
        
      LODOP.SET_PRINT_STYLE("FontSize", 10);
      LODOP.ADD_PRINT_HTM(3, 0, "100%", "100%", document.getElementById("printnoteA").innerHTML);
      LODOP.SET_PRINT_STYLEA(0, "ItemType", 1);
      LODOP.PREVIEW();
      })
    }

    /**
    * [printnote 打印记录]
    */
    function printnote() {
      var allRows = $('#mainExamineList').datagrid('getData')['rows'];
      if (allRows.length === 0) {
        // $.messager.alert('提示信息', '数据不存在', 'warning');
        return
      }
      try {
        // LODOP = window.top.getLodop();
        LODOP = getLodop();
        LODOP.PRINT_INITA(0, 0, "210mm", "297mm", "打印控件功能演示_Lodop功能_超文本内容缩放打印");
        LODOP.SET_PRINT_PAGESIZE(0, "210mm", "297mm", "");
        LODOP.SET_PRINT_MODE("NOCLEAR_AFTER_PRINT", true);
        LODOP.ADD_PRINT_HTM(1050, 344, "90%", "100%", "<font style='font-size:12px' format='0'><span tdata='pageNO'>第##页</span>/<span tdata='pageCount'>共##页</span></font>");
        LODOP.SET_PRINT_STYLEA(0, "ItemType", 1);
        setTable();
        // LODOP.ADD_PRINT_HTM(94, 0, "100%", "85%",document.getElementById("printnoteD").innerHTML);
        //LODOP.PRINT();
      } catch (e) {
        $.messager.alert('提示信息', '数据存在某些问题，请刷新后重试', 'warning');
      }
    }
  </script>
</body>

</html>