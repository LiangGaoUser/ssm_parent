package com.zhongruan.controller;

import com.github.pagehelper.PageInfo;
import com.google.gson.Gson;
import com.zhongruan.bean.Memory;
import com.zhongruan.bean.Motherboard;
import com.zhongruan.bean.UserInfo;
import com.zhongruan.service.impl.MemoryService;
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
@RequestMapping("memory")
public class MemoryController {


@Autowired
    MemoryService memoryService;

    @RequestMapping("findAllMemoryInformation.do")
    public ModelAndView findAllMemoryInformation(HttpServletRequest request, HttpServletResponse response, @RequestParam(defaultValue="1") int page, @RequestParam(defaultValue="4")int size){//
        List<Memory> memoryList=memoryService.findAllMemoryInformation(page,size);//
        for(int i=0;i<memoryList.size();i++){
            memoryList.get(i).setMemory_img("../"+memoryList.get(i).getMemory_img());
            System.out.println(";;;;;;;;;;;;;;;;;;;;;"+memoryList.get(i).getMemory_id()+" "+memoryList.get(i).getMemory_img());
        }
        PageInfo pageInfo=new PageInfo(memoryList);//
        UserInfo userInfo=(UserInfo)request.getSession().getAttribute("selfInfo");
        System.out.println("findAllCPuInformation==============================================++++++"+userInfo);
        request.getSession().setAttribute("pageInfo",pageInfo);//


        ModelAndView mv = new ModelAndView();
        mv.addObject("pageInfo",pageInfo);
        mv.setViewName("memory");
        return mv;
    }
    @RequestMapping("searchIfExistMemory.do")
    @ResponseBody
    public String searchIfExistMemroy(Memory memory, HttpServletRequest request, HttpServletResponse response){
        System.out.println("LLLLLLLLLLLLLLLLLLLLLLLLLLKKKKK"+memory.getMemory_id());
        Map map = new HashMap();
        if(request.getSession().getAttribute("meomoryList")==null){
            List<Memory> memoryList=memoryService.findSelectMemory(memory);
            for(int i=0;i<memoryList.size();i++){
                memoryList.get(i).setMemory_img("../"+memoryList.get(i).getMemory_img());
            }
            request.getSession().setAttribute("meomoryList",memoryList);
            map.put("flag","ok");
            System.out.println("flag=================OK");
        }
        else{
            List<Memory> memoryList1=(List)request.getSession().getAttribute("memoryList");

            for(int i=0;i<memoryList1.size();i++){
                System.out.println(memoryList1.get(i).getMemory_img()+"MMMMMMemory");
            }
            map.put("flag","exist");
            System.out.println("flag=================EXISTMemroy");
        }
        Gson gson=new Gson();
        String str=gson.toJson(map);
        return str;
    }
}
