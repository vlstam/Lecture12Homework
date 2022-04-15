package homework;

import java.util.Scanner;

public class MethodsEx2 {
    public static void main(String[] args) {
        middle();
    }

    static char middle() {
        Scanner scanner = new Scanner(System.in);
        String sentance = scanner.nextLine();
        if (sentance.length() % 2 == 0) {

            int middle2 = sentance.length() / 2;
            int middle3 = sentance.length() / 2 - 1;
            System.out.println(sentance.charAt((middle2)));
            System.out.println(sentance.charAt((middle3)));

        } else {
            int middle1 = sentance.length() / 2;
            System.out.println(sentance.charAt((middle1)));
        }
        return 0;
    }
}
