package com.bootstrap.ldword.model.dao.processdao;

import cn.gson.oasys.model.entity.process.Evection;
import cn.gson.oasys.model.entity.process.ProcessList;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface EvectionDao extends PagingAndSortingRepository<Evection, Long> {

	Evection findByProId(ProcessList process);

}
