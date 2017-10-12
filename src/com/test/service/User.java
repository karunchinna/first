package com.test.service;

import org.springframework.stereotype.Service;

import com.test.bean.CredentialsBean;

@Service
public interface User {

	String login(CredentialsBean credentialsBean);
}
