package com.zhongruan.service.impl;

import com.github.pagehelper.PageHelper;
import com.zhongruan.bean.Memory;
import com.zhongruan.dao.IMemoryDao;
import com.zhongruan.service.IMemoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class MemoryService implements IMemoryService {


    @Autowired
    IMemoryDao iMemoryDao;
    @Override
    public List<Memory> findAllMemoryInformation(int page, int size) {

        PageHelper.startPage(page,size);
        return iMemoryDao.findAllMemoryInformation();
    }

    @Override
    public List<Memory> findSelectMemory(Memory memory) {
        return iMemoryDao.findSelectMemory(memory);
    }
}
