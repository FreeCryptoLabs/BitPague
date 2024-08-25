package com.freecryptolabs.bitpague.forms;

import com.freecryptolabs.bitpague.models.User;
import jakarta.validation.constraints.*;

public class UserForm {

    @NotNull @Size(min = 2, max=50)
    private String name;

    @NotNull @Size(min = 2, max=50)
    private String nickname;

    @NotNull @Email
    private String email;

    @NotNull
    private String phone;

    @NotNull @Size(min = 1,max=1)
    private String gender;

    @NotNull @NotBlank
    @Size(min = 8,max = 20)
    private String password;

    public User toUser() {
        User user = new User();
        user.setEmail(getEmail());
        user.setName(getName());
        user.setPhone(getPhone());
        user.setGender(getGender());
        user.setNickname(getNickname());
        user.setPassword(getPassword());
        return user;
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
