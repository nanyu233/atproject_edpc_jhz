<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/base/tag.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
  <title>患者详情</title>
  <%@ include file="/WEB-INF/jsp/base/common_css.jsp"%>
  <%@ include file="/WEB-INF/jsp/base/common_js.jsp"%>
  <link rel="stylesheet" type="text/css" href="${baseurl}css/hems/hzxq.css?5555">
</head>

<body class="hzxq">
  <script type="text/javascript">
    var patientMsg, iframeHeight;
    var vstCad, emgDat;
    var xxFlag = '${xxFlag}';
    var emgSeq = '${emgSeq}';
    $(function () {
      setBodyHeight();
      addNewHTML();
      getPatientMsg();
    });

    function addNewHTML() {
      switch (xxFlag) {
        case '2':
          $('.mid-tab-btn').removeClass('active');
          $('#minTab').append('<li class="mid-tab-btn active" onclick="midTab(2)">病历记录单</li>');
          $('.tab-mid-pane').removeClass('active');
          $('#midTabContainer').append('<div class="tab-mid-pane active" id="bljld"></div>');
           $('#bljld').html(getIframe('${baseurl}bljld/qeurybljld_read.do?emgSeq=${emgSeq}'));
          break;
        default:
          break;
      }
    }

    function getPatientMsg() {
      publicFun.httpServer({url: '${baseurl}emg/queryhzxq_result.do'}, { 'emgSeq': emgSeq}, function (res) {
        res.falAssCod = res.fallAssCod;
        patientMsg = res;
        vstCad = res.vstCad;
        emgDat = res.emgDat;
        setValue(res);
        $('#jbxx').html(getIframe('${baseurl}hzszyyemg/basicInformation.do?emgSeq=${emgSeq}'));
        $('#lzqk').html(getIframe('${baseurl}hzszyyemg/timershaft.do?emgSeq=${emgSeq}'));
      })
    }
    var nullMsg = {
      cstNam: '姓名未知',
      cstSexCod: '性別未知',
      cstAge: '年龄未知',
      emgFkCod: '科室未知',
      cstDspCod: '首诊情况未知',
      //sqlDctNbr: '医生未知',
      // 绿色通道
      // 是否高危
      vstCad: '卡号未知',
      emgAreCod: '分区未知',
      cmpPsnCod: '',
      preDgnCod: '主诉症状未知',
      emgDat: '记录时间未知',
      tmpNbr: '',
      breNbr: '',
      hrtRte: '',
      sbpUpNbr: '',
      sbpDownNbr: '',
      oxyNbr: '',
    };

    function setValue(res) {
      var _codList = ['emgAreCod', 'cstDspCod', 'emgFkCod', 'vstCad', 'arvChlCod', 'cmpPsnCod', 'preDgnCod', 'emgDat'];
      _codList.map(function (ele) {
        if (res[ele]) {
          if (ele === 'emgDat') {
            $('#' + ele).text(publicFun.timeFormat(res[ele], 'yyyy/MM/dd hh:mm:ss'))
          } else {
            $('#' + ele).text(res[ele])
          }
        } else {
          $('#' + ele).text(nullMsg[ele])
        }
      })
      res.cstNam ? $('#cstNam').text(res.cstNam + ' /') : $('#cstNam').text(nullMsg.cstNam + ' /'); //姓名
      res.cstSexCod ? $('#cstSexCod').text(res.cstSexCod + ' /') : $('#cstSexCod').text(nullMsg.cstSexCod + ' /'); //姓名
      res.cstAge ? $('#cstAge').text(res.cstAge + res.cstAgeCod) : $('#cstAge').text(nullMsg.cstAge); //年齡
      res.grnChl == '1' ? $('#grnChl').show() : $('#grnChl').hide(); //绿色通道
      //预检分级
      let levelList = [{ cod: '0', name: 'one' }, { cod: '1', name: 'two' }, { cod: '2', name: 'three' }, { cod: '3', name: 'four' }, { cod: '4', name: 'four' }];
      levelList.map(function (ele) {
        if (res.emgDepCod == ele.cod) {
          $('#emgDepCod').addClass(ele.name);
        }
      })
      res.fallAssCod == '高危' ? $('#falAssCod').show() : $('#falAssCod').hide(); //是否高危
      res.swChl == '1' ? $('#swChl').show() : $('#swChl').hide(); //是否三无
      var _unitCodList = [{cod: 'tmpNbr', unit: '°C'}, { cod: 'breNbr', unit: '次/分' }, { cod: 'hrtRte', unit: '次/分' }, { cod: 'oxyNbr', unit: '%' }];
      _unitCodList.map(function (ele) {
        if (res[ele.cod]) {
          $('#' + ele.cod).text(res[ele.cod] + ele.unit);
        } else {
          $('#' + ele.cod).text(nullMsg[ele.cod])
        }
      })
      var sbpUpNbr = res.sbpUpNbr,
        sbpDownNbr = res.sbpDownNbr;
      // 血压
      if (res.sbpUpNbr || res.sbpDownNbr) {
        $('#sbpNbr').text((sbpUpNbr || '') + '/' + (sbpDownNbr || ''));
      } else {
        $('#sbpNbr').text('')
      }
    }

    function setBodyHeight() {
      var bodyHeight = parent.$('#tabs').height();
      // $('.container').height(bodyHeight - 144);
      iframeHeight = bodyHeight - 162;
      $('.mid-tab').height(bodyHeight - 184);
    }

    function midTab(eq) {
      $('.mid-tab-btn').removeClass('active').eq(eq).addClass('active');
      $('.tab-mid-pane').removeClass('active').eq(eq).addClass('active');
      if (eq == '2') {
        $('#bljld').html(getIframe('${baseurl}bljld/qeurybljld_read.do?emgSeq=${emgSeq}'));
      }
    }

    function getIframe (_src) {
      var content = '<iframe frameborder="0" width="100%" height="' + iframeHeight + '" marginheight="0" marginwidth="0" scrolling="auto" src="' + _src + '"></iframe>';
      return content;
    }
  </script>
  <div class="header">
    <div class="patient-basic-msg clr">
      <div class="patient-photo man floatLeft"></div>
      <div class="patient-basic-detail-msg floatLeft">
        <p>
          <i id="cstNam"></i>
          <i id="cstSexCod"></i>
          <i id="cstAge"></i>
        </p>
        <div class="clr">
          <i class="jzfq green" id="grnChl"></i>
          <i class="yjfj" id="emgDepCod"></i>
          <i class="ddpg dangerous" id="falAssCod"></i>
          <i class="sw" id="swChl"></i>
        </div>
      </div>
      <div class="parting-line floatLeft"></div>
    </div>
    <div class="patient-other-msg clr">
      <table>
        <tbody>
          <tr>
            <th>卡&emsp;&emsp;号：</th>
            <td colspan="3" id="vstCad"></td>
          </tr>
          <tr>
            <th>到院方式：</th>
            <td id="arvChlCod"></td>
            <th>陪送人员：</th>
            <td id="cmpPsnCod"></td>
          </tr>
          <tr>
            <th valign="top">首&emsp;&emsp;诊：</th>
            <td colspan="3">
              <i id="cstDspCod"></i> /
              <i id="emgFkCod"></i> /
              <i id="emgAreCod"></i>
            </td>
          </tr>
          <tr>
            <th valign="top">主诉症状：</th>
            <td colspan="3" id="preDgnCod">
            </td>
          </tr>
        </tbody>
      </table>
    </div>
    <div class="patient-important-msg clr">
      <table>
        <thead>
          <tr>
            <th width="35%">预检时间</th>
            <th>体温</th>
            <th>呼吸</th>
            <th>心率</th>
            <th>血压</th>
            <th>血氧</th>
          </tr>
        </thead>
        <tbody>
          <tr>
            <td id="emgDat"></td>
            <td id="tmpNbr"></td>
            <td id="breNbr"></td>
            <td id="hrtRte"></td>
            <td id="sbpNbr"></td>
            <td id="oxyNbr"></td>
          </tr>
        </tbody>
      </table>
    </div>
  </div>
  <div class="container">
    <div class="mid-tab-container">
      <ul class="mid-tab" id="minTab">
        <li class="mid-tab-btn " onclick="midTab(0)">基本信息</li>
        <li class="mid-tab-btn active" onclick="midTab(1)">留转情况</li>
      </ul>
    </div>
    <div class="mid-tab-pane-container" id="midTabContainer">
      <div class="tab-mid-pane" id="jbxx">
      </div>
      <div class="tab-mid-pane active" id="lzqk">
      </div>
      <div class="tab-mid-pane" id="bljld">
      </div>
    </div>
  </div>
</body>

</html>