<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/base/tag.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
  <title>首次病程</title>
  <%@ include file="/WEB-INF/jsp/base/common_css.jsp"%>
  <link rel="stylesheet" type="text/css" href="${baseurl}css/hzszyyhems/printShow/docPrint.css?55">
  <%@ include file="/WEB-INF/jsp/base/common_js.jsp"%>
</head>

<body class="diseaseHtml">
  <form>
    <div class="print-body">
      <p class="title">${hospitalPlatformNameGap}</p>
      <p class="subTitle">首次病程记录</p>
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
        <li class="printFullLi">
          <label class="labTitle">病例特点：</label>
        </li>
        <li class="printFullLi">
          <pre id="_diseasePoint">${hspDiseaseCourseCustom.diseasePoint}</pre>
        </li>
        <li class="printFullLi">
          <label class="labTitle">初步诊断：</label>
          <pre id="_ryzdxy">${hspemginfCustom.jbzdDes}</pre>
        </li>
        <li class="printFullLi">
          <label class="labTitle">诊疗计划：</label>
        </li>
        <li class="printFullLi">
          <pre id="_treatmentPlan">${hspDiseaseCourseCustom.treatmentPlan}</pre>
        </li>
        <li class="floatRightLi">
          <label>医师签名：</label>
          <span id="_docName"></span>
        </li>

        <li class="floatRightLi">
          <label>日期：</label>
          <span id="_courseDate"></span>
        </li>
      </ul>
    </div>
  </form>

  <script type="text/javascript">
    function initAge() {
      if ('${hspemginfCustom.cstAge}') {
        $('#_age').html('${hspemginfCustom.cstAge}${hspemginfCustom.cstAgeCod}')
      } else {
        $('#_age').html('')
      }
    }
    function initFirstMsg () {
      if ('${hspDiseaseCourseCustom.diseaseCourseSeq}') {
        $('#_docName').html('${hspDiseaseCourseCustom.createNam}');
        $('#_courseDate').html('${hspDiseaseCourseCustom.courseDateStr}');
      } else {
        $('#_docName').html('${activeUser.usrname}');
        var newTime = publicFun.timeFormat(new Date(), 'yyyy/MM/dd hh:mm:ss');
        $('#_courseDate').html(newTime);
      }
    }

    $(function () {
      initAge();
      initFirstMsg();
    })
  </script>
</body>

</html>