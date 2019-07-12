package com.zhongruan.service;

import com.zhongruan.bean.Memory;
import com.zhongruan.bean.Power;

import java.util.List;

public interface IPowerService {

    public List<Power> findAllPowerInformation(int page, int size);
    public List<Power> findSelectPower(Power power);
}
