package com.example.mongodb_springboot.dto;

import com.example.mongodb_springboot.domain.User;

public class AuthorDTO {
    private String id;
    private String name;

    public AuthorDTO() {
    }

    public AuthorDTO(User user) {
        this.name = user.getName();
        this.id = user.getEmail();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}