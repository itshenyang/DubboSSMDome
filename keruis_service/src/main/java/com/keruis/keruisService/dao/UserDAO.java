package com.keruis.keruisService.dao;

import com.keruis.keruis_pojo.Pojos.User;
import org.springframework.stereotype.Repository;

/**
 * Created by Administrator on 2017/3/20.
 */
@Repository
public interface UserDAO extends BaseDAO {
    User getUserByLogin(User user);


}
