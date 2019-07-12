package com.zhongruan.dao;


import com.zhongruan.bean.Monitor;

import java.util.List;

public interface IMonitorDao {
    public List<Monitor> findAllMonitorInformation();//查询返回全部显卡的类
    public List<Monitor> findSelectMonitor(Monitor monitor);
}
