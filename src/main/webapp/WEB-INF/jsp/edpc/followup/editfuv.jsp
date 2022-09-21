<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/base/tag.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <title>患者详情</title>
    <%@ include file="/WEB-INF/jsp/base/common_css.jsp"%>
    <link rel="stylesheet" type="text/css" href="${baseurl}styles/common/tableStyle.css">
</head>

<body class="updatesta">
    <form class="form" id="staform" action="${baseurl}followup/tofuvpat.do" method="post">
        <table>
            <colgroup>
                <col width="100" />
                <col />
            </colgroup>
            <tbody>
                <tr>
                </tr>
                <tr>
                    <th>患者姓名：</th>
                    <td>
                        <input type="text" id="pat_staNo" name="patNam"  value="${hspFuvPatCustom.patNam}" />
                    </td>
                    <th>患者性别：</th>
                    <td>
                        <input type="text" id="pat_cstSexCod" name="cstSexCod"  value="${hspFuvPatCustom.cstSexCodStr}" />
                    </td>
                </tr>
                <tr>
                    <th>患者年龄：</th>
                    <td>
                        <input type="text" id="pat_age" name="patAge"/>
                    </td>
                    <th>出生日期：</th>
                    <td>
                        <input type="text" id="pat_bthDat" name="bthDat"/>
                    </td>
                </tr>
                <tr>
                    <th>民族：</th>
                    <td>
                        <input type="text" id="pat_patNatCod" name="patNatCod" value="${hspFuvPatCustom.patNatCodStr}" />
                    </td>
                    <th>职业：</th>
                    <td>
                        <input type="text" id="pat_patJob" name="hspStaInfCustom.patJob" value="${hspFuvPatCustom.patJob}" />
                    </td>
                </tr>
                <tr>
                    <th>婚姻状况：</th>
                    <td>
                        <input type="text" id="pat_marStaCod" name="marStaCod" value="${hspFuvPatCustom.marStaCodStr}" />
                    </td>
                    <th>联系方式：</th>
                    <td>
                        <input type="text" id="pat_lnkNbr" name="lnkNbr" maxlength="20" value="${hspFuvPatCustom.lnkNbr}" />
                    </td>
                </tr>
                <tr>
                    <th>地址：</th>
                    <td colspan="3">
                        <input type="text" id="pat_patAdr" name="patAdr" style="width:200px;" value="${hspFuvPatCustom.patAdr}" />
                    </td>
                </tr>
                <tr>
                    <th>证件号码：</th>
                    <td>
                        <input type="text" id="pat_idNbr" name="idNbr" maxlength="20" value="${hspFuvPatCustom.idNbr}" />
                    </td>
                    <th>电话：</th>
                    <td>
                        <input type="text" id="pat_patTel" name="patTel" maxlength="15" value="${hspFuvPatCustom.patTel}" />
                    </td>
                </tr>
                <tr>
                    <th>上次随访时间：</th>
                    <td>
                        <input type="text" id="pat_lstFuvTim" name="lstFuvTim" value="${hspFuvPatCustom.lstFuvTim}" />
                    </td>
                    <th>下次随访时间：</th>
                    <td>
                        <input type="text" id="pat_plnFuvTim" name="plnFuvTim" value="${hspFuvPatCustom.plnFuvTim}" />
                    </td>
                </tr>
                <tr>
                    <th>状态：</th>
                    <td>
                        <input type="text" id="sta_staLng" name="fuvSta" value="${hspFuvPatCustom.fuvStaStr}" />
                    </td>
                    <th>剩余期数：</th>
                    <td>
                        <input type="text" id="" name="lftNum" value="${hspFuvPatCustom.lftNum}" />
                    </td>
                </tr>
            </tbody>
        </table>
    </form>
     <script type="text/javascript" src="${baseurl}lib/easyui1.3/jquery-1.8.0.min.js"></script>
    <%@ include file="/WEB-INF/jsp/base/common_js.jsp"%>
    <script type="text/javascript" src="${baseurl}lib/jquery.form.min.js"></script>
    <script type="text/javascript" src="${baseurl}lib/validate/jquery.validate.js"></script>
    <script type="text/javascript">
        $(function(){
	        var bthDat = '${hspFuvPatCustom.bthDat}';
        	var bthDatStr = publicFun.timeFormat(new Date(bthDat), 'yyyy/MM/dd');
        	$("#pat_bthDat").val(bthDatStr);
			var age = (publicFun.calculateAge(bthDatStr).Age+publicFun.calculateAge(bthDatStr).typeStr);
			$("#pat_age").val(age);
			if('${hspFuvPatCustom.plnFuvTim}'){
				var plnFuvTim = publicFun.timeFormat(new Date('${hspFuvPatCustom.plnFuvTim}'), 'yyyy/MM/dd');
				$("#pat_plnFuvTim").val(plnFuvTim);
			}
			if('${hspFuvPatCustom.lstFuvTim}'){			
				var lstFuvTim = publicFun.timeFormat(new Date('${hspFuvPatCustom.lstFuvTim}'), 'yyyy/MM/dd');
				$("#pat_lstFuvTim").val(lstFuvTim);			
			}
        })
    </script>
</body>

</html>
