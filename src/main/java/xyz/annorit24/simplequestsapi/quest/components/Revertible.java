package xyz.annorit24.simplequestsapi.quest.components;

import java.util.UUID;

/**
 * @author Annorit24
 * Created on 22/03/2020
 */
public interface Revertible {

    void revert(UUID playerUUID);

}
