package cn.bdqn.service;

import cn.bdqn.entity.User;

import java.util.List;

public interface UserService {
    List<User> getUserList();

    List<User> findNameById(Integer id);


}
