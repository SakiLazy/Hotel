package com.hziee.hotel.Bean;

import lombok.Data;

import java.io.Serializable;

@Data
public class Admin implements Serializable {
    private String name;
    private String password;

    public Admin() {

    }

//    public Admin(String name, String password) {
//        this.name = name;
//        this.password = password;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public String getPassword() {
//        return password;
//    }
//
//    public void setPassword(String password) {
//        this.password = password;
//    }
//
//    @Override
//    public String toString() {
//        return "Admin{" +
//                "name='" + name + '\'' +
//                ", password='" + password + '\'' +
//                '}';
//    }
}
