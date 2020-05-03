package com.ecology.springcloud.controller;

import com.ecology.springcloud.entity.User;
import com.ecology.springcloud.service.DeptClientService;
import com.ecology.springcloud.service.DeptClientService2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class DeptController_Consumer
{

	@Autowired
	private DeptClientService2 service;

	@RequestMapping(value = "consumer/dept/get/{id}")
	public User selectOne(@PathVariable(value = "id") Integer id)
	{
		return this.service.selectOne(id);
	}


}
