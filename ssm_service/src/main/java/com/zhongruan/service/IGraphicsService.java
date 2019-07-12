package com.zhongruan.service;

import com.zhongruan.bean.Cpu;
import com.zhongruan.bean.Graphics;
import java.util.List;

public interface IGraphicsService {
    public List<Graphics> findAllGraphicsInformation(int page, int size);//查询返回全部显卡的类
    public List<Graphics> findSelectGraphics(Graphics graphics);
}
