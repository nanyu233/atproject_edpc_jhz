<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/base/tag.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
  <title>修改页面-打印护理评估表</title>
</head>

<body>
  <div style="display:none">
    <div id="printDoc1" class="print-body" style="display:block;float:left;width:210mm;font-family:'微软雅黑';">
      <jsp:include page="/WEB-INF/jsp/hzszyyhospital/printBasicInfo/printBasicInfo.jsp"></jsp:include>
      <ul class="print-ul">
        <li class="printfullli">
          <label class="title-labelA">姓名：</label>
          <span>{{basicInfo.cstNam}}</span>
          <label class="title-labelC">性别：</label>
          <span>{{basicInfo.cstSexCod}}</span>
          <label class="title-labelC">年龄：</label>
          <span>{{basicInfo.cstAgeAll}}</span>
          <label class="title-labelC">床号：</label>
          <span id="bedNum"></span>
          <label class="title-labelA">单位/地址：</label>
          <span>{{hlpgbpatientMsg.workAddress}}</span>
        </li>
        <li class="printfullli">
          <label class="title-labelA">电话：</label>
          <span>{{basicInfo.pheNbr}}</span>
          <label class="title-labelA">病历号：</label>
          <span>{{basicInfo.mpi}}</span>
          <label class="title-labelA">就诊日期：</label>
          <span>{{hlpgbpatientMsg.seeDocDat}}</span>
          <label class="title-labelA">欠款：</label>
          <label ms-repeat="hlpgbmsgList.qkCodList" class="checklabel">
            <input type="checkbox" ms-class="qkCod_p{{el.infocode}}" class="qkCod_p"> {{el.info}}
          </label>
        </li>
        <li class="printfullli">
          <label>通知医生时间：</label>
          <span class="print-span">{{hlpgbpatientMsg.informDocDat}}</span>
          <label class="title-labelA">到诊时间：</label>
          <span class="print-span">{{hlpgbpatientMsg.docDat}}</span>
          <label class="title-labelA">首诊科室：</label>
          <span class="print-span">{{basicInfo.emgFkCod}}</span>
          <label class="title-labelA">首诊医生：</label>
          <span class="print-span">{{hlpgbpatientMsg.sqlDctNbr}}</span>
        </li>
        <li class="printfullli">
          <label class="title-label ">发病地点：</label>
          <label ms-repeat="hlpgbmsgList.hlAddrList" class="checklabel">
            <input type="checkbox" ms-class="hlAddr_p{{el.infocode}}" class="hlAddr_p"> {{el.info}}
          </label>
          <span class="print-span" >{{hlpgbpatientMsg.hlAddrOther}}</span>
        </li>
        <li class="printfullli">
          <label class="title-label ">到院方式：</label>
          <div class="leftDiv">
            <label ms-repeat="hlpgbmsgList.arvChlCodList" class="checklabel">
              <input type="checkbox" ms-class="arvChlCod_p{{el.infocode}}" class="arvChlCod_p"> {{el.info}}
              <span ms-if="hlpgbpatientMsg.arvChlCod == '5' && el.infocode == '5'">
                驾驶员姓名：<span class="print-span">{{hlpgbpatientMsg.abnDriver}}</span>
                医生签名：<span class="print-span">{{hlpgbpatientMsg.abnDoctor}}</span>
              </span>
            </label>
            <span class="print-span">{{hlpgbpatientMsg.abnScoNme}}</span>
          </div>
        </li>
        <li class="printfullli">
          <label class="title-label ">陪送人员：</label>
          <div class="leftDiv">
            <label ms-repeat="hlpgbmsgList.cmpPsnCodList" class="checklabel">
              <input type="checkbox" ms-class="cmpPsnCod_p{{el.infocode}}" class="cmpPsnCod_p"> {{el.info}}
            </label>
            <span class="print-span" >{{hlpgbpatientMsg.psryqt}}</span>
          </div>
        </li>
        <li class="printfullli">
          <label class="title-labelA ">院前处置：</label>
          <span>{{hlpgbpatientMsg.preHospitalTreatment}}</span>
        </li>
        <li class="printfullli">
          <label class="title-labelA ">主诉症状：</label>
          <span>{{hlpgbpatientMsg.preDgnCod}}</span>
        </li>
        <li class="printfullli">
          <label class="title-labelA ">初步诊断：</label>
          <span>{{hlpgbpatientMsg.jbzdDes}}</span>
        </li>
        <li class="printfullli">
          <label class="title-label ">生命体征：</label>
          <div class="leftDiv">
            <span>
              <span>
                <label>体温：</label>
                <span class="print-span" ms-if="hlpgbpatientMsg.tmpNbrFlg != ''">{{printMsg.tmpNbrFlgStr}}</span>
                <span ms-if="hlpgbpatientMsg.tmpNbrFlg !='2'||hlpgbpatientMsg.tmpNbrFlg !='3'">
                  <span class="print-span">{{hlpgbpatientMsg.tmpNbr}}</span>℃
                </span>
              </span>
              <span class="qxspan">
                <label>脉搏：</label>
                <span class="print-span" ms-if="hlpgbpatientMsg.pulseFlg != '1'&& hlpgbpatientMsg.pulseFlg != ''">{{printMsg.pulseFlgStr}}</span>
                <span ms-if="hlpgbpatientMsg.pulseFlg =='1'||hlpgbpatientMsg.pulseFlg ==''">
                  <span class="print-span">{{hlpgbpatientMsg.pulse}}</span>次/分
                </span>
              </span>
              <span class="qxspan">
                <label>呼吸：</label>
                <span class="print-span" ms-if="hlpgbpatientMsg.breNbrFlg != '1'&& hlpgbpatientMsg.breNbrFlg != ''">{{printMsg.breNbrFlgStr}}</span>
                <span ms-if="hlpgbpatientMsg.breNbrFlg !='3'">
                  <span class="print-span">{{hlpgbpatientMsg.breNbr}}</span>次/分
                </span>
              </span>
              <span class="qxspan">
                <label>血压：</label>
                <span class="print-span" ms-if="hlpgbpatientMsg.sbpNbrFlg != '1'&&hlpgbpatientMsg.sbpNbrFlg !=''">{{printMsg.sbpNbrFlgStr}}</span>
                <span ms-if="hlpgbpatientMsg.sbpNbrFlg =='1'||hlpgbpatientMsg.sbpNbrFlg ==''"><span class="print-span">{{hlpgbpatientMsg.sbpUpNbr}}</span>/
                <span class="print-span">{{hlpgbpatientMsg.sbpDownNbr}}</span>mmHg</span>
              </span>
            </span>
            <br/>
            <span>
              <span>
                <label>血氧：</label>
                <span class="print-span" ms-if="hlpgbpatientMsg.xyFlg != '1'&& hlpgbpatientMsg.xyFlg != ''">{{printMsg.xyFlgStr}}</span>
                <span ms-if="hlpgbpatientMsg.xyFlg =='1'||hlpgbpatientMsg.xyFlg ==''">
                  <span class="print-span">{{hlpgbpatientMsg.oxyNbr}}</span>%
                </span>
              </span>
              <span class="qxspan">
                <label>心率：</label>
                <span class="print-span" ms-if="hlpgbpatientMsg.hrtRteFlg != '1'&& hlpgbpatientMsg.hrtRteFlg != ''">{{printMsg.hrtRteFlgStr}}</span>
                <span ms-if="hlpgbpatientMsg.hrtRteFlg =='1'||hlpgbpatientMsg.hrtRteFlg ==''">
                  <span class="print-span">{{hlpgbpatientMsg.hrtRte}}</span>次/分
                </span>
              </span>
              <span class="qxspan">
                <label>血糖：</label>
                <span class="print-span" ms-if="hlpgbpatientMsg.glsCod != ''">{{printMsg.glsCodStr}}</span>
                <span class="print-span" ms-if="hlpgbpatientMsg.pbgNbrFlg != '1'&& hlpgbpatientMsg.pbgNbrFlg != ''">{{printMsg.pbgNbrFlgStr}}</span>
                <span ms-if="hlpgbpatientMsg.pbgNbrFlg =='1'||hlpgbpatientMsg.pbgNbrFlg ==''">
                  <span class="print-span">{{hlpgbpatientMsg.pbgNbr}}</span>mmol/L
                </span>
              </span>
            </span>
          </div>
        </li>
        <li class="printfullli">
          <label class="title-label">病种：</label>
          <div class="leftDiv">
            <label ms-repeat="hlpgbmsgList.hlbzCodList" class="checklabel">
              <input type="checkbox" ms-class="hlbzCod_p{{el.infocode}}" class="hlbzCod_p"> {{el.info}}
            </label>
            <span class="print-span" >{{hlpgbpatientMsg.hlbzOther}}</span>
          </div>
        </li>
        <li class="Boldli">
          <span>初步评估</span>
        </li>
        <li class="printfullli">
          <label class="title-label ">气道：</label>
          <label ms-repeat="hlpgbmsgList.qdCodList" class="checklabel">
            <input type="checkbox" ms-class="qdCod_p{{el.infocode}}" class="qdCod_p"> {{el.info}}
          </label>
          其他：<span class="print-span" >{{hlpgbpatientMsg.qdOther}}</span>
        </li>
        <li class="printfullli">
          <label class="title-label ">呼吸：</label>
          <label ms-repeat="hlpgbmsgList.hxCodList" class="checklabel">
            <input type="checkbox" ms-class="hxCod_p{{el.infocode}}" class="hxCod_p"> {{el.info}}
          </label>
          其他：<span class="print-span" >{{hlpgbpatientMsg.hxOther}}</span>
        </li>
        <li class="printfullli">
          <label class="title-label ">循环：</label>
          <label ms-repeat="hlpgbmsgList.xhCodList" class="checklabel">
            <input type="checkbox" ms-class="xhCod_p{{el.infocode}}" class="xhCod_p"> {{el.info}}
          </label>
        </li>
        <li class="printfullli">
          <label class="title-label ">出血：</label>
          <label ms-repeat="hlpgbmsgList.cxCodList" class="checklabel">
            <input type="checkbox" ms-class="cxCod_p{{el.infocode}}" class="cxCod_p"> {{el.info}}
          </label>
          其它部位：<span class="print-span" >{{hlpgbpatientMsg.cxQtbw}}</span>
        </li>
        <li class="printfullli">
          <label class="title-label">神经系统：</label>
          <div class="leftDiv">
            <label ms-repeat="hlpgbmsgList.nsCodList" class="checklabel">
                <input type="checkbox" ms-class="nsCod_p{{el.infocode}}" class="nsCod_p"> {{el.info}}
              </label><br/>
              <label ms-repeat="hlpgbmsgList.nsDaqtList" class="checklabel">
                <input type="checkbox" ms-class="nsDaqt_p{{el.infocode}}" class="nsDaqt_p"> {{el.info}}
              </label><br/>
              <label ms-repeat="hlpgbmsgList.nsTtcjList" class="checklabel">
                <input type="checkbox" ms-class="nsTtcj_p{{el.infocode}}" class="nsTtcj_p"> {{el.info}}
              </label><br/>
              <label ms-repeat="hlpgbmsgList.nsThztList" class="checklabel">
                <input type="checkbox" ms-class="nsThzt_p{{el.infocode}}" class="nsThzt_p"> {{el.info}}
                <span ms-if="hlpgbpatientMsg.nsThzt === 0 || hlpgbpatientMsg.nsThzt === '0' && el.infocode == 0">
                  部位平面：<span class="print-span">{{hlpgbpatientMsg.nsThztDes}}</span>
                </span>
                <span ms-if="hlpgbpatientMsg.nsThzt == 1 && el.infocode == 1">
                  <label ms-repeat="hlpgbmsgList.nsptzyList" class="checklabel">
                    <input type="checkbox" ms-class="nsptzy_p{{el.infocode}}" class="nsptzy_p"> {{el.info}}
                  </label>
                </span>
              </label>
          </div>
        </li>
        <li class="printfullli">
          <label class="title-label ">瞳孔左：</label>
          <label ms-repeat="hlpgbmsgList.tkLeftCodList" class="checklabel">
            <input type="checkbox" ms-class="tkLeftCod_p{{el.infocode}}" class="tkLeftCod_p"> {{el.info}}
          </label>
          <span class="print-span" >{{hlpgbpatientMsg.tkLeft}}</span>mm
          其他：<span class="print-span" >{{hlpgbpatientMsg.tkLeftOther}}</span>
        </li>
        <li class="printfullli">
          <label class="title-label ">瞳孔右：</label>
          <label ms-repeat="hlpgbmsgList.tkRightCodList" class="checklabel">
            <input type="checkbox" ms-class="tkRightCod_p{{el.infocode}}" class="tkRightCod_p"> {{el.info}}
          </label>
          <span class="print-span" >{{hlpgbpatientMsg.tkRight}}</span>mm
          其他：<span class="print-span" >{{hlpgbpatientMsg.tkRightOther}}</span>
        </li>
        <li class="printfullli">
          <label class="title-label ">神志：</label>
          <div class="leftDiv">
            <label ms-repeat="hlpgbmsgList.szCodList" class="checklabel">
              <input type="checkbox" ms-class="szCod_p{{el.infocode}}" class="szCod_p"> {{el.info}}
            </label>
            <br/>其他：<span class="print-span" >{{hlpgbpatientMsg.szOther}}</span>
          </div>
        </li>
        <li class="printfullli">
          <label class="title-label ">皮肤：</label>
          <div class="leftDiv">
            <label ms-repeat="hlpgbmsgList.pfCodList" class="checklabel">
              <input type="checkbox" ms-class="pfCod_p{{el.infocode}}" class="pfCod_p"> {{el.info}}
              <span class="print-span" ms-if="isShowStressText && el.infocode == 9">{{hlpgbpatientMsg.ylxssDes}}</span>
            </label>
            <br/>
            <label class="checklabel">
              <input type="checkbox" id="_pfFw"> 范围
            </label>
            <span class="print-span">{{hlpgbpatientMsg.pfFwDes}}</span>
          </div>
        </li>
        <li class="printfullli">
          <label class="title-label ">胃肠道：</label>
          <label ms-repeat="hlpgbmsgList.wcdCodList" class="checklabel">
            <input type="checkbox" ms-class="wcdCod_p{{el.infocode}}" class="wcdCod_p"> {{el.info}}
          </label>
          其他：<span class="print-span" >{{hlpgbpatientMsg.wcdOther}}</span>
        </li>
        <li class="printfullli">
          <label class="title-label ">腹部：</label>
          <div class="leftDiv">
            <label ms-repeat="hlpgbmsgList.fbCodList" class="checklabel">
              <input type="checkbox" ms-class="fbCod_p{{el.infocode}}" class="fbCod_p"> {{el.info}}
            </label><br/>
            <label class="checklabel">
              <input type="checkbox" id="_fbFc"> 腹穿
            </label>
            <span class="print-span" >{{hlpgbpatientMsg.fbFcDes}}</span>
            其他：<span class="print-span" >{{hlpgbpatientMsg.fbOther}}</span>
          </div>
        </li>
        <li class="printfullli">
          <label class="title-label ">四肢活动：</label>
          <label ms-repeat="hlpgbmsgList.szydCodList" class="checklabel">
            <input type="checkbox" ms-class="szydCod_p{{el.infocode}}" class="szydCod_p"> {{el.info}}
          </label>
          其他：<span class="print-span" >{{hlpgbpatientMsg.szydOther}}</span>
        </li>
        <li class="printfullli">
          <label class="title-label ">疼痛：</label>
          <label ms-repeat="hlpgbmsgList.ttCodList" class="checklabel">
            <input type="checkbox" ms-class="ttCod_p{{el.infocode}}" class="ttCod_p"> {{el.info}}
          </label>
          部位：<span class="print-span" >{{hlpgbpatientMsg.ttBw}}</span>
        </li>
        <li class="printfullli">
          <label class="title-label ">疾病史：</label>
          <label ms-repeat="hlpgbmsgList.jbsCodList" class="checklabel">
            <input type="checkbox" ms-class="jbsCod_p{{el.infocode}}" class="jbsCod_p"> {{el.info}}
          </label>
          内容：<span class="print-span" >{{hlpgbpatientMsg.jbsDes}}</span>
        </li>
        <li class="printfullli">
          <label class="title-label ">手术史：</label>
          <label ms-repeat="hlpgbmsgList.sssCodList" class="checklabel">
            <input type="checkbox" ms-class="sssCod_p{{el.infocode}}" class="sssCod_p"> {{el.info}}
          </label>
          内容：<span class="print-span" >{{hlpgbpatientMsg.sssDes}}</span>
        </li>
        <li class="printfullli">
          <label class="title-label ">过敏史：</label>
          <div class="leftDiv">
            <label ms-repeat="hlpgbmsgList.gmsCodList" class="checklabel">
              <input type="checkbox" ms-class="gmsCod_p{{el.infocode}}" class="gmsCod_p"> {{el.info}}
            </label>
            <span ms-visible="hlpgbpatientMsg.gmsCod == 2">
              <br/>类型：
              <label ms-repeat="hlpgbmsgList.gmsTypeList" class="checklabel">
                <input type="checkbox" ms-class="gmsType_p{{el.infocode}}" class="gmsType_p"> {{el.info}}
              </label>
              <span class="print-span">{{hlpgbpatientMsg.gmsDes}}</span>
            </span>
          </div>
        </li>
        <li class="printfullli">
          <span class="basic-spanA">
            <label class="fontBold">Braden评分：</label>
            <span class="print-span">{{aboutSco.bradenSco}}</span>分
          </span>
          <span class="basic-spanA">
            <label class="title-labelB">ADL评分：</label>
            <span class="print-span">{{aboutSco.adlSco}}</span>分
          </span>
          <span class="basic-spanA">
            <label class="title-labelB">疼痛评分：</label>
            <span class="print-span">{{aboutSco.nrsSco}}</span>分
          </span>
        </li>
        <li class="printfullli">
          <span class="basic-spanA">
            <label class="title-labelA fontBold">GCS评分：</label>
            <span class="print-span">{{aboutSco.gcsSco}}</span>分
          </span>
          <span class="basic-spanA">
            <label class="title-labelB">转运风险评分：</label>
            <span class="print-span">{{aboutSco.zyfxpfSco}}</span>分
          </span>
          <span class="basic-spanA">
            <label class="title-labelB">Morse评分：</label>
            <span class="print-span">{{aboutSco.morseSco}}</span>分
          </span>
        </li>
        <li class="printfullli">
          <label class="title-label ">处理步骤：</label>
          <div class="leftDiv">
            <label ms-repeat="hlpgbmsgList.clbzCodList" class="checklabel">
              <input type="checkbox" ms-class="clbzCod_p{{el.infocode}}" class="clbzCod_p"> {{el.info}}
              <span ms-if="el.infocode == 1 && hlpgbpatientMsg.clbzCod.$model.indexOf('1') != -1">
                <span class="print-span">{{hlpgbpatientMsg.xyDes}}</span>升/分 
              </span>
            </label>
            <span class="print-span">{{hlpgbpatientMsg.clbzOther}}</span>
          </div>
        </li>
        <li class="printfullli">
          <label class="title-labelA">备注：</label>
          <span class="print-span">{{hlpgbpatientMsg.memo}}</span>
        </li>
        <li class="Boldli">
          <span>其他</span>
         </li>
        <!--<li class="printfullli">
          <span ms-if="hlpgbpatientMsg.qtQmsRs != ''">
            <label class="title-labelA">青霉素：</label>
            <label>结果：</label>
            <span class="scospan">{{hlpgbpatientMsg.qtQmsRs}}</span>
            <label>时间：</label>
            <span class=" scospan">{{hlpgbpatientMsg.qtQmsDat}}</span>
          </span>
          <span ms-if="hlpgbpatientMsg.qtTatRs != ''">
            <label class="title-labelA">TAT：</label>
            <label>结果：</label>
            <span class="scospan">{{hlpgbpatientMsg.qtTatRs}}</span>
            <label>时间：</label>
            <span class="scospan">{{hlpgbpatientMsg.qtTatDat}}</span>
          </span>
        </li>
        <li class="printfullli">
          <span ms-if="hlpgbpatientMsg.qtObj1Nam != ''">
            <span class="title-labelA">{{hlpgbpatientMsg.qtObj1Nam}}：</span>
            <label>结果：</label>
            <span class="scospan">{{hlpgbpatientMsg.qtObj1Rs}}</span>
            <label>时间：</label>
            <span class="scospan">{{hlpgbpatientMsg.qtObj1Dat}}</span>
          </span>
          <span ms-if="hlpgbpatientMsg.qtObj2Nam != ''">
            <span class="title-labelA">{{hlpgbpatientMsg.qtObj2Nam}}：</span>
            <label>结果：</label>
            <span class="scospan">{{hlpgbpatientMsg.qtObj2Rs}}</span>
            <label>时间：</label>
            <span class="scospan">{{hlpgbpatientMsg.qtObj2Dat}}</span>
          </span>
        </li> -->
        <li class="printfullli">
          <label class="title-label">紧急联系：</label>
          <label>联系人1：</label>
          <span class="print-span scospan">{{hlpgbpatientMsg.jjlxNam}}</span>
          <label>电话：</label>
          <span class="print-span scospan">{{hlpgbpatientMsg.jjlxTel}}</span>
          <label>联系人2：</label>
          <span class="print-span scospan">{{hlpgbpatientMsg.jjlxNam2}}</span>
          <label>电话：</label>
          <span class="print-span scospan">{{hlpgbpatientMsg.jjlxTel2}}</span>
        </li>
        <li class="printfullli">
          <label class="title-label">去向：</label>
          <span class="scospan">{{hlpgbpatientMsg.sqlDat}}</span>
          <span class="scospan">{{hlpgbpatientMsg.sqlStaStr}}</span>
          <span class="scospan" ms-if="hlpgbpatientMsg.sqlDepName != ''">{{hlpgbpatientMsg.sqlDepName}}</span>
          <span class="scospan" ms-if="hlpgbpatientMsg.sqlDes != ''">{{hlpgbpatientMsg.sqlDes}}</span>
          <span class="scospan" ms-if="hlpgbpatientMsg.bedNam != ''">{{hlpgbpatientMsg.bedNam}}</span>
        </li>
        <li class="only-right">
          <span>评估者时间：</span>
          <span>{{hlpgbpatientMsg.assessmentDat}}</span>
          <span>评估者签名：</span>
          <span>{{hlpgbpatientMsg.preAssNam}}</span>
        </li>
      </ul>
    </div>
  </div>
  <object id="ocx" classid="clsid:66665BEC-6877-4720-B1AC-56FA0A71B700" width=0px height=0px></object>
  <script type="text/javascript">
    function print() {
      $('.printDiv').addClass('.printDiv');
      var getMsgUrl = '${baseurl}hlpgb/queryhlpgb_result.do';
      publicFun.httpServer({ url: getMsgUrl }, { emgSeq: _emgSeq, date: new Date().toTimeString() }, function (res) {
        setValue(res)
      })
    }

    function setValue(res) {
      $('#docuTitle').html("入院护理评估单");
      $('#bedNum').html(parent.parent.$('#bedNum').html());
      var _ckList = ['cmpPsnCod','arvChlCod','qkCod','hlAddr','clbzCod','gmsType','gmsCod','sssCod','jbsCod','ttCod','szydCod','fbCod','wcdCod','pfFw','pfCod','szCod','hlbzCod','qdCod','hxCod','xhCod','cxCod','nsTtcj','nsDaqt','nsCod','nsptzy','nsThzt','tkRightCod','tkLeftCod'];
      for (var i = 0; i < _ckList.length; i++) {
        var _codVal = sub.hlpgbpatientMsg[_ckList[i]];
        $('.' + _ckList[i] + '_p').attr('checked', false);
        $.each(_codVal,function(_idx,_val){
          if (_val) {
            $('.' + _ckList[i] + '_p' + _val).attr('checked', true);
          }
        })
      }
      var tmpNbrFlgList = [{infocode:'',info:''},{infocode:'1',info:'耳温'},{infocode:'2',info:'不升'},{infocode:'3',info:'拒测'}],
          breNbrFlgList = [{infocode:'1',info:''},{infocode:'2',info:'机械通气'},{infocode:'3',info:'拒测'}],
          JcList = [{infocode:'1',info:''},{infocode:'2',info:'测不出'},{infocode:'3',info:'拒测'}],
          pbgNbrFlgList = [{infocode:'1',info:''},{infocode:'2',info:'LO'},{infocode:'3',info:'HI'},{infocode:'4',info:'拒测'}];
      
      $.each(tmpNbrFlgList,function(_idx,_val){
        if (sub.hlpgbpatientMsg.tmpNbrFlg == _val.infocode) {
          sub.printMsg.tmpNbrFlgStr = _val.info
        }
      })
      $.each(breNbrFlgList,function(_idx,_val){
        if (sub.hlpgbpatientMsg.breNbrFlg == _val.infocode) {
          sub.printMsg.breNbrFlgStr = _val.info
        }
      })
      $.each(JcList,function(_idx,_val){
        if (sub.hlpgbpatientMsg.sbpNbrFlg == _val.infocode) {
          sub.printMsg.sbpNbrFlgStr = _val.info
        }
        if (sub.hlpgbpatientMsg.xyFlg == _val.infocode) {
          sub.printMsg.xyFlgStr = _val.info
        }
        if (sub.hlpgbpatientMsg.pulseFlg == _val.infocode) {
          sub.printMsg.pulseFlgStr = _val.info
        }
        if (sub.hlpgbpatientMsg.hrtRteFlg == _val.infocode) {
          sub.printMsg.hrtRteFlgStr = _val.info
        }
      })
      $.each(pbgNbrFlgList,function(_idx,_val){
        if (sub.hlpgbpatientMsg.pbgNbrFlg == _val.infocode) {
          sub.printMsg.pbgNbrFlgStr = _val.info
        }
      })
      $.each(_glsCodList,function(_idx,_val){
        if (sub.hlpgbpatientMsg.glsCod == _val.infocode) {
          sub.printMsg.glsCodStr = _val.info
        }
      })
          
      if(sub.hlpgbpatientMsg.pfFw == 1){
        $('#_pfFw').attr('checked',true)
      }
      if(sub.hlpgbpatientMsg.fbFc == 1){
        $('#_fbFc').attr('checked',true)
      }
      
      $('.print-ul').css({ "float": "left", "width": "96%", "font-size": "0.32cm", "margin": "2mm 2% 0 2%", "padding": "0" });
      $('.print-ul li.printfullli').css({ "float": "left", "width": "100%", "list-style": "none","padding-bottom": "1mm"});
      $('.print-ul li .title-label').css({ "display": "inline-block", "width": "5.5em", "text-align": "right" ,'float':"left"});
      $('.print-ul li .title-labelA').css({ "display": "inline-block", "width": "5.5em", "text-align": "right" });
      $('.print-ul li .title-labelC').css({ "display": "inline-block", "width": "4.3em", "text-align": "right" });
      $('.print-ul li .title-labelB').css({ "display": "inline-block", "width": "7.5em", "text-align": "right" ,'font-weight':'bolder'});
      $('.print-ul li .fontBold').css({ 'font-weight':'bolder'});
      $('.print-span').css({'min-width': '8mm', 'border-bottom': '1px solid #000', 'display': 'inline-block', 'vertical-align': 'bottom'});
      $('.spc-span').css("margin-left", "5.5em");
      $('.print-ul span.basic-spanA').css({ "display": "inline-block", "width": "32%" });
      $('.print-ul span.basic-span span').css("float", "left");
      $('.print-ul span.qxspan').css("margin-left", "3mm");
      $('.print-ul span.scospan').css("margin-right", "3mm");
      $('.print-ul .Boldli').css({ "font-weight": "bold" });
      $('.print-ul li.only-right').css({ 'float': 'right', 'width': '60%', 'padding': '0', 'margin': '0' });
      $('.print-ul .leftDiv').css({ "display": "block",'float':'left','width':'88%'});
      
      LODOP = getLodop();
      LODOP.PRINT_INITA(0, 0, "210mm", "297mm", "打印控件功能演示_Lodop功能_超文本内容缩放打印");
      LODOP.SET_PRINT_PAGESIZE(0, "210mm", "297mm", "");
      LODOP.SET_PRINT_MODE("NOCLEAR_AFTER_PRINT", true);
      LODOP.ADD_PRINT_HTM(3, 0, "100%", "100%", document.getElementById("printDoc1").innerHTML);
      LODOP.NewPageA();
      LODOP.SET_PRINT_STYLE("FontSize", 10);
      //LODOP.SET_PRINTER_INDEX("ZDesigner GK888t");
      LODOP.PREVIEW();
      //LODOP.PRINT();
    }
  </script>
</body>

</html>