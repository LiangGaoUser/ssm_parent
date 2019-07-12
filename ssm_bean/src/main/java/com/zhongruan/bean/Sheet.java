package com.zhongruan.bean;

import java.util.Date;

public class Sheet {
    private int sheet_id;//配置单id
    private int  cpu_id;//cpuid
    private int graphics_id;//显卡id
    private int harddisk_id;//硬盘id
    private int keyboard_id;//键盘id
    private int memory_id;//内存id
    private int monitor_id;//显示器id
    private int motherboard_id;//主板id
    private int mouse_id;//鼠标id
    private int netcard_id;//网卡id
    private int power_id;//电源id
    private int soundcard_id;//声卡id
    private int ssd_id;//固态硬盘id
    private String tel_num;//用户手机号
    private Date date;//发表日期

    public int getSheet_id() {
        return sheet_id;
    }

    public void setSheet_id(int sheet_id) {
        this.sheet_id = sheet_id;
    }

    public int getCpu_id() {
        return cpu_id;
    }

    public void setCpu_id(int cpu_id) {
        this.cpu_id = cpu_id;
    }

    public int getGraphics_id() {
        return graphics_id;
    }

    public void setGraphics_id(int graphics_id) {
        this.graphics_id = graphics_id;
    }

    public int getHarddisk_id() {
        return harddisk_id;
    }

    public void setHarddisk_id(int harddisk_id) {
        this.harddisk_id = harddisk_id;
    }

    public int getKeyboard_id() {
        return keyboard_id;
    }

    public void setKeyboard_id(int keyboard_id) {
        this.keyboard_id = keyboard_id;
    }

    public int getMemory_id() {
        return memory_id;
    }

    public void setMemory_id(int memory_id) {
        this.memory_id = memory_id;
    }

    public int getMonitor_id() {
        return monitor_id;
    }

    public void setMonitor_id(int monitor_id) {
        this.monitor_id = monitor_id;
    }

    public int getMotherboard_id() {
        return motherboard_id;
    }

    public void setMotherboard_id(int motherboard_id) {
        this.motherboard_id = motherboard_id;
    }

    public int getMouse_id() {
        return mouse_id;
    }

    public void setMouse_id(int mouse_id) {
        this.mouse_id = mouse_id;
    }

    public int getNetcard_id() {
        return netcard_id;
    }

    public void setNetcard_id(int netcard_id) {
        this.netcard_id = netcard_id;
    }

    public int getPower_id() {
        return power_id;
    }

    public void setPower_id(int power_id) {
        this.power_id = power_id;
    }

    public int getSoundcard_id() {
        return soundcard_id;
    }

    public void setSoundcard_id(int soundcard_id) {
        this.soundcard_id = soundcard_id;
    }

    public int getSsd_id() {
        return ssd_id;
    }

    public void setSsd_id(int ssd_id) {
        this.ssd_id = ssd_id;
    }

    public String getTel_num() {
        return tel_num;
    }

    public void setTel_num(String tel_num) {
        this.tel_num = tel_num;
    }

    public Date getDatetime() {
        return date;
    }

    public void setDatetime(Date datetime) {
        this.date = datetime;
    }

    @Override
    public String toString() {
        return "Sheet{" +
                "sheet_id=" + sheet_id +
                ", cpu_id=" + cpu_id +
                ", graphics_id=" + graphics_id +
                ", harddisk_id=" + harddisk_id +
                ", keyboard_id=" + keyboard_id +
                ", memory_id=" + memory_id +
                ", monitor_id=" + monitor_id +
                ", motherboard_id=" + motherboard_id +
                ", mouse_id=" + mouse_id +
                ", netcard_id=" + netcard_id +
                ", power_id=" + power_id +
                ", soundcard_id=" + soundcard_id +
                ", ssd_id=" + ssd_id +
                ", tel_num='" + tel_num + '\'' +
                ", datetime=" + date+
                '}';
    }
}
