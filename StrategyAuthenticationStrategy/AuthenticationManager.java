package StrategyAuthenticationStrategy;

public class AuthenticationManager {
    private AuthenticationStrategy authenticationStrategy;

    public void setAuthenticationStrategy(AuthenticationStrategy authenticationStrategy)
    {
        this.authenticationStrategy = authenticationStrategy;
    }

    public boolean performAuthentication(String username,String credentials)
    {
        return authenticationStrategy.authenticate(username, credentials);
    }
}
