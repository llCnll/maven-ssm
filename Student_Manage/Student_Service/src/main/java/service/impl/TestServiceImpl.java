package service.impl;

import mapper.AdminMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pojo.Admin;
import service.TestService;

@Service
public class TestServiceImpl implements TestService{

	@Autowired
	private AdminMapper adminMapper;
	
	public Admin getAdminbyName(String name) {
		
		Admin admin = adminMapper.selectByPrimaryKey(name);
		
		return admin;
	}

}
