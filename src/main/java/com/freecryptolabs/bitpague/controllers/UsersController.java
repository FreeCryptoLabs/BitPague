package com.freecryptolabs.bitpague.controllers;

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

    @PostMapping("/registration")
    @Transactional
    public String createUser(@RequestBody UserForm userForm, UriComponentsBuilder uriBuilder ){
        return "Ok";

    }

    @GetMapping("/{id}")
    public ResponseEntity<User> getUser(@PathVariable Integer id){
    Optional<User> optionalUser = usersService.getById(id);

    return ResponseEntity.of(optionalUser);
    }
}
