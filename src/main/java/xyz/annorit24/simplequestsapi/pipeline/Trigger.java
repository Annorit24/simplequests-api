package xyz.annorit24.simplequestsapi.pipeline;

import org.bukkit.event.Event;
import xyz.annorit24.simplequestsapi.quest.QuestInfo;
import xyz.annorit24.simplequestsapi.quest.components.Action;
import xyz.annorit24.simplequestsapi.quest.components.Condition;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public abstract class Trigger {
    // TODO: 01/03/2020 faire la javadoc meme si t'as la flemme ...

    public abstract boolean isProcessing();

    public abstract void setProcessing(boolean processing);

    public abstract Class<? extends Event> getEvent();

    public abstract UUID getPlayerUniqueId();

    public abstract Trigger addConditions(Map<Integer, Condition> conditions);

    public abstract Trigger addActions(Map<Integer, Action> actions);

    public abstract Map<Integer, Condition> getConditions();

    public abstract Map<Integer, Action> getActions();

    public abstract QuestInfo getQuestInfo();

    public abstract UUID getQuestStepId();
}
