package com.zhongruan.service;

import com.zhongruan.bean.Keyboard;

import java.util.List;

public interface IKeyboardService {
    public List<Keyboard> findAllKeyboardInformation(int page, int size);//查询返回全部kb的类
    public List<Keyboard> findSelectKeyboard(Keyboard keyboard);
}
