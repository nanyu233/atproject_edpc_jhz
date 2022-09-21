<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/base/tag.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>新增出入量统计</title>
    <%@ include file="/WEB-INF/jsp/base/common_css.jsp"%>
        <link rel="stylesheet" type="text/css" href="${baseurl}css/common/tableStyle.css">
        <link rel="stylesheet" type="text/css" href="${baseurl}css/hems/global.css">
</head>

<body class="querylqxxdj">
    <form class="form lqform" ms-controller="sumcrl" id="sumcrlform" action="${baseurl}zjszyyhljld/sumcrl_submit.do" method="post">
        <input class="hidden" type="text" name="HspHljldcrltjInfCustom.emgSeq" value="${emgSeq}">
        <table>
            <tbody>
                <tr>
                    <th>类型</th>
                    <td>
                        <select ms-duplex-string="getMsg.timeType" class="timeTypeSel">
                            <option value="0">24小时</option>
                            <option value="1">入院</option>
                            <option value="2">24小时尿量</option>
                        </select>
                        <input type="text" class="timeAreaInput" ms-duplex-string="getMsg.timeArea"/>小时
                        <input type="text" class="hidden" ms-duplex-string="getMsg.timeAreaH" name="HspHljldcrltjInfCustom.sjc"/>
                    </td>
                </tr>
                <tr>
                    <th>开始统计时间</th>
                    <td>
                        <input id="HspHljldcrltjInfCustom.startDat" class="input-sdate Wdate" name="HspHljldcrltjInfCustom.startDat" ms-duplex-string="getMsg.startDat"  type="text" placeholder="点击选择时间" onclick="setTimeFormatLimit('startDat','endDat',this)" onblur="qingchu()"/>
                    </td>
                </tr>
                <tr>
                    <th>结束统计时间</th>
                    <td>
                        <input id="HspHljldcrltjInfCustom.endDat"  class="input-sdate Wdate" name="HspHljldcrltjInfCustom.endDat" ms-duplex-string="getMsg.endDat" type="text" placeholder="点击选择时间" onclick="setTimeFormatLimit('endDat','startDat',this)" onblur="qingchu()"/>
                    </td>
                </tr>
                 <tr>
                    <th>总入量</th>
                    <td>
                        <input id="HspHljldcrltjInfCustom.sumRl"   name="HspHljldcrltjInfCustom.sumRl" type="text" readonly="true" />ml
                    </td>
                </tr>
                <tr>
                    <th>总出量</th>
                    <td>
                        <input id="HspHljldcrltjInfCustom.sumCl"  name="HspHljldcrltjInfCustom.sumCl" type="text" readonly="true" />ml
                    </td>
                </tr>
                <tr>
                    <th>总尿量</th>
                    <td>
                        <input id="HspHljldcrltjInfCustom.sumPee"  name="HspHljldcrltjInfCustom.sumPee" type="text" readonly="readonly"/>ml
                    </td>
                </tr>
                <tr>
                    <td colspan="4" class="last_td">
                        <div class="center grp_btn">
                            <a class="easyui-linkbutton" iconCls="icon-ok" id="submitbtn" onclick="sum()">统计</a>
                            <a class="easyui-linkbutton" iconCls="icon-ok" id="closebtn" onclick="sumcrlsubmit('')">保存</a>
                            <a class="easyui-linkbutton" iconCls="icon-ok" id="closebtn" onclick="sumcrlsubmit('Y')">保存并导入体温单</a>
                            <a class="easyui-linkbutton" iconCls="icon-cancel" id="closebtn" onclick="parent.closemodalwindow()">关闭</a>
                        </div>
                    </td>
                </tr>
            </tbody>
        </table>
    </form>
    <%@ include file="/WEB-INF/jsp/base/common_js.jsp"%>
    <script type="text/javascript" src="${baseurl}lib/validate/jquery.validate.js"></script>
    <script src="${baseurl}lib/avalon1.4.8/avalon.js" type="text/javascript" charset="UTF-8"></script>
    <script type="text/javascript">
        var _baseUrl;
        _baseUrl = "${baseurl}";
    </script>
    <script type="text/javascript">
    	function dateToGMT(strDate){
            var dateStr = strDate.split(" ");  
            var strGMT = dateStr[0]+" "+dateStr[1]+" "+dateStr[2]+" "+dateStr[5]+" "+dateStr[3]+" GMT+0800";  
            var date = new Date(Date.parse(strGMT));
            return date;
        }
       var emgSeq = '${emgSeq}';
        var vm = avalon.define({
            $id: 'sumcrl',
            getMsg: {
                timeType: '0',
                timeArea:24,
                timeAreaH:'',
                startDat:'',
                endDat:'',
                type:''
            },
        })

        vm.getMsg.$watch('timeType', function (newVal, oldVal) {
            if (newVal == 1) {
                vm.getMsg.startDat = publicFun.timeFormat(dateToGMT('${hspemginf.emgDat}'), "yyyy/MM/dd hh:mm");
                vm.getMsg.timeArea = getTimeArea(vm.getMsg.endDat,vm.getMsg.startDat)
            }else if(newVal == 0 || newVal == 2){
                setTime();
                vm.getMsg.timeArea = 24;
            }
        });

        vm.getMsg.$watch('timeArea', function (newVal, oldVal) {
            if (newVal != '') {
                vm.getMsg.timeAreaH = newVal+'h';
            }
        });

        function getTimeArea(timeA,timeB){
            var arr1 = timeB.split(" "); 
            var sdate1 = arr1[0].split('/'); 
            var arr2 = timeA.split(" "); 
            var sdate2 = arr2[0].split('/'); 
            var min1 = parseInt(timeB.slice(-2));
            var min2 = parseInt(timeA.slice(-2));
            var hour1 = parseInt(timeB.slice(11,13));
            var hour2 = parseInt(timeA.slice(11,13));
            var date1 = new Date(sdate1[0], sdate1[1]-1, sdate1[2],hour1,min1); 
            var date2 = new Date(sdate2[0], sdate2[1]-1, sdate2[2],hour2,min2); 
            var n = (date2.getTime() - date1.getTime())/3600000;
            return parseInt(n)
        }

        function pickerChange(item,it,_id){
            if(vm.getMsg[_id] != '' && item != ''){
                var timeB = vm.getMsg[_id];
                var timeA = item;
                if(_id == 'startDat'){
                    vm.getMsg.timeArea = getTimeArea(timeA,timeB)
                }else{
                    vm.getMsg.timeArea = getTimeArea(timeB,timeA)
                }
            }
        }

        function setTimeFormatLimit (id,_id, current) {
            var _currentDay = vm.getMsg[id];
            pickerChange(_currentDay, current,_id);
            WdatePicker({
                dateFmt:'yyyy/MM/dd HH:mm',isShowClear:false,onpicking:function(dp){pickerChange(dp.cal.getNewDateStr(),current,_id)}
            })
        }

       $(function() { 
    	   setTime();
    	});
	    function sum(){
		   var startDat = $("input[name='HspHljldcrltjInfCustom.startDat']").val();
           var endDat = $("input[name='HspHljldcrltjInfCustom.endDat']").val();
		   startDat = publicFun.timeFormat(startDat, "yyyy/MM/dd hh:mm:00");
		   endDat = publicFun.timeFormat(endDat, "yyyy/MM/dd hh:mm:00");
		   var type = vm.getMsg.timeType;
		   if (startDat == null || startDat == "") {
               $.messager.alert('提示信息', "开始时间不能为空", 'warning');
               return false;
           }
           if (endDat == null || endDat == "") {
               $.messager.alert('提示信息', "结束时间不能为空", 'warning');
               return false;
           }
	    	var ajaxOption =new AjaxOption();
           ajaxOption.requestType = 'POST';
           ajaxOption.requestDataType = "pame";
           ajaxOption.requestData = {"startDat":startDat,"endDat":endDat,"emgSeq":emgSeq,"type":type};
           ajaxOption.requestUrl = "${baseurl}zjszyyhljld/sumcrl.do";
           ajaxOption.asyncFlg =  false;
           ajaxOption.returnDataType = 'json';
           _ajaxPostRequest(ajaxOption, null, sum_callback);
	    }
    
        //统计的回调函数
        function sum_callback(data) {
        	 var list = data.resultInfo.sysdata.hspemginfCustomList;
        	 if(list.length==0){
        			$.messager.alert('提示信息', "该时间段没有数据", 'warning');
        	 }else{
        		 document.getElementById("HspHljldcrltjInfCustom.sumRl").value=0
        		 document.getElementById("HspHljldcrltjInfCustom.sumCl").value=0
	            for (var i = 0; list && i <list.length; i++) {
	           	switch (list[i].typecrl-0) {
				case 0:
					document.getElementById("HspHljldcrltjInfCustom.sumRl").value=list[i].sumcrl; 
					break;
				case 1:
					document.getElementById("HspHljldcrltjInfCustom.sumCl").value=list[i].sumcrl; 
					break;
				case 2:
					document.getElementById("HspHljldcrltjInfCustom.sumPee").value=list[i].sumcrl; 
					break;
				default:
					break;
				}
			}
	       }
        }
        function sumcrlsubmit(lead) {
        	var leadFlg =lead;
        	var sumRl = $("input[name='HspHljldcrltjInfCustom.sumRl']").val();
 		    var sumCl = $("input[name='HspHljldcrltjInfCustom.sumCl']").val();
 		    var sumPee = $("input[name='HspHljldcrltjInfCustom.sumPee']").val();
 		    var startDat = $("input[name='HspHljldcrltjInfCustom.startDat']").val();
		    var endDat = $("input[name='HspHljldcrltjInfCustom.endDat']").val();
		    var sjc = $("input[name='HspHljldcrltjInfCustom.sjc']").val();
		   if (startDat == null || startDat == "") {
               $.messager.alert('提示信息', "开始时间不能为空", 'warning');
               return false;
           }
           if (endDat == null || endDat == "") {
               $.messager.alert('提示信息', "结束时间不能为空", 'warning');
               return false;
           }
        	if(sumRl==""&&sumCl==""&&sumPee==""){
        		$.messager.alert('提示信息', "请填入正确时间并统计", 'warning');
        		return false;
        	}else{
        		startDat = publicFun.timeFormat(startDat, "yyyy/MM/dd hh:mm:00");
        		endDat = publicFun.timeFormat(endDat, "yyyy/MM/dd hh:mm:00");
        		
        		var ajaxOption =new AjaxOption();
                ajaxOption.requestType = 'GET';
                ajaxOption.requestDataType = "pame";
                ajaxOption.requestData = {"HspHljldcrltjInfCustom.startDat":startDat,"HspHljldcrltjInfCustom.endDat":endDat,
                						  "HspHljldcrltjInfCustom.emgSeq":emgSeq,
                						   "HspHljldcrltjInfCustom.sumRl":sumRl,"HspHljldcrltjInfCustom.sumCl":sumCl,"hspHljldcrltjInfCustom.sumPee":sumPee,
                						   "HspHljldcrltjInfCustom.leadFlg":leadFlg,"HspHljldcrltjInfCustom.sjc":sjc};
                ajaxOption.requestUrl = "${baseurl}zjszyyhljld/sumcrl_submit.do";
                ajaxOption.asyncFlg =  false;
                ajaxOption.returnDataType = 'json';
                _ajaxPostRequest(ajaxOption, null, sumcrlsubmit_callback);
        	}
        }
      //保存的回调函数
        function sumcrlsubmit_callback(data) {
        	message_alert(data);
            if (data.resultInfo.type == '1') {
                setTimeout("parent.closemodalwindow()", 1000);
                parent.reload();
            }
        }
        function qingchu(){
        	document.getElementById("HspHljldcrltjInfCustom.sumRl").value=''; 
			document.getElementById("HspHljldcrltjInfCustom.sumCl").value=''; 
        }
        
        function setTime() {
        	var myDate = new Date();
        	var yyear = myDate.getFullYear();
        	var mmonth = myDate.getMonth();
        	var dday = myDate.getDate();
        	var sevDat =  new Date(yyear,mmonth,dday).getTime()+7*60*60*1000;
        	var fivDat = new Date(yyear,mmonth,dday).getTime()-17*60*60*1000;
        	//var sevDat =  new Date(myDate.toLocaleDateString()).getTime() + 19*60*60*1000;
        	//var fivDat =  new Date(myDate.toLocaleDateString()).getTime() - 5*60*60*1000;
            var today = publicFun.timeFormat(new Date(sevDat), "yyyy/MM/dd hh:mm");
            var yesterday = publicFun.timeFormat(new Date(fivDat),"yyyy/MM/dd hh:mm");
            vm.getMsg.startDat=yesterday; 
			vm.getMsg.endDat=today; 
        };
    </script>
</body>

</html>