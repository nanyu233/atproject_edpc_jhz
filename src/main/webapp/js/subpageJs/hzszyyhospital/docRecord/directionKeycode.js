var canSearchFlag = true;
var currentLine = -1, offsetTr = 0;
function changeItem(it) {
  if (!it) return false;
  $('.tableSelectList tr:hover').removeClass('buddyListHighLight');
  changeBackground(it);
  if (currentLine < 0) currentLine = it.rows.length - 1;
  if (currentLine >= it.rows.length) currentLine = 0;
  it.rows[currentLine].className = "buddyListHighLight";
  if (document.getElementById('allBuddy')) {
    document.getElementById('allBuddy').scrollTop = it.rows[currentLine].offsetTop - offsetTr;
  }
  canSearchFlag = false;
}
function addUser(it) {
  var _currentIdx = it.rows[currentLine].rowIndex;
  vm.chooseLiMsg(_currentIdx);
}
function changeBackground(items) {
  for (var i = 0; i < items.rows.length; i++) {
    if (i % 2 == 0) {
      items.rows[i].className = "buddyListOdd";
    } else {
      items.rows[i].className = "buddyListEven";
    }
  }
}
function mouseMove (ev) {
  var _tab = document.getElementById('buddyListTable');
  if (document.all) {
    _tab = document.getElementById('buddyListTable').children[0];
  }
  changeBackground(_tab);
  $('.tableSelectList tr:hover').removeClass('buddyListEven').removeClass('buddyListOdd').addClass('buddyListHighLight');
  for (var i = 0; i < _tab.rows.length; i++) {
    if (_tab.rows[i].className == "buddyListHighLight") {
      currentLine = i;
    }
  }
}
document.onmousemove = mouseMove;
$("body").click(function () {
  $('#allBuddy').css('display', 'none');
});

var timeoutId = 0;
function searchMove (event) {
  var tab = document.getElementById('buddyListTable');
  if (document.all) {
    tab = document.getElementById('buddyListTable').children[0];
  }
  var _event = window.event || event;
  if (_event.keyCode == 38) { //Up 
    offsetTr = 0;
    currentLine--;
    changeItem(tab);
  } else if (_event.keyCode == 40) { //Down
    offsetTr = 30;
    currentLine++;
    changeItem(tab);
  } else if (_event.keyCode == 13) {
    if (currentLine > -1 && canSearchFlag == false) {
      addUser(tab);
      canSearchFlag = true;
    } else {
      currentLine = -1;
      offsetTr = 0;
      queryOperationName();
    }
  } else {
    clearTimeout(timeoutId);
    timeoutId = setTimeout(function () {
      currentLine = -1;
      offsetTr = 0;
      queryOperationName();
      $('.tableSelectList tr').removeClass('buddyListHighLight');
    }, 500);
  }
}
//回车事件
document.onkeydown = function (event) {
  var e = event || window.event;
  if (e && e.keyCode == 13) { //回车键的键值为13
    $(".messager-body").window('close');
    $('.operNamInputNum').focus();
  }
};