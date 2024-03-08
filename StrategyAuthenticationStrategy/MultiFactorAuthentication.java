package StrategyAuthenticationStrategy;

public class MultiFactorAuthentication implements AuthenticationStrategy {

    @Override
    public boolean authenticate(String username, String credentials) {
        System.out.println("Multi-factor authentication for user " + username);
        return true; 
    }
    
}
