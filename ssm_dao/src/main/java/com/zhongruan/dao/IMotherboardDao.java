package com.zhongruan.dao;

import com.zhongruan.bean.Monitor;
import com.zhongruan.bean.Motherboard;

import java.util.List;

public interface IMotherboardDao {
    public List<Motherboard> findAllMotherboardInformation();//查询返回全部主板的类
    public List<Motherboard> findSelectMotherboard(Motherboard motherboard);
}
