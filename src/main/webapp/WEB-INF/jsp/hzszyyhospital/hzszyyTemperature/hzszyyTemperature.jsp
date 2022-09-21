<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/base/tag.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<HTML>
    <head>  
    <%@ include file="/WEB-INF/jsp/base/common_js.jsp"%>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <script language="javascript">
    function SetZoomScale() 
    {
        //选择打印机
        var demo = document.getElementById("TWDOCX");
        demo.SetZoomScale(0.9,0.9); //选择打印机
    }

    function SetStartTime() 
    {
        var demo = document.getElementById("TWDOCX");
        demo.SetStartTime(8); //设置体温单列头起始时间
    }

    function SelectPrinter() 
    {
        //选择打印机
        var demo = document.getElementById("TWDOCX");
        demo.SelectPrinter(); //选择打印机
    }

    function SetTWDStyle(strStyle) 
    {
        //设置体温单样式
        var demo = document.getElementById("TWDOCX");
        demo.SetTWDStyle(strStyle); //选择打印机
        demo.RefreshTWD(1);
    }

    function SetHeaderStyle() 
    {
        //设置体温单表头样式
        var demo = document.getElementById("TWDOCX");
        demo.SetHeaderStyle(2); //选择打印机
        demo.RefreshTWD(1);
    }

    function SetXmlData() 
    {
        var strXmlData="";
        var xmlDoc = new ActiveXObject("Msxml2.DOMDocument.6.0");
        xmlDoc.async = false;
        xmlDoc.resolveExternals = false;
        xmlDoc.load("D:\\BodyTempData.xml");
        if (xmlDoc.parseError.errorCode != 0) 
        {
        var myErr = xmlDoc.parseError;
        alert("获取本地xml文件失败，错误原因：" + myErr.reason);
        } 
        else 
        {
        strXmlData=xmlDoc.xml;
            var demo = document.getElementById("TWDOCX");
            demo.SetXmlData(strXmlData);
            demo.RefreshTWD(1);
        }
    }
    
    
    function SetTextData() 
    {
        //var fso  = new ActiveXObject("Scripting.FileSystemObject"); 
        // var file = fso.OpenTextFile("D:\\TWDData.txt"); 
        // var strTWDData = file.ReadAll(); 
        // file.Close();
        var strTWDData =''; 
        $.ajax({
            url:'${baseurl}zyytpct/findtpxtjson.do?emgSeq=${emgSeq}',
            type:'POST',
            async: false,
            dataType:'json',
            success: function(res) {
                strTWDData = res;
            }
        })
        var demo = document.getElementById("TWDOCX");
        demo.SetDataType("TEXT");
        demo.SetXmlData(strTWDData);
        demo.RefreshTWD(1);
    }
    
    function SetJSONData()
    {
        var strTWDData = '';
        var _emgVal = '${emgSeq}';
        $.ajax({
            url:'${baseurl}zyytpct/findtpxtjson.do?emgSeq=${emgSeq}',
            type:'POST',
            async: false,
            dataType:'json',
            success: function(res) {
               // strTWDData = res
                strTWDData = JSON.stringify(res);
            }
        })
        var demo = document.getElementById("TWDOCX");
        demo.SetDataType("JSON");
        demo.SetXmlData(strTWDData);
        demo.RefreshTWD(1);
        $.ajax({
            url:'${baseurl}zyytpct/insertmedia.do?',
            type:'POST',
            async: false,
            dataType:'json',
            data:{
                "emgSeq": _emgVal,
                "imgStr": GetTWDPicEncode()
            }
        }) 
    }
    function GetXmlData() 
    {
        var strXmlData="";
        var demo = document.getElementById("TWDOCX");
        strXmlData=demo.GetXmlData();
        alert(strXmlData);
    }

    function RefreshData() 
    {
        var demo = document.getElementById("TWDOCX");
        demo.RefreshTWD(1);
    }
    function PrintCurrentPage() 
    {
        var demo = document.getElementById("TWDOCX");
        demo.PrintTWD(0);//打印当前页，传递0
    }
    function PrintAllPage() 
    {
        var demo = document.getElementById("TWDOCX");
        demo.PrintTWD(1);//打印所有页，传递1
    }

    function ExportFile()
    {
        var demo = document.getElementById("TWDOCX");
        demo.ExportFile(1,"D:\\TWD0001.jpg","JPG");
        demo.ExportFile(1,"D:\\TWD0001.bmp","BMP");
        
    }

    function SetLastTitle()
    {
        var demo = document.getElementById("TWDOCX");
        demo.RefreshTWD(1);
    }

    function SetTWDPrinter()
    {
        var demo = document.getElementById("TWDOCX");
        demo.SetTWDPrinter("Microsoft XPS Document Writer");//参数为打印机名称
    }

    function SetPrintScale()
    {
        var demo = document.getElementById("TWDOCX");
        demo.SetPrintScale(0.6,0.6);
    }

    function SetPrintScale2()
    {
        var demo = document.getElementById("TWDOCX");
        demo.SetPrintScale(1.1,1.1);
    }
    function GetTWDPicEncode()
    {
    	SetTWDStyle('A4_ZJHOS');
    	var demo = document.getElementById("TWDOCX");
    	var strImg=demo.GetTWDPicEncode(1,"JPG");//参数说明：参数一：需要获取当前病人体温单的周数，参数二：获取图片的格式，仅支持JPG和BMP
    	//alert(strImg);
    	return strImg;
    }
    
    $(function(){
        var type = parent.$('#IsIEVal').val();
        //console.log(type,"type")
        if(type != -1) {
            SetJSONData();
            SetLastTitle();
            SetTWDStyle('A4_ZJHOS');
        }else{
            //$.messager.alert('Warning','体温单这部分的功能非ie浏览器不能运行，请切换至ie！');
        }
    })
    </script>
    
    </head>  
     <body>
    <!-- <button type="button" onClick="SetTWDStyle('A4')">设置A4样式体温单</button>
    <button type="button" onClick="SetTWDStyle('B5')">设置B5样式体温单</button>
    <button type="button" onClick="SetStartTime()">设置起始时间</button>
    <button type="button" onClick="SetTextData()">设置文本数据</button>
    <button type="button" onClick="SetJSONData()">设置JSON数据</button>
    <button type="button" onClick="GetXmlData()">获取体温单数据</button>
    <button type="button" onClick="RefreshData()">刷新体温单</button></br></br>
    <button type="button" onClick="SetHeaderStyle()">设置体温单表头样式</button>
    <button type="button" onClick="ExportFile()">导出图像文件</button>
    <button type="button" onClick="SelectPrinter()">选择打印机</button>
    <button type="button" onClick="SetTWDPrinter()">指定打印机</button>
    <button type="button" onClick="SetPrintScale()">设置缩小比例</button>
    <button type="button" onClick="SetPrintScale2()">设置放大比例</button>
    <button type="button" onClick="PrintCurrentPage()">打印当前页</button>
    <button type="button" onClick="PrintAllPage()">打印所有页</button>    
    <button type="button" onClick="GetTWDPicEncode()">获取图片字符串</button> -->
    <p></p>
    <div style="position:relative;z-index: -999999 !important;">
        <OBJECT
            classid="clsid:15993109-2AF4-49E6-89DC-6FAD612F94D9"
            codebase="http://192.168.13.151:8888/atproject_zyy/twdocx.cab#version=1,0,0,1"
            width=805
            height=1165
            align=center
            hspace=0
            vspace=0
            id="TWDOCX" 
            contenteditable
            style="position:relative;z-index: -999999 !important;"
        >
        <param name="wmode" value="transparent">
        </OBJECT>
    </div>
    </body>
    </HTML>
    