<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/base/tag.jsp"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <title>健康教育项目选择</title>
    <%@ include file="/WEB-INF/jsp/base/common_css.jsp"%>
    <%@ include file="/WEB-INF/jsp/base/common_js.jsp"%>
    <link rel="stylesheet" type="text/css" href="${baseurl}css/hems/global.css">
    <link rel="stylesheet" type="text/css" href="${baseurl}css/common/tableStyle.css">
    <link rel="stylesheet" type="text/css" href="${baseurl}css/hems/healthedu.css?087" />
</head>

<body class="addhealth">
    <div id="mods" class="leftPart">    
	    <!-- <div id="operation" class="tree-head">
	    	<div >
	            &nbsp;&nbsp;<img src="../images/common/arrow_out.png" class="tree-icons" />
	            <a href="#" class="tree-a" onclick="expandAll()">展开</a>&nbsp;&nbsp;&nbsp;
	            <img src="../images/common/arrow_in.png" class="tree-icons" />
	            <a href="#" class="tree-a" onclick="collapseAll()">折叠</a>
	        </div>

	    </div> -->
	    <div class="topQueryDiv">
	       <input type="text" id="itemNam" />
	       <a href="#" class="easyui-linkbutton" iconCls="icon-search" onclick="init()"></a>
	    </div>
	    <div>
	    	<ul id="treelist"></ul>
	    </div>      
    </div>
    <div class="rightPart" ms-controller="rightMsg">
        <form id="addHealthForm"  class="form" action="${baseurl}healthedu/healtheducate_submit.do" method="post">
        <input id="emgSeq" type="hidden" name="hspHealtheduInfCustom.emgSeq" value="${emgSeq }"/>
        <table>
            <colgroup>
                <col width="8%" />
                <col />
            </colgroup>
            <tbody>
                <tr>
                    <th><i class="red">*</i> 教育对象：</th>
                    <td>
                        <label ms-repeat="getMsgList.eduObjList" ms-attr-for="eduObj{{el.infocode}}" class="checklabel">
                            <input ms-attr-id="eduObj{{el.infocode}}" type="checkbox" ms-attr-checked="el.checked" ms-click="checkclick('eduObj',$index)"> {{el.info}}
                        </label>
                         <input type="text" class="hidden" name="hspHealtheduInfCustom.eduObj" ms-duplex-string="hideMsg.eduObj" >
                    </td>
                </tr>
                <tr>
                    <th><i class="red">*</i> 教育时机：</th>
                    <td>
                        <label ms-repeat="getMsgList.eduTimeList" ms-attr-for="eduTime{{el.infocode}}" class="checklabel">
                            <input ms-attr-id="eduTime{{el.infocode}}" type="checkbox" ms-attr-checked="el.checked" ms-click="radioclick('eduTime',$index)"> {{el.info}}
                        </label>
                        <input type="text" class="hidden" name="hspHealtheduInfCustom.eduTime" ms-duplex-string="getMsg.eduTime" >
                    </td>
                </tr>
                 <tr>
                    <th><i class="red">*</i> 教育内容：</th>
                    <td>
                       <label ms-repeat="getMsgList.eduContList" ms-attr-for="eduCont{{el.infocode}}" class="checklabel">
                            <input ms-attr-id="eduCont{{el.infocode}}" type="checkbox" ms-attr-checked="el.checked" ms-click="checkclick('eduCont',$index)"> {{el.info}}
                        </label>
                        <input type="text" class="hidden" name="hspHealtheduInfCustom.eduCont" ms-duplex-string="hideMsg.eduCont" >
                    </td>
                </tr>
                 <tr>
                    <th><i class="red">*</i> 教育方法：</th>
                    <td>
                       <label ms-repeat="getMsgList.eduMethodList" ms-attr-for="eduMethod{{el.infocode}}" class="checklabel">
                            <input ms-attr-id="eduMethod{{el.infocode}}" type="checkbox" ms-attr-checked="el.checked" ms-click="checkclick('eduMethod',$index)"> {{el.info}}
                        </label>
                        <input type="text" class="hidden" name="hspHealtheduInfCustom.eduMethod" ms-duplex-string="hideMsg.eduMethod" >
                    </td>
                </tr>
                 <tr>
                    <th><i class="red">*</i> 效果评价：</th>
                    <td>
                        <label ms-repeat="getMsgList.eduResList" ms-attr-for="eduRes{{el.infocode}}" class="checklabel">
                            <input ms-attr-id="eduRes{{el.infocode}}" type="checkbox" ms-attr-checked="el.checked" ms-click="radioclick('eduRes',$index)"> {{el.info}}
                        </label>
                        <input type="text" class="hidden" name="hspHealtheduInfCustom.eduRes" ms-duplex-string="getMsg.eduRes" >
                    </td>
                </tr>
                <tr>
                    <th><i class="red">*</i> 教育时间：</th>
                    <td>
                        <input class="Wdate spcWdate" type="text" id="eduDat" name="hspHealtheduInfCustom.eduDat" onclick="WdatePicker({dateFmt:'yyyy/MM/dd HH:mm'})" ms-duplex-string="getMsg.eduDat">
                    </td>
                </tr>
                <tr>
                     <th>项目：</th>
                    <td>
                        <input type="text" class="longText" id="eduItemName" name="hspHealtheduInfCustom.eduItem" ms-duplex-string="getMsg.eduItem" readonly unselectable='on'>
                        <input type="text" class="longText hidden" id="eduItemList" name="eduItemList">
                    </td>
                </tr>
                <tr>
                   <th>备注：</th>
                    <td>
                        <textarea id="eduItemVachar" name="hspHealtheduInfCustom.eduOther" ms-duplex-string="getMsg.eduOther" readonly unselectable='on'></textarea> 
                    </td>
                </tr>
                <tr>
                    <td colspan="2" class="last_td">
                        <div class="center grp_btn">
                            <a class="easyui-linkbutton" iconcls="icon-ok" onclick="saveMsg()">确定</a>
                        <a class="easyui-linkbutton" iconcls="icon-cancel" onclick="parent.closemodalwindow()">关闭</a>
                        </div>
                    </td>
                </tr>
            </tbody>
        </table>
        </form>
    </div>
</body>
<script type="text/javascript" src="${baseurl}lib/validate/jquery.validate.js"></script>
<script type="text/javascript" src="${baseurl}lib/activetech.ztree.js"></script>
<script src="${baseurl}lib/avalon1.4.8/avalon.js" type="text/javascript" charset="UTF-8"></script>
<script type="text/javascript">
	//enter按键默认触发查询
	$(document).keydown(function(event) {
	    switch (event.keyCode) {
	    case 13:
	        init();
	    }
	});
	var zt;
    var today = publicFun.timeFormat(new Date(), 'yyyy/MM/dd hh:mm');
    var healthvm = avalon.define({
        $id: "rightMsg",
        getMsg: {
            //emgSeq预检号 eduObj教育对象 eduTime教育时机 eduCont教育内容 eduMethod教育方法 eduDat教育时间 eduRes效果评价 eduOther备注 eduItem项目
            eduObj:[], //教育对象
            eduTime: '', //教育时机
            eduCont: [], //教育内容
            eduMethod: [],//教育方法
            eduDat: today,//教育时间
            eduRes:'',//效果评价 
            eduOther:'',//备注 
            eduItem:''//项目
        },
        getMsgList: {
            eduObjList: [],//教育对象
            eduTimeList: [],//教育时机
            eduContList: [],//内容
            eduMethodList: [],//方法
            eduResList:[] //评价
        },
        hideMsg: {
            eduObj:'',
            eduCont:'',
            eduMethod:''
        },
        /**
         * @ 多选
         */
        checkclick: function(objName, idx) {
            var list = healthvm.getMsgList[objName + 'List'];
            var currentData = $.inArray((list[idx]['infocode']), healthvm.getMsg[objName]);
            if (list[idx]['checked'] == false) {
                list[idx]['checked'] = true;
                if (currentData == -1) {
                    healthvm.getMsg[objName].push(list[idx]['infocode']);
                }
            } else {
                list[idx]['checked'] = false;
                if (currentData != -1) {
                    healthvm.getMsg[objName].splice(currentData, 1);
                }
            }
            if (healthvm.getMsg[objName]) {
                healthvm.hideMsg[objName] = healthvm.getMsg[objName].join();
            }
        },
        radioclick: function(name, idx) {
            var list = [];
            list = healthvm.getMsgList[name + 'List'];
            var currentChecked = list[idx]['checked'];
            $.each(list, function(index, value) {
                value['checked'] = false;
            });
            list[idx]['checked'] = !currentChecked;
            if (list[idx]['checked'] == true) {
                healthvm.getMsg[name] = list[idx]['infocode'];
            } else {
                healthvm.getMsg[name] = '';
            }
        },

    });
    
    function getAjaxVal() {
        var _url;
            _url = "${baseurl}healthedu/findEducateList.do";
        $.ajax({
            url:_url,
            type:'POST',
            async:false,
            dataType:'json',
            success:function(res) {
                var msgList = res.resultInfo.sysdata;
                if (res.resultInfo.type == '1') {
                    $.each(msgList, function(key, val) {
                        if (healthvm.getMsgList.hasOwnProperty(key)) {
                            $.each(val, function(idx, valu) {
                                valu['checked'] = false;
                            });
                            healthvm.getMsgList[key] = val;
                        }
                    });
                }
            }
        });
    }
    /**
     * @ 保存
     */
    function saveMsg() {
    	if(validateForm()){
    		healthvm.getMsg.eduDat = healthvm.getMsg.eduDat+':00';
            jquerySubByFId('addHealthForm', insertuser_callback, null, "json");
    	}
    }

    function insertuser_callback(data) {
        message_alert(data);
        setTimeout(function() {
        	parent.closemodalwindow();
        	parent.reload();
        }, 800);
    }
    
    function validateForm() {
        return $('#addHealthForm').validate({
            rules: {
                "hspHealtheduInfCustom.eduDat": "required",
                "hspHealtheduInfCustom.eduObj": "required",
                "hspHealtheduInfCustom.eduTime": "required",
                "hspHealtheduInfCustom.eduCont": "required",
                "hspHealtheduInfCustom.eduRes": "required",
                "hspHealtheduInfCustom.eduMethod": "required",
                "hspHealtheduInfCustom.eduItem":"required",
            },
            messages: {
                "hspHealtheduInfCustom.eduDat": "教育时间必填！",
                "hspHealtheduInfCustom.eduObj": "教育对象必填！",
                "hspHealtheduInfCustom.eduTime": "教育时机必填！",
                "hspHealtheduInfCustom.eduCont": "教育内容必填!",
                "hspHealtheduInfCustom.eduRes": "效果评价必填!",
                "hspHealtheduInfCustom.eduMethod": "教育方法必填!",
                "hspHealtheduInfCustom.eduItem": "项目未选!"
            }
        }).form();
    }
    var checkbox=true;
    function init() {
    	var itemNam=$('#itemNam').val();
        var url = "${baseurl}healthedu/loadHealthEducateTree.do?itemNam="+itemNam;
        zt = new ZTREE("treelist", url, checkbox); //id 连接 是否有复选框
        zt.ztreeload({
            method: "post"
            /* data:{
            	"itemNam":itemNam
            } */
        }, {
            onDblClick:ajaxGetSonNodes,
            onExpand:checkNodeSelect,
            onCheck: zTreeOnCheck
        }); //属性设定,事件绑定
        //设置mods高度
        var height  = $('body').height()-20;
        $("#mods").height(height);
    }
    
    //三角形方式展开 ——子节点获取
    function checkNodeSelect(){
    	/* var root = $('#treelist').tree('getRoots');
    	var rootchildren=zt.getChildren(root);
    	console.log(rootchildren.length) */
    	var itemno=null;
    	if($('#treelist .tree-node').hasClass('tree-node-hover')){
    	  	itemno =  $('#treelist .tree-node-hover').attr('node-id');
    	}
    	var test=$('#treelist').tree('find',itemno);
    	var children=zt.getChildren(test);
    	//判断是否有自增子节点
    	if(children.length==1 && children[0].id=="000000"){
    		ajaxGetMsg(itemno);
    	}
    } 
    
    //树点击事件
    function onclickfn(node) {
        var url = "${baseurl}" + node.attributes.url;
        var text = node.text;
        if (node.attributes && node.attributes.url) {
            reloadPanel(url, text);
        } else {
            zt.onclickfn(node);
        }
    }

    function zTreeOnCheck(){
        var beforenodes = zt.getChecked();
        if(beforenodes!=null && beforenodes.length>0){
        	var firstchildren=beforenodes[beforenodes.length-1];
            if(firstchildren.id=="000000"){
            	checkNodeSelect();
            }else{
            	for (var j = 0; j < beforenodes.length; j++) {
					if(beforenodes[j].id=="000000"){
						checkNodeSelect();
						break;
					}
				}
            }
        }
        //获取异步插入子节点后的选中节点
        var afternodes = zt.getChecked();
        var eduItemList = [],
            eduItemName = [],
            eduItemVachar = [];   
        for (var i = 0; i < afternodes.length; i++) {
                var children=zt.getChildren(afternodes[i]);
                if(children.length<=0){
                	eduItemName.push(afternodes[i].text);
                    eduItemList.push(afternodes[i].id);
                    eduItemVachar.push(afternodes[i].attributes.spareField);
                }
        }
        eduItemList.join(",");
        eduItemName.join(",");
        eduItemVachar.join(",");
        $("#eduItemList").val(eduItemList);
        $("#eduItemName").val(eduItemName);
        $("#eduItemVachar").val(eduItemVachar);
    }
    
    function expand() {
        zt.expand();
    }

    function collapseAll() {
        zt.collapseAll();
    }

    function expandAll() {
        zt.expandAll();
    }

    function CheckedAll() {
        zt.CheckedAll();
    }

    function unCheckedAll() {
        zt.unCheckedAll();
    }
    
    //加载子节点
    function ajaxGetSonNodes(){
    	var nodes = zt.getSelected();
    	ajaxGetMsg(nodes.id)
    }
    
    function ajaxGetMsg(id) {
    	var url = "${baseurl}healthedu/loadHealthEducateTree.do";
    	var data={itemno: id};
    	zt.ajaxGetNodes(url, data, ajaxCallback);
    }
    //插入子节点回调
    function ajaxCallback(data){
    	var list=data[0].children;
    	//获取父节点(不能用getselected)
    	var parent=$('#treelist').tree('find',data[0].id);
    	
    	var newNodes = new Array();
    	//双击事件判断
    	var children=zt.getChildren(parent);
    	if(children.length==1 && children[0].id=="000000"){
    		if(list){
        		$.each( list, function(i, n){
        			newNodes.push(list[i]);
        		});
        		zt.append(newNodes,parent);
        	}
    		
    		var children2=zt.getChildren(parent);
        	//删除tree自增的子节点
    		zt.removeChildNode(children2[0]);
        	
    		var sel = zt.getSelected();
    		if(sel!=null && parent.id==sel.id){
    		    zt.onclickfn(parent);
    		}
    	}else{
    		var nodes = zt.getSelected();
        	zt.onclickfn(nodes);
    	}
    }
    
    $(function() {
        init();
        getAjaxVal();
    });
</script>

</html>