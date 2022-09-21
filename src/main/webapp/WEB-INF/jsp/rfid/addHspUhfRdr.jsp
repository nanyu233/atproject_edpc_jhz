<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/base/tag.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
  <base href="${baseurl}">
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <title>新增UHF读写器</title>
  <%@ include file="/WEB-INF/jsp/base/common_css.jsp"%>
  <%@ include file="/WEB-INF/jsp/base/common_js.jsp"%>
  <link rel="stylesheet" type="text/css" href="${baseurl}lib/layui/css/layui.css" media="all">
  <link rel="stylesheet" type="text/css" href="${baseurl}css/common/tableStyle.css?v=${versionDay}">
  <link rel="stylesheet" type="text/css" href="${baseurl}css/hems/global.css?v=${versionDay}">
</head>

<body class="addHspUhfRdr">
  <form class="form" ms-controller="addHspUhfRdrForm" id="hspUhfRdrForm" action="rfid/addHspUhfRdrSubmit.do" method="post">
    <table>
      <colgroup>
        <col width="20%" />
        <col />
      </colgroup>
      <tbody>
        <tr>
          <th><i class="red">*</i> 设备编号：</th>
          <td>
            <input type="text" ms-duplex-string="hspUhfRdrCustom.rdrId" maxlength="32" />
          </td>
        </tr>
        <tr>
          <th> 设备名称：</th>
          <td>
            <input type="text" ms-duplex-string="hspUhfRdrCustom.rdrNam"  maxlength="64" />
          </td>
        </tr>
        <tr>
          <th><i class="red">*</i> 设备类型：</th>
          <td>
            <select ms-duplex="hspUhfRdrCustom.rdrTyp"  lay-verify="required">
              <option value="1">读写一体机</option>
              <option value="2">读写器</option>
            </select>
          </td>
        </tr>
        <tr>
          <th> 监测点类型：</th>
          <td>
            <input type="text" ms-duplex="hspUhfRdrCustom.mtrTyp" maxlength="32" />
          </td>
        </tr>
        <tr>
          <th> 监测点参考码：</th>
          <td>
            <input type="text" ms-duplex="hspUhfRdrCustom.mtrCod" maxlength="32" />
          </td>
        </tr>
        <tr>
          <th> 设备位置：</th>
          <td>
            <input type="text" ms-duplex="hspUhfRdrCustom.rdrLoc" maxlength="32" />
          </td>
        </tr>
        <tr>
          <th><i class="red">*</i> 设备状态：</th>
          <td>
            <select ms-duplex="hspUhfRdrCustom.rdrSta"  lay-verify="required">
              <option value="1">使用</option>
              <option value="0">未使用</option>
            </select>
          </td>
        </tr>
        <tr>
          <th> 设备参数：</th>
          <td>
            <input type="text" ms-duplex="hspUhfRdrCustom.rdrPar" maxlength="32" />
          </td>
        </tr>
        <tr>
          <th> 使用科室：</th>
          <td id="conditeComno">
            <div class="layui-input-inline">
              <select ms-duplex="hspUhfRdrCustom.rdrDep" lay-filter="comnoFilter">
                <option value="">全部科室</option>
                <option ms-repeat="devdictlist.siteList" ms-attr-value="{{el.comno}}">{{el.comcname}}</option>
              </select>
            </div>
          </td>
        </tr>
        <tr>
          <th> 购置日期：</th>
          <td>
            <input class="input-date Wdate" ms-duplex="hspUhfRdrCustom.buyDat" type="text" onclick="WdatePicker({dateFmt:'yyyy/MM/dd'})">
          </td>
        </tr>
        <tr>
          <th> 安装日期：</th>
          <td>
            <input class="input-date Wdate" ms-duplex="hspUhfRdrCustom.fixDat" type="text" onclick="WdatePicker({dateFmt:'yyyy/MM/dd'})">
          </td>
        </tr>
        <tr>
          <th> 安装人员：</th>
          <td>
            <input type="text" ms-duplex="hspUhfRdrCustom.fixMan" maxlength="32" />
          </td>
        </tr>
        <tr>
          <th> 运维公司：</th>
          <td>
            <input type="text" ms-duplex="hspUhfRdrCustom.mntMan"  maxlength="32" />
          </td>
        </tr>
        <tr>
          <th> 运维人员：</th>
          <td>
            <input type="text" ms-duplex="hspUhfRdrCustom.mntTel"  maxlength="32" />
          </td>
        </tr>
        <tr>
          <th> 运维电话：</th>
          <td>
            <input type="text" ms-duplex="hspUhfRdrCustom.mntCom"  maxlength="32" />
          </td>
        </tr>
        <tr>
          <th> 是否有线网：</th>
          <td>
            <select ms-duplex="hspUhfRdrCustom.tcpFlg"  lay-verify="required">
              <option value="1">是</option>
              <option value="0">否</option>
            </select>
          </td>
        </tr>
        <tr>
          <th> 是否无线网：</th>
          <td>
            <select ms-duplex="hspUhfRdrCustom.wifFlg"  lay-verify="required">
              <option value="1">是</option>
              <option value="0">否</option>
            </select>
          </td>
        </tr>
        <tr>
          <th> ip地址：</th>
          <td>
            <input type="text" ms-duplex="hspUhfRdrCustom.rdrIp" maxlength="32" />
          </td>
        </tr>
        <tr>
          <th> ip端口：</th>
          <td>
            <input type="text" ms-duplex="hspUhfRdrCustom.rdrPort" maxlength="32" />
          </td>
        </tr>
        <tr>
          <td colspan="2" class="last_td">
            <div class="center grp_btn">
              <a class="easyui-linkbutton" iconCls="icon-ok" id="submitbtn" onclick="insertHspUhfRdr()">确定</a>
              <a class="easyui-linkbutton" iconCls="icon-cancel" id="closebtn" onclick="parent.closemodalwindow()">关闭</a>
            </div>
          </td>
        </tr>
      </tbody>
    </table>
  </form>
  <script type="text/javascript" src="${baseurl}lib/validate/jquery.validate.js"></script>
  <script type="text/javascript">

    $.validator.methods.isRdrSeq = function (value, element, param) {
      return (/[0-9]\d*/.test(value) && 0 <= 1 * value && value.length==2);
    };

    $.validator.methods.isIpaddr = function (value, element, param) {
      if(""==value){
        return true;
      }else{
        return (/^((2[0-4]\d|25[0-5]|[01]?\d\d?)\.){3}(2[0-4]\d|25[0-5]|[01]?\d\d?)$/.test(value));
      }
    };

    $.validator.methods.isIpPort = function (value, element, param) {
      if(""==value){
        return true;
      }else{
        return (/^[1-9]\d*$/.test(value) && 1 <= 1 * value && 1 * value <= 65535);
      }
    };

  </script>

  <script type="text/javascript" src="${baseurl}lib/avalon1.4.8/avalon.js"></script>
  <script type="text/javascript" src="${baseurl}lib/layui/layui.js"></script>
  <script type="text/javascript" src="${baseurl}js/subpageJs/rfid/addHspUhfRdr.avalon.js"></script>
</body>

</html>