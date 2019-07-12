package com.zhongruan.dao;


import com.zhongruan.bean.Memory;
import com.zhongruan.bean.Monitor;

import java.util.List;

public interface IMemoryDao {

    public List<Memory> findAllMemoryInformation();//查询返回全部内存的类
    public List<Memory> findSelectMemory(Memory memory);
}
