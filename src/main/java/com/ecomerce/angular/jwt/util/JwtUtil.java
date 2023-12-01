package com.ecomerce.angular.jwt.util;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import org.springframework.stereotype.Component;

import java.util.function.Function;

@Component
public class JwtUtil {


    private  static final String SECRET_KEY = "DoWithReason";
    public String getUserNameFromToken(String token){

    }

    //Method might need to accessible from diffwwernt methods
    private <T> T getClaimFromToken(String token, Function<Claims,T>){



    }

    private Claims getAllClaimsFromToken(String token){
        return Jwts.parser().verifyWith(SECRET_KEY).build().parseSignedClaims(SECRET_KEY);
    }
}
