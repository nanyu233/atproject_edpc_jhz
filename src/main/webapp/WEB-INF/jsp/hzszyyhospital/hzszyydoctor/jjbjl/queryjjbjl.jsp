<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/base/tag.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
  <title>交接班记录</title>
  <%@ include file="/WEB-INF/jsp/base/common_css.jsp"%>
  <link rel="stylesheet" type="text/css" href="${baseurl}css/common/querylist.css?190" />
</head>

<body>
  <div class="queryTabs">
    <div id="handoverSheetList"></div>
  </div>
  <jsp:include page="/WEB-INF/jsp/hzszyyhospital/hzszyydoctor/diseaseCourse/printDiseaseCourse.jsp"></jsp:include>
  <div class="printnote" id="printnoteContainer" style="display: none;">
    <object id="ocx" classid="clsid:66665BEC-6877-4720-B1AC-56FA0A71B700" width=0px height=0px></object>
  </div>
  <%@ include file="/WEB-INF/jsp/base/common_js.jsp"%>
  <script type="text/javascript" src="${baseurl}Lodop6.216/LodopFuncs.js"></script>
  <script type="text/javascript">
    function getWidth(proportion) {
      var width = $('body').width();
      return Math.round(proportion * width);
    }

    function handoverSheet(flag, dataTitle) {
      var height = $('.maindiv', parent.document).height() - 30;
      $('#handoverSheetList').height(height);
      var jjbjlType = flag;
      $('#handoverSheetList').datagrid({
        nowrap: false,
        striped: true,
        singleSelect: true,
        idField: '',
        loadMsg: '',
        pagination: true,
        rownumbers: true,
        title: dataTitle,
        pageList: [20, 30, 50],
        url: '${baseurl}zyylqbl/queryjjbjl_result.do',
        queryParams: {
          'hspJjbjlInfCustom.jjbjlType': jjbjlType,
          'hspJjbjlInfCustom.emgSeq': '${emgSeq}'
        },
        loadFilter: function (data) {
          if (data.resultInfo && data.resultInfo.messageCode == '109') {
            message_alert(data, function () {
              window.location.href = '${baseurl}first.do';
            });
          }
          return data;
        },
        columns: [
          [{
            field: 'jjbjlDat',
            title: '交接班时间',
            width: getWidth(.1),
            formatter: function (value, row, index) {
              return publicFun.timeFormat(value, 'yyyy/MM/dd hh:mm')
            }
          }, {
            field: 'jjbjlContent',
            title: '记录内容',
            width: getWidth(.7)
          }, {
            field: 'jjbjlType',
            title: '类别',
            width: getWidth(.05),
            formatter: function (value, row, index) {
              var jjbjlType;
              switch (value) {
                case '0':
                  jjbjlType = '交班';
                  break;
                default:
                  jjbjlType = '接班';
                  break;
              }
              return jjbjlType
            }
          }, {
            field: 'jjbjlNum',
            hidden: true
          }, {
            field: 'jjbjlNam',
            title: '记录人',
            width: getWidth(.1)
          }]
        ],
        onDblClickRow: function (index, row) {
          editMsg();
        }
      });
      var _thisWidth = $('body').width();
      $('.panel-header,.datagrid-wrap.panel-body,.easyui-panel.panel-body,.datagrid-header').css('width', '' + _thisWidth - 10 + '');
    }
    /**
     * [editMsg 修改查房记录]
     */
    function editMsg() {
      var checkedRows = $('#handoverSheetList').datagrid('getSelected');
      if (checkedRows == null) {
        publicFun.alert('请选择一条数据');
      } else {
        var url = '${baseurl}zyylqbl/toupdatejjbjl.do?jjbjlSeq=' + checkedRows['jjbjlSeq'] + '&emgSeq=${emgSeq}';
        parent.editCourse(url);
      }
    }
    /**
     * [delMsg 删除查房记录]
     */
    function delMsg() {
      var checkedRows = $('#handoverSheetList').datagrid('getSelected');
      if (checkedRows == null) {
        publicFun.alert('请选择一条数据');
      } else {
        //判断是否有权限
        $.ajax({
          url: "${baseurl}zyylqbl/checkRoleAjax.do?",
          type: "post",
          data: {
            "cratNbr": checkedRows.jjbjlNum
          },
          success: function (data) {
            //规则判断，若是1，则有操作权限，若是0，则隐藏操作按钮
            if (data.resultInfo.message == "doctorSelf" || data.resultInfo.message == "admin"){
              _confirm('确定删除该数据吗？', null, function () {
                publicFun.httpServer({ url: '${baseurl}zyylqbl/deletejjbjl.do' }, {
                  'hspJjbjlInfCustom.jjbjlSeq': checkedRows['jjbjlSeq']
                }, function (res) {
                  message_alert(res);
                  if (res.resultInfo.type == '1') {
                    parent.selectType()
                  }
                })
              });
            } else {
              publicFun.alert('您没有删除该条记录的操作权限！');
            }
          }
        })
      }
    }

    $(function () {
      var flag = '${flag}';
      var dataTitle;
      if (flag == '0') {
        dataTitle = "交班记录";
      } else {
        dataTitle = "接班记录";
      }
      handoverSheet(flag, dataTitle);
      $(window).resize(function () {
        handoverSheet(flag, dataTitle);
      });
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
    })
  </script>
</body>

</html>