package domain.player;

import java.util.Objects;

public class PlayerName {
    private static final int MIN_LENGTH = 2;
    private String name;

    public PlayerName(String name) throws IllegalArgumentException {
        if (!isValidLength(name)) {
            throw new IllegalArgumentException("이름은 " + MIN_LENGTH + "자 이상 입력해야합니다.");
        }
        this.name = name;
    }

    static boolean isValidLength(String name) {
        return name != null && name.length() >= MIN_LENGTH;
    }

    String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PlayerName that = (PlayerName) o;
        return Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
