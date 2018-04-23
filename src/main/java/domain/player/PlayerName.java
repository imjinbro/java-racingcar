package domain.player;

public class PlayerName {
    private String name;

    public PlayerName(String name) throws IllegalArgumentException {
        if (!isValidLength(name)) {
            throw new IllegalArgumentException("이름은 1자 이상 입력해야합니다.");
        }
        this.name = name;
    }

    static boolean isValidLength(String name) {
        return !name.isEmpty() && name.length() > 1;
    }
}
