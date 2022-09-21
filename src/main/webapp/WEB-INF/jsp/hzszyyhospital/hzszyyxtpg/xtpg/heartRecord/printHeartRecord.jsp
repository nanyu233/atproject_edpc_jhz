<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/base/tag.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
  <title>心肺复苏记录单</title>
</head>

<body>
  <!-- 打印心肺复苏记录单 -->
  <div style="display:none">
    <div id="doc1" style="display:block;float:left;width:210mm;">
      <jsp:include page="/WEB-INF/jsp/hzszyyhospital/printBasicInfo/printBasicInfo.jsp"></jsp:include>
      <ul style="width:98%;padding:0;font-size:3.3mm;" class="print-ul">
        <li style="font-weight:700">
          <span>科别：</span>
          <span class="basic-span-print" id="emgFkCod_p"></span>
          <span>姓名：</span>
          <span class="basic-span-print" id="cstNam_p"></span>
          <span>床号：</span>
          <span class="basic-span-print" id="bedNum_p"></span>
          <span>病历号：</span>
          <span class="basic-span-print" id="mpi_p"></span>
          <!-- 2020-08-04 fzz 去除打印里的抢救小组到达时间 -->
          <!-- <span>抢救小组到达时间：</span>
          <span class="basic-span-print"></span> -->
        </li>
        <!-- <li style="font-weight:700; margin-top: 4mm">
          <span>抢救时间：</span>
          <span class="basic-span-print" id="rescueTime_p"></span>
          <span>抢救小组到达时间：</span>
          <span class="basic-span-print"></span>
        </li> -->
      </ul>
    </div>
    <div id="doc2" style="display:block;float:left;width:210mm;">
      <table class="printable" id="printList">
        <colgroup>
          <col width="6%" /> 
          <col width="3%" />
          <!-- 瞳孔 -->
          <col width="3%" />
          <col width="3%" />
          <!-- 瞳孔大小mm -->
          <col width="3%" />
          <col width="3%" />

          <col width="3%" />
          <col width="3%" />
          <!-- 血压mmHg -->
          <col width="5%" />
          <col width="3%" />
          <!-- 氧饱和度 -->
          <col width="3%" />
          <col width="3%" />
          <col width="4%" />
          <!-- 静脉推注 -->
          <col width="3%" />
          <col width="3%" />
          <!-- 静脉滴注 -->
          <col width="3%" />
          <col width="3%" />
          <col />
          <col />
          <!-- 护士签名 -->
          <col width="6%" />
        </colgroup>
        <thead>
          <tr>
            <th rowspan="2">抢救时间</th>
            <th rowspan="2">意识</th>
            <th colspan="2">瞳孔</th>
            <th colspan="2">瞳孔大小mm</th>
            <th rowspan="2">心率</th>
            <th rowspan="2">心律</th>
            <th rowspan="2">血压mmHg</th>
            <th rowspan="2">呼吸</th>
            <th rowspan="2">氧饱和度</th>
            <th rowspan="2">通气</th>
            <th rowspan="2">氧流量/氧浓度</th>
            <th colspan="2">静脉推注/泵推</th>
            <th colspan="2">静脉滴注</th>
            <th rowspan="2" colspan="2">抢救记录</th>
            <th rowspan="2">护士签名</th>
          </tr>
          <tr>
            <th>左</th>
            <th>右</th>
            <th>左</th>
            <th>右</th>
            <th>药物名称</th>
            <th>剂量mg</th>
            <th>药物名称</th>
            <th>剂量ml</th>
          </tr>
        </thead>
        <tbody>
          <tr v-for="item in tdContentList" class="tr-wrap" style="min-height: 6mm">
            <td style="border: 1px solid #000">{{item.rescueTime}}</td>
            <td style="border: 1px solid #000">{{item.senStuCod}}</td>
            <td style="border: 1px solid #000">{{item.pupilLeft}}</td>
            <td style="border: 1px solid #000">{{item.pupilRight}}</td>
            <td style="border: 1px solid #000">{{item.pupilSizeLeft}}</td>
            <td style="border: 1px solid #000">{{item.pupilSizeRight}}</td>
            <td style="border: 1px solid #000">{{item.hrtRte}}</td>
            <td style="border: 1px solid #000">{{item.hrtRhythm}}</td>
            <td style="border: 1px solid #000">{{item.sbpNbrStr}}</td>
            <td style="border: 1px solid #000">{{item.breNbr}}</td>
            <td style="border: 1px solid #000">{{item.xy}}</td>
            <td style="border: 1px solid #000">{{item.ventilation}}</td>
            <td style="border: 1px solid #000">{{item.itchyFlow}}</td>
            <td style="border: 1px solid #000">{{item.intravenousBolusNam}}</td>
            <td style="border: 1px solid #000">{{item.intravenousBolusDose}}</td>
            <td style="border: 1px solid #000">{{item.intravenousDripName}}</td>
            <td style="border: 1px solid #000">{{item.intravenousDripDose}}</td>
            <td style="border: 1px solid #000" colspan="2">{{item.rescueRecord}}</td>
            <td style="border: 1px solid #000">{{item.recordNam}}</td>
          </tr>
          <tr>
            <td colspan="20">
              <div class="left-lab-print">
                填表说明：意识：A反应敏捷；V对言语有反应；P对疼痛有反应；U无反应
              </div>
              <div class="right-lab-print">
                <!-- 瞳孔：N正常；S迟钝；F固定 -->
              </div>
              <div class="left-lab-print">
                心律：NSR正常窦性节律；ST窦性心动过速；AF房颤；VF室颤；VT室速
              </div>
              <div class="right-lab-print">
                通气：I气管插管；B皮囊；M面罩
              </div>
            </td>
          </tr>
          <!-- <tr>
            <td colspan="10" style="text-align: center;">静脉推注药物</td>
            <td colspan="10" style="text-align: center;">静脉推注药物</td>
          </tr>
          <tr v-for="el in tdDrugList" class="right-tr">
            <td colspan="4">{{el.left}}</td>
            <td></td>
            <td></td>
            <td></td>
            <td></td>
            <td></td>
            <td></td>
            <td colspan="4">{{el.right}}<br />{{el.nextLine}}</td>
            <td></td>
            <td></td>
            <td></td>
            <td></td>
            <td></td>
            <td></td>
          </tr> -->
          <tr>
            <td colspan="4" class="center-print">参与抢救的医生</td>
            <td colspan="6"></td>
            <td colspan="4" class="center-print">医生签名</td>
            <td colspan="6"></td>
          </tr>
          <tr>
            <td colspan="4" class="center-print">参与抢救的护士</td>
            <td colspan="6"></td>
            <td colspan="4" class="center-print">护士签名</td>
            <td colspan="6"></td>
          </tr>
        </tbody>
      </table>
      <span style="margin-left: 2mm">备注：浙江医院心肺复苏记录单每次打印并填写2份(1式2份)，1份科室保存，另一份及时上交医务部。</span>
    </div>
  </div>
  <script>
    var printVm = new Vue({
      el: '#printList',
      data: function () {
        return {
          tdContentList: [],
          tdDrugList: [
            { left: '肾上腺素 时间', right: '多巴胺 mg/时间', nextLine: 'NS ——> 50ml/IVPUMP' },
            { left: '剂量/mg', right: '滴速 ml/小时', nextLine: '' },
            { left: '胺碘酮 时间', right: '肾上腺素 mg/时间', nextLine: 'NS ——> 50ml/IVPUMP' },
            { left: '剂量/mg', right: '滴速 ml/小时', nextLine: '' },
            { left: '阿托品 时间', right: '胺碘酮 mg/时间', nextLine: 'NS ——> 50ml/IVPUMP' },
            { left: '剂量/mg', right: '滴速 ml/小时', nextLine: '' },
            { left: '时间', right: '利多卡因 mg/时间', nextLine: 'NS ——> 50ml/IVPUMP' },
            { left: '剂量/mg', right: '滴速 ml/小时', nextLine: '' },
            { left: '时间', right: '生理盐水 500ml静滴', nextLine: '' },
            { left: '剂量/mg', right: '', nextLine: '' },
            { left: '时间', right: '', nextLine: '' }
          ]
        }
      }
    })
    /**
    * 打印心肺复苏记录单
    **/
    var LODOP;
    function printTable() {
      setTable();
      publicFun.httpServer({ url: '${baseurl}heartRecord/queryHeartRecordList.do' }, { 
        "hspHeartRecordCustom.emgSeq": comdata.emgSeq, 
        'rows': 10000, 
        'page': 1,
        "startdate": $("#start-date").val(),
        "enddate":  $("#end-date").val()
      }, function (data) {
        if (data.resultInfo && data.resultInfo.messageCode == '900') {
          publicFun.alert(data.resultInfo.message)
        }
        printVm.tdContentList = [];
        printVm.tdContentList = (dealDataValues(data)).rows;
        if (printVm.tdContentList.length > 0) {
          $('#rescueTime_p').html(publicFun.timeFormat(new Date(printVm.tdContentList[0].rescueTime), 'yyyy-MM-dd'))
        }
        var _gapLth = 8 - printVm.tdContentList.length;
        if (_gapLth > 0) {
          for (var i = 0; i < _gapLth; i++) {
            printVm.tdContentList.push({
              'recordTime': ' ',
              'senStuCod': ' ',
              'pupilLeft': ' ',
              'pupilRight': ' ',
              'pupilSizeLeft': ' ',
              'pupilSizeRight': ' ',
              'hrtRte': ' ',
              'hrtRhythm': ' ',
              'sbpNbrStr': ' ',
              'breNbr': ' ',
              'xy': ' ',
              'ventilation': ' ',
              'itchyFlow': ' ',
              'intravenousBolusNam': ' ',
              'intravenousBolusDose': ' ',
              'intravenousDripName': ' ',
              'intravenousDripDose': ' ',
              'rescueRecord': ' ',
              'recordNam': ' '
            })
          }
        }
        setTimeout(function () {
          //打印预览
          LODOP = getLodop();
          LODOP.PRINT_INITA(0, 0, "210mm", "297mm", "打印控件功能演示_Lodop功能_超文本内容缩放打印");
          LODOP.SET_PRINT_MODE("NOCLEAR_AFTER_PRINT", true);
          //释放下面这行，开启纵向打印的页码
          // LODOP.ADD_PRINT_HTM(1050, 344, "90%", "100%", "<font style='font-size:12px' format='0'><span tdata='pageNO'>第##页</span>/<span tdata='pageCount'>共##页</span></font>");
          LODOP.SET_PRINT_PAGESIZE(2, "210mm", "297mm", "");
          LODOP.SET_SHOW_MODE("LANDSCAPE_DEFROTATED",1);
          LODOP.ADD_PRINT_HTM('198mm', '133mm', "90%", "100%", "<font style='font-size:12px' format='0'><span tdata='pageNO'>第##页</span>/<span tdata='pageCount'>共##页</span></font>");
          LODOP.SET_PRINT_STYLEA(0, "ItemType", 1);
          LODOP.ADD_PRINT_TABLE('26mm', 0, "100%", "BottomMargin:5mm", document.getElementById("doc2").innerHTML);
          LODOP.NewPageA();
          LODOP.SET_PRINT_STYLE("FontSize", 10);
          //LODOP.SET_PRINTER_INDEX("DASCOM DL-630Z");   
          LODOP.ADD_PRINT_HTM(3, 0, "100%", "100%", document.getElementById("doc1").innerHTML);
          LODOP.SET_PRINT_STYLEA(0, "ItemType", 1);
          LODOP.PREVIEW();
          //LODOP.PRINT();
        }, 1000);
      })
    }

    function setTable() {
      $('#docuTitle').html('心肺复苏记录单');
      $('.printable').css({ "font-size": "3.2mm", "border": "1px solid #000", "width": "98%", "margin-left": "1%", "margin-top": "3mm", "border-collapse": "collapse" });
      $(".printable th").css({ "border": "1px solid #000" });
      $(".printable td").css({ "border": "1px solid #000", "padding": '1mm 0'});
      $('span').css({ "display": "inline-block" });
      $('.basic-span-print').css({'margin-right': '0mm', 'font-weight': '400', 'min-width': '14%'});
      $('.print-ul').css({ "float": "left", "margin-left": "1%", "margin-top": "1mm" });
      $('.print-ul li').css({ "list-style-type": "none" });
      $('.left-lab-print').css({'float': 'left', 'width': '70%', 'text-align': 'left'});
      $('.right-lab-print').css({'float': 'left', 'width': '30%'});
      $('.tr-wrap td').css({ "border": "1px solid #000 !important" });
      $('.right-tr td').css({'text-align': 'right', 'padding-right': '4mm'});
      $('.center-print').css({'text-align': 'center'});
      setParamMsg(parent.parent.vm.patientMsg)
    }

    function setParamMsg (res) {
      if (res != null && res != "") {
        var fieldLists = ['emgFkCod', 'cstNam', 'cstSexCod', 'bedNum', 'preDgnCod', 'mpi', 'cstAge']
        $.each(fieldLists, function (index, value) {
          if (res[value] !== null && res[value] !== '') {
            if (value === 'cstAge') {
              $('#' + value + '_p').html(res[value] + res['cstAgeCod']);
            } else {
              $('#' + value + '_p').html(res[value]);
            }
          }
        })
      }
    }
  </script>
</body>

</html>