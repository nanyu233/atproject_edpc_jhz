<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/base/tag.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
  <%@ include file="/WEB-INF/jsp/base/common_css.jsp"%>
  <%@ include file="/WEB-INF/jsp/base/common_js.jsp"%>
  <title>检验信息弹出框</title>
  <link rel="stylesheet" type="text/css" href="${baseurl}css/hems/global.css">
</head>

<body class="examinebody">
  <script type="text/javascript">
    var _baseUrl = "${baseurl}", _sourceType = "${sourceType}"; // sourceType 为了知识库而设定
    var fieldArry = [],
      dadTitleList = [],
      isCurrentSelect = [];
    var fieldString = '',
      isSelectAll = '';

    //enter按键默认触发查询
    $(document).keydown(function (event) {
      switch (event.keyCode) {
        case 13:
          jzjlquery()
      }
    });

    function reload() {
      $('#mainexaminelist').datagrid('reload');
      $('#examinelist').datagrid('reload');
    }

    function isRangeColor(row) {
      var _currentResult = '';
      if (row.result) {
        _currentResult = row.result.replace(/[^\d|.]/g, '');
      }
      if (row.lowerLimit && row.upperLimit) {
        if (parseFloat(_currentResult) > parseFloat(row.upperLimit)) {
          return "color:red;";
        } else if (parseFloat(_currentResult) < parseFloat(row.lowerLimit)) {
          return "color:#7cd89b";
        } else {
          return "";
        }
      } else {
        return "";
      }
    }
    
    /**
     * * 定义datagrid的内容field
     **/
    var columnse_v = [
      [{
        checkbox: true
      }, {
        field: 'rownums',
        title: 'id',
        hidden: true
      }, {
        field: 'patientId',
        title: '预检号',
        width: getWidth(0.10),
        hidden: true
      }, {
        field: 'resultDateTime',
        title: '报告时间',
        width: getWidth(0.20),
        sortable: true,
        formatter: function (value, row, index) {
          return value ? publicFun.timeFormat(new Date(value), "yyyy/MM/dd hh:mm:ss") : ""
        },
        hidden: true
      }, {
        field: 'examinaim',
        title: '样本类型',
        sortable: true,
        width: getWidth(0.15),
        hidden: true
      }, {
        field: 'reportItemName',
        title: '试验名称',
        sortable: true,
        width: getWidth(0.30),
        styler: function (value, row, index) {
          return isRangeColor(row);
        }
      }, {
        field: 'result',
        title: '分析结果',
        sortable: true,
        width: getWidth(0.15),
        styler: function (value, row, index) {
          return isRangeColor(row);
        }
      }, {
        field: 'lowerLimit',
        title: '参考范围低限',
        sortable: true,
        width: getWidth(0.15),
        styler: function (value, row, index) {
          return isRangeColor(row);
        }
      }, {
        field: 'upperLimit',
        title: '参考范围高限',
        sortable: true,
        width: getWidth(0.15),
        styler: function (value, row, index) {
          return isRangeColor(row);
        }
      }, {
        field: 'units',
        title: '单位',
        sortable: true,
        width: getWidth(0.15),
        styler: function (value, row, index) {
          return isRangeColor(row);
        }
      }, {
        field: 'sign',
        title: '乘号',
        sortable: true,
        width: getWidth(0.10),
        hidden: true
      }, {
        field: 'sampleno',
        title: '样例号',
        sortable: true,
        width: getWidth(0.10),
        hidden: true
      }]
    ];

    /**
    * 获取当前选项下的数组
    **/
    function takePushList(title, fulltitle) {
      var angencyArry = [];
      var list = $('#examinelist').datagrid('getSelections');
      if (list.length > 0) {
        $.each(list, function (idx, val) {
          var _isNum = isNaN(val.units.slice(0,1));
          if(!_isNum && val.units != ''){
              angencyArry.push(val.reportItemName + val.result + '×' + val.units + "，"); 
          }else{
              angencyArry.push(val.reportItemName + val.result + val.units + "，"); 
          }
        })
      }
      return angencyArry;
    }

    //加载datagrid
    function abntable() {
      var height = 0.83 * ($(window).height());
      var width = 0.3 * ($(window).width());
      $("#mainexaminelist").height(height);
      $("#mainexaminelist").width(width);
      //datagrid列定义
      var columns_v = [
        [{
          field: 'mainid',
          title: 'id',
          formatter: function (value, row, index) {
            return index + 1;
          },
          hidden: true
        }, {
          field: 'patientId',
          title: '预检号',
          width: getWidth(0.10),
          hidden: true
        }, {
          field: 'resultDateTime',
          title: '报告时间',
          width: getWidth(0.21) - _need_minus,
          sortable: true,
          formatter: function (value, row, index) {
            return value ? publicFun.timeFormat(new Date(value), "yyyy/MM/dd hh:mm:ss") : ""
          }
        }, {
          field: 'examinaim',
          title: '样本类型',
          sortable: true,
          width: getWidth(0.21) - _need_minus,
          formatter: function (value, row, index) {
            if (row.jylx){
              value = '<font color="red">（'+row.jylxmc+'）</font>' + value;
            }
            return value;
          },
        }, {
          field: 'sampleno',
          title: '样例号',
          sortable: true,
          width: getWidth(0.10),
          hidden: true
        }]
      ]

      setTime();
      var today = $("#emg_enddate").val();
      var startdate = $("#emg_startdate").val();
      $('#mainexaminelist').datagrid({
        nowrap: false,
        striped: true,
        singleSelect: true,
        url: '${baseurl}his/queryexamine_result.do',
        queryParams: {
          "vHemsJyjgCustom.patientId": '${MPI}',
          "vHemsJyjgCustom.startdate": startdate,
          "vHemsJyjgCustom.enddate": today
        },
        idField: 'mainid',
        columns: columns_v,
        rownumbers: true,
        onClickRow: function (rowIndex, rowData) {
          var _addtitle = publicFun.timeFormat(rowData.resultDateTime, "yyyy/MM/dd hh:mm:ss") + rowData.examinaim + "：";
          var currentData = $.inArray(_addtitle, dadTitleList);
          if (currentData < 0) {
            dadTitleList.push(_addtitle);
          }
          var resultDateTime = publicFun.timeFormat(rowData.resultDateTime, "yyyy/MM/dd hh:mm:ss");
          var basicSample;
          var totalList = [];
          $('#examinelist').datagrid({
            nowrap: true,
            striped: true,
            singleSelect: false,
            selectOnCheck: true,
            checkOnselect: true,
            url: '${baseurl}his/queryexamineinfoqfy_result.do',
            queryParams: {
              "vHemsJyjgCustom.patientId": rowData.patientId,
              "vHemsJyjgCustom.sampleno": rowData.sampleno,
              "vHemsJyjgCustom.resultDateTime": resultDateTime
            },
            idField: 'rownums',
            columns: columnse_v,
            rownumbers: true,
            pageList: [50,70,90],
            onLoadSuccess: function (res) {
              var _allstring;
              //处理拼接的字符
              for (var i = 0; i < res.rows.length; i++) {
                var _list = ['reportItemName', 'result', 'units', 'sign'];
                $.each(_list, function (idx, val) {
                  if (res.rows[i][val] == null || res.rows[i][val] == undefined) {
                    res.rows[i][val] = '';
                  }
                })
                var _isNum = isNaN(res.rows[i].units.slice(0,1));
                if(!_isNum && res.rows[i].units != ''){
                    _allstring = res.rows[i].reportItemName + res.rows[i].result+ '×' + res.rows[i].units + "，";
                }else{
                    _allstring = res.rows[i].reportItemName + res.rows[i].result + res.rows[i].units + "，";
                }
                basicSample = publicFun.timeFormat(res.rows[i].resultDateTime, "yyyy/MM/dd hh:mm:ss") + rowData.examinaim + "：";
                totalList.push(_allstring);
              }
              //$("#examinelist").parent().find("div .datagrid-header-check").children("input[type=\"checkbox\"]").eq(0).attr("style", "display:none;");
            },
            onSelect: function (_rowIndex, _rowData) {
              //isCurrentSelect 为获取当前模块下选中的List
              isCurrentSelect = takePushList(_rowData.sampleno, basicSample);
              var _list = ['reportItemName', 'result', 'units', 'sign']
              $.each(_list, function (idx, val) {
                if (_rowData[val] == null || _rowData[val] == undefined) {
                  _rowData[val] = '';
                }
              })
              //_string为要拼接的字符串
              var _isNum = isNaN(_rowData.units.slice(0,1));
              if(!_isNum && _rowData.units != ''){
                  var _string = _rowData.reportItemName + _rowData.result+ '×' + _rowData.units + "，";
              }else{
                  var _string = _rowData.reportItemName + _rowData.result + _rowData.units + "，";
              }
              var currentData = $.inArray(_string, fieldArry);
              var _currentData = $.inArray(basicSample, fieldArry);
              var addField = '';
              var addArray = [];
              //首先判断当前要拼接的字符串在拼接数组中存不存在，不存在就push
              if (currentData == -1) {
                addArray.push(_string);
                addField += _string;
              }
              /**
              * addField 为要拼接进去的字符串
              * 如果不为空 1.当前的小标题不存在，加入小标题
                          2.如果当前小标题存在，并且上一次已拼接号的大数组最后一项不是小标题,加入小标题
                          3.其他情况,不加入小标题
                          
              **/
              if (addField != '') {
                if (_currentData == -1) {
                  addArray.unshift(basicSample);
                  fieldArry = fieldArry.concat(addArray);
                  fieldString = fieldArry.join("");
                }
                else if (_currentData != -1 && $.inArray(fieldArry[fieldArry.length - 1], totalList) < 0) {
                  addArray.unshift(basicSample);
                  fieldArry = fieldArry.concat(addArray);
                  fieldString = fieldArry.join("");
                }
                else {
                  fieldArry = fieldArry.concat(addArray);
                  fieldString = fieldArry.join("");
                }
              }
              $('#subfieldText').val(fieldString);
            },
            onUnselect: function (_rowIndex, _rowData) {
              var _list = ['reportItemName', 'result', 'units', 'sign']
              $.each(_list, function (idx, val) {
                if (_rowData[val] == null || _rowData[val] == undefined) {
                  _rowData[val] = '';
                }
              })
              var _isNum = isNaN(_rowData.units.slice(0,1));
              if(!_isNum && _rowData.units != ''){
                  var _string = _rowData.reportItemName + _rowData.result+ '×' + _rowData.units + "，";
              }else{
                  var _string = _rowData.reportItemName + _rowData.result + _rowData.units + "，";
              }
              var currentData = $.inArray(_string, fieldArry);
              /**
              * isCurrentSelect 为当前拼接的List(点击单选或者全选生成的List)
              * 要删除的内容存在在fieldArry数组中 ：判断要删除内容的前后排列位置 看是否是B1A123B2/B1A1B2/B1A1/A1,再一一处理
              **/
              if (currentData != -1) {
                if (isCurrentSelect.length == 1) {
                  fieldArry.splice(currentData, 1);
                  fieldArry.splice(currentData - 1, 1);
                } else if (isCurrentSelect.length > 1) {
                  if (fieldArry[currentData - 1] == basicSample) {
                    if (($.inArray(fieldArry[currentData + 1], dadTitleList) > -1) || (currentData == (fieldArry.length - 1))) {
                      fieldArry.splice(currentData, 1);
                      fieldArry.splice(currentData - 1, 1);
                    } else {
                      fieldArry.splice(currentData, 1);
                    }
                  } else {
                    fieldArry.splice(currentData, 1);
                  }
                }
              }
              fieldString = fieldArry.join("");
              $('#subfieldText').val(fieldString);
            }
            ,
            onSelectAll: function (rows) {
              var _title = '';
              for (var i = 0; i < rows.length; i++) {
                _title = rows[i].sampleno;
              }
              isCurrentSelect = takePushList(_title, basicSample);
              var currentData = "",
                _allstring = "";
              isSelectAll = [];
              var addField = '',
                addArray = [];
              for (var i = 0; i < rows.length; i++) {
                var _list = ['reportItemName', 'result', 'units', 'sign']
                $.each(_list, function (idx, val) {
                  if (rows[i][val] == null || rows[i][val] == undefined) {
                    rows[i][val] = '';
                  }
                })
                var _isNum = isNaN(rows[i].units.slice(0,1));
                if(!_isNum && rows[i].units != ''){
                    _allstring = rows[i].reportItemName + rows[i].result+ '×' + rows[i].units + "，";
                }else{
                    _allstring = rows[i].reportItemName + rows[i].result + rows[i].units + "，";
                }
                currentData = $.inArray(_allstring, fieldArry);
                if (currentData == -1) {
                  addArray.push(_allstring);
                  addField += _allstring;
                  isSelectAll.push(_allstring);
                }
              };
              //判断之前选中内容在不在全选的范围如果在就添加剩下的内容并适当加入小标题
              var _currentData = $.inArray(basicSample, fieldArry);
              if (addField != '') {
                if (_currentData == -1) {
                  addArray.unshift(basicSample);
                  fieldArry = fieldArry.concat(addArray);
                  fieldString = fieldArry.join("");
                }
                else if (_currentData != -1 && $.inArray(fieldArry[fieldArry.length - 1], totalList) < 0) {
                  addArray.unshift(basicSample);
                  fieldArry = fieldArry.concat(addArray);
                  fieldString = fieldArry.join("");
                }
                else {
                  fieldArry = fieldArry.concat(addArray);
                  fieldString = fieldArry.join("");
                }
              }
              $('#subfieldText').val(fieldString);

            },
            onUnselectAll: function (rows) {
              var currentData = "",
                _allstring = "";
              var selFlag = false;
              var selnum = 0;
              //selrows为所有模块下选中的所有值
              var selrows = $('#examinelist').datagrid('getSelections');
              var _currentData = $.inArray(basicSample, fieldArry);
              for (var i = 0; i < rows.length; i++) {
                var _list = ['reportItemName', 'result', 'units', 'sign']
                $.each(_list, function (idx, val) {
                  if (rows[i][val] == null || rows[i][val] == undefined) {
                    rows[i][val] = '';
                  }
                })
                var _isNum = isNaN(rows[i].units.slice(0,1));
                if(!_isNum && rows[i].units != ''){
                    _allstring = rows[i].reportItemName + rows[i].result+ '×' + rows[i].units + "，";
                }else{
                    _allstring = rows[i].reportItemName + rows[i].result + rows[i].units + "，";
                }
                currentData = $.inArray(_allstring, fieldArry)
                if (currentData != -1) {
                  fieldArry.splice(currentData, 1);
                }
                if (selrows.length > 0) {
                  $.each(selrows, function (idx, val) {
                    //如果在当前模块下(用其标题判断)
                    if (val.sampleno == rows[i].sampleno) {
                      if ($.inArray(fieldArry[fieldArry.length - 1], totalList) < 0) {
                        selFlag = false;
                        selnum = 1;
                      } else {
                        selFlag = true;
                      }
                    }
                  })
                } else {
                  selFlag = false;
                }
              }
              //全不选 就是把存在当前模块下的小标题都删了在循环中一一判断并删除
              if (selFlag == false) {
                var Arraylength = fieldArry.length;
                for (var i = 0; i < Arraylength; i++) {
                  _currentData = $.inArray(basicSample, fieldArry);
                  if (_currentData != -1) {
                    fieldArry.splice(_currentData, 1)
                  }
                }
              }
              fieldString = fieldArry.join("");
              $('#subfieldText').val(fieldString);
            }
          });
        }
      });
    };
    function init() {
      abntable();
      var height = 0.67 * ($(window).height());
      var width = 0.68 * ($(window).width());
      $("#subfieldText").height(0.15 * ($(window).height()));
      $("#subfieldText").width(0.675 * ($(window).width()));
      $("#examinelist").height(height);
      $("#examinelist").width(width);
      $('#examinelist').datagrid({
        nowrap: false,
        striped: true,
        singleSelect: false,
        selectOnCheck: true,
        checkOnselect: true,
        idField: 'rownums',
        loadMsg: '',
        columns: columnse_v,
        title: "检验信息",
        rownumbers: true,
        onLoadSuccess: function () {
          //$("#examinelist").parent().find("div .datagrid-header-check").children("input[type=\"checkbox\"]").eq(0).attr("style", "display:none;");
        }
      });
    }
    function getWidth(proportion) {
      var width = $("body").width() * 0.62;
      return Math.round(proportion * width);
    }
    //查询方法
    function queryexamine() {
      var formdata = $("#examineForm").serializeJson();
      $('#mainexaminelist').datagrid('load', formdata);
    }
    function setTime() {
      var _startdate = publicFun.timeFormat('${emgDat}', "yyyy/MM/dd");
      var _enddate = publicFun.timeFormat('${cyrqDat}', "yyyy/MM/dd");
      if (_enddate == null || _enddate == '') {
        _enddate = publicFun.timeFormat(new Date(), "yyyy/MM/dd");
      }
      $("#emg_startdate").val(_startdate);
      $("#emg_enddate").val(_enddate);
    };
    /**
     * 导入
     **/
    function importField() {
      var fieldVal = $("#subfieldText").val();
      var xtpghz = parent.$("#xtpghznr").val();
      var valName = '${valName}';
      var xtpghzB = parent.$("#" + valName).val()
      if (fieldVal != '' && valName) {
        var totalVal = xtpghzB + fieldVal;
        parent.$("#" + valName).val(totalVal);
        parent.closemodalwindow();
      } else if (fieldVal != '') {
        var totalVal = xtpghz + fieldVal;
        parent.$("#xtpghznr").val(totalVal);
        parent.closemodalwindow();
      } else {
        publicFun.alert('当前无导入数据，请确认是否已完成"检验信息"');
      }
    }
    
    var _need_minus = 0; // 切换到知识库的时候 datagrid 宽度相应缩小
    function isKnowledgePage () {
      if (_sourceType === 'knowledgeBox') { // 知识库中检查时
        $('.grp_btn').hide();
        document.getElementById('subfieldText').ondblclick = function () {
          parent.setParentVal('check');
        }
        _need_minus = 5;
      } else {
        $('.grp_btn').show();
        _need_minus = 0;
      }
    }

    $(function () {
      isKnowledgePage();
      init();
    });
  </script>
  <form id="examineForm">
    <!-- html的静态布局 -->
    <!-- 查询条件 -->
    <input type="hidden" id="patientId" name="vHemsJyjgCustom.patientId" value="${MPI}" />
    <div class="form clr">
      <p class="form-text">日期：</p>
      <input class="input-date Wdate" id="emg_startdate" type="text" name="vHemsJyjgCustom.startdate" onclick="WdatePicker({dateFmt:'yyyy/MM/dd'})">
      <p class="form-text">-</p>
      <input class="input-date Wdate" id="emg_enddate" type="text" name="vHemsJyjgCustom.enddate" onclick="WdatePicker({dateFmt:'yyyy/MM/dd'})">
      <a class="easyui-linkbutton" iconCls="icon-search" id="btn" onclick="queryexamine()">查询</a>
    </div>
    <!-- 查询列表 -->
  </form>
  <div class="mainDiv">
    <table id="mainexaminelist"></table>
  </div>
  <div class="subDiv">
    <table id="examinelist"></table>
  </div>
  <textarea id="subfieldText" readonly unselectable='on'></textarea>
  <div class="center grp_btn">
    <a class="easyui-linkbutton" iconCls="icon-ok" id="submitbtn" onclick="importField()">导入并返回</a>
    <a class="easyui-linkbutton" iconCls="icon-cancel" id="closebtn" onclick="parent.closemodalwindow()">关闭</a>
  </div>
</body>

</html>