package domain.result;

import java.util.Objects;

public class CarResult implements Comparable<CarResult> {
    private String name;
    private int position;

    public CarResult(String name, int position) {
        this.name = name;
        this.position = position;
    }

    public String getName() {
        return name;
    }

    public String getPositionMessage() {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < position; i++) {
            builder.append("-");
        }
        return builder.toString();
    }

    public boolean isMatchPosition(int position) {
        return this.position == position;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CarResult result = (CarResult) o;
        return Objects.equals(name, result.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public int compareTo(CarResult otherResult) {
        return otherResult.position - this.position;
    }

    public int getPosition() {
        return position;
    }
}