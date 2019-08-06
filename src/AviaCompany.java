import java.util.Scanner;

public class AviaCompany{
    public static void main(String[] args) {
       //запихнуть весь код в do while, чтобы был постоянный цикл
        //создать массив и в него затолкать наименования транспорта, потом создать объект, перебирающий ячейки массива
        Scanner scanner = new Scanner(System.in);
        Aircraft boeing737 = new Aircraft(1987,10000, 150, 2600);
        Helicopter helicopter1 = new Helicopter(2000,2000,8,700);
        Quadrocopter quadrocopter = new Quadrocopter(2015,20,0,10);


    int number = scanner.nextInt();

while (true){
    if (number < 4){
        switch (number){
            case 1:
                System.out.println(boeing737.distance + helicopter1.distance + quadrocopter.distance);
                break;
            case 2:
                System.out.println(boeing737.capacity + helicopter1.capacity + quadrocopter.capacity);
                break;
            case 3:
                System.out.println(boeing737.seats + helicopter1.seats + quadrocopter.seats);
        } break;
    } else {
        System.out.println("Вы ввели неправильный номер, попробуйте снова");

    }

}



       }
    }

