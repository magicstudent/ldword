package com.bootstrap.ldword.model.dao.processdao;

import cn.gson.oasys.model.entity.process.ProcessList;
import cn.gson.oasys.model.entity.process.Regular;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface RegularDao extends PagingAndSortingRepository<Regular, Long>{

	Regular findByProId(ProcessList pro);

}
