package com.keruis.keruis_client.Service;

import com.keruis.keruis_pojo.Pojos.Redis4GDb0;
import com.keruis.keruis_pojo.Utils.JSONUtils;
import redis.clients.jedis.Jedis;

import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2017/10/20.
 */
public class ClientBaseRedisService extends ClientBaseService {

    private Redis4GDb0 redis4GDb0;

    private Integer DbSelectIndex = 0;

    public Redis4GDb0 getRedis4GDb0() {
        return redis4GDb0;
    }

    public void setRedis4GDb0(Redis4GDb0 redis4GDb0) {
        this.redis4GDb0 = redis4GDb0;
    }

    public Integer getDbSelectIndex() {
        return DbSelectIndex;
    }

    public void setDbSelectIndex(Integer dbSelectIndex) {
        DbSelectIndex = dbSelectIndex;
    }

    public Jedis getJedis() {
        Jedis jedis = getRedis4GDb0().getJedis();
        jedis.select(DbSelectIndex);
        return jedis;
    }

    public String getDataByKey(String TableName, String KeyId) {
        Jedis jedis = getJedis();
        try {
            String userString = jedis.hget(TableName, KeyId);
            return userString;
        } finally {
            if (jedis != null) {
                jedis.close();
            }
        }

    }

    public String getDataByKey(String KeyId) {
        Jedis jedis = getJedis();
        try {
            String userString = jedis.get(KeyId);
            return userString;
        } finally {
            if (jedis != null) {
                jedis.close();
            }
        }
    }

    public List<String> getAllDataByKey(String TableName) {
        Jedis jedis = getJedis();
        try {
            List<String> userString = jedis.hvals(TableName);
            return userString;
        } finally {
            if (jedis != null) {
                jedis.close();
            }
        }
    }

    public void setDataToRedis(String TableName, String KeyId, Object pojo) {
        Jedis jedis = getJedis();
        try {
            String data = JSONUtils.toString(pojo);
            jedis.hset(TableName, KeyId, data);
        } finally {
            if (jedis != null) {
                jedis.close();
            }
        }
    }

    public void setDataToRedis(String TableName, Object pojo) {
        Jedis jedis = getJedis();
        try {
            String data = JSONUtils.toString(pojo);
            jedis.set(TableName, data);
        } finally {
            if (jedis != null) {
                jedis.close();
            }
        }
    }


    public void setJedisExpiration(String KeyId, int ExpirationTime) {
        Jedis jedis = getJedis();
        try {
            jedis.expire(KeyId, ExpirationTime);
        } finally {
            if (jedis != null) {
                jedis.close();
            }
        }
    }

    public void delDataToRedis(String KeyId) {
        Jedis jedis = getJedis();
        try {
            jedis.del(KeyId);
        } finally {
            if (jedis != null) {
                jedis.close();
            }
        }
    }

    public void delDataToRedis(String TableName, String KeyId) {
        Jedis jedis = getJedis();
        try {
            jedis.hdel(TableName, KeyId);
        } finally {
            if (jedis != null) {
                jedis.close();
            }
        }
    }

    public Map hgetAll(String TableName) {
        Jedis jedis = getJedis();
        try {
            return jedis.hgetAll(TableName);
        } finally {
            if (jedis != null) {
                jedis.close();
            }
        }
    }

}
