package com.company.project.service;
import com.company.project.model.User;
import com.company.project.core.Service;

import java.util.List;


/**
 * Created by CodeGenerator on 2020/03/13.
 */
public interface UserService extends Service<User> {

    List<User> listUser(Integer pageNum, Integer pageSize);
}
