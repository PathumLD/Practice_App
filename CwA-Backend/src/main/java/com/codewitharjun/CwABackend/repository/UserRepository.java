package com.codewitharjun.CwABackend.repository;

import com.codewitharjun.CwABackend.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
