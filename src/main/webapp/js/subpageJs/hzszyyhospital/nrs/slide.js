var _gapWth = 50;
var sourceType;
function SlideBar(data) {
  var _this = this;
  var oActionBlock = document.getElementById(data.actionBlock),
    oActionBar = document.getElementById(data.actionBar),
    oSlideBar = document.getElementById(data.slideBar);
  var barLength = data.barLength;
  var interval = data.interval;
  var maxNumber = data.maxNumber;
  var oShowArea = null;
  if (data.showArea) {
    oShowArea = document.getElementById(data.showArea);
  }
  if (oShowArea) {
    _this.addScale(oSlideBar, interval, maxNumber, barLength);
    _this.inputBlur(oActionBlock, oActionBar, maxNumber, barLength, oShowArea);
    _this.clickSlide(oActionBlock, oActionBar, oSlideBar, maxNumber, barLength, oShowArea);
    _this.drag(oActionBlock, oActionBar, maxNumber, barLength, oShowArea);
  }
  else {
    _this.addScale(oSlideBar, interval, maxNumber, barLength);
    _this.clickSlide(oActionBlock, oActionBar, oSlideBar, maxNumber, barLength);
    _this.drag(oActionBlock, oActionBar, maxNumber, barLength);
  }
}
SlideBar.prototype = {
  //初始化(添加刻度线)
  addScale: function (slideBar, interval, total, barLength) {
    // interval代表刻度之间间隔多少, total代表最大刻度
    // slideBar表示在哪个容器添加刻度
    var num = total / interval; //num为应该有多少个刻度
    for (var i = 0; i < num + 1; i++) {
      var oScale = document.createElement('div');
      oScale.classList.add('lineScale');
      oScale.style.left = (i * interval * barLength) / total + 'px';
      slideBar.appendChild(oScale);
      var oText = document.createElement('div');
      oText.classList.add('lineText');
      oText.innerHTML = i * interval;
      slideBar.appendChild(oText);
      oText.style.left = ((i * interval * barLength) / total) - (oText.offsetWidth / 2) + 'px';
    }
  },

  // 监听输入框
  inputBlur: function (actionBlock, actionBar, maxNumber, barLength, input) {
    //actionBlock指滑块,actionBar指显示条,input指显示的输入框
    var _this = this;
    input.onblur = function () {
      var inputVal = this.value;
      _this.autoSlide(actionBlock, actionBar, maxNumber, barLength, inputVal);
    }
    input.onfocus = function () {
      var inputVal = this.value;
      _this.autoSlide(actionBlock, actionBar, maxNumber, barLength, inputVal);
    }
  },

  /* 在输入框输入值后自动滑动	*/
  autoSlide: function (actionBlock, actionBar, total, barLength, inputVal) {
    //inputVal表示输入框中输入的值
    var _this = this;
    var target = (inputVal / total * barLength);
    _this.checkAndMove(actionBlock, actionBar, target);
  },

  /*	检查target(确认移动方向)并滑动	*/
  checkAndMove: function (actionBlock, actionBar, target) {
    if (target > actionBar.offsetWidth) {
      actionBarSpeed = 8;		//actionBar的移动度和方向
    }
    else if (target == actionBar.offsetWidth) {
      return;
    }
    else if (target < actionBar.offsetWidth) {
      actionBarSpeed = -8;
    }
    var actionBarPace = actionBar.offsetWidth + actionBarSpeed;
    actionBarPace = target;
    actionBarPace = Math.round(actionBarPace / _gapWth) * _gapWth;
    actionBar.style.width = actionBarPace + 'px';
    if (sourceType == 'page') {
      if (!actionBar.offsetWidth) { // 针对系统评估第一次拿值时
        actionBlock.style.left = actionBarPace - 5 + 'px';
      } else {
        actionBlock.style.left = actionBar.offsetWidth - (actionBlock.offsetWidth / 2) + 'px';
      }
    } else {
      actionBlock.style.left = actionBar.offsetWidth - (actionBlock.offsetWidth / 2) + 'px';
    }
  },

  /*	鼠标点击刻度滑动块自动滑动	*/
  clickSlide: function (actionBlock, actionBar, slideBar, total, barLength, showArea) {
    var _this = this;
    slideBar.onclick = function (ev) {
      var ev = ev || event;
      var target = ev.clientX - slideBar.offsetLeft;
      if (target < 0) {
        //表示鼠标已经超出那个范围
        target = 0;
      }
      if (target > barLength) {
        target = barLength;
      }
      _this.checkAndMove(actionBlock, actionBar, target);
      if (showArea) {
        showArea.value = Math.round(target / barLength * total);
        _this.setShowInputVal(showArea.value);
      }
    }
  },

  /*	鼠标按着拖动滑动条	*/
  drag: function (actionBlock, actionBar, total, barLength, showArea) {
    /*	参数分别是点击滑动的那个块,滑动的距离,滑动条的最大数值,显示数值的地方(输入框)	*/
    var thisBlock = this;
    actionBlock.onmousedown = function (ev) {
      var ev = ev || event;
      var disX = ev.clientX;
      var currentLeft = thisBlock.offsetLeft;
      document.onmousemove = function (ev) {
        var ev = ev || event;
        var left = ev.clientX - disX;
        if (currentLeft + left <= (barLength - thisBlock.offsetWidth / 2) && currentLeft + left >= 0 - thisBlock.offsetWidth / 2) {
          var _leftGap = currentLeft + left;
          _leftGap = Math.round(_leftGap / _gapWth) * _gapWth - 4;
          thisBlock.style.left = _leftGap + 'px';
          actionBar.style.width = _leftGap + (actionBlock.offsetWidth / 2) + 'px';
          if (showArea) {
            showArea.value = Math.round(actionBar.offsetWidth / barLength * total);
            thisBlock.setShowInputVal(showArea.value);
          }
        }
        return false;
      }
      document.onmouseup = function () {
        document.onmousemove = document.onmouseup = null;
      }
      return false;
    }
  },
  setShowInputVal: function (num) {
    if (sourceType == 'page') {
      vm.systemtMsg.nrsSco = num;
    } else {
      vm.msgInfo.nrsSco = num;
    }
    if (num !== '') {
      document.getElementById('typeSlide').checked = true;
      if (sourceType == 'page') {
        vm.systemtMsg.ttpfTypeCod = $("input[name='typeWay']:checked").val();
        vm.systemtMsg.faceNrsSco = null;
      } else {
        vm.msgInfo.ttpfTypeCod = $("input[name='typeWay']:checked").val();
        vm.msgInfo.faceNrsSco = null;
      }
      var otherList = ['numList', 'lanList'];
      otherList.forEach(function (val, index) {
        vm.getMsg[val].map(function (_val, _index) {
          vm.getMsg[val][_index].isAct = false;
        })
      })
      vm.setOtherNrsNull(_actList);
      vm.setOtherNrsNull(_nrsActList);
    }
  }
}