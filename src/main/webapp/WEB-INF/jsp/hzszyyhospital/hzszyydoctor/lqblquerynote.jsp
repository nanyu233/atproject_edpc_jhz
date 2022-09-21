<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/base/tag.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
  <%@ include file="/WEB-INF/jsp/base/common_css.jsp"%>
  <link rel="stylesheet" type="text/css" href="${baseurl}css/hems/global.css">
  <link rel="stylesheet" type="text/css" href="${baseurl}css/hzszyyhems/hzszyydoctor/querycfjl.css">
  <%@ include file="/WEB-INF/jsp/base/common_js.jsp"%>
  <script type="text/javascript" src="${baseurl}Lodop6.216/LodopFuncs.js"></script>
  <title>护理记录单</title>
  <script>
    var _emgSeq = '${emgSeq}';
  </script>
</head>

<body class="tabsBody">
  <script type="text/javascript">
    function setLayout() {
      var windowsWidth = parent.$('#mainIfream').width(),
        windowsHeigt = parent.$('#mainIfream').height();
      $('#tabList').height(windowsHeigt - 57 - 29);
    }
    //enter按键默认触发查询
    $(document).keydown(function (event) {
      switch (event.keyCode) {
        case 13:
          load2();
      }
    });

    function reload() {
      $('#tabList').datagrid('reload');
    }

    function getColumns() {
      //datagrid列定义
      var columns_v = [
        [{ field: 'crtDat', title: '创建时间', width: getWidth(0.035), rowspan: 2,
         formatter: function (value, row, index) {
            return value ? publicFun.timeFormat(new Date(value), 'MM-dd hh:mm'): ''
          }
        },
        { field: 'senRctCod', title: '意识', width: getWidth(0.035),rowspan: 2 },
        {
          field: 'tmpNbr', title: '体温(℃)', width: getWidth(0.024), rowspan: 2,
          formatter: function (value, row, index) {
            if (row.tmpNbrFlg == "2") {
              return "不升";
            } else if (row.tmpNbrFlg == "3") {
              return "拒测";
            } else {
              return value
            }
          }
          // styler: function (value, row, index) {
          //   return publicFun.judgeIsNormalRange('1', value);
          // }
        },
        { field: 'tmpNbrFlg', title: '体温标识', hidden: 'true' },
        { field: 'bqhiSeq', title: '标识', width: getWidth(0.08), hidden: 'true'},
        /* {field: 'hrtRte', title: '脉搏(次/分)',sortable: true,width: getWidth(0.05),} ,*/
        { field: 'hrtRte', title: '心率(次/分)', width: getWidth(0.03), rowspan: 2
          // styler: function (value, row, index) {
          //   return publicFun.judgeIsNormalRange('2', value);
          // }
        },
        {
          field: 'breNbr', title: '呼吸(次/分)', width: getWidth(0.03), rowspan: 2,
          formatter: function (value, row, index) {
            if (row.breNbrFlg == "2") {
              if (value != null) {
                return "机械通气:" + value;
              } else {
                return "";
              }
            } else if (row.breNbrFlg == "3") {
              return "拒测";
            } else {
              if (value != null) {
                return value;
              } else {
                return "";
              }
            }
          }
        },
        // sbpUpNbr sbpDownNbr
        {
          field: 'sbp', title: '血压(mmHg)', width: getWidth(0.04), rowspan: 2,
          formatter: function (value, row, index) {
            if (row.sbpNbrFlg == "2") {
              return "测不出";
            } else if (row.sbpNbrFlg == "3") {
              return "拒测";
            } else {
              return value;
            }
          }
          // ,
          // styler: function (value, row, index) {
          //   var redColor = 'color:#dc3545;', greenColor = 'color:#28a745';
          //   var _upColor = publicFun.judgeIsNormalRange('4', row.sbpUpNbr), _downColor = publicFun.judgeIsNormalRange('5', row.sbpDownNbr);
          //   if (((_upColor == redColor) || (_upColor == greenColor)) && !_downColor) {
          //     return _upColor
          //   }
          //   if (((_downColor == redColor) || (_downColor == greenColor)) && !_upColor) {
          //     return _downColor
          //   }
          //   if (((_downColor == redColor) || (_downColor == greenColor)) && ((_upColor == redColor) || (_upColor == greenColor))) {
          //     return redColor
          //   }
          // }
        },
        { field: 'sbpNbrFlg', title: '血压标识', hidden: 'true'},
        {
          field: 'xy', title: '血氧', width: getWidth(0.026), rowspan: 2,
          formatter: function (value, row, index) {
            if (row.xyFlg == "2") {
              return "测不出";
            } else if (row.xyFlg == "3") {
              return "拒测";
            } else {
              return value;
            }
          }
          // ,
          // styler: function (value, row, index) {
          //   return publicFun.judgeIsNormalRange('6', value);
          // }
        },
        { field: 'xyFlg', title: '血氧标识', hidden: 'true' },
        {
          title: '瞳孔',
          colspan: 2,
          width: getWidth(0.046)
        },
        {
          title: '瞳孔大小',
          colspan: 2,
          width: getWidth(0.04)
        },
        {
          field: 'xt', title: '血糖(mmol/L)', width: getWidth(0.035),rowspan: 2,
          formatter: function (value, row, index) {
            if (row.xtFlg == "3") {
              return "HI"+(row.xtName?'('+row.xtName+')':'');
            } else if (row.xtFlg == "2") {
              return "LO"+(row.xtName?'('+row.xtName+')':'');
            } else if (row.xtFlg == "4") {
              return "拒测"+(row.xtName?'('+row.xtName+')':'');
            } else {
              if (row.xtFlg == "1" && value != null) {
                return parseFloat(value).toFixed(1)+(row.xtName?'('+row.xtName+')':'');
              } else if(row.xtName != null){
                return row.xtName
              }else{
                return null;
              }
            }
          }
        },
        {
          field: 'cvp',
          title: 'cvp(mmHg)',
          rowspan: 2,
          width: getWidth(0.04)
        },
        { field: 'xtFlg', title: '血糖标识', hidden: 'true'},
        { field: 'bradenSco', title: 'Braden', width: getWidth(0.028),rowspan: 2 },
        { field: 'adlSco', title: 'ADL', width: getWidth(0.028),rowspan: 2 },
        { field: 'nrsSco', title: '疼痛评分', width: getWidth(0.026),rowspan: 2 },
        { field: 'gcsSco', title: 'GCS', width: getWidth(0.025),rowspan: 2 },
        { field: 'morseSco', title: 'Morse', width: getWidth(0.03),rowspan: 2 },
        { field: 'zyfxpfSco', title: '转运风险评分', width: getWidth(0.028),rowspan: 2 },
        { field: 'rl', title: '单位入量(ml)', width: getWidth(0.05),rowspan: 2 },
        { field: 'cl', title: '单位出量(ml)', width: getWidth(0.05),rowspan: 2 },
        {
          field: 'jchl', title: '基础护理', width: getWidth(0.073), rowspan: 2
          /*  formatter: function(value, row, index) {
                  if (value.substr(0,1) == ",") {
                      return value=value.substr(1);
                  }else if(value.substr(value.length-1,1) == ","){
                      return value=value.substr(0,value.length-1);
                  }
              },*/
        },
        {
          field: 'bqgc', title: '病情观察、护理措施和效果', width: getWidth(0.16), rowspan: 2,
          formatter: function (value, row, index) {
            if (row.bqgcHex == null) {
              return value;
            } else {
              if (value.indexOf("？") > -1) {
                return hexToString(row.bqgcHex);
              } else {
                return value;
              }
            }
          }
        },
        { field: 'hsusrnames', title: '护士签名', width: getWidth(0.05),rowspan: 2 }], 
        [
          {
            field: 'tkLeftCod',
            title: '左',
            align: 'center',
            width: getWidth(0.023),
            formatter: function (value, row, index) {
              return dealTkCod(row.tkLeftCod);
            }
          },
          {
            field: 'tkRightCod',
            title: '右',
            align: 'center',
            width: getWidth(0.023),
            formatter: function (value, row, index) {
              return dealTkCod(row.tkRightCod);
            }
          },
          {
            field: 'tkLeft',
            title: '左mm',
            align: 'center',
            width: getWidth(0.03)
          },
          {
            field: 'tkRight',
            title: '右mm',
            align: 'center',
            width: getWidth(0.03)
          }
        ]
      ]
      return columns_v;
    }

    function load2() {
      var toolbar_v;
      publicFun.ajaxVal('aaa', toolbar_v, callBack);
      function callBack(toolbar_v) {
        $('#tabList').datagrid({
          nowrap: true,
          striped: true,
          singleSelect: true,
          url: '${baseurl}zjszyyhljld/queryhljld_result.do',
          idField: 'crtDat',
          loadMsg: '',
          columns: getColumns(),
          title: "病情护理记录单",
          nowrap: false,
          pagination: true,
          rownumbers: true,
          pageList: [20, 30, 50],
          toolbar: "#toolbar",
          queryParams: {
            "startdate": $("#start-date").val(),
            "enddate":  $("#end-date").val(),
            "hsphljldinfCustom.emgSeq": _emgSeq
          }
        });
        var _thisWidth = $('body').width();
        $('.panel-header,.datagrid-wrap.panel-body,.easyui-panel.panel-body,.datagrid-header').css('width', '' + _thisWidth - 10 + '');
      }

    }

    function getWidth(proportion) {
      var width = $("body").width();
      return Math.round(proportion * width);
    }

    function setTime() {
      publicFun.httpServer({url: '${baseurl}zyyxtpg/findEmgInfByEmgSeq.do', isNoLoad: true}, { emgSeq: _emgSeq, date: new Date().toTimeString()}, function (res) {
        var _emgObjInfo = res.resultInfo.sysdata.hspemginfCustom;
        if (_emgObjInfo.sqlStaCod == 6) {
          var _today = publicFun.timeFormat(new Date(), 'yyyy/MM/dd')
          $("#start-date").val(_today);
          $("#end-date").val(_today);
        } else {
          $("#start-date").val(publicFun.timeFormat(new Date(_emgObjInfo.emgDat), 'yyyy/MM/dd'));
          $("#end-date").val(publicFun.timeFormat(new Date(_emgObjInfo.sqlDatNew), 'yyyy/MM/dd'));
        }
        load2();
      }, function (res) {
        var _today = publicFun.timeFormat(new Date(), 'yyyy/MM/dd')
        $("#start-date").val(_today);
        $("#end-date").val(_today);
        load2();
      })
    };

    //utf8和16进制相互转换
    function hexToString(s1) {
      var tmp2 = '',
        res = '';
      for (i = 0; i < s1.length;) {
        tmp2 += '%' + s1.substring(i, i += 2);
      }
      res = decodeURI(tmp2);
      for (var int = 0; int < res.length / 2; int++) {
        var len = res.indexOf('%');
        if (res.indexOf('%') > -1) {
          var subStr = res.substring(len, len + 3);
          res = res.replace(subStr, ',')
        } else {
          break;
        }
      }
      return res;
    }

    //初始化 判断登陆用户角色是否有权限
    function checkRole() {
      //判断是否有权限
      publicFun.httpServer({ url: '${baseurl}zyylqbl/checkRoleAjax.do' }, {"cratNbr": ''}, function (data) {
        checkstatus = data.resultInfo.message;
        if (data.resultInfo.message == "tourist") {
          $('#print').hide();
        }
      });
    }

    $(function () {
      setLayout();
      setTime();
      checkRole();
      $(window).resize(function () {
        load2();
      });
    });
  </script>
  <form id="noteform" name="noteform" action="${baseurl}zjszyyhljld/exportHljldSubmit.do" method="post">
    <div class="form clr">
      <p class="form-text">日期：</p>
      <input class="small-date Wdate" id="start-date" type="text" onclick="WdatePicker({dateFmt:'yyyy/MM/dd',isShowClear:false,readOnly:true, maxDate:'#F{$dp.$D(\'end-date\')}'})">
      <p class="form-text">-</p>
      <input class="small-date Wdate" id="end-date" type="text" onclick="WdatePicker({dateFmt:'yyyy/MM/dd',isShowClear:false,readOnly:true, minDate:'#F{$dp.$D(\'start-date\')}'})">
      <a class="easyui-linkbutton cursor-type" iconCls="icon-search" id="btn" onclick="load2()">查询</a>
    </div> 
    <div class="list_table list_div">
      <table id="tabList"></table>
    </div>
    <div class="btnPos">
      <a href="javascript:;" class="commonbtn" id="print" onclick="printTable()">打印</a>
    </div>
  </form>
  <!-- 打印病情护理记录单 -->
  <jsp:include page="/WEB-INF/jsp/hzszyyhospital/hzszyynote/printnote.jsp"></jsp:include>
</body>

</html>