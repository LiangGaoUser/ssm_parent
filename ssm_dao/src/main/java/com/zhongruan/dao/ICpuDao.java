package com.zhongruan.dao;
import com.zhongruan.bean.Cpu;
import com.zhongruan.bean.Graphics;

import java.util.*;
public interface ICpuDao {
    public List<Cpu> findAllCpuInformation();//查询返回全部cpu的类
    public List<Cpu> findSelectCpu(Cpu cpu);
    List<Cpu> findCpuByBrand(String cpu_brand);
    List<Cpu> findCpuBySeries(String cpu_series);
    List<Cpu> findCpuByslotType(String cpu_slotType);
    List<Cpu> findCpuBycoreNumber(String cpu_coreNumber);
    List<Cpu> findCpuByintegTool(String cpu_integTool);


}
