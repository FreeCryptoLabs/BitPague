package com.freecryptolabs.bitpague.dtos;
import com.freecryptolabs.bitpague.models.User;

import java.util.Date;
import java.util.Objects;
import java.util.UUID;

public class UserDto {

    private UUID external_id;

    private String name;

    private String nickname;

    private String email;

    private String phone;

    private String gender;

    private Date created_at;

    public UserDto(){}

    public UserDto(User user){
        this.external_id = user.getExternal_id();
        this.name = user.getName();
        this.nickname = user.getNickname();
        this.email = user.getEmail();
        this.phone = user.getPhone();
        this.gender = user.getGender();
        this.created_at = user.getCreated_at();
    }

    public UserDto(UUID external_id, String name, String nickname, String email, String phone, String gender, Date created_at) {
        this.external_id = external_id;
        this.name = name;
        this.nickname = nickname;
        this.email = email;
        this.phone = phone;
        this.gender = gender;
        this.created_at = created_at;
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

    public Date getCreated_at() {
        return created_at;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserDto userDto = (UserDto) o;
        return Objects.equals(external_id, userDto.external_id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(external_id);
    }

    @Override
    public String toString() {
        return "UserDto{" +
                "external_id=" + external_id +
                ", name='" + name + '\'' +
                ", nickname='" + nickname + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", gender='" + gender + '\'' +
                ", created_at=" + created_at +
                '}';
    }
}
