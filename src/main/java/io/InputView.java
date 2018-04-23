package io;

import domain.player.PlayerName;
import domain.player.Players;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import static java.util.stream.Collectors.toList;

public class InputView {
    private static Scanner scanner = new Scanner(System.in);

    public static Players getPlayers() {
        System.out.println("경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분).");
        try {
            return new Players(makePlayerNames(parseNames(scanner.nextLine())));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            return getPlayers();
        }
    }

    private static String[] parseNames(String values) {
        return values.replaceAll(" ", "").split(",");
    }

    private static List<PlayerName> makePlayerNames(String[] names) throws IllegalArgumentException {
        return Arrays.stream(names).map(PlayerName::new).collect(toList());
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
