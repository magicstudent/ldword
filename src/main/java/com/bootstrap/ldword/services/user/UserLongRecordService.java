package com.bootstrap.ldword.services.user;

import cn.gson.oasys.model.dao.user.UserLogRecordDao;
import cn.gson.oasys.model.entity.user.LoginRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class UserLongRecordService {
	@Autowired
	private UserLogRecordDao  ulDao;
	
	public LoginRecord save(LoginRecord lr){
		return ulDao.save(lr);
	}
	
}
