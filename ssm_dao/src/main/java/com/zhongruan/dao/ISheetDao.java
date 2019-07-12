package com.zhongruan.dao;
import com.zhongruan.bean.Sheet;

import java.util.List;

public interface ISheetDao {
    public boolean publish(Sheet sheet);//发表配置单
    public List<Sheet> findSelectSheet();//查询所有配置单
}
