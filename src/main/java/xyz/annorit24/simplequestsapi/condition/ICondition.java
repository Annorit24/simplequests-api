package xyz.annorit24.simplequestsapi.condition;

import xyz.annorit24.simplequestsapi.client.Client;

public interface ICondition {

    boolean isValid(Client client);

    void manageInvalidCondition(Client client);

}