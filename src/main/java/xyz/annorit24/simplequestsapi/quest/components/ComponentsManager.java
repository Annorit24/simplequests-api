package xyz.annorit24.simplequestsapi.quest.components;

import com.google.gson.GsonBuilder;
import com.google.gson.TypeAdapter;

/**
 * @author Annorit24
 * Created on 23/01/2020
 */
public abstract class ComponentsManager<T> {

    /**
     * register a component in order to have the typeAdapter to deserialize it as Action or Condition
     *
     * @param clazz component class
     * @param typeName the type name of the component which will be write in the config
     * @param typeAdapter type adapter use to deserialize component
     */
    public abstract void register(Class<? extends T> clazz, String typeName, TypeAdapter<? extends T> typeAdapter);

    /**
     * Get the class of the component from it type name
     *
     * @param typeName the type name of the component
     * @return class of the component
     */
    public abstract Class<? extends T> get(String typeName);

    /**
     * Get builder use to deserialize the components
     *
     * @return gson builder
     */
    public abstract GsonBuilder getBuilder();

}
