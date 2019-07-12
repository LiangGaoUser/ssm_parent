package com.zhongruan.controller;
import com.github.pagehelper.PageInfo;
import com.google.gson.Gson;
import com.zhongruan.bean.Cpu;
import com.zhongruan.bean.Harddisk;
import com.zhongruan.bean.Memory;
import com.zhongruan.bean.UserInfo;
import com.zhongruan.service.ICpuService;
import com.zhongruan.service.IHardDiskService;
import com.zhongruan.service.impl.CpuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("cpu")
public class CpuController {
    @Autowired
    private CpuService cpuService;

    @RequestMapping("findAllCpuInformation.do")
    public ModelAndView findAllCpuInformation(HttpServletRequest request, HttpServletResponse response, @RequestParam(defaultValue="1") int page, @RequestParam(defaultValue="4")int size){//
        List<Cpu> cpuList=cpuService.findAllCpuInformation(page,size);//

        for(int i=0;i<cpuList.size();i++){
            cpuList.get(i).setCpu_img("../"+cpuList.get(i).getCpu_img());
            System.out.println(cpuList.get(i).getCpu_id()+" "+cpuList.get(i).getCpu_img());
        }
        PageInfo pageInfo=new PageInfo(cpuList);
      //  PageInfo pageInfo1=new PageInfo(harddiskList);



        UserInfo userInfo=(UserInfo)request.getSession().getAttribute("selfInfo");
        System.out.println("findAllCPuInformation==============================================++++++"+userInfo);
        request.getSession().setAttribute("pageInfo",pageInfo);



        ModelAndView mv = new ModelAndView();
        mv.addObject("selfInfo",userInfo);//
        System.out.println("=================="+userInfo);
        mv.setViewName("main_cpu_logined");
        return mv;
    }
    @RequestMapping("searchIfExistCpu.do")
    @ResponseBody
    public String searchIfExistCpu(Cpu cpu, HttpServletRequest request, HttpServletResponse response){
        System.out.println("LLLLLLLLLLLLLLLLLLLLLLLLLLKKKKK"+cpu.getCpu_id());
        Map map = new HashMap();
        if(request.getSession().getAttribute("cpuList")==null){
            List<Cpu> cpuList=cpuService.findSelectCpu(cpu);
            for(int i=0;i<cpuList.size();i++){
                cpuList.get(i).setCpu_img("../"+cpuList.get(i).getCpu_img());
            }
            request.getSession().setAttribute("cpuList",cpuList);
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




    ///////////
    @RequestMapping("findCpuByBrand.do")
    public ModelAndView findCpuByBrand(HttpServletRequest request,@RequestParam(defaultValue="1") int page, @RequestParam(defaultValue="12")int size,String cpu_brand){//
        List<Cpu> cpuList=cpuService.findCpuByBrand(page,size,cpu_brand);

        for(int i=0;i<cpuList.size();i++){
            cpuList.get(i).setCpu_img("../"+cpuList.get(i).getCpu_img());
            // System.out.println(cpuList.get(i).getCpu_id()+" "+cpuList.get(i).getCpu_img());
        }
        //cpu_list.retainAll(cpuList);
        PageInfo pageInfo=new PageInfo(cpuList);

        UserInfo userInfo=(UserInfo)request.getSession().getAttribute("selfInfo");
        request.getSession().setAttribute("pageInfo",pageInfo);

        ModelAndView mv = new ModelAndView();
        mv.addObject("selfInfo",userInfo);//

        mv.setViewName("main_cpu_logined");
        return mv;
    }

    @RequestMapping("findCpuBySeries.do")
    public ModelAndView findCpuBySeries(HttpServletRequest request,@RequestParam(defaultValue="1") int page, @RequestParam(defaultValue="12")int size,String cpu_series){//
        try {
            String series = new String(cpu_series.getBytes("iso-8859-1"),"gb2312");
            List<Cpu> cpuList=cpuService.findCpuBySeries(page,size,series);
            for(int i=0;i<cpuList.size();i++){
                cpuList.get(i).setCpu_img("../"+cpuList.get(i).getCpu_img());
                System.out.println(cpuList.get(i).getCpu_id()+" "+cpuList.get(i).getCpu_img());
            }
            // cpu_list.retainAll(cpuList);

            PageInfo pageInfo=new PageInfo(cpuList);

            UserInfo userInfo=(UserInfo)request.getSession().getAttribute("selfInfo");
            request.getSession().setAttribute("pageInfo",pageInfo);

            ModelAndView mv = new ModelAndView();
            mv.addObject("selfInfo",userInfo);//

            mv.setViewName("main_cpu_logined");
            return mv;
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }

        return null;
    }

    @RequestMapping("findCpuByslotType.do")
    public ModelAndView findCpuByslotType(HttpServletRequest request,@RequestParam(defaultValue="1") int page, @RequestParam(defaultValue="12")int size,String cpu_slotType){//
        try {
            String slotType = new String(cpu_slotType.getBytes("iso-8859-1"),"gb2312");
            List<Cpu> cpuList=cpuService.findCpuByslotType(page,size,slotType);
            for(int i=0;i<cpuList.size();i++){
                cpuList.get(i).setCpu_img("../"+cpuList.get(i).getCpu_img());
                System.out.println(cpuList.get(i).getCpu_id()+" "+cpuList.get(i).getCpu_img());
            }
            // cpu_list.retainAll(cpuList);

            PageInfo pageInfo=new PageInfo(cpuList);

            UserInfo userInfo=(UserInfo)request.getSession().getAttribute("selfInfo");
            request.getSession().setAttribute("pageInfo",pageInfo);

            ModelAndView mv = new ModelAndView();
            mv.addObject("selfInfo",userInfo);//

            mv.setViewName("main_cpu_logined");
            return mv;
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }

        return null;
    }

    @RequestMapping("findCpuBycoreNumber.do")
    public ModelAndView findCpuBycoreNumber(HttpServletRequest request,@RequestParam(defaultValue="1") int page, @RequestParam(defaultValue="12")int size,String cpu_coreNumber){//
        try {
            String coreNumber = new String(cpu_coreNumber.getBytes("iso-8859-1"),"gb2312");
            List<Cpu> cpuList=cpuService.findCpuBycoreNumber(page,size,coreNumber);
            for(int i=0;i<cpuList.size();i++){
                cpuList.get(i).setCpu_img("../"+cpuList.get(i).getCpu_img());
                System.out.println(cpuList.get(i).getCpu_id()+" "+cpuList.get(i).getCpu_img());
            }
            // cpu_list.retainAll(cpuList);

            PageInfo pageInfo=new PageInfo(cpuList);

            UserInfo userInfo=(UserInfo)request.getSession().getAttribute("selfInfo");
            request.getSession().setAttribute("pageInfo",pageInfo);

            ModelAndView mv = new ModelAndView();
            mv.addObject("selfInfo",userInfo);//

            mv.setViewName("main_cpu_logined");
            return mv;
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }

        return null;
    }

    @RequestMapping("findCpuByintegTool.do")
    public ModelAndView findCpuByintegTool(HttpServletRequest request,@RequestParam(defaultValue="1") int page, @RequestParam(defaultValue="12")int size,String cpu_integTool){//
        try {
            String integTool = new String(cpu_integTool.getBytes("iso-8859-1"),"gb2312");
            List<Cpu> cpuList=cpuService.findCpuByintegTool(page,size,integTool);
            for(int i=0;i<cpuList.size();i++){
                cpuList.get(i).setCpu_img("../"+cpuList.get(i).getCpu_img());
                System.out.println(cpuList.get(i).getCpu_id()+" "+cpuList.get(i).getCpu_img());
            }
            // cpu_list.retainAll(cpuList);

            PageInfo pageInfo=new PageInfo(cpuList);

            UserInfo userInfo=(UserInfo)request.getSession().getAttribute("selfInfo");
            request.getSession().setAttribute("pageInfo",pageInfo);

            ModelAndView mv = new ModelAndView();
            mv.addObject("selfInfo",userInfo);//

            mv.setViewName("main_cpu_logined");
            return mv;
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }

        return null;
    }






















}
