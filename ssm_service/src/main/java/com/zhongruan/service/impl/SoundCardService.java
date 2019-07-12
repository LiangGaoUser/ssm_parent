package com.zhongruan.service.impl;

import com.github.pagehelper.PageHelper;
import com.zhongruan.bean.Soundcard;
import com.zhongruan.dao.ISoundCardDao;
import com.zhongruan.service.ISoundCardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class SoundCardService implements ISoundCardService {
    @Autowired
    ISoundCardDao iSoundCardDao;
    @Override
    public List<Soundcard> findAllSoundCardInformation(int page, int size) {
        PageHelper.startPage(page,size);
        return iSoundCardDao.findAllSoundCardInformation();
    }

    @Override
    public List<Soundcard> findSelectSoundCard(Soundcard soundcard) {
        return iSoundCardDao.findSelectSoundCard(soundcard);
    }
}
