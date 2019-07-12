package com.zhongruan.service;

import com.zhongruan.bean.Cpu;
import com.zhongruan.bean.Motherboard;
import com.zhongruan.bean.UserInfo;

import java.util.List;
import java.util.Map;

public interface ICpuService {
    public List<Cpu> findAllCpuInformation(int page ,int size);//查询返回全部cpu的类
    public List<Cpu> findSelectCpu(Cpu cpu);

    List<Cpu> findCpuByBrand(int page,int size,String cpu_brand);
    List<Cpu> findCpuBySeries(int page,int size,String cpu_series);
    List<Cpu> findCpuByslotType(int page,int size,String cpu_slotType);
    List<Cpu> findCpuBycoreNumber(int page,int size,String cpu_coreNumber);
    List<Cpu> findCpuByintegTool(int page,int size,String cpu_integTool);


}
