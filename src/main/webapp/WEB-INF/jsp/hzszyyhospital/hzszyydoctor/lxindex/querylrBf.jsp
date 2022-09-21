<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/base/tag.jsp"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>

<head>
  <meta charset="UTF-8">
  <meta http-equiv="cache-control" content="no-cache">
  <title>初步诊断新版备份</title>
  <%@ include file="/WEB-INF/jsp/base/common_css.jsp"%>
  <link rel="stylesheet" type="text/css" href="${baseurl}css/hems/cbyx.css">
  <%@ include file="/WEB-INF/jsp/base/common_js.jsp"%>
  <script src="${baseurl}lib/avalon1.4.8/avalon.js" type="text/javascript" charset="UTF-8"></script>
  <style>
    input[type='text'].noBdrText {
      border: 0;
      background-color: transparent;
    }
    input[type='text'].noBdrText:hover {
      box-shadow: none;
    }
    .cbyxSearchList {
      cursor: default;
      max-height: 100px;
    }
    .cbyxSearchList td, .cbyxSearchList th {
      border: none;
      height: inherit;
    }
    .showContentSpan {
      width: 180px;
      display: inline-block;
    }
    .cbyxParams {
      width: 180px;
    }
    .dateWth {
      width: 90px;
    }
    </style>
  <script>
    var rth = '${trnumber}';
  </script>
</head>

<body class="querylr" ms-controller="cbyx">
  <p class="bz">输入“疾病代码”,按回车或“搜索”按钮查询，可对疾病进行前后文字编辑，点击“确定”后合成最终诊断信息。</p>
  <div>
    <table class="table table-bordered table-striped" id="editTab">
      <colgroup>
        <col width="6%">
        <col width="8%">
        <col width="18%">
        <col>
        <col width="18%">
        <col width="8%">
        <col width="6%">
      </colgroup>
      <thead>
        <tr class="tr_bg">
          <td>序号</td>
          <td>诊断类型</td>
          <td>诊断前缀</td>
          <td>疾病名称</td>
          <td>诊断后缀</td>
          <td>诊断日期</td>
          <td>操作</td>
        </tr>
      </thead>
      <tbody class="mainTabBody" id="editMainTab">
        <tr ms-repeat="cbyxList" ms-click="changeTrBg(this)">
          <td class="_indexTd">{{$index+1}}</td>
          <td>
            <select ms-duplex-string="el.lmt_type">
              <option value="1">术前诊断主诊断</option>
              <option value="2">术前诊断次诊断</option>
            </select>
          </td>
          <td>
            <input type="text" class="hidden" ms-attr-id="'flag' + $index" ms-duplex-string="el.lmt_flg">
            <input type="text" class="noBdrText" ms-attr-id="'prefixVal' + $index" ms-duplex-string="el.lmt_pre"
              onclick="changeChild(event, this)" />
          </td>
          <td class="leftgroup" style="width: 200px;">
            <span ms-attr-id="'jbbc' + $index" ms-dblclick="changeDiag($index)" class="showContentSpan">{{el.jbbc}}</span>
            <span ms-attr-id="'pysm' + $index" class="hidden">{{el.pysm}}</span>
            <span class="relative tabListWrap" ms-visible="!el.jbbc" ms-attr-id="'listWrap' + $index">
              <input class="cbyxParams noBdrText" ms-attr-id="'content' + $index" type="text" ms-duplex-string="el.lmt_search"
                ms-keyup="searchMove(event, $index)" autocomplete="off" ms-blur="isCheckVal(event, $index)">
              <div ms-attr-id="'allBuddy' + $index" class="cbyxSearchList" ms-mousemove="mouseMove(event, $index)">
                <table cellspacing="0" cellpadding="0" border="0" width="100%" ms-attr-id="'buddyListTable' + $index">
                  <tbody>
                    <tr ms-repeat="cbyxSearchList" class="repeatTr" ms-click="chooseCbyx($index, $outer.$index)">
                      <td>{{el.jbbc}}</td>
                    </tr>
                  </tbody>
                </table>
              </div>
            </span>
          </td>
          <td><input type="text" class="noBdrText" ms-attr-id="'suffixVal' + $index" ms-duplex-string="el.lmt_suf" /></td>
          <td>
            <input class="Wdate dateWth" type="text" onclick="WdatePicker({dateFmt:'yyyy/MM/dd'})" ms-duplex-string="el.lmt_date"
              onfocus="changeChild(event, this)">
          </td>
          <td><a href="javascript:;" ms-click="deleteCbyx($index)">删除</a></td>
        </tr>
        <tr ms-if="cbyxRemark !== ''">
          <td>手工录入</td>
          <td colspan="6">
            <textarea class="div-textarea" maxlength="150" ms-duplex-string="cbyxRemark" ms-attr-disabled="cbyxRemark !== ''"></textarea>
          </td>
        </tr>
      </tbody>
    </table>
    <div class="btn_Group">
      <a class="easyui-linkbutton" href="javascript:;" iconCls="icon-ok" onclick="addTr()">添加</a>
      <a class="easyui-linkbutton" href="javascript:;" iconCls="icon-ok" ms-click="insertCbyx()">确定</a>
      <a class="easyui-linkbutton" href="javascript:;" iconCls="icon-cancel" onclick="parent.closemodalwindow()">关闭</a>
    </div>
  </div>
</body>
<script type="text/javascript">
  $("body").click(function () {
    $(".cbyxSearchList").hide();
  });
  var canSearchFlag = true;
  var currentLine = -1, offsetTr = 0;
  var vm = avalon.define({
    $id: "cbyx",
    searchParams: {
      pysm: ""
    },
    cbyxSearchList: [],
    cbyxList: [],
    cbyxRemark: parent.$('#jbzdComm' + rth).val(),
    getCbyxList: function (_idx, isChange) {
      vm.searchParams.pysm = $('#content' + _idx).val();
      if (vm.searchParams.pysm == '') {
        vm.cbyxSearchList = [];
        $('.tabListWrap .cbyxSearchList').hide();
        return false
      }
      $.ajax({
        url: "${baseurl}qjs/queryJbzdInfbyPysm.do",
        type: "post",
        data: {
          "hspHzjbzdCustom.pysm": vm.searchParams.pysm.toUpperCase(),
          "_t": new Date()
        }
      }).done(function (res) {
        if (res.resultInfo && res.resultInfo.messageCode == '109') {
          message_alert(res, function () {
            window.location.href = "${baseurl}/first.do";
          });
          return false;
        }
        if (!res.length) {
          // publicFun.alert("未检索到相关数据!");
          // $(".cbyxSearchList").hide();
          //重置搜索条件
          // $('#content' + _idx).val('')
          $(".cbyxSearchList").show();
          vm.cbyxSearchList = [{ id: '', jbbc: '', pysm: '', lmtSex: null, lmtLx: null }];
          return
        } else {
          vm.cbyxSearchList = res;
          $('.tabListWrap .cbyxSearchList').hide();
          $('#listWrap' + _idx).find('.cbyxSearchList').show();
          return
        }
      });
    },
    chooseCbyx: function (idx, outerIndex) {
      var _currentCbyx = vm.cbyxSearchList[idx];
      _currentCbyx.lmt_flg = '2';
      if (_currentCbyx.jbbc == '') {
        return false;
      }
      var _index = -1;
      for (var i = 0; i < vm.cbyxList.length; i++) {
        if (vm.cbyxList[i].jbbc == _currentCbyx.jbbc) {
          _index = i
        }
      }
      if (_index === -1) {
        $('#jbbc' + outerIndex).text(_currentCbyx.jbbc);
        vm.cbyxList[outerIndex].jbbc = _currentCbyx.jbbc;
        vm.cbyxList[outerIndex].id = _currentCbyx.id;
        vm.cbyxList[outerIndex].pysm = _currentCbyx.pysm;
        vm.cbyxList[outerIndex].or_id = _currentCbyx.id;
        vm.cbyxList[outerIndex].or_jbbc = _currentCbyx.jbbc;
        $('#pysm' + outerIndex).text(_currentCbyx.pysm);
        vm.cbyxList[outerIndex].lmt_flg = _currentCbyx.lmt_flg;
      } else {
        publicFun.alert("该条数据已经存在！")
      }
      //重置搜索条件
      vm.searchParams.pysm = "";
      //重置待选列表
      vm.cbyxSearchList = [];
      $(".cbyxSearchList").hide();
    },
    deleteCbyx: function (idx) {
      vm.cbyxList.splice(idx, 1);
    },
    insertCbyx: function () {
      var obj = {
        jbzdSeq: '',
        jbzdDes: '',
        jbzdComm: '',
        diagnosePre: '',
        jbzdBetFixStr: '',
        diagnoseSuf: '',
        sourceFlg: '',
        dateIpt: '',
        typeIpt: '',
        pysmIpt: ''
      };
      var objList = {
        jbzdSeqList: [],
        jbzdBetFixStrList: [],
        diagnosePreList: [],
        diagnosePreList: [],
        diagnoseSufList: [],
        sourceFlgList: [],
        dateIptList: [],
        typeIptList: [],
        pysmIptList: []
      };
      var _fieldList = [{ cod: 'lmt_pre', name: 'diagnosePre', sym: '$' }, { cod: 'id', name: 'jbzdSeq', sym: ',' }, { cod: 'lmt_suf', name: 'diagnoseSuf', sym: '$' },
      { cod: 'lmt_flg', name: 'sourceFlg', sym: ';' }, { cod: 'jbbc', name: 'jbzdBetFixStr', sym: ';' }, { cod: 'lmt_date', name: 'dateIpt', sym: ';' },
      { cod: 'lmt_type', name: 'typeIpt', sym: ';' }, { cod: 'pysm', name: 'pysmIpt', sym: ';' }];
      var isNullFlag = false;
      $.each(vm.cbyxList.$model, function (idx, val) {
        if (!val.jbbc) {
          isNullFlag = true
          return false;
        }
        $.each(_fieldList, function (_idx, _val) {
          if (val[_val.cod] == undefined) {
            val[_val.cod] = ''
          }
          objList[_val.name + 'List'].push(val[_val.cod]);
        })
      });
      if (isNullFlag == true) {
        publicFun.alert('请选择疾病名称');
        return false;
      }
      var list = "";
      if (objList.jbzdSeqList.length === 0) {
        if (objList.diagnosePreList[0] || objList.diagnoseSufList[0]) {
          publicFun.alert('请选择疾病名称');
          return
        }
      }
      var _list_lth = vm.cbyxList.$model.length - 1;
      if (objList.diagnosePreList[_list_lth] || objList.diagnoseSufList[_list_lth]) {
        if (!objList.jbzdBetFixStrList[_list_lth]) {
          publicFun.alert('请选择疾病名称');
          return
        }
      }
      if (objList.jbzdSeqList.length === 1 && objList.jbzdSeqList[0] === '&nbsp;') {
        objList.jbzdSeqList.splice(0, 1)
      }
      var _nameFieldList = [{ val: 'jbzdSeqList', cod: '' }, { val: 'ryzdZyList', cod: '1' }, { val: 'ryzdXyList', cod: '2' }, { val: 'cyzdZyList', cod: '3' }, { val: 'cyzdXyList', cod: '4' }, { val: 'deathZdList', cod: '5' }]
      $.each(_nameFieldList, function (idx, value) {
        if (rth == value.cod) {
          for (var i = 0; i < objList.jbzdSeqList.length; i++) {
            if (objList.jbzdSeqList[i].length === 32) {
              list += "<input type='checkbox' name='" + value.val + "' value='' checked>";
            } else {
              list += "<input type='checkbox' name='" + value.val + "' value='" + objList.jbzdSeqList[i] + "' checked>";
            }
          }
        }
      })
      $.each(_fieldList, function (idx, val) {
        obj[val.name] = objList[val.name + 'List'].join(val.sym)
      })
      obj.jbzdComm = vm.cbyxRemark.trim();
      var show_text_des = '', single_des = '';
      var _typeValList = ['A类型', 'B类型', 'C类型'];
      $.each(objList.jbzdBetFixStrList, function (idx, val) {
        var _typeVal = '';
        if (_typeValList[objList.typeIptList[idx] - 1]) {
          _typeVal = _typeValList[objList.typeIptList[idx] - 1]
        }
        show_text_des += _typeVal + objList.diagnosePreList[idx] + val + objList.diagnoseSufList[idx] + ';'
      })
      show_text_des = show_text_des.substring(0, show_text_des.length - 1)
      var show_text = '';
      if (obj.jbzdComm === '') {
        show_text = show_text_des;
      } else if (obj.jbzdComm !== '') {
        show_text = show_text_des + ';' + obj.jbzdComm;
      }
      if (show_text_des === '') {
        show_text = obj.jbzdComm;
      }
      for (var key in obj) {
        if (key === 'jbzdDes') {
          parent.$('#jbzdDes' + rth).attr({ "value": show_text });
        } else {
          parent.$("#" + key + rth).attr({ "value": obj[key] });
        }
      }
      parent.$("#bz_id" + rth).html(list);
      parent.$("#show_text" + rth).text(show_text);
      parent.$("#show_t" + rth).text(show_text);
      try {
        var parentTitle;
        parentTitle = parent.$(".title").text();
        if (parentTitle != "会诊登记") {
          if (sessionStorage.getItem("isValidateFormForLqxxdj") === "true") {
            parent.validateForm();
          }
        }
      } catch (e) {
        console.log(e);
      }
      parent.closemodalwindow();
    },
    changeDiag: function (_idx) {
      var _isEdit = false;
      $.each(vm.cbyxList.$model, function (idx, val) {
        if (val.lmt_search == val.pysm && (val.lmt_search !== '' || val.lmt_search !== undefined)) {
          if (val.jbbc == '') {
            publicFun.alert('每次只能编辑一条诊断');
            _isEdit = true
            return;
          }
        }
      })
      if (!_isEdit) {
        $('#content' + _idx).show();
        vm.cbyxList[_idx].id = '';
        vm.cbyxList[_idx].jbbc = '';
        $('#jbbc' + _idx).text('')
        $('#listWrap' + _idx).show();
        $('#content' + _idx).focus();
        vm.cbyxList[_idx].lmt_search = vm.cbyxList[_idx].pysm;
        vm.getCbyxList(_idx, true);
        canSearchFlag = true;
      }
    },
    changeTrBg: function (item) {
      $(item).css('background-color', 'rgba(180, 195, 206, 0.26)').siblings().css("background-color", "#FFFFFF");
    }
  });
  function changeItem(it, idx) {
    if (!it) return false;
    $('.cbyxSearchList tr:hover').removeClass('buddyListHighLight');
    changeBackground(it);
    if (currentLine < 0) currentLine = it.rows.length - 1;
    if (currentLine >= it.rows.length) currentLine = 0;
    it.rows[currentLine].className = "buddyListHighLight";
    if (document.getElementById('allBuddy' + idx)) {
      document.getElementById('allBuddy' + idx).scrollTop = it.rows[currentLine].offsetTop - offsetTr;
    }
    canSearchFlag = false;
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

  function addUser(it, idx) {
    var _currentidx = it.rows[currentLine].rowIndex;
    vm.chooseCbyx(_currentidx, idx);
  }

  function mouseMove(ev, idx) {
    var _tab = document.getElementById('buddyListTable' + idx);
    if (document.all) {
      _tab = document.getElementById('buddyListTable' + idx).children[0];
    }
    changeBackground(_tab);
    $('.cbyxSearchList tr:hover').removeClass('buddyListEven').removeClass('buddyListOdd').addClass('buddyListHighLight');
    for (var i = 0; i < _tab.rows.length; i++) {
      if (_tab.rows[i].className == "buddyListHighLight") {
        currentLine = i;
      }
    }
  }

  function addTr() {
    var _lth = vm.cbyxList.length;
    if (_lth <= 9) {
      var _last_idx = _lth - 1;
      if (_last_idx >= 0) {
        if ($('#jbbc' + _last_idx).text() === '' || $('#jbbc' + _last_idx).text() === undefined) {
          publicFun.alert('请选择疾病诊断后添加');
          return;
        }
      }
      vm.cbyxList.push({
        id: '',
        jbbc: '',
        lmt_pre: '',
        lmt_suf: '',
        lmt_flg: '',
        lmt_date: '',
        lmt_type: '',
        lmt_search: '',
        pysm: '',
        or_id: '',
        or_jbbc: '',
      })
    } else {
      publicFun.alert('您已不能再添加')
    }
  }
  var timeoutId = 0;
  function searchMove(event, idx) {
    var tab = document.getElementById('buddyListTable' + idx);
    if (document.all) {
      tab = document.getElementById('buddyListTable' + idx).children[0];
    }
    var _event = window.event || event;
    if (_event.keyCode == 38) { //Up 
      offsetTr = 0;
      currentLine--;
      changeItem(tab, idx);
    } else if (_event.keyCode == 40) { //Down
      offsetTr = 30;
      currentLine++;
      changeItem(tab, idx);
    } else if (_event.keyCode == 13) {
      if (currentLine > -1 && canSearchFlag == false) {
        addUser(tab, idx);
        canSearchFlag = true;
      } else {
        currentLine = -1;
        offsetTr = 0;
        vm.getCbyxList(idx);
      }
    } else {
      clearTimeout(timeoutId);
      timeoutId = setTimeout(function () {
        currentLine = -1;
        offsetTr = 0;
        vm.getCbyxList(idx);
      }, 500);
    }
  }
  //回车事件
  document.onkeydown = function (event) {
    var e = event || window.event;
    if (e && e.keyCode == 13) { //回车键的键值为13
      $(".messager-body").window('close');
      $('.cbyxParams').focus();
    }
  };

  function stopBubble(e, item) {
    if (e && e.stopPropagation) { //非IE 
      e.stopPropagation();
    } else { //IE 
      window.event.cancelBubble = true;
    }
  }

  function changeChild(e, item) {
    stopBubble(e, item);
    vm.changeTrBg(item.parentNode.parentNode);
  }

  function isCheckVal(event, index) {
    if (($('#content' + index).val() == $('#pysm' + index).text()) && $('#pysm' + index).text() !== '') {
      $('.tabListWrap .cbyxSearchList').hide();
      $('#content' + index).hide();
      vm.cbyxList[index].id = vm.cbyxList.$model[index].or_id;
      vm.cbyxList[index].jbbc = vm.cbyxList.$model[index].or_jbbc;
      $('#jbbc' + index).text(vm.cbyxList[index].jbbc);
    }
  }
  $(function () {
    setCbyxList();
  });

  function setCbyxList() {
    var jbzdSeq = parent.$("#jbzdSeq" + rth).val() || "", //id
      jbzdBetFixStr = parent.$("#jbzdBetFixStr" + rth).val() || "", //name
      diagnosePre = parent.$("#diagnosePre" + rth).val() || "",
      diagnoseSuf = parent.$("#diagnoseSuf" + rth).val() || "",
      sourceFlg = parent.$('#sourceFlg' + rth).val() || '',
      dateIpt = parent.$('#dateIpt' + rth).val() || '',
      typeIpt = parent.$('#typeIpt' + rth).val() || '',
      pysmIpt = parent.$('#pysmIpt' + rth).val() || '';
    if (jbzdSeq === '') {
      jbzdSeq = '&nbsp;'
    }
    if (jbzdSeq !== '') {
      var jbzdSeqList = jbzdSeq.split(","), //id
        jbzdBetFixStrList = jbzdBetFixStr.split(";"), //name
        diagnosePreList = diagnosePre.split("$"),
        diagnoseSufList = diagnoseSuf.split("$"),
        sourceFlgList = sourceFlg.split(";"),
        dateIptList = dateIpt.split(';'),
        typeIptList = typeIpt.split(';'),
        pysmIptList = pysmIpt.split(';');
      var cbyxList = [];
      for (var i = 0; i < jbzdSeqList.length; i++) {
        cbyxList.push({
          id: jbzdSeqList[i],
          jbbc: jbzdBetFixStrList[i],
          lmt_pre: diagnosePreList[i],
          lmt_suf: diagnoseSufList[i],
          lmt_flg: sourceFlg[i],
          lmt_date: dateIptList[i],
          lmt_type: typeIptList[i],
          lmt_search: '',
          pysm: pysmIptList[i],
          or_id: jbzdSeqList[i],
          or_jbbc: jbzdBetFixStrList[i],
        });
      }
      vm.cbyxList = cbyxList;
    }
  }
</script>

</html>