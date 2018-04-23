package domain.player;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class PlayerNameTest {

    @Test
    public void invalid_name_length() {
        assertFalse(PlayerName.isValidLength(""));
    }

    @Test
    public void valid_name_length() {
        assertTrue(PlayerName.isValidLength("colin"));
    }
}
