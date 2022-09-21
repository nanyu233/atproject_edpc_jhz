<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/base/tag.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
  <title>日常病程</title>
  <%@ include file="/WEB-INF/jsp/base/common_css.jsp"%>
  <link rel="stylesheet" type="text/css" href="${baseurl}css/common/querylist.css?190" />
  <%@ include file="/WEB-INF/jsp/base/common_js.jsp"%>
  <script type="text/javascript" src="${baseurl}Lodop6.216/LodopFuncs.js"></script>
  <script>
    var _tabId = 'dailytable',
      _tabName = '日常病程',
      _baseUrl = '${baseurl}',
      _getTabUrl = '${baseurl}diseaseCourse/queryDiseaseCourse_result.do',
      _userNum = '${sessionScope.activeUser.usrno}';
  </script>
</head>

<body>
  <div class="queryTabs">
    <div id="dailytable"></div>
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
            return publicFun.timeFormat(value, 'yyyy/MM/dd hh:mm')
          }
        }, {
          field: 'record',
          width: getWidth(.8),
          title: '病程记录内容'
        }, {
          field: 'createDoc',
          hidden: true
        }, {
          field: 'createNam',
          width: getWidth(.06),
          title: '医生'
        }]
      ]
      return _cols;
    }
    $(function () {
      var param = {
        'hspDiseaseCourseCustom.courseType': '2',
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