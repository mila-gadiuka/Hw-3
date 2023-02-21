public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }
    public static void task1() {
        System.out.println("Задача 1");
        int aPer = 20222022;
        System.out.println("Значение переменной aPer с типом int равно " + aPer );
        byte bPer = 122;
        System.out.println("Значение переменной bPer с типом byte равно " + bPer );
        short cPer = 32222;
        System.out.println("Значение переменной cPer с типом short равно " + cPer );
        long dPer = 929292929292929292L;
        System.out.println("Значение переменной dPer с типом long равно " + dPer );
        float ePer = 2.2929292F;
        System.out.println("Значение переменной ePer с типом float равно " + ePer );
        double fPer = 122.292929;
        System.out.println("Значение переменной fPer с типом double равно " + fPer );
    }
    public static void task2() {
        System.out.println("Задача 2");
        int aVariable = 569;
        System.out.println(aVariable);
        byte bVariable = 67 ;
        System.out.println(bVariable);
        short cVariable = -159;
        System.out.println(cVariable);
        long dVariable = 987678965549L;
        System.out.println(dVariable);
        float eVariable = 27.12F;
        System.out.println(eVariable);
        double fVariable = 2.786;
        System.out.println(fVariable);
        char gVariable = 27897 ;
        System.out.println(gVariable);
        boolean hVariable = false;
        System.out.println(hVariable);
    }
    public static void task3() {
        System.out.println("Задача 3");
        byte classLudPav = 23;
        System.out.println("Первый класс состоит из " + classLudPav + " человек");
        byte classAnnSer = 27;
        System.out.println("Второй класс состоит из " + classAnnSer + " человек");
        byte classEkaAnd = 30;
        System.out.println("Третий класс состоит из " + classEkaAnd + " человек");
        int totalStud = classLudPav + classAnnSer + classEkaAnd;
        System.out.println("Всего во всех трех классах " + totalStud + " человек");
        short amountOfPaper = 480;
        System.out.println("Всего приобретено " + amountOfPaper + " листов бумаги");
        int numberOfSheetsPerStudent = amountOfPaper / totalStud;
        System.out.println("На каждого ученика рассчитано " + numberOfSheetsPerStudent + " листов бумаги");
    }
    public static void task4() {
        System.out.println("Задача 4");
        byte theNumberOfBottlesInTwoMinutes = 16;
        System.out.println("За две минуты машина произвела " + theNumberOfBottlesInTwoMinutes + " бутылок");
        byte numberOfBottlesPerMinute = 16 / 2;
        System.out.println("За одну минуту машина произвела " + numberOfBottlesPerMinute + " бутылок");
        byte minutesIsAnHour = 60;
        byte hoursADay = 24;
        byte daysPerMonth = 31;
        int twentyMinutes = 20 * numberOfBottlesPerMinute;
        System.out.println("За двадцать минут машина произвела " + twentyMinutes + " бутылок");
        int day = minutesIsAnHour * hoursADay * numberOfBottlesPerMinute;
        System.out.println("За сутки машина произвела " + day + " бутылок");
        int threeDays = 3 * minutesIsAnHour * hoursADay * numberOfBottlesPerMinute;
        System.out.println("За три дня машина произвела " + threeDays + " бутылок");
        int month = minutesIsAnHour * hoursADay * daysPerMonth * numberOfBottlesPerMinute;
        System.out.println("За месяц машина произвела " + month + " бутылок");
    }
    public static void task5() {
        System.out.println("Задача 5");
        byte totalPaintCans = 120;
        System.out.println("На ремонт школы нужно " + totalPaintCans + " краски двух цветов");
        byte numberOfCansOfWhitePaintPerClass = 2;
        byte numberOfCansOfBrownPaintPerClass = 4;
        System.out.println("На ремонт одного класса нужно " + numberOfCansOfWhitePaintPerClass + " белой и " + numberOfCansOfBrownPaintPerClass + " коричневой банки краски");
        int numberOfCansOfWhiteAndBrownPaintPerClass = numberOfCansOfWhitePaintPerClass + numberOfCansOfBrownPaintPerClass;
        System.out.println("На ремонт одного класса нужно " + numberOfCansOfWhiteAndBrownPaintPerClass + " банок краски");
        int totalClassesInTheSchool = totalPaintCans / numberOfCansOfWhiteAndBrownPaintPerClass;
        System.out.println("Всего в школе " + totalClassesInTheSchool + " классов");
        int totalCansOfWhitePaint = totalClassesInTheSchool * numberOfCansOfWhitePaintPerClass;
        int totalCansOfBrownPaint = totalClassesInTheSchool * numberOfCansOfBrownPaintPerClass;
        System.out.println("В школе, где " + totalClassesInTheSchool + " классов, нужно " + totalCansOfWhitePaint + " банок белой краски и " + totalCansOfBrownPaint + " банок коричневой краски");
    }
    public static void task6() {
        System.out.println("Задача 6");
        short oneKilogramInGrams = 1000;
        byte numberOfBananas = 5;
        byte weightOfOnBanana = 80;
        int totalWeightOfBananas = numberOfBananas * weightOfOnBanana;
        System.out.println("Общий вес бананов для спорт-завтрака " + totalWeightOfBananas + " грамм");
        short milkWeight = 210;
        System.out.println("Общий вес молока для спорт-завтрака " + milkWeight + " миллилитров");
        byte quantityOfIceCream = 2;
        byte weightOfOneIceCream = 100;
        int totalWeightOfIceCream = quantityOfIceCream * weightOfOneIceCream;
        System.out.println("Общий вес мороженого для спорт-завтрака " + totalWeightOfIceCream + " грамм");
        byte numberOfEggs = 4;
        byte weightOfOneEgg = 70;
        int totalWeightOfEggs = numberOfEggs * weightOfOneEgg;
        System.out.println("Общий вес яиц для спорт-завтрака " + totalWeightOfEggs + " грамм");
        int totalWeightOfSportsBreakfast = totalWeightOfBananas + totalWeightOfEggs + totalWeightOfIceCream + milkWeight;
        System.out.println("Общий вес спорт-завтрака " + totalWeightOfSportsBreakfast + " грамм");
        float weightOfSportsBreakfastInKilograms = (float) totalWeightOfSportsBreakfast / oneKilogramInGrams;
        System.out.println("Общий вес спорт-завтрака " + weightOfSportsBreakfastInKilograms + " килограмм");
    }
    public static void task7() {
        System.out.println("Задача 7");
        short oneKilogramInGrams = 1000;
        byte justNeedToReset = 7;
        short weightLossIsOptionOne = 250;
        short weightLossIsOptionTwo = 500;
        int howMuchShouldILoseInGrams = justNeedToReset * oneKilogramInGrams;
        System.out.println( howMuchShouldILoseInGrams + " грамм нужно сбросить спортсмену");
        int theFirstWay = howMuchShouldILoseInGrams / weightLossIsOptionOne;
        System.out.println( theFirstWay + " дней потребуется спорстмену чтобы похудеть, скидывая 250 грамм в день");
        int theSecondWay = howMuchShouldILoseInGrams / weightLossIsOptionTwo;
        System.out.println( theSecondWay + " дней потребуется спорстмену чтобы похудеть, скидывая 500 грамм в день");
        int average = (theFirstWay + theSecondWay) / 2;
        System.out.println("В среднем потребуется " + average + " дней чтобы похудеть спортсмену, скидывая 250-500 грамм в день");
    }
    public static void task8() {
        System.out.println("Задача 8");
        byte totalSalaryInterest = 100;
        byte additionalPercentage = 10;
        int annualSalarySupplementAsAPercentage = totalSalaryInterest + additionalPercentage; // общий процент к зп
        byte numberOfMonthsInAYear = 12; //кол-во месяцев в году

        int mashaIsMonthlySalary = 67760;
        System.out.println("Нынешняя зарплата Маши в месяц " + mashaIsMonthlySalary + " рублей");
        int mashaAnnualSalary = mashaIsMonthlySalary * numberOfMonthsInAYear;
        System.out.println("Нынешняя зарплата Маши в год " + mashaAnnualSalary + " рублей");
        int mashaSalaryWithAPercentage = annualSalarySupplementAsAPercentage * mashaIsMonthlySalary / totalSalaryInterest;
        int mashaAnnualSalaryWithInterest = mashaSalaryWithAPercentage * numberOfMonthsInAYear; //нынешний годовой доход с процентами
        int mashaAnnualIncomeGrewBy = mashaAnnualSalaryWithInterest - mashaAnnualSalary;
        System.out.println("Маша теперь получает " + mashaSalaryWithAPercentage + " рублей. Годовой доход вырос на " + mashaAnnualIncomeGrewBy + " рублей");

        int denisIsMonthlySalary = 83690;
        System.out.println("Нынешняя зарплата Дениса в месяц " + denisIsMonthlySalary + " рублей");
        int denisAnnualSalary = denisIsMonthlySalary * numberOfMonthsInAYear;
        System.out.println("Нынешняя зарплата Дениса в год " + denisAnnualSalary + " рублей");
        int denisSalaryWithAPercentage = annualSalarySupplementAsAPercentage * denisIsMonthlySalary / totalSalaryInterest;
        int denisAnnualSalaryWithInterest = denisSalaryWithAPercentage * numberOfMonthsInAYear; //нынешний годовой доход с процентами
        int denisAnnualIncomeGrewBy = denisAnnualSalaryWithInterest - denisAnnualSalary;
        System.out.println("Денис теперь получает " + denisSalaryWithAPercentage + " рублей. Годовой доход вырос на " + denisAnnualIncomeGrewBy + " рублей");

        int christinaIsMonthlySalary = 76230;
        System.out.println("Нынешняя зарплата Кристины в месяц " + christinaIsMonthlySalary + " рублей");
        int christinaAnnualSalary = christinaIsMonthlySalary * numberOfMonthsInAYear;
        System.out.println("Нынешняя зарплата Кристины в год " + christinaAnnualSalary + " рублей");
        int christinaSalaryWithAPercentage = annualSalarySupplementAsAPercentage * christinaIsMonthlySalary / totalSalaryInterest;
        int christinaAnnualSalaryWithInterest = christinaSalaryWithAPercentage * numberOfMonthsInAYear; //нынешний годовой доход с процентами
        int christinaAnnualIncomeGrewBy = christinaAnnualSalaryWithInterest - christinaAnnualSalary;
        System.out.println("Кристина теперь получает " + christinaSalaryWithAPercentage + " рублей. Годовой доход вырос на " + christinaAnnualIncomeGrewBy + " рублей");
    }
}