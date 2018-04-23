import domain.player.Player;

public class RacingMain {

    public static void main(String[] args) {

    }

    private static void play(Player player) {
        try {

        } catch (IllegalArgumentException e) {
            play(player);
        }
    }
}
