<div id="s2007">
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<div>
	<!-- <p id="id_title1" class="hospitaltitle bigfont">${hospitalPlatformNameGap}</p> -->
	<jsp:include page="/WEB-INF/jsp/hzszyyhospital/printBasicInfo/printBasicInfo.jsp"></jsp:include>
	<div>
			<ul>
				<li class="lifour"></li>
				<li>
					<label>
						<span>手术日期:<input class="Wdate spcWdate" type="text" readonly="readonly" style="width: 150px;" onclick="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm'})"></span>
						&nbsp;&nbsp;
						<span>术前诊断:<input type="text" class="intextinputlong"/></span>
						&nbsp;&nbsp;
						<span>拟手术名称:<input type="text" class="intextinputlong"/></span>
					</label>
					<br/>
					<label>
						<span>术前评估核对:</span>
					</label>
					<br/>
				</li>
				<li class="lifour"></li>
				<li>
					<label>
						<span>是</span>&nbsp;&nbsp;&nbsp;&nbsp;<span>否</span>
					</label>
					<br/>
					<label class="mainreport2">
						<input name="qrfbsjCodCheck" type="checkbox">&nbsp;&nbsp;&nbsp;&nbsp;<input name="qrfbsjCodCheck" type="checkbox">&nbsp;&nbsp;&nbsp;&nbsp;
						<span>患者身份确认</span>
					</label>
					<br/>
				</li>
				<li class="lifour"></li>
				<li>
					<label>
							<input name="sexCod" type="checkbox">&nbsp;&nbsp;&nbsp;&nbsp;<input name="sexCod" type="checkbox">&nbsp;&nbsp;&nbsp;&nbsp;
							<span>T<input type="text" class="intextinput"/>℃&nbsp;&nbsp;P<input type="text" class="intextinput"/>次/分&nbsp;&nbsp;BP<input type="text" class="intextinput"/>/<input type="text" class="intextinput"/>mmHg&nbsp;&nbsp;体重<input type="text" class="intextinput"/>KG</span>
					</label>
					<br/>
					<label >
							<input name="aCod" type="checkbox"  >&nbsp;&nbsp;&nbsp;&nbsp;<input name="aCod" type="checkbox" >&nbsp;&nbsp;&nbsp;&nbsp;
							<span>禁食、禁饮</span>
					</label>
					<br/>
				</li>
				<li class="lifour"></li>
				<li>
					<label>
							<input name="bCod" type="checkbox"  >&nbsp;&nbsp;&nbsp;&nbsp;<input name="bCod" type="checkbox" >&nbsp;&nbsp;&nbsp;&nbsp;
							<span>药物过敏试验<input type="text" class="intextinputlong" style="width: 250px"/></span>
					</label>
					<br/>
					<label>
						<input name="cCod" type="checkbox"  >&nbsp;&nbsp;&nbsp;&nbsp;<input name="cCod" type="checkbox"  >&nbsp;&nbsp;&nbsp;&nbsp;
						<span>存在皮肤破损的危险(</span>
						<label class="doctorType"><input type="checkbox"  class="checkStyle">糖尿病</label>
						<label class="doctorType"><input type="checkbox"  class="checkStyle">截瘫</label>
						<label class="doctorType"><input type="checkbox"  class="checkStyle">外周循环不良</label>
						<label class="doctorType"><input type="checkbox"  class="checkStyle">长期类固醇使用等</label>
						<span>)</span>
					</label>
					<br/>
				</li>
				<li class="lifour"></li>
				<li>
					<label>
						<p style="text-indent:5em;">
							<span>皮肤破损部位<input type="text" class="intextinputlong"/></span>
							<span>面积<input type="text" class="intextinputlong3"/></span>
						</p>
					</label>
				</li>
					<label>
						<input name="dCod" type="checkbox"  >&nbsp;&nbsp;&nbsp;&nbsp;<input name="dCod" type="checkbox"  >&nbsp;&nbsp;&nbsp;&nbsp;
						<span>知情同意书(</span>
						<label class="doctorType"><input type="checkbox"  class="checkStyle">手术知情同意书</label>
						<label class="doctorType"><input type="checkbox"  class="checkStyle">特殊手术材料</label>
						<span>)</span>
						<br/>
					</label>
				<li class="lifour"></li>
					<label>
						<input name="eCod" type="checkbox"  >&nbsp;&nbsp;&nbsp;&nbsp;<input name="eCod" type="checkbox"  >&nbsp;&nbsp;&nbsp;&nbsp;
						<span>检验报告(</span>
						<label class="doctorType"><input type="checkbox"  class="checkStyle">血常规</label>
						<label class="doctorType"><input type="checkbox"  class="checkStyle">凝血功能</label>
						<label class="doctorType"><input type="checkbox"  class="checkStyle">血型</label>
						<label class="doctorType"><input type="checkbox"  class="checkStyle">术前免疫</label>
						<span>)</span>
						<br/>
					</label>
					<label>
						<input name="fCod" type="checkbox"  >&nbsp;&nbsp;&nbsp;&nbsp;<input name="fCod" type="checkbox"  >&nbsp;&nbsp;&nbsp;&nbsp;
						<span>心电图</span>
						<br/>
					</label>
				</li>
				<li class="lifour"></li>
					<label>
						<input name="gCod" type="checkbox"  >&nbsp;&nbsp;&nbsp;&nbsp;<input name="gCod" type="checkbox"  >&nbsp;&nbsp;&nbsp;&nbsp;
						<span>术前用药</span>
						<br/>
					</label>
				</li>
				<li>
					<label>
						<p>
							<input name="hCod" type="checkbox"  >&nbsp;&nbsp;&nbsp;&nbsp;<input name="hCod" type="checkbox"  >&nbsp;&nbsp;&nbsp;&nbsp;
							<span>术中用药送手术室<input type="text" class="intextinputlong" style="width: 250px"/></span>
						</p>
					</label>
				<li class="lifour"></li>
				<li>
					<label>
						<p>
							<input name="iCod" type="checkbox"  >&nbsp;&nbsp;&nbsp;&nbsp;<input name="iCod" type="checkbox"  >&nbsp;&nbsp;&nbsp;&nbsp;
							<span>术前备血<input type="text" class="intextinputlong" style="width: 250px"/></span>
						</p>
					</label>
					<label>
						<p>
							<input name="jCod" type="checkbox"  >&nbsp;&nbsp;&nbsp;&nbsp;<input name="jCod" type="checkbox"  >&nbsp;&nbsp;&nbsp;&nbsp;
							<span>更衣、戴手术帽、脚套</span>
						</p>
					</label>
				</li>
				<li class="lifour"></li>
				<li>
					<label class="mainreport2">
						<p>
							<input name="kCod" type="checkbox"  >&nbsp;&nbsp;&nbsp;&nbsp;<input name="kCod" type="checkbox"  >&nbsp;&nbsp;&nbsp;&nbsp;
							<span>皮肤准备</span>
						</p>
					</label>
					<label class="mainreport2">
						<p>
							<input name="lCod" type="checkbox"  >&nbsp;&nbsp;&nbsp;&nbsp;<input name="lCod" type="checkbox"  >&nbsp;&nbsp;&nbsp;&nbsp;
							<span>除去下列</span>
							<label class="doctorType"><input type="checkbox"  class="checkStyle">内衣裤</label>
							<label class="doctorType"><input type="checkbox"  class="checkStyle">假牙</label>
							<label class="doctorType"><input type="checkbox"  class="checkStyle">首饰</label>
							<label class="doctorType"><input type="checkbox"  class="checkStyle">眼镜(隐形眼镜)</label>
							<label class="doctorType"><input type="checkbox"  class="checkStyle">贵重物品</label>
						</p>
					</label>
				</li>
				<li class="lifour"></li>
				<li>
					<label>
						<p>
							<input name="mCod" type="checkbox"  >&nbsp;&nbsp;&nbsp;&nbsp;<input name="mCod" type="checkbox"  >&nbsp;&nbsp;&nbsp;&nbsp;
							<span>排空膀胱</span>
							<label class="doctorType"><input type="checkbox"  class="checkStyle">留置导尿</label>
							<label class="doctorType"><input type="checkbox"  class="checkStyle">准备导尿物品</label>
						</p>
					</label>
					<label>
						<p>
							<input name="nCod" type="checkbox"  >&nbsp;&nbsp;&nbsp;&nbsp;<input name="nCod" type="checkbox"  >&nbsp;&nbsp;&nbsp;&nbsp;
							<span>病人物品</span>
							<label class="doctorType"><input type="checkbox"  class="checkStyle">病历</label>
							<label class="doctorType"><input type="checkbox"  class="checkStyle">X线片<input type="text" class="intextinput"/>张</label>
							<label class="doctorType"><input type="checkbox"  class="checkStyle">CT片<input type="text" class="intextinput"/>张</label>
							<label class="doctorType"><input type="checkbox"  class="checkStyle">MRI片<input type="text" class="intextinput"/>张</label>
						</p>
					</label>
				</li>
				<li class="lifour"></li>
				<li>
					<label>
						<p style="text-indent:5em;">
							<label>其他<input type="text" class="intextinputlong3"/></label>
						</p>
					</label>
				</li>
				<li>
				
					<label>
						<p>
							<input name="oCod" type="checkbox"  >&nbsp;&nbsp;&nbsp;&nbsp;<input name="oCod" type="checkbox"  >&nbsp;&nbsp;&nbsp;&nbsp;
							<span>一侧身体或四肢的手术部位标记与病历记录一致</span>
						</p>
					</label>
				</li>
				<li class="lifour"></li>
				<li>
					<label>
						<p>
							<input name="pCod" type="checkbox"  >&nbsp;&nbsp;&nbsp;&nbsp;<input name="pCod" type="checkbox"  >&nbsp;&nbsp;&nbsp;&nbsp;
							<span>静脉通路部位</span>
							<label class="doctorType"><input type="checkbox"  class="checkStyle">上肢</label>
							<label class="doctorType"><input type="checkbox"  class="checkStyle">下肢</label>
							<label class="doctorType"><input type="checkbox"  class="checkStyle">颈内外</label>
							<label class="doctorType"><input type="checkbox"  class="checkStyle">深度<input type="text" class="intextinput"/>cm</label>
						</p>
					</label>
				</li>
				<li>
					<label>
						<span>病房护士:<input type="text" class="intextinputlong"/></span>
						&nbsp;&nbsp;
						<span>手术护士:<input type="text" class="intextinputlong"/></span>
						&nbsp;&nbsp;
						<span>时间:<input class="Wdate spcWdate" type="text" readonly="readonly" style="width: 150px;" onclick="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm'})"></span>
					</label>
				</li>
				<li class="lifour"></li>
				<li>
					<label>
						<p>术后评估核对:</p>
						<p>
							<input name="qCod" type="checkbox" >&nbsp;&nbsp;&nbsp;&nbsp;<input name="qCod" type="checkbox" >&nbsp;&nbsp;&nbsp;&nbsp;
							<span>患者身份确认</span>
						</p>
					</label>
				</li>
				<li class="lifour"></li>
				<li>
					<label class="mainreport2">
						<p>
							<input name="rCod" type="checkbox"  >&nbsp;&nbsp;&nbsp;&nbsp;<input name="rCod" type="checkbox"  >&nbsp;&nbsp;&nbsp;&nbsp;
							<span>麻醉方式:</span>
							<label class="doctorType"><input type="checkbox"  class="checkStyle">全麻</label>
							<label class="doctorType"><input type="checkbox"  class="checkStyle">硬膜外</label>
							<label class="doctorType"><input type="checkbox"  class="checkStyle">腰麻</label>
							<label class="doctorType"><input type="checkbox"  class="checkStyle">局麻</label>
							<label>其他<input type="text" class="intextinputlong"/></label>
						</p>
					</label>
					<label class="mainreport2">
						<p>
							<input name="sCod" type="checkbox"  >&nbsp;&nbsp;&nbsp;&nbsp;<input name="sCod" type="checkbox"  >&nbsp;&nbsp;&nbsp;&nbsp;
							<span>静脉输液/输血通畅&nbsp;&nbsp;&nbsp;&nbsp;部位</span>
							<label class="doctorType"><input type="checkbox"  class="checkStyle">上肢</label>
							<label class="doctorType"><input type="checkbox"  class="checkStyle">下肢</label>
							<label class="doctorType"><input type="checkbox"  class="checkStyle">颈内外</label>
							<label class="doctorType"><input type="checkbox"  class="checkStyle">股</label>
							<label>深度<input type="text" class="intextinput"/>cm</label>
						</p>
					</label>
				</li>
				<li class="lifour"></li>
				<li>
					<label>
						<p>
							<input name="uCod" type="checkbox"  >&nbsp;&nbsp;&nbsp;&nbsp;<input name="uCod" type="checkbox"  >&nbsp;&nbsp;&nbsp;&nbsp;
							<span>皮肤完整&nbsp;&nbsp;&nbsp;&nbsp;</span>
							<label>皮肤破损部位<input type="text" class="intextinputlong"/></label>
							<label>面积<input type="text" class="intextinputlong"/></label>
						</p>
					</label>
					<label>
						<p>
							<input name="vCod" type="checkbox"  >&nbsp;&nbsp;&nbsp;&nbsp;<input name="vCod" type="checkbox"  >&nbsp;&nbsp;&nbsp;&nbsp;
							<span>引流管通畅:</span>
							<label class="doctorType"><input type="checkbox"  class="checkStyle">硬膜外</label>
							<label class="doctorType"><input type="checkbox"  class="checkStyle">硬膜下</label>
							<label class="doctorType"><input type="checkbox"  class="checkStyle">脑室外</label>
							<label class="doctorType"><input type="checkbox"  class="checkStyle">胃肠减压</label>
							<label class="doctorType"><input type="checkbox"  class="checkStyle">胸腔</label>
							<label class="doctorType"><input type="checkbox"  class="checkStyle">心包</label>
							<label class="doctorType"><input type="checkbox"  class="checkStyle">纵隔</label>
							<label class="doctorType"><input type="checkbox"  class="checkStyle">腹腔</label>
						</p>
					</label>
				</li>
				<li class="lifour"></li>
				<li>
					<label>
						<p style="text-indent:10em;">
							<label class="doctorType"><input type="checkbox"  class="checkStyle">胃造瘘</label>
							<label class="doctorType"><input type="checkbox"  class="checkStyle">T字</label>
							<label class="doctorType"><input type="checkbox"  class="checkStyle">膀胱造瘘</label>
							<label class="doctorType"><input type="checkbox"  class="checkStyle">导尿</label>
							<label>其他<input type="text" class="intextinputlong"/></label>
						</p>
					</label>
				</li>
				<li>
					<label>
						<p>
							<input name="wCod" type="checkbox"  >&nbsp;&nbsp;&nbsp;&nbsp;<input name="wCod" type="checkbox"  >&nbsp;&nbsp;&nbsp;&nbsp;
							<span>止痛泵:</span>
							<label class="doctorType"><input type="checkbox"  class="checkStyle">硬膜外</label>
							<label class="doctorType"><input type="checkbox"  class="checkStyle">静脉</label>
						</p>
					</label>
				</li>
				<li class="lifour"></li>
				<li>
					<label>
						<p>
							<input name="xCod" type="checkbox"  >&nbsp;&nbsp;&nbsp;&nbsp;<input name="xCod" type="checkbox"  >&nbsp;&nbsp;&nbsp;&nbsp;
							<span>带回血制品</span>
							<label class="doctorType"><input type="checkbox"  class="checkStyle">红细胞<input type="text" class="intextinput"/></label>
							<label class="doctorType"><input type="checkbox"  class="checkStyle">血浆<input type="text" class="intextinput"/></label>
							<label class="doctorType"><input type="checkbox"  class="checkStyle">其他<input type="text" class="intextinput"/></label>
						</p>
					</label>
				</li>
				<li>
					<label>
						<p>
							<input name="yCod" type="checkbox"  >&nbsp;&nbsp;&nbsp;&nbsp;<input name="yCod" type="checkbox"  >&nbsp;&nbsp;&nbsp;&nbsp;
							<span>病人物品</span>
							<label class="doctorType"><input type="checkbox"  class="checkStyle">病历</label>
							<label class="doctorType"><input type="checkbox"  class="checkStyle">X线片<input type="text" class="intextinput"/>张</label>
							<label class="doctorType"><input type="checkbox"  class="checkStyle">CT片<input type="text" class="intextinput"/>张</label>
							<label class="doctorType"><input type="checkbox"  class="checkStyle">MRI片<input type="text" class="intextinput"/>张</label>
						</p>
					</label>
				</li>
				<li class="lifour"></li>
				<li>
					<label>
						<p style="text-indent:5em;">
							<label>其他<input type="text" class="intextinputlong3"/></label>
						</p>
					</label>
				</li>
				<li>
					<label>
						<span>复苏护士/手术护士<input type="text" class="intextinputlong"/></span>
						<span>病房护士<input type="text" class="intextinputlong"/></span>
						<span>时间<input class="Wdate spcWdate" type="text" readonly="readonly" style="width: 150px;" onclick="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm'})"></span>
						<br/>
					</label>
				</li>
				<li class="lifour"></li>
				<li>
					<label>
						<span>注：在<input type="checkbox"  class="checkStyle">内打勾以示已执行，有CVC置管请填写检测单。</span>
					</label>
				</li>
			</ul>
	</div>
</div>
<script type="text/javascript">
	$('.docuTitleBaisc').html('手术患者交接单');
	
	
var vm = avalon.define({
    $id: 'nczRecord',
    
    setRadio: function (obj, idx) {
			vm.sysdata[obj] = publicFun.radioClicks(vm.systemList[obj + 'List'],vm.sysdata[obj],idx)
    }
  })

  // function checkAb() {
  //   var lose = '';
  //   var arr = ['qrsjqszzbx', 'qrfbsjCod', 'ryzwclnctafhjzzys', 'ryzrsywkssyzys', 'crtusrname'];
  //   $.each(arr, function (idx, val) {
  //     if ($('#'+val).val() == '') {
  //       lose = val;
  //       return false
  //     }
  //   })
  //   return lose;
  // }


  function singlecheck(a, thisname) {
    $(a).click(function () {
      if ($(a).attr('checked')) {
        $(thisname).removeAttr('checked');
        $(a).attr('checked', 'checked');
      }
    });
  }

  $('input[name="sexCod"]').each(function(){
    singlecheck(this,'input[name="sexCod"]');
  });
  $('input[name="aCod"]').each(function(){
    singlecheck(this,'input[name="aCod"]');
  });
  $('input[name="bCod"]').each(function(){
    singlecheck(this,'input[name="bCod"]');
  });
  $('input[name="cCod"]').each(function(){
    singlecheck(this,'input[name="cCod"]');
  });
  $('input[name="dCod"]').each(function(){
    singlecheck(this,'input[name="dCod"]');
  });
  $('input[name="eCod"]').each(function(){
    singlecheck(this,'input[name="eCod"]');
  });
  $('input[name="fCod"]').each(function(){
    singlecheck(this,'input[name="fCod"]');
  });
  $('input[name="gCod"]').each(function(){
    singlecheck(this,'input[name="gCod"]');
  });
  $('input[name="hCod"]').each(function(){
    singlecheck(this,'input[name="hCod"]');
  });
  $('input[name="iCod"]').each(function(){
    singlecheck(this,'input[name="iCod"]');
  });
  $('input[name="jCod"]').each(function(){
    singlecheck(this,'input[name="jCod"]');
  });
  $('input[name="kCod"]').each(function(){
    singlecheck(this,'input[name="kCod"]');
  });
  $('input[name="lCod"]').each(function(){
    singlecheck(this,'input[name="lCod"]');
  });
  $('input[name="mCod"]').each(function(){
    singlecheck(this,'input[name="mCod"]');
  });
  $('input[name="nCod"]').each(function(){
    singlecheck(this,'input[name="nCod"]');
  });
  $('input[name="oCod"]').each(function(){
    singlecheck(this,'input[name="oCod"]');
  });
  $('input[name="pCod"]').each(function(){
    singlecheck(this,'input[name="pCod"]');
  });
  $('input[name="qCod"]').each(function(){
    singlecheck(this,'input[name="qCod"]');
  });
  $('input[name="rCod"]').each(function(){
    singlecheck(this,'input[name="rCod"]');
  });
  $('input[name="sCod"]').each(function(){
    singlecheck(this,'input[name="sCod"]');
  });
  $('input[name="tCod"]').each(function(){
    singlecheck(this,'input[name="tCod"]');
  });
  $('input[name="uCod"]').each(function(){
    singlecheck(this,'input[name="uCod"]');
  });
  $('input[name="vCod"]').each(function(){
    singlecheck(this,'input[name="vCod"]');
  });
  $('input[name="wCod"]').each(function(){
    singlecheck(this,'input[name="wCod"]');
  });
  $('input[name="xCod"]').each(function(){
    singlecheck(this,'input[name="xCod"]');
  });
  $('input[name="yCod"]').each(function(){
    singlecheck(this,'input[name="yCod"]');
  });
  $('input[name="zCod"]').each(function(){
    singlecheck(this,'input[name="zCod"]');
  });

  $('input[name="qrfbsjCodCheck"]').each(function(){
    singlecheck(this,'input[name="qrfbsjCodCheck"]');
  });

</script>
<script type="text/javascript">		
		$('#basicTitleMsg').css("display","block");	
	</script>
</div>