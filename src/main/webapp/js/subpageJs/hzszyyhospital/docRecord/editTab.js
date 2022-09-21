var usrName = {}, // 护士签名
    userCod = {},
    checkName = {},
    checkCod = {}; // 核对护士签名
$.extend($.fn.datagrid.methods, {
  getEditingRowIndexs: function (jq) {
    var rows = $.data(jq[0], 'datagrid').panel.find('.datagrid-row-editing')
    var indexs = []
    rows.each(function (i, row) {
      var index = row.sectionRowIndex
      if (indexs.indexOf(index) == -1) {
        indexs.push(index)
      }
    })
    return indexs
  }
})

$.extend($.fn.datagrid.defaults.editors, {
  nurseDateEdit: {
    init: function (container, options) {
      var input = ''
      input = $(
        '<input class="inputDate" type="text" onclick="WdatePicker({dateFmt:\'yyyy/MM/dd HH:mm\'})" onfocus="hideAllList()">'
      ).appendTo(container)
      return input
    },
    destroy: function (target) {
      $(target).remove()
    },
    getValue: function (target) {
      return $(target).val()
    },
    setValue: function (target, value) {
      if (!value) {
        value = publicFun.timeFormat(new Date(), 'yyyy/MM/dd hh:mm')
      }
      $(target).val(value)
    },
    resize: function (target, width) {
      $(target)._outerWidth(width)
    }
  },
  nurseDatePyEdit: {
    init: function (container, options) {
      var input = ''
      input = $(
        '<input class="inputDate" type="text" onclick="WdatePicker({dateFmt:\'yyyy/MM/dd HH:mm\'})" onfocus="hideAllList()">'
      ).appendTo(container)
      return input
    },
    destroy: function (target) {
      $(target).remove()
    },
    getValue: function (target) {
      return $(target).val()
    },
    setValue: function (target, value) {
      $(target).val(value)
    },
    resize: function (target, width) {
      $(target)._outerWidth(width)
    }
  },
  userNumEdit: {
    init: function (container, options) {
      var _contentStr =
        '<input type="text">'
      var input = $(_contentStr).appendTo(container)
      return input
    },
    destroy: function (target) {
      $(target).remove()
    },
    getValue: function (target) {
      return $(target).val()
    },
    setValue: function (target, value) {
      if (!value) {
        value = _userNum
      }
      $(target).val(value)
    },
    resize: function (target, width) {
      $(target)._outerWidth(width)
    }
  },
  userNameEdit: {
    init: function (container, options) {
      var _contentStr =
        '<input  class="nurWrp" type="text" onkeyup="searchName(this, \'nurList\', event)" onmouseout="hideList(event)" onmouseleave="hideList(event)" onfocus="hideList(event)"/><div class="allBuddy nurList"></div>'
      var input = $(_contentStr).appendTo(container)
      return input
    },
    destroy: function (target) {
      $(target).remove()
    },
    getValue: function (target) {
      return $(target).val()
    },
    setValue: function (target, value) {
      $(target).val(value)
    },
    resize: function (target, width) {
      $(target)._outerWidth(width)
    }
  },
  checkNameEdit: {
    init: function (container, options) {
      // var _contentStr = '<input type="text" onkeyup="searchName(this, \'checkNurList\', event)" onchange="searchName(this, \'checkNurList\', event)" oninput="searchName(this, \'checkNurList\', event)"/><div class="allBuddy checkNurList"></div>';
      var _contentStr =
        '<input class="checkNurWrp" type="text" onkeyup="searchName(this, \'checkNurList\', event)" onmouseout="hideList(event)" onmouseleave="hideList(event)" onfocus="hideList(event)"/><div class="allBuddy checkNurList"></div>'
      var input = $(_contentStr).appendTo(container)
      return input
    },
    destroy: function (target) {
      $(target).remove()
    },
    getValue: function (target) {
      return $(target).val()
    },
    setValue: function (target, value) {
      if (!value) {
        value = _username
      }
      $(target).val(value)
    },
    resize: function (target, width) {
      $(target)._outerWidth(width)
    }
  },
  checkUserEdit: {
    init: function (container, options) {
      var _contentStr =
        '<input type="text">'
      var input = $(_contentStr).appendTo(container)
      return input
    },
    destroy: function (target) {
      $(target).remove()
    },
    getValue: function (target) {
      return $(target).val()
    },
    setValue: function (target, value) {
      // if (!value) {
      //   value = _userNum
      // }
      $(target).val(value)
    },
    resize: function (target, width) {
      $(target)._outerWidth(width)
    }
  },
  operateEdit: {
    init: function (container, options) {
      var input = $(
        '<span><a class="cancel">取消</a></span><span> | </span><span><a class="save" href="#">保存</a><span>'
      ).appendTo(container)
      return input
    },
    destroy: function (target) {
      $(target).remove()
    },
    getValue: function (target) {
      return $(target).val()
    },
    setValue: function (target, value) {
      $(target).val(value)
    },
    resize: function (target, width) {
      $(target)._outerWidth(width)
    }
  }
})

var currentItem

var canSearchFlag = true
var currentLine = -1

var offsetTr = 0
function changeItem (it) {
  if (!it) return false
  $('.allBuddy tr:hover').removeClass('buddyListHighLight')
  changeBackground(it)
  if (currentLine < 0) currentLine = it.childNodes.length - 1
  if (currentLine >= it.childNodes.length) currentLine = 0
  if (it.childNodes.length > 0) {
    it.childNodes[currentLine].className = 'buddyListHighLight'
  }
  if (it.parentNode.parentNode) {
    it.parentNode.parentNode.scrollTop =
      it.childNodes[currentLine].offsetTop - offsetTr
  }
}
function addUser (it, typeList) {
  var _name = it.childNodes[currentLine].innerText;
  publicFun.httpServer(
    { url: _baseUrl + 'user/queryuser_result.do' },
    { page: 1, rows: 100, 'dstuserCustom.queryLike': _name },
    function (res) {
      if (res.rows.length == 1) {
        setName(_name, res.rows[0].usrno, typeList)
      } else {
        setName(_name, '', typeList)
      }
    }
  )
}
function changeBackground (items) {
  for (var i = 0; i < items.childNodes.length; i++) {
    if (i % 2 == 0) {
      items.childNodes[i].className = 'buddyListOdd'
    } else {
      items.childNodes[i].className = 'buddyListEven'
    }
  }
}
function mouseMove (current, idx) {
  $('.allBuddy tr').removeClass('buddyListHighLight')
  $(current).addClass('buddyListHighLight')
  currentLine = idx
}

function searchName (current, typeList, event) {
  if (typeList === 'nurList') {
    userCod.target.val('');
  }
  if (typeList === 'checkNurList') {
    checkCod.target.val('');
  }
  var tab
  if ($(current)[0].nextSibling.children[0]) {
    tab = $(current)[0].nextSibling.children[0].children[0]
  }
  canSearchFlag = true
  var _event = window.event || event
  if (_event.keyCode == 38) {
    // Up
    if (tab) {
      offsetTr = 0
      currentLine--
      changeItem(tab)
    }
  } else if (_event.keyCode == 40) {
    // Down
    if (tab) {
      offsetTr = 20
      currentLine++
      changeItem(tab)
    }
  } else if (_event.keyCode == 13) {
    if (currentLine > -1 && tab && tab.childNodes.length > 0) {
      addUser(tab, typeList)
      canSearchFlag = false
      // console.log('我是赋值')
    } else {
      // console.log('get 13List')
      currentLine = -1
      offsetTr = 0
      getUserList(current, typeList)
    }
  } else {
    // console.log('我是其他的键盘', _event.keyCode)
    currentLine = -1
    offsetTr = 0
    getUserList(current, typeList)
  }
}

function getUserList (current, typeList) {
  if (!current.value) {
    currentItem = ''
    $(current)[0].nextSibling.style.display = 'none'
    $('.' + typeList).html('')
    return
  }
  publicFun.httpServer(
    { url: _baseUrl + 'user/queryuser_result.do' },
    { page: 1, rows: 100, 'dstuserCustom.queryLike': current.value },
    function (res) {
      var _data = res.rows
      if (_data.length > 0) {
        $(current)[0].nextSibling.style.display = 'block'
        $('.' + typeList).html('')
        var _initStr =
          '<table cellspacing="0" cellpadding="0" border="0" width="100%" class="buddyListTable"><tbody>'
        _data.forEach(function (v, i) {
          _initStr +=
            '<tr class="repeatTr" onclick="setName(\'' + v.usrname + "','" +  v.usrno + "','" +  typeList + '\')" onmouseover="mouseMove(this, \'' + i + '\')" onmouseenter="mouseMove(this, \'' +  i + '\')"><td>' 
              + v.usrname +
            '</td></tr>'
        })
        _initStr += '</tbody></table>'
        $('.' + typeList).html(_initStr)
        currentItem = $(current)[0].nextSibling.children[0].children[0]
      } else {
        currentItem = ''
        $(current)[0].nextSibling.style.display = 'none'
        $('.' + typeList).html('')
        // setName('','', typeList);
      }
    }
  )
}
function hideAllList () {
  $('.allBuddy').hide()
}
function hideList (event) {
  if (!$('.nurWrp').is(':focus')) {
    $('.nurList').hide()
  } else {
    $('.checkNurList').hide()
  }
  if (!$('.checkNurWrp').is(':focus')) {
    $('.checkNurList').hide()
  } else {
    $('.nurList').hide()
  }
  if ($('.inputDate').is(':focus')) {
    $('.allBuddy').hide()
  }
}
function setName (name, cod, typeList) {
  if (typeList == 'nurList') {
    usrName.target.val(name)
    userCod.target.val(cod)
    usrName.target[1].style.display = 'none'
  } else {
    checkName.target.val(name)
    checkCod.target.val(cod)
    checkName.target[1].style.display = 'none'
  }
  currentLine = -1
  $('.' + typeList).html('')
}
