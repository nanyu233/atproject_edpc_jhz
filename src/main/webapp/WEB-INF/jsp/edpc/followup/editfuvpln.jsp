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
    <form class="form" id="fuvplnform" action="${baseurl}followup/tofuvpln.do" method="post">
        <table>
            <colgroup>
                <col width="100" />
                <col />
            </colgroup>
            <tbody>
                <tr>
                    <th>患者姓名：</th>
                    <td>
                        <input type="text" id="pln_patNam" name="patNam"  value="${hspFuvPlnCustom.patNam}" />
                    </td>
                    <th>分类：</th>
                    <td>
                        <input type="text" id="plnFuvTyp" name="plnFuvTyp"/>
                    </td>
                </tr>
                <tr>
                    <th>计划编号：</th>
                    <td>
                        <input type="text" id="pln_plnSeq" name="plnSeq"  value="${hspFuvPlnCustom.plnSeq}"/>
                    </td>
                    <th>计划随访日期：</th>
                    <td>
                        <input type="text" id="pln_plnFuvTim" name="plnFuvTim" value="${hspFuvPlnCustom.plnFuvTim}"/>
                    </td>
                </tr>
                <tr>
                    <th>状态：</th>
                    <td>
                        <input type="text" id="pln_plnStaStr" value="${hspFuvPlnCustom.plnStaStr}" />
                    </td>
                    <th>实际随访日期：</th>
                    <td>
                        <input type="text" id="pln_fuvTim" name="fuvTim" value="${hspFuvPlnCustom.fuvTim}" />
                    </td>
                </tr>
                <tr>
                    <th>是否已读：</th>
                    <td>
                        <input type="text" id="pln_almRedFlg" name="almRedFlg" value="${hspFuvPlnCustom.almRedFlg}" />
                    </td>
                    <th>已读时间：</th>
                    <td>
                        <input type="text" id="pln_almRedTim" name="almRedTim" maxlength="20" value="${hspFuvPlnCustom.almRedTim}" />
                    </td>
                </tr>
                <tr>
                    <th>计划制定者：</th>
                    <td>
                        <input type="text" id="pln_crtUsrNme" name="crtUsrNme"  value="${hspFuvPlnCustom.crtUsrNme}" />
                    </td>
                    <th>制定时间：</th>
                    <td>
                        <input type="text" id="pln_crtTim" name="crtTim"  value="${hspFuvPlnCustom.crtTim}" />
                    </td>
                </tr>
            </tbody>
        </table>
    </form>
    <%@ include file="/WEB-INF/jsp/base/common_js.jsp"%>
    <script type="text/javascript" src="${baseurl}lib/validate/jquery.validate.js"></script>
    <script type="text/javascript">
        
        $(function(){
        	if('${hspFuvPlnCustom.plnFuvTim}'){
				var plnFuvTim = publicFun.timeFormat(new Date('${hspFuvPlnCustom.plnFuvTim}'), 'yyyy/MM/dd');
				$("#pln_plnFuvTim").val(plnFuvTim);
			}
			if('${hspFuvPlnCustom.fuvTim}'){			
				var fuvTim = publicFun.timeFormat(new Date('${hspFuvPlnCustom.fuvTim}'), 'yyyy/MM/dd');
				$("#pln_fuvTim").val(fuvTim);			
			}
			if('${hspFuvPlnCustom.almRedTim}'){			
				var almRedTim = publicFun.timeFormat(new Date('${hspFuvPlnCustom.almRedTim}'), 'yyyy/MM/dd');
				$("#pln_almRedTim").val(almRedTim);			
			}
			if('${hspFuvPlnCustom.crtTim}'){			
				var crtTim = publicFun.timeFormat(new Date('${hspFuvPlnCustom.crtTim}'), 'yyyy/MM/dd');
				$("#pln_crtTim").val(crtTim);			
			}
			if('${hspFuvPlnCustom.almRedFlg}'){			
				var almRedFlg = '${hspFuvPlnCustom.almRedFlg}'=='1'?'已读':'未读';
				$("#pln_almRedFlg").val(almRedFlg);			
			}
			if('${hspFuvPlnCustom.plnFuvTyp}'){			
				var plnFuvTyp = publicFun.codingEscape(publicFun.getDict("PLN_FUV_TYP"),'${hspFuvPlnCustom.plnFuvTyp}');
				$("#plnFuvTyp").val(plnFuvTyp);			
			}
        })
    </script>
</body>

</html>
