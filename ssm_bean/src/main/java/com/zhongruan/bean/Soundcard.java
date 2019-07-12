package com.zhongruan.bean;

public class Soundcard {
    private  int soundCard_id;//自增标识
    private  double soundCard_price;//声卡价格
    private String soundCard_brand;//声卡品牌
    private String soundCard_name;//声卡名称
    private String soundCard_approType;//声卡使用类型
    private String soundCard_busyInter;//声卡总线接口
    private String soundCard_channelSystem;//声卡声道系统
    private String soundCard_installMethod;//声卡安装方式
    private String soundCard_url;//声卡购买链接
    private String soundCard_img;//声卡图片

    public int getSoundCard_id() {
        return soundCard_id;
    }

    public void setSoundCard_id(int soundCard_id) {
        this.soundCard_id = soundCard_id;
    }

    public double getSoundCard_price() {
        return soundCard_price;
    }

    public void setSoundCard_price(double soundCard_price) {
        this.soundCard_price = soundCard_price;
    }

    public String getSoundCard_brand() {
        return soundCard_brand;
    }

    public void setSoundCard_brand(String soundCard_brand) {
        this.soundCard_brand = soundCard_brand;
    }

    public String getSoundCard_name() {
        return soundCard_name;
    }

    public void setSoundCard_name(String soundCard_name) {
        this.soundCard_name = soundCard_name;
    }

    public String getSoundCard_approType() {
        return soundCard_approType;
    }

    public void setSoundCard_approType(String soundCard_approType) {
        this.soundCard_approType = soundCard_approType;
    }

    public String getSoundCard_busyInter() {
        return soundCard_busyInter;
    }

    public void setSoundCard_busyInter(String soundCard_busyInter) {
        this.soundCard_busyInter = soundCard_busyInter;
    }

    public String getSoundCard_channelSystem() {
        return soundCard_channelSystem;
    }

    public void setSoundCard_channelSystem(String soundCard_channelSystem) {
        this.soundCard_channelSystem = soundCard_channelSystem;
    }

    public String getSoundCard_installMethod() {
        return soundCard_installMethod;
    }

    public void setSoundCard_installMethod(String soundCard_installMethod) {
        this.soundCard_installMethod = soundCard_installMethod;
    }

    public String getSoundCard_url() {
        return soundCard_url;
    }

    public void setSoundCard_url(String soundCard_url) {
        this.soundCard_url = soundCard_url;
    }

    public String getSoundCard_img() {
        return soundCard_img;
    }

    public void setSoundCard_img(String soundCard_img) {
        this.soundCard_img = soundCard_img;
    }

    @Override
    public String toString() {
        return "Soundcard{" +
                "soundCard_id=" + soundCard_id +
                ", soundCard_price=" + soundCard_price +
                ", soundCard_brand='" + soundCard_brand + '\'' +
                ", soundCard_name='" + soundCard_name + '\'' +
                ", soundCard_approType='" + soundCard_approType + '\'' +
                ", soundCard_busyInter='" + soundCard_busyInter + '\'' +
                ", soundCard_channelSystem='" + soundCard_channelSystem + '\'' +
                ", soundCard_installMethod='" + soundCard_installMethod + '\'' +
                ", soundCard_url='" + soundCard_url + '\'' +
                ", soundCard_img='" + soundCard_img + '\'' +
                '}';
    }
}
