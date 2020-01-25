package xyz.annorit24.simplequestsapi.actions;

import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import xyz.annorit24.simplequestsapi.quest.QuestStep;

import java.util.List;
import java.util.Map;

/**
 * @author Annorit24
 * Created on 21/01/2020
 */
public abstract class Action {

    private List<Integer> validConditions;
    protected QuestStep questStep;
    private boolean customCall;

    public Action(List<Integer> validConditions, boolean customCall) {
        this.validConditions = validConditions;
        this.customCall = customCall;
    }

    public abstract void call(Player player, Map<Integer, Boolean> results);

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

    public QuestStep setQuestStep(QuestStep questStep) {
        this.questStep = questStep;
        return questStep;
    }

    public boolean isCustomCall() {
        return customCall;
    }
}
