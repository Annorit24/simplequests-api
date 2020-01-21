package xyz.annorit24.simplequestsapi.quest;

import org.bukkit.event.Event;

import java.util.Map;
import java.util.UUID;
import java.util.concurrent.locks.Condition;

/**
 * @author Annorit24
 * Created on 20/01/2020
 */
public abstract class QuestStep {

    /**
     * Get the unique id of the quest step
     *
     * @return uuid
     */
    public abstract UUID getQuestStepId();

    /**
     * Get the event which will be use to call QuestStep
     *
     * @return bukkit event class
     */
    public abstract Class<? extends Event> getEvent();

    /**
     * Get the description of the quest step display in game
     *
     * @return description not formatted
     */
    public abstract String getDescription();

    /**
     * Get info about the quest step : questsId, pipeline and step<br>
     * subState in this case is useless
     *
     * @return QuestInfo object
     */
    public abstract QuestInfo getQuestStepInfo();

    /**
     * Get all conditions which will be call.<br>
     * The key is the id of the condition which will be used in action call
     *
     * @return Map of condition with their id
     */
    public abstract Map<Integer, Condition> getConditions();

}
