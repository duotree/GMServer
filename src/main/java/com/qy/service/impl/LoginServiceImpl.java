package com.qy.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.qy.bean.GMUser;
import com.qy.dao.LoginDao;
import com.qy.service.ILoginService;

@Service
public class LoginServiceImpl implements ILoginService {

	@Resource
	private LoginDao loginDao;
	
	public GMUser getUserByName(String username){
		
		return loginDao.getUserByName(username);
	}

}
