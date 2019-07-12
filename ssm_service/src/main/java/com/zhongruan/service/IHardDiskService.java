package com.zhongruan.service;
import com.zhongruan.bean.Harddisk;
import java.util.List;

public interface IHardDiskService {
    public List<Harddisk> findAllHDInformation(int page, int size);//查询返回全部硬盘的类
    public List<Harddisk> findSelectHarddisk(Harddisk harddisk);
}
