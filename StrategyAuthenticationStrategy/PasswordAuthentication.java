package StrategyAuthenticationStrategy;

public class PasswordAuthentication implements AuthenticationStrategy {

    @Override
    public boolean authenticate(String username, String credentials) {

        System.out.println("Password authentication for user " + username);
        return true;
    }
    
}
