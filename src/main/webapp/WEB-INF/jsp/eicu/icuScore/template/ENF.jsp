<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<div>
	   <div id="maininfo">
		   <table id="lineTab">
	            <tr>
		          <td colspan="9">
					<label class="firstlab paddR30">床号：<span id="bedNo"></span></label>
			        <label class="paddR30">姓名：<span id="custName"></span></label>
			        <label class="paddR30">性别：<span id="custSex"></span></label>
			        <label class="paddR30">年龄：<span id="custAge"></span></label>
			        <label class="lastlab">住院号：<span id="liveNo"></span></label></br>
				    <label class="firstlab">入院诊断：<span id="diagInfo"></span></label>
	              </td>
	            </tr>

			    <tr>
		          <td colspan="9">
			          <label class="wd30">NRS2002：<input type="text" class="putline" style="width: 70px">分</label>
			          <label class="wd30">AGI：<input type="text" class="putline" style="width: 70px">级</label>
			          <label class="wd30">NURTIC：<input type="text" class="putline" style="width: 70px">分</label>
		          </td>
		        </tr>
		        
		         <tr>
		           <td colspan="9">
		             <span class="span">供给途径;</span>
			         <label><input type="checkbox" name="gjtj" onclick="chkOne(this)">鼻胃管</label>
			         <label><input type="checkbox" name="gjtj" onclick="chkOne(this)">鼻肠管</label>
			         <label><input type="checkbox" name="gjtj" onclick="chkOne(this)">经口</label>
			         <label><input type="checkbox" name="gjtj" onclick="chkOne(this)">其它</label>
			         <input type="text" class="putline">
		          </td>
	           </tr>
	           
	            <tr>
		           <td colspan="9">
		             <span class="span">输注方式和速度;</span>
			         <label> <input type="checkbox">持续营养泵输入:初始
			         <input type="text" class="putline" style="width: 70px">ml/h;滴定式加量至
			         <input type="text" class="putline" style="width: 70px">ml/h，停4-6h/日</label>
			         </br>
	                 <div style="display: inline-block;visibility: hidden;">
	                 	<span class="span">输注方式和速度;</span>
	                 </div>
			         <label><input type="checkbox">弹丸式注射输入<input type="text" class="putline" style="width: 70px">ml/次;<input type="checkbox">温水冲管Q4H</label>
		          </td>
	           </tr>
	           
	           <tr>
		           <td colspan="9">
			         <div style="display: inline-block; float: left;">
				         <label><input type="checkbox">床头抬高30~45</label>
				         <label><input type="checkbox">管尖摄片，位置 <input type="text" class="putline"></label>
			         </div>
			         <div class="wd30" style="float: right;">
		        	 	<span>医师签名</span>
						<input placeholder="回车查询" class="userInput putline" type="text"/>
						<div class="signImgBox" style="display:none">
							<img src="javascript:;" title="" class="signPic">
						</div>
			         </div>
		          </td>
	          </tr>
	          
	          <tr>
		          <td colspan="2" >日期</td>
		          <td><input class="Wdate spcWdate"  type="text" style="width: 70px;" onclick="WdatePicker({dateFmt:'HH:mm'})"></td>
		          <td><input class="Wdate spcWdate"  type="text" style="width: 70px;" onclick="WdatePicker({dateFmt:'HH:mm'})"></td>
		          <td><input class="Wdate spcWdate"  type="text" style="width: 70px;" onclick="WdatePicker({dateFmt:'HH:mm'})"></td>
		          <td><input class="Wdate spcWdate"  type="text" style="width: 70px;" onclick="WdatePicker({dateFmt:'HH:mm'})"></td>
		          <td><input class="Wdate spcWdate"  type="text" style="width: 70px;" onclick="WdatePicker({dateFmt:'HH:mm'})"></td>
		          <td><input class="Wdate spcWdate"  type="text" style="width: 70px;" onclick="WdatePicker({dateFmt:'HH:mm'})"></td>
		          <td><input class="Wdate spcWdate"  type="text" style="width: 70px;" onclick="WdatePicker({dateFmt:'HH:mm'})"></td>
	          </tr>
	          <tr>
		          <td colspan="2">AGI分级</td>
		          <td><input type="text" class="putline" style="width:70px"></td>
		          <td><input type="text" class="putline" style="width:70px"></td>
		          <td><input type="text" class="putline" style="width:70px"></td>
		          <td><input type="text" class="putline" style="width:70px"></td>
		          <td><input type="text" class="putline" style="width:70px"></td>
		          <td><input type="text" class="putline" style="width:70px"></td>
		          <td><input type="text" class="putline" style="width:70px"></td>
	          </tr>
	          <tr>
		          <td rowspan="4" style="width:11%;"> 每日肠内营养制剂名称、总量(ml)</td>
		          <td rowspan="2" style="width:5%;">目标</td>
		          <td><input type="text" class="putline" style="width:70px"></td>
		          <td><input type="text" class="putline" style="width:70px"></td>
		          <td><input type="text" class="putline" style="width:70px"></td>
		          <td><input type="text" class="putline" style="width:70px"></td>
		          <td><input type="text" class="putline" style="width:70px"></td>
		          <td><input type="text" class="putline" style="width:70px"></td>
		          <td><input type="text" class="putline" style="width:70px"></td>
	          </tr>
	          <tr>
		          <td><input type="text" class="putline" style="width:70px"></td>
		          <td><input type="text" class="putline" style="width:70px"></td>
		          <td><input type="text" class="putline" style="width:70px"></td>
		          <td><input type="text" class="putline" style="width:70px"></td>
		          <td><input type="text" class="putline" style="width:70px"></td>
		          <td><input type="text" class="putline" style="width:70px"></td>
		          <td><input type="text" class="putline" style="width:70px"></td>
	          </tr>
	          <tr>
		          <td rowspan="2">实际</td>
		          <td><input type="text" class="putline" style="width:70px"></td>
		          <td><input type="text" class="putline" style="width:70px"></td>
		          <td><input type="text" class="putline" style="width:70px"></td>
		          <td><input type="text" class="putline" style="width:70px"></td>
		          <td><input type="text" class="putline" style="width:70px"></td>
		          <td><input type="text" class="putline" style="width:70px"></td>
		          <td><input type="text" class="putline" style="width:70px"></td>
	          </tr>
	          <tr>
	              <td><input type="text" class="putline" style="width:70px"></td>
	              <td><input type="text" class="putline" style="width:70px"></td>
		          <td><input type="text" class="putline" style="width:70px"></td>
		          <td><input type="text" class="putline" style="width:70px"></td>
		          <td><input type="text" class="putline" style="width:70px"></td>
		          <td><input type="text" class="putline" style="width:70px"></td>
		          <td><input type="text" class="putline" style="width:70px"></td>
	          </tr>
	          <tr>
		          <td rowspan="6" style="width:4%;">不耐受识别、处理</td>
		          <td style="width:12%;">胃储留(q6h)</td>
		          <td><input type="text" class="putline" style="width:70px"></td>
		          <td><input type="text" class="putline" style="width:70px"></td>
		          <td><input type="text" class="putline" style="width:70px"></td>
		          <td><input type="text" class="putline" style="width:70px"></td>
		          <td><input type="text" class="putline" style="width:70px"></td>
		          <td><input type="text" class="putline" style="width:70px"></td>
		          <td><input type="text" class="putline" style="width:70px"></td>
	          </tr>
	      
	          <tr>
		          <td>呕吐</td>
		          <td><input type="text" class="putline" style="width:70px"></td>
		          <td><input type="text" class="putline" style="width:70px"></td>
		          <td><input type="text" class="putline" style="width:70px"></td>
		          <td><input type="text" class="putline" style="width:70px"></td>
		          <td><input type="text" class="putline" style="width:70px"></td>
		          <td><input type="text" class="putline" style="width:70px"></td>
		          <td><input type="text" class="putline" style="width:70px"></td>
	          </tr>
	          <tr>
		          <td>腹胀(IAP)</td>
		          <td><input type="text" class="putline" style="width:70px"></td>
		          <td><input type="text" class="putline" style="width:70px"></td>
		          <td><input type="text" class="putline" style="width:70px"></td>
		          <td><input type="text" class="putline" style="width:70px"></td>
		          <td><input type="text" class="putline" style="width:70px"></td>
		          <td><input type="text" class="putline" style="width:70px"></td>
		          <td><input type="text" class="putline" style="width:70px"></td>
	          </tr>
	          <tr>
		          <td>腹泻</td>
		          <td><input type="text" class="putline" style="width:70px"></td>
		          <td><input type="text" class="putline" style="width:70px"></td>
		          <td><input type="text" class="putline" style="width:70px"></td>
		          <td><input type="text" class="putline" style="width:70px"></td>
		          <td><input type="text" class="putline" style="width:70px"></td>
		          <td><input type="text" class="putline" style="width:70px"></td>
		          <td><input type="text" class="putline" style="width:70px"></td>
	          </tr>
	          <tr>
		          <td>便秘</td>
		          <td><input type="text" class="putline" style="width:70px"></td>
		          <td><input type="text" class="putline" style="width:70px"></td>
		          <td><input type="text" class="putline" style="width:70px"></td>
		          <td><input type="text" class="putline" style="width:70px"></td>
		          <td><input type="text" class="putline" style="width:70px"></td>
		          <td><input type="text" class="putline" style="width:70px"></td>
		          <td><input type="text" class="putline" style="width:70px"></td>
	          </tr>
	          <tr>
		          <td>肠鸣声</td>
		          <td><input type="text" class="putline" style="width:70px"></td>
		          <td><input type="text" class="putline" style="width:70px"></td>
		          <td><input type="text" class="putline" style="width:70px"></td>
		          <td><input type="text" class="putline" style="width:70px"></td>
		          <td><input type="text" class="putline" style="width:70px"></td>
		          <td><input type="text" class="putline" style="width:70px"></td>
		          <td><input type="text" class="putline" style="width:70px"></td>
	          </tr>
	          <tr>
		          <td colspan="2">其它</td>
		          <td><input type="text" class="putline" style="width:70px"></td>
		          <td><input type="text" class="putline" style="width:70px"></td>
		          <td><input type="text" class="putline" style="width:70px"></td>
		          <td><input type="text" class="putline" style="width:70px"></td>
		          <td><input type="text" class="putline" style="width:70px"></td>
		          <td><input type="text" class="putline" style="width:70px"></td>
		          <td><input type="text" class="putline" style="width:70px"></td>
	          </tr>
	          <tr>
		          <td colspan="2">护士签名</td>
		          <td><input placeholder="回车查询" class="userInput putline" type="text" style="width:70px;"/>
					<div class="signImgBox" style="display:none;">
						<img src="javascript:;" title="" class="signPic">
					</div>
				  </td>
		          <td><input placeholder="回车查询" class="userInput putline" type="text" style="width:70px;"/>
					<div class="signImgBox" style="display:none">
						<img src="javascript:;" title="" class="signPic">
					</div>
				  </td>
				  <td><input placeholder="回车查询" class="userInput putline" type="text" style="width:70px;"/>
					<div class="signImgBox" style="display:none">
						<img src="javascript:;" title="" class="signPic">
					</div>
				  </td>
		         <td><input placeholder="回车查询" class="userInput putline" type="text" style="width:70px;"/>
					<div class="signImgBox" style="display:none">
						<img src="javascript:;" title="" class="signPic">
					</div>
				  </td>
		         <td><input placeholder="回车查询" class="userInput putline" type="text" style="width:70px;"/>
					<div class="signImgBox" style="display:none">
						<img src="javascript:;" title="" class="signPic">
					</div>
				  </td>
		         <td><input placeholder="回车查询" class="userInput putline" type="text" style="width:70px;"/>
					<div class="signImgBox" style="display:none">
						<img src="javascript:;" title="" class="signPic">
					</div>
				  </td>
		         <td><input placeholder="回车查询" class="userInput putline" type="text" style="width:70px;"/>
					<div class="signImgBox" style="display:none">
						<img src="javascript:;" title="" class="signPic">
					</div>
				  </td>
	          </tr>
	          <tr>
	             <td colspan="9">
						<span>备注:R瑞能;B百普力;N能全力;k康全力;M米汤;Y匀浆;Q其他;</span>
			      </td>
			  </tr>
			  <tr>
			     <td colspan="9">
				    <div class="trunright">
				    	<span>医师签名：</span> 
						<input placeholder="回车查询" class="userInput putline" type="text"/>
						<div class="signImgBox" style="display:none">
							<img src="javascript:;" title="" class="signPic">
						</div>
				    </div>
				  </td>  
			   </tr>
		   </table>
		  
		</div>
	</div>
<script type="text/javascript">
	function chkOne(e){
		var type = $(e).attr("type");
		var name = $(e).attr("name");
		var value = $(e).attr("value");
		$('input[type=checkbox][name="' + name + '"]').not(e).attr("checked", false);
	}
</script>
