package xyz.annorit24.simplequestsapi.condition;

import org.bukkit.event.Event;

public abstract class Condition {

    private Boolean conditionValue;

    public Condition() {
        this.conditionValue = false;
    }

    public abstract void call(Event event);

    public abstract void manageInvalidCondition(Event event);

    public Boolean getConditionValue() {
        return conditionValue;
    }
}