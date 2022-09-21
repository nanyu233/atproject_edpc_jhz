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
  <!-- <link rel="stylesheet" type="text/css" href="${baseurl}css/common/querylist.css" /> -->
  <link rel="stylesheet" type="text/css" href="${baseurl}css/hems/popbox.css?v=${versionDay}">
  <link rel="stylesheet" type="text/css" href="${baseurl}css/hems/listPrint/listPrint.css?v=${versionDay}">
  <%@ include file="/WEB-INF/jsp/base/common_js.jsp"%>
  <script type="text/javascript" src="${baseurl}lib/vue2.6.7/vue.js?v=${versionDay}"></script>
  <!-- <script type="text/javascript" src="${baseurl}lib/qrcode/qrcode.js?v=${versionDay}"></script> -->
  <script type="text/javascript" src="${baseurl}lib/qrcode/qrjs2.js?v=${versionDay}"></script>
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
      <input type="button" class="commonbtn" onclick="splitExecList()" value="医嘱拆分">
      <input type="button" class="commonbtn m-l10 canPrintShow" onclick="printPage('all')" value="全部打印">
      <!-- <input type="button" class="commonbtn m-l10 canPrintShow" onclick="printPage('current')" value="打印所选"> -->
      <p class="form-text">&nbsp;&nbsp;执行单日期：</p>
      <input class="input-min-date Wdate" id="emg_startDate" type="text" onclick="WdatePicker({dateFmt:'yyyy/MM/dd HH:mm',isShowClear:false,readOnly:true})"
        onchange="getCheckPrintTab('time')" />
      <p class="form-text">-</p>
      <input class="input-min-date Wdate" id="emg_endDate" type="text" onclick="WdatePicker({dateFmt:'yyyy/MM/dd HH:mm',isShowClear:false,readOnly:true})"
        onchange="getCheckPrintTab('time')" />
      <label>
        <p class="form-text cursor-type">
          <input name="printStatus" type="radio" value="0" onchange="getCheckPrintTab()" checked="checked" /> 未打印&nbsp;
        </p>
      </label>
      <label>
        <p class="form-text cursor-type">
          <input name="printStatus" type="radio" value="1" onchange="getCheckPrintTab()" /> 已打印&nbsp;
        </p>
      </label>
      <label>
        <p class="form-text cursor-type">
          <input name="printStatus" type="radio" value="" onchange="getCheckPrintTab()" /> 全部&nbsp;
        </p>
      </label>
      <!-- <p class="form-text">&nbsp;给药方式：</p>
      <select id="giveDictType" onchange="getCheckPrintTab()"></select> -->
      <a href="#" class="easyui-linkbutton" iconCls="icon-search" id="btn" onclick="getCheckPrintTab()">查询</a>
    </div>
    <ul id="rightMenu" class="rightMenu">
      <li onclick="printPage('all')">全部打印</li>
      <li onclick="printPage('current')">打印所选</li>
      <li onclick="notPrint()">不打印所选</li>
    </ul>
    <div class="m-l2 queryTabs">
      <div class="tab-wrap" id="tabWrapDiv">
        <div class="title-wrap panel-header">
          <div class="left-title panel-title">执行单明细</div>
          <div class="panel-tool right-icon">
            <a href="javascript:;" id="rightToolExpand" class="panel-tool-collapse" onclick="hideOrShowList()"></a>
          </div>
        </div>
        <table id="printList"></table>
      </div>
      <div id="printListWrap" v-cloak class="list-content">
        <div class="div-wrap" v-for="(item, index) in docSplitList" :class="[checkIdx === index ? 'active': '']">
          <div class="print-wrap" :id="'execDiv' + index" @click="checkCurrentItem(index)" :class="[item.isprint == 1 ? 'isAlreadyPrint' : '']">
            <span class="innerLeft" v-show="item.isprint == 2"></span>
            <span class="innerRight" v-show="item.isprint == 2"></span>
            <div class="print-content">
              <div class="full-div">
                <span class="big-size">
                  <!-- 无名氏2020070301 -->
                  {{item.cstNam}}
                </span>
                <span class="right-time small-time-fs">{{item.enterTime}}</span>
              </div>
              <div class="border-line full-div">
                <span class="right-gap-small">{{item.bedNum}}</span>
                <span class="right-gap">{{item.cstSex}}</span>
                <span class="right-gap">{{item.mpi}}</span>
                <span>{{item.source}}</span>
                <span class="small-title">剂量</span>
              </div>
              <div class="main-wrap full-div">
                <ul v-for="subItem in item.infoList">
                  <li class="eightLi">
                    <span v-if="subItem.highRisk =='高危'" class="riskFlg">(危)</span>
                    {{subItem.daInfo}}
                  </li>
                  <li class="twoLi">{{subItem.daDose}}{{subItem.daUnit}}</li>
                </ul>
              </div>
              <div class="drug-wrap full-div">
                <span class="time-span" v-if="item.dispenseDate">配药时间:{{item.dispenseDate}}</span>
                <span class="time-span" v-if="!item.dispenseDate">配药时间:</span>
                &nbsp;
                签名:<span></span><span v-show="item.isShowRisk == true">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;/</span>
              </div>
              <div class="bottom-line full-div">
                <span :class="[item.daFreq.length > 8 ? 'long-span small-font' : 'heavy-font long-span']">{{item.daFreq}}</span>
                <span class="heavy-font">{{item.daWay}}</span>
                <span :id="'disposalSeq' + index" style="display: none;">{{item.disposalSeq}}</span>
                <span class="qrCode">
                  <span :id="'qrCode' + index" class="qrCodeSpan"></span>
                </span>
              </div>
            </div>
          </div>
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

    function getPrintTab(type) {
      if (type === 'onload') {
        var height = 0.975 * ($('#tabs', parent.parent.parent.document).height() - 28 - 29) - 57,
          _listHeight = height * 0.45,
          _printHeight = height * 0.55 - 32 - 4;
        $('#printList').height(_listHeight);
        $('#printListWrap').height(_printHeight)
        // $('.div-wrap').css({'min-height': _printHeight - 5 + 'px'})
        $('.title-wrap').css('border-bottom', 'none');
      }
      var _column = [
        [
          {
            field: 'mpi',
            title: 'MPI',
            width: getWidth(0.06),
            hidden: true
          },
          {
            field: 'isprint',
            title: '打印状态',
            width: getWidth(0.04),
            formatter: function (value, row, index) {
              if (value === '0' || value === 0) {
                return '未打印'
              } else if (value === '1' || value === 1) {
                return '已打印'
              } else if (value === '2' || value === 2) {
                return '不打印'
              } else if (value === '') {
                return '全部'
              } else {
                return ''
              }
            }
          },
          {
            field: 'zxdzt',
            title: '执行单状态',
            sortable: true,
            width: getWidth(0.05),
            formatter: function (value, row, index) {
              var _zxList = publicFun.getDict('EXEC_STATUS');
              for (var i = 0; i < _zxList.length; i++) {
                if (_zxList[i].infocode === value) {
                  return _zxList[i].info
                }
              }
            }
          },
          {
            field: 'zxddat',
            title: '开单时间',
            sortable: true,
            width: getWidth(0.09),
            formatter: function (value, row, index) {
              return value
                ? publicFun.timeFormat(value, 'yyyy/MM/dd hh:mm')
                : ''
            }
          },
          {
            field: 'daInfo',
            title: '医嘱内容',
            sortable: true,
            width: getWidth(0.15),
            formatter: function (value, row) {
              var objItemList = {
                highRiskList: [],
                daInfoList: []
              };
              var keySplitList = ['highRisk', 'daInfo'];
              for (var i = 0; i < keySplitList.length; i++) {
                var _item = keySplitList[i];
                if (row[_item]) {
                  objItemList[_item + 'List'] = row[_item].split('|br');
                }
              }
              var rtnStr = '', _allLength = objItemList.daInfoList.length;
              for (var i = 0; i < _allLength; i++) {
                for (var j = 0; j < keySplitList.length; j++) {
                  if (!objItemList[keySplitList[j] + 'List'][i]) {
                    objItemList[keySplitList[j] + 'List'][i] = ''
                  }
                }
                var _totalMsg = objItemList.daInfoList[i] + '<br/>'
                if (objItemList.highRiskList[i] == '高危') {
                  rtnStr += '<span style=\"color: red;font-weight:bold;\">(危)</span>  ' + _totalMsg
                } else {
                  rtnStr += _totalMsg
                }
              }
              return rtnStr
            }
          },
          {
            field: 'daDose',
            title: '剂量',
            sortable: true,
            width: getWidth(0.04),
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
          {
            field: 'dispenseDate',
            title: '配药时间',
            sortable: true,
            width: getWidth(0.09),
            formatter: function (value, row, index) {
              return value
                ? publicFun.timeFormat(value, 'yyyy/MM/dd hh:mm')
                : ''
            }
          },
          {
            field: 'dispenseUserxm',
            title: '配药护士',
            sortable: true,
            width: getWidth(0.06)
          },
          {
            field: 'dispenseUserxmSecond',
            title: '配药核对',
            sortable: true,
            width: getWidth(0.06)
          },
          {
            field: 'execTime',
            title: '执行时间',
            sortable: true,
            width: getWidth(0.09),
            formatter: function (value, row, index) {
              return value
                ? publicFun.timeFormat(value, 'yyyy/MM/dd hh:mm')
                : ''
            }
          },
          {
            field: 'execUserxm',
            title: '执行护士',
            sortable: true,
            width: getWidth(0.06)
          },
          {
            field: 'execUserxmSecond',
            title: '执行核对',
            sortable: true,
            width: getWidth(0.06)
          }
        ]
      ];
      $('#printList').datagrid({
        title: "",
        nowrap: false,
        striped: true,
        singleSelect: true,
        url: '${baseurl}cfxx/getCfxxExecList.do',
        idField: 'execSeq',
        loadMsg: '',
        columns: _column,
        pagination: false,
        rownumbers: true,
        // collapsed: true,
        // collapsible: true,
        // title: "执行单明细",
        // pageList: [15, 30, 50],
        queryParams: {
          'hspCfxxExecCustom.mpi': currentBasicMsg.mpi,
          'startdate': $('#emg_startDate').val(),
          'enddate': $('#emg_endDate').val(),
          'hspCfxxExecCustom.isprint': $('input:radio[name="printStatus"]:checked').val(),
          //  'hspCfxxExecCustom.daWayCod': $('#giveDictType').val()
        },
        loadFilter: function (data) {
          if (data.resultInfo && data.resultInfo.messageCode == '109') {
            message_alert(data, function () {
              window.location.href = "${baseurl}first.do";
            });
          } else if (data.resultInfo && data.resultInfo.messageCode == '900') {
            publicFun.alert(data.resultInfo.message)
          }
          // data.rows = [{mpi: '1', isprint: '1', zxddat: 1573142400000, daInfo: '5%葡萄糖|br莫西车', daDose: '0.5|br200',daUnit: 'g|brml', num: '2|br4',yfdw: 'c|brm', daFreq: '5Qt', daWay: '静脉注射',planTime: '', zxdzt: '1', execUserxm: 'yhl', execTime: ''}];
          return data;
        },
        onLoadSuccess: function () {
          // if (type === 'onload') {
          //   setTimeout(function () {
          //     $('.panel-body').css({'display': 'none'});
          //   }, 100);
          // }
        }
      });
    }

    function splitExecList() {
      publicFun.httpServer({ url: _baseUrl + 'cfxx/adviceSplit.do' }, {
        'startdate': $('#emg_startDate').val(),
        'enddate': $('#emg_endDate').val(),
        'hspCfxxExecCustom.mpi': currentBasicMsg.mpi
      }, function (res) {
        if (res.resultInfo.type === 1) {
          getPrintTab()
          getAlreadyAdviceSplit()
          // createmodalwindow('药物医嘱拆分', 842, 420, _baseUrl + 'cfxx/toListPrint.do')
        } else {
          message_alert(res);
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
      // initSelectContent();
    }

    //查询方法
    function getCheckPrintTab(type) {
      // if (type === 'time') {
      //   initSelectContent()
      // }
      getPrintTab()
      getAlreadyAdviceSplit()
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
          getPrintTab('onload')
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
            // var _timeList = ['zxddat', 'enterTime', 'dispenseDate'];
            // for (var i = 0; i < _timeList.length; j++) {
            //   if (item[_timeList[j]]) {
            //     item[_timeList[j]] = publicFun.timeFormat(new Date(item[_timeList[j]]), 'yyyy-MM-dd hh:mm') 
            //   }
            // }
            if (item.zxddat) {
              item.zxddat = publicFun.timeFormat(new Date(item.zxddat), 'yyyy-MM-dd hh:mm')
            }
            if (item.dispenseDate) {
              item.dispenseDate = publicFun.timeFormat(new Date(item.dispenseDate), 'yyyy-MM-dd hh:mm')
            }
            if (item.enterTime) {
              item.enterTime = publicFun.timeFormat(new Date(item.enterTime), 'yyyy-MM-dd hh:mm')
            }
            if (item.highRisk) {
              item.highRisk = item.highRisk.split('|br')
            }
            item.isShowRisk = false;
            for (var j = 0; j < item.infoList.length; j++) {
              item.infoList[j].highRisk = item.highRisk[j]
              if (item.highRisk[j] == '高危') {
                item.isShowRisk = true;
              }
            }
            item.bedNum = basicMsg.bedNum;
            item.cstNam = basicMsg.cstNam;
            item.cstSex = basicMsg.cstSexCod;
            item.emgDat = basicMsg.emgDatStr;
            item.vstCad = basicMsg.vstCad;
            item.source = basicMsg.bedPlace;
            item.mpi = currentBasicMsg.mpi;
          }
          that.$nextTick(function () {
            for (var i = 0; i < that.docSplitList.length; i++) {
              $('#qrCode' + i).html('');
              // new QRCode('qrCode' + i, {
              //   text: that.docSplitList[i].disposalSeq,
              //   width: 45 * 2,
              //   height: 45 * 2,
              //   colorDark : '#000000',
              //   colorLight : '#ffffff',
              //   correctLevel : QRCode.CorrectLevel.H
              // });
              var container1 = document.getElementById('qrCode' + i);
              var dataUriPngImage = document.createElement("img");
              var s = QRCode.generatePNG(that.docSplitList[i].disposalSeq, {
                ecclevel: "M",
                format: "html",
                fillcolor: "#FFFFFF",
                textcolor: "#373737",
                margin: 0,
                modulesize: 25
              });
              dataUriPngImage.src = s;
              container1.appendChild(dataUriPngImage);
            }
          })
        },
        checkCurrentItem: function (idx) {
          vm.checkIdx = idx
        }
      }
    })

    // 不打印
    function notPrint() {
      if (vm.checkIdx === '' || vm.checkIdx == null) {
        publicFun.alert('请选择不打印数据')
        return;
      }
      // if (vm.docSplitList[vm.checkIdx].isprint == '1') {
      //   publicFun.alert('该数据已打印')
      //   return;
      // }
      changePrintState('current', '2');
    }

    var LODOP;
    function printPage(type) {
      if (type === 'current') {
        if (vm.checkIdx === '' || vm.checkIdx == null) {
          publicFun.alert('请选择打印数据')
          return;
        }
      }
      changePrintState(type, '1')
      //打印预览 => 先注释到时候再打开
      var printCss = "<link rel='stylesheet' type='text/css' href='${baseurl}css/hems/listPrint/print.css?v=${versionDay}'>";
      LODOP = getLodop();
      LODOP.PRINT_INITA(0, 0, "64mm", "48mm", "print4");		// (增强型)打印初始化	PRINT_INIT(Top, Left, Width, Height, strPrintName)
      LODOP.SET_PRINT_PAGESIZE(0, "64mm", "48mm", "");	// 设定纸张大小
      LODOP.SET_PRINT_MODE("NOCLEAR_AFTER_PRINT", true);	// 设置打印模式	|"NOCLEAR_AFTER_PRINT"：设置打印或预览后内容不清空是否为真。
      if (type == 'current') {
        LODOP.ADD_PRINT_HTM('3mm', 0, '64mm', '48mm', printCss + $('#execDiv' + vm.checkIdx).html());
        LODOP.ADD_PRINT_BARCODE('34mm', '42mm', '21mm', '22mm', "QRCode", $('#disposalSeq' + vm.checkIdx).text());
        LODOP.NewPageA();
      } else {
        for (var i = 0; i < vm.docSplitList.length; i++) {
          if (vm.docSplitList[i].isprint != '2') {
            LODOP.ADD_PRINT_HTM('3mm', 0, '64mm', '48mm', printCss + $('#execDiv' + i).html());
            LODOP.ADD_PRINT_BARCODE('34mm', '42mm', '21mm', '22mm', "QRCode", $('#disposalSeq' + i).text());
            LODOP.NewPageA();
          }
        }
      }
      LODOP.SET_PRINT_STYLE("FontSize", 8);	// 设置打印项的输出风格	|"FontSize"： 设定纯文本打印项的字体大小。
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

    function changePrintState(printType, printFlg) {
      var _disposalSeqStr = '';
      if (printType === 'current') {
        _disposalSeqStr = vm.docSplitList[vm.checkIdx].disposalSeq;
        changeState(_disposalSeqStr, printFlg);
      } else {
        for (var i = 0; i < vm.docSplitList.length; i++) {
          if (vm.docSplitList[i].isprint != '2') { // 全部打印 要过滤不打印的
            _disposalSeqStr += vm.docSplitList[i].disposalSeq + ','
          }
        }
        changeState(_disposalSeqStr, printFlg);
      }
    }

    function changeState(seq, printFlg) {
      // hspCfxxExecCustom.isprint （打印传 1， 不打印传 2）
      publicFun.httpServer({ url: '${baseurl}cfxx/printExec.do' }, { 'hspCfxxExecCustom.disposalSeq': seq, 'hspCfxxExecCustom.isprint': printFlg }, function (res) {
        // message_alert(res);
        if (res.resultInfo.type == 1) {
          getPrintTab()
          getAlreadyAdviceSplit()
        } else {
          message_alert(res);
        }
      })
    }

    function getAlreadyAdviceSplit() {
      publicFun.httpServer({ url: _baseUrl + 'cfxx/adviceSplitPrint.do' },
        {
          'hspCfxxExecCustom.mpi': currentBasicMsg.mpi,
          'startdate': $('#emg_startDate').val(),
          'enddate': $('#emg_endDate').val(),
          'hspCfxxExecCustom.isprint': $('input:radio[name="printStatus"]:checked').val()
        }, function (res) {
          if (res.type === 1) {
            allExecMsg = res.sysdata.execList;
            if (allExecMsg.length > 0) {
              $('.canPrintShow').attr('disabled', false);
              $('.canPrintShow').removeClass('disabledBtn');
            } else {
              $('.canPrintShow').attr('disabled', true);
              $('.canPrintShow').addClass('disabledBtn');
            }
            vm.setPrintListMsg()
            // createmodalwindow('药物医嘱拆分', 842, 420, _baseUrl + 'cfxx/toListPrint.do')
          }
        })
    }


    /**
     * [getMousePos 获取鼠标当前位置]
     */
    function getMousePos(event) {
      var e = event || window.event;
      var scrollX = document.documentElement.scrollLeft || document.body.scrollLeft;
      var scrollY = document.documentElement.scrollTop || document.body.scrollTop;
      var x = e.pageX || e.clientX + scrollX;
      var y = e.pageY || e.clientY + scrollY;
      return { 'x': x, 'y': y };
    }

    /**
     * [右键点击显示菜单]
     */
    var rightMenu = document.getElementById("rightMenu");
    document.oncontextmenu = function (e) {
      if ($('.canPrintShow').hasClass('disabledBtn')) {
        return true;
      }
      var mousePosition = getMousePos(e);
      var x = mousePosition['x'],
        y = mousePosition['y'];
      var Height = document.documentElement.clientHeight || document.body.clientHeight;
      var Width = document.documentElement.clientWidth || document.body.clientWidth;
      var maxWidth = Width - 10;
      var maxHeight = Height - $('#rightMenu').height() - 10;
      if (x >= maxWidth) {
        x = maxWidth
      }
      if (y >= maxHeight) {
        y = maxHeight
      }
      if (y <= 40) {
        y = 40
      }
      rightMenu.style.display = "block";
      rightMenu.style.left = x + "px";
      rightMenu.style.top = y + "px";
      if (x <= maxWidth && y >= 40 && y <= maxHeight) {
        return false; //一般点击右键会出现浏览器默认的右键菜单，写了这句代码就可以阻止该默认事件。
      } else {
        return true;
      }
    }
    document.onclick = function (e) {
      var e = e || window.event;
      rightMenu.style.display = "none"
    }
    rightMenu.onclick = function (e) {
      var e = e || window.event;
      var mousePosition = getMousePos(e);
      var x = mousePosition['x'],
        y = mousePosition['y'];
      var Height = document.documentElement.clientHeight || document.body.clientHeight;
      var Width = document.documentElement.clientWidth || document.body.clientWidth;
      var maxWidth = Width - 10;
      var maxHeight = Height - $('#rightMenu').height() - 10;
      if (x <= maxWidth && y >= 40 && y <= maxHeight) {
        e.cancelBubble = true
      } else {
        e.cancelBubble = false
      }
    }

    function hideOrShowList() {
      var tbHeight = 0.975 * ($('#tabs', parent.parent.parent.document).height() - 28 - 29) - 57,
        _tbPrintHeight = ''
      _listHeight = tbHeight * 0.45;
      if ($('#rightToolExpand').hasClass('panel-tool-expand')) {
        $('#rightToolExpand').removeClass('panel-tool-expand')
        $('.panel-body').css({ 'display': 'block' });
        _tbPrintHeight = tbHeight * 0.55 - 32 - 4;
        $('#printListWrap').height(_tbPrintHeight)
        // $('#printList').height(_listHeight);
        // $('.div-wrap').css({'min-height': _tbPrintHeight - 5 + 'px'})
        $('.title-wrap').css('border-bottom', 'none');
        getPrintTab(); // 打开的时候 执行一下查询
      } else {
        _tbPrintHeight = tbHeight - 32 - 4;
        $('#printListWrap').height(_tbPrintHeight)
        // $('#printList').height(0);
        // $('.div-wrap').css({'min-height': _tbPrintHeight - 5 + 'px'})
        $('#rightToolExpand').addClass('panel-tool-expand')
        $('.panel-body').css({ 'display': 'none' });
        $('.title-wrap').css('border-bottom', '1px solid #95B8E7')
      }
    }
    // 加载datagrid
    $(function () {
      getCurrentBasicMsg()
    })

  </script>
</body>

</html>