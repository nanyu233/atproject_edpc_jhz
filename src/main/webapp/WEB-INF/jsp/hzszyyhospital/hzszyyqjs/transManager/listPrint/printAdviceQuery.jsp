<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/base/tag.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
  <title>护士站-医嘱查询</title>
</head>

<body>
  <div style="display:none">
    <div id="printTitle" style="display:block;float:left;width:185mm;">
      <jsp:include page="/WEB-INF/jsp/hzszyyhospital/printBasicInfo/printBasicInfo.jsp"></jsp:include>
      <ul class="print-ul showinDoc" style="display:none">
        <li>
          <span class="basic-span">
            <label class="title-label">姓名：</label>
            <span>${hspemginfCustom.cstNam}</span>
          </span>
          <span class="basic-span">
            <label class="title-label">性别：</label>
            <span>${hspemginfCustom.cstSexCod}</span>
          </span>
          <span class="basic-span">
            <label class="title-label">年龄：</label>
            <span id="_age">${hspemginfCustom.cstAge}${hspemginfCustom.cstAgeCod}</span>
          </span>
          <span class="basic-span">
            <label class="title-label">科别：</label>
            <span id="_emgFkCod">急诊科门诊</span>
          </span>
          <span class="basic-span">
            <label class="title-label">病历号：</label>
            <span id="_mpi">${hspemginfCustom.mpi}</span>
          </span>
          <!-- <span class="basic-span">
            <label class="title-label">留观号：</label>
            <span id="_lgh">${hspemginfCustom.observationCode}</span>
          </span> -->
        </li>
      </ul>
    </div>
    <div id="printContent" style="display:block;float:left;width:185mm;">
      <table id="printList" class="printable" ms-controller="printList">
        <thead>
          <tr>
            <th ms-repeat="msg.thNameList">{{el}}</th>
          </tr>
        </thead>
        <tbody class="onlyTransMsgShow">
          <tr ms-repeat="msg.tdContentList">
            <td>{{el.startTime}}</td>
            <td>{{el.daType}}</td>
            <td ms-class="daInfo{{$index}}"></td>
            <td ms-class="drugSpec{{$index}}"></td>
            <td ms-class="num{{$index}}"></td>
            <td>{{el.enterTime}}</td>
            <td>{{el.startDoct}}</td>
            <td>{{el.hddat}}</td>
            <td>{{el.hdhsxm}}</td>
            <td ms-class="dispenseUserxmSecond{{$index}}"></td>
            <td ms-class="execTime{{$index}}"></td>
            <td ms-class="execUserXm{{$index}}"></td>
            <td ms-class="execUserxmSecond{{$index}}"></td>
          </tr>
        </tbody>
        <tbody class="onlyDocMsgShow">
          <tr ms-repeat="msg.tdContentList">
            <td>{{el.enterTime}}</td>
            <td>{{el.daType}}</td>
            <td ms-class="daInfo{{$index}}"></td>
            <td ms-class="drugSpec{{$index}}"></td>
            <td ms-class="num{{$index}}"></td>
            <td>{{el.startDoct}}</td>
            <td>{{el.hdhsxm}}</td>
            <td ms-class="execTime{{$index}}"></td>
            <td ms-class="execUserXm{{$index}}"></td>
          </tr>
        </tbody>
      </table>
    </div>
  </div>
  <script>
    var printVm = avalon.define({
      $id: 'printList',
      msg: {
        // thNameList: ['开始时间', '类型', '医嘱内容', '规格', '总数量', '开立时间', '开立医生', '核对时间', '核对护士', '执行时间', '执行护士', '执行核对'],
        thNameList: [],
        tdContentList: []
      }
    })
    /**
    * 打印患者服务列表
    **/
    var LODOP;
    var _printTitle = '';
    function printCurrentTab (type) {
      var _postParam = '', _getListUrl = '';
      if (type === 'doc') { // 医嘱信息
        _postParam = {
          "hspCfxxInfoCustom.mpi": '${mpi}',
          "startdate": $("#emg_startdate").val(),
          "enddate": $("#emg_enddate").val()
        }
        _getListUrl = '${baseurl}his/querycfxx_result.do';
        printVm.msg.thNameList = ['开立时间', '类型', '医嘱内容', '规格', '总数量', '开立医生', '核对护士', '执行时间', '执行护士'];
        _printTitle = '医嘱信息';
        $('.onlyTransMsgShow').hide();
        $('.onlyDocMsgShow').show();
        $('.showinDoc').css({ "display": "block"});
      } else { // 医嘱查询
        _postParam = generateParam();
        _getListUrl = '${baseurl}cfxx/adviceQueryList.do';
        printVm.msg.thNameList = ['开始时间', '类型', '医嘱内容', '规格', '总数量', '开立时间', '开立医生', '核对时间', '核对护士', '配药核对', '执行时间', '执行护士', '执行核对'];
        _printTitle = '医嘱查询';
        $('.onlyTransMsgShow').show();
        $('.onlyDocMsgShow').hide();
      }
      _postParam.rows = 10000;
      _postParam.page = 1;
      publicFun.httpServer({ url: _getListUrl }, _postParam, function (data) {
        for (var i = 0; i < data.rows.length; i++) {
          var _row = data.rows[i];
          _row.daInfo = splitYzInfo(_row);
          if (_row.startTime) {
            _row.startTime = publicFun.timeFormat(_row.startTime, 'yyyy/MM/dd hh:mm')
          }
          if (_row.enterTime) {
            _row.enterTime = publicFun.timeFormat(_row.enterTime, 'yyyy/MM/dd hh:mm')
          }
          _row.drugSpec = splitToDropLine(_row.drugSpec);
          _row.execTime = splitToDropLine(_row.execTime);
          _row.execUserXm = splitToDropLine(_row.execUserXm);
          _row.num = splitNumInfo(_row);
          _row.execUserxmSecond = splitToDropLine(_row.execUserxmSecond);
          _row.dispenseUserxmSecond = splitToDropLine(_row.dispenseUserxmSecond);
        }
        setTimeout(function () {
          printVm.msg.tdContentList = data.rows.slice();
          var _htmlList = ['num', 'daInfo', 'drugSpec', 'execTime', 'execUserXm', 'execUserxmSecond', 'dispenseUserxmSecond'];
          for (var i = 0; i < data.rows.length; i++) {
            for (var j = 0; j < _htmlList.length; j++) {
              $('.' + _htmlList[j] + i).html(data.rows[i][_htmlList[j]])
            }
          }
          setTable();
          //打印预览
          LODOP = getLodop();
          LODOP.PRINT_INITA(0, 0, "210mm", "297mm", "打印控件功能演示_Lodop功能_超文本内容缩放打印");
          //释放下面这行，开启纵向打印
          LODOP.SET_PRINT_PAGESIZE(0, "210mm", "297mm", "");
          //注释下面两行，关闭横向打印以及横向预览
          // LODOP.SET_PRINT_PAGESIZE(2, "185mm", "260mm", "");
          // LODOP.SET_SHOW_MODE("LANDSCAPE_DEFROTATED", 1);
          LODOP.SET_PRINT_MODE("NOCLEAR_AFTER_PRINT", true);
          //释放下面这行，开启纵向打印的页码
          LODOP.ADD_PRINT_HTM(1050, 344, "90%", "100%", "<font style='font-size:12px' format='0'><span tdata='pageNO'>第##页</span>/<span tdata='pageCount'>共##页</span></font>");
          //注释下面这行，关闭横向打印的页码
          // LODOP.ADD_PRINT_HTM('171mm', '120mm', "90%", "100%", "<font style='font-size:12px' format='0'><span tdata='pageNO'>第##页</span>/<span tdata='pageCount'>共##页</span></font>");
          LODOP.SET_PRINT_STYLEA(0, "ItemType", 1);
          if(type == 'doc'){
            LODOP.ADD_PRINT_TABLE('25mm', 0, "100%", "80%", document.getElementById("printContent").innerHTML);
          }else{
            LODOP.ADD_PRINT_TABLE('22mm', 0, "100%", "80%", document.getElementById("printContent").innerHTML);
          }
          LODOP.NewPageA();
          LODOP.SET_PRINT_STYLE("FontSize", 10);
          //LODOP.SET_PRINTER_INDEX("DASCOM DL-630Z");   
          LODOP.ADD_PRINT_HTM('1mm', 0, "100%", "100%", document.getElementById("printTitle").innerHTML);
          LODOP.SET_PRINT_STYLEA(0, "ItemType", 1);
          LODOP.PREVIEW();
          //LODOP.PRINT();
        }, 0);
      })
    }

    function setTable() {
      $('#mainTitle').css({ 'padding': '0mm', 'margin': '0 0 0 80mm', 'height': '15mm' })
      $('.docuTitleBaisc').html(_printTitle)
      $('.printable').css({ "font-size": "3.3mm", "border": "1px solid #000", "width": "98%", "margin-left": "1%", "margin-top": "3mm", "border-collapse": "collapse" });
      $(".printable th").css({ "border": "1px solid #000" });
      $(".printable td").css({ "border": "1px solid #000", "text-align": "center" });
      $('span').css({ "display": "inline-block" });
      $('.printul').css({ "float": "left", "margin-left": "1%", "margin-top": "1mm" });
      $('.printul li').css({ "list-style-type": "none" });
      $('.print-ul').css({ "float": "left", "width": "90%", "font-size": "0.38cm", "margin": "0 5%", "padding": "0" });
      $('.print-ul span.basic-span').css({ "display": "inline-block", "margin-right": "3mm" });
    }
  </script>
</body>

</html>