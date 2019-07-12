package com.zhongruan.controller;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.google.gson.Gson;
import com.zhongruan.bean.*;
import com.zhongruan.service.ISheetService;
import com.zhongruan.service.impl.CpuService;
import com.zhongruan.service.impl.GraphicsService;
import com.zhongruan.service.impl.SheetSevice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import sun.plugin2.gluegen.runtime.CPU;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.*;

@Controller
@RequestMapping("sheet")
public class SheetController {
    @Autowired
    private SheetSevice sheetSevice;
    @Autowired
    private CpuService cpuService;
    @Autowired
    private GraphicsService graphicsService;
    @RequestMapping("publishSheet.do")
    public String publishSheet(HttpServletRequest request, HttpServletResponse response){
        Sheet sheet=new Sheet();
        if(request.getSession().getAttribute("cpuList")!=null){
            List cpuList=(List)request.getSession().getAttribute("cpuList");
            Cpu cpu=(Cpu)cpuList.get(0);
            int cpu_id=cpu.getCpu_id();
            sheet.setCpu_id(cpu_id);
        }


        if(request.getSession().getAttribute("memoryList")!=null) {
            List memoryList=(List)request.getSession().getAttribute("memoryList");
            Memory memory=(Memory)memoryList.get(0);
            int memory_id=memory.getMemory_id();
            sheet.setMemory_id(memory_id);
        }



        if(request.getSession().getAttribute("motherboardList")!=null) {
            List motherboardList=(List)request.getSession().getAttribute("motherboardList");
            Motherboard motherboard=(Motherboard)motherboardList.get(0);
            int motherboard_id=motherboard.getMotherboard_id();
            sheet.setMotherboard_id(motherboard_id);
        }

        if(request.getSession().getAttribute("harddiskList")!=null) {

            List harddiskList=(List)request.getSession().getAttribute("harddiskList");
            Harddisk harddisk=(Harddisk)harddiskList.get(0);
            int harddisk_id=harddisk.getHardDisk_id();
            sheet.setHarddisk_id(harddisk_id);
        }

        if(request.getSession().getAttribute("ssdList")!=null) {
            List ssdList=(List)request.getSession().getAttribute("ssdList");
            Ssd ssd=(Ssd)ssdList.get(0);
            int ssd_id=ssd.getSsd_id();
            sheet.setSsd_id(ssd_id);

        }

        if(request.getSession().getAttribute("graphicsList")!=null) {
            List graphicsList=(List)request.getSession().getAttribute("graphicsList");
            Graphics graphics=(Graphics)graphicsList.get(0);
            int graphics_id=graphics.getGraphics_id();
            sheet.setGraphics_id(graphics_id);
        }

        if(request.getSession().getAttribute("soundcardList")!=null) {
            List soundcardList=(List)request.getSession().getAttribute("soundcardList");
            Soundcard soundcard=(Soundcard)soundcardList.get(0);
            int soundcard_id=soundcard.getSoundCard_id();
            sheet.setSoundcard_id(soundcard_id);
        }

        if(request.getSession().getAttribute("netcardList")!=null) {
            List netcardList=(List)request.getSession().getAttribute("netcardList");
            Netcard netcard=(Netcard) netcardList.get(0);
            int netcard_id=netcard.getNetcard_id();
            sheet.setNetcard_id(netcard_id);
        }

        if(request.getSession().getAttribute("monitorList")!=null) {
            List monitorList=(List)request.getSession().getAttribute("monitorList");
            Monitor monitor =(Monitor) monitorList.get(0);
            int monitor_id=monitor.getMonitor_id();
            sheet.setMonitor_id(monitor_id);
        }

        if(request.getSession().getAttribute("powerList")!=null) {
            List powerList=(List)request.getSession().getAttribute("powerList");
            Power  power=(Power)powerList.get(0);
            int power_id=power.getPower_id();
            sheet.setPower_id(power_id);
        }

        if(request.getSession().getAttribute("mouseList")!=null) {
            List mouseList=(List)request.getSession().getAttribute("mouseList");
            Mouse mouse=(Mouse)mouseList.get(0);
            int mouse_id=mouse.getMouse_id();
            sheet.setMouse_id(mouse_id);
        }

        if(request.getSession().getAttribute("keyboardList")!=null) {
            List keyboardList=(List)request.getSession().getAttribute("keyboardList");
            Keyboard keyboard=(Keyboard) keyboardList.get(0);
            int keyboard_id=keyboard.getKeyboard_id();
            sheet.setKeyboard_id(keyboard_id);
        }

        if(request.getSession().getAttribute("selfInfo")!=null) {
            UserInfo userInfo=(UserInfo)request.getSession().getAttribute("selfInfo");
            String tel_num=userInfo.getTel_num();
            sheet.setTel_num(tel_num);
        }



        sheet.setDatetime(new Date(System.currentTimeMillis()));

        System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&"+sheet);
        sheetSevice.publish(sheet);
        System.out.println("插入成功");

        request.getSession().removeAttribute("cpuList");
        request.getSession().removeAttribute("memoryList");
        request.getSession().removeAttribute("motherboardList");
        request.getSession().removeAttribute("mouseList");

        request.getSession().removeAttribute("harddiskList");

        request.getSession().removeAttribute("ssdList");

        request.getSession().removeAttribute("graphicsList");

        request.getSession().removeAttribute("soundcardList");

        request.getSession().removeAttribute("netcardList");

        request.getSession().removeAttribute("monitorList");

        request.getSession().removeAttribute("powerList");

        request.getSession().removeAttribute("keyboardList");


//        ModelAndView mv = new ModelAndView();
//        mv.setViewName("main_cpu_logined");
//        return mv;
        return "redirect:/cpu/findAllCpuInformation.do?page=1&size=9";
    }


    @RequestMapping("findSelectSheet.do")//更新配置广场
    public String findSelectSheet(HttpServletRequest request, HttpServletResponse response){
        List<Cpu> cpu_list=new ArrayList<>();
        Sheet sheet=null;
        List<Sheet> sheetList=sheetSevice.findSelectSheet();
        for(int i=0;i<sheetList.size();i++){
            Cpu cpu=new Cpu();
            cpu.setCpu_id(sheetList.get(i).getCpu_id());
            System.out.println(cpu.getCpu_id());
            List<Cpu> CPULIST1=cpuService.findSelectCpu(cpu);
            if(CPULIST1!=null){
                cpu.setCpu_img("../"+CPULIST1.get(0).getCpu_img());
                System.out.println(cpu.getCpu_img());
                cpu_list.add(i,cpu);
            }
            else{
                cpu.setCpu_img("../empty.jpg");
                cpu_list.set(i,cpu);
            }
        }
        request.getSession().setAttribute("st",cpu_list.get(0).getCpu_img());
        for(int i=0;i< cpu_list.size();i++){
            System.out.println("last"+cpu_list.get(i).getCpu_img());
        }




        List<Graphics> graphics_list=new ArrayList<>();
        List<Sheet> sheetList1=sheetSevice.findSelectSheet();
        for(int i=0;i<sheetList1.size();i++){
            Graphics graphics=new Graphics();
            graphics.setGraphics_id(sheetList1.get(i).getGraphics_id());
            System.out.println(graphics.getGraphics_id());
            List<Graphics> graphics_list2=graphicsService.findSelectGraphics(graphics);
            if(graphics_list2!=null){
                graphics.setGraphics_img("../"+graphics_list2.get(0).getGraphics_img());
                System.out.println(graphics.getGraphics_img());
                graphics_list.add(i,graphics);
            }
            else{
                graphics.setGraphics_img("../empty.jpg");
                graphics_list.set(i,graphics);
            }
        }
        request.getSession().setAttribute("st",graphics_list.get(0).getGraphics_img());
        for(int i=0;i< cpu_list.size();i++){
            System.out.println("last"+graphics_list.get(i).getGraphics_img());
        }

        request.getSession().setAttribute("graphics_list",graphics_list);
        return "square";
    }





}
