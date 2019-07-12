package com.zhongruan.service;

import com.zhongruan.bean.Mouse;

import java.util.List;

public interface IMouseService {
    public List<Mouse> findAllMouseInformation(int page, int size);
    public List<Mouse> findSelectMouse(Mouse mouse);

}
