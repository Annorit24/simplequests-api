package xyz.annorit24.simplequestsapi.npc;

import org.bukkit.entity.Player;

/**
 * @author Annorit24
 * Created on 24/01/2020
 */
public abstract class QuestNPCManager {

    public abstract void registerNpc(QuestNPC questNPC);

    public abstract void asyncSpawnNpc(Player player);

    public abstract QuestNPC getQuestNPC(Integer id);
}
