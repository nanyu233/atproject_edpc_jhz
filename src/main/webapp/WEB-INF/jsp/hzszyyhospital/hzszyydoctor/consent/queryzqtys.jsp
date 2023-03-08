<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/base/tag.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
  <title>知情同意书</title>
  <%@ include file="/WEB-INF/jsp/base/common_css.jsp"%>
  <%@ include file="/WEB-INF/jsp/base/common_js.jsp"%>
  <link rel="stylesheet" type="text/css" href="${baseurl}css/hzszyyhems/hzszyydoctor/querycfjl.css">
  <link rel="stylesheet" type="text/css" href="${baseurl}css/hzszyyhems/contstyle.css" />
</head>

<body>

  <div class="table-container">
    <div id="handoverSheetList"></div>
  </div>
  <div class="tools-container">
    <p class="at-tools2 clr" id="atTools">
      <a class="commonbtn" id="delete" href="javascript:;" onclick="handoverSheetDel()">删除</a>
      <a class="commonbtn" id="edit" href="javascript:;" onclick="handoverSheetEdit()">修改</a>
      <a class="commonbtn" id="add" href="javascript:;" onclick="handoverSheetAdd()">新增</a>
    </p>
  </div>
  <script type="text/javascript">
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

    function getWidth(proportion) {
      var width = $('body').width();
      return Math.round(proportion * width);
    }

    //查询列表
    function handoverSheet() {
      var windowHeight = $(window).height();
      var height = windowHeight - 70;
      $('#handoverSheetList').height(height);
      $('#handoverSheetList').datagrid({
        striped: true,
        singleSelect: true,
        url: '${baseurl}zyyconsent/queryConsentInf_Result.do',
        pagination: true,
        rownumbers: true,
        title: "知情同意书",
        pageList: [20, 30, 50],
        queryParams: {
          'hspConsentInfCustom.refseqno': '${refseqno}'
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
          <%--window.location = '${baseurl}zyyconsent/ConsentInf.do?seqno=' + rowData.seqno;--%>
          window.location = '${baseurl}zyyconsent/toXtPageEdit.do?tempno=' + rowData.tempSeq + '&refseqno='
                  + rowData.patientId + '&tempname=' + rowData.tempName + '&cstNam=' + rowData.patientName
                  + '&caseno=' + rowData.caseSeq;
        },
        columns: [
          [{
            field: 'caseSeq',
            title: '编号',
            width: getWidth(0.2),
          }, {
            field: 'tempSeq',
            title: '模板号',
            width: getWidth(0.1),
          }, {
            field: 'tempName',
            title: '名称',
            width: getWidth(0.1)
          }, {
            field: 'crtUserName',
            title: '创建人名称',
            width: getWidth(0.25)
          }, {
            field: 'crtTime',
            title: '创建时间',
            width: getWidth(0.15),
            formatter: function (value, row, index) {
              return publicFun.timeFormat(value, 'yyyy/MM/dd hh:mm')
            }
          }, {
            field: 'modTime',
            title: '更新时间',
            width: getWidth(0.15),
            formatter: function (value, row, index) {
              return publicFun.timeFormat(value, 'yyyy/MM/dd hh:mm:ss')
            }
          }]
        ]
      });
      var _thisWidth = $('body').width();
      $('.panel-header,.datagrid-wrap.panel-body,.easyui-panel.panel-body,.datagrid-header').css('width', '' + _thisWidth - 10 + '');
    }
    /**
     * 根据病人好新增知情同意书
     */
    function handoverSheetAdd() {
      //window.location = '${baseurl}zyyconsent/queryHspConsentTemp.do?refseqno=${refseqno}'; 
      createmodalwindow("选择模板", 700, 515, '${baseurl}zyyconsent/queryHspConsentTemp.do?refseqno=${refseqno}' + '&cstNam=${cstNam}' + '&tempCode=${tempCode}');
    }

    /**
     * 修改知情同意书
     */
    function handoverSheetEdit() {
      var checkedRows = $('#handoverSheetList').datagrid('getSelected');
      if (checkedRows == null) {
        $.messager.alert('提示信息', '请选择一条数据', 'warning');
      } else {
        <%--window.location = '${baseurl}zyyconsent/ConsentInf.do?seqno=' + checkedRows['seqno']--%>
        window.location = '${baseurl}zyyconsent/toXtPageEdit.do?tempno=' + checkedRows['tempSeq'] + '&refseqno='
                + checkedRows['patientId'] + '&tempname=' + checkedRows['tempName'] + '&cstNam=' + checkedRows['patientName']
                + '&caseno=' + checkedRows['caseSeq'];
      }
    }
    /**
     * [ 删除知情同意书]
     */
    function handoverSheetDel() {
      var checkedRows = $('#handoverSheetList').datagrid('getSelected');
      if (checkedRows == null) {
        $.messager.alert('提示信息', '请选择一条数据', 'warning');
      } else {
        publicFun.httpServer({url: '${baseurl}zyyconsent/checkRoleAjax.do'}, {'cratNbr': checkedRows.crtusrno}, function (data) {
          //规则判断，若是1，则有操作权限，若是0，则隐藏操作按钮
          if (data.resultInfo.message == "doctorSelf" || data.resultInfo.message == "admin"){

              _confirm('确定删除该数据吗？', null, function () {
                publicFun.httpServer({ url: '${baseurl}zyyconsent/delConsentInfBySeqnoSubmit.do' }, {
                  'caseSeq': checkedRows['caseSeq']
                }, function (res) {
                  message_alert(res);
                  if (res.resultInfo.type == '1') {
                    handoverSheet()
                  }
                  setTimeout(function () {
                    window.location.reload();
                  }, 800)
                })
              });
          } else {
            publicFun.alert('您没有删除该条记录的操作权限！');
          }
        })
      }
    }

    /**
     * 选着模板
     */
    function AddModel(tempno, tempname, refseqno, cstNam, tempCode) {
      var url = '${baseurl}zyyconsent/toXtPageEdit.do?tempno=' +  tempno + '&tempname=' + tempname
              + '&refseqno=' + refseqno + '&cstNam=' + cstNam + '&tempCode=' + tempCode;
      url = encodeURI(url);
      window.location = url;


    }

    function checkRole () {
      <%-- publicFun.httpServer({ url: '${baseurl}zyylqbl/checkRoleAjax.do'}, { "cratNbr": '' }, function (data) {--%>
      <%--  //规则判断，若是1，则有操作权限，若是0，则隐藏操作按钮--%>
      <%--  if (parent.pageFlg) {--%>
      <%--    $('#add').hide()--%>
      <%--    $("#delete").hide();--%>
      <%--    $("#edit").hide();--%>
      <%--  }else{--%>
      <%--    if(data.resultInfo.message == 'nurse'){--%>
      <%--      $('#add').hide()--%>
      <%--      $("#delete").hide();--%>
      <%--      $("#edit").hide();--%>
      <%--    }--%>
      <%--  }--%>
      <%--  //日志、归档病历、留抢病历 游客无权限--%>
      <%--  if(data.resultInfo.message == 'tourist'){--%>
      <%--  	$('#add').hide()--%>
      <%--      $("#delete").hide();--%>
      <%--      $("#edit").hide();--%>
      <%--  }--%>
      <%--})--%>
    }

    $(function () {
      handoverSheet();
      $(window).resize(function () {
        handoverSheet();
      });
      checkRole();
    })
  </script>
</body>

</html>
