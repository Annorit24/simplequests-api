package xyz.annorit24.simplequestsapi.condition;

import org.bukkit.event.Event;

public abstract class Condition {

    public abstract boolean call(Event event);

    public abstract void manageInvalidCondition(Event event);

}