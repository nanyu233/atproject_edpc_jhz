<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/base/tag.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
  <title>内科患者出血评估表</title>
  <%@ include file="/WEB-INF/jsp/base/common_css.jsp"%>
  <link rel="stylesheet" type="text/css" href="${baseurl}css/hzszyyhems/printShow/docPrint.css?55">
  <link rel="stylesheet" type="text/css" href="${baseurl}css/hzszyyhems/hzszyydoctor/pgd.css">
  <%@ include file="/WEB-INF/jsp/base/common_js.jsp"%>
  <script src="${baseurl}lib/avalon1.4.8/avalon.js" type="text/javascript" charset="UTF-8"></script>
  <script src="${baseurl}js/subpageJs/hzszyyhospital/pgdPage/patientBleed.avalon.js" type="text/javascript" charset="UTF-8"></script>
</head>

<body class="diseaseHtml">
  <form ms-controller="PatientBleed">
    <div class="print-body">
      <p class="title">${hospitalPlatformNameGap}</p>
      <p class="subTitle">内科患者出血评估表</p>
      <ul class="print-ul">
        <li class="bordered">
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
            <span id="_emgFkCod">${hspemginfCustom.emgFkCod}</span>
          </span>
          <span class="basic-span">
            <label class="title-label">病历号：</label>
            <span id="_mpi">${hspemginfCustom.mpi}</span>
          </span>
          <span class="basic-span">
            <label class="title-label">留观号：</label>
            <span id="_lgh">${hspemginfCustom.observationCode}</span>
          </span>
        </li>
        <li class="floatBody">
          <table class="bleedtable" id="bleed1">
            <tr>
              <td class="centerTd">
                满足以下1项即为高出血风险
              </td>
            </tr>
            <tr ms-repeat="systemList.highrisk1CodList">
              <td>
                <label ms-attr-for="highrisk1{{el.infocode}}">
                  <span class="inputSpan">
                    <span ms-class="highrisk1{{el.infocode}}" class="hookShow">&nbsp;</span>
                    {{el.info}}
                  </span>
                </label>
              </td>
            </tr>
          </table>
          <table class="bleedtable2" id="bleed2">
            <tr>
              <td class="centerTd">
                满足以下2项或以上即为高出血风险
              </td>
            </tr>
            <tr ms-repeat="systemList.highrisk2CodList">
              <td>
                <label ms-attr-for="highrisk2{{el.infocode}}">
                  <span class="inputSpan">
                    <span ms-class="highrisk2{{el.infocode}}" class="hookShow">&nbsp;</span>
                    {{el.info}}
                  </span>
                </label>
              </td>
            </tr>
          </table>
          <table class="resulttable">
            <tr>
              <td>
                评估结果：&emsp;&emsp;&emsp;&emsp;出血高风险：
                <span class="isRisk"></span>
              </td>
            </tr>
          </table>
        </li>
        <li class="longFloatRightLi">
          <label>医师签名：</label>
          <span id="_docName"></span>
          <label>日期：</label>
          <span id="_signDate"></span>
        </li>
      </ul>
    </div>
  </form>
  <script type="text/javascript">
    var num = 0;
    var cue;
    var tbadd = 1;
    function getList() {
      publicFun.httpServer({ url: '${baseurl}zyylqblqrb/findRiskAssSheetList.do' }, {}, function (data) {
        var data1 = data.resultInfo.sysdata.highrisk1CodList;
        var data2 = data.resultInfo.sysdata.highrisk2CodList;
        if (data1.length > data2.length) {
          num = parseInt(data1.length) - parseInt(data2.length);
          cue = 0;
          for (var i = 0; i < num; i++) {
            $("#bleed2").append("<tr><td></td><tr>");
          }
        } else {
          num = parseInt(data2.length) - parseInt(data1.length);
          cue = 1;
          for (var i = 0; i < num; i++) {
            $("#bleed1").append("<tr><td></td></tr>");
          }
        }
        vm.systemList.highrisk1CodList = data1;
        vm.systemList.highrisk2CodList = data2;
        getMsgVal();
      })
    }

    function getMsgVal() {
      var arr1 = [], arr2 = [];
      if ('${hspCxfxpgbCustom.highrisk1}') {
         vm.riskVal.highrisk1 = '${hspCxfxpgbCustom.highrisk1}';
         arr1 = vm.riskVal.highrisk1.split(',');
      }
      if ('${hspCxfxpgbCustom.highrisk2}') {
        vm.riskVal.highrisk2 = '${hspCxfxpgbCustom.highrisk2}';
        arr2 = vm.riskVal.highrisk2.split(',');
      }
      setHook('highrisk1', arr1);
      setHook('highrisk2', arr2)
      // var riskAList = vm.systemList.highrisk1CodList,
      //   riskBList = vm.systemList.highrisk2CodList;
      // for (var i = 0; i < riskAList.length; i++) {
      //   if ($.inArray(riskAList[i].infocode, arr1) > -1) {
      //     $('.highrisk1' + riskAList[i].infocode).html('√')
      //   }
      // }
      // for (var i = 0; i < riskBList.length; i++) {
      //   if ($.inArray(riskBList[i].infocode, arr2) > -1) {
      //     $('.highrisk2' + riskBList[i].infocode).html('√')
      //   }
      // }
    }
    function setHook (listName, arr) {
      var list = vm.systemList[listName + 'CodList'];
      for (var i = 0; i < list.length; i++) {
        if ($.inArray(list[i].infocode, arr) > -1) {
          $('.' + listName + list[i].infocode).html('√')
        }
      }
    }
    function initAge() {
      if ('${hspemginfCustom.cstAge}') {
        $('#_age').val('${hspemginfCustom.cstAge}${hspemginfCustom.cstAgeCod}')
      } else {
        $('#_age').val('')
      }
    }
    $(function () {
      initAge();
      getList();
      if (!'${hspCxfxpgbCustom.riskSeq}') {
        $('#_docName').html('${sessionScope.activeUser.usrname}');
        $('#_signDate').html(publicFun.timeFormat(new Date(), 'yyyy/MM/dd hh:mm:ss'));
      } else {
        $('#_docName').html('${hspCxfxpgbCustom.assessDocNam}');
        var newTime = '${hspCxfxpgbCustom.assessDate}';
        $('#_signDate').html(newTime);
        if ('${hspCxfxpgbCustom.assresult}' === '1') {
          $('.isRisk').html('是')
        } else if ('${hspCxfxpgbCustom.assresult}' === '0') {
          $('.isRisk').html('否')
        } else {
          $('.isRisk').html('')
        }
      }
    })
  </script>
</body>

</html>