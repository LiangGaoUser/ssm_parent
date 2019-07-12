package com.zhongruan.service;

import com.zhongruan.bean.Harddisk;
import com.zhongruan.bean.Netcard;
import java.util.List;

public interface INetCardService {
    public List<Netcard> findAllNetCardInformation(int page, int size);//查询返回全部声卡的类
    public List<Netcard> findSelectNetcard(Netcard netcard);
}
