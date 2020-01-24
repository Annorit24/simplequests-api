package xyz.annorit24.simplequestsapi.npc;

import org.bukkit.Location;
import org.bukkit.entity.Player;

/**
 * @author Annorit24
 * Created on 24/01/2020
 */
public abstract class QuestNPC {

    private Location location;
    protected Integer id;
    private String questId;
    private String npcName;
    private String skinName;

    public QuestNPC(Location location, String questId, String npcName, String skinName) {
        this.location = location;
        this.questId = questId;
        this.npcName = npcName;
        this.skinName = skinName;
    }

    public abstract void spawnNPC(Player player);

    public abstract void onInteract(Player player);

    public Location getLocation() {
        return location;
    }

    public Integer getId() {
        return id;
    }

    public String getQuestId() {
        return questId;
    }

    public String getSkinName() {
        return skinName;
    }

    public String getNpcName() {
        return npcName;
    }
}
