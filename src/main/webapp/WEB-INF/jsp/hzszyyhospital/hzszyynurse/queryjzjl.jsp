<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/base/tag.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
  <%@ include file="/WEB-INF/jsp/base/common_css.jsp"%>
  <link rel="stylesheet" type="text/css" href="${baseurl}css/hems/global.css?v=${versionDay}">
  <link rel="stylesheet" type="text/css" href="${baseurl}css/common/querylist.css" />
  <%@ include file="/WEB-INF/jsp/base/common_js.jsp"%>
  <script language="javascript" src="${baseurl}Lodop6.216/LodopFuncs.js"></script>
  <title>护士站-急诊记录列表</title>
  <script>
    var hospitalCategory = '${activeUser.hospitalCategory}', // SD 三墩 LY 灵隐
        typeForm = 'jzList';
  </script>
</head>

<body class="queryjzjl">
  <script type="text/javascript">
    var _baseUrl = '${baseurl}';
    //enter按键默认触发查询
    $(document).keydown(function (event) {
      switch (event.keyCode) {
        case 13:
          queryTab();
      }
    });

    function reload() {
      $('#recordList').datagrid('reload');
    }

    //删除的回调函数
    function del_callback(data) {
      if (data.resultInfo && data.resultInfo.messageCode == '109') {
        message_alert(data, function () {
          window.location.href = "${baseurl}/first.do";
        });
      } else {
        message_alert(data);
        var type = data.resultInfo.type;
        if (type == 1) {
          $('#recordList').datagrid('clearSelections');
          queryTab();
        }
      }
    }

    //删除
    function deletezyyemg(emg_seq) {
      _confirm('确定删除该数据吗？', null, function () {
        publicFun.httpServer({ url: '${baseurl}hzszyyemg/delzyyemgSubmit.do' }, { 'emgSeq': emg_seq }, function (res) {
          del_callback(res);
        })
      });
    }

    //加载datagrid
    $(function () {
      var flag = null;
      setTime();
      getDataGrid();
      initCstDepList();
      getKnowledgeList();
    })
    
    function initCstDepList () {
      var cstDepList = publicFun.getDict('CST_DSP_COD'), strHtml = '<option value=""></option>';
      cstDepList.forEach(function (item, idx) {
        strHtml += '<option value="' + item.infocode + '">' + item.info + '</option>';
      })
      $('#cstDepVal').html(strHtml);
    }

    function keyCodeUp (eve) {
      if ($('#typeVal').val() == '7') { // 诊断
         getCurrentItem();
      }
    }

    var totalCbyxList = []; // 所有的诊断数据
    function getKnowledgeList () {
      publicFun.httpServer({ url: '${baseurl}firstimp/queryZsk_result.do' }, {page: 1,rows: 10000}, function (res) {
        totalCbyxList = res.rows;
      })
    }
    // 诊断信息模糊查询
    function getCurrentItem () {
      var _strItem = '', currentItemVal = $('#queryText').val();
      totalCbyxList.map(function (item, idx) {
        if (currentItemVal) {
          var currentData = item.cbyx.indexOf(currentItemVal);
          var currentLetter = item.pysm.indexOf(currentItemVal.toUpperCase());
          if (currentData === 0 || currentLetter === 0) {
            _strItem += "<li onclick=\"chooseItem('" + item.cbyx + "','" + idx + "')\">" + item.cbyx + "</li>";
          }
        }
      })
      if (_strItem) {
        _strItem = "<ul>" + _strItem + "</ul>";
        $('#queryNameList').html(_strItem);
        $('#queryNameList').show();
      }
    }

    // 单选某一条诊断信息
    function chooseItem (item) {
      $('#queryText').val(item);
      $('#emgText7').val(item);
      $('#queryNameList').html('');
      $('#queryNameList').hide();
      $("#queryText").blur();
    }

    $("body").click(function () {
      $('.smallList').css('display', 'none');
    });

    function getDataGrid(queryItem) {
      if (!queryItem) {
        queryObj = {
          'lqflag': '',
          'grnChlFlag': '',
          'emgDepCod': '',
          'qtsjFlg': ''
        };
        $('.line-span').css({ 'font-weight': 'normal' })
      }
      setType();
      var today = $("#emg_startDate").val();
      var toolbar_v;
      var height = 0.975 * ($("#tabs", parent.document).height() - 36 - 16);
      $("#recordList").height(height);
      publicFun.ajaxVal('${moduleid}', toolbar_v, callBack);
      function callBack(toolbar_v) {
        $.each(toolbar_v, function (idx, val) {
          if (val.id == "editjzzyy") {
            flag = 1;
          }
        });
        $('#recordList').datagrid({
          nowrap: false,
          striped: true,
          singleSelect: true,
          url: '${baseurl}hzszyyemg/queryjzjlzyy_result.do?today=' + today,
          idField: 'emgSeq',
          loadFilter: function (data) {
            if (data.resultInfo && data.resultInfo.messageCode == '109') {
              message_alert(data, function () {
                window.location.href = "${baseurl}/first.do";
              });
            }
            return data;
          },
          queryParams: generateParam(),
          loadMsg: '',
          columns: getCol(),
          pagination: true,
          rownumbers: true,
          pageList: [50, 70, 90],
          toolbar: toolbar_v,
          onDblClickRow: function (rowIndex, rowData) {
            if (flag == 1) {
              parent.opentabwindow(rowData.cstNam + "-" + '修改', "${baseurl}hzszyyemg/xgjz.do?emgSeq=" + rowData.emgSeq + "&th=" + new Date().getTime());
            }
          }
        });
        getLevelNum();
      }
    }

    function getCol() {
      var columns_v = [
        [{
          field: 'emgJjd',
          title: '',
          width: getWidth(0.02),
          formatter: function (value, row, index) {
            return " ";
          },
          styler: function (value, row, index) {
            if (value == "I级") {
              return 'background:url(../images/hems/nurse/oneC.png);background-repeat: no-repeat;background-position: 6px; background-size: 12px 12px;color:transparent;';
            } else if (value == "II级") {
              return 'background:url(../images/hems/nurse/twoC.png);background-repeat: no-repeat;background-position: 6px; background-size: 12px 12px;color:transparent;';
            } else if (value == "III级") {
              return 'background:url(../images/hems/nurse/threeC.png);background-repeat: no-repeat;background-position: 6px; background-size: 12px 12px;color:transparent;';
            } else if (value == "IVa级" || value == "IVb级") {
              return 'background:url(../images/hems/nurse/fourC.png);background-repeat: no-repeat;background-position: 6px; background-size: 12px 12px;color:transparent;';
            }
          }
        }, {
          field: 'emgDat',
          title: '收治日期',
          sortable: true,
          width: getWidth(0.08),
          formatter: function (value, row, index) {
            return value ? publicFun.timeFormat(value, 'yyyy-MM-dd hh:mm:ss') : ''
          }
        }, 
        // {
        //   field: 'vstCad',
        //   title: '门诊号码',
        //   sortable: true,
        //   width: getWidth(0.08)
        // },
        {
          field: 'mpi',
          title: '病历号',
          sortable: true,
          width: getWidth(0.05)
        }, 
        {
          field: 'cstNam',
          title: '病人姓名',
          sortable: true,
          width: getWidth(0.04),
          formatter: function (value, row, index) {
            // 预检是留抢
            if (row.cstDspCodNew == '6') {
              return value + '<span style="color: red; margin-left: 2px">留</span>'
            } else {
              return value;
            }
          }
        }, {
          field: 'cstSexCod',
          title: '性别',
          sortable: true,
          width: getWidth(0.02)
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
          field: 'preDgnCod',
          title: '主诉症状',
          sortable: true,
          width: getWidth(0.05)
        }, {
          field: 'emgDepCod',
          title: '急诊分级',
          sortable: true,
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
          sortable: true,
          width: getWidth(0.04)
        }, {
          field: 'emgFkName',
          title: '分科',
          width: getWidth(0.05),
          sortable: true
        }, {
          field: 'docDat',
          title: '就诊时间',
          width: getWidth(0.08),
          sortable: true,
          formatter: function (value, row, index) {
            if (value == '-28800000') {
              return ''
            } else {
              return value ? publicFun.timeFormat(value, 'yyyy-MM-dd hh:mm:ss') : ''
            }
          }
        }, {
          field: 'jzxh',
          title: '就诊次数',
          width: getWidth(0.03),
          sortable: true
        }, {
          field: 'sqlDctNbr',
          title: '首诊医生',
          width: getWidth(0.04),
          sortable: true
        }, {
          field: 'jbzdDes',
          title: '诊断',
          width: getWidth(0.06),
          sortable: true
        }, {
          field: 'ghbz',
          title: '退挂号',
          width: getWidth(0.03),
          sortable: true,
          formatter: function (value, row, index) {
            if (value == 2) {
              return '<span style="color: red;">已退号</span>'
            } else {
              return ''
            }
          }
        }, {
          field: 'cstDspCodNameNew',
          title: '转归去向',
          sortable: true,
          width: getWidth(0.04),
          formatter: function (value, row, index) {
            //如果hsp_sql_inf只关联了1条
            if (row.firstsqlseq ==row.sqlSeq) {
              return "";
            } else if (row.cstDspCodNew == '2') { //如果是住院就展示科室，否则就展示转归状态
              if (row.cstDspCod == '诊间就诊') { // 诊间就诊的病人转归去住院，医生不填写科室的，此时住院两个字标红
                if (!row.cstDepCodNew) { // 无科室时
                  return '<span style=\"color: red\">住院</span>';
                } else {
                  return row.cstDepCodNew;
                }
              } else {
                return row.cstDepCodNew;
              }
            } else if (row.cstDspCodNew == '13') { //如果是住院就展示科室，否则就展示转归状态
              return row.sqlDes;
            } else {
              return value;
            }
          }
        }, {
          field: 'sqlDat',
          title: '转归时间',
          sortable: true,
          width: getWidth(0.07),
          formatter: function (value, row, index) {
            //如果hsp_sql_inf只关联了1条
            if (row.firstsqlseq ==row.sqlSeq) {
              return "";
            } else {
              return value ? value.replace(/\//g, '-') : ''
            }
          }
        }, {
          field: 'arvChlCod',
          title: '送入方式',
          sortable: true,
          width: getWidth(0.04)

        }, {
          field: 'abnDoctor',
          title: '120医生',
          sortable: true,
          width: getWidth(0.03)

        }, {
          field: 'abnDriver',
          title: '120驾驶员',
          sortable: true,
          width: getWidth(0.03)

        }, {
          field: 'grnChl',
          title: '绿通',
          sortable: true,
          width: getWidth(0.02)
        }, {
          field: 'preUsrNam',
          title: '分诊护士',
          sortable: true,
          width: getWidth(0.03)
        }, {
          field: 'operation',
          title: '',
          width: getWidth(0.04),
          formatter: function (value, row, index) {
            return "<span class='url-link'><a href=javascript:openTimeline('" + row.cstNam + "','" + row.emgSeq + "')>时间轴</a></span>";
          }
        }]
      ];
      return columns_v;
    }

    function openTimeline(cstNam, emgSeq) {
      var openModalWindowUrl = '${baseurl}hzszyyemg/timershaft.do?emgSeq=' + emgSeq;
      createmodalwindow(cstNam + "-" + '时间轴', 800, 340, openModalWindowUrl);
    }

    function cmdzfk(){
      var row = $('#recordList').datagrid('getSelected');
      if (GridUtils.checkChecked(row)) {
        var openModalWindowUrl = '${baseurl}hzszyyemg/toSubdivision.do?emgSeq='+row.emgSeq;
        createmodalwindow(row.cstNam + "-" + '再分科', 800, 340, openModalWindowUrl);
      }
    }
    function cmdrlg(){
      var row = $('#recordList').datagrid('getSelected');
      if (GridUtils.checkChecked(row)) {
        publicFun.httpServer({ url: '${baseurl}hzszyyemg/rlgSubmit.do' }, { 'emgSeq': row.emgSeq  }, function (res) {
        	message_alert(res);
        })
      }
    }
    function cmdclg(){
      var row = $('#recordList').datagrid('getSelected');
      if (GridUtils.checkChecked(row)) {
        publicFun.httpServer({ url: '${baseurl}hzszyyemg/clgSubmit.do' }, { 'emgSeq': row.emgSeq }, function (res) {
        	message_alert(res);
        })
      }
    }

    //患者详情
    function cmdqueryhzxq() {
      var row = $('#recordList').datagrid('getSelected');
      if (GridUtils.checkChecked(row)) {
        parent.opentabwindow(row.cstNam + "-" + '患者详情', "${baseurl}hzszyyemg/queryhzxq.do?emgSeq=" + row.emgSeq + '&xxFlag=0' + "&th=" + new Date().getTime());
      }
    }
    //打印
    function cmdprint() {
      var row = $('#recordList').datagrid('getSelected');
      if (GridUtils.checkChecked(row)) {
        $('.line').css({ 'text-decoration': 'underline' });
        $('.liSmallHth').css({ 'height': '5mm' });
        $('.liHth').css({ 'height': '8mm' });
        $('.smallLeft').css({ 'padding-left': '1mm' });
        $('.bigLeft').css({ 'padding-left': '2mm' });
        var _nullList = ['sbpUpNbr', 'sbpDownNbr', 'pheNbr', 'cstAge'];
        for (var i in _nullList) {
          if (row[_nullList[i]] == null) {
            row[_nullList[i]] = '';
          }
        }
        //修订分级赋值
        var emg_modLvlCod_val = '';
        var _levelList = [{ cod: 'I', name: 'I级' }, { cod: 'Ⅱ', name: 'II级' }, { cod: 'Ⅲ', name: 'III级' }, { cod: 'Ⅳa', name: 'IVa级' }, { cod: 'Ⅳb', name: 'IVb级' }];
        for (var i = 0; i < _levelList.length; i++) {
          if (_levelList[i].name === row.emgDepCod) {
            emg_modLvlCod_val = _levelList[i].cod;
          }
        }
        $("#p_modLvlCod").html(emg_modLvlCod_val);
        $("#k_modLvlCod").html(emg_modLvlCod_val);
        var _codList = ['cstNam', 'mpi', 'emgDat', 'nrsSco', 'emgFkName'];
        _codList.forEach(function (item, index) {
          // if (item === 'emgFkName') {
          //   if (row.emgFkCod != null) {
          //     $("#p_" + item).html(row.emgFkCod);
          //     $("#k_" + item).html(row.emgFkCod);
          //   }
          // } else 
          if (item === 'emgDat') {
            if (row[item] != null) {
              var _timeDate = publicFun.timeFormat(new Date(row[item]), 'yyyy/MM/dd hh:mm:ss')
              $("#p_" + item).html(_timeDate);
              $("#k_" + item).html(_timeDate);
            }
          } else {
            if (row[item] != null) {
              $("#p_" + item).html(row[item]);
              $("#k_" + item).html(row[item]);
            }
          }
        })
        if(row.fallAssCod == '#'){
          $("#p_falAssCod").html('非高危');
        }else if(row.fallAssCod != '' && row.fallAssCod != null){
          $("#p_falAssCod").html('高危');
        }
        //  else {
        //   $("#p_falAssCod").html('');
        // }
        var otherCodList = [{ unit: '', cod: 'tmpNbr' }, { unit: '', cod: 'hrtRte' }, { unit: '', cod: 'breNbr' }, { unit: '', cod: 'oxyNbr' }];
        var bloodFill = '';
        // 生命体征拒测
        var _refusedList = [{ info: '体温不升', infocode: '72' }, { info: '体温拒测', infocode: '1' }, { info: '体温测不出', infocode: '73' },
        { info: '心率拒测', infocode: '2' }, { info: '呼吸拒测', infocode: '3' }, { info: '血压拒测', infocode: '4' }, { info: '血压测不出', infocode: '6' },
        { info: '血氧拒测', infocode: '5' }, { info: '血氧测不出', infocode: '7' }];
        refusedMsgList = [], msgRefuse = [];
        if (row.refusedSurvey) {
          refusedMsgList = row.refusedSurvey.split(',');
        }
        for (var i = 0; i < _refusedList.length; i++) {
          if ($.inArray(_refusedList[i].infocode, refusedMsgList) > -1) {
            msgRefuse.push(_refusedList[i].info + ' ')
          }
        }
        for (var i = 0; i < msgRefuse.length; i++) {
          if (msgRefuse[i].indexOf('血压') > -1) {
            bloodFill += msgRefuse[i].substring(2);
          }
          if (msgRefuse[i].indexOf('体温') > -1) {
            otherCodList[0].unit += msgRefuse[i].substring(2);
          }
          if (msgRefuse[i].indexOf('心率') > -1) {
            otherCodList[1].unit += msgRefuse[i].substring(2);
          }
          if (msgRefuse[i].indexOf('呼吸') > -1) {
            otherCodList[2].unit += msgRefuse[i].substring(2);
          }
          if (msgRefuse[i].indexOf('血氧') > -1) {
            otherCodList[3].unit += msgRefuse[i].substring(2);
          }
        }
        if (!bloodFill) {
          bloodFill = '____/____'
        }
        otherCodList.forEach(function (item, index) {
          if (!item.unit) {
            item.unit = '____'
          }
          if (row[item.cod] != null && row[item.cod] !== '') {
            $("#p_" + item.cod).html(row[item.cod]);
            $('#s_' + item.cod).css('display', 'inline-block');
          } else {
            if (item.unit == '____') {
              $("#p_" + item.cod).css({ 'text-decoration': 'none' });
            }
            $("#p_" + item.cod).html(item.unit);
            $('#s_' + item.cod).css('display', 'none');
          }
        })
        if ((row.sbpUpNbr === '') && (row.sbpDownNbr === '')) {
          $('#p_sbpNbr').html(bloodFill);
          if (bloodFill == '____/____') {
            $("#p_sbpNbr").css({ 'text-decoration': 'none' });
          }
          $('#s_sbpNbr').css('display', 'none');
        } else {
          $("#p_sbpNbr").html(row.sbpUpNbr + " / " + row.sbpDownNbr);
          $('#s_sbpNbr').css('display', 'inline-block');
        }
        //性别
        var _sex = row.cstSexCod;
        $("#p_sex").html(_sex);
        $("#k_sex").html(_sex);
        var AgeStr = '';
        if (row.cstAge !== '') {
          AgeStr = row.cstAge + row.cstAgeCod;
        }
        $("#p_cstAge").html(AgeStr);
        $("#k_cstAge").html(AgeStr);

        if (row.glsType == '2' || row.glsType == '3') {
          if (row.glsType == '2') {
            $('#p_xtCod').html('LO')
          } else if (row.glsType == '3') {
            $('#p_xtCod').html('HI')
          }
        } else {
          if (row.glsNum != null) {
            $('#p_xtCod').html(row.glsNum + 'mmol/L')
          }
        }
        // 判断是否是快速分诊
        var printHTML = '';
        
        printHTML = document.getElementById("doc1").innerHTML;
        //打印预览
        LODOP = getLodop();
        LODOP.PRINT_INITA(0, 0, "64mm", "48mm", "急诊分诊单");		// (增强型)打印初始化	PRINT_INIT(Top, Left, Width, Height, strPrintName)
        LODOP.SET_PRINT_PAGESIZE(0, "64mm", "48mm", "");	// 设定纸张大小
        LODOP.SET_PRINT_MODE("NOCLEAR_AFTER_PRINT", true);	// 设置打印模式	|"NOCLEAR_AFTER_PRINT"：设置打印或预览后内容不清空是否为真。
        LODOP.ADD_PRINT_HTM(5, 0, "64mm", "48mm", printHTML);	// 增强超文本打印项(普通模式)
        LODOP.SET_PRINT_STYLE("FontSize", 8);	// 设置打印项的输出风格	|"FontSize"： 设定纯文本打印项的字体大小。
        LODOP.SET_PRINTER_INDEXA("急诊分诊单");	//(增强型)指定打印设备
        LODOP.PRINT();
        // LODOP.PREVIEW();
      }
    }

    //删除
    function cmddeljzzyy() {
      var node = $('#recordList').datagrid('getSelected');
      if (GridUtils.checkChecked(node)) {
        deletezyyemg(node.emgSeq);
      }
    }

    //修改/转归
    function cmdeditjzzyy() {
      var row = $('#recordList').datagrid('getSelected');
      if (GridUtils.checkChecked(row)) {
        parent.opentabwindow(row.cstNam + "-" + '修改', "${baseurl}hzszyyemg/xgjz.do?emgSeq=" + row.emgSeq + "&th=" + new Date().getTime());
      }
    }
    
    // 转归登记
    function cmdzg () {
      var row = $('#recordList').datagrid('getSelected');
      if (GridUtils.checkChecked(row)) {
        createmodalwindow(row.cstNam  + '-转归登记', 950, 500, '${baseurl}zyyqjs/querylqxxdjzyy.do?emgSeq=' + row.emgSeq + "&th=" + new Date().getTime());
      }
    }

    function cmdExport () {
      _confirm('确定导出吗？', null, function () {
        publicFun.httpServer({ url: '${baseurl}hzszyyemg/exportfzgllbSubmit.do' }, generateParam(), function (res) {
          message_alert(res);
        })
      });
    }
    
    function generateParam () {
      var _paramObj = {
        lqflag: '',
        grnChlFlag: '',
        emgDepCod: '',
        qtsjFlg: ''
      };
      var _codList = ['lqflag', 'grnChlFlag', 'emgDepCod', 'qtsjFlg'];
      if (queryObj) {
        for (var i = 0; i < _codList.length; i++) {
          if (queryObj[_codList[i]] !== '' && queryObj[_codList[i]] != null) {
            _paramObj[_codList[i]] = queryObj[_codList[i]]
          }
        }
      }
      var param = {
        'hspemginfCustom.startdate': $('#emg_startDate').val(),
        'hspemginfCustom.enddate': $('#emg_endDate').val(),
        'hspemginfCustom.cstNam': $('#emgText1').val(),
        // 'hspemginfCustom.vstCad': $('#emgText2').val(),
        'hspemginfCustom.preDgnCod': $('#emgText3').val(),
        'hspemginfCustom.mpi': $('#emgText4').val(),
        'hspemginfCustom.abnDoctor': $('#emgText5').val(),
        'hspemginfCustom.abnDriver': $('#emgText6').val(),
        'hspemginfCustom.preDgnName': $('#emgText7').val(),
        'hspemginfCustom.sqlStaCod': $('#cstDepVal').val(),
        'hspemginfCustom.emgFkCod':$('#emgFkCod').val(),
        'hspemginfCustom.emgDepCod': _paramObj.emgDepCod,
        'notLinked': $('#ghInput').attr('checked') ? '0' : '1', // notLinked（0-勾选，1-不勾选）
        'arvChlFlag': $('#ck120').attr('checked') ? '0' : '1', // notLinked（0-勾选，1-不勾选）
        'autoFlag': $('#auto').attr('checked') ? '0' : '1', // 是否勾选 AUTO（0-勾选，1-不勾选）
        'grnChlFlag': _paramObj.grnChlFlag,
        'lqflag': _paramObj.lqflag,
        'qtsjFlg': _paramObj.qtsjFlg
      };
      return param;
    }

    function getWidth(proportion) {
      var width = $("body").width();
      return Math.round(proportion * width);
    }

    function setTime() {
      var _today = publicFun.timeFormat(new Date(), 'yyyy/MM/dd')
      $("#emg_startDate").val(_today);
      $("#emg_endDate").val(_today);
    };

    //查询方法
    function queryTab() {
      getDataGrid();
    }

    function getLevelNum() {
      publicFun.httpServer({ url: _baseUrl + 'report/getfjtj.do'}, { startdate: $('#emg_startDate').val(), enddate: $('#emg_endDate').val() }, function (res) {
        var data = res.resultInfo.sysdata.fjtjlist;
        $('#firstLevel').html(data[0].count);
        $('#secondLevel').html(data[1].count);
        $('#thirdLevel').html(data[2].count);
        $('#fourALevel').html(data[3].count);
        $('#fourBLevel').html(data[4].count);
        var _numList = ['lqCount', 'lstdCount', 'notLqCount', 'qtsjcount'];
        for (var i = 0; i < _numList.length; i++) {
          $('#' + _numList[i]).html(res.resultInfo.sysdata[_numList[i]])
        }
      });
    }

    function setType() {
      var _codVal = $('#queryText').val(),
        _selVal = $('#typeVal').val();
      $('.queryEmg').val('');
      $('#emgText' + _selVal).val(_codVal);
    }

    function levelCheck(levelNum, idx, field) {
      queryObj = {
        'lqflag': '',
        'grnChlFlag': '',
        'emgDepCod': '',
        'qtsjFlg': ''
      };
      if (field === 'grnChlFlag') {
        queryObj[field] = levelNum
      } else if (field === 'lqflag') {
        queryObj[field] = levelNum;
      } else if (field === 'qtsjFlg') {
        queryObj[field] = levelNum;
      } else {
        queryObj.emgDepCod = levelNum;
      }
      $('.line-span').css({ 'font-weight': 'normal' }).eq(idx).css({ 'font-weight': 'bold' });
      getDataGrid(queryObj);
    }
    var queryObj = {
      'lqflag': '',
      'grnChlFlag': '',
      'emgDepCod': '',
      'qtsjFlg': ''
    };
  </script>
  <OBJECT id="smkOcx" classid="clsid:E691A607-D1D2-48A7-A0EC-09511883A445" width=0px height=0px align="center" hspace="0"
    vspace="0"></OBJECT>
  <form>
    <div class="form clr">
      <p class="form-text">日期：</p>
      <input class="small-date Wdate" id="emg_startDate" type="text" onclick="WdatePicker({dateFmt:'yyyy/MM/dd',isShowClear:false,readOnly:true})">
      <p class="form-text">-</p>
      <input class="small-date Wdate" id="emg_endDate" type="text" onclick="WdatePicker({dateFmt:'yyyy/MM/dd',isShowClear:false,readOnly:true})">
      <select onchange="setType()" id="typeVal">
        <option value="1">患者姓名</option>
        <!-- <option value="2">就诊卡</option> -->
        <option value="4">病历号</option>
        <option value="3">主诉症状</option>
        <option value="5">120医生</option>
        <option value="6">120驾驶员</option>
        <option value="7">诊断</option>
      </select>
      <span class="spanRelative form-text">
        <input id="queryText" type="text" class="input-wth" onkeyup="keyCodeUp(window.event)" autocomplete="off">
        <div class="userList smallList" id="queryNameList"></div>
      </span>
      <input id="emgText1" type="text" class="queryEmg hidden">
      <input id="emgText2" type="text" class="queryEmg hidden">
      <input id="emgText3" type="text" class="queryEmg hidden">
      <input id="emgText4" type="text" class="queryEmg hidden">
      <input id="emgText5" type="text" class="queryEmg hidden">
      <input id="emgText6" type="text" class="queryEmg hidden">
      <input id="emgText7" type="text" class="queryEmg hidden">
      <p class="form-text">急诊科室：</p>
      <select id='emgFkCod' >
       	<option value=""></option>
       		<c:forEach items="${jzkscompctlList}" var="value">
                <option value="${value.comno}">${value.comcname}</option>
            </c:forEach>
      </select>
      <p class="form-text">去向：</p>
      <select id="cstDepVal"></select>
      <p class="otspan">
        <input id="ghInput" type="checkbox">
        <label for="ghInput">未关联挂号</label>
        <input id="auto" type="checkbox">
        <label for="auto">AUTO</label>
        <input id="ck120" type="checkbox">
        <label for="ck120">院内120</label>
      </p>
      <a href="#" class="easyui-linkbutton" iconCls="icon-search" id="btn" onclick="queryTab()">查询</a>
      <span class="span-icon icon icon-form"></span>
      <span class="line-span font-span" onclick="levelCheck('0', '0', 'grnChlFlag')">绿色通道(<span class="black-span" id="lstdCount">0</span>)</span>
      <span class="line-span font-span" onclick="levelCheck('1', '1', 'qtsjFlg')">群体伤(<span class="black-span" id="qtsjcount">0</span>)</span>
      <span class="line-span font-span" onclick="levelCheck('0', '2', 'lqflag')">留抢(<span class="black-span" id="lqCount">0</span>)</span>
      <span class="line-span font-span" onclick="levelCheck('1', '3', 'lqflag')">非留抢(<span class="black-span" id="notLqCount">0</span>)</span>
      <span class="line-span font-span" onclick="levelCheck('0', '4')">I级(<span id="firstLevel">1</span>)</span>
      <span class="line-span font-span" onclick="levelCheck('1', '5')">II级(<span id="secondLevel">2</span>)</span>
      <span class="line-span font-span" onclick="levelCheck('2', '6')">III级(<span id="thirdLevel">3</span>)</span>
      <span class="line-span font-span" onclick="levelCheck('3', '7')">IVa级(<span id="fourALevel">4</span>)</span>
      <span class="line-span font-span" onclick="levelCheck('4', '8')">IVb级(<span id="fourBLevel">4</span>)</span>
    </div>
    <div class="m-l2 queryTabs">
      <table id="recordList"></table>
    </div>
    <div style="height:100%;display: none;" id="doc1">
      <div style="width:100%; font-size:12pt;padding-top:1mm;padding-bottom:1mm;" align="" height="10%">
        <label style="padding-left:7mm;font-family:黑体">
          ${onlyPrintTriageName}
        </label>
      </div>
      <ul style="margin:0px; width:150%;padding-left:0mm;font-size:8pt;font-family:黑体;" align="left">
        <li class="liSmallHth">
          <label class="smallLeft">姓名:</label>
          <label class="line" id="p_cstNam"></label>
        </li>
        <li class="liSmallHth">
          <label class="smallLeft">病历号:</label>
          <label class="line" id="p_mpi"></label>
          <label class="smallLeft">年龄:</label>
          <label class="line" id="p_cstAge"></label>
        </li>
        <li class="liSmallHth">
          <label class="smallLeft">性别:</label>
          <label class="line" id="p_sex"></label>
          <label class="smallLeft">T:</label>
          <label class="line" id="p_tmpNbr">___</label><span id="s_tmpNbr">℃</span>
          <label class="smallLeft">P:</label>
          <label class="line" id="p_hrtRte">___</label> <span id="s_hrtRte"></span>
          <label class="bigLeft">R:</label>
          <label class="line" id="p_breNbr">___</label> <span id="s_breNbr"></span>
        </li>
        <li class="liSmallHth">
          <label class="smallLeft">SPO2:</label>
          <label class="line" id="p_oxyNbr">___</label><span id="s_oxyNbr">%</span>
          <label class="smallLeft">BP:</label>
          <label class="line" id="p_sbpNbr">____/____</label><span id="s_sbpNbr">mmHg</span>
        </li>
        <li class="liSmallHth">
          <label class="smallLeft">跌倒评估:</label>
          <label class="line" id="p_falAssCod">___</label>
          <label class="smallLeft">疼痛:</label>
          <label class="line" id="p_nrsSco">___</label>
          <label class="smallLeft">血糖:</label>
          <label class="line" id="p_xtCod">___</label>
        </li>
        
        <li class="liSmallHth">
          <label class="smallLeft">分诊科室:</label>
          <label class="line" id="p_emgFkName" style="font-weight: bold;">___</label>
          <label class="smallLeft">分诊级别:</label>
          <label class="line" id="p_modLvlCod">___</label>
        </li>
        <li class="liSmallHth">
          <label class="smallLeft">分诊时间:</label>
          <label class="line" id="p_emgDat">___</label>
        </li>
        
      </ul>
    </div>
  </form>
</body>

</html>