<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/base/tag.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <title>交班管理</title>
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
        if ($("#jiaoName").is(":focus")) {
          searchUser();
          flg = false;
        }
        if ($("#zdjieName").is(":focus")) {
          searchUserName();
          flg = false;
        }
        return flg;
      })
    };

    $("body").click(function () {
      $("#userList").hide();
      $("#userNameList").hide();
    });

    function searchUser() {
      if (event.keyCode == 13) {
        publicFun.SearchList("jiaoName", "userList")
      }
    }

    function searchUserName() {
      if (event.keyCode == 13) {
        publicFun.SearchList("zdjieName", "userNameList")
      }
    }

      function setTime() {
        var _today = publicFun.timeFormat(new Date(), 'yyyy/MM/dd hh:mm:ss');
        if('${hspJjbglInfCustom.jiaoDat}' != null&& '${hspJjbglInfCustom.jiaoDat}' != ''){
          $('#jiaoTime').val(publicFun.timeFormat(dateToGMT('${hspJjbglInfCustom.jiaoDat}'), 'yyyy/MM/dd hh:mm:ss'));
        }else{
          $("#jiaoTime").val(_today);
        }
        
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

      function dateToGMT(strDate){
        var dateStr = strDate.split(" ");  
        var strGMT = dateStr[0]+" "+dateStr[1]+" "+dateStr[2]+" "+dateStr[5]+" "+dateStr[3]+" GMT+0800";  
        var date = new Date(Date.parse(strGMT));
        return date;
      }
      
      function delJjbgl(_emgSeq){
        var requestParam = {'jjbglSeq':_jjbglSeq,'emgSeq':_emgSeq};
        _confirm('确定解绑此患者么？', null, function() {
          publicFun.httpServer({url:_baseurl+'jjbgl/unbind.do'},requestParam,function(res){
            message_alert(res);
            if (res.resultInfo.type == '1') {
              setTimeout("parent.closemodalwindow()", 1000);
              queryJiao();
            }
          })
        })
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
        var height = 0.5 * ($("#tabs", parent.document).height() - 34 - 18);
        var width = 0.8 * ($("#tabs", parent.document).width()-20);
         $("#jjbgllist").height(height);
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
            width: getWidth(0.05)
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
              width: getWidth(0.11),
			        formatter:function(value ,row,index){
                var str = "<span class='url-link'><a href=javascript:delJjbgl('"+row.emgSeq+"')>解绑</a> | <a href=javascript:openLqbl()>留抢病历</a> | <a href=javascript:openHljl()>护理记录</a></spa>"
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

      function setBc(){
        var jiaoTime = $('#jiaoTime').val().slice(10);
        var thisDay =  publicFun.timeFormat(new Date(),'yyyy/MM/dd');
        var curTime = new Date(thisDay+jiaoTime).getTime();
        var value = isDuringTime(curTime);
        $("input[name='jiaoBc'][value="+value+"]").attr("checked",true);
        
      }

      function isDuringTime(curTime){
        var thisDay =  publicFun.timeFormat(new Date(),'yyyy/MM/dd');
        var dayBegin = new Date(thisDay +' 08:00:00').getTime(),
            dayEnd = new Date(thisDay+' 17:00:00').getTime(),
            nightEnd = new Date(thisDay+' 01:00:00').getTime();
        if(curTime>dayBegin && curTime <= dayEnd){
          return 'RB'
        }else if(curTime>nightEnd && curTime <= dayBegin){
          return 'HYB'
        }else{
          return 'QYB'
        }
        
      }

      function getData(){
        if('${hspJjbglInfCustom.jiaoUsrnam}' != ''){
          $('#jiaoName').val('${hspJjbglInfCustom.jiaoUsrnam}');
        }
        if('${hspJjbglInfCustom.jiaoUsrno}' != ''){
          $('#jiaoNameNum').val('${hspJjbglInfCustom.jiaoUsrno}');
        }
        $('#zdjieName').val('${hspJjbglInfCustom.zdjbUsrnam}');
        $('#zdjieNameNum').val('${hspJjbglInfCustom.zdjbUsrno}');
      }

	    //加载datagrid
	    $(function() {
        setTime();
        setBc();
        getData();
        getDatagrid();
      })
      function addNewjiao(){
        createmodalwindow("新增交班病人", 880, 493, '${baseurl}jjbgl/queryadd.do?jjbtype=' + "${jjbtype}");
      }

      function ryhlMsg(idx){
        var rowData = $('#jjbgllist').datagrid('getSelected');
        if (GridUtils.checkChecked(rowData)) {
          var _symSitDes;
          if(rowData.symSitDes == null){
            _symSitDes = '无；'
          }else{
            _symSitDes = rowData.symSitDes
          }
          
          var Msg = $('#'+idx).val();
          $('#'+idx).val(Msg+_symSitDes);
        }
      }

      function insertjiao_callback(data) {
        message_alert(data);
        if (data.resultInfo.type == '1') {
          var menuName = parent.$('#tabs').tabs('getSelected').panel('options').title;
          setTimeout('parent.$("#tabs").tabs("close","' + menuName + '")', 1000);
        }
      }

      function saveJiao(){
        var jiaoTime = $('#jiaoTime').val();
        var jiaoName = $('#jiaoName').val();
        var jiaoBc = $("input[name='jiaoBc']:checked").val();
        if (jiaoName == null || jiaoName == "") {
          alert_error('交班人员必填!');
        } else if (jiaoTime == null || jiaoTime == "") {
          alert_error('交班时间必填!')
        }else if (jiaoBc == null || jiaoBc == "") {
          alert_error('交班班次必填!')
        }else{
          _confirm('确定提交吗？', null, function () {
            jquerySubByFId('jiaoform', insertjiao_callback, null, "json");
          })
        }
      }

      function patientMsg(idx){
        var rowData = $('#jjbgllist').datagrid('getSelected');
        var _patientMsg;
        if (GridUtils.checkChecked(rowData)) {
          var _emgDat = publicFun.timeFormat(rowData.emgDat, 'yyyy/MM/dd hh:mm:ss');
          var _jbdzDes,_cstAge,_cstSexCod,_emgDepCod;
          if(rowData.jbzdDes == null){
            _jbdzDes = '无；'
          }else{
            _jbdzDes = rowData.jbzdDes
          }
          if(rowData.cstSexCod == null){
            _cstSexCod = '未知'
          }else{
            _cstSexCod = rowData.cstSexCod
          }
          if(rowData.cstAge == null){
            _cstAge = '未知'
          }else{
            _cstAge = rowData.cstAge+rowData.cstAgeCod
          }
          if(rowData.emgDepCod == null){
            _emgDepCod = '未知'
          }else{
            _emgDepCod = rowData.emgDepCod
          }

          _patientMsg = '患者姓名：'+rowData.cstNam+'，收治时间：'+_emgDat+'，性别：'+_cstSexCod+'，年龄：'+_cstAge
          +'，急诊分级：'+_emgDepCod+'，诊断：'+_jbdzDes;
          var Msg = $('#'+idx).val();
          $('#'+idx).val(Msg+_patientMsg);
        }
      }

      function getCurrentBoxHeight() {
        var _bdHeight = document.documentElement.clientHeight || document.body.clientHeight;
        var _tabHeight = _bdHeight - 10;
        if (_bdHeight > 570) {
          _tabHeight = 570;
        }
        return _tabHeight;
      }

      function getCurrentBoxWidth() {
        var _bdWth = document.documentElement.clientWidth || document.body.clientWidth;
        var _tabWth = _bdWth - 10;
        if (_bdWth > 1000) {
          _tabWth = 1000;
        }
        return _tabWth;
      }

      function jyxxTemplate(idx){
        var openModalWindowName = '检验信息';
        var rowData = $('#jjbgllist').datagrid('getSelected');
        if (GridUtils.checkChecked(rowData)) {
          var openModalWindowUrl = BaseUrl + 'zyyqjs/toexamineinfo.do?emgSeq=' + rowData.emgSeq + '&valName=' + idx;
          createmodalwindow(openModalWindowName, getCurrentBoxWidth(), getCurrentBoxHeight(), openModalWindowUrl);
        }
      }

      function jcxxTemplate(idx) {
        var openModalWindowName = '检查信息';
        var rowData = $('#jjbgllist').datagrid('getSelected');
        if (GridUtils.checkChecked(rowData)) {
          var openModalWindowUrl = BaseUrl + 'zyyqjs/querycheckinfo.do?emgSeq=' + rowData.emgSeq + '&valName=' + idx;
          createmodalwindow(openModalWindowName, getCurrentBoxWidth(), getCurrentBoxHeight(), openModalWindowUrl);
        }
      }

      function showTem(idx) {
        $('#'+idx).css("display", "block");
      }
      function closeTemp(idx) {
        $('#'+idx).css("display", "none");
      }
//jyxxTemplate
//jcxxTemplate
    </script>
  <!-- 查询列表 -->
<form id="jiaoform" action="${baseurl}jjbgl/jiaobancommit.do" method="post">
  <div class="queryJjb">
    <input type="text" class="hidden" value="${jjbglSeq}" name="jjbglSeq"/>
    <input type="text" class="hidden" value="${jjbtype}" name="jjbtype"/>
    <ul id="jiaoUl" class="jjbUl">
      <li class="oneLi">
          <div class="top-title">交班患者</div>
          <div class="editjjb"></div>
      </li>
      <li class="oneLi">
          <a class="commonbtn" href="javascript:;" onclick="addNewjiao()">添加</a>
      </li>
      <li class="oneLi">
          <table id="jjbgllist"></table>
      </li>
      <li class="halfLi">
        普通患者数：<span id="ptPatient">0</span>人
        <input type="text" class="hidden" id="pthzs" name="pthzs"/>
      </li>
      <li class="halfLi">
        危重患者数：<span id="wzPatient">0</span>人
        <input type="text" class="hidden" id="wzhzs" name="wzhzs"/>
      </li>
      <li class="oneLi">
        <div class="top-title">普通交班日志</div>
        <a class="my-linkbutton btna atitle" data-options="toggle:true,plain:true" onclick="showTem('temdivP')">[导入]</a>
        <div class="editjjb"></div>
        <div class="temdiv" id="temdivP" style="display:none">
          <input type="button" class="commonbtn m-l10" value="患者信息" onclick="patientMsg('ptDaily')" />
          <input type="button" class="commonbtn m-l10" value="入院护理信息" onclick="ryhlMsg('ptDaily')" />
          <input type="button" class="commonbtn m-l10" value="检验信息" onclick="jyxxTemplate('ptDaily')" />
          <input type="button" class="commonbtn m-l10" value="检查信息" onclick="jcxxTemplate('ptDaily')" />
          <img class="closeImg" src="${baseurl}images/hzszyyhems/note/1.png" alt="删除" onclick="closeTemp('temdivP')" />
        </div>
      </li>
      <li class="oneLi">
        <textarea class="longTextArea" id="ptDaily" name="jiaoPtcontent">${hspJjbglInfCustom.jiaoPtcontent}</textarea>
      </li>

      <li class="oneLi">
        <div class="top-title">危重交班日志</div>
        <a class="my-linkbutton btna atitle" data-options="toggle:true,plain:true" onclick="showTem('temdivW')">[导入]</a>
        <div class="editjjb"></div>
        <div class="temdiv" id="temdivW" style="display:none">
          <input type="button" class="commonbtn m-l10" value="患者信息" onclick="patientMsg('wzDaily')" />
          <input type="button" class="commonbtn m-l10" value="入院护理信息" onclick="ryhlMsg('wzDaily')" />
          <input type="button" class="commonbtn m-l10" value="检验信息" onclick="jyxxTemplate('wzDaily')" />
          <input type="button" class="commonbtn m-l10" value="检查信息" onclick="jcxxTemplate('wzDaily')" />
          <img class="closeImg" src="${baseurl}images/hzszyyhems/note/1.png" alt="删除" onclick="closeTemp('temdivW')" />
        </div>
      </li>
      <li class="oneLi">
        <textarea class="longTextArea" id="wzDaily" name="jiaoWzcontent">${hspJjbglInfCustom.jiaoWzcontent}</textarea>
      </li>
      <li class="oneLi">
        <i class="red">*</i>班次：
        <label><input type="radio" id="bc1" name="jiaoBc" value="RB" checked="checked"/>日班</label>
        <label><input type="radio" id="bc2" name="jiaoBc" value="QYB"/>前夜班</label>
        <label><input type="radio" id="bc3" name="jiaoBc" value="HYB"/>后夜班</label>
      </li>
      <li class="thirdLi">
        <i class="red">*</i>交班时间：
        <input id="jiaoTime" class="Wdate spcWdate" type="text" name="jiaoDat" onchange="setBc()" onclick="WdatePicker({dateFmt:'yyyy/MM/dd HH:mm:ss'})">
      </li>
      <li class="thirdLi">
        <span><i class="red">*</i>交班人员：</span>
        <div class="listDiv">
          <input id="jiaoName" value="${activeUser.usrname}" class="spcWdate" type="text" name="jiaoUsrnam">
          <input type="text" class="hidden" id="jiaoNameNum" value="${activeUser.usrno}" name="jiaoUsrno"/>
          <div class="userList" id="userList">
        </div>
      </li>
      <li class="thirdLi">
        <span>指定接班人员：</span>
        <div class="listDiv">
            <input id="zdjieName" class="spcWdate" type="text" name="zdjbUsrnam" >
            <input type="text" class="hidden" id="zdjieNameNum" name="zdjbUsrno"/>
            <div class="userList" id="userNameList">
        </div>
      </li>
      <li class="oneLi">
        <div class="container-fluid" style="text-align: center;">
          <a class="easyui-linkbutton" iconcls="icon-ok" id="save" onclick="saveJiao()">保存</a>
        </div>
      </li>
    </ul>
  </div>
</form>
</body>
</html>