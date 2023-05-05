package com.daybison.socialnetwork.utils.validation;

import com.daybison.socialnetwork.entities.User;

public class AuthenticateValidator {
    public static boolean isUserValid(String user){
        return user != null;
    }

    public static boolean isPasswordValid(User user,String password){
        return user.getPassword().equals(password);
    }
}
