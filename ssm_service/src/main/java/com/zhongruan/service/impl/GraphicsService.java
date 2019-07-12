package com.zhongruan.service.impl;

import com.github.pagehelper.PageHelper;
import com.zhongruan.bean.Graphics;
import com.zhongruan.dao.IGraphicsDao;
import com.zhongruan.service.IGraphicsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class GraphicsService implements IGraphicsService {

    @Autowired
    private IGraphicsDao iGraphicsDao;
    @Override
    public List<Graphics> findAllGraphicsInformation(int page,int size) {
        PageHelper.startPage(page,size);
        return iGraphicsDao.findAllGraphicsInformation();
    }

    @Override
    public List<Graphics> findSelectGraphics(Graphics graphics) {
        return iGraphicsDao.findSelectGraphics(graphics);
    }
}
