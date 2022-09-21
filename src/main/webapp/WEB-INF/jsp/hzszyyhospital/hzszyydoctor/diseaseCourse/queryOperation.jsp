<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/base/tag.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
  <title>手术操作病程</title>
  <%@ include file="/WEB-INF/jsp/base/common_css.jsp"%>
  <%@ include file="/WEB-INF/jsp/base/common_js.jsp"%>
  <script language="javascript" src="${baseurl}Lodop6.216/LodopFuncs.js"></script>
  <link rel="stylesheet" type="text/css" href="${baseurl}css/hzszyyhems/hzszyydoctor/querycfjl.css?v=${versionDay}">
  <link rel="stylesheet" type="text/css" href="${baseurl}css/hzszyyhems/contstyle.css?v=${versionDay}" />
  <script type="text/javascript">
  	var _emgSeq = parent.$('#emgSeq').val();
  </script>
</head>

<body>
  <div class="queryTabs">
    <div id="operationtable"></div>
  </div>
  <jsp:include page="/WEB-INF/jsp/hzszyyhospital/hzszyydoctor/diseaseCourse/printDiseaseCourse.jsp"></jsp:include>
  <!-- <div class="tools-container">
    <p class="at-tools2 clr" id="atTools">
      <a id="print" class="commonbtn" href="javascript:;" onclick="printall()">打印</a>
      <a id="delete" class="commonbtn" href="javascript:;" onclick="delMsg()">删除</a>
      <a id="edit" class="commonbtn" href="javascript:;" onclick="editMsg()">修改</a>
      <a id="add" class="commonbtn" href="javascript:;" onclick="addOperation()">新增</a>
      <a class="commonbtn" href="javascript:;" onclick="showlist()">显示列表</a>
    </p>
  </div> -->
  <script type="text/javascript">
    function getWidth(proportion) {
      var width = $('body').width();
      return Math.round(proportion * width);
    }

    function showlist() {
      var _url = '${baseurl}zyylqbl/operate.do?emgSeq=' + _emgSeq
      window.location = _url;
    }

    function loadQuery() {
      // var height = $('#main', parent.document).height() - 57;
      var height = $('.maindiv', parent.document).height() - 30;
      $('#operationtable').height(height);
      $('#operationtable').datagrid({
        nowrap: false,
        striped: true,
        singleSelect: true,
        url: '${baseurl}zyylqbl/findOperateListByEmgSeq.do',
        title: "手术操作病程",
        idField: '',
        loadMsg: '',
        pagination: true,
        rownumbers: true,
        pageList: [20, 30, 50],
        queryParams: {
          'hspOperateInfCustom.emgSeq': _emgSeq
        },
        loadFilter: function (data) {
          if (data.resultInfo && data.resultInfo.messageCode == '109') {
            message_alert(data, function () {
              window.location.href = '${baseurl}first.do';
            });
          }
          return data;
        },
        onDblClickRow: function (rowIndex, rowData) {
          editMsg();
        },
        columns: [
          [{
            field: 'operDat',
            title: '日期',
            width: getWidth(.12),
            formatter: function (value, row, index) {
              return publicFun.timeFormat(value, 'yyyy/MM/dd hh:mm:ss')
            }
          }, {
            field: 'operNam',
            width: getWidth(.1),
            title: '病程记录名称'
          },{
            field: 'operBcjl',
            width: getWidth(.6),
            title: '病程记录内容'
          }, {
            field: 'operYs',
            width: getWidth(.12),
            title: '医生'
          }]
        ]
      });
      var _thisWidth = $('body').width();
      $('.panel-header,.datagrid-wrap.panel-body,.easyui-panel.panel-body,.datagrid-header').css('width', '' + _thisWidth - 10 + '');
    }

    function addOperation() {
      var _url = "${baseurl}zyylqbl/saveAndEditOperate.do?emgSeq=" + _emgSeq;
      window.location = _url;
    }

    function editMsg() {
      var checkedRows = $('#operationtable').datagrid('getSelected');
      if (checkedRows == null) {
        alert_warn('请选择一条数据');
      } else {
        var _url = "${baseurl}zyylqbl/saveAndEditOperate.do?emgSeq=" + _emgSeq + "&operSeq=" + checkedRows.operSeq;
        parent.editCourse(_url);
      }
    }

    function delMsg() {
      var checkedRows = $('#operationtable').datagrid('getSelected');
      if (checkedRows == null) {
        publicFun.alert('请选择一条数据');
      } else {
        //判断是否有权限
        publicFun.httpServer({url: '${baseurl}zyylqbl/checkRoleAjax.do'}, { "cratNbr": checkedRows.creCod}, function (data) {
          if (data.resultInfo.message == "doctorSelf" || data.resultInfo.message == "admin") {
            
              _confirm('您确认删除吗？', null, function () {
                publicFun.httpServer({ url: '${baseurl}zyylqbl/deloperateBySeq.do' }, { 'operSeq': checkedRows.operSeq }, function (data) {
                  message_alert(data);
                  if (data.resultInfo.type == '1') {
                    loadQuery();
                  }
                  setTimeout(function () {
                    window.location.reload();
                  }, 800)
                })
              });
          } else {
            alert_warn('您没有删除该条记录的操作权限！');
          }
        })
      }
    }

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

    $(function () {
      loadQuery();
      $(window).resize(function () {
        loadQuery();
      });
      // checkRole2();
    })

    //初始化 判断登陆用户角色是否有护士的角色
    function checkRole2() {
      //判断是否有权限
      publicFun.httpServer({ url: '${baseurl}zyylqbl/checkRoleAjax.do' }, { }, function (data) {
        if (parent.pageFlg) {
          var _btnList = ['save', 'add', 'addAll', 'del', 'delete', 'bgsave'];
          $.each(_btnList, function (idx, val) {
            $('#' + val).hide()
          })
        } else {
          if (data.resultInfo.message == "1") {
            $("#add").show();
            $("#delete").show();
          } else {
            $("#add").hide();
            $("#delete").hide();
          }
        }
      })
    }
  </script>
</body>

</html>