package com.example.belale.santanderproject.utils.animation;


import com.example.belale.santanderproject.R;

public enum FragmentAnimation {

    SLIDE_LEFT_TO_RIGHT(R.animator.slide_in_right, R.animator.slide_out_right),
    SLIDE_RIGHT_TO_LEFT(R.animator.slide_in_left, R.animator.slide_out_left),
    STATIONARY(R.animator.stationary, R.animator.stationary);

    private int inTransition;
    private int outTransition;

    FragmentAnimation(int inTransition, int outTransition) {
        this.inTransition = inTransition;
        this.outTransition = outTransition;
    }

    public int getInTransition() {
        return inTransition;
    }

    public int getOutTransition() {
        return outTransition;
    }
}
