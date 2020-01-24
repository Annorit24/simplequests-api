package xyz.annorit24.simplequestsapi.packet;

/**
 * @author Annorit24
 * Created on 24/01/2020
 */
public abstract class PacketReaderManager {

    /**
     * Register a packet reader
     *
     * @param reader reader object
     */
    public abstract void registerPacketReader(IPacketReader reader);

    /**
     * Unregister a packet reader
     *
     * @param reader reader object
     */
    public abstract void unregisterPacketReader(IPacketReader reader);

}
