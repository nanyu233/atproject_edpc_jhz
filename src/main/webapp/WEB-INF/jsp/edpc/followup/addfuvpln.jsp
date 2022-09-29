<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/base/tag.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>新增随访计划</title>
    <%@ include file="/WEB-INF/jsp/base/common_css.jsp"%>
    <%@ include file="/WEB-INF/jsp/base/common_js.jsp"%>
    <link rel="stylesheet" type="text/css" href="${baseurl}styles/common/tableStyle.css">
    <link rel="stylesheet" type="text/css" href="${baseurl}styles/hems/global.css">
    <script type="text/javascript" src="${baseurl}lib/validate/jquery.validate.js"></script>
    <script type="text/javascript" src="${baseurl}lib/avalon1.4.8/avalon.js"></script>
    <style type="text/css">
        .search-btn {
            /*position: absolute;*/
            /*top: 10px;*/
            /*right: 10px;*/
            width: 140px;
            border-radius: 5px;
            color: #fff;
            background-color: #428bca;
            border-color: #357ebd;
            height: 32px;
            text-align: center;
            line-height: 32px;
            cursor: pointer;
        }


        .form table {
            width: 100%;
            margin-top: -2px;
        }
        .form table th {
            background: rgb(243,249,255);
        }
        .form table td , .form table th{
            padding: 3px;
            border:1px solid #ddd;
        }
        .form table td {
            width: 38%;
            text-align: center;
        }
        .form table th {
            width: 12%;
            text-align: center;
        }
        .form table tr:hover {
            background-color: #eaf2ff;
        }
    </style>
</head>

<body class="adddevice">
    <form ms-controller="fuvPln" class="form" id="fuvplnform" action="${baseurl}followup/fuvplnsubmit.do" method="post">
        <table style="margin:10px auto;">
            <colgroup>
                <col width="100" />
                <col />
            </colgroup>
            <tbody>
                <tr>
                    <tr>
                      <th>患者信息:</th>
                      <td>
                        {{fuvMsg.patNam}}  |  {{fuvMsg.patSex}}  |  {{fuvMsg.patAge}}
                      </td>
                    </tr>
                </tr>
                <tr>
                    <th>指定日期:</th>
                    <td>
                    <%--                        <input type="text" class="easyui-tooltip" title="选择指定日期来制定计划" ms-duplex-string="getMsg.designDate" onclick="WdatePicker({dateFmt:'yyyy/MM/dd'})"/>--%>
                        <input type="text" ms-duplex-string="getMsg.designDate" style="width: 100px" onclick="WdatePicker({dateFmt:'yyyy/MM/dd'})"/>
                        <label><i class="red">选择指定日期来制定计划</i></label>
                        <select class="hidden" id="plnFuvTyp" ms-duplex-string="fuvMsg.plnFuvTyp">
                      		 <option value="">请选择</option>
                     	 	 <option ms-repeat="getMsg.plnFuvTypList" ms-attr-value="el.infocode">{{el.info}}</option>
                  		</select>
                    </td>
<%--                	<td>--%>
<%--                	<label><i class="red">选择指定日期来制定计划</i></label>--%>
<%--                	</td>--%>
                </tr>
                <tr>
                    <th>待选周期</th>
                    <th>随访日期</th>
                </tr>
<%--                <td><br/></td>--%>
                <tr>
                </tr>
                <tr ms-repeat="getMsg.periodList" align="center" ms-click="periodClick($index,$index)">
                	<td><input type="checkbox" class="checkbox" ms-click="periodClick($index,this)"  ms-attr-id="plnFuv{{$index}}"/><label>{{el.period}}</label></td>
                	<td><label>{{el.plnFuvTim}}</label></td>
                	<td style="display: none">
                		<input style="display:none;" ms-attr-name="hspFuvPlnCustoms[{{$index}}].patId" ms-attr-id="patId{{el.period}}" type="text" ms-duplex-string="el.patId" ms-attr-disabled="el.disable">
                		<input style="display:none;" ms-attr-name="hspFuvPlnCustoms[{{$index}}].plnFuvTim" ms-attr-id="plnFuvTim{{el.period}}" type="text" ms-duplex-string="el.plnFuvTim" ms-attr-disabled="el.disable">
                		<input style="display:none;" ms-attr-name="hspFuvPlnCustoms[{{$index}}].plnSta" ms-attr-id="plnSta{{el.period}}" type="text" ms-duplex-string="el.plnSta" ms-attr-disabled="el.disable">
                		<input style="display:none;" ms-attr-name="hspFuvPlnCustoms[{{$index}}].almUsrNo" ms-attr-id="almUsrNo{{el.period}}" type="text" ms-duplex-string="el.almUsrNo" ms-attr-disabled="el.disable">
                		<input style="display:none;" ms-attr-name="hspFuvPlnCustoms[{{$index}}].almUsrNme" ms-attr-id="almUsrNme{{el.period}}" type="text" ms-duplex-string="el.almUsrNme" ms-attr-disabled="el.disable">
                		<input style="display:none;" ms-attr-name="hspFuvPlnCustoms[{{$index}}].plnFuvTyp" ms-attr-id="plnFuvTyp{{el.period}}" type="text" ms-duplex-string="fuvMsg.plnFuvTyp" ms-attr-disabled="el.disable">
                	</td>
                </tr>
                <tr>
                	<td colspan="3">
                    <i class="red">请勾选需要进行随访的日期来批量生成随访计划</i>
                    </td>
                </tr>
            </tbody>
        </table>
        <%--                    <tr align="center">--%>
        <%--                        <td colspan="2" class="last_td">--%>
        <div class="center grp_btn" style="display: flex;justify-content: flex-end">
            <%--                                <a class="easyui-linkbutton" iconCls="icon-add" id="submitbtn" onclick="insertSta()">确定</a>--%>
            <%--                                <a class="easyui-linkbutton" iconCls="icon-cancel" id="closebtn" onclick="parent.closemodalwindow()">关闭</a>--%>
            <div class="search-btn" id="submitbtn" onclick="insertSta()">确定</div>
            <div class="search-btn" id="closebtn" style="margin-left: 10px" onclick="parent.closemodalwindow()">关闭</div>
        </div>
        <%--                        </td>--%>
        <%--                    </tr>--%>
    </form>
    
    <script type="text/javascript">
    	var _patId = '${hspFuvPatCustom.patId}';
    	var _patNam = '${hspFuvPatCustom.patNam}';
    	var _patSex = '${hspFuvPatCustom.cstSexCodStr}';
    	var _patAge = '${hspFuvPatCustom.bthDat}';
    	var bthDat = publicFun.timeFormat(new Date(_patAge), 'yyyy/MM/dd');
		_patAge = (publicFun.calculateAge(bthDat).Age+publicFun.calculateAge(bthDat).typeStr);
		var _xtfFlg = '${hspFuvPatCustom.xtfFlg}';
		var _czfFlg = '${hspFuvPatCustom.czfFlg}';
		var _csfFlg = '${hspFuvPatCustom.csfFlg}';
		
		var _plnFuvTyp = '';
		if(_xtfFlg=='1'){_plnFuvTyp='1';}
		else if(_czfFlg=='1'){_plnFuvTyp='2';}
		else if(_csfFlg=='1'){_plnFuvTyp='3';}
		
		var _today = publicFun.timeFormat(new Date(), 'yyyy/MM/dd');
		var _usrno = '${sessionScope.activeUser.usrno}';
		var _usrname = '${sessionScope.activeUser.usrname}';
		
		var _plnFuvTypList = publicFun.getDict("PLN_FUV_TYP")||[];
    	var vm = avalon.define({
	        $id: 'fuvPln',
	        getMsg: {
	        	designDate:_today,
	            periodList:[],
	            plnFuvTypList:_plnFuvTypList
	        },
	        fuvMsg:{
	        	patId:_patId,
	        	patNam:_patNam,
	        	patSex:_patSex,
	        	patAge:_patAge,
	        	plnFuvTyp:_plnFuvTyp,
	        	czfFlg: _csfFlg,//卒中标识
	            csfFlg: _czfFlg,//创伤标识
	            xtfFlg: _xtfFlg//胸痛标识
	        },
	        initPeriodList:function(date){
	        	vm.getMsg.periodList = [];
        		var list = [1,3,6,9,13,24];
	        	for(var i=0;i<list.length;i++){
		        	var _currentDay = {
						year : new Date(date).getFullYear(),
						month : new Date(date).getMonth(),
						date : new Date(date).getDate()
					};
					var plnFuvTim = publicFun.timeFormat(new Date(_currentDay.year, _currentDay.month +list[i], _currentDay.date), "yyyy/MM/dd");
					vm.getMsg.periodList.push({'patId':_patId,'period':list[i]+'个月','plnFuvTim':plnFuvTim,'plnSta':'0','almUsrNo':_usrno,'almUsrNme':_usrname,'disable':true});
	        	}
	        },
	        periodClick: function (idx,typ) {
                event.stopPropagation()
                if (typeof typ == 'number') {
                    let checkbox = document.querySelectorAll('.checkbox')
                    let check = checkbox[idx].checked
                    checkbox[idx].checked = !check
                    vm.getMsg.periodList[idx]['disable'] = !vm.getMsg.periodList[idx]['disable'];
                }else {
                    vm.getMsg.periodList[idx]['disable'] = !vm.getMsg.periodList[idx]['disable'];
                }

	        }      
	    });
        //随访计划新增
        function insertSta() {
        	var flg = false;
        	for(var i=0;i<vm.getMsg.periodList.length;i++){
        		if(!vm.getMsg.periodList[i]['disable']){
        			flg= true;
        			break;
        		}
        	}
        	if(flg)
        		jquerySubByFId('fuvplnform', insertsta_callback, null, "json");
        	else
        		publicFun.alert('请至少选择一个周期');
        }
        
        vm.getMsg.$watch('designDate', function(newVal, oldVal) {
			if(newVal){
			    vm.initPeriodList(newVal);
			}
		});
        
        //新增的回调函数
        function insertsta_callback(data) {
            message_alert(data);
            if (data.resultInfo.type == '1') {
                setTimeout("parent.closemodalwindow()", 1000);
                //parent.queryfuv();
                parent.$("#dg").datagrid('reload');
                parent.$("#fuvplndg").datagrid('reload');
            }
        }
        function onlyNum (current, step, max) {
            var currentVal = current.value;
            current.value = publicFun.onlyNums(currentVal, step, max);
        }
        
        $(function(){        	       		        	
        	//初始化计划周期列表
	        vm.initPeriodList(_today);
        })
        
        
    </script>
</body>

</html>
