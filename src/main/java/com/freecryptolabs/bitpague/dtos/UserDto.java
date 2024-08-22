package com.freecryptolabs.bitpague.dtos;
import com.freecryptolabs.bitpague.models.User;

import java.util.Objects;
import java.util.UUID;

public class UserDto {

    private Integer id;

    private UUID external_id;

    private String name;

    private String nickname;

    private String email;

    private String phone;

    private String gender;

    private String password;

    public UserDto(User user){
        this.id = user.getId();
        this.external_id = user.getExternal_id();
        this.name = user.getName();
        this.nickname = user.getNickname();
        this.email = user.getEmail();
        this.phone = user.getPhone();
        this.gender = user.getGender();
        this.password = user.getPassword();
    }
    public UserDto(Integer id, UUID external_id, String name, String nickname, String email, String phone, String gender, String password) {
        this.id = id;
        this.external_id = external_id;
        this.name = name;
        this.nickname = nickname;
        this.email = email;
        this.phone = phone;
        this.gender = gender;
        this.password = password;
    }

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserDto userDto = (UserDto) o;
        return Objects.equals(id, userDto.id) && Objects.equals(external_id, userDto.external_id) && Objects.equals(email, userDto.email) && Objects.equals(phone, userDto.phone);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, external_id, email, phone);
    }

    @Override
    public String toString() {
        return "UserDto{" +
                "id=" + id +
                ", external_id=" + external_id +
                ", name='" + name + '\'' +
                ", nickname='" + nickname + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", gender='" + gender + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
