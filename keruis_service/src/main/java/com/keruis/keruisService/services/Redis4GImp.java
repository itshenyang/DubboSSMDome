package com.keruis.keruisService.services;

import com.keruis.keruisService.utils.L;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;
import redis.clients.jedis.Protocol;

/**
 * Created by Administrator on 2017/11/3.
 */
public class Redis4GImp  {
    static JedisPool pool;

    public final static int PORT = 6379;
    public  static final String HOST254M = "r-bp110824de3b91c4.redis.rds.aliyuncs.com";
    public static final String HOST4G ="r-bp1ccc550a077d94.redis.rds.aliyuncs.com";
    public static final String Hb201Host ="redis.keruis.com";
    private final String pwd = "So0pLi8y7M";
    private final String pwd1="Keruis@123";

    public void init(){
        L.t(" Start Redis 20 Client ");
        JedisPoolConfig jedisPoolConfig = new JedisPoolConfig();
        jedisPoolConfig.setMaxTotal(50);
        jedisPoolConfig.setMinIdle(10);
        jedisPoolConfig.setMaxIdle(25);
        pool = new JedisPool(jedisPoolConfig, HOST254M, PORT , Protocol.DEFAULT_TIMEOUT , pwd  );
        L.d("===================================================================================");
        L.d("===================================================================================");
        L.d("================================  Redis 初始化  =====================================");
        L.d("===================================================================================");
        L.d("===================================================================================");
        L.d("===================================================================================");
    }
    public static Jedis getJedis(){
        return   pool.getResource();
    }
}
