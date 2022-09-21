package activetech.hospital.action;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import activetech.base.pojo.domain.Dstappoption;
import activetech.base.pojo.dto.DstcompctlCustom;
import activetech.base.pojo.dto.DstcompctlQueryDto;
import activetech.base.pojo.dto.PageQuery;
import activetech.base.process.context.Config;
import activetech.base.process.result.DataGridResultInfo;
import activetech.base.process.result.ResultInfo;
import activetech.base.process.result.ResultUtil;
import activetech.base.process.result.SubmitResultInfo;
import activetech.base.service.CompctlService;
import activetech.base.service.SystemConfigService;
import activetech.basehems.service.BaseHspemgInfService;
import activetech.hospital.pojo.dto.HspsqlinfCustom;
import activetech.hospital.pojo.dto.HspsqlinfQueryDto;
import activetech.hospital.service.HspemginfService;
import activetech.hospital.service.HspsqlinfService;
import activetech.util.StringUtils;

/**
 * 
 * <p>Title:SqlAction</p>
 * <p>Description:转归功能</p>
 * <p>activetech</p>
 * @author liulj
 * @date 2017年2月17日 上午10:36:43
 *
 */
@Controller
@RequestMapping("/sql")
public class SqlAction {
	@Autowired
	private HspsqlinfService hspsqlinfService;
	@Autowired
	private HspemginfService hspemginfService;
	@Autowired
	private SystemConfigService systemConfigService;
	@Autowired
	private CompctlService compctlService;
	@Autowired
	private BaseHspemgInfService baseHspemgInfService;

  /**
   * 转归查询列表
   * @param dstuserQueryDto
   * @param page
   * @param rows
   * @return
   * @throws Exception
   */
  @RequestMapping("/querysql_result")
  public @ResponseBody DataGridResultInfo querysql_result(
		    HspsqlinfQueryDto hspsqlinfQueryDto,
			String emgSeq
			) throws Exception{
		//非空校验
	    hspsqlinfQueryDto = hspsqlinfQueryDto!=null?hspsqlinfQueryDto:new HspsqlinfQueryDto();
	  	if(!StringUtils.isNotNullAndEmptyByTrim(emgSeq)){
	  	    //抛出异常
	  		ResultUtil.throwExcepion(ResultUtil.createFail(Config.MESSAGE, 911, new Object[] { "预检号" }));
	  	}
	  	//赋值查询条件emgseq(预检号）
	    if(hspsqlinfQueryDto.getHspsqlinfCustom()!=null){
	    	hspsqlinfQueryDto.getHspsqlinfCustom().setEmgSeq(emgSeq);
		}else{
			HspsqlinfCustom hspsql=new HspsqlinfCustom();
			hspsql.setEmgSeq(emgSeq);
			hspsqlinfQueryDto.setHspsqlinfCustom(hspsql);	
		}
	    //查询列表的总数
		List<HspsqlinfCustom> list=hspsqlinfService.findHspsqlinfList(hspsqlinfQueryDto);
		DataGridResultInfo dataGridResultInfo = new DataGridResultInfo();
		//填充rows
		dataGridResultInfo.setRows(list);
		return dataGridResultInfo;
	}
	
	  @RequestMapping("/querydep_result")
	  public @ResponseBody DataGridResultInfo querydep_result(
			  DstcompctlQueryDto dstcompctlQueryDto,
				int page,//当前页码
				int rows//每页显示个数
				) throws Exception{
			//非空校验
		  	dstcompctlQueryDto = dstcompctlQueryDto!=null?dstcompctlQueryDto:new DstcompctlQueryDto();
		  	DstcompctlCustom dstcompctlCustom = dstcompctlQueryDto.getDstcompctlCustom();
		  	dstcompctlCustom = dstcompctlCustom!=null?dstcompctlCustom:new DstcompctlCustom();

		  	Dstappoption appoption = systemConfigService.findAppoptionByOptkey("TOP_COMNO");
		  	dstcompctlCustom.setComman(appoption.getOptvalue());
		  	dstcompctlQueryDto.setDstcompctlCustom(dstcompctlCustom);
		    //查询列表的总数
			int total =compctlService.selectCompctlCount(dstcompctlQueryDto);
			PageQuery pageQuery = new PageQuery();
			pageQuery.setPageParams(total, rows, page);
			dstcompctlQueryDto.setPageQuery(pageQuery);
			List<DstcompctlCustom> list=compctlService.selectCompctl(dstcompctlQueryDto);
			
			DataGridResultInfo dataGridResultInfo = new DataGridResultInfo();
			//填充total
			dataGridResultInfo.setTotal(total);
			//填充rows
			dataGridResultInfo.setRows(list);
			return dataGridResultInfo;
		}
	  
}
