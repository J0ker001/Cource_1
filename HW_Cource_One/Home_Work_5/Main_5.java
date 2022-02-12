package HW_Cource_One.Home_Work_5;

import java.util.Arrays;

public class Main_5 {

    public static void main(String[] args) {

        int[] arrOne = new int[]{1, 2, 3};
        System.out.println(Arrays.toString(arrOne));
        for (int i = 2; i >= 0; i--) {
            if (i != 0)
                System.out.print(arrOne[i] + ", ");
            else System.out.print(arrOne[i]);
        }
        System.out.println();
        for (int i = 0; i < arrOne.length; i++) {
            if (arrOne[i] % 2 != 0) {
                System.out.print(arrOne[i] + 1);
            } else System.out.print(arrOne[i]);
            System.out.print(" ");
        }

        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();

        float[] arrTwo = {1.57f, 7.654f, 9.986f};
        System.out.println(Arrays.toString(arrTwo));
        for (int i = 2; i >= 0; i--) {
            if (i != 0)
                System.out.print(arrTwo[i] + ", ");
            else System.out.println(arrTwo[i]);
        }

        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();

        float[] arrThree = {2.85f, 4.54f, 5.32f, 7.213f};
        System.out.println(Arrays.toString(arrThree));
        for (int i = 3; i >= 0; i--) {
            if (i != 0)
                System.out.print(arrThree[i] + ", ");
            else System.out.println(arrThree[i]);
        }
    }
}
