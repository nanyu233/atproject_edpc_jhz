<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/base/tag.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
</head>

<body>
  <div class="topDiv">
    <p class="titleP">护理依赖程度</p>
    <label ms-repeat="systemList.adlHlylcdList" ms-attr-for="adlHlylcd{{el.infocode}}" class="labWrapper">
      <span>
        {{el.infoid}} <input ms-attr-id="adlHlylcd{{el.infocode}}" type="checkbox" ms-attr-checked="el.checked" ms-click="adlradioclick('adlHlylcd',$index)" />
      </span>
      <ul>
        <li ms-repeat-item="el.info">
          {{item}}
        </li>
      </ul>
      <br />
    </label>
    <input class="hidden" type="text" name="hspAdlInfCustom.adlHlylcd" ms-duplex-string="aboutAdl.adlHlylcd">
  </div>
  <table class="paneltab adltab">
    <tbody>
      <col width="28%">
      <col width="18%">
      <col width="18%">
      <col width="18%">
      <col width="18%">
    </tbody>
    <tr class="firsttr">
      <th></th>
      <td>自理</td>
      <td>稍依赖</td>
      <td>较大依赖</td>
      <td>完全依赖</td>
    </tr>
    <tr class="eventr">
      <th>进食</th>
      <td ms-repeat="systemList.adlJsScoList">
        <label ms-attr-for="adlJsSco{{el.infoid}}" class="labtab">
          <span class="inputSpan">
            <input ms-attr-id="adlJsSco{{el.infoid}}" type="checkbox" ms-attr-checked="el.checked" ms-click="adlradioclick('adlJsSco',$index)">
            {{el.infocode}}
          </span>
        </label>
      </td>
      <input class="hidden" type="text" name="hspAdlInfCustom.adlJsSco" ms-duplex-string="aboutAdl.adlJsSco">
      <input class="hidden" type="text" name="hspAdlInfCustom.adlJsScoNew" ms-duplex-string="aboutAdl.adlJsScoNew">
    </tr>
    <tr class="oddtr">
      <th>洗澡</th>
      <td ms-repeat="systemList.adlXizScoList">
        <label ms-attr-for="adlXizSco{{el.infoid}}" class="labtab">
          <span class="inputSpan">
            <input ms-attr-id="adlXizSco{{el.infoid}}" type="checkbox" ms-attr-checked="el.checked" ms-click="adlradioclick('adlXizSco',$index)">
            {{el.infocode}}
          </span>
        </label>
      </td>
      <input class="hidden" type="text" name="hspAdlInfCustom.adlXizSco" ms-duplex-string="aboutAdl.adlXizSco">
      <input class="hidden" type="text" name="hspAdlInfCustom.adlXizScoNew" ms-duplex-string="aboutAdl.adlXizScoNew">
    </tr>
    <tr class="eventr">
      <th>修饰（洗脸、梳头、刷牙、刮脸）</th>
      <td ms-repeat="systemList.adlXsScoList">
        <label ms-attr-for="adlXsSco{{el.infoid}}" class="labtab">
          <span class="inputSpan">
            <input ms-attr-id="adlXsSco{{el.infoid}}" type="checkbox" ms-attr-checked="el.checked" ms-click="adlradioclick('adlXsSco',$index)">
            {{el.infocode}}
          </span>
        </label>
      </td>
      <input class="hidden" type="text" name="hspAdlInfCustom.adlXsSco" ms-duplex-string="aboutAdl.adlXsSco">
      <input class="hidden" type="text" name="hspAdlInfCustom.adlXsScoNew" ms-duplex-string="aboutAdl.adlXsScoNew">
    </tr>
    <tr class="oddtr">
      <th>穿衣（包括系带）</th>
      <td ms-repeat="systemList.adlCyScoList">
        <label ms-attr-for="adlCySco{{el.infoid}}" class="labtab">
          <span class="inputSpan">
            <input ms-attr-id="adlCySco{{el.infoid}}" type="checkbox" ms-attr-checked="el.checked" ms-click="adlradioclick('adlCySco',$index)">
            {{el.infocode}}
          </span>
        </label>
      </td>
      <input class="hidden" type="text" name="hspAdlInfCustom.adlCySco" ms-duplex-string="aboutAdl.adlCySco">
      <input class="hidden" type="text" name="hspAdlInfCustom.adlCyScoNew" ms-duplex-string="aboutAdl.adlCyScoNew">
    </tr>
    <tr class="eventr">
      <th>控制大便</th>
      <td ms-repeat="systemList.adlKzdbScoList">
        <label ms-attr-for="adlKzdbSco{{el.infoid}}" class="labtab">
          <span class="inputSpan">
            <input ms-attr-id="adlKzdbSco{{el.infoid}}" type="checkbox" ms-attr-checked="el.checked" ms-click="adlradioclick('adlKzdbSco',$index)">
            {{el.infocode}}
          </span>
        </label>
      </td>
      <input class="hidden" type="text" name="hspAdlInfCustom.adlKzdbSco" ms-duplex-string="aboutAdl.adlKzdbSco">
      <input class="hidden" type="text" name="hspAdlInfCustom.adlKzdbScoNew" ms-duplex-string="aboutAdl.adlKzdbScoNew">
    </tr>
    <tr class="oddtr">
      <th>控制小便</th>
      <td ms-repeat="systemList.adlKzxbScoList">
        <label ms-attr-for="adlKzxbSco{{el.infoid}}" class="labtab">
          <span class="inputSpan">
            <input ms-attr-id="adlKzxbSco{{el.infoid}}" type="checkbox" ms-attr-checked="el.checked" ms-click="adlradioclick('adlKzxbSco',$index)">
            {{el.infocode}}
          </span>
        </label>
      </td>
      <input class="hidden" type="text" name="hspAdlInfCustom.adlKzxbSco" ms-duplex-string="aboutAdl.adlKzxbSco">
      <input class="hidden" type="text" name="hspAdlInfCustom.adlKzxbScoNew" ms-duplex-string="aboutAdl.adlKzxbScoNew">
    </tr>
    <tr class="eventr">
      <th>上厕所</th>
      <td ms-repeat="systemList.adlScsScoList">
        <label ms-attr-for="adlScsSco{{el.infoid}}" class="labtab">
          <span class="inputSpan">
            <input ms-attr-id="adlScsSco{{el.infoid}}" type="checkbox" ms-attr-checked="el.checked" ms-click="adlradioclick('adlScsSco',$index)">
            {{el.infocode}}
          </span>
        </label>
      </td>
      <input class="hidden" type="text" name="hspAdlInfCustom.adlScsSco" ms-duplex-string="aboutAdl.adlScsSco">
      <input class="hidden" type="text" name="hspAdlInfCustom.adlScsScoNew" ms-duplex-string="aboutAdl.adlScsScoNew">
    </tr>
    <tr class="oddtr">
      <th>床椅转移</th>
      <td ms-repeat="systemList.adlCyzyScoList">
        <label ms-attr-for="adlCyzySco{{el.infoid}}" class="labtab">
          <span class="inputSpan">
            <input ms-attr-id="adlCyzySco{{el.infoid}}" type="checkbox" ms-attr-checked="el.checked" ms-click="adlradioclick('adlCyzySco',$index)">
            {{el.infocode}}
          </span>
        </label>
      </td>
      <input class="hidden" type="text" name="hspAdlInfCustom.adlCyzySco" ms-duplex-string="aboutAdl.adlCyzySco">
      <input class="hidden" type="text" name="hspAdlInfCustom.adlCyzyScoNew" ms-duplex-string="aboutAdl.adlCyzyScoNew">
    </tr>
    <tr class="eventr">
      <th>行走（平底45M）</th>
      <td ms-repeat="systemList.adlXingzScoList">
        <label ms-attr-for="adlXingzSco{{el.infoid}}" class="labtab">
          <span class="inputSpan">
            <input ms-attr-id="adlXingzSco{{el.infoid}}" type="checkbox" ms-attr-checked="el.checked" ms-click="adlradioclick('adlXingzSco',$index)">
            {{el.infocode}}
          </span>
        </label>
      </td>
      <input class="hidden" type="text" name="hspAdlInfCustom.adlXingzSco" ms-duplex-string="aboutAdl.adlXingzSco">
      <input class="hidden" type="text" name="hspAdlInfCustom.adlXingzScoNew" ms-duplex-string="aboutAdl.adlXingzScoNew">
    </tr>
    <tr class="oddtr">
      <th>上下楼梯（用手杖也算独立）</th>
      <td ms-repeat="systemList.adlSxltScoList">
        <label ms-attr-for="adlSxltSco{{el.infoid}}" class="labtab">
          <span class="inputSpan">
            <input ms-attr-id="adlSxltSco{{el.infoid}}" type="checkbox" ms-attr-checked="el.checked" ms-click="adlradioclick('adlSxltSco',$index)">
            {{el.infocode}}
          </span>
        </label>
      </td>
      <input class="hidden" type="text" name="hspAdlInfCustom.adlSxltSco" ms-duplex-string="aboutAdl.adlSxltSco">
      <input class="hidden" type="text" name="hspAdlInfCustom.adlSxltScoNew" ms-duplex-string="aboutAdl.adlSxltScoNew">
    </tr>
  </table>
</body>
</html>