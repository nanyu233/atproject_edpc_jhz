<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<div>

			   <label>表1.NRS2002初筛表：</label>
			   <table style="border: 0px solid black;"> 
			       <tr>
			          <td style="width:50%;">
			               <label><input type="checkbox">体质指数(BMI)</label>
			          </td>
			          <td rowspan="4">
			               <label>
						                【注】如果任何一个问题的答案为"是"，则按表2进行最后筛选；
						                如果所有的问题的答案均为"否"，每隔一周进行筛查。如果患者被安排又大手术，
						                则要考虑预防性的营养治疗计划以避免大手术所伴随的风险。
			               </label>
			          </td>
			       </tr>
			        <tr>
			          <td>
			          	<label> <input type="checkbox">最近三个月内患者体重有丢失吗？</label>
			          </td>
			         
			       </tr>
			        <tr>
			          <td>
			          <label> <input type="checkbox">最近一个星期内患者的膳食摄入有减少吗？</label>
			          </td>
			       </tr>
			        <tr>
			          <td>
			            <label> <input type="checkbox">患者的病情严重吗？(如：在重症监护区)</label>
			          </td>

			       </tr>
			   </table>             

	           <label>表2.NRS2002最终筛查表：</label>
		         <table style="border: 1px solid black;">
		         <tr>
			         <td colspan="3" style="width:45%;">营养状况</td>
			         <td colspan="3">疾病严重程度</td>
	             </tr>
		         <tr>
			         <td>无</td>
			         <td >正常营养状况</td>
			         <td><input type="checkbox"></td>
			         <td>无</td>
			         <td></td>
			         <td><input type="checkbox"></td>
	             </tr>
		         <tr style="height:40px;border: 1px solid black;" >
			         <td>轻度</td>
			         <td >三个月内体重丢失15%;或前一周的食物摄入量低于正常食物需求的50%~75%</td>
			         <td><input type="checkbox"></td>
			         <td>轻度</td>
			         <td>三个月内体重丢失15%;或前一周的食物摄入量低于正常食物需求的50%~75%</td>
			         <td><input type="checkbox"></td>
		         </tr>
		         <tr style="height:60px;border: 1px solid black;">
			         <td>中度</td>
			         <td >二个月内体重丢失大于5%;或者体重指数在XX~20.5之间,且基本营养状况差；或前一周的食物摄入量位正常食物需求量的0%-25%或者蛋白质<30g/L</td>
			         <td><input type="checkbox"></td>
			         <td>中度</td>
			         <td>腹部大手术、卒中、重症肺炎、血液系;恶心肿瘤</td>
			         <td><input type="checkbox"></td>
			     </tr>    
		         <tr style="height:80px;border: 1px solid black;">
			         <td>严重</td>
			         <td style="width:42%;">一个月内体重丢失大于5%(三个月内大于15%)或者体重指数小于18.5且基本营养状况差,或前一周的食物摄入量位正常食物需求量的0~25%或者蛋白质<30g/L</td>
			         <td><input type="checkbox"></td>
			         <td>严重</td>
			         <td>头部损伤、骨髓移植、</td>
			         <td><input type="checkbox"></td>
		         </tr>
		         </table>
	         <label>【注】 分数大于等于3;说明患者存在营养风险,需要营养支持;分数<3;患者需要每周重测,如果患者安排有重大要考虑预防性的营养支持以避免联合风险状况。</label>

	        

	         <label>表3.AGI评分</label>
	         <table style="border: 1px solid black;">
	         <tr><td>分级</td><td>特点</td><td>临床表现</td></tr>
	         <tr><td><input type="checkbox">Ⅰ级</td>
	         <td>胃肠道症状发生在机体经历一个打击(如手术、休克等)之后,具体暂时性和自限性的特点。</td>
	         <td>a.恶心、呕吐；b.肠鸣音减弱或消失；c.大便次数减少</td>
	         </tr>
	         <tr><td><input type="checkbox">Ⅱ级</td>
	         <td>胃肠道症状发生在机体经历一个打击(如手术、休克)之后,具体暂时性和自限性的特点。</td>
             <td>a.胃轻瘫伴大量胃潴留或返流(4h胃残余超过150ml)；b.腹泻；c.下消化道麻痹；d.腹内压</td>
             </tr>
	         <tr><td><input type="checkbox">Ⅲ级</td>
	         <td>给予干预处理后，胃肠功能仍不能恢复，整体状况没有改善，导致MODS进行性恶化。</td>
	         <td>a.持续喂养不耐烦；b.大量胃潴留(4h胃残余量超过300ml)</td>
	         </tr>
	         <tr><td><input type="checkbox">Ⅳ级</td>
	         <td>患者一般状况急剧恶化，伴远隔器官功能障碍。</td>
	         <td>a.肠道缺血坏死；b.导致失血性休克的胃肠道出血；c.Ogilvies综合征；d.学要积极减压的腹kong'jiangezhz
	         </td>
	         </tr>
	         </table>

	         <label>表4.NURITC评分</label>
	         <table style="width:45%;">
	          <tr  style="width:20%;"><td>AGE</td>
	          <td  style="width:15%;"></td><td  style="width:15%;"></td></tr>
	          <tr><td style="width:20%;">APACHE Ⅱ</td>
	          <td style="width:15%;"></td><td style="width:15%;"></td></tr>
	          <tr><td style="width:20%;">SOFA</td>
	          <td style="width:15%;"></td><td style="width:15%;"></td></tr>
	          <tr><td style="width:20%;">器官衰竭个数</td>
	          <td style="width:15%;"></td><td style="width:15%;"></td></tr> 
	          <tr><td style="width:20%;">入ICU前住院天数</td>
	          <td style="width:15%;"></td><td style="width:15%;"></td></tr>      
	         </table>
   </div>		