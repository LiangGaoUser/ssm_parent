package com.zhongruan.service;

import com.zhongruan.bean.Motherboard;

import java.util.List;

public interface IMotherboardService {

    public List<Motherboard> findAllMotherboardInformation(int page, int size);//查询返回全部主板的类
    public List<Motherboard> findSelectMotherboard(Motherboard motherboard);

}
