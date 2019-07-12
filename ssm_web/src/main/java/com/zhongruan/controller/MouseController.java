package com.zhongruan.controller;

import com.github.pagehelper.PageInfo;
import com.google.gson.Gson;
import com.zhongruan.bean.Cpu;
import com.zhongruan.bean.Memory;
import com.zhongruan.bean.Mouse;
import com.zhongruan.bean.UserInfo;
import com.zhongruan.service.ICpuService;
import com.zhongruan.service.IMouseService;
import com.zhongruan.service.impl.MouseService;
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
@RequestMapping("mouse")
public class MouseController {

    @Autowired
    private MouseService mouseService;

    @RequestMapping("findAllMouseInformation.do")
    public ModelAndView findAllMouseInformation(HttpServletRequest request, HttpServletResponse response, @RequestParam(defaultValue="1") int page, @RequestParam(defaultValue="4")int size){//
        List<Mouse> mouseList=mouseService.findAllMouseInformation(page,size);//

        for(int i=0;i<mouseList.size();i++){
            mouseList.get(i).setMouse_img("../"+mouseList.get(i).getMouse_img());
            System.out.println(mouseList.get(i).getMouse_id()+" "+mouseList.get(i).getMouse_img());
        }
        PageInfo pageInfo=new PageInfo(mouseList);//

        UserInfo userInfo=(UserInfo)request.getSession().getAttribute("selfInfo");
        System.out.println("findAllCPuInformation==============================================++++++"+userInfo);

        request.getSession().setAttribute("pageInfo",pageInfo);//


        ModelAndView mv = new ModelAndView();
       // mv.addObject("pageInfo",pageInfo);
        mv.setViewName("mouse");
        return mv;
    }

    @RequestMapping("searchIfExistMouse.do")
    @ResponseBody
    public String searchIfExistMouse(Mouse mouse, HttpServletRequest request, HttpServletResponse response){
        System.out.println("LLLLLLLLLLLLLLLLLLLLLLLLLLKKKKK"+mouse.getMouse_id());
        Map map = new HashMap();
        if(request.getSession().getAttribute("mouseList")==null){
            List<Mouse> mouseList=mouseService.findSelectMouse(mouse);
            for(int i=0;i<mouseList.size();i++){
                mouseList.get(i).setMouse_img("../"+mouseList.get(i).getMouse_img());
            }
            request.getSession().setAttribute("mouseList",mouseList);
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
