package impl;

import interfaces.AnnouncementListener;
import model.Chit;
import model.VisitResponse;

import java.util.List;

public class Player implements AnnouncementListener {
    private int id;
    private String name;
    private List<Integer> playerResponse;
    private Chit selectedChit;

    public Player(String name) {
        this.name = name;
    }


    @Override
    public void listen(VisitResponse response) {
        // prompt user that response has been announced - and ask if he wishes to select
    }

    public void selectResponse(VisitResponse response) {
        playerResponse.add(response.getSelectedBall());
    }

    public Chit getSelectedChit() {
        return selectedChit;
    }

    public void setSelectedChit(Chit selectedChit) {
        this.selectedChit = selectedChit;
    }

    public void setPlayerResponse(List<Integer> playerResponse) {
        this.playerResponse = playerResponse;
    }

    public List<Integer> getPlayerResponse() {
        return playerResponse;
    }

    public String getName() {
        return name;
    }

}
