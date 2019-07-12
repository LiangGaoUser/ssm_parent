package com.zhongruan.dao;

import com.zhongruan.bean.Keyboard;
import com.zhongruan.bean.Power;

import java.util.List;

public interface IPowerDao {
    public List<Power> findAllPowerInformation();//查询返回全部内存的类
    public List<Power> findSelectPower(Power power);
}
