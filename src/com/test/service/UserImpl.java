package com.test.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.bean.CredentialsBean;
import com.test.dao.CredentialsDao;

@Service
public class UserImpl implements User {
	@Autowired
	CredentialsDao cDao;
	
	
	public String login(CredentialsBean credentialsBean)
	{
	System.out.println("UserImpl:===>" +credentialsBean );
	
		if(credentialsBean!=null && (credentialsBean.getUserID()!=null) && (credentialsBean.getPassword()!=null))
		{
			if(cDao.validateUser(credentialsBean))
			{
				return cDao.getUserType(credentialsBean);
				
			}
			else
			{
				return "INVALID";
			}
		}
		else
		{
			return "plz enter valid Credentials";
		}
	}
}
