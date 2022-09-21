<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/base/tag.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
    </head>
    <body>
        <div class="printfirst" style="display:none;">
            <div id="printnote" class="print-body" style="display:block;float:left;width:210mm;font-family:'微软雅黑';">
                <p style="margin:0;padding:1mm 0 0 0;text-align:center;font-size:.42cm;line-height:1.5;">${hospitalPlatformNameGap}</p>
                <p style="margin:2mm 0;padding:0;text-align:center;font-weight:700;font-size:.58cm;">首次病程记录</p>
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
                    <li class="printfulltitle">
                        <label class="lab-span" style="font-weight:bold">病例特点：</label>
                    </li>
                    <li class="printfullli">
                        <span id="_diseasePoint">${hspDiseaseCourseCustom.diseasePoint}</span>
                    </li>
                    <li class="printfulltitle">
                        <label class="lab-span" style="font-weight:bold">初步诊断：</label>
                    </li>
                    <li class="printfullli">
                        <span id="_ryzdxy">${hspemginfCustom.jbzdDes}</span>
                    </li>
                    <li class="printfulltitle">
                        <label class="lab-span" style="font-weight:bold">诊疗计划：</label>
                    </li>
                     <li class="printfullli">
                        <span id="_treatmentPlan">${hspDiseaseCourseCustom.treatmentPlan}</span>
                    </li>
                    <li class="floatRightli">
                        <label>医师签名：</label>
                        <span id="_doctNam">${activeUser.usrname}</span>
                    </li>
                    
                    <li class="floatRightli">
                        <label class="lab-span">日期：</label>
                        <span id="_coursedate"></span>
                    </li>
                </ul>
            </div>
            <object id="ocx" classid="clsid:66665BEC-6877-4720-B1AC-56FA0A71B700" width=0px height=0px></object>
        </div>
        <script type="text/javascript" charset="utf-8">
            function printall(){
                if($('#_age').html() == '岁'){
                    $('#_age').html("__/__"); 
                }
                if($('#_emgFkCod').html() == ''){
                    $('#_emgFkCod').html("__/__"); 
                }
                if($('#_mpi').html() == ''){
                    $('#_mpi').html("__/__"); 
                }
                if($('#_lgh').html() == ''){
                    $('#_lgh').html("__/__"); 
                }
                var newtime = publicFun.timeFormat(new Date(), 'yyyy/MM/dd hh:mm:ss');
                $('#_coursedate').html(newtime);
                if($('#_diseasePoint').html() == ''){
                    $('#_diseasePoint').html("__/__"); 
                }
                if($('#_ryzdzy').html() == ''){
                    $('#_ryzdzy').html("__/__");
                }
                if($('#_ryzdxy').html() == ''){
                    $('#_ryzdxy').html("__/__");
                }
                if($('#_treatmentPlan').html() == ''){
                    $('#_treatmentPlan').html("__/__"); 
                }
                if($('#_doctNam').html() == ''){
                    $('#_doctNam').html("__/__"); 
                }

                $('.print-ul').css({"float":"left","width":"90%","font-size":"0.38cm","margin":"0 5%","padding":"0"});
                $('.print-ul li.printfullli').css({"float":"left","width":"99%","margin-left":"1%","padding-bottom":"2mm","list-style":"none","line-height":"1.5"});
                $('.print-ul li.printfulltitle').css({"float":"left","width":"99%","margin-left":"1%","list-style":"none"});
                $('.print-ul li.printhalfli').css({"float":"left","width":"49%","margin-left":"1%","padding-bottom":"2mm","list-style":"none","line-height":"1.5"});
                $('.print-ul span.basic-span').css({"display":"inline-block","margin-right":"3mm"});
                $('.print-ul li.floatRightli').css({"float":"left","width":"35%","margin-left":"65%","padding-bottom":"2mm","list-style":"none","text-align":"left","line-height":"1.5"});
                $('.print-ul label.marginleft').css({"display":"inline-block","margin-left":"3mm"});
                $('.print-ul li.bordered').css({"float":"left","width":"99%","margin-left":"1%","padding-bottom":"0mm","list-style":"none","border-bottom":"1px solid #000","margin-bottom":"1mm","line-height":"1.5"});
            
                LODOP = getLodop();
                LODOP.PRINT_INITA(0, 0, "210mm", "297mm", "打印控件功能演示_Lodop功能_超文本内容缩放打印");
                LODOP.SET_PRINT_PAGESIZE(0, "210mm", "297mm", "");
                LODOP.SET_PRINT_MODE("NOCLEAR_AFTER_PRINT", true);
                LODOP.ADD_PRINT_HTM(1050,344,"90%","100%","<font style='font-size:12px' format='0'><span tdata='pageNO'>第##页</span>/<span tdata='pageCount'>共##页</span></font>");
                LODOP.SET_PRINT_STYLEA(0,"ItemType",1);
                LODOP.ADD_PRINT_HTM(3, 0, "100%", "100%", document.getElementById("printnote").innerHTML);
                LODOP.NewPageA();
                LODOP.SET_PRINT_STYLE("FontSize", 10);
                //LODOP.SET_PRINTER_INDEX("ZDesigner GK888t");
                LODOP.PREVIEW();
                //LODOP.PRINT();
            }
        </script>
    </body>
</html>