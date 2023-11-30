package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

import static org.springframework.security.config.Customizer.withDefaults;

@Configuration
@EnableWebSecurity
public class WebSecurityConfiguration {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
                .authorizeHttpRequests((auth) -> auth
                        // /welcome is accessible without authentication
                        .requestMatchers(HttpMethod.GET, "/welcome").permitAll()

                        // some endpoints have role-based authentication
                        .requestMatchers(HttpMethod.GET, "/users").hasRole("USER")
                        .requestMatchers(HttpMethod.GET, "/admins").hasRole("ADMIN")

                        // other endpoints are accessible for all roles
                        .requestMatchers(HttpMethod.GET, "/profile").hasAnyRole("USER", "ADMIN")

                        // some endpoints have permission-based authentication
                        .requestMatchers(HttpMethod.GET, "/reports").hasAuthority("VIEW_REPORTS")

                        // all other endpoints need authentication (must be at the end, as this is the most generice one; otherwise your code won't compile)
                        .anyRequest().authenticated()
                )
                // use basic authentication
                .httpBasic(withDefaults());

        return http.build();
    }

    @Bean
    public UserDetailsService users() {
        // this user has a "USER" role
        UserDetails user = User.builder()
                .username("user")
                .password("{noop}password")
                .roles("USER")
                .build();

        // this user has an "ADMIN" role and a "VIEW_REPORTS" permission/authority
        // you cannot combine roles() and authorities(), as one will overwrite the other
        // in the background, roles are defined as authorities with the "ROLE_" prefix => you can combine both using authorities
        UserDetails admin = User.builder()
                .username("admin")
                .password("{noop}password")
                .authorities("VIEW_REPORTS", "ROLE_ADMIN")
                .build();

        return new InMemoryUserDetailsManager(user, admin);
    }
}
