package com.zhongruan.service.impl;
import com.github.pagehelper.PageHelper;
import com.zhongruan.bean.Harddisk;
import com.zhongruan.dao.IHardDiskDao;
import com.zhongruan.service.IHardDiskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public class HardDiskService implements IHardDiskService {

    @Autowired
    private IHardDiskDao iHardDiskDao;
    @Override
    public List<Harddisk> findAllHDInformation(int page, int size) {//查询返回全部硬盘的类
        PageHelper.startPage(page,size);

        return iHardDiskDao.findAllHDInformation();
    }

    @Override
    public List<Harddisk> findSelectHarddisk(Harddisk harddisk) {
        return iHardDiskDao.findSelectHarddisk(harddisk);
    }
}



