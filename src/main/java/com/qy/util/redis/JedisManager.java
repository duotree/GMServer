package com.qy.util.redis;

import java.util.Arrays;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.exceptions.JedisConnectionException;

public class JedisManager {
	
	private static final Logger logger = LoggerFactory.getLogger(JedisManager.class);

	@Resource
	private JedisPool jedisPool;
	
	/**
	 * 
	 * @Title:getJedis
	 * @Description:获取jedis
	 * @author: yd
	 * @date: 2018年6月8日 下午11:54:30
	 * @return
	 */
	public Jedis getJedis() {
		Jedis jedis = null;
		try {
			jedis = jedisPool.getResource();
		}catch(JedisConnectionException e) {
			logger.error("jedis connection error: {}", e);
		}catch(Exception e) {
			if (jedis != null) {
				jedis.close();
			}
			logger.error("error: {}", e);
		}
		return jedis;
	}
	
	
	
	
	
}
