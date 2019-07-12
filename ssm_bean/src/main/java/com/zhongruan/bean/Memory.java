package com.zhongruan.bean;

public class Memory {
    private int memory_id;//递增标识
    private String memory_name;//内存名称
    private String memory_brand;//内存品牌
    private double memory_price;//内存价格
    private String memory_kind;//内存类型
    private String memory_capacity;//内存容量
    private String memory_frequency;//内存主频率
    private String memory_url;//内存购买链接
    private String memory_img;//内存图片

    public int getMemory_id() {
        return memory_id;
    }

    public void setMemory_id(int memory_id) {
        this.memory_id = memory_id;
    }

    public String getMemory_name() {
        return memory_name;
    }

    public void setMemory_name(String memory_name) {
        this.memory_name = memory_name;
    }

    public String getMemory_brand() {
        return memory_brand;
    }

    public void setMemory_brand(String memory_brand) {
        this.memory_brand = memory_brand;
    }

    public double getMemory_price() {
        return memory_price;
    }

    public void setMemory_price(double memory_price) {
        this.memory_price = memory_price;
    }

    public String getMemory_kind() {
        return memory_kind;
    }

    public void setMemory_kind(String memory_kind) {
        this.memory_kind = memory_kind;
    }

    public String getMemory_capacity() {
        return memory_capacity;
    }

    public void setMemory_capacity(String memory_capacity) {
        this.memory_capacity = memory_capacity;
    }

    public String getMemory_frequency() {
        return memory_frequency;
    }

    public void setMemory_frequency(String memory_frequency) {
        this.memory_frequency = memory_frequency;
    }

    public String getMemory_url() {
        return memory_url;
    }

    public void setMemory_url(String memory_url) {
        this.memory_url = memory_url;
    }

    public String getMemory_img() {
        return memory_img;
    }

    public void setMemory_img(String memory_img) {
        this.memory_img = memory_img;
    }

    @Override
    public String toString() {
        return "Memory{" +
                "memory_id=" + memory_id +
                ", memory_name='" + memory_name + '\'' +
                ", memory_brand='" + memory_brand + '\'' +
                ", memory_price=" + memory_price +
                ", memory_kind='" + memory_kind + '\'' +
                ", memory_capatity='" + memory_capacity + '\'' +
                ", memory_frequency='" + memory_frequency + '\'' +
                ", memory_url='" + memory_url + '\'' +
                ", memory_img='" + memory_img + '\'' +
                '}';
    }
}
