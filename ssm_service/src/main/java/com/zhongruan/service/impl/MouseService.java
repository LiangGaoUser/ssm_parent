package com.zhongruan.service.impl;

import com.github.pagehelper.PageHelper;
import com.zhongruan.bean.Mouse;
import com.zhongruan.dao.IMouseDao;
import com.zhongruan.service.IMouseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MouseService implements IMouseService {


    @Autowired
    IMouseDao iMouseDao;

    @Override
    public List<Mouse> findAllMouseInformation(int page, int size) {
        PageHelper.startPage(page,size);
        return iMouseDao.findAllMouseInformation();
    }

    @Override
    public List<Mouse> findSelectMouse(Mouse mouse) {
        return iMouseDao.findSelectMouse(mouse);
    }
}
