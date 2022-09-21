<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/base/tag.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
  <title>输血(血制品)记录</title>
  <%@ include file="/WEB-INF/jsp/base/common_css.jsp"%>
  <link rel="stylesheet" type="text/css" href="${baseurl}css/common/querylist.css?190" />
  <script>
    var _userNum = '${sessionScope.activeUser.usrno}';
  </script>
</head>

<body>
  <div class="queryTabs">
    <div id="bloodList"></div>
  </div>
  <jsp:include page="/WEB-INF/jsp/hzszyyhospital/hzszyydoctor/diseaseCourse/printDiseaseCourse.jsp"></jsp:include>
  <%@ include file="/WEB-INF/jsp/base/common_js.jsp"%>
  <script type="text/javascript" src="${baseurl}Lodop6.216/LodopFuncs.js"></script>
  <script type="text/javascript">
    function getWidth(proportion) {
      var width = $('body').width();
      return Math.round(proportion * width);
    }

    function getTab() {
      var height = $('.maindiv', parent.document).height() - 30;
      $('#bloodList').height(height);
      $('#bloodList').datagrid({
        nowrap: false,
        striped: true,
        singleSelect: true,
        idField: '',
        loadMsg: '',
        pagination: true,
        rownumbers: true,
        title: '输血(血制品)记录',
        pageList: [20, 30, 50],
        url: '${baseurl}transfusion/findTransfusionList.do',
        queryParams: {
          'hspTransfusionInfCustom.emgSeq': '${emgSeq}'
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
            field: 'transfusionDat',
            title: '日期',
            rowspan: 2,
            width: getWidth(.06),
            formatter: function (value, row, index) {
              return value ? publicFun.timeFormat(value, 'yyyy/MM/dd hh:mm:ss') : ''
            }
          }, {
            field: 'infusionStartDat',
            title: '输注开始时间',
            rowspan: 2,
            width: getWidth(.06),
            formatter: function (value, row, index) {
              return value ? publicFun.timeFormat(value, 'yyyy/MM/dd hh:mm:ss') : ''
            }
          }, {
            field: 'infusionEndDat',
            title: '输注结束时间',
            rowspan: 2,
            width: getWidth(.06),
            formatter: function (value, row, index) {
              return value ? publicFun.timeFormat(value, 'yyyy/MM/dd hh:mm:ss') : ''
            }
          }, {
            title: '输血(血制品)',
            colspan: 3
          }, {
            field: 'assessment',
            title: '输血前评估及处理',
            rowspan: 2,
            width: getWidth(.14)
          }, {
            field: 'infusionProcess',
            rowspan: 2,
            title: '输注过程',
            width: getWidth(.15)
          }, {
            field: 'vitalSigns',
            title: '输血后评估',
            rowspan: 2,
            width: getWidth(.15)
          }, {
            field: 'reaction',
            rowspan: 2,
            title: '输血反应',
            width: getWidth(.05),
            formatter: function (value, row, index) {
              if (value === '0') {
                return '无'
              } else if (value == '1') {
                if (row.reactionContent !== '' && row.reactionContent != null) {
                  return '有：' + row.reactionContent
                } else {
                   return '有'
                }
              }
            }
          }, {
            title: '输血(血制品)'
          }, {
            field: 'docNam',
            title: '医生签名',
            rowspan: 2,
            width: getWidth(.06)
          }], 
          [{
            field: 'indication',
            title: '指征',
            width: getWidth(.05)
          },
          {
            field: 'composition',
            title: '成分',
            width: getWidth(.05)
          },
          {
            field: 'amount',
            title: '量',
            width: getWidth(.03)
          }, {
            field: 'evaluationPlan',
            title: '疗效评价计划',
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
     * [editMsg 修改输血记录]
     */
    function editMsg() {
      var checkedRows = $('#bloodList').datagrid('getSelected');
      if (checkedRows == null) {
        publicFun.alert('请选择一条数据');
      } else {
        var url = '${baseurl}transfusion/toUpdateBloodTransRecord.do?transfusionSeq=' + checkedRows['transfusionSeq'] + '&emgSeq=${emgSeq}';
        parent.editCourse(url);
      }
    }
    /**
     * [delMsg 删除输血记录]
     */
    function delMsg() {
      var checkedRows = $('#bloodList').datagrid('getSelected');
      if (checkedRows == null) {
        publicFun.alert('请选择一条数据');
      } else {
        publicFun.httpServer({ url: '${baseurl}zyylqbl/checkRoleAjax.do', isNoLoad: true }, { "cratNbr": checkedRows.crtCod }, function (data) {
          //规则判断，若是1，则有操作权限，若是0，则隐藏操作按钮
          if (data.resultInfo.message == "doctorSelf" || data.resultInfo.message == "admin") {
            
              _confirm('确定删除该数据吗？', null, function () {
                publicFun.httpServer({ url: '${baseurl}transfusion/delBloodTransRecord.do' }, {
                  'transfusionSeq': checkedRows['transfusionSeq']
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
        })
      }
    }

    $(function () {
      getTab();
      $(window).resize(function () {
        getTab();
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