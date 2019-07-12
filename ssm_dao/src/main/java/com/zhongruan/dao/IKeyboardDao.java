package com.zhongruan.dao;

import com.zhongruan.bean.Cpu;
import com.zhongruan.bean.Keyboard;

import java.util.List;

public interface IKeyboardDao {

    public List<Keyboard> findAllKeyboardInformation();//查询返回全部kb的类
    public List<Keyboard> findSelectKeyboard(Keyboard keyboard);
}
