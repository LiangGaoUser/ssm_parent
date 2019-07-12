package com.zhongruan.dao;

import com.zhongruan.bean.Memory;
import com.zhongruan.bean.Netcard;
import java.util.List;

public interface INetCardDao {
    public List<Netcard> findAllNetCardInformation();//查询返回全部网卡的类
    public List<Netcard> findSelectNetCard(Netcard Netcard);
}
