package xyz.annorit24.simplequestsapi.pipeline;

import xyz.annorit24.simplequestsapi.quest.Container;
import xyz.annorit24.simplequestsapi.utils.Callback;

/**
 * @author Annorit24
 * Created on 08/02/2020
 */
public interface IQuestEventReader {

    Callback read(Container container);

}
