package xyz.annorit24.simplequestsapi.json;

import com.google.gson.JsonObject;

/**
 * Class use to create a deserializer for different object when using json database<br>
 * Deserializers must be register in the {@link DeserializerManager}
 *
 * @author Annorit24
 * Created on 27/12/2019
 */
public abstract class Deserializer<T> {

    /**
     * Method use to deserialize an json object to the T object
     *
     * @param object json object to deserialize
     * @return the T object deserialize
     */
    public abstract T deserialize(JsonObject object);

}
