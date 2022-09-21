<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/base/tag.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
  <title>VTE风险评估</title>
  <%@ include file="/WEB-INF/jsp/base/common_css.jsp"%>
  <link rel="stylesheet" type="text/css" href="${baseurl}css/hzszyyhems/printShow/docPrint.css?55">
  <link rel="stylesheet" type="text/css" href="${baseurl}css/hzszyyhems/hzszyydoctor/pgd.css">
  <%@ include file="/WEB-INF/jsp/base/common_js.jsp"%>
  <script src="${baseurl}lib/avalon1.4.8/avalon.js" type="text/javascript" charset="UTF-8"></script>
  <script src="${baseurl}js/subpageJs/hzszyyhospital/pgdPage/vteRisk.avalon.js" type="text/javascript" charset="UTF-8"></script>
</head>

<body class="diseaseHtml">
  <form ms-controller="VteRisk">
    <div class="print-body">
      <p class="title">${hospitalPlatformNameGap}</p>
      <p class="subTitle">内科病人VTE风险评估表</p>
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
              <td class="centerTd">
                <label ms-attr-for="fxyz{{el.infocode}}">
                  <span class="inputSpan">
                    <span ms-class="fxyz{{el.infocode}}" class="hookShow">&nbsp;</span> {{el.remark}}
                    <!-- <input ms-attr-id="fxyz{{el.infocode}}" type="checkbox" ms-attr-checked="el.checked" ms-click="Objradioclick('fxyzCod',$index)"> -->
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
              <td class="centerTd">
                <label>
                  <span class="inputSpan">
                    {{riskVal.totalSco}}
                  </span>
                </label>
              </td>
            </tr>
            <tr>
              <td colspan="2">
                评估结果：&emsp;&emsp;&emsp;&emsp;出血高风险：
                <span class="isRisk"></span>
                <!-- <label>
                  <input type="checkbox" value="1" id="gcx" name="hspVtefxpgbCustom.vteresult" <c:if test="${hspVtefxpgbCustom.vteresult eq '1'}">checked="checked"</c:if>/>是
                </label>
                <label>
                  <input type="checkbox" value="0" id="dcx" name="hspVtefxpgbCustom.vteresult" <c:if test="${hspVtefxpgbCustom.vteresult eq '0'}">checked="checked"</c:if>/>否
                </label> -->
              </td>
            </tr>
          </table>
        </li>
        <li>
          <span>
            注：得分≥4为VTE高风险，需要进行预防，结合出血风险评估，如为出血高风险，推荐物理治疗；如为出血低风险，推荐药物联合物理治疗。请临床医生按照各科相应指南及患者具体状况订制预防方案。
          </span>
        </li>
        <li class="longFloatRightLi">
          <label>医师签名：</label>
          <span id="assessDocNam"></span>
          <label>日期：</label>
          <span id="_signDate"></span>
        </li>
      </ul>
    </div>
  </form>
  <script type="text/javascript">
    function getList() {
      publicFun.httpServer({ url: '${baseurl}zyylqblqrb/findRiskAssSheetList.do' }, {}, function (data) {
        vm.systemList.fxyzCodList = data.resultInfo.sysdata.fxyzCodList;
        getMsgVal();
      });
    }

    function getMsgVal() {
      var arr = [];
      if ('${hspVtefxpgbCustom.fxyzCod}') {
        vm.riskVal.fxyzCod = '${hspVtefxpgbCustom.fxyzCod}';
        arr = vm.riskVal.fxyzCod.split(',');
      }
      vm.riskVal.totalSco = '${hspVtefxpgbCustom.totalSco}';
      var list = vm['systemList']['fxyzCodList']
      $.each(arr, function (idx, val) {
        $.each(list, function (index, value) {
          if (val == value['infocode']) {
            $('.fxyz' + value['infocode']).html('√')
          }
        });
      })
    }

    function initAge() {
      if ('${hspemginfCustom.cstAge}') {
        $('#_age').val('${hspemginfCustom.cstAge}${hspemginfCustom.cstAgeCod}')
      } else {
        $('#_age').val('')
      }
    }
    $(function () {
      getList();
      initAge();
      if (!'${hspVtefxpgbCustom.riskSeq}') {
        var newTime = publicFun.timeFormat(new Date(), 'yyyy/MM/dd hh:mm:ss');
        $('#_signDate').html(newTime);
        $('#assessDocNam').html('${sessionScope.activeUser.usrname}');
      } else {
        $('#_signDate').html('${hspVtefxpgbCustom.assessDate}')
        $('#assessDocNam').html('${hspVtefxpgbCustom.assessDocNam}')
        if ('${hspVtefxpgbCustom.vteresult}' === '1') {
          $('.isRisk').html('是')
        } else if ('${hspVtefxpgbCustom.vteresult}' === '0') {
          $('.isRisk').html('否')
        } else {
          $('.isRisk').html('')
        }
      }
    })
  </script>
</body>

</html>