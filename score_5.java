import java.util.*;
public class score_5 {
    public static void main(String[] args) {
        int num;
        Scanner input = new Scanner(System.in);
        num = input.nextInt();
        for (int i = 1; i < num+1 ; i++) {
            if (i % 5 == 0)
                System.out.print("/");
            else
                System.out.print("|");
        }
    }
}