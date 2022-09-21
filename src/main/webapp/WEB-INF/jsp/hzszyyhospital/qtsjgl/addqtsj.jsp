<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/base/tag.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <title>新增群体事件</title>
  <%@ include file="/WEB-INF/jsp/base/common_css.jsp"%>
  <link rel="stylesheet" type="text/css" href="${baseurl}css/common/tableStyle.css">
  <link rel="stylesheet" type="text/css" href="${baseurl}css/hems/global.css">
  <%@ include file="/WEB-INF/jsp/base/common_js.jsp"%>
  <script src="${baseurl}lib/avalon1.4.8/avalon.js" type="text/javascript" charset="UTF-8"></script>
  <script type="text/javascript">
    var _baseUrl = "${baseurl}";
  </script>
</head>

<body class="massEvent">
  <form ms-controller="qtsj" class="form lqform" id="qtsjform" action="${baseurl}qtsjgl/addqtsj.do" method="post">
    <table>
      <tbody>
        <tr>
          <th><i class="red">*</i> 事件名称：</th>
          <td colspan="3">
              <input type="text" class="totalLong" name="hspQtsjglCustom.qtsjNam" ms-duplex-string="qtsjMsg.qtsjNam"/>
          </td>
        </tr>
        <tr>
          <th><i class="red">*</i> 事件类型：</th>
          <td>
            <label ms-repeat="systemList.typeList" ms-attr-id="qtsjType{{el.infocode}}" class="floatLeft">
              <input ms-attr-id="qtsjType{{el.infocode}}" type="radio" ms-attr-value="el.infocode" ms-duplex-string="qtsjMsg.qtsjType" />
              {{el.info}} &nbsp;&nbsp;
            </label>
            <input type="text" class="hidden" name="hspQtsjglCustom.qtsjType" ms-duplex-string="qtsjMsg.qtsjType">
            <input type="text" maxlength="4" class="smallText" name="hspQtsjglCustom.qtsjTypeOther" ms-duplex-string="qtsjMsg.qtsjTypeOther" placeholder="四字以内"/>
          </td>
          <th><i class="red">*</i> 发生时间：</th>
          <td><input class="input-sdate Wdate" type="text" name="hspQtsjglCustom.qtsjDat" ms-duplex-string="qtsjMsg.qtsjDat" onclick="WdatePicker({dateFmt:'yyyy/MM/dd HH:mm:ss'})"></td>
        </tr>
        <tr>
          <th>事件地址：</th>
          <td colspan="3">
              <input type="text" class="totalLong" name="hspQtsjglCustom.adrr"/>
          </td>
        </tr>
        <tr>
          <th>简要经过：</th>
          <td colspan="3">
              <textarea class="div-textarea totalLong" name="hspQtsjglCustom.jyjg" maxlength="128"></textarea>
          </td>
        </tr>
        <tr>
          <th>抢救过程：</th>
          <td colspan="3">
              <textarea class="div-textarea totalLong" name="hspQtsjglCustom.qjgc" maxlength="128"></textarea>
          </td>
        </tr>
        <tr>
          <th>抢救小结：</th>
          <td colspan="3">
              <textarea class="div-textarea totalLong" name="hspQtsjglCustom.qjxj" maxlength="128"></textarea>
          </td>
        </tr>
        <tr>
          <th>报告部门：</th>
          <td><input type="text" name="hspQtsjglCustom.bgbm"/></td>
          <th>报告人：</th>
          <td><input type="text" name="hspQtsjglCustom.bgrnam"/></td>
        </tr>
        <tr>
          <th>登记时间：</th>
          <td><input class="Wdate" type="text" name="hspQtsjglCustom.djdat" onclick="WdatePicker({dateFmt:'yyyy/MM/dd HH:mm:ss'})"></td>
          <th>登记人：</th>
          <td><input type="text" name="hspQtsjglCustom.djrnam"/></td>
        </tr>
        <tr>
          <th>关联科室：</th>
          <td colspan="3">
              <input type="text" class="totalLong" name="hspQtsjglCustom.glks"/>
          </td>
        </tr>
        <tr>
          <th>医护人员：</th>
          <td colspan="3">
              <input type="text" class="totalLong" name="hspQtsjglCustom.yhry"/>
          </td>
        </tr>
        <tr>
          <td colspan="4" class="last_td">
            <div class="right-grp">
              <a class="easyui-linkbutton" iconCls="icon-ok" id="submitbtn" onclick="sure()">确定</a>
              <a class="easyui-linkbutton" iconCls="icon-cancel" id="closebtn" onclick="parent.closemodalwindow()">关闭</a>
            </div>
          </td>
        </tr>
      </tbody>
    </table>
  </form>

  <script type="text/javascript">
    var vm = avalon.define({
      $id: 'qtsj',
      systemList:{
        typeList:[]
      },
      qtsjMsg:{
        qtsjNam:'',
        qtsjType:'',
        qtsjDat:'',
        qtsjTypeOther: ''
      }
    })
  
    function insertqtsj_callback(data){
      message_alert(data);
	    if (data.resultInfo.type == '1') {
        setTimeout("parent.closemodalwindow()", 1000);
        parent.queryqtsj();
      }
    }

    function sure(){
      if (!vm.qtsjMsg.qtsjNam) {
        publicFun.alert("事件名称必填");
        return false;
      }
      if (!vm.qtsjMsg.qtsjType) {
        publicFun.alert("事件类型必填");
        return false;
      }
      var _nameSend = getCurrentTypeNam();
      if (_nameSend == '其他') {
        if (publicFun.strTrim(vm.qtsjMsg.qtsjTypeOther) === '') {
          publicFun.alert("事件类型其他输入必填");
          return false;
        }
      }
      if (!vm.qtsjMsg.qtsjDat) {
        publicFun.alert("发生时间必填");
        return false;
      } 
      _confirm('确定提交吗？', null, function() {
        jquerySubByFId('qtsjform', insertqtsj_callback, null, "json");
      })
    }
    
    function getCurrentTypeNam () {
      var _name = '', _list = vm.systemList.typeList.$model;
      for (var i = 0; i < _list.length; i++) {
        if (_list[i].infocode == vm.qtsjMsg.qtsjType) {
          _name = _list[i].info;
        }
      }
      return _name;
    }

    $(function(){
      var getMsgUrl =  _baseUrl +'qtsjgl/queryqtsjglinfo.do'
      publicFun.httpServer({url: getMsgUrl},{}, function(data) {
        vm.systemList.typeList = data.resultInfo.sysdata.qtsjtypeList
      })
    })
  </script>
</body>

</html>