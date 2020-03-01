package xyz.annorit24.simplequestsapi.pipeline;

import java.util.UUID;
import java.util.concurrent.Callable;

/**
 * @author Annorit24
 * Created on 22/02/2020
 */
public abstract class PipelineManager {

    public abstract void submitPipelineJob(Callable<Void> job, UUID playerUUID);

}
