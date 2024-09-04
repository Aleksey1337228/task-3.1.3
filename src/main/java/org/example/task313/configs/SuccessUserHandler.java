package org.example.task313.configs;


import jakarta.servlet.ServletException;
import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;
import org.springframework.stereotype.Component;

import java.io.IOException;

@Component
public class SuccessUserHandler implements AuthenticationSuccessHandler {
    @Override
    public void onAuthenticationSuccess(javax.servlet.http.HttpServletRequest request,
                                        javax.servlet.http.HttpServletResponse response,
                                        Authentication authentication) throws IOException{

    }


    // Spring Security использует объект Authentication, пользователя авторизованной сессии

}
