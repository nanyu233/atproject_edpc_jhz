package activetech.zyyhospital.action;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;


import activetech.base.pojo.domain.Dstdictinfo;
import activetech.base.service.SystemConfigService;
import activetech.structtext.dao.mapper.DstcasesCustomMapper;
import activetech.structtext.pojo.domain.Dstcases;
import activetech.structtext.pojo.domain.Dsttemplate;
import activetech.structtext.pojo.dto.DstcasesCustom;
import activetech.structtext.pojo.dto.DstcasesQueryDto;
import activetech.structtext.service.StructTextService;
import activetech.util.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import activetech.base.pojo.dto.ActiveUser;
import activetech.base.pojo.dto.PageQuery;
import activetech.base.process.context.Config;
import activetech.base.process.result.DataGridResultInfo;
import activetech.base.process.result.ResultInfo;
import activetech.base.process.result.ResultUtil;
import activetech.base.process.result.SubmitResultInfo;
import activetech.hospital.pojo.dto.HspemginfCustom;
import activetech.zyyhospital.pojo.domain.HspConsentInfWithBLOBs;
import activetech.zyyhospital.pojo.dto.HspConsentInfCustom;
import activetech.zyyhospital.pojo.dto.HspConsentInfCustomDto;
import activetech.zyyhospital.pojo.dto.HspConsentTempCustom;
import activetech.zyyhospital.pojo.dto.HspConsentTempCustomDto;
import activetech.zyyhospital.service.ZyyConsentService;
import activetech.zyyhospital.service.ZyyHspemginfService;
import activetech.structtext.dao.mapper.DstcasesMapper;
import activetech.structtext.pojo.domain.DstcasesExample;

/**
 * <p>
 * Title:ZyyConsentAction
 * </p>
 * <p>
 * Description:知情同意书
 * </p>
 * <p>
 * activetech
 * </p>
 *
 * @author sq
 * @date 2018年1月30日
 */
@Controller
@RequestMapping("/zyyconsent")
public class ZyyConsentAction {
    @Autowired
    private ZyyConsentService zyyConsentService;
    @Autowired
    private ZyyHspemginfService zyyHspemginfService;
    @Autowired
    private StructTextService structTextService;
    @Autowired
    private SystemConfigService systemConfigService;

    //liulijun 代码

    /**
     * 跳转知情同意书列表
     *
     * @param model
     * @param refseqno(病人序号)
     * @return
     * @throws Exception
     * @author liulj @date 2018年2月1日 下午1:48:29
     */
    @RequestMapping("/queryConsentInf")
    public String queryConsentInf(Model model, String refseqno, String cstNam, String tempCode) throws Exception {
        model.addAttribute("refseqno", refseqno);
        model.addAttribute("cstNam", cstNam);
        model.addAttribute("tempCode", tempCode);
        return "/hzszyyhospital/hzszyydoctor/consent/queryzqtys";
    }

    @RequestMapping("/queryConsentInf_Result")
    public @ResponseBody DataGridResultInfo queryConsentInf_Result(HspConsentInfCustomDto hspConsentInfCustomDto,
                                                                   int page,//当前页码
                                                                   int rows,//每页显示个数
                                                                   String sort,
                                                                   String order) throws Exception {
        //非空检验
        hspConsentInfCustomDto = hspConsentInfCustomDto != null ? hspConsentInfCustomDto : new HspConsentInfCustomDto();
        String patientId = hspConsentInfCustomDto.getHspConsentInfCustom().getRefseqno();
        DstcasesQueryDto dstcasesQueryDto = new DstcasesQueryDto();
        dstcasesQueryDto.setPatientId(patientId);
        List<DstcasesCustom> dstcasesCustoms = structTextService.queryDstcasesInfo(dstcasesQueryDto);
        int total = dstcasesCustoms.size();
        PageQuery pageQuery = new PageQuery();
        pageQuery.setPageParams(total, rows, page);
        hspConsentInfCustomDto.setPageQuery(pageQuery);
        DataGridResultInfo dataGridResultInfo = new DataGridResultInfo();
        //填充total
        dataGridResultInfo.setTotal(total);
        //填充rows
        dataGridResultInfo.setRows(dstcasesCustoms);
        return dataGridResultInfo;
    }


    /**
     * 跳转知情同意书页面
     * //todo 现已替换为编辑器页面 已废弃待删除
     *
     * @param model
     * @param refseqno
     * @return
     * @throws Exception
     * @author liulj @date 2018年2月1日 下午2:19:53
     */
    @RequestMapping("/ConsentInf")
    public String ConsentInf(Model model, String seqno) throws Exception {
        HspConsentInfWithBLOBs hspConsentInf = zyyConsentService.findHspConsentInfBySeqno(seqno);
        model.addAttribute("seqno", seqno);
        model.addAttribute("tempno", hspConsentInf.getTempno());
        model.addAttribute("tempname", hspConsentInf.getTempname());
        model.addAttribute("refseqno", hspConsentInf.getRefseqno());
        model.addAttribute("texthtml", hspConsentInf.getTexthtml());
        model.addAttribute("qmHash", hspConsentInf.getQmHash());
        model.addAttribute("qmTag", hspConsentInf.getQmTag());
        model.addAttribute("cratNbr", hspConsentInf.getCrtusrno());
        return "/hzszyyhospital/hzszyydoctor/consent/ConsentInfBase";
    }

    /**
     * 根据emgSeq查询病人信息
     *
     * @param response
     * @return
     * @throws Exception
     * @author liulj @date 2018年2月1日 下午2:33:37
     */
    @RequestMapping("/findHspemginfCustombyAjax")
    public @ResponseBody SubmitResultInfo findHspemginfCustombyAjax(HttpServletResponse response, String emgSeq) throws Exception {
        ResultInfo resultInfo = ResultUtil.createSuccess(Config.MESSAGE, 906, null);
        //获去知情同意书
        HspemginfCustom hspemginfCustom = zyyHspemginfService.findHspemginfByemgSeq(emgSeq);
        ;
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("hspemginfCustom", hspemginfCustom);
        resultInfo.setSysdata(map);
        return ResultUtil.createSubmitResult(resultInfo);
    }


    /**
     * 知情同意书保存提交
     * //todo 现已替换为编辑器页面 已废弃待删除
     *
     * @param hspConsentInfCustomdto
     * @param activeuser
     * @return
     * @throws Exception
     * @author liulj @date 2018年2月6日 上午10:00:44
     */
    @RequestMapping("/addConsentInfSubmit")
    public @ResponseBody SubmitResultInfo addConsentInfSubmit(HspConsentInfCustomDto hspConsentInfCustomdto, ActiveUser activeuser) throws Exception {
        ResultInfo resultInfo = ResultUtil.createSuccess(Config.MESSAGE, 906, null);
        hspConsentInfCustomdto.setHspConsentInfCustom(hspConsentInfCustomdto.getHspConsentInfCustom() != null ? hspConsentInfCustomdto.getHspConsentInfCustom() : new HspConsentInfCustom());
        //保存知情同意书
        HspConsentInfCustom hspConsentInfCustom = zyyConsentService.updateHspConsentInfBySeqno(hspConsentInfCustomdto.getHspConsentInfCustom(), activeuser);
        resultInfo.setMessage(hspConsentInfCustom.getSeqno());
        return ResultUtil.createSubmitResult(resultInfo);
    }

    /**
     * 根据caseSeq删除知情同意书
     *
     * @param seqno
     * @return
     * @throws Exception
     * @author liulj @date 2018年2月6日 上午10:07:16
     */
    @RequestMapping("/delConsentInfBySeqnoSubmit")
    public @ResponseBody SubmitResultInfo delConsentInfBySeqnoSubmit(String caseSeq) throws Exception {
        ResultInfo resultInfo = ResultUtil.createSuccess(Config.MESSAGE, 906, null);
        structTextService.delDstcasesInfo(caseSeq);
        return ResultUtil.createSubmitResult(resultInfo);
    }

    //模块

    /**
     * 跳转模板列表
     *
     * @param model
     * @return
     * @author liulj @date 2018年2月6日 上午10:15:03
     */
    @RequestMapping("/queryHspConsentTemp")
    public String queryHspConsentTemp(Model model, String refseqno, String cstNam, String tempCode) {
        model.addAttribute("refseqno", refseqno);
        model.addAttribute("cstNam", cstNam);
        model.addAttribute("tempCode", tempCode);
        return "/hzszyyhospital/hzszyydoctor/consent/queryzqtysmb";
    }

    /**
     * 查询模板列表
     *
     * @param hspConsentTempCustomDto
     * @param page
     * @param rows
     * @param sort
     * @param order
     * @return
     * @throws Exception
     * @author liulj @date 2018年2月6日 上午10:41:09
     */
    @RequestMapping("/queryHspConsentTemp_result")
    public @ResponseBody DataGridResultInfo queryHspConsentTemp_result(HspConsentTempCustomDto hspConsentTempCustomDto,
//																	   int page,//当前页码
//																	   int rows,//每页显示个数
                                                                       String sort,
                                                                       String order) throws Exception {
        //非空检验
        // 从字典表获取通用知情同意书tempCode
        Dstdictinfo dstdictinfo = systemConfigService.findDictinfoByInfocode("TEMP_CODE", "TEMP_CODE_99");
        String commonTempCode = dstdictinfo != null ? dstdictinfo.getInfo() : "";

        hspConsentTempCustomDto = hspConsentTempCustomDto != null ? hspConsentTempCustomDto : new HspConsentTempCustomDto();
        List<Dsttemplate> list1, list2;
        if (StringUtils.isNotNullAndEmptyByTrim(hspConsentTempCustomDto.getHspConsentTempCustom().getTempname())) {
            String tempname = hspConsentTempCustomDto.getHspConsentTempCustom().getTempname();
            list1 = structTextService.queryDsttemplateInfo(hspConsentTempCustomDto.getTempCode(), tempname);
            list2 = structTextService.queryDsttemplateInfo(commonTempCode, tempname);
        } else {
            list1 = structTextService.queryDsttemplateInfo(hspConsentTempCustomDto.getTempCode());
            list2 = structTextService.queryDsttemplateInfo(commonTempCode);
        }
        List<Dsttemplate> dsttemplates = new ArrayList<>();
        dsttemplates.addAll(list1);
        dsttemplates.addAll(list2);
//		 	int total = dsttemplates.size();
//			PageQuery pageQuery = new PageQuery();
//			pageQuery.setPageParams(total, rows, page);
//			hspConsentTempCustomDto.setPageQuery(pageQuery);
        DataGridResultInfo dataGridResultInfo = new DataGridResultInfo();
        //填充total
//			dataGridResultInfo.setTotal(total);
        //填充rows
        dataGridResultInfo.setRows(dsttemplates);
        return dataGridResultInfo;
    }

    //todo 现已替换为编辑器页面 已废弃待删除
    @RequestMapping("/ConsentInfByTempno")
    public String ConsentInfByTempno(Model model, String tempno, String refseqno, String tempname
            , String qmHash, String qmTag) throws Exception {
        String conturl = "/WEB-INF/jsp/hzszyyhospital/hzszyydoctor/consent/sentbase/" + tempno + ".jsp";
        model.addAttribute("conturl", conturl);
        model.addAttribute("tempno", tempno);
        model.addAttribute("tempname", tempname);
        model.addAttribute("refseqno", refseqno);
        model.addAttribute("qmHash", qmHash);
        model.addAttribute("qmTag", qmTag);
        return "/hzszyyhospital/hzszyydoctor/consent/ConsentInfBase";
    }

    /**
     * 跳转胸痛编辑器页面
     *
     * @param model
     * @return
     * @throws Exception
     */
    @RequestMapping("/toXtPageEdit")
    public String toXtPageEdit(Model model, String tempno, String refseqno, String tempname, String qmHash,
                               String qmTag, String caseno, String cstNam, String tempCode) throws Exception {
        model.addAttribute("cstNam", cstNam);
        model.addAttribute("tempno", tempno);
        model.addAttribute("tempname", tempname);
        model.addAttribute("refseqno", refseqno);
        model.addAttribute("qmHash", qmHash);
        model.addAttribute("qmTag", qmTag);
        model.addAttribute("caseno", caseno);
        model.addAttribute("tempCode", tempCode);
        return "/hzszyyhospital/hzszyydoctor/consent/xtPageEdit";
    }

    /**
     * 跳转编辑器定义页面
     */
    @RequestMapping("/toIndex")
    public String toIndex() {
        return "/structtext/index";
    }

    /**
     * 查询登陆用户是否有权限操作
     *
     * @param model
     * @param cratNbr    创建用户
     * @param activeuser 当前登录用户信息
     * @return
     * @throws Exception
     */
    @RequestMapping("/checkRoleAjax")
    public @ResponseBody SubmitResultInfo checkRoleAjax(String cratNbr, ActiveUser activeuser) throws Exception {
        ResultInfo resultInfo = ResultUtil.createSuccess(Config.MESSAGE, 906, null);
        //权限参数（tourist:游客无任何操作权限，nurse：护士有打印权限，doctor：医生（与创建人不为同一人）拥有签名和打印权限，doctorSelf医生（与创建人为同一人）拥有保存修改、签名、打印权限，admin:管理员权限拥有所有权限）
        //默认无权限
        String permissions = "tourist";
        //登陆人员若是系统管理员，则直接开发权限
        if ("admin".equals(activeuser.getUsrno())) {
            permissions = "admin";
        } else {
            //登陆用户的角色
            String a_roles = activeuser.getDstroleList().toString();
            //拥有角色
            if (StringUtils.isNotNullAndEmptyByTrim(a_roles)) {
                //登陆用户角色是否包含护士、护士长、护士操作组长 、急救中心主任或者是病历查看角色，则有打印权限
                //如果是会诊医生在会诊列表页面上有 会诊回复权限（会诊医生权限判断在页面上做），其他页面则与护士相同
                if (a_roles.contains("1001") || a_roles.contains("1002") || a_roles.contains("1003") || a_roles.contains("1004") || a_roles.contains("1901") || a_roles.contains("1014")) {
                    permissions = "nurse";
                }
                //拥有日常医生角色 则有新增、签名、打印权限
                if (a_roles.contains("1009")) {
                    permissions = "doctor";
                    //创建人等于当前登录人则有 新增、修改、签名、打印等所有权限
                    if (activeuser.getUsrno().equals(cratNbr)) {
                        permissions = "doctorSelf";
                    }
                }
            }
        }
        resultInfo.setMessage(permissions);
        return ResultUtil.createSubmitResult(resultInfo);
    }

    //结束
}
