var canSearchFlag = true;
var currentLine = -1, offsetTr = 0;
function changeItem(it) {
  if (!it) return false;
  $('.cbyxSearchList tr:hover').removeClass('buddyListHighLight');
  changeBackground(it);
  if (currentLine < 0) currentLine = it.rows.length - 1;
  if (currentLine >= it.rows.length) currentLine = 0;
  it.rows[currentLine].className = "buddyListHighLight";
  if (document.getElementById('allBuddy')) {
    document.getElementById('allBuddy').scrollTop = it.rows[currentLine].offsetTop - offsetTr;
  }
}
function addUser(it) {
  var _currentidx = it.rows[currentLine].rowIndex;
  vm.chooseCbyx(_currentidx);
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
function mouseMove(ev) {
  var _tab = document.getElementById('buddyListTable');
  if (document.all) {
    _tab = document.getElementById('buddyListTable').children[0];
  }
  changeBackground(_tab);
  $('.cbyxSearchList tr:hover').removeClass('buddyListEven').removeClass('buddyListOdd').addClass('buddyListHighLight');
  for (var i = 0; i < _tab.rows.length; i++) {
    if (_tab.rows[i].className == "buddyListHighLight") {
      currentLine = i;
    }
  }
}
document.onmousemove = mouseMove;
$(function () {
  $("#cbyxParams").keyup(function (event) {
    var tab = document.getElementById('buddyListTable');
    if (document.all) {
      tab = document.getElementById('buddyListTable').children[0];
    }
    canSearchFlag = true
    var _event = window.event || event;
    if (_event.keyCode == 38) { //Up 
      offsetTr = 0;
      currentLine--;
      changeItem(tab);
    } else if (_event.keyCode == 40) { //Down
      offsetTr = 150;
      currentLine++;
      changeItem(tab);
    } else if (_event.keyCode == 13 && currentLine > -1 && tab.rows.length > 0) {
      addUser(tab);
      canSearchFlag = false;
    } else if (_event.keyCode == 13 && canSearchFlag == true) {
      currentLine = -1;
      offsetTr = 0;
      vm.getCbyxList();
    }
  });
});

function pdkeycode(eve) {
  if (eve.keyCode != '13') {
    vm.getCbyxList();
  }
}

$("body").click(function () {
  $('#allBuddy').css('display', 'none');
});
$("#searchWrapper").mouseleave(function () {
  $('#allBuddy').css('display', 'none');
});