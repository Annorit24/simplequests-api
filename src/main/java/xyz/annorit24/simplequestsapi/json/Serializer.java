package xyz.annorit24.simplequestsapi.json;

/**
 * Class use to create a serializer for different object when using json database<br>
 * Serializers must be register in the {@link SerializerManager}
 *
 * @author Annorit24
 * Created on 27/12/2019
 */
public abstract class Serializer<T>{

    /**
     * Method use to serialize an T object
     *
     * @param object the T object to serialize
     * @return the serialize object in json string
     */
    public abstract String serialize(T object);

}
