//package com.zeng.gateway.config;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Bean;
//import org.springframework.core.convert.converter.Converter;
//import org.springframework.security.authentication.AbstractAuthenticationToken;
//import org.springframework.security.config.annotation.web.reactive.EnableWebFluxSecurity;
//import org.springframework.security.config.web.server.ServerHttpSecurity;
//import org.springframework.security.oauth2.jwt.Jwt;
//import org.springframework.security.oauth2.server.resource.authentication.JwtAuthenticationConverter;
//import org.springframework.security.oauth2.server.resource.authentication.JwtGrantedAuthoritiesConverter;
//import org.springframework.security.oauth2.server.resource.authentication.ReactiveJwtAuthenticationConverterAdapter;
//import org.springframework.security.web.server.SecurityWebFilterChain;
//import reactor.core.publisher.Mono;
//
//@EnableWebFluxSecurity
//public class ResourceServerConfig {
//
//  @Autowired
//  private ResourceServerManager resourceServerManager;
//
//  @Bean
//  public SecurityWebFilterChain securityWebFilterChain(ServerHttpSecurity http) {
//    return http.authorizeExchange().pathMatchers("/code-redirect", "/oauth2/authorize", "/favicon.ico","/auth/*").permitAll().anyExchange()
//        .access(resourceServerManager)
//        .and()
//        .oauth2ResourceServer().jwt().jwtAuthenticationConverter(jwtAuthenticationConvert()).and()
//        .and().build();
//  }
//
//  public Converter<Jwt, Mono<AbstractAuthenticationToken>> jwtAuthenticationConvert() {
//    JwtGrantedAuthoritiesConverter authoritiesConverter = new JwtGrantedAuthoritiesConverter();
//    authoritiesConverter.setAuthorityPrefix("");
//    authoritiesConverter.setAuthoritiesClaimName("roles");
//
//    JwtAuthenticationConverter jwtAuthenticationConverter = new JwtAuthenticationConverter();
//    jwtAuthenticationConverter.setPrincipalClaimName("sub");
//    jwtAuthenticationConverter.setJwtGrantedAuthoritiesConverter(authoritiesConverter);
//    return new ReactiveJwtAuthenticationConverterAdapter(jwtAuthenticationConverter);
//  }
//}
