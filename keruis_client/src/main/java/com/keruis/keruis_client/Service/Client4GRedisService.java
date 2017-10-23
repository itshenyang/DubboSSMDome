package com.keruis.keruis_client.Service;

import com.keruis.keruis_pojo.Pojos.Redis4GDb0;
import com.keruis.keruis_pojo.Service.Redis4GService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2017/10/20.
 */
@Service
public class Client4GRedisService extends ClientBaseRedisService {
    @Autowired
    Redis4GService redis4GService;


    public Client4GRedisService() {
        setRedis4GDb0(redis4GService.getJedis());
        setDbSelectIndex(1);
    }
}
