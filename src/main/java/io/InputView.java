package io;

import domain.player.Player;

import java.util.Scanner;

public class InputView {
    private static Scanner scanner = new Scanner(System.in);

    public static Player getPlayer() {
        System.out.println("자동차 대수는 몇 대 인가요?");
        try {
            return new Player(convertNumber(scanner.nextLine()));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            return getPlayer();
        }
    }

    public static int getPlayAmount() {
        System.out.println("시도할 회수는 몇 회 인가요?");
        try {
            return convertNumber(scanner.nextLine());
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            return getPlayAmount();
        }
    }

    private static int convertNumber(String numMessage) throws NumberFormatException {
        try {
            return Integer.parseInt(numMessage);
        } catch (NumberFormatException e) {
            System.out.println("숫자를 입력해야합니다.");
            throw new NumberFormatException();
        }
    }


}
