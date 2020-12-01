package JavaCourseUdemy;

import java.util.Scanner;

public class Arrays {

    public static void main(String[] args) {

        var scanner = new Scanner(System.in);

        var numbers = new int[Integer.parseInt(scanner.nextLine())];

        for (int i = 0; i < numbers.length; i++)
            numbers[i] = Integer.parseInt(scanner.nextLine());

        var min = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            var number = numbers[i];
            if (numbers[i] < min) {
                min = number;
            }
            System.out.println(min);


        }
    }
}
