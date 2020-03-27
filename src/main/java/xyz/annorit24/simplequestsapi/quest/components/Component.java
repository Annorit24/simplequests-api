package xyz.annorit24.simplequestsapi.quest.components;

import xyz.annorit24.simplequestsapi.utils.Callback;

/**
 * @author Annorit24
 * Created on 22/02/2020
 */
public interface Component<T>{

    Callback<ComponentResult> call(T parameter);

    T cloneComponent();

}
