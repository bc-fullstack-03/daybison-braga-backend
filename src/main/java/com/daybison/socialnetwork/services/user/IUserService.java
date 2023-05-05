package com.daybison.socialnetwork.services.user;

import com.daybison.socialnetwork.entities.User;
import org.springframework.security.crypto.password.PasswordEncoder;

public interface IUserService {
    String createUser(CreateUserRequest request);
    FindUserResponse findUserByEmail(String email);
    User getUser(String email);
}
