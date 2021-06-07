package interfaces;

import model.VisitResponse;

public interface Visitable {
    public VisitResponse acceptVisit(FloorVisitor visitor);

    public int getVisitableId();
}
