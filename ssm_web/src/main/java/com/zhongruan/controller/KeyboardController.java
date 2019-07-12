package com.zhongruan.controller;


import com.github.pagehelper.PageInfo;
import com.google.gson.Gson;
import com.zhongruan.bean.Keyboard;
import com.zhongruan.bean.UserInfo;
import com.zhongruan.service.impl.KeyboardService;
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
@RequestMapping("keyboard")
public class KeyboardController {

    @Autowired
    KeyboardService keyboardService;

    @RequestMapping("findAllKeyboardInformation.do")
    public ModelAndView findAllKeyboardInformation(HttpServletRequest request, HttpServletResponse response, @RequestParam(defaultValue="1") int page, @RequestParam(defaultValue="4")int size){//
        List<Keyboard> keyboardList=keyboardService.findAllKeyboardInformation(page,size);//

        for(int i=0;i<keyboardList.size();i++){
            keyboardList.get(i).setKeyboard_img("../"+keyboardList.get(i).getKeyboard_img());
            System.out.println(keyboardList.get(i).getKeyboard_id()+" "+keyboardList.get(i).getKeyboard_img());
        }
        PageInfo pageInfo=new PageInfo(keyboardList);//

        UserInfo userInfo=(UserInfo)request.getSession().getAttribute("selfInfo");
        System.out.println("findAllCPuInformation==============================================++++++"+userInfo);

        request.getSession().setAttribute("pageInfo",pageInfo);//


        ModelAndView mv = new ModelAndView();
        mv.addObject("pageInfo",pageInfo);
        mv.setViewName("keyboard");
        return mv;
    }

    @RequestMapping("searchIfExistKeyboard.do")
    @ResponseBody
    public String searchIfExistMemroy(Keyboard keyboard, HttpServletRequest request, HttpServletResponse response){
        System.out.println("LLLLLLLLLLLLLLLLLLLLLLLLLLKKKKK"+keyboard.getKeyboard_id());
        Map map = new HashMap();
        if(request.getSession().getAttribute("keyboardList")==null){
            List<Keyboard> keyboardList=keyboardService.findSelectKeyboard(keyboard);
            for(int i=0;i<keyboardList.size();i++){
                keyboardList.get(i).setKeyboard_img("../"+keyboardList.get(i).getKeyboard_img());
            }
            request.getSession().setAttribute("keyboardList",keyboardList);
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
