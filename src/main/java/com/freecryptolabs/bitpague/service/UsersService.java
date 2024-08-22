package com.freecryptolabs.bitpague.service;

import com.freecryptolabs.bitpague.models.User;
import java.util.Optional;

public interface UsersService {

    public Optional<User> getById(Integer id);
}
