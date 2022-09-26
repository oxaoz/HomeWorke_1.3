public class Main {
    public static void main(String[] args) {

        System.out.println("Задача N1");
        byte oneFly = 25;
        System.out.println("Значение переменной oneFly с типом byte равно " + oneFly);
        short twoCoffee = 32567;
        System.out.println("Значение переменной twoCoffee с типом short равно " + twoCoffee);
        int threeNuts = 1122334455;
        System.out.println("Значение переменной threeNuts с типом int равно " + threeNuts);
        long fourPlum = 998877665544332211L;
        System.out.println("Значение переменной fourPlum с типом long равно " + fourPlum);
        float fiveFrogs = 1.1234567f;
        System.out.println("Значение переменной fiveFrogs с типом float равно " + fiveFrogs);
        double sixDogs = 1.123456789;
        System.out.println("Значение переменной sixDogs с типом double равно " + sixDogs);

        System.out.println("Задача N2");
        float sugarWight = 27.12f;
        System.out.println("Вес сахара " + sugarWight + " кг");
        long manySm = 987678965549L;
        System.out.println("Экватор примерно " + manySm + " см");
        double littleDog = 2.768;
        System.out.println("Маленькая собачка не больше " + littleDog + " кг");
        boolean heavyDog = littleDog > 10;
        System.out.println( "Утверждение, что маленькая собачка, больше 10 кг - " + heavyDog);
        short saltWight = 768;
        System.out.println("Вес соли " + saltWight + " кг");
        short smallSize = -159;
        System.out.println(smallSize);
        int bigShip = 27897;
        System.out.println("Большой корабль " + bigShip + " тонн");
        byte bigFly = 67;
        System.out.println("Большая муха " + bigFly + " см");

        System.out.println("Задача N3");
        byte ludmilaPavlovna = 23;
        System.out.println("У Людмилы Павловны " + ludmilaPavlovna + " ученика.");
        short annaSergeevna = 27;
        System.out.println("У Анны Сергеевны " + annaSergeevna + " ученика.");
        int ekaterinaAndreevna = 30;
        System.out.println("У Екатерины Андреевны " + ekaterinaAndreevna + " ученика.");
        int totalStudents = ludmilaPavlovna + annaSergeevna + ekaterinaAndreevna;
        System.out.println("Всего " + totalStudents + " учеников.");
        long papers = 480L;
        System.out.println("Бумаги " + papers + " листов.");
        System.out.println("На каждого ученика рассчитано " + papers / totalStudents + " листов бумаги.");

        System.out.println("Задача N4");
        short perfomanceBottle = 16;
        byte perfomanceTime = 2;
        byte timeOne = 20;
        short timeTwo = 24;
        int timeTree = 3;
        long timeFour = 1L;
        int changeTime = timeOne / perfomanceTime;
        System.out.println("За " + timeOne + " минут машина произвела бутылок " + perfomanceBottle * changeTime + " штук.");
        System.out.println("За " + timeTwo + " часа машина произвела бутылок " + (perfomanceBottle * changeTime * 3 * timeTwo) + " штук.");
        System.out.println("За " + timeTree + " дня машина произвела бутылок " + (perfomanceBottle * changeTime * 3 * timeTwo * timeTree) + " штук.");
        System.out.println("За " + timeFour + " месяц машина произвела бутылок " + (perfomanceBottle * changeTime * 3 * timeTwo * timeTree * 10) + " штук.");

        System.out.println("Задача N5");
        byte tinOfPain = 120;
        byte tinOfPainWaite = 2;
        byte tinOfPeinBrown = 4;
        int OneKlassTinOfPain = tinOfPainWaite + tinOfPeinBrown;
        int numberOfClasses = tinOfPain / OneKlassTinOfPain;
        System.out.println("В школе, где " + numberOfClasses + " классов, нужно " + numberOfClasses * tinOfPainWaite + " банок белой краски, и " + numberOfClasses * tinOfPeinBrown + " банок коричневой краски.");

        System.out.println("Задача N6");
        byte bananas = 5;
        byte gramBanan = 80;
        short milk = 2;
        short gramMilk = 105;
        int iceCream = 2;
        int gramIceCream = 100;
        byte egg = 4;
        byte gramEgg = 70;
        float kilogram = 1000f;
        float productWeight = (bananas * gramBanan) + (milk * gramMilk) + (iceCream * gramIceCream) + (egg * gramEgg);
        System.out.println("Вес продуктов " + productWeight + " грамм");
        System.out.println("Вес продуктов " + productWeight / kilogram + " килограмм");

        System.out.println("Задача N7");
        byte minusKilogram = 7;
        short optionOneMinus = 250;
        short optionTwoMinus = 500;
        int gramInKilogram = 1000;
        int totalMinus = minusKilogram * gramInKilogram;
        System.out.println("Спортсмену нужно похудеть на " + totalMinus + " грамм.");
        int numberDaysOptionOne = totalMinus / optionOneMinus;
        System.out.println("Если спотсмен будет худеть на " + optionOneMinus + " грамм в день, то похудеет на " + minusKilogram + " килограм за " + numberDaysOptionOne + " дней.");
        int numberDaysOptionTwo = totalMinus / optionTwoMinus;
        System.out.println("Если спотсмен будет худеть на " + optionOneMinus + " грамм в день, то похудеет на " + minusKilogram + " килограм за " + numberDaysOptionTwo + " дней.");
        int averageNumberOfDays = (numberDaysOptionOne + numberDaysOptionTwo) / 2;
        System.out.println("Что бы похудеть на " + minusKilogram + " килограмм, спортсмену потребуется в седнем " + averageNumberOfDays + " дней.");

        System.out.println("Задача N8");
        int mashaSalary = 67760;
        int denisSalary = 83690;
        int krisSalary = 76230;
        int salaryIncrease = 10;
        int changeMashaSalary = (mashaSalary * salaryIncrease) / 100;
        System.out.println("Маша теперь получает " + (mashaSalary + changeMashaSalary) + " рублей. Годовой доход вырос на " + changeMashaSalary +  " рублей!");
        int changeDenisSalary = (denisSalary * salaryIncrease) / 100;
        System.out.println("Денис теперь получает " + (denisSalary + changeDenisSalary) + " рублей. Годовой доход вырос на " + changeDenisSalary +  " рублей!");
        int changeKrisSalary = (krisSalary * salaryIncrease) / 100;
        System.out.println("Маша теперь получает " + (mashaSalary + changeKrisSalary) + " рублей. Годовой доход вырос на " + changeKrisSalary +  " рублей!");

    }
}