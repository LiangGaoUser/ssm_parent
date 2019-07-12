package com.zhongruan.bean;

public class Graphics {
    private int graphics_id;//自增标识
    private String graphics_brand;//显卡品牌
    private String graphics_kind;//显卡类型
    private double graphics_price;//显卡价格
    private String graphics_chip;//显卡芯片
    private int graphics_capacity;//显存容量
    private String graphics_memorykind;//显存类型
    private String graphics_ioInter;//Io接口类型
    private String graphics_name;//显卡名称
    private String graphics_url;//显卡购买链接
    private String graphics_img;//显卡图片

    public int getGraphics_id() {
        return graphics_id;
    }

    public void setGraphics_id(int graphics_id) {
        this.graphics_id = graphics_id;
    }

    public String getGraphics_brand() {
        return graphics_brand;
    }

    public void setGraphics_brand(String graphics_brand) {
        this.graphics_brand = graphics_brand;
    }

    public String getGraphics_kind() {
        return graphics_kind;
    }

    public void setGraphics_kind(String graphics_kind) {
        this.graphics_kind = graphics_kind;
    }

    public double getGraphics_price() {
        return graphics_price;
    }

    public void setGraphics_price(double graphics_price) {
        this.graphics_price = graphics_price;
    }

    public String getGraphics_chip() {
        return graphics_chip;
    }

    public void setGraphics_chip(String graphics_chip) {
        this.graphics_chip = graphics_chip;
    }

    public int getGraphics_capacity() {
        return graphics_capacity;
    }

    public void setGraphics_capacity(int graphics_capacity) {
        this.graphics_capacity = graphics_capacity;
    }

    public String getGraphics_memorykind() {
        return graphics_memorykind;
    }

    public void setGraphics_memorykind(String graphics_memorykind) {
        this.graphics_memorykind = graphics_memorykind;
    }

    public String getGraphics_ioInter() {
        return graphics_ioInter;
    }

    public void setGraphics_ioInter(String graphics_ioInter) {
        this.graphics_ioInter = graphics_ioInter;
    }

    public String getGraphics_name() {
        return graphics_name;
    }

    public void setGraphics_name(String graphics_name) {
        this.graphics_name = graphics_name;
    }

    public String getGraphics_url() {
        return graphics_url;
    }

    public void setGraphics_url(String graphics_url) {
        this.graphics_url = graphics_url;
    }

    public String getGraphics_img() {
        return graphics_img;
    }

    public void setGraphics_img(String graphics_img) {
        this.graphics_img = graphics_img;
    }

    @Override
    public String toString() {
        return "Graphics{" +
                "graphics_id=" + graphics_id +
                ", graphics_brand='" + graphics_brand + '\'' +
                ", graphics_kind='" + graphics_kind + '\'' +
                ", graphics_price='" + graphics_price + '\'' +
                ", graphics_chip='" + graphics_chip + '\'' +
                ", graphics_capacity='" + graphics_capacity + '\'' +
                ", graphics_memorykind='" + graphics_memorykind + '\'' +
                ", graphics_ioInter='" + graphics_ioInter + '\'' +
                ", graphics_name='" + graphics_name + '\'' +
                ", graphics_url='" + graphics_url + '\'' +
                ", graphics_img='" + graphics_img + '\'' +
                '}';
    }
}
