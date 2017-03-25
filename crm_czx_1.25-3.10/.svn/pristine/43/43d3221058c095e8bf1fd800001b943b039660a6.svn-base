package com.itheima.crm.staff.service.impl;

import java.util.List;

import com.itheima.crm.staff.dao.StaffDao;
import com.itheima.crm.staff.domain.CrmStaff;
import com.itheima.crm.staff.service.StaffService;
import com.itheima.crm.utils.MyStringUtils;

public class StaffServiceImpl implements StaffService {
	private StaffDao staffDao;
	public void setStaffDao(StaffDao staffDao) {
		this.staffDao = staffDao;
	}
	@Override
	public CrmStaff login(CrmStaff staff) {
		// MD5加密 密码
		String logginPwd = MyStringUtils.getMD5Value(staff.getLoginPwd());
		return staffDao.find(staff.getLoginName(), logginPwd);
	}
	@Override
	public List<CrmStaff> findAllStaff() {
		return this.staffDao.findAll();
	}

}
