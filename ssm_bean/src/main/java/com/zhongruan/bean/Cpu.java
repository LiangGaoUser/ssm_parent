package com.zhongruan.bean;


public class Cpu {
    private int    cpu_id;//递增标识
    private String cpu_name;//cpu名称
    private String cpu_brand;//cpu品牌
    private String cpu_series;//cpu系列
    private String cpu_slotType;//cpu插槽类型
    private int    cpu_coreNumber;//cpu核心数量
    private double cpu_price;//cpu价格
    private String cpu_integTool;//cpu集成显卡
    private String cpu_img;//cpu图片
    private String cpu_url;//cpu链接

    public int getCpu_id() {
        return cpu_id;
    }

    public void setCpu_id(int cpu_id) {
        this.cpu_id = cpu_id;
    }

    public String getCpu_name() {
        return cpu_name;
    }

    public void setCpu_name(String cpu_name) {
        this.cpu_name = cpu_name;
    }

    public String getCpu_brand() {
        return cpu_brand;
    }

    public void setCpu_brand(String cpu_brand) {
        this.cpu_brand = cpu_brand;
    }

    public String getCpu_series() {
        return cpu_series;
    }

    public void setCpu_series(String cpu_series) {
        this.cpu_series = cpu_series;
    }

    public String getCpu_slotType() {
        return cpu_slotType;
    }

    public void setCpu_slotType(String cpu_slotType) {
        this.cpu_slotType = cpu_slotType;
    }

    public int getCpu_coreNumber() {
        return cpu_coreNumber;
    }

    public void setCpu_coreNumber(int cpu_coreNumber) {
        this.cpu_coreNumber = cpu_coreNumber;
    }

    public double getCpu_price() {
        return cpu_price;
    }

    public void setCpu_price(double cpu_price) {
        this.cpu_price = cpu_price;
    }

    public String getCpu_integTool() {
        return cpu_integTool;
    }

    public void setCpu_integTool(String cpu_integTool) {
        this.cpu_integTool = cpu_integTool;
    }

    public String getCpu_img() {
        return cpu_img;
    }

    public void setCpu_img(String cpu_img) {
        this.cpu_img = cpu_img;
    }

    public String getCpu_url() {
        return cpu_url;
    }

    public void setCpu_url(String cpu_url) {
        this.cpu_url = cpu_url;
    }

    @Override
    public String toString() {
        return "Cpu{" +
                "cpu_id=" + cpu_id +
                ", cpu_name='" + cpu_name + '\'' +
                ", cpu_brand='" + cpu_brand + '\'' +
                ", cpu_series='" + cpu_series + '\'' +
                ", cpu_slotType='" + cpu_slotType + '\'' +
                ", cpu_coreNumber=" + cpu_coreNumber +
                ", cpu_price=" + cpu_price +
                ", cpu_integTool='" + cpu_integTool + '\'' +
                ", cpu_img='" + cpu_img + '\'' +
                ", cpu_url='" + cpu_url + '\'' +
                '}';
    }
}
