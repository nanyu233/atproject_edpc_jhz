package activetech.zyyhospital.service.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.fasterxml.jackson.databind.JavaType;

import activetech.base.pojo.dto.ActiveUser;
import activetech.util.DateUtil;
import activetech.util.JacksonUtil;
import activetech.util.StringUtils;
import activetech.util.UUIDBuild;
import activetech.zyyhospital.dao.mapper.HspCerebralCourseCustomMapper;
import activetech.zyyhospital.dao.mapper.HspCerebralCourseMapper;
import activetech.zyyhospital.dao.mapper.HspCerebralSheetCustomMapper;
import activetech.zyyhospital.dao.mapper.HspCerebralSheetMapper;
import activetech.zyyhospital.dao.mapper.HspNihssInfCustomMapper;
import activetech.zyyhospital.dao.mapper.HspNihssInfMapper;
import activetech.zyyhospital.pojo.domain.HspCerebralCourse;
import activetech.zyyhospital.pojo.domain.HspCerebralSheet;
import activetech.zyyhospital.pojo.domain.HspCerebralSheetExample;
import activetech.zyyhospital.pojo.domain.HspCerebralSheetKey;
import activetech.zyyhospital.pojo.domain.HspNihssInf;
import activetech.zyyhospital.pojo.dto.HspCerebralCourseCustom;
import activetech.zyyhospital.pojo.dto.HspCerebralQueryDto;
import activetech.zyyhospital.pojo.dto.HspCerebralSheetCustom;
import activetech.zyyhospital.pojo.dto.HspNihssInfCustom;
import activetech.zyyhospital.service.HspCerebralService;

public class HspCerebralServiceImpl implements HspCerebralService {
	@Autowired
	private HspCerebralCourseMapper hspCerebralCourseMapper;
	@Autowired
	private HspCerebralCourseCustomMapper hspCerebralCourseCustomMapper;
	@Autowired
	private HspCerebralSheetMapper hspCerebralSheetMapper;
	@Autowired
	private HspNihssInfMapper hspNihssInfMapper;
	@Autowired
	private HspCerebralSheetCustomMapper hspCerebralSheetCustomMapper;
	@Autowired
	private HspNihssInfCustomMapper hspNihssInfCustomMapper;

	@Override
	public void submitCerebralCourse(HspCerebralQueryDto hspCerebralQueryDto,
			ActiveUser activeUser) throws Exception {
		HspCerebralCourseCustom hspCerebralCourseCustom=hspCerebralQueryDto.getHspCerebralCourseCustom();
		HspNihssInfCustom hspNihssInfCustom=hspCerebralQueryDto.getHspNihssInfCustom();
		String emgSeqDc=hspCerebralCourseCustom.getEmgSeqDc();
		if(hspCerebralCourseCustom!=null){
			String cerebralCourseSeq=hspCerebralCourseCustom.getCerebralCourseSeq();
			if(StringUtils.isNotNullAndEmptyByTrim(cerebralCourseSeq)){
				HspCerebralCourse hspCerebralCourse=hspCerebralCourseMapper.selectByPrimaryKey(cerebralCourseSeq);
				hspCerebralCourseCustom.setCreateDate(hspCerebralCourse.getCreateDate());
				hspCerebralCourseCustom.setCreateDoc(hspCerebralCourse.getCreateDoc());
				hspCerebralCourseCustom.setUpdateDate(new Date());
				hspCerebralCourseCustom.setUpdateDoc(activeUser.getUsrno());
				hspCerebralCourseMapper.updateByPrimaryKey(hspCerebralCourseCustom);
			}else{
				cerebralCourseSeq=UUIDBuild.getUUID();
				hspCerebralCourseCustom.setCerebralCourseSeq(cerebralCourseSeq);
				hspCerebralCourseCustom.setCreateDate(new Date());
				hspCerebralCourseCustom.setCreateDoc(activeUser.getUsrno());
				hspCerebralCourseMapper.insert(hspCerebralCourseCustom);
			}
			HspNihssInf hspNihssInf=hspNihssInfMapper.selectByPrimaryKey(cerebralCourseSeq);
			if(hspNihssInfCustom!=null){
				if(hspNihssInf!=null){
					hspNihssInf.setNihssContent(hspNihssInfCustom.getNihssContent());
					hspNihssInf.setAssessDoc(hspNihssInfCustom.getAssessDoc());
					hspNihssInf.setAssessDate(hspNihssInfCustom.getAssessDate());
					hspNihssInf.setUpdateDate(new Date());
					hspNihssInf.setUpdateDoc(activeUser.getUsrno());
					hspNihssInf.setCreateNam(hspNihssInfCustom.getCreateNam());
					hspNihssInfMapper.updateByPrimaryKey(hspNihssInf);
				}else{
					hspNihssInfCustom.setCerebralCourseSeq(cerebralCourseSeq);
					hspNihssInfCustom.setEmgSeqDc(emgSeqDc);
					hspNihssInfCustom.setCreateDate(new Date());
					hspNihssInfCustom.setCreateDoc(activeUser.getUsrno());
					hspNihssInfMapper.insert(hspNihssInfCustom);
				}
			}
			
			//解析json对象数组字符串
			String jsonList=hspCerebralQueryDto.getJsonList();
			JavaType javaType = JacksonUtil.getCollectionType(ArrayList.class, HspCerebralSheetCustom.class);
			List<HspCerebralSheetCustom> sheetList=JacksonUtil.json2Obj(jsonList, javaType);
			if(sheetList!=null){
				for (int i = 0; i < sheetList.size(); i++) {
					HspCerebralSheetCustom insertSheet=sheetList.get(i);
					insertSheet.setAssessDoc(hspCerebralQueryDto.getSheetAssessDoc());
					insertSheet.setAssessDate(hspCerebralQueryDto.getSheetAssessDate());
					if(StringUtils.isNotNullAndEmptyByTrim(insertSheet.getCerebralDateStr())){
						Date cerebralDate=DateUtil.parseDate(insertSheet.getCerebralDateStr(), "yyyy/MM/dd HH:mm:ss");
						insertSheet.setCerebralDate(cerebralDate);
					}
					
					HspCerebralSheetKey hspCerebralSheetKey=new HspCerebralSheetKey();
					hspCerebralSheetKey.setCerebralCourseSeq(cerebralCourseSeq);
					hspCerebralSheetKey.setTimeType(insertSheet.getTimeType());
					HspCerebralSheet checkSheet=hspCerebralSheetMapper.selectByPrimaryKey(hspCerebralSheetKey);
					if(checkSheet!=null){
						checkSheet.setCerebralDate(insertSheet.getCerebralDate());
						checkSheet.setHeartRate(insertSheet.getHeartRate());
						checkSheet.setPressureUp(insertSheet.getPressureUp());
						checkSheet.setPressureDown(insertSheet.getPressureDown());
						checkSheet.setOxyNbr(insertSheet.getOxyNbr());
						checkSheet.setNihssScore(insertSheet.getNihssScore());
						checkSheet.setAssessDate(insertSheet.getAssessDate());
						checkSheet.setAssessDoc(insertSheet.getAssessDoc());
						checkSheet.setUpdateDate(new Date());
						checkSheet.setUpdateDoc(activeUser.getUsrno());
						checkSheet.setRelationDoc(insertSheet.getRelationDoc());
						checkSheet.setRelationDocnam(insertSheet.getRelationDocnam());
						hspCerebralSheetMapper.updateByPrimaryKey(checkSheet);
					}else{
						//判断时间||心率||氧饱和度||血压||nihss评分 任何一项不为空 则插入
						if(StringUtils.isNotNullAndEmptyByTrim(insertSheet.getCerebralDateStr())
								||insertSheet.getHeartRate()!=null
								||insertSheet.getOxyNbr()!=null
								||insertSheet.getPressureDown()!=null
								||insertSheet.getPressureUp()!=null
								||insertSheet.getNihssScore()!=null){
							insertSheet.setCerebralCourseSeq(cerebralCourseSeq);
							insertSheet.setEmgSeqDc(emgSeqDc);
							insertSheet.setCreateDate(new Date());
							insertSheet.setCreateDoc(activeUser.getUsrno());
							hspCerebralSheetMapper.insert(insertSheet);
						}
					}
					
				}
			}
		}

	}

	@Override
	public void delCerebralCourse(String cerebralCourseSeq) throws Exception {
		if(StringUtils.isNotNullAndEmptyByTrim(cerebralCourseSeq)){
			hspCerebralCourseMapper.deleteByPrimaryKey(cerebralCourseSeq);
			hspNihssInfMapper.deleteByPrimaryKey(cerebralCourseSeq);
			HspCerebralSheetExample hspCerebralSheetExample=new HspCerebralSheetExample();
			HspCerebralSheetExample.Criteria  criteria=hspCerebralSheetExample.createCriteria();
			criteria.andCerebralCourseSeqEqualTo(cerebralCourseSeq);
			hspCerebralSheetMapper.deleteByExample(hspCerebralSheetExample);
			
		}
	}

	@Override
	public HspCerebralQueryDto findCerebralCourseById(String emgSeq) throws Exception {
		HspCerebralQueryDto hspCerebralQueryDto=new HspCerebralQueryDto();
		HspCerebralCourseCustom hspCerebralCourseCustom=hspCerebralCourseCustomMapper.getCerebralCourseByEmgSeq(emgSeq);
		HspNihssInfCustom hspNihssInfCustom=hspNihssInfCustomMapper.findNihssInfByEmgSeq(emgSeq);
		
		HspCerebralSheetCustom hspCerebralSheetCustom=new HspCerebralSheetCustom();
		hspCerebralSheetCustom.setEmgSeqDc(emgSeq);
		List<HspCerebralSheetCustom> sheetList=hspCerebralSheetCustomMapper.findSheetBySeq(hspCerebralSheetCustom);
		if(sheetList.size()>0){
			hspCerebralQueryDto.setSheetAssessDate(sheetList.get(0).getAssessDate());
			hspCerebralQueryDto.setSheetAssessDoc(sheetList.get(0).getAssessDoc());
			hspCerebralQueryDto.setSheetAssessDocNam(sheetList.get(0).getSheetAssessDocNam());
		}
		hspCerebralQueryDto.setHspCerebralCourseCustom(hspCerebralCourseCustom);
		hspCerebralQueryDto.setHspNihssInfCustom(hspNihssInfCustom);
		hspCerebralQueryDto.setSheetList(sheetList);
		return hspCerebralQueryDto;
	}

	@Override
	public int getCerebralCourseCountByEmgSeq(
			HspCerebralQueryDto hspCerebralQueryDto) throws Exception {
		return hspCerebralCourseCustomMapper.getCerebralCourseCountByEmgSeq(hspCerebralQueryDto);
	}

	@Override
	public List<HspCerebralCourseCustom> findCerebralCourseListByEmgSeq(
			HspCerebralQueryDto hspCerebralQueryDto) throws Exception {
		return hspCerebralCourseCustomMapper.findCerebralCourseListByEmgSeq(hspCerebralQueryDto);
	}

	@Override
	public HspCerebralCourseCustom findCerebralCourseByEmgSeq(String emgSeq)
			throws Exception {
		return hspCerebralCourseCustomMapper.getCerebralCourseByEmgSeq(emgSeq);
	}

}
