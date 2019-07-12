package com.zhongruan.service;

import com.zhongruan.bean.Memory;

import java.util.List;

public interface IMemoryService {

    public List<Memory> findAllMemoryInformation(int page, int size);//查询返回全部内存的类
    public List<Memory> findSelectMemory(Memory memory);

}
