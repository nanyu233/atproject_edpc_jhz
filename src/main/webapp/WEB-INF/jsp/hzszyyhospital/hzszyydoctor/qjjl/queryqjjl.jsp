<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/base/tag.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
  <title>抢救记录</title>
  <%@ include file="/WEB-INF/jsp/base/common_css.jsp"%>
  <link rel="stylesheet" type="text/css" href="${baseurl}css/common/querylist.css?190" />
  <script>
    var _userNum = '${sessionScope.activeUser.usrno}';
  </script>
</head>

<body>
  <div class="queryTabs">
    <div id="saveRecordList"></div>
  </div>
  <jsp:include page="/WEB-INF/jsp/hzszyyhospital/hzszyydoctor/diseaseCourse/printDiseaseCourse.jsp"></jsp:include>
  <%@ include file="/WEB-INF/jsp/base/common_js.jsp"%>
  <script type="text/javascript" src="${baseurl}Lodop6.216/LodopFuncs.js"></script>
  <script type="text/javascript">
    function getWidth(proportion) {
      var width = $('body').width();
      return Math.round(proportion * width);
    }
    function saveRecord() {
      var height = $('.maindiv', parent.document).height() - 30;
      $('#saveRecordList').height(height);
      $('#saveRecordList').datagrid({
        nowrap: false,
        striped: true,
        singleSelect: true,
        url: '${baseurl}zyylqbl/queryqjjl_result.do',
        idField: '',
        loadMsg: '',
        pagination: true,
        rownumbers: true,
        title: "抢救记录",
        pageList: [20, 30, 50],
        queryParams: {
          'hspQjjlInfCustom.emgSeq': '${emgSeq}'
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
            field: 'qjjlDat',
            title: '抢救时间',
            width: getWidth(.1),
            formatter: function (value, row, index) {
              return publicFun.timeFormat(value, 'yyyy/MM/dd hh:mm')
            }
          }, {
            field: 'qjjlContent',
            title: '抢救经过',
            width: getWidth(.55)
          }, {
            field: 'qjjlIsSucc',
            title: '是否抢救成功',
            width: getWidth(.1),
            formatter: function (value, row, index) {
              var qjjlIsSucc;
              switch (value) {
                case '0':
                  qjjlIsSucc = '是';
                  break;
                default:
                  qjjlIsSucc = '否';
                  break;
              }
              return qjjlIsSucc
            }
          }, {
            field: 'qjjlJlnam',
            title: '抢救人员',
            width: getWidth(.1)
          }, {
            field: 'qjjlNum',
            hidden: true
          }, {
            field: 'qjjlNam',
            title: '记录人员',
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
     * [editMsg 修改记录]
     */
    function editMsg() {
      var checkedRows = $('#saveRecordList').datagrid('getSelected');
      if (checkedRows == null) {
        publicFun.alert('请选择一条数据');
      } else {
        var url = '${baseurl}zyylqbl/toupdateqjjl.do?qjjlSeq=' + checkedRows['qjjlSeq'] + '&emgSeq=${emgSeq}';
        parent.editCourse(url);
      }
    }
    /**
     * [delMsg 删除记录]
     */
    function delMsg() {
      var checkedRows = $('#saveRecordList').datagrid('getSelected');
      if (checkedRows == null) {
        publicFun.alert('请选择一条数据');
      } else {
        //判断是否有权限
        publicFun.httpServer({url: "${baseurl}zyylqbl/checkRoleAjax.do?", isNoLoad: true}, {"cratNbr": checkedRows.qjjlNum}, function (data) {
          //规则判断，若是1，则有操作权限，若是0，则隐藏操作按钮
          if (data.resultInfo.message == "doctorSelf" || data.resultInfo.message == "admin") {
            
              _confirm('确定删除该数据吗？', null, function () {
                publicFun.httpServer({ url: '${baseurl}zyylqbl/deleteqjjl.do' }, {
                  'hspQjjlInfCustom.qjjlSeq': checkedRows['qjjlSeq']
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
      saveRecord();
      $(window).resize(function () {
        saveRecord();
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