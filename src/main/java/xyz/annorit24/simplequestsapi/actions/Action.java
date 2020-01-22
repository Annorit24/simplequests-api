package xyz.annorit24.simplequestsapi.actions;

import org.bukkit.event.Event;

import java.util.List;
import java.util.Map;

/**
 * @author Annorit24
 * Created on 21/01/2020
 */
public abstract class Action {

    private List<Integer> validConditions;

    public Action(List<Integer> validConditions) {
        this.validConditions = validConditions;
    }

    public abstract void call(Event event, Map<Integer, Boolean> results);

    public List<Integer> getValidConditions() {
        return validConditions;
    }

    public void setValidConditions(List<Integer> validConditions) {
        this.validConditions = validConditions;
    }

    protected boolean isConditionsValid(Map<Integer, Boolean> results){
        for (Map.Entry<Integer, Boolean> entry : results.entrySet()) {
            Integer integer = entry.getKey();
            Boolean aBoolean = entry.getValue();

            if(validConditions.contains(integer) && !aBoolean)return false;
        }
        return true;
    }
}
