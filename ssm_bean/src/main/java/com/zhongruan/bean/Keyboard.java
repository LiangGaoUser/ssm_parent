package com.zhongruan.bean;

public class Keyboard {
    private int keyboard_id;//自增标识
    private String keyboard_name;//键盘名称
    private String keyboard_brand;//键盘品牌
    private double keyboard_price;//键盘价格
    private String keyboard_position;//键盘定位
    private String keyboard_linkMethod;//键盘连接方式
    private String keyboard_inter;//键盘接口
    private String keyboard_keyMethod;//键盘按键技术
    private String keyboard_url;//键盘购买链接
    private String keyboard_img;//键盘图片

    public int getKeyboard_id() {
        return keyboard_id;
    }

    public void setKeyboard_id(int keyboard_id) {
        this.keyboard_id = keyboard_id;
    }

    public String getKeyboard_name() {
        return keyboard_name;
    }

    public void setKeyboard_name(String keyboard_name) {
        this.keyboard_name = keyboard_name;
    }

    public String getKeyboard_brand() {
        return keyboard_brand;
    }

    public void setKeyboard_brand(String keyboard_brand) {
        this.keyboard_brand = keyboard_brand;
    }

    public double getKeyboard_price() {
        return keyboard_price;
    }

    public void setKeyboard_price(double keyboard_price) {
        this.keyboard_price = keyboard_price;
    }

    public String getKeyboard_position() {
        return keyboard_position;
    }

    public void setKeyboard_position(String keyboard_position) {
        this.keyboard_position = keyboard_position;
    }

    public String getKeyboard_linkMethod() {
        return keyboard_linkMethod;
    }

    public void setKeyboard_linkMethod(String keyboard_linkMethod) {
        this.keyboard_linkMethod = keyboard_linkMethod;
    }

    public String getKeyboard_inter() {
        return keyboard_inter;
    }

    public void setKeyboard_inter(String keyboard_inter) {
        this.keyboard_inter = keyboard_inter;
    }

    public String getKeyboard_keyMethod() {
        return keyboard_keyMethod;
    }

    public void setKeyboard_keyMethod(String keyboard_keyMethod) {
        this.keyboard_keyMethod = keyboard_keyMethod;
    }

    public String getKeyboard_url() {
        return keyboard_url;
    }

    public void setKeyboard_url(String keyboard_url) {
        this.keyboard_url = keyboard_url;
    }

    public String getKeyboard_img() {
        return keyboard_img;
    }

    public void setKeyboard_img(String keyboard_img) {
        this.keyboard_img = keyboard_img;
    }

    @Override
    public String toString() {
        return "Keyboard{" +
                "keyboard_id=" + keyboard_id +
                ", keyboard_name='" + keyboard_name + '\'' +
                ", keyboard_brand='" + keyboard_brand + '\'' +
                ", keyboard_price='" + keyboard_price + '\'' +
                ", keyboard_position='" + keyboard_position + '\'' +
                ", keyboard_linkMethod='" + keyboard_linkMethod + '\'' +
                ", keyboard_inter='" + keyboard_inter + '\'' +
                ", keyboard_keyMethod='" + keyboard_keyMethod + '\'' +
                ", keyboard_url='" + keyboard_url + '\'' +
                ", keyboard_img='" + keyboard_img + '\'' +
                '}';
    }
}
