package com.zhongruan.dao;

import com.zhongruan.bean.Keyboard;
import com.zhongruan.bean.Memory;
import com.zhongruan.bean.Ssd;

import java.util.List;

public interface ISsdDao {
    public List<Ssd> findAllSsdInformation();//查询返回全部ssd的类
    public List<Ssd> findSelectSsd(Ssd ssd);
}
