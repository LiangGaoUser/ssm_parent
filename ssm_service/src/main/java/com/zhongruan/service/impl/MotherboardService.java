package com.zhongruan.service.impl;

import com.github.pagehelper.PageHelper;
import com.zhongruan.bean.Motherboard;
import com.zhongruan.dao.IMotherboardDao;
import com.zhongruan.service.IMotherboardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class MotherboardService implements IMotherboardService {


    @Autowired
    IMotherboardDao iMotherboardDao;

    @Override
    public List<Motherboard> findAllMotherboardInformation(int page, int size) {
        PageHelper.startPage(page,size);
        return iMotherboardDao.findAllMotherboardInformation();
    }

    @Override
    public List<Motherboard> findSelectMotherboard(Motherboard motherboard) {
        return iMotherboardDao.findSelectMotherboard(motherboard);
    }

}
