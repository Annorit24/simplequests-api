package xyz.annorit24.simplequestsapi;

import org.bukkit.plugin.java.JavaPlugin;

public abstract class JavaPluginAPI extends JavaPlugin {



    /**
     * Method use to set instance of the api
     * must be call in the onEnable method
     *
     * {@link SimpleQuestsAPI#instance}
     *
     * @param api instance of the implementation of the api
     */
    protected void registerApiImplementation(SimpleQuestsAPI api){
        SimpleQuestsAPI.setInstance(api);
    }
}
