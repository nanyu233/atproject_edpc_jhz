<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/base/tag.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
  <title>极危值病程</title>
  <%@ include file="/WEB-INF/jsp/base/common_css.jsp"%>
  <link rel="stylesheet" type="text/css" href="${baseurl}css/common/querylist.css?190" />
  <%@ include file="/WEB-INF/jsp/base/common_js.jsp"%>
  <script type="text/javascript" src="${baseurl}Lodop6.216/LodopFuncs.js"></script>
  <script>
    var _tabId = 'criticaltable',
      _tabName = '危急值病程',
      _baseUrl = '${baseurl}',
      _getTabUrl = '${baseurl}diseaseCourse/queryDiseaseCourse_result.do',
      _userNum = '${sessionScope.activeUser.usrno}';
  </script>
</head>

<body>
  <div class="queryTabs">
    <div id="criticaltable"></div>
  </div>
  <jsp:include page="/WEB-INF/jsp/hzszyyhospital/hzszyydoctor/diseaseCourse/printDiseaseCourse.jsp"></jsp:include>
  <script type="text/javascript">
    function loadColumn() {
      var _cols = [
        [{
          field: 'courseDateStr',
          title: '日期',
          width: getWidth(.1),
          formatter: function (value, row, index) {
            return publicFun.timeFormat(value, 'yyyy/MM/dd hh:mm');
          }
        }, {
          field: 'reportingTime',
          width: getWidth(.25),
          title: '危急值及报告时间'
        }, {
          field: 'criticalSignificance',
          width: getWidth(.3),
          title: '危急值数据临床意义',
          hidden: true
        }, {
          field: 'treatmentMeasures',
          width: getWidth(.5),
          title: '处理措施'
        }, {
          field: 'createDoc',
          hidden: true
        }, {
          field: 'createNam',
          width: getWidth(.08),
          title: '医生'
        }]
      ]
      return _cols;
    }
    $(function () {
      var param = {
        'hspDiseaseCourseCustom.courseType': '4',
        'hspDiseaseCourseCustom.emgSeqDc': parent.$('#emgSeq').val()
      };
      loadQuery(param);
      $(window).resize(function () {
        loadQuery(param);
      });
    })
  </script>
  <script type="text/javascript" src="${baseurl}js/subpageJs/hzszyyhospital/docRecord/tabLoad.js?101"></script>
</body>

</html>