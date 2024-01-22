package com.minpractice.interfaceExample;

public abstract class member implements OrderInter{
    private String name;
    public member(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }

    public abstract void memuMade();
}
