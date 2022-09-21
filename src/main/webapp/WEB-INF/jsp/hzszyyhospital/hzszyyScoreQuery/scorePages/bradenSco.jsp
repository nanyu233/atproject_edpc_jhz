<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/base/tag.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
</head>
<body>
  <table class="paneltab">
    <tr class="firsttr">
      <th></th>
      <td>1分</td>
      <td>2分</td>
      <td>3分</td>
      <td>4分</td>
    </tr>
    <tr class="eventr">
      <th>感觉</th>
      <td ms-repeat="systemList.bradenGjCodList">
        <label ms-attr-for="bradenGjCod{{el.infocode}}" class="labtab">
          <span class="inputSpan">
            <input ms-attr-id="bradenGjCod{{el.infocode}}" type="checkbox" ms-attr-checked="el.checked" ms-click="Objradioclick('bradenGjCod',$index,'aboutbraden')">
            {{el.info}}
          </span>
        </label>
      </td>
      <input class="hidden" type="text" name="hspBradenInfCustom.bradenGjCod" ms-duplex-string="aboutbraden.bradenGjCod">
    </tr>
    <tr class="oddtr">
      <th>潮湿</th>
      <td ms-repeat="systemList.bradenCsCodList">
        <label ms-attr-for="bradenCsCod{{el.infocode}}" class="labtab">
          <span class="inputSpan">
            <input ms-attr-id="bradenCsCod{{el.infocode}}" type="checkbox" ms-attr-checked="el.checked" ms-click="Objradioclick('bradenCsCod',$index,'aboutbraden')">
            {{el.info}}
          </span>
        </label>
      </td>
      <input class="hidden" type="text" name="hspBradenInfCustom.bradenCsCod" ms-duplex-string="aboutbraden.bradenCsCod">
    </tr>
    <tr class="eventr">
      <th>活动能力</th>
      <td ms-repeat="systemList.bradenHdnlCodList">
        <label ms-attr-for="bradenHdnlCod{{el.infocode}}" class="labtab">
          <span class="inputSpan">
            <input ms-attr-id="bradenHdnlCod{{el.infocode}}" type="checkbox" ms-attr-checked="el.checked" ms-click="Objradioclick('bradenHdnlCod',$index,'aboutbraden')">
            {{el.info}}
          </span>
        </label>
      </td>
      <input class="hidden" type="text" name="hspBradenInfCustom.bradenHdnlCod" ms-duplex-string="aboutbraden.bradenHdnlCod">
    </tr>
    <tr class="oddtr">
      <th>移动能力</th>
      <td ms-repeat="systemList.bradenYdnlCodList">
        <label ms-attr-for="bradenYdnlCod{{el.infocode}}" class="labtab">
          <span class="inputSpan">
            <input ms-attr-id="bradenYdnlCod{{el.infocode}}" type="checkbox" ms-attr-checked="el.checked" ms-click="Objradioclick('bradenYdnlCod',$index,'aboutbraden')">
            {{el.info}}
          </span>
        </label>
      </td>
      <input class="hidden" type="text" name="hspBradenInfCustom.bradenYdnlCod" ms-duplex-string="aboutbraden.bradenYdnlCod">
    </tr>
    <tr class="eventr">
      <th>营养</th>
      <td ms-repeat="systemList.bradenYyCodList">
        <label ms-attr-for="bradenYyCod{{el.infocode}}" class="labtab">
          <span class="inputSpan">
            <input ms-attr-id="bradenYyCod{{el.infocode}}" type="checkbox" ms-attr-checked="el.checked" ms-click="Objradioclick('bradenYyCod',$index,'aboutbraden')">
            {{el.info}}
          </span>
        </label>
      </td>
      <input class="hidden" type="text" name="hspBradenInfCustom.bradenYyCod" ms-duplex-string="aboutbraden.bradenYyCod">
    </tr>
    <tr class="oddtr">
      <th>摩擦和剪切力</th>
      <td ms-repeat="systemList.bradenMchjqlCodList">
        <label ms-attr-for="bradenMchjqlCod{{el.infocode}}" class="labtab">
          <span class="inputSpan">
            <input ms-attr-id="bradenMchjqlCod{{el.infocode}}" type="checkbox" ms-attr-checked="el.checked" ms-click="Objradioclick('bradenMchjqlCod',$index,'aboutbraden')">
            {{el.info}}
          </span>
        </label>
      </td>
      <input class="hidden" type="text" name="hspBradenInfCustom.bradenMchjqlCod" ms-duplex-string="aboutbraden.bradenMchjqlCod">
      <td></td>
    </tr>
  </table>
</body>
</html>