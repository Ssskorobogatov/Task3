public class Quadrocopter extends Fleet {
    public Quadrocopter(int year, int capacity, int seats, int distance) {
        super(year, capacity, seats, distance);
    }
    public void descriptionOfQuadrocopter(){
        System.out.println("Характеристики квадрокоптера: " + "Год производства " + this.year + "; " + "грузоподъемность " + this.capacity + " кг; " + "дальность полета " + this.distance + " км.");
    }
}
