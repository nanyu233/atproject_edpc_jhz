<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/base/tag.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
    </head>
    <body>
        <script type="text/javascript">
            function initBaseHtmlDom() {
                var initBaseHtmlDom = [];
                initBaseHtmlDom.push(
                    '<p style="margin:0;padding:1mm 0 0 0;text-align:center;font-size:.42cm;line-height:1.5;">${hospitalPlatformNameGap}</p>',
                    '<p style="margin:2mm 0;padding:0;text-align:center;font-weight:700;font-size:.58cm;">危急值病程</p>',
                    '<p style="margin:0;padding:0;font-size:.38cm;line-height:1.5;color:#333;">病人姓名：${hspemginfCustom.cstNam}&emsp;&emsp;性别：${hspemginfCustom.cstSexCod}&emsp;&emsp;年龄：', '${hspemginfCustom.cstAge}'&&'${hspemginfCustom.cstAgeCod}' || '__/__', '&emsp;&emsp;科别：${hspemginfCustom.emgFkCod}&emsp;&emsp;病历号：${hspemginfCustom.mpi}&emsp;&emsp;留观号：', '${hspemginfCustom.observationCode}' || '__/__', '</p><hr style="margin:0 0 1mm 0;"/ >'
                )
                return initBaseHtmlDom.join('');
            }
            
            function initHtmlDom(row, idx){
                var initHtmlDomList = [];
                initHtmlDomList.push(
                    '<div style="margin:0;padding:0 5mm;width:190mm;font-family:\5fae\8f6f\96c5\9ed1;">',
                    initBaseHtmlDom(),
                    '<p style="margin:0;padding:0;font-size:.38cm;">',
                    '<span style="color:#000;font-weight:bold">危急值及报告时间：</span>',
                    '</p>',
                    '<p style="margin:0;padding:0;font-size:.38cm;">',
                    '<span style="color:#000;">',row['reportingTime'],'</span>',
                    '</p>',
                    // '<br/>',
                    // '<p style="margin:0;padding:0;font-size:.38cm;">',
                    // '<span style="color:#000;font-weight:bold">危急值数据临床意义：</span>',
                    // '</p>',
                    // '<p style="margin:0;padding:0;font-size:.38cm;">',
                    // '<span style="color:#000;">',row['criticalSignificance'],'</span>',
                    // '</p>',
                    '<br/>',
                    '<p style="margin:0;padding:0;font-size:.38cm;">',
                    '<span style="color:#000;font-weight:bold">处理措施：</span>',
                    '</p>',
                    '<p style="margin:0;padding:0;font-size:.38cm;">',
                    '<span style="color:#000;">',row['treatmentMeasures'],'</span>',
                    '</p>',
                    '<br/>',
                    '<div style="float:left;width:35%;text-align:left;list-style:none;margin-left:65%;padding-bottom:2mm;font-size:.38cm;">',
                    '<label>医师签名：</label><span>',row['createNam'],'</span>',
                    '</div>',
                    
                    '<div style="float:left;width:35%;text-align:left;list-style:none;margin-left:65%;padding-bottom:2mm;font-size:.38cm;">',
                    '<label class="lab-span">日期：</label><span>',row['courseDateStr'],'</span>',
                    '</div>',
                    '</div>')
                return initHtmlDomList.join('');
            }
            
            function printall(){
                
                try {
                    // LODOP = window.top.getLodop();
                    LODOP = getLodop();
                    LODOP.PRINT_INITA(0, 0, '210mm', '297mm', '打印控件功能演示_Lodop功能_超文本内容缩放打印');
                    LODOP.SET_PRINT_PAGESIZE(0, '210mm', '297mm', '');
                    LODOP.SET_PRINT_MODE('NOCLEAR_AFTER_PRINT', true);
                    LODOP.SET_PRINT_STYLE('FontSize', 10); // 设置打印字体
                    var allRows = $('#criticaltable').datagrid('getData')['rows'];
                    for (var i = 0; i < allRows.length; i++) {
                        LODOP.ADD_PRINT_HTM(3, 0, '100%', '100%', initHtmlDom(allRows[i], i));
                        LODOP.NewPageA();
                    }
                    LODOP.ADD_PRINT_HTM(1050, 344, '90%', '100%', '<font style=\"font-size:12px\" format=\"0\"><span tdata=\"pageNO\">第##页</span>/<span tdata=\"pageCount\">共##页</span></font>');
                    LODOP.SET_PRINT_STYLEA(0, 'ItemType', 1);
                    LODOP.PREVIEW();
                    //LODOP.PRINT();
                } catch (e) {
                    $.messager.alert('提示信息', '数据存在某些问题，请刷新后重试', 'warning');
                }
            }
        </script>
    </body>
</html>