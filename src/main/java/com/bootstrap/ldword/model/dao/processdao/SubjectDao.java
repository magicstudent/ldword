package com.bootstrap.ldword.model.dao.processdao;

import cn.gson.oasys.model.entity.process.Subject;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

public interface SubjectDao extends PagingAndSortingRepository<Subject, Long>{

	List<Subject> findByParentId(Long id);
	
	List<Subject> findByParentIdNot(Long id);
	
	
}
