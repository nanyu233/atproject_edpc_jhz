<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<div class="form">
    <div class="row" style="min-height:30px;">
        <div class="search-btn" onclick="toFuvInf()" style="margin-right:150px;">随访详情</div>
    </div>
    <div class="row">
        <div class="search-btn" onclick="editFuvInf()">随访修改</div>
    </div>
</div>
<table id=fuvinfdg></table>
<script>
	var xtMzCodArr = publicFun.getDict('XT_MZ_COD');
	var fuvplnArr = publicFun.getDict('PLN_STA');
	var fuvwayCodArr = publicFun.getDict('XT_FUV_WAY_COD');//随访方式
	var height = $('#container').height()*0.5;
  	//详情
    function toFuvInf() {
      	var checkData = $('#fuvinfdg').datagrid('getSelected');
	    if (checkData) {
	        var url = 'followup/tofuvadd.do?plnSeq='+checkData.plnSeq+'&patId='+checkData.patId+'&fuvSeq='+checkData.fuvSeq+'&showSaveButton=0';
	        window.top.addTab('随访详情-' + checkData.patNam+'-'+checkData.plnSeq, url, 'icon icon-emergency-record');
      	}else{
	      	publicFun.alert('未选中记录');
	    }
    }
    
    //修改
    function editFuvInf(){
    	var checkData = $('#fuvinfdg').datagrid('getSelected');
	    if (checkData) {
	        var url = 'followup/tofuvadd.do?plnSeq='+checkData.plnSeq+'&patId='+checkData.patId+'&fuvSeq='+checkData.fuvSeq;
	        window.top.addTab('随访修改-' + checkData.patNam+'-'+checkData.plnSeq, url, 'icon icon-emergency-record');
      	}else{
	      	publicFun.alert('未选中记录');
	    }
    }
   

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

	var column_fuvinf = [ 
		[{
			field : 'fuvSeq',	
			title : '随访编号',
			width : setWidth(0.05)
		},
		{
			field : 'patNam',	
			title : '姓名',
			width : setWidth(0.05)
		},
		{
			field : 'patnnnnn',	
			title : '病种',
			width : setWidth(0.05)
		},
		{
			field : 'fuvWayCod',
			title : '随访方式',
			width : setWidth(0.05),
            formatter : function(value, row, index) {
            	if(value)
                	return publicFun.codingEscape(fuvwayCodArr,value);
                else
                	return '';
            }
		},
		{
			field : 'fuvTim',
			title : '随访日期',
			width : setWidth(0.08),
			formatter : function(value, row, index) {
				if(value)
					return publicFun.timeFormat(new Date(value), 'yyyy/MM/dd ');
			}
		},
		{
			field : 'plnSta',
			title : '状态',
			width : setWidth(0.05),
            formatter : function(value, row, index) {
                return publicFun.codingEscape(fuvplnArr,value);
            }
		},
		{
			field : 'docNam',
			title : '随访医生',
			width : setWidth(0.05),
		},
		{
			field : 'fuvGrpNam',
			title : '随访组',
			width : setWidth(0.08),
		},
	]];
    $(function () {
		$("#fuvinfdg").height(height-56);
		$('.datagrid-wrap').height(height-56)
        $('#fuvinfdg').datagrid({
            striped: true,
            singleSelect: true,
            pagination: true,
            rownumbers: true,
            pageList: [8, 15, 253],
            columns: column_fuvinf
        });
    })
</script>
</html>