package com.ecology.springcloud.service;

import com.ecology.springcloud.entity.User;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@FeignClient(value = "MICROSERVICECLOUD-DEPT",fallbackFactory = DeptClientServiceFallbackFactory.class)
public interface DeptClientService {
	@RequestMapping(value = "/user/selectOne/{id}", method = RequestMethod.GET)
    public User selectOne(@PathVariable(value = "id") Integer id) ;

}
