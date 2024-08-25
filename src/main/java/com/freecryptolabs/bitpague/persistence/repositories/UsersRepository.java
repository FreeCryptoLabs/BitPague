package com.freecryptolabs.bitpague.persistence.repositories;

import com.freecryptolabs.bitpague.models.User;
import jakarta.annotation.Nonnull;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.ControllerAdvice;

import java.util.Optional;

@Repository
public interface UsersRepository extends JpaRepository<User,Integer> {

    @Query(value = "select u.id,u.email,u.external_id,u.gender,u.name,u.nickname,u.password,u.phone,u.created_at from t_users u where u.id =:id", nativeQuery = true)
    @Override @Nonnull
    Optional<User> findById(@Nonnull @Param("id") Integer Id);

    @Query(value = "insert into t_users (email, gender, name, nickname, password, phone) values (?, ?, ?, ?, ?, ?)",nativeQuery = true)
    @Nonnull @Modifying @Transactional
    Integer saveUser (@Param("email") String email, @Param("gender") String gender,@Param("name") String name,@Param("nickname") String nickname,@Param("password") String password,@Param("phone") String  phone);

    Optional<User> findByEmail(String email);

    Optional<User> findByPhone(String phone);

}
