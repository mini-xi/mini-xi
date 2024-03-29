package com.example.oauthjwt.repository;

import com.example.oauthjwt.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserEntity, Long> {

    UserEntity findByLoginId(String loginId);

    UserEntity findByMemberEmail(String memberEmail);
}
