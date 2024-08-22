package com.freecryptolabs.bitpague.persistence.repositories;

import com.freecryptolabs.bitpague.models.User;
import jakarta.annotation.Nonnull;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UsersRepository extends JpaRepository<User,Integer> {

    @Query(value = "select u.id,u.email,u.external_id,u.gender,u.name,u.nickname,u.password,u.phone,u.created_at from USERS u where u.id =:id", nativeQuery = true)
    @Override @Nonnull
    public Optional<User> findById(@Nonnull @Param("id") Integer Id);

}
