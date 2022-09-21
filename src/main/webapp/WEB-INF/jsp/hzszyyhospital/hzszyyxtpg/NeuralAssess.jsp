<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/base/tag.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
</head>

<body>
    <div class="panelGde">
        <div class="panelBlock adlBlock">
            <div class="tabtop floatLeft">
              <span class="title">神经系统评估</span>  
              <span class="scoSpn" ms-visible="systemtMsg.sjxtFlg==1 && systemtMsg.xtpgSjFlg != '1'">已完成</span>
              <span class="isFinish" ms-visible="(systemtMsg.sjxtFlg===0||systemtMsg.sjxtFlg==='0') && systemtMsg.xtpgSjFlg != '1'">未完成</span>   
              <span class="scoSpn" ms-visible="systemtMsg.xtpgSjFlg == 1">无明显异常</span>   
            </div>
            <span ms-click="toggleBox('nurAssessFlag','nurAssessMsg','systemtMsg')"  class="edit">
                <img src="../images/hzszyyhems/nurse/edit.png">
                <span>{{systemtMsg.nurAssessMsg}}</span>
            </span>        
        </div>
        <div class="panelContent NeuralContent" ms-visible="systemtMsg.nurAssessFlag===1||systemtMsg.nurAssessFlag==='1'">
            <div class="wrapperShadow">
                <ul>
                    <li>
                        <label class="titlelab">是否异常：</label>
                        <label ms-repeat="systemList.xtpgSjFlgList" ms-attr-for="xtpgSjFlg{{el.infocode}}" class="labWrp">
                            <input ms-attr-id="xtpgSjFlg{{el.infocode}}" type="checkbox" ms-attr-checked="el.checked" ms-click="radioclick('xtpgSjFlg',$index)" />
                            <span class="content_span">{{el.info}}</span>
                        </label>
                        <input class="hidden" type="text" name="hspXtpgInfCustom.xtpgSjFlg" ms-duplex-string="systemtMsg.xtpgSjFlg">
                    </li>
                </ul>
                <ul class="hiddenPanel" ms-visible="systemtMsg.xtpgSjFlg == 2">
                    <li>
                        <label class="titlelab">意识：</label>
                        <label ms-repeat="systemList.sjxtpgYsCodList" ms-attr-for="sjxtpgYsCod{{el.infocode}}" class="labWrp">
                            <input ms-attr-id="sjxtpgYsCodB{{el.infocode}}" type="checkbox" ms-attr-checked="el.checked" ms-click="Spcradioclick('sjxtpgYsCod',$index,el.infocode)" />
                            <span class="content_span">{{el.info}}</span>
                            <select ms-duplex-string="systemtMsg.sjxtpgYssubCod" ms-visible="systemtMsg.showselect0==true && el.infocode==1">
                                <option value=""></option>
                                <option ms-repeat="systemList.sjxtpgYssubCodList" ms-attr-value="el.infocode">{{el.info}}</option>
                            </select>
                            <select ms-duplex-string="systemtMsg.sjxtpgYssubCodb" ms-visible="systemtMsg.showselect1==true && el.infocode==2">
                                <option value=""></option>
                                <option ms-repeat="systemList.sjxtpgYssubCodbList" ms-attr-value="el.infocode">{{el.info}}</option>
                            </select>
                        </label>
                        <input class="hidden" type="text" ms-duplex-string="xtpghideMsg.sjxtpgYsCod" name="hspSjxtpgInfCustom.sjxtpgYsCod">
                        <input class="hidden" type="text" ms-duplex-string="systemtMsg.sjxtpgYssubCod" name="hspSjxtpgInfCustom.sjxtpgYssubCod">
                        <input class="hidden" type="text" ms-duplex-string="systemtMsg.sjxtpgYssubCodb" name="hspSjxtpgInfCustom.sjxtpgYssubCodb">
                    </li>
                    <li>
                        <label class="titlelab">语言：</label>
                        <label ms-repeat="systemList.sjxtpgYyCodList" ms-attr-for="sjxtpgYyCod{{el.infocode}}" class="labWrp">
                            <input ms-attr-id="sjxtpgYyCod{{el.infocode}}" type="checkbox" ms-attr-checked="el.checked" ms-click="checkClick('sjxtpgYyCod',$index)" />
                            <span class="content_span">{{el.info}}</span>
                        </label>
                        <input class="hidden" type="text" ms-duplex-string="xtpghideMsg.sjxtpgYyCod" name="hspSjxtpgInfCustom.sjxtpgYyCod">
                    </li>
                    <li>
                        <label class="titlelab">瞳孔：</label>
                        <span class="content_span labWrp">
                            左
                        </span>
                        <span class="content_span labWrp">
                            <input type="text" name="hspSjxtpgInfCustom.tkLefttkZj" ms-duplex-string="systemtMsg.tkLefttkZj" class="inputLth" ms-keyup="onlyNum('tkLefttkZj',2,99.99)"> mm
                        </span>
                        <label ms-repeat="systemList.tkLefttkZtCodList" ms-attr-for="tkLefttkZtCod{{el.infocode}}" class="labWrp">
                            <input ms-attr-id="tkLefttkZtCod{{el.infocode}}" type="checkbox" ms-attr-checked="el.checked" ms-click="radioclick('tkLefttkZtCod',$index)" />
                            <span class="content_span">{{el.info}}</span>
                        </label>
                        <input class="hidden" type="text" ms-duplex-string="systemtMsg.tkLefttkZtCod" name="hspSjxtpgInfCustom.tkLefttkZtCod">

                        <label ms-repeat="systemList.leftTbDgfyList" ms-attr-for="leftTbDgfy{{el.infocode}}" class="labWrp">
                            <input ms-attr-id="leftTbDgfy{{el.infocode}}" type="checkbox" ms-attr-checked="el.checked" ms-click="radioclick('leftTbDgfy',$index)" />
                            <span class="content_span">{{el.info}}</span>
                        </label>
                        <input class="hidden" type="text" ms-duplex-string="systemtMsg.leftTbDgfy" name="hspSjxtpgInfCustom.leftTbDgfy">
                        <br/>
                        <span class="leftMargin">
                            右
                        </span>
                        <span class="content_span labWrp">
                            <input type="text" name="hspSjxtpgInfCustom.tkRighttkZj" ms-duplex-string="systemtMsg.tkRighttkZj" class="inputLth" ms-keyup="onlyNum('tkRighttkZj',2,99.99)"> mm
                        </span>
                        <label ms-repeat="systemList.tkRighttkZtCodList" ms-attr-for="tkRighttkZtCod{{el.infocode}}" class="labWrp">
                            <input ms-attr-id="tkRighttkZtCod{{el.infocode}}" type="checkbox" ms-attr-checked="el.checked" ms-click="radioclick('tkRighttkZtCod',$index)" />
                            <span class="content_span">{{el.info}}</span>
                        </label>
                        <input class="hidden" type="text" ms-duplex-string="systemtMsg.tkRighttkZtCod" name="hspSjxtpgInfCustom.tkRighttkZtCod">

                        <label ms-repeat="systemList.rightTbDgfyList" ms-attr-for="rightTbDgfy{{el.infocode}}" class="labWrp">
                            <input ms-attr-id="rightTbDgfy{{el.infocode}}" type="checkbox" ms-attr-checked="el.checked" ms-click="radioclick('rightTbDgfy',$index)" />
                            <span class="content_span">{{el.info}}</span>
                        </label>
                        <input class="hidden" type="text" ms-duplex-string="systemtMsg.rightTbDgfy" name="hspSjxtpgInfCustom.rightTbDgfy">
                    </li>
                    <li>
                        <label class="titlelab">肌力：</label>
                        <span class="content_span labWrp">
                            左上肢
                        </span>
                        <label ms-repeat="systemList.leftsJzSzCodList" ms-attr-for="leftsJzSzCod{{el.infocode}}" class="labWrp">
                            <input ms-attr-id="leftsJzSzCod{{el.infocode}}" type="checkbox" ms-attr-checked="el.checked" ms-click="checkClick('leftsJzSzCod',$index)" />
                            <span class="content_span">{{el.info}}</span>
                        </label>
                        <input class="hidden" type="text" ms-duplex-string="xtpghideMsg.leftsJzSzCod" name="hspSjxtpgInfCustom.leftsJzSzCod">
                        <br/>
                        <span class="leftMargin">
                            右上肢
                        </span>
                        <label ms-repeat="systemList.rightsJzSzCodList" ms-attr-for="rightsJzSzCod{{el.infocode}}" class="labWrp">
                            <input ms-attr-id="rightsJzSzCod{{el.infocode}}" type="checkbox" ms-attr-checked="el.checked" ms-click="checkClick('rightsJzSzCod',$index)" />
                            <span class="content_span">{{el.info}}</span>
                        </label>
                        <input class="hidden" type="text" ms-duplex-string="xtpghideMsg.rightsJzSzCod" name="hspSjxtpgInfCustom.rightsJzSzCod">
                        <br/>
                        <span class="leftMargin">
                            左下肢
                        </span>
                        <label ms-repeat="systemList.leftxJzSzCodList" ms-attr-for="leftxJzSzCod{{el.infocode}}" class="labWrp">
                            <input ms-attr-id="leftxJzSzCod{{el.infocode}}" type="checkbox" ms-attr-checked="el.checked" ms-click="checkClick('leftxJzSzCod',$index)" />
                            <span class="content_span">{{el.info}}</span>
                        </label>
                        <input class="hidden" type="text" ms-duplex-string="xtpghideMsg.leftxJzSzCod" name="hspSjxtpgInfCustom.leftxJzSzCod">
                        <br/>
                        <span class="leftMargin">
                            右下肢
                        </span>
                        <label ms-repeat="systemList.rightxJzSzCodList" ms-attr-for="rightxJzSzCod{{el.infocode}}" class="labWrp">
                            <input ms-attr-id="rightxJzSzCod{{el.infocode}}" type="checkbox" ms-attr-checked="el.checked" ms-click="checkClick('rightxJzSzCod',$index)" />
                            <span class="content_span">{{el.info}}</span>
                        </label>
                        <input class="hidden" type="text" ms-duplex-string="xtpghideMsg.rightxJzSzCod" name="hspSjxtpgInfCustom.rightxJzSzCod">
                    </li>
                    <li>
                        <label class="titlelab">肌张力：</label>
                        <span class="content_span labWrp">
                            左上肢
                        </span>
                        <label ms-repeat="systemList.leftsSjJzlList" ms-attr-for="leftsSjJzl{{el.infocode}}" class="labWrp">
                            <input ms-attr-id="leftsSjJzl{{el.infocode}}" type="checkbox" ms-attr-checked="el.checked" ms-click="radioclick('leftsSjJzl',$index)" />
                            <span class="content_span">{{el.info}}</span>
                        </label>
                        <input class="hidden" type="text" ms-duplex-string="systemtMsg.leftsSjJzl" name="hspSjxtpgInfCustom.leftsSjJzl">
                        <span class="content_span labWrp">
                            右上肢
                        </span>
                        <label ms-repeat="systemList.rightsSjJzlList" ms-attr-for="rightsSjJzl{{el.infocode}}" class="labWrp">
                            <input ms-attr-id="rightsSjJzl{{el.infocode}}" type="checkbox" ms-attr-checked="el.checked" ms-click="radioclick('rightsSjJzl',$index)" />
                            <span class="content_span">{{el.info}}</span>
                        </label>
                        <input class="hidden" type="text" ms-duplex-string="systemtMsg.rightsSjJzl" name="hspSjxtpgInfCustom.rightsSjJzl">
                        <span class="content_span labWrp">
                            左下肢
                        </span>
                        <label ms-repeat="systemList.leftxSjJzlList" ms-attr-for="leftxSjJzl{{el.infocode}}" class="labWrp">
                            <input ms-attr-id="leftxSjJzl{{el.infocode}}" type="checkbox" ms-attr-checked="el.checked" ms-click="radioclick('leftxSjJzl',$index)" />
                            <span class="content_span">{{el.info}}</span>
                        </label>
                        <input class="hidden" type="text" ms-duplex-string="systemtMsg.leftxSjJzl" name="hspSjxtpgInfCustom.leftxSjJzl">
                        <span class="content_span labWrp">
                            右下肢
                        </span>
                        <label ms-repeat="systemList.rightxSjJzlList" ms-attr-for="rightxSjJzl{{el.infocode}}" class="labWrp">
                            <input ms-attr-id="rightxSjJzl{{el.infocode}}" type="checkbox" ms-attr-checked="el.checked" ms-click="radioclick('rightxSjJzl',$index)" />
                            <span class="content_span">{{el.info}}</span>
                        </label>
                        <input class="hidden" type="text" ms-duplex-string="systemtMsg.rightxSjJzl" name="hspSjxtpgInfCustom.rightxSjJzl">
                    </li>
                    <li>
                        <label class="titlelab">备注：</label>
                        <input class="remarkInput" type="text" name="hspSjxtpgInfCustom.sjxtpgMemo" ms-duplex-string="systemtMsg.sjxtpgMemo" maxlength="120">
                    </li>
                </ul>
            </div>
        </div>
    </div>
</body>
