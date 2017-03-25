package com.itheima.crm.staff.web.action;

import java.util.List;

import com.itheima.crm.staff.domain.CrmStaff;
import com.itheima.crm.staff.service.StaffService;
import com.opensymphony.xwork2.ActionChainResult;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.interceptor.annotations.InputConfig;

public class StaffAction extends ActionSupport implements ModelDriven<CrmStaff> {
	//封装数据
	private CrmStaff staff = new CrmStaff();
	@Override
	public CrmStaff getModel() {
		return staff ;
	}
	
	//默认按照名称注入
	private StaffService staffService;
	public void setStaffService(StaffService staffService) {
		this.staffService = staffService;
	}
	
	
	///////////////////////////////////////////////
	
	/**
	 * 员工登录
	 * @return
	 */
	public String login(){
		//1 查询员工
		CrmStaff findStaff = staffService.login(staff);
		//2 是否成功
		if(findStaff != null){
			//成功
			// 3.1 session作用域保存数据
			ActionContext.getContext().getSession().put("loginStaff", findStaff);
			// 3.2 重定向首页 -- xml配置
			return "success";
		} 
		
		//4 不成功
		this.addFieldError("", "用户名与密码不匹配");
		// * 请求转发显示
		return "login";
	}
	
	/**
	 * 显示首页
	 * @return
	 */
	public String home(){
		return "home";
	}
	
	
	/**
	 * 查询所有
	 * @return
	 */
	public String findAll(){
		// 1查询所有
		List<CrmStaff> allStaff = staffService.findAllStaff();
		// 2 将结果存放到值栈，方便jsp获得数据
		// * 方式1：context (map)存放 put(key ,value) ，jsp页面获得 “#key” 。
		//		ActionContext.getContext().put(key, value)
		// * 方式2：root (值栈) ，push(obj) ，一般数据为JavaBean 或 Map ，jsp页面获得“属性名” 或“key”  。
		//		ActionContext.getContext().getValueStack().push(o)
		// * 方式3：root (值栈) ，set(key ,value) ,一般数据为List ，jsp页面获得“key”
		//		set() 底层 new Map(key,value) ，将 push(map )
		
		// 使用 context存放数据
		ActionContext.getContext().put("allStaff", allStaff);
		
		
		
		return "findAll";
	}

}
