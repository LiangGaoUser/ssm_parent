package com.zhongruan.service.impl;

import com.github.pagehelper.PageHelper;
import com.zhongruan.bean.Ssd;
import com.zhongruan.dao.ISsdDao;
import com.zhongruan.service.ISsdService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;
@Service
public class SsdService implements ISsdService {

    @Autowired
    ISsdDao iSsdDao;
    @Override
    public List<Ssd> findAllSsdInformation(int page, int size) {
        PageHelper.startPage(page,size);
        return iSsdDao.findAllSsdInformation();
    }

    @Override
    public List<Ssd> findSelectSsd(Ssd ssd) {
        return iSsdDao.findSelectSsd(ssd);
    }
}
