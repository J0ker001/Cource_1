package HW_Cource_One.Home_Work_2;

public class Main_2 {

    public  static void main(String[] args) {

        ///////Задача 1.
        System.out.println("Задача №1");
        System.out.println("присвоить переменные");
        byte a1 = 32;
        short b1 = 28832;
        int c1 = 54456421;
        long d1 = 8921377887321L;

        float e1 = 1.3232f;
        double f1 = 1.2213232322;
        var g1 = 777;

        char  ch=70;

        boolean a7=true;
        boolean a8=false;

        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();



        ///////Задача 2
        System.out.println("Задача №2");

        float fighterWeight1 = 78.2f;
        float fighterWeight2 = 82.7f;
        float totalWeight = fighterWeight1 + fighterWeight2;
        float differenceWeight = fighterWeight2 % fighterWeight1;
        System.out.println("Вес одного боксера " + fighterWeight1 + "кг");
        System.out.println("Вес второго боксера " + fighterWeight2 + "кг");
        System.out.println("Общий вес = " + totalWeight+ "кг");
        System.out.println("Разница веса = " + differenceWeight + "кг");
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();




        ///////Задача 3
        System.out.println("Задача №3");

        byte weightBanana = 80;
        byte weight100mlMilk = 105;
        byte weightIceCream = 100;
        byte weightEgg = 70;
        int weigthBreakfastG = weightBanana * 5 + weight100mlMilk * 2 + weightIceCream * 2 + weightEgg * 4;
        float weigthBreakfastKg = weigthBreakfastG / 1000f;
        System.out.println("Завтра спортсмена весит " + weigthBreakfastG + "г." + " Это в киллограмах " + weigthBreakfastKg + "кг.");
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();


        ///////Задача 4.
        System.out.println("Задача №4");

        float weight = 7f;
        float kg = 1000f;
        float loseWeight250 = 250f;
        float loseWeight250kg = loseWeight250 / kg;

        float loseWeight500 = 500;
        float loseWeight500Kg = loseWeight500 / kg;

        float loseWeightAverage = (loseWeight250kg + loseWeight500Kg )/ 2;
        float day250 = weight / loseWeight250kg;
        float day500 = weight / loseWeight500Kg;
        float remainderdivision = weight % loseWeightAverage;
        float remainder = remainderdivision/loseWeightAverage;
        float dayAverage = ((weight / loseWeightAverage) - remainder) +1;




        System.out.println("Если худеть по 250г в день, потребуется " + day250 + " дней");
        System.out.println("Если худеть по 500г в день, потребуется " + day500 + " дней");
        System.out.println("В среднем потребуеться " + dayAverage +   " дней");
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();





        ///////Задача 5.
        System.out.println("Задача №5");

        int mashaSalary = 67760;
        int denSalary = 83690;
        int krisSalary = 76230;
        float indexing = 0.1f;

        float mashaNewSalary = (mashaSalary * indexing) + mashaSalary;
        float denNewSalary = (denSalary * indexing) + denSalary;
        float krisNewSalary = (krisSalary * indexing) + krisSalary;

        byte year = 12;

        float differenceMashaSalary = (mashaNewSalary - mashaSalary) * year;
        float differenceDenSalary = (denNewSalary - denSalary) * year;
        float differenceKrisSalary = (krisNewSalary - krisSalary) * year;

        System.out.println("Маша теперь получает " + mashaNewSalary + "рублей. " + "Годовой доход вырос на " + differenceMashaSalary + "рублей.");
        System.out.println("Денис теперь получает " + denNewSalary + "рублей. " + "Годовой доход вырос на " + differenceDenSalary + "рублей.");
        System.out.println("Кристина теперь получает " + krisNewSalary + "рублей. " + "Годовой доход вырос на " + differenceKrisSalary + "рублей.");
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();


        ///////Задача 6.
        System.out.println("Задача №6");

        byte a = 12;
        byte b = 27;
        byte c = 44;
        byte d = 15;
        byte e = 9;

        int result = a * (b + (c - d * e));
        int result1 = (a * (b + (c - d * e)))*-1;

        System.out.println(result);
        System.out.println(result1);

        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();

        ///////Задача 7.
        System.out.println("Задача №7");

        int m = 5 ;
        int n = 7;
        System.out.println("До : a = " + m + " b = "+n);
        m = m^n^(n = m);
        System.out.println("После : a = "+ m + " b = "  + n);
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();

        ///////Задача 8.
        System.out.println("Задача №8");

        int v=242;
        System.out.println(v%100/10); // вывод десятков

    }
}
