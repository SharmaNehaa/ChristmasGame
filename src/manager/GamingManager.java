package manager;

import impl.Santa;
import model.ChristmasGame;
import impl.Player;

import java.util.ArrayList;

/**
 *  Manager class responsible for initialization of game, player registration etc.
 */
public class GamingManager {

    public void StartGame() {
        // initialize game
        ChristmasGame game = new ChristmasGame("TestGame",
                new Santa(new ArrayList<>()));
        System.out.println("Starting game " + game.getId());
        game.initializeGame();

        // Register Players
        Player player1 = new Player("Player1");
        game.registerPlayer(player1);
        game.registerPlayer(new Player("Player2"));

        // Santa travels the floors on the tree
        game.makeSantaTravelFloors();

        // Mock the Player 1 response to the correct response
        player1.setPlayerResponse(ResultCalculator.getCorrectResponses(game.getResponseList(), player1));

        System.out.println("Game has " + game.getWinners().size() + " winners");
    }


}
