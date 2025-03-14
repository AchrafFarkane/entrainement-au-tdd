package io.github.gabbloquet.tddtraining.CodeRefactoring.TaskPerformer;

import java.util.List;

public abstract class TaskPerformer {
    protected List<String> tasks;

    public TaskPerformer(List<String> tasks) {
        this.tasks = tasks;
    }

    public abstract void performTask();
}
