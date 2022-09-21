<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/base/tag.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
  <title>会诊记录列表</title>
  <%@ include file="/WEB-INF/jsp/base/common_css.jsp"%>
  <%@ include file="/WEB-INF/jsp/base/common_js.jsp"%>
  <script type="text/javascript" src="${baseurl}Lodop6.216/LodopFuncs.js"></script>
</head>
<style type="text/css">
  .table-container {
    padding-bottom: 0 !important;
  }
</style>

<body>
  <div class="table-container">
    <div id="consulttable"></div>
  </div>
  <jsp:include page="/WEB-INF/jsp/hzszyyhospital/hzszyydoctor/consultation/printConsultation.jsp"></jsp:include>
  <script type="text/javascript">
    function getWidth(proportion) {
      var width = $('body').width();
      return Math.round(proportion * width);
    }

    function loadQuery(emgSeqCr, titlename) {
      var browser = navigator.appName;
      var b_version = navigator.appVersion
      var version = b_version.split(";");
      var trim_Version = "";
      if (version[1] != null) {
        trim_Version = version[1].replace(/[ ]/g, "");
      }
      var height;
      if (browser == "Microsoft Internet Explorer" && trim_Version == "MSIE8.0") {
        height = $('.maindiv2', parent.document).height();
      } else {
        height = $('.maindiv2', parent.document).height() - 30;
      }
      if (isNaN(height)) {
        height = 463;
      }
      $('#consulttable').height(height);
      $('#consulttable').datagrid({
        nowrap: false,
        striped: true,
        singleSelect: true,
        url: '${baseurl}consultation/queryConsultation_result.do',
        idField: '',
        loadMsg: '',
        title: titlename,
        pagination: true,
        rownumbers: true,
        pageList: [20, 30, 50],
        queryParams: {
          'hspConsultationRecordsCustom.emgSeqCr': emgSeqCr,
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
          editForm();
        },
        columns: [
          [{
            field: 'invitationDateStr',
            title: '邀请时间',
            width: getWidth(.15),
            formatter: function (value, row, index) {
              return value ? publicFun.timeFormat(value, 'yyyy/MM/dd hh:mm') : '';
            }
          }, {
            field: 'consultationRecordsSeq',
            hidden: true
          }, {
            field: 'illnessState',
            hidden: true
          }, {
            field: 'objective',
            hidden: true
          }, {
            field: 'replyContent',
            hidden: true
          }, {
            field: 'applyDepStr',
            hidden: true
          }, {
            field: 'applyDoc',
            hidden: true
          }, {
            field: 'applyDocName',
            width: getWidth(.07),
            title: '申请人'
          }, {
            field: 'consultationDateStr',
            width: getWidth(.11),
            title: '签到时间',
            formatter: function (value, row, index) {
              return value ? publicFun.timeFormat(new Date(value), 'yyyy/MM/dd hh:mm') : ''
            }
          }, {
            field: 'replyCreateDate',
            width: getWidth(.11),
            title: '会诊时间',
            formatter: function (value, row, index) {
              return value ? publicFun.timeFormat(new Date(value), 'yyyy/MM/dd hh:mm') : ''
            }
          }, {
            field: 'invitationDep',
            width: getWidth(.08),
            title: '会诊科室'
          }, {
            field: 'replyDocName',
            width: getWidth(.07),
            title: '会诊医生'
          }, {
            field: 'consultationOpinion',
            width: getWidth(.35),
            title: '会诊意见'
          }]
        ]
      });
      var _thisWidth = $('body').width();
      $('.panel-header,.datagrid-wrap.panel-body,.easyui-panel.panel-body,.datagrid-header').css('width', '' + _thisWidth - 10 + '');
    }

    function editForm() {
      parent.$('#cutline').css('visibility', 'visible');
      var checkedRows = $('#consulttable').datagrid('getSelected');
      if (checkedRows == null) {
        $.messager.alert('提示信息', '请选择一条数据', 'warning');
      } else {
        var consultationRecordsSeq = checkedRows.consultationRecordsSeq;
        parent.editConsult(consultationRecordsSeq);
      }
    }

    function replyForm() {
      var checkedRows = $('#consulttable').datagrid('getSelected');
      if (checkedRows == null) {
        $.messager.alert('提示信息', '请选择一条数据', 'warning');
      } else {
        var consultationRecordsSeq = checkedRows.consultationRecordsSeq;
        parent.replyConsult(consultationRecordsSeq);
      }
    }

    function delConsult() {
      var checkedRows = $('#consulttable').datagrid('getSelected');
      if (checkedRows == null) {
        $.messager.alert('提示信息', '请选择一条数据', 'warning');
      } else {
        //判断是否有权限
        publicFun.httpServer({url: '${baseurl}zyylqbl/checkRoleAjax.do'}, {'cratNbr': checkedRows.applyDoc}, function (data) {
          //规则判断，若是1，则有操作权限，若是0，则隐藏操作按钮
          if (data.resultInfo.message == "doctorSelf" || data.resultInfo.message == "admin"){
            
              var consultationRecordsSeq = checkedRows.consultationRecordsSeq;
              _confirm('确定删除该数据吗？', null, function () {
                publicFun.httpServer({ url: '${baseurl}consultation/delConsultation.do' }, {
                  'consultationRecordsSeq': consultationRecordsSeq
                }, function (res) {
                  message_alert(res);
                  if (res.resultInfo.type == '1') {
                    parent.showList();
                  }
                });
              });
          } else {
            publicFun.alert('您没有删除该条记录的操作权限！');
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
      var emgSeqCr = parent.$('#emgSeqCr').val();
      if (emgSeqCr) {
        loadQuery(emgSeqCr, "会诊记录");
      } else {
        emgSeqCr = "${hspemginfCustom.emgSeq}";
        loadQuery(emgSeqCr, false);
      };

      $(window).resize(function () {
        var emgSeqCr = parent.$('#emgSeqCr').val();
        if (emgSeqCr) {
          loadQuery(emgSeqCr, "会诊记录");
        } else {
          emgSeqCr = "${hspemginfCustom.emgSeq}";
          loadQuery(emgSeqCr, false);
        };
      });
    });
  </script>
</body>

</html>