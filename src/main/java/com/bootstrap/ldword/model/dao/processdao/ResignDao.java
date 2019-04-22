package com.bootstrap.ldword.model.dao.processdao;

import cn.gson.oasys.model.entity.process.ProcessList;
import cn.gson.oasys.model.entity.process.Resign;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface ResignDao extends PagingAndSortingRepository<Resign, Long>{

	Resign findByProId(ProcessList process);

}
