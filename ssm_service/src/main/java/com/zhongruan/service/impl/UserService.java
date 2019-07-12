package com.zhongruan.service.impl;

import com.github.pagehelper.PageHelper;
import com.zhongruan.bean.UserInfo;
import com.zhongruan.dao.IUserDao;
import com.zhongruan.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class UserService implements IUserService {
    @Autowired
    private IUserDao userDao;
    @Override
    public List<UserInfo> findAll(int page ,int size) {
        PageHelper.startPage(page,size);
        return userDao.findAll();
    }

    @Override
    public Boolean dologin(UserInfo userInfo) {
        System.out.println(userInfo+"-------------------");
        UserInfo userInfo1=userDao.dologin(userInfo);
        if(userInfo1!=null)
        {
            return true;
        }
        else{
            return false;
        }
    }

    @Override
    public UserInfo forID(UserInfo userInfo) {
        return userDao.forID(userInfo);
    }

    @Override
    public void save(UserInfo userInfo) {
         userDao.save(userInfo);
    }

    @Override
    public boolean delete(int id) {
        return userDao.delete(id);
    }

    @Override
    public boolean update(Map map) {
        return userDao.update(map);
    }

    @Override
    public UserInfo queryById(int id) {
        return userDao.queryById(id);

    }

    @Override
    public void changetel_num(UserInfo userInfo) {
        userDao.changetel_num(userInfo);
    }

    @Override
    public void changePassWord(Map map) {
        userDao.changePassWord(map);
    }

    @Override
    public UserInfo queryByNumAndPwd(UserInfo userInfo) {
        return userDao.queryByNumAndPwd(userInfo);
    }

    @Override
    public void register(UserInfo userInfo) {
       userDao.register(userInfo);
    }
}
