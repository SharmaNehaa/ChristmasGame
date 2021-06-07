package impl;

import interfaces.FloorVisitor;
import interfaces.Visitable;
import model.VisitResponse;

public class Floor implements Visitable {
    private int floorNumber;

    public Floor(int floorNumber) {
        this.floorNumber = floorNumber;
    }

    @Override
    public VisitResponse acceptVisit(FloorVisitor santa) {
        return santa.visit(this);
    }

    @Override
    public int getVisitableId() {
        return floorNumber;
    }

    public int getFloorNumber() {
        return floorNumber;
    }

}
