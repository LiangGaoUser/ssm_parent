package com.zhongruan.service;

import com.zhongruan.bean.Ssd;

import java.util.List;

public interface ISsdService {
    public List<Ssd> findAllSsdInformation(int page, int size);
    public List<Ssd> findSelectSsd(Ssd ssd);


}
