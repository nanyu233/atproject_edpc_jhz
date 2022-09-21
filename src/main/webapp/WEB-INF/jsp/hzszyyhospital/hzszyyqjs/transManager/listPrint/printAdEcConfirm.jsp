<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/base/tag.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
  <title>护士站-医嘱执行确认打印</title>
</head>

<body>
  <div style="display:none">
    <div id="printTitle" style="display:block;float:left;width:185mm;">
      <jsp:include page="/WEB-INF/jsp/hzszyyhospital/printBasicInfo/printBasicInfo.jsp"></jsp:include>
    </div>
    <div id="printContent" style="display:block;float:left;width:185mm;">
      <table id="printList" class="printable" ms-controller="printList">
        <thead>
          <tr>
            <th ms-repeat="msg.thNameList">{{el}}</th>
          </tr>
        </thead>
        <tbody>
          <tr ms-repeat="msg.tdContentList">
            <td>{{el.isprint}}</td>
            <td>{{el.zxdzt}}</td>
            <td>{{el.zxddat}}</td>
            <td ms-class="daInfo{{$index}}"></td>
            <td ms-class="daDose{{$index}}"></td>
            <td>{{el.daFreq}}</td>
            <td>{{el.daWay}}</td>
            <td>{{el.dispenseDate}}</td>
            <td>{{el.dispenseUserxm}}</td>
            <td>{{el.dispenseUserxmSecond}}</td>
            <td>{{el.execTime}}</td>
            <td>{{el.execUserxm}}</td>
            <td>{{el.execUserxmSecond}}</td>
            <td>{{el.remark}}</td>
          </tr>
        </tbody>
      </table>
    </div>
  </div>
  <script>
    var printVm = avalon.define({
      $id: 'printList',
      msg: {
        thNameList: ['打印状态', '执行单状态', '开单时间', '医嘱内容', '剂量', '频次', '给药方式', '配药时间', '配药护士', '配药核对', '执行时间', '执行护士', '执行核对', '备注'],
        tdContentList: []
      }
    })
    /**
    * 打印患者服务列表
    **/
    var LODOP;
    function printCurrentTab() {
      var _postParam = generateParam();
      _postParam.rows = 10000;
      _postParam.page = 1;
      publicFun.httpServer({ url: '${baseurl}cfxx/getAdviceExecList.do' }, _postParam, function (data) {
        var _zxList = publicFun.getDict('EXEC_STATUS');
        for (var i = 0; i < data.rows.length; i++) {
          var _row = data.rows[i];
          _row.isprint = printZt(_row.isprint);
          for (var j = 0; j < _zxList.length; j++) {
            if (_zxList[j].infocode === _row.zxdzt) {
              _row.zxdzt = _zxList[j].info
            }
          }
          if (_row.zxddat) {
            _row.zxddat = publicFun.timeFormat(_row.zxddat, 'yyyy/MM/dd hh:mm')
          }
          if (_row.dispenseDate) {
            _row.dispenseDate = publicFun.timeFormat(_row.dispenseDate, 'yyyy/MM/dd hh:mm')
          }
          _row.daInfo = splitYzInfo(_row);
          _row.daDose = splitDaDose(_row);
        }
        setTimeout(function () {
          printVm.msg.tdContentList = data.rows.slice();
          for (var i = 0; i < data.rows.length; i++) {
            $('.daInfo' + i).html(data.rows[i].daInfo)
            $('.daDose' + i).html(data.rows[i].daDose)
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
          LODOP.ADD_PRINT_TABLE('22mm', 0, "100%", "80%", document.getElementById("printContent").innerHTML);
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
      $('.docuTitleBaisc').html('医嘱执行确认')
      $('.printable').css({ "font-size": "3.3mm", "border": "1px solid #000", "width": "98%", "margin-left": "1%", "margin-top": "3mm", "border-collapse": "collapse" });
      $(".printable th").css({ "border": "1px solid #000" });
      $(".printable td").css({ "border": "1px solid #000", "text-align": "center" });
      $('span').css({ "display": "inline-block" });
      $('.printul').css({ "float": "left", "margin-left": "1%", "margin-top": "1mm" });
      $('.printul li').css({ "list-style-type": "none" });
    }
  </script>
</body>

</html>