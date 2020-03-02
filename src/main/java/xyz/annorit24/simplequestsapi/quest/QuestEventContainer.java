package xyz.annorit24.simplequestsapi.quest;

import xyz.annorit24.simplequestsapi.pipeline.Trigger;
import xyz.annorit24.simplequestsapi.quest.components.Action;
import xyz.annorit24.simplequestsapi.quest.components.ComponentResult;
import xyz.annorit24.simplequestsapi.quest.components.Condition;

import java.util.Map;
import java.util.UUID;

/**
 * @author Annorit24
 * Created on 04/02/2020
 */
public final class QuestEventContainer {
    // TODO: 01/03/2020 javadoc ...

    private UUID playerUUID;
    private UUID bukkitEventUUID;

    private Trigger processingTrigger;

    private volatile Map<Integer, Action> actions;
    private volatile Map<Integer, ComponentResult> actionsResult;

    private volatile Map<Integer, Condition> conditions;
    private volatile Map<Integer, ComponentResult> conditionsResult;

    private volatile boolean reprocess;

    /**
     * Current position of the packet in the pipeline
     */
    private Integer indexPosition;

    public QuestEventContainer(UUID playerUUID, UUID bukkitEventUUID, Trigger processingTrigger) {
        this.playerUUID = playerUUID;
        this.bukkitEventUUID = bukkitEventUUID;

        this.processingTrigger = processingTrigger;
        this.actions = processingTrigger.getActions();
        this.conditions = processingTrigger.getConditions();

        //default values
        this.reprocess = true;
        this.indexPosition = 0;
    }

    public synchronized void setActionsResult(Map<Integer, ComponentResult> actionsResult) {
        this.actionsResult = actionsResult;
    }
    public synchronized void setConditionsResult(Map<Integer, ComponentResult> conditionsResult) {
        this.conditionsResult = conditionsResult;
    }

    public synchronized Map<Integer, Action> getActions() {
        return actions;
    }
    public synchronized Map<Integer, ComponentResult> getActionsResult() {
        return actionsResult;
    }
    public synchronized Map<Integer, Condition> getConditions() {
        return conditions;
    }
    public synchronized Map<Integer, ComponentResult> getConditionsResult() {
        return conditionsResult;
    }

    public Integer getIndexPosition() {
        return indexPosition;
    }
    public void setIndexPosition(Integer indexPosition) {
        this.indexPosition = indexPosition;
    }

    public UUID getPlayerUUID() {
        return playerUUID;
    }

    public UUID getBukkitEventUUID() {
        return bukkitEventUUID;
    }

    public Trigger getProcessingTrigger() {
        return processingTrigger;
    }

    public boolean isReprocess() {
        return reprocess;
    }

    public void setReprocess(boolean reprocess) {
        this.reprocess = reprocess;
    }
}
