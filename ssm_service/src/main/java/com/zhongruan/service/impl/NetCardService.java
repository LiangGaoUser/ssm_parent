package com.zhongruan.service.impl;

import com.github.pagehelper.PageHelper;
import com.zhongruan.bean.Netcard;
import com.zhongruan.dao.INetCardDao;
import com.zhongruan.service.INetCardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public class NetCardService implements INetCardService {
    @Autowired
    INetCardDao iNetCardDao;
    @Override
    public List<Netcard> findAllNetCardInformation(int page, int size) {
        PageHelper.startPage(page,size);
        return iNetCardDao.findAllNetCardInformation();
    }

    @Override
    public List<Netcard> findSelectNetcard(Netcard netcard) {
        return iNetCardDao.findSelectNetCard(netcard);
    }
}
