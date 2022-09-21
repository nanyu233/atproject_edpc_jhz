<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<div>
		  <div id="maininfo">
		   <table id="lineTab">
	            <tr>
		          <td colspan="10">
					<label class="firstlab paddR30">床号：<span id="bedNo"></span></label>
			        <label class="paddR30">姓名：<span id="custName"></span></label>
			        <label class="paddR30">性别：<span id="custSex"></span></label>
			        <label class="paddR30">年龄：<span id="custAge"></span></label>
			        <label class="lastlab">住院号：<span id="liveNo"></span></label></br>
				    <label class="firstlab">入院诊断：<span id="diagInfo"></span></label>
	              </td>
	            </tr>
	            <tr>
	            <td>
                <span>常见多重耐药菌:</span></br>
                 <label> <input type="checkbox">MRSA耐甲氧西林金黄色葡萄球菌</label>
		         <label> <input type="checkbox">CRE耐药青霉烯类抗菌药物肠杆菌科细菌</label></br>
		         <label> <input type="checkbox">VRE耐万古霉素肠球菌</label></br>
		         <label> <input type="checkbox">CR-AB耐碳青霉烯类抗菌药物鲍曼不动杆菌</label></br>
		         <label> <input type="checkbox">MDR_PA多重耐药铜绿假单胞菌</label>
               </td>	         
	          </tr>
	          <tr>
	            <td>
	             <span>隔离方式:</span></br>
                 <label> <input type="checkbox">接触隔离</label>
                 </td>
	          </tr>
	          <tr>
	            <td>
	             <span>消毒隔离措施:</span></br>
                 <label>1.及时开出接触隔离医嘱，尽量选择单间隔离，或者进行床边隔离；</label></br>
                 <label>2.在床头、病历、腕带上标贴接触隔离标志；</label></br>
                 <label>3.一般医疗器械如听诊器、血压计等应专人专用，不能专用的医疗器械，物品妹次使用后用500mg/L含氧消毒剂擦拭消毒，病人周围物、环境和医疗器械，须每天清洁消毒；</label></br>
                 <label>4.加强手卫生，医务人员对患者实施诊疗护理操作时，应将耐药菌患者或定植患者安排在最后进行。<br>接触该类患者的伤口、溃面、粘膜、血液、体液、引流液、分泌物、排泄物时，应当戴手套，必要时穿隔离衣，操作完后，及时脱去手套和隔离衣，并进行手卫生。</label></br>
                 <label>5.连续3个标本（每次间隔>24小时）均未培养出或感染已治愈无样可采，方可解除隔离。</label></br>
	          </td>
	          </tr>
              <tr>
                <td>
                 <label> 转出科室<input type="text"></label>
                 <label> 转出科室医生、护士<input type="text">、<input type="text"></label>
                 <label> 日期<input type="text"></label>
                 </td>
	          </tr>
	        </table>
	     </div>       
   </div>		