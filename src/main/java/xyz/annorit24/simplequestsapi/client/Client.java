package xyz.annorit24.simplequestsapi.client;

import org.bukkit.entity.Player;
import xyz.annorit24.simplequestsapi.customdata.CustomData;
import xyz.annorit24.simplequestsapi.pipeline.Pipeline;
import xyz.annorit24.simplequestsapi.pipeline.PipelineType;
import xyz.annorit24.simplequestsapi.quest.QuestInfo;

import java.util.List;
import java.util.Map;
import java.util.UUID;

/**
 * @author Annorit24
 * Created on 28/12/2019
 */
public abstract class Client {

    /**
     * Get pipeline use to process a container
     *
     * @param type the type name of needed pipeline
     * @return pipeline
     */
    public abstract Pipeline getPipeline(String type);

    /**
     * Get the pipeline use to process a container
     *
     * @param type the type of needed pipeline
     * @return pipeline
     */
    public Pipeline getPipeline(PipelineType type){
        return getPipeline(type.getName());
    }

    /**
     * Get the real name of the player
     * @return the real name
     */
    public abstract String getName();

    /**
     * Get the display name of the player it can be different from the real name
     * @return the display name of the player
     */
    public abstract String getDisplayName();

    /**
     * Get the bukkit UUID of the player
     * @return the UUID
     */
    public abstract UUID getUniqueId();

    /**
     * Get a list of quests info objects which contains data of started quests<br>
     * which are still actives
     *
     * @return a list of quest info object
     */
    public abstract List<QuestInfo> getActivesQuests();

    /**
     * Get a list of quests which are finished
     *
     * @return a list of quest's id
     */
    public abstract List<String> getFinishedQuests();

    /**
     * Add an quest to the list of active quests , that means that the player started this quest
     * @param questId the quest's id started by the player
     */
    public abstract void addActiveQuests(String... questId);

    /**
     * Remove an quest to the list of active quests, that means that the player finished this quest
     * @param questId the quest's id finished by the player
     */
    public abstract void removeActiveQuests(String... questId);

    /**
     * Add a quest to the list of quests which are done , that means that the player finished the quest
     * @param questId the quest's id finished
     */
    public abstract void addQuestDone(String questId);

    /**
     * Remove a quest of the list of quests
     * @param questId the target quest's id
     */
    public abstract void removeQuestDone(String questId);

    /**
     * Update the value of a custom data
     *
     * @param key the key to identify the custom data
     * @param value the value of the custom data
     */
    public abstract void updateCustomData(String key, Object value);

    /**
     * Get the custom data object
     *
     * @param key the key of the custom data
     * @return custom data object
     */
    public abstract CustomData getCustomData(String key);

    /**
     * Get the custom data value
     *
     * @param key the key of the custom data object
     * @return return the value as object
     */
    public abstract Object getCustomDataValue(String key);

    /**
     * Get all custom datas of a player
     *
     * @return Map with the key of the custom data as key and the custom data object as value
     */
    public abstract Map<String, CustomData> getCustomDatas();

    /**
     * create default client when creating a new account in the database
     *
     * @param player player which need a new account
     * @return Client object with default values
     */
    public abstract Client createClient(Player player);

    /**
     * Get default client when creating a new account in the database
     *
     * @param player player which need a new account
     * @return Client object with default values
     */
    public static Client getDefaultClient(Player player){
      return instance.createClient(player);
    }

    /**
     * instance use by {@link #getDefaultClient(Player)}
     */
    private static Client instance;

    /**
     * Private constructor use by {@link #getDefaultClient(Player)}
     */
    protected Client(){
        instance = this;
    }

}
