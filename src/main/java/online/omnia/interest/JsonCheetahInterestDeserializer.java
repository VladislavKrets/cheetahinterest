package online.omnia.interest;

import com.google.gson.*;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by lollipop on 15.08.2017.
 */
public class JsonCheetahInterestDeserializer implements JsonDeserializer<List>{
    @Override
    public List deserialize(JsonElement jsonElement, Type type,
                            JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
        JsonObject object = jsonElement.getAsJsonObject();
        String status = object.get("status").getAsString();
        String message = object.get("message").getAsString();
        System.out.println(status + " " + message);
        JsonElement element = object.get("data");
        if (element != null) {
            List<CheetahInterest> interests = new ArrayList<>();
            JsonArray interestArray = element.getAsJsonArray();
            for (JsonElement interest : interestArray) {
                interests.add(new CheetahInterest(
                       interest.getAsJsonObject().get("id").getAsInt(),
                       interest.getAsJsonObject().get("pid").getAsString(),
                       interest.getAsJsonObject().get("value").getAsString()
                ));
            }
            return interests;
        }
        return null;
    }
}
