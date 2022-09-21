<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/base/tag.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
  <meta http-equiv="cache-control" content="no-cache">
  <title>入院护理评估单</title>
  <%@ include file="/WEB-INF/jsp/base/common_css.jsp"%>
  <link rel="stylesheet" type="text/css" href="${baseurl}css/hzszyyhems/printShow/docPrint.css?55">
  <%@ include file="/WEB-INF/jsp/base/common_js.jsp"%>
  <script type="text/javascript">
    var _baseUrl;
    _baseUrl = "${baseurl}";
    var _emgSeq = '${emgSeq}';
    var _cstNam = '${cstNam}';
    var _ownPageWay = 'noSave';
  </script>
</head>

<body class="diseaseHtml">
  <div class="print-body">
    <p class="title">${hospitalPlatformNameGap}</p>
    <p class="subTitle">入院护理评估单</p>
    <ul class="print-ul">
      <li class="printFullLi">
        <span class="basic-span">
          <label class="title-label">姓名：</label>
          <span id="hspcstNam"></span>
        </span>
        <span class="basic-span">
          <label class="title-label">性别：</label>
          <span id="hspcstSexCod"></span>
        </span>
        <span class="basic-span">
          <label class="title-label">年龄：</label>
          <span id="hspcstAge"></span>
          <span id="hspcstAgeCod"></span>
        </span>
      </li>
      <li class="printFullLi">
        <span class="basic-span">
          <label class="title-label">日期：</label>
          <span id="hspoprDat"></span>
        </span>
        <span class="basic-span">
          <label class="title-label">就诊时间：</label>
          <span id="hspemgDat"></span>
        </span>
        <span class="basic-span">
          <label class="title-label">首诊科室：</label>
          <span id="hspemgFkCod"></span>
        </span>
      </li>
      <li class="printFullLi">
        <span class="extraSpan">
          <label class="title-label">单位/地址：</label>
          <span id="hspcstAdr"></span>
        </span>
        <span class="extraSpan">
          <label class="title-label twolab">主诉症状：</label>
          <span id="hsppreDgnCod"></span>
        </span>
      </li>
      <li class="printFullLi">
        <label class="title-label twolab">生命特征：</label>
        <span class="fullspan2 fullspan">
          <span>
            <label>T：</label>
            <span id="hsptmpNbr"></span><span id="hsptmpNbrs">℃</span>
          </span>
          <span class="qxspan">
            <label>P：</label>
            <span id="hsphrtRte"></span><span id="hsphrtRtes">次/分</span>
          </span>
          <span class="qxspan">
            <label>R：</label>
            <span id="hspbreNbr"></span><span id="hspbreNbrs">次/分</span>
          </span>
          <span class="qxspan">
            <label>BP：</label>
            <span id="hspsbpUpNbr"></span><span id="hspsbpUpNbrs">/<span id="hspsbpDownNbr"></span>mmHg</span>
          </span>
          <span class="qxspan">
            <label>SpO2：</label>
            <span id="hspoxyNbr"></span><span id="hspoxyNbrs">%</span>
          </span><br />
          <span>
            <label>神志：</label>
            <span id="hspsenStuCod"></span>
          </span>
          <span class="qxspan">
            <label>末梢血糖：</label>
            <span id="hsppbgNbrFlg"></span>
            <span class="msxtSpan"><span id="hsppbgNbr"></span>mmol/L</span>
          </span>
        </span>
      </li>
      <li class="printFullLi Boldli">
        <span class="subtle">初步评估</span>
        <span class="signSpn">评估者签名：<span id="hsppreAssNam"></span></span>
      </li>
      <li class="printHalfLi" style="margin-top:4mm" id="qdCodliStr">
        <label class="title-label">气道：</label>
        <span id="hspqdCod"></span>
      </li>
      <li class="printHalfLi" style="margin-top:4mm" id="qdOtherliStr">
        <label class="title-label">气道其它：</label>
        <span id="hspqdOther"></span>
      </li>
      <li class="printHalfLi" id="hxCodliStr">
        <label class="title-label">呼吸：</label>
        <span id="hsphxCod"></span>
      </li>
      <li class="printHalfLi" id="hxOtherliStr">
        <label class="title-label">呼吸其它：</label>
        <span id="hsphxOther"></span>
      </li>
      <li class="printFullLi">
        <label class="title-label">循环：</label>
        <span id="hspxhCod"></span>
      </li>
      <li class="printHalfLi" id="cxCodliStr">
        <label class="title-label">出血：</label>
        <span id="hspcxCod"></span>
      </li>
      <li class="printHalfLi" id="cxQtbwliStr">
        <label class="title-label">出血其它：</label>
        <span id="hspcxQtbw"></span>
      </li>
      <li class="printHalfLi">
        <label class="title-label">瞳孔：</label>
        <span>左<span id="hsptkLeft"></span>mm&nbsp;&nbsp;</span>
        <span>光反应<span id="hsptkLeftCod"></span></span>&nbsp;&nbsp;
        <span id="tkLeftUnit">其他：<span id="hsptkLeftOther"></span></span>
        <span>&nbsp;&nbsp;右<span id="hsptkRight"></span>mm&nbsp;&nbsp;</span>
        <span>光反应<span id="hsptkRightCod"></span></span>&nbsp;&nbsp;
        <span id="tkRightUnit">其他：<span id="hsptkRightOther"></span></span>
      </li>
      <li class="printFullLi">
        <label class="title-label">NS：</label>
        <span id="hspnsCod" class="spanhidden"></span>
        <span id="hspnsDaqt" class="spanhidden"></span>
        <span id="hspnsTtcj" class="spanhidden"></span>
        <span id="hspnsThzt" class="spanhidden"></span>
        <span id="hspnsThztDes" class="spanhidden"></span>
        <span id="hspns"></span>
      </li>
      <li class="printFullLi">
        <label class="title-label twolab">腹部：</label>
        <span id="hspfbCod" class="fullspan"></span>
      </li>
      <li class="printFullLi">
        <label class="title-label twolab">皮肤：</label>
        <span id="hsppfCod" class="spanhidden"></span>
        <span id="hsppfFw" class="spanhidden"></span>
        <span id="hsppfFwDes" class="spanhidden"></span>
        <span id="hsppfspan" class="fullspan"></span>
      </li>
      <li>
        <span class="scoGap">
          <label class="labTitle twolab">Braden评分：</label>
          <span id="hspbradenSco"></span>
        </span>
        <span class="scoGap">
          <label class="labTitle twolab">坠床跌倒评分：</label>
          <span id="hspfallAllSco"></span>
        </span>
        <span class="scoGap">
          <label class="labTitle twolab">ADL评分：</label>
          <span id="hspadlSco"></span>
        </span>
        <span class="scoGap">
          <label class="labTitle twolab">NRS评分：</label>
          <span id="hspnrsSco"></span>
        </span>
      </li>
      <li class="printFullLi">
        <label class="title-label twolab">处理步骤：</label>
        <span id="hspclbzCod" class="fullspan"></span>
      </li>
      <li id="memeUnit" class="printFullLi">
        <label class="title-label twolab">备注：</label>
        <span id="hspmemo" class="fullspan"></span>
      </li>
      <li class="printFullLi Boldli">
        <span class="subtle">其它</span>
        <!-- <span class="signSpn">签名：<span id="hspqtNam"></span></span> -->
      </li>
      <li style="margin-top:4mm" class="printFullLi">
        <label class="title-label twolab">过敏史：</label>
        <span id="hspcaseHisNew" class="fullspan"></span>
      </li>
      <li class="printHalfLi is_showli" id="qtQmsLi">
        <label class="title-label">青霉素：</label>
        <span>结果<span id="hspqtQmsRs" class="qxspan"></span></span>
        <span>，</span>
        <span>时间<span id="hspqtQmsDat" class="qxspan"></span></span>
      </li>
      <li class="printHalfLi is_showli" id="qtTatLi">
        <label class="title-label">TAT：</label>
        <span>结果<span id="hspqtTatRs" class="qxspan"></span></span>
        <span>，</span>
        <span>时间<span id="hspqtTatDat" class="qxspan"></span></span>
      </li>
      <li class="printHalfLi" id="qtObjLi">
        <label class="title-label" id="hspqtObj1Nam"></label>
        <span>结果<span id="hspqtObj1Rs" class="qxspan"></span></span>
        <span>，</span>
        <span>时间<span id="hspqtObj1Dat" class="qxspan"></span></span>
      </li>
      <li class="printHalfLi" id="qtObj2Li">
        <label class="title-label" id="hspqtObj2Nam"></label>
        <span>结果<span id="hspqtObj2Rs" class="qxspan"></span></span>
        <span>，</span>
        <span>时间<span id="hspqtObj2Dat" class="qxspan"></span></span>
      </li>
      <li class="printHalfLi">
        <label class="title-label">发病地点：</label>
        <span id="hsphlAddr"></span>
      </li>
      <li class="printHalfLi">
        <label class="title-label">护送情况：</label>
        <span>护送方式<span id="hsparvChlCod" class="qxspan"></span></span>
        <span>，</span>
        <span>护送人<span id="hspcmpPsnCod" class="qxspan"></span></span>
      </li>
      <li>
        <label class="title-label">紧急联系：</label>
        <span>联系人1<span id="hspjjlxNam" class="qxspan"></span></span>
        <span>，</span>
        <span>电话<span id="hspjjlxTel" class="qxspan"></span></span>
        <span>，</span>
        <span>联系人2<span id="hspjjlxNam2" class="qxspan"></span></span>
        <span>，</span>
        <span>电话<span id="hspjjlxTel2" class="qxspan"></span></span>
        <span>，</span>
        <span>欠款<span id="hspqkCod" class="qxspan"></span></span>
      </li>
      <li class="printFullLi">
        <span class="title-label">去向：</span>
        <span id="hspsqlStaCod"></span>
        <span id="hspsqlDat" class="qxspan"></span>
        <span id="hspsqlDepName" class="qxspan"></span>
        <span id="hspsqlDes" class="qxspan"></span>
      </li>
    </ul>
  </div>
  <script type="text/javascript">
    $(function () {
      print();
    })
    function print() {
      $('.printDiv').addClass('.printDiv');
      var getMsgUrl = '${baseurl}hlpgb/queryhlpgb_result.do';
      publicFun.httpServer({ url: getMsgUrl }, { emgSeq: _emgSeq, date: new Date().toTimeString() }, function (res) {
        setValue(res)
      })
    }
    function setValue(res) {
      var hlpgbList = {
        senStuCodList: ['清醒状态', '嗜睡状态', '意识模糊', '昏睡状态', '昏迷', '醉酒', '痴呆', '镇静状态', '谵妄'],
        qdCodList: ['通畅', '阻塞', '部分阻塞'],
        hxCodList: ['正常', '费力', '困难', '气促', '表浅', '无呼吸'],
        xhCodList: ['正常', '弱', '有脉搏', '桡A搏动', '颈A搏动', '无心博'],
        cxCodList: [{ infocode: '1', info: '无' }, { infocode: '0', info: '有' }, { infocode: '2', info: '呕血' }, { infocode: '3', info: '咯血' }, { infocode: '4', info: '便血' }],
        nsCodList: ['有反应', '无反应'],
        nsDaqtList: ['对答切题', '对答不切题'],
        nsTtcjList: ['对疼痛刺激有反应', '对疼痛刺激无反应'],
        nsThztList: ['截瘫', '偏瘫'],
        tkLeftCodList: ['灵敏', '迟钝', '消失', '白内障', '眼球缺失'],
        tkRightCodList: ['灵敏', '迟钝', '消失', '白内障', '眼球缺失'],
        fbCodList: [{ infocode: '1', info: '无明显异常' }, { infocode: '2', info: '腹痛' }, { infocode: '3', info: '腹胀' }, { infocode: '4', info: '肌紧张' },
        { infocode: '5', info: '压痛' }, { infocode: '6', info: '反跳痛' }, { infocode: '7', info: '有肠鸣音' }, { infocode: '8', info: '肠鸣音消失' }],
        pfCodList: [{ infocode: '0', info: '正常' }, { infocode: '1', info: '湿冷' }, { infocode: '2', info: '苍白' }, { infocode: '3', info: '潮红' }, { infocode: '4', info: '出汗' }, { infocode: '5', info: '紫绀' }, { infocode: '6', info: '黄染' }, { infocode: '7', info: '皮疹' }, { infocode: '8', info: '瘀斑' }, { infocode: '9', info: '褥疮' }],
        clbzCodList: res.clbzCodList,
        hlAddrList: ['居住地', '单位', '途中', '其他'],
        qkCodList: ['无', '有'],
        nsThztDesList: ['左', '右'],
        sqlStaCodList: [{ info: '诊间就诊', cod: '5' }, { info: '住院', cod: '2' }, { info: '留抢', cod: '6' }, { info: '死亡', cod: '3' },
        { info: '自动离院', cod: '4' }, { info: '出观', cod: '0' }, { info: '转门诊', cod: '9' }, { info: '回家', cod: '8' },
        { info: '院前直入', cod: '10' }, { info: '转留观室', cod: '11' }, { info: '非医嘱离院', cod: '12' }, { info: '转院', cod: '13' }, { info: '来院已死亡', cod: '14' }]
        // refusedSurveyList: [{ infocode: '72', info: '体温不升' }, { infocode: '1', info: '体温拒测' }, { infocode: '73', info: '体温测不出' }, { infocode: '2', info: '心率测不出' },
        // { infocode: '3', info: '呼吸测不出' }, { infocode: '4', info: '血压拒测' }, { infocode: '6', info: '血压测不出' }, , { infocode: '5', info: '血氧拒测' },
        // { infocode: '7', info: '血氧测不出' }]
      }
      var checkboxList = ['senStuCod', 'qdCod', 'hxCod', 'xhCod', 'nsCod', 'nsDaqt', 'nsTtcj', 'nsThzt', 'tkLeftCod', 'tkRightCod', 'hlAddr', 'qkCod'];
      var nsspan = ['hspnsCod', 'hspnsDaqt', 'hspnsTtcj', 'hspnsThzt', 'hspnsThztDes'],
        pfspan = ['hsppfCod', 'hsppfFw', 'hsppfFwDes'];
      var _fbContent = '';
      var twText = '', xlText = '', hxText = '', xyText = '', xxText = '';
      $.each(res['hspHlpgbCustom'], function (key, val) {
        if (val !== "" && val != null) {
          $('#hsp' + key).css("text-decoration", "none");
          $('#hsp' + key).html(val);
          if (key === 'bradenSco' || key === 'adlSco' || key === 'nrsSco') {
            $('#hsp' + key).html(val + '分');
          }
          if (key === 'zcddexpfSco' || key === 'fallriskSco') {
            $('#hspfallAllSco').html(val + '分');
          }
          if (key === 'qtQmsDat' || key === 'qtTatDat' || key === 'qtObj1Dat' || key === 'qtObj2Dat') {
            $('#hsp' + key).html(publicFun.timeFormat(new Date(val), 'yyyy/MM/dd hh:mm:ss'));
          }
          if ($.inArray(key, checkboxList) > -1) {
            $('#hsp' + key).html(hlpgbList[key + 'List'][val]);
          }
          if (key === 'qtObj1Nam' || key === 'qtObj2Nam') {
            $('#hsp' + key).html(val + '：');
          }
          if (key === 'clbzCod' || key === 'fbCod' || key === 'cxCod' || key == 'pfCod') {
            var _valList = String(val).split(",");
            var _list = hlpgbList[key + 'List'], _contentStr = '';
            for (var i = 0; i < _list.length; i++) {
              if ($.inArray(_list[i].infocode, _valList) > -1) {
                _contentStr += _list[i].info + '，'
              }
            }
            if (key === 'fbCod') {
              _fbContent = _contentStr;
            }
            if (key !== 'pfCod') {
              if (_contentStr) {
                _contentStr = _contentStr.substr(0, _contentStr.length - 1)
              }
            }
            $('#hsp' + key).html(_contentStr);
          }
          if (key === 'pfFw') {
            if (val === "1" || val === 1) {
              $('#hsp' + key).html('范围&ensp;&ensp;');
            }
            else {
              $('#hsp' + key).html('');
            }
          }
          if (key === 'pbgNbrFlg') {
            if (val == 1) {
              $("#hsppbgNbrFlg").html("");
            } else if (val == 2) {
              $("#hsppbgNbrFlg").html("LO");
            } else if (val == 3) {
              $("#hsppbgNbrFlg").html("HI");
            }
          }

        } else {//key === 'qtNam' ||
          if ( key === 'preAssNam') {
            $('#hsp' + key).css({ "text-decoration": "none", "width": "15mm", "display": "inline-block" });
            $('#hsp' + key).html("   ");
          } else {
            $('#hsp' + key).css("text-decoration", "none");
            $('#hsp' + key).html("");
          }
        }
      });

      if (res.hspHlpgbCustom.fbFc == '1') {
        if (res.hspHlpgbCustom.fbFcDes !== '' && res.hspHlpgbCustom.fbFcDes != null) {
          _fbContent += '腹穿' + res.hspHlpgbCustom.fbFcDes + '，';
        } else {
          _fbContent += '腹穿，';
        }
      }
      if (res.hspHlpgbCustom.fbOther !== '' && res.hspHlpgbCustom.fbOther != null) {
        if (_fbContent) {
          _fbContent += res.hspHlpgbCustom.fbOther + '，';
        } else {
          _fbContent += '腹部' + res.hspHlpgbCustom.fbOther + '，';
        }
      }
      if (_fbContent) {
        _fbContent = _fbContent.substr(0, _fbContent.length - 1)
      }
      $('#hspfbCod').html(_fbContent);
      if (res['hspHlpgbCustom']['zcddexpfSco'] == null && res['hspHlpgbCustom']['fallriskSco'] == null) {
        $('#hspfallAllSco').css("text-decoration", "none");
        $('#hspfallAllSco').html("");
      }

      if (res['hspHlpgbCustom']['nsThzt'] === 1 || res['hspHlpgbCustom']['nsThzt'] === '1') {
        if (res['hspHlpgbCustom']['nsThztDes'] != null && res['hspHlpgbCustom']['nsThztDes'] != '') {
          $('#hspnsThztDes').html('&ensp;&ensp;' + hlpgbList.nsThztDesList[res['hspHlpgbCustom']['nsThztDes']]);
        }
      } else if (res['hspHlpgbCustom']['nsThzt'] === 0 || res['hspHlpgbCustom']['nsThzt'] === '0') {
        if (res['hspHlpgbCustom']['nsThztDes'] != null && res['hspHlpgbCustom']['nsThztDes'] != '') {
          $('#hspnsThztDes').html('&ensp;&ensp;部位平面&ensp;&ensp;' + res['hspHlpgbCustom']['nsThztDes']);
        }
      }

      $.each(res['hspemginfCustom'], function (key, val) {
        if (key == 'qxZyh') {
          return;
        }
        if (val !== "" && val != null) {
          $('#hsp' + key).css("text-decoration", "none");
          $('#hsp' + key).html(val);
          if (key === 'emgDat') {
            $('#hsp' + key).html(publicFun.timeFormat(new Date(val), 'yyyy/MM/dd hh:mm:ss'));
            $('#hspoprDat').html(publicFun.timeFormat(new Date(val), 'yyyy/MM/dd'));
          }
          if (key === 'sqlStaCod') {
            var _sqlStaCodList = hlpgbList.sqlStaCodList;
            var _goAway = '';
            for (var i = 0; i < _sqlStaCodList.length; i++) {
              if (_sqlStaCodList[i]['cod'] == val) {
                _goAway = _sqlStaCodList[i]['info']
              }
            }
            $("#hspsqlStaCod").html(_goAway);
          }
          if (key == 'refusedSurvey') {
            if (val != '') {
              val = val.split(',');
            }
            for (var i = 0; i < val.length; i++) {
              if (val[i] == '72') {
                twText += '体温不升；';
              }
              if (val[i] == '1') {
                twText += '体温拒测；';
              }
              if (val[i] == '73') {
                twText += '体温测不出；';
              }
              if (val[i] == '2') {
                xlText += '心率测不出；';
              }
              if (val[i] == '3') {
                hxText += '呼吸测不出；';
              }
              if (val[i] == '4') {
                xyText += '血压拒测；';
              }
              if (val[i] == '6') {
                xyText += '血压测不出；';
              }
              if (val[i] == '5') {
                xxText += '血氧拒测；';
              }
              if (val[i] == '7') {
                xxText += '血氧测不出；';
              }
            }
          }
          if (key === 'cmpPsnCod') {
            newval = val.replace(/,/g, '&ensp;&ensp;');
            $('#hsp' + key).html(newval);
          }
        } else {
          if (key !== 'nrsSco') {
            $('#hsp' + key).css("text-decoration", "none");
            $('#hsp' + key).html("");
          }
        }
      });

      if ($('#hsptmpNbr').html() == '') {
        if (twText != '') {
          $('#hsptmpNbr').html(twText);
          $('#hsptmpNbrs').css('display', 'none');
        } else {
          $('#hsptmpNbrs').css('display', 'inline-block');
        }
      }
      if ($('#hsphrtRte').html() == '') {
        if (xlText != '') {
          $('#hsphrtRte').html(xlText)
          $('#hsphrtRtes').css('display', 'none');
        } else {
          $('#hsphrtRtes').css('display', 'inline-block');
        }
      }
      if ($('#hspbreNbr').html() == '') {
        if (hxText != '') {
          $('#hspbreNbr').html(hxText)
          $('#hspbreNbrs').css('display', 'none');
        } else {
          $('#hspbreNbrs').css('display', 'inline-block');
        }
      }
      if ($('#hspsbpUpNbr').html() == '') {
        if (xyText != '') {
          $('#hspsbpUpNbr').html(xyText)
          $('#hspsbpUpNbrs').css('display', 'none');
        } else {
          $('#hspsbpUpNbrs').css('display', 'inline-block');
        }
      }

      if ($('#hspoxyNbr').html() == '') {
        if (xxText != '') {
          $('#hspoxyNbr').html(xxText)
          $('#hspoxyNbrs').css('display', 'none');
        } else {
          $('#hspoxyNbrs').css('display', 'inline-block');
        }
      }
      $('.print-ul').css({ "float": "left", "width": "96%", "font-size": "0.38cm", "margin": "2mm 2% 0 2%", "padding": "0" });
      $('.print-ul li .title-label').css({ "display": "inline-block", "width": "5.5em", "float": "left", "text-align": "right" });
      $('.print-ul li.labTitle').css({ "display": "inline-block", "width": "7em", "float": "left", "text-align": "right" });
      $('.spc-span').css("margin-left", "5.5em");
      $('.fullspan').css({ "display": "inline-block", "width": "80%", "float": "left", "verticalAlign": "top" });
      $('.fullspan2').css({ "display": "inline-block", "width": "85%", "float": "left", "verticalAlign": "top", "line-height": "6mm" });
      $('.print-ul span.basic-span').css({ "display": "inline-block", "width": "32%" });
      $('.print-ul span.extraSpan').css({ "display": "inline-block", "width": "49%" });
      $('.print-ul span.basic-span span').css("float", "left");
      $('.print-ul span.qxspan').css("margin-left", "3mm");
      $('.print-ul .Boldli').css({ "font-weight": "bold", "border-bottom": "1px solid #000" });
      $('.spanhidden').css("display", "none");
      $('.print-ul  .Boldli .subtle').css({ "float": "left", "width": "49%", "display": "inline-block" });
      $('.print-ul .Boldli .signSpn').css({ "text-align": "right", "margin-right": "6%", "display": "inline-block", "width": "43%", "float": "left" });
      $('.print-ul .scoGap').css({ "margin-right": "8mm" });
      var nsspantext = '', fbspantext = '', pfspantext = '', nsspantextNew = '', fbspantextNew = '', pfspantextNew = '';
      function dealComma(str, strLast) {
        var lth = str.length;
        strLast = str.substring(lth - 1, lth);
        if (strLast == '，') {
          str = str.substring(0, lth - 1);
        }
        return str;
      }
      $.each(nsspan, function (idx, value) {
        if (($('#' + value).html() != "") && ($('#' + value).html() != "")) {
          nsspantext += $('#' + value).html();
          if (idx != 3 && idx != 4) {
            nsspantext += ' ，';
          }
        }
      })
      if (nsspantext != '') {
        nsspantext = dealComma(nsspantext, nsspantextNew);
        $('#hspns').html(nsspantext);
      } else {
        $('#hspns').html("");
      }

      $.each(pfspan, function (idx, value) {
        if (($('#' + value).html() != "") && ($('#' + value).html() != "")) {
          pfspantext += $('#' + value).html();
        }
      })
      if (pfspantext != '') {
        pfspantext = dealComma(pfspantext, pfspantextNew);
        $('#hsppfspan').html(pfspantext);
      } else {
        $('#hsppfspan').html("");
      }

      if (($('#hspsqlDepName').html() === "" && $('#hspsqlDes').html() === "") || ($('#hspsqlDepName').html() !== "" && $('#hspsqlDes').html() === "")) {
        $('#hspsqlDes').css("display", "none");
      } else {
        $('#hspsqlDes').css("display", "inline-block");
      }
      if ($('#hspsqlDepName').html() === "" && $('#hspsqlDes').html() !== "") {
        $('#hspsqlDepName').css("display", "none");
      } else {
        $('#hspsqlDepName').css("display", "inline-block");
      }

      if ($('#hspsqlStaCod').html() != "住院" && $('#hspsqlStaCod').html() != "转院") {
        $('#hspsqlDepName').css("display", "none")
      } else {
        $('#hspsqlDepName').css("display", "inline-block");
      }

      if ($('#hspqdOther').html() == "") {
        $('#qdCodliStr').css("width", "98%");
        $('#qdOtherliStr').css("display", "none");
      } else {
        $('#qdCodliStr').css("width", "49%");
        $('#qdOtherliStr').css("display", "inline-block");
      }
      if ($('#hsphxOther').html() == "") {
        $('#hxCodliStr').css("width", "98%");
        $('#hxOtherliStr').css("display", "none");
      } else {
        $('#hxCodliStr').css("width", "49%");
        $('#hxOtherliStr').css("display", "inline-block");
      }
      if ($('#hspcxQtbw').html() == "") {
        $('#cxCodliStr').css("width", "98%");
        $('#cxQtbwliStr').css("display", "none");
      } else {
        $('#cxCodliStr').css("width", "49%");
        $('#cxQtbwliStr').css("display", "inline-block");
      }

      var allergicStr = "";
      if (res['hspemginfCustom']['algHon'] === 0 || res['hspemginfCustom']['algHon'] === '0') {
        allergicStr = "无";
        $(".is_showli").hide();
      }
      if (res['hspemginfCustom']['algHon'] == 1) {
        allergicStr = "不详";
        $(".is_showli").hide();
      }
      if (res['hspemginfCustom']['algHon'] == 2) {
        $(".is_showli").show();
        allergicStr = res['hspemginfCustom']['info'];
        if (allergicStr == "") {
          allergicStr = "有";
        }
      }
      if (allergicStr != "") {
        $("#hspcaseHisNew").html(allergicStr);
      }

      if ($('#hsptkLeftOther').html() == "") {
        $('#tkLeftUnit').css("display", "none");
      } else {
        $('#tkLeftUnit').css("display", "inline-block");
      }

      if ($('#hsptkRightOther').html() == "") {
        $('#tkRightUnit').css("display", "none");
      } else {
        $('#tkRightUnit').css("display", "inline-block");
      }

      if ($('#hspmemo').html() == "") {
        $('#memeUnit').css("display", "none");
      } else {
        $('#memeUnit').css("display", "inline-block");
      }

      if ($('#hspqtQmsRs').html() == "" && $('#hspqtQmsDat').html() == "") {
        $('#qtQmsLi').css("display", "none");
      } else {
        $('#qtQmsLi').css("display", "inline-block");
      }

      if ($('#hspqtTatRs').html() == "" && $('#hspqtTatDat').html() == "") {
        $('#qtTatLi').css("display", "none");
      } else {
        $('#qtTatLi').css("display", "inline-block");
      }


      if ($('#hspqtObj1Nam').html() == "" && $('#hspqtObj1Rs').html() == "" && $('#hspqtObj1Dat').html() == "") {
        $('#qtObjLi').css("display", "none");
      } else {
        $('#qtObjLi').css("display", "inline-block");
      }

      if ($('#hspqtObj2Nam').html() == "" && $('#hspqtObj2Rs').html() == "" && $('#hspqtObj2Dat').html() == "") {
        $('#qtObj2Li').css("display", "none");
      } else {
        $('#qtObj2Li').css("display", "inline-block");
      }

      if ($('#hsppbgNbrFlg').html() == "" && $('#hsppbgNbr').html() != "") {
        $('#hsppbgNbrFlg').css("display", "none");
        $('.msxtSpan').css("display", "inline-block");
      } else {
        $('#hsppbgNbrFlg').css("display", "inline-block");
        $('.msxtSpan').css("display", "none");
      }
    }
  </script>
</body>

</html>