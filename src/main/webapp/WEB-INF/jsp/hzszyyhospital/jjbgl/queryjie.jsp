<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/base/tag.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <title>接班管理</title>
  <%@ include file="/WEB-INF/jsp/base/common_css.jsp"%>
  <link rel="stylesheet" type="text/css" href="${baseurl}css/hems/global.css" />
  <link rel="stylesheet" type="text/css" href="${baseurl}css/hzszyyhems/precheck/jjbgl.css" />
  <%@ include file="/WEB-INF/jsp/base/common_js.jsp"%>
</head>
<body class="jiaoban">
  <script type="text/javascript">
    var _baseurl = "${baseurl}",
        _jjbglSeq = '${jjbglSeq}';
    var comdata = { cstNam: '', emgSeq: '', baseUrl: '${baseurl}', username: '${sessionScope.activeUser.usrname}' };
    document.onkeydown = function (evt) {
      publicFun.keyDownRecall(evt, function () {
        var flg = true;
        if ($("#jieName").is(":focus")) {
          searchUserName();
          flg = false;
        }
        return flg;
      })
    };

    $("body").click(function () {
      $("#userNameList").hide();
    });

    function searchUserName() {
      if (event.keyCode == 13) {
        publicFun.SearchList("jieName", "userNameList")
      }
    }

    function dateToGMT(strDate){
      var dateStr = strDate.split(" ");  
      var strGMT = dateStr[0]+" "+dateStr[1]+" "+dateStr[2]+" "+dateStr[5]+" "+dateStr[3]+" GMT+0800";  
      var date = new Date(Date.parse(strGMT));
      return date;
    }

    function setTime() {
      var _today = publicFun.timeFormat(new Date(), 'yyyy/MM/dd hh:mm:ss');
      if('${hspJjbglInfCustom.jieDat}' != null && '${hspJjbglInfCustom.jieDat}' != ''){
        $('#jieTime').val(publicFun.timeFormat(dateToGMT('${hspJjbglInfCustom.jieDat}'), 'yyyy/MM/dd hh:mm:ss'));
      }else{
        $("#jieTime").val(_today);
      }
      $("#jiaoTime").val(publicFun.timeFormat(dateToGMT('${hspJjbglInfCustom.jiaoDat}'), 'yyyy/MM/dd hh:mm:ss'));
      
    };

      function getWidth(proportion) {
        var width = $("body").width();
        return Math.round(proportion * width);
      }

      function reload(){
      }

      function queryJiao(){
        $("#jjbgllist").datagrid('reload');
      }

      function openHljl(){
        var rowData = $('#jjbgllist').datagrid('getSelected');
        var leftBedNam = '';
        if (rowData.emgBed != null) {
          leftBedNam = rowData.emgBed + '-';
        }
        var openTabUrl = '${baseurl}jjbgl/hljl.do?emgSeq='+ rowData.emgSeq + '&cstNam=' + rowData.cstNam
        var openTabName = leftBedNam + rowData.cstNam + '-护理记录';
        parent.opentabwindow(openTabName, openTabUrl, '0');

      }

      function openLqbl(){
        var rowData = $('#jjbgllist').datagrid('getSelected');
        var openTabUrl = '${baseurl}zyyxtpg/toLeftWrap.do?emgSeq='+ rowData.emgSeq + '&cstNam=' + rowData.cstNam + '&zgcount=' + rowData.zgcount + '&pageSrc=qjsCase' + '&th=' + new Date().getTime();
        var bedNam = '';
        if(rowData.emgBed != null){
          bedNam = rowData.emgBed+'-'
        }
        var openTabName = bedNam + rowData.cstNam + '-留抢病历记录';
        parent.opentabwindow(openTabName, openTabUrl, '0');
      }

      function getDatagrid(){
        var height = 0.5* ($("#tabs", parent.document).height() - 34 - 18);
        var width = 0.8 * ($("#tabs", parent.document).width()-20);
         $("#jjbgllist").height(height);
         $("#jjbgllist").width(width);
        var width = $('#jieUl').width();
        $("#jjbgllist").width(width);
         
        var columns_v = [
          [{
              field: 'qtsjSeq',
              title: '编号 ',
              hidden: true,
          },{
              field: 'emgSeq',
              title: '编号 ',
              hidden: true,
          },{
              field: 'symSitDes',
              title: '主诉 ',
              hidden: true,
          },{
            field: 'emgType',
            title: '类型',
            width: getWidth(0.03),
            sortable: true,
            formatter: function (value, row, index) {
	            if (value === 'W') {
	              return "<div class=\"levelAbg\">危重</div>";
	            }  else if (value === 'P') {
	              return "<div class=\"levelDbg\">普通</div>";
	            }
            }
          }, {
            field: 'emgDat',
            title: '收治时间',
            width: getWidth(0.1),
            formatter: function (value, row, index) {
              return value ? publicFun.timeFormat(value, 'yyyy/MM/dd hh:mm:ss') : '';
            }
          }, {
            field: 'mpi',
            title: '病历号',
            width: getWidth(0.06)
          }, {
            field: 'cstNam',
            title: '患者姓名',
            width: getWidth(0.05)
          }, {
            field: 'cstSexCod',
            title: '性别',
            width: getWidth(0.03)
          }, {
            field: 'cstAge',
            title: '年龄',
            sortable: true,
            width: getWidth(0.03),
            formatter: function (value, row, index) {
              if (value != null && value != "") {
                return value + "" + row.cstAgeCod
              } else {
                return value;
              }
            }
          }, {
            field: 'emgDepCod',
            title: '急诊分级',
            width: getWidth(0.04),
            formatter: function (value, row, index) {
              if (value == "I级") {
                return "<div class=\"levelAbg\">I级</div>";
              } else if (value == "II级") {
                return "<div class=\"levelBbg\">II级</div>";
              } else if (value == "III级") {
                return "<div class=\"levelCbg\">III级</div>";
              } else if (value == "IVa级") {
                return "<div class=\"levelDbg\">IVa级</div>";
              } else if (value == "IVb级") {
                return "<div class=\"levelDbg\">IVb级</div>";
              }
            }
          }, {
            field: 'cstDspCod',
            title: '首诊状态',
            width: getWidth(0.05)
          }, {
            field: 'emgFkCod',
            title: '分科',
            width: getWidth(0.07)
          },{
            field: 'jbzdDes',
            title: '诊断',
            width: getWidth(0.18)
          }, {
            field: 'emgBed',
            title: '床号',
            width: getWidth(0.03)
          },{
              field: 'cz',
              title: '操作',
              width: getWidth(0.09),
			        formatter:function(value ,row,index){
                var str = "<span class='url-link'><a href=javascript:openLqbl()>留抢病历</a> | <a href=javascript:openHljl()>护理记录</a></span>"
                return str
              }
          }]
        ];
        $('#jjbgllist').datagrid({
          nowrap: false,
          striped: true,
          singleSelect: true,
          url: _baseurl+'jjbgl/queryglhz_result.do',
          idField: 'jjbglSeq',
          loadMsg: '',
          queryParams: {
            'hspJjbhzmxCustom.jjbglSeq':'${jjbglSeq}'
          },
          columns: columns_v,
          pagination: true,
          rownumbers: false,
          pageList: [20, 30, 50],
          onLoadSuccess: function(data) {
              if(data.rows.length>0){
                $('#ptPatient').html(data['rows'][0].pthzs);
                $('#pthzs').val(data['rows'][0].pthzs);

                $('#wzPatient').html(data['rows'][0].wzhzs);
                $('#wzhzs').val(data['rows'][0].wzhzs);
              }
          }
        });
      }

      function getData(){
        $('#jiaoName').val('${hspJjbglInfCustom.jiaoUsrnam}');
        $('#jiaoNameNum').val('${hspJjbglInfCustom.jiaoUsrno}');
        if('${hspJjbglInfCustom.jieUsrnam}' != '' ){
          $('#jieName').val('${hspJjbglInfCustom.jieUsrnam}');
        }
        if('${hspJjbglInfCustom.jieUsrno}' != ''){
          $('#jieNameNum').val('${hspJjbglInfCustom.jieUsrno}');
        }
        $('#zdjieName').val('${hspJjbglInfCustom.zdjbUsrnam}');
        $('#zdjieNameNum').val('${hspJjbglInfCustom.zdjbUsrno}');
      }

	    //加载datagrid
	    $(function() {
        setTime();
        getData();
        getDatagrid();
      })

      function insertjie_callback(data) {
        message_alert(data);
        if (data.resultInfo.type == '1') {
          var menuName = parent.$('#tabs').tabs('getSelected').panel('options').title;
          setTimeout('parent.$("#tabs").tabs("close","' + menuName + '")', 1000);
        }
      }

      function saveJiao(){
        var jieTime = $('#jieTime').val();
        var jieName = $('#jieName').val();
        if (jieName == null || jieName == "") {
          alert_error('接班人员必填!');
        } else if (jieTime == null || jieTime == "") {
          alert_error('接班时间必填!')
        }else{
          _confirm('确定提交吗？', null, function () {
            jquerySubByFId('jieform', insertjie_callback, null, "json");
          })
        }
      }

//jyxxTemplate
//jcxxTemplate
    </script>
  <!-- 查询列表 -->
<form id="jieform" action="${baseurl}jjbgl/jiebancommit.do" method="post">
  <div class="queryJjb queryTabs">
    <input type="text" class="hidden" value="${jjbglSeq}" name="jjbglSeq"/>
    <ul class="jjbUl" id="jieUl">
      <li class="oneLi">
          <div class="top-title">交班患者</div>
          <div class="editjjb"></div>
      </li>
      <li class="oneLi">
          <table id="jjbgllist"></table>
      </li>
      <li class="halfLi">
        普通患者数：<span id="ptPatient">0</span>人
        <input type="text" class="hidden" id="pthzs" readonly/>
      </li>
      <li class="halfLi">
        危重患者数：<span id="wzPatient">0</span>人
        <input type="text" class="hidden" id="wzhzs" readonly/>
      </li>
      <li class="oneLi">
        <div class="top-title">普通交班日志</div>
        <div class="editjjb"></div>
      </li>
      <li class="oneLi">
        <textarea class="longTextArea" id="ptDaily" disabled>${hspJjbglInfCustom.jiaoPtcontent}</textarea>
      </li>

      <li class="oneLi">
        <div class="top-title">危重交班日志</div>
        <div class="editjjb"></div>
      </li>
      <li class="oneLi">
        <textarea class="longTextArea" id="wzDaily" disabled>${hspJjbglInfCustom.jiaoWzcontent}</textarea>
      </li>
      <li class="oneLi">
        <i class="red">*</i>班次：
        <label><input type="radio" id="bc1" name="jiaoBc" disabled value="RB" checked="checked" <c:if test="${hspJjbglInfCustom.jiaoBc eq 'RB'}">
          checked="checked"</c:if>/>日班</label>
        <label><input type="radio" id="bc2" name="jiaoBc" disabled value="QYB"  <c:if test="${hspJjbglInfCustom.jiaoBc eq 'QYB'}">
          checked="checked"</c:if>/>前夜班</label>
        <label><input type="radio" id="bc3" name="jiaoBc" disabled value="HYB"  <c:if test="${hspJjbglInfCustom.jiaoBc eq 'HYB'}">
          checked="checked"</c:if>/>后夜班</label>
      </li>
      <li class="thirdLi">
        <i class="red">*</i>交班时间：
        <input id="jiaoTime" class="Wdate spcWdate" type="text" readonly>
      </li>
      <li class="thirdLi">
        <i class="red">*</i>交班人员：
        <input id="jiaoName" value="${activeUser.usrname}" class="spcWdate" readonly type="text">
      </li>
      <li class="thirdLi">
        指定接班人员：
        <input id="zdjieName" class="spcWdate" type="text" readonly>
      </li>
      <li class="oneLi">
        <div class="top-title">接班信息</div>
        <br/>
        <div class="editjjb"></div>
      </li>
      <li class="thirdLi">
        <i class="red">*</i>接班时间：
        <input id="jieTime" class="Wdate spcWdate" type="text" name="jieDat" onclick="WdatePicker({dateFmt:'yyyy/MM/dd HH:mm:ss'})">
      </li>
      <li class="thirdLi">
        <span><i class="red">*</i>接班人员：</span>
        <div class="listDiv">
          <input id="jieName" class="spcWdate" value="${activeUser.usrname}" type="text" name="jieUsrnam" >
          <input type="text" class="hidden" id="jieNameNum" name="jieUsrno" value="${activeUser.usrno}"/>
          <div class="userList jieList" id="userNameList">
        </div>
      </li>
      <li class="oneLi">接班日志：</li>
      <li class="oneLi">
        <textarea class="longTextArea" id="jieContent" name="jieContent">${hspJjbglInfCustom.jieContent}</textarea>
      </li>

      <li class="oneLi">
        <div class="container-fluid">
          <a class="easyui-linkbutton" iconcls="icon-ok" id="save" onclick="saveJiao()">保存</a>
        </div>
      </li>
    </ul>
  </div>
</form>
</body>
</html>