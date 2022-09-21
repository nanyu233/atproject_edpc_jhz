package activetech.base.action;

import java.util.ArrayList;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import activetech.base.pojo.domain.Toolbar;
import activetech.base.pojo.dto.ActiveUser;
import activetech.base.pojo.dto.Operation;
import activetech.base.process.context.Config;
import activetech.base.process.result.ResultInfo;
import activetech.base.process.result.ResultUtil;
import activetech.base.process.result.SubmitResultInfo;
import activetech.base.service.CommonService;
@Controller
public class CommonAction {
	
	@Autowired
    private CommonService commonService;
    
	@RequestMapping("/btnload")
	public @ResponseBody List<Toolbar> loadbtn(HttpSession session,String moduleid){
		ActiveUser activeUser = (ActiveUser)session.getAttribute(Config.ACTIVEUSER_KEY);
		List<Operation> operationList = activeUser.getOperationList();
		List<Toolbar> dstbtnList = new ArrayList<Toolbar>(); 
		for (Operation operation : operationList) {
			if(moduleid.equals(operation.getModuleid()) && "0".equals(operation.getOpertype())){
				Toolbar toolbar;
				toolbar = new Toolbar();
				toolbar.setId(operation.getOperationId());
				toolbar.setText(operation.getOperationName());
				toolbar.setIconCls(operation.getIcon());
				toolbar.setHandler(operation.getActionUrl());
				dstbtnList.add(toolbar);
			}
		}
		return dstbtnList;
	}
	
	@RequestMapping("/getAddrInfo")
	@ResponseBody
	public SubmitResultInfo getAddrInfo() throws Exception{
		
		ResultInfo resultInfo = commonService.getAddrDict();
		
		return ResultUtil.createSubmitResult(resultInfo);
	}
}
