package StrategyAuthenticationStrategy;

public interface AuthenticationStrategy {
    
    boolean authenticate(String username, String credentials);
 
}
