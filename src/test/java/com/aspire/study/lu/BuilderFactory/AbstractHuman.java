package com.aspire.study.lu.BuilderFactory;


public class AbstractHuman {
    protected String name;

    protected int age;

    protected String caeer;

    protected boolean isSingal;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCaeer() {
        return caeer;
    }

    public void setCaeer(String caeer) {
        this.caeer = caeer;
    }

    public boolean isSingal() {
        return isSingal;
    }

    public void setSingal(boolean singal) {
        isSingal = singal;
    }
}
