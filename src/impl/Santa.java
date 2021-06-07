package impl;

import constants.GameConstants;
import interfaces.AnnouncementListener;
import interfaces.Announcer;
import interfaces.FloorVisitor;
import interfaces.Visitable;
import model.VisitResponse;

import java.util.List;

public class Santa implements FloorVisitor, Announcer {
    private List<AnnouncementListener> listeners;

    public Santa(List<AnnouncementListener> listeners) {
        this.listeners = listeners;
    }

    @Override
    public VisitResponse visit(Visitable visitable) {
            // Random number generation
            int RandomBall = (int) (Math.random() * GameConstants.MAX_BALL_NUMBER);
            System.out.println("Visiting " + visitable.getVisitableId() + " floor and selected ball " + RandomBall);
            return new VisitResponse(visitable.getVisitableId(), RandomBall);
    }

    @Override
    public void announce(VisitResponse response) {
        for (AnnouncementListener listner:listeners) {
            listner.listen(response);
        }
    }

    public void addListener(AnnouncementListener listener) {
        this.listeners.add(listener);
    }
}
