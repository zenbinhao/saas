//package com.zeng.gateway.config;
//
//import org.springframework.http.HttpMethod;
//import org.springframework.http.server.reactive.ServerHttpRequest;
//import org.springframework.security.authorization.AuthorizationDecision;
//import org.springframework.security.authorization.ReactiveAuthorizationManager;
//import org.springframework.security.core.Authentication;
//import org.springframework.security.core.GrantedAuthority;
//import org.springframework.security.web.server.authorization.AuthorizationContext;
//import org.springframework.stereotype.Component;
//import reactor.core.publisher.Mono;
//
//import java.util.Collection;
//import java.util.List;
//import java.util.Map;
//import java.util.concurrent.ConcurrentHashMap;
//
//@Component
//public class ResourceServerManager implements ReactiveAuthorizationManager<AuthorizationContext> {
//
//	public static final Map<String, List<String>> AUTH_MAP = new ConcurrentHashMap<>();
//    @Override
//    public Mono<AuthorizationDecision> check(
//            Mono<Authentication> mono, AuthorizationContext authorizationContext) {
//        ServerHttpRequest request = authorizationContext.getExchange().getRequest();
//        String path = request.getURI().getPath();
//        HttpMethod method = request.getMethod();
//        String pathToAuthor = method.name() + ":" + path;
////        if (!LoadRolePermsData.AUTH_MAP.containsKey(pathToAuthor)) {
//////            log.error("==================11111111111111111111 {} ", pathToAuthor);
////            return Mono.just(new AuthorizationDecision(false));
////        }
//
//        List<String> headers = request.getHeaders().get("Authorization");
////        log.error("-----------------------headers {} ", headers);
////        if (headers == null || headers.size() == 0) {
////            不带token，认为是ROLE_GUEST角色
//////            log.error("==================2222222222222222 {} ", headers);
////            return Mono.just(new AuthorizationDecision(LoadRolePermsData.AUTH_MAP.get(pathToAuthor).contains("ROLE_GUEST")));
////        }
//
//        return mono.filter(Authentication::isAuthenticated)
//                .map(auth -> {
//                    Collection<? extends GrantedAuthority> authorities = auth.getAuthorities();
//                    for (GrantedAuthority grantedAuthority : authorities) {
////                        log.error("====================grantedAuthority {} ", grantedAuthority);
////                        if (LoadRolePermsData.AUTH_MAP.get(pathToAuthor).contains(grantedAuthority.getAuthority())) {
////                            return new AuthorizationDecision(true);
////                        }
//                    	System.out.println("------------ResourceServerManager--------"+grantedAuthority.getAuthority());
//                    }
//                    return new AuthorizationDecision(false);
//                }).defaultIfEmpty(new AuthorizationDecision(false));
//    }
//}
