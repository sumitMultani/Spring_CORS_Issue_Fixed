//package com.example.demo.config;
//
////import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//import org.springframework.security.config.http.SessionCreationPolicy;
//import org.springframework.web.cors.CorsConfiguration;
//import org.springframework.web.cors.CorsConfigurationSource;
//import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
//
//import java.util.Arrays;
//
//@EnableWebSecurity
//@Configuration
//public class SecurityConfiguration extends WebSecurityConfigurerAdapter {
//
//    @Value("${cors.allowedOrigin}")
//    private String allowedOrigin;
//
//    @Value("${cors.allowedMethods}")
//    private String allowedMethods;
//
//    @Value("${cors.allowedHeaders}")
//    private String allowedHeaders;
//
//    @Value("${cors.allowedCredentials}")
//    private boolean allowedCredentials;
//
//    @Value("${cors.corsConfiguration}")
//    private String corsConfiguration;
//
//
//
//    @Override
//    protected void configure(HttpSecurity http) throws Exception {
//
//        http.cors().and().csrf().disable()
//                .authorizeHttpRequests()
//                .antMatchers(corsConfiguration)
//                .permitAll()
//                .and().sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS);
//
//    }
//
//    @Bean
//    CorsConfigurationSource corsConfigurationSource(){
//        CorsConfiguration configuration = new CorsConfiguration();
//        configuration.setAllowedOrigins(Arrays.asList(allowedOrigin));
//        configuration.setAllowedMethods(Arrays.asList(allowedMethods));
//        configuration.setAllowedHeaders(Arrays.asList(allowedHeaders));
//        configuration.setAllowCredentials(allowedCredentials);
//        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
//        source.registerCorsConfiguration(corsConfiguration, configuration);
//        return source;
//    }
//}
