public class Aircraft extends Fleet {

    public Aircraft(int year, int capacity, int seats, int distance) {
        super(year, capacity, seats, distance);
    }
    public void descriptionOfAircraft(){
        System.out.println("Характеристики самолета Boeing-737: " + "Год производства " + this.year + "; " + "грузоподъемность " + this.capacity + " кг; " + "количество пассажирских мест " + this.seats + " чел; " + "дальность полета " + this.distance + " км.");
    }
}



