package com.keruis.keruis_pojo.Pojos;

import redis.clients.jedis.Jedis;

import java.io.Serializable;

/**
 * Created by Administrator on 2017/10/19.
 */

public class BaseRedisPOJO  extends BasePOJO implements Serializable{

    private Jedis jedis;


    public Jedis getJedis() {
        return jedis;
    }

    public void setJedis(Jedis jedis) {
        this.jedis = jedis;
    }
}
