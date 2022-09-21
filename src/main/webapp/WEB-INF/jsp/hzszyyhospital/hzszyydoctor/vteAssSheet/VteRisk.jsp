<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/base/tag.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
  <title>VTE风险评估</title>
  <%@ include file="/WEB-INF/jsp/base/common_css.jsp"%>
  <link rel="stylesheet" type="text/css" href="${baseurl}css/hzszyyhems/hzszyydoctor/diseasecourse.css?v=${versionDay}">
  <link rel="stylesheet" type="text/css" href="${baseurl}css/hzszyyhems/hzszyydoctor/pgd.css?v=${versionDay}">
  <%@ include file="/WEB-INF/jsp/base/common_js.jsp"%>
  <script type="text/javascript" charset="utf-8">
      var _baseUrl = '${baseurl}',
        _cratNbr = '${hspVtefxpgbCustom.createDoc}';
        _emgSeq = '${hspemginfCustom.emgSeq}',
        _name = '${sessionScope.activeUser.usrname}',
        _number = '${sessionScope.activeUser.usrno}';
  </script>
  <script language="javascript" src="${baseurl}Lodop6.216/LodopFuncs.js"></script>
  <script src="${baseurl}lib/avalon1.4.8/avalon.js" type="text/javascript" charset="UTF-8"></script>
  <script src="${baseurl}js/subpageJs/hzszyyhospital/pgdPage/vteRisk.avalon.js" type="text/javascript" charset="UTF-8"></script>
</head>

<body ms-controller="VteRisk">
  <form id="vteform" action="${baseurl}riskAss/submitVteAssSheet.do" method="post">
    <div>
      <div class="all-title">
        内科病人VTE风险评估表
      </div>
      <ul class="middleul">
        <li class="infoli">
          姓名：
          <input class="titleinput" readonly="readonly" unselectable='on' value="${hspemginfCustom.cstNam}" />&emsp;
          性别：
          <input class="titleinputSpc" readonly="readonly" unselectable='on' value="${hspemginfCustom.cstSexCod}" />&emsp;
          科别：
          <input class="titleinput_kb" readonly="readonly" unselectable='on' value="急诊科门诊" />&emsp;
          病历号：
          <input class="titleinput" readonly="readonly" unselectable='on' value="${hspemginfCustom.mpi}" />&emsp;
          <!-- 留观号：
          <input class="titleinput" readonly="readonly" unselectable='on' value="${hspemginfCustom.observationCode}"
            name="hspemginfCustom.observationCode" maxlength="10" />&emsp; -->
          <input type="hidden" name="hspDiseaseCourseCustom.courseType" value="10" />
        </li>
        <li>
          <table class="vtetable">
            <tr>
              <td class="infotd">
                风险因子
              </td>
              <td class="scotd">
                分数
              </td>
            </tr>
            <tr ms-repeat="systemList.fxyzCodList">
              <td>
                <label>
                  <span class="inputSpan">
                    {{el.info}}
                  </span>
                </label>
              </td>
              <td>
                <label ms-attr-for="fxyz{{el.infocode}}">
                  <span class="inputSpan">
                    {{el.remark}}
                    <input ms-attr-id="fxyz{{el.infocode}}" type="checkbox" ms-attr-checked="el.checked" ms-click="Objradioclick('fxyzCod',$index)">

                  </span>
                </label>
              </td>
            </tr>
            <tr>
              <td>
                <label>
                  <span class="inputSpan">
                    合计
                  </span>
                </label>
              </td>
              <td>
                <label>
                  <span class="inputSpan">
                    {{riskVal.totalSco}}
                  </span>
                </label>
              </td>
            </tr>
            <tr>
              <td colspan="2">
                评估结果：&emsp;&emsp;&emsp;&emsp;出血高风险
                <label>
                  <input type="checkbox" value="1" id="gcx" name="hspVtefxpgbCustom.vteresult" <c:if test="${hspVtefxpgbCustom.vteresult eq '1'}">checked="checked"</c:if>/>是
                </label>
                <label>
                  <input type="checkbox" value="0" id="dcx" name="hspVtefxpgbCustom.vteresult" <c:if test="${hspVtefxpgbCustom.vteresult eq '0'}">checked="checked"</c:if>/>否
                </label>
              </td>
            </tr>
          </table>
          <input type="hidden" name="hspVtefxpgbCustom.fxyzCod" ms-duplex-string="riskVal.fxyzCod" />
          <input type="hidden" name="hspVtefxpgbCustom.totalSco" ms-duplex-string="riskVal.totalSco" />
          <input type="hidden" name="hspVtefxpgbCustom.riskSeq" value="${hspVtefxpgbCustom.riskSeq}" />
          <input type="hidden" name="hspVtefxpgbCustom.emgSeq" value="${hspemginfCustom.emgSeq}" />
        </li>
        <li>
          <span>
            注：得分≥4为VTE高风险，需要进行预防，结合出血风险评估，如为出血高风险，推荐物理治疗；如为出血低风险，推荐药物联合物理治疗。请临床医生按照各科相应指南及患者具体状况订制预防方案。
          </span>
        </li>
        <li class="rightli">
          <span>医师签名</span>
          <span class="spanRelative">
            <!-- onkeydown="getSignList(event)" -->
            <input type="text" class="baseinput" id="docName" maxlength="10" name="hspVtefxpgbCustom.assessDocNam" readonly>
            <input type="text" class="hidden" id="docNameNum" maxlength="10" name="hspVtefxpgbCustom.assessDoc">
            <div class="userList" id="userNameList"></div>
          </span>
          日期：
          <input class="inputlong Wdate spcWdate" type="text" id="coursedate" value="${hspVtefxpgbCustom.assessDate}"
            name="hspVtefxpgbCustom.assessDate" onclick="WdatePicker({dateFmt:'yyyy/MM/dd HH:mm:ss'})" />
        </li>
      </ul>
    </div>
  </form>
  <jsp:include page="/WEB-INF/jsp/hzszyyhospital/hzszyydoctor/vteAssSheet/printVte.jsp"></jsp:include>
  <script type="text/javascript">
    function getSignList(e) {
      if (e.keyCode == 13) {
        publicFun.SearchList('docName', 'userNameList');
      }
    }
    $("body").click(function () {
      $(".userList").hide();
    });
    function getList() {
      var url = "${baseurl}riskAss/findRiskAssSheetList.do";
      $.ajax({
        url: url,
        dataType: "json",
        async: false,
        data: '',
        success: function (data) {
          vm.systemList.fxyzCodList = data.resultInfo.sysdata.fxyzCodList;
        },
        error: function () {
          publicFun.alert("数据上传失败");
        }
      });
    }

    $('input[name="hspVtefxpgbCustom.vteresult"]').each(function () {
      singlecheck(this, 'input[name="hspVtefxpgbCustom.vteresult"]');
    });

    function singlecheck(a, thisname) {
      $(a).click(function () {
        if ($(a).attr('checked')) {
          $(thisname).removeAttr('checked');
          $(a).attr('checked', 'checked');
        }
      });
    }

    function insertuser_callback(data, printFlg) {
      window.sessionStorage.setItem('vetSave', printFlg);
      if (printFlg === 'p') {
        window.location.reload();
      } else {
        message_alert(data);
        setTimeout(function () {
          window.location.reload();
        }, 800)
      }
    }

    function saveForm(printFlg) {
      publicFun.cleanSignMsg('docName');
      if (printFlg === 'p') {
        if (parent.isOpenBox) {
          jquerySubByFId('vteform', insertuser_callback, printFlg, "json");
        } else {
          printTable()
        }
      } else {
        jquerySubByFId('vteform', insertuser_callback, null, "json");
      }
    }

    function getmsg() {
      vm.riskVal.fxyzCod = '${hspVtefxpgbCustom.fxyzCod}';
      var arr = vm.riskVal.fxyzCod.split(',');
      vm.riskVal.totalSco = '${hspVtefxpgbCustom.totalSco}';
      var list = vm['systemList']['fxyzCodList']
      $.each(arr, function (idx, val) {
        $.each(list, function (index, value) {
          if (val == value['infocode']) {
            value['checked'] = true;
          }
        });
      })
    }

    vm.riskVal.$watch('totalSco', function (newVal, oldVal) {
      if (_flag == false) {
        return;
      }
      if (newVal >= 4) {
        $('input[name="hspVtefxpgbCustom.vteresult"]').removeAttr('checked');
        $('#gcx').attr('checked', true);
      } else {
        $('input[name="hspVtefxpgbCustom.vteresult"]').removeAttr('checked');
        $('#dcx').attr('checked', true);
      }
    });

    function initMsg () {
      if(_cratNbr == ''){
        parent.checkRole(_number,'brain')
      }else{
        parent.checkRole(_cratNbr,'brain')
      }
      if ('${hspVtefxpgbCustom.riskSeq}') {
        getmsg();
        $('#docName').val('${hspVtefxpgbCustom.assessDocNam}');
        $('#docNameNum').val('${hspVtefxpgbCustom.assessDoc}');
        _flag = true;
      } else {
        _flag = true;
        var newtime = publicFun.timeFormat(new Date(), 'yyyy/MM/dd hh:mm:ss');
        $('#coursedate').val(newtime);
        $('#docName').val('${activeUser.usrname}');
        $('#docNameNum').val('${activeUser.usrno}');
      }
    }
    var _flag = false;
    $(function () {
      getList();
      initMsg();
    })
    function printVte(data) {
      var fxyzCod = data.hspVtefxpgbCustom.fxyzCod;
      if (fxyzCod != null && fxyzCod !== '') {
        var arr1 = fxyzCod.split(',');
        for (var i = 0; i < arr1.length; i++) {
          $('#fxyzp' + arr1[i]).attr('checked', true);
        }
      }
      $('#docname').html(data.hspVtefxpgbCustom.assessDocNam);
      $('#docdate').html(data.hspVtefxpgbCustom.assessDate);
      $('#id_title2').html('内科病人VTE风险评估表');
      $('.print-ul').css({"float":"left","width":"98%","font-size":"0.38cm","margin":"0 1%","padding":"0"});
      $('.print-ul li.bordered').css({"float":"left","width":"99%","margin-left":"1%","padding-bottom":"0mm","list-style":"none","text-align":"left","border-bottom":"1px solid #000","margin-bottom":"1mm","line-height":"1.5"});
      LODOP = getLodop();
      LODOP.PRINT_INITA(0, 0, "210mm", "297mm", "打印控件功能演示_Lodop功能_超文本内容缩放打印");
      LODOP.SET_PRINT_PAGESIZE(0, "210mm", "297mm", "");
      LODOP.SET_PRINT_MODE("NOCLEAR_AFTER_PRINT", true);
      LODOP.ADD_PRINT_HTM(1050, 344, "90%", "100%", "<font style='font-size:12px' format='0'><span tdata='pageNO'>第##页</span>/<span tdata='pageCount'>共##页</span></font>");
      LODOP.SET_PRINT_STYLEA(0, "ItemType", 1);
      var strStyleCSS = "<link rel='stylesheet' type='text/css' href='${baseurl}css/hzszyyhems/hzszyydoctor/pgd.css?050'>";
      LODOP.ADD_PRINT_HTM(3, 0, "100%", "100%", strStyleCSS + document.getElementById("printnote").innerHTML);
      LODOP.NewPageA();
      LODOP.SET_PRINT_STYLE("FontSize", 10);
      LODOP.PREVIEW();
    }
    window.onload = function () {
      var _print = window.sessionStorage.getItem('vetSave');
      if (_print === 'p') {
        window.sessionStorage.removeItem('vetSave');
        setTimeout(function () {
          printTable();
        }, 800);
      }
    }
    function printTable() {
      publicFun.httpServer({ url: '${baseurl}riskAss/findVteAssSheet.do?emgSeq=${hspemginfCustom.emgSeq}', isAsync: false }, {}, function (data) {
        if (data.hspVtefxpgbCustom != null) {
          printVte(data);
        }
      })
    }
  </script>
</body>

</html>