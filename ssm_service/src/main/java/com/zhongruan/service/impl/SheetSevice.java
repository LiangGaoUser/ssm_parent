package com.zhongruan.service.impl;

import com.zhongruan.bean.Sheet;
import com.zhongruan.dao.ISheetDao;
import com.zhongruan.service.ISheetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SheetSevice implements ISheetService {
    @Autowired
    private ISheetDao iSheetDao;
    @Override
    public boolean publish(Sheet sheet) {
        return iSheetDao.publish(sheet);
    }

    @Override
    public List<Sheet> findSelectSheet() {
        return iSheetDao.findSelectSheet();
    }


}
