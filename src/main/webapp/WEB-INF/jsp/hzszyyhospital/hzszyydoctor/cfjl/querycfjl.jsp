<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/base/tag.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
  <title>查房记录</title>
  <%@ include file="/WEB-INF/jsp/base/common_css.jsp"%>
  <link rel="stylesheet" type="text/css" href="${baseurl}css/common/querylist.css?190" />
  <script>
    var _getTabUrl = '${baseurl}zyylqbl/querycfjl_result.do',
      _editUrl = '${baseurl}zyylqbl/toupdatecfjl.do',
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
          title: '查房时间',
          width: getWidth(.1),
          formatter: function (value, row, index) {
            return publicFun.timeFormat(value, 'yyyy/MM/dd hh:mm')
          }
        }, {
          field: 'cfjlContent',
          title: '查房记录内容',
          width: getWidth(.7)
        }, {
          field: 'cfjlType',
          title: '类别',
          width: getWidth(.05),
          formatter: function (value, row, index) {
            var cfjlType;
            switch (value) {
              case '0':
                cfjlType = '主任';
                break;
              case '1':
                cfjlType = '副主任';
                break;
              case '2':
                cfjlType = '主治医生';
                break;
              default:
                cfjlType = '住院医生';
                break;
            }
            return cfjlType
          }
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
      var flag = '${flag}';
      var dataTitle;
      if (flag == '0') {
        dataTitle = "主任医师查房记录"
      } else if (flag == '1') {
        dataTitle = "副主任医师查房记录"
      } else if (flag == '2') {
        dataTitle = "主治医师查房记录"
      } else {
        dataTitle = "日常医师查房记录"
      }
      loadQuery(flag, dataTitle);
      $(window).resize(function () {
        loadQuery(flag, dataTitle);
      });
    }) 
  </script>
  <script type="text/javascript" src="${baseurl}js/subpageJs/hzszyyhospital/docRecord/cfTab.js?101"></script>
</body>

</html>