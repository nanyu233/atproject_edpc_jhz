<%@ page language="java" contentType="text/html; charset=UTF-8"
  pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/base/tag.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <%@ include file="/WEB-INF/jsp/base/common_css.jsp"%>
  <%@ include file="/WEB-INF/jsp/base/common_js.jsp"%>
  <link rel="stylesheet" type="text/css" href="${baseurl}css/common/querylist.css?v=${versionDay}" />
  <link rel="stylesheet" type="text/css" href="${baseurl}css/hems/global.css?v=${versionDay}" />
  <script src="${baseurl}lib/avalon1.4.8/avalon.js" type="text/javascript" charset="UTF-8"></script>
  <title>消息提醒列表</title>
</head>

<body class="queryhspjbzd" id="dangerBoxInfo">
  <script type="text/javascript">
    $(document).keydown(function (event) {
      switch (event.keyCode) {
        case 13:
          queryIcuEr();
      }
    });
    function reload() {
      $('#icuErList').datagrid('reload');
    }

    function generateParam() {
      var param = {
        'startdate': $("#startdate").val(),
        'enddate': $("#enddate").val(),
        'icuErInfoCustom.erType': $('#erType').val(),
        'icuErInfoCustom.erStat': vm.patientMsg.isBlzskType
      };
      return param;
    }

    //加载datagrid
    function getDataGrid() {
      var height = 0.975 * ($("#tabs", parent.document).height() - 34 - 18);
      $("#icuErList").height(height);

      var toolbar_v;
      publicFun.ajaxVal('${moduleid}', toolbar_v, callBack);

      //datagrid列定义
      var columns_v = [
        [{
          field: 'crtTimeStr',
          title: '消息日期',
          width: getWidth(0.1),
        }, {
          field: 'erStat',
          title: '消息状态',
          width: getWidth(0.1),
          formatter: function (value, row, idx) {
            var returnVal = '';
            if (value) {
              $.each(vm.getList.isBlzskTypeList, function (idx, ele) {
                if (ele.infocode === value) {
                  returnVal = ele.info;
                  return false; //break
                }
              })
            } else {
              returnVal = '';
            }
            return returnVal;
          }
        }, {
          field: 'erName',
          title: '消息类型',
          width: getWidth(0.1),
        }, {
          field: 'erInfo',
          title: '消息内容',
          width: getWidth(0.35),
        }, {
          field: 'modUser',
          title: '接收人',
          width: getWidth(0.1),
        }, {
          field: 'modTimeStr',
          title: '接收时间',
          width: getWidth(0.1),
        }, {
          field: 'operate',
          title: '操作',
          width: getWidth(0.1),
          formatter: function (value, row, idx) {
            var spanStr = '';
            if (row.erStat === '1') {
              //未处理展示操作按钮
              spanStr += '<span class="url-link">';
              spanStr += '<a href=javascript:dealDangerBox(' + idx + ')>处理</a></span>';
            }
            return spanStr;
          }
        }
        ]
      ];
      function callBack(toolbar_v) {
        $('#icuErList').datagrid({
          nowrap: true,
          striped: true,
          singleSelect: true,
          url: '${baseurl}icuer/getErInfoListFy.do',
          idField: 'erSeq',
          loadMsg: '',
          queryParams: generateParam(),
          columns: columns_v,
          pagination: true,
          rownumbers: true,
          pageList: [20, 30, 50]
        });
      }
    };

    function dealDangerBox(idx) {
      $('#icuErList').datagrid('selectRow', idx);
      var _dangerList = [];
      if (idx != null && idx !== '') {
        _dangerList.push($('#icuErList').datagrid('getSelected'));
        publicFun.setItem('dangerBoxList', _dangerList);
        parent.parent._dangerList = JSON.parse(JSON.stringify(_dangerList));
        parent.parent.timingBox();
      }
    }

    function getWidth(proportion) {
      var width = $("body").width();
      return Math.round(proportion * width);
    }

    //查询方法
    function queryIcuEr() {
      var formdata = $("#hspjbzdqueryForm").serializeJson();
      $('#icuErList').datagrid('load', formdata);
    }

    function setTime() {
      var _today = publicFun.timeFormat(new Date(), 'yyyy/MM/dd');
      $("#startdate").val(_today);
      $("#enddate").val(_today);
    };

    var vm = avalon.define({
      $id: 'blzsk',
      patientMsg: {
        isBlzskType: ''
      },
      getList: {
        isBlzskTypeList: [{
          infocode: '',
          info: '全部',
          checked: true
        }, {
          infocode: '1',
          info: '未处理',
          checked: false
        }, {
          infocode: '2',
          info: '已处理',
          checked: false
        }, {
          infocode: '9',
          info: '已删除',
          checked: false
        }]
      },
      radioClick: function (name, idx) {
        vm.patientMsg[name] = publicFun.radioClicks(vm.getList[name + 'List'], vm.patientMsg[name], idx)
        getDataGrid();
      }
    })

    $(function () {
      setTime();
      getDataGrid();
    })
  </script>
  <!-- html的静态布局 -->
  <form id="hspjbzdqueryForm" ms-controller="blzsk">
    <!-- 查询条件 -->
    <div class="form clr">
      <span class="form-text">&nbsp;消息日期：</span>
      <input type="text" class="input-date Wdate" id="startdate" name="startdate" onfocus="new WdatePicker({dateFmt:'yyyy/MM/dd'})">
      <span class="form-text">至</span>
      <input type="text" class="input-date Wdate" id="enddate" name="enddate" onfocus="new WdatePicker({dateFmt:'yyyy/MM/dd'})" />
      <p class="form-text">&nbsp;消息状态：</p>
      <label ms-repeat="getList.isBlzskTypeList" ms-attr-for="isBlzskType{{el.infocode}}">
        <p class="form-text">
          <input ms-attr-id="isBlzskType{{el.infocode}}" type="checkbox" ms-attr-checked="el.checked" ms-click="radioClick('isBlzskType',$index)">
          {{el.info}}
        </p>
      </label>
      </p>
      <p class="form-text">&nbsp;消息类型：</p>
      <select id='erType' name="icuErInfoCustom.erType" class="departments">
        <option value="">全部</option>
        <option value="WJZ">危急值</option>
      </select>
      </label> <a href="javascript:;" class="easyui-linkbutton" iconCls="icon-search" id="btn" onclick="getDataGrid()">查询</a>
    </div>
    <!-- 查询列表 -->
    <div class="list queryTabs">
      <table id="icuErList"></table>
    </div>
  </form>
</body>

</html>