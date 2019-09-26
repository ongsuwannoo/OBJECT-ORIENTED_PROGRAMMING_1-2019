import java.util.*;
public class numbermod_3 {
    public static void main(String[] args) {
        int num, num_t;
        Scanner input = new Scanner(System.in);

        num = input.nextInt();
        num_t = num;

        while ((num % 3 != 0) && (num % 2 != 0)){
            num = input.nextInt();
        }
        System.out.print("Output is "+num_t);
    }
}