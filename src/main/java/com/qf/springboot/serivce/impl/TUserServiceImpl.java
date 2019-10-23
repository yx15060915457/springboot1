package com.qf.springboot.serivce.impl;

import com.qf.springboot.entity.TUser;
import com.qf.springboot.mapper.TUserMapper;
import com.qf.springboot.serivce.ITUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TUserServiceImpl implements ITUserService {

    @Autowired
    private TUserMapper userMapper;
    @Override
    public TUser getById(int id) {
        return userMapper.selectByPrimaryKey(id);
    }
}
