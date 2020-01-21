package xyz.annorit24.simplequestsapi.condition;

import org.bukkit.event.Event;

public abstract class AbstractCondition {

    private Boolean conditionValue;

    public AbstractCondition() {
        this.conditionValue = false;
    }

    public abstract void call(Event event);

    public abstract void manageInvalidCondition(Event event);

    public Boolean getConditionValue() {
        return conditionValue;
    }
}