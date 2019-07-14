package com.zhongruan.controller;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.google.gson.Gson;
import com.zhongruan.bean.*;
import com.zhongruan.service.ISheetService;
import com.zhongruan.service.impl.*;
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
    @Autowired
    private HardDiskService hardDiskService;
    @Autowired
    private KeyboardService keyboardService;
    @Autowired
    private MouseService mouseService;
    @Autowired
    private MemoryService memeoryService;
    @Autowired
    private MonitorService monitorService;
    @Autowired
    private NetCardService netCardService;
    @Autowired
    private MotherboardService motherboardService;
    @Autowired
    private PowerService powerService;
    @Autowired
    private SoundCardService soundCardService;
    @Autowired
    private SsdService ssdService;

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

        System.out.println(""+sheet);
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

        return "redirect:/cpu/findAllCpuInformation.do?page=1&size=9";
    }


    @RequestMapping("findSelectSheet.do")//更新配置广场
    public String findSelectSheet(HttpServletRequest request, HttpServletResponse response){
        //cpu
        List<Cpu> cpu_list=new ArrayList<>();
        List<Sheet> sheetList=sheetSevice.findSelectSheet();
        for(int i=0;i<sheetList.size();i++){
            Cpu cpu=new Cpu();
            cpu.setCpu_id(sheetList.get(i).getCpu_id());
            System.out.println(cpu.getCpu_id());
            List<Cpu> cpu_list2=cpuService.findSelectCpu(cpu);
            if(cpu_list2!=null){
                cpu.setCpu_img("../"+cpu_list2.get(0).getCpu_img());
                cpu.setCpu_name(cpu_list2.get(0).getCpu_name());
                System.out.println(cpu.getCpu_img());
                cpu_list.add(i,cpu);
            }
            else{
                cpu.setCpu_img("../empty.jpg");
                cpu.setCpu_name("配置单中没有cpu");
                cpu_list.set(i,cpu);
            }
        }
        for(int i=0;i< cpu_list.size();i++){
            System.out.println("cpu_img()"+cpu_list.get(i).getCpu_img());
        }
        request.getSession().setAttribute("cpu_list",cpu_list);



        //graphics
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
                graphics.setGraphics_name(graphics_list2.get(0).getGraphics_name());
                graphics_list.add(i,graphics);
            }
            else{
                graphics.setGraphics_img("../empty.jpg");
                graphics.setGraphics_name("配置单中没有显卡");
                graphics_list.set(i,graphics);
            }
        }
        for(int i=0;i< graphics_list.size();i++){
            System.out.println("graphics_img()"+graphics_list.get(i).getGraphics_img());
        }
        request.getSession().setAttribute("graphics_list",graphics_list);



        //harddisk
        List<Harddisk> harddisk_list=new ArrayList<>();
        List<Sheet> sheetList2=sheetSevice.findSelectSheet();
        for(int i=0;i<sheetList2.size();i++){
            Harddisk harddisk=new Harddisk();
            harddisk.setHardDisk_id(sheetList2.get(i).getGraphics_id());
            System.out.println(harddisk.getHardDisk_id());
            List<Harddisk> harddisk_list2=hardDiskService.findSelectHarddisk(harddisk);
            if(harddisk_list2!=null){
                harddisk.setHardDisk_img("../"+harddisk_list2.get(0).getHardDisk_img());
                harddisk.setHardDisk_name(harddisk_list2.get(0).getHardDisk_name());
                System.out.println(harddisk.getHardDisk_img());
                harddisk_list.add(i,harddisk);
            }
            else{
                harddisk.setHardDisk_img("../empty.jpg");
                harddisk.setHardDisk_name("配置单中没有硬盘");
                harddisk_list.set(i,harddisk);
            }
        }
        for(int i=0;i< harddisk_list.size();i++){
            System.out.println("harddisk_img()"+harddisk_list.get(i).getHardDisk_img());
        }
        request.getSession().setAttribute("harddisk_list",harddisk_list);


        //keyboard
        List<Keyboard> keyboard_list=new ArrayList<>();
        List<Sheet> sheetList3=sheetSevice.findSelectSheet();
        for(int i=0;i<sheetList3.size();i++){
            Keyboard keyboard=new Keyboard();
            keyboard.setKeyboard_id(sheetList3.get(i).getKeyboard_id());
            System.out.println(keyboard.getKeyboard_id());
            List<Keyboard> Keyboard_list2=keyboardService.findSelectKeyboard(keyboard);
            if(Keyboard_list2!=null){
                keyboard.setKeyboard_img("../"+Keyboard_list2.get(0).getKeyboard_img());
                keyboard.setKeyboard_name(Keyboard_list2.get(0).getKeyboard_name());
                System.out.println(keyboard.getKeyboard_img());
                keyboard_list.add(i,keyboard);
            }
            else{
                keyboard.setKeyboard_img("../empty.jpg");
                keyboard.setKeyboard_name("配置单中没有硬盘");
                keyboard_list.set(i,keyboard);
            }
        }
        for(int i=0;i< keyboard_list.size();i++){
            System.out.println("keyboard_img()"+keyboard_list.get(i).getKeyboard_img());
        }
        request.getSession().setAttribute("keyboard_list",keyboard_list);



        //mouse
        List<Mouse> mouse_list=new ArrayList<>();
        List<Sheet> sheetList4=sheetSevice.findSelectSheet();
        for(int i=0;i<sheetList4.size();i++){
            Mouse mouse=new Mouse();
            mouse.setMouse_id(sheetList4.get(i).getMouse_id());
            System.out.println(mouse.getMouse_id());
            List<Mouse> mouse_list2=mouseService.findSelectMouse(mouse);
            if(mouse_list2!=null){
                mouse.setMouse_img("../"+mouse_list2.get(0).getMouse_img());
                mouse.setMouse_name(mouse_list2.get(0).getMouse_name());
                System.out.println(mouse.getMouse_img());
                mouse_list.add(i,mouse);
            }
            else{
                mouse.setMouse_img("../empty.jpg");
                mouse.setMouse_name("配置单中没有鼠标");
                mouse_list.set(i,mouse);
            }
        }
        for(int i=0;i< mouse_list.size();i++){
            System.out.println("mouse_img()"+mouse_list.get(i).getMouse_img());
        }
        request.getSession().setAttribute("mouse_list",mouse_list);


        //memory
        List<Memory> memory_list=new ArrayList<>();
        List<Sheet> sheetList5=sheetSevice.findSelectSheet();
        for(int i=0;i<sheetList5.size();i++){
            Memory memory=new Memory();
            memory.setMemory_id(sheetList5.get(i).getMouse_id());
            System.out.println(memory.getMemory_id());
            List<Memory> memory_list2=memeoryService.findSelectMemory(memory);
            if(memory_list2!=null){
                memory.setMemory_img("../"+memory_list2.get(0).getMemory_img());
                memory.setMemory_name(memory_list2.get(0).getMemory_name());
                System.out.println(memory.getMemory_img());
                memory_list.add(i,memory);
            }
            else{
                memory.setMemory_img("../empty.jpg");
                memory.setMemory_name("配置单中没有内存条");
                memory_list.set(i,memory);
            }
        }
        for(int i=0;i< memory_list.size();i++){
            System.out.println("memory_img()"+memory_list.get(i).getMemory_img());
        }
        request.getSession().setAttribute("memory_list",memory_list);



        //monitor
        List<Monitor> monitor_list=new ArrayList<>();
        List<Sheet> sheetList6=sheetSevice.findSelectSheet();
        for(int i=0;i<sheetList5.size();i++){
            Monitor monitor=new Monitor();
            monitor.setMonitor_id(sheetList6.get(i).getMonitor_id());
            System.out.println(monitor.getMonitor_id());
            List<Monitor> monitor_list2=monitorService.findSelectMonitor(monitor);
            if(monitor_list2!=null){
                monitor.setMonitor_img("../"+monitor_list2.get(0).getMonitor_img());
                monitor.setMonitor_name(monitor_list2.get(0).getMonitor_name());
                System.out.println(monitor.getMonitor_img());
                monitor_list.add(i,monitor);
            }
            else{
                monitor.setMonitor_img("../empty.jpg");
                monitor.setMonitor_name("配置单中没有显示器");
                monitor_list.set(i,monitor);
            }
        }
        for(int i=0;i< monitor_list.size();i++){
            System.out.println("monitor_img()"+monitor_list.get(i).getMonitor_img());
        }
        request.getSession().setAttribute("monitor_list",monitor_list);


        //netcard
        List<Netcard> netcard_list=new ArrayList<>();
        List<Sheet> sheetList7=sheetSevice.findSelectSheet();
        for(int i=0;i<sheetList7.size();i++){
            Netcard netcard=new Netcard();
            netcard.setNetcard_id(sheetList7.get(i).getNetcard_id());
            System.out.println(netcard.getNetcard_id());
            List<Netcard> netcard_list2=netCardService.findSelectNetcard(netcard);
            if(netcard_list2!=null){
                netcard.setNetcard_img("../"+netcard_list2.get(0).getNetcard_img());
                netcard.setNetcard_name(netcard_list2.get(0).getNetcard_name());
                System.out.println(netcard.getNetcard_img());
                netcard_list.add(i,netcard);
            }
            else{
                netcard.setNetcard_img("../empty.jpg");
                netcard.setNetcard_name("配置单中没有网卡");
                netcard_list.set(i,netcard);
            }
        }
        for(int i=0;i< netcard_list.size();i++){
            System.out.println("netcard_img()"+netcard_list.get(i).getNetcard_img());
        }
        request.getSession().setAttribute("netcard_list",netcard_list);



        //motherboard
        System.out.println("begin motherboard");
        List<Motherboard> motherboard_list=new ArrayList<>();
        List<Sheet> sheetList8=sheetSevice.findSelectSheet();
        for(int i=0;i<sheetList8.size();i++){
            Motherboard motherboard=new Motherboard();
            motherboard.setMotherboard_id(sheetList8.get(i).getMotherboard_id());
            System.out.println(motherboard.getMotherboard_id());
            List<Motherboard> motherboard_list2=motherboardService.findSelectMotherboard(motherboard);
            if(motherboard_list2!=null){
                motherboard.setMotherboard_img("../"+motherboard_list2.get(0).getMotherboard_img());
                motherboard.setMotherboard_name(motherboard_list2.get(0).getMotherboard_name());
                System.out.println(motherboard.getMotherboard_img());
                motherboard_list.add(i,motherboard);
            }
            else{
                motherboard.setMotherboard_img("../empty.jpg");
                motherboard.setMotherboard_name("配置单中没有主板");
                motherboard_list.set(i,motherboard);
            }
        }
        for(int i=0;i< motherboard_list.size();i++){
            System.out.println("motherboard_img()"+motherboard_list.get(i).getMotherboard_img());
        }
        request.getSession().setAttribute("motherboard_list",motherboard_list);

        //power
        List<Power> power_list=new ArrayList<>();
        List<Sheet> sheetList9=sheetSevice.findSelectSheet();
        for(int i=0;i<sheetList9.size();i++){
            Power power=new Power();
            power.setPower_id(sheetList9.get(i).getPower_id());
            System.out.println(power.getPower_id());
            List<Power> power_list2=powerService.findSelectPower(power);
            if(power_list2!=null){
                power.setPower_img("../"+power_list2.get(0).getPower_img());
                power.setPower_name(power_list2.get(0).getPower_name());
                System.out.println(power.getPower_img());
                power_list.add(i,power);
            }
            else{
                power.setPower_img("../empty.jpg");
                power.setPower_name("配置单中没有电源");
                power_list.set(i,power);
            }
        }
        for(int i=0;i< power_list.size();i++){
            System.out.println("power_img()"+power_list.get(i).getPower_img());
        }
        request.getSession().setAttribute("power_list",power_list);


        //soundcard
        List<Soundcard> soundcard_list=new ArrayList<>();
        List<Sheet> sheetList10=sheetSevice.findSelectSheet();
        for(int i=0;i<sheetList10.size();i++){
            Soundcard soundcard=new Soundcard();
            soundcard.setSoundCard_id(sheetList10.get(i).getSoundcard_id());
            System.out.println(soundcard.getSoundCard_id());
            List<Soundcard> soundcard_list2=soundCardService.findSelectSoundCard(soundcard);
            if(soundcard_list2!=null){
                soundcard.setSoundCard_img("../"+soundcard_list2.get(0).getSoundCard_img());
                soundcard.setSoundCard_name(soundcard_list2.get(0).getSoundCard_name());
                System.out.println(soundcard.getSoundCard_img());
                soundcard_list.add(i,soundcard);
            }
            else{
                soundcard.setSoundCard_img("../empty.jpg");
                soundcard.setSoundCard_name("配置单中没有声卡");
                soundcard_list.set(i,soundcard);
            }
        }
        for(int i=0;i< soundcard_list.size();i++){
            System.out.println("soundcard_img()"+soundcard_list.get(i).getSoundCard_img());
        }
        request.getSession().setAttribute("soundcard_list",soundcard_list);


        //ssd
        List<Ssd> ssd_list=new ArrayList<>();
        List<Sheet> sheetList11=sheetSevice.findSelectSheet();
        for(int i=0;i<sheetList11.size();i++){
            Ssd ssd=new Ssd();
            ssd.setSsd_id(sheetList11.get(i).getSsd_id());
            System.out.println(ssd.getSsd_id());
            List<Ssd> ssd_list2=ssdService.findSelectSsd(ssd);
            if(ssd_list2!=null){
                ssd.setSsd_img("../"+ssd_list2.get(0).getSsd_img());
                ssd.setSsd_name(ssd_list2.get(0).getSsd_name());
                System.out.println(ssd.getSsd_img());
                ssd_list.add(i,ssd);
            }
            else{
                ssd.setSsd_img("../empty.jpg");
                ssd.setSsd_name("配置单中没有固态硬盘");
                ssd_list.set(i,ssd);
            }
        }
        for(int i=0;i< ssd_list.size();i++){
            System.out.println("ssd_img()"+ssd_list.get(i).getSsd_img());
        }
        request.getSession().setAttribute("ssd_list",ssd_list);







        return "square";
    }





}
