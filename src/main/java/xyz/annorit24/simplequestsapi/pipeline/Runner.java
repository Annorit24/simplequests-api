package xyz.annorit24.simplequestsapi.pipeline;

import xyz.annorit24.simplequestsapi.quest.Container;
import xyz.annorit24.simplequestsapi.utils.Callback;

/**
 * @author Annorit24
 * Created on 12/02/2020
 */
public abstract class Runner implements IQuestEventReader {

    private final String slug;
    protected Pipeline pipeline;

    public Runner(String slug, Pipeline pipeline) {
        this.slug = slug;
        this.pipeline = pipeline;
    }

    @Override
    public Callback read(Container container) {
        System.out.println("PROCESS BEFORE");
        process(container);
        System.out.println("PROCESS AFTER");
        return () -> {
            Integer i = container.getIndexPosition();
            System.out.println(i);
            i++;
            container.setIndexPosition(i);

            Runner runner = pipeline.getRunners().getValue(i);
            if(runner == null)return null;
            Callback c = runner.read(container);
            System.out.println(runner.getSlug());
            c.run();

            System.out.println(i);

            return null;
        };
    }

    protected abstract void process(Container container);

    public String getSlug() {
        return slug;
    }

}
