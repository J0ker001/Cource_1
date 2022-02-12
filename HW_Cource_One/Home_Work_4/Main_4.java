package HW_Cource_One.Home_Work_4;

public class Main_4 {

    public static void main(String[] args) {

        task1();
        task2();
        task3();

    }

    public static void task1() {


        int i = 1;

        while (i <= 10) {

            System.out.print(" " + i);
            i++;
        }
        System.out.println();


        for (i = 10; i >= 1; i--) {
            System.out.print(" " + i);
        }
        System.out.println();
    }


    public static void task2() {


        for (int i = 3; i <= 31; i += 7) {
            System.out.println("Сегодня пятница, " + i + "-е число. Необходимо подготовить отчет.");
        }
    }


    public static void task3() {

        int startYear = 1821;
        int period = 300;
        int totalPeriod = startYear + period;


        for (int i = 1821; i < totalPeriod; i += 79) {
            if (i > 1821) {
                System.out.println(i);
            }
        }
    }


}
