package xyz.annorit24.simplequestsapi.npc;

import xyz.annorit24.simplequestsapi.utils.logger.LogUtils;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Annorit24
 * Created on 28/03/2020
 */
public abstract class NPCStartManager {

    /**
     * Register a start npc
     *
     * @param npcId the npc id
     * @param questId the starting quest id
     */
    public abstract void registerNPCStart(Integer npcId, String questId);

    /**
     * Get the quest id to start by the id of the start npc
     *
     * @param npcId the start npc id
     * @return the corresponding quest id or an empty string if there is no corresponding questId
     */
    public abstract String getQuestIdByNPCId(Integer npcId);

}
