package com.daybison.socialnetwork.services.security;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.io.Decoders;
import io.jsonwebtoken.security.Keys;
import org.springframework.stereotype.Service;

import java.security.Key;
import java.util.Date;
import java.util.UUID;

@Service
public class JwtService implements IJwtService{
    private final int EXPIRATION_TIME = 7200000;
    private final String KEY = "337336763979244226452948404D635166546A576D5A7134743777217A25432A";

    public String generateToken(UUID userId){
        return Jwts
                .builder()
                .setSubject(userId.toString())
                .setIssuedAt(new Date(System.currentTimeMillis()))
                .setExpiration(new Date(System.currentTimeMillis() + EXPIRATION_TIME))
                .signWith(genSigninKey(), SignatureAlgorithm.HS256)
                .compact();
    }

    private Key genSigninKey(){
        return Keys.hmacShaKeyFor(Decoders.BASE64.decode(KEY));
    }

}
