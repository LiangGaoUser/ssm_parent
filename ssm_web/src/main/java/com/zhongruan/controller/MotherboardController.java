package com.zhongruan.controller;
import com.github.pagehelper.PageInfo;
import com.google.gson.Gson;
import com.zhongruan.bean.Monitor;
import com.zhongruan.bean.Motherboard;
import com.zhongruan.bean.UserInfo;
import com.zhongruan.service.impl.MotherboardService;
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
@RequestMapping("motherboard")
public class MotherboardController {



    @Autowired
    MotherboardService motherboardService;

    @RequestMapping("findAllMotherboardInformation.do")
    public ModelAndView findAllMotherboardInformation(HttpServletRequest request, HttpServletResponse response, @RequestParam(defaultValue="1") int page, @RequestParam(defaultValue="4")int size){//
        List<Motherboard> motherboardList=motherboardService.findAllMotherboardInformation(page,size);//
        for(int i=0;i<motherboardList.size();i++){
            motherboardList.get(i).setMotherboard_img("../"+motherboardList.get(i).getMotherboard_img());
            System.out.println(motherboardList.get(i).getMotherboard_id()+" "+motherboardList.get(i).getMotherboard_img());
        }
        PageInfo pageInfo=new PageInfo(motherboardList);//
        UserInfo userInfo=(UserInfo)request.getSession().getAttribute("selfInfo");
        System.out.println("findAllCPuInformation==============================================++++++"+userInfo);
        request.getSession().setAttribute("pageInfo",pageInfo);//


        ModelAndView mv = new ModelAndView();
        mv.addObject("pageInfo",pageInfo);
        mv.setViewName("motherboard");
        return mv;
    }

    @RequestMapping("searchIfExistMotherboard.do")
    @ResponseBody
    public String searchIfExistMotherboard(Motherboard motherboard, HttpServletRequest request, HttpServletResponse response){
        System.out.println("LLLLLLLLLLLLLLLLLLLLLLLLLLKKKKK"+motherboard.getMotherboard_id());
        Map map = new HashMap();
        if(request.getSession().getAttribute("montherboardList")==null){
            List<Motherboard> montherboardList=motherboardService.findSelectMotherboard(motherboard);
            for(int i=0;i<montherboardList.size();i++){
                montherboardList.get(i).setMotherboard_img("../"+montherboardList.get(i).getMotherboard_img());
            }
            request.getSession().setAttribute("montherboardList",montherboardList);
            map.put("flag","ok");
            System.out.println("flag=================OK");
        }
        else{
            List<Motherboard> motherboardList1=(List)request.getSession().getAttribute("montherboardList");

            for(int i=0;i<motherboardList1.size();i++){
                System.out.println(motherboardList1.get(i).getMotherboard_img()+"MMMMMMotherboard");
            }

            map.put("flag","exist");
            System.out.println("flag=================EXISTMotherboard");
        }
        Gson gson=new Gson();
        String str=gson.toJson(map);
        return str;
    }

}
