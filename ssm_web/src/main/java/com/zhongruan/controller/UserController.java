package com.zhongruan.controller;

import com.github.pagehelper.PageInfo;
import com.zhongruan.bean.*;

import com.zhongruan.service.ICpuService;
import com.zhongruan.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.*;

@Controller
@RequestMapping("user")
public class UserController {
    @Autowired
    private IUserService userService;
    private UserInfo userInfo;
//    @Autowired
//    private ICpuService cpuService;

  /*  @RequestMapping("/findAll.do")
    public ModelAndView findAll(@RequestParam(defaultValue="1") int page, @RequestParam(defaultValue="2")int size){
        ModelAndView mv=new ModelAndView();
        List<UserInfo> userInfos=userService.findAll(page,size);
        PageInfo pageInfo=new PageInfo(userInfos);
        mv.addObject("infos",pageInfo);
        mv.setViewName("user-list");
        return mv;
    }

    @RequestMapping("/delete.do")
    public String delete (int id){
        userService.delete(id);
        return "redirect:findAll.do";
    }
    */
  /*
    @RequestMapping("toChangePassword.do")
    public ModelAndView toChangePassword(){
        ModelAndView mv=new ModelAndView();
        UserInfo userInfo1=this.userInfo;
        userInfo1.setPassword("");

        Map map=new HashMap();
        map.put("password" ,userInfo1.getPassword());
        map.put("username" ,userInfo1.getUsername());
        map.put("tel_num" ,userInfo1.getTel_num());
        map.put("id",userInfo1.getId());
        String oldpassword="bbb";
        map.put("oldpassword",oldpassword);

        //mv.addObject("passwordUserInfo",userInfo1);
        mv.addObject("map",map);
        mv.setViewName("user-change-password");
        return mv;
    }

    @RequestMapping("changePassword.do")
    public String changePassword(Map map){
        if(map.isEmpty()){
            System.out.println("null");
        }
        System.out.println(""+userInfo+"");
        System.out.println((String)map.get("username")+(String)map.get("password")+(String)map.get("id")+(String)map.get("tel_num")+(String)map.get("oldpassword"));
        userService.changePassWord(map);
       // this.userInfo=userInfo;
        return "redirect:findself.do";

    }*/
  @RequestMapping("/findself.do")
  public ModelAndView findself() {
      ModelAndView mv = new ModelAndView();
      mv.setViewName("user-list");
      return mv;
  }
    @RequestMapping("tochangetel_num.do")
    public ModelAndView tochangetel_num() {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("user-changetel_num");
        return mv;
    }

    @RequestMapping("changetel_num.do")
    public String changetel_num(HttpServletRequest request, HttpServletResponse response,UserInfo userInfo) {
        userService.changetel_num(userInfo);
        UserInfo userInfo1=userService.forID(userInfo);
        request.getSession().setAttribute("selfInfo",userInfo1);
        return "redirect:findself.do";

    }

    @RequestMapping("toChangePassword.do")
    public ModelAndView toChangePassword(HttpServletRequest request, HttpServletResponse response) {
        ModelAndView mv = new ModelAndView();
        //UserInfo userInfo1 = this.userInfo;
        UserInfo userInfo1=(UserInfo)request.getSession().getAttribute("selfInfo");
        userInfo1.setPassword("");
        String promptText = "请输入新密码";
        mv.addObject("promptText", promptText);
        mv.addObject("passwordUserInfo", userInfo1);
        mv.setViewName("user-change-password");
        return mv;
    }

    @RequestMapping("changePassword.do")
    public String changePassword(HttpServletRequest request, HttpServletResponse response, UserInfo userinfo1, String oldpassword) {
        System.out.println("**" + userinfo1.getPassword() + "**" + userinfo1.getUsername() + "*" + userinfo1.getTel_num() + "*" + oldpassword);
        Map map = new HashMap();
        map.put("id", userinfo1.getId());
        map.put("username", userinfo1.getUsername());
        map.put("password", userinfo1.getPassword());
        map.put("tel_num", userinfo1.getTel_num());
        map.put("oldpassword", oldpassword);

        userinfo1.setPassword(oldpassword);
        System.out.println("**"+userService.queryByNumAndPwd(userinfo1));
        if (userService.queryByNumAndPwd(userinfo1) != null) {
            userService.changePassWord(map);
            request.getSession().setAttribute("selfInfo",userinfo1);
            return "redirect:findself.do";
        } else {
           return "redirect:errorPasswordShow.do";
        }

    }
    @RequestMapping("errorPasswordShow.do")
    public  ModelAndView errPaswordShow(){
        String promptText = "密码错误";
        ModelAndView mv = new ModelAndView();
        UserInfo passwordUserInfo=new UserInfo();
        passwordUserInfo=this.userInfo;
        passwordUserInfo.setPassword("");
        mv.addObject("passwordUserInfo", passwordUserInfo);
        mv.addObject("promptText", promptText);
        mv.setViewName("user-change-password");
        return mv;
    }

    @RequestMapping("/toupdate.do")
    public String toupdate(Model model,int id){
        UserInfo userInfo=userService.queryById(id);
        model.addAttribute("updateuser",userInfo);
        return "user-update";

    }

    @RequestMapping("/update.do")
    public String update(Model model,UserInfo userInfo) {
        Map map=new HashMap<>();
        map.put("id",userInfo.getId());
        map.put("username",userInfo.getUsername());
        map.put("password",userInfo.getPassword());
        userService.update(map);
        return "redirect:findAll.do";
    }

    /*@RequestMapping("newlogin.do")
    public ModelAndView newlogin(UserInfo userInfo,HttpServletRequest request,HttpServletResponse response){
        System.out.println(userInfo);
        Boolean flag=userService.dologin(userInfo);
        ModelAndView mv=new ModelAndView();

        if(flag){
            UserInfo selfInfo=userService.forID(userInfo);
            this.userInfo=selfInfo;
            request.getSession().setAttribute("selfInfo",selfInfo);

//            List<Cpu> cpuList=cpuService.findAllCpuInformation();
//            System.out.println("============="+cpuList+"============");
//            request.getSession().setAttribute("cpuList",cpuList);








            mv.setViewName("main_cpu_logined");
            return mv;
        }
        else{
            String promptText="账号密码错误";
            mv.addObject("promptText1", promptText);
            mv.setViewName("loginin");
            return mv;
        }

    }*/


    @RequestMapping("newlogin.do")
    public ModelAndView newlogin(UserInfo userInfo,HttpServletRequest request,HttpServletResponse response){
        System.out.println(userInfo);
        Boolean flag=userService.dologin(userInfo);
        ModelAndView mv=new ModelAndView();
        if(flag){
            UserInfo selfInfo=userService.forID(userInfo);
            this.userInfo=selfInfo;

            System.out.println("{{{{{{{{{{{{{{{{{{"+selfInfo);
            request.getSession().setAttribute("selfInfo",selfInfo);
            //mv.addObject("selfInfo",selfInfo);//



            if(request.getSession().getAttribute("cpuList")!=null){
                request.getSession().removeAttribute("cpuList");
            }




            if(request.getSession().getAttribute("memoryList")!=null) {
                request.getSession().removeAttribute("memoryList");
            }



            if(request.getSession().getAttribute("motherboardList")!=null) {
                request.getSession().removeAttribute("motherboardList");

            }

            if(request.getSession().getAttribute("harddiskList")!=null) {

                request.getSession().removeAttribute("harddiskList");
            }

            if(request.getSession().getAttribute("ssdList")!=null) {

                request.getSession().removeAttribute("ssdList");
            }

            if(request.getSession().getAttribute("graphicsList")!=null) {
                request.getSession().removeAttribute("graphicsList");
            }

            if(request.getSession().getAttribute("soundcardList")!=null) {

                request.getSession().removeAttribute("soundcardList");

            }

            if(request.getSession().getAttribute("netcardList")!=null) {
                request.getSession().removeAttribute("netcardList");
            }

            if(request.getSession().getAttribute("monitorList")!=null) {
                request.getSession().removeAttribute("monitorList");
            }

            if(request.getSession().getAttribute("powerList")!=null) {
                request.getSession().removeAttribute("powerList");
            }

            if(request.getSession().getAttribute("mouseList")!=null) {
                request.getSession().removeAttribute("mouseList");
            }

            if(request.getSession().getAttribute("keyboardList")!=null) {
                request.getSession().removeAttribute("keyboardList");
            }





            mv.setViewName("redirect:/cpu/findAllCpuInformation.do?page=1&size=9");
        }
        else{
            String promptText="账号密码错误";
            mv.addObject("promptText1", promptText);
            mv.setViewName("loginin");

        }
        return mv;
    }



















//    @RequestMapping("newlogin.do")
//    public String newlogin(UserInfo userInfo, RedirectAttributes redirectAttributes){
//        System.out.println("*************"+userInfo+"*************");
//        System.out.println(userInfo);
//        Boolean flag=userService.dologin(userInfo);
//
//        if(flag){
//            UserInfo selfInfo=userService.forID(userInfo);
//            this.userInfo=selfInfo;
//            System.out.println(selfInfo+"** ***********");
//           return "redirect:pages/mainin.jsp";
//        }
//        else{
//            String promptText="账号密码错误";
//            //redirectAttributes.addFlashAttribute("promptText", "账号密码错误");
//            redirectAttributes.addAttribute("promptText1", promptText);
//            return "redirect:pages/loginin.jsp";
//        }
//
//    }

    @RequestMapping("tologin.do")//主界面跳到登录界面
    public ModelAndView tologin(){
        ModelAndView mv=new ModelAndView();
        mv.setViewName("loginin");
        return mv;
    }
    @RequestMapping("toRegister.do")//主界面跳到注册界面
    public ModelAndView toRegister(){
        ModelAndView mv=new ModelAndView();
        mv.setViewName("register");
        return mv;
    }
    @RequestMapping("register.do")
    public ModelAndView register(UserInfo userInfo){
        System.out.println("#############"+userInfo);
        ModelAndView mv = new ModelAndView();
        UserInfo userInfo1 = userService.forID(userInfo);
        if(userInfo1!=null ){
            //返回手机号已存在
            String message="手机号已被注册";
            mv.addObject("message",message);
            mv.setViewName("register");
        }else {
            userService.register(userInfo);
            UserInfo userInfo2=userService.forID(userInfo);
            mv.setViewName("mainin");
//            mv.addObject("selfName",userInfo2.getUsername());

        }
        return mv;
    }

    @RequestMapping("toSelfPage.do")
    public ModelAndView toSelfPage(){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("main");
        return mv;
    }
    @RequestMapping("toMain.do")
    public ModelAndView toMain(){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("main_cpu_logined");
        return mv;
    }



}
