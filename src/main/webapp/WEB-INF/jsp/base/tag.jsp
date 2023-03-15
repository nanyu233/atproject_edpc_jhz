<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="fmt"%>
<c:set var="versionDay" value="098123"/>
<c:if test="${activeUser.hospitalCategory eq 'SD'}">
  <c:set var="hospitalPlatformName" value="浙江医院三大中心信息系统" />
  <c:set var="onlyPrintTriageName" value="浙江医院三墩院区急诊" />
  <c:set var="nurseDocumentName" value="浙江医院三墩院区" />
  <c:set var="wristbandName" value="三墩院区" />
  <c:set var="hospitalPlatformNameGap" value="浙江医院三大中心信息系统" />
</c:if>
<c:set var="hospitalPlatformNameLogin" value="爱特三大中心信息系统" />
<c:set var="hospitalPlatformName" value="爱特三大中心信息系统" />
<c:set var="baseurl" value="${pageContext.request.contextPath}/"></c:set>