package domain.car;

public class UpperFourMove implements MoveStrategy {

    @Override
    public boolean isMove(int value) {
        return value > 4;
    }
}
