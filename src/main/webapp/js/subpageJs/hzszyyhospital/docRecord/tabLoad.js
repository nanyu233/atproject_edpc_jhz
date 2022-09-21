function getWidth(proportion) {
  var width = $('body').width();
  return Math.round(proportion * width);
}

function loadQuery(param) {
  var _tabColumn = loadColumn();
  var height = $('.maindiv', parent.document).height() - 30;
  $('#' + _tabId).height(height);
  $('#' + _tabId).datagrid({
    nowrap: false,
    striped: true,
    singleSelect: true,
    url: _getTabUrl,
    title: _tabName,
    idField: '',
    loadMsg: '',
    pagination: true,
    rownumbers: true,
    pageList: [20, 30, 50],
    queryParams: param,
    loadFilter: function (data) {
      if (data.resultInfo && data.resultInfo.messageCode == '109') {
        message_alert(data, function () {
          window.location.href = _baseUrl + 'first.do';
        });
      }
      return data;
    },
    onDblClickRow: function (rowIndex, rowData) {
      editMsg();
    },
    columns: _tabColumn
  });
  var _thisWidth = $('body').width();
  $('.panel-header,.datagrid-wrap.panel-body,.easyui-panel.panel-body,.datagrid-header').css('width', '' + _thisWidth - 10 + '');
}

function editMsg() {
  var checkedRows = $('#' + _tabId).datagrid('getSelected');
  if (checkedRows == null) {
    publicFun.alert('请选择一条数据');
  } else {
    var diseaseId = checkedRows.diseaseCourseSeq;
    parent.editCourse(diseaseId);
  }
}

function delMsg() {
  var checkedRows = $('#' + _tabId).datagrid('getSelected');
  if (checkedRows == null) {
    publicFun.alert('请选择一条数据');
  } else {
    //判断是否有权限
    publicFun.httpServer({url: BaseUrl + "zyylqbl/checkRoleAjax.do?", isNoLoad: true}, {"cratNbr": checkedRows.createDoc}, function (data) {
      //规则判断，若是1，则有操作权限，若是0，则隐藏操作按钮
      if (data.resultInfo.message == "doctorSelf" || data.resultInfo.message == "admin"){
    	  var diseaseId = checkedRows.diseaseCourseSeq;
          _confirm('确定删除该数据吗？', null, function () {
            publicFun.httpServer({ url: BaseUrl + 'diseaseCourse/delDiseaseCourse.do' }, {
              'diseaseCourseSeq': diseaseId
            }, function (res) {
              message_alert(res);
              if (res.resultInfo.type == '1') {
                parent.selectType();
              }
            })
          })
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