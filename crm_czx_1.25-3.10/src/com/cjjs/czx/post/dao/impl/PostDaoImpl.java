package com.cjjs.czx.post.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.cjjs.czx.department.domain.CrmDepartment;
import com.cjjs.czx.post.dao.PostDao;
import com.cjjs.czx.post.domain.CrmPost;

public class PostDaoImpl extends HibernateDaoSupport implements PostDao {

	@Override
	public List<CrmPost> findAll(CrmDepartment department) {
		return this.getHibernateTemplate().find("from CrmPost where department = ?", department);
	}

}
