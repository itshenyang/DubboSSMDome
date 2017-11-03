package com.keruis.keruis_pojo.Service;

import com.keruis.keruis_pojo.Pojos.Redis4GDb0;
import redis.clients.jedis.Jedis;

import java.util.List;

/**
 * Created by Administrator on 2017/10/20.
 */
public interface BaseRedisService  extends BaseService{
    String getWechatAccessToken();

    List<String> keys(String pattern);

    String get(String key);

    Jedis getJedis();

    String getDataByKey(String TableName, String KeyId);

    String getDataByKey(String KeyId);

    List<String> getAllDataByKey(String TableName);

    void setDataToRedis(String TableName, String KeyId, Object pojo);

    void setDataToRedis(String TableName, Object pojo);


    void setDataToRedis(String TableName, String string);

    void setJedisExpiration(String KeyId, int ExpirationTime);

    void delDataToRedis(String KeyId);

    void delDataToRedis(String TableName, String KeyId);

    List<String> getTableAllKeys(String Table);

    List<String> getKeysToRedis(List<String> keys, String table);

    List<String> getQueryKeysByTime(List<String> list, String time);
}
