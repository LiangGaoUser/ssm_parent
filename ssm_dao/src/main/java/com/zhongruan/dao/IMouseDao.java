package com.zhongruan.dao;

import com.zhongruan.bean.Mouse;

import java.util.List;

public interface IMouseDao {
    public List<Mouse> findAllMouseInformation();
    public List<Mouse> findSelectMouse(Mouse mouse);

}
