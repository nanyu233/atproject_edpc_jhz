<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/base/tag.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
  <title>患者发热明细列表</title>
</head>

<body>

  <!-- 打印患者发热明细列表 -->
  <div style="display:none">
    <div id="printTitle" style="display:block;float:left;width:185mm;">
      <jsp:include page="/WEB-INF/jsp/hzszyyhospital/printBasicInfo/printBasicInfo.jsp"></jsp:include>
    </div>
    <div id="printContent" style="display:block;float:left;width:185mm;">
      <table id="printList" class="printable" ms-controller="printPatList">
        <!-- <colgroup>
          <col width="6%" />
          <col width="3.8%" />
          <col width="4%" />
          <col width="4%" />
          <col width="3%" />
          <col width="3%" />
          <col width="3%" />
          <col width="3%" />
          <col width="3%" />
          <col width="3%" />
          <col width="3%" />
          <col width="3%" />
          <col width="3%" />
          <col width="4%" />
          <col width="3%" />
          <col width="5.5%" />
          <col width="5.5%" />
          <col width="5%" />
          <col width="19%" />
          <col width="5%" />
        </colgroup> -->
        <thead>
          <tr>
            <th ms-repeat="msg.thNameList">{{el}}</th>
          </tr>
        </thead>
        <tbody>
          <tr ms-repeat="msg.tdContentList">
            <td>{{el.emgDat}}</td>
            <td>{{el.cstNam}}</td>
            <td>{{el.cstSexCod}}</td>
            <td>{{el.cstAge}}</td>
            <td>{{el.nationality}}</td>
            <td>{{el.emgJob}}</td>
            <td>{{el.tmpNbr}}</td>
            <td>{{el.cstAdr}}</td>
            <td>{{el.pheNbr}}</td>
            <td>{{el.wcdyFlag}}</td>
            <td>{{el.ttgjcxFlag}}</td>
            <td>{{el.hxdzzFlag}}</td>
            <td>{{el.yqyqFlag}}</td>
            <td>{{el.qljcFlag}}</td>
            <td>{{el.infectedareaNam}}</td>
            <td>{{el.frDat}}</td>
            <td>{{el.jbzdDes}}</td>
            <td>{{el.emgFkCod}}</td>
          </tr>
        </tbody>
      </table>
    </div>
  </div>
  <script>
    var printVm = avalon.define({
      $id: 'printPatList',
      msg: {
        thNameList: ['时间', '病人姓名', '性别', '年龄', '国籍', '职业', '体温℃', '详细地址', '电话号码', '有无蚊虫叮咬', '有无头痛、关节痛、皮疹及出血点', '有无呼吸道症状', '有无疫区疫情暴露史', '有无禽类接触史及活禽市场暴露史', '疫区名称', '发病日期','诊断和处理', '就诊去向'],
        tdContentList: []
      }
    })
    /**
    * 打印患者服务列表
    **/
    var LODOP;
    function cmdprintTable () {
      var _startDate = publicFun.timeFormat(parseInt('${startdate}'), "yyyy/MM/dd hh:mm:ss");
      var _endDate = publicFun.timeFormat(parseInt('${enddate}'), "yyyy/MM/dd hh:mm:ss");
      var formData = {
        "startdate": _startDate,
        "enddate": _endDate,
        "hspemginfCustom.emgFkCod": '${emgFkCod}',
        'childFlag': '${childFlag}'
      };
      formData.rows = 10000;
      formData.page = 1;
       publicFun.httpServer({url: '${baseurl}report/queryfrbrmx_result.do'}, formData, function (data) {
        for (var i = 0; i < data.rows.length; i++) {
          _printTable[i] = data.rows[i]
          for (var j in data.rows[i]) {
            if (j === 'emgDat' || j === 'frDat') {
              if (data.rows[i][j] !== null && data.rows[i][j] != '') {
                _printTable[i][j] = publicFun.timeFormat(new Date(data.rows[i][j]), 'yyyy/MM/dd')
              }
            }
            if (j === 'cstAge') {
              if (data.rows[i][j] !== null && data.rows[i][j] != '') {
                _printTable[i][j] = data.rows[i][j] + '' + data.rows[i].cstAgeCod
              }
            }
          }
        }
        printVm.msg.tdContentList = _printTable.slice();
        setTable();
        //打印预览
        LODOP = getLodop();
        LODOP.PRINT_INITA(0, 0, "185mm", "260mm", "打印控件功能演示_Lodop功能_超文本内容缩放打印");
        //释放下面这行，开启纵向打印
        //LODOP.SET_PRINT_PAGESIZE(0, "185mm", "260mm", "");
        //注释下面两行，关闭横向打印以及横向预览
        LODOP.SET_PRINT_PAGESIZE(2, "185mm", "260mm", "");
        LODOP.SET_SHOW_MODE("LANDSCAPE_DEFROTATED", 1);
        LODOP.SET_PRINT_MODE("NOCLEAR_AFTER_PRINT", true);
        //释放下面这行，开启纵向打印的页码
        //LODOP.ADD_PRINT_HTM(1050,344,"90%","100%","<font style='font-size:12px' format='0'><span tdata='pageNO'>第##页</span>/<span tdata='pageCount'>共##页</span></font>");
        //注释下面这行，关闭横向打印的页码
        LODOP.ADD_PRINT_HTM('171mm', '120mm', "90%", "100%", "<font style='font-size:12px' format='0'><span tdata='pageNO'>第##页</span>/<span tdata='pageCount'>共##页</span></font>");
        LODOP.SET_PRINT_STYLEA(0, "ItemType", 1);
        LODOP.ADD_PRINT_TABLE('26mm', 0, "100%", "80%", document.getElementById("printContent").innerHTML);
        LODOP.NewPageA();
        LODOP.SET_PRINT_STYLE("FontSize", 10);
        //LODOP.SET_PRINTER_INDEX("DASCOM DL-630Z");   
        LODOP.ADD_PRINT_HTM('1mm', 0, "100%", "100%", document.getElementById("printTitle").innerHTML);
        LODOP.SET_PRINT_STYLEA(0, "ItemType", 1);
        LODOP.PREVIEW();
        //LODOP.PRINT();
      })
    }

    function setTable() {
      $('#mainTitle').css({ 'padding': '0mm', 'margin': '0 0 0 80mm', 'height': '15mm' })
      $('#docuTitle').html('急性发热病人预检分诊列表')
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