package com.bootstrap.ldword.model.dao.processdao;

import cn.gson.oasys.model.entity.process.Bursement;
import cn.gson.oasys.model.entity.process.ProcessList;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface BursementDao extends PagingAndSortingRepository<Bursement, Long>{

	Bursement findByProId(ProcessList process);
	
	

}
