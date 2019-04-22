package com.bootstrap.ldword.services.discuss;

import cn.gson.oasys.model.dao.discuss.ReplyDao;
import cn.gson.oasys.model.entity.discuss.Reply;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class ReplyService {
	@Autowired
	private ReplyDao replyDao;

	// 保存对象至数据库
	public Reply save(Reply reply) {
		return replyDao.save(reply);
	}

	// 删除一个回复
	public void deleteReply(Reply reply) {
		replyDao.delete(reply);
	}

}
