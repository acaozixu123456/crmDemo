package com.cjjs.czx.post.service.impl;

import java.util.List;

import com.cjjs.czx.department.domain.CrmDepartment;
import com.cjjs.czx.post.dao.PostDao;
import com.cjjs.czx.post.domain.CrmPost;
import com.cjjs.czx.post.service.PostService;

public class PostServiceImpl implements PostService {
	private PostDao postDao;
	public void setPostDao(PostDao postDao) {
		this.postDao = postDao;
	}
	@Override
	public List<CrmPost> findAll(CrmDepartment department) {
		return postDao.findAll(department);
	}

}
