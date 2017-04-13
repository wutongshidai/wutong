package com.parasol.core.dao.user;

import com.parasol.core.user.User;
import com.parasol.core.user.UserQuery;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserMapper {
    int countByExample(UserQuery example);

    int deleteByExample(UserQuery example);

    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    int insertSelective(User record);

    List<User> selectByExample(UserQuery example);

    User selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") User record, @Param("example") UserQuery example);

    int updateByExample(@Param("record") User record, @Param("example") UserQuery example);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
    
    
    
    /*int updatePassword(@Param("userName") String userName ,@Param("password") String password);
    String selectByUserName(String userName);
    int updateByNickName(User user);*///sql
}