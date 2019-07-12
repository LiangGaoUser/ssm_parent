package com.zhongruan.service.impl;

import com.github.pagehelper.PageHelper;
import com.zhongruan.bean.Power;

import com.zhongruan.dao.IPowerDao;
import com.zhongruan.service.IPowerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PowerService implements IPowerService {


    @Autowired
    IPowerDao iPowerDao;

    @Override
    public List<Power> findAllPowerInformation(int page, int size) {
        PageHelper.startPage(page,size);
        return iPowerDao.findAllPowerInformation();

    }

    @Override
    public List<Power> findSelectPower(Power power) {
        return iPowerDao.findSelectPower(power);
    }
}
