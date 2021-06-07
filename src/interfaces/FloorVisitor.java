package interfaces;

import model.VisitResponse;

public interface FloorVisitor {
    public VisitResponse visit(Visitable visitable);
}
