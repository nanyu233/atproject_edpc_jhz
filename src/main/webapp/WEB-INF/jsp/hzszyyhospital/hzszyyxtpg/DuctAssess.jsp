<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/base/tag.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
</head>

<body>
    <div class="panelGde DuctGde">
        <div class="panelBlock adlBlock">
            <div class="tabtop floatLeft">
              <span class="title">导管评估</span>  
              <span class="scoSpn" ms-visible="systemtMsg.dgpgFlg==1 && systemtMsg.xtpgDgFlg != '0'">已完成</span>
              <span class="isFinish"  ms-visible="(systemtMsg.dgpgFlg===0||systemtMsg.dgpgFlg==='0') && systemtMsg.xtpgDgFlg != '0'">未完成</span> 
              <span class="scoSpn" ms-visible="systemtMsg.xtpgDgFlg == '0'">无</span>   
            </div>
            <span ms-click="toggleBox('ductFlag','ductMsg','systemtMsg')" class="edit">
                <img src="../images/hzszyyhems/nurse/edit.png">
                <span>{{systemtMsg.ductMsg}}</span>
            </span>        
        </div>
        <div class="panelContent ductContent" ms-visible="systemtMsg.ductFlag===1||systemtMsg.ductFlag==='1'">
            <div class="wrapperShadow">
                <label for="xtpgDgFlgF" class="entirelab">
                    <input id="xtpgDgFlgF" type="checkbox" ms-attr-checked="systemtMsg.xtpgDgFlg==='0'||systemtMsg.xtpgDgFlg ===0" ms-click="toggleHspFzjcCustom('xtpgDgFlg','0','systemtMsg')"> 无
                </label>
                <input class="hidden" type="text" name="hspXtpgInfCustom.xtpgDgFlg" ms-duplex-string="systemtMsg.xtpgDgFlg">
                <div class="hiddenPanel" ms-visible="systemtMsg.xtpgDgFlg != '0'">
                    <label for="dgpgJmdgFlg" class="entirelab">
                        <input id="dgpgJmdgFlg" type="checkbox" ms-attr-checked="systemtMsg.dgpgJmdgFlg==1" ms-click="toggleHspFzjcCustom('dgpgJmdgFlg',1,'systemtMsg')"> 静脉导管
                        <input class="hidden" type="text" name="hspDgpgInfCustom.dgpgJmdgFlg" ms-duplex-string="systemtMsg.dgpgJmdgFlg">
                    </label>
                    <ul ms-visible="systemtMsg.dgpgJmdgFlg==1" id="ulDivSel">
                        <li>
                            <label class="titlelab">外周静脉：</label>
                            <label ms-repeat="systemList.wzjmTcFlgList" ms-attr-for="wzjmTcFlg{{el.infocode}}" class="labWrp">
                                <input ms-attr-id="wzjmTcFlg{{el.infocode}}" type="checkbox" ms-attr-checked="el.checked" ms-click="radioclick('wzjmTcFlg',$index)" />
                                <span class="content_span">{{el.info}}</span>
                            </label>
                            <label for="wzjmGdt" class="labWrp colorSix">
                                <input id="wzjmGdt" type="checkbox" ms-attr-checked="systemtMsg.wzjmGdt==1" ms-click="toggleHspFzjcCustom('wzjmGdt',1,'systemtMsg')"> 固定妥，局部无红肿，无渗出
                                <input class="hidden" type="text" name="hspDgpgInfCustom.wzjmGdt" ms-duplex-string="systemtMsg.wzjmGdt">
                            </label>
                            <input class="hidden" type="text" name="hspDgpgInfCustom.wzjmTcFlg" ms-duplex-string="systemtMsg.wzjmTcFlg">
                            <span class="content_span labWrp">
                                接微泵用药： <input type="text" name="hspDgpgInfCustom.wzjmJwbyy" ms-duplex-string="systemtMsg.wzjmJwbyy" class="inputLth" maxlength="20"> 
                            </span>
                            <span class="content_span labWrp">
                                速度： <input type="text" name="hspDgpgInfCustom.wzjmSd" ms-duplex-string="systemtMsg.wzjmSd" class="inputLth" maxlength="20"> 
                            </span>
                        </li>
                        <li>
                            <label class="titlelab">感染迹象：</label>
                            <label ms-repeat="systemList.wzjmGrjxFlgList" ms-attr-for="wzjmGrjxFlg{{el.infocode}}" class="labWrp">
                                <input ms-attr-id="wzjmGrjxFlg{{el.infocode}}" type="checkbox" ms-attr-checked="el.checked" ms-click="radioclick('wzjmGrjxFlg',$index)" />
                                <span class="content_span">{{el.info}}</span>
                            </label>
                            <input class="hidden" type="text" name="hspDgpgInfCustom.wzjmGrjxFlg" ms-duplex-string="systemtMsg.wzjmGrjxFlg">
                            <span class="content_span">
                                是否拔管：
                            </span>
                            <label ms-repeat="systemList.wzjmSfbgFlgList" ms-attr-for="wzjmSfbgFlg{{el.infocode}}" class="labWrp">
                                <input ms-attr-id="wzjmSfbgFlg{{el.infocode}}" type="checkbox" ms-attr-checked="el.checked" ms-click="radioclick('wzjmSfbgFlg',$index)" />
                                <span class="content_span">{{el.info}}</span>
                            </label>
                            <input class="hidden" type="text" name="hspDgpgInfCustom.wzjmSfbgFlg" ms-duplex-string="systemtMsg.wzjmSfbgFlg">
                            <span class="content_span labWrp">
                                备注：<input type="text" name="hspDgpgInfCustom.wzjmMemo" ms-duplex-string="systemtMsg.wzjmMemo" class="inputLth" maxlength="120"> 
                            </span>
                        </li>
                        <li>
                            <label class="titlelab">CVC：</label>
                            <div class="ductDiv">
                                <span class="content_span labWrp">
                                    穿刺途径：
                                    <select name="hspDgpgInfCustom.cvcDgpgCctjCod" ms-duplex-string="systemtMsg.cvcDgpgCctjCod">
                                        <option value=""></option>
                                        <option ms-repeat="systemList.cvcDgpgCctjCodList" ms-attr-value="el.infocode">{{el.info}}</option>
                                    </select>
                                </span>
                                <span class="content_span labWrp">
                                    导管型号：
                                    <select name="hspDgpgInfCustom.cvcDgxhCod" ms-duplex-string="systemtMsg.cvcDgxhCod">
                                        <option value=""></option>
                                        <option ms-repeat="systemList.cvcDgxhCodList" ms-attr-value="el.infocode">{{el.info}}</option>
                                    </select>
                                </span>
                                <span class="content_span labWrp">
                                    置管深度：<input type="text" name="hspDgpgInfCustom.cvcZgsd" ms-duplex-string="systemtMsg.cvcZgsd" class="inputLth" ms-keyup="onlyNum('cvcZgsd',2,99.99)"> cm
                                </span><br/>
                                <span class="content_span">接微泵用药：</span>
                                <input type="text" name="hspDgpgInfCustom.cvcJwbyy" ms-duplex-string="systemtMsg.cvcJwbyy" class="inputLth labWrp" maxlength="20"> 
                                <span class="content_span labWrp">
                                    速度：<input type="text" name="hspDgpgInfCustom.cvcJwbyySd" ms-duplex-string="systemtMsg.cvcJwbyySd" class="inputLth" maxlength="20">
                                </span>
                                <span class="content_span">感染迹象：</span>
                                <label ms-repeat="systemList.cvcGrjxFlgList" ms-attr-for="cvcGrjxFlg{{el.infocode}}" class="labWrp">
                                    <input ms-attr-id="cvcGrjxFlg{{el.infocode}}" type="checkbox" ms-attr-checked="el.checked" ms-click="radioclick('cvcGrjxFlg',$index)" />
                                    <span class="content_span">{{el.info}}</span>
                                </label>
                                <input class="hidden" type="text" name="hspDgpgInfCustom.cvcGrjxFlg" ms-duplex-string="systemtMsg.cvcGrjxFlg">
                                <span class="content_span labWrp">
                                    换药：
                                    <label ms-repeat="systemList.cvcHyFlgList" ms-attr-for="cvcHyFlg{{el.infocode}}" class="labWrp">
                                        <input ms-attr-id="cvcHyFlg{{el.infocode}}" type="checkbox" ms-attr-checked="el.checked" ms-click="radioclick('cvcHyFlg',$index)" />
                                        <span class="content_span">{{el.info}}</span>
                                    </label>
                                    <input class="hidden" type="text" name="hspDgpgInfCustom.cvcHyFlg" ms-duplex-string="systemtMsg.cvcHyFlg">
                                </span>
                                <span class="content_span labWrp">
                                    备注：<input type="text" name="hspDgpgInfCustom.cvcMemo" ms-duplex-string="systemtMsg.cvcMemo" class="inputLth" maxlength="120">
                                </span>
                            </div>
                        </li>
                        <li>
                            <label class="titlelab">PICC：</label>
                            <span class="content_span labWrp">
                                导管型号：
                                <select name="hspDgpgInfCustom.piccDgxh" ms-duplex-string="systemtMsg.piccDgxh" class="labWrp">
                                    <option value=""></option>
                                    <option ms-repeat="systemList.piccDgxhList" ms-attr-value="el.infocode">{{el.info}}</option>
                                </select>
                            </span>
                            <span class="content_span labWrp">
                                内置：<input type="text" name="hspDgpgInfCustom.piccDgxhNz" ms-duplex-string="systemtMsg.piccDgxhNz" class="inputLth" ms-keyup="onlyNum('piccDgxhNz',2,99.99)"> cm
                            </span>
                            <span class="content_span labWrp">
                                外置：<input type="text" name="hspDgpgInfCustom.piccDgxhWz" ms-duplex-string="systemtMsg.piccDgxhWz" class="inputLth" ms-keyup="onlyNum('piccDgxhWz',2,99.99)"> cm
                            </span>
                        </li>
                        <li>
                            <label class="titlelab">输液港：</label>
                            <div class="ductDiv">
                                <span class="content_span labWrp">
                                    穿刺途径：
                                    <select name="hspDgpgInfCustom.sygDgpgCctjCod" ms-duplex-string="systemtMsg.sygDgpgCctjCod">
                                        <option value=""></option>
                                        <option ms-repeat="systemList.sygDgpgCctjCodList" ms-attr-value="el.infocode">{{el.info}}</option>
                                    </select>
                                </span>
                                <span class="content_span">
                                    通畅：
                                    <label ms-repeat="systemList.sygCctjTcFlgList" ms-attr-for="sygCctjTcFlg{{el.infocode}}" class="labWrp">
                                        <input ms-attr-id="sygCctjTcFlg{{el.infocode}}" type="checkbox" ms-attr-checked="el.checked" ms-click="radioclick('sygCctjTcFlg',$index)" />
                                        <span class="content_span">{{el.info}}</span>
                                    </label>
                                    <input class="hidden" type="text" name="hspDgpgInfCustom.sygCctjTcFlg" ms-duplex-string="systemtMsg.sygCctjTcFlg">
                                </span>
                                <span class="content_span labWrp">
                                    接泵微用药：<input type="text" name="hspDgpgInfCustom.sygJwbyy" ms-duplex-string="systemtMsg.sygJwbyy" class="inputLth" maxlength="20">
                                </span>
                                <span class="content_span labWrp">
                                    速度：<input type="text" name="hspDgpgInfCustom.sygSd" ms-duplex-string="systemtMsg.sygSd" class="inputLth" maxlength="20">
                                </span>
                                <span class="content_span">感染迹象：</span>
                                <label ms-repeat="systemList.sygGrjxFlgList" ms-attr-for="sygGrjxFlg{{el.infocode}}" class="labWrp">
                                    <input ms-attr-id="sygGrjxFlg{{el.infocode}}" type="checkbox" ms-attr-checked="el.checked" ms-click="radioclick('sygGrjxFlg',$index)" />
                                    <span class="content_span">{{el.info}}</span>
                                </label>
                                <input class="hidden" type="text" name="hspDgpgInfCustom.sygGrjxFlg" ms-duplex-string="systemtMsg.sygGrjxFlg">
                                <br/>
                                <span class="content_span">蝶形针穿刺：</span>
                                <label ms-repeat="systemList.sygDxzccFlgList" ms-attr-for="sygDxzccFlg{{el.infocode}}" class="labWrp">
                                    <input ms-attr-id="sygDxzccFlg{{el.infocode}}" type="checkbox" ms-attr-checked="el.checked" ms-click="radioclick('sygDxzccFlg',$index)" />
                                    <span class="content_span">{{el.info}}</span>
                                </label>
                                <input class="hidden" type="text" name="hspDgpgInfCustom.sygDxzccFlg" ms-duplex-string="systemtMsg.sygDxzccFlg">
                                <span class="content_span labWrp">
                                    是否拔蝶形针：
                                    <label ms-repeat="systemList.sygBdxzFlgList" ms-attr-for="sygBdxzFlg{{el.infocode}}" class="labWrp">
                                        <input ms-attr-id="sygBdxzFlg{{el.infocode}}" type="checkbox" ms-attr-checked="el.checked" ms-click="radioclick('sygBdxzFlg',$index)" />
                                        <span class="content_span">{{el.info}}</span>
                                    </label>
                                </span>
                                <input type="text" name="hspDgpgInfCustom.sygBdxzFlg" ms-duplex-string="systemtMsg.sygBdxzFlg" class="hidden">
                                <span class="content_span labWrp">
                                    其他：<input type="text" name="hspDgpgInfCustom.sygQt" ms-duplex-string="systemtMsg.sygQt" class="inputLth" maxlength="40">
                                </span>
                            </div>
                        </li>
                    </ul>
                    <label for="dgpgYlgFlg" class="entirelab">
                        <input id="dgpgYlgFlg" type="checkbox" ms-attr-checked="systemtMsg.dgpgYlgFlg==1" ms-click="toggleHspFzjcCustom('dgpgYlgFlg',1,'systemtMsg')"> 引流管
                        <input class="hidden" type="text" name="hspDgpgInfCustom.dgpgYlgFlg" ms-duplex-string="systemtMsg.dgpgYlgFlg">
                    </label>
                    <ul ms-visible="systemtMsg.dgpgYlgFlg==1" id="ductul">
                        <li id = "objli">
                            <table class="ducttable" id="ducttable">
                                <tr>
                                    <!-- <td>
                                        <label class="titlelab">导管名称：</label>
                                        <select id="addA0" class="labWrp selWth" ms-duplex-string="systemtMsg.ylgDgmcCod">
                                            <option value="">请选择</option>
                                            <option ms-repeat="systemList.ylgDgmcCodList" ms-attr-value="el.infocode">{{el.info}}</option>
                                        </select>
                                    </td> -->
                                    <td>
                                        <label class="titlelab">导管名称：</label>
                                        <input type="text" id="addA0" readonly="readonly" onclick="selecDuct()" class="labWrp selWth" ms-duplex-string="systemtMsg.ylgDgmcCod">
                                    </td>
                                    <td>
                                        <span class="content_span labWrp">
                                            导管深度： <input type="text" id="addB0" name="hspDgpgInfCustom.ylgDgsd" ms-duplex-string="systemtMsg.ylgDgsd" class="inputLth" ms-keyup="onlyNum('ylgDgsd',2,99.99)"> cm
                                        </span>                                
                                    </td>
                                    <td>
                                        <span class="content_span labWrp">通畅：
                                            <select id="addC0" class="labWrp" ms-duplex-string="systemtMsg.ylgTcFlg">
                                                <option value="">请选择</option>
                                                <option ms-repeat="systemList.ylgTcFlgList" ms-attr-value="el.infocode">{{el.info}}</option>
                                            </select>
                                        </span>
                                    </td>
                                    <td>
                                        <span class="content_span labWrp">
                                            引流液颜色： <input type="text" id="addD0" name="hspDgpgInfCustom.ylgYlyys" ms-duplex-string="systemtMsg.ylgYlyys" class="inputLth" maxlength="20"> 
                                        </span>
                                        <img width="16" height="16" src="${baseurl}images/hzszyyhems/note/3.png" alt="新增" onclick="addNewtr('addA','addB','addC','addD','ducttable')"/>&emsp;
                                        <img width="16" height="16" src="${baseurl}images/hzszyyhems/note/1.png" alt="删除" onclick="delThistr('ducttable')"/>
                                    </td>
                                </tr>
                            </table>
                        </li>
                        <li>
                            <label class="titlelab">感染迹象：</label>
                            <select name="hspDgpgInfCustom.ylgGrjxFlg" ms-duplex-string="systemtMsg.ylgGrjxFlg" class="selRight">
                                <option value="">请选择</option>
                                <option ms-repeat="systemList.ylgGrjxFlgList" ms-attr-value="el.infocode">{{el.info}}</option>
                            </select>
                            <span class="content_span">
                                &emsp;&emsp;拔管：
                            </span>
                            <select name="hspDgpgInfCustom.ylgBgFlg" ms-duplex-string="systemtMsg.ylgBgFlg">
                                <option value="">请选择</option>
                                <option ms-repeat="systemList.ylgBgFlgList" ms-attr-value="el.infocode">{{el.info}}</option>
                            </select>
                        </li>
                        <input class="hidden" type="text" name="hspDgpgInfCustom.ylgDg" id="hideylgDgmcCod">
                    </ul>
                    <label for="dgpgQtFlg" class="entirelab">
                        <input id="dgpgQtFlg" type="checkbox" ms-attr-checked="systemtMsg.dgpgQtFlg==1" ms-click="toggleHspFzjcCustom('dgpgQtFlg',1,'systemtMsg')"> 其他
                        <input class="hidden" type="text" name="hspDgpgInfCustom.dgpgQtFlg" ms-duplex-string="systemtMsg.dgpgQtFlg">
                    </label>
                    <ul ms-visible="systemtMsg.dgpgQtFlg==1" id="ductul">
                        <li id = "objliA">
                            <table class="ducttable" id="ducttableA">
                                <tr>
                                    <td>
                                        <label class="titlelab">导管名称：</label>
                                        <input type="text" id="addE0" class="labWrp selWth" ms-duplex-string="systemtMsg.ylgDgmcCodA">
                                    </td>
                                    <td>
                                        <span class="content_span labWrp">
                                            导管深度： <input type="text" id="addF0" ms-duplex-string="systemtMsg.ylgDgsdA" class="inputLth" ms-keyup="onlyNum('ylgDgsdA',2,99.99)"> cm
                                        </span>                                
                                    </td>
                                    <td>
                                        <span class="content_span labWrp">通畅：
                                            <select id="addG0" class="labWrp" ms-duplex-string="systemtMsg.ylgTcFlgA">
                                                <option value="">请选择</option>
                                                <option ms-repeat="systemList.ylgTcFlgAList" ms-attr-value="el.infocode">{{el.info}}</option>
                                            </select>
                                        </span>
                                    </td>
                                    <td>
                                        <span class="content_span labWrp">
                                            引流液颜色： <input type="text" id="addH0" ms-duplex-string="systemtMsg.ylgYlyysA" class="inputLth" maxlength="20"> 
                                        </span>
                                        <img width="16" height="16" src="${baseurl}images/hzszyyhems/note/3.png" alt="新增" onclick="addNewtr('addE','addF','addG','addH','ducttableA')"/>&emsp;
                                        <img width="16" height="16" src="${baseurl}images/hzszyyhems/note/1.png" alt="删除" onclick="delThistr('ducttableA')"/>
                                    </td>
                                </tr>
                            </table>
                        </li>
                        <li>
                            <label class="titlelab">感染迹象：</label>
                            <select name="hspDgpgInfCustom.qtGrjxFlg" ms-duplex-string="systemtMsg.qtGrjxFlg" class="selRight">
                                <option value="">请选择</option>
                                <option ms-repeat="systemList.qtGrjxFlgList" ms-attr-value="el.infocode">{{el.info}}</option>
                            </select>
                            <span class="content_span">
                                &emsp;&emsp;拔管：
                            </span>
                            <select name="hspDgpgInfCustom.qtBgFlg" ms-duplex-string="systemtMsg.qtBgFlg">
                                <option value="">请选择</option>
                                <option ms-repeat="systemList.qtBgFlgList" ms-attr-value="el.infocode">{{el.info}}</option>
                            </select>
                        </li>
                        <input class="hidden" type="text" name="hspDgpgInfCustom.qtDg" id="hideylgDgmcCodA">
                    </ul>
                </div>
            </div>
        </div>
    </div>
    <script type="text/javascript" charset="utf-8">
        //选择导管名称
        function selecDuct() {
           createmodalwindow("导管名称", 450, 385, '${baseurl}zyyxtpg/queryduct.do');
        }

        function addNewtr(idname,idname2,idname3,idname4,tbname){
            var tb = document.getElementById(tbname);
            var q = tb.rows.length;

            var p = q-1;
            var lastvalue = document.getElementById(idname+p).value;
            if(lastvalue == ""||lastvalue == null){
               publicFun.alert("导管名称为空！");
            }else{
                var newTr = tb.insertRow(tb.rows.length);//添加新行，trIndex就是要添加的位置
                var newTd1 = newTr.insertCell();
                if(tbname == 'ducttable'){
                    newTd1.innerHTML+= "<td><label class='titlelab'>导管名称：</label> <input type='text' id='"+idname+q+"'  readonly='readonly' class='labWrp selWth'></td>";
                }else{
                    newTd1.innerHTML+= "<td><label class='titlelab'>导管名称：</label> <input type='text' id='"+idname+q+"' class='labWrp selWth'></td>";
                }

                var newTd2 = newTr.insertCell();
                newTd2.innerHTML = "<td><span class='content_span labWrp'>导管深度： <input type='text' id='"+idname2+q+"' class='inputLth' keyup='num()'> cm</span> </td>";

                var newTd3 = newTr.insertCell();
                newTd3.innerHTML = "<td><span class='content_span labWrp'>通畅："+" "+"<select id='"+idname3+q+"' class='labWrp'><option value=''>请选择</option></select></span></td>";
                var clrlListB = vm.systemList.ylgTcFlgList;
                //var clrlListB = JSON.parse(JSON.stringify(vm.systemList.ylgTcFlgList));
                for(var i = 0;i<clrlListB.length;i++){
                    $("#"+idname3+q+"").append("<option value='"+clrlListB[i].infocode+"'>"+clrlListB[i].info+"</option>");
                }

                var newTd4 = newTr.insertCell();
                newTd4.innerHTML = "<td><span class='content_span labWrp'>引流液颜色： <input type='text' id='"+idname4+q+"' class='inputLth' maxlength='20'></span> </td>";

                if(tbname == 'ducttable'){
                    $("#"+idname+q+"").click(function(){
                        createmodalwindow("导管名称", 450, 385, '${baseurl}zyyxtpg/queryduct.do');
                    })
                }

                $("#"+idname2+q+"").keyup(function(){
                    var val = $(this).val();
                    if($(this).val() > 99.99) {
                        var length = val.length;
                        val = val.substring(0, length - 1);
                    }
                    val = val.replace(/[^\d.]/g, "").replace(/^\./g, "").replace(/\.{2,}/g, "").replace(".", "$#$").replace(/\./g, "").replace("$#$", ".");
                    var testStr = $(this).val(),
                        testStrList = testStr.split(".");
                    if (testStrList.length > 1) {
                        if (testStrList[1].length > 2) {
                            val = parseFloat(testStr).toFixed(parseInt(2)).toString();
                        }
                    }
                    $(this).val(val);
                });
            }
        }

        function delThistr(tbName){
            var obj = document.getElementById(tbName);
            if(obj.rows.length != 1){
                obj.deleteRow((obj.rows.length-1));
            }else{
                publicFun.alert("第一行不可删！");
            }           
        }
    
    </script>
</body>
