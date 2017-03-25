package com.itheima.crm.coursetype.domain;

import java.util.HashSet;
import java.util.Set;

import com.itheima.crm.classes.domain.CrmClasses;

public class CrmCourseType {
	/*
	 * CREATE TABLE `crm_course_type` (
		  `courseTypeId` varchar(255) NOT NULL PRIMARY KEY,
		  `courseCost` double DEFAULT NULL,
		  `total` int(11) DEFAULT NULL,
		  `courseName` varchar(500) DEFAULT NULL,
		  `remark` varchar(5000) DEFAULT NULL
		);
	 */
	private String courseTypeId;
	private String courseCost;		//费用
	private String total;			//总学时
	private String courseName;		//课程类别名称
	private String remark;			//描述 description
	
	//一对多：一个课程类别 可以 有 【多个班级】
	private Set<CrmClasses> classesSet = new HashSet<CrmClasses>();

	public String getCourseTypeId() {
		return courseTypeId;
	}

	public void setCourseTypeId(String courseTypeId) {
		this.courseTypeId = courseTypeId;
	}

	public String getCourseCost() {
		return courseCost;
	}

	public void setCourseCost(String courseCost) {
		this.courseCost = courseCost;
	}

	public String getTotal() {
		return total;
	}

	public void setTotal(String total) {
		this.total = total;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public Set<CrmClasses> getClassesSet() {
		return classesSet;
	}

	public void setClassesSet(Set<CrmClasses> classesSet) {
		this.classesSet = classesSet;
	}
	
	
	
}
