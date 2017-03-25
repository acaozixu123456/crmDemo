package com.cjjs.czx.post.dao;

import java.util.List;

import com.cjjs.czx.department.domain.CrmDepartment;
import com.cjjs.czx.post.domain.CrmPost;

public interface PostDao {
	/**
	 * 查询指定部门的所有职务
	 * @param department
	 * @return
	 */
	public List<CrmPost> findAll(CrmDepartment department);

}
