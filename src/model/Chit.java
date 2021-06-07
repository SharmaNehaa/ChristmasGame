package model;

import interfaces.ChitNumberFilter;

public class Chit {
    private ChitNumberFilter chitCondition;

    public Chit(ChitNumberFilter chitCondition) {
        this.chitCondition = chitCondition;
    }

    public ChitNumberFilter getChitCondition() {
        return chitCondition;
    }
}
