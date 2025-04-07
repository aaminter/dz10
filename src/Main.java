import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] firstArr = {1, 2, 3};
        float[] secondArr = {1.57f, 7.654f, 9.986f};
        int[] thirdArr = new int [12];

        System.out.println("Задание 2");
        for (int i = 0; i < 3; i++) {
            System.out.print(firstArr[i]);
            if (i != 2)
                System.out.print(", ");
        }
        System.out.println();
        for (int i = 0; i < 3; i++) {
            System.out.print(secondArr[i]);
            if (i != 2)
                System.out.print(", ");
        }
        System.out.println();
        for (int i = 0; i < 3; i++) {
            System.out.print(thirdArr[i]);
            if (i != 2)
                System.out.print(", ");
        }
        System.out.println();

        System.out.println();
        System.out.println("Задание 3");

        for (int i = 2; i >= 0; i--) {
            System.out.print(firstArr[i]);
            if (i != 0)
                System.out.print(", ");
        }
        System.out.println();
        for (int i = 2; i >= 0; i--) {
            System.out.print(secondArr[i]);
            if (i != 0)
                System.out.print(", ");
        }
        System.out.println();
        for (int i = 2; i >= 0; i--) {
            System.out.print(thirdArr[i]);
            if (i != 0)
                System.out.print(", ");
        }
        System.out.println();

        System.out.println();
        System.out.println("Задание 4");

        for (int i = 0; i < firstArr.length; i++) {
            if (firstArr[i] % 2 != 0)
                firstArr[i] += 1;
            System.out.println(Arrays.toString(firstArr));
        }
    }
}

