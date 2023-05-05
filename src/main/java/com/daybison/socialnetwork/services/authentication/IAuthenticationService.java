package com.daybison.socialnetwork.services.authentication;

public interface IAuthenticationService {
    AuthenticateResponse authenticate(AuthenticateRequest request);
}
