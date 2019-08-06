public class Helicopter extends Aviapark {
    public Helicopter(int year, int capacity, int seats, int distance) {
        super(year, capacity, seats, distance);
    }
    public void descriptionOfHelicopter(){
        System.out.println("Parameters of Helicopter: " + "Production year " + this.year + "; " + "capacity " + this.capacity + "; " + "seats " + this.seats + "; " + "distance " + this.distance + ".");
    }
}
