package com.lp.blog.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.lp.blog.dao.IUserDao;
import com.lp.blog.pojo.User;
import com.lp.blog.service.intf.IUserSerivce;

@Service("userService")  
public class UserService implements IUserSerivce {  
	
    @Resource  
    private IUserDao userDao;  
    
    public User getUserById(int userId) {  
        // TODO Auto-generated method stub  
        return this.userDao.selectByPrimaryKey(userId); 
    }
}
