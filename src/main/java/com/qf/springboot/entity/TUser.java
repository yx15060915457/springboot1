package com.qf.springboot.entity;


import lombok.Data;

@Data
public class TUser {
    private Integer id;

    private String username;

    private String password;

    private String email;

    private String image;

    private String isAdmin;
}