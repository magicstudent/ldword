package com.bootstrap.ldword.model.dao.processdao;

import cn.gson.oasys.model.entity.process.Holiday;
import cn.gson.oasys.model.entity.process.ProcessList;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface HolidayDao extends PagingAndSortingRepository<Holiday, Long>{

	Holiday findByProId(ProcessList pro);

}
