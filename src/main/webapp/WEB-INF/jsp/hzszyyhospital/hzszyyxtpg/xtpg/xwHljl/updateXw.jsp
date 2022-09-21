<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/base/tag.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
  <%@ include file="/WEB-INF/jsp/base/common_css.jsp"%>
  <link rel="stylesheet" type="text/css" href="${baseurl}css/common/tableStyle.css">
  <link rel="stylesheet" type="text/css" href="${baseurl}css/hems/global.css">
  <%@ include file="/WEB-INF/jsp/base/common_js.jsp"%>
  <title>洗胃护理记录单新增/修改</title>
  <script type="text/javascript" charset="utf-8">
    var _emgSeq = '${emgSeq}';
    var _xwhiSeq = '${xwhiSeq}'
  </script>

  <script src="${baseurl}lib/avalon1.4.8/avalon.js" type="text/javascript" charset="UTF-8"></script>
  <script language="javascript" src="${baseurl}Lodop6.216/LodopFuncs.js"></script>
</head>
<body>
  <div ms-controller="updateXw" class="xwXz">
    <form id="updateXwform" name="updateXwform" class="form" action="${baseurl}zyytshljld/editXwhljldSubmit.do" method="post">
      <input type="text" class="hidden" name="hspXwhljldInfCustom.emgSeq" value="${emgSeq}">
      <input type="text" class="hidden" name="hspXwhljldInfCustom.xwhiSeq" value="${xwhiSeq}">
      <table>
        <tbody>
          <tr>
            <th>记录时间：</th>
            <td colspan="7">
              <input class="Wdate spcWdate" type="text" name="hspXwhljldInfCustom.recordDat" readonly
              ms-duplex-string="patientMsg.recordDat" onclick="WdatePicker({dateFmt:'yyyy/MM/dd HH:mm'})">
            </td>
          </tr>
          <tr>
            <td colspan="8">基本信息</td>
          </tr>
          <tr>
            <th>姓名：</th>
            <td>{{basicInfo.cstNam}}</td>
            <th>性别：</th>
            <td>{{basicInfo.cstSexCod}}</td>
            <th>年龄：</th>
            <td colspan="3">{{basicInfo.cstAgeAll}}</td>
          </tr>
          <tr>
            <th>评估时间：</th>
            <td colspan="3">
              <input type="text" class="input-sdate Wdate" onclick="WdatePicker({dateFmt:'yyyy/MM/dd HH:mm'})" readonly
               ms-duplex-string="patientMsg.assDat" name="hspXwhljldInfCustom.assDat">
            </td>
            <th>评估人：</th>
            <td colspan="3">
              <input type="text" ms-duplex-string="patientMsg.assName" name="hspXwhljldInfCustom.assName">
            </td>
          </tr>
          <tr>
            <td colspan="8">生命体征</td>
          </tr>
          <tr>
            <th>HR：</th>
            <td>
              <input type="text" class="tzInput" ms-duplex-string="patientMsg.hrtRte" name="hspXwhljldInfCustom.hrtRte">次/分
            </td>
            <th>BP：</th>
            <td>
              <input type="text" class="tzxyInput" ms-duplex-string="patientMsg.sbpUpNbr" name="hspXwhljldInfCustom.sbpUpNbr"><span class="f-left">/</span>
              <input type="text" class="tzxyInput" ms-duplex-string="patientMsg.sbpDownNbr" name="hspXwhljldInfCustom.sbpDownNbr">
            </td>
            <th>RR：</th>
            <td>
              <input type="text" class="tzInput" ms-duplex-string="patientMsg.breNbr" name="hspXwhljldInfCustom.breNbr">次/分
            </td>
            <th>SpO2：</th>
            <td>
              <input type="text" class="tzInput" ms-duplex-string="patientMsg.spo2" name="hspXwhljldInfCustom.spo2">%
            </td>
          </tr>
          <tr>
            <th>毒物：</th>
            <td colspan="7">
              <label class="checklabel" ms-repeat="systemList.dwCodList" ms-attr-for="dwCod{{el.infocode}}">
                <input ms-attr-id="dwCod{{el.infocode}}" type="checkbox" ms-duplex="patientMsg.dwCod" ms-attr-value="el.infocode" ms-change="arrToStr('dwCod')">{{el.info}}
                <span ms-if="hideMsg.dwCod.indexOf('2') != -1 && el.infocode == '2'">
                  药名：<input type="text" name="hspXwhljldInfCustom.dwYm1" ms-duplex-string="patientMsg.dwYm1">
                </span>
                <span ms-if="hideMsg.dwCod.indexOf('3') != -1 && el.infocode == '3'">
                  药名：<input type="text" name="hspXwhljldInfCustom.dwYm2" ms-duplex-string="patientMsg.dwYm2">
                </span>
                <span ms-if="hideMsg.dwCod.indexOf('4') != -1 && el.infocode == '4'">
                  药名：<input type="text" name="hspXwhljldInfCustom.dwYm3" ms-duplex-string="patientMsg.dwYm3">
                </span>
              </label>
              <input type="text" class="hidden" ms-duplex-string="hideMsg.dwCod" name="hspXwhljldInfCustom.dwCod">
            </td>
          </tr>
          <tr>
            <th rowspan="2">洗胃液：</th>
            <td colspan="7">
              <span class="f-left">种类：</span>
              <label class="checklabel" ms-repeat="systemList.xwyCodList" ms-attr-for="xwyCod{{el.infocode}}">
                <input ms-attr-id="xwyCod{{el.infocode}}" type="checkbox" ms-duplex="patientMsg.xwyCod" ms-attr-value="el.infocode" ms-change="arrToStr('xwyCod')">{{el.info}}
              </label>
              <input type="text" name="hspXwhljldInfCustom.xwyQt" ms-if="hideMsg.xwyCod.indexOf('4') != -1" ms-duplex-string="patientMsg.xwyQt">
              <input type="text" class="hidden" ms-duplex-string="hideMsg.xwyCod" name="hspXwhljldInfCustom.xwyCod">
            </td>
          </tr>
          <tr>
            <td colspan="7">
              <span class="f-left">温度：</span>
              <input type="text" name="hspXwhljldInfCustom.xwyWd" ms-duplex-string="patientMsg.xwyWd"/><span class="f-left">℃&emsp;</span>
              <span class="f-left">入量：</span>
              <input type="text" name="hspXwhljldInfCustom.xwyRl" ms-duplex-string="patientMsg.xwyRl"/>
            </td>
          </tr>
          <tr>
            <th>洗出液：</th>
            <td colspan="7">
              <span class="f-left">颜色：</span><input type="text" name="hspXwhljldInfCustom.xcyYs" ms-duplex-string="patientMsg.xcyYs"/>
              <span class="f-left">&emsp;性质：</span><input type="text" name="hspXwhljldInfCustom.xcyXz" ms-duplex-string="patientMsg.xcyXz"/>
              <span class="f-left">&emsp;出量：</span><input type="text" name="hspXwhljldInfCustom.xcyCl" ms-duplex-string="patientMsg.xcyCl"/>
            </td>
          </tr>
          <tr>
            <td colspan="8">洗胃相关症状体征</td>
          </tr>
          <tr>
            <th>面色苍白：</th>
            <td>
              <label ms-repeat="systemList.mscbCodList" ms-attr-for="mscbCod{{el.infocode}}" class="checklabel">
                <input ms-attr-id="mscbCod{{el.infocode}}" type="checkbox" ms-attr-checked="el.checked" ms-click="setRadio('mscbCod',$index)">{{el.info}}
              </label>
              <input type="text" class="hidden" name="hspXwhljldInfCustom.mscbCod" ms-duplex-string="patientMsg.mscbCod" >
            </td>
            <th>恶心：</th>
            <td>
              <label ms-repeat="systemList.exCodList" ms-attr-for="exCod{{el.infocode}}" class="checklabel">
                <input ms-attr-id="exCod{{el.infocode}}" type="checkbox" ms-attr-checked="el.checked" ms-click="setRadio('exCod',$index)">{{el.info}}
              </label>
              <input type="text" class="hidden" name="hspXwhljldInfCustom.exCod" ms-duplex-string="patientMsg.exCod" >
            </td>
            <th>呕吐：</th>
            <td colspan="3">
              <label ms-repeat="systemList.otCodList" ms-attr-for="otCod{{el.infocode}}" class="checklabel">
                <input ms-attr-id="otCod{{el.infocode}}" type="checkbox" ms-attr-checked="el.checked" ms-click="setRadio('otCod',$index)">{{el.info}}
              </label>
              <input type="text" class="hidden" name="hspXwhljldInfCustom.otCod" ms-duplex-string="patientMsg.otCod" >
            </td>
          </tr>
          <tr>
            <th>腹部膨隆：</th>
            <td>
              <label ms-repeat="systemList.fbplCodList" ms-attr-for="fbplCod{{el.infocode}}" class="checklabel">
                <input ms-attr-id="fbplCod{{el.infocode}}" type="checkbox" ms-attr-checked="el.checked" ms-click="setRadio('fbplCod',$index)">{{el.info}}
              </label>
              <input type="text" class="hidden" name="hspXwhljldInfCustom.fbplCod" ms-duplex-string="patientMsg.fbplCod" >
            </td>
            <th>腹胀：</th>
            <td>
              <label ms-repeat="systemList.fzCodList" ms-attr-for="fzCod{{el.infocode}}" class="checklabel">
                <input ms-attr-id="fzCod{{el.infocode}}" type="checkbox" ms-attr-checked="el.checked" ms-click="setRadio('fzCod',$index)">{{el.info}}
              </label>
              <input type="text" class="hidden" name="hspXwhljldInfCustom.fzCod" ms-duplex-string="patientMsg.fzCod" >
            </td>
            <th>腹痛：</th>
            <td colspan="3">
              <label ms-repeat="systemList.ftCodList" ms-attr-for="ftCod{{el.infocode}}" class="checklabel">
                <input ms-attr-id="ftCod{{el.infocode}}" type="checkbox" ms-attr-checked="el.checked" ms-click="setRadio('ftCod',$index)">{{el.info}}
              </label>
              <input type="text" class="hidden" name="hspXwhljldInfCustom.ftCod" ms-duplex-string="patientMsg.ftCod" >
            </td>
          </tr>
          <tr>
            <th>其他：</th>
            <td colspan="7">
              <input type="text" class="fullQtInput" name="hspXwhljldInfCustom.xwtzQt" ms-duplex-string="patientMsg.xwtzQt" >
            </td>
          </tr>
          <tr>
            <td colspan="8" class="last_td">
              <div class="center grp_btn">
                <a class="easyui-linkbutton" iconCls="icon-ok" id="submitBtn" onclick="insert()">确定</a>
                <a class="easyui-linkbutton" iconCls="icon-cancel" id="closebtn" onclick="parent.closemodalwindow()">关闭</a>
              </div>
            </td>
          </tr>
        </tbody>
      </table>
    </form>
  </div>

  <script type="text/javascript" charset="utf-8">
    var ywList = [{infocode:'0',info:'无',checked:false},{infocode:'1',info:'有',checked:false}];
    var sub = avalon.define({
      $id: 'updateXw',
      systemList:{
        dwCodList:[{infocode:'1',info:'百草枯',checked:false},{infocode:'2',info:'有机磷农药',checked:false},{infocode:'3',info:'安眠药',checked:false},
                  {infocode:'4',info:'其他',checked:false},{infocode:'5',info:'不详',checked:false}],
        xwyCodList:[{infocode:'1',info:'温开水',checked:false},{infocode:'2',info:'1:15000高锰酸钾',checked:false},{infocode:'3',info:'2-4%钛酸氢萘',checked:false},
                  {infocode:'4',info:'其他',checked:false}],
        mscbCodList:ywList,
        exCodList:ywList,
        otCodList:ywList,
        fbplCodList:ywList,
        fzCodList:ywList,
        ftCodList:ywList,
      },
      patientMsg: {
        recordDat:publicFun.timeFormat(new Date(), "yyyy/MM/dd hh:mm"),
        assName:'',
        assDat:publicFun.timeFormat(new Date(), "yyyy/MM/dd hh:mm"),
        hrtRte:'',
        breNbr:'',
        spo2:'',
        sbpUpNbr:'',
        sbpDownNbr:'',
        dwCod:[],
        dwYm1:'',
        dwYm2:'',
        dwYm3:'',
        xwyCod:[],
        xwyQt:'',
        xwyWd:'',
        xwyRl:'',
        xcyYs:'',
        xcyXz:'',
        xcyCl:'',
        mscbCod:'',
        exCod:'',
        otCod:'',
        fbplCod:'',
        fzCod:'',
        ftCod:'',
        xwtzQt:''
      },
      basicInfo:{
        cstNam:'',
        cstSexCod:'',
        cstAgeAll:''
      },
      hideMsg:{
        dwCod:'',
        xwyCod:''
      },
      setRadio: function (obj, idx) {
        sub.patientMsg[obj] = publicFun.radioClicks(sub.systemList[obj + 'List'],sub.patientMsg[obj],idx)
      },
      arrToStr: function (objName) {
        if (sub.patientMsg[objName].$model.length > 0) {
          sub.hideMsg[objName] = sub.patientMsg[objName].$model.join(',');
        } else {
          sub.hideMsg[objName] = ''
        }
      },
    })

    /**
     * 监听毒物
     */
    sub.hideMsg.$watch('dwCod', function (newVal, oldVal) {
      if (newVal.indexOf('2') == -1) {
        sub.patientMsg.dwYm1 = ''
      }
      if (newVal.indexOf('3') == -1) {
        sub.patientMsg.dwYm2 = ''
      }
      if (newVal.indexOf('4') == -1) {
        sub.patientMsg.dwYm3 = ''
      }
    });

    /**
     * 监听洗胃液
     */
     sub.hideMsg.$watch('xwyCod', function (newVal, oldVal) {
      if (newVal.indexOf('4') == -1) {
        sub.patientMsg.xwyQt = ''
      }
    });
    
    function getCheckBoxList() {
      return ["mscbCod", "exCod", "otCod","fbplCod", "fzCod", "ftCod"];
    }

    function getXwMsg(){
      publicFun.httpServer({ url: '${baseurl}zyytshljld/findXwhljldByXwhiSeq.do' }, { "xwhiSeq": _xwhiSeq ,'emgSeq':_emgSeq}, function (data) {
        if(data.resultInfo.type == 1){
          var _checkList = getCheckBoxList();
          var _data = data.resultInfo.sysdata;
          var _msgList = ['cstNam','cstSexCod','cstAge'];
          $.each(_msgList,function(idx,val){
            if(_data.hspemginfCustom[val] != ''&& _data.hspemginfCustom[val] != null){
              sub.basicInfo[val] = _data.hspemginfCustom[val];
              if(val == 'cstAge'){
                sub.basicInfo['cstAgeAll'] = _data.hspemginfCustom[val];
              }
            }
          })

          for (var _key in _data['hspXwhljldInf']) {
            if(_data['hspXwhljldInf'][_key] != null){
              if(_key == 'dwCod' || _key == 'xwyCod'){
                sub.hideMsg[_key] = _data.hspXwhljldInf[_key];
                sub.patientMsg[_key] = _data.hspXwhljldInf[_key].split(",");
              }else if(_key == 'recordDat' || _key == 'assDat'){
                sub.patientMsg[_key] = publicFun.timeFormat(new Date(_data['hspXwhljldInf'][_key]), "yyyy/MM/dd hh:mm")
              }else{
                sub.patientMsg[_key] = _data['hspXwhljldInf'][_key]
              }

              if ($.inArray(_key, _checkList) > -1) {
                $.each(sub.systemList[_key + 'List'], function (idx, val) {
                  if (val['infocode'] == sub.patientMsg[_key]) {
                    val['checked'] = true
                  }
                })
              }
            }
          }
        }
      })
    }

    function insert_callback(data){
      message_alert(data);
      if (data.resultInfo.type == 1) {
        setTimeout(function () {
          parent.closemodalwindow();
          parent.reload()
        }, 1000)
      }
    }

    function insert(){
      jquerySubByFId('updateXwform', insert_callback, null, "json");
    }

    $(function(){
      getXwMsg();
    })
  </script>
</body>

</html>