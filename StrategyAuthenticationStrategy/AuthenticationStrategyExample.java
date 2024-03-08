package StrategyAuthenticationStrategy;

public class AuthenticationStrategyExample {
    public static void main(String[] args) {
        AuthenticationManager authenticationManager = new AuthenticationManager();

        authenticationManager.setAuthenticationStrategy(new PasswordAuthentication());
        authenticationManager.performAuthentication("hamza","kjjhkvjh");
    }
}
