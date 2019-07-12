package com.zhongruan.bean;

public class Monitor {
    private int monitor_id;//自增标识
    private String monitor_name;//显示器名称
    private String monitor_brand;//显示器品牌
    private double monitor_price;//显示器价格
    private double monitor_screenSize;//显示器屏幕尺寸
    private String monitor_produceKind;//显示器产品类型
    private String monitor_panelKind;//显示器面板类型
    private String monitor_mvInter;//显示器视频接口
    private String monitor_url;//显示器购买链接
    private String monitor_img;//显示器图片

    public int getMonitor_id() {
        return monitor_id;
    }

    public void setMonitor_id(int monitor_id) {
        this.monitor_id = monitor_id;
    }

    public String getMonitor_name() {
        return monitor_name;
    }

    public void setMonitor_name(String monitor_name) {
        this.monitor_name = monitor_name;
    }

    public String getMonitor_brand() {
        return monitor_brand;
    }

    public void setMonitor_brand(String monitor_brand) {
        this.monitor_brand = monitor_brand;
    }

    public double getMonitor_price() {
        return monitor_price;
    }

    public void setMonitor_price(double monitor_price) {
        this.monitor_price = monitor_price;
    }

    public double getMonitor_screenSize() {
        return monitor_screenSize;
    }

    public void setMonitor_screenSize(double monitor_screenSize) {
        this.monitor_screenSize = monitor_screenSize;
    }

    public String getMonitor_produceKind() {
        return monitor_produceKind;
    }

    public void setMonitor_produceKind(String monitor_produceKind) {
        this.monitor_produceKind = monitor_produceKind;
    }

    public String getMonitor_panelKind() {
        return monitor_panelKind;
    }

    public void setMonitor_panelKind(String monitor_panelKind) {
        this.monitor_panelKind = monitor_panelKind;
    }

    public String getMonitor_mvInter() {
        return monitor_mvInter;
    }

    public void setMonitor_mvInter(String monitor_mvInter) {
        this.monitor_mvInter = monitor_mvInter;
    }

    public String getMonitor_url() {
        return monitor_url;
    }

    public void setMonitor_url(String monitor_url) {
        this.monitor_url = monitor_url;
    }

    public String getMonitor_img() {
        return monitor_img;
    }

    public void setMonitor_img(String monitor_img) {
        this.monitor_img = monitor_img;
    }

    @Override
    public String toString() {
        return "Monitor{" +
                "monitor_id=" + monitor_id +
                ", monitor_name='" + monitor_name + '\'' +
                ", monitor_brand='" + monitor_brand + '\'' +
                ", monitor_price=" + monitor_price +
                ", monitor_screenSize=" + monitor_screenSize +
                ", monitor_produceKind='" + monitor_produceKind + '\'' +
                ", monitor_panelKind='" + monitor_panelKind + '\'' +
                ", monitor_mvInter='" + monitor_mvInter + '\'' +
                ", monitor_url='" + monitor_url + '\'' +
                ", monitor_img='" + monitor_img + '\'' +
                '}';
    }
}
