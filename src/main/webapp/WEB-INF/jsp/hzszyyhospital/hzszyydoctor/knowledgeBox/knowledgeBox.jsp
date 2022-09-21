<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/base/tag.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <title>医生端知识库</title>
  <%@ include file="/WEB-INF/jsp/base/common_css.jsp"%>
  <!-- <link rel="stylesheet" type="text/css" href="${baseurl}lib/at-font/style.css?v=${versionDay}"> -->
  <link rel="stylesheet" type="text/css" href="${baseurl}css/hzszyyhems/hzszyydoctor/knowledgeBox.css?v=${versionDay}">
  <link rel="stylesheet" type="text/css" href="${baseurl}css/common/tableStyle.css?v=${versionDay}">
  <%@ include file="/WEB-INF/jsp/base/common_js.jsp"%>
  <script>
    var _idName = '${idName}',
      _tempSeo = '${tempSeo}';
    var userQx = '';
  </script>
</head>

<body>
  <div class="knowledgeContent knBox" id="knowledgeContentDiv">
    <!-- <p class="title">
      电子病历知识库
      <i class="at-fa-icon-right right-icon" onclick="hideKnowledgeBox()"></i>
    </p> -->
    <div class="boxWrap">
      <ul class="tabCard">
        <li onclick="setLiBg('0')" class="active tabType0">我的模板</li>
        <li onclick="setLiBg('1')" class="tabType1">自定义</li>
        <li onclick="setLiBg('2')" class="tabType2">通用模板</li>
        <li onclick="setLiBg('3')" class="tabType3">科内个人模板</li>
        <li onclick="setLiBg('4')" class="tabType4">检验</li>
        <li onclick="setLiBg('5')" class="tabType5">检查</li>
      </ul>
      <!-- <div class="addNewPanelBtn">
        <a href="#" class="easyui-linkbutton addNewBtn" iconCls="icon-add" onclick="addPanel()">新增</a>
      </div> -->
      <div class="tempType templateDiv">
        <div class="tempWrap"></div>
      </div>
      <div class="leftTab templateDiv">
        <table id="knowledgeList"></table>
      </div>
      <div class="rightContent templateDiv">
        <textarea id="content" class="textDiv" ondblclick="setParentVal()"></textarea>
        <form class="addPanelDiv form addAboveNode">
          <table>
            <tbody>
              <tr>
                <th><i class="red">*</i> 标题：</th>
                <td>
                  <input type="text" name="title" class="textInput addItem otherItem">
                </td>
              </tr>
              <tr>
                <th> 类型：</th>
                <td>
                  <select class="typeSel addItem"></select>
                </td>
              </tr>
              <tr>
                <th><i class="red">*</i> 内容：</th>
                <td>
                  <textarea class="textContent addItem otherItem"></textarea>
                </td>
              </tr>
            </tbody>
          </table>
        </form>
      </div>
      <div class="ownTemplate">
        <div class="m-t5">
          <input type=text placeholder="模板名称和医生名称" class="queryText" id="temp" autocomplete="off" maxlength="30">
          <!-- <span class="spanRelative">
            <input type=text placeholder="模板名称和医生名称" class="queryText" onkeyup="queryTempNameList()" 
            id="temp" autocomplete="off" maxlength="30">
            <input type="text" id="tempNum" class="hidden">
            <div class="userList" id="tempList"></div>
          </span> -->
          <a class="easyui-linkbutton cursor-type" iconCls="icon-search" onclick="getOwnTempList('', $('#temp').val())">查询</a>
        </div>
        <div class="ownTemplateTab">
          <table id="ownTempList"></table>
        </div>
        <div class="ownTemplateMsg">
          <ul>
            <li class="oneLi">
              <span class="smalltitle">模板标题：</span>
              <input class="outLineIpt" type="text" id="templateTitle"/>
            </li>
            <li class="oneLi">
              <span class="smalltitle">主诉：</span>
              <input class="outLineIpt" type="text" id="lqblDes"/>
            </li>
            <li class="oneLi autoLi">
              <span class="smalltitle">现病史：</span>
              <textarea class="outLineIpt" id="nowHis"></textarea>
            </li>
            <li class="oneLi">
              <span class="smalltitle">既往史：</span>
              <input class="outLineIpt" type="text" id="medHis"/>
            </li>
            <li class="oneLi">
              <span class="smalltitle">个人史：</span>
              <input class="outLineIpt" type="text" id="obstHis"/>
            </li>
            <li class="oneLi">
              <span class="smalltitle">家族史：</span>
              <input class="outLineIpt" type="text" id="famlHis"/>
            </li>
            <li class="oneLi autoLi">
              <span class="smalltitle">查体内容：</span>
              <textarea class="outLineIpt long-area" id="ctnrDes"></textarea>
            </li>
            <li class="oneLi autoLi">
              <span class="smalltitle">专项评估建议：</span>
              <textarea class="outLineIpt" id="suggest"></textarea>
            </li>
            <li class="oneLi autoLi">
              <span class="smalltitle">辅助检查：</span>
              <textarea class="outLineIpt" id="fzjcDes"></textarea>
            </li>
            <li class="oneLi autoLi">
              <span class="smalltitle">健康教育：</span>
              <textarea class="outLineIpt" id="healthEducation"></textarea>
            </li>
            <li class="oneLi autoLi">
              <span class="smalltitle">注意事项：</span>
              <textarea class="outLineIpt long-area" id="zysx"></textarea>
            </li>
            <input type="text" class="hidden" id="mbCrtUser" />
            <li class="oneLi">
              <label for="commonTemp" class="m-l10">
                <input id="commonTemp" class="m-l10" type="checkbox" value="1"> 通用模板
              </label>
            </li>
          </ul>
        </div>
      </div>
      <div class="checkWrap">
        <iframe frameborder="0" marginwidth="0" marginheight="0" width="100%" height="100%" id="checkIframe" scrolling="no" src=""></iframe>
      </div>
      <div class="btnDiv knowledgeBoxBtnDiv">
        <span class="autoBtn">
          <a class="easyui-linkbutton" iconCls="icon-ok" id="saveA" onclick="saveCustomMsg()">保存</a>
          <a class="easyui-linkbutton delBtn" iconCls="icon-cancel" id="delA" onclick="delTab()">删除</a>
          <a class="easyui-linkbutton cancelBtn" iconCls="icon-cancel" onclick="cancelPage('', 'currentPage')">取消</a>
          <a class="easyui-linkbutton closeBtn" iconCls="icon-cancel" onclick="parent.closemodalwindow()">关闭</a>
        </span>
        <span class="ownTempBtn">
          <a class="easyui-linkbutton" iconCls="icon-ok" id="saveB" onclick="saveOwnTemp()">保存</a>
          <a class="easyui-linkbutton del-btn" iconCls="icon-cancel" id="delB" onclick="delTemp()">删除</a>
          <a class="easyui-linkbutton cancel-btn" iconCls="icon-cancel" onclick="cancelPage('', 'currentPage')">取消</a>
          <a class="easyui-linkbutton" iconCls="icon-cancel" onclick="parent.closemodalwindow()">关闭</a>
        </span>
        <span class="importBtn">
          <a class="easyui-linkbutton" iconCls="icon-add" onclick="setParentVal()">导入</a>
        </span>
        <span class="onlyCommonCloseBtn">
          <a class="easyui-linkbutton" iconCls="icon-cancel" onclick="parent.closemodalwindow()">关闭</a>
        </span>
        <span class="checkBtn">
          <a class="checkImportBtn easyui-linkbutton" iconCls="icon-ok" onclick="setParentVal('check')">导入</a>
          <a class="easyui-linkbutton" iconCls="icon-cancel" onclick="parent.closemodalwindow()">关闭</a>
        </span>
      </div>
      <div class="btnDiv temptBtnDiv">
        <span class="importTempBtn">
          <a class="easyui-linkbutton" iconCls="icon-add" onclick="importTempMsg()">导入</a>
          <a class="easyui-linkbutton" iconCls="icon-cancel" onclick="parent.closemodalwindow()">关闭</a>
        </span>
      </div>
    </div>
  </div>
  <script>
    // 选中模板 查询数据
    function isQueryMsg (event) {
      var _e = event || window.event;
      if (_e.keyCode == 13) {
        getAjaxList(_selTypeCode, 'onlyQuery');
      }
    }
    
    // 生成模板类型
    function formTypeDom (_list) {
      var _leftName = '', _sel = '<option value="">请选择</option>';
      _list.forEach(function (item, idx) {
        if (item.infocode == _tempSeo) {
          _leftName += '<span class=\"btnSpan active\" id=btnTemp' + item.infocode + ' onclick=\"setBg(' + idx + ', ' + item.infocode + ')\">' + item.info + '</span>';
        } else {
          _leftName += '<span class=\"btnSpan\" id=btnTemp' + item.infocode + ' onclick=\"setBg(' + idx + ', ' + item.infocode + ')\">' + item.info + '</span>';
        }
        _sel += '<option value=' + item.infocode + '>' + item.info + '</option>';
        if (idx == 12) {
          _leftName += '<br/>'
        }
      })
      _leftName += '<input type=text placeholder=标题或内容 class=\"queryText\" id=queryContentText onkeydown=\"isQueryMsg(event)\">';
      _leftName += '<a href=\"#\" class=\"l-btn\" onclick=\"getAjaxList(_selTypeCode,\'onlyQuery\')\"><span class="l-btn-left"><span class="l-btn-text">查询</span></span></a>';
      $('.tempWrap').html(_leftName);
      $('.typeSel').html(_sel)
    }

    var _selTypeCode = _tempSeo; // 选中模板类型cod 全局变量
    
    /**
     * 选中模板 fun
     * @param {[type]} idx [选中的下标]
     * @param {[type]} code [模板选中的值]
     */    
    function setBg (idx, code) {
      if (!$('.btnSpan').eq(idx).hasClass('active')) {
        $('.btnSpan').removeClass('active');
        $('.btnSpan').eq(idx).addClass('active');
        _selTypeCode = code;
        getAjaxList(code);
      } else {
        _selTypeCode = '';
        $('.btnSpan').eq(idx).removeClass('active');
        getAjaxList('', 'onlyQuery');
      }
      $('.typeSel').val(_selTypeCode);
    }
    
    // 检验检查 button 显示
    function toCheckPageBtn () {
      $('.checkBtn').show();
      isHideBtn(['autoBtn', 'importBtn', 'ownTempBtn', 'onlyCommonCloseBtn'], 'none');
    }
    
    // 到自定义模板
    // type => [level || ''] ['离开新增编辑的模板' || '']
    function toCustomPanel (type) {
      $('.templateDiv').show();
      isHideBtn(['checkWrap', 'ownTemplate', 'onlyCommonCloseBtn'], 'none');
      showNormalBtn()
      getAjaxList(_selTypeCode, 'onlyQuery')
      if (!type) {
        cancelPage();
      }
    }

    // tab 类型 li 选中
    function setLiBg (idx) {
      $('.tabCard li').removeClass('active');
      $('.tabCard li').eq(idx).addClass('active');
      if (idx === '1') { // 自定义
        var own_Temp_dis = document.getElementsByClassName('cancel-btn')[0].style.display;
        if (own_Temp_dis != 'inline-block' && own_Temp_dis != 'block') {
          toCustomPanel();
        } else { // 我的模板
          cancelPage();
        }
      } else if (idx === '0' || idx === '2' || idx === '3') { // 我的模板 || 通用模板 || 科内个人模板
        $('#temp').val(''); // 切换类型 清空查询
        document.getElementsByClassName('ownTemplateMsg')[0].scrollTop = 0; // 滚动到顶部
        cancelPage();
      } else {
        cancelPage(idx);
      }
    }

    // 取消当前操作 [存在新增页面---取消操作时]
    function cancelPage (idx, isCurrentPage) {
      var _noAutoIdx = idx || '', currentTabIdx = ''; // 除自定义界面之外索引
      for (var i = 0; i < 5; i++) {
        if ($('.tabType' + i).hasClass('active')) {
          _noAutoIdx = i;
        }
      }
      var own_Temp_dis = document.getElementsByClassName('cancel-btn')[0].style.display,
          custom_dis = document.getElementsByClassName('addAboveNode')[0].style.display,
          fin_dis = '';
      if (own_Temp_dis == 'inline-block' || own_Temp_dis == 'block') {
        currentTabIdx = '0'; // 我的模板 idx
        fin_dis = own_Temp_dis;
      }
      if (custom_dis == 'inline-block' || custom_dis == 'block') {
        currentTabIdx = '1'; // 自定义 idx
        fin_dis = custom_dis;
      }
      if ((fin_dis == 'inline-block' || fin_dis == 'block') && (_noAutoIdx != currentTabIdx || isCurrentPage)) {
        _confirm('是否离开当前新增编辑页面？', function () {
          // 取消 [不离开] == > 当前新增编辑界面
          if (custom_dis == 'inline-block' || custom_dis == 'block') {
            toCustomPage(); // 回到自定义界面
          } else {
            toTempPanel('getAndSet')
            $('.del-btn').hide();
            isHideBtn(['ownTempBtn', 'cancel-btn'], 'inline-block');
          }
        }, function () {
          // 确定 [离开]
          $('.cancel-btn').hide();
          isHideBtn(['ownTempBtn', 'del-btn'], 'inline-block');
          if (idx) { // 检查检验
            toCheckPlatPage(idx);
            $('.addItem').val('');
            isHideBtn(['textDiv', 'checkBtn'], 'inline-block');
            isHideBtn(['addAboveNode', 'ownTempBtn'], 'none');
          } else {
            hidePanel();
            if (_noAutoIdx == '0' || _noAutoIdx == '2' || _noAutoIdx == '3') { // 我的模板 通用模板 科内个人模板
              toTempPanel();
            }
            if (_noAutoIdx == '1') {
              toCustomPanel('leave');
            }
          }
        });
      } else if(_noAutoIdx == '0' || _noAutoIdx == '2' || _noAutoIdx == '3') { // 我的模板 通用模板 科内个人模板
        toTempPanel();
      } else {
        if (idx) {
          toCheckPlatPage(idx);
        }
      }
    }
    
    // 选中检验检验 => 平台
    function toCheckPlatPage (idx) {
      $('.checkWrap').show();
      isHideBtn(['templateDiv', 'ownTemplate'], 'none');
      toCheckPageBtn();
      if (idx === '4') { // 检验
        if (parent.parent.requestSource && parent.parent.requestSource == 'HIS_NO_PATIENT') {
          $('#checkIframe').attr('src', '${baseurl}hisMedical/toexamineinfo_HIS.do?mpi=' + parent.parent.vm.patientMsg.mpi + '&emgSeq=' + parent.parent.vm.patientMsg.emgSeq +'&sourceType=knowledgeBox');
        } else {
          $('#checkIframe').attr('src', '${baseurl}zyyqjs/toexamineinfo.do?emgSeq=${emgSeq}&sourceType=knowledgeBox');
        }
      }
      if (idx === '5') { // 检查
        if (parent.parent.requestSource && parent.parent.requestSource == 'HIS_NO_PATIENT') {
          $('#checkIframe').attr('src', '${baseurl}hisMedical/toexamineinfo_HIS.do?mpi=' + parent.parent.vm.patientMsg.mpi + '&emgSeq=' + parent.parent.vm.patientMsg.emgSeq +'&sourceType=knowledgeBox');
        } else {
          $('#checkIframe').attr('src', '${baseurl}zyyqjs/querycheckinfo.do?emgSeq=${emgSeq}&sourceType=knowledgeBox');
        }
      }
    }
    
    // 回到自定义界面
    function toCustomPage () {
      $('.tabCard li').removeClass('active');
      $('.tabType1').addClass('active');
      isHideBtn(['autoBtn', 'cancelBtn'], 'inline-block');
      isHideBtn(['importBtn', 'delBtn'], 'none');
      getAjaxList(_selTypeCode, 'onlyQuery');
    }
    
    // 新增数据
    function addPanel() {
      toCustomPage()
      $('.typeSel').val(_selTypeCode);
      var _item = document.getElementsByClassName('addItem');
      if (_item[0].value || _item[1].value || _item[2].value) {
        if (_item[1].value == _selTypeCode) {
          if (_item[0].value || _item[2].value) {
            _confirm('是否清空当前新增编辑数据？', null, function () {
             cleanOtherMsg();
            });
          } else {
            cleanOtherMsg();
          }
        } else {
          _confirm('是否清空当前新增编辑数据？', null, function () {
            setPanelShow()
          });
        }
      } else {
        setPanelShow();
      }
    }
    
    function cleanOtherMsg () {
      $('.otherItem').val('');
      $('.textDiv').hide();
      $('.addAboveNode').show();
    }

    function setPanelShow() {
      $('.addItem').val('');
      $('.textDiv').hide();
      $('.addAboveNode').show();
    }

    function hidePanel() {
      $('.addItem').val('');
      $('.textDiv').show();
      $('.addAboveNode').hide();
      showNormalBtn()
    }
    
    function showNormalBtn () {
      $('.checkBtn').hide();
      if ($('.tabType1').hasClass('active')) {
        isHideBtn(['autoBtn', 'delBtn'], 'inline-block');
        $('.cancelBtn').hide();
        if (_idName) {
          $('.importBtn').show();
        }
      } else {
        $('.autoBtn').hide();
      }
      if ($('.tabType0').hasClass('active')) {
        $('.cancel-btn').hide();
        isHideBtn(['ownTempBtn', 'del-btn'], 'inline-block');
      } else {
        $('.ownTempBtn').hide();
      }
    }

    function setParentVal (check) {
      var currentTextAreaVal = $('#content').val();
      if (check) {
        currentTextAreaVal = $('#checkIframe')[0].contentWindow.$('#subfieldText').val()
      }
      if (_idName) {
        var _parentIframe = 'mainIfream';
        if ('${typeFrm}') {
          if ('${typeFrm}' == 'checkFrm') {
            var _parentNodeTextVal = window.parent.$('#myFrame')[0].contentWindow.$('#' + _idName).val();
            window.parent.$('#myFrame')[0].contentWindow.$('#' + _idName).val(_parentNodeTextVal + currentTextAreaVal);
          } else {
            var _subIframe = '${typeFrm}';
            var _parentNodeTextVal = window.parent.$('#' + _parentIframe)[0].contentWindow.$('#' + _subIframe)[0].contentWindow.$('#' + _idName).val();
            window.parent.$('#' + _parentIframe)[0].contentWindow.$('#' + _subIframe)[0].contentWindow.$('#' + _idName).val(_parentNodeTextVal + currentTextAreaVal);
          }
        } else {
          var _parentNodeTextVal = window.parent.$('#' + _parentIframe)[0].contentWindow.$('#' + _idName).val();
          window.parent.$('#' + _parentIframe)[0].contentWindow.$('#' + _idName).val(_parentNodeTextVal + currentTextAreaVal);
        }
        parent.closemodalwindow()
      }
    }

    function getAjaxList(code, type) {
      var _scType = '';
      if (code) {
        _scType = code
      } else {
        if (type != 'onlyQuery') {
          _scType = _tempSeo;
        }
      }
      var _postParam = {
        hspFavoritesInfCustom: {
          sctype: _scType,
          crtusrno: '${sessionScope.activeUser.usrno}',
          ksdm: '',
          titleOrContent: $('#queryContentText').val()
        }
      }
      // if ($('.tabType5').hasClass('active')) {
      //   _postParam.hspFavoritesInfCustom.ksdm = '*';
      //   _postParam.hspFavoritesInfCustom.crtusrno = '';
      // } else {
      //   _postParam.hspFavoritesInfCustom.ksdm = '';
      //   _postParam.hspFavoritesInfCustom.crtusrno = '${sessionScope.activeUser.usrno}';
      // }
      publicFun.httpServer({ url: '${baseurl}favorite/findHspFavoritesInfList.do', requestDataType: 'json' }, _postParam, function (res) {
        if (type != 'onlyQuery' && !code) {
          formTypeDom(res.scTypeList);
        } else {
          if (res.hspFavoritesInfList.length === 0) {
            $('#knowledgeList').datagrid('clearSelections');
          }
        }
        getCustomizeList(res.hspFavoritesInfList, type);
      })
    }
    
    // 获取自定义list
    function getCustomizeList(list, type) {
      var _toolbar = [];
      if ($('.tabType1').hasClass('active')) {
        _toolbar = [{ //工具栏
          id: 'btn-add',
          text: '新增',
          iconCls: 'icon-add',
          handler: function () {
            addPanel()
          }
        }]
      }
      $('#knowledgeList').height(420);
      $('#knowledgeList').datagrid({
        nowrap: false,
        striped: true,
        singleSelect: true,
        idField: 'seqno',
        loadMsg: '',
        columns: [
          [{
            field: 'seqno',
            hidden: true,
          }, {
            field: 'content',
            hidden: true,
          }, {
            field: 'sctypeName',
            width: 80,
            title: '模板类型'
          }, {
            field: 'title',
            width: 100,
            title: '标题'
          }]
        ],
        toolbar: _toolbar,
        data: list,
        rownumbers: false,
        onLoadSuccess: function (data) {
          if (data.rows.length == 0) {
            $("#content").val('');
            document.getElementById("content").readOnly = true;
          } else {
            if (type != 'getAndSet') {
              $('#knowledgeList').datagrid("selectRow", 0);
              $("#content").val(data.rows[0].content);
            }
            if (type == 'addNewMsg') {
              var _lth = data.rows.length - 1;
              $('#knowledgeList').datagrid("selectRow", _lth);
              $("#content").val(data.rows[_lth].content);
            }
            setCss(this);
          }
        },
        onClickRow: function (rowIndex, rowData) {
          var _dis = document.getElementsByClassName('addAboveNode')[0].style.display;
          if (_dis == 'inline-block' || _dis == 'block') {
            _confirm('是否离开当前新增编辑页面？', null, function () {
              $("#content").val(rowData.content);
              setCss(this);
              hidePanel();
            });
          } else {
            $("#content").val(rowData.content);
            setCss(this);
          }
        },
        onDblClickRow: function (rowIndex, rowData) {
          setParentVal();
        }
      });
    }

    function setCss(opt) {
      var sr = document.getElementById("content");
      var len = sr.value.length;
      setSelectionRange(sr, len, len); //将光标定位到文本最后 
    }

    function setSelectionRange(input, selectionStart, selectionEnd) {
      if (input.setSelectionRange) {
        input.focus();
        input.setSelectionRange(selectionStart, selectionEnd);
      } else if (input.createTextRange) {
        var range = input.createTextRange();
        range.collapse(true);
        range.moveEnd('character', selectionEnd);
        range.moveStart('character', selectionStart);
        range.select();
      }
    }

	  $(document).keydown(function(event) {
			switch (event.keyCode) {
			case 13:
				getOwnTempList('', $('#temp').val());
			}
		});

    // 模板 模糊查询 ajax keyup 
    function queryTempList () {
      var interval;
      var time = 600, x = 2;   //设置时间2s
      interval = setInterval(fun, time);
      function fun () {
        --x;
        if (x == 0) {
          clearInterval(interval);
          queryTempNameList()
        }
      }
    }

    // 按钮查询 模板
    function queryTempNameList () {
      var _tabType = '';
      if ($('.tabType0').hasClass('active')) {
        _tabType = '0' // 个人模板
      }
      if ($('.tabType2').hasClass('active')) {
        _tabType = '1' // 通用模板
      }
      if ($('.tabType3').hasClass('active')) {
        _tabType = '2' // 科内个人模板
      }
      if (!$('#temp').val()) {
        $('#tempList').hide();
        $('#tempList').html('');
      }
      publicFun.httpServer({url: '${baseurl}favorite/findDictList.do', isNoLoad: true}, {
        'hspDzblDictCustom.tyType': _tabType, 
        'hspDzblDictCustom.mbTitle': $('#temp').val()
      }, function (res) {
        var data = res.rows, strDom = '';
        if (res && res.rows && data.length > 0) {
          data.forEach(function (item) {
            strDom += "<li onclick=\"chooseCurrentName('" + item.mbTitle + "')\">" + item.mbTitle + "</li>";
          })
          strDom = "<ul>" + strDom + "</ul>";
          $('#tempList').show();
          $('#tempList').html(strDom);
        } else {
          $('#tempList').hide();
          $('#tempList').html('');
        }
      })
    }

    // 查询 
    function chooseCurrentName (mbTitle) {
      $('#temp').val(mbTitle);
    }

    $("body").click(function () {
      $(".userList").hide();
    });
  
    // 获取 我的模板 通用模板 list
    function getOwnTempList (type, mbTitle) {
      if (mbTitle) {
        $('.cancel-btn').hide();
        isHideBtn(['ownTempBtn', 'del-btn'], 'inline-block');
      }
      var _toolbar = [{ //工具栏
        id: 'btn-add',
        text: '新增',
        iconCls: 'icon-add',
        handler: function () {
          addTempPanel()
        }
      }]
      var _tabType = '';
      if ($('.tabType0').hasClass('active')) {
        _tabType = '0' // 个人模板
      } else if ($('.tabType2').hasClass('active')) {
        _tabType = '1' // 通用模板
      } else if ($('.tabType3').hasClass('active')) {
        _tabType = '2' // 科内个人模板
      } else {
        _tabType = ''  // 其他情况
      }
      if ('${isImportTemp}' || (_tabType == '1' || _tabType == '2')) { // 导入 通用模板 科内个人模板
        _toolbar = [];
      }
      $('#ownTempList').height(457);
      $('#ownTempList').datagrid({
        nowrap: false,
        striped: true,
        singleSelect: true,
        url: '${baseurl}favorite/findDictList.do',
        idField: 'mbSeq',
        queryParams: {
          'hspDzblDictCustom.tyType': _tabType,  // (0 为个人模板，1 为通用模板, 2 科内个人模板)
          'hspDzblDictCustom.mbTitle': mbTitle
        },
        loadMsg: '',
        columns: [
          [{
            field: 'mbTitle',
            width: 185,
            title: '标题'
          }, {
            field: 'mbContent',
            hidden: true
          }]
        ],
        toolbar: _toolbar,
        rownumbers: false,
        onLoadSuccess: function (data) {
          var _dis = document.getElementsByClassName('cancel-btn')[0].style.display;
          var currentUser = '';
          if (data.rows.length == 0) {
            $('#ownTempList').datagrid('clearSelections');
            if (_dis != 'inline-block' &&  _dis != 'block') { // 当且仅当没有数据的时候 判断下 是否在新增界面
              cleanOwnTempMsg();
            }
          } else {
            if (type != 'getAndSet') {
              $('#ownTempList').datagrid("selectRow", 0);
              dealMsg(data.rows[0]);
              currentUser = data.rows[0].mbCrtUser;
            } else if (type == 'addNewMsg') {
              var _lth = data.rows.length - 1;
              $('#ownTempList').datagrid("selectRow", _lth);
              dealMsg(data.rows[_lth]);
              currentUser = data.rows[_lth].mbCrtUser;
            } else {
              currentUser = $('#mbCrtUser').val();
            }
          }
          if (_tabType == '1' || '${isImportTemp}' ) { // 通用模板 [导入状态时]
            $('.ownTemplateMsg input, .ownTemplateMsg textarea').attr('readonly', true);
            $('.ownTemplateMsg input, .ownTemplateMsg textarea').attr('disabled', true);
          } else {
            // 科内个人模板 且 不是创建人 则不能删除修改 
            if (_tabType == '2' && ('${sessionScope.activeUser.usrno}' != currentUser)) {
              $('.ownTemplateMsg input, .ownTemplateMsg textarea').attr('readonly', true);
              $('.ownTemplateMsg input, .ownTemplateMsg textarea').attr('disabled', true);
              isHideBtn(['onlyCommonCloseBtn'], 'inline-block');
              isHideBtn(['ownTempBtn'], 'none');
            } else if (_tabType !== '') {
              $('.ownTemplateMsg input, .ownTemplateMsg textarea').attr('readonly', false);
              $('.ownTemplateMsg input, .ownTemplateMsg textarea').attr('disabled', false);
              isHideBtn(['ownTempBtn'], 'inline-block');
              isHideBtn(['onlyCommonCloseBtn'], 'none');
            }
          }
        },
        onClickRow: function (rowIndex, rowData) {
          var _dis = document.getElementsByClassName('cancel-btn')[0].style.display;
          document.getElementsByClassName('ownTemplateMsg')[0].scrollTop = 0; // 滚动到顶部
          if (_dis == 'inline-block' || _dis == 'block') {
            _confirm('是否离开当前新增编辑页面？', null, function () {
              dealMsg(rowData);
              $('.cancel-btn').hide();
              isHideBtn(['ownTempBtn', 'del-btn'], 'inline-block');
            });
          } else {
            dealMsg(rowData);
          }
        },
        onDblClickRow: function (rowIndex, rowData) {
          if ('${isImportTemp}') {
            importTempMsg();
          }
        }
      });
    }

    // 处理我的模板数据
    function dealMsg (checkRow) {
      $('#templateTitle').val(checkRow.mbTitle);
      $('#mbCrtUser').val(checkRow.mbCrtUser);
      var obj = JSON.parse(checkRow.mbContent);
      for (var key in obj) {
        if (obj[key] != null && obj[key] !== '') {
          $('#' + key).val(obj[key])
          $('#' + key).html(obj[key])
        } else {
          $('#' + key).val('')
          $('#' + key).html('')
        }
      }
      if (checkRow.tyType == '2') {
        $('#commonTemp').attr('checked', true)
      } else {
        $('#commonTemp').attr('checked', false)
      }
      if (checkRow.tyType == '1' || '${isImportTemp}' ) { // 通用模板 [导入状态时]
        $('.ownTemplateMsg input, .ownTemplateMsg textarea').attr('readonly', true);
        $('.ownTemplateMsg input, .ownTemplateMsg textarea').attr('disabled', true);
      } else {
        // 科内个人模板 且 不是创建人 则不能删除修改 
        if (checkRow.tyType == '2' && ('${sessionScope.activeUser.usrno}' != checkRow.mbCrtUser)) {
          $('.ownTemplateMsg input, .ownTemplateMsg textarea').attr('readonly', true);
          $('.ownTemplateMsg input, .ownTemplateMsg textarea').attr('disabled', true);
          isHideBtn(['onlyCommonCloseBtn'], 'inline-block');
          isHideBtn(['ownTempBtn'], 'none');
        } else if (checkRow.tyType != null && checkRow.tyType !== '') {
          $('.ownTemplateMsg input, .ownTemplateMsg textarea').attr('readonly', false);
          $('.ownTemplateMsg input, .ownTemplateMsg textarea').attr('disabled', false);
          isHideBtn(['ownTempBtn'], 'inline-block');
          isHideBtn(['onlyCommonCloseBtn'], 'none');
        }
      }
    }

    // 判断 模板内容 是否为空 
    function judgeIsHasContent (type) {
      var _formList = ['templateTitle', 'lqblDes', 'nowHis', 'medHis', 'obstHis', 'famlHis', 'ctnrDes', 'suggest', 'fzjcDes', 'healthEducation', 'zysx'],
          isHasHtmlFlg = false;
      if (type == 'content') {
        _formList = ['lqblDes', 'nowHis', 'medHis', 'obstHis', 'famlHis', 'ctnrDes', 'suggest', 'fzjcDes', 'healthEducation', 'zysx']
      }
      for (var i = 0; i < _formList.length; i++) {
        if ($('#' + _formList[i]).val()) {
          isHasHtmlFlg = true;
        }
      }
      return isHasHtmlFlg;
    }

    // 新增我的模板 保存
    function addTempPanel () {
      var isHasHtmlFlg = judgeIsHasContent();
      var own_Temp_dis = document.getElementsByClassName('cancel-btn')[0].style.display;
      if (own_Temp_dis != 'none' && isHasHtmlFlg) { // 若在新增编辑页面 判断有没有填写数据
        _confirm('是否清空当前新增编辑数据？', null, function () {
          cleanOwnTempMsg();
        });
      } else {
        cleanOwnTempMsg();
      }
      document.getElementsByClassName('ownTemplateMsg')[0].scrollTop = 0; // 滚动到顶部
      $('.del-btn').hide();
      isHideBtn(['ownTempBtn', 'cancel-btn'], 'inline-block');
    }

    // 清除 我的模板 输入框中的数据
    function cleanOwnTempMsg () {
      var _formList = ['templateTitle', 'lqblDes', 'nowHis', 'medHis', 'obstHis', 'famlHis', 'ctnrDes', 'suggest', 'fzjcDes', 'healthEducation', 'zysx', 'mbCrtUser'];
      _formList.forEach(function (item) {
        $('#' + item).val('')
        $('#' + item).html('')
      })
      $('#commonTemp').attr('checked', false)
    }

    // 保存 => 我的模板
    function saveOwnTemp () {
      var isCkCommonFlg = $('#commonTemp').attr('checked') ? '2' : '0';
      var postMsg = {
        lqblDes: $('#lqblDes').val(),
        nowHis: $('#nowHis').val(),
        medHis: $('#medHis').val(),
        obstHis: $('#obstHis').val(),
        famlHis: $('#famlHis').val(),
        ctnrDes: $('#ctnrDes').val(),
        suggest: $('#suggest').val(),
        fzjcDes: $('#fzjcDes').val(),
        healthEducation: $('#healthEducation').val(),
        zysx: $('#zysx').val()
      };
      var own_Temp_dis = document.getElementsByClassName('cancel-btn')[0].style.display;
      if (own_Temp_dis == 'inline-block' || own_Temp_dis == 'block') { // 新增界面
        if (publicFun.strTrim($('#templateTitle').val()) === '') {
          publicFun.alert('模板标题必填');
          return false;
        }
        var isHasHtmlFlg = judgeIsHasContent('content');
        if (!isHasHtmlFlg) {
          publicFun.alert('模板内容不能为空');
          return false;
        }
        publicFun.httpServer({ url: '${baseurl}favorite/editDictListSubmit.do', requestDataType: 'json'}, {
          'hspDzblDictCustom': {
            'tyType': isCkCommonFlg,
            'mbTitle': $('#templateTitle').val(),
            'mbContent': JSON.stringify(postMsg)
          }
        }, function (data) {
          if (data.resultInfo.messageCode == 906) {
            alert_autoClose_mine('操作成功','addNewMsg')
          } else {
            alert_autoClose_mine(data.resultInfo.message)
          }
        })
      } else { // 修改界面
        var checkedRows = $('#ownTempList').datagrid('getSelected');
        if (checkedRows == null) {
          publicFun.alert("请选择一条数据");
          return false;
        } else {
          if (publicFun.strTrim($('#templateTitle').val()) === '') {
            publicFun.alert('模板标题必填');
            return false;
          }
          var isHasHtmlFlg = judgeIsHasContent('content');
          if (!isHasHtmlFlg) {
            publicFun.alert('模板内容不能为空');
            return false;
          }
          publicFun.httpServer({ url: '${baseurl}favorite/editDictListSubmit.do', requestDataType: 'json' }, {
            'hspDzblDictCustom': {
              'mbSeq': checkedRows.mbSeq,
              'tyType': isCkCommonFlg,
              'mbTitle': $('#templateTitle').val(),
              'mbContent': JSON.stringify(postMsg)
            }
          }, function (data) {
            if (data.resultInfo.messageCode == 906) {
              alert_autoClose_mine('操作成功', 'getAndSet')
            } else {
              alert_autoClose_mine(data.resultInfo.message)
            }
          })
        }
      }
    }

    // 删除 => 我的模板
    function delTemp () {
      var checkedRows = $('#ownTempList').datagrid('getSelected');
      if (checkedRows == null) {
        publicFun.alert("请选择一条数据");
        return false;
      } else {
        _confirm('确定删除该数据吗？', null, function () {
          publicFun.httpServer({ url: '${baseurl}favorite/delDictListsubmit.do' }, { 'hspDzblDictCustom.mbSeq': checkedRows.mbSeq }, function (data) {
            if (data.resultInfo.messageCode == 906) {
              alert_autoClose_mine('操作成功', 'getList')
            } else {
              alert_autoClose_mine(data.resultInfo.message)
            }
          })
        });
      }
    }

    // 我的模板 关闭窗口 延迟 关闭
    function alert_autoClose_mine (msg, type) {
      var interval;
      var time = 600, x = 2;   //设置时间2s
      if (msg == '操作成功') {
        alert_success(msg);
      } else {
        publicFun.alert(msg)
      }
      interval = setInterval(fun, time);
      function fun() {
        --x;
        if (x == 0) {
          clearInterval(interval);
          $(".messager-body").window('close');
          if (type == 'addNewMsg') {
            getOwnTempList(type);
            toTempPanel(type);
          } else if (type == 'getList') {
            getOwnTempList();
          } else if (type == 'getAndSet') {
            getOwnTempList('getAndSet');
          }
        }
      };
    }

    //删除
    function delTab () {
      var checkedRows = $('#knowledgeList').datagrid('getSelected');
      if (checkedRows == null) {
        publicFun.alert("请选择一条数据");
        return false;
      } else {
        _confirm('确定删除该数据吗？', null, function () {
          publicFun.httpServer({ url: '${baseurl}favorite/delFavoritessubmit.do' }, { 'hspFavoritesInfCustom.seqno': checkedRows.seqno }, function (data) {
            if (data.resultInfo.messageCode == 906) {
              alert_autoClose('操作成功', 'getList', checkedRows.sctype)
            } else {
              alert_autoClose(data.resultInfo.message)
            }
          })
        });
      }
    }
    // 修改知识库提交
    function saveCustomMsg () {
      var _dis = document.getElementsByClassName('addAboveNode')[0].style.display;
      if (_dis == 'inline-block' || _dis == 'block') {
        postAddPanel()
      } else {
        var checkedRows = $('#knowledgeList').datagrid('getSelected');
        if (checkedRows == null) {
          publicFun.alert("请选择一条数据");
          return false;
        } else {
          var _content = $('#content').val();
          if (_content == '' || _content == null) {
            publicFun.alert("内容不能为空");
            return false;
          }
          publicFun.httpServer({ url: '${baseurl}favorite/editFavoritesSubmit.do' }, {
            'hspFavoritesInfCustom.sctype': checkedRows.sctype,
            'hspFavoritesInfCustom.content': _content,
            'hspFavoritesInfCustom.title': checkedRows.title,
            'hspFavoritesInfCustom.seqno': checkedRows.seqno
          }, function (data) {
            if (data.resultInfo.messageCode == 906) {
              alert_autoClose('操作成功', 'getAndSet', checkedRows.sctype)
            } else {
              alert_autoClose(data.resultInfo.message)
            }
          })
        }
      }
    }

    // 添加
    function postAddPanel () {
      if (publicFun.strTrim($('.textInput').val()) === '' || $('.textInput').val() == null) {
        publicFun.alert('标题必填');
        return false;
      }
      if (publicFun.strTrim($('.textContent').val()) === '' || $('.textContent').val() == null) {
        publicFun.alert('内容必填');
        return false;
      }
      $('.textDiv').show();
      $('.addAboveNode').hide();
      publicFun.httpServer({ url: '${baseurl}favorite/editFavoritesSubmit.do' }, {
        'hspFavoritesInfCustom.sctype': $('.typeSel').val(),
        'hspFavoritesInfCustom.content': $('.textContent').val(),
        'hspFavoritesInfCustom.title': $('.textInput').val(),
        'hspFavoritesInfCustom.seqno': ''
      }, function (data) {
        if (data.resultInfo.messageCode == 906) {
          alert_autoClose('操作成功','addNewMsg', $('.typeSel').val())
        } else {
          alert_autoClose(data.resultInfo.message)
        }
      })
    }

    function alert_autoClose(msg, type, seq) {
      var interval;
      var time = 600, x = 2;   //设置时间2s
      if (msg == '操作成功') {
        alert_success(msg);
      } else {
        publicFun.alert(msg)
      }
      interval = setInterval(fun, time);
      function fun() {
        --x;
        if (x == 0) {
          clearInterval(interval);
          $(".messager-body").window('close');
          if (type == 'addNewMsg') {
            getAjaxList(seq, 'addNewMsg');
            $('.btnSpan').removeClass('active');
            $('#btnTemp' + seq).addClass('active');
            _selTypeCode = seq;
            hidePanel();
          } else if (type == 'getList') {
            getAjaxList(seq);
          } else if (type === 'getAndSet') {
            getAjaxList(_selTypeCode, 'getAndSet');
          }
        }
      };
    }

    // 导入父页面我的模板等数据 
    function importTempMsg () {
      _confirm('导入后会覆盖已填写数据，确定导入吗?', null, function () {
        var _fillKeyList = ['lqblDes', 'nowHis', 'medHis', 'obstHis', 'famlHis', 'ctnrDes', 'fzjcDes'],
            _vm = parent.recordvm;
        if ('${isImportTemp}' == 'importTempMz') { // 门诊
          _fillKeyList.push('healthEducation', 'zysx');
          // _vm.baseMsg.nowHis = $('#nowHis').val();
          if ($('#suggest').val()) {
            _vm.recordMsg.specialSuggest = $('#suggest').val();
            _vm.recordMsg.specialAssess = ['1'];
            _vm.hideStr.specialAssess = '1';
          } else {
            if (_vm.hideStr.specialAssess == '1') {
              _vm.recordMsg.specialSuggest = ''
            }
          }
          for (var i = 0; i < _fillKeyList.length; i++) {
            // if (_fillKeyList[i] !== 'nowHis') {
              if (_vm.recordMsg.hasOwnProperty(_fillKeyList[i])) {
                _vm.recordMsg[_fillKeyList[i]] = $('#' + _fillKeyList[i]).val();
              }
            // }
          }
        } else { // 留抢
          for (var i = 0; i < _fillKeyList.length; i++) {
            if (_vm.recordMsg.hasOwnProperty(_fillKeyList[i])) {
              _vm.recordMsg[_fillKeyList[i]] = $('#' + _fillKeyList[i]).val();
            }
          }
        }
        parent.closemodalwindow()
      });
    }
    
    function firstToBox () {
      if ('${isCheckSource}' && _idName) { // 如果是从导入只有检验检查的口子进页面则选中检验面板
        setLiBg('4')
      } else if (_idName) { // 急门诊 留抢字段 双击导入   
        setLiBg('1')
        isHideBtn(['closeBtn'], 'none');
      } else { // 如果不是双击从知识库单击进去隐藏导入按钮;
        isHideBtn(['importBtn', 'checkImportBtn'], 'none');
        setLiBg('0')
      }
    }

    function isHideBtn (list, dis) {
      list.forEach(function (item, idx) {
        if(userQx == 'tourist' && (item == 'delBtn' || item == 'del-btn')){
          dis = 'none'
        }
        $('.' + item).css({'display': dis})
      })
    }

    // 只显示 我的模板 通用模板等 内容 
    function toTempPanel (type) {
      if (type === 'getAndSet') {
        $('.tabCard li').removeClass('active');
        $('.tabType0').addClass('active');
      }
      isHideBtn(['templateDiv', 'checkWrap', 'autoBtn', 'importBtn', 'checkBtn', 'cancel-btn'], 'none');
      isHideBtn(['ownTemplate', 'del-btn'], 'inline-block');
      if ($('.tabType0').hasClass('active')) { // 我的模板
        isHideBtn(['onlyCommonCloseBtn'], 'none');
        isHideBtn(['ownTempBtn'], 'inline-block');
      } else { // 通用模板
        isHideBtn(['onlyCommonCloseBtn'], 'inline-block');
        isHideBtn(['ownTempBtn'], 'none');
      }
      getOwnTempList(type);
    }

    // 判断是否从病历里进来， 只显示 我的模板
    function judgeIsOnlyImportTempMsg () {
      if ('${isImportTemp}') { // 导入我的模板进来
        for (var i = 1; i < 6; i++) {
          if (i != '2' && i != '3') {
            $('.tabType' + i).hide();
          }
        }
        toTempPanel();
        // 如果不是双击从知识库单击进去隐藏导入按钮
        $('.btnDiv').hide();
        $('.temptBtnDiv').show();
        $('.ownTemplateMsg input, .ownTemplateMsg textarea').attr('readonly', true);
        $('.ownTemplateMsg input, .ownTemplateMsg textarea').attr('disabled', true);
      } else {
        $('.importTempBtn').hide();
        getAjaxList();
        firstToBox();
        $('.btnDiv').hide();
        $('.knowledgeBoxBtnDiv').show();
      }
      checkRole();
    }

    function checkRole() {
      publicFun.httpServer({url: '${baseurl}zyylqbl/checkRoleAjax.do?', isNoLoad: true}, {
        "cratNbr": ''
      }, function (data) {
        if (data.resultInfo.message == "nurse"||data.resultInfo.message == "tourist") {
          $('#saveA').hide();
          $('#saveB').hide();
          $('#delA').hide();
          $('#delB').hide();
          userQx = 'tourist';
        }
      })
    }

    $(function () {
      judgeIsOnlyImportTempMsg();
      // 所有的文本框都设置不填充
      $('input:not([autocomplete]),textarea:not([autocomplete]),select:not([autocomplete])').attr('autocomplete', 'off');
    })
  </script>
</body>

</html>