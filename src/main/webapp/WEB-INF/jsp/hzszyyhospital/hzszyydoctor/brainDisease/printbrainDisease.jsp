<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/base/tag.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
    </head>
    <body>
    <div style="display:none;">
        <div id="printNote" class="print-body">
            <jsp:include page="/WEB-INF/jsp/hzszyyhospital/printBasicInfo/printBasicInfo.jsp"></jsp:include>
            <ul class="printUl marginGap">
                <li class="bordered">
                    <span class="basic-span">
                        <label class="title-label">姓名：</label>
                        <span>${hspemginfCustom.cstNam}</span>
                    </span>
                    <span class="basic-span">
                        <label class="title-label">性别：</label>
                        <span>${hspemginfCustom.cstSexCod}</span>
                    </span>
                    <span class="basic-span">
                        <label class="title-label">年龄：</label>
                        <span id="_age">${hspemginfCustom.cstAge}${hspemginfCustom.cstAgeCod}</span>
                    </span>
                    <span class="basic-span">
                        <label class="title-label">科别：</label> 
                        <span id="_emgFkCod">${hspemginfCustom.emgFkCod}</span>
                    </span>
                    <span class="basic-span">
                        <label class="title-label">病历号：</label> 
                        <span id="_mpi">${hspemginfCustom.mpi}</span>
                    </span>
                    <span class="basic-span">
                        <label class="title-label">留观号：</label> 
                        <span id="_lgh">${hspemginfCustom.observationCode}</span>
                    </span>
                </li>
                <li class="fourLi">
                    <span class="smalltitle">体重：</span>
                    <span class="weightUnit">
                        <span class="weight"></span>
                    </span>
                </li>
                <li class="fourLi">
                    <span class="smalltitle">溶栓时间：</span>
                    <span class="cerebralDate"></span>
                </li>
                <li class="fourLi">
                    <span class="smalltitle">爱通立剂量：</span>
                    <span class="erectDoseUnit">
                        <span class="erectDose"></span>
                    </span>
                </li>
                <li class="fourLi">
                    <span class="smalltitle">DNT：</span>
                    <span class="cerebralDntUnit">
                        <span class="cerebralDnt"></span>
                    </span>
                </li>
            </ul>
            <p class="centerWz marginGaps">溶栓适应症</P>
            <table class="tabWrapper">
                <colgroup>
                    <col width="3%"/>
                    <col width="87%" />
                    <col width="10%"/>                  
                </colgroup>
                <tbody id="cerebralIndBody"></tbody>
            </table>
            <p class="centerWz">溶栓禁忌症</P>
            <table class="tabWrapper">
                <colgroup>
                    <col width="3%"/>
                    <col width="87%" />
                    <col width="10%"/>                  
                </colgroup>
                <tbody id="cerebralContBody">
                </tbody>
            </table>
            <ul class="printUl">
                <li class="halfLi">
                    <label>评估医生签名：</label>
                    <span class="createNam"></span>
                </li>
                <li class="halfLi">
                    <label class="lab-span">日期：</label>
                    <span class="assessDate"></span>
                </li>
            </ul>
        </div>
        <div id="printNoteN" class="print-body">
            <p class="centerWz marginGap">美国国立卫生院神经功能缺损评分（NIHSS评分）</P>
            <table class="tabWrapper">
                <colgroup>
                <col width="18%"/>
                <col width="57%"/>
                <col width="5%"/>   
                <col width="5%"/>                  
                <col width="5%"/>                  
                <col width="5%"/>                  
                <col width="5%"/> 
                </colgroup>
                <thead>
                    <th>项目</th>
                    <th>评分标准</th>
                    <th>溶栓前</th>
                    <th>溶栓15分</th>
                    <th>溶栓30分</th>
                    <th>溶栓45分</th>
                    <th>溶栓60分</th>
                </thead>
                <tbody id="nihssBody">
                </tbody>                            
            </table>
            <ul class="printUl">
                <li class="halfLi">
                    <label>评估医生签名：</label>
                    <span class="nihssAssessDocNam"></span>
                </li>
                <li class="halfLi">
                    <label class="lab-span">日期：</label>
                    <span class="assessDates"></span>
                </li>
            </ul>
        </div>
        <div id="printNoteT" class="print-body">
            <p class="centerWz marginGap">溶栓生命体征及神经功能缺损评估单（1）</P>
            <table class="tabWrapper" id="vitalTab">
                <colgroup>
                    <col width="12%"/>
                    <col width="20%" />
                    <col width="16%"/> 
                    <col width="20%"/> 
                    <col width="10%"/> 
                    <col width="10%"/> 
                    <col width="12%"/>
                </colgroup>
                <thead>
                    <th></th>
                    <th>时间</th>
                    <th>心率（次/分）</th>
                    <th>血压(mmHg)</th>
                    <th>氧饱和度（℅）</th>
                    <th>NIHSS评分</th>
                    <th>医生签名</th>
                </thead>
                <tbody id="sheetTimeBody">
                </tbody>
            </table>
            <ul class="printUl" style="display:none">
                <li class="halfLi">
                    <label>评估医生签名：</label>
                    <span class="sheetAssessDocNam"></span>
                </li>
                <li class="halfLi">
                    <label class="lab-span">日期：</label>
                    <span class="sheetAssessDate"></span>
                </li>
            </ul>
        </div>
        </div>
        <object id="ocx" classid="clsid:66665BEC-6877-4720-B1AC-56FA0A71B700" width=0px height=0px></object>
    </div>
    <script type="text/javascript">
        function printList (seq) {
            $.ajax({
                url: '${baseurl}cerebralation/findCerebralCourse.do',
                async: false,
                data: {
                    emgSeq: seq
                },
                success:function(res){
                    setPrintVal(res);
                }
            })
        }
        function setPrintVal (res) {
            for (var key in res['hspCerebralCourseCustom']) {
                var _value = res['hspCerebralCourseCustom'][key] || '';
                if(_value != '' &&  _value != null) {
                    if (key === 'cerebralInd') { 
                        _value = JSON.parse(_value)
                        $.each(_value, function(idx, val) {
                            if(val['isCheck'] == '1') {
                                $('.cerebralInd' + idx).html('√')
                            }
                        })
                    }
                    if (key === 'cerebralCont') { 
                        _value = JSON.parse(_value)
                        $.each(_value, function(idx, val) {
                            if(val['isCheck'] == '1') {
                                $('.cerebralCont' + idx).html('√')
                            } else {
                                $('.cerebralCont' + idx).html('')
                            }
                        })
                    }
                    if(key === 'cerebralDate' || key === 'assessDate'){
                        _value = publicFun.timeFormat(new Date(_value), 'yyyy/MM/dd hh:mm:ss')
                        $('.'+ key).html(_value)
                    }
                    if (key == 'createNam') {
                        $('.'+ key).html(_value)
                    }
                    if (key === 'weight') {
                        _value = _value + 'KG';
                        $('.'+ key).html(_value)
                    }
                    if (key === 'erectDose') {
                        _value = _value + 'mg';
                        $('.' + key).html(_value)
                    }
                    if (key === 'cerebralDnt') {
                        _value = _value + '分';
                        $('.' + key).html(_value)
                    }
                }
            }
            for (var key in res['hspNihssInfCustom']) {
                var _value = res['hspNihssInfCustom'][key] || '';
                if(_value != '' &&  _value != null) {
                    if (key === 'nihssContent') {
                        var _json = JSON.parse(_value);
                        $.each(_json, function(idx, val) {
                            $.each(val, function(index, value) {
                                var keyList = ['time0', 'time15', 'time30', 'time45', 'time60'];
                                $.each(keyList, function (_idx, _val) {
                                    if (val[_val] == null) {
                                        val[_val] = '';
                                    }
                                    if (idx != '15') {
                                        if (value[_val] == '10') {
                                            value[_val] = '9'
                                        }
                                    }
                                })
                                $('.printSel0' + idx).html('');
                                $('.printSel0' + idx).html(value['time0'])
                                $('.printSel15' + idx).html('')
                                $('.printSel15' + idx).html(value['time15'])
                                $('.printSel30' + idx).html('')
                                $('.printSel30' + idx).html(value['time30'])
                                $('.printSel45' + idx).html('')
                                $('.printSel45' + idx).html(value['time45'])
                                $('.printSel60' + idx).html('')
                                $('.printSel60' + idx).html(value['time60'])
                            })
                        })
                    }
                    if(key === 'assessDate'){
                        _value = publicFun.timeFormat(new Date(_value), 'yyyy/MM/dd hh:mm:ss')
                        $('.'+ key + 's').html(_value)
                    }
                    if (key == 'createNam') {
                        $('.nihssAssessDocNam').html(_value)
                    }
                }
            }
            if (res['sheetAssessDate']) {
                res['sheetAssessDate'] = publicFun.timeFormat(new Date(res['sheetAssessDate']), 'yyyy/MM/dd hh:mm:ss')
                $('.sheetAssessDate').html(res['sheetAssessDate'])
            }
            if (res['sheetAssessDocNam']) {
                $('.sheetAssessDocNam').html(res['sheetAssessDocNam'])
            }
            if (res['sheetList']) {
                var _json = res['sheetList'];
                $.each(_json, function(idx, val) {
                    var keyList = ['heartRate', 'pressureDown', 'oxyNbr', 'nihssScore', 'relationDocnam'];
                    $.each(keyList, function(index,value) {
                        if (val[value] == null) {
                            val[value] = '';
                        }
                    })
                    if (val['cerebralDate'] !=='' && val['cerebralDate'] !== null) {
                        val['cerebralDate'] = publicFun.timeFormat(new Date(val['cerebralDate']), 'yyyy/MM/dd hh:mm:ss')
                    } else {
                        val['cerebralDate'] = ''
                    }
                    if (val['pressureUp'] != '' && val['pressureUp'] != null) {
                        val['pressureUp'] = val['pressureUp'] + '/';
                    }
                    $('.cerebralDatesPrint' + val['timeType']).html('');
                    $('.cerebralDatesPrint' + val['timeType']).html(val['cerebralDate']);
                    $('.heartRatePrint' + val['timeType']).html('');
                    $('.heartRatePrint' + val['timeType']).html(val['heartRate']);
                    $('.pressureUpPrint' + val['timeType']).html('');
                    $('.pressureUpPrint' + val['timeType']).html(val['pressureUp']);
                    $('.pressureDownPrint' + val['timeType']).html('');
                    $('.pressureDownPrint' + val['timeType']).html(val['pressureDown']);
                    $('.oxyNbrPrint' + val['timeType']).html('');
                    $('.oxyNbrPrint' + val['timeType']).html(val['oxyNbr']);
                    $('.nihssScorePrint' + val['timeType']).html('');
                    $('.nihssScorePrint' + val['timeType']).html(val['nihssScore']);
                    $('.relationDocNam' + val['timeType']).html('');
                    $('.relationDocNam' + val['timeType']).html(val['relationDocnam'])
                })
            }
        }
        // 页面填充
        function fillHtml (seq) {
          $('#docuTitle').html('脑梗溶栓病程记录内容');
          $.ajax({
            url: '${baseurl}cerebralation/findCerebralList.do',
            async: false,
            type: 'post',
            success: function (data) {
              var lists = data.resultInfo.sysdata;
              var cerebralIndString = '', cerebralContString = '', nihssProjectTypeString = '', sheetTimeString = '' ;
              $.each(lists,function(key, val) {
                if (key === 'cerebralIndList') {
                  $.each (val, function (index, value) {
                    cerebralIndString += '<tr><td>'+ value['infocode'] +'</td><td>'+ value['info'] +'</td><td class="centerTd"><span class=" cerebralInd'+ index +'"></span></td></tr>'
                  })
                }
                if (key === 'cerebralContList') {
                  $.each (val, function (index, value) {
                    cerebralContString += '<tr><td>'+ value['infocode'] +'</td><td>'+ value['info'] +'</td><td class="centerTd"><span class=" cerebralCont'+ index +'"></span></td></tr>'
                  })
                }
                if (key === 'nihssProjectTypeList') {
                  $.each (val, function (index, value) {
                    if (value['remark'] === null) {
                        value['remark'] = ''
                    }
                    nihssProjectTypeString += 
                      '<tr><td class="centerTd">'+ value['info'] +'</td><td>'+ value['remark'] +'</td><td class="centerTd"><span class=" printSel0'+ value['infocode'] +'"></span></td>' +
                          '<td class="centerTd"><span class=" printSel15'+ value['infocode'] +'"></span></td>' +
                          '<td class="centerTd"><span class=" printSel30'+ value['infocode'] +'"></span></td>' +
                          '<td class="centerTd"><span class=" printSel45'+ value['infocode'] +'"></span></td>' +
                          '<td class="centerTd"><span class=" printSel60'+ value['infocode'] +'"></span></td>' +
                      '</tr>'
                  })
                }
                if (key === 'sheetTimeTypeList') {
                  $.each (val, function (index, value) {
                    sheetTimeString += 
                      '<tr><td>'+ value['info'] +'</td><td><span class=" cerebralDatesPrint'+ value['infocode'] +'"></span></td>' +
                          '<td class="centerTd"><span class=" heartRatePrint'+ value['infocode'] +'"></span></td>' +
                          '<td class="centerTd"><span class=" pressureUpPrint'+ value['infocode'] +'"></span><span class=" pressureDownPrint'+ value['infocode'] +'"></span></td>' +
                          '<td class="centerTd"><span class=" oxyNbrPrint'+ value['infocode'] +'"></span></td>' +
                          '<td class="centerTd"><span class=" nihssScorePrint'+ value['infocode'] +'"></span></td>' +
                          '<td class="centerTd"><span class=" relationDocNam' + value['infocode'] + '"></span></td>' +
                      '</tr>'
                  })
                }
              })
              $("#cerebralIndBody").html("");
              $("#cerebralIndBody").append(cerebralIndString);
              $("#cerebralContBody").html("");
              $("#cerebralContBody").append(cerebralContString);
              $("#nihssBody").html("");
              $("#nihssBody").append(nihssProjectTypeString);
              $("#sheetTimeBody").html("");
              $("#sheetTimeBody").append(sheetTimeString);
              if($('#_age').html() == '岁'){
                $('#_age').html("__/__"); 
              }
              if($('#_emgFkCod').html() == ''){
                $('#_emgFkCod').html("__/__"); 
              }
              if($('#_mpi').html() == ''){
                $('#_mpi').html("__/__"); 
              }
              if($('#_lgh').html() == ''){
                $('#_lgh').html("__/__"); 
              }
              printList(seq)
            }
          })
        }
        function printForm(){
            // saveForm();
            fillHtml (_emgSeq);
            try {
                LODOP = getLodop();
                var strStyleCSS = "<link rel='stylesheet' type='text/css' href='${baseurl}css/hzszyyhems/hzszyydoctor/printBrain.css'>";
                LODOP.PRINT_INITA(0, 0, "210mm", "297mm", "打印控件功能演示_Lodop功能_超文本内容缩放打印");
                LODOP.SET_PRINT_PAGESIZE(0, "210mm", "297mm", "");
                LODOP.SET_PRINT_MODE("NOCLEAR_AFTER_PRINT", true);
                LODOP.ADD_PRINT_HTM(1050,344,"90%","100%","<font style='font-size:12px' format='0'><span tdata='pageNO'>第##页</span>/<span tdata='pageCount'>共##页</span></font>");
                LODOP.SET_PRINT_STYLEA(0,"ItemType",1);
                LODOP.ADD_PRINT_HTM(3, 0, "100%", "93%", strStyleCSS + $('#printNote').html());
                LODOP.NewPageA();
                LODOP.ADD_PRINT_HTM(3, 0, "100%", "93%", strStyleCSS + $('#printNoteN').html());
                LODOP.NewPageA();
                LODOP.ADD_PRINT_HTM(3, 0, "100%", "93%", strStyleCSS + $('#printNoteT').html());
                LODOP.NewPageA();
                LODOP.SET_PRINT_STYLE("FontSize", 10);
                //LODOP.SET_PRINTER_INDEX("ZDesigner GK888t");
                LODOP.PREVIEW();
                //LODOP.PRINT();
            } catch (e) {
                $.messager.alert('提示信息', '数据存在某些问题，请刷新后重试', 'warning');
            }
        }
    </script>
    </body>
</html>