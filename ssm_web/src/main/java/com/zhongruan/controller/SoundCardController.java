package com.zhongruan.controller;


import com.github.pagehelper.PageInfo;
import com.google.gson.Gson;
import com.zhongruan.bean.Harddisk;
import com.zhongruan.bean.Netcard;
import com.zhongruan.bean.Soundcard;
import com.zhongruan.bean.UserInfo;
import com.zhongruan.service.ISoundCardService;
import com.zhongruan.service.impl.HardDiskService;
import com.zhongruan.service.impl.SoundCardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("SoundCard")
public class SoundCardController {
    @Autowired
    private SoundCardService soundCardService;

    @RequestMapping("findAllSoundCardInformation.do")
    public ModelAndView findAllSoundCardInformation(HttpServletRequest request, HttpServletResponse response, @RequestParam(defaultValue="1") int page, @RequestParam(defaultValue="4")int size){//
        List<Soundcard> soundcardList=soundCardService.findAllSoundCardInformation(page,size);//
        for(int i=0;i<soundcardList.size();i++){
            soundcardList.get(i).setSoundCard_img("../"+soundcardList.get(i).getSoundCard_img());
            System.out.println(soundcardList.get(i).getSoundCard_id()+" "+soundcardList.get(i).getSoundCard_img());
        }
        PageInfo pageInfo=new PageInfo(soundcardList);//

        UserInfo userInfo=(UserInfo)request.getSession().getAttribute("selfInfo");
        System.out.println("findAllCPuInformation==============================================++++++"+userInfo);
        request.getSession().setAttribute("pageInfo",pageInfo);//
        ModelAndView mv = new ModelAndView();
        mv.setViewName("soundcard");
        return mv;
    }
    @RequestMapping("searchIfExistSoundCard.do")
    @ResponseBody
    public String searchIfExistSoundCard(Soundcard soundcard, HttpServletRequest request, HttpServletResponse response){
        System.out.println("LLLLLLLLLLLLLLLLLLLLLLLLLLKKKKK"+soundcard.getSoundCard_id());
        Map map = new HashMap();
        if(request.getSession().getAttribute("soundcardList")==null){
            List<Soundcard> soundcardList=soundCardService.findSelectSoundCard(soundcard);
            for(int i=0;i<soundcardList.size();i++){
                soundcardList.get(i).setSoundCard_img("../"+soundcardList.get(i).getSoundCard_img());
            }
            request.getSession().setAttribute("soundcardList",soundcardList);
            map.put("flag","ok");
            System.out.println("flag=================OK");
        }
        else{
            map.put("flag","exist");
            System.out.println("flag=================EXIST");
        }
        Gson gson=new Gson();
        String str=gson.toJson(map);
        return str;
    }
}
