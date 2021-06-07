package manager;

import impl.Player;
import interfaces.ChitNumberFilter;
import model.VisitResponse;

import java.util.ArrayList;
import java.util.List;

public class ResultCalculator {

    /**
     *  Function to check if the player has wone the game
     * @param visitedResponses Numbers yelled by Santa
     * @param player Player to check
     * @return boolean  if player is correct
     */
    public static boolean isWinner(List<VisitResponse> visitedResponses, Player player) {
        // Player responses
        List<Integer> playerResponse = player.getPlayerResponse();
        if(playerResponse == null) {
            return false;
        }

        // Get correct responses
        List<Integer> correctResponses = getCorrectResponses(visitedResponses, player);

        // compare against player responses
        if (playerResponse.containsAll(correctResponses) && correctResponses.containsAll(playerResponse)) {
            return true;
        }

        return  false;
    }

    // This is public only for mocking - should be ideally private
    public static List<Integer> getCorrectResponses(List<VisitResponse> visitedResponses, Player player) {
        List<Integer> correctResponses = new ArrayList<>();
        ChitNumberFilter chitFilter = player.getSelectedChit().getChitCondition();
        for (VisitResponse response: visitedResponses) {
            if(chitFilter.isFilteredin(response.getSelectedBall())) {
                correctResponses.add(response.getSelectedBall());
            }
        }
        return correctResponses;
    }
}
