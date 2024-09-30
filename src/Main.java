import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        System.out.println("Задание 1");

        System.out.println("Задание 1.1");
        int[] numbers = new int[12];
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);

        }
        System.out.println("Задание 1.2");

        double[] weight = new double[12];
        weight[0] = 1.57;
        weight[1] = 7.654;
        weight[2] = 9.986;
        for (int a = 0; a < weight.length; a++) {
            System.out.println(weight[a]);

        }
        System.out.println("Задание 2");

        System.out.println("Задание 2.1");
        System.out.println(Arrays.toString(numbers));

        System.out.println("Задание 2.2");
        System.out.println(Arrays.toString(weight));


        System.out.println("Задание 3");

        System.out.println("Задание 3.1");
        int[] numbersC = {1, 2, 3};
        for (int c = numbersC.length - 1; c >= 0; c--) {
            System.out.print(numbersC[c] + " ");
        }
        System.out.println();
        System.out.println("Задание 3.2");
        double[] numbersB = {1.57, 7.654, 9.986};
        for (int b = numbersB.length - 1; b >= 0; b--) {
            System.out.print(numbersB[b] + " ");
        }

        System.out.println();
        System.out.println("Задание 4");
        int[] numbersD = {1, 2, 3};
        for (int d = 0; d < numbersD.length; d++) {
            if (numbersD [d] % 2 != 0) {
                numbersD [d] = numbersD [d] + 1;

            }
        }
        System.out.println(Arrays.toString(numbersD));
    }
}