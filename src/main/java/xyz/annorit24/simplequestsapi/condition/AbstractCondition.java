package xyz.annorit24.simplequestsapi.condition;

import xyz.annorit24.simplequestsapi.client.Client;

public abstract class AbstractCondition {

    private Boolean conditionValue;

    public AbstractCondition() {
        this.conditionValue = false;
    }

    public abstract void call(Client client);

    public abstract void manageInvalidCondition(Client client);

    public Boolean getConditionValue() {
        return conditionValue;
    }
}