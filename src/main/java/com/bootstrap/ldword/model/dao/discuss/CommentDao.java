package com.bootstrap.ldword.model.dao.discuss;

import cn.gson.oasys.model.entity.discuss.Comment;
import cn.gson.oasys.model.entity.discuss.Reply;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CommentDao extends JpaRepository<Comment, Long>{
	//根据回复表来找有关的所有评论
	List<Comment> findByReply(Reply reply);
	
	@Query("from Comment t where t.reply.replyId in (?1)")
	List<Comment> findComments(Long[] taskids);
	
	
}
