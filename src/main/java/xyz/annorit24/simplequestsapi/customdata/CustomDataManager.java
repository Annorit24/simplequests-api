package xyz.annorit24.simplequestsapi.customdata;

import xyz.annorit24.simplequestsapi.client.Client;

/**
 * @author Annorit24
 * Created on 18/04/2020
 */
public abstract class CustomDataManager {

    public abstract void cleanQuestsData(Client client);

    public abstract void cleanQuestStepsData(Client client);

}
