package com.codewithehtesham.fullstack.backend.repository;
import com.codewithehtesham.fullstack.backend.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}
