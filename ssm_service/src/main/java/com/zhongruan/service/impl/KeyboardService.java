package com.zhongruan.service.impl;

import com.github.pagehelper.PageHelper;
import com.zhongruan.bean.Keyboard;
import com.zhongruan.dao.IKeyboardDao;
import com.zhongruan.service.IKeyboardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class KeyboardService implements IKeyboardService {

    @Autowired
    IKeyboardDao iKeyboardDao;

    @Override
    public List<Keyboard> findAllKeyboardInformation(int page, int size) {
        PageHelper.startPage(page,size);
        return iKeyboardDao.findAllKeyboardInformation();
    }

    @Override
    public List<Keyboard> findSelectKeyboard(Keyboard keyboard) {
        return iKeyboardDao.findSelectKeyboard(keyboard);
    }
}
