public class Main {


    public static void main(String[] args) {

        // Задание 1

        int age = 20;

        if (age >= 18)
        {
            System.out.println("Если человеку " + age + ", значит он совершеннолетний");
        }
        else
        {
            System.out.println("Если человеку " + age + ", значит он ещё не достиг совершеннолетия");
        }

        // Задание 2

        int temp = 7;

        if (temp >= 5)
        {
            System.out.println("На улице " + temp + " градусов. Можно идти без шапки.");
        }
        else
        {
            System.out.println("На улице " + temp + " градусов. Нужно одеть шапку.");
        }

        // Задание 3

        int speed = 75;

        if (speed <= 60)
        {
            System.out.println("Если скорость " + speed + ", то можно ездить спокойно");
        }
        else
        {
            System.out.println("Если скорость " + speed + ", то придется заплатить штраф");
        }

        // Задание 4

        int age2 = 27;

        if( age2 >= 2 && age2 <= 6)
            System.out.println("Если возраст человека равен " + age2 + ", то ему нужно ходить в сад, но очень не хочется)))");
        else
        {
            if ( age2 >= 7 && age2 <= 17)
             System.out.println("Если возраст человека равен " + age2 + ", то ему нужно ходить в школу, но очень не хочется)))");
            else
            {
                if ( age2 >= 18 && age2 <= 24 )
                    System.out.println("Если возраст человека равен " + age2 + ", то ему нужно ходить в университет");
                else
                    System.out.println("Если возраст человека равен " + age2 + ", то ему пора идти работать)");
            }


        }

        // Задание 5

        int age3 = 8;

        if( age3 < 5)
            System.out.println("Если возраст ребенка равен " + age3 + ", то ему нельзя кататься на аттракционе.");
        else {
            if (age3 >= 5 && age3 < 14)
                System.out.println("Если возраст ребенка равен " + age3 + ", то ему можно кататься на аттракционе в сопровождении взрослого.");
            else
                System.out.println("Если возраст ребенка равен " + age3 + ", то ему можно кататься на аттракционе без сопровождения взрослого.");
        }

        // Задание 6
        int total = 102;
        int seats = 60;
        int passengers = 75;

        if(passengers < seats)
            System.out.println("В вагоне есть " + (seats - passengers) +" сидячих мест.");
        else {
            if (passengers >= total)
                System.out.println("В вагоне нет мест.");
            else
                System.out.println("В вагоне " + (total - passengers) + " стоячих мест.");
        }

        // Задание 7
        int one = 210;
        int two = 1000;
        int three = 100;
        int result = one;

        if (result < two)
            result = two;
        else {
            if (result < three)
                result = three;
        }

        System.out.println("Наибольшее число: " + result);




    }
}