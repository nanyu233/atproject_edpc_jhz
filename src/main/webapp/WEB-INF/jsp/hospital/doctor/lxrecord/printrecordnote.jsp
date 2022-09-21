<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/base/tag.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
</head>

<body>
  <div>
    <div class="print-body">
      <p class="title">${hospitalPlatformNameGap}</p>
      <p class="subTitle">留抢病历</p>
      <ul class="print-ul">
        <li class="bordered">
          <span class="basic-span">
            <label class="title-label">姓名：</label>
            <span>${hspemginfCustom.cstNam}</span>
          </span>
          <span class="basic-span">
            <label class="title-label">性别：</label>
            <span>${hspemginfCustom.cstSexCod}</span>
          </span>
          <span class="basic-span">
            <label class="title-label">年龄：</label>
            <span id="_age">${hspemginfCustom.cstAge}${hspemginfCustom.cstAgeCod}</span>
          </span>
          <span class="basic-span">
            <label class="title-label">科别：</label>
            <span id="_emgFkCod">${hspemginfCustom.emgFkCod}</span>
          </span>
          <span class="basic-span">
            <label class="title-label">病历号：</label>
            <span id="_mpi">${hspemginfCustom.mpi}</span>
          </span>
          <span class="basic-span">
            <label class="title-label">留观号：</label>
            <span id="_lgh">${hspemginfCustom.observationCode}</span>
          </span>
        </li>
        <li class="printHalfLi">
          <label class="lab-span">联系地址：</label>
          <span id="_cstAdr">${hspemginfCustom.cstAdr}</span>
        </li>
        <li class="printHalfLi">
          <label class="title-label">入观时间：</label>
          <span id="_lqblDat"></span>
        </li>
        <li class="printFullLi">
          <label class="lab-span">主诉：</label>
          <span id="_lqblDes"></span>
        </li>
        <li class="printFullLi">
          <label class="lab-span">现病史：</label>
          <pre id="_xbsDes">${hspemginfCustom.nowHis}</pre>
        </li>
        <li class="leftLi">
          <label class="labTitle">既往史</label>
        </li>
        <li class="printFullLi">
          <label>过敏史：</label>
          <span id="_gmsDes"></span>
        </li>
        <li class="printFullLi">
          <label>疾病史：</label>
          <span id="_medHis"></span>
        </li>
        <li class="printFullLi">
          <label>用药史：</label>
          <span id="_drugHis"></span>
        </li>
        <li class="printFullLi">
          <label>手术史：</label>
          <span id="_oprtHis"></span>
        </li>
        <li class="printFullLi">
          <label>外伤史：</label>
          <span id="_tramHis"></span>
        </li>
        <li class="printFullLi">
          <label>疫区、禽类、传染病接触史：</label>
          <span id="_crbHis"></span>
        </li>
        <li class="printFullLi">
          <label>婚育史：</label>
          <span id="_obstHis"></span>
        </li>
        <!-- <li class="printHalfLi">
            <label>末次月经：</label>
            <span id="_mcyjDat"></span>
        </li>
        <li class="printHalfLi">
            <label>妊娠状态：</label>
            <span id="_rsztCod"></span>
        </li> -->
        <li class="printFullLi" id="isSHowli" style="display:none;">
          <label>月经史：</label>
          <span id="_pmnsSitCod"></span>
        </li>
        <li class="printFullLi">
          <label>家族史：</label>
          <span id="_famlHis"></span>
        </li>
        <li class="leftLi">
          <label class="labTitle">体格检查</label>
        </li>
        <li class="printFullLi">
          <span class="SpanleftGap">
            <label>血压：</label>
            <span id="_tgjcXyFlg"></span>
            <span id="xyspan"><span id="_tgjcXyUp"></span>/<span id="_tgjcXyDown"></span>mmHg</span>
          </span>
          <span class="SpanleftGap">
            <label>体温：</label>
            <span id="_tgjcTwFlg"></span>
            <span id="twspan"><span id="_tgjcTw"></span>℃</span>
          </span>
          <span class="SpanleftGap">
            <label>心率：</label>
            <span id="_tgjcMb"></span>次/分
          </span>
          <span class="SpanleftGap">
            <label>脉搏：</label>
            <span id="_tgjcPulse"></span>次/分
          </span>
        </li>
        <li class="printFullLi">
          <span class="SpanleftGap">
            <label>呼吸：</label>
            <span id="_tgjcHxFlg"></span>
            <span id="_tgjcHx"></span>次/分
          </span>
          <span class="SpanleftGap">
            <label>血糖：</label>
            <span id="_xtVal"></span>
          </span>
          <span class="SpanleftGap">
            <label>床边指氧饱和度：</label>
            <span id="_tgjcCbzy"></span>%
          </span>
        </li>
        <li class="printFullLi">
          <label>查体内容：</label>
          <pre id="_ctnrDes"></pre>
        </li>
        <li class="printFullLi">
          <label>辅助检查：</label>
          <pre id="_fzjcDes"></pre>
        </li>
        <li class="printFullLi">
          <label>初步诊断：</label>
          <span>${hspemginfCustom.jbzdDes}</span>
        </li>
        <li class="printFullLi">
          <label>病人去向：</label>
          <span id="_lqblBrqx"></span>
        </li>
        <li class="floatRightLi">
          <label>医师签名：</label>
          <span>{{recordMsg.cratNam}}</span>
        </li>
        <li class="floatRightLi">
          <label>日期：</label>
          <span>{{recordMsg.oprtDat}}</span>
        </li>
      </ul>
    </div>
  </div>
  <script type="text/javascript" charset="utf-8">
    function setValue(res) {
      var isnoValList = ['gmsDes', 'medHis', 'drugHis', 'oprtHis', 'tramHis', 'crbHis'];
      for (var key in res) {
        var _value = res[key];
        if (_value != '' && _value != null) {
          if (key === 'lqblDat' || key === 'oprtDat') {
            _value = publicFun.timeFormat(new Date(_value), 'yyyy/MM/dd hh:mm:ss')
          }
          if (key === 'mcyjDat') {
            _value = publicFun.timeFormat(new Date(_value), 'yyyy/MM/dd')
          }
          if (key === 'rsztCod') {
            if (_value == '0') {
              _value = '否'
            } if (_value == '1') {
              _value = '是'
            }
          }
          if (key === 'tgjcXyFlg') {
            if (_value == '1') {
              _value = ''
            } if (_value == '2') {
              _value = '测不出'
            }
          }
          if (key === 'tgjcTwFlg') {
            if (_value == '1') {
              _value = '耳温'
            } if (_value == '2') {
              _value = '不升'
            }
          }
          if (key === 'tgjcHxFlg') {
            if (_value == '1') {
              _value = '无辅助'
            } else if (_value == '2') {
              _value = '辅助呼吸'
            } else if (_value == '3') {
              _value = '手控通气'
            } else if (_value === '4') {
              _value = '机械通气'
            }
          }
          if (key === 'lqblBrqx') {
            var _zgNurseVal = '${hspsqlinfCustom.sqlStaCod}';
            if (_zgNurseVal !== '') {
              _value = _zgNurseVal
            }
            var _codList = [{ cod: '1', val: '出院' }, { cod: '2', val: '住院' }, { cod: '0', val: '出观' }, { cod: '4', val: '自动离院' }, { cod: '8', val: '回家' }, { cod: '9', val: '转门诊' }, { cod: '11', val: '转留观室' }, { cod: '12', val: '非医嘱离院' }, { cod: '3', val: '死亡' }, { cod: '14', val: '来院已死亡' }, { cod: '13', val: '转院' }];
            $.each(_codList, function (idx, value) {
              if (_value == value['cod']) {
                _value = value['val']
              }
            })
          }
          $('#_' + key).html(_value);
        } else {
          if ($.inArray(key, isnoValList) > -1) {
            $('#_' + key).html('否');
          } else if (key === 'tgjcXyFlg' || key === 'tgjcTwFlg' || key === 'tgjcHxFlg') {
            $('#_' + key).html("");
          } else {
            $('#_' + key).html("");
          }
        }
        if (key === 'mnsSitCod') {
          if (_sexVal == '女' && _value != '' && _value != null) {
            $('.print-ul #isSHowli').css("display", "inline-block");
          }
          if (_value != '' && _value != null) {
            $.each(_periodList, function (idx, val) {
              if (val['infocode'] == _value) {
                if (_value == '1' && res["caseHis"] != '' && res["caseHis"] != null) {
                  $('#_pmnsSitCod').html(val['info'] + '，第' + res["caseHis"] + '周');
                } else {
                  $('#_pmnsSitCod').html(val['info']);
                }
              }
            })
          } else {
            $('#_pmnsSitCod').html("");
          }
        }
        if (key == 'tgjcXtFlg') {
          if (_value == '2') {
            $('#_xtVal').html('LO');
          } else if (_value == '3') {
            $('#_xtVal').html('HI');
          } else if (_value == '1') {
            if (res["tgjcXt"] != '' && res["tgjcXt"] != null) {
              $('#_xtVal').html(res["tgjcXt"] + 'mmol/L');
            } else {
              $('#_xtVal').html("mmol/L");
            }
          } else {
            $('#_xtVal').html("mmol/L");
          }
        }
      }

      if ($('#_age').html() == '岁') {
        $('#_age').html("");
      }
      var _fieldList = ['_emgFkCod', '_mpi', '_lgh', '_cstAdr', '_ryzdzy', '_xbsDes'];
      $.each(_fieldList, function (index, value) {
        if ($('#' + value).html() == '') {
          $('#' + value).html("")
        }
      })
      /* if(_sqlStaCod=='住院'){
           $('#_patks').css('display','inline-block')
       }else{
           $('#_patks').css('display','none')
       }

       if(_sqlStaCod=='转院'){
           $('#_patzy').css('display','inline-block')
       }else{
           $('#_patzy').css('display','none')
       } */

      if ($('#_tgjcXyFlg').html() == '测不出') {
        $('#xyspan').css('display', 'none')
      } else {
        $('#xyspan').css('display', 'inline-block')
      }

      if ($('#_tgjcTwFlg').html() == '不升') {
        $('#twspan').css('display', 'none')
      } else {
        $('#twspan').css('display', 'inline-block')
      }
    }
  </script>
</body>

</html>