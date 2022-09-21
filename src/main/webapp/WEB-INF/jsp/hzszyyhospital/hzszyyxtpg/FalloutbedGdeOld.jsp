<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/base/tag.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
</head>

<body>
    <div class="panelGde" ms-if=" aboutzcdd.zcddFlg == '1'">
        <div class="FalloutbedBlock panelBlock">
            <div class="tabtop floatLeft">
              <span class="title">坠床跌倒评分</span>
              <span class="isFinish" ms-visible="aboutzcdd.zcddFlg===0||aboutzcdd.zcddFlg==='0'">未评分</span>
              <span class="scoSpn" ms-visible="aboutzcdd.zcddFlg!=0||aboutzcdd.zcddFlg==''">{{aboutzcdd.zcddexpfSco}}分</span>  
            </div>
            <span ms-click="toggleBox('zcddFlag','zcddMsg','aboutzcdd')"  class="edit">
                <img src="../images/hzszyyhems/nurse/edit.png">
                <span>{{aboutzcdd.zcddMsg}}</span>
            </span>        
        </div>
        <div class="FalloutbedContent panelContent" ms-visible="aboutzcdd.zcddFlag===1||aboutzcdd.zcddFlag==='1'">
            <ul>
                <li>
                    <label for="zcddexpfYnbmdd">
                        <input id="zcddexpfYnbmdd" type="checkbox" ms-attr-checked="aboutzcdd.zcddexpfYnbmdd==1" ms-click="toggleHspFzjcCustom('zcddexpfYnbmdd',1,'aboutzcdd')"> 最近1年不明原因跌倒（1分）
                    </label>
                    <input class="hidden" type="text" name="hspZcddexpfInfCustom.zcddexpfYnbmdd" ms-duplex-string="aboutzcdd.zcddexpfYnbmdd">
                </li>
                <li>
                    <label for="zcddexpfYsza">
                        <input id="zcddexpfYsza" type="checkbox" ms-attr-checked="aboutzcdd.zcddexpfYsza==1" ms-click="toggleHspFzjcCustom('zcddexpfYsza',1,'aboutzcdd')"> 意识障碍（1分）
                    </label>
                    <input class="hidden" type="text" name="hspZcddexpfInfCustom.zcddexpfYsza" ms-duplex-string="aboutzcdd.zcddexpfYsza">
                </li>
                <li>
                    <label for="zcddexpfSlza">
                        <input id="zcddexpfSlza" type="checkbox" ms-attr-checked="aboutzcdd.zcddexpfSlza==1" ms-click="toggleHspFzjcCustom('zcddexpfSlza',1,'aboutzcdd')"> 视力障碍（单盲、双盲、弱视、白内障、青光眼、眼底病、复视）（1分）
                    </label>
                    <input class="hidden" type="text" name="hspZcddexpfInfCustom.zcddexpfSlza" ms-duplex-string="aboutzcdd.zcddexpfSlza">
                </li>
                <li>
                    <label for="zcddexpfHdza">
                        <input id="zcddexpfHdza" type="checkbox" ms-attr-checked="aboutzcdd.zcddexpfHdza==3" ms-click="toggleHspFzjcCustom('zcddexpfHdza',3,'aboutzcdd')"> 活动障碍、肢体偏瘫（3分）
                    </label>
                    <input class="hidden" type="text" name="hspZcddexpfInfCustom.zcddexpfHdza" ms-duplex-string="aboutzcdd.zcddexpfHdza">
                </li>
                <li>
                    <label for="zcddexpfNl">
                        <input id="zcddexpfNl" type="checkbox" ms-attr-checked="aboutzcdd.zcddexpfNl==1" ms-click="toggleHspFzjcCustom('zcddexpfNl',1,'aboutzcdd')"> 年龄（》65岁）（1分）
                    </label>
                    <input class="hidden" type="text" name="hspZcddexpfInfCustom.zcddexpfNl" ms-duplex-string="aboutzcdd.zcddexpfNl">
                </li>
                <li>
                    <label for="zcddexpfTnxr">
                        <input id="zcddexpfTnxr" type="checkbox" ms-attr-checked="aboutzcdd.zcddexpfTnxr==3" ms-click="toggleHspFzjcCustom('zcddexpfTnxr',3,'aboutzcdd')"> 体能虚弱（生活能力部分自理，白天过半时间要卧床或坐椅）（3分）
                    </label>
                    <input class="hidden" type="text" name="hspZcddexpfInfCustom.zcddexpfTnxr" ms-duplex-string="aboutzcdd.zcddexpfTnxr">
                </li>
                <li>
                    <label for="zcddexpfTyxy">
                        <input id="zcddexpfTyxy" type="checkbox" ms-attr-checked="aboutzcdd.zcddexpfTyxy==2" ms-click="toggleHspFzjcCustom('zcddexpfTyxy',2,'aboutzcdd')"> 头晕、眩晕、体位性低血压（2分）
                    </label>
                    <input class="hidden" type="text" name="hspZcddexpfInfCustom.zcddexpfTyxy" ms-duplex-string="aboutzcdd.zcddexpfTyxy">
                </li>
                <li>
                    <label for="zcddexpfZyywjr">
                        <input id="zcddexpfZyywjr" type="checkbox" ms-attr-checked="aboutzcdd.zcddexpfZyywjr==1" ms-click="toggleHspFzjcCustom('zcddexpfZyywjr',1,'aboutzcdd')"> 服用影响意识和活动的药物（散瞳剂、镇静安眠药、降糖药、降压利尿剂、阵挛抗癫剂、麻醉止痛剂）（1分）
                    </label>
                    <input class="hidden" type="text" name="hspZcddexpfInfCustom.zcddexpfZyywjr" ms-duplex-string="aboutzcdd.zcddexpfZyywjr">
                </li>
                <li>
                    <label for="zcddexpfJrpb">
                        <input id="zcddexpfJrpb" type="checkbox" ms-attr-checked="aboutzcdd.zcddexpfJrpb==1" ms-click="toggleHspFzjcCustom('zcddexpfJrpb',1,'aboutzcdd')"> 住院中无家人和其他人员陪伴（1分）
                    </label>
                    <input class="hidden" type="text" name="hspZcddexpfInfCustom.zcddexpfJrpb" ms-duplex-string="aboutzcdd.zcddexpfJrpb">
                </li>
                <li>
                    <label for="zcddexpfMy">
                        <input id="zcddexpfMy" type="checkbox" ms-attr-checked="aboutzcdd.zcddexpfMy==1" ms-click="toggleHspFzjcCustom('zcddexpfMy',1,'aboutzcdd')"> 无（0分）
                    </label>
                    <input class="hidden" type="text" name="hspZcddexpfInfCustom.zcddexpfMy" ms-duplex-string="aboutzcdd.zcddexpfMy">
                </li>
                <li class="lastli">
                    总分：{{aboutzcdd.zcddexpfSco}}
                    <input type="hidden" name="hspZcddexpfInfCustom.zcddexpfSco" ms-duplex-string="aboutzcdd.zcddexpfSco">
                </li>
            </ul>
        </div>
    </div>
</body>
