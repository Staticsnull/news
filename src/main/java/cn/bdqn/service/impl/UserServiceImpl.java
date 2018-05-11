package cn.bdqn.service.impl;

import cn.bdqn.dao.UserMapper;
import cn.bdqn.entity.User;
import cn.bdqn.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Resource
    private UserMapper userMapper;
    @Override
    public List<User> getUserList() {
        return userMapper.getUserList();
    }

    @Override
    public List<User> findNameById(Integer id) {
        return userMapper.findNameById(id);
    }
}
