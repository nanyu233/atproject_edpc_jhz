<div id="s2015">
		<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
		<div>
			<!-- <p id="id_title1" class="hospitaltitle bigfont">${hospitalPlatformNameGap}</p> -->
			<jsp:include page="/WEB-INF/jsp/hzszyyhospital/printBasicInfo/printBasicInfo.jsp"></jsp:include>
			<p class="functype" id="id_title2">患者接受深静脉留置管自愿书</p>
			<div>
				<ul class="maintext">
					<li class="firstli">
						<p class="indenttwo">静脉输液是治疗、抢救病人的医疗手段，由于周围静脉管腔细血流量小，输入的药液速度慢，有些药物的
							疗效降低且不适应大量、长期输液的用药者。自 20 世纪初期以来，输液途径随着医学的发展由皮下输液进入
							表浅静脉滴注。1960 以后，深静脉穿刺留置管输液的方法已在临床上得到推广和应用，使病人减少穿刺，减
							轻痛苦，方便治疗。尽管优点很多，但临床还是存在一些并发症和危险性。如：
						</p>
						<p class="indentthree">1、可能发生气胸、皮下气肿等临床病变。</p>
						<p class="indentthree">2、有可能发生动脉刺伤、局部血肿。</p>
						<p class="indentthree">3、导管栓塞：有导管折断、心脏内成为栓子，造成动脉栓塞的可能性。</p>
						<p class="indentthree">4、空气栓塞：锁骨下、颈内有可能发生。</p>
						<p class="indentthree">5、血栓形成。</p>
						<p class="indentthree">6． 6、有可能发生并发感染及败血症。</p>
						<p class="indenttwo">如您有任何疑问，请您与护士、医生讨论及交流。</p>
						<p class="indenttwo sectiontitle">我已经全面了解留置管的危险性及并发症，同意接受治疗。</p>

					</li>
					<li class="firstli">
						<span>
							<label>病人家属或病人签名：</label>
							<span><input type="text" class="intextinputlong"/></span>
						</span>
						<span>
							<label>签名日期：</label>
							<input class="Wdate spcWdate" type="text" readonly="readonly" style="width: 130px;" onclick="WdatePicker({dateFmt:'yyyy/MM/dd HH:mm'})">
						</span>
					</li>
					<li class="firstli">
						<span>
							<label class="lthreefont">谈话医生签名：</label>
							<span><input type="text" class="intextinputlong"/></span>
						</span>
						<span>
							<label>签名日期：</label>
							<input class="Wdate spcWdate" type="text" readonly="readonly" style="width: 130px;" onclick="WdatePicker({dateFmt:'yyyy/MM/dd HH:mm'})">
						</span>
					</li>
				</ul>
			</div>
		</div>
		<script type="text/javascript">
		
		</script>
		</div>