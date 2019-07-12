package com.zhongruan.controller;
import com.github.pagehelper.PageInfo;
import com.google.gson.Gson;
import com.zhongruan.bean.Netcard;
import com.zhongruan.bean.UserInfo;
import com.zhongruan.service.impl.NetCardService;
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
@RequestMapping("NetCard")
public class NetCardController {
    @Autowired
    private NetCardService netCardService;
    @RequestMapping("findAllNetCardInformation.do")
    public ModelAndView findAllNetCardInformation(HttpServletRequest request, HttpServletResponse response, @RequestParam(defaultValue="1") int page, @RequestParam(defaultValue="4")int size){//
        List<Netcard> netcardList=netCardService.findAllNetCardInformation(page,size);//
        for(int i=0;i<netcardList.size();i++){
            netcardList.get(i).setNetcard_img("../"+netcardList.get(i).getNetcard_img());
            System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%"+netcardList.get(i).getNetcard_id()+" "+netcardList.get(i).getNetcard_img());
        }
        PageInfo pageInfo=new PageInfo(netcardList);//
        UserInfo userInfo=(UserInfo)request.getSession().getAttribute("selfInfo");
        System.out.println("findAllCPuInformation==============================================++++++"+userInfo);
        request.getSession().setAttribute("pageInfo",pageInfo);//
        ModelAndView mv = new ModelAndView();
        mv.setViewName("netcard");
        return mv;
    }


    @RequestMapping("searchIfExistNetCard.do")
    @ResponseBody
    public String searchIfExistNetCard(Netcard netcard, HttpServletRequest request, HttpServletResponse response){
        System.out.println("LLLLLLLLLLLLLLLLLLLLLLLLLLKKKKK"+netcard.getNetcard_id());
        Map map = new HashMap();
        if(request.getSession().getAttribute("netcardList")==null){
            List<Netcard> netcardList=netCardService.findSelectNetcard(netcard);
            for(int i=0;i<netcardList.size();i++){
                netcardList.get(i).setNetcard_img("../"+netcardList.get(i).getNetcard_img());
            }
            request.getSession().setAttribute("netcardList",netcardList);
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
