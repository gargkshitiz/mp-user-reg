package com.mp.demo.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.mp.demo.model.User;
import com.mp.demo.web.dto.UserRegistrationDto;
/**
 * @author Kshitiz Garg
 */
public interface UserService extends UserDetailsService {

    User findByEmail(String email);

    User save(UserRegistrationDto registration);
}
