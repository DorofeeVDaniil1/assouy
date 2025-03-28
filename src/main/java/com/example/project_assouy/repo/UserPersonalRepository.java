package com.example.project_assouy.repo;

import com.example.project_assouy.entity.User;
import com.example.project_assouy.entity.UserPersonal;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface UserPersonalRepository extends JpaRepository<UserPersonal, UUID> {
    UserPersonal findUserPersonalByUserId(User userId);

    UserPersonal findByUserId(User userId);

    UserPersonal findIdByUserId(User userId);


}