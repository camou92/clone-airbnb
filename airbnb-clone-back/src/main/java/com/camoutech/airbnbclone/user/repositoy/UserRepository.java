package com.camoutech.airbnbclone.user.repositoy;

import com.camoutech.airbnbclone.user.domaine.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
import java.util.UUID;

public interface UserRepository extends JpaRepository<User, Long> {

    Optional<User> findOneByEmail(String email);

    Optional<User> findOneByPublicId(UUID publicId);
}