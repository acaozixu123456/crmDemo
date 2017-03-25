package com.cjjs.czx.staff.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.cjjs.czx.staff.dao.StaffDao;
import com.cjjs.czx.staff.domain.CrmStaff;

public class StaffDaoImpl extends HibernateDaoSupport implements StaffDao {

	@Override
	public CrmStaff find(String loginName, String loginPwd) {
		List<CrmStaff> allStaff = this.getHibernateTemplate().find("from CrmStaff where loginName=? and loginPwd = ?", loginName,loginPwd);
		if(allStaff.size() == 1){
			return allStaff.get(0);
		} 
		return null;
	}

	@Override
	public List<CrmStaff> findAll() {
		return this.getHibernateTemplate().find("from CrmStaff");
	}

	@Override
	public CrmStaff findById(String staffId) {
		return this.getHibernateTemplate().get(CrmStaff.class, staffId);
	}

}
