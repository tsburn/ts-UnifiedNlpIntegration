package be.r3w6.xposedunifiednlp;

import android.util.Log;

/**
 * Created on 13.02.2015.
 */
public abstract class CheckStep {
    public CheckStep(String name) {
        this.name = name;
    }

    protected abstract void runStep();

    private String name;
    private StepState state = StepState.WAIT;
    private String solution;

    p