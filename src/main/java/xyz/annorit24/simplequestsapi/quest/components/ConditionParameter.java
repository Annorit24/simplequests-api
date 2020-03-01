package xyz.annorit24.simplequestsapi.quest.components;

import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import xyz.annorit24.simplequestsapi.SimpleQuestsAPI;

import java.util.UUID;

/**
 * @author Annorit24
 * Created on 22/02/2020
 */
public final class ConditionParameter implements Component.ComponentParameter {

    private UUID bukkitEventId;
    private Player player;

    public ConditionParameter setBukkitEventId(UUID bukkitEventId) {
        this.bukkitEventId = bukkitEventId;
        return this;
    }

    public ConditionParameter setPlayer(Player player) {
        this.player = player;
        return this;
    }

    public Event getBukkitEvent() {
        return SimpleQuestsAPI.get().getBukkitEventsData().getData(bukkitEventId);
    }

    public Player getPlayer() {
        return player;
    }
}
