package com.example.oauthjwt.service;

import com.example.oauthjwt.dto.RegisterDTO;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;


public interface UserService extends UserDetailsService {
    UserDetails loadUserByUsername(String email) throws UsernameNotFoundException;

    void registUser(RegisterDTO registerDTO);

    RegisterDTO getUserDetailsByEmail(String memberEmail);
}
