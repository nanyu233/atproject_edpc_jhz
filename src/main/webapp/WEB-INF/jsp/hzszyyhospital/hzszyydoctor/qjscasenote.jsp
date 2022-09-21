<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/base/tag.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
  <title>留抢病历记录</title>
  <%@ include file="/WEB-INF/jsp/base/common_css.jsp"%>
  <link rel="stylesheet" type="text/css" href="${baseurl}css/common/base/cssReseat.css" />
  <link rel="stylesheet" type="text/css" href="${baseurl}lib/easyui1.3/themes/default/easyui.css" />
  <link rel="stylesheet" type="text/css" href="${baseurl}lib/easyui1.3/themes/icon.css">
  <link rel="stylesheet" type="text/css" href="${baseurl}css/hzszyyhems/hzszyydoctor/qjscasenote.css?v=${versionDay}">
  <script type="text/javascript">
    var userFlg = '${userFlg}'; // 1护士 2医生
    var pageFlg = '${pageFlg}' // 判断是不是 归档病历 [其中dailyRecord：日志； 2：归档病历 ]
  </script>
</head>

<body class="easyui-layout">
  <div class="knowledgeBox" id="rightMenuBox" onclick="knowledgeBoxLeft()">
    <p id="rightBoxTitle">知<br/>识<br/>库</p>
  </div>
  <div data-options="region:'west',border:false" style="width:200px;border-right:solid #e4efff 10px;">
    <div class="nav-tree" id="navTree"></div>
  </div>
  <div class="checkTime">
    <ul>
      <li>
        <label>状态：</label>
        <span class="roleStatus"></span>
      </li>
      <li class="checkRoleType">
        <label></label>
        <span></span>
      </li>
      <li>
        <label>审核时间：</label>
        <span class="nurseTime timeSpan"><input class="Wdate spcWdate" type="text" onclick="WdatePicker({dateFmt:'yyyy/MM/dd HH:mm:ss'})"
            value="${hspemginfCustom.checkNurDatStr}"></span>
        <span class="docTime timeSpan"><input class="Wdate spcWdate" type="text" onclick="WdatePicker({dateFmt:'yyyy/MM/dd HH:mm:ss'})"
            value="${hspemginfCustom.checkDocDatStr}"></span>
      </li>
    </ul>
    <input type="button" value="审核通过" onclick="checkWay()" class="checkBtn" />
  </div>
  <div data-options="region:'center',border:false">
    <div class="main" id="main" style="overflow-y: hidden;">
      <span id="_psex" class="hidden">${hspemginfCustom.cstSexCod}</span>
      <span id="_page" class="hidden">${hspemginfCustom.cstAge}${hspemginfCustom.cstAgeCod}</span>
      <span id="_pemgFkCod" class="hidden">${hspemginfCustom.emgFkCod}</span>
      <span id="_pdiagnose" class="hidden">${hspemginfCustom.ryzdXy}</span>
      <span id="_pdiagnoseDes" class="hidden">${hspemginfCustom.jbzdDes}</span>
      <iframe frameborder="0" marginwidth="0" marginheight="0" width="100%" height="100%" id="mainIfream" scrolling="no"
        src="" name="mainIframe"></iframe>
    </div>
  </div>
  <input type="hidden" id="emgSeq" value="${hspemginfCustom.emgSeq}" />
  <%@ include file="/WEB-INF/jsp/base/common_js.jsp"%>
  <script type="text/javascript">
    var _check_right = '../images/hzszyyhems/diseasecourse/check-circle.png',
      _check_wrong = '../images/hzszyyhems/diseasecourse/close-circle.png',
      _check_right_check = '../images/hzszyyhems/diseasecourse/check-circle-check.png',
      _check_wrong_check = '../images/hzszyyhems/diseasecourse/close-circle-check.png';
    var comdata = { cstNam: '${cstNam}', emgSeq: '${emgSeq}', baseUrl: '${baseurl}', username: '${sessionScope.activeUser.usrname}' };
    // 左侧菜单List data
    function getDataMenu() {
      var data = [{
        text: '病案首页',
        cod: '1',
        checkName: 'checkLgsyCod',
        visual: 'block',
        attributes: {
          url: 'zyylqbl/medicalRecord.do.do?emgSeq=${hspemginfCustom.emgSeq}'
        }
      }, 
      // {
      //   text: '留观首页',
      //   cod: '1',
      //   checkName: 'checkLgsyCod',
      //   visual: 'block',
      //   attributes: {
      //     url: 'zyylqbl/queryobservenote.do?emgSeq=${hspemginfCustom.emgSeq}'
      //   }
      // },
      {
        text: '首次病历记录',
        cod: '2',
        checkName: 'checkLqblCod',
        visual: 'block',
        attributes: {
          url: 'zyylqbl/querylqbl.do?emgSeq=${hspemginfCustom.emgSeq}'
        }
      }, {
        text: '病程记录',
        cod: '3',
        checkName: 'checkBcjlCod',
        visual: 'block',
        attributes: {
          url: 'diseaseCourse/queryDiseaseCourse.do?emgSeqDc=${hspemginfCustom.emgSeq}'
        }
      }, 
      // {
      //   text: '手术操作记录',
      //   cod: '4',
      //   checkName: 'checkSsczCod',
      //   visual: 'block',
      //   attributes: {
      //     url: 'zyylqbl/operate.do?emgSeq=${hspemginfCustom.emgSeq}'
      //   }
      // }, 
      {
        text: '会诊记录',
        cod: '5',
        checkName: 'checkHzjlCod',
        visual: 'block',
        attributes: {
          url: 'consultation/queryConsultation.do?emgSeqCr=${hspemginfCustom.emgSeq}'
        }
      }, {
        text: '死亡记录',
        cod: '6',
        checkName: 'checkSwjlCod',
        visual: 'block',
        attributes: {
          url: 'deathRecord/queryDeathRecord.do?emgSeqDr=${hspemginfCustom.emgSeq}'
        }
      }, {
        text: '抢救室小结',
        cod: '7',
        checkName: 'checkCgjlCod',
        visual: 'block',
        attributes: {
          url: 'zyylqbl/querycgxj.do?emgSeq=${hspemginfCustom.emgSeq}'
        }
      }, {
        text: '知情同意',
        cod: '8',
        checkName: 'checkZqtyCod',
        visual: 'block',
        attributes: {
          url: 'zyyconsent/queryConsentInf.do?refseqno=${hspemginfCustom.emgSeq}'
        }
      }, {
        text: '评分表',
        cod: '15',
        checkName: 'checkPfbCod',
        visual: 'block',
        attributes: {
          url: 'diseaseCourse/queryDiseaseCourse.do?emgSeqDc=${hspemginfCustom.emgSeq}&type=score'
        }
      }, {
        text: '医嘱信息',
        cod: '9',
        checkName: 'checkYzxxCod',
        visual: 'block',
        attributes: {
          url: 'zyylqbl/toquerycfxx.do?emgSeq=${hspemginfCustom.emgSeq}'
        }
      }, {
        text: '检验信息',
        cod: '10',
        checkName: 'checkJyxxCod',
        visual: 'block',
        attributes: {
          //url: 'zyyqjs/toqjscaseexamine.do?emgSeq=${hspemginfCustom.emgSeq}'
          url: 'zyyqjs/toqjscaseexaminenew.do?emgSeq=${hspemginfCustom.emgSeq}'
        }
      }, {
        text: '检查报告',
        cod: '11',
        checkName: 'checkJcbgCod',
        visual: 'block',
        attributes: {
          url: 'zyyqjs/qjsjcbg.do?emgSeq=${hspemginfCustom.emgSeq}'
        }
      }, {
        text: '体温单',
        cod: '12',
        checkName: 'checkTwdCod',
        visual: 'block',
        attributes: {
          url: 'zyylqbl/lqbltpct.do?emgSeq=${hspemginfCustom.emgSeq}'
        }
      }, {
        text: '护理记录单',
        cod: '13',
        checkName: 'checkHljlCod',
        visual: 'block',
        attributes: {
          url: 'zyylqbl/lqblquerynote.do?emgSeq=${hspemginfCustom.emgSeq}'
        }
      }, {
        text: '入院护理评估单',
        cod: '14',
        checkName: 'checkHlpgCod',
        visual: 'block',
        attributes: {
          url: 'zyylqbl/queryhlpgNote.do?emgSeq=${hspemginfCustom.emgSeq}'
        }
      }];
      return data;
    }
    
    // 已审核
    function checkApproved() {
      $('.roleStatus').html('已审核')
      $('.roleStatus').css('color', 'green')
      $('.checkBtn').hide()
      $('.right-icon').hide();
      $('.wrong-icon').hide();
    }
    function checkZj() {
      $('.roleStatus').html('当前权限已审核')
      $('.roleStatus').css('color', 'green')
      $('.checkBtn').hide()
      $('.right-icon').hide();
      $('.wrong-icon').hide();
    }
    function checkRoleTime() {
      var today = publicFun.timeFormat(new Date(), 'yyyy/MM/dd hh:mm:ss');
      if (pageFlg && pageFlg != 'dailyRecord') {
        if (userFlg === '1' || userFlg === '2') {
          $('.checkTime').show();
        }
      }
      if (userFlg == 1) {
        // roleStatus
        if ('${hspemginfCustom.checkNurStatus}' == 2) {
          checkApproved()
        } else {
          $('.roleStatus').html('未审核')
          $('.roleStatus').css('color', 'red')
        }
        $('.checkRoleType').find('label').html('质控护士：')
        if ('${hspemginfCustom.checkNurse}' && '${hspemginfCustom.checkDocStatus}' != 2) {
          $('.checkRoleType').find('span').html('${hspemginfCustom.checkNurse}' + ',' + '${sessionScope.activeUser.usrname}')
        } else if ('${hspemginfCustom.checkNurse}') {
          $('.checkRoleType').find('span').html('${hspemginfCustom.checkNurse}')
        } else {
          $('.checkRoleType').find('span').html('${sessionScope.activeUser.usrname}')
        }
        $('.nurseTime').show()
        if (!$('.nurseTime input').val()) {
          $('.nurseTime input').val(today)
        }
      } else if (userFlg == 2) {
        if ('${hspemginfCustom.checkDocStatus}' == 2) {
          checkApproved()
        } else {
          $('.roleStatus').html('未审核')
          $('.roleStatus').css('color', 'red')
        }
        $('.checkRoleType').find('label').html('质控医生：')
        if ('${hspemginfCustom.checkDoctor}') {
          $('.checkRoleType').find('span').html('${hspemginfCustom.checkDoctor}')
        } else {
          $('.checkRoleType').find('span').html('${sessionScope.activeUser.usrname}')
        }
        $('.docTime').show()
        if (!$('.docTime input').val()) {
          $('.docTime input').val(today)
        }
      } else {
        $('.timeSpan').hide()
      }
    }

    function hasRightToCheck(arr) {
      var flag = '', num = 0;
      arr.map(function (ele) {
        if (checkMsg[ele] == '2' || checkMsg[ele] == '0') {
          flag = 'false'
        } else if (checkMsg[ele] === '1') {
          num++
        }
      })
      if (num == arr.length) {
        flag = 'true'
      }
      return flag
    }
    function checkWay() {
      var isCheckRight = 'true';
      var confirmMsg = '确定审核通过该笔病历吗？';
      if (userFlg == 1 || userFlg == 2) {
        var _checkMenuList = [];
        if (userFlg == 1) { // 护士
          _checkMenuList = ['checkHljlCod', 'checkHlpgCod', 'checkTwdCod', 'checkYzxxCod'];
        } else if (userFlg == 2) { // 医生
          _checkMenuList = ['checkLgsyCod', 'checkLqblCod', 'checkBcjlCod', 'checkSsczCod', 'checkHzjlCod', 'checkSwjlCod', 'checkCgjlCod', 'checkZqtyCod', 'checkJyxxCod', 'checkJcbgCod', 'checkPfbCod']; // 医生时 除了[护理记录单、体温单、医嘱信息、护理评估单]
        }
        if ($('#age').val() === '' || '${hspemginfCustom.idNbr}' === '' || '${hspemginfCustom.pheNbr}' === '') {
          confirmMsg = '该患者基本信息不完整，确定审核通过该笔病历吗？';
        }
        isCheckRight = hasRightToCheck(_checkMenuList)
      } else {
        var _checkOtherMenuList = ['checkLgsyCod', 'checkLqblCod', 'checkBcjlCod', 'checkSsczCod', 'checkHzjlCod', 'checkSwjlCod', 'checkCgjlCod', 'checkZqtyCod', 'checkJyxxCod', 'checkJcbgCod', 'checkPfbCod']; // 医生时 除了[护理记录单、体温单、医嘱信息、护理评估单]
        isCheckRight = hasRightToCheck(_checkOtherMenuList)
      }
      if (isCheckRight === 'true') {
        _confirm(confirmMsg, null, function () {
          checkAndPost()
        })
      }
    }

    function checkZjNurse(_timeVal) {
      var _checkMenuList = ['checkHljlCod', 'checkHlpgCod', 'checkTwdCod', 'checkYzxxCod'];
      publicFun.httpServer({ url: '${baseurl}zyyqjs/getCheckCase.do', isNoLoad: true }, { emgSeq: '${hspemginfCustom.emgSeq}' }, function (res) {
        var _checkNurStatus = '';
        var _num = 0;
        $.each(_checkMenuList, function (i, val) {
          if (res[val] == '1') {
            _num++;
          }
        })
        if (_num == 4) {
          _checkNurStatus = 2;
        } else {
          _checkNurStatus = '';
        }
        var _param = {
          'checkNurseDat': _timeVal,
          'checkNurse': $('.checkRoleType span').html(),
          'emgSeq': '${hspemginfCustom.emgSeq}',
          'checkNurStatus': _checkNurStatus,
          'userFlg': '${userFlg}'
        }
        submitCheckRecord(_param);
      })
    }

    function submitCheckRecord(param) {
      publicFun.httpServer({ url: '${baseurl}zyyqjs/submitCheckRecord.do' }, param, function (data) {
        if (data.resultInfo.messageCode == 906) {
          checkApproved()
          $.messager.alert('提示信息', '审核成功！', 'success');
          var menuName = parent.$('#tabs').tabs('getSelected').panel('options').title;
          setTimeout('parent.$("#tabs").tabs("close","' + menuName + '")', 1000);
        }
      })
    }

    function checkAndPost() {
      var param = {};
      var _timeVal = '';
      if (userFlg == 1) {
        _timeVal = $('.nurseTime input').val();
        checkZjNurse(_timeVal);
      } else if (userFlg == 2) {
        _timeVal = $('.docTime input').val()
        param = {
          'checkDocDat': _timeVal,
          'checkDoctor': $('.checkRoleType span').html(),
          'emgSeq': '${hspemginfCustom.emgSeq}',
          'checkDocStatus': 2,
          'userFlg': '${userFlg}'
        }
        submitCheckRecord(param);
      }

    }

    /**
     * [initNavTree 初始化左侧的菜单树]
     * @param  {[type]} data [description]
     */
    function initNavTree(data) {
      var _innerHtml = [];
      var normalStr = '', boldStr = '';

      _innerHtml.push('<dl>');
      for (var i = 0; i < data.length; i++) {
        // normalStr = '<dd class=\"normalMenu\" onclick=\"toIfream(\'' + data[i].attributes.url + '\',' + i + ')\">' + data[i]['text'] + '<label><span><img class=\"right-icon ' + data[i]['checkName'] + 'Right \" src=\"' + _check_right + '\"><img class=\"wrong-icon ' + data[i]['checkName'] + 'Wrong \" src=\"' + _check_wrong + '\"></span></label></dd>';
        normalStr = '<dd onclick =\"toIfream(\'' + data[i].attributes.url + '\',' + i + ')\">' + data[i]['text'] + '</dd>';
        // boldStr = '<dd class=\"checkMenu\" onclick=\"toIfream(\'' + data[i].attributes.url + '\',' + i + ', event)\">' + data[i]['text'] + '<label><input class=\"checkInput\" type=\"checkbox\" onchange=\"checkChange(\'' + data[i]['checkName'] +'\', event)\"/></label></dd>';
        boldStr = '<dd class=\"checkMenu\" onclick=\"toIfream(\'' + data[i].attributes.url + '\',' + i + ')\">' + data[i]['text'] + '<label><span><img class=\"right-icon ' + data[i]['checkName'] + 'Right \" src=\"' + _check_right + '\" onclick=\"changeImgBg(\'right-icon\', ' + i + ',\'' + data[i]['checkName'] + '\', event)\"><img class=\"wrong-icon ' + data[i]['checkName'] + 'Wrong \" src=\"' + _check_wrong + '\" onclick=\"changeImgBg(\'wrong-icon\', ' + i + ',\'' + data[i]['checkName'] + '\', event)\"></span></label></dd>';

        if (pageFlg && pageFlg != 'dailyRecord') {
          if (data[i].cod !== '13' && data[i].cod !== '12' && data[i].cod !== '9' && data[i].cod !== '14') {
            if (userFlg == 2) { // 医生时 除了[护理记录单、体温单、医嘱信息、护理评估单]
              _innerHtml.push(boldStr);
            } else {
              _innerHtml.push(normalStr);
            }
          } else {
            if (userFlg == 1 && data[i].visual == 'block') { // 护士时 护理记录单、体温单、医嘱信息、护理评估单
              _innerHtml.push(boldStr);
            } else {
              _innerHtml.push(normalStr);
            }
          }
        } else {
          _innerHtml.push(normalStr);
        }
      }
      _innerHtml.push('</dl>')
      $('#navTree').html(_innerHtml.join(''))
      if ((userFlg == 2 || userFlg == 1) && pageFlg && pageFlg != 'dailyRecord') {
        $('#navTree').addClass('overTree')
      } else {
        $('#navTree').removeClass('overTree')
      }
    }

    /**
     * [checkChange 左侧菜单checkbox点击事件]
     * @param  {[type]} objName  [description]
     */
    var checkMsg = {
      emgSeqCheck: '${hspemginfCustom.emgSeq}',
      checkLgsyCod: '0',
      checkLqblCod: '0',
      checkBcjlCod: '0',
      checkSsczCod: '0',
      checkHzjlCod: '0',
      checkSwjlCod: '0',
      checkCgjlCod: '0',
      checkZqtyCod: '0',
      checkYzxxCod: '0',
      checkJyxxCod: '0',
      checkJcbgCod: '0',
      checkTwdCod: '0',
      checkHljlCod: '0',
      checkHlpgCod: '0',
      checkPfbCod: '0',
      checkDocFlg: '',
      checkNurseFlg: ''
    }
    //阻止冒泡事件的兼容性处理 
    function stopBubble(e) {
      if (e && e.stopPropagation) { //非IE 
        e.stopPropagation();
      } else { //IE 
        window.event.cancelBubble = true;
      }
    }
    function checkChange(objName, event) {
      stopBubble(event)
      if (checkMsg[objName] === '0') {
        checkMsg[objName] = '1'
      } else {
        checkMsg[objName] = '0'
      }
      publicFun.httpServer({ url: '${baseurl}zyyqjs/submiCheckCase.do' }, checkMsg, function (res) {
      })
    }

    /**
    * 菜单栏归档病历医生护士审核图片样式切换['1' 表示审核通过， '2' 表示审核不通过  '0' 代表未审核]
    **/
    function changeImgBg(className, idx, objName, event) {
      stopBubble(event)
      if (className === 'right-icon') {
        if (checkMsg[objName] === '1') {
          return
        }
        checkMsg[objName] = '1'
        $('#navTree dd').eq(idx).find('.' + className).attr('src', _check_right_check)
        $('#navTree dd').eq(idx).find('.wrong-icon').attr('src', _check_wrong)
      } else {
        if (checkMsg[objName] === '2') {
          return
        }
        checkMsg[objName] = '2'
        $('#navTree dd').eq(idx).find('.' + className).attr('src', _check_wrong_check)
        $('#navTree dd').eq(idx).find('.right-icon').attr('src', _check_right)
      }
      if (userFlg == 2) {
        checkMsg.checkDocFlg = '1'
      } else if (userFlg == 1) {
        checkMsg.checkNurseFlg = '1'
      }
      publicFun.httpServer({ url: '${baseurl}zyyqjs/submiCheckCase.do' }, checkMsg, function (res) {
        setCheckBtnBg()
      })
    }
    /**
    * 设置按钮背景颜色当全部审核通过时才恢复正常颜色按钮
    **/
    function setCheckBtnBg() {
      var _check_num = 0;
      var key_list = [];
      if (userFlg == 1) { // 护士
        key_list = ['checkHljlCod', 'checkHlpgCod', 'checkTwdCod', 'checkYzxxCod'];
      } else if (userFlg == 2) { // 医生
        key_list = ['checkLgsyCod', 'checkLqblCod', 'checkBcjlCod', 'checkSsczCod', 'checkHzjlCod', 'checkSwjlCod', 'checkCgjlCod', 'checkZqtyCod', 'checkJyxxCod', 'checkJcbgCod', 'checkPfbCod']; // 医生时 除了[护理记录单、体温单、医嘱信息、护理评估单]
      }
      key_list.map(function (ele) {
        if (checkMsg[ele] === '1') {
          _check_num++;
        }
      })
      if (_check_num == key_list.length) {
        $('.checkBtn').addClass('active')
      } else {
        $('.checkBtn').removeClass('active')
      }
    }

    function getCheckState() {
      publicFun.httpServer({ url: '${baseurl}zyyqjs/getCheckCase.do', isNoLoad: true }, { emgSeq: '${hspemginfCustom.emgSeq}' }, function (res) {
        var identify = '${xxqx}';
        var _checkMenuList = ['checkHljlCod', 'checkHlpgCod', 'checkTwdCod', 'checkYzxxCod'];
        var _num = 0;
        for (var key in res) {
          if (checkMsg.hasOwnProperty(key)) {
            checkMsg[key] = res[key]
            if (res[key] === '1') {
              $('.' + key + 'Right').attr('src', _check_right_check)
            } else if (res[key] === '2') {
              $('.' + key + 'Wrong').attr('src', _check_wrong_check)
            }
          }

          $.each(_checkMenuList, function (_key, _value) {
            if (key == _value && res[key] == '1') {
              _num++;
            }
          })
        }

        //质检判断
        if (_num == _checkMenuList.length) {
          checkZj();
        }
        setCheckBtnBg()
      })
    }
    /**
     * [toIfream 左侧菜单点击事件]
     * @param  {[type]} url  [description]
     * @param  {[type]} indx [description]
     * @return {[type]}      [description]
     */
    function toIfream(url, indx) {
      // showParentZgMsg(url);
      $('#mainIfream').attr('src', '${baseurl}' + url);
      $('#navTree dd').removeClass('active').eq(indx).addClass('active')
      var mainIframe = document.getElementById('mainIfream');
      if (pageFlg) {
        hideOtherBtn(indx)
        if (mainIframe.attachEvent) {
          mainIframe.attachEvent("onload", function () { // IE  
            hideOtherBtn(indx)
          });
        } else {
          mainIframe.onload = function () { // 非IE  
            hideOtherBtn(indx)
          };
        }
      }
    }

    function hideOtherBtn(index) {
      // var _btnList = ['save', 'add', 'addAll', 'edit', 'del', 'delete', 'bgsave'];
      // $.each(_btnList, function (idx, val) {
      //   $('#mainIfream').contents().find('#' + val).hide();
      // })
      // if (index == 3 || index == 4 || index == 7) {
      //   $('#mainIfream').contents().find('#edit').show();
      // }
    }
    /**
     * [stopDefault 阻止默认事件]
     */
    function stopDefault(e) {
      if (e && e.preventDefault) {
        e.preventDefault();
      } else {
        window.event.returnValue = false;
        window.event.keyCode = 0;
        alert(e.keyCode);
      }
      return false;
    }
    $(document).keydown(function (event) {
        switch (event.keyCode) {
          case 18:
            stopDefault(event)
          case 116:
            stopDefault(event)
          case 122:
            stopDefault(event)
        }
      });
    
    function setCheckMenu () {
      var _allMenuList = getDataMenu();
      if ('${relevanceModule}') {
        _allMenuList.forEach(function (item, idx) {
          if (item.checkName == '${relevanceModule}') {
            toIfream(item.attributes.url, idx);
          }
        })
      } else {
        toIfream(getDataMenu()[0].attributes.url, 0)
      }
    }

    // 显示父页面的转归msg----- 3、医生电子病历的入院护理评估单核对。隐藏转归
    function showParentZgMsg (url) {
      var _info = parent.vm.patientMsg;
      if ((_info.sqlSeq != _info.firstsqlseq) || _info.pageSrc == 'queryQjs' || _info.pageSrc == 'transManager') {
        if (url.indexOf('queryhlpgNote') == -1) {
          parent.$('#outComeSpan').show();
        } else {
          parent.$('#outComeSpan').hide();
        }
      } else {
        parent.$('#outComeSpan').hide();
      }
    }

    $(function () {
      initNavTree(getDataMenu());
      getCheckState();
      setCheckMenu();
      var ageVal = '${hspemginfCustom.cstAge}';
      if (ageVal == '') {
        $('.age').html('');
      }
      checkRoleTime()
    })
    
    function knowledgeBoxLeft () {
      createmodalwindow('电子病历知识库', 820, 610, '${baseurl}favorite/toKnowledgeBase.do?emgSeq=${hspemginfCustom.emgSeq}', 'no');
    }
  </script>
</body>

</html>