package online.omnia.interest;

import com.google.gson.*;

import java.lang.reflect.Type;

/**
 * Created by lollipop on 15.08.2017.
 */
public class JsonTokenDeserializer implements JsonDeserializer<TokenEntity>{
    @Override
    public TokenEntity deserialize(JsonElement jsonElement,
                                   Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
        JsonObject object = jsonElement.getAsJsonObject();
        String status = object.get("status").getAsString();
        String message = object.get("message").getAsString();
        System.out.println(status + " " + message);
        JsonElement element = object.get("data");
        if (element != null) {
            TokenEntity tokenEntity = new TokenEntity(
                    element.getAsJsonObject().get("access_token").getAsString(),
                    element.getAsJsonObject().get("token_type").getAsString(),
                    element.getAsJsonObject().get("expires_in").getAsString()
            );
            return tokenEntity;
        }
        return null;
    }
}
