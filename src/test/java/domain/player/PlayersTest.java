package domain.player;

import org.junit.Test;

import java.util.Arrays;

import static domain.player.Players.isValidPlayerNum;
import static java.util.Collections.emptyList;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class PlayersTest {

    @Test
    public void invalid_player_num() {
        assertFalse(isValidPlayerNum(emptyList()));
    }

    @Test
    public void valid_player_num() {
        assertTrue(isValidPlayerNum(Arrays.asList(new PlayerName("jinbro"), new PlayerName("colin"), new PlayerName("jinhyung"))));
    }
}
