package com.zhongruan.bean;

public class Motherboard {
    private int motherboard_id; //自增标识
    private String motherboard_name;//主板名称
    private String motherboard_brand;//主板品牌
    private double motherboard_price;//主板价格
    private String motherboard_slotType;//主板cpu插槽类型
    private String motherboard_chipset;//主板主芯片组
    private String motherboard_kind;//主板类型
    private String motherboard_inteChip;//主板集成芯片
    private String motherboard_img;//主板图片
    private String motherboard_url;//主板购买链接

    public int getMotherboard_id() {
        return motherboard_id;
    }

    public void setMotherboard_id(int motherboard_id) {
        this.motherboard_id = motherboard_id;
    }

    public String getMotherboard_name() {
        return motherboard_name;
    }

    public void setMotherboard_name(String motherboard_name) {
        this.motherboard_name = motherboard_name;
    }

    public String getMotherboard_brand() {
        return motherboard_brand;
    }

    public void setMotherboard_brand(String motherboard_brand) {
        this.motherboard_brand = motherboard_brand;
    }

    public double getMotherboard_price() {
        return motherboard_price;
    }

    public void setMotherboard_price(double motherboard_price) {
        this.motherboard_price = motherboard_price;
    }

    public String getMotherboard_slotType() {
        return motherboard_slotType;
    }

    public void setMotherboard_slotType(String motherboard_slotType) {
        this.motherboard_slotType = motherboard_slotType;
    }

    public String getMotherboard_chipset() {
        return motherboard_chipset;
    }

    public void setMotherboard_chipset(String motherboard_chipset) {
        this.motherboard_chipset = motherboard_chipset;
    }

    public String getMotherboard_kind() {
        return motherboard_kind;
    }

    public void setMotherboard_kind(String motherboard_kind) {
        this.motherboard_kind = motherboard_kind;
    }

    public String getMotherboard_inteChip() {
        return motherboard_inteChip;
    }

    public void setMotherboard_inteChip(String motherboard_inteChip) {
        this.motherboard_inteChip = motherboard_inteChip;
    }

    public String getMotherboard_img() {
        return motherboard_img;
    }

    public void setMotherboard_img(String motherboard_img) {
        this.motherboard_img = motherboard_img;
    }

    public String getMotherboard_url() {
        return motherboard_url;
    }

    public void setMotherboard_url(String motherboard_url) {
        this.motherboard_url = motherboard_url;
    }

    @Override
    public String toString() {
        return "Motherboard{" +
                "motherboard_id=" + motherboard_id +
                ", motherboard_name='" + motherboard_name + '\'' +
                ", motherboard_brand='" + motherboard_brand + '\'' +
                ", motherboard_price=" + motherboard_price +
                ", motherboard_slotType='" + motherboard_slotType + '\'' +
                ", motherboard_chipset='" + motherboard_chipset + '\'' +
                ", motherboard_kind='" + motherboard_kind + '\'' +
                ", motherboard_inteChip='" + motherboard_inteChip + '\'' +
                ", motherboard_img='" + motherboard_img + '\'' +
                ", motherboard_url='" + motherboard_url + '\'' +
                '}';
    }
}
