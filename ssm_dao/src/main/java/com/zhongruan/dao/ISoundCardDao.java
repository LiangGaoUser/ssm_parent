package com.zhongruan.dao;

import com.zhongruan.bean.Motherboard;
import com.zhongruan.bean.Soundcard;

import java.util.List;

public interface ISoundCardDao {
    public List<Soundcard> findAllSoundCardInformation();//查询返回全部声卡卡的类
    public List<Soundcard> findSelectSoundCard(Soundcard soundcard);
}
