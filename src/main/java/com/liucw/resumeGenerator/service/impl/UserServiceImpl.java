package com.liucw.resumeGenerator.service.impl;

import com.liucw.resumeGenerator.common.BusinessException;
import com.liucw.resumeGenerator.common.ErrorCode;
import com.liucw.resumeGenerator.dao.UserMapper;
import com.liucw.resumeGenerator.entity.User;
import com.liucw.resumeGenerator.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserServiceImpl implements UserService, ErrorCode {

    @Autowired
    private UserMapper userMapper;

    @Transactional
    public int insertUser(User user){
        try{
            if(user.getName()==""){
                throw new BusinessException(NAME_NOTNULL_ERROR,"名字不能为空值！");
            }
            userMapper.insert(user);
            return user.getId();

        }catch(DuplicateKeyException e){
            throw new BusinessException(PARAMETER_ERROR,String.format("服务器上已存在%s的简历,请删除后重新生成！",user.getName()));
        }
    }

    public User findUserById(int id){
        return userMapper.selectByPrimaryKey(id);
    }


}
