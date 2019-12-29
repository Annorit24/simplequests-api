package xyz.annorit24.simplequestsapi.client;

import java.util.UUID;

/**
 * @author Annorit24
 * Created on 29/12/2019
 */
public abstract class ClientManager {

    public abstract Client getClient(UUID uuid);

    public abstract void loadClient(UUID uuid);

    public abstract void unloadClient(UUID uuid);

}
