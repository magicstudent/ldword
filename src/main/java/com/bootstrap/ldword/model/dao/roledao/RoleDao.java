package com.bootstrap.ldword.model.dao.roledao;

import cn.gson.oasys.model.entity.role.Role;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface RoleDao extends JpaRepository<Role, Long>{

	@Query("select ro from Role as ro where ro.roleName like %?1%")
	Page<Role> findbyrolename(String val, Pageable pa);

}
