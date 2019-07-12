package com.zhongruan.dao;


import com.zhongruan.bean.Harddisk;

import java.util.List;

public interface IHardDiskDao {

    public List<Harddisk> findAllHDInformation();//查询返回全部硬盘的类
    public List<Harddisk> findSelectHarddisk(Harddisk harddisk);
}
