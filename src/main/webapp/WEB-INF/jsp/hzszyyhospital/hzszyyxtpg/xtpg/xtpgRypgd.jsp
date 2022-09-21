<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/base/tag.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
  <%@ include file="/WEB-INF/jsp/base/common_css.jsp"%>
  <link rel="stylesheet" type="text/css" href="${baseurl}css/hzszyyhems/hlpgb.css?6">
  <link rel="stylesheet" type="text/css" href="${baseurl}css/hzszyyhems/hljl.css?98">
  <%@ include file="/WEB-INF/jsp/base/common_js.jsp"%>
  <title>护理评估表</title>

  <script type="text/javascript" charset="utf-8">
    var comdata = parent.comdata;
    var _baseUrl = comdata.baseUrl || '${baseurl}',
      _emgSeq = comdata.emgSeq || '${emgSeq}',
      _cstNam = '${sessionScope.activeUser.usrname}', 
      typeForm = 'hlpgb';
  </script>
  <script src="${baseurl}lib/avalon1.4.8/avalon.js" type="text/javascript" charset="UTF-8"></script>
  <script src="${baseurl}js/subpageJs/hzszyyhospital/hlpgb.avalon.js?5" type="text/javascript" charset="UTF-8"></script>
  <script language="javascript" src="${baseurl}Lodop6.216/LodopFuncs.js"></script>
</head>

<body class="xtpg rybody">
  <!-- 入院护理评估单 -->
  <div class="ryhlpgbDiv xtpgxqDiv">
    <div ms-controller="queryhlpgb" class="queryhlpgb">
      <jsp:include page="/WEB-INF/jsp/hzszyyhospital/hzszyynurse/hlpgb/printhlpgb.jsp"></jsp:include>
      <form id="hlpgbform" name="hlpgbform" action="${baseurl}hlpgb/updateHlpgb.do" method="post">
        <input type="hidden" name="formToken" value="${formToken}" />
        <input class="hidden" type="text" ms-duplex-string="hlpgbpatientMsg.emgSeq" id="emg_emgSeq" name="hspemginfCustom.emgSeq" readonly="readonly">
        <input class="hidden" type="text" name="hspHlpgbCustom.emgSeq" readonly="readonly">
        <jsp:include page="/WEB-INF/jsp/hzszyyhospital/hzszyynurse/hlpgb/hlpgbBasic.jsp"></jsp:include>
        <!-- 这边皮试还有两个备用框还没有展示 以后将以表格形式展示 -->
        <ul class="content-ul">
          <p class="subtitle">
            <span class="spanTitle spanSpc">其它</span>
          </p>
          <!-- <li>
            <label class="labtitle lablineheight">
              青霉素：
            </label>
            <span class="span-wrapper">
              <span class="spanwth">
                <label>结果：</label><input type="text" maxlength="10" name="hspHlpgbCustom.qtQmsRs" ms-duplex-string="hlpgbpatientMsg.qtQmsRs">
              </span>
              <span class="spanwth extraWth">
                <label>时间：</label><input class="Wdate spcWdate" type="text" name="hspHlpgbCustom.qtQmsDat"
                  ms-duplex-string="hlpgbpatientMsg.qtQmsDat" onclick="WdatePicker({dateFmt:'yyyy/MM/dd HH:mm:ss'})">
              </span>
            </span>
          </li>
          <li>
            <input type="text" name="hspHlpgbCustom.qtObj1Nam" placeholder="皮试项目3" ms-duplex-string="hlpgbpatientMsg.qtObj1Nam">
            <span class="span-wrapper">
              <span class="spanwth">
                <label>结果：</label><input type="text" maxlength="10" name="hspHlpgbCustom.qtObj1Rs" ms-duplex-string="hlpgbpatientMsg.qtObj1Rs">
              </span>
              <span class="spanwth extraWth">
                <label>时间：</label><input class="Wdate spcWdate" type="text" name="hspHlpgbCustom.qtObj1Dat"
                  ms-duplex-string="hlpgbpatientMsg.qtObj1Dat" onclick="WdatePicker({dateFmt:'yyyy/MM/dd HH:mm:ss'})">
              </span>
            </span>
          </li>
          <li>
            <label class="labtitle lablineheight">
              TAT：
            </label>
            <span class="span-wrapper">
              <span class="spanwth">
                <label>结果：</label><input type="text" maxlength="10" name="hspHlpgbCustom.qtTatRs" ms-duplex-string="hlpgbpatientMsg.qtTatRs">
              </span>
              <span class="spanwth extraWth">
                <label>时间：</label><input class="Wdate spcWdate" type="text" name="hspHlpgbCustom.qtTatDat"
                  ms-duplex-string="hlpgbpatientMsg.qtTatDat" onclick="WdatePicker({dateFmt:'yyyy/MM/dd HH:mm:ss'})">
              </span>
            </span>
          </li>
          <li>
            <input type="text" name="hspHlpgbCustom.qtObj2Nam" placeholder="皮试项目4" ms-duplex-string="hlpgbpatientMsg.qtObj2Nam">
            <span class="span-wrapper">
              <span class="spanwth">
                <label>结果：</label><input type="text" maxlength="10" name="hspHlpgbCustom.qtObj2Rs" ms-duplex-string="hlpgbpatientMsg.qtObj2Rs">
              </span>
              <span class="spanwth extraWth">
                <label>时间：</label><input class="Wdate spcWdate" type="text" name="hspHlpgbCustom.qtObj2Dat"
                  ms-duplex-string="hlpgbpatientMsg.qtObj2Dat" onclick="WdatePicker({dateFmt:'yyyy/MM/dd HH:mm:ss'})">
              </span>
            </span>
          </li> -->
        </ul>
        <ul class="content-ul">
          <!-- <li class="fullli">
            <label class="labtitle lablineheight">
              去向：
            </label>
            <span class="spanwth">
              <label>病房：</label><input type="text" maxlength="10" name="hspHlpgbCustom.qxBf" ms-duplex-string="hlpgbpatientMsg.qxBf">
            </span>
            <span class="spanwth">
              <label>住院号：</label><input type="text" maxlength="10" name="hspHlpgbCustom.qxZyh" ms-duplex-string="hlpgbpatientMsg.qxZyh">
            </span>
            </span>
          </li> -->
          <li class="longSpcLi fullli">
            <label class="labtitle lablineheight">
              紧急联系：
            </label>
            <span class="span-wrapper">
              <span class="spanwth spanwthB">
                <label>联系人1：</label><input type="text" maxlength="10" name="hspHlpgbCustom.jjlxNam" ms-duplex-string="hlpgbpatientMsg.jjlxNam">
              </span>
              <span class="spanwth">
                <label>电话：</label><input type="text" maxlength="11" name="hspHlpgbCustom.jjlxTel" ms-duplex-string="hlpgbpatientMsg.jjlxTel"
                  ms-keyup="hlpgbonlyNum('jjlxTel')" ms-input="hlpgbonlyNum('jjlxTel')" ms-change="hlpgbonlyNum('jjlxTel')">
              </span>
      
              <span class="spanwth">
                <label>联系人2：</label><input type="text" maxlength="10" name="hspHlpgbCustom.jjlxNam2" ms-duplex-string="hlpgbpatientMsg.jjlxNam2">
              </span>
              <span class="spanwth">
                <label>电话：</label><input type="text" maxlength="11" name="hspHlpgbCustom.jjlxTel2" ms-duplex-string="hlpgbpatientMsg.jjlxTel2"
                  ms-keyup="hlpgbonlyNum('jjlxTel2')" ms-input="hlpgbonlyNum('jjlxTel2')" ms-change="hlpgbonlyNum('jjlxTel2')">
              </span>
            </span>
          </li>
          <li class="fullli">
            <label class="labtitle lablineheight">
              去向：
            </label>
            <input type="text" class="hidden" name="hspemginfCustom.firstsqlseq" ms-duplex-string="hlpgbpatientMsg.firstsqlseq">
            <input id="sqlSeqStr" class="hidden" type="text" name="hspsqlinfCustom.sqlSeq" ms-duplex-string="hlpgbpatientMsg.sqlSeq">
            <label class="form-text" ms-if="hlpgbpatientMsg.sqlSeq != hlpgbpatientMsg.firstsqlseq">
              <span class="span-zgInfo" id="sql_sqlDatTim">{{hlpgbpatientMsg.sqlDat}}</span>
              <span class="span-zgInfo" id="sqlStaStr">{{hlpgbpatientMsg.sqlStaStr}}</span>
              <span class="span-zgInfo" id="emg_emgFkName" ms-if="hlpgbpatientMsg.sqlStaCod == '2'">{{hlpgbpatientMsg.sqlDepName}}</span>
              <span class="span-zgInfo" id="emg_sqlDes" ms-if="hlpgbpatientMsg.sqlStaCod == '13'">{{hlpgbpatientMsg.sqlDes}}</span>
              <span class="span-zgInfo" id="emg_bedNam" ms-if="hlpgbpatientMsg.sqlStaCod == '6' || hlpgbpatientMsg.sqlStaCod == '11'">{{hlpgbpatientMsg.bedNam}}</span>
            </label>
            <label class="form-text" ms-if="hlpgbpatientMsg.sqlSeq == hlpgbpatientMsg.firstsqlseq">
              <span class="span-zgInfo">无</span>
            </label>
            <a class="commonbtn importLink" href="javascript:;" onclick="outComeInfo()">转归登记</a>
            <a class="underLineText form-text" href="javascript:;" onclick="zginfo()">转归记录</a>
          </li>
        </ul>
        <textarea class="bigDataHlpgDiv" id="bigDataHlpgDiv" ms-duplex-string="hlpgbpatientMsg.symSitDes" name="hspemginfCustom.symSitDes"
          style="display: block;" /></textarea>
          
        <div class="sub-top">
          <span class="spanRight">
            <span class="spanTitle">评估时间：</span>
            <input class="Wdate spcWdate" type="text" name="hspHlpgbCustom.assessmentDat"
            ms-duplex-string="hlpgbpatientMsg.assessmentDat" onclick="WdatePicker({dateFmt:'yyyy/MM/dd HH:mm:ss', isShowClear:false, readOnly:true})">
            <span class="spanTitle">评估者签名：</span>
            <span class="relative">
              <input type="text" id="userSign" maxlength="10" name="hspHlpgbCustom.preAssNam" ms-duplex-string="hlpgbpatientMsg.preAssNam">
              <div class="userList" id="userList">
              </div>
            </span>
          </span>
        </div>
      </form>
      <div class="center btnGroup">
        <!-- <a href="javascript:;" class="commonbtn btnLeft" onclick="connectField()">生成汇总记录</a> -->
        <a class="easyui-linkbutton" iconcls="icon-reload" onclick="reloadLocalPage()">刷新</a>
        <a class="easyui-linkbutton" iconcls="icon-ok" onclick="postPatientMsg()">保存</a>
        <a class="easyui-linkbutton" iconcls="icon-print" onclick="saveprint()">打印</a>
      </div>
    </div>
  </div>
  <script type="text/javascript" charset="utf-8">
    document.onkeydown = function (evt) {
      publicFun.keyDownRecall(evt, function () {
        if ($('#userSign').is(':focus')) {
          searchUser();
          return
        }
        if ($('#username').is(':focus')) {
          searchUserName();
          return
        }
        if ($('#usernameB').is(':focus')) {
          searchUserNameB();
          return
        }
        if ($("#driverName").is(":focus")) {
         var flg = false;
         return flg;
        }
      })
    };
    
    
    $('#driverName').click(function (e) {
      e.stopPropagation();
      sub.isShowAbnDriverList = true;
    });

    $("body").click(function () {
      sub.isShowAbnScoList = false;
      sub.isShowDocList = false;
      sub.isShowAbnDriverList = false;
      $("#userList").hide();
      $("#userNameList").hide();
      $("#userNameBList").hide();
    });
    function searchUser() {
      if (event.keyCode == 13) {
        publicFun.SearchList("userSign", "userList")
      }
    }

    function searchUserName() {
      if (event.keyCode == 13) {
        publicFun.SearchList("username", "userNameList")
      }
    }

    function searchUserNameB() {
      if (event.keyCode == 13) {
        publicFun.SearchList("usernameB", "userNameBList")
      }
    }
    function checkXt() {
      var sel = $('#xtSel').val();
      if (sel == '2' || sel == '3') {
        $("#xuet").val("");
        $("#xuet").attr("disabled", true);
        $("#xuet").attr('placeholder', "");
      } else {
        $("#xuet").attr("disabled", false);
        $("#xuet").attr('placeholder', "mmol/L");
      }
    }

    function reloadLocalPage () {
      window.location.reload();
    }

    //保存护理评估表
    function postPatientMsg() {
      var ConnectString = connectContent();
      $("#bigDataHlpgDiv").show();
      if (ConnectString != '') {
        var finalField = ConnectString.substring(0, ConnectString.length - 1);//截取开始到长度减-1的字符串，去掉逗号
        finalField += ';';
        $("#bigDataHlpgDiv").val(finalField);
      } else {
        $("#bigDataHlpgDiv").val(ConnectString);
      }
      if ((sub.hlpgbpatientMsg.qtObj1Rs != '' || sub.hlpgbpatientMsg.qtObj1Dat != '') && sub.hlpgbpatientMsg.qtObj1Nam == '') {
        publicFun.alert("请输入皮试项目");
        return false;
      }
      if ((sub.hlpgbpatientMsg.qtObj2Rs != '' || sub.hlpgbpatientMsg.qtObj2Dat != '') && sub.hlpgbpatientMsg.qtObj2Nam == '') {
        publicFun.alert("请输入皮试项目");
        return false;
      }
      initField();
      jquerySubByFId('hlpgbform', hlpgbinsertuser_callback, null, "json");
    }

    function hlpgbinsertuser_callback(data) {
      message_alert(data);
      setTimeout(function () {
        window.location.reload();
      }, 800)
    }

    function insertuser_callback(data) {
      print();
    }
    //护理评估表打印
    function saveprint() {
      initField();
      jquerySubByFId('hlpgbform', insertuser_callback, null, "json");
    }
    
    function initField () {
      var totalField = connectContent();
      if (totalField != '') {
        $("#bigDataHlpgDiv").show();
        var finalField = totalField.substring(0, totalField.length - 1);//截取开始到长度减-1的字符串，去掉逗号
        finalField += ';';
        $('#bigDataHlpgDiv').val(finalField);
      } else {
        $('#bigDataHlpgDiv').val('');
      }
    }
    
    $(function () {
      if (parent.parent._pageSrc != 'queryQjs') {
         $('.importLink').hide();
         $('form input, form textarea, form select').attr('disabled', true);
      } else {
         $('.importLink').show();
      }
    })
  </script>
</body>

</html>