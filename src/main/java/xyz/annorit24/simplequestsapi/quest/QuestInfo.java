package xyz.annorit24.simplequestsapi.quest;

/**
 * Object which contains all information<br>
 * about the current state of a player in a specific quest
 *
 * @author Annorit24
 * Created on 28/12/2019
 */
public final class QuestInfo {

    /**
     * Id of the quest
     */
    private String questId;

    /**
     * Name of the pipeline
     */
    private String pipeline;

    /**
     * The step of the quest
     */
    private Integer step;

    /**
     * The sub step of the quest
     */
    private Integer subStep;

    /**
     * Constructor
     *
     *  @param questId id of the quest
     * @param pipeline pipeline of the quest
     * @param step the current step
     * @param subStep the current sub step
     */
    public QuestInfo(String questId, String pipeline, Integer step, Integer subStep) {
        this.questId = questId;
        this.pipeline = pipeline;
        this.step = step;
        this.subStep = subStep;
    }

    public String getQuestId() {
        return questId;
    }

    public void setQuestId(String questId) {
        this.questId = questId;
    }

    public String getPipeline() {
        return pipeline;
    }

    public void setPipeline(String pipeline) {
        this.pipeline = pipeline;
    }

    public Integer getStep() {
        return step;
    }

    public void setStep(Integer step) {
        this.step = step;
    }

    public Integer getSubStep() {
        return subStep;
    }

    public void setSubStep(Integer subStep) {
        this.subStep = subStep;
    }

    @Override
    public boolean equals(Object obj) {
        System.out.println("Test");
        if(!(obj instanceof QuestInfo))return false;
        QuestInfo questInfo = (QuestInfo) obj;
        if(!questInfo.pipeline.equals(pipeline))return false;
        if(!questInfo.questId.equals(questId))return false;
        return questInfo.step.equals(step);
    }

}
