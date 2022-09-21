<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/base/tag.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
</head>
<body>
    <div class="printnote" style="display:none;">
        <div id="printnoteA" class="print-body" style="display:block;float:left;width:210mm;font-family:'微软雅黑';">
            <jsp:include page="/WEB-INF/jsp/hzszyyhospital/printBasicInfo/printBasicInfo.jsp"></jsp:include>
            <ul class="print-ul">
                <li class="printhalfli">
                    <span class="basic-span">
                        <label class="title-label">姓名：</label>
                        <span>${hspemginfCustom.cstNam}</span>
                    </span>
                </li>
                <li class="printhalfli">
                    <span class="basic-span">
                        <label class="title-label">性别：</label>
                        <span>${hspemginfCustom.cstSexCod}</span>
                    </span>
                </li>
                <li class="printhalfli">
                    <span class="basic-span">
                        <label class="title-label">年龄：</label>
                        <span id="_age">${hspemginfCustom.cstAge}${hspemginfCustom.cstAgeCod}</span>
                    </span>
                </li>
                <li class="printhalfli">
                    <span class="basic-span">
                        <label class="title-label">留观号：</label>
                        <span>${hspemginfCustom.observationCode}</span>
                    </span>
                </li>
                <li class="printhalfli">
                    <span class="basic-span">
                        <label class="title-label">身份证号：</label> 
                        <span id="_idNbr">${hspemginfCustom.idNbr}</span>
                    </span>
                </li>
                <li class="printhalfli">
                    <span class="basic-span">
                        <label class="title-label">电话：</label>
                        <span id="_pheNbr">${hspemginfCustom.pheNbr}</span>
                    </span>
                </li>
            </ul>
        </div>
        <div id="printnoteB" class="print-body" style="display:block;float:left;width:210mm;font-family:'微软雅黑';">
            <ul class="print-ul">
                <!-- <li class="printfullli">
                    <label class="lab-span">联系地址：</label>
                    <span id="_cstAdr">${hspemginfCustom.cstAdr}</span>
                </li> -->
                <li class="printhalfli">
                    <label class="title-label">入观日期：</label>
                    <span id="admtDatspn"></span>
                </li>
                <li class="printhalfli">
                    <label class="title-label">出观日期：</label>
                    <span id="dscgDatspn"></span>
                </li>
                <li class="printfullli">
                    <label class="title-label">初步诊断：</label>
                </li>
                <li class="printfullli">
                    <label class="margingap">中医：</label>
                    <span id="_ryzdXy">${hspemginfCustom.ryzdXy}</span>
                </li>
                <li class="printfullli">
                    <label class="margingap">西医：</label>
                    <span id="_jbzdDes">${hspemginfCustom.jbzdDes}</span>
                </li>
                <li class="printfullli">
                    <label class="title-label">出观诊断：</label>
                </li>
                <li class="printfullli">
                    <label class="margingap">中医：</label>
                    <span id="_cyzdZy">${hspemginfCustom.cyzdZy}</span>
                </li>
                <li class="printfullli">
                    <label class="margingap">西医：</label>
                    <span id="_cyzdXy">${hspemginfCustom.cyzdXy}</span>
                </li>
                <li class="printfullli">
                    <label class="title-label">转归：</label>
                    <span id="_obsvtZg"></span>
                </li>
                <li class="printfullli">
                    <label class="title-label">留观时长：</label>
                    <span id="_lgsc">${hspObsvtfstInfCustom.obsvtLen} <span id="unit"></span></span>
                </li>
                <li class="floatRightli">
                    <label>医师签名：</label>
                    <span id="doctNam"></span>
                </li>
                <li class="floatRightli">
                    <label>日期：</label>
                    <span id="oprtDatspn"></span>
                </li>
            </ul>
        </div>
        <object id="ocx" classid="clsid:66665BEC-6877-4720-B1AC-56FA0A71B700" width=0px height=0px></object>
    </div>
    <script type="text/javascript" charset="utf-8">
    //打印
    function printnote() {
           $('#docuTitle').html('留观首页');
           $('#unit').html($('.unit').html());
           if($('#_age').html() == '岁'){
                $('#_age').html(""); 
           }
           if ($('#_idNbr').html() === '1' || $('#_idNbr').html() === '') {
              $('#_idNbr').html('无') 
           }
           $('#admtDatspn').html(_admtDat);
           if(_dscgDat) {
                $('#dscgDatspn').html(_dscgDat);
           }
           if($('#_lgsc').html() == ' 天' || $('#_lgsc').html() == ' 时' ){
                $('#_lgsc').html("");
           }
           if(_oprtDat !=''){
               $('#oprtDatspn').html(_oprtDat);
           }else{
              $('#oprtDatspn').html(publicFun.timeFormat(new Date(), 'yyyy/MM/dd hh:mm:ss'));
           }
           if(_cratNam !=''){
               $('#doctNam').html(_cratNam)
           }else{
               $('#doctNam').html(_name)
           }
           var _pselVal = "${hspObsvtfstInfCustom.obsvtZg}",
               _pZgNurseVal = '${hspsqlinfCustom.sqlStaCod}';
           if (_pZgNurseVal !== '') {
               _pselVal = _pZgNurseVal
           }
           var _zgValList = [{cod: '1', val: '出院'}, { cod: '2', val: '住院' }, { cod: '0', val: '出观' }, { cod: '4', val: '自动离院' }, { cod: '8', val: '回家' }, { cod: '9', val: '转门诊' }, { cod: '11', val: '转留观室' }, { cod: '12', val: '非医嘱离院' }, { cod: '3', val: '死亡' }, { cod: '14', val: '来院已死亡' }, { cod: '13', val: '转院' }];
            $.each(_zgValList, function(idx, value) {
                if (value.cod == _pselVal) {
                    $('#_obsvtZg').html(value.val)
                }
            })
            $('.print-ul').css({"float":"left","width":"90%","font-size":"0.38cm","margin":"0 5%","padding":"0"});
            $('.print-ul li.printfullli').css({"float":"left","width":"99%","margin-left":"1%","padding-bottom":"2mm","list-style":"none","line-height":"1.5"});
            $('.print-ul li.printhalfli').css({"float":"left","width":"44%","margin-left":"1%","padding-bottom":"2mm","list-style":"none","line-height":"1.5"});
            //$('.print-ul label.title-label').css({"display":"inline-block","text-align":"right","width":"2cm"});
            $('.print-ul li.floatRightli').css({"float":"left","width":"35%","margin-left":"65%","padding-bottom":"2mm","list-style":"none","text-align":"left","line-height":"1.5"});
            $('.print-ul label.marginleft').css({"display":"inline-block","margin-left":"3mm"});
            $('.print-ul label.margingap').css({"display":"inline-block","margin-left":"2mm"});
            $('.print-ul li.bordered').css({"float":"left","width":"99%","margin-left":"1%","text-align":"left","padding-bottom":"0mm","list-style":"none","border-bottom":"1px solid #000","margin-bottom":"1mm","line-height":"1.5"});
           LODOP = getLodop();
           LODOP.PRINT_INITA(0, 0, "210mm", "297mm", "打印控件功能演示_Lodop功能_超文本内容缩放打印");
           LODOP.SET_PRINT_PAGESIZE(0, "210mm", "297mm", "");
           LODOP.SET_PRINT_MODE("NOCLEAR_AFTER_PRINT", true);
           LODOP.ADD_PRINT_HTM(1050,344,"90%","100%","<font style='font-size:12px' format='0'><span tdata='pageNO'>第##页</span>/<span tdata='pageCount'>共##页</span></font>");
           LODOP.SET_PRINT_STYLEA(0,"ItemType",1);
           LODOP.ADD_PRINT_HTM(185,0, "100%", "80%", document.getElementById("printnoteB").innerHTML);
           LODOP.NewPageA();
           LODOP.SET_PRINT_STYLE("FontSize", 10);
           LODOP.ADD_PRINT_HTM(3, 0, "100%", "100%", document.getElementById("printnoteA").innerHTML);
           LODOP.SET_PRINT_STYLEA(0,"ItemType",1);
           //LODOP.SET_PRINTER_INDEX("ZDesigner GK888t");
           LODOP.PREVIEW();
           //LODOP.PRINT();
        }
    </script>
</body>

</html>