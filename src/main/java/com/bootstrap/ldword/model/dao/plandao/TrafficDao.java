package com.bootstrap.ldword.model.dao.plandao;

import cn.gson.oasys.model.entity.process.EvectionMoney;
import cn.gson.oasys.model.entity.process.Traffic;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

public interface TrafficDao extends PagingAndSortingRepository<Traffic, Long>{

	List<Traffic> findByEvection(EvectionMoney money);
}
