package com.example.oauthjwt.repository;

import com.example.oauthjwt.entity.RefreshEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface   RefreshRepository extends JpaRepository<RefreshEntity, Long> {
}
