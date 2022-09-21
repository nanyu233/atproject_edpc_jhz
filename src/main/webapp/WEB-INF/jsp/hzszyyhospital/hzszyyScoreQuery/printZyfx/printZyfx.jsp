<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/base/tag.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
</head>

<body>
  <div style="display:none">
    <div id="doc1" style="display:block;float:left;width:205mm;">
      <jsp:include page="/WEB-INF/jsp/hzszyyhospital/printBasicInfo/printBasicInfo.jsp"></jsp:include>
      <ul style="width:98%;padding:0;font-size:3.3mm;" class="printul">
        <li style="font-weight:700">
          <span>科室：</span><span style="margin-right:2mm;font-weight:400;width:25mm" id="emgFkName"></span>
          <span>姓名：</span><span style="margin-right:2mm;font-weight:400;width:25mm" id="cstNam"></span>
          <span>性别：</span><span style="margin-right:2mm;font-weight:400;width:25mm" id="cstSexCod"></span>
          <span>年龄：</span><span style="margin-right:2mm;font-weight:400;width:25mm" id="cstAge"></span>
          <span>床号：</span><span style="margin-right:2mm;font-weight:400;width:25mm" id="emgBed"></span>
        </li>
        <li style="font-weight:700">
          <span>诊断：</span><span style="width:65mm;font-weight:400" id="preDgnCod"></span>
          <span>病历号：</span><span style="margin-right:2mm;font-weight:400;width:25mm" id="qxZyh"></span>
          <span>入院日期：</span><span style="margin-right:2mm;font-weight:400" id="emgDat"></span>
        </li>
      </ul>
    </div>
    <div id="doc2" style="display:block;float:left;width:205mm;">
      <table id="printlist" class="printable">
        <colgroup>
          <col width="10%" />
          <col width="15%" />
          <col width="17%" />
          <col width="15%" />
          <col width="11%" />
          <col width="11%" />
          <col width="11%" />
          <col width="11%" />
        </colgroup>
        <thead>
          <tr>
            <th colspan="4">评估内容</th>
            <th colspan="4">评估日期</th>
          </tr>
          <tr>
            <td rowspan="2">项目</td>
            <th colspan="3">评分依据</th>
            <td id="crttime0"></td>
            <td id="crttime1"></td>
            <td id="crttime2"></td>
            <td id="crttime3"></td>
          </tr>
          <tr>
            <td>5分</td>
            <td>3分</td>
            <td>1分</td>
            <td></td>
            <td></td>
            <td></td>
            <td></td>
          </tr>
        </thead>
        <tbody>

        </tbody>
        <tfoot>
          <tr>
            <td colspan="4" class="t-left">评估结果</td>
            <td id="zyfxpfSco0"></td>
            <td id="zyfxpfSco1"></td>
            <td id="zyfxpfSco2"></td>
            <td id="zyfxpfSco3"></td>
          </tr>
          <tr>
            <td colspan="4">
              <ul class="footul">
                <li>评估携带仪器及药物：</li>
                <li>
                  <span>①呼吸机</span>
                  <span>②监护仪</span>
                  <span>③氧气瓶</span>
                  <span>④吸引器</span>
                  <span>⑤呼吸皮囊</span>
                  <span>⑥气管插管箱</span>
                </li>
                <li>
                  <span>⑦急救箱</span>
                  <span>⑧药物</span>
                  <span>⑨其他</span>
                </li>
              </ul>
            </td>
            <td id="xdy0"></td>
            <td id="xdy1"></td>
            <td id="xdy2"></td>
            <td id="xdy3"></td>
          </tr>
          <tr>
            <td colspan="4" class="t-left">评估者</td>
            <td id="name0"></td>
            <td id="name1"></td>
            <td id="name2"></td>
            <td id="name3"></td>
          </tr>
          <tr>
            <td colspan="8" class="t-left">危重病人安全转运风险评估标准（满分65分，转运前10分钟内完成）</td>
          </tr>
          <tr>
            <td colspan="8">
              <ul class="footul">
                <li>＜30分：提示转运风险高，在医生护士严密监护下转运，需要医生对病人再次评估并提出处理意见，应对家属告知风险，携带急救物品做好急救准备后方可转运。</li>
                <li>30-40分：提示转运风险较高；在转运途中可能发生病情变化或意外，应对家属告知风险，做好应急准备，预先联系电梯和相关科室，与医生一同转运。</li>
                <li>41-50分：提示有风险的可能性；需高度重视并做好相应预防措施医生护士共同转送。</li>
                <li>＞50分：提示转运风险较小，做好相应预防措施后安全转运</li>
              </ul>
            </td>
          </tr>
        </tfoot>
      </table>
    </div>
  </div>
  <script>
    function setTable() {
      var printUrl = _baseUrl + 'scorequery/printfxpfScore.do'
      publicFun.httpServer({url: printUrl}, { 'hspZyfxpfInfCustom.emgSeq': _emgSeq }, function (res) {
        var printList = res.msg.printFxpfScoreList;
        var emgMsg = res.msg.emginf;
        setTbody(printList);
        setMsg(emgMsg);

        LODOP = getLodop();
        LODOP.PRINT_INITA(0, 0, "210mm", "297mm", "打印控件功能演示_Lodop功能_超文本内容缩放打印");
        LODOP.SET_PRINT_PAGESIZE(0, "210mm", "297mm", "");
        LODOP.SET_PRINT_MODE("NOCLEAR_AFTER_PRINT", true);
        // LODOP.ADD_PRINT_HTM(1050,344,"90%","100%","<font style='font-size:12px' format='0'><span tdata='pageNO'>第##页</span>/<span tdata='pageCount'>共##页</span></font>");
        LODOP.SET_PRINT_STYLEA(0, "ItemType", 1);
        LODOP.ADD_PRINT_TABLE(146, 0, "100%", "90%", document.getElementById("doc2").innerHTML);
        LODOP.NewPageA();
        LODOP.SET_PRINT_STYLE("FontSize", 10);
        //LODOP.SET_PRINTER_INDEX("DASCOM DL-630Z");   
        LODOP.ADD_PRINT_HTM(3, 0, "100%", "100%", document.getElementById("doc1").innerHTML);
        LODOP.SET_PRINT_STYLEA(0, "ItemType", 1);
        LODOP.PREVIEW();
        // LODOP.PRINT();
      })
    }

    function setMsg(list) {
      $('#emgFkName').html('抢救室');
      $('#qxZyh').html(list.mpi);
      $('#cstNam').html(list.cstNam);
      $('#cstSexCod').html(list.cstSexCod);
      $('#cstAge').html(list.cstAge + list.cstAgeCod);
      $('#emgBed').html(list.emgBed);
      $('#preDgnCod').html(list.preDgnCod);
      $('#emgDat').html(publicFun.timeFormat(list.emgDat, 'yyyy/MM/dd hh:mm:ss'));
      $('#docuTitle').html('安全转运风险评估单')
    }

    function setTbody(list) {
      for (var i = 13; i >= 1; i--) {
        var row = $("#template").clone();
        var fieldList = ['projectName', 'accordance_one', 'accordance_two', 'accordance_three', 'score0', 'score1', 'score2', 'score3']
        $.each(fieldList, function (index, value) {
          if (list[i][value] != null) {
            $('#' + value).html(list[i][value])
          } else {
            $('#' + value).html('')
          }
        })
        row.prependTo("#printlist");//添加到模板的容器中
      }
      var obj = document.getElementById("printlist");
      obj.deleteRow(3);
      for (var n = 0; n <= 3; n++) {
        if (list[0]['crttime' + n]) {
          var time = list[0]['crttime' + n].substring(0, list[0]['crttime' + n].length - 3)
          $('#crttime' + n).html(time);
        }
        if (list[14]['zyfxpfSco' + n]) {
          $('#zyfxpfSco' + n).html(list[14]['zyfxpfSco' + n]);
        }
        if (list[15]['xdyqjyw' + n]) {
          $('#xdy' + n).html(list[15]['xdyqjyw' + n]);
        }
        if (list[16]['name' + n]) {
          $('#name' + n).html(list[16]['name' + n]);
        }
      }
    }

    function printCom() {
      $('#currentTitle').html('危重病人安全转运风险评估单');
      $("#printlist tbody").html("");
      $("#printlist tbody").append('<tr id="template"><td id="projectName"></td><td id="accordance_one"></td><td id="accordance_two"></td><td id="accordance_three"></td><td id="score0"></td><td id="score1"></td><td id="score2"></td><td id="score3"></td></tr>');
      $('.printable').css({ "font-size": "3.5mm", "border": "1px solid #000", "width": "98%", "margin-left": "1%", "margin-top": "3mm", "border-collapse": "collapse" });
      $(".printable th").css({ "border": "1px solid #000" });
      $(".printable td").css({ "border": "1px solid #000", "text-align": "center", "height": "5mm", "line-height": "5mm" });
      $("#hsusrnames").css({ "text-align": "left" });
      $("#bqgc").css({ "text-align": "left" });
      //$('.stitle').css({"width":"9mm"});
      $('span').css({ "display": "inline-block" });
      $('.printul').css({ "float": "left", "margin-left": "1%", "margin-top": "3mm", "padding-top": "3mm" });
      $('.footul').css({ "float": "left", "width": "98%", "margin": '0', 'padding': '0' });
      $('.footul li').css({ "list-style-type": "none", "text-align": 'left' });
      $('.footul li span').css({ "margin-right": "1.5mm" });
      $('.printul li').css({ "list-style-type": "none" });
      $('.t-left').css({ "text-align": "left" });
      setTable();
    }  
  </script>
</body>

</html>