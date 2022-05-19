package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class RedisApplicationTests {

	@Autowired
	CacheService cacheService;
	@Test
	void contextLoads() {
	}
	/**
	 * 功能描述：添加字符串到redis
	 */
	@Test
	void add() {
		cacheService.add("test", 1234);
	}

}
