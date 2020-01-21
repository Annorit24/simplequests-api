package xyz.annorit24.simplequestsapi.quest;

/**
 * @author Annorit24
 * Created on 21/01/2020
 */
public abstract class QuestsManager {

    /**
     * Register a quest in the plugin
     *
     * @param quest quest object to register
     */
    public abstract void registerQuest(Quest quest);

    /**
     * Get quest by its id
     *
     * @param questId the id of the quest
     * @return Quest object
     */
    public abstract Quest getQuest(String questId);
}
