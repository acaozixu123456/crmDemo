package com.cjjs.czx.department.service.impl;

import java.util.List;

import com.cjjs.czx.department.dao.DepartmentDao;
import com.cjjs.czx.department.domain.CrmDepartment;
import com.cjjs.czx.department.service.DepartmentService;

public class DepartmentServiceImpl implements DepartmentService {

	private DepartmentDao departmentDao;
	public void setDepartmentDao(DepartmentDao departmentDao) {
		this.departmentDao = departmentDao;
	}
	@Override
	public List<CrmDepartment> findAll() {
		return departmentDao.findAll();
	}

}
