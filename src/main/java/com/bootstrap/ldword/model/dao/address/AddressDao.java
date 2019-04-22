package com.bootstrap.ldword.model.dao.address;


import cn.gson.oasys.model.entity.note.Director;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressDao extends JpaRepository<Director, Long> {

	//根据姓名首拼模糊查询
	
}
