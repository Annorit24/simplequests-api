package xyz.annorit24.simplequestsapi.pipeline;

import xyz.annorit24.simplequestsapi.quest.Container;
import xyz.annorit24.simplequestsapi.utils.Callback;

import java.util.Map;

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
            System.out.println("CALLING NEXT RUNNER");
            Integer i = container.getIndexPosition();
            System.out.println("current index : "+i);
            i++;
            container.setIndexPosition(i);
            System.out.println("next index : "+i);

            int j = 0;

            for (Map.Entry<String, Runner> entry : pipeline.getRunners().entrySet()) {
                String s = entry.getKey();
                Runner value = entry.getValue();
                System.out.println(j+" : "+value.getSlug());
                j++;
            }

            Runner runner = pipeline.getRunners().getValue(i);
            if(runner == null)return null;

            System.out.println(runner.getSlug());
            Callback c = runner.read(container);
            c.run();

            System.out.println("FINISH");

            return null;
        };
    }

    protected abstract void process(Container container);

    public String getSlug() {
        return slug;
    }

}
