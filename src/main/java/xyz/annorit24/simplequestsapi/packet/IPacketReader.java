package xyz.annorit24.simplequestsapi.packet;

import org.bukkit.entity.Player;

/**
 * Class use to read packets sent by clients<br>
 * Must be register with {@link PacketReaderManager#registerPacketReader(IPacketReader)}
 *
 * @author Annorit24
 * Created on 24/01/2020
 */
public interface IPacketReader {

    /**
     * Read packets send to server
     *
     * @param player player which send the packet
     * @param packet the target packet
     */
    void readPacket(Player player, Object packet);

}
