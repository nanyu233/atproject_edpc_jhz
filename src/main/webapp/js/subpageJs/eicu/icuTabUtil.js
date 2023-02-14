var customUrlMap = {
  // pageval = 111001
  vitlInfo: 'icuVitlIo/toVitlInfo.do',
  // pageval = 111002
  ioDaInfo: 'icuVitlIo/toIoDaInfo.do',
  //预警阈值
  vitlLmt: 'icuvslmt/editVsLmt.do',
  // pageval = 111003
  vitlChart: 'icuVitlIo/toVitlChart.do',
  // pageval = 111004
  ioChart: 'icuVitlIo/toIoChart.do',
  // 评估、评分总览
  totalScoPage: 'icuscore/toTotalScoPage.do',
  // pageval = 106000
  queryPipe: 'icupipe/queryPipe.do',
  // pageval = 107001
  daInfo: 'icudoctadvi/icuadvipage.do',
  // pageval =  107002
  mpInfo: 'icudoctadvi/toMicPumpInfo.do',
  // pageval = 107003
  daExecInfo: 'icudoctadvi/toDaGrpInfo.do',
  // pageval = 108001
  examPage: 'icuExam/toExamPage.do',
  // pageval = 108002
  inspPage: 'icuinsp/toInspPage.do',
  // pageval = 108003
  bgInfo: 'icucare/toBgCareSheet.do',
  // pageval = 112000
  erPage: 'icuer/toErInfo.do',
  // pageval = 113000
  ptShiftInfo: 'icuShift/toShiftInfo.do',
  // pageval = 102003
  ncInfo: 'icuNc/toNcInfo.do',
};
var icuTabUtil = {
  /**
   * check user to show tab
   */
  checkUrlInMenu: function (tabKey, menuInfoObj) {
    if (!menuInfoObj) {
      menuInfoObj = eicuUtil.getMenuInfo();
    }
    var tabMenuInfo = null;
    tabUrl = customUrlMap[tabKey] || '';
    $.each(menuInfoObj, function (pageval, menuInfo) {
      if (menuInfo.menuUrl === tabUrl) {
        tabMenuInfo = menuInfo;
        return false;
      }
    });
    return tabMenuInfo;
  },
  /**
   * dynamic render btn or hide
   * @param {object} btnMap
   * set menuName for default btn text
   * btnMap def exp: 
   * 'exampage-link-btn': 'examPage'
   *   or
   * 'insppage-link-btn': {
        tabKey: 'inspPage',
        customFunc: toInspPage // page function
      }
   */
  renderTabBtn: function (btnMap) {
    var menuInfoObj = eicuUtil.getMenuInfo();
    $.each(btnMap, function (id, tabInfo) {
      var tabMenuInfo = null;
      var btnSelector;
      var basicFlag = true; // 基础模式/自定义function模式
      var $btn;
      var tabKey;
      var tabName;
      //clear tabMenuInfo
      tabMenuInfo = null;
      btnSelector = '#' + id;
      $btn = $(btnSelector);
      // find current menu info
      if (typeof tabInfo === 'string') {
        tabKey = tabInfo;
      } else {
        basicFlag = false;
        tabName = tabInfo.tabName;
        tabKey = tabInfo.tabKey;
      }
      tabMenuInfo = icuTabUtil.checkUrlInMenu(tabKey, menuInfoObj);
      if (!tabMenuInfo) {
        tabMenuInfo = eicuUtil.findMenuInfoByParam(tabKey);
      }
      if (!tabMenuInfo && !tabName) {
        // 菜单没有相关请求，隐藏按钮
        $btn.hide();
      } else {
        // 如果是空按钮，增加默认按钮名
        if (!$btn.get(0).innerHTML) {
          $btn.text(tabMenuInfo.menuName);
        }
        // 根据类型绑定事件
        if (basicFlag) {
          $btn
            .show()
            .off('click')
            .on('click', function () {
              icuTabUtil.openTab(tabKey);
            });
        } else {
          $btn
            .show()
            .off('click')
            .on('click', function () {
              tabInfo.customFunc(tabKey);
            });
        }
      }
    });
  },
  /**
   * @param {String} tabKey-menuId||customTabName||menuName || {Object} tabInfo
   * @param {Object} ptInfo
   * @param {Object} custPageInfo
   */
  openTab: function (tabKey, ptInfo, custPageInfo) {
    var ptBasicInfo = ptInfo || eicuUtil.ptBasicInfo;
    // console.log('ptBasicInfo from openTab in icuTabUtil', eicuUtil.ptBasicInfo);
    var _liveNo = custPageInfo.pageData.liveNo;
    var _custName = ptBasicInfo.custName;
    // tabinfo
    var tabUrl; // custom tabname-url
    var tabMenuInfo; // stored menu info
    var pagetype;
    var pageval;
    var openTabName;
    // params
    var thisPageInfo = {
      pageType: 'fakeType',
      pageData: {
        liveNo: _liveNo
      }
    };
    if (custPageInfo) {
      if (custPageInfo.pageType) {
        thisPageInfo.pageType = custPageInfo.pageType;
      }
      // merge custPageData with liveNo
      $.each(custPageInfo, function (k, v) {
        thisPageInfo[k] = v;
      });
    }
    eicuUtil.setLastPageData(thisPageInfo);
    if (typeof tabKey === 'string') {
      // find current menu info by custom tab name-url or menuid or menuName
      tabUrl = customUrlMap[tabKey];
      if (!tabUrl) {
        console.warn(
          'invalid custom name, start to find menu as menuId or menuName or gradeType'
        );
      }
      tabMenuInfo = eicuUtil.findMenuInfoByParam(tabUrl || tabKey);
    } else {
      // menuinfo已作为首个参数传入
      tabMenuInfo = tabKey;
    }
    if (!tabMenuInfo) {
      alert_warn('请求出错，请联系管理员！');
      return;
    }
    // set tab info
    openTabName = tabMenuInfo.menuName;
    pagetype = tabMenuInfo.idRoot;
    pageval = tabMenuInfo.menuId;
    if (!ptBasicInfo.outicuTimeStr) {
      // 未出科
      openTabName = openTabName;
    } else {
      openTabName = _custName + '-' + openTabName;
    }
    if (pagetype === '#') {
      // url will end with #, fake string root
      pagetype = 'root';
    }
    // console.log('tabUtil->tabMenuInfo', tabMenuInfo);
    // console.log('current page\'s url.', parent.window.location.href);
    
    // if(!sessionStorage.getItem('icutoken')) {
    //   // （暂）如果是外链调用，(4.26)涉及到的页面最多两层，所以用这种比较
    //   var _url = parent.window.location.href;
    //   _url = _url.split('?')[0];
    //   var urlParams = '?gradeType=' + tabMenuInfo.menuType + '&liveNo=' + parent.eicuUtil.setOuterInfo().liveNo;
    //   _url = _url + urlParams;
    //   // window.open(_url);
    //   parent.window.location.href = _url;
    // } else {


      if(tabMenuInfo.menuType === 'TWD'){
        var _url = encodeURI('http://' + _ippost + _baseUrl + tabMenuInfo.menuUrl + '?liveNo={"sessionId":"' + _sessionId + '","liveNo":"'+basicLiveNo+'","usrno":"'+ _usrno +'"}');
        console.log(_url)
        $('#openIe').attr('href','alert:'+_url);
      } else if(tabMenuInfo.menuType === 'OUTER') {
        var custId = ptBasicInfo.custId;
        var custNo = ptBasicInfo.custNo;
        var liveNo = ptBasicInfo.liveNo;
        var url =  tabMenuInfo.menuUrl + "&zyh=" + liveNo + "&sfzh=" +
            Base64.encode(custId);
          console.log(url)
          window.open(url, "_blank");
      } else {
        var openTabUrl =
          _baseUrl +
          'icucust/toCustInfo.do?pagetype=' +
          pagetype +
          '&pageval=' +
          pageval +
            '&liveNo=' +
            _liveNo
        openTabUrl = encodeURI(openTabUrl);
        window.top.addTab(openTabName, openTabUrl, '', '0');
      }


    // }

    
  },
};
