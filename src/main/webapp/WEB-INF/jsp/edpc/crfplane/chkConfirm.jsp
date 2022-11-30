<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/base/tag.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <title>审核确认页面</title>
    <%@ include file="/WEB-INF/jsp/base/common_css.jsp"%>
    <%@ include file="/WEB-INF/jsp/base/common_js.jsp"%>
    <link rel="stylesheet" type="text/css" href="${baseurl}css/common/tableStyle.css">
    <style type="text/css">
        table{
           margin: 10px;
        }
        table th {
            width: 12%;
            text-align: right;
            background: rgb(243,249,255);
        }
        table td{
            width: 38%;
            text-align: left;
        }
        table td,table th {
            padding: 3px;
            border: 1px solid #ddd;
        }
        textarea {
            resize:none;
        }
    </style>
</head>
<body>
    <div>
        <table>
            <th>审核意见：</th>
            <td>
                <textarea id="chkMsg" style="height: 200px; width: 100%;"></textarea>
            </td>
        </table>
    </div>
    <div class="center grp_btn">
        <a class="easyui-linkbutton" iconCls="" id="pass" onclick="chkResult('pass')">通过</a>
        <a class="easyui-linkbutton" iconCls="" id="nopass" onclick="chkResult('nopass')">驳回</a>
        <a class="easyui-linkbutton" iconCls="" id="closebtn" onclick="parent.closemodalwindow()">关闭</a>
    </div>
    <script type="text/javascript">
        var regSeqArr = parent.chkRegSeqArr;
        function chkResult(chkFlag) {
            //不通过确认
            var rcdSta = '4';
            if("nopass" === chkFlag) {
                rcdSta = '3';
                _confirm('确认审核驳回？', function () {
                    return false;
                }, function() {
                    commitFun();
                });
            } else {
                commitFun();
            }

            function commitFun() {
                //审核意见
                var chkMsg = $('#chkMsg').val();
                var requestData = {
                    'regSeq': regSeqArr.join(),
                    'rcdSta': rcdSta,
                    'chkMsg': chkMsg

                };
                publicFun.httpRequest(
                    '${baseurl}crfplane/reviewSubmit.do',
                    requestData,
                    {
                        'ajaxType': 'post',
                        'requestType': 'json'
                    },
                    function (res) {
                        if (res.resultInfo.success){
                            if(parent.search){
                                parent.search();
                            }
                            parent.closemodalwindow()
                        }
                    }
                )
            }
        }
    </script>
</body>
</html>