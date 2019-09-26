import java.util.*;
public class Cat {
    private String name;
    private String color;
    public double height;
    public double weight;

    private void setWeight (double w) {
        this.weight = w;
    }

    private void setHeight (double h) {
        this.height = h;
    }

    private void setName (String n) {
        this.name = n;
    }

    private void setColor (String c) {
        this.color = c;
    }

    public void upWeight (double w) {
        if (w < 0) {
            System.out.println("Error");
        } else {
            this.weight += w;
        }
    }

    public void downWeight (double w) {
        if (w < 0) {
            System.out.println("Error");
        } else {
            this.weight -= w;
        }
    }

    public void upHeight (double h) {
        if (h < 0) {
            System.out.println("Error");
        } else {
            this.height += h;
        }
    }

    public void downHeight (double h) {
        if (h < 0) {
            System.out.println("Error");
        } else {
            this.height -= h;
        }
    }

    public void defineCat (String n, String c) {

    }

    public void speak () {
        System.out.println("--------------------");
        System.out.println("Cat name is "+name);
        System.out.println("Cat color is "+color);
        System.out.println("Cat height is "+height);
        System.out.println("Cat weight is "+weight);
    }

    public static void main(String[] args) {
        Cat cat1 = new Cat();
        Cat cat2 = new Cat();
        cat1.setWeight(20);
        cat2.setWeight(30);
        cat1.setColor("colorful");
        cat1.setName("Meow");
        cat1.setHeight(10);
        cat1.speak();
        cat1.upHeight(-100);
        cat1.speak();
    }
}