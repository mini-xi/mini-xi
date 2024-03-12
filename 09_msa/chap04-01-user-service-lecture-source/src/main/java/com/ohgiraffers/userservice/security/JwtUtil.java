package com.ohgiraffers.userservice.security;

import com.ohgiraffers.userservice.service.UserService;
import io.jsonwebtoken.*;
import io.jsonwebtoken.io.Decoders;
import io.jsonwebtoken.security.Keys;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Component;

import java.security.Key;
import java.util.ArrayList;

@Slf4j
@Component
public class JwtUtil {

    private final Key key;
    private final long accessToeknExpTime;
    private final UserService userService;

    public JwtUtil(
            @Value("${token.secret}") String secretKey,
            @Value("${token.expiration_time}") long accessToeknExpTime,
            UserService userService
    ) {
        byte[] keyBytes = Decoders.BASE64.decode(secretKey);
        this.key = Keys.hmacShaKeyFor(keyBytes);
        this.accessToeknExpTime = accessToeknExpTime;
        this.userService = userService;
    }
    
    /* 설명. 넘어온 AccessToken으로 인증 객체 추출 */
    public Authentication getAuthentication(String token) {
        UserDetails userDetails = userService.loadUserByUsername(this.getUserId(token));

        return new UsernamePasswordAuthenticationToken(userDetails, "", new ArrayList<>());
    }
    
    /* 설명. Token 검증 */
    public boolean validateToken(String token) {
        try {
            Jwts.parserBuilder().setSigningKey(key).build().parseClaimsJws(token);
        } catch (io.jsonwebtoken.security.SecurityException | MalformedJwtException e) {
            log.info("Invalid JWT Token {}", e);
        } catch (ExpiredJwtException e) {
            log.info("expired JWT Toekn {}", e);
        } catch (UnsupportedJwtException e) {
            log.info("Unsupported JWT Token {}", e);
        } catch (IllegalArgumentException e) {
            log.info("JWT claims strig si empty {}", e);
        }

        return false;
    }

    /* 설명. Token에서 User의 Id 개념 추출 */
    public String getUserId(String token) {
        return parseClaims(token).getSubject();
    }

    /* 설명. Token에서 Claims 추출 */
    public Claims parseClaims(String token) {
        try {
            return Jwts.parserBuilder().setSigningKey(key).build().parseClaimsJws(token).getBody();
        } catch (ExpiredJwtException e) {
            return e.getClaims();
        }
    }
}
