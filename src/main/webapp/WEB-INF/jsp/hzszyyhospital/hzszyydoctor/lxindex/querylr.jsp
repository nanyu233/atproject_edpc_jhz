<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/base/tag.jsp"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>

<head>
  <meta charset="UTF-8">
  <meta http-equiv="cache-control" content="no-cache">
  <title>初步诊断新版</title>
  <%@ include file="/WEB-INF/jsp/base/common_css.jsp"%>
  <link rel="stylesheet" type="text/css" href="${baseurl}css/hems/cbyx.css">
  <%@ include file="/WEB-INF/jsp/base/common_js.jsp"%>
  <script src="${baseurl}lib/avalon1.4.8/avalon.js" type="text/javascript" charset="UTF-8"></script>
  <script>
    var rth = '${trnumber}',
    _emgSeq = '${emgSeq}',
    _jbzdType = '${jbzdType}',
    _diagnosisType = '${diagnosisType}';
    // 新改版下 诊断只能查看 无法录入
  </script>
</head>

<body class="querylr" ms-controller="cbyx">
  <p class="bz">诊断信息从HIS医生站自动导入。</p>
  <div>
    <table class="table table-bordered table-striped" id="editTab" style="table-layout:fixed; word-break:break-all;">
      <colgroup>
        <col width="4%">
        <col width="10%">
        <!-- <col width="15%"> -->
        <col width="33%">
        <col width="20%">
        <!-- <col width="15%"> -->
        <col width="19%">
        <!-- <col width="14%"> -->
      </colgroup>
      <thead>
        <tr class="tr_bg">
          <td>序号</td>
          <td>诊断类型</td>
          <!-- <td>诊断前缀</td> -->
          <td>疾病名称</td>
          <td>ICD10</td>
          <!-- <td>诊断后缀</td> -->
          <td class="hidden">诊断医生</td>
          <td>诊断日期</td>
          <!-- <td>操作</td> -->
        </tr>
      </thead>
      <tbody class="mainTabBody" id="editMainTab">
        <tr ms-repeat="cbyxList" ms-click="changeTrBg(this)">
          <td class="_indexTd">{{$index+1}}</td>
          <td>
            <span ms-visible="el.lmt_type === 0 || el.lmt_type === '0'">主要诊断</span>
            <span ms-visible="el.lmt_type === 1 || el.lmt_type === '1'">其他诊断</span>
            <!-- <select ms-duplex-string="el.lmt_type">
              <option value=""></option>
              <option value="0">主要诊断</option>
              <option value="1">其他诊断</option>
            </select> -->
          </td>
          <td class="hidden">
            <input type="text" class="hidden" ms-attr-id="'flag' + $index" ms-duplex-string="el.lmt_flg">
            <input type="text" class="noBdrText" ms-attr-id="'prefixVal' + $index" ms-duplex-string="el.lmt_pre" onclick="changeChild(event, this)" maxlength="24"/>
          </td>
          <!-- <td class="leftgroup">
            <span ms-attr-id="'jbbc' + $index" ms-dblclick="changeDiag($index)" class="showContentSpan">{{el.jbbc}}</span>
            <span ms-attr-id="'pysm' + $index" class="hidden">{{el.pysm}}</span>
            <span class="relative tabListWrap" ms-visible="!el.jbbc" ms-attr-id="'listWrap' + $index">
              <input class="cbyxParams noBdrText" ms-attr-id="'content' + $index" type="text" ms-duplex-string="el.lmt_search" placeholder="请输入疾病代码"
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
          </td> -->
          <td class="leftgroup">{{el.jbbc}}</td>
          <td class="leftgroup">{{el.icd}}</td>
          <td class="hidden"><input type="text" class="noBdrText" ms-attr-id="'suffixVal' + $index" ms-duplex-string="el.lmt_suf" maxlength="24"/></td>
          <td class="hidden">{{el.hzzdNurNbr}}</td>
          <td>
            <!-- onclick="WdatePicker({dateFmt:'yyyy/MM/dd'})" -->
            <input class="Wdate dateWth" type="text" ms-duplex-string="el.lmt_date" onfocus="changeChild(event, this)" readonly>
            <input type="text" ms-duplex-string="el.lmt_createTime" class="hidden">
          </td>
          <td class="hidden">
            <a href="javascript:;" ms-click="moveUpward($index)" ms-visible="$index != 0">上移 |</a>
            <a href="javascript:;" ms-click="moveDownward($index)" ms-visible="$index != (vm.cbyxList.length - 1)">下移 |</a>
            <a href="javascript:;" ms-click="deleteCbyx($index)">删除</a>
          </td>
        </tr>
        <!-- <tr >
          <td>手工录入</td>
          <td colspan="6">
            <textarea class="div-textarea" maxlength="150" ms-duplex-string="cbyxRemark"></textarea>
          </td>
        </tr> -->
      </tbody>
    </table>
    <div class="btn_Group">
      <!-- <a class="easyui-linkbutton" href="javascript:;" iconCls="icon-ok" onclick="addTr()">添加</a>
      <a class="easyui-linkbutton" href="javascript:;" iconCls="icon-ok" ms-click="insertCbyx()">确定</a> -->
      <a class="easyui-linkbutton" href="javascript:;" iconCls="icon-cancel" onclick="parent.closemodalwindow()">关闭</a>
    </div>
  </div>
</body>
<script type="text/javascript">
  $("body").click(function (e) {
    var evt = e || window.event;
    var targetObj = evt.target || evt.srcElement;
    for (var n = 0; n < vm.cbyxList.$model.length; n++) {
      if ($('#listWrap' + n).find('.cbyxSearchList').display !== 'none') {
        if (vm.cbyxSearchList.length === 1 && vm.cbyxSearchList[0].jbbc === '') {
          if (targetObj.innerText !== '确定') {
            $('#content' + n).val('');
          }
        }
      }
    }
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
    isShowType: _diagnosisType,
    cbyxRemark: '',
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
          $(".cbyxSearchList").show();
          vm.cbyxSearchList = [{ id: '', jbbc: '', pysm: '', lmtSex: null, lmtLx: null}];
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
      // if (vm.cbyxList.length === 1) {
      //   if (idx === 0) {
      //     if (vm.cbyxRemark === '') {
      //       publicFun.alert('该条不能删除');
      //       return false;
      //     }
      //   }
      // }
      vm.cbyxList.splice(idx, 1);
    },
    // 往上移动一条
    moveUpward: function (idx) {
      var _moveBeforeList = JSON.parse(JSON.stringify(vm.cbyxList.$model));
      var temp = _moveBeforeList[idx - 1], upIdx = idx - 1;
      _moveBeforeList[idx - 1] = _moveBeforeList[idx];
      $('#jbbc' + upIdx).text(_moveBeforeList[idx].jbbc);
      _moveBeforeList[idx] = temp;
      $('#jbbc' + idx).text(temp.jbbc);
      vm.cbyxList = JSON.parse(JSON.stringify(_moveBeforeList));
    },
    // 往下移动一条
    moveDownward: function (idx) {
      var _moveBeforeList = JSON.parse(JSON.stringify(vm.cbyxList.$model));
      var temp = _moveBeforeList[idx + 1], downIdx = idx + 1;
      _moveBeforeList[idx + 1] = _moveBeforeList[idx];
      $('#jbbc' + downIdx).text(_moveBeforeList[idx].jbbc);
      _moveBeforeList[idx] = temp;
      $('#jbbc' + idx).text(temp.jbbc);
      vm.cbyxList = JSON.parse(JSON.stringify(_moveBeforeList));
    },
    insertCbyx: function () {
      var jbzdList = [];
      var _fieldList = ['lmt_pre', 'id', 'lmt_suf', 'lmt_flg', 'jbbc', 'lmt_date', 'lmt_type', 'pysm'];
      var isNullFlag = false;
      $.each(vm.cbyxList.$model, function (idx, val) {
        if (val.id === '&nbsp;') {
          if (val.lmt_suf || val.lmt_pre || val.lmt_date || val.lmt_type) {
            isNullFlag = true
            return false;
          }
        } else {
          if (val.lmt_suf || val.lmt_pre || val.lmt_date || val.lmt_type) {
            if (!val.jbbc) {
              isNullFlag = true
              return false;
            }
          }
        }
        $.each(_fieldList, function (_idx, _val) {
          if (val[_val.cod] == undefined) {
            val[_val.cod] = ''
          }
        })
        if (val.lmt_date) {
          val.lmt_date = new Date(val.lmt_date)
        }
        if (val.lmt_createTime) {
          val.lmt_createTime = new Date(val.lmt_createTime)
        }
        jbzdList.push({
          jbzdSeq: '', hzzdCod: val.id, hzzdCodname: val.jbbc, hzzdDat: val.lmt_date, jbzdFlg: val.lmt_flg, 
          jbzdPrefix: val.lmt_pre, jbzdSuffix: val.lmt_suf, jbzdStatus: val.lmt_type, jbzdPysm: val.pysm,
          hzzdUpdDat: val.lmt_createTime, jbzdComm: val.jbbc
        })
      });
        // else if (vm.cbyxRemark !== '' && checkValIsNull($('#content' + n).val()) === false && vm.cbyxSearchList.length === 1 && vm.cbyxSearchList[0].jbbc === '') {
        //   publicFun.alert('请录入有效疾病代码');
        //   return false;
        // } 
      if (isNullFlag == true) {
        // 如果手工录入有值，则允许上面为空,否则直接可以把循环和判断语句去掉直接返回false
        // 列表中最后一行的诊断前中后都为空的话，可以忽略不填。
        var n = vm.cbyxList.$model.length - 1;
        if (checkValIsNull($('#content' + n).val()) && checkValIsNull($('#suffixVal' + n).val()) && checkValIsNull($('#prefixVal' + n).val())) {
        } else {
          publicFun.alert('请录入有效疾病代码');
          return false;
        }
        // for (var n = 0; n < vm.cbyxList.$model.length; n++) {
        //   console.log($('#content' + n).val(), n)
        //   if (checkValIsNull($('#content' + n).val()) && checkValIsNull($('#suffixVal' + n).val()) && checkValIsNull($('#prefixVal' + n).val())) {
        //   } else {
        //     publicFun.alert('请录入有效疾病代码');
        //     return false;
        //   }
        // }
      }
      postBoxMsg(jbzdList);
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
        if ((val.lmt_search == val.pysm && (checkValIsNull(val.lmt_search) === false)) || (checkValIsNull(val.lmt_search) === false && checkValIsNull(val.pysm) === false) || (checkValIsNull(val.lmt_search) === true)) {
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
    changeTrBg: function(item) {
      $(item).css('background-color', 'rgba(213, 228, 239, 0.26)').siblings().css("background-color", "#FFFFFF");
    }
  });
  function postBoxMsg (list) {
    var jbzdList = new Array();
    for (var k in list) {
      jbzdList[k] = list[k]
    }
    if (checkValIsNull(vm.cbyxRemark.trim()) === false) {
      jbzdList.push({
        jbzdComm: vm.cbyxRemark.trim(),
        emgSeq: _emgSeq,
        jbzdType: _jbzdType
      })
    } else {
      jbzdList.push({
        emgSeq: _emgSeq,
        jbzdType: _jbzdType
      })
    }
    publicFun.httpServer({ url: '${baseurl}zyyjbzd/zyySubmitJbzd.do', requestDataType: 'json' }, jbzdList, function (res) {
      parent.$("#show_text" + rth).text(res.resultInfo.message);
      if (parent.getDiagnoseList) {
        parent.getDiagnoseList()
      }
    })
  }
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
        // if ($('#jbbc' + _last_idx).text() === '' || $('#jbbc' + _last_idx).text() === undefined) {
        //   publicFun.alert('当前有空行，请录入完后再添加');
        //   return;
        // }
        for (var i = 0 ; i <= _last_idx; i++) {
          if (checkValIsNull($('#jbbc' + i).text())) {
            if (checkValIsNull($('#content' + i).val()) === false) {
              $('#content' + i).val('');
            }
            publicFun.alert('当前有空行，请录入完后再添加');
            return;
          }
        }
      }
      vm.cbyxList.push({
        id: '',
        jbbc: '',
        lmt_pre: '',
        lmt_suf: '',
        lmt_flg: '',
        lmt_date: publicFun.timeFormat(new Date(), 'yyyy/MM/dd'),
        lmt_createTime: publicFun.timeFormat(new Date(), 'yyyy/MM/dd hh:mm:ss'),
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
        $('.cbyxSearchList tr').removeClass('buddyListHighLight');
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
  
  function stopBubble (e, item) {
    if (e && e.stopPropagation) { //非IE 
      e.stopPropagation();
    } else { //IE 
      window.event.cancelBubble = true;
    }
  }
  
  function changeChild (e, item) {
    stopBubble(e, item);
    vm.changeTrBg(item.parentNode.parentNode);
  }
  
  function isCheckVal (event, index) {
    if (($('#content' + index).val() == $('#pysm' + index).text()) && $('#pysm' + index).text() !== '') {
      $('.tabListWrap .cbyxSearchList').hide();
      $('#content' + index).hide();
      vm.cbyxList[index].id = vm.cbyxList.$model[index].or_id;
      vm.cbyxList[index].jbbc = vm.cbyxList.$model[index].or_jbbc;
      $('#jbbc' + index).text(vm.cbyxList[index].jbbc);
    }
    // checkValList(event, index);
  }

  function checkValList (event, index) {
    var _event = event || window.event;
    var isSureBtn = false;
    if (_event.relatedTarget) {
      if (_event.relatedTarget.innerText === '确定') {
        isSureBtn = true;
      } else {
        isSureBtn = false;
      }
    }
    currentLine = -1;
    offsetTr = 0;
    vm.getCbyxList(index);
    if (vm.cbyxSearchList.length === 1 && vm.cbyxSearchList[0].jbbc === '') {
      if (!isSureBtn) {
        $('#content' + index).val('')
        setTimeout(function () {
          $('#content' + index).val('')
        }, 500);
      }
    }
  }
  // 检查参数是不是null undefined ''
  function checkValIsNull (params) {
    if (params !== '' && params !== null && params !== undefined) {
      return false
    } else {
      return true
    }
  }
  $(function () {
    setCbyxList();
  });
  

  function setCbyxList() {
    publicFun.httpServer({url: '${baseurl}zyyjbzd/zyyGetJbzdInfList.do'}, { 'emgSeq': _emgSeq, 'jbzdType': _jbzdType }, function (res) {
      var _cbyxList = [];
      var _list = res.hspJbzdInfCustomList;
      for (var i = 0 ; i < _list.length; i++) {
        _cbyxList.push({
          id: _list[i].hzzdCod,
          jbbc: _list[i].jbzdComm,
          icd: _list[i].icd,
          lmt_pre: _list[i].jbzdPrefix,
          lmt_suf: _list[i].jbzdSuffix,
          lmt_flg: _list[i].jbzdFlg,
          lmt_date: publicFun.timeFormat(_list[i].hzzdDat, 'yyyy/MM/dd'),
          lmt_createTime: publicFun.timeFormat(_list[i].hzzdUpdDat, 'yyyy/MM/dd hh:mm:ss'),
          lmt_type: _list[i].jbzdStatus,
          lmt_search: '',
          pysm: _list[i].jbzdPysm,
          or_id: _list[i].hzzdCod,
          or_jbbc: _list[i].hzzdCodname,
          hzzdNurNbr: _list[i].hzzdNurNbr
        });
      }
      if (_cbyxList.length === 0) {
        _cbyxList.push({
          id: '&nbsp;',
          jbbc: '',
          icd: '',
          lmt_pre: '',
          lmt_suf: '',
          lmt_flg: '',
          lmt_date: '',
          lmt_date: '',
          // lmt_date: publicFun.timeFormat(new Date(), 'yyyy/MM/dd'),
          lmt_createTime: publicFun.timeFormat(new Date(), 'yyyy/MM/dd hh:mm:ss'),
          lmt_type: '',
          lmt_search: '',
          pysm: '',
          or_id: '',
          or_jbbc: '',
          hzzdNurNbr: ''
        })
      }
      vm.cbyxList = _cbyxList;
      if (res.jbzdCommCustom) {
        vm.cbyxRemark = res.jbzdCommCustom.jbzdComm || '';
      }
    })
  }
</script>

</html>