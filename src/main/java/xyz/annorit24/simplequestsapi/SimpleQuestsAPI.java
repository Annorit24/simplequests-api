package xyz.annorit24.simplequestsapi;

import org.bukkit.plugin.java.JavaPlugin;
import xyz.annorit24.simplequestsapi.client.ClientManager;

/**
 * @author Annorit24
 * Created on 28/12/2019
 */
public abstract class SimpleQuestsAPI {

    /**
     * Instance of the api
     */
    static SimpleQuestsAPI instance;

    /**
     * Instance of the bukkit java plugin
     */
    private JavaPlugin javaPlugin;

    /**
     * Constructor
     *
     * @param javaPlugin instance of the bukkit java plugin
     */
    public SimpleQuestsAPI(JavaPlugin javaPlugin) {
        this.javaPlugin = javaPlugin;
    }

    /**
     * Get the instance of the api to interact with different managers and tools
     *
     * @return instance of the api
     */
    public static SimpleQuestsAPI get(){
        return instance;
    }

    /**
     * Set the {@linkplain #instance instance of the api},
     * @see JavaPluginAPI#registerApiImplementation(SimpleQuestsAPI)
     *
     * @param apiImplementation instance of class which extends AltheaAPI
     */
    static void setInstance(SimpleQuestsAPI apiImplementation){
        instance = apiImplementation;
    }

    /**
     * Get the client manager use to interact with clients data
     *
     * @return client manager
     */
    public abstract ClientManager getClientManager();
}
