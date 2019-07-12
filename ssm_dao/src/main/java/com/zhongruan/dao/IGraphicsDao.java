package com.zhongruan.dao;

import com.zhongruan.bean.Graphics;
import com.zhongruan.bean.Harddisk;

import java.util.List;

public interface IGraphicsDao {
    public List<Graphics> findAllGraphicsInformation();//查询返回全部显卡的类
    public List<Graphics> findSelectGraphics(Graphics graphics);

}
