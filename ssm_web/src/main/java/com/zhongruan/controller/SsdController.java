package com.zhongruan.controller;

import com.github.pagehelper.PageInfo;
import com.google.gson.Gson;
import com.zhongruan.bean.Memory;
import com.zhongruan.bean.Power;
import com.zhongruan.bean.Ssd;
import com.zhongruan.bean.UserInfo;
import com.zhongruan.service.impl.SsdService;
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
@RequestMapping("Ssd")
public class SsdController {
    @Autowired
    SsdService ssdService;
    @RequestMapping("findAllSsdInformation.do")
    public ModelAndView findAllSsdInformation(HttpServletRequest request, HttpServletResponse response, @RequestParam(defaultValue="1") int page, @RequestParam(defaultValue="4")int size){//
        List<Ssd> ssdList1=ssdService.findAllSsdInformation(page,size);//
        for(int i=0;i<ssdList1.size();i++){
            ssdList1.get(i).setSsd_img("../"+ssdList1.get(i).getSsd_img());
            System.out.println(ssdList1.get(i).getSsd_id()+" "+ssdList1.get(i).getSsd_img());
        }
        PageInfo pageInfo=new PageInfo(ssdList1);//
        UserInfo userInfo=(UserInfo)request.getSession().getAttribute("selfInfo");
        System.out.println("findAllCPuInformation==============================================++++++"+userInfo);

        request.getSession().setAttribute("pageInfo",pageInfo);//


        ModelAndView mv = new ModelAndView();
        mv.addObject("pageInfo",pageInfo);
        mv.setViewName("ssd");
        return mv;
    }

    @RequestMapping("searchIfExistSsd.do")
    @ResponseBody
    public String searchIfExistSsd(Ssd ssd, HttpServletRequest request, HttpServletResponse response){
        System.out.println("LLLLLLLLLLLLLLLLLLLLLLLLLLKKKKK"+ssd.getSsd_id());
        Map map = new HashMap();
        if(request.getSession().getAttribute("ssdList")==null){
            List<Ssd> ssdList=ssdService.findSelectSsd(ssd);
            for(int i=0;i<ssdList.size();i++){
                ssdList.get(i).setSsd_img("../"+ssdList.get(i).getSsd_img());
                System.out.println("HHHHHHHHHHHHHHHHHHHHHH"+ssdList.get(i));
            }
            request.getSession().setAttribute("ssdList",ssdList);
            map.put("flag","ok");
            System.out.println("flag=================ssdOK");
        }
        else{
            map.put("flag","exist");
            System.out.println("HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHflag=================ssdEXIST");
        }
        Gson gson=new Gson();
        String str=gson.toJson(map);
        return str;
    }

}
