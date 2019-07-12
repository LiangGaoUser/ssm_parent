package com.zhongruan.bean;

public class Netcard {
    private int netcard_id; //自增标识
    private double netcard_price;//网卡价格
    private String netcard_brand;//网卡品牌
    private String netcard_name;//网卡名称
    private String netcard_netType;//网卡适用网络类型
    private String netcard_netInterType;//网卡接口类型
    private String netcard_pciKind;//网卡总线类型
    private String netcard_tranSpeed;//网卡传输速率
    private String netcard_url;//网卡购买链接e
    private String netcard_img;//网卡图片

    public int getNetcard_id() {
        return netcard_id;
    }

    public void setNetcard_id(int netcard_id) {
        this.netcard_id = netcard_id;
    }

    public double getNetcard_price() {
        return netcard_price;
    }

    public void setNetcard_price(double netcard_price) {
        this.netcard_price = netcard_price;
    }

    public String getNetcard_brand() {
        return netcard_brand;
    }

    public void setNetcard_brand(String netcard_brand) {
        this.netcard_brand = netcard_brand;
    }

    public String getNetcard_name() {
        return netcard_name;
    }

    public void setNetcard_name(String netcard_name) {
        this.netcard_name = netcard_name;
    }

    public String getNetcard_netType() {
        return netcard_netType;
    }

    public void setNetcard_netType(String netcard_netType) {
        this.netcard_netType = netcard_netType;
    }

    public String getNetcard_netInterType() {
        return netcard_netInterType;
    }

    public void setNetcard_netInterType(String netcard_netInterType) {
        this.netcard_netInterType = netcard_netInterType;
    }

    public String getNetcard_pciKind() {
        return netcard_pciKind;
    }

    public void setNetcard_pciKind(String netcard_pciKind) {
        this.netcard_pciKind = netcard_pciKind;
    }

    public String getNetcard_tranSpeed() {
        return netcard_tranSpeed;
    }

    public void setNetcard_tranSpeed(String netcard_tranSpeed) {
        this.netcard_tranSpeed = netcard_tranSpeed;
    }

    public String getNetcard_url() {
        return netcard_url;
    }

    public void setNetcard_url(String netcard_url) {
        this.netcard_url = netcard_url;
    }

    public String getNetcard_img() {
        return netcard_img;
    }

    public void setNetcard_img(String netcard_img) {
        this.netcard_img = netcard_img;
    }


    @Override
    public String toString() {
        return "Netcard{" +
                "netcard_id=" + netcard_id +
                ", netcard_price=" + netcard_price +
                ", netcard_brand='" + netcard_brand + '\'' +
                ", netcard_name='" + netcard_name + '\'' +
                ", netcard_netType='" + netcard_netType + '\'' +
                ", netcard_netInterType='" + netcard_netInterType + '\'' +
                ", netcard_pciKind='" + netcard_pciKind + '\'' +
                ", netcard_tranSpeed='" + netcard_tranSpeed + '\'' +
                ", netcard_url='" + netcard_url + '\'' +
                ", netcard_img='" + netcard_img + '\'' +
                '}';
    }
}
