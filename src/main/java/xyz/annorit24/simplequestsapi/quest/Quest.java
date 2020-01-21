package xyz.annorit24.simplequestsapi.quest;

import java.util.List;
import java.util.Map;

public abstract class Quest {

    /**
     * Get steps of the quest
     *
     * @return Map which contains Quests with a {@link QuestInfo} key
     */
    public abstract Map<QuestInfo, List<QuestStep>>getQuestSteps();

    /**
     * Get steps from a QuestInfo<br>
     * To get it , subStep is not taking in account<br>
     *
     * @param questInfo the corresponding questInfo
     * @return list of questStep, multiple questStep can have the same step and pipeline
     */
    public abstract List<QuestStep> getQuestStep(QuestInfo questInfo);

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
