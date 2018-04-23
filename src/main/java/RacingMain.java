import domain.player.Players;
import io.OutputView;

import static io.InputView.getPlayAmount;
import static io.InputView.getPlayers;

public class RacingMain {

    public static void main(String[] args) {
        Players players = getPlayers();
        play(players);
    }

    private static void play(Players players) {
        try {
            players.move(getPlayAmount());
            OutputView.printResult(players.getResults());
        } catch (IllegalArgumentException e) {
            play(players);
        }
    }
}
