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
                    '<div style="margin:0;padding:0;width:99%;font-family:\5fae\8f6f\96c5\9ed1;float:left;display:block">',
                    '<div style="display:block;float:left;width:15%;margin-left:5%">',
                    '<img style="width:15mm;vertical-aligh:middle;text-align:center;float:right;margin-top:1mm" src="../images/hems/print/printLogo.jpg">',
                    '</div>',
                    '<div id="titleDivJZ" style="float:left;margin:0;width:65%;text-align:center;margin-top:1mm">',
                    '<div style="font-size:0.6cm"><label id="id_title1">${nurseDocumentName}</label></div>',
                    '<div style="font-size:0.6cm;font-weight:bolder"><label id="id_title2">会诊记录单</label></div>',
                    '</div>',
                    '<p style="margin:0;padding:0;font-size:.38cm;line-height:1.5;color:#333;width:100%;display:block;float:left">姓名：${hspemginfCustom.cstNam}&emsp;&emsp;性别：${hspemginfCustom.cstSexCod}&emsp;&emsp;年龄：', '${hspemginfCustom.cstAge}' || '__/__', '${hspemginfCustom.cstAgeCod}', '&emsp;&emsp;科别：急诊科门诊&emsp;&emsp;病历号：${hspemginfCustom.mpi}&emsp;&emsp;</p><hr style="margin:1mm 0 1mm 0;float:left;width:100%"/ >',
                    '</div>'
                )
                return initBaseHtmlDom.join('');
            }
            
            function initHtmlDom(row, idx){
                var initHtmlDomList = [];
                var _imgList = row.hspAotographInfoApplyList;
                var _imgStr = '';
                if(_imgList){
                    $.each(_imgList,function(index,val){
                        _imgStr += '<img style="vertical-align: middle;height:0.46cm" src="data:image/jpeg;base64,'+val.docImg+'">'
                    })
                }
                var _imgListHF = row.hspAotographInfoReplyList;
                var _imgStrHF = '';
                if(_imgListHF){
                    $.each(_imgListHF,function(index,val){
                        _imgStrHF += '<img style="vertical-align: middle;height:0.46cm" src="data:image/jpeg;base64,'+val.docImg+'">'
                    })
                }
                initHtmlDomList.push(
                    '<div style="margin:0;padding:0 5mm;width:95%;font-family:\5fae\8f6f\96c5\9ed1;">',
                    initBaseHtmlDom(),
                    '<p style="margin:0;padding:0;font-size:.38cm;">',
                    '<div style="float:left;width:33%;font-size:.38cm;">',
                    '<span style="color:#000;">邀请会诊科室：</span>',
                    '<span style="color:#000;">',row['invitationDep'],'</span>',
                    '</div>',
                    '<div style="float:left;width:33%;font-size:.38cm;">',
                    '<span style="color:#000;">医生：</span>',
                    '<span style="color:#000;">',row['invitationDocNme'],'</span>',
                    '</div>',
                    '<div style="float:left;width:33%;font-size:.38cm;">',
                    '<span style="color:#000;">邀请会诊时间：</span>',
                    '<span style="color:#000;">',row['invitationDateStr'],'</span>',
                    '</div>',
                    '</p>',
                    '<br/>',
                    '<p style="margin:0;padding:0;font-size:.38cm;">',
                    '<span style="color:#000;font-weight:bold">病情摘要：</span>',
                    '</p>',
                    //'<p style="margin:0;padding:0;font-size:.38cm;">',
                    '<pre style="color:#000;white-space:pre-wrap;word-wrap:break-word;font-size:.38cm;margin:0;">','&emsp;&emsp;',row['illnessState'],'</pre>',
                    //'</p>',
                    '<br/>',
                    '<p style="margin:0;padding:0;font-size:.38cm;">',
                    '<span style="color:#000;font-weight:bold">会诊要求、目的：</span>',
                    '</p>',
                    //'<p style="margin:0;padding:0;font-size:.38cm;">',
                    '<pre style="color:#000;white-space:pre-wrap;word-wrap:break-word;font-size:.38cm;margin:0;">','&emsp;&emsp;',row['objective'],'</pre>',
                    //'</p>',
                    '<br/>',
                    '<div style="float:left;width:40%;text-align:left;list-style:none;margin-left:60%;padding-bottom:2mm;font-size:.38cm;">',
                    '<label>申请科室：</label><span>',row['applyDepStr'],'</span>',
                    '</div>',
                    '<div style="float:left;width:40%;margin-left:60%;text-align:left;padding-bottom:2mm;font-size:.38cm;">',
                    '<label class="lab-span">申请医生：</label><span>', row['applyDocName'] || '', '</span><span>', _imgStr, '</span>',
                    '</div>',
                    // '<div style="float:left;width:35%;text-align:left;list-style:none;padding-bottom:2mm;font-size:.38cm;">',
                    // '<label class="lab-span">电子签名：</label><span>', _imgStr, '</span>',
                    // '</div>',
                    
                    '<hr style="height:1px;border:none;border-top:1px dashed #ddd;width: 95%;"/> ',
                    
                    '<p style="margin:0;padding:0;font-size:.38cm;">',
                     '<div style="width:66%;font-size:.38cm;padding-bottom:2mm;">',
                    '<span style="color:#000;">签到时间：</span>',
                    '<span style="color:#000;">',row['consultationDateStr'],'</span>',
                    '</div>',
                    '<div style="width:33%;font-size:.38cm;">',
                    '</div>', 
                    '<div style="float:left;width:66%;font-size:.38cm;padding-bottom:2mm;">',
                    '<span style="color:#000;">答复：</span>',
                    '<span style="color:#000;">',row['replyContent'],'</span>',
                    '</div>',
                    '<div style="float:left;width:33%;font-size:.38cm;">',
                    '<span style="color:#000;">会诊时间：</span>',
                    '<span style="color:#000;">',row['replyCreateDateStr'],'</span>',
                    '</div>',
                    '</p>',
                    '</br>',
                    '<p style="margin:0;padding:0;font-size:.38cm;">',
                    '<span style="color:#000;font-weight:bold">会诊意见：</span>',
                    '</p>',
                    //'<p style="margin:0;padding:0;font-size:.38cm;">',
                    '<pre style="color:#000;white-space:pre-wrap;word-wrap:break-word;font-size:.38cm;margin:0;">','&emsp;&emsp;',row['consultationOpinion'],'</pre>',
                    //'</p>',
                    '<br/>',
                    '<div style="float:left;width:40%;text-align:left;list-style:none;margin-left:60%;padding-bottom:2mm;font-size:.38cm;">',
                    '<label class="lab-span">会诊科室：</label><span>',row['replyDepStr'],'</span>',
                    '</div>',
                    '<div style="float:left;width:40%;margin-left:60%;text-align:left;padding-bottom:2mm;font-size:.38cm;">',
                    '<label class="lab-span">会诊医生：</label><span>', row['replyDocName'] || '', '</span><span>', _imgStrHF, '</span>',
                    '</div>',
                    // '<div style="float:left;width:35%;text-align:left;list-style:none;padding-bottom:2mm;font-size:.38cm;">',
                    // '<label class="lab-span">电子签名：</label><span>', _imgStrHF, '</span>',
                    // '</div>',

                    '</div>')
                return initHtmlDomList.join('');
            }
            
            function printall(){
                var checkedRows = $('#consulttable').datagrid('getSelected');
                // console.log(checkedRows, 'checkedRows')
                // var allRows = $('#consulttable').datagrid('getData')['rows'];
                if(checkedRows){
                    try {
                    // LODOP = window.top.getLodop();
                        LODOP = getLodop();
                        LODOP.PRINT_INITA(0, 0, '210mm', '297mm', '打印控件功能演示_Lodop功能_超文本内容缩放打印');
                        LODOP.SET_PRINT_PAGESIZE(0, '210mm', '297mm', '');
                        LODOP.SET_PRINT_MODE('NOCLEAR_AFTER_PRINT', true);
                        LODOP.SET_PRINT_STYLE('FontSize', 10); // 设置打印字体
                        LODOP.ADD_PRINT_HTM(3, 0, '100%', '100%', initHtmlDom(checkedRows));
                        // for (var i = 0; i < allRows.length; i++) {
                        //     LODOP.ADD_PRINT_HTM(3, 0, '100%', '100%', initHtmlDom(allRows[i], i));
                        //     LODOP.NewPageA();
                        // }
                        LODOP.ADD_PRINT_HTM(1050, 344, '90%', '100%', '<font style=\"font-size:12px\" format=\"0\"><span tdata=\"pageNO\">第##页</span>/<span tdata=\"pageCount\">共##页</span></font>');
                        LODOP.SET_PRINT_STYLEA(0, 'ItemType', 1);
                        LODOP.PREVIEW();
                        //LODOP.PRINT();
                    } catch (e) {
                        $.messager.alert('提示信息', '数据存在某些问题，请刷新后重试', 'warning');
                    }
                } else {
                    $.messager.alert('提示信息', '请选择一条数据', 'warning');
                }                
            }
        </script>
    </body>
</html>