public class Aviapark {
    Fleet[] fleet;

    public Aviapark(Fleet[] fleet) {
        this.fleet = fleet;
    }

    public void sumOfCapacity() {
        int sum = 0;
        for (int i = 0; i < fleet.length; i++){
            sum += fleet[i].capacity;
        }
        System.out.println("Общая грузоподъемность составляет: " + sum + " кг.");
    }

    public void sumOfSeats(){
        int sum = 0;
        for (int i = 0; i < fleet.length; i++){
            sum += fleet[i].seats;
        }
        System.out.println("Общее количество мест составляет: " + sum + " чел.");
    }
}
