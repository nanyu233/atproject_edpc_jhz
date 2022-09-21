<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/base/tag.jsp"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>

<head>
  <meta charset="UTF-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
  <title>药物医嘱拆分--打印</title>
  <%@ include file="/WEB-INF/jsp/base/common_css.jsp"%>
  <%@ include file="/WEB-INF/jsp/base/common_js.jsp"%>
  <link rel="stylesheet" type="text/css" href="${baseurl}css/hems/popbox.css?v=${versionDay}">
  <link rel="stylesheet" type="text/css" href="${baseurl}css/hems/listPrint/listPrint.css?v=${versionDay}">
  <script type="text/javascript" src="${baseurl}lib/vue2.6.7/vue.js?v=${versionDay}"></script>
  <script type="text/javascript" src="${baseurl}lib/qrcode/qrcode.js?v=${versionDay}"></script>
  <script language="javascript" src="${baseurl}Lodop6.216/LodopFuncs.js"></script>
</head>

<body>
  <div id="listPrint" v-cloak class="list-content">
    <div class="div-wrap">
      <div class="print-wrap" v-for="(item, index) in docSplitList" :id="'execDiv' + index" @click="checkCurrentItem(index)"
        :class="checkIdx === index ? 'active': ''">
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
    <div class="center-btn">
      <a class="easyui-linkbutton" iconCls="icon-print" onclick="printPage('all')">全部打印</a>
      <a class="easyui-linkbutton" iconCls="icon-print" onclick="printPage('current')">打印所选</a>
    </div>
  </div>
  <script type="text/javascript">
    var vm = new Vue({
      el: '#listPrint',
      data: function () {
        return {
          checkIdx: '',
          docSplitList: []
        }
      },
      created: function () {
        var that = this, basicMsg = parent.currentBasicMsg;
        if (basicMsg.bedPlace == '290') {
          basicMsg.bedPlace = '留观室'
        } else if (basicMsg.bedPlace == '291') {
          basicMsg.bedPlace = '抢救室'
        }
        that.docSplitList = JSON.parse(JSON.stringify(parent.allExecMsg))
        for (var i = 0; i < that.docSplitList.length; i++) {
          var item = that.docSplitList[i];
          item.bedNum = basicMsg.bedNum;
          item.cstNam = basicMsg.cstNam;
          item.cstSex = basicMsg.cstSexCod;
          item.emgDat = basicMsg.emgDatStr;
          item.vstCad = basicMsg.vstCad;
          item.source = basicMsg.bedPlace;
        }
      },
      mounted: function () {
        var that = this
        that.$nextTick(function () {
          for (var i = 0; i < that.docSplitList.length; i++) {
            new QRCode('qrCode' + i, {
              text: that.docSplitList[i].disposalSeq,
              width: 40,
              height: 40
            });
          }
        })
      },
      methods: {
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
      publicFun.httpServer({ url:  '${baseurl}cfxx/printExec.do' }, { 'execSeqStr': seq }, function (res) {
        // message_alert(res);
        if (res.resultInfo.type == 1) {
          parent.getPrintTab()
        }
      })
    }
  </script>
</body>

</html>