package com.freecryptolabs.bitpague.models;

import jakarta.persistence.*;
import java.util.UUID;

@Entity(name = "USERS")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", updatable = false, unique = true,nullable = false)
    private Integer id;

    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "external_id", updatable = false, unique = true,nullable = false)
    private UUID external_id;

    @Column(name = "name",nullable = false)
    private String name;

    @Column(name = "nickname",nullable = false)
    private String nickname;

    @Column(name = "email", unique = true,nullable = false)
    private String email;

    @Column(name = "phone", unique = true,nullable = false)
    private String phone;

    @Column(name = "gender")
    private String gender;

    @Column(name = "password",nullable = false)
    private String password;

    public Integer getId() {
        return id;
    }

    public UUID getExternal_id() {
        return external_id;
    }

    public String getName() {
        return name;
    }

    public String getNickname() {
        return nickname;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public String getGender() {
        return gender;
    }

    public String getPassword() {
        return password;
    }
}
