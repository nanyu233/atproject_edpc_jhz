<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/base/tag.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
  <title>可编辑抬头记录</title>
  <%@ include file="/WEB-INF/jsp/base/common_css.jsp"%>
  <link rel="stylesheet" type="text/css" href="${baseurl}css/common/querylist.css?190" />
  <script>
    var _getTabUrl = '${baseurl}zyylqbl/queryzdy_result.do',
      _editUrl = '${baseurl}zyylqbl/toupdatezdy.do',
      _emgSeq = '${emgSeq}',
      _userNum = '${sessionScope.activeUser.usrno}';
  </script>
</head>

<body>
  <div class="queryTabs">
    <div id="checkingRecordList"></div>
  </div>
  <jsp:include page="/WEB-INF/jsp/hzszyyhospital/hzszyydoctor/diseaseCourse/printDiseaseCourse.jsp"></jsp:include>
  <%@ include file="/WEB-INF/jsp/base/common_js.jsp"%>
  <script type="text/javascript" src="${baseurl}Lodop6.216/LodopFuncs.js"></script>
  <script type="text/javascript">
    function loadColumn() {
      var _cols = [
        [{
          field: 'cfjlDat',
          title: '记录时间',
          width: getWidth(.1),
          formatter: function (value, row, index) {
            return publicFun.timeFormat(value, 'yyyy/MM/dd hh:mm')
          }
        }, {
          field: 'cfjlContent',
          title: '记录内容',
          width: getWidth(.7)
        }, {
          field: 'cfjlNum',
          hidden: true
        }, {
          field: 'cfjlNam',
          title: '记录人',
          width: getWidth(.1)
        }]
      ];
      return _cols;
    }
    $(function () {
      var flag = '${flag}', dataTitle = "可编辑记录";
      loadQuery(flag, dataTitle);
      $(window).resize(function () {
        loadQuery(flag, dataTitle);
      });
    }) 
  </script>
  <script type="text/javascript" src="${baseurl}js/subpageJs/hzszyyhospital/docRecord/cfTab.js?101"></script>
</body>

</html>