import java.util.*;
public class monthdays {
    public static void main(String[] args) {
        int days, month;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a Month: ");
        month = input.nextInt();

        switch (month) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12: days = 31; break;
            case 2: days = 28; break;
            case 4: case 6: case 9: case 11: days = 30; break;
            default: days = 0;
        }
        System.out.print(days+" days");
    }
}