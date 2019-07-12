package com.zhongruan.service.impl;

import com.github.pagehelper.PageHelper;
import com.zhongruan.bean.Cpu;
import com.zhongruan.dao.ICpuDao;
import com.zhongruan.service.ICpuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CpuService implements ICpuService {
    @Autowired
    private ICpuDao cpuDao;
    @Override
    public List<Cpu> findAllCpuInformation(int page,int size) {//查询返回全部cpu的类
        PageHelper.startPage(page,size);

        return cpuDao.findAllCpuInformation();
    }

    @Override
    public List<Cpu> findSelectCpu(Cpu cpu) {
        return cpuDao.findSelectCpu(cpu);
    }





    @Override
    public List<Cpu> findCpuByBrand(int page,int size,String cpu_brand){
        PageHelper.startPage(page,size);

        return cpuDao.findCpuByBrand(cpu_brand);
    }
    @Override
    public List<Cpu> findCpuBySeries(int page,int size,String cpu_series){
        PageHelper.startPage(page,size);

        return cpuDao.findCpuBySeries(cpu_series);
    }
    @Override
    public List<Cpu> findCpuByslotType(int page,int size,String cpu_slotType){
        PageHelper.startPage(page,size);

        return cpuDao.findCpuByslotType(cpu_slotType);
    }
    @Override
    public List<Cpu> findCpuBycoreNumber(int page,int size,String cpu_coreNumber){
        PageHelper.startPage(page,size);
        return cpuDao.findCpuBycoreNumber(cpu_coreNumber);
    }
    @Override
    public List<Cpu> findCpuByintegTool(int page,int size,String cpu_integTool){
        PageHelper.startPage(page,size);
        return cpuDao.findCpuByintegTool(cpu_integTool);
    }

}
