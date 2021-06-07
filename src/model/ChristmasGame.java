package model;

import constants.GameConstants;
import filterImpl.EvenNumberFilter;
import filterImpl.MultiplierChecker;
import impl.Floor;
import impl.Player;
import impl.Santa;
import manager.ResultCalculator;

import java.util.ArrayList;
import java.util.List;

/**
 *  Class responsible for the implementation of Game methods like initialization etc.
 */
public class ChristmasGame {
    private String id;
    private Santa santa;
    private List<Chit> chitBag;
    private List<VisitResponse> responseList;
    private List<Player> players;

    public ChristmasGame(String id, Santa santa) {
        this.id = id;
        this.santa = santa;
        chitBag = new ArrayList<>();
        responseList = new ArrayList<>();
        players = new ArrayList<>();
    }

    public void initializeGame() {
        // get chits bag ready - For now just adding 5 chits of each type
        initializeChitsBag();
    }

    private void initializeChitsBag() {
        // Iterate through the Number filter implementations and add to chitBag
    }

    public void makeSantaTravelFloors() {
        System.out.println("Santa now ready to visit the floors");
        for (int floor = 0; floor < GameConstants.FLOOR_COUNT; floor++) {
            VisitResponse response = santa.visit(new Floor(floor));
            responseList.add(response);
        }
    }

    public void registerPlayer(Player player) {
        System.out.println("Player " + player.getName() + " registered to play");
        players.add(player);

        // Adding the player to the Santa's listener list
        santa.addListener(player);

        // Assign a chit
        assignRandomChit(player);
    }

    public void assignRandomChit(Player player) {
        // Simplifying the random logic with just two Chit Conditions for now - this can be randomized using chitBags arraylist
        double random = Math.random()*100;

        if(random%2 ==0) {
            player.setSelectedChit(new Chit(new EvenNumberFilter()));
        } else {
            player.setSelectedChit(new Chit(new MultiplierChecker(5)));
        }
    }

    public List<Player> getWinners() {
        List<Player> winners = new ArrayList<>();

        for (Player player: getPlayers()) {
            if(ResultCalculator.isWinner(responseList, player)) {
                winners.add(player);
            }
        }

        return winners;
    }

    public String getId() {
        return id;
    }

    public List<Player> getPlayers() {
        return players;
    }

    public List<VisitResponse> getResponseList() {
        return responseList;
    }

}
