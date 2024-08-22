package com.freecryptolabs.bitpague.forms;

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

}
