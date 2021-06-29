package com.devhub.core.devhubdeveloperssocial.repository;

import com.devhub.core.devhubdeveloperssocial.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
