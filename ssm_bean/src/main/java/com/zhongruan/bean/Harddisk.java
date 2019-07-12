package com.zhongruan.bean;

public class Harddisk {
    private int hardDisk_id;//递增标识
    private String hardDisk_name;//硬盘名称
    private String hardDisk_brand;//硬盘品牌
    private double hardDisk_price;//硬盘价格
    private String hardDisk_useKind;//适用类型
    private String hardDisk_capacity;//硬盘容量
    private String hardDisk_interKind;//接口类型
    private String hardDisk_speed;//接口转速
    private String hardDisk_sizeof;//硬盘尺寸
    private String hardDisk_cache;//硬盘缓存
    private String hardDisk_url;//显卡购买链接
    private String hardDisk_img;//显卡图片

    public int getHardDisk_id() {
        return hardDisk_id;
    }

    public void setHardDisk_id(int hardDisk_id) {
        this.hardDisk_id = hardDisk_id;
    }

    public String getHardDisk_name() {
        return hardDisk_name;
    }

    public void setHardDisk_name(String hardDisk_name) {
        this.hardDisk_name = hardDisk_name;
    }

    public String getHardDisk_brand() {
        return hardDisk_brand;
    }

    public void setHardDisk_brand(String hardDisk_brand) {
        this.hardDisk_brand = hardDisk_brand;
    }

    public double getHardDisk_price() {
        return hardDisk_price;
    }

    public void setHardDisk_price(double hardDisk_price) {
        this.hardDisk_price = hardDisk_price;
    }

    public String getHardDisk_useKind() {
        return hardDisk_useKind;
    }

    public void setHardDisk_useKind(String hardDisk_useKind) {
        this.hardDisk_useKind = hardDisk_useKind;
    }

    public String getHardDisk_capacity() {
        return hardDisk_capacity;
    }

    public void setHardDisk_capacity(String hardDisk_capacity) {
        this.hardDisk_capacity = hardDisk_capacity;
    }

    public String getHardDisk_interKind() {
        return hardDisk_interKind;
    }

    public void setHardDisk_interKind(String hardDisk_interKind) {
        this.hardDisk_interKind = hardDisk_interKind;
    }

    public String getHardDisk_speed() {
        return hardDisk_speed;
    }

    public void setHardDisk_speed(String hardDisk_speed) {
        this.hardDisk_speed = hardDisk_speed;
    }

    public String getHardDisk_sizeof() {
        return hardDisk_sizeof;
    }

    public void setHardDisk_sizeof(String hardDisk_sizeof) {
        this.hardDisk_sizeof = hardDisk_sizeof;
    }

    public String getHardDisk_cache() {
        return hardDisk_cache;
    }

    public void setHardDisk_cache(String hardDisk_cache) {
        this.hardDisk_cache = hardDisk_cache;
    }

    public String getHardDisk_url() {
        return hardDisk_url;
    }

    public void setHardDisk_url(String hardDisk_url) {
        this.hardDisk_url = hardDisk_url;
    }

    public String getHardDisk_img() {
        return hardDisk_img;
    }

    public void setHardDisk_img(String hardDisk_img) {
        this.hardDisk_img = hardDisk_img;
    }

    @Override
    public String toString() {
        return "Harddisk{" +
                "hardDisk_id=" + hardDisk_id +
                ", hardDisk_name='" + hardDisk_name + '\'' +
                ", hardDisk_brand='" + hardDisk_brand + '\'' +
                ", hardDisk_price='" + hardDisk_price + '\'' +
                ", hardDisk_useKind='" + hardDisk_useKind + '\'' +
                ", hardDisk_capacity='" + hardDisk_capacity + '\'' +
                ", hardDisk_interKind='" + hardDisk_interKind + '\'' +
                ", hardDisk_speed='" + hardDisk_speed + '\'' +
                ", hardDisk_sizeof='" + hardDisk_sizeof + '\'' +
                ", hardDisk_cache='" + hardDisk_cache + '\'' +
                ", hardDisk_url='" + hardDisk_url + '\'' +
                ", hardDisk_img='" + hardDisk_img + '\'' +
                '}';
    }
}
