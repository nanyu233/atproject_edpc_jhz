<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/base/tag.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
  <title>病程记录</title>
  <%@ include file="/WEB-INF/jsp/base/common_css.jsp"%>
  <link rel="stylesheet" type="text/css" href="${baseurl}css/hzszyyhems/hzszyydoctor/diseasecourse.css?v=${versionDay}">
  <%@ include file="/WEB-INF/jsp/base/common_js.jsp"%>
  <script>
    var _type = '${type}';
  </script>
</head>

<body>
  <div class="selectdiv">
    类型：
    <select id="selecttype" onchange="selectType()">
      <!-- <option value="firstdisease">首次病程记录</option> -->
      <option value="daily">日常病程记录</option>
      <option value="operation">手术操作病程</option>
      <option value="critical">危急值病程</option>
      <option value="bloodTransRecord">输血(血制品)记录</option>
      <option value="brain">脑梗溶栓病程记录</option>
      <!-- <option value="zyyscf">日常医师查房记录</option> -->
      <option value="zzyscf">主治医师查房记录</option>
      <option value="fzryscf">副主任医师查房记录</option>
      <option value="zryscf">主任医师查房记录</option>
      <!-- <option value="jbjl">交班记录</option>
      <option value="jiebjl">接班记录</option> -->
      <option value="qjjl">抢救记录</option>
      <option value="kbjttjl">可编辑抬头记录</option>
    </select>
    <input type="hidden" value="${emgSeqDc}" id="emgSeq" />
  </div>
  <div class="cutoff2" id="blueline"></div>
  <div>
    <div class="maindiv">
    </div>
    <!-- <div class="cutoff"></div> -->
    <div class="btndiv">
      <input type="button" class="commonbtn m-l10" value="显示列表" id="showList" onclick="selectType()" />
      <input type="button" class="commonbtn m-l10" value="新增" id="add" onclick="addData()" />
      <input type="button" class="commonbtn m-l10" value="修改" id="edit" onclick="editData()" />
      <input type="button" class="commonbtn m-l10" value="签名" id="sign" onclick="getSign()" />
      <input type="button" class="commonbtn m-l10" value="保存" id="save" onclick="saveForm()" />
      <input type="button" class="commonbtn m-l10" value="删除" id="delete" onclick="delForm()" />
      <input type="button" class="commonbtn m-l10" value="打印" id="print" onclick="printForm()" />
      <input type="button" class="commonbtn m-l10" value="续打" id="conPrint" onclick="conPrint()" />
    </div>
    <div class="hrrr" id="cutline"></div>
  </div>
  <script type="text/javascript">
    var courseType;
    var isOpenBox; // 供子页面能够打开诊断弹框选择
    //创建生成的 iframe 嵌入页面
    function createFrame(url) {
      var thisheight = $(window).height() - 82;
      var content = '<iframe id ="myFrame" height="' + thisheight + '" frameborder="0" scrolling="auto" src="' + url + '"  style="width: 100%;"></iframe>';
      return content
    }

    function appendFrameContent(url) {
      var contentDiv = createFrame(url);
      $('.maindiv').html(contentDiv);
      if (parent.pageFlg) {
        hideOtherBtn()
        var myFrame = document.getElementById('myFrame')
        if (myFrame.attachEvent) {
          myFrame.attachEvent("onload", function () { // IE  
            hideOtherBtn()
          })
        } else {
          myFrame.onload = function () { // 非IE  
            hideOtherBtn()
          }
        }
      }
    }

    function hideOtherBtn() {
      var btnList = ['save', 'delete', 'add'];
      $.each(btnList, function (idx, val) {
        $('#' + val).hide()
      })
    }

    function hideBtn(list) {
      $.each(list, function (idx, val) {
        $('#' + val).hide()
      })
    }
    function showBtn(_list) {
      $.each(_list, function (idx, val) {
        $('#' + val).css('display', 'inline')
      })
    }
    function showAhide() {
      $('#cutline,#blueline').css('visibility', 'hidden');
      showBtn(['print', 'delete', 'showList', 'conPrint','add', 'edit']);
    }
    // 判断是评分进入还是病程进入，对选项进行设置
    function resignMenu() {
      var _selMenu = [{ name: 'cxpg', text: '出血风险评估单' }, { name: 'vtepg', text: 'VTE风险评估单' }, { name: 'bloodRisk', text: '静脉血栓风险因素评估表' }];
      var _url = "${baseurl}riskAss/riskAssSheet.do?emgSeq=${emgSeqDc}" + '&timeAll=' + new Date().getTime();
      if (_type === 'score') {
        $('#selecttype').html('');
        _selMenu.forEach(function (item, index) {
          var option = document.createElement("option");
          $(option).val(item.name);
          $(option).text(item.text);
          $('#selecttype').append(option);
        })
        appendFrameContent(_url)
        courseType = '9';
      } else {
        checkRole('','sel');
        _url = "${baseurl}diseaseCourse/queryOtherDisease.do?forwardUrl=Daily&hspDiseaseCourseCustom.emgSeqDc=${emgSeqDc}" + '&timeAll=' + new Date().getTime();
        appendFrameContent(_url)
        courseType = '2';
      }
    }
    $(function () {
      $('.commonbtn').hide();
      resignMenu();
      //首次进入病程记录，若权限是护士，则屏蔽保存功能
    })

    function selectType() {
      var type = $('#selecttype').val();
      $('.maindiv').html('');
      switch (type) {
        case 'firstdisease':
          var _url = "${baseurl}diseaseCourse/queryFirstDisease.do?hspDiseaseCourseCustom.emgSeqDc=${emgSeqDc}&hspDiseaseCourseCustom.courseType=1" + '&timeAll=' + new Date().getTime();
          appendFrameContent(_url)
          courseType = '1';
          break;
        case 'daily':
          checkRole('','sel');
          var _url = "${baseurl}diseaseCourse/queryOtherDisease.do?forwardUrl=Daily&hspDiseaseCourseCustom.emgSeqDc=${emgSeqDc}" + '&timeAll=' + new Date().getTime();
          appendFrameContent(_url)
          courseType = '2';
          break;

        case 'operation':
          checkRole('','sel');
          var _url = "${baseurl}diseaseCourse/queryOtherDisease.do?forwardUrl=Operation&hspDiseaseCourseCustom.emgSeqDc=${emgSeqDc}";
          appendFrameContent(_url)
          courseType = '3';
          break;

        case 'critical':
          checkRole('','sel');
          var _url = "${baseurl}diseaseCourse/queryOtherDisease.do?forwardUrl=Critical&hspDiseaseCourseCustom.emgSeqDc=${emgSeqDc}" + '&timeAll=' + new Date().getTime();
          appendFrameContent(_url)
          courseType = '4';
          break;

        // case 'zyyscf':
        //     showAhide();
        //     var _url = "${baseurl}zyylqbl/toquerycfjl.do?emgSeq=${emgSeqDc}&flag=3";
        //     appendFrameContent(_url)
        //     courseType = '5';
        // break;

        case 'zzyscf':
          checkRole('','sel');
          var _url = "${baseurl}zyylqbl/toquerycfjl.do?emgSeq=${emgSeqDc}&flag=2" + '&timeAll=' + new Date().getTime();
          appendFrameContent(_url)
          courseType = '5';
          break;

        case 'fzryscf':
          checkRole('','sel');
          var _url = "${baseurl}zyylqbl/toquerycfjl.do?emgSeq=${emgSeqDc}&flag=1" + '&timeAll=' + new Date().getTime();
          appendFrameContent(_url)
          courseType = '5';
          break;

        case 'zryscf':
          checkRole('','sel');
          var _url = "${baseurl}zyylqbl/toquerycfjl.do?emgSeq=${emgSeqDc}&flag=0" + '&timeAll=' + new Date().getTime();
          appendFrameContent(_url)
          courseType = '5';
          break;

        // case 'jbjl':
        //   showAhide();
        //   checkRole2();
        //   var _url = "${baseurl}zyylqbl/toqueryjjbjl.do?emgSeq=${emgSeqDc}&flag=0" + '&timeAll=' + new Date().getTime();
        //   appendFrameContent(_url)
        //   courseType = '6';
        //   break;

        // case 'jiebjl':
        //   showAhide();
        //   checkRole2();
        //   var _url = "${baseurl}zyylqbl/toqueryjjbjl.do?emgSeq=${emgSeqDc}&flag=1" + '&timeAll=' + new Date().getTime();
        //   appendFrameContent(_url)
        //   courseType = '6';
        //   break;

        case 'qjjl':
          checkRole('','sel');
          var _url = "${baseurl}zyylqbl/toqueryqjjl.do?emgSeq=${emgSeqDc}" + '&timeAll=' + new Date().getTime();
          appendFrameContent(_url)
          courseType = '7';
          break;

        case 'kbjttjl':
          checkRole('','sel');
          var _url = "${baseurl}zyylqbl/toqueryzdy.do?emgSeq=${emgSeqDc}&flag=9" + '&timeAll=' + new Date().getTime();
          var contentDiv = createFrame(_url);
          appendFrameContent(_url)
          courseType = '12';
          break;

        case 'brain':
          var _url = "${baseurl}cerebralation/brainDisease.do?forwardUrl=Brain&hspCerebralCourseCustom.courseType=8&emgSeq=" + $('#emgSeq').val() + '&timeAll=' + new Date().getTime();
          appendFrameContent(_url)
          courseType = '8';
          break;

        case 'cxpg':
          var _url = "${baseurl}riskAss/riskAssSheet.do?emgSeq=${emgSeqDc}" + '&timeAll=' + new Date().getTime();
          appendFrameContent(_url)
          courseType = '9';
          break;

        case 'vtepg':
          var _url = "${baseurl}riskAss/VteAssSheet.do?emgSeq=${emgSeqDc}" + '&timeAll=' + new Date().getTime();
          appendFrameContent(_url)
          courseType = '10';
          break;
        case 'bloodRisk':
          var _url = "${baseurl}riskAss/jmxsAssSheet.do?emgSeq=" + $('#emgSeq').val() + '&timeAll=' + new Date().getTime();
          appendFrameContent(_url)
          courseType = '11';
          break;
        case 'bloodTransRecord':
        checkRole('','sel');
          var _url = "${baseurl}transfusion/toTransfusionInf.do?emgSeq=${emgSeqDc}" + '&timeAll=' + new Date().getTime();
          appendFrameContent(_url)
          courseType = '13';
          break;

      }
    }

    /**
     * @ 签名
     */
    function getSign() {
      document.getElementById("myFrame").contentWindow.getSign();
    }

    function saveForm() {
      document.getElementById("myFrame").contentWindow.saveForm();
    }

    // 新增/修改页 按钮显示
    function showBtnUpdatePage(type) {
      $('.maindiv').html('');
      $('#cutline,#blueline').css('visibility', 'visible');
      if(type == 'add'){
        var _selectType = $('#selecttype').val();
        if ( _selectType == 'operation') {
          showBtn(['save'])
          hideBtn(['add', 'edit', 'print', 'delete', 'conPrint', 'sign'])
        } else {
          showBtn(['save', 'sign'])
          hideBtn(['add', 'edit', 'print', 'delete', 'conPrint'])
        }
      }
    }

    function addData() {
      var type = courseType;
      var doctype = $('#selecttype').val();
      showBtnUpdatePage('add');
      switch (type) {
        case '2':
          var _url = "${baseurl}diseaseCourse/toAddOrEdit.do?forwardUrl=Daily&hspDiseaseCourseCustom.courseType=2&hspDiseaseCourseCustom.emgSeqDc=${emgSeqDc}" + '&timeAll=' + new Date().getTime();
          appendFrameContent(_url)
          break;

        case '3':
          var _url = "${baseurl}diseaseCourse/toAddOrEdit.do?forwardUrl=Operation&hspDiseaseCourseCustom.courseType=3&hspDiseaseCourseCustom.emgSeqDc=${emgSeqDc}";
          appendFrameContent(_url)
          break;

        case '4':
          var _url = "${baseurl}diseaseCourse/toAddOrEdit.do?forwardUrl=Critical&hspDiseaseCourseCustom.courseType=4&hspDiseaseCourseCustom.emgSeqDc=${emgSeqDc}" + '&timeAll=' + new Date().getTime();
          appendFrameContent(_url)
          break;

        case '5':
          var _url;
          if (doctype == 'zzyscf') {
            _url = '${baseurl}zyylqbl/toinsertcfjl.do?emgSeq=${emgSeqDc}&flag=2' + '&timeAll=' + new Date().getTime();
          } else if (doctype == 'fzryscf') {
            _url = '${baseurl}zyylqbl/toinsertcfjl.do?emgSeq=${emgSeqDc}&flag=1' + '&timeAll=' + new Date().getTime();
          } else {
            _url = '${baseurl}zyylqbl/toinsertcfjl.do?emgSeq=${emgSeqDc}&flag=0' + '&timeAll=' + new Date().getTime();
          }
          appendFrameContent(_url)
          break;

        // case '6':
        //   var _url;
        //   if (doctype == 'jbjl') {
        //     _url = '${baseurl}zyylqbl/toinsertjjbjl.do?emgSeq=${emgSeqDc}&flag=0' + '&timeAll=' + new Date().getTime();
        //   } else {
        //     _url = '${baseurl}zyylqbl/toinsertjjbjl.do?emgSeq=${emgSeqDc}&flag=1' + '&timeAll=' + new Date().getTime();
        //   }
        //   appendFrameContent(_url)
        //   break;

        case '7':
          var _url = '${baseurl}zyylqbl/toinsertqjjl.do?emgSeq=${emgSeqDc}' + '&timeAll=' + new Date().getTime();
          appendFrameContent(_url)
          break;
        case '12':
          var _url = '${baseurl}zyylqbl/toinsertzdy.do?emgSeq=${emgSeqDc}' + '&timeAll=' + new Date().getTime();
          appendFrameContent(_url)
          break;
        case '13':
          var _url = '${baseurl}transfusion/toUpdateBloodTransRecord.do?emgSeq=${emgSeqDc}&timeAll=' + new Date().getTime();
          appendFrameContent(_url)
          break;
        default:
          var _url = '${baseurl}cerebralation/brainDisease.do?emgSeq=${emgSeqDc}' + '&timeAll=' + new Date().getTime();
          appendFrameContent(_url)
      }
    }

    function editCourse(diseaseid) {
      var type = courseType;
      showBtnUpdatePage();
      switch (type) {
        case '2':
          var _url = "${baseurl}diseaseCourse/toAddOrEdit.do?forwardUrl=Daily&hspDiseaseCourseCustom.courseType=2&hspDiseaseCourseCustom.emgSeqDc=${emgSeqDc}&hspDiseaseCourseCustom.diseaseCourseSeq=" + diseaseid + '&timeAll=' + new Date().getTime();
          appendFrameContent(_url)
          break;
        // case '3':
        //   var _url = "${baseurl}diseaseCourse/toAddOrEdit.do?forwardUrl=Operation&hspDiseaseCourseCustom.courseType=3&hspDiseaseCourseCustom.emgSeqDc=${emgSeqDc}&hspDiseaseCourseCustom.diseaseCourseSeq=" + diseaseid + '&timeAll=' + new Date().getTime();
        //   appendFrameContent(_url)
        //   break;
        case '4':
          var _url = "${baseurl}diseaseCourse/toAddOrEdit.do?forwardUrl=Critical&hspDiseaseCourseCustom.courseType=4&hspDiseaseCourseCustom.emgSeqDc=${emgSeqDc}&hspDiseaseCourseCustom.diseaseCourseSeq=" + diseaseid + '&timeAll=' + new Date().getTime();
          appendFrameContent(_url)
          break;
        default:
          var _url = diseaseid + '&timeAll=' + new Date().getTime();
          appendFrameContent(_url)
      }
    }

    function editData() {
      var type = courseType;
      $('#cutline,#blueline').css('visibility', 'visible');
      switch (type) {
        case '1':
          document.getElementById("myFrame").contentWindow.saveForm();
          break;
        default:
          document.getElementById("myFrame").contentWindow.editMsg();
          break;
      }
    }

    function delForm() {
      document.getElementById("myFrame").contentWindow.delMsg();
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

    function printForm() {
      var type = courseType;
      var _emgDat = publicFun.timeFormat(parent.parent._emgDat, 'yyyy/MM/dd hh:mm:ss');
      switch (type) {
        case '8':
        case '9':
        case '10':
        case '11':
          document.getElementById("myFrame").contentWindow.saveForm('p');
          break;
        default:
          publicFun.httpServer({ url: '${baseurl}diseaseCourse/queryAllDiseaseCourse_result.do', isAsync: false }, {
            'hspDiseaseCourseCustom.emgSeqDc': "${emgSeqDc}",
            'hspDiseaseCourseCustom.courseType': "3",
            'printType': '2',
            'startdate': _emgDat,
            _t: Date.parse(new Date())
          }, function (res) {
            var msgList = res.resultInfo.sysdata;
            document.getElementById("myFrame").contentWindow.printall(msgList.diseaseCourseList);
          })
      }
    }

    //续打医嘱
    function conPrint() {
      var type = courseType;
      var _emgDat = publicFun.timeFormat(parent.parent._emgDat, 'yyyy/MM/dd hh:mm:ss');
      switch (type) {
        case '8':
          document.getElementById("myFrame").contentWindow.saveForm('p');
          break;
        default:
          var ajaxOption = new AjaxOption();
          ajaxOption.requestType = 'POST';
          ajaxOption.requestDataType = "pame";
          ajaxOption.requestData = {
            'hspDiseaseCourseCustom.emgSeqDc': "${emgSeqDc}",
            'hspDiseaseCourseCustom.courseType': "3",
            'printType': '2',
            'startdate': _emgDat,
            _t: Date.parse(new Date())
          };
          ajaxOption.requestUrl = "${baseurl}diseaseCourse/queryAllDiseaseCourse_result.do";
          ajaxOption.asyncFlg = false;
          ajaxOption.returnDataType = 'json';
          _ajaxPostRequest(ajaxOption, null, function (res) {
            var msgList = res.resultInfo.sysdata;
            var totalPage = msgList.hspemginfCustom.bcdyy; //旧数据占用的总页数
            document.getElementById("myFrame").contentWindow.continuePrint(msgList.diseaseCourseList, totalPage);
          });
      }
    }


    //初始化 判断登陆用户角色是否有权限对该医师进行操作
    // 每张子页面调用----内容页调用
    // 第一次加载的首次病程和评分页面在用
    function checkRole(_cratNbr, type) {
      publicFun.httpServer({ url: '${baseurl}zyylqbl/checkRoleAjax.do', isNoLoad: true }, { "cratNbr": _cratNbr }, function (data) {
        var _selectType = $('#selecttype').val();
        if (parent.pageFlg) { // 归档病历或者护士
          if (_type === 'score') { // onload 评分表
              hideBtn(['save', 'sign', 'edit'])
              showBtn(['print'])
            } else if (_selectType === 'brain') { // 无权限页面 脑梗无续打
              hideBtn(['save', 'sign', 'edit', 'showList'])
              showBtn(['print', 'conPrint'])
            } else if (_selectType === 'firstdisease') { // onload 进首次病程记录
              hideBtn(['save', 'sign', 'edit', 'showList'])
              showBtn(['print', 'conPrint'])
            } else {
              if(type === 'sel'){
              	hideBtn(['save', 'sign', 'edit'])
              	showBtn(['showList', 'print', 'conPrint'])
              }else{
              	hideBtn(['save', 'sign', 'edit', 'print', 'conPrint'])
              	showBtn(['showList'])
              }
            }
          isOpenBox = false;
        } else {
          $('.commonbtn').hide();
          if (data.resultInfo.message == "doctorSelf" || data.resultInfo.message == "admin") {
            if(type == 'sel'){
              showAhide();
            }else{
              if (_type === 'score') { // 评分表
                $('#cutline,#blueline').css('visibility', 'visible');
                showBtn(['save', 'print'])
              }else if(type == 'first'){
                $('#cutline,#blueline').css('visibility', 'visible');
                showBtn(['save', 'print','conPrint','sign'])
              }else if( _selectType == 'brain'){
                $('#cutline,#blueline').css('visibility', 'visible');
                showBtn(['save', 'print','conPrint'])
              } else if (_selectType == 'operation') { // 无签名
                showBtn(['save','showList'])
              } else {
                showBtn(['save', 'sign','showList'])
              }
            }
            isOpenBox = true;
          }else if(data.resultInfo.message == "doctor"){
            if(type == 'sel'){
              showAhide();
            }else{
              if (_type === 'score') { // 评分表
                $('#cutline,#blueline').css('visibility', 'visible');
                showBtn(['print'])
              }else if(type == 'first'){
                $('#cutline,#blueline').css('visibility', 'visible');
                showBtn(['print','conPrint','sign'])
              }else if(_selectType == 'brain'){
                $('#cutline,#blueline').css('visibility', 'visible');
                showBtn(['print','conPrint'])
              }else if (_selectType == 'operation') { // 无签名
                showBtn(['showList'])
              } else {
                showBtn(['sign','showList'])
              }
            }
              isOpenBox = false;
          }else if(data.resultInfo.message == "nurse"){
            if(type == 'sel'){
              $('#cutline,#blueline').css('visibility', 'visible'); 
              showBtn(['print','conPrint','showList'])
            }else{
              if (_type === 'score') { // 评分表
                showBtn(['print'])
              }else if(type == 'first' || _selectType == 'brain'){
                $('#cutline,#blueline').css('visibility', 'visible');
                showBtn(['print','conPrint',])
              }else {
                showBtn(['showList'])
              }
            }
            isOpenBox = false;
          }
        }
        //日志、归档病历、留抢病历 游客无权限
        if(data.resultInfo.message == "tourist"){
        	$('.commonbtn').hide();
            isOpenBox = false;
          	//列表内容页显示列表
            if(_type != 'score' && type != 'first' && _selectType != 'brain' && type != 'sel'){
              showBtn(['showList'])
            }
        }
        if (isOpenBox == false) {
          setPageDisable();
        }
      })
    }

    function setPageDisable () {
      document.getElementById("myFrame").contentWindow.$('form input, form textarea, form select').attr('disabled', true);
      document.getElementById("myFrame").contentWindow.$('.btna').hide();
    }
  </script>
</body>

</html>