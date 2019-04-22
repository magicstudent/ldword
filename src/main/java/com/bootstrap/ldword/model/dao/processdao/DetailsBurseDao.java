package com.bootstrap.ldword.model.dao.processdao;

import cn.gson.oasys.model.entity.process.Bursement;
import cn.gson.oasys.model.entity.process.DetailsBurse;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

public interface DetailsBurseDao extends PagingAndSortingRepository<DetailsBurse, Long>{

	List<DetailsBurse> findByBurs(Bursement bu);
}
