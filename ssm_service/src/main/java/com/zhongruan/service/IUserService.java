package com.zhongruan.service;

import com.zhongruan.bean.UserInfo;

import java.util.List;
import java.util.Map;

public interface IUserService {
    public List<UserInfo> findAll(int page ,int size);
    public Boolean dologin(UserInfo userInfo);
    public UserInfo forID(UserInfo userInfo);
    public void  save (UserInfo userInfo);
    public boolean delete(int id);
    public boolean update(Map map);
    public UserInfo queryById(int id);
    public void changetel_num(UserInfo userInfo);
    public void changePassWord(Map map);
    public UserInfo queryByNumAndPwd(UserInfo userInfo);
    public void register(UserInfo userInfo);
}
