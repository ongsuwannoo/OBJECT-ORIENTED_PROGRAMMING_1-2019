import java.util.*;
public class vat {
    public static void main(String[] args) {
        double salary, vat;
        Scanner tube = new Scanner(System.in);
        System.out.print("Enter your salary: ");
        salary = tube.nextInt();
        if (salary > 50000)
            vat = salary*10/100;
        else
            vat = salary*5/100;
        if (salary < 0)
            vat = salary*0;
        System.out.print(vat);
    }
}