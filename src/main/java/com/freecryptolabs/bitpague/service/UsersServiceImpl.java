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

    @Override
    public Optional<User> createUser(User user) {
        if(userExists(user.getEmail(), user.getPhone())){
            throw new RuntimeException("User already exists");
        }
        Optional<User> optionalUser = Optional.empty();

        try {
            usersRepository.saveUser(user.getEmail(),user.getGender(),user.getName(),user.getNickname(),user.getPassword(),user.getPhone());
        }catch (Exception exception){
            System.out.println(exception.getMessage());
            return optionalUser;
        }
        optionalUser = usersRepository.findByEmail(user.getEmail());

        return optionalUser;

    }

    private boolean userExists(String email, String phone) {
        return usersRepository.findByEmail(email).isPresent() || usersRepository.findByPhone(phone).isPresent();
    }


}
