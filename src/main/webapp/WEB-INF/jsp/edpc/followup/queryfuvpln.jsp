<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<div class="form">
    <div class="row" style="min-height:30px;">
        <div class="search-btn" onclick="delFuvPln()" style="margin-right:300px;">计划删除</div>
    </div>
    <div class="row">
        <div class="search-btn" onclick="tofuvpln()" style="margin-right:150px;">计划详情</div>
    </div>
    <div class="row">
        <div class="search-btn" onclick="redirectTosfgladd()" >随访登记</div>
    </div>
</div>
<table id="fuvplndg"></table>
<script>
	var plnFuvTypArr = publicFun.getDict('PLN_FUV_TYP');
	var height = $('#container').height()*0.5;

    //设置表格的列宽
    //pct --- 百分比（取小于1的小数）
    function setWidth(pct) {
        var pWidth = $('.form').width();
        if (pct < 1 && pct >= 0) {
            return pWidth * pct;
        } else {
            return undefined;
        }
    }

  //跳转计划详情
    function tofuvpln() {
    	var checkData = $('#fuvplndg').datagrid('getSelected');
	    if (checkData) {
      		createmodalwindow("计划详情", 550, 200, '${baseurl}followup/tofuvpln.do?hspFuvPlnCustom.plnSeq='+checkData.plnSeq, 'no');
      	}else{
	      	publicFun.alert('未选中记录');
	    }
    }
  
  //跳转随访登记
    function redirectTosfgladd() {
    	var checkData = $('#fuvplndg').datagrid('getSelected');
	    if (checkData) {
	    	//判断前驱是否完成
	    	publicFun.httpServ('post', '${baseurl}followup/checkUnFinishPln.do', 
						   {'endDate' :publicFun.timeFormat(new Date(checkData.plnFuvTim), 'yyyy/MM/dd'),
						   'hspFuvPlnCustom.patId' :checkData.patId
						   },
						   function(res) {
						   		if(res.resultInfo.message=='0'){
							   		var url = 'followup/tofuvadd.do?plnSeq='+checkData.plnSeq+'&patId='+checkData.patId+'&fuvSeq='+checkData.fuvSeq;
		        					window.top.addTab('随访登记-' + checkData.patNam+'-'+checkData.plnSeq, url, 'icon icon-emergency-record');
						   		}else{
						   			publicFun.alert('请先完成或删除先前未完成计划');
						   		}
						   },
						   function(err){},10000);
      	}else{
	      	publicFun.alert('未选中记录');
	    }
    }
  
    function delFuvPln() {
    	var checkData = $('#fuvplndg').datagrid('getSelected');
	    if (checkData) {
	      	//是否完成计划判断
	        _confirm('是否删除该条数据？', null, function() {
	           publicFun.httpServ('post', '${baseurl}followup/deleteplnSeq.do', {'plnSeq': checkData.plnSeq,date: new Date().toTimeString()},function(res) {
	       			message_alert(res);
	       			$("#dg").datagrid('reload');
	       			$("#fuvplndg").datagrid('reload');
	       			$("#fuvinfdg").datagrid('reload');
	        	},function(err){},10000);
	        });	      	
	    }else{
	      	publicFun.alert('未选中记录');
	    }
    	
    }
    
	var columns_pln =  [ 
		[{
			field : 'plnSeq',	
			title : '计划编号',
			width : setWidth(0.05)
		},
		{
			field : 'patNam',	
			title : '姓名',
			width : setWidth(0.08)
		},
		{
			field : 'plnFuvTyp',	
			title : '病种',
			width : setWidth(0.05),
			formatter : function(value, row, index) {
				if(value)
                	return publicFun.codingEscape(plnFuvTypArr,value);
                else
                	return '-';
			}
		},
		{
			field : 'plnFuvTim',
			title : '计划日期',
			width : setWidth(0.08),
			formatter : function(value, row, index) {
				if(value)
					return publicFun.timeFormat(new Date(value), 'yyyy/MM/dd');
			}
		},
		{
			field : 'plnStaStr',
			title : '状态',
			width : setWidth(0.08)
		},
		{
			field : 'fuvTim',
			title : '随访日期',
			width : setWidth(0.08),
			formatter : function(value, row, index) {
				if(value)
					return publicFun.timeFormat(new Date(value), 'yyyy/MM/dd');
			}
		},
		{
			field : 'crtUsrNme',
			title : '制定者',
			width : setWidth(0.08),
		},
		]
	];
    $(function () {
		$("#fuvplndg").height(height-56);
		$('.datagrid-wrap').height(height-56)
        $('#fuvplndg').datagrid({
            striped: true,
            singleSelect: true,
            pagination: true,
            rownumbers: true,
            pageList: [8, 15, 25],
            columns: columns_pln
        });
    })
</script>
</html>