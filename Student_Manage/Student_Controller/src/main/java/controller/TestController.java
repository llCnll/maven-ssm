package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import pojo.Admin;
import service.TestService;

@Controller
public class TestController {

	@Autowired
	private TestService testService;
	
	@RequestMapping("/test/{testname}")
	@ResponseBody
	public Admin getAdminbyName(@PathVariable String testname){
		System.out.println(testname);
		Admin admin = testService.getAdminbyName(testname);
		System.out.println(admin.getName()+" "+ admin.getPassword());
		return admin;
	}
	
}
