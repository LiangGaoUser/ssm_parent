package com.zhongruan.controller;


import com.github.pagehelper.PageInfo;
import com.google.gson.Gson;
import com.zhongruan.bean.Graphics;
import com.zhongruan.bean.Harddisk;
import com.zhongruan.bean.UserInfo;
import com.zhongruan.service.impl.HardDiskService;
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
@RequestMapping("HardDisk")
public class HardDiskController {
    @Autowired
    private HardDiskService hdService;

    @RequestMapping("findAllHardDiskInformation.do")
    public ModelAndView findAllHardDiskInformation(HttpServletRequest request, HttpServletResponse response, @RequestParam(defaultValue="1") int page, @RequestParam(defaultValue="4")int size){//
        List<Harddisk> harddisks=hdService.findAllHDInformation(page,size);//
        for(int i=0;i<harddisks.size();i++){
            harddisks.get(i).setHardDisk_img("../"+harddisks.get(i).getHardDisk_img());
            System.out.println(harddisks.get(i).getHardDisk_id()+" "+harddisks.get(i).getHardDisk_img());
        }
        PageInfo pageInfo=new PageInfo(harddisks);//

        UserInfo userInfo=(UserInfo)request.getSession().getAttribute("selfInfo");
        System.out.println("findAllCPuInformation==============================================++++++"+userInfo);
        request.getSession().setAttribute("pageInfo",pageInfo);//
        ModelAndView mv = new ModelAndView();
        mv.setViewName("harddisk");
        return mv;
    }

    @RequestMapping("searchIfExistHardDisk.do")
    @ResponseBody
    public String searchIfExistCpu(Harddisk harddisk, HttpServletRequest request, HttpServletResponse response){
        System.out.println("LLLLLLLLLLLLLLLLLL LLLLLLLLKKKKK"+harddisk.getHardDisk_id());
        Map map = new HashMap();
        if(request.getSession().getAttribute("harddiskList")==null){
            List<Harddisk> harddiskList=hdService.findSelectHarddisk(harddisk);
            for(int i=0;i<harddiskList.size();i++){
                harddiskList.get(i).setHardDisk_img("../"+harddiskList.get(i).getHardDisk_img());
            }
            request.getSession().setAttribute("harddiskList",harddiskList);
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
