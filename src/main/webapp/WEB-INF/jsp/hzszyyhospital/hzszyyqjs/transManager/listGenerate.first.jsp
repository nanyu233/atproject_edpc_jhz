<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/base/tag.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
  <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1" />
  <%@ include file="/WEB-INF/jsp/base/common_css.jsp"%>
  <link rel="stylesheet" type="text/css" href="${baseurl}css/hems/global.css?090" />
  <link rel="stylesheet" type="text/css" href="${baseurl}css/common/querylist.css" />
  <link rel="stylesheet" type="text/css" href="${baseurl}css/hems/popbox.css?v=${versionDay}">
  <link rel="stylesheet" type="text/css" href="${baseurl}css/hems/listPrint/listPrint.css?v=${versionDay}">
  <%@ include file="/WEB-INF/jsp/base/common_js.jsp"%>
  <script type="text/javascript" src="${baseurl}lib/vue2.6.7/vue.js?v=${versionDay}"></script>
  <script type="text/javascript" src="${baseurl}lib/qrcode/qrcode.js?v=${versionDay}"></script>
  <script language="javascript" src="${baseurl}Lodop6.216/LodopFuncs.js"></script>
  <title>护士站-执行单生成/打印</title>
  <script>
    var _baseUrl = '${baseurl}',
      _username = '${sessionScope.activeUser.usrname}';
  </script>
</head>

<body class="queryjzjl queryyzxx">
  <form>
    <div class="form clr">
      <p class="form-text">执行单日期：</p>
      <input class="input-min-date Wdate" id="emg_startDate" type="text" onclick="WdatePicker({dateFmt:'yyyy/MM/dd HH:mm',isShowClear:false,readOnly:true})"
        onchange="getCheckPrintTab('time')" />
      <p class="form-text">-</p>
      <input class="input-min-date Wdate" id="emg_endDate" type="text" onclick="WdatePicker({dateFmt:'yyyy/MM/dd HH:mm',isShowClear:false,readOnly:true})"
        onchange="getCheckPrintTab('time')" />
      <p class="form-text">&nbsp;给药方式：</p>
      <select id="giveDictType" onchange="getCheckPrintTab()"></select>
      <a href="#" class="easyui-linkbutton" iconCls="icon-search" id="btn" onclick="getCheckPrintTab()">查询</a>
    </div>
    <div class="m-l2 queryTabs">
      <table id="printList"></table>
      <div id="printListWrap" v-cloak class="list-content">
        <div class="div-wrap">
          <div class="print-wrap" v-for="(item, index) in docSplitList" :id="'execDiv' + index" @click="checkCurrentItem(index)"
            :class="checkIdx === index ? 'active': ''">
            <span class="innerLeft" v-show="item.isprint == 1"></span>
            <span class="innerRight" v-show="item.isprint == 1"></span>
            <div class="print-content">
              <div>
                <span class="right-gap">{{item.bedNum}}</span>
                <span>{{item.cstNam}}</span>
                <span class="right-time">{{item.emgDat}}</span>
              </div>
              <div class="border-line">
                <span class="right-gap">{{item.cstSex}}</span>
                <span class="right-gap">{{item.vstCad}}</span>
                <span>{{item.source}}</span>
                <span class="small-title">剂量</span>
              </div>
              <div class="main-wrap">
                <ul v-for="subItem in item.infoList">
                  <li class="eightLi">{{subItem.daInfo}}</li>
                  <li class="twoLi">{{subItem.daDose}}{{subItem.daUnit}}</li>
                </ul>
              </div>
              <div class="bottom-line">
                <span class="heavy-font long-span">{{item.daFreq}}</span>
                <span class="heavy-font">{{item.daWay}}</span>
                <span :id="'qrCode' + index" class="qrCode"></span>
              </div>
            </div>
          </div>
        </div>
        <div class="center-btn" v-show="docSplitList.length > 0">
          <a class="easyui-linkbutton" iconCls="icon-print" onclick="printPage('all')">全部打印</a>
          <a class="easyui-linkbutton" iconCls="icon-print" onclick="printPage('current')">打印所选</a>
        </div>
      </div>
    </div>
  </form>
  <script type="text/javascript">
    var allExecMsg; // 子页面的执行单数据
    function getDealSeqStr(_getCheckList, seq) {
      var _seqStr = '', _seqList = [];
      _getCheckList.map(function (val, idx) {
        var _seqCod = 'mpi', seqVal = '';
        if (seq) {
          _seqCod = seq;
        }
        seqVal = val[_seqCod];
        if (val && seqVal) {
          _seqList = seqVal.split('|br');
          if (!seq) {
            if (_seqList.length > 1) {
              seqVal = _seqList[0]
            }
          }
          _seqStr += seqVal + ',';
        }
      })
      return _seqStr
    }

    function getPrintTab() {
      var height = 0.975 * ($('#tabs', parent.parent.parent.document).height() - 28 - 29) - 57,
        _listHeight = height * 0.6,
        _printHeight = height * 0.4;
      $('#printList').height(_listHeight)
      $('#printListWrap').height(_printHeight)
      $('.div-wrap').css({'min-height': _printHeight - 38 + 'px'})
      var _column = [
        [
          {
            checkbox: true,
            field: 'ck'
          },
          {
            field: 'mpi',
            title: 'MPI',
            width: getWidth(0.06)
          },
          {
            field: 'isprint',
            title: '状态',
            width: getWidth(0.04),
            formatter: function (value, row, index) {
              if (value === '0' || value === 0) {
                return '未打印'
              } else if (value === '1' || value === 1) {
                return '已打印'
              } else if (value === '') {
                return '全部'
              } else {
                return ''
              }
            }
          },
          {
            field: 'zxddat',
            title: '开单时间',
            sortable: true,
            width: getWidth(0.1),
            formatter: function (value, row, index) {
              return value
                ? publicFun.timeFormat(value, 'yyyy/MM/dd hh:mm')
                : ''
            }
          },
          {
            field: 'daInfo',
            title: '内容',
            sortable: true,
            width: getWidth(0.2),
            formatter: function (value, row) {
              return splitToDropLine(value)
            }
          },
          {
            field: 'daDose',
            title: '剂量',
            sortable: true,
            width: getWidth(0.06),
            formatter: function (value, row) {
              var valueList = [], unitList = [], rtnStr = '';
              if (value) {
                valueList = value.split('|br');
              }
              if (row.daUnit) {
                unitList = row.daUnit.split('|br');
              }
              for (var i = 0; i < valueList.length; i++) {
                if (!valueList[i]) {
                  valueList[i] = ''
                }
                if (!unitList[i]) {
                  unitList[i] = ''
                }
                rtnStr += valueList[i] + unitList[i] + '<br/>'
              }
              return rtnStr
            }
          },
          // {
          //   field: 'num',
          //   title: '数量',
          //   width: getWidth(0.03),
          //   formatter: function (value, row) {
          //     return initDrugNum(value, row.yfdw)
          //   }
          // },
          {
            field: 'daFreq',
            title: '频次',
            sortable: true,
            width: getWidth(0.06)
          },
          {
            field: 'daWay',
            title: '给药方式',
            sortable: true,
            width: getWidth(0.05)
          },
          // {
          //   field: 'planTime',
          //   title: '计划执行时间',
          //   sortable: true,
          //   width: getWidth(0.09),
          //   formatter: function (value, row, index) {
          //     return value
          //       ? publicFun.timeFormat(value, 'yyyy/MM/dd hh:mm')
          //       : ''
          //   }
          // },
          {
            field: 'zxdzt',
            title: '执行单状态',
            sortable: true,
            width: getWidth(0.07),
            formatter: function (value, row, index) {
              if (value === '1' || value === 1) {
                return '未执行'
              } else if (value === '2' || value === 2) {
                return '已执行'
              } else if (value == 3) {
                return '中断执行'
              } else if (value == 8) {
                return '待拆分'
              } else if (value === '0' || value === 0) {
                return '待配药'
              }
            }
          },
          {
            field: 'execUserxm',
            title: '执行护士',
            sortable: true,
            width: getWidth(0.09)
          },
          {
            field: 'execTime',
            title: '执行时间',
            sortable: true,
            width: getWidth(0.1),
            formatter: function (value, row, index) {
              return value
                ? publicFun.timeFormat(value, 'yyyy/MM/dd hh:mm')
                : ''
            }
          }
        ],
      ];
      $('#printList').datagrid({
        title: "",
        nowrap: false,
        striped: true,
        singleSelect: false,
        url: '${baseurl}cfxx/getCfxxExecList.do',
        idField: 'execSeq',
        loadMsg: '',
        columns: _column,
        pagination: false,
        rownumbers: true,
        // pageList: [15, 30, 50],
        queryParams: {
          'hspCfxxExecCustom.mpi': currentBasicMsg.mpi,
          'startdate': $('#emg_startDate').val(),
          'enddate': $('#emg_endDate').val(),
          // 'hspCfxxExecCustom.isprint': $('input:radio[name="printStatus"]:checked').val(),
          'hspCfxxExecCustom.isprint': '',
          'hspCfxxExecCustom.daWayCod': $('#giveDictType').val()
        },
        toolbar: [
          {
            //工具栏
            id: 'print',
            text: '医嘱拆分',
            iconCls: 'icon-print',
            handler: function () {
              var _checkList = $('#printList').datagrid('getChecked');
              var execSeqStr;
              if (_checkList && _checkList.length > 0) {
                execSeqStr = getDealSeqStr(_checkList, 'disposalSeq');
                splitExecList(execSeqStr)
              } else {
                publicFun.alert('请勾选拆分项！')
              }
            }
          }
        ],
        loadFilter: function (data) {
          if (data.resultInfo && data.resultInfo.messageCode == '109') {
            message_alert(data, function () {
              window.location.href = "${baseurl}/first.do";
            });
          }
          // data.rows = [{mpi: '1', isprint: '1', zxddat: 1573142400000, daInfo: '5%葡萄糖|br莫西车', daDose: '0.5|br200',daUnit: 'g|brml', num: '2|br4',yfdw: 'c|brm', daFreq: '5Qt', daWay: '静脉注射',planTime: '', zxdzt: '1', execUserxm: 'yhl', execTime: ''}];
          return data;
        }
      });
    }

    function splitExecList (execSeqStr) {
      var postParam = {};
      if (execSeqStr) {
        postParam = {
          'disposalSeqStr': execSeqStr
        }
      }
      publicFun.httpServer({ url: _baseUrl + 'cfxx/adviceSplit.do' }, postParam, function (res) {
        if (res.resultInfo.type === 1) {
          getPrintTab()
          getAlreadyAdviceSplit()
          // createmodalwindow('药物医嘱拆分', 842, 420, _baseUrl + 'cfxx/toListPrint.do')
        }
      })
    }

    function splitToDropLine(value) {
      if (value) {
        return value.replace(/\|br/g, '<br/>');
      }
      return value;
    }

    // function initDrugNum(value, unit) {
    //   var valueList = [], unitList = [], rtnStr = '';
    //   if (value) {
    //     valueList = value.split('|br');
    //   }
    //   if (unit) {
    //     unitList = unit.split('|br');
    //   }
    //   for (var i = 0; i < valueList.length; i++) {
    //     rtnStr += valueList[i] + unitList[i] + '<br/>'
    //   }
    //   return rtnStr
    // }

    function getWidth(proportion) {
      var width = $('body').width()
      return Math.round(proportion * width)
    }

    function setTime(basicMsg) {
      if (basicMsg.emgDatStr) {
        $('#emg_startDate').val(basicMsg.emgDatStr)
      }
      if (basicMsg.sqlDat) {
        $('#emg_endDate').val(basicMsg.sqlDat)
      } else {
        var _today = publicFun.timeFormat(new Date(), 'yyyy/MM/dd hh:mm')
        $('#emg_endDate').val(_today)
      }
      initSelectContent();
    }

    //查询方法
    function getCheckPrintTab(type) {
      if (type === 'time') {
        initSelectContent()
      }
      getPrintTab()
    }

    function initSelectContent() {
      publicFun.httpServer({ url: _baseUrl + 'cfxx/getDaWayByDate.do' }, {
        'startdate': $('#emg_startDate').val(),
        'enddate': $('#emg_endDate').val(),
        'hspCfxxExecCustom.mpi': currentBasicMsg.mpi
      }, function (res) {
        if (res.type == 1) {
          var _selList = res.sysdata.daWayList;
          if (_selList.length > 0) {
            var _selStr = '<option value="">全部</option>';
            _selList.forEach(function (val, idx) {
              _selStr += '<option value=\"' + val.daWayCod + '\">' + val.daWayStr + '</option>'
            })
            $('#giveDictType').html(_selStr)
          }
        }
      })
      // var _selList = publicFun.getDict('GYFS');
      // 摇匀口服,微泵1,外用，漱口,口服，静推3,静脉输液，肌注1，冲洗,鼻饲(口服)，鼻饲，膀胱冲洗
      // var _selList = [{info: '全部', infocode: ''}, {info: '摇匀口服', infocode: '摇匀口服'}, {info: '微泵1', infocode: '微泵1'}, {info: '外用', infocode: '外用'}, 
      // {info: '漱口', infocode: '漱口'}, {info: '口服', infocode: '口服'}, {info: '静推3', infocode: '静推3'}, {info: '静脉输液', infocode: '静脉输液'},
      // {info: '肌注1', infocode: '肌注1'}, {info: '冲洗', infocode: '冲洗'}, {info: '鼻饲(口服)', infocode: '鼻饲(口服)'}, {info: '鼻饲', infocode: '鼻饲'}, {info: '膀胱冲洗', infocode: '膀胱冲洗'}]
    }
    var currentBasicMsg = {};
    function getCurrentBasicMsg() {
      publicFun.httpServer({ url: '${baseurl}cfxx/getEmgInfData.do' }, { emgSeq: parent._emgSeq }, function (res) {
        if (res.type == '1') {
          currentBasicMsg = res.sysdata.hspemginfCustom;
          setTime(currentBasicMsg);
          getPrintTab()
          getAlreadyAdviceSplit()
        }
      })
    }

    var vm = new Vue({
      el: '#printListWrap',
      data: function () {
        return {
          checkIdx: '',
          docSplitList: []
        }
      },
      methods: {
        setPrintListMsg: function () {
          var that = this, basicMsg = currentBasicMsg;
          if (basicMsg.bedPlace == '290') {
            basicMsg.bedPlace = '留观室'
          } else if (basicMsg.bedPlace == '291') {
            basicMsg.bedPlace = '抢救室'
          }
          that.docSplitList = [];
          that.docSplitList = JSON.parse(JSON.stringify(allExecMsg))
          for (var i = 0; i < that.docSplitList.length; i++) {
            var item = that.docSplitList[i];
            item.bedNum = basicMsg.bedNum;
            item.cstNam = basicMsg.cstNam;
            item.cstSex = basicMsg.cstSexCod;
            item.emgDat = basicMsg.emgDatStr;
            item.vstCad = basicMsg.vstCad;
            item.source = basicMsg.bedPlace;
          }
          that.$nextTick(function () {
            for (var i = 0; i < that.docSplitList.length; i++) {
              $('#qrCode' + i).html('');
              new QRCode('qrCode' + i, {
                text: that.docSplitList[i].disposalSeq,
                width: 40,
                height: 40
              });
            }
          })
        },
        checkCurrentItem: function (idx) {
          vm.checkIdx = idx
        }
      }
    })

    var LODOP;
    function printPage(type) {
      if (type === 'current') {
        if (vm.checkIdx === '' || vm.checkIdx == null) {
          publicFun.alert('请选择打印数据')
          return;
        }
      }
      changePrintState(type)
      //打印预览 => 先注释到时候再打开
      var printCss = "<link rel='stylesheet' type='text/css' href='${baseurl}css/hems/listPrint/print.css?v=${versionDay}'>";
      LODOP = getLodop();
      LODOP.PRINT_INITA(0, 0, "80mm", "55mm", "print4");		// (增强型)打印初始化	PRINT_INIT(Top, Left, Width, Height, strPrintName)
      LODOP.SET_PRINT_PAGESIZE(0, "80mm", "55mm", "");	// 设定纸张大小
      LODOP.SET_PRINT_MODE("NOCLEAR_AFTER_PRINT", true);	// 设置打印模式	|"NOCLEAR_AFTER_PRINT"：设置打印或预览后内容不清空是否为真。
      if (type == 'current') {
        LODOP.ADD_PRINT_HTM(0, 0, '100%', '100%', printCss + $('#execDiv' + vm.checkIdx).html());
        LODOP.NewPageA();
      } else {
        for (var i = 0; i < vm.docSplitList.length; i++) {
          LODOP.ADD_PRINT_HTM(0, 0, '100%', '100%', printCss + $('#execDiv' + i).html());
          LODOP.NewPageA();
        }
      }
      LODOP.SET_PRINT_STYLE("FontSize", 10);	// 设置打印项的输出风格	|"FontSize"： 设定纯文本打印项的字体大小。
      LODOP.SET_PRINTER_INDEXA("print4");	//(增强型)指定打印设备
      LODOP.PRINT();
      // LODOP.PREVIEW();
      // //云打印C-Lodop返回结果用回调函数:
      // if (LODOP.CVERSION) {
      //   CLODOP.On_Return = function (TaskID, Value) {
      //     if (value == 1) {
      //       changePrintState(type)
      //     } else {
      //       alert('没打印成功 -非ie')
      //     }
      //   };
      // }
      // if (LODOP.PRINTA()) {
      //   changePrintState(type)
      // } else {
      //   alert('没打印成功 -ie')
      // }
      // LODOP.PRINT();
      // LODOP.PREVIEW();
    }

    function changePrintState(printType) {
      var _execSeqStr = '';
      if (printType === 'current') {
        _execSeqStr = vm.docSplitList[vm.checkIdx].execSeq;
        changeState(_execSeqStr);
      } else {
        for (var i = 0; i < vm.docSplitList.length; i++) {
          _execSeqStr += vm.docSplitList[i].execSeq + ','
        }
        changeState(_execSeqStr);
      }
    }

    function changeState(seq) {
      publicFun.httpServer({ url: '${baseurl}cfxx/printExec.do' }, { 'execSeqStr': seq }, function (res) {
        // message_alert(res);
        if (res.resultInfo.type == 1) {
          getPrintTab()
          getAlreadyAdviceSplit()
        }
      })
    }

    function getAlreadyAdviceSplit () {
      publicFun.httpServer({ url: _baseUrl + 'cfxx/adviceSplitPrint.do' }, {'hspCfxxExecCustom.mpi': currentBasicMsg.mpi}, function (res) {
        if (res.type === 1) {
          allExecMsg = res.sysdata.execList;
          vm.setPrintListMsg()
          // createmodalwindow('药物医嘱拆分', 842, 420, _baseUrl + 'cfxx/toListPrint.do')
        }
      })
    }

    // 加载datagrid
    $(function () {
      getCurrentBasicMsg()
    })

  </script>
</body>

</html>