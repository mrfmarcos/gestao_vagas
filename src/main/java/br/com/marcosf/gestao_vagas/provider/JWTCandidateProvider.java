package br.com.marcosf.gestao_vagas.provider;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.exceptions.JWTVerificationException;
import com.auth0.jwt.interfaces.DecodedJWT;

@Service
public class JWTCandidateProvider {

    @Value("${security.token.secret.candidate}")
    private String secretkey;

    public DecodedJWT validateToken(String token){
        token = token.replace("Bearer ", "");
        
        Algorithm algorithm = Algorithm.HMAC256(secretkey);

        try{
            var tokenDecoted = JWT.require(algorithm)
                    .build()
                    .verify(token);
                return tokenDecoted;
        }catch(JWTVerificationException ex){
                return null;
        }

    }

}
