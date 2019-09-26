import java.util.*;
public class account {
    public static void main(String[] args) {
        char account;
        double money, accint, A = 1.015, B = 1.02, C = 1.015, X = 1.05;

        Scanner input = new Scanner(System.in);

        System.out.print("Input your money : ");
        money = input.nextInt();
        System.out.print("Input your account type(Please type A B C or X in uppercase) : ");
        account = input.next().charAt(0);

        switch (account) {
            case 'A': accint = A; break;
            case 'B': accint = B; break;
            case 'C': accint = C; break;
            case 'X': accint = X; break;
            default: accint = 1;
        }

        System.out.print("Your total money in one year = "+(money*accint));
    }
}