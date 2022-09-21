<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/base/tag.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
        <title>病程记录</title>
        <%@ include file="/WEB-INF/jsp/base/common_css.jsp"%>
        <link rel="stylesheet" type="text/css" href="${baseurl}css/hzszyyhems/hzszyydoctor/diseasecourse.css">
        <%@ include file="/WEB-INF/jsp/base/common_js.jsp"%>
        <script type="text/javascript" src="${baseurl}lib/easyui1.3/jquery-1.8.0.min.js"></script>
        <script type="text/javascript" src="${baseurl}lib/easyui1.3/jquery.easyui.min.js"></script>   
    </head>

    <body>
        <div class="selectdiv">
            分类：
            <input type="radio" id="firstdisease" name="selecttype" value="firstdisease" checked="checked" onchange="selectType()"/><label for="firstdisease">首次病程</label> &emsp;
            <input type="radio" id="daily" value="daily" name="selecttype" onchange="selectType()"/><label for="daily">日常病程</label> &emsp;
            <input type="radio" id="operation" value="operation" name="selecttype" onchange="selectType()"/><label for="operation">手术操作病程</label> &emsp;
            <input type="radio" id="critical" value="critical" name="selecttype" onchange="selectType()"/><label for="critical">危急值病程</label> &emsp;
            <!-- <input type="button" class="commonbtn m-l10" value="查询" onclick="selectType()"/> -->
            <input type="hidden" value="${emgSeqDc}" id="emgSeq"/>
        </div>
        <div class="cutoff2" id="blueline"></div>
        <div>
            <div class="maindiv">    
            </div>
            <!-- <div class="cutoff"></div> -->
            <div class="btndiv">
                <input type="button" class="commonbtn m-l10" value="显示列表" id="showList" onclick="selectType()"/>
                <input type="button" class="commonbtn m-l10" value="新增" id="add" onclick="addData()"/>
                <input type="button" class="commonbtn m-l10" value="修改" id="edit" onclick="editData()"/>
                <input type="button" class="commonbtn m-l10" value="保存" id="save" onclick="saveForm()"/>
                <input type="button" class="commonbtn m-l10" value="删除" id="delete" onclick="delForm()"/>
                <input type="button" class="commonbtn m-l10" value="打印" id="print" onclick="printForm()"/>
            </div>
            <div class="hrrr" id="cutline"></div>
        </div> 
        <script type="text/javascript">
            var courseType;
            //创建生成的 iframe 嵌入页面
            function createFrame(url) {
                var content = '<iframe id ="myFrame" frameborder="0" scrolling="auto" src="' + url + '"  style="width: 100%;" onload="this.height= $(window).height() - 82"></iframe>';
                return content;
            }

            $(function(){
                $('#add').css('display','none');
                $('#edit').css('display','none');
                $('#delete').css('display','none');
                $('#showList').css('display','none');
                var _url = "${baseurl}diseaseCourse/queryFirstDiseaseQrcode.do?hspDiseaseCourseCustom.emgSeqDc=${emgSeqDc}&hspDiseaseCourseCustom.courseType=1";
                var contentDiv = createFrame(_url);
                $('.maindiv').append(contentDiv);
                courseType = '1';
            })

            function selectType(){
                var type = $('input[name="selecttype"]:checked').val();
                $('#print').css('display','inline');
                $('#delete').css('display','inline');
                $('#showList').css('display','inline');
                switch(type){
                    case 'firstdisease':
                        $('.maindiv').html('');
                        $('#cutline,#blueline').css('visibility','visible');
                        $('#add').css('display','none');
                        $('#edit').css('display','none');
                        $('#save').css('display','inline');
                        var _url = "${baseurl}diseaseCourse/queryFirstDiseaseQrcode.do?hspDiseaseCourseCustom.emgSeqDc=${emgSeqDc}&hspDiseaseCourseCustom.courseType=1";
                        var contentDiv = createFrame(_url);
                        $('.maindiv').append(contentDiv);
                        courseType = '1';
                    break;
                    
                    case 'daily':
                        $('.maindiv').html('');
                        $('#cutline,#blueline').css('visibility','hidden');
                        $('#add').css('display','inline');
                        $('#edit').css('display','inline');
                        $('#save').css('display','none');
                        var _url = "${baseurl}diseaseCourse/queryOtherDisease.do?forwardUrl=Daily&hspDiseaseCourseCustom.emgSeqDc=${emgSeqDc}";
                        var contentDiv = createFrame(_url);
                        $('.maindiv').append(contentDiv);
                        courseType = '2';
                    break;

                    case 'operation':
                        $('.maindiv').html('');
                        $('#cutline,#blueline').css('visibility','hidden');
                        $('#add').css('display','inline');
                        $('#edit').css('display','inline');
                        $('#save').css('display','none');
                        var _url = "${baseurl}diseaseCourse/queryOtherDisease.do?forwardUrl=Operation&hspDiseaseCourseCustom.emgSeqDc=${emgSeqDc}";
                        var contentDiv = createFrame(_url);
                        $('.maindiv').append(contentDiv);
                        courseType = '3';
                    break;

                    case 'critical':
                        $('.maindiv').html('');
                        $('#cutline,#blueline').css('visibility','hidden');
                        $('#add').css('display','inline');
                        $('#edit').css('display','inline');
                        $('#save').css('display','none');
                        var _url = "${baseurl}diseaseCourse/queryOtherDisease.do?forwardUrl=Critical&hspDiseaseCourseCustom.emgSeqDc=${emgSeqDc}";
                        var contentDiv = createFrame(_url);
                        $('.maindiv').append(contentDiv);
                        courseType = '4';
                    break;
                }
            }

            function saveForm (){
                document.getElementById("myFrame").contentWindow.saveForm();
            }

            function addData(){
                var type = courseType;
                switch(type){
                    case '2':
                        $('.maindiv').html('');
                        $('#cutline,#blueline').css('visibility','visible');
                        $('#save').css('display','inline');
                        $('#add').css('display','none');
                        $('#edit').css('display','none');
                        $('#print').css('display','none');
                        $('#delete').css('display','none');
                        var _url = "${baseurl}diseaseCourse/toAddOrEdit.do?forwardUrl=Daily&hspDiseaseCourseCustom.courseType=2&hspDiseaseCourseCustom.emgSeqDc=${emgSeqDc}";
                        var contentDiv = createFrame(_url);
                        $('.maindiv').append(contentDiv);
                    break;

                    case '3':
                        $('.maindiv').html('');
                        $('#cutline,#blueline').css('visibility','visible');
                        $('#save').css('display','inline');
                        $('#add').css('display','none');
                        $('#edit').css('display','none');
                        $('#print').css('display','none');
                        $('#delete').css('display','none');
                        var _url = "${baseurl}diseaseCourse/toAddOrEdit.do?forwardUrl=Operation&hspDiseaseCourseCustom.courseType=3&hspDiseaseCourseCustom.emgSeqDc=${emgSeqDc}";
                        var contentDiv = createFrame(_url);
                        $('.maindiv').append(contentDiv);
                    break;

                    case '4':
                        $('.maindiv').html('');
                        $('#cutline,#blueline').css('visibility','visible');
                        $('#save').css('display','inline');
                        $('#add').css('display','none');
                        $('#edit').css('display','none');
                        $('#print').css('display','none');
                        $('#delete').css('display','none');
                        var _url = "${baseurl}diseaseCourse/toAddOrEdit.do?forwardUrl=Critical&hspDiseaseCourseCustom.courseType=4&hspDiseaseCourseCustom.emgSeqDc=${emgSeqDc}";
                        var contentDiv = createFrame(_url);
                        $('.maindiv').append(contentDiv);
                    break;
                }
            }

            function editCourse(diseaseid){
                var type = courseType;
                switch(type){
                    case '2':
                        $('.maindiv').html('');
                        $('#cutline,#blueline').css('visibility','visible');
                        $('#save').css('display','inline');
                        $('#add').css('display','none');
                        $('#edit').css('display','none');
                        $('#print').css('display','none');
                        $('#delete').css('display','none');
                        var _url = "${baseurl}diseaseCourse/toAddOrEdit.do?forwardUrl=Daily&hspDiseaseCourseCustom.courseType=2&hspDiseaseCourseCustom.emgSeqDc=${emgSeqDc}&hspDiseaseCourseCustom.diseaseCourseSeq="+diseaseid;
                        var contentDiv = createFrame(_url);
                        $('.maindiv').append(contentDiv);
                    break;

                    case '3':
                        $('.maindiv').html('');
                        $('#cutline,#blueline').css('visibility','visible');
                        $('#save').css('display','inline');
                        $('#add').css('display','none');
                        $('#edit').css('display','none');
                        $('#print').css('display','none');
                        $('#delete').css('display','none');
                        var _url = "${baseurl}diseaseCourse/toAddOrEdit.do?forwardUrl=Operation&hspDiseaseCourseCustom.courseType=3&hspDiseaseCourseCustom.emgSeqDc=${emgSeqDc}&hspDiseaseCourseCustom.diseaseCourseSeq="+diseaseid;
                        var contentDiv = createFrame(_url);
                        $('.maindiv').append(contentDiv);
                    break;

                    case '4':
                        $('.maindiv').html('');
                        $('#cutline,#blueline').css('visibility','visible');
                        $('#save').css('display','inline');
                        $('#add').css('display','none');
                        $('#edit').css('display','none');
                        $('#print').css('display','none');
                        $('#delete').css('display','none');
                        var _url = "${baseurl}diseaseCourse/toAddOrEdit.do?forwardUrl=Critical&hspDiseaseCourseCustom.courseType=4&hspDiseaseCourseCustom.emgSeqDc=${emgSeqDc}&hspDiseaseCourseCustom.diseaseCourseSeq="+diseaseid;
                        var contentDiv = createFrame(_url);
                        $('.maindiv').append(contentDiv);
                    break;

                }
            }

            function editData(){
                $('#cutline,#blueline').css('visibility', 'visible');
                document.getElementById("myFrame").contentWindow.editMsg();
            }

            function delForm(){
                document.getElementById("myFrame").contentWindow.delMsg();
            }

            $(document).keydown(function(event) {
                switch (event.keyCode) {
                    case 18:
                        event.preventDefault();
                    case 116:
                        event.preventDefault();
                    case 122:
                        event.preventDefault();
                }
            });

            function printForm(){
                var type = courseType;
                document.getElementById("myFrame").contentWindow.printall();
            }

        </script>
    </body>
</html>
