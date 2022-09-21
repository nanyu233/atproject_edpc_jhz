<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/base/tag.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
  <meta charset="UTF-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
  <title>评分页面头部基本信息</title>
</head>

<body>
  <div class="basicDiv">
    <label class="bascilab">创建日期：
      <input class="Wdate" id="createDate" type="text" ms-duplex-string="sysMsg.createDate" onclick="WdatePicker({dateFmt:'yyyy/MM/dd HH:mm'})"
      readonly unselectable='on'>
    </label>
    <label class="bascilab">科室：<input class="basicInput longbasicInput" type="text" id="c_emgFkCod" readonly
        unselectable='on'></label>
    <label class="bascilab">床号：<input class="basicInput" type="text" id="c_emgBed" readonly unselectable='on'></label>
    <label class="bascilab">姓名：<input class="basicInput" type="text" id="c_cstNam" readonly unselectable='on'></label>
    <label class="bascilab">性别：<input class="basicInput" type="text" id="c_sex" readonly unselectable='on'></label>
    <label class="bascilab cstAgelab">年龄：<input class="basicInput" type="text" id="c_age" readonly unselectable='on'></label>
    <!-- <label class="bascilab">留观号：<input class="basicInput" type="text" id="c_lgh" readonly unselectable='on'></label> -->
  </div>
  <script type="text/javascript">
    //拿到父页面基本信息值并对该页面进行赋值
    function getParentBasicVal() {
      var _parentCodList = ['emgFkCod', 'emgBed', 'cstNam', 'sex', 'age', 'lgh'];
      for (var i = 0; i < _parentCodList.length; i++) {
        $('#c_' + _parentCodList[i]).val(parent.$('#_p' + _parentCodList[i]).html())
      }
    }
  </script>
</body>

</html>