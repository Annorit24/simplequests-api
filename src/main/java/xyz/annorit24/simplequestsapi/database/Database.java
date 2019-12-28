package xyz.annorit24.simplequestsapi.database;

import org.bukkit.entity.Player;
import xyz.annorit24.simplequestsapi.client.Client;

import java.util.UUID;

/**
 * Abstract class use to interact with the database set in the global config<br>
 * The class is extended by classes for each different type of data storage (sql and json)
 *
 * @author Annorit24
 * Created on 27/12/2019
 */
public abstract class Database {

    /**
     * Init the database when the server start
     */
    public abstract void init();

    /**
     * Close the database when the server shutdown
     */
    public abstract void close();

    /**
     * Get client data in the database
     *
     * @param uuid uuid of the bukkit player
     * @return Client object to interact with the data of the client
     */
    public abstract Client getClient(UUID uuid);

    /**
     * Create a new client profile in the database
     *
     * @param player the target bukkit player which have no account in the database
     * @return Client created
     */
    public abstract xyz.annorit24.simplequestsapi.client.Client createNewClient(Player player);

    /**
     * Save client data in the database
     *
     * @param client client data to save
     */
    public abstract void saveClient(Client client);

    /**
     * Test if a client account exist in the database for a player
     *
     * @param uuid uuid of the tested player
     * @return true if it exist else, return false
     */
    public abstract boolean doesExist(UUID uuid);


}
