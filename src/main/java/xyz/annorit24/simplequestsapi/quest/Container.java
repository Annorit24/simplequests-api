package xyz.annorit24.simplequestsapi.quest;

import xyz.annorit24.simplequestsapi.quest.components.Action;
import xyz.annorit24.simplequestsapi.quest.components.ComponentResult;
import xyz.annorit24.simplequestsapi.quest.components.Condition;

import java.util.Map;
import java.util.UUID;

/**
 * @author Annorit24
 * Created on 04/02/2020
 */
public abstract class Container {
    // TODO: 01/03/2020 javadoc ...

    private UUID playerUUID;
    private UUID bukkitEventUUID;

    private volatile Map<Integer, Action> actions;
    private volatile Map<Integer, ComponentResult> actionsResult;

    private volatile Map<Integer, Condition> conditions;
    private volatile Map<Integer, ComponentResult> conditionsResult;

    private volatile boolean reprocess;

    /**
     * Current position of the packet in the pipeline
     */
    private Integer indexPosition;

    public Container(UUID playerUUID, UUID bukkitEventUUID, Map<Integer, Action> actions, Map<Integer, Condition> conditions) {
        this.playerUUID = playerUUID;
        this.bukkitEventUUID = bukkitEventUUID;
        this.actions = actions;
        this.conditions = conditions;

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

    public boolean isReprocess() {
        return reprocess;
    }
    public void setReprocess(boolean reprocess) {
        this.reprocess = reprocess;
    }

    public boolean isCriticalConditions(){
        Map<Integer, ComponentResult> conditionsResult = getConditionsResult();

        for (Map.Entry<Integer, ComponentResult> entry : conditionsResult.entrySet()) {
            ComponentResult componentResult = entry.getValue();
            if(componentResult == ComponentResult.CRITICAL_FAILURE)return true;
        }
        return false;
    }
}
