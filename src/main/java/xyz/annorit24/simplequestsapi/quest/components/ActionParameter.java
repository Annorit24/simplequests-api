package xyz.annorit24.simplequestsapi.quest.components;

import org.bukkit.entity.Player;
import xyz.annorit24.simplequestsapi.quest.Container;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Annorit24
 * Created on 22/02/2020
 */
public final class ActionParameter implements Component.ComponentParameter {

    private Player player;
    private Map<Integer, Boolean> conditionsResults;
    private Container container;

    public ActionParameter setPlayer(Player player) {
        this.player = player;
        return this;
    }

    public ActionParameter setContainer(Container container) {
        this.container = container;
        return this;
    }

    public ActionParameter setConditionsResults(Map<Integer, ComponentResult> conditionsResults) {
        HashMap<Integer, Boolean> result = new HashMap<>();

        for (Map.Entry<Integer, ComponentResult> entry : conditionsResults.entrySet()) {
            Integer integer = entry.getKey();
            ComponentResult componentResult = entry.getValue();

            switch (componentResult){
                case FAILURE:
                case CRITICAL_FAILURE:
                    result.put(integer,false);break;
                case SUCCESS: result.put(integer,true);break;
            }

        }

        this.conditionsResults = result;
        return this;
    }

    public Player getPlayer() {
        return player;
    }
    public Map<Integer, Boolean> getConditionsResults() {
        return conditionsResults;
    }
    public Container getContainer() {
        return container;
    }
}
