package com.zhongruan.bean;

public class Power {
    private int power_id; //自增标识
    private String power_name;//电源名称
    private double power_price;//电源价格
    private String power_brand;//电源品牌
    private int power_ratePower;//电源额定功率
    private String power_outlineType;//电源出线类型
    private String power_kind;//电源类型
    private String power_url;//电源购买链接
    private String power_img;//电源图片

    public int getPower_id() {
        return power_id;
    }

    public void setPower_id(int power_id) {
        this.power_id = power_id;
    }

    public String getPower_name() {
        return power_name;
    }

    public void setPower_name(String power_name) {
        this.power_name = power_name;
    }

    public double getPower_price() {
        return power_price;
    }

    public void setPower_price(double power_price) {
        this.power_price = power_price;
    }

    public String getPower_brand() {
        return power_brand;
    }

    public void setPower_brand(String power_brand) {
        this.power_brand = power_brand;
    }

    public int getPower_ratePower() {
        return power_ratePower;
    }

    public void setPower_ratePower(int power_ratePower) {
        this.power_ratePower = power_ratePower;
    }

    public String getPower_outlineType() {
        return power_outlineType;
    }

    public void setPower_outlineType(String power_outlineType) {
        this.power_outlineType = power_outlineType;
    }

    public String getPower_kind() {
        return power_kind;
    }

    public void setPower_kind(String power_kind) {
        this.power_kind = power_kind;
    }

    public String getPower_url() {
        return power_url;
    }

    public void setPower_url(String power_url) {
        this.power_url = power_url;
    }

    public String getPower_img() {
        return power_img;
    }

    public void setPower_img(String power_img) {
        this.power_img = power_img;
    }

    @Override
    public String toString() {
        return "Power{" +
                "power_id=" + power_id +
                ", power_name='" + power_name + '\'' +
                ", power_price=" + power_price +
                ", power_brand='" + power_brand + '\'' +
                ", power_ratePower=" + power_ratePower +
                ", power_outlineType='" + power_outlineType + '\'' +
                ", power_kind='" + power_kind + '\'' +
                ", power_url='" + power_url + '\'' +
                ", power_img='" + power_img + '\'' +
                '}';
    }
}
