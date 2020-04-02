package xyz.annorit24.simplequestsapi.customdata;

/**
 * @author Annorit24
 * Created on 28/03/2020
 */
public abstract class CustomData {

    public abstract String getKey();
    public abstract Object getValue();
    public abstract ValueType getValueType();
    public abstract CustomDataType getCustomDataType();

    public abstract String getAsString();
    public abstract Double getAsDouble();
    public abstract Integer getAsInteger();
    public abstract Boolean getAsBoolean();

    public abstract Boolean isPersistent();
    public abstract Boolean doesChange();

    public abstract void updateValue(Object o);

    public enum ValueType {
        DOUBLE, INTEGER, STRING, BOOLEAN;
    }

    public enum CustomDataType {
        QUEST_DATA, QUEST_STEP_DATA, GLOBAL_DATA;
    }
}
