<div id="s1034">
    <%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
    <div class="tbody">
      <div class="title"><label id="id_title1">${hospitalPlatformNameGap}</label></div>
      <div class="title1"><label id="id_title2">医疗材料收费知情同意书</label></div>
      <div class="messages m_t10">
        <div style="border: 0px">
          <table class="tbody">
            <colgroup>
              <col width="19%">
              <col width="18%">
              <col width="19%">
              <col width="19%">
              <col width="25%">
            </colgroup>
            <tr>
              <td>
                <label>姓名:</label>
                <input id="value_1" type="text" class="input_tb" style="width: 100px;"/>
              </td>
              <td>
                <label>性别:</label>
                <input id="value_2" type="text" class="input_tb" style="width: 90px;"/>
              </td>
              <td>
                <label>科别:</label>
                <input id="value_3" type="text" class="input_tb" style="width: 100px;"/>
              </td>
              <td>
                <label>床号:</label>
                <input id="value_4" type="text" class="input_tb" style="width: 100px;"/>
              </td>
              <td>
                <label>住院号:</label>
                <input id="value_5" type="text" class="input_tb" style="width: 96px;"/>
              </td>
            </tr>
            <tr>
              <td colspan="5">
                <label style="text-indent: 2em">
                  根据浙江省医疗收费规范的有关规定，诊疗过程中使用可吸收缝线、“除外内容”中证明的特殊性缝线、植入性材料以及单价
                  在200元以上的材料时，需要患方知情同意并签字。
                </label>
              </td>
            </tr>
            <tr>
              <td colspan="5">
                <label style="text-indent: 2em">
                  患者因疾病检查/治疗，需要使用到下列材料：（需要使用打“√”）
                </label>
              </td>
            </tr>
            <tr>
              <td colspan="5">
                <table class="tableIn">
                  <tr>
                    <td><label class="checklabel"><input type="checkbox">可吸收缝线</label></td>
                    <td><label class="checklabel"><input type="checkbox">活检针</label></td>
                    <td><label class="checklabel"><input type="checkbox">内镜下超声切割止血刀</label></td>
                    <td><label class="checklabel"><input type="checkbox">化疗泵</label></td>
                  </tr>
                  <tr>
                    <td><label class="checklabel"><input type="checkbox">特殊缝线</label></td>
                    <td><label class="checklabel"><input type="checkbox">活检钳</label></td>
                    <td><label class="checklabel"><input type="checkbox">各类泌尿道管（丝）</label></td>
                    <td><label class="checklabel"><input type="checkbox">镇痛泵</label></td>
                  </tr>
                  <tr>
                    <td><label class="checklabel"><input type="checkbox">吻合器</label></td>
                    <td><label class="checklabel"><input type="checkbox">取石篮（取物器）</label></td>
                    <td><label class="checklabel"><input type="checkbox">悬吊器（带）</label></td>
                    <td><label class="checklabel"><input type="checkbox">透析泵</label></td>
                  </tr>
                  <tr>
                    <td><label class="checklabel"><input type="checkbox">缝合器</label></td>
                    <td><label class="checklabel"><input type="checkbox">碎石器（取物器）</label></td>
                    <td><label class="checklabel"><input type="checkbox">多功能引流管</label></td>
                    <td><label class="checklabel"><input type="checkbox">透析导管</label></td>
                  </tr>
                  <tr>
                    <td><label class="checklabel"><input type="checkbox">可吸收止血材料</label></td>
                    <td><label class="checklabel"><input type="checkbox">内镜下圈套器</label></td>
                    <td><label class="checklabel"><input type="checkbox">深静脉穿刺导管</label></td>
                    <td><label class="checklabel"><input type="checkbox">换能器</label></td>
                  </tr>
                  <tr>
                    <td><label class="checklabel"><input type="checkbox">医用胶</label></td>
                    <td><label class="checklabel"><input type="checkbox">内镜下乳头切开刀</label></td>
                    <td><label class="checklabel"><input type="checkbox">穿刺鞘</label></td>
                    <td><label class="checklabel"><input type="checkbox">鼻肠营养管</label></td>
                  </tr>
                  <tr>
                    <td><label class="checklabel"><input type="checkbox">医用膜</label></td>
                    <td><label class="checklabel"><input type="checkbox">内镜下电凝切割器</label></td>
                    <td><label class="checklabel"><input type="checkbox">气管切开套管</label></td>
                    <td><input type="text" class="input_tb"/></td>
                  </tr>
                  <tr>
                    <td><label class="checklabel"><input type="checkbox">一次性穿刺针</label></td>
                    <td><label class="checklabel"><input type="checkbox">内镜下铣刀头</label></td>
                    <td><label class="checklabel"><input type="checkbox">介入导管（丝）</label></td>
                    <td><input type="text" class="input_tb"/></td>
                  </tr>
                  <tr>
                    <td><input type="text" class="input_tb"/></td>
                    <td><input type="text" class="input_tb"/></td>
                    <td><input type="text" class="input_tb"/></td>
                    <td><input type="text" class="input_tb"/></td>
                  </tr>
                </table>
              </td>
            </tr>
            <tr>
              <td colspan="5">
                <label style="text-indent: 2em">专科使用材料：</label>
              </td>
            </tr>
            <tr>
              <td colspan="5">
                <table class="tableIn">
                  <tr>
                    <td>材料名称</td>
                    <td>估计价格</td>
                    <td>供应厂商（公司）</td>
                    <td>备注</td>
                  </tr>
                  <tr>
                    <td>闭合器</td>
                    <td><input type="text" class="input_tb"/></td>
                    <td><input type="text" class="input_tb"/></td>
                    <td><input type="text" class="input_tb"/></td>
                  </tr>
                  <tr>
                    <td>钛钳</td>
                    <td><input type="text" class="input_tb"/></td>
                    <td><input type="text" class="input_tb"/></td>
                    <td><input type="text" class="input_tb"/></td>
                  </tr>
                  <tr>
                    <td>栓（填）塞材料</td>
                    <td><input type="text" class="input_tb"/></td>
                    <td><input type="text" class="input_tb"/></td>
                    <td><input type="text" class="input_tb"/></td>
                  </tr>
                  <tr>
                    <td>各类修补材料</td>
                    <td><input type="text" class="input_tb"/></td>
                    <td><input type="text" class="input_tb"/></td>
                    <td><input type="text" class="input_tb"/></td>
                  </tr>
                  <tr>
                    <td>射频导管（针）</td>
                    <td><input type="text" class="input_tb"/></td>
                    <td><input type="text" class="input_tb"/></td>
                    <td><input type="text" class="input_tb"/></td>
                  </tr>
                  <tr>
                    <td><input type="text" class="input_tb"/></td>
                    <td><input type="text" class="input_tb"/></td>
                    <td><input type="text" class="input_tb"/></td>
                    <td><input type="text" class="input_tb"/></td>
                  </tr>
                  <tr>
                    <td><input type="text" class="input_tb"/></td>
                    <td><input type="text" class="input_tb"/></td>
                    <td><input type="text" class="input_tb"/></td>
                    <td><input type="text" class="input_tb"/></td>
                  </tr>
                </table>
              </td>
            </tr>
            <tr>
              <td colspan="5">
                说明：1、检查/治疗中使用上述相关材料或器械，并不意味着保证相应检查/治疗的成功。2、同一种材料有多种不同
                的档次；每一个个体也有很大的差异，操作过程中具体有医生把握。希望能理解。
              </td>
            </tr>
            <tr>
              <td colspan="5">
                <label>医师签名：</label>
                <input type="text" class="input_tb"/>
                <input type="text" class="input_tb"/>
                <label>日期：</label>
                <input class="Wdate spcWdate input_date" type="text" style="width: 120px;" onclick="WdatePicker({dateFmt:'yyyy/MM/dd HH:mm'})">/
                <input class="Wdate spcWdate input_date" type="text" style="width: 120px;" onclick="WdatePicker({dateFmt:'yyyy/MM/dd HH:mm'})">
              </td>
            </tr>
            <tr>
              <td colspan="5">
                <label style="text-indent:2em">
                  上述情况医生已经讲明。经慎重考虑，我们愿意承担相应的材料费用，并代表患者及家属全权负责签字。
                </label>
              </td>
            </tr>
            <tr>
              <td colspan="5">
                <label>患者签名：</label>
                <input type="text" class="input_tb"/>
                <label>日期：</label>
                <input class="Wdate spcWdate input_date" type="text" style="width: 120px;" onclick="WdatePicker({dateFmt:'yyyy/MM/dd HH:mm'})">
              </td>
            </tr>
            <tr>
              <td colspan="5">
                <label style="text-indent:2em">
                  如果患者无法签署知情同意书，请其授权的代理人在此签名。
                </label>
              </td>
            </tr>
            <tr>
              <td colspan="5">
                <label>被授权人/代理人签名：</label>
                <input type="text" class="input_tb"/>
                <label>与患者关系：</label>
                <input type="text" class="input_tb"/>
                <label>日期：</label>
                <input class="Wdate spcWdate input_date" type="text" style="width: 120px;" onclick="WdatePicker({dateFmt:'yyyy/MM/dd HH:mm'})">
              </td>
            </tr>
          </table>
        </div>
      </div>
    </div>
    <script>
      function init1(){
        var refseqno=$("#refseqno").val();
        $.ajax({
              url: "${baseurl}zyyconsent/findHspemginfCustombyAjax.do?",
              type: "post",
              data: {
                "emgSeq":refseqno
              },
              success:function(data){
                $("#value_1").val(data.resultInfo.sysdata.hspemginfCustom.cstNam);
                $("#value_2").val(data.resultInfo.sysdata.hspemginfCustom.cstSexCod);
                $("#value_3").val(data.resultInfo.sysdata.hspemginfCustom.emgFkCod);
                $("#value_4").val(data.resultInfo.sysdata.hspemginfCustom.emgBed);
                $("#value_5").val(data.resultInfo.sysdata.hspemginfCustom.observationCode);
              }
          })
      }
    </script>
</div>