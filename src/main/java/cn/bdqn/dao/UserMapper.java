package cn.bdqn.dao;

import cn.bdqn.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
//@Repository
public interface UserMapper {
    List<User> getUserList();

    List<User> findNameById(@Param("id") Integer id);
}
