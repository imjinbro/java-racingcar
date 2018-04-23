package domain.result;

public class CarResult {
    private int position;

    public CarResult(int position) {
        this.position = position;
    }

    public String get() {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < position; i++) {
            builder.append("-");
        }
        return builder.toString();
    }
}