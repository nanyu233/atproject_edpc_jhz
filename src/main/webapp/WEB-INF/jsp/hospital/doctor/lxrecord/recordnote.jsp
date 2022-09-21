<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/base/tag.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
  <title>留抢病历</title>
  <%@ include file="/WEB-INF/jsp/base/common_css.jsp"%>
  <link rel="stylesheet" type="text/css" href="${baseurl}css/hzszyyhems/printShow/docPrint.css?55">
  <%@ include file="/WEB-INF/jsp/base/common_js.jsp"%>
  <script type="text/javascript" charset="utf-8">
    var _baseUrl = '${baseurl}',
      _cratNbr = '${_cratNbr}',
      _emgSeq = '${hspemginfCustom.emgSeq}',
      _sqlStaCod = '${hspemginfCustom.sqlStaCod}',
      _cstAgeNew = '${hspemginfCustom.cstAge}',
      _cstAgeCodNew = '${hspemginfCustom.cstAgeCod}',
      _name = '${sessionScope.activeUser.usrname}',
      _number = '${sessionScope.activeUser.usrno}',
      _sexVal = '${hspemginfCustom.cstSexCod}';
    var _periodList = [{ info: '经期', infocode: '0' }, { info: '非经期', infocode: '22' }, { info: '妊娠', infocode: '1' }, { info: '已绝经', infocode: '2' }];
  </script>
  <script src="${baseurl}lib/avalon1.4.8/avalon.js" type="text/javascript" charset="UTF-8"></script>
</head>

<body class="printHtml" ms-controller="recordnote">
  <div class="mainbody">
    <jsp:include page="/WEB-INF/jsp/hospital/doctor/lxrecord/printrecordnote.jsp"></jsp:include>
  </div>
  <script type="text/javascript" charset="utf-8">
    var recordvm = avalon.define({
      $id: 'recordnote',
      recordList: {
        rsztCodList: [{ checked: false, infocode: '0', info: '否' }, { checked: false, infocode: '1', info: '是' }],
        mnsSitCodList: _periodList//女性月经史
      },
      recordMsg: {
        lqblSeq: '',//id
        lqblDes: '',//主述
        lqblDat: '', //入院日期
        pastHisCod: '',//既往史
        gmsDes: '',//过敏史内容
        gmsFlg: 0,//过敏史
        medHisCod: 0,//疾病史
        medHis: '',//疾病史内容
        drugHisCod: 0,//有无用药史(0:无 1:有)
        drugHis: '',//用药史
        oprtHisCod: 0,//有无手术史(0:无 1:有)
        oprtHis: '',//手术史
        tramHisCod: 0,//有无外伤史(0:无 1:有)
        tramHis: '',//外伤史
        crbHisCod: 0,//有无疫区、禽类、传染病接触史
        crbHis: '',//疫区、禽类、传染病接触史
        obstHis: '',//婚育史
        mcyjDat: '',//末次月经
        famlHis: '',//家族史
        rsztCod: '',//是否妊娠状态(0:否 1:是)
        tgjcXyFlg: '',//血压扩充
        tgjcXyUp: '',//血压上
        tgjcXyDown: '',//血压下
        tgjcTwFlg: '1',//体温扩充
        tgjcTw: '',//体温
        tgjcMbFlg: '',//脉搏扩充
        tgjcMb: '',//心率
        tgjcPulse: '', // 脉搏
        tgjcTt: null, // 疼痛评分
        tgjcHxFlg: '',//呼吸扩充
        tgjcHx: '',//呼吸
        tgjcCbzyFlg: '',//床边指氧饱和度扩充
        tgjcCbzy: '',//床边指氧饱和度
        ctnrDes: '',//查体内容
        fzjcDes: '',//辅助检查
        cstDspCod: '',//病人去向
        lqblBrqx: '',//病人去向2
        cratNam: '',//医生name
        cratNbr: '',//医生number
        menopsAge: '',//绝经年龄
        lqblCont: '',//留抢大字段
        mnsSitCod: '',//女性月经史
        caseHis: '',//怀孕周数
        sexVal: '${hspemginfCustom.cstSexCod}',//性别
        tgjcXtFlg: '1',//血糖扩充
        tgjcXt: '',//血糖 
        oprtDat: ''//时间
      }
    })

    function getMsgList() {
      $.ajax({
        url: _baseUrl + 'zyylqblqrb/findLqbl.do',
        async: false,
        data: {
          emgSeq: _emgSeq
        },
        success: function (res) {
          setVal(res);
        }
      })
    }
    function setVal(res) {
      for (var key in res) {
        if (recordvm.recordMsg.hasOwnProperty(key)) {
          var _value = res[key];
          if (_value != '' && _value != null) {
            recordvm.recordMsg[key] = _value;
            if (key === 'lqblDat' || key === 'oprtDat') {
              recordvm.recordMsg[key] = publicFun.timeFormat(new Date(_value), 'yyyy/MM/dd hh:mm:ss')
            }
            if (key === 'mcyjDat') {
              recordvm.recordMsg[key] = publicFun.timeFormat(new Date(_value), 'yyyy/MM/dd')
            }
          }
          if (!res.lqblSeq) {
            if (key === 'oprtDat') {
              recordvm.recordMsg[key] = publicFun.timeFormat(new Date(), 'yyyy/MM/dd hh:mm:ss')
            }
            recordvm.recordMsg.cratNam = _name;
            recordvm.recordMsg.cratNbr = _number;
          }
        }
      }
      setValue(res);
    }
    $(function () {
      var height = $('#main', parent.document).height();
      $('.mainbody').height(height);
      getMsgList();
    })
  </script>
</body>

</html>