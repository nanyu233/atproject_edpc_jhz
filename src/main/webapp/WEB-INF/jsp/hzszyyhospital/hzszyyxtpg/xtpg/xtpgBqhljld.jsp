<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/base/tag.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
  <%@ include file="/WEB-INF/jsp/base/common_css.jsp"%>
  <link rel="stylesheet" type="text/css" href="${baseurl}css/common/querylist.css" />
  <link rel="stylesheet" type="text/css" href="${baseurl}css/hzszyyhems/hljl.css?98">
  <%@ include file="/WEB-INF/jsp/base/common_js.jsp"%>
  <script language="javascript" src="${baseurl}Lodop6.216/LodopFuncs.js"></script>
  <title>病情护理</title>
  <style>
  .datagrid-header-row .datagrid-cell span {
      white-space: normal !important;
      word-wrap: normal !important;
  }
  .datagrid-cell{
    height: auto
  }
  </style>
</head>

<body class="bqhlby">
  <div class="form clr">
    <p class="form-text">日期：</p>
    <input class="small-date Wdate" id="start-date" type="text" onclick="WdatePicker({dateFmt:'yyyy/MM/dd',isShowClear:false,readOnly:true, maxDate:'#F{$dp.$D(\'end-date\')}'})">
    <p class="form-text">-</p>
    <input class="small-date Wdate" id="end-date" type="text" onclick="WdatePicker({dateFmt:'yyyy/MM/dd',isShowClear:false,readOnly:true, minDate:'#F{$dp.$D(\'start-date\')}'})">
    <a class="easyui-linkbutton cursor-type" iconCls="icon-search" id="btn" onclick="getpatenttab()">查询</a>
  </div>
  <div class="tabdataDiv xtpgxqDiv queryTabs">
    <table id="notelist"></table>
  </div>
  <form id="notedeleteform" action="${baseurl}zjszyyhljld/delhljldSubmit.do" method="post">
    <input type="hidden" id="bqhiSeq" name="bqhiSeq" />
  </form>
  <!-- 打印病情护理记录单 -->
  <jsp:include page="/WEB-INF/jsp/hzszyyhospital/hzszyynote/printnote.jsp"></jsp:include>
  <script type="text/javascript">
    var comdata = parent.comdata, _emgSeq = comdata.emgSeq;
    var _usrNo = '${sessionScope.activeUser.usrno}';
    var roleList = '${sessionScope.activeUser.dstroleList}';
    $(function () {
      init();
    });

    function init() {
      publicFun.getAllNormalRange();
      $("#emgSeq").val(comdata.emgSeq);
      // parent.parent.getFirstPatientMsg();
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
        getpatenttab();
      }, function (res) {
        var _today = publicFun.timeFormat(new Date(), 'yyyy/MM/dd')
        $("#start-date").val(_today);
        $("#end-date").val(_today);
        getpatenttab();
      })
    }

    function getWidth(proportion) {
      var width = $("body").width();
      return Math.round(proportion * width);
    }

    //获取病情护理记录单datagrid表
    function getpatenttab() {
      var height;
      if (parent._JJBheight) {
        height = parent._JJBheight - 27
      } else {
        height = 0.975 * ($("#tabs", parent.parent.parent.document).height() - 28 - 29) - 27 - 29;
      }
      $("#notelist").height(height);
      $('#notelist').datagrid({
        nowrap: false,
        striped: true,
        singleSelect: true,
        url: '${baseurl}zjszyyhljld/queryhljld_result.do',
        idField: 'crtDat',
        loadFilter: function (data) {
          if (data.resultInfo && data.resultInfo.messageCode == '109') {
            message_alert(data, function () {
              window.location.href = "${baseurl}first.do";
            });
          }
          return data;
        },
        loadMsg: '',
        columns: getColumns(),
        pagination: true,
        rownumbers: true,
        pageList: [50, 70, 90],
        toolbar: getToolbars(),
        queryParams: {
          "hsphljldinfCustom.emgSeq": comdata.emgSeq,
          "startdate": $("#start-date").val(),
          "enddate":  $("#end-date").val()
        },
        onDblClickRow: function (rowIndex, rowData) {
          // if(rowData.crtNur==null){
          //       $.messager.alert('提示信息', "统计量无法修改，请删除后重新统计", 'warning');
          // }else{
          // 	parent.parent.opentabwindow(comdata.cstNam + "-" + '护理记录单修改', "${baseurl}zjszyyhljld/edithljld.do?bqhiSeq=" + rowData.bqhiSeq +"&emgSeq="+emgSeq+"&th=" + new Date().getTime(),"0");
          // }
          editnote()
        },
        rowStyler: function (rowIndex, rowData) {
          if (rowData.crtNur == null) {
            return 'color:#2a00ff;';
          }
        },
      });
    }

    function getToolbars() {
      var toolbars = [
        {
          text: '新增',
          iconCls: 'icon-add',
          handler: function () { addnote(); }
        }, {
          text: '修改',
          iconCls: 'icon-edit',
          handler: function () { editnote(); }
        }, {
          text: '删除',
          iconCls: 'icon-cancel',
          handler: function () { delnote(); }
        }, {
          text: '出入量统计',
          iconCls: 'icon-edit',
          handler: function () { sumnote(); }
        }, 
        // {
        //   text: '导出',
        //   iconCls: 'icon-redo',
        //   handler: function () { export1(); }
        // }, 
        {
          text: '打印',
          iconCls: 'icon-print',
          handler: function () { printTable(); }
        },
        // , {
        //   text: '预警阀值管理',
        //   iconCls: 'icon-edit',
        //   handler: function () { editIcuVsDef(); }
        // }, 
        {
          text: '刷新',
          iconCls: 'icon-reload',
          handler: function () { getpatenttab(); }
        }
      ]
      return toolbars;
    };

    //新增病情护理记录单
    function addnote() {
      parent.parent.parent.opentabwindow(comdata.cstNam + "-" + '护理记录单新增', "${baseurl}zjszyyhljld/addhljld.do?emgSeq=" + comdata.emgSeq + "&th=" + new Date().getTime(), "0");
    }

    //修改病情护理记录单
    function editnote() {
      var row = $('#notelist').datagrid('getSelected');
      if (GridUtils.checkChecked(row)) {
        if (row.crtNur == null) {
          $.messager.alert('提示信息', "统计量无法修改，请删除后重新统计", 'warning');
        } else {
        	if(checkRoles(row.crtNur)){
				parent.parent.parent.opentabwindow(comdata.cstNam + "-" + '护理记录单修改', "${baseurl}zjszyyhljld/edithljld.do?bqhiSeq=" + row.bqhiSeq + "&emgSeq=" + row.emgSeq + "&th=" + new Date().getTime(), "0");        	
        	}else{
        		$.messager.alert('提示信息', "无修改权限", 'warning');
        	}
        }
      }
    }

    //删除病情护理记录单
    function delnote() {
      var row = $('#notelist').datagrid("getSelected");
      if (GridUtils.checkChecked(row)) {
      	if(checkRoles(row.crtNur)){
      		_confirm('确定删除该数据吗？', null, function () {
          		$("#bqhiSeq").val(row.bqhiSeq);
          		jquerySubByFId('notedeleteform', notedel_callback, null, "json");
         		$('#notelist').datagrid('clearSelections');
        	});
      	}else{
      		$.messager.alert('提示信息', "无删除权限", 'warning');
      	}
      }
    }

    //删除病情护理记录单   回调
    function notedel_callback(data) {
      if (data.resultInfo && data.resultInfo.messageCode == '109') {
        message_alert(data, function () {
          window.location.href = "${baseurl}/first.do";
        });
      } else {
        message_alert(data);
        var type = data.resultInfo.type;
        if (type == 1) {
          reload();
        }
      }
    }

    //查询方法
    function reload() {
      $('#notelist').datagrid('reload');
    }

    //出入量统计
    function sumnote() {
      createmodalwindow("出入量统计", 500, 365, "${baseurl}zjszyyhljld/querysumcrl.do?emgSeq=" + comdata.emgSeq + "&th=" + new Date().getTime(), "0");
    }

    //导出病情护理记录单
    function export1() {
      publicFun.httpServer({ url: "${baseurl}zjszyyhljld/exportHljldSubmit.do", isAsync: false }, {
        "hsphljldinfCustom.emgSeq": comdata.emgSeq,
        "startdate": $("#start-date").val(),
        "enddate":  $("#end-date").val()
      }, function (res) {
        hljldExprot_callback(res)
      });
    }

    //导出病情护理记录单回调
    function hljldExprot_callback(data) {
      //在这里提示信息中有文件下载链接
      if (data.resultInfo && data.resultInfo.messageCode == '109') {
        message_alert(data, function () {
          window.location.href = "${baseurl}/first.do";
        });
      } else {
        message_alert(data);
      }
    }

    //预警阀值管理
    function editIcuVsDef() {
      createmodalwindow("预警阀值管理", 500, 365, "${baseurl}icuVsDef/toIcuVsDef.do", "0");
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
        { field: 'hrtRte', title: '心率(次/分)', width: getWidth(0.03), rowspan: 2,
          formatter: function (value, row, index) {
              if (row.hrtRteFlg == "2") {
                return "测不出";
              } else if (row.hrtRteFlg == "3") {
                return "拒测";
              } else {
                return value;
              }
            }
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
                return "机械通气:";
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
          field: 'xt', title: '血糖(mmol/L)', width: getWidth(0.038),rowspan: 2,
          formatter: function (value, row, index) {
            // if (row.xtFlg == "3") {
            //   return "HI"+(row.xtName?'('+row.xtName+')':'');
            // } else if (row.xtFlg == "2") {
            //   return "LO"+(row.xtName?'('+row.xtName+')':'');
            // } else if (row.xtFlg == "4") {
            //   return "拒测"+(row.xtName?'('+row.xtName+')':'');
            // } else {
            //   if (row.xtFlg == "1" && value != null) {
            //     return parseFloat(value).toFixed(1)+(row.xtName?'('+row.xtName+')':'');
            //   } else if(row.xtName != null){
            //     return row.xtName
            //   }else{
            //     return null;
            //   }
            // }
            if (row.xtFlg == "3") {
              return "HI" ;
            } else if (row.xtFlg == "2") {
              return "LO" ;
            } else if (row.xtFlg == "4") {
              return "拒测";
            } else {
              if (value != null) {
                return parseFloat(value).toFixed(1);
              } else{
                return null;
              }
            }
          }
        },{
          field: 'cvp',
          title: 'CVP (mmHg)',
          rowspan: 2,
          width: getWidth(0.035)
        },
        { field: 'xtFlg', title: '血糖标识', hidden: 'true'},
        { field: 'bradenSco', title: 'Braden', width: getWidth(0.028),rowspan: 2 },
        { field: 'adlSco', title: 'ADL', width: getWidth(0.025),rowspan: 2 },
        { field: 'nrsSco', title: '疼痛评分', width: getWidth(0.026),rowspan: 2 },
        { field: 'gcsSco', title: 'GCS', width: getWidth(0.025),rowspan: 2 },
        { field: 'morseSco', title: 'Morse', width: getWidth(0.03),rowspan: 2 },
        { field: 'zyfxpfSco', title: '转运风险评分', width: getWidth(0.028),rowspan: 2 },
        { field: 'rl', title: '单位入量(ml)', width: getWidth(0.06),rowspan: 2 },
        { field: 'cl', title: '单位出量(ml)', width: getWidth(0.06),rowspan: 2 },
        {
          field: 'jchl', title: '基础护理', width: getWidth(0.09), rowspan: 2
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
        { field: 'hsusrnames', title: '护士签名', width: getWidth(0.052),rowspan: 2 }], 
        [
          {
            field: 'tkLeftCod',
            title: '左',
            align: 'center',
            width: getWidth(0.023),
            formatter: function (value, row, index) {
              return dealTkCod(row.tkLeftCod,row.tkLeftOther);
            }
          },
          {
            field: 'tkRightCod',
            title: '右',
            align: 'center',
            width: getWidth(0.023),
            formatter: function (value, row, index) {
              return dealTkCod(row.tkRightCod,row.tkRightOther);
            }
          },
          {
            field: 'tkLeft',
            title: '左mm',
            align: 'center',
            width: getWidth(0.02)
          },
          {
            field: 'tkRight',
            title: '右mm',
            align: 'center',
            width: getWidth(0.02)
          }
        ]
      ]
      return columns_v;
    }

    function dealTkCod (_cod, _val, _other) {
      var _tkString = '';
      var _tkList = [{infocode: '0', info: '灵敏' }, {infocode: '1', info: '迟钝' }, {infocode: '2', info: '消失' }, {infocode: '3', info: '白内障' }, { infocode: '4', info: '眼球缺失' }];     
      if (_cod != null) {        
        for (var i = 0; i < _tkList.length; i++) {
          if (_cod == _tkList[i].infocode){
          	_tkString = _tkList[i].info
          }    
        }
      }else{
      	_tkString = _val
      }
      // if (_val != null) {
      //   _tkString += _val + 'mm' + '；'
      // }
      // if (_other != null) {
      //   _tkString += '其他：' + _other + '；'
      // }
      return _tkString
    }

    //utf8和16进制相互转换
    function hexToString(s1) {
      var checkInteger = /^[0-9]*$/;//数字验证
      var checkCase = /^[A-Z]+$/;//大写字母验证
      var tmp2 = '',
        res = '';
      for (i = 0; i < s1.length;) {
        tmp2 += '%' + s1.substring(i, i += 2);
      }
      res = decodeURI(tmp2);
      /* res=res.replace(/%2C/g,'，');
      res=res.replace(/%2B/g,'+');
      res=res.replace(/%2D/g,'-');
      res=res.replace(/%3F/g,'？');
      res=res.replace(/%2E/g,'。'); */
      for (var int = 0; int < res.length / 3; int++) {
        if (res.indexOf('%2C') > -1) {
          res = res.replace('%2C', '，')
        } else if (res.indexOf('%2B') > -1) {
          res = res.replace('%2B', '+')
        } else if (res.indexOf('%3F') > -1) {
          res = res.replace('%3F', '？')
        } else if (res.indexOf('%2E') > -1) {
          res = res.replace('%2E', '。')
        } else if (res.indexOf('%2D') > -1) {
          res = res.replace('%2D', '-')
        } else if (res.indexOf('%3B') > -1) {
          res = res.replace('%3B', '；')
        } else {
          break;
        }
      }
      return res;
    }  
    
    /**
     * 修改删除角色验证
     */
    function checkRoles(usrId){
    	if(usrId != null && usrId != ''){
    		if("admin" === _usrNo){
    		return true;
	    	}else{
	    		var roles = eval('('+roleList+')');
	    		if(roles.indexOf(1901) > -1){
	    			return true;
	    		}else{
	    			if(_usrNo == usrId){
						return true;
	    			}else{
	    				return false;
	    			}
	    		}
	    		
	    	}
    	}else{
    		return true;
    	}
    }
  </script>
</body>

</html>