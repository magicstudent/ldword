package com.bootstrap.ldword.model.dao.discuss;

import cn.gson.oasys.model.entity.discuss.Discuss;
import cn.gson.oasys.model.entity.discuss.Reply;
import cn.gson.oasys.model.entity.user.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ReplyDao extends JpaRepository<Reply, Long>{
	//根据讨论表的id来找所有的回复表,分页处理
	Page<Reply> findByDiscuss(Discuss discuss, Pageable pa);

	//根据讨论表和用户来查找，并分页处理
	Page<Reply> findByDiscussAndUser(Discuss discuss, User user, Pageable pa);
	
	List<Reply> findByDiscuss(Discuss discuss);
	
	
}
