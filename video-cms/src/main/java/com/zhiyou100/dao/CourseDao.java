package com.zhiyou100.dao;

import com.zhiyou100.entity.CourseDO;

public interface CourseDao extends BaseDao<CourseDO> {

	/**
	 * 置空指定的学科 id
	 * @param subjectId
	 */
	void updateSubjectIdNull(String[] subjectIds);
}
