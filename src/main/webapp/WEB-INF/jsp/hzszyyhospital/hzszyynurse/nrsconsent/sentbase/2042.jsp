<div id="ws2042">
  <%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
  <%@ taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="fmt"%>
  <%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
  <div class="tys receTp">
    <jsp:include page="/WEB-INF/jsp/hzszyyhospital/printBasicInfo/printBasicInfo.jsp"></jsp:include>
    <div class="basicDiv zdDiv">
      <label>病区：<input class="tableInput" type="text" value="急诊抢救室"/></label>
      <label>床号：${hspemginfCustom.emgBed}</label>
      <label>姓名：${hspemginfCustom.cstNam}</label>
      <label>病案号：${hspemginfCustom.mpi}</label>
      <label>性别：${hspemginfCustom.cstSexCod}</label>
      <label>年龄：${hspemginfCustom.cstAge}${hspemginfCustom.cstAgeCod}</label>
    </div>
    <div class="zdDiv basicDiv">
      <span class="smalltitle firstlab" style="margin-top: 1mm;">诊断</span>
      <input type="text" class="tableInput" id="show_text" value="${hspemginfCustom.jbzdDes}" />
    </div>
    <div class="cleanAll"></div>
    <div class="wrapperDiv" id="docTB1">
      <div class="childTitle">
        术前核对内容（病房（急诊）护士/介入护士共同核对）
      </div>
      <table class="managetable recpTable">
        <colgroup>
          <col width="50%">
          <col width="50%">
        </colgroup>
        <tr>
          <td colspan="2">
            <label class="checklabel">
              <input type="checkbox">床号
            </label>
            <label class="checklabel">
              <input type="checkbox">姓名
            </label>
            <label class="checklabel">
              <input type="checkbox">病案号
            </label>
            <label class="checklabel">
              <input type="checkbox">性别
            </label>
            <label class="checklabel">
              <input type="checkbox">年龄
            </label>
            <label class="checklabel">
              <input type="checkbox">诊断
            </label><br/>
            <span>手术时间：</span>
            <input class="Wdate spcWdate" type="text" onclick="WdatePicker({dateFmt:'yyyy/MM/dd HH:mm:ss'})" readonly
              unselectable='on'>
            <span>手术名称：</span>
            <input type="text" class="wbInput tableInput">
          </td>
        </tr>
        <tr>
          <td colspan="2">
            <label>带入物品：</label>
            <label class="checklabel">
              <input type="checkbox">病历
            </label>
            <label class="checklabel">
              <input type="checkbox">沙袋
            </label>
            <label class="checklabel">
              <input type="checkbox">压迫止血器
            </label>
          </td>
        </tr>
        <tr>
          <td colspan="2">
            <label>跌倒风险：</label>
            <label class="checklabel">
              <input type="checkbox">低风险
            </label>
            <label class="checklabel">
              <input type="checkbox">中风险
            </label>
            <label class="checklabel">
              <input type="checkbox">高风险
            </label>
          </td>
        </tr>
        <tr>
          <td colspan="2">
            <label class="checklabel">
              <input type="checkbox">术前皮肤准备
            </label>
            <label>Braden评分：</label>
            <input type="text" class="smallInput tableInput">分
            <br/>
            <label class="checklabel">
              <input type="checkbox">皮肤完整
            </label>
            <label class="checklabel">
              <input type="checkbox">破损
            </label>
            （部位/面积：<input type="text" class="wbInput tableInput">）
          </td>
        </tr>
        <tr>
          <td colspan="2">
            <label class="checklabel">
              <input type="checkbox">更衣
            </label>
            <label class="checklabel">
              <input type="checkbox">带手术帽
            </label>
            <br/>
            <label>下列物品应去除：</label>
            <label class="checklabel">
              <input type="checkbox">内衣裤
            </label>
            <label>活动假牙：</label>
            <label class="checklabel">
              <input type="checkbox">无
            </label>
            <label class="checklabel">
              <input type="checkbox">有
            </label>
            <label class="checklabel">
              <input type="checkbox">已取下
            </label>
            <br/>
            <label>贵重/金属物品：</label>
            <label class="checklabel">
              <input type="checkbox">无
            </label>
            <label class="checklabel">
              <input type="checkbox">有
            </label>
            <label class="checklabel">
              <input type="checkbox">已取下
            </label>
            <label>眼镜/隐形眼镜：</label>
            <label class="checklabel">
              <input type="checkbox">无
            </label>
            <label class="checklabel">
              <input type="checkbox">有
            </label>
            <label class="checklabel">
              <input type="checkbox">已取下
            </label>
          </td>
        </tr>
        <tr>
          <td colspan="2">
            <label>麻醉方式：</label>
            <label class="checklabel">
              <input type="checkbox">局麻
            </label>
            <label class="checklabel">
              <input type="checkbox">全麻
            </label>
            <br/>
            <label>禁食禁饮：</label>
            <label>禁食</label>
            <input type="text" class="intextinputshort">小时
            <label>禁饮</label>
            <input type="text" class="intextinputshort">小时
            <label class="checklabel">
              <input type="checkbox">女性患者不在月经期
            </label>
          </td>
        </tr>
        <tr>
          <td colspan="2">
            <label>药物过敏史：</label>
            <label class="checklabel">
              <input type="checkbox">无
            </label>
            <label class="checklabel">
              <input type="checkbox">有
            </label>
            <label>过敏药物：</label>
            <input type="text" class="wbInput tableInput"><br/>
            <label>术前用药：</label>
            <input type="text" class="wbInput tableInput">
            <label class="checklabel">
              <input type="checkbox">已执行
            </label>
            <label class="checklabel">
              <input type="checkbox">无此需要
            </label><br/>
            <label>术前抗生素：</label>
            <input type="text" class="wbInput tableInput">
            <label class="checklabel">
              <input type="checkbox">已执行
            </label>
            <label class="checklabel">
              <input type="checkbox">无此需要
            </label><br/>
            <label>术前药物过敏试验结果：</label>
            <input type="text" class="wbInput tableInput">
            <label class="checklabel">
              <input type="checkbox">已执行
            </label>
            <label class="checklabel">
              <input type="checkbox">无此需要
            </label><br/>
            <label>术中带药：</label>
            <label class="checklabel">
              <input type="checkbox">无
            </label>
            <label class="checklabel">
              <input type="checkbox">有
            </label>
            <input type="text" class="wbInput tableInput">
          </td>
        </tr>
        <tr>
          <td colspan="2">
            <label>术前生命体征：体温：</label>
            <input type="text" class="intextinputshort">℃
            <label>脉搏：</label>
            <input type="text" class="intextinputshort">次/分
            <label>呼吸：</label>
            <input type="text" class="intextinputshort">次/分<br/>
            <label>血压：</label>
            <input type="text" class="intextinputshort">/
            <input type="text" class="intextinputshort">mmHg
            <label>体重：</label>
            <input type="text" class="intextinputshort">kg<br/>
            <label>是否糖尿病患者：</label>
            <label class="checklabel">
              <input type="checkbox">否
            </label>
            <label class="checklabel">
              <input type="checkbox">是
            </label>
            <label>术前血糖：</label>
            <input type="text" class="intextinputshort">mmol/L
          </td>
        </tr>
        <tr>
          <td colspan="2">
            <label>静脉通路：</label>
            <label class="checklabel">
              <input type="checkbox">是
            </label>
            <label class="checklabel">
              <input type="checkbox">否
            </label><br/>
            <label>部位：</label>
            <label class="checklabel">
              <input type="checkbox">上肢浅静脉
            </label>
            <label class="checklabel">
              <input type="checkbox">下肢浅静脉
            </label>
            <label class="checklabel">
              <input type="checkbox">颈外静脉
            </label>
            <label class="checklabel">
              <input type="checkbox">颈内静脉
            </label>
            <label class="checklabel">
              <input type="checkbox">锁骨下静脉
            </label>
            <label class="checklabel">
              <input type="checkbox">股静脉
            </label><br/>
            <label class="checklabel">
              <input type="checkbox">PICC
            </label>
            <label>其他：</label>
            <input type="text" class="wbInput tableInput">
          </td>
        </tr>
        <tr>
          <td colspan="2">
            <label>排空膀胱：</label>
            <label class="checklabel">
              <input type="checkbox">是
            </label>
            <label class="checklabel">
              <input type="checkbox">否
            </label>
            <label>已训练卧外排尿：</label>
            <label class="checklabel">
              <input type="checkbox">是
            </label>
            <label class="checklabel">
              <input type="checkbox">否
            </label>
            <label>留置尿管：</label>
            <label class="checklabel">
              <input type="checkbox">是
            </label>
            <label class="checklabel">
              <input type="checkbox">否
            </label>
          </td>
        </tr>
        <tr>
          <td colspan="2">
            <label>双足背动脉搏动：</label>
            <label class="checklabel">
              <input type="checkbox">正常对称
            </label>
            <label class="checklabel">
              <input type="checkbox">不对称
            </label>
            <input type="text" class="wbInput tableInput">
            <label class="checklabel">
              <input type="checkbox">无此需要
            </label>
          </td>
        </tr>
        <tr>
          <td colspan="2">
            <label>术前检查已完成：</label>
            <label class="checklabel">
              <input type="checkbox">心电图
            </label>
            <label class="checklabel">
              <input type="checkbox">心超
            </label><br/>
            <label>术前检验已完成：</label>
            <label class="checklabel">
              <input type="checkbox">血常规
            </label>
            <label class="checklabel">
              <input type="checkbox">血生化
            </label>
            <label class="checklabel">
              <input type="checkbox">凝血功能
            </label>
            <label class="checklabel">
              <input type="checkbox">术前四项 
            </label><br/>
            <label>备血：</label>
            <label class="checklabel">
              <input type="checkbox">否
            </label>
            <label class="checklabel">
              <input type="checkbox">是
            </label>
            <input type="text" class="wbInput tableInput">
          </td>
        </tr>
        <tr>
          <td colspan="2">
            <label class="checklabel">
              <input type="checkbox">病史与体检检查
            </label>
            <label class="checklabel">
              <input type="checkbox">手术知情同意书
            </label>
            <label class="checklabel">
              <input type="checkbox">材料知情同意书
            </label>
            <label class="checklabel">
              <input type="checkbox">麻醉知情同意书
            </label>
            <label class="checklabel">
              <input type="checkbox">输血知情同意书
            </label>
            <label class="checklabel">
              <input type="checkbox">对比剂使用知情同意书
            </label>
            <label class="checklabel">
              <input type="checkbox">手术室/手术室外安全核查表
            </label>
          </td>
        </tr>
        <tr>
          <td colspan="2">
            <label>是否需要采取隔离措施：</label>
            <label class="checklabel">
              <input type="checkbox">接触
            </label>
            <label class="checklabel">
              <input type="checkbox">飞沫
            </label>
            <label class="checklabel">
              <input type="checkbox">空气
            </label>
            <label class="checklabel">
              <input type="checkbox">无
            </label>
            <label>其他：</label>
            <input type="text" class="wbInput tableInput">
          </td>
        </tr>
        <tr>
          <td colspan="2">
            <label>住院费用情况：</label>
            <label>费用性质：</label>
            <input type="text" class="smallInput tableInput">
            <label>余额：</label>
            <input type="text" class="smallInput tableInput">
            <label class="checklabel">
              <input type="checkbox">费用金额已报告
            </label>
          </td>
        </tr>
        <tr>
          <td>
            <label>病房（急诊）护士/日期时间：</label>
            <input class="Wdate spcWdate" type="text" onclick="WdatePicker({dateFmt:'yyyy/MM/dd HH:mm:ss'})" readonly unselectable='on'>
          </td>
          <td>
            <label>介入室护士/日期时间：</label>
            <input class="Wdate spcWdate" type="text" onclick="WdatePicker({dateFmt:'yyyy/MM/dd HH:mm:ss'})" readonly unselectable='on'>
          </td>
        </tr>
      </table>
    </div>
    <div class="wrapperDiv" id="docTB2">
      <div class="childTitle">
        术后核对内容（介入室护士/病房护士共同核对）
      </div>
      <table class="managetable recpTable">
        <colgroup>
          <col width="50%">
          <col width="50%">
        </colgroup>
        <tr>
          <td>
            <label class="checklabel">
              <input type="checkbox">核对患者身份正确
            </label>
          </td>
          <td>
            <label>手术名称：</label>
            <input type="text" class="intextinputlong3"><br/>
            <label>麻醉方式：</label>
            <label class="checklabel">
              <input type="checkbox">局麻
            </label>
            <label class="checklabel">
              <input type="checkbox">全麻
            </label>
          </td>
        </tr>
        <tr>
          <td colspan="2">
            <ul class="ulwrapper">
              <li class="threeli">
                <label>术后带回药物：</label>
                <label class="checklabel">
                  <input type="checkbox">无
                </label>
                <label class="checklabel">
                  <input type="checkbox">有
                </label>
              </li>
              <li class="twothreeli">
                （药物：<input type="text" class="intextinputlong3">，
                用法：<input type="text" class="intextinputlong3">）
              </li>
              <li class="threeli"></li>
              <li class="twothreeli">
                （药物：<input type="text" class="intextinputlong3">，
                用法：<input type="text" class="intextinputlong3">）
              </li>
              <li class="threeli"></li>
              <li class="twothreeli">
                （药物：<input type="text" class="intextinputlong3">，
                用法：<input type="text" class="intextinputlong3">）
              </li>
            </ul>
            <label>术中补液量：</label>
            <input type="text" class="wbInput tableInput"><br/>
            <label>术中用药有无过敏：</label>
            <label class="checklabel">
              <input type="checkbox">无
            </label>
            <label class="checklabel">
              <input type="checkbox">有
            </label>
            （过敏反应：<input type="text" class="wbInput tableInput">）
          </td>
        </tr>
        <tr>
          <td colspan="2">
            <label>术中使用肝素：</label>
            <input type="text" class="intextinputlong3">U<br/>
            <label>术中使用造影剂：</label>
            <input type="text" class="intextinputlong3">ml<br/>
            <label>留置导尿：</label>
            <label class="checklabel">
              <input type="checkbox">无
            </label>
            <label class="checklabel">
              <input type="checkbox">有
            </label>
            <label>尿量：</label>
            <input type="text" class="intextinputlong3">ml
          </td>
        </tr>
        <tr>
          <td colspan="2">
            <label>静脉通路：</label>
            <label class="checklabel">
              <input type="checkbox">是
            </label>
            <label class="checklabel">
              <input type="checkbox">否
            </label><br/>
            <label>部位：</label>
            <label class="checklabel">
              <input type="checkbox">上肢浅静脉
            </label>
            <label class="checklabel">
              <input type="checkbox">下肢浅静脉
            </label>
            <label class="checklabel">
              <input type="checkbox">颈外静脉
            </label>
            <label class="checklabel">
              <input type="checkbox">颈内静脉
            </label>
            <label class="checklabel">
              <input type="checkbox">锁骨下静脉
            </label>
            <label class="checklabel">
              <input type="checkbox">股静脉
            </label><br/>
            <label class="checklabel">
              <input type="checkbox">PICC
            </label>
            <label>其他：</label>
            <input type="text" class="wbInput tableInput">
          </td>
        </tr>
        <tr>
          <td colspan="2">
            <label class="checklabel">
              <input type="checkbox">皮肤完整
            </label>
            <label class="checklabel">
              <input type="checkbox">破损
            </label>
            （部位/面积：<input type="text" class="wbInput tableInput">）
          </td>
        </tr>
        <tr>
          <td colspan="2">
            <label>穿刺部位：桡动脉：</label>
            <label class="checklabel">
              <input type="checkbox">左
            </label>
            <label class="checklabel">
              <input type="checkbox">右
            </label>
            <label>股动脉：</label>
            <label class="checklabel">
              <input type="checkbox">左
            </label>
            <label class="checklabel">
              <input type="checkbox">右
            </label>
            <label>股静脉：</label>
            <label class="checklabel">
              <input type="checkbox">左
            </label>
            <label class="checklabel">
              <input type="checkbox">右
            </label>
            <label>其他：</label>
            <input type="text" class="intextinputlong3"><br/>
            <label>穿刺点局部压迫：</label>
            <label class="checklabel">
              <input type="checkbox">是
            </label>
            <label class="checklabel">
              <input type="checkbox">无
            </label>
            （<input type="text" class="wbInput tableInput">）<br/>
            <label>双足背动脉搏动：</label>
            <label class="checklabel">
              <input type="checkbox">正常对称
            </label>
            <label class="checklabel">
              <input type="checkbox">不对称：
            </label>
            <input type="text" class="intextinputlong3">
            <label class="checklabel">
              <input type="checkbox">无此需要
            </label>
          </td>
        </tr>
        <tr>
          <td colspan="2">
            <label>生命体征：脉搏：</label>
            <input type="text" class="intextinputshort">次/分
            <label>呼吸：</label>
            <input type="text" class="intextinputshort">次/分<br/>
            <label>血压：</label>
            <input type="text" class="intextinputshort">/
            <input type="text" class="intextinputshort">mmHg
          </td>
        </tr>
        <tr>
          <td colspan="2">
            <label>其他：</label>
            <input type="text" class="tableInput bqgcintext">
          </td>
        </tr>
        <tr>
          <td colspan="2">
            <label>介入室护士/日期时间：</label>
            <input class="Wdate spcWdate" type="text" onclick="WdatePicker({dateFmt:'yyyy/MM/dd HH:mm:ss'})" readonly unselectable='on'>
          </td>
        </tr>
        <tr>
          <td colspan="2">
            <label>转运过程中有无发生不良事件：</label>
            <label class="checklabel">
              <input type="checkbox">无
            </label>
            <label class="checklabel">
              <input type="checkbox">是
            </label>
            <input type="text" class="wbInput tableInput">
          </td>
        </tr>
        <tr>
          <td colspan="2">
            <label>病房（ICU）护士/日期时间：</label>
            <input class="Wdate spcWdate" type="text" onclick="WdatePicker({dateFmt:'yyyy/MM/dd HH:mm:ss'})" readonly unselectable='on'>
          </td>
        </tr>
      </table>
    </div>
  </div>
</div>
<script type="text/javascript">
  $(function () {
    $('#docuTitle').html('介入患者护理交接单')
  })
</script>