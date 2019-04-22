package com.bootstrap.ldword.model.dao.processdao;

import cn.gson.oasys.model.entity.process.EvectionMoney;
import cn.gson.oasys.model.entity.process.ProcessList;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface EvectionMoneyDao extends PagingAndSortingRepository<EvectionMoney, Long>{

	EvectionMoney findByProId(ProcessList pro);
}
