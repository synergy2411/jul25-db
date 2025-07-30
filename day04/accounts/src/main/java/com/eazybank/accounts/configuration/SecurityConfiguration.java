package com.eazybank.accounts.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
@EnableMethodSecurity
public class SecurityConfiguration {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity httpSecurity) throws Exception {
        httpSecurity.authorizeHttpRequests(
                request -> request
                        .requestMatchers("/h2-console/**").permitAll()
                        .requestMatchers("/api/greet").permitAll()
//                        .requestMatchers("*/manager/**").hasRole("MANAGER")
//                        .requestMatchers("*/admin/**").hasRole("ADMIN")
                        .anyRequest().authenticated()
        );
        httpSecurity.sessionManagement(session -> session.sessionCreationPolicy(SessionCreationPolicy.STATELESS));
        httpSecurity.httpBasic(Customizer.withDefaults());
        httpSecurity.headers(headers -> headers.frameOptions(options -> options.sameOrigin()));
        httpSecurity.csrf(csrf -> csrf.disable());
        return httpSecurity.build();
    }

    @Bean
    public UserDetailsService userDetailsService(){
        UserDetails monica = User.withUsername("monica").password("{noop}monica123").roles("MANAGER").build();
        UserDetails joey = User.withUsername("joey").password("{noop}joey123").roles("ADMIN").build();
        UserDetails ross = User.withUsername("ross").password("{noop}ross123").roles("MANAGER", "ADMIN").build();
        return new InMemoryUserDetailsManager(monica, joey, ross);
    }

}