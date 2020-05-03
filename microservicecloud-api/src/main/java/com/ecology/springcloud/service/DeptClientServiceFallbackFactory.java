package com.ecology.springcloud.service;

import com.ecology.springcloud.entity.User;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

import java.util.List;

@Component // 不要忘记添加，不要忘记添加
public class DeptClientServiceFallbackFactory implements FallbackFactory<DeptClientService>
{
	@Override
	public DeptClientService create(Throwable throwable)
	{
		return new DeptClientService() {
			@Override
			public User selectOne(Integer id) {
				return new User().setName("服务降低或则服务异常，导致该服务暂时不可用").setId(id);
			}
		};
	}
}
