<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/base/tag.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
  <meta charset="UTF-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
  <title>疼痛评分细则</title>
  <%@ include file="/WEB-INF/jsp/base/common_css.jsp"%>
  <%@ include file="/WEB-INF/jsp/base/common_js.jsp"%>
  <link rel="stylesheet" type="text/css" href="${baseurl}css/hzszyyhems/popbox.css?5">
  <link rel="stylesheet" type="text/css" href="${baseurl}css/hzszyyhems/scoreQuery.css?v=${versionDay}">
  <link rel="stylesheet" type="text/css" href="${baseurl}css/hems/nrs/nrs.css?v=${versionDay}">
  <script>
    var _baseUrl = "${baseurl}"
  </script>
  <script src="${baseurl}lib/avalon1.4.8/avalon.js" type="text/javascript" charset="UTF-8"></script>
</head>

<body class="scoreQuery thinTab" ms-controller="queryJbs">
  <p class="headtitle">疾病史</p>
  <div class="panelBlock jbsDiv">
    <label class="lab-title" ms-repeat="getMsgList.jbsList">
      <input ms-attr-id="jbs{{el.infocode}}" type="checkbox" ms-attr-value="el.info" ms-duplex="getMsg.jbsDes"
      ms-change="arrToStr('jbsDes')" /> {{el.info}}
    </label>
    <input class="hidden" type="text" ms-duplex-string="getHideMsg.jbsDes">
  </div>
  <div class="left-score">
    <div class="grp_btn">
      <a class="easyui-linkbutton addbtn" iconCls="icon-ok" ms-click="fillMsg()">确定</a>
      <a class="easyui-linkbutton closebtn" iconCls="icon-cancel" onclick="parent.closemodalwindow()">关闭</a>
    </div>
  </div>
  <script type="text/javascript">
    var _jbsList = publicFun.getDict('JBS_COD');
    var vm = avalon.define({
      $id: "queryJbs",
      getMsgList: {
        jbsList: _jbsList
      },
      getMsg:{
        jbsDes:[]
      },
      getHideMsg:{
        jbsDes:''
      },
      arrToStr: function (objName) {
        if (vm.getMsg[objName].$model.length > 0) {
          vm.getHideMsg[objName] = vm.getMsg[objName].$model.join(',')
        } else {
          vm.getHideMsg[objName] = ''
        }
      },
      fillMsg:function(){
        parent.sub.hlpgbpatientMsg.jbsDes = vm.getHideMsg.jbsDes;
        parent.closemodalwindow()
      }
    })
  </script>
</body>

</html>