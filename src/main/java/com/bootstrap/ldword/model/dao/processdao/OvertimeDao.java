package com.bootstrap.ldword.model.dao.processdao;

import cn.gson.oasys.model.entity.process.Overtime;
import cn.gson.oasys.model.entity.process.ProcessList;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface OvertimeDao extends PagingAndSortingRepository<Overtime, Long>{

	Overtime findByProId(ProcessList pro);

}
