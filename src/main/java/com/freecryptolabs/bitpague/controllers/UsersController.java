package com.freecryptolabs.bitpague.controllers;

import com.freecryptolabs.bitpague.dtos.UserDto;
import com.freecryptolabs.bitpague.forms.UserForm;
import com.freecryptolabs.bitpague.models.User;
import com.freecryptolabs.bitpague.persistence.repositories.UsersRepository;
import com.freecryptolabs.bitpague.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.Optional;
import java.util.UUID;

@RestController
@RequestMapping("/users")
public class UsersController {

    @Autowired
    UsersService usersService;
    private static final String path = "/users/{id}";

    @PostMapping("/registration")
    @Transactional
    public ResponseEntity<UserDto> createUser(@RequestBody UserForm userForm, UriComponentsBuilder uriBuilder ){
        Optional<User> optionalUser = usersService.createUser(userForm.toUser());


      return optionalUser.map(user -> ResponseEntity.created(uriBuilder.path(path)
                .buildAndExpand(user.getExternal_id()).toUri())
                .body(new UserDto(user)))
                .orElseGet(() -> ResponseEntity.badRequest().build());

    }

    @GetMapping("/{id}")
    public ResponseEntity<UserDto> getUser(@PathVariable Integer id){
    Optional<User> optionalUser = usersService.getById(id);

    return optionalUser.map(user -> ResponseEntity.ok(new UserDto(user)))
            .orElseGet(() -> ResponseEntity.notFound().build());
    }
}
