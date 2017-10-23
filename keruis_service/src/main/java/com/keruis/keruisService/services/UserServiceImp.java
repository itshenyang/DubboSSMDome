package com.keruis.keruisService.services;

import com.keruis.keruisService.dao.UserDAO;

import com.keruis.keruis_pojo.Pojos.User;
import com.keruis.keruis_pojo.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by Administrator on 2017/3/20.
 */

public class UserServiceImp extends BaseServiceImp implements UserService {

    @Autowired
    UserDAO userDAO;



    public User Login(User user) {

        User userObj=new User();

        userObj = userDAO.getUserByLogin(user);

        return userObj;
    }


}
