package domain.car;

class Position {
    private int position = 0;

    int move(int value) {
        if (value >= 4) {
            position++;
        }
        return position;
    }

    int getPosition() {
        return position;
    }
}
