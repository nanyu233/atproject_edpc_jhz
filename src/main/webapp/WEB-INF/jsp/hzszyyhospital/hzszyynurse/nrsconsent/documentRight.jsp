<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/base/tag.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
<%@ include file="/WEB-INF/jsp/base/common_css.jsp"%>
<%@ include file="/WEB-INF/jsp/base/common_js.jsp"%>
<title>交接单父页面</title>
<link rel="stylesheet" type="text/css" href="${baseurl}css/common/querylist.css?v=${versionDay}" />
<link rel="stylesheet" type="text/css" href="${baseurl}css/hzszyyhems/hljl.css?v=${versionDay}">
<link rel="stylesheet" type="text/css" href="${baseurl}css/hzszyyhems/tys/tys.css?v=${versionDay}">
<script language="javascript" src="${baseurl}Lodop6.216/LodopFuncs.js"></script>
</head>
  <body class="xtpg">
	  <script type="text/javascript">
	  	var comdata = parent.comdata;
	  	comdata.formToken = "${formToken}";
		var reloadflag = 0;
 	    $(function(){
			window.onresize = setLayout;
        	setLayout();
 	    	init();
 	    });
 	    
 	    function init() {
			getDatagrid();
		}

		function initPanel(){
			var rows = $('#tableDiv').datagrid('getRows');
			if(rows.length > 0){
				if(reloadflag == 0){
					choseWs(rows[0].seqno);
				}
			}else{
				addWsCom();
			}
		}
		 
		function setLayout(){
			var windowWidth = $(window).width(),
				windowHeight = $(parent.window).height();
			$("#baseView").height(windowHeight-33);
			$("#baseView").width(windowWidth);
		}
 	   
		//初始化ifram子页面
 	   function initBaseView(url){
 	        url = encodeURI(url)
			var baseView = createFrame(url);
	    	$("#baseView").html(baseView);
	    }
 	    
 	  //获取导管病人datagrid表格
 	    function getDatagrid() {
 	    	var windowHeight = $(parent.window).height();
 	        $("#tableDiv").height(windowHeight-295);
 	        //datagrid列定义
 	        var columns_v = [
 	            [{field: 'crtdate' , title: '记录时间',  width: 160,
 	                formatter: function (value, row, index) {
 	                    return publicFun.timeFormat(value, "yyyy-MM-dd hh:mm");
 	                }
 	            },
 	            {field: 'seqno',title: 'id',hidden: 'true'},
 	            {field: 'crtusrname',title: '创建人',hidden: 'true'}]
			 ];
			 var getDataUrl;
			if(comdata.params.tempno == '2029'){
				getDataUrl = '${baseurl}zyynrsconsent/queryNczrslchcb_result.do'
				getDataParam = {"hspNczrslchcbInfCustom.refseqno":comdata.emgSeq}
			} else{
				getDataUrl = '${baseurl}zyynrsconsent/queryDocumentResult.do';
				getDataParam = {"hspNrsconsentInfCustom.tempno":comdata.params.tempno,
								"hspNrsconsentInfCustom.refseqno":comdata.emgSeq}
			}
			
			 $('#tableDiv').datagrid({
 	            nowrap: false,
 	            striped: true,
 	            singleSelect: true,
 	            title: '',
 	            url: getDataUrl,
 	            idField: 'seqno',
 	            queryParams: getDataParam,
 	            loadFilter: function (data) {
 	                if (data.resultInfo && data.resultInfo.messageCode == '109') {
 	                    message_alert(data, function () {
 	                        window.location.href = "${baseurl}/first.do";
 	                    });
 	                }
 	                return data;
 	            },
 	            loadMsg: '',
 	            columns: columns_v,
 	            rownumbers: true,
				onLoadSuccess: function(data) {
					if(data.rows.length > 0 ){
						$('#tableDiv').datagrid('selectRow',0);
					}
					var params = comdata.params;
					$("#cretNam").text(comdata.username);
					$("#titlename").text(params.tempname);
					initPanel();
	            },
 	            onClickRow: function (rowIndex, rowData) {
 	              choseWs(rowData.seqno);
 	            },
 	        });
		 }
 	  
 	  //文书列表选择文书
 	  function choseWs(seqno) {
		if(comdata.params.tempno == '2029'){
			var updateUrl ="${baseurl}zyynrsconsent/toUpdateNczrslchcb.do?emgSeq="+comdata.emgSeq+"&seqno="+seqno;
		}else{
			var updateUrl ="${baseurl}zyynrsconsent/toUpdateDocument.do?seqno="+seqno;
		}
		comdata.params.seqno = seqno;
		updateUrl = updateUrl + '&timeAll=' + new Date().getTime();
		initBaseView(updateUrl);
	  }
 	  
		 //保存文书
		 function saveWsCom(){
			var $contents = $("#myFrame").contents();
			var mainView = $contents.find("#mainView");
			$('#saveWs').attr('onclick',"");
			setParam(mainView.find("input,textarea,select"));
			var texthtml = mainView.html();
			var content = '';
			
			document.cookie ="formToken=" + $contents.find("#formToken").val();
			if(comdata.params.tempno == '2029'){
				var wsdata = document.getElementById("myFrame").contentWindow.saveWsCom();
				if( wsdata != '未完成' ){
					wsdata.hspNczrslchcbInfCustom.texthtml = texthtml;
					var _Url = '${baseurl}zyynrsconsent/addNczrslchcbTable.do'
				}else{
					$('#saveWs').attr('onclick',"saveWsCom()");
					return
				}
			}else{
				var wsdata = {
					hspNrsconsentInfCustom:{
						refseqno : comdata.emgSeq,
						tempno : comdata.params.tempno,
						tempname : comdata.params.tempname,
						texthtml : texthtml,
						content : content,
						seqno : comdata.params.seqno,
						_t:Date.parse(new Date())
					}
				}
				var _Url = '${baseurl}zyynrsconsent/addDocumentSubmit.do';
			}
			var ajaxOption = new AjaxOption();
				ajaxOption.requestType = 'POST';
				ajaxOption.requestDataType = "json";
				ajaxOption.requestData = wsdata;
				ajaxOption.requestUrl = _Url;
				ajaxOption.asyncFlg = true;
				ajaxOption.returnDataType = 'json';
				_ajaxPostRequest(ajaxOption, null, function(res) {
					$('#saveWs').attr('onclick',"saveWsCom()");
					message_alert(res);
					if(res.resultInfo.sysdata.seqno){
						reload();
						choseWs(res.resultInfo.sysdata.seqno);
						reloadflag = 1;
					}
					
				});
			
		 }
		 
		 //删除文书
		 function deleteWsCom() {
			var row = $('#tableDiv').datagrid('getSelected');
			if(comdata.params.tempno == '2029'){
				var _Url = '${baseurl}zyynrsconsent/delNczrslchcbTable.do'
			}else{
				var _Url = '${baseurl}zyynrsconsent/delDocumentSubmit.do'
			}

	        if (GridUtils.checkChecked(row)) {
	            _confirm('确定删除该数据吗？', null, function () {
	            	var ajaxOption = new AjaxOption();
			        ajaxOption.requestType = 'POST';
			        ajaxOption.requestDataType = "pame";
			        ajaxOption.requestData = {
			        		seqno:row.seqno,
							_t:Date.parse(new Date())
			        };
			        ajaxOption.requestUrl = _Url;
			        ajaxOption.asyncFlg = false;
			        ajaxOption.returnDataType = 'pame';
			        _ajaxPostRequest(ajaxOption, null, function(res) {
			        	message_alert(res);
			        });
	                $('#tableDiv').datagrid('clearSelections');
	                reload();
	                addWsCom();
	            });
	        } 
		}
		 
		 //t跳转文书新增
		 function addWsCom (){
			 comdata.params.seqno = null;
			var params = comdata.params;
			if(comdata.params.tempno == '2029'){
				var url = "${baseurl}zyynrsconsent/toAddNczrslchcb.do?emgSeq="+comdata.emgSeq; 
			}else{
				$("#cretNam").text(comdata.username);
				$("#titlename").text(params.tempname);
				var url = "${baseurl}zyynrsconsent/documentByTempno.do?hspNrsconsentInfCustom.refseqno="+comdata.emgSeq
				+"&hspNrsconsentInfCustom.tempno="+params.tempno +"&hspNrsconsentInfCustom.tempname="+params.tempname; 
			}
			initBaseView(url);
			$('#tableDiv').datagrid('clearSelections');
		 }
				
		 //创建iframe子页面
		 function createFrame(url) {
	        var content = '<iframe id ="myFrame" frameborder="0" scrolling="auto" src="' + url + '"  style="width: 100%;height:100%"></iframe>';
	        return content;
	    }
		 
		 //刷新文书列表
		 function reload() {
	    	$('#tableDiv').datagrid('reload');
		}
		 
		 //打印文书
		 function printWsCom(){
			var cmyframe = document.getElementById("myFrame").contentWindow;
			var nn = cmyframe.$('textarea').size();
			var version = navigator.userAgent;
			 if(nn>0){
				var valqt = cmyframe.$('#areavalue').val();
				cmyframe.$('#spanvalue').html(valqt);
			 }
			 try {
                 var printDiv = $("#myFrame").contents().find("#mainView");
                 var $div = printDiv.find("input,textarea,select");
                 if (comdata.params.tempno == '2034') {
                   setSpanVal() ;
                 }
                 setParam($div);
                 LODOP = getLodop();
                //  strStyleCSS += "<link rel='stylesheet' type='text/css' href='${baseurl}css/hzszyyhems/hljl.css'>" ;
                 LODOP.PRINT_INITA(0, 0, '210mm', '297mm', '打印控件功能演示_Lodop功能_超文本内容缩放打印');
                 LODOP.SET_PRINT_PAGESIZE(0, '210mm', '297mm', '');
                 LODOP.SET_PRINT_MODE('NOCLEAR_AFTER_PRINT', true);
                 LODOP.ADD_PRINT_HTM(1078, 344, '97%', '100%', '<font style=\"font-size:12px\" format=\"0\"><span tdata=\"pageNO\">第##页</span>/<span tdata=\"pageCount\">共##页</span></font>');
                 LODOP.SET_PRINT_STYLEA(0, 'ItemType', 1);
				 if(version.indexOf("Windows NT 5")!=-1){
					 var strStyleCSS = "<link rel='stylesheet' type='text/css' href='${baseurl}css/hzszyyhems/tys/tysprintxp.css?v=${versionDay}'>";
					 if(comdata.params.tempno == '2023' || comdata.params.tempno == '2024' || comdata.params.tempno == '2025'|| comdata.params.tempno == '2026'|| comdata.params.tempno == '2028'|| comdata.params.tempno == '2001'|| comdata.params.tempno == '2027' || comdata.params.tempno == '2042'){
                 		strStyleCSS += "<link rel='stylesheet' type='text/css' href='${baseurl}css/hzszyyhems/tys/tsrqprint.css?v=${versionDay}'>";
					 }
					 LODOP.ADD_PRINT_HTM(3, 0, '100%', '94%', strStyleCSS + printDiv.html());
				 }else{
					var strStyleCSS = "<link rel='stylesheet' type='text/css' href='${baseurl}css/hzszyyhems/tys/tysprint.css?v=${versionDay}'>";
					 if(comdata.params.tempno == '2023' || comdata.params.tempno == '2024' || comdata.params.tempno == '2025'|| comdata.params.tempno == '2026'|| comdata.params.tempno == '2028'|| comdata.params.tempno == '2001'|| comdata.params.tempno == '2027' || comdata.params.tempno == '2042'){
                 		strStyleCSS += "<link rel='stylesheet' type='text/css' href='${baseurl}css/hzszyyhems/tys/tsrqprint.css?v=${versionDay}'>";
					 }
					LODOP.ADD_PRINT_HTM(3, -23, '100%', '96.5%', strStyleCSS + printDiv.html());
				 }
                 LODOP.NewPageA();
                 LODOP.PREVIEW();
                 //LODOP.PRINT();
             } catch (e) {
                 $.messager.alert('提示信息', '数据存在某些问题，请刷新后重试', 'warning');
             }
		 }
		 
		 //表单标签赋值 (也可以用jquery的attr({value:"xx"}))
		 function setParam($div){
			 $div.each(function () {
			        switch (this.type) {
			            case 'text': this.setAttribute('value', this.value); break;
			            case 'checkbox':
			            case 'radio':
			                if(this.checked)this.setAttribute('checked', 'checked');
			                else this.removeAttribute('checked');
			                break;
						case 'select':
							this.setAttribute('value', this.value); break;
			                break;
			            case 'select-one':
			            case 'select-multiple':
			                $(this).find('option').each(function () {
			                    if(this.selected)this.setAttribute('selected', 'selected');
			                    else this.removeAttribute('selected');
			                });
			                break;
			            case 'textarea': 
			            	this.innerHTML = this.value; 
			            break;
			        }
			    });
			 	return true;
			}
			
		function setSpanVal () {
		  var _list = ['zd','zl','zy','ff','td'];
		  for (var i = 0; i < _list.length; i++) {
		  	var _val = $("#myFrame").contents().find("#mainView").find('#' + _list[i] + 'Textarea').val(); 	
		  	$("#myFrame").contents().find("#mainView").find('#' + _list[i]).html(_val);
		  }
		}
 	</script>
    <div id="baseView">
    	<c:choose>
    		<c:when test="${hspNrsConsentInfCustom.seqno ==null || hspNrsConsentInfCustomseqno==''}">
    			<jsp:include page="${hspNrsConsentInfCustom.conturl}"></jsp:include>   
    		</c:when>
    		<c:otherwise>
    			${hspNrsConsentInfCustom.texthtml}
    		</c:otherwise>
    	</c:choose>
    </div>
    <div class="rightWrapper">
        <div class="rightPanel">
            <div class="managerws">
                <p>文书管理</p>
                <p class="dashedborder"></p>
                <div class="tip2">
                    <p><label>名称：</label><span id="titlename" class="_name"></span></p>
                    <p><label>创建人：</label><span id="cretNam"></span></p>
                </div>
            </div>
            <div class="operationDiv">
                <p>操作</p>
                <p class="dashedborder"></p>
                <div class="operationbtn operatEmergency">
                    <a href="javascript:;" class="commonbtn leftBtn" onclick="addWsCom()">新增</a> 
                    <a href="javascript:;" id="saveWs" class="commonbtn" onclick="saveWsCom()">保存</a> 
                    <a href="javascript:;" class="commonbtn leftBtn" onclick="deleteWsCom()">删除</a> 
                    <a href="javascript:;" class="commonbtn" onclick="printWsCom()">打印</a>
                </div>
            </div>
            <div class="tabWrapper">
                <p>记录时间</p>
                <p class="dashedborder"></p>
                <div class="dataGridDiv queryTabs">
                    <div class="tableDiv" id="tableDiv"></div> 
                </div>
            </div>
        </div>
    </div>
  </body>
</html>
