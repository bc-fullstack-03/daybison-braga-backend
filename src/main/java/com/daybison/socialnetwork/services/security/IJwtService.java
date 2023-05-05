package com.daybison.socialnetwork.services.security;

import java.util.UUID;

public interface IJwtService {
    String generateToken(UUID userId);
}
