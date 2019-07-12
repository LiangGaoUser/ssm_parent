package com.zhongruan.bean;

public class Mouse {
    private int mouse_id; //自增标识
    private String mouse_name;//鼠标名称
    private String mouse_brand;//鼠标品牌
    private double mouse_price;//鼠标价格
    private String mouse_approType;//鼠标适用类型
    private String mouse_linkMethod;//鼠标连接方式
    private String mouse_inter;//鼠标接口
    private String mouse_workMethod;//鼠标工作方式
    private String mouse_url;//鼠标购买链接
    private String mouse_img;//鼠标图片

    public int getMouse_id() {
        return mouse_id;
    }

    public void setMouse_id(int mouse_id) {
        this.mouse_id = mouse_id;
    }

    public String getMouse_name() {
        return mouse_name;
    }

    public void setMouse_name(String mouse_name) {
        this.mouse_name = mouse_name;
    }

    public String getMouse_brand() {
        return mouse_brand;
    }

    public void setMouse_brand(String mouse_brand) {
        this.mouse_brand = mouse_brand;
    }

    public double getMouse_price() {
        return mouse_price;
    }

    public void setMouse_price(double mouse_price) {
        this.mouse_price = mouse_price;
    }

    public String getMouse_approType() {
        return mouse_approType;
    }

    public void setMouse_approType(String mouse_approType) {
        this.mouse_approType = mouse_approType;
    }

    public String getMouse_linkMethod() {
        return mouse_linkMethod;
    }

    public void setMouse_linkMethod(String mouse_linkMethod) {
        this.mouse_linkMethod = mouse_linkMethod;
    }

    public String getMouse_inter() {
        return mouse_inter;
    }

    public void setMouse_inter(String mouse_inter) {
        this.mouse_inter = mouse_inter;
    }

    public String getMouse_workMethod() {
        return mouse_workMethod;
    }

    public void setMouse_workMethod(String mouse_workMethod) {
        this.mouse_workMethod = mouse_workMethod;
    }

    public String getMouse_url() {
        return mouse_url;
    }

    public void setMouse_url(String mouse_url) {
        this.mouse_url = mouse_url;
    }

    public String getMouse_img() {
        return mouse_img;
    }

    public void setMouse_img(String mouse_img) {
        this.mouse_img = mouse_img;
    }

    @Override
    public String toString() {
        return "Mouse{" +
                "mouse_id=" + mouse_id +
                ", mouse_name='" + mouse_name + '\'' +
                ", mouse_brand='" + mouse_brand + '\'' +
                ", mouse_price=" + mouse_price +
                ", mouse_approType='" + mouse_approType + '\'' +
                ", mouse_linkMethod='" + mouse_linkMethod + '\'' +
                ", mouse_inter='" + mouse_inter + '\'' +
                ", mouse_workMethod='" + mouse_workMethod + '\'' +
                ", mouse_url='" + mouse_url + '\'' +
                ", mouse_img='" + mouse_img + '\'' +
                '}';
    }
}
