public class Ship extends Vehicle implements Floatable {

    public Ship () {
        super(0.0);
    }
    public Ship (double fuel) {
        super(fuel);
    }
    public void move () {
        fl0at();
    }
    public void move (int distance) {
        if (distance > 0 && super.getFuel() >= 50){
            fl0at();
            move(--distance);
        }
        else
            System.out.println("Fuel is not enough.");
    }

    public void fl0at () {
        System.out.println("Ship moves");
        if (super.getFuel() >= 50)
            super.setFuel(getFuel() - 50);
        else
            System.out.println("Fuel is not enough.");
    }
    public void startEngine () {
        System.out.println("Engine starts");
        if (super.getFuel() >= 10)
            super.setFuel(getFuel() - 10);
        else
            System.out.println("Fuel is not enough.");
    }
    public void stopEngine () {
        System.out.println("Engine stops");
    }

    public void honk () {
        System.out.println("Shhhhh");
    }
}