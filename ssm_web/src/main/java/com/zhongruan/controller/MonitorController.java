package com.zhongruan.controller;

import com.github.pagehelper.PageInfo;
import com.google.gson.Gson;
import com.zhongruan.bean.Monitor;
import com.zhongruan.bean.UserInfo;
import com.zhongruan.service.impl.MonitorService;
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
@RequestMapping("Monitor")
public class MonitorController {
    @Autowired
    private MonitorService monitorService;
    @RequestMapping("findAllMonitorInformation.do")
    public ModelAndView findAllMonitorInformation(HttpServletRequest request, HttpServletResponse response, @RequestParam(defaultValue="1") int page, @RequestParam(defaultValue="4")int size){//
        List<Monitor> monitorList= monitorService.findAllMonitorInformation(page,size);//
        for(int i=0;i<monitorList.size();i++){
            monitorList.get(i).setMonitor_img("../"+monitorList.get(i).getMonitor_img());
            System.out.println(":::::::::::::::::::::::::::"+monitorList.get(i).getMonitor_id()+" "+monitorList.get(i).getMonitor_img());
        }
        PageInfo pageInfo=new PageInfo(monitorList);//
        UserInfo userInfo=(UserInfo)request.getSession().getAttribute("selfInfo");
        System.out.println("findAllCPuInformation==============================================++++++"+userInfo);
        request.getSession().setAttribute("pageInfo",pageInfo);//
        ModelAndView mv = new ModelAndView();
        mv.setViewName("monitor");
        return mv;
    }

    @RequestMapping("searchIfExistMonitor.do")
    @ResponseBody
    public String searchIfExistMonitor(Monitor monitor,HttpServletRequest request, HttpServletResponse response){
        System.out.println("LLLLLLLLLLLLLLLLLLLLLLLLLLKKKKK"+monitor.getMonitor_id());
        Map map = new HashMap();
        if(request.getSession().getAttribute("monitorList")==null){
            List<Monitor> monitorList=monitorService.findSelectMonitor(monitor);
            for(int i=0;i<monitorList.size();i++){
                monitorList.get(i).setMonitor_img("../"+monitorList.get(i).getMonitor_img());
            }
            request.getSession().setAttribute("monitorList",monitorList);
            map.put("flag","ok");
            System.out.println("flag=================OK");
        }
        else{
            //List<Monitor> monitorList1=monitorService.findSelectMonitor(monitor);
            List<Monitor> monitorList1=(List)request.getSession().getAttribute("monitorList");

            for(int i=0;i<monitorList1.size();i++){
                System.out.println(monitorList1.get(i).getMonitor_img()+"MMMMMMonitor");
            }

            map.put("flag","exist");
            System.out.println("flag=================EXISTMonitor");
        }
        Gson gson=new Gson();
        String str=gson.toJson(map);
        return str;
    }







}
