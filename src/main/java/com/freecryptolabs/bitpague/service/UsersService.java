package com.freecryptolabs.bitpague.service;

import com.freecryptolabs.bitpague.models.User;
import java.util.Optional;
import java.util.UUID;

public interface UsersService {

    public Optional<User> getByExternalId(UUID external_id);

    public Optional<User> createUser(User user);
}
