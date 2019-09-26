public class Pigeon extends Bird {
    private static int numberOfPigeon;

    public Pigeon () {
        this(0.0, 0.0, 0.0);
    }
    public Pigeon (double wingSize, double weight, double height) {
        super(wingSize, weight, height);
        numberOfPigeon++;
    }
    public void eat (String food) {
        if (food.equals("worm"))
            super.setWeight(super.getWeight()+0.5);
        else if (food.equals("seed"))
            super.setWeight(super.getWeight()+0.2);
        else
            System.out.println("Pigeon can eat only worm and seed.");
    }
    public String toString () {
        return "Pigeon "+super.getWeight()+" kg and "+super.getHeight()+" cm. There are "+numberOfPigeon+" pigeons.";
    }
    public void fly () {
        System.out.println("Fly Fly");
        if (super.getWeight() >= 5)
            super.setWeight(getWeight() - 0.25);
        else
            System.out.println("I'm hungry.");
    }
    public void takeOff () {
        System.out.println("Take Off");
        if (super.getWeight() >= 5)
            super.setWeight(getWeight() - 0.5);
        else
            System.out.println("I'm hungry.");
    }
    public void landing () {
        System.out.println("Landing");
        if (super.getWeight() >= 5)
            super.setWeight(getWeight() - 0.5);
        else
            System.out.println("I'm hungry.");
    }
}