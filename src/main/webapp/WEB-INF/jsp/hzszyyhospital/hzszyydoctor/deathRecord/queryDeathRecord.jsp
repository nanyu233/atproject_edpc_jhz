<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/base/tag.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
  <title>死亡记录</title>
  <%@ include file="/WEB-INF/jsp/base/common_css.jsp"%>
  <link rel="stylesheet" type="text/css" href="${baseurl}css/hzszyyhems/hzszyydoctor/diseasecourse.css">
  <%@ include file="/WEB-INF/jsp/base/common_js.jsp"%>
</head>

<body>
  <input type="hidden" value="${emgSeqDr}" id="emgSeqDr" />
  <div>
    <div class="maindiv2">
    </div>
    <div class="hrrr" id="cutline"></div>
    <div class="btndiv">
      <input type="button" class="commonbtn m-l10" value="签名" id="sign" onclick="getSign()" />
      <input type="button" class="commonbtn m-l10" value="保存" id="save" onclick="saveForm()" />
      <!--  <input type="button" class="commonbtn m-l10" value="删除" id="delete" onclick="delDeathForm()"/> -->
      <input type="button" class="commonbtn m-l10" value="打印" id="print" onclick="saveForm('print')" />
    </div>
  </div>
  <script type="text/javascript">
    var isOpenBox; // 供子页面能够打开诊断弹框选择
    //创建生成的 iframe 嵌入页面
    function createFrame(url) {
      var thisheight = $(window).height() - 55;
      var content = '<iframe id ="myFrame" height="' + thisheight + '" frameborder="0" scrolling="auto" src="' + url + '"  style="width: 100%;"></iframe>';
      return content;
    }

    /**
   * @ 签名
   */
    function getSign() {
      document.getElementById("myFrame").contentWindow.getSign();
    }

    function saveForm(printFlg) {
      if (printFlg === 'print') {
        if (isOpenBox) {
          $('#save').attr('disabled', true);
          document.getElementById("myFrame").contentWindow.saveForm(printFlg);
        } else {
          printForm()
        }
      } else {
        $('#save').attr('disabled', true);
        document.getElementById("myFrame").contentWindow.saveForm();
      }
    }

    function delDeathForm() {
      document.getElementById("myFrame").contentWindow.delDeathForm();
    }

    function printForm() {
      document.getElementById("myFrame").contentWindow.printall();
    }

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

    function showlist(printFlg) {
      $('.maindiv2').html('');
      var _url = "${baseurl}deathRecord/queryMainDeathRecord.do?hspDeathRecordCustom.emgSeqDr=${emgSeqDr}";
      var contentDiv = createFrame(_url);
      $('.maindiv2').append(contentDiv);
      if (printFlg === 'print') {
        setTimeout(function () {
          printForm();
        }, 800);
      }
    }

    $(function () {
      showlist();
    })

    function hideOrShowBtn(list, status) {
      list.forEach(function (val, idx) {
        $('#' + val).css({ 'display': status })
      })
    }

    //初始化 判断登陆用户角色是否有权限对该医师进行操作
    function checkRole(_cratNbr) {
      publicFun.httpServer({url: '${baseurl}zyylqbl/checkRoleAjax.do?', isNoLoad: true}, {
        "cratNbr": _cratNbr
      }, function (data) {
        if (parent.pageFlg) {
          hideOrShowBtn(['save', 'bgsave', 'delete', 'sign'], 'none')
          hideOrShowBtn(['print'], 'inline')
          isOpenBox = false;
        } else {
          //规则判断，若是1，则有操作权限，若是0，则隐藏操作按钮
          if (data.resultInfo.message == "nurse") {
            hideOrShowBtn(['save', 'sign', 'bgsave', 'delete'], 'none');
            hideOrShowBtn(['print'], 'inline');
            isOpenBox = false;
          }else if(data.resultInfo.message == "doctor"){
            hideOrShowBtn(['save', 'bgsave', 'delete'], 'none');
            hideOrShowBtn(['print', 'sign'], 'inline');
            isOpenBox = false;
          }else{
            hideOrShowBtn(['bgsave', 'delete'], 'none');
            hideOrShowBtn(['save','print', 'sign'], 'inline');
            isOpenBox = true;
          }
        }
        //日志、归档病历、留抢病历 游客无权限
        if(data.resultInfo.message == "tourist"){
            hideOrShowBtn(['save','print', 'sign', 'bgsave', 'delete'], 'none');
            isOpenBox = false;
        }
        if (isOpenBox == false) {
          setPageDisable();
        }
      })
    }

    function setPageDisable () {
      document.getElementById("myFrame").contentWindow.$('form input, form textarea, form select').attr('disabled', true);
      document.getElementById("myFrame").contentWindow.$('.importBtnLink').hide();
    }
  </script>
</body>

</html>