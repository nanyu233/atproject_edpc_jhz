<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/base/tag.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
  <title>护理评估表</title>
</head>

<body>
  <div class="edithlpgb">
    <div class="sub-title">
      护理评估单
    </div>
    <div class="edit-div" onclick="toggleedit()">
      <i class="isFinish" ms-class="active:vm.patientMsg.pgbFlag===1||vm.patientMsg.pgbFlag==='1'" ms-visible="sub.hlpgbpatientMsg.pgbFlag==1">{{vm.patientMsg.pgbMsg}}</i>
      <img src="../images/hzszyyhems/nurse/edit.png">
      <span>编辑</span>
    </div>
  </div>
  <div ms-controller="queryhlpgb" class="queryhlpgb">
    <jsp:include page="/WEB-INF/jsp/hzszyyhospital/hzszyynurse/hlpgb/hlpgbBasic.jsp"></jsp:include>
    <!-- 这边皮试还有两个备用框还没有展示 以后将以表格形式展示 -->
    <ul class="content-ul">
      <p class="subtitle">
        <span class="spanTitle spanSpc">其它</span>
      </p>
      <li ms-visible="vm.patientMsg.algHon=='2'">
        <label class="labtitle lablineheight">
          青霉素：
        </label>
        <span class="span-wrapper">
          <span class="spanwth">
            <label>结果：</label><input type="text" maxlength="10" name="hspHlpgbCustom.qtQmsRs" ms-duplex-string="hlpgbpatientMsg.qtQmsRs">
          </span>
          <span class="spanwth extraWth">
            <label>时间：</label><input class="Wdate spcWdate" type="text" name="hspHlpgbCustom.qtQmsDat" ms-duplex-string="hlpgbpatientMsg.qtQmsDat"
              onclick="WdatePicker({dateFmt:'yyyy/MM/dd HH:mm:ss'})">
          </span>
        </span>
      </li>
      <li ms-visible="vm.patientMsg.algHon=='2'">
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
      <li ms-visible="vm.patientMsg.algHon=='2'">
        <label class="labtitle lablineheight">
          TAT：
        </label>
        <span class="span-wrapper">
          <span class="spanwth">
            <label>结果：</label><input type="text" maxlength="10" name="hspHlpgbCustom.qtTatRs" ms-duplex-string="hlpgbpatientMsg.qtTatRs">
          </span>
          <span class="spanwth extraWth">
            <label>时间：</label><input class="Wdate spcWdate" type="text" name="hspHlpgbCustom.qtTatDat" ms-duplex-string="hlpgbpatientMsg.qtTatDat"
              onclick="WdatePicker({dateFmt:'yyyy/MM/dd HH:mm:ss'})">
          </span>
        </span>
      </li>
      <li ms-visible="vm.patientMsg.algHon=='2'">
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
      </li>
      <li>
        <label class="labtitle">
          发病地点：
        </label>
        <span class="span-wrapper">
          <label ms-repeat="hlpgbmsgList.hlAddrList" ms-attr-for="hlAddr{{el.infocode}}" class="checklabel">
            <input ms-attr-id="hlAddr{{el.infocode}}" type="checkbox" ms-attr-checked="el.checked" ms-click="hlpgbradioclick('hlAddr',$index)">
            {{el.info}}
          </label>
          <input class="hidden" type="text" name="hspHlpgbCustom.hlAddr" ms-duplex-string="hlpgbpatientMsg.hlAddr">
        </span>
      </li>
      <li>
        <label class="labtitle lablineheight">
          紧急联系：
        </label>
        <span class="span-wrapper">
          <span class="spanwth">
            <label>联系人姓名：</label><input type="text" maxlength="10" name="hspHlpgbCustom.jjlxNam" ms-duplex-string="hlpgbpatientMsg.jjlxNam">
          </span>
          <span class="spanwth">
            <label>电话：</label><input type="text" maxlength="11" name="hspHlpgbCustom.jjlxTel" ms-duplex-string="hlpgbpatientMsg.jjlxTel"
              ms-keyup="hlpgbonlyNum('jjlxTel')" ms-change="hlpgbonlyNum('jjlxTel')" ms-input="hlpgbonlyNum('jjlxTel')">
          </span>
          <span class="debtspan">
            欠款：
            <label ms-repeat="hlpgbmsgList.qkCodList" ms-attr-for="qkCod{{el.infocode}}">
              <input ms-attr-id="qkCod{{el.infocode}}" type="checkbox" ms-attr-checked="el.checked" ms-click="hlpgbradioclick('qkCod',$index)">
              {{el.info}}
            </label>
            <input class="hidden" type="text" name="hspHlpgbCustom.qkCod" ms-duplex-string="hlpgbpatientMsg.qkCod">
          </span>
        </span>
      </li>
    </ul>
    <ul class="content-ul">
      <p class="subtitle">
        <span class="spanTitle spanSpc">备注</span>
      </p>
      <li class="fullli">
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
      </li>
    </ul>
    <textarea class="bigDataHlpgDiv" id="bigDataHlpgDiv" ms-duplex-string="hlpgbpatientMsg.symSitDes" name="hspemginfCustom.symSitDes"
      style="display: block;" /></textarea>
    <div class="buttonGrp">
      <a class="easyui-linkbutton" iconcls="icon-ok" onclick="connectField()">生成汇总记录</a>
    </div>
  </div>
  <script type="text/javascript" charset="utf-8">
    $("body").click(function () {
      $("#userList").hide();
      $("#userNameList").hide();
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
  </script>
</body>

</html>