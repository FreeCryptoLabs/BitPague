package com.freecryptolabs.bitpague.service;

import com.freecryptolabs.bitpague.models.User;
import com.freecryptolabs.bitpague.persistence.repositories.UsersRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@Transactional
public class UsersServiceImpl implements UsersService{

    @Autowired
    UsersRepository usersRepository;

    @Override
    public Optional<User> getById(Integer id) {
        return usersRepository.findById(id);
    }
}
