public class Car extends Vehicle {
    private String typeEngine;

    public void setTypeEngine (String t) {
        this.typeEngine = t;
    }
    public String getTypeEngine () {
        return this.typeEngine;
    }
    public void showCarInfo () {
        System.out.print("Car engine is "+this.typeEngine+".");
        showInfo();
    }
    public void setCarInfo (int s, String t, String y) {
        setFuel(s);
        setTopSpeed(t);
        setTypeEngine(y);
    }
    public void move () {
        int fule = getFuel();
        if (fule - 50 < 0)
            System.out.println("Pelase add fuel.");
        else {
            setFuel(fule -= 50);
            System.out.println("Go Go Go !!!");
        }
    }
}