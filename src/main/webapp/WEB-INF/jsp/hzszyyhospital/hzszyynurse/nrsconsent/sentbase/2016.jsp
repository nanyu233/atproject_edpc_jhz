<div id="s2016">
		<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
		<div>
			<!-- <p id="id_title1" class="hospitaltitle bigfont">${hospitalPlatformNameGap}</p> -->
			<jsp:include page="/WEB-INF/jsp/hzszyyhospital/printBasicInfo/printBasicInfo.jsp"></jsp:include>
			<p class="functype" id="id_title2">外出检查知情同意书</p>
			<div>
				<ul class="maintext">
					<li >
						<span>
							<label>患者姓名：</label>
							<input type="text" class="intextinputlong" value="${hspemginfCustom.cstNam}">
						</span>
						<span>
							<label>性别：</label>
							<input type="text" class="intextinputlong" value="${hspemginfCustom.cstSexCod}">
						</span>
						<span>
							<label>年龄：</label>
							<input type="text" class="intextinputlong" id="cstage"/>
						</span>
					</li>
					<li >
						<label>因病情需要外出行<input type="text" class="intextinputlong"/>检查。外出检查期间可能出现如下风险：</label>
						<label class="mainreport indenttwo">
							<p>1、静脉管路、气管插管、导尿管、胃管等各种管路脱落，造成出血、栓塞等风险。</p>
							<p>2、途中病情变化。</p>
							<p>3、心跳呼吸骤停。</p>
							<p>4、其他不可预计的风险。</p>
						</label>
					</li>
					<li class="firstli">
						<label class="indenttwo">上述情况告知患者或患者家属，表示理解，同意外出检查，患者（或家属）签名：<input type="text" class="intextinputlong"/></label>
					</li>
					<li class="trunright">
						<label>谈话医生：</label>
						<span><input type="text" class="intextinputlong"/></span>
					</li>
					<li class="trunright">
						<label>签名时间：</label>
						<input class="Wdate spcWdate" type="text" readonly="readonly" style="width: 130px;" onclick="WdatePicker({dateFmt:'yyyy/MM/dd HH:mm'})">
					</li>
				</ul>
			</div>
		</div>
		<script type="text/javascript">
			$(function(){
				if('${hspemginfCustom.cstAge}' != ''){
					$('#cstage').val("${hspemginfCustom.cstAge}${hspemginfCustom.cstAgeCod}");
				}
			})
		</script>
		</div>