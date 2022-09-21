<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/base/tag.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
  <title>病情护理记录单</title>
</head>

<body>
  <!-- 打印病情护理记录单 -->
  <div style="display:none">
    <div id="doc1" style="display:block;float:left;width:210mm;">
      <jsp:include page="/WEB-INF/jsp/hzszyyhospital/printBasicInfo/printBasicInfo.jsp"></jsp:include>
      <ul style="width:98%;padding:0;font-size:3.3mm;" class="printul">
        <li style="font-weight:700">
          <span>科室：</span><span style="margin-right:2mm;font-weight:400" id="emgFkName"></span>
          <span>姓名：</span><span style="margin-right:2mm;font-weight:400" id="cstNam"></span>
          <span>性别：</span><span style="margin-right:2mm;font-weight:400" id="cstSexCod"></span>
          <span>年龄：</span><span style="margin-right:2mm;font-weight:400" id="cstAge"></span>
          <span>床号：</span><span style="margin-right:2mm;font-weight:400" id="emgBed"></span>
          <span>病历号：</span><span style="margin-right:2mm;font-weight:400" id="mpi"></span>
          <!-- <span>主诉症状：</span><span style="width:50mm;font-weight:400" id="preDgnCod"></span> -->
        </li>
      </ul>
    </div>
    <div id="doc2" style="display:block;float:left;width:210mm;">
      <table id="printlist" class="printable">
        <colgroup>
          <col width="3%" />
          <col width="3%" />
          <col width="3%" />
          <col width="3%" />
          <col width="3%" />
          <col width="3%" />
          <col width="2%" />
          <col width="3%" />
          <col width="3%" />
          <col width="3%" />
          <col width="3%" />
          
          <col width="3%" />
          <col width="3%" />
          <col width="2%" />
          <col width="2%" />
          <col width="3%" />
          <col width="2%" />
          <col width="2%" />
          <col width="3%" />
          
          <col width="6%" />
          <col width="6%" />
          <col width="7%" />
          <col />
          <col width="5%" />
        </colgroup>
        <thead>
          <tr>
            <th rowspan="2">时间</th>
            <th rowspan="2">意识</th>
            <th rowspan="2">体温℃</th>
            <th rowspan="2">心率次/分</th>
            <th rowspan="2">呼吸次/分</th>
            <th rowspan="2">血压mmHg</th>
            <th rowspan="2">氧饱和度</th>
            <th colspan="2">瞳孔</th>
            <th colspan="2">瞳孔大小</th>
            <th rowspan="2">血糖mmol/L</th>
            <th rowspan="2">cvp mmHg</th>
            <th rowspan="2">Braden</th>
            <th rowspan="2">ADL</th>
            <th rowspan="2">疼痛评分</th>
            <th rowspan="2">GCS</th>
            <th rowspan="2">Morse</th>
            <th rowspan="2">转运风险评分</th>
            <th rowspan="2">单位入量ml</th>
            <th rowspan="2">单位出量ml</th>
            <th rowspan="2">基础护理</th>
            <th rowspan="2">病情观察、护理措施和效果</th>
            <th rowspan="2">护士签名</th>
          </tr>
          <tr>
            <th>左</th>
            <th>右</th>
            <th>左mm</th>
            <th>右mm</th>
          </tr>
        </thead>
        <tbody>
        </tbody>
      </table>
    </div>
  </div>
  <script>
    /**
    * 打印病情护理记录单
    **/
    var LODOP;
    function printTable() {
      setTable();
      setTimeout(function () {
        //打印预览
        LODOP = getLodop();
        LODOP.PRINT_INITA(0, 0, "210mm", "297mm", "打印控件功能演示_Lodop功能_超文本内容缩放打印");
        LODOP.SET_PRINT_PAGESIZE(2, "210mm", "297mm", "");
        LODOP.SET_PRINT_MODE("NOCLEAR_AFTER_PRINT", true);
        LODOP.SET_SHOW_MODE("LANDSCAPE_DEFROTATED",1);

        // LODOP.ADD_PRINT_HTM(1050, 344, "90%", "100%", "<font style='font-size:12px' format='0'><span tdata='pageNO'>第##页</span>/<span tdata='pageCount'>共##页</span></font>");
        LODOP.ADD_PRINT_HTM('198mm', '135mm', "95%", "100%", "<font style='font-size:12px' format='0'><span tdata='pageNO'>第##页</span>/<span tdata='pageCount'>共##页</span></font>");
        LODOP.SET_PRINT_STYLEA(0, "ItemType", 1);
        LODOP.ADD_PRINT_TABLE('25mm', 0, "100%", "78%", document.getElementById("doc2").innerHTML);
        LODOP.NewPageA();
        LODOP.SET_PRINT_STYLE("FontSize", 10);
        //LODOP.SET_PRINTER_INDEX("DASCOM DL-630Z");   
        LODOP.ADD_PRINT_HTM(3, 0, "100%", "100%", document.getElementById("doc1").innerHTML);
        LODOP.SET_PRINT_STYLEA(0, "ItemType", 1);
        LODOP.PREVIEW();
        //LODOP.PRINT();
      }, 0);
    }

    function setTable() {
      $('#docuTitle').html('病情护理记录单');
      $("#printlist tbody").html("");
      $("#printlist tbody").append('<tr id="template"><td id="crtDat"></td><td id="senRctCod"></td><td id="tmpNbrFlg"></td><td id="hrtRteFlg"></td><td id="breNbrFlg"></td><td id="sbpNbrFlg"></td><td id="xyFlg"></td><td id="tkLeftCod"></td><td id="tkRightCod"></td><td id="tkLeft"></td><td id="tkRight"></td><td id="xt"></td><td id="cvp"></td>  <td id="bradenSco"></td><td id="adlSco"></td><td id="nrsSco"></td><td id="gcsSco"></td><td id="morseSco"></td><td id="zyfxpfSco"></td><td id="rl"></td><td id="cl"></td><td id="jchl"></td><td id="bqgc"></td><td id="hsusrnames" valign="top"></td></tr>');
      $('.printable').css({ "font-size": "3.2mm", "border": "1px solid #000", "width": "98%", "margin-left": "1%", "margin-top": "3mm", "border-collapse": "collapse" });
      $(".printable th").css({ "border": "1px solid #000" });
      $(".printable td").css({ "border": "1px solid #000", "text-align": "center" });
      $("#hsusrnames").css({ "text-align": "left" });
      $("#bqgc").css({ "text-align": "left" });
      //$('.stitle').css({"width":"9mm"});
      $('span').css({ "display": "inline-block" });
      $('.printul').css({ "float": "left", "margin-left": "1%", "margin-top": "1mm" });
      $('.printul li').css({ "list-style-type": "none" });
      
      publicFun.httpServer({ url: "${baseurl}zjszyyhljld/findPrinInf.do?version=" + (new Date()).getTime(), isAsync: false }, {
        "hsphljldinfCustom.emgSeq": _emgSeq,
        "startdate": $("#start-date").val(),
        "enddate":  $("#end-date").val()
      }, successFun);
    }

    function successFun(res) {
      var emg = res.resultInfo.sysdata.emg;
      var printdata = res.resultInfo.sysdata.printlist;
      setPrtable(printdata);
      setPrmsg(emg);
    }
    //utf8和16进制相互转换
    function hexToString(s1) {
      var tmp2 = '',
        res = '';
      for (i = 0; i < s1.length;) {
        tmp2 += '%' + s1.substring(i, i += 2);
      }
      res = decodeURI(tmp2);
      /* res=res.replace(/%2C/g,'，');
      res=res.replace(/%2B/g,'+');
      res=res.replace(/%2D/g,'-');
      res=res.replace(/%3F/g,'？');
      res=res.replace(/%2E/g,'。');
      res=res.replace(/%3B/g,'；');*/
      for (var int = 0; int < res.length / 3; int++) {
        if (res.indexOf('%2C') > -1) {
          res = res.replace('%2C', '，')
        } else if (res.indexOf('%2B') > -1) {
          res = res.replace('%2B', '+')
        } else if (res.indexOf('%3F') > -1) {
          res = res.replace('%3F', '？')
        } else if (res.indexOf('%2E') > -1) {
          res = res.replace('%2E', '。')
        } else if (res.indexOf('%2D') > -1) {
          res = res.replace('%2D', '-')
        } else if (res.indexOf('%3B') > -1) {
          res = res.replace('%3B', '；')
        } else {
          break;
        }
      }
      return res;
    }

    function dealTkCod (_cod, _val, _other) {
      var _tkString = '';
      var _tkList = [{infocode: '0', info: '灵敏' }, {infocode: '1', info: '迟钝' }, {infocode: '2', info: '消失' }, {infocode: '3', info: '白内障' }, { infocode: '4', info: '眼球缺失' }];
      if (_cod != null) {
        for (var i = 0; i < _tkList.length; i++) {
          if (_cod == _tkList[i].infocode)
          _tkString = _tkList[i].info
        }
      }else{
      	_tkString = _val
      }
      // if (_val != null) {
      //   _tkString += _val + 'mm' + '；'
      // }
      // if (_other != null) {
      //   _tkString += '其他：' + _other + '；'
      // }
      return _tkString
    }

    function setPrtable(datas) {
      $.each(datas, function (i, data) {
        var row = $("#template").clone();
        var fieldList = ['zyfxpfSco','morseSco','gcsSco','nrsSco','adlSco','bradenSco','crtDat', 'hrtRte', 'hrtRteFlg', 'tmpNbrFlg', 'breNbrFlg', 'sbpNbrFlg', 'xyFlg', 'xtFlg', 'senRctCod', 'rl', 'cl', 'jchl', 'bqgc', 'hsusrnames', 'bqgcHex', 'tkLeft', 'tkRight', 'tkLeftCod', 'tkRightCod', 'tkLeftOther', 'tkRightOther', 'xt','cvp']
        $.each(fieldList, function (index, value) {
          if (value === 'tkLeftCod') {
            data[value] = dealTkCod(data[value],data['tkLeftOther']);
          }
          if (value === 'tkRightCod') {
            data[value] = dealTkCod(data[value],data['tkRightOther']);
          }
          if (value === 'crtDat') {
            if (data[value]) {
              data[value] = publicFun.timeFormat(new Date(data[value]), 'MM-dd hh:mm')
            }
          }
          if (data[value] !== null && data[value] !== '') {
            if (value === 'bqgc') {
              if (data['bqgc'].indexOf("？") > -1) {
                row.find('#' + value).text(hexToString(data['bqgcHex']));
              } else {
                row.find('#' + value).text(data[value]);
              }
            } else if (value === 'xtFlg') {
              row.find('#xt').text(data.xtFlg)
            }else if (value === 'hrtRte') {
              row.find('#hrtRteFlg').text(data.hrtRte)
            }
            // else if(value === 'xtFlg' && data.xtName != null){
            //   row.find('#' + value).text(data[value]+'('+data.xtName+')');
            // } 
            else {
              row.find('#' + value).text(data[value]);
            }
          } else if (value == 'xtFlg'){
            if (data['xt'] != null) {
              row.find('#xt').text(data['xt']);
            }
          }
        })
        row.appendTo("#printlist");//添加到模板的容器中
      });

      var obj = document.getElementById("printlist");
      obj.deleteRow(2);
    }

    function setPrmsg(datas) {
      if (datas != null && datas != "") {
        var fieldLists = ['emgFkName', 'cstNam', 'cstSexCod', 'emgBed', 'preDgnCod', 'mpi', 'cstAge']
        $.each(fieldLists, function (index, value) {
          if (datas[value] !== null && datas[value] !== '') {
            if (value === 'cstAge') {
              $('#' + value).html(datas[value] + datas['cstAgeCod']);
            } else {
              $('#' + value).html(datas[value]);
            }
          }
        })
      }
    }
  </script>
</body>

</html>