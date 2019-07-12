package com.zhongruan.service;

import com.zhongruan.bean.Monitor;

import java.util.List;

public interface IMonitorService {
    public List<Monitor> findAllMonitorInformation(int page, int size);//查询返回全部声卡的类
    public List<Monitor> findSelectMonitor(Monitor monitor);

}
