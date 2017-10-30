package com.keruis.keruisService.services;

import com.keruis.keruis_pojo.Pojos.Redis4GDb0;
import com.keruis.keruis_pojo.Service.Redis4GService;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;
import redis.clients.jedis.Protocol;

/**
 * Created by Administrator on 2017/10/20.
 */
public class Redis4GServiceImp implements Redis4GService {

    @Override
    public Redis4GDb0 getJedis() {
        Jedis jedis = jedisPool.getResource();
        Redis4GDb0 redis4GDb0 = new Redis4GDb0();
        redis4GDb0.setJedis(jedis);
        return redis4GDb0;
    }

    private JedisPool jedisPool;
    public  static final String Qc6380host = "r-bp110824de3b91c4.redis.rds.aliyuncs.com";
    public static final String Qc6379host ="r-bp1ccc550a077d94.redis.rds.aliyuncs.com";
    public static final String Hb201Host ="redis.keruis.com";
    private final String pwd = "So0pLi8y7M";
    private final String pwd1="Keruis@123";


    public   Redis4GServiceImp() {
        JedisPoolConfig config = new JedisPoolConfig();
        //最大连接数, 应用自己评估，不要超过AliCloudDB for Redis每个实例最大的连接数
        config.setMaxIdle(150);
        config.setMinIdle(50);
        config.setMaxIdle(100);
        jedisPool = new JedisPool(config, Hb201Host, 6379, Protocol.DEFAULT_TIMEOUT, pwd);
    }


}
