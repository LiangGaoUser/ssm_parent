package com.zhongruan.service;

import com.zhongruan.bean.Netcard;
import com.zhongruan.bean.Soundcard;

import java.util.List;

public interface ISoundCardService {
    public List<Soundcard> findAllSoundCardInformation(int page, int size);//查询返回全部声卡的类
    public List<Soundcard> findSelectSoundCard(Soundcard soundcard);
}
