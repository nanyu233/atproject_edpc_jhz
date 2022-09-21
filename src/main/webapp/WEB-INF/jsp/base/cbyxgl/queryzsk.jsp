<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/base/tag.jsp"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>

<head>
  <meta charset="UTF-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
  <title>知识库</title>
  <%@ include file="/WEB-INF/jsp/base/common_css.jsp"%>
  <link rel="stylesheet" type="text/css" href="${baseurl}css/common/querylist.css?v=${versionDay}" />
  <link rel="stylesheet" type="text/css" href="${baseurl}css/hems/global.css?v=${versionDay}">
  <%@ include file="/WEB-INF/jsp/base/common_js.jsp"%>
</head>

<body class="queryhspjbzd ftBody">
  <div class="form clr">
    <input class="long-input" id="queryText" type="text" placeholder="请输入内容(支持拼音简写)" autocomplete="off" onchange="textQuery()" oninput="textQuery()">
    <a href="#" class="easyui-linkbutton" iconCls="icon-search" id="btn" onclick="queryTab()">查询</a>
    <div class="ListWays typeWays">
      <c:forEach items="${jzkscompctlList}" var="value">
        <label class="marginRight">
          <input type="radio" onclick="initTab('${value.comno}')" name="department" value="${value.comno}" class="department${value.comno}"> ${value.comcname}
        </label>
      </c:forEach>
      <label class="marginRight">
        <input type="radio" onclick="initTab()" name="department" value=""> 全部
      </label>
    </div>
  </div>
  <!-- 查询列表 -->
  <div class="list queryTabs">
    <table id="tabList"></table>
  </div>
  <script>
    var currentRow = null;
    function getWidth(proportion) {
      var userAgent = navigator.userAgent; //取得浏览器的userAgent字符串
      var width = '';
      if (userAgent.indexOf("Chrome") > -1) {
        width = $("body").width();
      } else {
        width = $("body").width() - 30;
      }
      return Math.round(proportion * width);
    }
    
    function queryTab () {
      initTab();
    }
    
    function textQuery () {
      if (!$('#queryText').val()) {
        var _ckVal = $("input[name='department']:checked").val();
        initTab(_ckVal)
      } else {
        initTab()
      }
    }

    function initTab (type) {
      if (type) {
        $('#queryText').val('');
      }
      $('#queryText').focus();
      var _height = $(document).height();
      $('#tabList').height(_height - $('.ListWays').height() - 42);
      $('#tabList').datagrid({
        nowrap: true,
        striped: true,
        singleSelect: true,
        url: '${baseurl}firstimp/queryZsk_result.do',
        idField: 'id',
        loadMsg: '',
        columns: initCols(),
        pagination: true,
        rownumbers: true,
        pageList: [15, 30, 50],
        queryParams: {
          "hspCbyxglInfCustom.pysm": $('#queryText').val(),
          "hspCbyxglInfCustom.fzks": type
        },
        onDblClickRow: function (rowIndex, rowData) {
          currentRow = rowData;
          assignText()
        },
        onClickRow: function (rowIndex, rowData) {
          currentRow = rowData;
        }
      });
    }

    function initCols() {
      //datagrid列定义
      var columns_v = [
        [{
          field: 'id',
          title: 'id ',
          width: getWidth(0.2),
          hidden: 'true',
        }, {
          field: 'cbyx',
          title: '内容',
          width: getWidth(0.4),
          formatter: function (value, row, index) {
            switch (row.yjdj) {
              case '0':
                return '<span class="levelAColor">' + value + '</span>';
              case '1':
                return '<span class="levelBColor">' + value + '</span>';
              case '2':
                return '<span style="color:#CDCD00;">' + value + '</span>';
              case '3':
                return '<span class="levelDColor">' + value + '</span>';
              case '4':
                return '<span class="levelDColor">' + value + '</span>';
              default:
                return value
            }
          }
        }, {
          field: 'yjdj',
          title: '分级',
          width: getWidth(0.07),
          formatter: function (value, row, index) {
            switch (value) {
              case '0':
                return 'Ⅰ级';
              case '1':
                return 'Ⅱ级';
              case '2':
                return 'Ⅲ级';
              case '3':
                return 'Ⅳa级';
              case '4':
                return 'Ⅳb级';
            }
          }
        }, {
          field: 'brqxname',
          title: '预去向',
          width: getWidth(0.1)
        }, {
          field: 'fzksname',
          title: '预分诊科室',
          width: getWidth(0.16)
        }, {
          field: 'zbcs',
          title: '准备措施',
          width: getWidth(0.1)
        }, {
          field: 'judgment',
          title: '判断依据',
          hidden: true,
          width: getWidth(0.06),
          formatter: function (value, row, index) {
            return '<a>查看</a>'
          }
        }, {
          field: 'operation',
          title: '操作',
          width: getWidth(0.06),
          formatter: function (value, row, index) {
            return "<span class='url-link'><a href=javascript:assignText()>选择</a></span>";
          }
        }]
      ];
      return columns_v;
    }

    function assignText(){
      if(parent._pageFlag == 'hlpgb' || parent._pageFlag == 'jzcs'){
        parent.sub.hlpgbpatientMsg.preDgnCod = currentRow.cbyx;
        parent.closemodalwindow();
      }else{
        assignTextPre()
      }
    }

    function assignTextPre() {
      if (currentRow.zbcs) {
        parent.$('#measure').html('准备措施：' + currentRow.zbcs);
      }
      parent.$('#cbyxParams').val(currentRow.cbyx);
      if (currentRow.fzks) {
        parent.$('.e_emgFkName').val(currentRow.fzksname);
        parent.$('#emg_emgFkCod').val(currentRow.fzks);
        if (currentRow.fzksname == '急诊产科') { // 急诊产科
          parent.vm.patientMsg.patientTyp = '3';
          parent.vm.getMsg.patientTypList[0].checked = false
          parent.vm.getMsg.patientTypList[1].checked = false
          parent.vm.getMsg.patientTypList[2].checked = true
        }
      }
      parent.$('#checkLevel').val(currentRow.yjdj);
      parent.vm.patientMsg.chkLvlCod = parent.commonFun.countFinalCod();
      if (currentRow.brqx) {
        parent.vm.patientMsg.cstDspCod = currentRow.brqx;
      }
      parent.closemodalwindow();
    }

    $(function () {
      setInitVal();
      $(window).resize(function () {
        var _height = $(document).height();
        $('#tabList').height(_height - $('.ListWays').height() - 42);
      });
    })
    $(document).keydown(function (event) {
      if (event.keyCode == 13) {
        queryTab()
      }
    })

    function setInitVal () {
      // 如果主诉症状为空+患者类别为儿童，则知识库默认选中急诊儿科；
      // 如果主诉症状为空 + 患者类别为孕产妇，则知识库默认选中，急诊产科；
      // 如果投产医院没有急诊产科 则下面的_patientType为3的代码 需要删除
      var _codText = parent.$('#cbyxParams').val(), _patientType = parent.$('#patientType').val();
      $('#queryText').val(_codText);
      var _codDepart = '';
      if (!_codText) {
        if (_patientType === '2') {
          _codDepart = '236';
          $('.department236').attr('checked', true);
        } else if (_patientType === '3') {
          _codDepart = '3031'
          $('.department3031').attr('checked', true);
        }
      }
      initTab(_codDepart)
    }
  </script>

</html>