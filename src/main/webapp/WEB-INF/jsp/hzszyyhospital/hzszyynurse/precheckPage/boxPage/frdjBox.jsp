<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/base/tag.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <title>发热登记</title>
  <%@ include file="/WEB-INF/jsp/base/common_css.jsp"%>
  <link rel="stylesheet" type="text/css" href="${baseurl}css/common/tableStyle.css">
  <link rel="stylesheet" type="text/css" href="${baseurl}css/hems/global.css?v=${versionDay}">
</head>

<body class="querylqxxdj">
  <form ms-controller="frdj" class="form lqform frdjform" id="frdjform" action="${baseurl}hzszyyemg/addFrRegisterSubmit.do" method="post">
    <input class="hidden" type="text" name="hspFrbrInfCustom.emgSeq" ms-duplex-string="getMsg.emgSeq">
    <table>
      <tbody>
        <tr>
          <th><i class="red">*</i> 发热日期</th>
          <td>
            <input ms-duplex-string="getMsg.frDat" class="input-sdate Wdate" name="hspFrbrInfCustom.frDat"
              type="text" placeholder="点击选择时间" onclick="WdatePicker({dateFmt:'yyyy/MM/dd HH:mm:ss'})" />
          </td>
          <th><i class="red">*</i> 姓名</th>
          <td>
            <input type="text" ms-duplex-string="getMsg.cstNam" name="hspFrbrInfCustom.cstNam">
          </td>
        </tr>
        <tr>
          <th>性别</th>
          <td>
            <select class="departments" name="hspFrbrInfCustom.cstSexCod" ms-duplex-string="getMsg.cstSexCod">
              <option value=""></option>
              <option ms-repeat="getMsgList.cstSexCodList" ms-attr-value="el.infocode">{{el.info}}</option>
            </select>
          </td>
          <th>年龄</th>
          <td>
            <input type="text" class="age-type" ms-duplex-string="getMsg.cstAge" name="hspFrbrInfCustom.cstAge">
            <select name="hspFrbrInfCustom.cstAgeCod" ms-duplex-string="getMsg.cstAgeCod">
              <option ms-repeat="getMsgList.cstAgeCodList" ms-attr-value="el.infocode">{{el.info}}</option>
            </select>
          </td>
        </tr>
        <tr>
          <th>国籍</th>
          <td>
            <input type="text" ms-duplex-string="getMsg.nationality" name="hspFrbrInfCustom.nationality">
          </td>
          <th>工作单位</th>
          <td>
            <input type="text" ms-duplex-string="getMsg.gzdw" name="hspFrbrInfCustom.gzdw">
          </td>
        </tr>
        <tr>
          <th>家庭地址</th>
          <td colspan="3">
            <input type="text" ms-duplex-string="getMsg.cstAdr" class="fullInput" name="hspFrbrInfCustom.cstAdr">
          </td>
        </tr>
        <tr>
          <th>身份证</th>
          <td>
            <input type="text" ms-duplex-string="getMsg.idNbr" name="hspFrbrInfCustom.idNbr">
          </td>
          <th>病历号</th>
          <td>
            <input type="text" ms-duplex-string="getMsg.mpi" name="hspFrbrInfCustom.mpi">
          </td>
        </tr>
        <tr>
          <th>患者电话、家属电话、朋友电话</th>
          <td colspan="3">
            <textarea ms-duplex-string="getMsg.contactDes" class="frdjArea"></textarea>
            <input type="text" class="hidden" ms-duplex-string="getMsg.contactDes" name="hspFrbrInfCustom.contactDes">
          </td>
        </tr>
        <tr>
          <th>是否接触过发热病人</th>
          <td>
            <label ms-repeat="getMsgList.frCodList">
              <input ms-attr-id="frCod{{el.infocode}}" type="radio" name="hspFrbrInfCustom.frCod" ms-attr-value="el.infocode"
               ms-duplex-string="getMsg.frCod" /> {{el.info}}
            </label>
          </td>
          <th>是否接触过非典病人</th>
          <td>
            <label ms-repeat="getMsgList.fdCodList">
              <input ms-attr-id="fdCod{{el.infocode}}" type="radio" name="hspFrbrInfCustom.fdCod" ms-attr-value="el.infocode"
               ms-duplex-string="getMsg.fdCod" /> {{el.info}}
            </label>
          </td>
        </tr>
        <tr>
          <th>去过哪些人口密集的公共场所</th>
          <td colspan="3">
            <input type="text" ms-duplex-string="getMsg.ggcs" class="fullInput" name="hspFrbrInfCustom.ggcs">
          </td>
        </tr>
        <tr>
          <th>乘坐过的交通工具</th>
          <td colspan="3">
            <input type="text" ms-duplex-string="getMsg.jtgj" class="fullInput" name="hspFrbrInfCustom.jtgj">
          </td>
        </tr>
        <tr>
          <th>接触过何种动物</th>
          <td colspan="3">
            <input type="text" ms-duplex-string="getMsg.jcdw" class="fullInput" name="hspFrbrInfCustom.jcdw">
          </td>
        </tr>
        <tr>
          <th>到过何地</th>
          <td colspan="3">
            <textarea ms-duplex-string="getMsg.dghd" class="frdjArea"></textarea>
            <input type="text" class="hidden" ms-duplex-string="getMsg.dghd" name="hspFrbrInfCustom.dghd">
          </td>
        </tr>
        <tr>
          <th><i class="red">*</i> 体温</th>
          <td>
            <input type="text" ms-duplex-string="getMsg.tmpNbr" name="hspFrbrInfCustom.tmpNbr">
          </td>
          <th><i class="red">*</i> 病人去向</th>
          <td>
            <select class="departments" name="hspFrbrInfCustom.brqx" ms-duplex-string="getMsg.brqx">
              <option value=""></option>
              <option ms-repeat="getMsgList.brqxList" ms-attr-value="el.infocode">{{el.info}}</option>
            </select>
          </td>
        </tr>
        <tr>
          <th>有无疟原虫</th>
          <td colspan="3">
            <label ms-repeat="getMsgList.nycCodList">
              <input ms-attr-id="nycCod{{el.infocode}}" type="radio" name="hspFrbrInfCustom.nycCod" ms-attr-value="el.infocode"
               ms-duplex-string="getMsg.nycCod" /> {{el.info}}
            </label>
          </td>
        </tr>
        
        <tr>
          <td colspan="4" class="last_td">
            <div class="center grp_btn">
              <a class="easyui-linkbutton" iconCls="icon-ok" id="submitbtn" onclick="sure()">确定</a>
              <a class="easyui-linkbutton" iconCls="icon-cancel" id="closebtn" onclick="parent.closemodalwindow()">关闭</a>
            </div>
          </td>
        </tr>
      </tbody>
    </table>
  </form>
  <script type="text/javascript" src="${baseurl}lib/easyui1.3/jquery-1.8.0.min.js"></script>
  <%@ include file="/WEB-INF/jsp/base/common_js.jsp"%>
  <script src="${baseurl}lib/avalon1.4.8/avalon.js" type="text/javascript" charset="UTF-8"></script>
  <script type="text/javascript">
    var _baseUrl;
    _baseUrl = "${baseurl}";
  </script>
  <script type="text/javascript">
    var _sfList = [{infocode:'0',info:'否'},{infocode:'1',info:'是'}],
        _nycList = [{infocode:'0',info:'无'},{infocode:'1',info:'有'}],
        _cstSexCodList = publicFun.getDict('CST_SEX_COD'),
        _cstAgeCodList = publicFun.getDict('CST_AGE_COD');
    var vm = avalon.define({
      $id: 'frdj',
      getMsgList:{
        nycCodList:_nycList,
        frCodList:_sfList,
        fdCodList:_sfList,
        cstSexCodList: _cstSexCodList, // 性别
        cstAgeCodList: _cstAgeCodList, // 年龄类型
        brqxList:[{infocode:'0',info:'离院'},{infocode:'1',info:'留观'}]
      },
      getMsg: {
        emgSeq:parent._emgSeq,
        frDat:'',
        mpi:parent.vm.patientMsg.mpi,
        cstNam:parent.vm.patientMsg.cstNam,
        cstAge:parent.vm.patientMsg.cstAge,
        cstAgeCod:parent.vm.patientMsg.cstAgeCod,
        nationality:'',
        gzdw:'',
        cstAdr:'',
        idNbr:parent.vm.patientMsg.idNbr,
        cstSexCod:parent.vm.patientMsg.cstSexCod,
        contactDes:parent.vm.patientMsg.pheNbr,
        frCod:'',
        dghd:'',
        ggcs:'',
        jtgj:'',
        jcdw:'',
        tmpNbr:'',
        brqx:'',
        nycCod:'',
        fdCod:''
      },
    })

    function checkMsg(){
      if(vm.getMsg.frDat == ''){
        publicFun.alert('发热日期未填！')
        return false
      }else if(vm.getMsg.cstNam == ''){
        publicFun.alert('病人姓名未填！')
        return false
      }else if(vm.getMsg.tmpNbr == ''){
        publicFun.alert('病人体温未填！')
        return false
      }else if(vm.getMsg.brqx == ''){
        publicFun.alert('病人去向未填！')
      }else{
        return true
      }
    }

    function insertrole_callback(data){
      message_alert(data);
      if (data.resultInfo.type == 1) {
        setTimeout("parent.closemodalwindow()", 1000);
      }
    }

    function sure(){
      if(checkMsg()){
        jquerySubByFId('frdjform', insertrole_callback, null, "json");
      }
    }
  </script>
</body>

</html>