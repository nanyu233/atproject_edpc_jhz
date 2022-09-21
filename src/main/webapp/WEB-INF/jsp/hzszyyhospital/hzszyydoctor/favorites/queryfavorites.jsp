<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/base/tag.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>查看收藏</title>
    <%@ include file="/WEB-INF/jsp/base/common_css.jsp"%>
       <link rel="stylesheet" type="text/css" href="${baseurl}css/hems/global.css">
    <script type="text/javascript" src="${baseurl}lib/easyui1.3/jquery-1.8.0.min.js"></script>
    <%@ include file="/WEB-INF/jsp/base/common_js.jsp"%>
    <script type="text/javascript" src="${baseurl}lib/jquery.form.min.js"></script>
    <script type="text/javascript" src="${baseurl}lib/validate/jquery.validate.js"></script>
    <style>
     .favorite .showItemDiv{
         margin-left:2px;margin-top:4px;margin-right:4px;float:left;
     }
     .favorite .rightWrapper{
         float:left;width:72%;margin-top:4px;
     }
     .favorite #content{
        width: 98%;border:1px solid #d2d9dc;height:415px;text-align:left;margin-bottom:10px;
     }
    </style>
</head>

<body class="favorite">
       <div class="showItemDiv">
           <table id="favoriteslist"></table>
       </div>
       <div class="rightWrapper">
         <input type="hidden" id="seqno" name="seqno"/>
           <textarea id="content" name="content" maxlength="1000"></textarea>
           <div class="center grp_btn">
               <a class="easyui-linkbutton" iconCls="icon-edit" id="submitbtn" onclick="savefavorites()">保存</a>
               <a class="easyui-linkbutton" iconCls="icon-cut" id="submitbtn" onclick="delfavorites()">删除</a>
               <a class="easyui-linkbutton" iconCls="icon-cancel" id="closebtn" onclick="parent.closemodalwindow()">关闭</a>
           </div>
       </div>
    <script type="text/javascript">
	  //加载datagrid
	    $(function() {
	    	getTab();
	    	$(window).resize(function() {
	    		getTab();
            });
	    });
	    
	    function getTab(){
	    	 var _thisHeight = $(window).height()-10;
	    	 var _height2 = $(window).height() - 50;
	    	 var _width2  = $(window).width() * 0.72;
	    	$("#favoriteslist").height(_thisHeight);
	    	$('#content').height(_height2);
	    	$('#content').width(_width2);
	    	$('#favoriteslist').datagrid({
	            nowrap: false,
	            striped: true,
	            singleSelect: true,
	            url: '${baseurl}zyylqbl/queryFavorites_result.do',
	            idField: 'seqno',
	            loadMsg: '',
	            columns: columns_v,
	            pagination: false,
	            rownumbers: false,
	            onLoadSuccess: function(data) {
	            	if (data.rows.length == 0) {  
	            		document.getElementById("content").disabled = true;
	                }  
	                else {  
	                    $('#favoriteslist').datagrid("selectRow", 0);  
	                    $("#seqno").val(data.rows[0].seqno);
			    	    $("#content").html(data.rows[0].content);
			    	    setCss(this);
	                }
	            },
	            onClickRow: function (rowIndex, rowData) {  
	            	$("#seqno").val(rowData.seqno);
	    	    	$("#content").html(rowData.content);
	    	    	setCss(this);
	           }
	        });
	        var _thisWidth = $(window).width() * 0.25;
            $('.showItemDiv .panel-header,.showItemDiv .datagrid-wrap.panel-body.panel-body-noheader,.showItemDiv .easyui-panel.panel-body.panel-body-noheader,.showItemDiv .datagrid-header').css('width',''+ _thisWidth +'');
            console.log(_thisHeight,"_thisHeight")
            $('.showItemDiv').height(_thisHeight);
            $('.showItemDiv .panel-header,.showItemDiv .datagrid-wrap.panel-body.panel-body-noheader,.showItemDiv .easyui-panel.panel-body.panel-body-noheader,.showItemDiv .datagrid-header').css('height',''+ _thisHeight +'');
	    }
	    //datagrid列定义
	    var columns_v = [
	        [{
	            field: 'seqno',
	            hidden: true,
	        },{
	            field: 'content',
	            hidden: true,
	        },{
	            field: 'title', //对应json中的key
	            width: 130,
	            title: '标题列表',
	        }]
	    ];
	    
        //保存
        function savefavorites() {
        	var seqno=$("#seqno").val();
        	var content=$("#content").val();
        	if(seqno == ""||seqno == null){
				alert("不能进行保存。");
				return;
			}
	   		if(content == ""||content == null){
				alert("内容不能为空。");
				return;
			}
	   		$.ajax({
		   	     url: "${baseurl}zyylqbl/saveFavoritessubmit.do",
		   	     type: "post",
	            data: {
	            	 "hspFavoritesInfCustom.seqno":seqno,
	            	 "hspFavoritesInfCustom.content":content
	            },
	            success:function(data){
	            	 if(data.resultInfo.messageCode==906){
	            	   data.resultInfo.message="操作成功";
	            	   message_alert(data);
	            	   setTimeout("parent.closemodalwindow()", 1000);
	            	 }else{
	            	   message_alert(data.resultInfo.message);
	            	 }
	            }
	        })
        }
 
        //删除
        function delfavorites() {
        	var seqno=$("#seqno").val();
        	if(seqno == ""||seqno == null){
				alert("无数据进行删除。");
				return;
			}else{
				 _confirm('确定删除该数据吗？', null, function() {
						$.ajax({
					   	     url: "${baseurl}zyylqbl/delFavoritessubmit.do",
					   	     type: "post",
				            data: {
				            	 "hspFavoritesInfCustom.seqno":seqno
				            },
				            success:function(data){
				            	 if(data.resultInfo.messageCode==906){
				            	   data.resultInfo.message="操作成功";
				            	   message_alert(data);
				            	   setTimeout("parent.closemodalwindow()", 1000);
				            	 }else{
				            	   message_alert(data.resultInfo.message);
				            	 }
				            }
				        }) 
			        });
			}
        	
        }
        
        function setCss(opt){
	       	var sr=document.getElementById("content");
	       	var len=sr.value.length;
	       	setSelectionRange(sr,len,len); //将光标定位到文本最后 
	    }
	
       	function setSelectionRange(input, selectionStart, selectionEnd) {
       	 if (input.setSelectionRange) {  
       	   input.focus();  
       	   input.setSelectionRange(selectionStart, selectionEnd);  
       	 }  
       	 else if (input.createTextRange) {  
       	   var range = input.createTextRange();  
       	   range.collapse(true);  
       	   range.moveEnd('character', selectionEnd);  
       	   range.moveStart('character', selectionStart);  
       	   range.select();  
       	 }  
       	}  
    </script>
</body>

</html>
