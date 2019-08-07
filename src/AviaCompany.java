import java.util.InputMismatchException;
import java.util.Scanner;

public class AviaCompany{
    public static void main(String[] args) {

        while (true) {
            Aircraft boeing737 = new Aircraft(1987, 10000, 150, 2600);
            Helicopter helicopter1 = new Helicopter(2000, 2000, 8, 700);
            Quadrocopter quadrocopter = new Quadrocopter(2015, 20, 0, 10);


            Fleet[] fleet = new Fleet[3];
            fleet[0] = boeing737;
            fleet[1] = helicopter1;
            fleet[2] = quadrocopter;

            Aviapark fleet1 = new Aviapark(fleet);


            Scanner scanner = new Scanner(System.in);

            System.out.println("1 - общая информация летательных аппаратов;");
            System.out.println("2 - общая вместимость пассажиров");
            System.out.println("3 - общая грузоподъемность");
            System.out.println("4 - сортировка летательных аппаратов по дальности полета");
            System.out.println("5 - поиск летательного аппарата по заданным параметрам");
            System.out.println("Пожалуйста, выберите номер...");


            while (true) {
                int number = scanner.nextInt();
                if (number < 6) {
                    if (number > 0) {
                        switch (number) {
                            case 1:
                                boeing737.descriptionOfAircraft();
                                helicopter1.descriptionOfHelicopter();
                                quadrocopter.descriptionOfQuadrocopter();
                                break;
                            case 2:
                                fleet1.sumOfSeats();
                                break;
                            case 3:
                                fleet1.sumOfCapacity();
                        }
                        break;
                    } else {
                        System.out.println("Вы ввели неправильный номер, попробуйте снова");
                    }
                } else {
                    System.out.println("Вы ввели неправильный номер, попробуйте снова");
                }

            }
            System.out.println();
            System.out.println();
        }
    }
}

