package com.test.dao;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.test.bean.CredentialsBean;
@Repository
public class CredentialsDaoImpl implements CredentialsDao {

	@Autowired
	SessionFactory sFactory;
	
	@Transactional
	public boolean validateUser(CredentialsBean credentialsBean)
	{
		Session session=sFactory.getCurrentSession();
		CredentialsBean cBean=(CredentialsBean) session.get(CredentialsBean.class, credentialsBean.getUserID());
		System.out.println("CDAO :===>" +cBean);
		if(cBean!=null)
		{
			if(cBean.getPassword().equals(credentialsBean.getPassword()))
			{
				return true;
			}
			else
			{
				System.out.println("password");
				return false;
			}
		}
		else
		{
			System.out.println("no such user is found or plz enter valid user");
			return false;
		}
	}
	
	@Transactional
	public String getUserType(CredentialsBean credentialsBean)
	{
		Session session=sFactory.getCurrentSession();
		CredentialsBean cBean=(CredentialsBean) session.get(CredentialsBean.class, credentialsBean.getUserID());
		return cBean.getUserType();
	}
}
