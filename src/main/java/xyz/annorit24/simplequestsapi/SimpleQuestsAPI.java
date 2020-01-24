package xyz.annorit24.simplequestsapi;

import org.bukkit.plugin.java.JavaPlugin;
import xyz.annorit24.simplequestsapi.actions.Action;
import xyz.annorit24.simplequestsapi.client.ClientManager;
import xyz.annorit24.simplequestsapi.condition.Condition;
import xyz.annorit24.simplequestsapi.packet.PacketReaderManager;
import xyz.annorit24.simplequestsapi.quest.ComponentsManager;
import xyz.annorit24.simplequestsapi.quest.QuestsManager;

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
    protected JavaPlugin javaPlugin;

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

    /**
     * Get the quests manager use to interact with registered quests
     *
     * @return quests manager
     */
    public abstract QuestsManager questsManager();

    /**
     * Get the action manager use to get registered actions
     *
     * @return action manager
     */
    public abstract ComponentsManager<Action> getActionsManager();

    /**
     * Get the condition manager use to get registered conditions
     *
     * @return action manager
     */
    public abstract ComponentsManager<Condition> getConditionsManager();

    /**
     * Get the packet reader manager use to get registered packet readers
     *
     * @return packet reader manager
     */
    public abstract PacketReaderManager getPacketReaderManager();
}
