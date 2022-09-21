<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/base/tag.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
  <head>
  </head>
  <body>
    <div class="printfirst" style="display:none;">
      <div id="printnote" class="print-body" style="display:block;float:left;width:210mm;font-family:'微软雅黑';">
        <jsp:include page="/WEB-INF/jsp/hzszyyhospital/printBasicInfo/printBasicYsd.jsp"></jsp:include>
        <ul class="print-ul">
          <li class="bordered">
              <span class="basic-span">
                  <label class="title-label">姓名：</label>
                  <span>${hspemginfCustom.cstNam}</span>
              </span>
              <span class="basic-span">
                  <label class="title-label">性别：</label>
                  <span>${hspemginfCustom.cstSexCod}</span>
              </span>
              <span class="basic-span">
                  <label class="title-label">科别：</label> 
                  <span id="_emgFkCod">急诊科门诊</span>
              </span>
              <span class="basic-span">
                  <label class="title-label">病历号：</label> 
                  <span id="_mpi">${hspemginfCustom.mpi}</span>
              </span>
              <!-- <span class="basic-span">
                  <label class="title-label">留观号：</label> 
                  <span id="_lgh">${hspemginfCustom.observationCode}</span>
              </span> -->
            </li>
            <li>
                <table class="vtetable">
                  <tr>
                    <td class="infotd">
                      风险因子
                    </td>
                    <td class="scotd">
                      分数
                    </td>
                  </tr>
                  <tr ms-repeat="systemList.fxyzCodList">
                      <td>
                          <label>
                              <span class="inputSpan">
                                  {{el.info}}
                              </span>
                          </label>
                      </td>
                      <td>
                          <label ms-attr-for="fxyzp{{el.infocode}}">
                              <span class="inputSpan">
                                  {{el.remark}}
                                  <input ms-attr-id="fxyzp{{el.infocode}}" type="checkbox"/>
                              </span>
                          </label>
                      </td>
                  </tr>
                  <tr>
                    <td>
                        <label>
                            <span class="inputSpan">
                                合计
                            </span>
                        </label>
                    </td>
                    <td>
                        <label>
                            <span class="inputSpan">
                              {{riskVal.totalSco}}
                            </span>
                        </label>
                    </td>
                  </tr>
                  <tr>
                    <td colspan="2">
                        评估结果：&emsp;&emsp;&emsp;&emsp;出血高风险
                        <label>
                            <input type="checkbox" value="1" name="hspVtefxpgbCustom.vteresult" <c:if test="${hspVtefxpgbCustom.vteresult eq '1'}">checked="checked"</c:if>/>是
                        </label>
                        <label>
                            <input type="checkbox" value="0" name="hspVtefxpgbCustom.vteresult" <c:if test="${hspVtefxpgbCustom.vteresult eq '0'}">checked="checked"</c:if>/>否
                        </label>
                    </td>
                  </tr>
                </table>
            </li>
            <li class="rightass">
                <label>
                    医师签名：
                    <span id="docname"></span>
                </label>
            </li>
            <li class="rightass">
                <label>
                    日期：
                    <span id="docdate"></span>
                </label>
            </li>
          </ul>
        </div>
      </div>
    </body>
</html>