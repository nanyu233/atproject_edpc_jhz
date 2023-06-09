<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%> <%@ include file="/WEB-INF/jsp/base/tag.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
  <head>
    <meta charset="UTF-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1" />
    <title>GCS评分</title>
    <%@ include file="/WEB-INF/jsp/base/common_css.jsp"%>
    <link
      rel="stylesheet"
      type="text/css"
      href="${baseurl}styles/eicu/eicu_common.css"
    />
    <%@ include file="/WEB-INF/jsp/base/common_js.jsp"%>
    <script
      src="${baseurl}lib/avalon1.4.8/avalon.js"
      type="text/javascript"
      charset="UTF-8"
    ></script>
    <%@ include file="/WEB-INF/jsp/eicu/eicuCommonJs.jsp"%>
    <style>
      .icu-main-content {
        overflow: hidden;
      }

      .stat-icon-item {
        margin-bottom: 7px;
        display: flex;
        align-items: flex-start;
      }

      .stat-icon-item.pure-label {
        flex-wrap: wrap;
      }

      .stat-icon-item:last-child {
        margin-bottom: 0;
      }

      .stat-icon-item .icu-btn {
        flex-shrink: 0;
      }

      .stat-icon-item.pure-label .icu-btn {
        margin-bottom: 7px;
      }

      /*ctrl-panel doc-type*/
      .icu-menu-panel .notf-type {
        height: 30px;
        margin-bottom: 0;
      }

      .icu-menu-panel .menu-panel-content.notf-type select.menu-content-item {
        width: 183px;
      }
    </style>
  </head>

  <body class="scoreQuery" ms-controller="scorePanel">
    <div class="flex-container">
      <div class="icu-main-content">
        <div id="main-view" ms-css-height="mainViewH"></div>
      </div>
      <div class="icu-menu-panel">
        <div ms-if="docTypeShow && docTypeList.length" class="menu-panel-title">
          {{ docTypeList[0].parname + '类型' }}
        </div>
        <div
          ms-if="docTypeShow && docTypeList.length"
          class="menu-panel-content notf-type"
        >
          <select class="menu-content-item" ms-duplex-string="gradeType">
            <option
              ms-repeat="docTypeList"
              ms-attr-value="{{ el.parvalue1 }}"
              >{{ el.parmemo }}</option
            >
          </select>
        </div>
        <div ms-if="pageType !== 'old'" class="menu-panel-title">浏览模式</div>
        <div ms-if="pageType !== 'old'" class="menu-panel-content">
          <label class="menu-content-item page-mode-menu icu-check-box">
            <input
              type="radio"
              name="page-mode"
              value="basic"
              ms-duplex-string="displayMode"
            />
            <span class="icu-check-label-name">基本模式</span>
          </label>
          <label
            ms-if="pageType === 'single' || gradeType === 'GTOTAL'"
            class="menu-content-item page-mode-menu icu-check-box"
          >
            <input type="radio" name="page-mode" value="chart""
            ms-duplex-string=" displayMode">
            <span class="icu-check-label-name">图表模式</span>
          </label>
          <!-- <label class="menu-content-item page-mode-menu">
          高级模式
          <input type="radio" name="page-mode" value="advanced" ms-duplex-string="pageType">
        </label> -->
        </div>
        <div class="menu-panel-title">
          操作
        </div>
        <div
          class="menu-panel-content panel-btn-group"
          ms-css-height="pageType === 'old'"
        >
          <input
            ms-if="pageType !== 'total'"
            type="button"
            class="commonbtn menu-content-item"
            value="新增"
            onclick="panelAdd()"
          />
          <input
            ms-if="pageType === 'single' && pageType !== 'old'"
            type="button"
            class="commonbtn menu-content-item"
            value="修改"
            onclick="custOpenModal('edit')"
          />
          <input
            ms-if="pageType === 'old'"
            type="button"
            class="commonbtn menu-content-item"
            value="保存"
            onclick="scoreWin.saveCom()"
          />
          <input
            ms-if="pageType !== 'total'"
            type="button"
            class="commonbtn menu-content-item"
            value="删除"
            onclick="delGrade()"
          />
          <input
            ms-if="pageType !== 'old'"
            type="button"
            class="commonbtn menu-content-item"
            value="刷新"
            onclick="scoreWin.getAllInfo()"
          />
          <input
            ms-if="toTotalBtnStr"
            type="button"
            class="commonbtn menu-content-item"
            ms-attr-value="{{ toTotalBtnStr + '总览' }}"
            onclick="toTotalScoPage()"
          />
          <input
            type="button"
            ms-if="printShow"
            class="commonbtn menu-content-item"
            id="print"
            value="打印"
            onclick="scoreWin.printCom()"
          />
          <input
            type="button"
            ms-if="docTypeShow"
            class="commonbtn menu-content-item"
            id="print"
            value="保存并打印"
            onclick="scoreWin.saveCom('print')"
          />
        </div>
        <div ms-if="pageType === 'total' || showRisk" class="menu-panel-title">
          危险度说明
        </div>
        <div ms-if="pageType === 'total'" class="menu-panel-content">
          <div class="stat-icon-list">
            <div class="stat-icon-item pure-label">
              <span
                ms-repeat-riskinfo="riskRankColorList"
                class="icu-btn inline-btn display-btn"
                ms-class-1="{{ riskinfo.remark }}"
              >
                {{ riskinfo.info }}
              </span>
            </div>
          </div>
        </div>
        <div
          ms-if="pageType === 'single'  && showRisk"
          class="menu-panel-content"
        >
          <div ms-visible="gradeType" class="stat-icon-list">
            <div ms-repeat-riskinfo="riskTypeList" class="stat-icon-item">
              <span
                class="icu-btn inline-btn display-btn"
                ms-class-1="{{ riskinfo.riskColor }}"
              >
                {{ riskinfo.riskName }}
              </span>
              <span>
                {{ riskinfo.riskDesc }}
              </span>
            </div>
            <!-- <div ms-if="riskTypeList.length === 0" class="stat-icon-item">
            暂无相关描述
          </div> -->
          </div>
        </div>
        <div
          ms-if="pageType === 'old'"
          class="menu-panel-title panel-grid-title"
        >
          记录
        </div>
        <div ms-if="pageType === 'old'" class="menu-panel-content panel-grid">
          <div id="panel-grid-table" ms-css-height="ctrlPanelGridH"></div>
        </div>
      </div>
    </div>
    <script type="text/javascript">
      //全局变量
      var ptBasicInfo = eicuUtil.ptBasicInfo;
      var _liveNo = ptBasicInfo.liveNo;
      var _gradeType = '${gradeType}';
      var menuInfoObj = eicuUtil.getMenuInfo();
      var curMenuInfo; // find in ready func
      var curPanelGridData;
      var scoreWin;
      var riskMap = publicFun.getIcuDicItem('riskMap') || {};
      var riskRankColorList = publicFun.getIcuDicItem('riskColorList');
      var lastSkipInfo = parent.getLastSkipInfo(); // get skip info from custInfo.jsp
      var defaultDisplayMode = 'basic';
      if (lastSkipInfo.pageData) {
        defaultDisplayMode = lastSkipInfo.pageData.displayMode || 'basic';
      }
      var docInitFlag = true;
    </script>
    <script type="text/javascript">
      var vm = avalon.define({
        $id: 'scorePanel',
        pageType: '', // total || single || sheet || old
        displayMode: defaultDisplayMode, // basic || chart (watched form child page)
        gradeType: _gradeType,
        showRisk: riskMap[_gradeType] && riskMap[_gradeType].length !== 0,
        toTotalBtnStr: '', // 评分总览/评估总览
        showTotalBtn: false,
        mainViewH: '',
        ctrlPanelGridH: '',
        docTypeShow: false,
        docTypeList: [],
        printShow: false,
        riskRankColorList: riskRankColorList, // cust color def
        riskTypeList: riskMap[_gradeType] || [] // data base detl def
      });
      vm.$watch('gradeType', function(newV, oldV) {
        if (newV !== oldV && oldV !== '') {
          _gradeType = newV;
          vm.showRisk = riskMap[_gradeType] && riskMap[_gradeType].length !== 0;
          if (!docInitFlag) {
            initPage();
          }
        }
      });
      /**
       *弹窗方法
       */
      function custOpenModal(flag) {
        var $clickedEl;
        if (flag + '' === 'edit') {
          $clickedEl = document.getElementById('myFrame').contentWindow
            .$clickedEl;
          if (!$clickedEl) {
            alert_warn('未选中数据');
            return;
          }
        }
        var gradeSeq = $clickedEl ? $clickedEl.data('gradeseq') : '';
        var exChgInfo = {
          gradeType: _gradeType,
          gradeSeq: gradeSeq
        };
        if (flag === 'edit') {
          exChgInfo.modalTitle = $clickedEl.eq(0).text() + '- 修改';
        }
        icuOpenModal.openScoEdit(exChgInfo);
      }
      /**
       * 弹窗返回方法
       */
      function modalReturnFun(newSco, gradeSeq, closeFlag) {
        scoreWin.getAllInfo();
        if (closeFlag) {
          closemodalwindow();
        }
      }
      // <----操作栏功能----->
      /**
       *跳转进入本页面后刷新
       */
      function reload() {
        lastSkipInfo = parent.getLastSkipInfo();
        var totalFlag = vm.gradeType === 'GTOTAL' || vm.gradeSeq === 'ETOTAL';
        if ($('body').find('iframe').length <= 1) {
          //如果只有一个子页面，没有额外打开的弹窗，刷新页面
          if (lastSkipInfo.pageData && lastSkipInfo.pageData.displayMode) {
            vm.displayMode = lastSkipInfo.pageData.displayMode;
          }
          if (scoreWin.getAllInfo) {
            scoreWin.getAllInfo();
          }
        }
      }
      /**
       * 新增
       */
      function panelAdd() {
        var curPageType = vm.pageType;
        if (curPageType === 'single') {
          custOpenModal();
        } else if (curPageType === 'old') {
          curPanelGridData = null;
          var extraParams = {};
          $('#panel-grid-table').datagrid('clearSelections');
          initMainView(curPageType);
        }
      }
      /**
       *删除记录
       * gradeSeq <-> del from panel
       */
      function delGrade(gradeType, gradeSeq) {
        var curPageType = vm.pageType;
        var reqUrl = _baseUrl + 'icuscore/delGradeScore.do';
        var reqParams;

        var fooGradeType = gradeType;
        var fooGradeSeq = gradeSeq;
        var $clickedEl;

        if (!fooGradeSeq) {
          // del from ctrl panel
          $clickedEl =
            document.getElementById('myFrame').contentWindow.$clickedEl ||
            curPanelGridData;
          if (!$clickedEl) {
            alert_warn('未选中数据');
            return;
          } else {
            fooGradeType = _gradeType;
            fooGradeSeq =
              curPageType === 'old'
                ? $clickedEl.gradeSeq
                : $clickedEl.data('gradeseq');
          }
        }
        reqParams = {
          liveNo: _liveNo,
          gradeType: fooGradeType,
          gradeSeq: fooGradeSeq
        };
        var confirText = "您确认删除吗";
        if(fooGradeSeq.indexOf('H-')>-1)
        	confirText = "该数据已绑定护理评估单，您确认删除吗？";
        else if(fooGradeSeq.indexOf('CSABC-')>-1)
        	confirText = "该数据已绑定创伤中心-ABCDE，您确认删除吗？";
       	else if(fooGradeSeq.indexOf('CSCPN-')>-1)
       		confirText = "该数据已绑定创伤中心-体格检查，您确认删除吗？";
        _confirm(confirText, null, function() {
          publicFun.httpRequest(reqUrl, reqParams, function(res) {
            message_alert(res);
            if (res.resultInfo.success) {
              if (curPageType === 'old') {
                // old delete callback
                $('#panel-grid-table').datagrid('reload');
                $('#panel-grid-table').datagrid('clearSelections');
                panelAdd();
              } else if (curPageType === 'single') {
                // single delete callback
                scoreWin.getAllInfo();
                if (fooGradeSeq) {
                  // del from panel, close panel
                  closemodalwindow();
                }
              }
            }
          });
        });
      }
      /**
       *跳转总览页面
       */
      function toTotalScoPage() {
        // 点击跳转
        var pagetype;
        var pageval;
        if (vm.toTotalBtnStr === '评分') {
          pagetype = '105000';
          pageval = '105001';
        } else {
          // 评估总览
          pagetype = '104000';
          pageval = '104001';
        }
        eicuUtil.openIcuCustTab(pagetype, pageval);
      }
      /**
       * 分类加载
       */
      function initPage() {
        // find cur grade menu info
        $.each(menuInfoObj, function(k, v) {
          if (v.menuType === _gradeType) {
            curMenuInfo = v;
            if (
              v.ovFlag === '1' &&
              v.menuType !== 'GTOTAL' &&
              v.menuType !== 'ETOTAL'
            ) {
              vm.toTotalBtnStr = v.nameRoot.replace('护理', '');
            }
            return false;
          }
        });
        // init start
        var curPageType;
        var curMenuUrl = curMenuInfo.menuUrl;
        if (curMenuUrl === 'icuscore/toTotalScoPage.do') {
          curPageType = 'total';
        } else if (curMenuUrl === 'icuscore/toScoSubPage.do') {
          curPageType = 'old';
        } else if (curMenuUrl.match(/icuscore\/toBasicDocPage.do/)) {
          curPageType = 'old';
          vm.docTypeShow = true;
          vm.printShow = true;
          if (docInitFlag) {
            getDocTypeDef();
          }
        } else {
          curPageType = 'single';
        }
        // 提前赋值，部分判定需要pageType
        vm.pageType = curPageType;
        if (curPageType === 'old') {
          setPanelGridHeight();
          setTimeout(function() {
            initPanelGrid(curPageType);
          }, 0);
        } else {
          initMainView(curPageType);
        }
      }
      /**
       * 请求docType列表
       */
      function getDocTypeDef() {
        var reqUrl = _baseUrl + 'icuscore/queryDocTypeList.do';
        var reqParams = {
          gradeType: _gradeType
        };
        publicFun.httpRequest(
          reqUrl,
          reqParams,
          {
            asyncFlag: false
          },
          function(res) {
            if (!res.resultInfo.success) {
              alert_error('请求出错，请联系管理员');
              return;
            }
            var sysdata = res.resultInfo.sysdata;
            var docList = sysdata.docList;
            vm.docTypeList = docList;
            // 跳转首个
            if (docList.length) {
              _gradeType = docList[0].parvalue1;
              vm.gradeType = _gradeType;
              docInitFlag = false; // start specific page
            }
          }
        );
      }
      /**
       * 加载主页面
       */
      function initMainView(curPageType, extraParams) {
        vm.pageType = curPageType;
        var basicUrl;
        var content;
        if (curPageType === 'single') {
          basicUrl = 'icuscore/toNewSubPage.do';
        } else {
          basicUrl = curMenuInfo.menuUrl.split('?')[0];
        }
        basicUrl += '?' + 'gradeType=' + _gradeType;
        if (extraParams) {
          $.each(extraParams, function(k, v) {
            basicUrl += '&' + k + '=' + v;
          });
        }
        basicUrl = '${baseurl}' + basicUrl;
        content =
          '<iframe id="myFrame" frameborder="0" scrolling="auto" src="' +
          basicUrl +
          '" style="width: 100%;height:100%"></iframe>';
        $('#main-view').html(content);
        scoreWin = document.getElementById('myFrame').contentWindow;
      }
      /**
       * 原始模式右侧datagrid
       */
      function initPanelGrid(curPageType, backSeq) {
        var gridQueryUrl = _baseUrl + 'icuscore/queryGrade_result.do';
        var colDef = [
          [
            {
              field: 'gradeSeq',
              title: 'id',
              hidden: 'true'
            },
            {
              field: 'gradeTime',
              title: '记录时间',
              width: 110,
              formatter: function(value, row, index) {
                return publicFun.timeFormat(value, 'yyyy/MM/dd hh:mm');
              }
            }
          ]
        ];
        if (curMenuInfo.menuUrl.indexOf('toBasicDocPage') !== -1) {
          // doc类型
          colDef[0].push({
            field: 'gradeUserStr',
            title: '记录人',
            width: 63,
            formatter: function(value) {
              return (
                '<span style="white-space:nowrap;text-overflow:ellipsis">' +
                value +
                '</span>'
              );
            }
          });
        } else if (curMenuInfo.menuUrl.indexOf('toScoSubPage') !== -1) {
          // 评分类
          colDef[0].push({
            field: 'gradeSco',
            title: '总分',
            width: 60
          });
        }
        $('#panel-grid-table').datagrid({
          nowrap: false,
          striped: true,
          singleSelect: true,
          url: gridQueryUrl,
          queryParams: {
            custNo: ptBasicInfo.custNo,
            liveNo: _liveNo,
            gradeType: _gradeType
          },
          idField: 'gradeSeq',
          loadFilter: function(data) {
            if (data.resultInfo && data.resultInfo.messageCode == '109') {
              alert_error('请求出错，请联系管理员');
            }
            return data;
          },
          columns: colDef,
          rownumbers: true,
          onLoadSuccess: function(data) {
            var extraParams = {};
            if (data.rows.length > 0) {
              extraParams = {
                gradeSeq: backSeq ? backSeq : data.rows[0].gradeSeq
              };
              if (backSeq) {
                $('#panel-grid-table').datagrid('selectRecord', backSeq);
                curPanelGridData = $('#panel-grid-table').datagrid(
                  'getSelected'
                );
              } else {
                $('#panel-grid-table').datagrid('selectRow', 0);
                curPanelGridData = data.rows[0];
              }
            }
            initMainView(curPageType, extraParams);
            return data;
          },
          onClickRow: function(rowIndex, rowData) {
            var extraParams = {
              gradeSeq: rowData.gradeSeq
            };
            curPanelGridData = rowData;
            initMainView(curPageType, extraParams);
          }
        });
      }
      /**
       * set layout
       */
      function setLayout() {
        var winW = $(window).width(); //获取宽度出错
        var winH = $(window).height();
        if(winH<659)//获取高度出错
        	winH = 659;
        var mainViewH = eicuUtil.menuPanelLayoutSet(winW, winH).height;
        vm.mainViewH = mainViewH;
        var excludeGridH = 0;
      }
      /**
       * set grid height
       */
      function setPanelGridHeight() {
        var excludeGridH = 190;
        if (vm.docTypeList.length) {
          // 告知书类型，有多种告知书
          excludeGridH += 82;
        }
        var mainViewH = vm.mainViewH;
        excludeGridH += 16; // 上下padding
        vm.ctrlPanelGridH = mainViewH - excludeGridH;
      }
      $(function() {
        setLayout();
        initPage();
      });
      
    </script>
  </body>
</html>
