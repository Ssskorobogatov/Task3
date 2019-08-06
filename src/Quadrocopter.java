public class Quadrocopter extends Aviapark {
    public Quadrocopter(int year, int capacity, int seats, int distance) {
        super(year, capacity, seats, distance);
    }
    public void descriptionOfQuadrocopter(){
        System.out.println("Parameters of Quadrocopter: " + "Production year " + this.year + "; " + "capacity " + this.capacity + "; " + "seats " + this.seats + "; " + "distance " + this.distance + ".");
    }
}
