package com.zhongruan.service.impl;

import com.github.pagehelper.PageHelper;
import com.zhongruan.bean.Monitor;
import com.zhongruan.dao.IMonitorDao;
import com.zhongruan.service.IMonitorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public class MonitorService implements IMonitorService {
    @Autowired
    IMonitorDao iMonitorDao;
    @Override
    public List<Monitor> findAllMonitorInformation(int page, int size) {
        PageHelper.startPage(page,size);
        return iMonitorDao.findAllMonitorInformation();
    }

    @Override
    public List<Monitor> findSelectMonitor(Monitor monitor) {
        return iMonitorDao.findSelectMonitor(monitor);
    }
}
