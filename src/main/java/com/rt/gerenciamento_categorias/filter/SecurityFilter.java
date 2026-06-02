package com.rt.gerenciamento_categorias.filter;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityFilter {

    @Bean //deixa pronto para uso assim que for chamada a função
    public SecurityFilterChain securityFilterChain(HttpSecurity http){
        return http.csrf(csrf -> csrf.disable())
                .sessionManagement( session ->
                        session.sessionCreationPolicy(SessionCreationPolicy.STATELESS))
                .authorizeHttpRequests(auth ->
                        auth.requestMatchers(HttpMethod.GET, "/categorias").permitAll()
                            .requestMatchers(HttpMethod.POST, "/categorias").permitAll()
                            .requestMatchers(HttpMethod.DELETE, "/categorias/**").permitAll()
                            .requestMatchers(HttpMethod.GET, "/categorias/**").permitAll()
                            .requestMatchers(HttpMethod.PUT, "/categorias/**").permitAll()
                )
                .build();
    }

}
