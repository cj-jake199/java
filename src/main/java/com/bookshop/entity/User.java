package com.bookshop.entity;

import java.io.Serializable;

public class User implements Serializable {
    private String id;
    private String name;
    private String password;
    private String phoneNum;
    private float money;
    private String avatar;
    private String regTime;
    private String role;
    private int status;
    private String email;

    private String loginId;
    private String loginTime;
    private String ip;

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public float getMoney() {
        return money;
    }

    public String getAvatar() {
        return avatar;
    }

    public String getRegTime() {
        return regTime;
    }

    public String getRole() {
        return role;
    }

    public int getStatus() {
        return status;
    }

    public String getEmail() {
        return email;
    }

    public String getLoginId() {
        return loginId;
    }

    public String getLoginTime() {
        return loginTime;
    }

    public String getIp() {
        return ip;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public void setMoney(float money) {
        this.money = money;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public void setRegTime(String regTime) {
        this.regTime = regTime;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setLoginId(String loginId) {
        this.loginId = loginId;
    }

    public void setLoginTime(String loginTime) {
        this.loginTime = loginTime;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }
}
