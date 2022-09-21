<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/base/tag.jsp"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
String conturl = (String)request.getAttribute("conturl");
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
  <title>知情同意书模本</title>
  <base href="<%=basePath%>">
  <%@ include file="/WEB-INF/jsp/base/common_css.jsp"%>
  <%@ include file="/WEB-INF/jsp/base/common_js.jsp"%>
  <link rel="stylesheet" type="text/css" href="${baseurl}css/hzszyyhems/contstyle.css" />
  <link rel="stylesheet" type="text/css" href="${baseurl}css/hzszyyhems/hzszyydoctor/printDoc/doc.css?v=${versionDay}" />
  <script type="text/javascript" src="${baseurl}/js/subpageJs/hzszyyhospital/consent.js"></script>
  <script src="${baseurl}lib/avalon1.4.8/avalon.js" type="text/javascript" charset="UTF-8"></script>
  <script language="javascript" src="${baseurl}Lodop6.216/LodopFuncs.js"></script>
</head>

<body>
  <form class="at-form at-form--inline">
    <input type="hidden" id="refseqno" value="${refseqno}" />
    <input type="hidden" id="tempno" value="${tempno}" />
    <input type="hidden" id="tempname" value="${tempname}" />
    <input type="hidden" id="seqno" value="${seqno}" />
    <input type="hidden" id="qmHash" value="${qmHash}" />
    <input type="hidden" id="qmTag" value="${qmTag}" />
    <input type="hidden" id="content" value="" />
    <input type="hidden" id="texthtml" value="" />
  </form>
  <div class="table-container" id="mainView">
    <c:if test="${seqno !=null&&seqno!=''}">
      ${texthtml}
    </c:if>
    <c:if test="${seqno ==null||seqno==''}">
      <jsp:include page="<%=conturl%>"></jsp:include>
    </c:if>
  </div>
  <div class="tools-container">
    <p class="at-tools clr" id="atTools">
      <a class="commonbtn" href="javascript:;" id="signBtn" onclick="getSign()">签名</a>
      <a class="commonbtn" href="javascript:;" id="print" onclick="handoverSheetAdd('p')">打印</a>
      <a class="commonbtn" href="javascript:;" onclick="handoverSheetAdd()" id="save">保存</a>
      <a class="commonbtn" href="javascript:;" onclick="handoverSheetLb()">显示列表</a>
    </p>
  </div>
  <script type="text/javascript">
    $(document).keydown(function (event) {
      switch (event.keyCode) {
        case 18:
          event.preventDefault();
        case 116:
          event.preventDefault();
        case 122:
          event.preventDefault();
      }
    });

    function setParam($div) {
      $div.each(function () {
        switch (this.type) {
          case 'text': this.setAttribute('value', this.value); break;
          case 'checkbox':
          case 'radio':
            if (this.checked) this.setAttribute('checked', 'checked');
            else this.removeAttribute('checked');
            break;
          case 'select':
            this.setAttribute('value', this.value); break;
            break;
          case 'select-one':
          case 'select-multiple':
            $(this).find('option').each(function () {
              if (this.selected) this.setAttribute('selected', 'selected');
              else this.removeAttribute('selected');
            });
            break;
          case 'textarea':
            this.innerHTML = this.value;
            break;
        }
      });
      return true;
    }

    //初始化
    function init() {
      var seqno = $("#seqno").val();
      if (!seqno) {
        getBasicMsg();
      }
    }

    function getBasicMsg() {
      var _obj = {requestSource: '', cstNam: '', mpi: '', jzxh: ''}, _url = '';
      if (parent.noHisObj && parent.noHisObj.requestSource === 'HIS_NO_PATIENT') {
        _url = 'hisMedical/findHspemginfCustombyAjax_HIS.do';
        for (var key in _obj) {
          _obj[key] = parent.noHisObj[key]
        }
      } else {
        _url = 'zyyconsent/findHspemginfCustombyAjax.do';
      }
      _obj.emgSeq = $('#refseqno').val();
      publicFun.httpServer({ url: '${baseurl}' + _url}, _obj, function (data) {
        var _res = data.resultInfo.sysdata.hspemginfCustom;
        var _list = ['cstNam', 'cstSexCod', 'emgBed', 'vstCad','mpi','jbzdDes','cstAge'];
        $.each(_list, function (idx, val) {
          $('.' + val).val(_res[val])
        })
        if (_res['cstAge']) {
          $('.age').val(_res['cstAge'] + _res['cstAgeCod'])
        }
      })
      $('.emgFkCod').val('急诊科门诊')
    }

    //初始化 判断登陆用户角色是否有权限对该医师进行操作
    function checkRole() {
      var cjz = '';
      if('${cratNbr}' == '' || '${cratNbr}' == null){
        cjz = '${sessionScope.activeUser.usrno}'
      }else{
        cjz = '${cratNbr}'
      }
      $('#mainView input').attr('disabled', false);
      $('#mainView textarea, #mainView select').attr('readonly', false);
      $('.atitle').show();
      $('#s3000 .printHide').show();
      publicFun.httpServer({ url: '${baseurl}zyylqbl/checkRoleAjax.do' }, { "cratNbr": cjz }, function (data) {
        //规则判断，若是1，则有操作权限，若是0，则隐藏操作按钮
        if (parent.pageFlg) {
          $('#save').hide()
          $("#signBtn").hide()
          setPageDisable();
        } else {
          if (data.resultInfo.message == "nurse") {
            $("#save").hide();
            $("#signBtn").hide();
            $('#print').attr('onclick','onlyPrint()');
            setPageDisable();
          }else if(data.resultInfo.message == "doctor"){
            $("#save").hide();
            $('#print').attr('onclick','onlyPrint()');
            setPageDisable();
          }
        }
         //日志、归档病历、留抢病历 游客无权限
        if(data.resultInfo.message == "tourist"){
            $("#save").hide();
            $("#signBtn").hide();
            $("#print").hide();
            setPageDisable();
        }
      })
    }

    function setPageDisable () {
      $('#mainView input').attr('disabled', true);
      $('#mainView textarea, #mainView select').attr('readonly', true);
      $('.atitle').hide();
      $('#s3000 .printHide').hide();
    }

    /**
     * @ 签名
     */
    function getSign() {
      var refseqno = $("#refseqno").val();
      var tempno = $("#tempno").val();
      var tempname = $("#tempname").val();
      var qmHash = $("#qmHash").val();
      var qmTag = $("#qmTag").val();
      var seqno = $("#seqno").val();
      if (seqno != null && seqno != '') {
        publicFun.httpServer(
          { url: '${baseurl}zyylqbl/getSign.do' },
          {
            "emgSeq": refseqno, "relevanceId": seqno, "documentTable": 'HSP_CONSENT_INF', "templateId": qmHash,
            "request172": tempname, "tag": qmTag
          },
          function (res) {
            if (res.resultInfo.type == 1) {
              findDzqmImg();
            }
            message_alert(res);
            setTimeout("$('.messager-body').window('close')", 1000);
          })
      } else {
        publicFun.alert("请先保存数据。");
      }
    }

    function findDzqmImg() {
      var seqno = $("#seqno").val();
      if (seqno != null && seqno != '') {
        publicFun.httpServer(
          { url: '${baseurl}zyylqbl/findDzqmImg.do' },
          { "relevanceId": seqno, "documentTable": 'HSP_CONSENT_INF' },
          function (res) {
            if (res.resultInfo.type != 1) {
              message_alert(res);
              return false;
            }
            $("#dzqm").html('');
            var imgList = res.resultInfo.sysdata.hspAotographInfoCustomList;
            for (var i = 0; i < imgList.length; i++) {
              var img = $("<img />")
              $("#dzqm").append(img.attr({ "src": "data:image/jpeg;base64," + res.resultInfo.sysdata.hspAotographInfoCustomList[i].docImg, "width": 88 }));
            }
          })
      }
    }

    //保存
    function handoverSheetAdd(isPrintType) {
      var refseqno = $("#refseqno").val();
      var tempno = $("#tempno").val();
      var tempname = $("#tempname").val();
      var seqno = $("#seqno").val();
      var qmHash = $("#qmHash").val();
      var qmTag = $("#qmTag").val();
      var texthtml = "";

      var getlogo = '';
      if ((tempno - 0) >= 3000 || tempno == '1034' || tempno == '1055'|| tempno == '1056') {
        var $mainView = $('#mainView').find("input, textarea, select");
        setParam($mainView);
        texthtml = $('#mainView').html();
        getlogo=texthtml.replace('images','../images');
        $('#content').val(texthtml);
        content = texthtml;
      } else {
        if (getparam()) {
          texthtml = document.getElementById('texthtml').value;
        } else {
          texthtml = "";
        }
        var content = "";
        if (getText()) {
          content = $("#content").val();
          if (content == "" || content == null) {
            alert("模板内容不能为空。");
            return;
          }
        } else {
          return;
        }
      }
      if($('#areaVal')){
        $('#spanVal').html($('#areaVal').val())
      }
      publicFun.httpServer({ url: '${baseurl}zyyconsent/addConsentInfSubmit.do' }, {
        "hspConsentInfCustom.refseqno": refseqno,
        "hspConsentInfCustom.tempno": tempno,
        "hspConsentInfCustom.tempname": tempname,
        "hspConsentInfCustom.texthtml": texthtml,
        "hspConsentInfCustom.content": content,
        "hspConsentInfCustom.seqno": seqno,
        "hspConsentInfCustom.qmHash": qmHash,
        "hspConsentInfCustom.qmTag": qmTag
      }, function (data) {
        if (data.resultInfo.messageCode == 906) {
          $("#seqno").val(data.resultInfo.message);
          if (isPrintType && isPrintType == 'p') {
            try {
              LODOP = getLodop();
              LODOP.PRINT_INITA(0, 0, "210mm", "297mm", "打印控件功能演示_Lodop功能_超文本内容缩放打印");
              LODOP.SET_PRINT_PAGESIZE(0, "210mm", "297mm", "");
              LODOP.SET_PRINT_MODE("NOCLEAR_AFTER_PRINT", true);
              if ((tempno - 0) >= 3000 || tempno == '1034' || tempno == '1055'|| tempno == '1056') { 
                var strStyleCSS = "<link rel='stylesheet' type='text/css' href='${baseurl}css/hzszyyhems/hzszyydoctor/printDoc/printDoc.css?v=${versionDay}'>";
                LODOP.ADD_PRINT_HTM(3, 0, '100%', '99%', strStyleCSS + getlogo); 
              } else {
                var strStyleCSS = "<link rel='stylesheet' type='text/css' href='${baseurl}css/hzszyyhems/contPrint.css'>";
                LODOP.ADD_PRINT_HTM("0%", "8%", "84%", "92%", strStyleCSS + document.getElementById("content").value);
              }
              LODOP.NewPageA();
              LODOP.SET_PRINT_STYLE("FontSize", 10);
              //LODOP.SET_PRINTER_INDEX("ZDesigner GK888t");
              LODOP.PREVIEW();
              //LODOP.PRINT();
            } catch (e) {
              $.messager.alert('提示信息', '数据存在某些问题，请刷新后重试', 'warning');
            }
          } else {
            $.messager.alert('提示信息', '操作成功', 'success');
            setTimeout(function(){
              $(".messager-body").window('close');    
            },1000);
          }
        } else {
          message_alert(data.resultInfo.message);
        }
      })
    }

    function onlyPrint(){
      var refseqno = $("#refseqno").val();
      var tempno = $("#tempno").val();
      var tempname = $("#tempname").val();
      var seqno = $("#seqno").val();
      var qmHash = $("#qmHash").val();
      var qmTag = $("#qmTag").val();
      var texthtml = "";
      if ((tempno - 0) >= 3000 || tempno == '1034' || tempno == '1055'|| tempno == '1056') {
        var $mainView = $('#mainView').find("input, textarea, select");
        setParam($mainView);
        texthtml = $('#mainView').html();
        $('#content').val(texthtml);
        content = texthtml;
      } else {
        if (getparam()) {
          texthtml = document.getElementById('texthtml').value;
        } else {
          texthtml = "";
        }
        var content = "";
        if (getText()) {
          content = $("#content").val();
          if (content == "" || content == null) {
            alert("模板内容不能为空。");
            return;
          }
        } else {
          return;
        }
      }
      if($('#areaVal')){
        $('#spanVal').html($('#areaVal').val())
      }
      try {
        LODOP = getLodop();
        LODOP.PRINT_INITA(0, 0, "210mm", "297mm", "打印控件功能演示_Lodop功能_超文本内容缩放打印");
        LODOP.SET_PRINT_PAGESIZE(0, "210mm", "297mm", "");
        LODOP.SET_PRINT_MODE("NOCLEAR_AFTER_PRINT", true);
        if ((tempno - 0) >= 3000 || tempno == '1034' || tempno == '1055'|| tempno == '1056') { 
          var strStyleCSS = "<link rel='stylesheet' type='text/css' href='${baseurl}css/hzszyyhems/hzszyydoctor/printDoc/printDoc.css?v=${versionDay}'>";
          LODOP.ADD_PRINT_HTM(3, 0, '100%', '99%', strStyleCSS + $('#mainView').html()); 
        } else {
          var strStyleCSS = "<link rel='stylesheet' type='text/css' href='${baseurl}css/hzszyyhems/contPrint.css'>";
          LODOP.ADD_PRINT_HTM("0%", "8%", "84%", "92%", strStyleCSS + document.getElementById("content").value);
        }
        LODOP.NewPageA();
        LODOP.SET_PRINT_STYLE("FontSize", 10);
        //LODOP.SET_PRINTER_INDEX("ZDesigner GK888t");
        LODOP.PREVIEW();
        //LODOP.PRINT();
      } catch (e) {
        $.messager.alert('提示信息', '数据存在某些问题，请刷新后重试', 'warning');
      }
    }

    /**
     * 显示列表
     */
    function handoverSheetLb() {
      window.location = '${baseurl}zyyconsent/queryConsentInf.do?refseqno=${refseqno}';
    }
    
    /**
     * id:选择项的ID
    * valu：提示内容
    */
    function onBlurShow(id, valu) {
      var val = document.getElementById(id).value
      if (val == "" || val == valu) {
        document.getElementById(id).value = valu;
      }
    }
    /**
     * id:选择项的ID
    * valu：提示内容
    */
    function onFocusShow(id, valu) {
      var val = document.getElementById(id).value
      if (val == valu || val == "") {
        document.getElementById(id).value = "";
      }
    }

    $(function () {
      var height = parent.$('#main').height() - 67;
      $('.table-container').height(height);
      init();
      checkRole();
      findDzqmImg();
    })
  </script>
</body>

</html>