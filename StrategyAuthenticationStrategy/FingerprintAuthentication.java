package StrategyAuthenticationStrategy;

public class FingerprintAuthentication implements AuthenticationStrategy{

    @Override
    public boolean authenticate(String username, String credentials) {
        
        System.out.println("Fingerprint authentication for user " + username);
        return true;
    }
    
}
