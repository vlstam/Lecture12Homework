package homework;

import java.util.Scanner;

public class MethodsEx3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the type of figure: ");
        String figure = scan.next();
        if (figure.equalsIgnoreCase("rectangle")) {
            System.out.println("Please enter side A and B of the rectangle: ");
            rectangle();
        } else if (figure.equalsIgnoreCase("circle")) {
            System.out.println("Please enter the radius of the circle: ");
            circle();
        } else if (figure.equalsIgnoreCase("triangle")) {
            System.out.println("Please enter the side and the height of the triangle: ");
            triangle();
        } else {
            System.out.println("This figure is not in our database!");
        }

    }

    static void rectangle() {
        Scanner scan = new Scanner(System.in);
        int sideA = scan.nextInt();
        int sideB = scan.nextInt();
        int surface = sideA * sideB;
        System.out.println(surface);
    }

    static void circle() {
        Scanner scan = new Scanner(System.in);
        int radius = scan.nextInt();
        double surface = Math.PI + Math.pow(radius, 2);
        System.out.println(surface);
    }

    static void triangle() {
        Scanner scanner = new Scanner(System.in);
        int side = scanner.nextInt();
        int height = scanner.nextInt();
        int surface = side * height;
        System.out.println(surface);
    }
}
