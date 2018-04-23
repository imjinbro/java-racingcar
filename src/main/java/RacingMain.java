import domain.player.Player;
import io.InputView;

public class RacingMain {

    public static void main(String[] args) {
        Player player = InputView.getPlayer();
        play(player);
    }

    private static void play(Player player) {
        try {
            player.move(InputView.getPlayAmount());
            OutputView.printResult(player.getResults());
        } catch (IllegalArgumentException e) {
            play(player);
        }
    }
}
