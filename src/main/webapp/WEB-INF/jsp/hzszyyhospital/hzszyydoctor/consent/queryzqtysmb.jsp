<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/base/tag.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
  <title>知情同意书模本[弹出框]</title>
  <%@ include file="/WEB-INF/jsp/base/common_css.jsp"%>
  <link rel="stylesheet" type="text/css" href="${baseurl}css/common/at-form.css" />
  <link rel="stylesheet" type="text/css" href="${baseurl}css/hzszyyhems/hzszyydoctor/querycfjl.css">
  <%@ include file="/WEB-INF/jsp/base/common_js.jsp"%>
  <script src="${baseurl}lib/avalon1.4.8/avalon.js" type="text/javascript" charset="UTF-8"></script>
</head>

<body>
  <form class="at-form at-form--inline" ms-controller="zqtys">
<%--    <p style="display:inline" class="form-text">模板类型：</p>--%>
<%--    <label ms-repeat="getList.isZqtysTypeList" ms-attr-for="isZqtysType{{el.infocode}}">--%>
<%--      <input ms-attr-id="isZqtysType{{el.infocode}}" type="checkbox" ms-attr-checked="el.checked" ms-click="radioclick('isZqtysType',$index)">--%>
<%--      {{el.info}}--%>
<%--    </label>--%>
    <p style="display:inline" class="form-text">模板名称：</p>
    <input style="display:inline" class="input-base total-right" id="tempname" type="text">
    <div class="at-form-item__content">
      <a class="easyui-linkbutton" iconCls="icon-search" onclick="handoverSheet()">查询</a>
    </div>
  </form>
  <div class="table-container">
    <div id="handoverSheetList"></div>
  </div>
  <script type="text/javascript">
    $(document).keydown(function (event) {
      switch (event.keyCode) {
        case 13:
          handoverSheet();
        case 18:
          event.preventDefault();
        case 116:
          event.preventDefault();
        case 122:
          event.preventDefault();
      }
    });

    var vm = avalon.define({
      $id: 'zqtys',
      patientMsg: {
        isZqtysType: 'ZQTYSMZ'
      },
      getList: {
        isZqtysTypeList: [{
          infocode: 'ZQTYSMZ',
          info: '门诊',
          checked: true
        }, {
          infocode: 'ZQTYS',
          info: '留抢',
          checked: false
        }]
      },
      radioclick: function (name, idx) {
        vm.patientMsg[name] = publicFun.radioClicks(vm.getList[name + 'List'], vm.patientMsg[name], idx)
        handoverSheet();
        // if (parent.parent.parent.vm.patientMsg.pageSrc == 'qjsCaseMz') {
        //   $('#isZqtysTypeZQTYSMZ').attr('checked', true)
        // } else {
        //   vm.patientMsg[name] = publicFun.radioClicks(vm.getList[name + 'List'], vm.patientMsg[name], idx)
        //   handoverSheet();
        // }
      }
    })

    function getWidth(proportion) {
      var width = $('body').width();
      return Math.round(proportion * width);
    }

    function handoverSheet() {
      var height = $('#main', parent.document).height() - 70;
      $('#handoverSheetList').height(height);
      $('#handoverSheetList').datagrid({
        striped: true,
        singleSelect: true,
        url: '${baseurl}zyyconsent/queryHspConsentTemp_result.do',
        // pagination: true,
        rownumbers: true,
        // pageList: [15, 20, 30],
        queryParams: {
          'hspConsentTempCustom.tempname': $("#tempname").val(),
          'hspConsentTempCustom.memo': vm.patientMsg.isZqtysType,
          'tempCode': '${tempCode}'
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
          setTimeout("parent.closemodalwindow()", 500);
          var tempSeq = rowData.tempSeq;
          var tempName = rowData.tempName;
          // var qmHash = rowData.qmHash;
          // var qmTag = rowData.qmTag;
          parent.AddModel(tempSeq, tempName, '${refseqno}', '${cstNam}', '${tempCode}');
        },
        columns: [
          [{
            field: 'tempSeq',
            title: '模板号',
            width: getWidth(.2)
          }, {
            field: 'tempName',
            title: '名称',
            width: getWidth(.5)
          }, {
            field: 'opt1',
            title: '操作',
            width: getWidth(.2),
            formatter: function (value, row, index) {
              return "<span class='url-link'><a href=javascript:handoverSheetAdd('" + row.tempSeq + "','" + row.tempName + "','" + row.qmHash + "','" + row.qmTag + "')>选择</a></span>";
            }
          }]
        ]
      });
    }

    /**
     * 选着模板
     */
    function handoverSheetAdd(tempSeq, tempName, qmHash, qmTag) {
      setTimeout("parent.closemodalwindow()", 500);
      parent.AddModel(tempSeq, tempName, '${refseqno}', '${cstNam}', '${tempCode}');
    }

    $(function () {
      handoverSheet();
      // if (parent.parent.parent.vm.patientMsg.pageSrc == 'qjsCaseMz') {
      //   vm.getList.isZqtysTypeList = [{
      //     infocode: 'ZQTYSMZ',
      //     info: '门诊',
      //     checked: true
      //   }]
      // }
    })
  </script>
</body>

</html>