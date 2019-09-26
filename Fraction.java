import java.util.*;
public class Fraction {
    public int topN;
    public int btmN;

    public String toFraction() {
        return this.topN+"/"+this.btmN;
    }

    public String toFloat() {
        return (double) this.topN/(double) this.btmN+ "";
    }

    public void addFraction(Fraction n) {

        this.topN = (this.topN*n.btmN) + (n.topN*this.btmN);
        this.btmN = (this.btmN*n.btmN);
    }

    public static void main(String[] args) {
        Fraction f1 = new Fraction();
        f1.topN = 2;
        f1.btmN = 5;
        Fraction f2 = new Fraction();
        f2.topN = 3;
        f2.btmN = 7;
        System.out.println("before " + f1.toFraction());
        System.out.println("before " + f1.toFloat());
        f1.addFraction(f2);
        System.out.println("after " + f1.toFraction());
        System.out.println("after " + f1.toFloat());
    }
}