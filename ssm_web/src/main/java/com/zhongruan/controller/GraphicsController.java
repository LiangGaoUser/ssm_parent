package com.zhongruan.controller;


import com.github.pagehelper.PageInfo;
import com.google.gson.Gson;
import com.zhongruan.bean.*;
import com.zhongruan.service.impl.GraphicsService;
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
@RequestMapping("Graphics")
public class GraphicsController {
    @Autowired
    private GraphicsService graphicsService;

    @RequestMapping("findAllGraphicsInformation.do")
    public ModelAndView findAllGraphicsInformation(HttpServletRequest request, HttpServletResponse response, @RequestParam(defaultValue="1") int page, @RequestParam(defaultValue="4")int size){//
        List<Graphics> graphicsList=graphicsService.findAllGraphicsInformation(page,size);//
        for(int i=0;i<graphicsList.size();i++){
            graphicsList.get(i).setGraphics_img("../"+graphicsList.get(i).getGraphics_img());
            System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^"+graphicsList.get(i).getGraphics_id()+" "+graphicsList.get(i).getGraphics_img());
        }
        PageInfo pageInfo=new PageInfo(graphicsList);

        UserInfo userInfo=(UserInfo)request.getSession().getAttribute("selfInfo");
        System.out.println("findAllGraphicsnformation==============================================++++++"+userInfo);
        request.getSession().setAttribute("pageInfo",pageInfo);//
        ModelAndView mv = new ModelAndView();
        mv.setViewName("graphics");
        return mv;
    }

    @RequestMapping("searchIfExistGraphics.do")
    @ResponseBody
    public String searchIfExistCpu(Graphics graphics, HttpServletRequest request, HttpServletResponse response){
        System.out.println("LLLLLLLLLLLLLLLLLLLLLLLLLLKKKKK"+graphics.getGraphics_id());
        Map map = new HashMap();
        if(request.getSession().getAttribute("graphicsList")==null){
            List<Graphics> graphicsList=graphicsService.findSelectGraphics(graphics);
            for(int i=0;i<graphicsList.size();i++){
                graphicsList.get(i).setGraphics_img("../"+graphicsList.get(i).getGraphics_img());
            }
            request.getSession().setAttribute("graphicsList",graphicsList);
            map.put("flag","ok");
            System.out.println("flag=================OK");
        }
        else{
//            List<Graphics> graphicsList1=(List)request.getSession().getAttribute("graphicsList1");
//
//            for(int i=0;i<graphicsList1.size();i++){
//                System.out.println(graphicsList1.get(i).getGraphics_img()+"MMMMMMGraphics");
//            }
            map.put("flag","exist");
            System.out.println("flag=================EXISTGraphics");
        }
        Gson gson=new Gson();
        String str=gson.toJson(map);
        return str;
    }
}
