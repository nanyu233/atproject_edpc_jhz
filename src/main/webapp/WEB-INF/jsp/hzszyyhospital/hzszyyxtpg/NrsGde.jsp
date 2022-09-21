<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/base/tag.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
</head>

<body>
    <div class="panelGde">
        <div class="NrsBlock panelBlock">
            <div class="tabtop floatLeft">
                <span class="title">疼痛评分</span>
                <span class="isFinish" ms-visible="systemtMsg.nrsscoFlg===0||systemtMsg.nrsscoFlg==='0'">未评分</span>
                <span class="scoSpn" ms-visible="systemtMsg.nrsscoFlg!=0||systemtMsg.nrsscoFlg==''">{{systemtMsg.nrsSco}}分</span>
            </div>
            <span ms-click="toggleBox('nrsFlag','nrsMsg','systemtMsg')" class="edit">
                <img src="../images/hzszyyhems/nurse/edit.png">
                <span>{{systemtMsg.nrsMsg}}</span>
            </span>
        </div>
        <div class="NrsContent panelContent" ms-visible="systemtMsg.nrsFlag===1||systemtMsg.nrsFlag==='1'">
            <input class="hidden" type="text" ms-duplex-string="systemtMsg.nrsSco" name="hspNrsInfCustom.nrsSco">
            <input class="hidden" type="text" ms-duplex-string="systemtMsg.ttpfTypeCod" name="hspNrsInfCustom.ttpfTypeCod">
            <input class="hidden" type="text" ms-duplex-string="systemtMsg.ttpfNr" name="hspNrsInfCustom.ttpfNr">
            <div class="nrsWrapper">
                <div class="partOne">
                    <div class="panelA">
                        <label class="lab-title">
                            <input id="typeSlide" name="typeWay" type="radio" value="0" ms-change="setRadio('0')" />
                            VAS (视觉模拟法)
                        </label>
                        <div class="slide-wrapper" ms-visible="systemtMsg.ttpfTypeCod === '0' || systemtMsg.ttpfTypeCod === 0">
                            <div id="control-group">
                                <p class="leftText">无痛</p>
                                <div class="scroll-bar" id="scroll-bar">
                                    <div class="entire-bar" id="entire-bar"></div>
                                    <div class="action-bar" id="action-bar"></div>
                                    <div class="action-block" id="action-block"></div>
                                </div>
                                <p class="rightText">最痛</p>
                                <input type="text" id="showArea" class="hidden" />
                            </div>
                        </div>
                    </div>
                    <div class="panelB">
                        <label class="lab-title">
                            <input id="typenum" name="typeWay" type="radio" value="1" ms-change="setRadio('1')" />
                            NRS (数字评分法)
                        </label>
                        <ul class="num-ul" ms-visible="systemtMsg.ttpfTypeCod == '1'">
                            <li ms-repeat="getMsg.numList" ms-class="active: el.isAct" ms-click="textCheck($index, 'num')">
                                {{el.info}}
                            </li>
                        </ul>
                    </div>
                    <div class="panelC">
                        <label class="lab-title">
                            <input id="typeFace" name="typeWay" type="radio" value="2" ms-change="setRadio('2')" />
                            Wong-Baker
                            (面部表情量法)
                        </label>
                        <span class="marginGap" ms-visible="systemtMsg.ttpfTypeCod == '2'">
                            <a ms-repeat="['00','01','02','03','04','05','06','07','08','09','10']" class="face"
                                ms-class-1="face-{{el}}" ms-class-2="active:$index==systemtMsg.faceNrsSco" href="javascript:;"
                                ms-click="chooseAche(el)" ms-visible="$index % 2 == 0"></a>
                        </span>
                    </div>
                    <div class="panelD">
                        <label class="lab-title">
                            <input id="typelan" name="typeWay" type="radio" value="3" ms-change="setRadio('3')" />
                            VRS (主诉疼痛程度分级法)
                        </label>
                        <ul class="lan-ul" ms-visible="systemtMsg.ttpfTypeCod == '3'">
                            <li ms-repeat="getMsg.lanList" ms-class="active: el.isAct" ms-click="textCheck($index, 'lan')">
                                {{el.info}}
                            </li>
                        </ul>
                    </div>
                </div>
                <div class="partTwo scoreQuery">
                    <label class="lab-title">
                        <input name="typeWay" type="radio" value="4" ms-change="setRadio('4')" /> FLACC
                        (疼痛行为量表)
                    </label>
                    <div class="panelGde panelContent" ms-visible="systemtMsg.ttpfTypeCod == '4'">
                        <table class="paneltab">
                            <tr class="firsttr">
                                <th></th>
                                <td>0分</td>
                                <td>1分</td>
                                <td>2分</td>
                            </tr>
                            <tr class="eventr">
                                <th>脸部肌肉表情</th>
                                <td ms-repeat="getMsg.faceMsList">
                                    <label ms-attr-for="faceMs{{el.infocode}}" class="labtab">
                                        <span class="inputSpan">
                                            <input ms-attr-id="faceMs{{el.infocode}}" type="checkbox" ms-duplex="systemtMsg.faceMs"
                                                ms-attr-value="el.infocode" ms-change="radioClick('faceMs', $index, 'flaccList')">
                                            {{el.info}}
                                        </span>
                                    </label>
                                </td>
                            </tr>
                            <tr class="oddtr">
                                <th>休息</th>
                                <td ms-repeat="getMsg.relaxList">
                                    <label ms-attr-for="relax{{el.infocode}}" class="labtab">
                                        <span class="inputSpan">
                                            <input ms-attr-id="relax{{el.infocode}}" type="checkbox" ms-duplex="systemtMsg.relax"
                                                ms-attr-value="el.infocode" ms-change="radioClick('relax', $index, 'flaccList')">
                                            {{el.info}}
                                        </span>
                                    </label>
                                </td>
                            </tr>
                            <tr class="eventr">
                                <th>肌紧张</th>
                                <td ms-repeat="getMsg.muscleList">
                                    <label ms-attr-for="muscle{{el.infocode}}" class="labtab">
                                        <span class="inputSpan">
                                            <input ms-attr-id="muscle{{el.infocode}}" type="checkbox" ms-duplex="systemtMsg.muscle"
                                                ms-attr-value="el.infocode" ms-change="radioClick('muscle', $index, 'flaccList')">
                                            {{el.info}}
                                        </span>
                                    </label>
                                </td>
                            </tr>
                            <tr class="oddtr">
                                <th>发声</th>
                                <td ms-repeat="getMsg.voiceList">
                                    <label ms-attr-for="voice{{el.infocode}}" class="labtab">
                                        <span class="inputSpan">
                                            <input ms-attr-id="voice{{el.infocode}}" type="checkbox" ms-duplex="systemtMsg.voice"
                                                ms-attr-value="el.infocode" ms-change="radioClick('voice', $index, 'flaccList')">
                                            {{el.info}}
                                        </span>
                                    </label>
                                </td>
                            </tr>
                            <tr class="eventr">
                                <th>安抚</th>
                                <td ms-repeat="getMsg.clamList">
                                    <label ms-attr-for="clam{{el.infocode}}" class="labtab">
                                        <span class="inputSpan">
                                            <input ms-attr-id="clam{{el.infocode}}" type="checkbox" ms-duplex="systemtMsg.clam"
                                                ms-attr-value="el.infocode" ms-change="radioClick('clam', $index, 'flaccList')">
                                            {{el.info}}
                                        </span>
                                    </label>
                                </td>
                            </tr>
                        </table>
                    </div>
                </div>
                <div class="partThree scoreQuery">
                    <label class="lab-title">
                        <input name="typeWay" type="radio" value="5" ms-change="setRadio('5')" /> COPPT
                        (重症监护疼痛观察工具)
                    </label>
                    <div class="panelGde panelContent" ms-visible="systemtMsg.ttpfTypeCod == '5'">
                        <table class="paneltab">
                            <tr class="firsttr">
                                <th></th>
                                <td>0分</td>
                                <td>1分</td>
                                <td>2分</td>
                            </tr>
                            <tr class="eventr">
                                <th>面部表情</th>
                                <td ms-repeat="getMsg.oTFaceList">
                                    <label ms-attr-for="oTFace{{el.infocode}}" class="labtab">
                                        <span class="inputSpan">
                                            <input ms-attr-id="oTFace{{el.infocode}}" type="checkbox" ms-duplex="systemtMsg.oTFace"
                                                ms-attr-value="el.infocode" ms-change="radioClick('oTFace', $index, 'copptList')">
                                            {{el.info}}
                                        </span>
                                    </label>
                                </td>
                            </tr>
                            <tr class="oddtr">
                                <th>身体动作</th>
                                <td ms-repeat="getMsg.oTBodyList">
                                    <label ms-attr-for="oTBody{{el.infocode}}" class="labtab">
                                        <span class="inputSpan">
                                            <input ms-attr-id="oTBody{{el.infocode}}" type="checkbox" ms-duplex="systemtMsg.oTBody"
                                                ms-attr-value="el.infocode" ms-change="radioClick('oTBody', $index, 'copptList')">
                                            {{el.info}}
                                        </span>
                                    </label>
                                </td>
                            </tr>
                            <tr class="eventr">
                                <th>肌肉紧张</th>
                                <td ms-repeat="getMsg.oTMuscleList">
                                    <label ms-attr-for="oTMuscle{{el.infocode}}" class="labtab">
                                        <span class="inputSpan">
                                            <input ms-attr-id="oTMuscle{{el.infocode}}" type="checkbox" ms-duplex="systemtMsg.oTMuscle"
                                                ms-attr-value="el.infocode" ms-change="radioClick('oTMuscle', $index, 'copptList')">
                                            {{el.info}}
                                        </span>
                                    </label>
                                </td>
                            </tr>
                            <tr class="oddtr">
                                <th>对呼吸的顺应性</th>
                                <td ms-repeat="getMsg.oTBreathList">
                                    <label ms-attr-for="oTBreath{{el.infocode}}" class="labtab">
                                        <span class="inputSpan">
                                            <input ms-attr-id="oTBreath{{el.infocode}}" type="checkbox" ms-duplex="systemtMsg.oTBreath"
                                                ms-attr-value="el.infocode" ms-change="radioClick('oTBreath', $index, 'copptList')">
                                            {{el.info}}
                                        </span>
                                    </label>
                                </td>
                            </tr>
                            <tr class="eventr">
                                <th>发声</th>
                                <td ms-repeat="getMsg.oTVoiceList">
                                    <label ms-attr-for="oTVoice{{el.infocode}}" class="labtab">
                                        <span class="inputSpan">
                                            <input ms-attr-id="oTVoice{{el.infocode}}" type="checkbox" ms-duplex="systemtMsg.oTVoice"
                                                ms-attr-value="el.infocode" ms-change="radioClick('oTVoice', $index, 'copptList')">
                                            {{el.info}}
                                        </span>
                                    </label>
                                </td>
                            </tr>
                        </table>
                    </div>
                </div>
            </div>
            <div class="scoreDiv">
                <span>总分：{{systemtMsg.nrsSco}}</span>
            </div>
        </div>
    </div>
</body>