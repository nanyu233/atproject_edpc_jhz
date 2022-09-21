function getWidth(proportion) {
  var width = $('body').width();
  return Math.round(proportion * width);
}

function loadQuery (flag, dataTitle) {
  var _tabColumn = loadColumn();
  var cfjlType = flag;
  var height = $('.maindiv', parent.document).height() - 30;
  $('#checkingRecordList').height(height);
  $('#checkingRecordList').datagrid({
    nowrap: false,
    striped: true,
    singleSelect: true,
    idField: '',
    loadMsg: '',
    title: dataTitle,
    pagination: true,
    rownumbers: true,
    pageList: [20, 30, 50],
    url: _getTabUrl,
    queryParams: {
      'hspCfjlInfCustom.cfjlType': cfjlType,
      'hspCfjlInfCustom.emgSeq': _emgSeq
    },
    loadFilter: function (data) {
      if (data.resultInfo && data.resultInfo.messageCode == '109') {
        message_alert(data, function () {
          window.location.href = BaseUrl + 'first.do';
        });
      }
      return data;
    },
    columns: _tabColumn,
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
  var checkedRows = $('#checkingRecordList').datagrid('getSelected');
  if (checkedRows == null) {
    publicFun.alert('请选择一条数据');
  } else {
    var url = _editUrl + '?cfjlSeq=' + checkedRows['cfjlSeq'] + '&emgSeq=' + _emgSeq;
    parent.editCourse(url);
  }
}

/**
 * [delMsg 删除查房记录]
 */
function delMsg() {
  var checkedRows = $('#checkingRecordList').datagrid('getSelected');
  if (checkedRows == null) {
    publicFun.alert('请选择一条数据')
  } else {
    // 判断是否有权限
    publicFun.httpServer({url: BaseUrl + "zyylqbl/checkRoleAjax.do?", isNoLoad: true}, {"cratNbr": checkedRows.cfjlNum}, function (data) {
      //规则判断，若是1，则有操作权限，若是0，则隐藏操作按钮
      if (data.resultInfo.message == "1") {
        if (checkedRows.cfjlNum != _userNum && _userNum != 'admin') {
          publicFun.alert('您没有删除该条记录的操作权限！')
        } else {
          _confirm('确定删除该数据吗？', null, function () {
            publicFun.httpServer({ url: BaseUrl + 'zyylqbl/deletecfjl.do' }, {
              'hspCfjlInfCustom.cfjlSeq': checkedRows['cfjlSeq']
            }, function (res) {
              message_alert(res);
              if (res.resultInfo.type == '1') {
                parent.selectType()
              }
            })
          });
        }
      } else {
        publicFun.alert('您没有删除该条记录的操作权限！')
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