<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<script>
if (window.setLayout) {
  window.onresize = setLayout;
}

/**
	 * 
	 */
	var _baseUrl = '${baseurl}'
	var DAY_HOUR = 24;
	var TIME_TRANS_NUM = 60;
	var DAY_MINUTE = DAY_HOUR * TIME_TRANS_NUM;
	var DAY_MILLI_SEC = DAY_MINUTE * TIME_TRANS_NUM * 1000;
	// 
</script>
<script type="text/javascript" src="${baseurl}lib/easyui1.3/jquery-1.8.0.min.js"></script>
<script type="text/javascript" src="${baseurl}lib/easyui1.3/jquery.easyui.min.js"></script>
<script src="${baseurl}js/public.js" type="text/javascript"></script>
<script src="${baseurl}js/subpageJs/eicu/eicuUtil.js" type="text/javascript"></script>
<script src="${baseurl}js/subpageJs/eicu/icuTabUtil.js?v=${dateFlag}" type="text/javascript"></script>
<script src="${baseurl}js/subpageJs/eicu/icuOpenModal.js" type="text/javascript"></script>
