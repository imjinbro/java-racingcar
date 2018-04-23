package domain.player;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class PlayersTest {

    @Test
    public void invalid_player_num() {
        assertFalse(Players.isValidPlayerNum(Collections.emptyList()));
    }

    @Test
    public void valid_player_num() {
        assertTrue(Players.isValidPlayerNum(Arrays.asList(new PlayerName("jinbro"), new PlayerName("colin"), new PlayerName("jinhyung"))));
    }
}
