package com.portfolio.back.security;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class AuthCredentials {
  
    private String email;
    private String password;

    public AuthCredentials() {
    }

    public AuthCredentials(String email, String password) {
        this.email = email;
        this.password = password;
    }

}
