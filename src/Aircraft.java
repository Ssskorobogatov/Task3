public class Aircraft extends Aviapark {

    public Aircraft(int year, int capacity, int seats, int distance) {
        super(year, capacity, seats, distance);
    }
    public void descriptionOfAircraft(){
        System.out.println("Parameters of Boeing-737: " + "Production year " + this.year + "; " + "capacity " + this.capacity + "; " + "seats " + this.seats + "; " + "distance " + this.distance + ".");
    }
}



