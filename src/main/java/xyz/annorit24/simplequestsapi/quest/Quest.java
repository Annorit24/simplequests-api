package xyz.annorit24.simplequestsapi.quest;

import java.util.Map;

public abstract class Quest {

    /**
     * Get steps of the quest
     *
     * @return Map which contains Quests with a {@link QuestInfo} key
     */
    public abstract Map<QuestInfo, QuestStep> getQuestSteps();

    /**
     * Get the id of the quest
     *
     * @return id of the quest as string
     */
    public abstract String getQuestId();

    /**
     * Get the name
     *
     * @return name which will be display
     */
    public abstract String getQuestName();

    /**
     * Get the description of the quest
     *
     * @return description of the quest
     */
    public abstract String getDescription();

    /**
     * Get the minimum players number require to start the quest
     *
     * @return the minimum number
     */
    public abstract Integer getMinPlayersNumber();

    /**
     * Get the maximum players number require to start the quest
     *
     * @return the maximum number
     */
    public abstract Integer getMaxPlayersNumber();

    /**
     * Get the quest starter
     *
     * @return starter
     */
    public abstract QuestStarter getQuestStarter();
}
