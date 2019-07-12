package com.zhongruan.controller;


import com.github.pagehelper.PageInfo;
import com.google.gson.Gson;
import com.zhongruan.bean.Memory;
import com.zhongruan.bean.Power;
import com.zhongruan.bean.UserInfo;
import com.zhongruan.service.impl.PowerService;
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
@RequestMapping("power")
public class PowerController {
    @Autowired
    PowerService powerService;


    @RequestMapping("findAllPowerInformation.do")
    public ModelAndView findAllPowerInformation(HttpServletRequest request, HttpServletResponse response, @RequestParam(defaultValue="1") int page, @RequestParam(defaultValue="4")int size){//
        List<Power> powerList=powerService.findAllPowerInformation(page,size);//
        for(int i=0;i<powerList.size();i++){
            powerList.get(i).setPower_img("../"+powerList.get(i).getPower_img());
            System.out.println(powerList.get(i).getPower_id()+" "+powerList.get(i).getPower_img());
        }
        PageInfo pageInfo=new PageInfo(powerList);//
        UserInfo userInfo=(UserInfo)request.getSession().getAttribute("selfInfo");
        System.out.println("findAllCPuInformation==============================================++++++"+userInfo);

        request.getSession().setAttribute("pageInfo",pageInfo);//


        ModelAndView mv = new ModelAndView();
        mv.addObject("pageInfo",pageInfo);
        mv.setViewName("power");
        return mv;
    }
    @RequestMapping("searchIfExistPower.do")
    @ResponseBody
    public String searchIfExistPower(Power power, HttpServletRequest request, HttpServletResponse response){
        System.out.println("LLLLLLLLLLLLLLLLLLLLLLLLLLKKKKK"+power.getPower_id());
        Map map = new HashMap();
        if(request.getSession().getAttribute("powerList")==null){
            List<Power> powerList=powerService.findSelectPower(power);
            for(int i=0;i<powerList.size();i++){
                powerList.get(i).setPower_img("../"+powerList.get(i).getPower_img());
            }
            request.getSession().setAttribute("powerList",powerList);
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
