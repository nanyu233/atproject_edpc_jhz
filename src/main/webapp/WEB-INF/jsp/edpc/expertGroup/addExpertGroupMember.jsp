<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/base/tag.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>新增随访组成员</title>
    <%@ include file="/WEB-INF/jsp/base/common_css.jsp"%>
    <link rel="stylesheet" type="text/css" href="${baseurl}styles/common/tableStyle.css">
    <link rel="stylesheet" type="text/css" href="${baseurl}styles/hems/global.css">
</head>
<style>
.form table th {
		width: 110px !important;
	}
	.form table td {
		width: 170px;
	}
	#usrname {
		width: 114px;
	}
	.form a.easyui-linkbutton {
		display: inline-block;
		float: none;
	}
	.docName {
		position: relative;
	}
    
.abnScoList, .divselect, .doctorList {
    position: absolute;
    top: 28px;
    left: 3px;
    width: 136px;
    z-index: 3;
    max-height: 130px;
    background: rgb(30, 144, 255);
    border: 1px solid #ddd;
    cursor: default;
    overflow-y: scroll;
}
</style>
<body class="addcompctl">
    <form class="form" id="addExpertForm" action="${baseurl}expertGroup/addExpertGroupMemberSubmit.do" method="post">
        <table style="width:100%">
            <colgroup>
                <col width="30%" />
                <col />
            </colgroup>
            <tbody>
                <tr>
                    <th><i class="red">*</i> 随访组序号:</th>
                    <td>
                        <input type="text" id="grpSeq" name="grpSeq" readonly="true"/>
                    </td>
                </tr>
                <tr>
                    <th><i class="red">*</i> 随访组名称:</th>
                    <td>
                        <input type="text" id="grpNam" name="grpNam" readonly="true"/>
                    </td>
                </tr>
                <tr>
                    <th><i class="red">*</i> 随访名称:</th>
                    <td class="docName">
                    	<input type="hidden" id="eptNo" name="eptNo"/>
                        <input type="text" id="usrname" name="usrname" autocomplete="off" placeholder="请输入关键字查询"/>
                        <div class="doctorList" id="doctorList"></div>
                        <%-- <label class="error errortip" id="doctip"></label> --%>
                        <a href="javascript:;" class="easyui-linkbutton btnemp" iconCls="icon-search" id="doctorParamSearch" onclick="addinvitationDoc()">查询</a>
                    </td>
                </tr>
                <tr>
                    <th><i class="red">*</i> 随访类型:</th>
                    <td>
                        <select id="eptTyp" name="eptTyp" class="li-input-s">
                        	<option value="0">请选择</option>
                        	<option value="1">组长</option>
                        	<option value="2">副组长</option>
                        	<option value="9">成员</option>
                        </select>
                    </td>
                </tr>
                 <!-- <tr>
                    <th>是否院前急救联系人:</th>
                    <td>
                    	<label><input type="radio" name="wxpFlg" value="0" checked/>否</label>
                    	<label><input type="radio" name="wxpFlg" value="1"/>是</label>
                    </td>
                </tr> -->
                <tr>
                    <td colspan="2" class="last_td center" style="padding-top: 10px">
                        <a href="javascript:void(0);" class="easyui-linkbutton" iconCls="icon-add" id="submitbtn" onclick="insertGroupMemeber()">新增</a>
                        <a href="javascript:void(0);" class="easyui-linkbutton" iconCls="icon-cancel" id="closebtn" onclick="parent.closemodalwindow()">关闭</a>
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
        $(function () {
        	var node = parent.getNode();
        	$("#grpSeq").val(node.grpSeq);
        	$("#grpNam").val(node.grpNam);
        	// $("#doctip").hide();
        })

        function validateForm() {
            return $("#addExpertForm").validate({
                rules: {
                    "grpSeq": "required",
                    "grpNam": "required",
                    "eptNo" :"required",
                    "usrname": "required"
                },
                messages: {
                    "grpSeq": "请确认随访组序号",
                    "grpNam": "请输入随访组名称",
                    "eptNo" : "请通过查询获取随访列表后选择随访",
                    "expertname": "请通过查询获取随访列表后选择随访",
                }
            }).form();
        }
        //用户机构
        function insertGroupMemeber() {
            if (validateForm()) {
                jquerySubByFId("addExpertForm", insertGroupMemeber_callback, null, "json");
            }
        }
        //新增的回调函数
        function insertGroupMemeber_callback(data) {
            message_alert(data);
            parent.init();
            parent.closemodalwindow();
        }
        //查询医生
        function addinvitationDoc(){
            var doctorParam = $("#usrname").val();
            $.ajax({
                url: "${baseurl}user/queryDoc.do",
                type: "post",
                data: {
                    queryLike: doctorParam
//                     cstDepCod: ""
                }
            }).done(function(res) {
                var doctorListDom = "";
                $("#doctorList").show();
                if (res.length) {
                	// $("#doctip").hide();
                    // $("#doctorList").show();
                    $.each(res, function(idx, val) {
                        doctorListDom += "<li class=\"doctor\" onclick=\"chooseDoctor('" + val.usrno + "','" + val.usrname + "')\">" + val.usrname + "</li>";
                    });
                    doctorListDom = "<ul>" + doctorListDom + "</ul>";
                } else {
                    doctorListDom = "<li style='text-align:center;font-size:12px;font-style:italic;color:#ccc'>没有查询到相关数据</li>";
                    // $("#doctorList").hide();
                    // $("#doctip").show();
                    // $("#doctip").text("无数据")
                } 
                $("#usrname").val("");
                $("#doctorList").html(doctorListDom);
            })
        }
        function chooseDoctor(id, name) {
        	console.log("此时的id是：" + id);
            $("#usrname").val(name);
            $("#eptNo").val(id);
            $("#doctorList").html("");
            $("#doctorList").hide();

            if (sessionStorage.getItem("isValidateFormForHzdj") == "true") {
                validateForm()
            }
        }
				$('body').click(function(){
					$('#doctorList').hide();
				})
    </script>
</body>

</html>
