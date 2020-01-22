package xyz.annorit24.simplequestsapi.actions;

import org.bukkit.event.Event;

import java.util.List;

/**
 * @author Annorit24
 * Created on 21/01/2020
 */
public abstract class Action {

    private List<Integer> validConditions;

    public Action(List<Integer> validConditions) {
        this.validConditions = validConditions;
    }

    public abstract void call(Event event);

    public List<Integer> getValidConditions() {
        return validConditions;
    }

    public void setValidConditions(List<Integer> validConditions) {
        this.validConditions = validConditions;
    }
}
