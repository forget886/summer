package com.xinwu.bean;

/**
 * @author: 张辉
 * @create: 2019-07-15
 **/
public class Computer {

    public Computer(){}

    public Computer(String name){
        this.name = name;
    }

    private String name;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "name='" + name + '\'' +
                '}';
    }
}
