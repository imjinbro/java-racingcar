package domain.player;

import java.util.ArrayList;
import java.util.List;

public class Players {
    private ArrayList<Player> players = new ArrayList<>();

    public Players(List<PlayerName> names) throws IllegalArgumentException {
        if (!isValidPlayerNum(names)) {
            throw new IllegalArgumentException("1명 이상은 플레이 해야합니다.");
        }
        addPlayer(names);
    }

    static boolean isValidPlayerNum(List<PlayerName> names) {
        return names.size() > 0;
    }

    private void addPlayer(List<PlayerName> names) {
        for (PlayerName name : names) {
            players.add(new Player(name));
        }
    }
}
