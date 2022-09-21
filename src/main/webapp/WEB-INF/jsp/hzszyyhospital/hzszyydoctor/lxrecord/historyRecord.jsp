<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/base/tag.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <title>导入历史病历---[门急诊和留抢病历]</title>
  <%@ include file="/WEB-INF/jsp/base/common_css.jsp"%>
  <link rel="stylesheet" type="text/css" href="${baseurl}css/hzszyyhems/hzszyydoctor/knowledgeBox.css?v=${versionDay}">
  <%@ include file="/WEB-INF/jsp/base/common_js.jsp"%>
</head>

<body class="hisRecord">
  <div class="knowledgeContent" id="knowledgeContentDiv">
    <div class="boxWrap">
      <div class="historyTab historyDiv hisWthTab">
        <table id="historyList"></table>
      </div>
      <div class="historyContent historyDiv hisWthContent">
        <ul>
          <li class="oneLi addressLi">
            <span class="smalltitle">联系地址：</span>
            <input class="underLine" type="text" readonly id="cstAdr" />
          </li>
          <li class="twoLi onlyQjs">
            <span class="smalltitle">入观时间：</span>
            <input class="underLine shortLine" type="text" readonly id="lqblDatStr" />
          </li>
          <li class="oneLi autoLi">
            <span class="smalltitle">主诉：</span>
            <!-- <input class="underLine" type="text" readonly id="lqblDes" /> -->
            <div class="underLine div-wrap" id="lqblDes"></div>
          </li>
          <li class="oneLi autoLi">
            <span class="smalltitle">现病史：</span>
            <!-- <input class="underLine" type="text" readonly id="nowHis" /> -->
            <div class="underLine div-wrap" id="nowHis"></div>
          </li>
          <li class="oneLi autoLi">
            <span class="smalltitle">既往史：</span>
            <!-- <input class="underLine" type="text" readonly id="medHis" /> -->
            <div class="underLine div-wrap" id="medHis"></div>
          </li>
          <li class="oneLi autoLi">
            <span class="smalltitle">个人史：</span>
            <!-- <input class="underLine" type="text" readonly id="obstHis" /> -->
            <div class="underLine div-wrap" id="obstHis"></div>
          </li>
          <li class="oneLi autoLi">
            <span class="smalltitle">家族史：</span>
            <!-- <input class="underLine" type="text" readonly id="famlHis" /> -->
            <div class="underLine div-wrap" id="famlHis"></div>
          </li>
          <li class="oneLi autoLi">
            <span class="smalltitle">体格检查：</span>
            <!-- <input class="underLine" type="text" readonly id="tgjcMergeStr" /> -->
            <div class="underLine div-wrap" id="tgjcMergeStr"></div>
          </li>
          <li class="oneLi autoLi">
            <span class="smalltitle">查体内容：</span>
            <!-- <input class="underLine" type="text" readonly id="ctnrDes" /> -->
            <div class="underLine div-wrap" id="ctnrDes"></div>
          </li>
          <li class="oneLi onlyMz">
            <span class="smalltitle">评估评分：</span>
            <input class="underLine" type="text" readonly id="assessMsg" />
          </li>
          <li class="oneLi autoLi">
            <span class="smalltitle">辅助检查：</span>
            <!-- <input class="underLine" type="text" readonly id="fzjcDes" /> -->
            <div class="underLine div-wrap" id="fzjcDes"></div>
          </li>
          <li class="oneLi autoLi onlyMz">
            <span class="smalltitle">健康教育：</span>
            <!-- <input class="underLine" type="text" readonly id="healthEducation" /> -->
            <div class="underLine div-wrap" id="healthEducation"></div>
          </li>
          <li class="oneLi autoLi onlyMz">
            <span class="smalltitle">注意事项：</span>
            <!-- <input class="underLine" type="text" readonly id="zysx" /> -->
            <div class="underLine div-wrap" id="zysx"></div>
          </li>
          <input type="text" id="bltype" class="hidden">
        </ul>
      </div>
      <div class="btnDiv">
        <a class="checkImportBtn easyui-linkbutton" iconCls="icon-ok" onclick="setParentVal()">导入</a>
        <a class="easyui-linkbutton" iconCls="icon-cancel" onclick="parent.closemodalwindow()">关闭</a>
      </div>
    </div>
  </div>
  <script>
    function getHistoryTab(_data) {
      $('#historyList').height(400);
      $('#historyList').datagrid({
        nowrap: false,
        striped: true,
        singleSelect: true,
        idField: 'lqblSeq',
        loadMsg: '',
        columns: [
          [{
            field: 'oprtDatStr',
            width: 110,
            title: '日期',
            formatter: function (value, row, index) {
              var rtnStr = value ? value : '';
              if (row.bltype == '0') {
                return rtnStr + '<span style="color: red; margin-left: 2px">留</span>'
              } else {
                return rtnStr;
              }
            }
          }, {
            field: 'jzxh',
            width: 55,
            title: '就诊次数'
          }, {
            field: 'cratNam',
            width: 55,
            title: '就诊医生'
          }]
        ],
        toolbar: '',
        data: _data,
        rownumbers: false,
        onLoadSuccess: function (data) {
          if (data.rows.length != 0) {
            $('#historyList').datagrid("selectRow", 0)
            dealMsg(data.rows[0]);
          }
        },
        onClickRow: function (rowIndex, rowData) {
          dealMsg(rowData);
        }
      });
    }

    // 处理数据
    function dealMsg(arr) {
      var _str = '';
      for (var key in arr) {
        if (arr[key] != null && arr[key] !== '') {
          if (key === 'nrsSco') {
            _str += '疼痛评分：' + arr[key] + '分；';
          } else if (key === 'fallAssCod') {
            if (arr[key] == '#') {
              _str += '跌倒评估：非高危；';
            } else {
              _str += '跌倒评估：高危；';
            }
          } else {
            $('#' + key).val(arr[key])
            $('#' + key).html(arr[key])
          }
        } else {
          $('#' + key).val('')
          $('#' + key).html('')
        }
      }
      // bltype = 0 留抢  ; 1 门急诊
      if (arr.bltype == '0') {
        judgeIsLq('qjs');
      } else {
        judgeIsLq('mz');
      }
      $('#assessMsg').val(_str);
    }
    function judgeIsLq(typeSource) {
      if (typeSource == 'mz') {
        $('.onlyQjs').hide();
        $('.onlyMz').show();
        $('.addressLi').css({ 'width': '99%' });
        $('.addressLi .underLine').removeClass('shortLine');
      } else {
        $('.onlyMz').hide();
        $('.onlyQjs').show();
        $('.addressLi').css({ 'width': '49%' });
        $('.addressLi .underLine').addClass('shortLine');
      }
    }

    // 获取历史病历
    function showHisList() {
      judgeIsLq('${typeSource}');
      publicFun.httpServer({ url: '${baseurl}hzszyyemg/getJzlqblAjax.do' }, { 'mpi': parent.parent.parent.vm.patientMsg.mpi }, function (res) {
        if (res.resultInfo.type == 1) {
          getHistoryTab(res.resultInfo.sysdata.jzlqblList);
        }
      })
    }

    function setParentVal() {
      _confirm('导入后会覆盖已填写数据，确定导入吗?', null, function () {
        var _fillKeyList = ['cstAdr', 'lqblDes', 'nowHis', 'medHis', 'obstHis', 'famlHis','ctnrDes'], _vm = parent.recordvm;
        if ('${typeSource}' == 'mz') {
          _fillKeyList.push('healthEducation', 'zysx');
          // _vm.baseMsg.cstAdr = $('#cstAdr').val();
          // _vm.baseMsg.nowHis = $('#nowHis').val();
          for (var i = 0; i < _fillKeyList.length; i++) {
            // if (_fillKeyList[i] !== 'cstAdr') {
              _vm.recordMsg[_fillKeyList[i]] = $('#' + _fillKeyList[i]).val();
            // }
          }
        } else {
          _fillKeyList.push('lqblDatStr');
          for (var i = 0; i < _fillKeyList.length; i++) {
            if (_fillKeyList[i] === 'lqblDatStr') {
              if ($('#bltype').val() == '0') {
                _vm.recordMsg.lqblDat = ($('#' + _fillKeyList[i]).val()).replace(/\-/g, '/');
              }
            } else {
              _vm.recordMsg[_fillKeyList[i]] = $('#' + _fillKeyList[i]).val();
            }
          }
        }
        parent.closemodalwindow()
      });
    }

    $(function () {
      showHisList();
      $('.historyTab').show();
      $('.historyContent').show();
    })
  </script>
</body>

</html>