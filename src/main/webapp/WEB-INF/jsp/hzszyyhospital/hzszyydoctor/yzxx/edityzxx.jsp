<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/base/tag.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
<title>修改医嘱</title>
<%@ include file="/WEB-INF/jsp/base/common_css.jsp"%>
<link rel="stylesheet" type="text/css" href="${baseurl}css/common/tableStyle.css">
<link rel="stylesheet" type="text/css" href="${baseurl}css/hems/global.css?78">
<%@ include file="/WEB-INF/jsp/base/common_js.jsp"%>
<script type="text/javascript">
    var _emgSeq = '${emgSeq}',
        _name = '${hspDocadviceInfCustom.docadviceNam}',
        _docContent = '${hspDocadviceInfCustom.docadviceContent}',
        _time = '${hspDocadviceInfCustom.docadviceDatisString}';
</script>
</head>

<body class="addyzxx">
<div>
    <form class="form" id="editForm" action="${baseurl}zyylqbl/edityzxx.do">
        <table>
            <colgroup>
                <col width="18%" />
                <col />
            </colgroup>
            <tbody>
                <tr>
                    <th>医嘱时间：</th>
                    <td>
                        <input class="Wdate spcWdate"  id="timeInput" name="HspDocadviceInfCustom.docadviceIsdat" type="text" onclick="WdatePicker({dateFmt:'yyyy/MM/dd HH:mm:ss'})" style="width:200px">
                    </td>
                </tr>
                <tr>
                    <th>医师：</th>
                    <td>
                        <input type="text" id="username" maxlength="10" name="HspDocadviceInfCustom.docadviceNam" readonly unselectable='on' style="width:200px">
                    </td>
                </tr>
                <tr>
                    <th>医嘱信息：</th>
                    <td>
                        <input type="text" id="docadviceSeq" class="hidden" name="hspDocadviceInfCustom.docadviceSeq" value="${hspDocadviceInfCustom.docadviceSeq}" >
                        <input type="text" id="docadviceFlag" class="hidden" name="hspDocadviceInfCustom.docadviceFlag">
                        <input type="text" id="docadviceWay" class="hidden" name="hspDocadviceInfCustom.docadviceWay">
                        <input type="text" id="docadviceYyjl" class="hidden" name="hspDocadviceInfCustom.docadviceYyjl">
                        <input type="text" id="docadviceType" class="hidden" name="hspDocadviceInfCustom.docadviceType">
                        <input type="text" id="docadviceMainflg" class="hidden" name="hspDocadviceInfCustom.docadviceMainflg">
                        <input type="text" id="docadviceBz" class="hidden" name="hspDocadviceInfCustom.docadviceBz">
                        <input type="text" id="sl" class="hidden" name="hspDocadviceInfCustom.sl">
                        <input type="text" id="px" class="hidden" name="hspDocadviceInfCustom.px">
                        <input type="text" id="vstCad" class="hidden" name="hspDocadviceInfCustom.vstCad">
                        <input type="text" id="gyfsmc" class="hidden" name="hspDocadviceInfCustom.gyfsmc">
                        <textarea id="docMsg" name="hspDocadviceInfCustom.docadviceContent" style="width:200px"></textarea>
                    </td>
                </tr>
                <tr>
                    <td colspan="2" class="last_td">
                        <div class="center grp_btn">
                            <a class="easyui-linkbutton" iconCls="icon-ok" id="submitbtn" onclick="saveMsg()">确定</a>
                            <a class="easyui-linkbutton" iconCls="icon-cancel" id="closebtn" onclick="parent.closemodalwindow()">关闭</a>
                        </div>
                    </td>
                </tr>
            </tbody>
        </table>
    </form>
    <script type="text/javascript">
        function saveMsg(){
            jquerySubByFId('editForm', edit_callback, null, "json");
        }
        function edit_callback(data) {
            message_alert(data);
            var type = data.resultInfo.type;
            if (type == 1) {
                parent.$('#jcbglist').datagrid('reload');
                parent.$('#jcbglist').datagrid('clearSelections'); 
                parent.closemodalwindow();
            }
        }
        function getParentMsg(){
        	var selectRow = parent.$('#jcbglist').datagrid('getSelected');
        	if(selectRow['docadviceFlag']==1){
                var _fieldList = ['docadviceSeq', 'docadviceFlag', 'docadviceWay', 'docadviceYyjl', 'docadviceType', 'docadviceMainflg', 'docadviceBz', 'px', 'sl', 'vstCad', 'gyfsmc'];
                for (var i = 0; i < _fieldList.length; i++) {
                    document.getElementById(_fieldList[i]).value = selectRow[_fieldList[i]]
                }
        		$('#timeInput').val(selectRow['docadviceDatisString']);
        		$('#username').val(selectRow['docadviceNam']);
        		$('#docMsg').val(selectRow['docadviceContent']);
        	}
        }
        $(function(){
            $('#docMsg').val(_docContent);
            $('#timeInput').val(_time);
            $('#username').val(_name);
            getParentMsg();
        })
    </script>
</div>
</body>
</html>
