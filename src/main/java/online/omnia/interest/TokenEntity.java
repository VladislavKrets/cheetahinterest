package online.omnia.interest;

/**
 * Created by lollipop on 15.08.2017.
 */
public class TokenEntity {
    private String accessToken;
    private String tokenType;
    private String expiresIn;

    public TokenEntity(String accessToken, String tokenType, String expiresIn) {
        this.accessToken = accessToken;
        this.tokenType = tokenType;
        this.expiresIn = expiresIn;
    }

    public String getAccessToken() {
        return accessToken;
    }

    public String getTokenType() {
        return tokenType;
    }

    public String getExpiresIn() {
        return expiresIn;
    }
}
