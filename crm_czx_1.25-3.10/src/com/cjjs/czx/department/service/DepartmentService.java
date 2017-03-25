package com.cjjs.czx.department.service;

import java.util.List;

import com.cjjs.czx.department.domain.CrmDepartment;

public interface DepartmentService {
	
	/**
	 * 查询所有部门
	 * @return
	 */
	public List<CrmDepartment> findAll();

}
