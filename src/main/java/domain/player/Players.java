package domain.player;

import domain.result.RacingResult;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Players {
    private static final int MIN_PLAYER_NUM = 2;
    private ArrayList<Player> players = new ArrayList<>();

    public Players(List<PlayerName> names) throws IllegalArgumentException {
        if (!isValidPlayerNum(names)) {
            throw new IllegalArgumentException(MIN_PLAYER_NUM + "명 이상은 플레이 해야합니다.");
        }

        if (isDuplicateName(names)) {
            throw new IllegalArgumentException("중복된 이름이 존재합니다.");
        }
        addPlayer(names);
    }

    static boolean isValidPlayerNum(List<PlayerName> names) {
        return names.size() >= MIN_PLAYER_NUM;
    }

    static boolean isDuplicateName(List<PlayerName> names) {
        return new HashSet<>(names).size() != names.size();
    }

    private void addPlayer(List<PlayerName> names) {
        for (PlayerName name : names) {
            players.add(new Player(name));
        }
    }

    public void move(int amount) throws IllegalArgumentException {
        if (amount <= 0) {
            throw new IllegalArgumentException("1회 이상은 달려야합니다.");
        }

        for (Player player : players) {
            player.move(amount);
        }
    }

    public RacingResult getResults() {
        RacingResult results = new RacingResult();
        for (Player player : players) {
            player.addResult(results);
        }
        return results;
    }
}
