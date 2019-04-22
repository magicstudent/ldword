package com.bootstrap.ldword.model.dao.processdao;

import cn.gson.oasys.model.entity.process.EvectionMoney;
import cn.gson.oasys.model.entity.process.Stay;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

public interface StayDao extends PagingAndSortingRepository<Stay, Long>{
 
	List<Stay> findByEvemoney(EvectionMoney money);
}
