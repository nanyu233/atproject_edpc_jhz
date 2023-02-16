<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%> <%@ include file="/WEB-INF/jsp/base/tag.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
  <head>
    <meta charset="UTF-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1" />
    <title>护理分级</title>
    <%@ include file="/WEB-INF/jsp/base/common_css.jsp"%> <%@ include
    file="/WEB-INF/jsp/base/common_js.jsp"%>
    <link
      rel="stylesheet"
      type="text/css"
      href="${baseurl}styles/eicu/eicu_common.css"
    />
    <script
      src="${baseurl}lib/avalon1.4.8/avalon.js"
      type="text/javascript"
      charset="UTF-8"
    ></script>
    <script
      language="javascript"
      src="${baseurl}Lodop6.216/LodopFuncs.js"
    ></script>
    <%@ include file="/WEB-INF/jsp/eicu/eicuCommonJs.jsp"%>
    <style>
      html {
        overflow-x: hidden;
        overflow-y: auto;
      }

      .total-container {
        overflow: auto;
      }

      .hdtitle {
        margin: 5px;
        font-size: 14px;
        font-weight: bold;
        text-align: center;
      }

      .total-container table {
        margin: 0 auto;
      }
      .total-container tbody {
        text-align: left;
      }
      .total-container th{
        text-align: center;
      }
      .total-container table>thead{        
        background-color: #ddd;
        text-align: center;
      }
      .total-container tr, th, td {
        padding: 5px;
        border: 1px solid #999;
      }
      .total-container span:hover {
        cursor: pointer;
      }

      #cls-table>tbody {
        text-align: center;
      }
      .BI_SCO {
        text-align: center;
      }

      /* 签名栏样式 */
      .panelCenter {
        text-align: center;
        background-color: #85aaca;
        font-size: 12px;
        height: 32px;
        line-height: 32px;
      }

    </style>
  </head>

  <body class="scoreQuery" ms-controller="vm">
    
      <main class="total-container" ms-css-height="panelH">
        <form id="biForm" action="${baseurl}icuscore/addBradenScore.do" method="post">
          <div class="BradenContent panelContent">
            <p class="hdtitle">BI日常生活活动能力评分</p>
            <table id="bi-table" class="paneltab">
              <colgroup>
                <col style="width:150px;">
                <col style="width:100px;">
                <col style="width:100px;">
                <col style="width:100px;">
                <col style="width:100px;">
              </colgroup>
              <!-- BI_[A-J] -->
              <thead>
                <tr>
                  <th
                    class="sco-item-header"
                    rowspan="2"
                    >评分项目</th>
                  <th colspan="4">分值</th>
                </tr>
                <tr>
                  <th>0</th>
                  <th>5</th>
                  <th>10</th>
                  <th>15</th>
                </tr>
              </thead>
              <tbody>
                <tr class="tabItem" ms-repeat="defMap.biList">
                  <th>
                  {{el.rootName}}
                  </th>
                  <td ms-repeat="el.itemList">
                      <label>
                        <input ms-class="{{el.itemRoot}}" ms-attr-name="{{el.itemField}}" type="checkbox" ms-click="chkBi(el)"/>
                        <span>{{el.itemName}}</span>
                      </label>
                  </td>
                  <td ms-repeat="el.eptList"></td>
                </tr>
              </tbody>
              <tbody>
                <tr>
                  <th colspan="4">总分</th>
                  <td ms-duplex="totalSco" ms-class="BI_SCO">{{totalSco}}</td>
                </tr>
              </tbody>
            </table>

            <p class="hdtitle">护理分级</p>
            <table id="cls-table" class="paneltab">
              <colgroup>
                <col style="width:200px;">
                <col style="width:250px;">
                <col style="width:100px;">
              </colgroup>
              <!-- BI_[A-J] -->
              <thead>
                <th
                    class="sco-item-header"
                    rowspan="2"
                    >评分项目</th>
                  <th rowspan="2">评分选项</th>
                  <th></th>
                </tr>
                
              </thead>
              <tbody>
                <tr class="tabItem" ms-repeat="defMap.clsList">
                  <th
                    ms-if="el.ifFirst"
                    ms-attr-rowspan="el.headRows"
                  >
                  {{el.rootName}}
                  </th>
                  <th
                  >{{el.itemName}}</th>
                  <!-- normal -->
                  <td>
                    <!-- bug所迫 -->
                    <input 
                      type="checkbox"
                      ms-if="el.itemField=='NURS_CLS_A_1'"     
                      ms-class="{{el.itemRoot}}"                 
                      ms-attr-checked="{{vm.totalSco<=40&&0<=vm.totalSco ? true : false}}"
                      ms-attr-disabled="true"
                      ms-attr-name="{{el.itemField}}"
                    />
                    <input 
                      type="checkbox"
                      ms-if="el.itemField=='NURS_CLS_A_2'"     
                      ms-class="{{el.itemRoot}}"                 
                      ms-attr-checked="{{vm.totalSco<=60 && 41<=vm.totalSco ? true : false}}"
                      ms-attr-disabled="true"
                      ms-attr-name="{{el.itemField}}"
                    />
                    <input 
                      type="checkbox"
                      ms-if="el.itemField=='NURS_CLS_A_3'"     
                      ms-class="{{el.itemRoot}}"                 
                      ms-attr-checked="{{vm.totalSco<=99 && 61<=vm.totalSco ? true : false}}"
                      ms-attr-disabled="true"
                      ms-attr-name="{{el.itemField}}"
                    />
                    <input 
                      type="checkbox"
                      ms-if="el.itemField=='NURS_CLS_A_4'"     
                      ms-class="{{el.itemRoot}}"                 
                      ms-attr-checked="{{vm.totalSco==100 ? true : false}}"
                      ms-attr-disabled="true"
                      ms-attr-name="{{el.itemField}}"
                    />
                    <!-- 评级checkbox -->
                    <!-- <input 
                      type="checkbox"
                      ms-if="el.itemRoot=='NURS_CLS_A'"
                      ms-class="{{el.itemRoot}}"
                      ms-duplex="scoLevel(el.itemField)"
                      ms-attr-disabled="true"
                      ms-attr-name="{{el.itemField}}"
                      ms-class-1="{{0<=totalSco&&totalSco<=40 ? 'bg-warning': 41<=totalSco&&totalSco<=60 ? 'bg-selected': 61<=totalSco&&totalSco<=99 ? : 'bg-success' ? totalSco&&totalSco==100 : 'bg-secondary'}}"
                      />-->
                      <input
                      type="checkbox" 
                       ms-if="el.itemRoot != 'NURS_CLS_A'"
                       ms-class="{{el.itemRoot}}" 
                       ms-attr-name="{{el.itemField}}" 
                       ms-click="chkBi(el)"
                       /> 
                  </td>
                </tr>
              </tbody>
              <tbody>
                <tr>
                  <td colspan="3">
                    <div id="modInfo" class="signBorderBox">
                      <label>
                        <span>评分时间：</span>
                        <input id="gradeTimeStr"
                         class="Wdate modTimeStr" 
                         type="text"
                         ms-click="timePicker"
                         autocomplete="off">
                      </label>
                      <label>
                        <span>评分人：</span>
                        <input id="gradeUser"
                         ms-duplex="userSign"
                         class="userInput modUser" 
                         type="text" 
                         autocomplete="off"
                         ms-duplex-string="user.userNum">
                      </label>
                    </div>
                  </td>
                </tr>
              </tbody>
            </table>
          </div>
        </form>
        <div ms-if="showSaveBar" class="icu-save-bar" style="display: flex;justify-content: center;margin-top: 10px">
          <span class="save-btn-group icu-btn-group">
            <input
              type="button"
              class="commonbtn"
              value="保存"
              onclick="saveCom()"
            />
            <input
              type="button"
              class="commonbtn"
              value="保存并关闭"
              onclick="saveCom('close')"
            />
            <input
              type="button"
              class="commonbtn"
              value="关闭"
              onclick="parent.closemodalwindow()"
            />
          </span>
        </div>
      </main>

    <script type="text/javascript">
      var _baseUrl = '${baseurl}';
      var DEFAULT_USER_ID = '${activeUser.usrno}';
      var DEFAULT_USER_NAME = '${activeUser.usrname}';
      //全局变量
      var _userid = '${activeUser.usrno}';
      var ptBasicInfo = eicuUtil.ptBasicInfo;
      var _exChgInfo = icuOpenModal.getExChgInfo();
      var _liveNo = '${liveNo}';
      var _gradeSeq = _exChgInfo.gradeSeq;
      var _gradeType = _exChgInfo.gradeType;
      var _linkSeq = "";
      var _fivesFlag = false;
    </script>
    <script
      src="${baseurl}js/subpageJs/eicu/scoreCommon.js"
      type="text/javascript"
      charset="UTF-8"
    ></script>
    <script type="text/javascript">
      var parentBasicPage =
        parent.$('#panel-grid-table').length !== 0 ? true : false;
      var vm = avalon.define({
        $id: 'vm',
        panelH: '',
        totalSco: 0,
        showSaveBar: true,
        defMap: {
          biList: [],
          clsList: []
        },
        user: {
          userId: _userid,
          userNum: DEFAULT_USER_NAME
        },
        modalFlag: true,
        timePicker: function() {
          WdatePicker({dateFmt:'yyyy/MM/dd HH:mm',maxDate:'%y/%M/%d %H:%m'})
        },
        chkBi: function(e) {
          var totalSco = 0;
          $('input[class="' + e.itemRoot +'"]').attr('checked', false);
          $('input[name="' + e.itemField +'"]').attr('checked', true);          
          var checkStr = /BI_[A-J]/g;//判断当前点击的事件是否属于Bi表
          if(checkStr.test(e.itemRoot)) {
            vm.defMap.biList.forEach(function(ele) {
              if(ele.itemList) {
                ele.itemList.forEach(function(el) {
                  if($('input[name="' + el.itemField +'"]:checked').length == 1) {
                    totalSco += parseInt(el.scoreValue);
                  }
                })
              }
            })
            vm.totalSco = totalSco;         
          }
        }
      });

      /**
       * 
      */
      function getAllInfo() {
        var reqUrl = _baseUrl + 'icuscore/findGradeInfoByParam.do';
        var reqParams = { 
          gradeSeq: _gradeSeq,
          gradeType: _gradeType,
          liveNo: _liveNo,
          date: publicFun.timeFormat(new Date(), 'yyyy/MM/dd hh:mm')
        }
        // var extraParams = {
        //   asyncFlag: 'false'
        // }
        console.log("all");
        publicFun.httpRequest(reqUrl, reqParams, function(res) {
          if (!res.resultInfo.success) {
            alert_error("数据出错，请联系管理员！");
            return;
          }
          var resultInfo = res.resultInfo;
          var sysdata = resultInfo.sysdata;
          var totalInfo = sysdata.totalInfo || '';
          var itemList = sysdata.itemlist || [];
          _linkSeq = totalInfo.linkSeq;
          var biList = [];
          var clsList = [];
          //继承有上次新增的数据      
            itemList.forEach(function(ele) {
                if(ele.itemField == 'BI_SCO') {
                  vm.totalSco = ele.itemValue || 0;
                }
              $('input[type=checkbox][name="' + ele.itemField + '"]').attr('checked', true);
            })
            if (totalInfo) {
              $('#gradeTimeStr').val(
                publicFun.timeFormat(totalInfo.gradeTime, 'yyyy/MM/dd hh:mm')
              );
              // $('#gradeUser').val(_userid);
              vm.user.userId = _userid
              // eicuUtil.queryDoct($('#gradeUser'));
            } else {
              getParentModInfo();
            }
        });
      }
      
      /**
       * 赋值父元素签名数据
       */
      function getParentModInfo() {
        var thisDateStr = publicFun.timeFormat(new Date().getTime(), 'yyyy/MM/dd hh:mm');
        $('#gradeTimeStr').val(thisDateStr);
        // $('#gradeUser').val(_userid);
        vm.user.userId = _userid
        // eicuUtil.queryDoct($('#gradeUser'));
      }

      //保存
      function saveCom(closeFlag) {
        var itemList = [];
        var biFlag = 0;
          vm.defMap.biList.forEach(function(ele) {
            if(ele.itemList) {
              for(var i = 0; i<ele.itemList.length; i++) {
                if($('input[class="' + ele.itemList[i].itemRoot +'"]:checked').length == 0) {
                  biFlag = 1;
                  // alert_warn('BI评估表有项目未评');
                  break;
                }
                else if($('input[name="' + ele.itemList[i].itemField +'"]').attr('checked')) {
                  itemList.push({
                    gradeType: 'BI',
                    itemField: ele.itemList[i].itemField,
                    itemValue: ele.itemList[i].scoreValue
                  })
                }
              }
            }
          })
          itemList.push({
            gradeType: 'BI',
            itemField: 'BI_SCO',
            itemValue: vm.totalSco
          })
          if(biFlag) {
            alert_warn('BI评估表有项目未评');
            return;
          }
          
          for(var i = 0; i<vm.defMap.clsList.length; i++) {
            if($('input[class="' + vm.defMap.clsList[i].itemRoot +'"]:checked').length == 0) {
              alert_warn('护理分级表有项目未评');
              return;
            }else if($('input[name="' + vm.defMap.clsList[i].itemField +'"]').attr('checked')) {
              itemList.push({
                gradeType: 'NURS_CLS',
                itemField: vm.defMap.clsList[i].itemField,
                itemValue: 1
              })
            }
          }

        var gradeUser = vm.user.userId || '';
        var gradeTimeStr = $('#gradeTimeStr').val();
        if (!gradeTimeStr) {
          alert_warn('评分时间不能为空');
        } else if (!gradeUser) {
          alert_warn('评分人不能为空');
        } else {
          console.log("itemList", itemList);

          var reqUrl = _baseUrl + 'icuscore/editGradeSco.do';
          var reqParams = {
            icuGradeTotalCustom: {
                liveNo: _liveNo,
                gradeSeq: _gradeSeq,
                gradeType: _gradeType,
                gradeTimeStr: $('#gradeTimeStr').val(),
                gradeUser: vm.user.userId || '',
                gradeSco: vm.totalSco,
                gradeDetl: scoreTitle + ': ' + vm.totalSco + '分',
                linkSeq: _linkSeq
              },
            itemList: itemList
          };
          var extraParams = {
            requestType: 'json'
          };
          publicFun.httpRequest(reqUrl, reqParams, extraParams, function(res) {
            if (!res.resultInfo.success) {
                ajax_alert(res);
                return;
            }else {
              alert_success("保存成功");
              if (!_gradeSeq) {
                _gradeSeq = res.resultInfo.sysdata.gradeSeq;
              }
              _linkSeq = res.resultInfo.sysdata.linkSeq;
              window.parent[0].getAllInfo();//这里有多层iframe嵌套
              if (closeFlag) {
                parent.closemodalwindow();
              }
            }
          })
        }
      }

      function hideSignSpan() {
        if (!_gradeSeq) {
          $('#signSpan').hide();
        }
      }

      function print() {
        refreshData();

        LODOP = getLodop();
        LODOP.PRINT_INITA(
          0,
          0,
          '210mm',
          '297mm',
          '打印控件功能演示_Lodop功能_超文本内容缩放打印'
        );
        LODOP.SET_PRINT_PAGESIZE(0, 0, 0, 'A4');

        LODOP.SET_PRINT_MODE('NOCLEAR_AFTER_PRINT', true);
        var strBodyStyle =
          '<style>table {border-collapse:collapse;width:100%} table,td { border:1px solid black;border-collapse:collapse;}table,th { border:1px solid black;border-collapse:collapse;}</style>';
        LODOP.ADD_PRINT_HTM(
          3,
          0,
          '100%',
          '100%',
          strBodyStyle + document.getElementById('vte1form').innerHTML
        );

        LODOP.SET_PRINT_MODE('FULL_WIDTH_FOR_OVERFLOW', true);
        LODOP.SET_PRINT_MODE('FULL_HEIGHT_FOR_OVERFLOW', true);
        LODOP.NewPageA();
        //LODOP.SET_PRINT_STYLE("FontSize", 10);
        //LODOP.SET_PRINTER_INDEX("ZDesigner GK888t");
        LODOP.PREVIEW();
        // LODOP.PRINTB();
        return true;
      }

      //打印相关
      function refreshData() {
        //让innerHTML获取的内容包含input和select(option)的最新值
        var allInputObject = document.body.getElementsByTagName('input');
        for (i = 0; i < allInputObject.length; i++) {
          if (allInputObject[i].type == 'checkbox') {
            if (allInputObject[i].checked)
              allInputObject[i].setAttribute('checked', 'checked');
            else allInputObject[i].removeAttribute('checked');
          } else if (allInputObject[i].type == 'radio') {
            if (allInputObject[i].checked)
              allInputObject[i].setAttribute('checked', 'checked');
            else allInputObject[i].removeAttribute('checked');
          } else
            allInputObject[i].setAttribute('value', allInputObject[i].value);
        }
        for (i = 0; i < document.getElementsByTagName('select').length; i++) {
          var sl = document.getElementsByTagName('select')[i];
          for (j = 0; j < sl.options.length; j++) {
            if (sl.options[j].selected)
              sl.options[j].setAttribute('selected', 'selected');
            else
              sl.options[j] = new Option(
                sl.options[j].text,
                sl.options[j].value
              );
          }
        }
      }
          
      function getDictInfo() {
        var reqUrl = '${baseurl}icuscore/getGradeItemDef.do';
        var reqParam = {
          gradeType: _gradeType
        };
        publicFun.httpRequest(reqUrl, reqParam, function (res) {
          if (!res.resultInfo.success) {
            alert_error('请求出错，请联系管理员');
            return
          }

          var defList = res.resultInfo.sysdata.itemDef;
          defList.forEach(function (element) {
            var itemField = element.itemField;
            defList.forEach(function (ele) {
              if (ele.itemRoot === itemField) {
                if (!element.itemList) {
                  element.itemList = [];
                }
                element.itemList.push(ele);
              }
            });
          });          
          defList = defList.filter(function (ele) {
            return ele.itemRoot === 'ROOT2';
          }); //这一步是过滤，按树展开，将多余的数组剔除；
          //这里得到了一个分两组的对象
          var headTitle = [];
          var itemMap = {
            biList: [],
            clsList: []
          };
          console.log("defList", defList);
          defList.forEach(function(element) {
            element.itemList.forEach(function(ele) {
              if(ele.itemField !== 'BI' && ele.itemField !== 'NURS_CLS') {
                if(ele.itemList) {
                  var itemRoot = ele.itemField || "";
                  var rootName = ele.itemName || "";
                  var itemLen = ele.itemList.length || 0;
                  var count = 0;
                  var eptList = [];
                  if(ele.itemRoot === 'BI') {
                    if(ele.itemList.length < 4) {
                      for(var i=0; i<(4-ele.itemList.length); i++) {
                        eptList.push({});
                      }
                    }
                    var obj = {
                      rootName: rootName,
                      itemList: ele.itemList,
                      eptList: eptList
                    };
                    itemMap['biList'].push(obj);
                    
                  }else if(ele.itemRoot === 'NURS_CLS') {
                    ele.itemList.forEach(function(el) {
                      el.rootName = rootName;
                      el.itemRoot = itemRoot;
                      el.headRows = itemLen;
                      if(count === 0) {
                        el.ifFirst = true;
                      }
                      count ++;
                      itemMap['clsList'].push(el);
                    })
                    
                  }
                }
              }
            })            
          })
          vm.defMap = itemMap;
          console.log("defMap", vm.defMap);
        });
      }
      /**
       * set layout
       */
      function setLayout() {
        var winH = $(window).height();
        var titleH = $('.hdtitle').height() || 0;
        var titleM = 10;
        var panelH = winH;
        if (vm.showSaveBar) {
          panelH -= 40;
        }
        vm.panelH = panelH;
      }
        $(function () {
        setLayout();
        getDictInfo();
        setTimeout(function(){
          getAllInfo();
        }, 120);
        eicuUtil.bindUserInput();
      });
    </script>
  </body></html>
