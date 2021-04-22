package com.lk.pojo;

import java.util.Date;

public class Pet {
    private Integer petid;

    private String petname;

    private String petbreed;

    private String petsex;

    private Date birthday;

    private String desc;

    public Integer getPetid() {
        return petid;
    }

    public void setPetid(Integer petid) {
        this.petid = petid;
    }

    public String getPetname() {
        return petname;
    }

    public void setPetname(String petname) {
        this.petname = petname == null ? null : petname.trim();
    }

    public String getPetbreed() {
        return petbreed;
    }

    public void setPetbreed(String petbreed) {
        this.petbreed = petbreed == null ? null : petbreed.trim();
    }

    public String getPetsex() {
        return petsex;
    }

    public void setPetsex(String petsex) {
        this.petsex = petsex == null ? null : petsex.trim();
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc == null ? null : desc.trim();
    }
}