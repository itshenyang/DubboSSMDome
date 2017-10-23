package com.keruis.keruis_client.Controller;

import com.keruis.keruis_client.Service.Client4GRedisService;
import com.keruis.keruis_client.Service.ClientUserService;
import com.keruis.keruis_client.Utils.L;
import com.keruis.keruis_pojo.Pojos.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Administrator on 2017/10/18.
 */
@Controller
@RequestMapping(value = "user")
public class UserController {
    @Autowired
    ClientUserService clientUserService;
    @Autowired
    Client4GRedisService client4GRedisService;

    @RequestMapping(value = "LoginUser", method = RequestMethod.POST)
    @ResponseBody
    public Object LoginUser(@RequestBody User user) {
        L.w(user.toString());
        User result = clientUserService.LoginUser(user);
        String s = client4GRedisService.getDataByKey("2017wanghuan");
        L.w("============="+s);
        return result;
    }
}
