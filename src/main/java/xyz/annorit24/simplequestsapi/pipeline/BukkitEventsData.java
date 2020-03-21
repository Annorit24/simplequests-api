package xyz.annorit24.simplequestsapi.pipeline;

import org.bukkit.event.Event;
import xyz.annorit24.simplequestsapi.utils.logger.LogUtils;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/**
 * @author Annorit24
 * Created on 22/02/2020
 */
public final class BukkitEventsData {

    private final Map<UUID, Event> eventsData;

    public BukkitEventsData() {
        eventsData = new HashMap<>();
    }

    public UUID addData(Event event){
        System.out.println(Thread.currentThread().getName());
        UUID uuid = UUID.randomUUID();
        eventsData.put(uuid, event);
        return uuid;
    }

    public Event getData(UUID uuid){
        System.out.println(Thread.currentThread().getName());

        if(!eventsData.containsKey(uuid)){
            LogUtils.ERROR.log("Could not retrieve data for the event id : "+uuid);
            return null;
        }
        return eventsData.get(uuid);
    }

    public void removeData(UUID uuid){
        eventsData.remove(uuid);
    }

}
