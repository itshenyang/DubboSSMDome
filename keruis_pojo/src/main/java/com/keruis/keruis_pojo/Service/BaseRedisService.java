package com.keruis.keruis_pojo.Service;

import com.keruis.keruis_pojo.Pojos.Redis4GDb0;

/**
 * Created by Administrator on 2017/10/20.
 */
public interface BaseRedisService  extends BaseService{
    Redis4GDb0 getJedis();
}
