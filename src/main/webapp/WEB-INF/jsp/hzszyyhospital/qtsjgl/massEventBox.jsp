<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/base/tag.jsp"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>

<head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
  <title>群体事件绑定管理---登记页面</title>
  <%@ include file="/WEB-INF/jsp/base/common_css.jsp"%>
  <link rel="stylesheet" type="text/css" href="${baseurl}css/common/querylist.css" />
  <link rel="stylesheet" type="text/css" href="${baseurl}css/common/tableStyle.css">
  <link rel="stylesheet" type="text/css" href="${baseurl}css/hems/global.css">
  <link rel="stylesheet" type="text/css" href="${baseurl}css/hzszyyhems/precheck/massEvent.css?2">
  <%@ include file="/WEB-INF/jsp/base/common_js.jsp"%>
</head>

<body class="massEventBox">
  <div class="form clr bottomGap">
    <p class="form-text">日期：</p>
    <input class="input-date Wdate" id="startDate" type="text" onclick="WdatePicker({dateFmt:'yyyy/MM/dd',isShowClear:false,readOnly:true})">
    <p class="form-text">-</p>
    <input class="input-date Wdate" id="endDate" type="text" onclick="WdatePicker({dateFmt:'yyyy/MM/dd',isShowClear:false,readOnly:true})">
    <a class="easyui-linkbutton" iconCls="icon-search" id="btn" onclick="getDataGrid()">查询</a>
  </div>
  <div class="m-l2 queryTabs">
    <table id="tabList"></table>
  </div>
  <div class="eventAdd">
    <div class="addMassTitle">
      <p>群体事件快速登记</p>
      <a class="easyui-linkbutton" iconCls="icon-add" onclick="cleanFormMsg()">新增</a>
    </div>
    <form ms-controller="massEventBdy" class="form massForm">
      <table>
        <tbody>
          <tr>
            <th><i class="red">*</i> 发生时间：</th>
            <td>
              <input ms-attr-disabled="massMsg.isReadFlag == true" class="input-long Wdate" type="text" ms-duplex-string="massMsg.qtsjDat" onclick="WdatePicker({dateFmt:'yyyy/MM/dd HH:mm:ss'})">
            </td>
            <th><i class="red">*</i> 事件类型：</th>
            <td>
              <label ms-repeat="qtsjTypeList" ms-attr-id="qtsjType{{el.infocode}}" class="floatLeft">
                <input ms-attr-disabled="massMsg.isReadFlag == true" ms-attr-id="qtsjType{{el.infocode}}" type="radio" ms-attr-value="el.infocode" ms-duplex-string="massMsg.qtsjType"/>
                {{el.info}} &nbsp;&nbsp;
              </label>
              <input ms-attr-disabled="massMsg.isReadFlag == true" type="text" maxlength="4" class="smallText" name="hspQtsjglCustom.qtsjTypeOther" ms-duplex-string="massMsg.qtsjTypeOther" placeholder="四字以内"/>
            </td>
          </tr>
          <tr>
            <th><i class="red">*</i> 事件名称：</th>
            <td colspan="3">
              <input ms-attr-disabled="massMsg.isReadFlag == true" type="text" class="eqLongText" ms-duplex-string="massMsg.qtsjNam" />
            </td>
          </tr>
          <tr>
            <th>事件地址：</th>
            <td colspan="3">
              <input ms-attr-disabled="massMsg.isReadFlag == true" type="text" class="eqLongText" ms-duplex-string="massMsg.adrr"/>
            </td>
          </tr>
          <tr>
            <th>简要经过：</th>
            <td colspan="3">
              <textarea ms-attr-disabled="massMsg.isReadFlag == true" class="div-textarea eqLongText" maxlength="128" ms-duplex-string="massMsg.jyjg"></textarea>
            </td>
          </tr>
          <tr>
            <th>快速分诊数：</th>
            <td colspan="3">
              <input type="text" maxlength="4" class="smallText" ms-duplex-string="massMsg.triageNum" ms-keyup="_onlyNum('triageNum')" ms-input="_onlyNum('triageNum')"  ms-change="_onlyNum('triageNum')">人
            </td>
          </tr>
          <tr>
            <td colspan="4" class="last_td">
              <div class="right-grp">
                <a class="easyui-linkbutton" iconCls="icon-ok" onclick="postMassEvent()">确定</a>
                <a class="easyui-linkbutton" iconCls="icon-cancel" onclick="parent.closemodalwindow()">关闭</a>
              </div>
            </td>
          </tr>
        </tbody>
      </table>
        <div ms-attr-id="massPrint{{$index}}" class="hidden" ms-repeat="printList">
          <div class="massTabPrint">
            <p class="startTime">{{el.time}}</p>
            <span class="name leftSpan">{{el.name}}</span>
            <span class="number rightSpan">
              <span ms-if="el.typeNum">(</span>
              {{el.typeNum}}
              <span ms-if="el.typeNum">)</span>
            </span>
          </div>
        </div>
    </form>
  </div>
  <script src="${baseurl}lib/avalon1.4.8/avalon.js" type="text/javascript" charset="UTF-8"></script>
  <script language="javascript" src="${baseurl}Lodop6.216/LodopFuncs.js"></script>
  <script>
    function getDataGrid() {
      var _height = 0.35 * $(document).height() - 26;
      $("#tabList").height(_height);
      $('#tabList').datagrid({
        nowrap: true,
        striped: true,
        singleSelect: true,
        url: '${baseurl}qtsjgl/queryqtsjgl_result.do',
        idField: 'qtsjSeq',
        loadFilter: function (data) {
          if (data.resultInfo && data.resultInfo.messageCode == '109') {
            message_alert(data, function () {
              window.location.href = "${baseurl}first.do";
            });
          }
          return data;
        },
        queryParams: {
          'startdate': $('#startDate').val(),
          'enddate': $('#endDate').val(),
          'hspQtsjglCustom.qtsjSeq': _seqCurrent
        },
        loadMsg: '',
        columns: [[{
          field: 'qtsjSeq',
          title: '编号 ',
          hidden: true,
        }, {
          field: 'qtsjDat',
          title: '发生时间 ',
          width: getWidth(0.11),
          formatter: function (value, row, index) {
            if (value) {
              return publicFun.timeFormat(new Date(value), 'yyyy/MM/dd')
            }
          }
        }, {
          field: 'qtsjNam',
          title: '事件名称',
          width: getWidth(0.1)
        }, {
          field: 'qtsjType',
          title: '类型',
          width: getWidth(0.1)
        }, {
          field: 'adrr',
          title: '地点',
          width: getWidth(0.12)
        }, {
          field: 'jyjg',
          title: '简要经过',
          width: getWidth(0.26)
        }, {
          field: 'djdat',
          title: '记录时间',
          width: getWidth(0.11),
          formatter: function (value, row, index) {
            if (value) {
              return publicFun.timeFormat(new Date(value), 'yyyy/MM/dd')
            }
          }
        }, {
          field: 'djrnam',
          title: '记录员',
          width: getWidth(0.08)
        }, {
          field: 'operation',
          title: '操作',
          width: getWidth(0.06),
          formatter: function (value, row, index) {
            if (_seqCurrent) {
              return "<a href=javascript:cancelText() >取绑</a>";
            } else {
              return "<a href=javascript:assignText('bind') >绑定</a>";
            }
          }
        }]],
        pagination: true,
        rownumbers: true,
        pageList: [3, 6, 9],
        toolbar: [],
        onLoadSuccess: function (res) {
          if (isOpen == 1) {
            onCheckVal(res.rows);
          }
          isOpen = 0;
        },
        onDblClickRow: function (rowIndex, rowData) {
          currentRow = rowData;
          assignText()
        },
        onClickRow: function (rowIndex, rowData) {
          currentRow = rowData;
          assignText();
        }
      });
    }

    function assignText(type) {
      var checkItem = currentRow;
      var _str = '';
      if (checkItem) {
        _str = checkItem.qtsjSeq
      } else {
        _str = ''
      }
      if (_str) {
        fillFormLineText(checkItem);
      } else {
        massVm.massMsg.isReadFlag = false;
      }
      if (type === 'bind') {
        bindMassEvent();
        parent.closemodalwindow();
      }
    }

    function fillFormLineText (checkItem) {
      var _fieldList = ['qtsjDat', 'qtsjType', 'qtsjTypeOther', 'qtsjNam', 'adrr', 'jyjg', 'triageNum'];
      for (var i = 0; i < _fieldList.length; i++) {
        if (_fieldList[i] === 'qtsjDat') {
          checkItem[_fieldList[i]] = publicFun.timeFormat(checkItem[_fieldList[i]], 'yyyy/MM/dd hh:mm:ss')
        }
        if (_fieldList[i] === 'qtsjType') {
          checkItem[_fieldList[i]] = checkItem.qtsjTypeCod;
        }
        massVm.massMsg[_fieldList[i]] = checkItem[_fieldList[i]];
      }
      massVm.massMsg.isReadFlag = true;
    }

    function cancelText() {
      $("#tabList").datagrid('clearSelections');
      setTime();
      _seqCurrent = '';
      parent.$('#qtsjSeq').val('');
      $('#tabList').datagrid('load', {
        'startdate': $('#startDate').val(),
        'enddate': $('#endDate').val()
      });
      parent.$('#qtsjFlg').val('0');
      parent.vm.patientMsg.qtsjFlg = '0';
      parent.$('.spChl-btn').removeClass('active');
      parent.$('#massText').html('');
      parent.$('#massTitle').html('');
      cleanFormMsg();
    }

    function getWidth(proportion) {
      var userAgent = navigator.userAgent; //取得浏览器的userAgent字符串
      var width = '';
      if (userAgent.indexOf("Chrome") > -1) {
        width = $(document).width();
      } else {
        width = $(document).width() - 50;
      }
      return Math.round(proportion * width);
    }

    function setTime() {
      var _today = publicFun.timeFormat(new Date(), 'yyyy/MM/dd');
      var _preWeek = new Date().getTime() - 24 * 7 * 60 * 60 * 1000;
      $("#startDate").val(publicFun.timeFormat(new Date(_preWeek), 'yyyy/MM/dd'));
      $("#endDate").val(_today);
    }

    $(document).resize(function () {
      var height = 0.35 * $(document).height() - 26;
      $("#tabList").height(height);
    })

    function onCheckVal(_allList) {
      setTimeout(function () {
        if (_seqCurrent) {
          for (var i = 0; i < _allList.length; i++) {
            if (_allList[i].qtsjSeq === _seqCurrent) {
              $("#tabList").datagrid('checkRow', i);
              currentRow = _allList[i];
              fillFormLineText(_allList[i])
            }
          }
        }
      }, 100);
    }

    function cleanFormMsg () {
      var _fieldList = ['qtsjDat', 'qtsjType', 'qtsjTypeOther', 'qtsjNam', 'adrr', 'jyjg', 'triageNum'];
      for (var i = 0; i < _fieldList.length; i++) {
        massVm.massMsg[_fieldList[i]] = '';
        massVm.massMsg.qtsjDat = publicFun.timeFormat(new Date(), 'yyyy/MM/dd hh:mm:ss');
      }
      massVm.massMsg.isReadFlag = false;
    }

    function getDataList () {
      publicFun.httpServer({ url: '${baseurl}qtsjgl/queryqtsjglinfo.do' }, {}, function (data) {
        massVm.qtsjTypeList = data.resultInfo.sysdata.qtsjtypeList
      })
    }

    function postMassEvent() {
      if (massVm.massMsg.isReadFlag === true) { //列表单选群体事件
        if (massVm.massMsg.triageNum === '' || massVm.massMsg.triageNum == null) { // 关闭该窗口并在预检父页面绑定该事件
          bindMassEvent();
          parent.closemodalwindow();
        } else { // 调用预检页的保存功能，打印群体事件标签，关闭该窗口
          var _namePost = getCurrentTypeNam();
          publicFun.httpServer({url: '${baseurl}qtsjgl/addqtsj.do'}, {
            'hspemginfCustom.vstCad': '',
            'hspemginfCustom.cstNam': _namePost,
            'hspemginfCustom.emgDat': massVm.massMsg.qtsjDat,
            'hspemginfCustom.grnChl': '1',
            'hspemginfCustom.swChl': '1',
            'hspemginfCustom.qtsjFlg': '1',
            'hspemginfCustom.cstDspCod': '6',
            'hspQtsjglCustom.qtsjSeq': currentRow.qtsjSeq,
            'hspemginfCustom.triageNum': massVm.massMsg.triageNum,
            'hspQtsjglCustom.qtsjType': massVm.massMsg.qtsjType,
            'hspQtsjglCustom.qtsjTypeOther': massVm.massMsg.qtsjTypeOther
          }, function (data) {
            message_alert(data);
            printMassTab(data.resultInfo.sysdata.triageList);
            if (data.resultInfo.type == '1') {
              setTimeout("parent.closemodalwindow()", 800);
            }
          })
        }
      } else {
        if (massVm.massMsg.triageNum === '' || massVm.massMsg.triageNum == null) { // 保存群体事件，关闭该窗口并在预检父页面绑定该事件；
          postAjaxMass('bind');
        } else { // 保存群体事件，调用预检页的保存功能，打印群体事件标签，关闭该窗口。
          postAjaxMass();
        }
      }
    }

    function postAjaxMass (eventType) {
      if (!massVm.massMsg.qtsjDat) {
        publicFun.alert("发生时间必填");
        return false;
      }
      if (!massVm.massMsg.qtsjType) {
        publicFun.alert("事件类型必填");
        return false;
      }
      var _nameSend = getCurrentTypeNam();
      if (_nameSend == '其他') {
        if (publicFun.strTrim(massVm.massMsg.qtsjTypeOther) === '') {
          publicFun.alert("事件类型其他输入必填");
          return false;
        }
      }
      if (!massVm.massMsg.qtsjNam) {
        publicFun.alert("事件名称必填");
        return false;
      }
      var _postMass = massVm.massMsg;
      if (eventType === 'bind') {
        publicFun.httpServer({ url: '${baseurl}qtsjgl/addqtsj.do' }, {
          'hspQtsjglCustom.qtsjDat': _postMass.qtsjDat,
          'hspQtsjglCustom.qtsjType': _postMass.qtsjType,
          'hspQtsjglCustom.qtsjTypeOther': _postMass.qtsjTypeOther,
          'hspQtsjglCustom.qtsjNam': _postMass.qtsjNam,
          'hspQtsjglCustom.adrr': _postMass.adrr,
          'hspQtsjglCustom.jyjg': _postMass.jyjg,
          'hspemginfCustom.triageNum': _postMass.triageNum,
          'pageName': 'precheckPage'
        }, function (data) {
          bindMassEvent('add', data.resultInfo.sysdata.id);
          message_alert(data);
          if (data.resultInfo.type == '1') {
            setTimeout("parent.closemodalwindow()", 800);
          }
        })
      } else {
        var _namePost = getCurrentTypeNam();
        publicFun.httpServer({ url: '${baseurl}qtsjgl/addqtsj.do' }, {
          'hspQtsjglCustom.qtsjDat': _postMass.qtsjDat,
          'hspQtsjglCustom.qtsjType': _postMass.qtsjType,
          'hspQtsjglCustom.qtsjTypeOther': _postMass.qtsjTypeOther,
          'hspQtsjglCustom.qtsjNam': _postMass.qtsjNam,
          'hspQtsjglCustom.adrr': _postMass.adrr,
          'hspQtsjglCustom.jyjg': _postMass.jyjg,
          'hspemginfCustom.triageNum': _postMass.triageNum,
          'hspemginfCustom.vstCad': '',
          'hspemginfCustom.cstNam': _namePost,
          'hspemginfCustom.emgDat': _postMass.qtsjDat,
          'hspemginfCustom.grnChl': '1',
          'hspemginfCustom.swChl': '1',
          'hspemginfCustom.qtsjFlg': '1',
          'hspemginfCustom.cstDspCod': '6',
          'pageName': 'precheckPage'
        }, function (data) {
          message_alert(data);
          printMassTab(data.resultInfo.sysdata.triageList);
          if (data.resultInfo.type == '1') {
            setTimeout("parent.closemodalwindow()", 800);
          }
        })
      }
    }

    function getCurrentTypeNam () {
      var _name = '', _list = massVm.qtsjTypeList.$model;
      for (var i = 0; i < _list.length; i++) {
        if (_list[i].infocode == massVm.massMsg.qtsjType) {
          _name = _list[i].info;
        }
      }
      return _name;
    }

    var LODOP;
    function printMassTab (list) {
      massVm.printList = [];
      for (var i = 0; i < list.length; i++) {
        var _nameLeft = getCurrentTypeNam(), _time = publicFun.timeFormat(massVm.massMsg.qtsjDat, 'yyyy/MM/dd hh:mm');
        if (_nameLeft == '其他') {
          _nameLeft = massVm.massMsg.qtsjTypeOther
        }
        massVm.printList.push({
          time: _time,
          name: _nameLeft + list[i],
          typeNum: list[i]
        })
      }
      $('.massTabPrint').css({'float':'left', 'width': '100%'});
      $('.massTabPrint p').css({ 'float': 'left', 'width': '100%', 'font-size': '0.7cm', 'font-weight': 'bolder','text-align':'center'});
      $('.massTabPrint .leftSpan').css({ 'float': 'left', 'font-size': '1cm', 'font-weight': 'bolder','text-align':'right','width':'50%' });
      $('.massTabPrint .rightSpan').css({ 'float': 'left', 'font-size': '1cm','width': '10mm', 'text-align': 'left','font-weight': 'bolder','margin-left': '4mm' });
      //打印预览 => 先注释到时候再打开
      LODOP = getLodop();
      LODOP.PRINT_INITA(0, 0, "64mm", "48mm", "群体事件标签");		// (增强型)打印初始化	PRINT_INIT(Top, Left, Width, Height, strPrintName)
      // LODOP.SET_PRINT_PAGESIZE(0, "55mm", "35mm", "");	// 设定纸张大小
      LODOP.SET_PRINT_PAGESIZE(0, "64mm", "48mm", "");	// 设定纸张大小
      LODOP.SET_PRINT_MODE("NOCLEAR_AFTER_PRINT", true);	// 设置打印模式	|"NOCLEAR_AFTER_PRINT"：设置打印或预览后内容不清空是否为真。
      for (var i = 0; i < massVm.printList.length; i++) {
         LODOP.ADD_PRINT_HTM(3, 0, '100%', '100%', document.getElementById('massPrint' + i).innerHTML);
         LODOP.NewPageA();
      }
      LODOP.SET_PRINT_STYLE("FontSize", 10);	// 设置打印项的输出风格	|"FontSize"： 设定纯文本打印项的字体大小。
      LODOP.SET_PRINTER_INDEXA("急诊分诊单");	//(增强型)指定打印设备
      LODOP.PRINT();
      // LODOP.PREVIEW();
    }

    function bindMassEvent (type, id) {
      var checkItem;
      if (type === 'add') {
        checkItem = massVm.massMsg;
        if (id) {
          checkItem.qtsjSeq = id;
          parent.$('#qtsjSeq').val(checkItem.qtsjSeq);
        } else {
          parent.$('#qtsjSeq').val('');
        }
        bindParentTrue(checkItem);
      } else {
        checkItem = currentRow;
        var _str = '';
        if (checkItem) {
          _str = checkItem.qtsjSeq
        } else {
          _str = ''
        }
        if (_str) {
          bindParentTrue(checkItem)
        } else {
          bindParentFalse()
        }
        parent.$('#qtsjSeq').val(_str);
      }
      parent.$('#massStartTime').val($('#startDate').val());
      parent.$('#massEndTime').val($('#endDate').val());
    }

    function bindParentTrue (checkItem) {
      parent.$('#qtsjFlg').val('1');
      parent.vm.patientMsg.qtsjFlg = '1';
      parent.$('.spChl-btn').addClass('active');
      parent.$('#massTitle').html('群体事件：');
      parent.$('#massText').html(checkItem.qtsjNam);
    }

    function bindParentFalse () {
      parent.$('#qtsjFlg').val('0');
      parent.vm.patientMsg.qtsjFlg = '0';
      parent.$('.spChl-btn').removeClass('active');
      parent.$('#massText').html('');
      parent.$('#massTitle').html('');
    }

    var massVm = avalon.define({
      $id: 'massEventBdy',
      massMsg: {
        qtsjDat: publicFun.timeFormat(new Date(), 'yyyy/MM/dd hh:mm:ss'),
        qtsjType: '',
        qtsjTypeOther: '',
        qtsjNam: '',
        adrr: '',
        jyjg: '',
        triageNum: '',
        isReadFlag: false
      },
      qtsjTypeList: [],
      printList: [],
      _onlyNum: function (objName) {
        massVm.massMsg[objName] = publicFun.onlyNumber(massVm.massMsg[objName])
      }
    })

    var isOpen = 1, _seqCurrent = '', currentRow = null;
    $(function () {
      if (!parent.$('#qtsjSeq').val()) {
        setTime();
      } else {
        _seqCurrent = parent.$('#qtsjSeq').val();
      }
      getDataList();
      getDataGrid();
    })
  </script>
</body>

</html>