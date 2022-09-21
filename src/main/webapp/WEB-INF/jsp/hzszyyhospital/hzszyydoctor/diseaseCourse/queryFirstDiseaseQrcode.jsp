<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/base/tag.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
        <title>首次病程</title>
        <%@ include file="/WEB-INF/jsp/base/common_css.jsp"%>
        <link rel="stylesheet" type="text/css" href="${baseurl}css/hzszyyhems/hzszyydoctor/diseasecourse.css">
        <%@ include file="/WEB-INF/jsp/base/common_js.jsp"%>
        <script language="javascript" src="${baseurl}Lodop6.216/LodopFuncs.js"></script>
        <script type="text/javascript" src="${baseurl}lib/qrcode/qrcode.js"></script>
    </head>
    <body>
        <form id="firstform" action="${baseurl}diseaseCourse/addOrEditFirstSubmit.do" method="post">
            <div>
                <div class="all-title">
                    首次病程记录
                </div>
                <ul class="middleul">
                    <li class="infoli">
                        姓名：
                        <input class="titleinput" readonly="readonly" value="${hspemginfCustom.cstNam}"/>&emsp;
                        性别：
                        <input class="titleinput" readonly="readonly" value="${hspemginfCustom.cstSexCod}"/>&emsp;
                        年龄：
                        <input class="titleinput" readonly="readonly" value="${hspemginfCustom.cstAge}"/>&emsp;
                        科别：
                        <input class="titleinput" readonly="readonly" value="${hspemginfCustom.emgFkCod}"/>&emsp;
                        病历号：
                        <input class="titleinput" readonly="readonly" value="${hspemginfCustom.mpi}"/>&emsp;
                        留观号：
                        <input class="titleinput" type="text" value="${hspemginfCustom.observationCode}" name="observationCode" maxlength="10"/>&emsp;
                        <input type="hidden" name="hspDiseaseCourseCustom.emgSeqDc" value="${hspemginfCustom.emgSeq}"/>
                        <input type="hidden" name="hspDiseaseCourseCustom.courseType" value="1"/>
                        <input type="hidden" name="hspDiseaseCourseCustom.diseaseCourseSeq" value="${hspDiseaseCourseCustom.diseaseCourseSeq}"/>
                    </li>
                    <li>
                        <p class="subtitle">
                            <span class="span-left">一、病例特点</span>
                        </p>
                    </li>
                    <li>
                        <textarea class="progressarea" name="hspDiseaseCourseCustom.diseasePoint">${hspDiseaseCourseCustom.diseasePoint}</textarea>
                    </li>
                    <li>
                        <p class="subtitle">
                            <span class="span-left">二、初步诊断</span>
                        </p>
                    </li>
                    <li class="infoli">
                        <span class="ptitle"><a class="my-linkbutton btna" data-options="toggle:true,plain:true" onclick="adddiagnosis(1)">[录入]</a>中医</span>
                        <div class="progressinput areareadonly" id="show_text1">${hspemginfCustom.ryzdXy}</div>
                        <input class="hidden" id="jbzdSeq1" type="text" value="${hspJbzdInfCustom1.jbzdSeq}" />
                        <input class="hidden" id="jbzdDes1" type="text" name="ryzdZyDes" value="${hspemginfCustom.ryzdXy}" />
                        <input class="hidden" id="jbzdComm1" type="text" name="ryzdZy" value="${hspJbzdInfCustom1.jbzdComm}" />
                        <div class="hidden" id="bz_id1">
                            <c:forEach items="${hspJbzdInfCustomList1}" var="value">
                                <label>
                                    <input class="hzzdCod-id1" type="checkbox" name="ryzdZyList" value="${value.hzzdCod}" checked="checked" />
                                    <span class="hzzdCod-name1">${value.hzzdCodname}</span>
                                </label>
                            </c:forEach>
                        </div> 
                    </li>
                    <li class="infoli">
                        <span class="ptitle"><a class="my-linkbutton btna" data-options="toggle:true,plain:true" onclick="adddiagnosis(2)">[录入]</a>西医</span>
                        <div class="progressinput areareadonly" id="show_text2">${hspemginfCustom.jbzdDes}</div>
                        <input class="hidden" id="jbzdSeq2" type="text" value="${hspJbzdInfCustom2.jbzdSeq}" />
                        <input class="hidden" id="jbzdDes2" type="text" name="ryzdXyDes" value="${hspemginfCustom.jbzdDes}" />
                        <input class="hidden" id="jbzdComm2" type="text" name="ryzdXy" value="${hspJbzdInfCustom2.jbzdComm}" />
                        <div class="hidden" id="bz_id2">
                            <c:forEach items="${hspJbzdInfCustomList2}" var="value">
                                <label>
                                    <input class="hzzdCod-id2" type="checkbox" name="ryzdXyList" value="${value.hzzdCod}" checked="checked" />
                                    <span class="hzzdCod-name2">${value.hzzdCodname}</span>
                                </label>
                            </c:forEach>
                        </div>
                    </li>
                    <li>
                        <p class="subtitle">
                            <span class="span-left">三、诊疗计划</span>
                        </p>
                    </li>
                    <li>
                        <textarea class="progressarea" name="hspDiseaseCourseCustom.treatmentPlan">${hspDiseaseCourseCustom.treatmentPlan}</textarea>
                    </li>
                    <li class="rightli">
                        医师签名
                        <input class="baseinput" readonly="readonly" id="docname"/>
                        &emsp;&emsp;日期
                        <input id="coursedate" class="inputlong Wdate spcWdate" type="text"  name="hspDiseaseCourseCustom.courseDate" onclick="WdatePicker({dateFmt:'yyyy/MM/dd HH:mm:ss'})">
                    </li>
                    <li>
                    	<input id="text" type="text" value="11111" style="width:80%" /><br />
						<div id="qrcode" style="width:100px; height:100px; margin-top:15px;"></div>
                    </li>
                </ul>
            </div>
        </form>
        <jsp:include page="/WEB-INF/jsp/hzszyyhospital/hzszyydoctor/diseaseCourse/printFirstQrcode.jsp"></jsp:include>
        <script type="text/javascript">
        var qrcode = new QRCode(document.getElementById("qrcode"), {
        	width : 100,
        	height : 100
        });

        function makeCode () {
        	var elText = $('#text');
        	var qrcodeVal = null;
        	if (!elText.val()) {
        		alert("Input a text");
        		elText.focus();
        		return;
        	}else{
        		if(elText.val()==1){
        			var emgInf = {"emgSeq":"预检号","cstNam":"病人姓名","emgFkCod":"就诊科室","emgDepCod":"分级"};
        			qrcodeVal = JSON.stringify(emgInf); 
        		}else{
        			qrcodeVal = elText.val();
        		}
        	}
        	qrcode.makeCode(qrcodeVal);
        }

        makeCode();

        $("#text").
        	on("blur", function () {
        		makeCode();
        	}).
        	on("keydown", function (e) {
        		if (e.keyCode == 13) {
        			makeCode();
        		}
        	});
        
        
        
        function adddiagnosis(num){
            createmodalwindow("初步诊断", 600, 385, '${baseurl}zyylqbl/querylr.do?trnumber='+num, 'no');
        }

        function setChildBrost() {
            var length = $("#bz_id1").children("label").length;
            var hzzdCod = [],hzzdCodname = [];
            for (var i = 0; i < length; i++) {
                hzzdCod.push($(".hzzdCod-id1").eq(i).val());
                hzzdCodname.push($(".hzzdCod-name1").eq(i).text())
            }
            $("#jbzdSeq1").val(hzzdCod.join(","))
            $("#jbzdDes1").val(hzzdCodname.join(";"))

            var length2 = $("#bz_id2").children("label").length;
            var hzzdCod2 = [],hzzdCodname2 = [];
            for (var i = 0; i < length2; i++) {
                hzzdCod2.push($(".hzzdCod-id2").eq(i).val());
                hzzdCodname2.push($(".hzzdCod-name2").eq(i).text())
            }
            $("#jbzdSeq2").val(hzzdCod2.join(","))
            $("#jbzdDes2").val(hzzdCodname2.join(";"))
        }
        
        function insertuser_callback(data) {
            message_alert(data);
            setTimeout(function() {
                window.location.reload();
            }, 800)
        }

        function saveForm(){
            jquerySubByFId('firstform', insertuser_callback, null, "json");
        }

        $(document).keydown(function(event) {
            switch (event.keyCode) {
                case 18:
                    event.preventDefault();
                case 116:
                    event.preventDefault();
                case 122:
                    event.preventDefault();
            }
        });

        $(function(){
            setChildBrost();
            var docname = '${hspDiseaseCourseCustom.createNam}';
            if(docname == ''|| docname == null){
                $('#docname').val('${activeUser.usrname}');
            }else{
                $('#docname').val(docname);
            }

            var newtime = '${hspDiseaseCourseCustom.courseDateStr}';
            if(newtime == ''|| newtime == null){
                newtime = publicFun.timeFormat(new Date(), 'yyyy/MM/dd hh:mm:ss');
                $('#coursedate').val(newtime);
            }else{
                $('#coursedate').val(newtime);
            }
        })
        </script>
    </body>
</html>