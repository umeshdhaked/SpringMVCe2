package com.stackroute.services;

import org.springframework.stereotype.Component;

@Component
public class User {
    String name;
    String psw;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPsw() {
        return psw;
    }

    public void setPsw(String psw) {
        this.psw = psw;
    }
}
