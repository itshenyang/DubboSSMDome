package com.keruis.keruis_client.Service;

import com.keruis.keruis_pojo.Pojos.User;
import com.keruis.keruis_pojo.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2017/10/18.
 */
@Service
public class ClientUserService {
    @Autowired
    UserService userService;

    public User LoginUser(User user) {

        return userService.Login(user);
    }


}
