<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/base/tag.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <title>患者流血</title>
    <%@ include file="/WEB-INF/jsp/base/common_css.jsp"%>
    <link rel="stylesheet" type="text/css" href="${baseurl}css/hzszyyhems/hzszyydoctor/diseasecourse.css?v=${versionDay}">
    <link rel="stylesheet" type="text/css" href="${baseurl}css/hzszyyhems/hzszyydoctor/pgd.css?v=${versionDay}">
    <%@ include file="/WEB-INF/jsp/base/common_js.jsp"%>
    <script type="text/javascript" charset="utf-8">
        var _baseUrl = '${baseurl}',
            _cratNbr = '${hspCxfxpgbCustom.createDoc}';
          _emgSeq = '${hspemginfCustom.emgSeq}',
          _name = '${sessionScope.activeUser.usrname}',
          _number = '${sessionScope.activeUser.usrno}';
    </script>
    <script language="javascript" src="${baseurl}Lodop6.216/LodopFuncs.js"></script>
    <script src="${baseurl}lib/avalon1.4.8/avalon.js" type="text/javascript" charset="UTF-8"></script>
    <script src="${baseurl}js/subpageJs/hzszyyhospital/pgdPage/patientBleed.avalon.js?v=${versionDay}" type="text/javascript" charset="UTF-8"></script>
</head>

<body ms-controller="PatientBleed">
    <form id="bleedform" action="${baseurl}riskAss/submitriskAssSheet.do" method="post">
        <div id="bleedprint">
            <div class="all-title">
                内科患者出血评估表
            </div>
            <ul class="middleul">
                <li class="infoli">
                    姓名：
                    <input class="titleinput" readonly="readonly" unselectable='on' value="${hspemginfCustom.cstNam}" />&emsp;
                    性别：
                    <input class="titleinputSpc" readonly="readonly" unselectable='on' value="${hspemginfCustom.cstSexCod}" />&emsp;
                    科别：
                    <input class="titleinput_kb" readonly="readonly" unselectable='on' value="急诊科门诊" />&emsp;
                    病历号：
                    <input class="titleinput" readonly="readonly" unselectable='on' value="${hspemginfCustom.mpi}" />&emsp;
                    <!-- 留观号：
                    <input class="titleinput" readonly="readonly" unselectable='on' value="${hspemginfCustom.observationCode}"
                        name="observationCode" maxlength="10" />&emsp; -->
                    <input type="hidden" name="hspDiseaseCourseCustom.courseType" value="9" />
                </li>
                <li>
                    <table class="bleedtable" id="bleed1">
                        <tr>
                            <td>
                                满足以下1项即为高出血风险
                            </td>
                        </tr>
                        <tr ms-repeat="systemList.highrisk1CodList">
                            <td>
                                <label ms-attr-for="highrisk1{{el.infocode}}">
                                    <span class="inputSpan">
                                        <input ms-attr-id="highrisk1{{el.infocode}}" type="checkbox" ms-attr-checked="el.checked"
                                            ms-click="Objradioclick('highrisk1',$index)">
                                        {{el.info}}
                                    </span>
                                </label>
                            </td>
                        </tr>
                    </table>

                    <table class="bleedtable2" id="bleed2">
                        <tr>
                            <td>
                                满足以下2项或以上即为高出血风险
                            </td>
                        </tr>
                        <tr ms-repeat="systemList.highrisk2CodList">
                            <td>
                                <label ms-attr-for="highrisk2{{el.infocode}}">
                                    <span class="inputSpan">
                                        <input ms-attr-id="highrisk2{{el.infocode}}" type="checkbox" ms-attr-checked="el.checked"
                                            ms-click="Objradioclick('highrisk2',$index)">
                                        {{el.info}}
                                    </span>
                                </label>
                            </td>
                        </tr>
                    </table>

                    <table class="resulttable">
                        <tr>
                            <td>
                                评估结果：&emsp;&emsp;&emsp;&emsp;出血高风险
                                <label>
                                    <input type="checkbox" id="gcx" value="1" name="hspCxfxpgbCustom.assresult" <c:if
                                        test="${hspCxfxpgbCustom.assresult eq '1'}">checked="checked"</c:if>/>是
                                </label>
                                <label>
                                    <input type="checkbox" id="dcx" value="0" name="hspCxfxpgbCustom.assresult" <c:if
                                        test="${hspCxfxpgbCustom.assresult eq '0'}">checked="checked"</c:if>/>否
                                </label>
                            </td>
                        </tr>
                    </table>
                    <input type="hidden" name="hspCxfxpgbCustom.highrisk1" ms-duplex-string="riskVal.highrisk1" />
                    <input type="hidden" name="hspCxfxpgbCustom.highrisk2" ms-duplex-string="riskVal.highrisk2" />
                    <!-- <input type="text" name="hspCxfxpgbCustom.assresult" /> -->
                    <input type="hidden" name="hspCxfxpgbCustom.riskSeq" value="${hspCxfxpgbCustom.riskSeq}" />
                    <input type="hidden" name="hspCxfxpgbCustom.emgSeq" value="${hspemginfCustom.emgSeq}" />
                </li>
                <li class="rightli">
                    <span>医师签名</span>
                    <span class="spanRelative">
                        <!-- onkeydown="getSignList(event)" -->
                        <input type="text" class="baseinput" id="docName" maxlength="10" name="hspCxfxpgbCustom.assessDocNam" readonly>
                        <input type="text" class="hidden" id="docNameNum" maxlength="10" name="hspCxfxpgbCustom.assessDoc">
                        <div class="userList" id="userNameList"></div>
                    </span>
                    日期：
                    <input class="inputlong Wdate spcWdate" id="coursedate" type="text" value="${hspCxfxpgbCustom.assessDate}"
                        name="hspCxfxpgbCustom.assessDate" onclick="WdatePicker({dateFmt:'yyyy/MM/dd HH:mm:ss'})" />
                </li>
            </ul>
        </div>
    </form>
    <jsp:include page="/WEB-INF/jsp/hzszyyhospital/hzszyydoctor/riskAssSheet/printBleed.jsp"></jsp:include>
    <script type="text/javascript">
        var num = 0;
        var cue;
        var tbadd = 1;
        function getList() {
            var url = "${baseurl}riskAss/findRiskAssSheetList.do";
            $.ajax({
                url: url,
                dataType: "json",
                async: false,
                data: '',
                success: function (data) {
                    var data1 = data.resultInfo.sysdata.highrisk1CodList;
                    var data2 = data.resultInfo.sysdata.highrisk2CodList;
                    if (data1.length > data2.length) {
                        num = parseInt(data1.length) - parseInt(data2.length);
                        cue = 0;
                        for (var i = 0; i < num; i++) {
                            $("#bleed2").append("<tr><td></td><tr>");
                        }
                    } else {
                        num = parseInt(data2.length) - parseInt(data1.length);
                        cue = 1;
                        for (var i = 0; i < num; i++) {
                            $("#bleed1").append("<tr><td></td></tr>");
                        }
                    }
                    vm.systemList.highrisk1CodList = data1;
                    vm.systemList.highrisk2CodList = data2;
                },
                error: function () {
                    alert("数据上传失败");
                }
            });
        }

        $('input[name="hspCxfxpgbCustom.assresult"]').each(function () {
            singlecheck(this, 'input[name="hspCxfxpgbCustom.assresult"]');
        });

        function singlecheck(a, thisname) {
            $(a).click(function () {
                if ($(a).attr('checked')) {
                    $(thisname).removeAttr('checked');
                    $(a).attr('checked', 'checked');
                }
            });
        }

        function insertuser_callback(data, printFlg) {
            window.sessionStorage.setItem('bleedSave', printFlg);
            if (printFlg === 'p') {
                window.location.reload();
            } else {
                message_alert(data);
                setTimeout(function () {
                    window.location.reload();
                }, 800)
            }
        }

        function saveForm(printFlg) {
            publicFun.cleanSignMsg('docName');
            if (printFlg === 'p') {
                if (parent.isOpenBox) {
                    jquerySubByFId('bleedform', insertuser_callback, printFlg, "json");
                } else {
                    printTable()
                }
            } else {
                jquerySubByFId('bleedform', insertuser_callback, null, "json");
            }
        }

        function getcheck(arr, name) {
            var list = vm['systemList'][name + 'CodList']
            $.each(arr, function (idx, val) {
                $.each(list, function (index, value) {
                    if (val == value['infocode']) {
                        value['checked'] = true;
                    }
                });
            })
        }

        vm.riskVal.$watch('highrisk1', function (newVal, oldVal) {
            if (_flag == false) {
                return;
            }
            var arr1 = newVal.split(',');
            var arr2 = vm.riskVal.highrisk2.split(',');
            if (arr1.length >= 2) {
                $('input[name="hspCxfxpgbCustom.assresult"]').removeAttr('checked');
                $('#gcx').attr('checked', true);
            } else if (arr2.length < 3) {
                $('input[name="hspCxfxpgbCustom.assresult"]').removeAttr('checked');
                $('#dcx').attr('checked', true);
            }
        });

        vm.riskVal.$watch('highrisk2', function (newVal, oldVal) {
            if (_flag == false) {
                return;
            }
            var arr1 = newVal.split(',');
            var arr2 = vm.riskVal.highrisk1.split(',');
            if (arr1.length >= 3) {
                $('input[name="hspCxfxpgbCustom.assresult"]').removeAttr('checked');
                $('#gcx').attr('checked', true);
            } else if (arr2.length < 2) {
                $('input[name="hspCxfxpgbCustom.assresult"]').removeAttr('checked');
                $('#dcx').attr('checked', true);
            }
        });

        var _flag = false;
        function getmsg() {
            vm.riskVal.highrisk1 = '${hspCxfxpgbCustom.highrisk1}';
            vm.riskVal.highrisk2 = '${hspCxfxpgbCustom.highrisk2}';
            var arr1 = vm.riskVal.highrisk1.split(',');
            var arr2 = vm.riskVal.highrisk2.split(',');
            getcheck(arr1, 'highrisk1');
            getcheck(arr2, 'highrisk2');
        }

        function getSignList(e) {
            if (e.keyCode == 13) {
                publicFun.SearchList('docName', 'userNameList');
            }
        }
        $("body").click(function () {
            $(".userList").hide();
        });
        function initMsg () {
            if(_cratNbr == ''){
                parent.checkRole(_number,'brain')
            }else{
                parent.checkRole(_cratNbr,'brain')
            }
            if ('${hspCxfxpgbCustom.riskSeq}') {
                getmsg();
                _flag = true;
                $('#docName').val('${hspCxfxpgbCustom.assessDocNam}');
                $('#docNameNum').val('${hspCxfxpgbCustom.assessDoc}');
            } else {
                _flag = true;
                var newtime = publicFun.timeFormat(new Date(), 'yyyy/MM/dd hh:mm:ss');
                $('#coursedate').val(newtime);
                $('#docName').val('${activeUser.usrname}');
                $('#docNameNum').val('${activeUser.usrno}');
            }
        }
        $(function () {
            getList();
            initMsg()
        })
        function printBleed(data) {
            var highrisk1 = data.hspCxfxpgbCustom.highrisk1;
            var highrisk2 = data.hspCxfxpgbCustom.highrisk2;
            var arr1 = [];
            var arr2 = [];
            if (highrisk1 != null) {
                arr1 = highrisk1.split(',');
            }
            if (highrisk2 != null) {
                arr2 = highrisk2.split(',');
            }
            for (var i = 0; i < arr1.length; i++) {
                $('#highrisk1p' + arr1[i]).attr('checked', true);
            }
            for (var i = 0; i < arr2.length; i++) {
                $('#highrisk2p' + arr2[i]).attr('checked', true);
            }
            $('#docname').html(data.hspCxfxpgbCustom.assessDocNam);
            $('#docdate').html(data.hspCxfxpgbCustom.assessDate);
            $('#id_title2').html('内科患者出血评估表');
            $('.print-ul').css({"float":"left","width":"98%","font-size":"0.38cm","margin":"0 1%","padding":"0"});
            $('.print-ul li.bordered').css({"float":"left","width":"99%","margin-left":"1%","padding-bottom":"0mm","list-style":"none","text-align":"left","border-bottom":"1px solid #000","margin-bottom":"1mm","line-height":"1.5"});
            
            LODOP = getLodop();
            LODOP.PRINT_INITA(0, 0, "210mm", "297mm", "打印控件功能演示_Lodop功能_超文本内容缩放打印");
            LODOP.SET_PRINT_PAGESIZE(0, "210mm", "297mm", "");
            LODOP.SET_PRINT_MODE("NOCLEAR_AFTER_PRINT", true);
            LODOP.ADD_PRINT_HTM(1050, 344, "90%", "100%", "<font style='font-size:12px' format='0'><span tdata='pageNO'>第##页</span>/<span tdata='pageCount'>共##页</span></font>");
            LODOP.SET_PRINT_STYLEA(0, "ItemType", 1);
            var strStyleCSS = "<link rel='stylesheet' type='text/css' href='${baseurl}css/hzszyyhems/hzszyydoctor/pgd.css?050'>";
            LODOP.ADD_PRINT_HTM(3, 0, "100%", "100%", strStyleCSS + document.getElementById("printnote").innerHTML);
            LODOP.NewPageA();
            LODOP.SET_PRINT_STYLE("FontSize", 10);
            LODOP.PREVIEW();
        }

        window.onload = function () {
            var _print = window.sessionStorage.getItem('bleedSave');
            if (_print === 'p') {
                window.sessionStorage.removeItem('bleedSave');
                setTimeout(function () {
                    printTable();
                }, 800);
            }
        }
        function printTable() {
            if (cue == 0 && tbadd == 1) {
                for (var i = 0; i < num; i++) {
                    $("#bleed2p").append("<tr><td>&nbsp</td><tr>");
                    tbadd = 0;
                }
            } else if (cue == 1 && tbadd == 1) {
                for (var i = 0; i < num; i++) {
                    $("#bleed1p").append("<tr><td>&nbsp</td></tr>");
                    tbadd = 0;
                }
            }
            publicFun.httpServer({ url: '${baseurl}riskAss/findriskAssSheet.do?emgSeq=${hspemginfCustom.emgSeq}', isAsync: false }, {}, function (data) {
                if (data.hspCxfxpgbCustom != null) {
                    printBleed(data);
                }
            })
        }
    </script>
</body>

</html>