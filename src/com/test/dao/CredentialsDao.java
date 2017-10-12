package com.test.dao;


import org.springframework.stereotype.Repository;

import com.test.bean.CredentialsBean;

@Repository
public interface CredentialsDao {

	public boolean validateUser(CredentialsBean credentialsBean);
	
	
	public String getUserType(CredentialsBean credentialsBean);
}
